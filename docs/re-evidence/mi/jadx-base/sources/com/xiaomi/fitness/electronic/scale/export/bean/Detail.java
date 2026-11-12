package com.xiaomi.fitness.electronic.scale.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;", "", "irqKey", "", "sn", "encryptKey", "beaconkey", "mac", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIrqKey", "()Ljava/lang/String;", "setIrqKey", "(Ljava/lang/String;)V", "getSn", "setSn", "getEncryptKey", "setEncryptKey", "getBeaconkey", "setBeaconkey", "getMac", "setMac", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Detail {

    @NotNull
    private String beaconkey;

    @NotNull
    private String encryptKey;

    @NotNull
    private String irqKey;

    @NotNull
    private String mac;

    @NotNull
    private String sn;

    @NotNull
    private String token;

    public Detail() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Detail copy$default(Detail detail, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detail.irqKey;
        }
        if ((i & 2) != 0) {
            str2 = detail.sn;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = detail.encryptKey;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = detail.beaconkey;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = detail.mac;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = detail.token;
        }
        return detail.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIrqKey() {
        return this.irqKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEncryptKey() {
        return this.encryptKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBeaconkey() {
        return this.beaconkey;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final Detail copy(@NotNull String irqKey, @NotNull String sn, @NotNull String encryptKey, @NotNull String beaconkey, @NotNull String mac, @NotNull String token) {
        Intrinsics.checkNotNullParameter(irqKey, "irqKey");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
        Intrinsics.checkNotNullParameter(beaconkey, "beaconkey");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(token, "token");
        return new Detail(irqKey, sn, encryptKey, beaconkey, mac, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Detail)) {
            return false;
        }
        Detail detail = (Detail) other;
        return Intrinsics.areEqual(this.irqKey, detail.irqKey) && Intrinsics.areEqual(this.sn, detail.sn) && Intrinsics.areEqual(this.encryptKey, detail.encryptKey) && Intrinsics.areEqual(this.beaconkey, detail.beaconkey) && Intrinsics.areEqual(this.mac, detail.mac) && Intrinsics.areEqual(this.token, detail.token);
    }

    @NotNull
    public final String getBeaconkey() {
        return this.beaconkey;
    }

    @NotNull
    public final String getEncryptKey() {
        return this.encryptKey;
    }

    @NotNull
    public final String getIrqKey() {
        return this.irqKey;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((((this.irqKey.hashCode() * 31) + this.sn.hashCode()) * 31) + this.encryptKey.hashCode()) * 31) + this.beaconkey.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.token.hashCode();
    }

    public final void setBeaconkey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.beaconkey = str;
    }

    public final void setEncryptKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.encryptKey = str;
    }

    public final void setIrqKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.irqKey = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setSn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    @NotNull
    public String toString() {
        return "Detail(irqKey=" + this.irqKey + ", sn=" + this.sn + ", encryptKey=" + this.encryptKey + ", beaconkey=" + this.beaconkey + ", mac=" + this.mac + ", token=" + this.token + ")";
    }

    public Detail(@NotNull String irqKey, @NotNull String sn, @NotNull String encryptKey, @NotNull String beaconkey, @NotNull String mac, @NotNull String token) {
        Intrinsics.checkNotNullParameter(irqKey, "irqKey");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
        Intrinsics.checkNotNullParameter(beaconkey, "beaconkey");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(token, "token");
        this.irqKey = irqKey;
        this.sn = sn;
        this.encryptKey = encryptKey;
        this.beaconkey = beaconkey;
        this.mac = mac;
        this.token = token;
    }

    public /* synthetic */ Detail(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
