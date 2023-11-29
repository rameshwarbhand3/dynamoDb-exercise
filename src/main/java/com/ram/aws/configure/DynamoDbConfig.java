package com.ram.aws.configure;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfig {

    public static final String SERVICE_ENDPOINT = "dynamodb.ap-south-1.amazonaws.com";
    public static final String REGION = "ap-south-1";

    public static final String ACCESS_KEY = "AKIAXR7VZ5AEWIAVO2WC";

    public static final String SECRET_KEY = "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";

    @Bean
    public DynamoDBMapper mapper(){
        return new DynamoDBMapper(amazonDynamoDbConfig());
    }

    private AmazonDynamoDB amazonDynamoDbConfig() {
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(SERVICE_ENDPOINT,REGION))
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY,SECRET_KEY))).build();
    }
}
