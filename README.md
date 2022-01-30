# KafkaPlayground
Trying out Kafka Producer and Consumer using Spring boot.

Steps to setup the Producer
 * First install Kafka in the machine. Please refer this link (https://kafka.apache.org/quickstart)
 * Start the Zookeeper.
 * Then start the Kafka Server.
 * Create a Topic in the Kafka.
 * Then input the events by invoking this endpoint (http://localhost:8080/publish/message)
 * Then monitor the message in the consumer console of the Kafka.

Steps to setup the Consumer
 * First start the spring boot application for the consumer.
 * Then if already kafka server and the zookeeper server is not started then please start the zookeeper and the kafka.
 * In my case, I have created a topic called `sample-event-topic`.
 * When we invoke the rest end point then a message gets published to the kafka server.
 * Then that message will be displayed in the consumer application console.
 