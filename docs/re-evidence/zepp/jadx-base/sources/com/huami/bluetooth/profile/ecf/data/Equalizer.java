package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B)\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0016\u0010$\u001a\u00020!8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "", "", "isClosed", "", "component1", "", "Lcom/huami/bluetooth/profile/ecf/data/EqUnit;", "component2", "", "component3", "()Ljava/lang/Double;", "eqType", "eqList", "masterGain", "copy", "(ILjava/util/List;Ljava/lang/Double;)Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getEqType", "()I", "b", "Ljava/util/List;", "getEqList", "()Ljava/util/List;", "c", "Ljava/lang/Double;", "getMasterGain", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "<init>", "(ILjava/util/List;Ljava/lang/Double;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Equalizer {
    public static final int BLUES = 3;
    public static final int CLASSICAL = 4;
    public static final int COUNTRY = 9;
    public static final int CUSTOM = 0;
    public static final int DANCE = 2;
    public static final int DISABLE = -1;
    public static final int ELECTRONIC = 7;
    public static final int JAZZ = 5;
    public static final int POPULAR = 1;
    public static final int ROCK = 8;
    public static final int SLOW = 6;
    public static final int VOICE = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int eqType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<EqUnit> eqList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Double masterGain;

    public Equalizer(int i, @NotNull List<EqUnit> list, @Nullable Double d) {
        this.eqType = i;
        this.eqList = list;
        this.masterGain = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Equalizer copy$default(Equalizer equalizer, int i, List list, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = equalizer.eqType;
        }
        if ((i2 & 2) != 0) {
            list = equalizer.eqList;
        }
        if ((i2 & 4) != 0) {
            d = equalizer.masterGain;
        }
        return equalizer.copy(i, list, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEqType() {
        return this.eqType;
    }

    @NotNull
    public final List<EqUnit> component2() {
        return this.eqList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMasterGain() {
        return this.masterGain;
    }

    @NotNull
    public final Equalizer copy(int eqType, @NotNull List<EqUnit> eqList, @Nullable Double masterGain) {
        return new Equalizer(eqType, eqList, masterGain);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Equalizer)) {
            return false;
        }
        Equalizer equalizer = (Equalizer) other;
        return this.eqType == equalizer.eqType && Intrinsics.areEqual(this.eqList, equalizer.eqList) && Intrinsics.areEqual((Object) this.masterGain, (Object) equalizer.masterGain);
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(getEqType());
        Iterator<T> it2 = getEqList().iterator();
        while (it2.hasNext()) {
            byte[] bytes$bluetooth_release = ((EqUnit) it2.next()).getBytes$bluetooth_release();
            byteArrayOutputStream.write(bytes$bluetooth_release, 0, bytes$bluetooth_release.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public final List<EqUnit> getEqList() {
        return this.eqList;
    }

    public final int getEqType() {
        return this.eqType;
    }

    @Nullable
    public final Double getMasterGain() {
        return this.masterGain;
    }

    public int hashCode() {
        int iHashCode = ((this.eqType * 31) + this.eqList.hashCode()) * 31;
        Double d = this.masterGain;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final boolean isClosed() {
        boolean z;
        if (this.eqType != 0) {
            return false;
        }
        List<EqUnit> list = this.eqList;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((EqUnit) it2.next()).getGain() != 0) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @NotNull
    public String toString() {
        return "Equalizer(eqType=" + this.eqType + ", eqList=" + this.eqList + ", masterGain=" + this.masterGain + ')';
    }

    public /* synthetic */ Equalizer(int i, List list, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : d);
    }
}
