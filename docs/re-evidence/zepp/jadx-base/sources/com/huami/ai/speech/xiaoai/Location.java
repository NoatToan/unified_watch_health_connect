package com.huami.ai.speech.xiaoai;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.nfc.web.Constant;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/ai/speech/xiaoai/Location;", "", "", "component1", "component2", Constant.KEY_LONGITUDE, Constant.KEY_LATITUDE, "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", LogUtil.D, "getLongitude", "()D", "b", "getLatitude", "<init>", "(DD)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Location {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final double longitude;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final double latitude;

    public Location(double d, double d2) {
        this.longitude = d;
        this.latitude = d2;
    }

    public static /* synthetic */ Location copy$default(Location location, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = location.longitude;
        }
        if ((i & 2) != 0) {
            d2 = location.latitude;
        }
        return location.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final Location copy(double longitude, double latitude) {
        return new Location(longitude, latitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return Intrinsics.areEqual((Object) Double.valueOf(this.longitude), (Object) Double.valueOf(location.longitude)) && Intrinsics.areEqual((Object) Double.valueOf(this.latitude), (Object) Double.valueOf(location.latitude));
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (dz.a(this.longitude) * 31) + dz.a(this.latitude);
    }

    @NotNull
    public String toString() {
        return "Location(longitude=" + this.longitude + ", latitude=" + this.latitude + ')';
    }
}
