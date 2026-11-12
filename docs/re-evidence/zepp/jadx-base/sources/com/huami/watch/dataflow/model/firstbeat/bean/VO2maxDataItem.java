package com.huami.watch.dataflow.model.firstbeat.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import com.huami.watch.util.TimeUtil;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "vo2_max_data")
public class VO2maxDataItem extends Model {
    public static final String COLUMN_DATE = "date";
    private static final String COLUMN_UPDATE_TIME = "update_time";
    public static final String COLUMN_VO2_MAX_RUN = "vo2_max_run";
    public static final String COLUMN_VO2_MAX_WALK = "vo2_max_walk";

    @SerializedName(FirstbeatParams.PARAM_DAY_ID)
    @Column(indexGroups = {"date"}, name = "date", notNull = true, onUniqueConflicts = {Column.ConflictAction.REPLACE}, uniqueGroups = {"group"})
    private String date;

    @SerializedName("update_time")
    @Column(name = "update_time")
    private long updateTime;

    @SerializedName("vo2_max_run")
    @Column(name = "vo2_max_run")
    private float vo2maxRun = -1.0f;

    @SerializedName(FirstbeatParams.PARAM_VO2_MAX_WALK)
    @Column(name = COLUMN_VO2_MAX_WALK)
    private float vo2maxWalk = -1.0f;

    public String getDate() {
        return this.date;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public float getVo2maxRun() {
        return this.vo2maxRun;
    }

    public float getVo2maxWalk() {
        return this.vo2maxWalk;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setVo2maxRun(float f) {
        this.vo2maxRun = f;
    }

    public void setVo2maxWalk(float f) {
        this.vo2maxWalk = f;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "\n<Date=" + this.date + ", VO2maxRun=" + this.vo2maxRun + ", VO2maxWalk=" + this.vo2maxWalk + ", UpdateTime=" + TimeUtil.formatDateTime(this.updateTime) + SearchCriteria.GT;
    }
}
