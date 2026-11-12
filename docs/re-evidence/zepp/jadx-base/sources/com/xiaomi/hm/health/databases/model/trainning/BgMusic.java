package com.xiaomi.hm.health.databases.model.trainning;

import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class BgMusic implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("_id")
    private long a;

    @SerializedName("trainingId")
    private Long b;

    @SerializedName("id")
    private long c;

    @SerializedName("size")
    private long d;

    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    private long e;

    @SerializedName("name")
    private String f;

    @SerializedName("url")
    private String g;

    @SerializedName("status")
    private String h;

    public BgMusic(long j, Long l, long j2, long j3, long j4, String str, String str2, String str3) {
        this.a = j;
        this.b = l;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public long getId() {
        return this.a;
    }

    public long getMusicId() {
        return this.c;
    }

    public String getName() {
        return this.f;
    }

    public long getSize() {
        return this.d;
    }

    public String getStatus() {
        return this.h;
    }

    public Long getTrainingId() {
        return this.b;
    }

    public long getUpdateTime() {
        return this.e;
    }

    public String getUrl() {
        return this.g;
    }

    public void setId(long j) {
        this.a = j;
    }

    public void setMusicId(long j) {
        this.c = j;
    }

    public void setName(String str) {
        this.f = str;
    }

    public void setSize(long j) {
        this.d = j;
    }

    public void setStatus(String str) {
        this.h = str;
    }

    public void setTrainingId(Long l) {
        this.b = l;
    }

    public void setUpdateTime(long j) {
        this.e = j;
    }

    public void setUrl(String str) {
        this.g = str;
    }

    public BgMusic() {
    }
}
