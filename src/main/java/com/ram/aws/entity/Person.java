package com.ram.aws.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DynamoDBDocument
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@DynamoDBTable(tableName = "person")
public class Person {

    @DynamoDBHashKey(attributeName = "personId")
    @DynamoDBAutoGeneratedKey
    private String personId;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private int age;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private Address address;
}