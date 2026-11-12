package com.xiaomi.fitness.webview.bean;

import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/webview/bean/WebViewPayModel;", "", "id", "", Constants.KEY_PRICE, "", "spuId", "spuVer", "", TSMAuthContants.PARAM_PAY_TYPE, "webSource", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSpuId", "getSpuVer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayType", "getWebSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fitness/webview/bean/WebViewPayModel;", "equals", "", "other", "hashCode", "toString", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewPayModel {

    @Nullable
    private final String id;

    @Nullable
    private final Integer payType;

    @Nullable
    private final Long price;

    @SerializedName("spu_id")
    @Nullable
    private final String spuId;

    @SerializedName("spu_ver")
    @Nullable
    private final Integer spuVer;

    @SerializedName("webSource")
    @Nullable
    private final String webSource;

    public WebViewPayModel(@Nullable String str, @Nullable Long l, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable String str3) {
        this.id = str;
        this.price = l;
        this.spuId = str2;
        this.spuVer = num;
        this.payType = num2;
        this.webSource = str3;
    }

    public static /* synthetic */ WebViewPayModel copy$default(WebViewPayModel webViewPayModel, String str, Long l, String str2, Integer num, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewPayModel.id;
        }
        if ((i & 2) != 0) {
            l = webViewPayModel.price;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str2 = webViewPayModel.spuId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = webViewPayModel.spuVer;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = webViewPayModel.payType;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            str3 = webViewPayModel.webSource;
        }
        return webViewPayModel.copy(str, l2, str4, num3, num4, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSpuVer() {
        return this.spuVer;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWebSource() {
        return this.webSource;
    }

    @NotNull
    public final WebViewPayModel copy(@Nullable String id, @Nullable Long price, @Nullable String spuId, @Nullable Integer spuVer, @Nullable Integer payType, @Nullable String webSource) {
        return new WebViewPayModel(id, price, spuId, spuVer, payType, webSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewPayModel)) {
            return false;
        }
        WebViewPayModel webViewPayModel = (WebViewPayModel) other;
        return Intrinsics.areEqual(this.id, webViewPayModel.id) && Intrinsics.areEqual(this.price, webViewPayModel.price) && Intrinsics.areEqual(this.spuId, webViewPayModel.spuId) && Intrinsics.areEqual(this.spuVer, webViewPayModel.spuVer) && Intrinsics.areEqual(this.payType, webViewPayModel.payType) && Intrinsics.areEqual(this.webSource, webViewPayModel.webSource);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    public final Integer getSpuVer() {
        return this.spuVer;
    }

    @Nullable
    public final String getWebSource() {
        return this.webSource;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.price;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.spuId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.spuVer;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.payType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.webSource;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WebViewPayModel(id=" + this.id + ", price=" + this.price + ", spuId=" + this.spuId + ", spuVer=" + this.spuVer + ", payType=" + this.payType + ", webSource=" + this.webSource + ')';
    }
}
