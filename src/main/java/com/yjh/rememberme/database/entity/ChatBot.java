package com.yjh.rememberme.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"TBL_CHAT_BOT\"")
public class ChatBot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_bot_id")
    private Integer chatBotId;

    @NotNull
    @Column(name = "chat_bot_date", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private Date chatBotDate;

    @NotNull
    @Column(name = "member_id")
    private Integer memberId;

}
