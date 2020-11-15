package com.andrius.easyGift.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "history")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class HistoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "historyEntryId")
    private Long historyEntryId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userSurname")
    private String userSurname;

    @Column(name = "historyType")
    private String historyType;

    @Column(name = "historyDate")
    private LocalDate historyDate;

    @Column(name = "historyDescription")
    private String historyDescription;

    @Column(name = "historyImaginePath")
    private String historyImaginePath;

    public HistoryEntry(
            String userName,
            String userSurname,
            String historyType,
            LocalDate historyDate,
            String historyDescription,
            String historyImaginePath
    ) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.historyType = historyType;
        this.historyDate = historyDate;
        this.historyDescription = historyDescription;
        this.historyImaginePath = historyImaginePath;
    }
}
