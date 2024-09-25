package com.colak.springtutorial.entity;

import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name="Yoga_Poses")
@Data
public class Yoga {

    @PrimaryKey(keyOrder = 1)
    @Column(name="Pose_Id")
    private int poseId;

    @Column(name="Name")
    private String name;

    @Column(name="Breath")
    private String breath;

    @Column(name="Description")
    private String desc;
}