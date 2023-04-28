package com.example.majoong.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notification {

    String id;
    String toId;
    String fromId;
    String type;
    String date=Long.toString(System.currentTimeMillis());

    public Notification(int toId, int fromId, int type) {
        this.toId = Integer.toString(toId);
        this.fromId = Integer.toString(fromId);
        this.type = Integer.toString(type);
        this.id = this.toId + "_" + this.fromId +"_"+ this.type +"_"+ date;
    }
}