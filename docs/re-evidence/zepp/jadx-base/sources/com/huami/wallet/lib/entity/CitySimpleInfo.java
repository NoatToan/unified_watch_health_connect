package com.huami.wallet.lib.entity;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003J\u0098\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010,R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u000bR$\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u00109R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010,R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u0010\u000b\"\u0004\b?\u00109R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bA\u0010\u000b\"\u0004\bB\u00109R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00100\u001a\u0004\bD\u00102\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/huami/wallet/lib/entity/CitySimpleInfo;", "", "", "component1", "component2", "component3", "component4", "", "component5", "", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "component11", "aid", "appCode", "name", "miCardName", "paymentList", "openFeeRefundApplyFlg", "xmReturnCardFlg", "xmActionToken", "xmReturnFeeFlg", "refundEnable", "refundAccountCollectModes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/huami/wallet/lib/entity/CitySimpleInfo;", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "b", "getAppCode", "c", "getName", "setName", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getMiCardName", "e", "Ljava/util/List;", "getPaymentList", "()Ljava/util/List;", "f", "Ljava/lang/Boolean;", "getOpenFeeRefundApplyFlg", "g", "getXmReturnCardFlg", "setXmReturnCardFlg", "(Ljava/lang/Boolean;)V", "h", "getXmActionToken", "setXmActionToken", "i", "getXmReturnFeeFlg", "setXmReturnFeeFlg", z.j, "getRefundEnable", "setRefundEnable", hl.k, "getRefundAccountCollectModes", "setRefundAccountCollectModes", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CitySimpleInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String miCardName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<String> paymentList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean openFeeRefundApplyFlg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean xmReturnCardFlg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String xmActionToken;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean xmReturnFeeFlg;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean refundEnable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private List<String> refundAccountCollectModes;

    public CitySimpleInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull List<String> list, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable List<String> list2) {
        this.aid = str;
        this.appCode = str2;
        this.name = str3;
        this.miCardName = str4;
        this.paymentList = list;
        this.openFeeRefundApplyFlg = bool;
        this.xmReturnCardFlg = bool2;
        this.xmActionToken = str5;
        this.xmReturnFeeFlg = bool3;
        this.refundEnable = bool4;
        this.refundAccountCollectModes = list2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getRefundEnable() {
        return this.refundEnable;
    }

    @Nullable
    public final List<String> component11() {
        return this.refundAccountCollectModes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMiCardName() {
        return this.miCardName;
    }

    @NotNull
    public final List<String> component5() {
        return this.paymentList;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getOpenFeeRefundApplyFlg() {
        return this.openFeeRefundApplyFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getXmActionToken() {
        return this.xmActionToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    @NotNull
    public final CitySimpleInfo copy(@NotNull String aid, @NotNull String appCode, @NotNull String name, @Nullable String miCardName, @NotNull List<String> paymentList, @Nullable Boolean openFeeRefundApplyFlg, @Nullable Boolean xmReturnCardFlg, @Nullable String xmActionToken, @Nullable Boolean xmReturnFeeFlg, @Nullable Boolean refundEnable, @Nullable List<String> refundAccountCollectModes) {
        return new CitySimpleInfo(aid, appCode, name, miCardName, paymentList, openFeeRefundApplyFlg, xmReturnCardFlg, xmActionToken, xmReturnFeeFlg, refundEnable, refundAccountCollectModes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CitySimpleInfo)) {
            return false;
        }
        CitySimpleInfo citySimpleInfo = (CitySimpleInfo) other;
        return Intrinsics.areEqual(this.aid, citySimpleInfo.aid) && Intrinsics.areEqual(this.appCode, citySimpleInfo.appCode) && Intrinsics.areEqual(this.name, citySimpleInfo.name) && Intrinsics.areEqual(this.miCardName, citySimpleInfo.miCardName) && Intrinsics.areEqual(this.paymentList, citySimpleInfo.paymentList) && Intrinsics.areEqual(this.openFeeRefundApplyFlg, citySimpleInfo.openFeeRefundApplyFlg) && Intrinsics.areEqual(this.xmReturnCardFlg, citySimpleInfo.xmReturnCardFlg) && Intrinsics.areEqual(this.xmActionToken, citySimpleInfo.xmActionToken) && Intrinsics.areEqual(this.xmReturnFeeFlg, citySimpleInfo.xmReturnFeeFlg) && Intrinsics.areEqual(this.refundEnable, citySimpleInfo.refundEnable) && Intrinsics.areEqual(this.refundAccountCollectModes, citySimpleInfo.refundAccountCollectModes);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getMiCardName() {
        return this.miCardName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getOpenFeeRefundApplyFlg() {
        return this.openFeeRefundApplyFlg;
    }

    @NotNull
    public final List<String> getPaymentList() {
        return this.paymentList;
    }

    @Nullable
    public final List<String> getRefundAccountCollectModes() {
        return this.refundAccountCollectModes;
    }

    @Nullable
    public final Boolean getRefundEnable() {
        return this.refundEnable;
    }

    @Nullable
    public final String getXmActionToken() {
        return this.xmActionToken;
    }

    @Nullable
    public final Boolean getXmReturnCardFlg() {
        return this.xmReturnCardFlg;
    }

    @Nullable
    public final Boolean getXmReturnFeeFlg() {
        return this.xmReturnFeeFlg;
    }

    public int hashCode() {
        int iHashCode = ((((this.aid.hashCode() * 31) + this.appCode.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.miCardName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentList.hashCode()) * 31;
        Boolean bool = this.openFeeRefundApplyFlg;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.xmReturnCardFlg;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.xmActionToken;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.xmReturnFeeFlg;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.refundEnable;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.refundAccountCollectModes;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setRefundAccountCollectModes(@Nullable List<String> list) {
        this.refundAccountCollectModes = list;
    }

    public final void setRefundEnable(@Nullable Boolean bool) {
        this.refundEnable = bool;
    }

    public final void setXmActionToken(@Nullable String str) {
        this.xmActionToken = str;
    }

    public final void setXmReturnCardFlg(@Nullable Boolean bool) {
        this.xmReturnCardFlg = bool;
    }

    public final void setXmReturnFeeFlg(@Nullable Boolean bool) {
        this.xmReturnFeeFlg = bool;
    }

    @NotNull
    public String toString() {
        return "CitySimpleInfo(aid=" + this.aid + ", appCode=" + this.appCode + ", name=" + this.name + ", miCardName=" + ((Object) this.miCardName) + ", paymentList=" + this.paymentList + ", openFeeRefundApplyFlg=" + this.openFeeRefundApplyFlg + ", xmReturnCardFlg=" + this.xmReturnCardFlg + ", xmActionToken=" + ((Object) this.xmActionToken) + ", xmReturnFeeFlg=" + this.xmReturnFeeFlg + ", refundEnable=" + this.refundEnable + ", refundAccountCollectModes=" + this.refundAccountCollectModes + ')';
    }

    public /* synthetic */ CitySimpleInfo(String str, String str2, String str3, String str4, List list, Boolean bool, Boolean bool2, String str5, Boolean bool3, Boolean bool4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : list2);
    }
}
