package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import com.xiaomi.hm.health.bt.utils.TimeUtil;
import defpackage.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003JR\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000eR\u0019\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "", "", "toString", "", "component1", "", "component2", "component3", "", "component4", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "component5", "()[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "", "component6", "timeMillis", "flag", "continueWearDuration", "bodyTemperature", "eightySecondsData", "rawData", "copy", "(JIIS[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;[B)Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80s;", "hashCode", "other", "", "equals", "a", "J", "getTimeMillis", "()J", "b", LogUtil.I, "getFlag", "()I", "c", "getContinueWearDuration", GoogleApiAvailabilityLight.a, ExifInterface.LATITUDE_SOUTH, "getBodyTemperature", "()S", "e", "[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;", "getEightySecondsData", "f", "[B", "getRawData", "()[B", "<init>", "(JIIS[Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/Temperature80sItem;[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Temperature80s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int flag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int continueWearDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final short bodyTemperature;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Temperature80sItem[] eightySecondsData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final byte[] rawData;

    public Temperature80s(long j, int i, int i2, short s, @NotNull Temperature80sItem[] temperature80sItemArr, @NotNull byte[] bArr) {
        this.timeMillis = j;
        this.flag = i;
        this.continueWearDuration = i2;
        this.bodyTemperature = s;
        this.eightySecondsData = temperature80sItemArr;
        this.rawData = bArr;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getContinueWearDuration() {
        return this.continueWearDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getBodyTemperature() {
        return this.bodyTemperature;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Temperature80sItem[] getEightySecondsData() {
        return this.eightySecondsData;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final byte[] getRawData() {
        return this.rawData;
    }

    @NotNull
    public final Temperature80s copy(long timeMillis, int flag, int continueWearDuration, short bodyTemperature, @NotNull Temperature80sItem[] eightySecondsData, @NotNull byte[] rawData) {
        return new Temperature80s(timeMillis, flag, continueWearDuration, bodyTemperature, eightySecondsData, rawData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Temperature80s)) {
            return false;
        }
        Temperature80s temperature80s = (Temperature80s) other;
        return this.timeMillis == temperature80s.timeMillis && this.flag == temperature80s.flag && this.continueWearDuration == temperature80s.continueWearDuration && this.bodyTemperature == temperature80s.bodyTemperature && Intrinsics.areEqual(this.eightySecondsData, temperature80s.eightySecondsData) && Intrinsics.areEqual(this.rawData, temperature80s.rawData);
    }

    public final short getBodyTemperature() {
        return this.bodyTemperature;
    }

    public final int getContinueWearDuration() {
        return this.continueWearDuration;
    }

    @NotNull
    public final Temperature80sItem[] getEightySecondsData() {
        return this.eightySecondsData;
    }

    public final int getFlag() {
        return this.flag;
    }

    @NotNull
    public final byte[] getRawData() {
        return this.rawData;
    }

    public final long getTimeMillis() {
        return this.timeMillis;
    }

    public int hashCode() {
        return (((((((((b.a(this.timeMillis) * 31) + this.flag) * 31) + this.continueWearDuration) * 31) + this.bodyTemperature) * 31) + Arrays.hashCode(this.eightySecondsData)) * 31) + Arrays.hashCode(this.rawData);
    }

    @NotNull
    public String toString() {
        return "Time: " + this.timeMillis + ", " + ((Object) TimeUtil.formatDateTime(this.timeMillis)) + ", Flag: " + this.flag + ", WearDuration: " + this.continueWearDuration + ", BodyTempe: " + ((int) this.bodyTemperature) + ", 80s: " + ((Object) ArraysUtil.toString(this.eightySecondsData)) + ", RawData: " + ((Object) BytesUtil.log(this.rawData));
    }
}
