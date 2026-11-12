package com.xiaomi.hm.health.training.api.entity;

/* JADX INFO: loaded from: classes21.dex */
public class VideoRecord {
    public String id;
    public int watchedCount = 0;
    public long watchedDuration = 0;

    public String toString() {
        return "VideoRecord{id='" + this.id + "', watchedCount=" + this.watchedCount + ", watchedDuration=" + this.watchedDuration + '}';
    }
}
