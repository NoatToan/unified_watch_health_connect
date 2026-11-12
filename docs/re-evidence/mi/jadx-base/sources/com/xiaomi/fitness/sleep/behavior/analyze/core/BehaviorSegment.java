package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00100\u001a\u00020\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001a\u0010-\u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BehaviorSegment;", "", "<init>", "()V", "type", "", "getType", "()I", "setType", "(I)V", "beginTime", "", "getBeginTime", "()J", "setBeginTime", "(J)V", "duration", "getDuration", "setDuration", "fileName", "", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "datas", "", "", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "credibility", "", "getCredibility", "()D", "setCredibility", "(D)V", "dbs", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Decibel;", "getDbs", "setDbs", "count", "getCount", FitnessReportKey.setCount, "averageNoise", "getAverageNoise", "setAverageNoise", "toString", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BehaviorSegment {
    private transient double averageNoise;

    @SerializedName("beginTime")
    private long beginTime;
    private transient int count;

    @SerializedName("credibility")
    private double credibility;

    @SerializedName("duration")
    private int duration;

    @SerializedName("type")
    private int type = -1;

    @SerializedName("fileName")
    @NotNull
    private String fileName = "";

    @NotNull
    private transient List<byte[]> datas = new ArrayList();

    @NotNull
    private transient List<Decibel> dbs = new ArrayList();

    public final double getAverageNoise() {
        return this.averageNoise;
    }

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getCount() {
        return this.count;
    }

    public final double getCredibility() {
        return this.credibility;
    }

    @NotNull
    public final List<byte[]> getDatas() {
        return this.datas;
    }

    @NotNull
    public final List<Decibel> getDbs() {
        return this.dbs;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAverageNoise(double d) {
        this.averageNoise = d;
    }

    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setCredibility(double d) {
        this.credibility = d;
    }

    public final void setDatas(@NotNull List<byte[]> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datas = list;
    }

    public final void setDbs(@NotNull List<Decibel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dbs = list;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "BehaviorSegment(type=" + this.type + ", beginTime=" + this.beginTime + ", duration=" + this.duration + ", fileName='" + this.fileName + "', credibility=" + this.credibility + ", count=" + this.count + ")";
    }
}
