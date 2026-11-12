package com.huami.watch.dataflow.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DataItem extends Model implements Dated {
    public static final String COLUMN_DATA = "data";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_HEART_RATE_DATA = "heart_rate_data";
    public static final String COLUMN_SUMMARY = "summary";
    public static final String COLUMN_SYNCED = "synced";
    public static final String COLUMN_TIMEZONE = "timezone";
    public static final int SYNCED_ALL = 3075;
    public static final int SYNCED_CLOUD = 3072;
    public static final int SYNCED_CLOUD_DATA = 2048;
    public static final int SYNCED_CLOUD_SUMMARY = 1024;
    public static final int SYNCED_WATCH = 3;
    private static final int SYNCED_WATCH_DATA = 2;
    private static final int SYNCED_WATCH_SUMMARY = 1;

    @Column(indexGroups = {"date"}, name = "date", notNull = true, onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    public String date;

    @Column(name = "summary")
    public String summary;

    @Column(name = "synced")
    public int synced;

    @Override // com.huami.watch.dataflow.model.Dated
    public String getDate() {
        return this.date;
    }

    public String getSummary() {
        return this.summary;
    }

    public int getSynced() {
        return this.synced;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setSynced(int i) {
        this.synced = i;
    }

    public String toStringShort() {
        return "<Date : " + this.date + ", Synced : " + this.synced + " " + super.toString() + SearchCriteria.GT;
    }
}
