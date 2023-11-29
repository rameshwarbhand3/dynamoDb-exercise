package com.ram.aws.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DynamoDBDocument
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    @DynamoDBAttribute
    private String city;

    @DynamoDBAttribute
    private String state;

    @DynamoDBAttribute
    private long pinCode;
}
