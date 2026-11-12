package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/huami/nfc/bus/BindingCardEntity;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "component6", "appCode", "aid", "deviceType", "openTime", "sn", "cplc", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "b", "getAid", "c", LogUtil.I, "getDeviceType", "()I", GoogleApiAvailabilityLight.a, "J", "getOpenTime", "()J", "e", "getSn", "f", "getCplc", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BindingCardEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("appCode")
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("aid")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("deviceType")
    private final int deviceType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("openTime")
    private final long openTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("sn")
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("cplc")
    @NotNull
    private final String cplc;

    public BindingCardEntity(@NotNull String str, @NotNull String str2, int i, long j, @NotNull String str3, @NotNull String str4) {
        this.appCode = str;
        this.aid = str2;
        this.deviceType = i;
        this.openTime = j;
        this.sn = str3;
        this.cplc = str4;
    }

    public static /* synthetic */ BindingCardEntity copy$default(BindingCardEntity bindingCardEntity, String str, String str2, int i, long j, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bindingCardEntity.appCode;
        }
        if ((i2 & 2) != 0) {
            str2 = bindingCardEntity.aid;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = bindingCardEntity.deviceType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = bindingCardEntity.openTime;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            str3 = bindingCardEntity.sn;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = bindingCardEntity.cplc;
        }
        return bindingCardEntity.copy(str, str5, i3, j2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getOpenTime() {
        return this.openTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final BindingCardEntity copy(@NotNull String appCode, @NotNull String aid, int deviceType, long openTime, @NotNull String sn, @NotNull String cplc) {
        return new BindingCardEntity(appCode, aid, deviceType, openTime, sn, cplc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingCardEntity)) {
            return false;
        }
        BindingCardEntity bindingCardEntity = (BindingCardEntity) other;
        return Intrinsics.areEqual(this.appCode, bindingCardEntity.appCode) && Intrinsics.areEqual(this.aid, bindingCardEntity.aid) && this.deviceType == bindingCardEntity.deviceType && this.openTime == bindingCardEntity.openTime && Intrinsics.areEqual(this.sn, bindingCardEntity.sn) && Intrinsics.areEqual(this.cplc, bindingCardEntity.cplc);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final long getOpenTime() {
        return this.openTime;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((((((this.appCode.hashCode() * 31) + this.aid.hashCode()) * 31) + this.deviceType) * 31) + b.a(this.openTime)) * 31) + this.sn.hashCode()) * 31) + this.cplc.hashCode();
    }

    @NotNull
    public String toString() {
        return "BindingCardEntity(appCode=" + this.appCode + ", aid=" + this.aid + ", deviceType=" + this.deviceType + ", openTime=" + this.openTime + ", sn=" + this.sn + ", cplc=" + this.cplc + ')';
    }
}
