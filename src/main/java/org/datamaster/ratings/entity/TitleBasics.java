package org.datamaster.ratings.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table
@ToString
public class TitleBasics {
    @Id
    private String tconst;

    @Column
    private String primaryTitle;

    @Column
    private String titleType;
}
