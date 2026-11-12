package com.huawei.hihealth;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiNoonSleepInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("noonSleepTotalTime")
    private double f12000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("noonSleepTimeIntervalList")
    private List<TimeInterval> f12001c;

    public void c(double d) {
        this.f12000b = d;
    }

    public void d(List<TimeInterval> list) {
        this.f12001c = list;
    }

    public static class TimeInterval {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("timeZone")
        private final String f12002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("startTime")
        private final long f12003b;

        @SerializedName("endTime")
        private final long e;

        public TimeInterval(long j, long j2, String str) {
            this.f12003b = j;
            this.e = j2;
            this.f12002a = str;
        }
    }
}
