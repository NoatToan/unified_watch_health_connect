package com.xiaomi.fitness.health.vitality;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/vitality/VitalityEntry;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "x", "", "y", "timestamp", "", "type", "", "<init>", "(FFJI)V", "dailyVitality", "getDailyVitality", "()I", "setDailyVitality", "(I)V", "totalVitality", "getTotalVitality", "setTotalVitality", "highZoneVitality", "getHighZoneVitality", "setHighZoneVitality", "mediumZoneVitality", "getMediumZoneVitality", "setMediumZoneVitality", "lowZoneVitality", "getLowZoneVitality", "setLowZoneVitality", "suggestVitality", "getSuggestVitality", "setSuggestVitality", "suggestSportType", "getSuggestSportType", "setSuggestSportType", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VitalityEntry extends RecyclerBarEntry {
    private int dailyVitality;
    private int highZoneVitality;
    private int lowZoneVitality;
    private int mediumZoneVitality;
    private int suggestSportType;
    private int suggestVitality;
    private int totalVitality;

    public VitalityEntry(float f, float f2, long j, int i) {
        super(f, f2, j, i);
    }

    public final int getDailyVitality() {
        return this.dailyVitality;
    }

    public final int getHighZoneVitality() {
        return this.highZoneVitality;
    }

    public final int getLowZoneVitality() {
        return this.lowZoneVitality;
    }

    public final int getMediumZoneVitality() {
        return this.mediumZoneVitality;
    }

    public final int getSuggestSportType() {
        return this.suggestSportType;
    }

    public final int getSuggestVitality() {
        return this.suggestVitality;
    }

    public final int getTotalVitality() {
        return this.totalVitality;
    }

    public final void setDailyVitality(int i) {
        this.dailyVitality = i;
    }

    public final void setHighZoneVitality(int i) {
        this.highZoneVitality = i;
    }

    public final void setLowZoneVitality(int i) {
        this.lowZoneVitality = i;
    }

    public final void setMediumZoneVitality(int i) {
        this.mediumZoneVitality = i;
    }

    public final void setSuggestSportType(int i) {
        this.suggestSportType = i;
    }

    public final void setSuggestVitality(int i) {
        this.suggestVitality = i;
    }

    public final void setTotalVitality(int i) {
        this.totalVitality = i;
    }
}
