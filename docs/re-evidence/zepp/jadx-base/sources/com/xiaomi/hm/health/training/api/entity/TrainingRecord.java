package com.xiaomi.hm.health.training.api.entity;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingRecord {
    public long consumption;
    public long duration;
    public long endTime;
    public long startTime;
    public String trainingId;
    public List<VideoRecord> watchedVideos;

    public String toString() {
        return "TrainingRecord{trainingId='" + this.trainingId + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", duration=" + this.duration + ", consumption=" + this.consumption + ", watchedVideos=" + this.watchedVideos + '}';
    }
}
