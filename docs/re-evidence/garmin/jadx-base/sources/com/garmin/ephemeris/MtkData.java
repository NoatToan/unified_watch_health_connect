package com.garmin.ephemeris;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/garmin/ephemeris/MtkData;", "", "gpsHours", "", "data", "", "(JLjava/lang/String;)V", "getData", "()Ljava/lang/String;", "getGpsHours", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MtkData {

    @SerializedName("data")
    private final String data;

    @SerializedName("gpsHours")
    private final long gpsHours;

    public MtkData(long j8, String str) {
        str.getClass();
        this.gpsHours = j8;
        this.data = str;
    }

    public static /* synthetic */ MtkData copy$default(MtkData mtkData, long j8, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = mtkData.gpsHours;
        }
        if ((i14 & 2) != 0) {
            str = mtkData.data;
        }
        return mtkData.copy(j8, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGpsHours() {
        return this.gpsHours;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final MtkData copy(long gpsHours, String data) {
        data.getClass();
        return new MtkData(gpsHours, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MtkData)) {
            return false;
        }
        MtkData mtkData = (MtkData) other;
        return this.gpsHours == mtkData.gpsHours && s.g(this.data, mtkData.data);
    }

    public final String getData() {
        return this.data;
    }

    public final long getGpsHours() {
        return this.gpsHours;
    }

    public int hashCode() {
        return this.data.hashCode() + (Long.hashCode(this.gpsHours) * 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MtkData(gpsHours=");
        sb3.append(this.gpsHours);
        sb3.append(", data=");
        return a0.m(sb3, this.data, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
