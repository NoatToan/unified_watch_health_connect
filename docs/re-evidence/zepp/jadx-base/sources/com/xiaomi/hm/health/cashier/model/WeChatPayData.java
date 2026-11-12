package com.xiaomi.hm.health.cashier.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÂ\u0003J\t\u0010\b\u001a\u00020\u0002HÂ\u0003J\t\u0010\t\u001a\u00020\u0002HÂ\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/cashier/model/WeChatPayData;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "toString", "partnerId", "prepayId", "packageValue", "timeStamp", "nonceStr", "appId", "sign", "copy", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeChatPayData {

    @NotNull
    private final String appId;

    @NotNull
    private final String nonceStr;

    @NotNull
    private final String packageValue;

    @NotNull
    private String partnerId;

    @NotNull
    private final String prepayId;

    @NotNull
    private final String sign;

    @NotNull
    private final String timeStamp;

    public WeChatPayData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public WeChatPayData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this.partnerId = str;
        this.prepayId = str2;
        this.packageValue = str3;
        this.timeStamp = str4;
        this.nonceStr = str5;
        this.appId = str6;
        this.sign = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getPartnerId() {
        return this.partnerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getPrepayId() {
        return this.prepayId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getPackageValue() {
        return this.packageValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getNonceStr() {
        return this.nonceStr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getSign() {
        return this.sign;
    }

    public static /* synthetic */ WeChatPayData copy$default(WeChatPayData weChatPayData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weChatPayData.partnerId;
        }
        if ((i & 2) != 0) {
            str2 = weChatPayData.prepayId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = weChatPayData.packageValue;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = weChatPayData.timeStamp;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = weChatPayData.nonceStr;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = weChatPayData.appId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = weChatPayData.sign;
        }
        return weChatPayData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final WeChatPayData copy(@NotNull String partnerId, @NotNull String prepayId, @NotNull String packageValue, @NotNull String timeStamp, @NotNull String nonceStr, @NotNull String appId, @NotNull String sign) {
        return new WeChatPayData(partnerId, prepayId, packageValue, timeStamp, nonceStr, appId, sign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatPayData)) {
            return false;
        }
        WeChatPayData weChatPayData = (WeChatPayData) other;
        return Intrinsics.areEqual(this.partnerId, weChatPayData.partnerId) && Intrinsics.areEqual(this.prepayId, weChatPayData.prepayId) && Intrinsics.areEqual(this.packageValue, weChatPayData.packageValue) && Intrinsics.areEqual(this.timeStamp, weChatPayData.timeStamp) && Intrinsics.areEqual(this.nonceStr, weChatPayData.nonceStr) && Intrinsics.areEqual(this.appId, weChatPayData.appId) && Intrinsics.areEqual(this.sign, weChatPayData.sign);
    }

    public int hashCode() {
        return (((((((((((this.partnerId.hashCode() * 31) + this.prepayId.hashCode()) * 31) + this.packageValue.hashCode()) * 31) + this.timeStamp.hashCode()) * 31) + this.nonceStr.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.sign.hashCode();
    }

    @NotNull
    public String toString() {
        return "{\"appid\":\"" + this.appId + "\",\"partnerid\":\"" + this.partnerId + "\",\"prepayid\":\"" + this.prepayId + "\",\"package\":\"" + this.packageValue + "\",\"noncestr\":\"" + this.nonceStr + "\",\"timestamp\":" + this.timeStamp + ",\"sign\":\"" + this.sign + "\"}";
    }

    public /* synthetic */ WeChatPayData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
