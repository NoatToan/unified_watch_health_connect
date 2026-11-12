package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class Audios {

    @SerializedName("auditionEndTime")
    @Expose
    private long auditionEndTime;

    @SerializedName("auditionStartTime")
    @Expose
    private long auditionStartTime;

    @SerializedName("category_name")
    @Expose
    private String categoryName;

    @SerializedName("duration")
    @Expose
    private int duration;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("lyricPath")
    @Expose
    private String lyricPath;

    @SerializedName("music_id")
    @Expose
    private String musicId;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName(BleConstants.KEY_PATH)
    @Expose
    private String path;

    @SerializedName("platform")
    @Expose
    private String platform;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("wave_points")
    @Expose
    private List<Integer> wavePoints;

    public long getAuditionEndTime() {
        return this.auditionEndTime;
    }

    public long getAuditionStartTime() {
        return this.auditionStartTime;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getId() {
        return this.id;
    }

    public String getLyricPath() {
        return this.lyricPath;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getType() {
        return this.type;
    }

    public List<Integer> getWavePoints() {
        return this.wavePoints;
    }

    public void setAuditionEndTime(long j) {
        this.auditionEndTime = j;
    }

    public void setAuditionStartTime(long j) {
        this.auditionStartTime = j;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWavePoints(List<Integer> list) {
        this.wavePoints = list;
    }

    public Audios withAuditionEndTime(long j) {
        this.auditionEndTime = j;
        return this;
    }

    public Audios withAuditionStartTime(long j) {
        this.auditionStartTime = j;
        return this;
    }

    public Audios withCategoryName(String str) {
        this.categoryName = str;
        return this;
    }

    public Audios withDuration(int i) {
        this.duration = i;
        return this;
    }

    public Audios withId(String str) {
        this.id = str;
        return this;
    }

    public Audios withLyricPath(String str) {
        this.lyricPath = str;
        return this;
    }

    public Audios withMusicId(String str) {
        this.musicId = str;
        return this;
    }

    public Audios withName(String str) {
        this.name = str;
        return this;
    }

    public Audios withPath(String str) {
        this.path = str;
        return this;
    }

    public Audios withPlatform(String str) {
        this.platform = str;
        return this;
    }

    public Audios withType(String str) {
        this.type = str;
        return this;
    }

    public Audios withWavePoints(List<Integer> list) {
        this.wavePoints = list;
        return this;
    }
}
