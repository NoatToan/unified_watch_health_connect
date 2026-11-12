package com.huami.watch.dataflow.model.firstbeat.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "sport_load_data")
public class SportLoadDataItem extends Model {
    public static final String COLUMN_DAILY_TL = "dailyTL";
    public static final String COLUMN_DATE = "date";
    private static final String COLUMN_UPDATE_TIME = "updateTime";
    private static final String COLUMN_WEEKLY_SUM_OVERREACHING = "weeklyTLSumOverreaching";
    private static final String COLUMN_WEEKLY_TL_SUM = "weeklyTLSum";
    private static final String COLUMN_WEEKLY_TL_SUM_OPTIMAL_MAX = "weeklyTLSumOptimalMax";
    private static final String COLUMN_WEEKLY_TL_SUM_OPTIMAL_MIN = "weeklyTLSumOptimalMin";

    @SerializedName(FirstbeatParams.PARAM_TL_DAILY)
    @Column(name = COLUMN_DAILY_TL)
    private int dailyTL;

    @SerializedName(FirstbeatParams.PARAM_DAY_ID)
    @Column(indexGroups = {"date"}, name = "date", notNull = true, onUniqueConflicts = {Column.ConflictAction.REPLACE}, uniqueGroups = {"group"})
    private String date;

    @SerializedName("updateTime")
    @Column(name = "updateTime")
    private long updateTime;

    @SerializedName(FirstbeatParams.PARAM_TL_WEEKLY_SUM)
    @Column(name = COLUMN_WEEKLY_TL_SUM)
    private int weeklyTLSum;

    @SerializedName(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MAX)
    @Column(name = COLUMN_WEEKLY_TL_SUM_OPTIMAL_MAX)
    private int weeklyTLSumOptimalMax;

    @SerializedName(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OPTIMAL_MIN)
    @Column(name = COLUMN_WEEKLY_TL_SUM_OPTIMAL_MIN)
    private int weeklyTLSumOptimalMin;

    @SerializedName(FirstbeatParams.PARAM_TL_WEEKLY_SUM_OVERREACHING)
    @Column(name = COLUMN_WEEKLY_SUM_OVERREACHING)
    private int weeklyTLSumOverreaching;

    public int getDailyTL() {
        return this.dailyTL;
    }

    public String getDate() {
        return this.date;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public int getWeeklyTLSum() {
        return this.weeklyTLSum;
    }

    public int getWeeklyTLSumOptimalMax() {
        return this.weeklyTLSumOptimalMax;
    }

    public int getWeeklyTLSumOptimalMin() {
        return this.weeklyTLSumOptimalMin;
    }

    public int getWeeklyTLSumOverreaching() {
        return this.weeklyTLSumOverreaching;
    }

    public void setDailyTL(int i) {
        this.dailyTL = i;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setWeeklyTLSum(int i) {
        this.weeklyTLSum = i;
    }

    public void setWeeklyTLSumOptimalMax(int i) {
        this.weeklyTLSumOptimalMax = i;
    }

    public void setWeeklyTLSumOptimalMin(int i) {
        this.weeklyTLSumOptimalMin = i;
    }

    public void setWeeklyTLSumOverreaching(int i) {
        this.weeklyTLSumOverreaching = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "\n<Date=" + this.date + ", DailyTL=" + this.dailyTL + ", WeeklyTLSum=" + this.weeklyTLSum + ", WeeklyTLSumOptimalMax=" + this.weeklyTLSumOptimalMax + ", WeeklyTLSumOptimalMin=" + this.weeklyTLSumOptimalMin + ", WeeklyTLSumSumOverreaching=" + this.weeklyTLSumOverreaching + ", UpdateTime=" + this.updateTime + SearchCriteria.GT;
    }
}
