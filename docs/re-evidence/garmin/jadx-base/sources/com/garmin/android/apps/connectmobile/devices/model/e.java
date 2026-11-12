package com.garmin.android.apps.connectmobile.devices.model;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/e;", "", "", "locale", "productId", "sku", "productPageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "b", "getProductId", "c", "getSku", "d", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sku")
    private final String sku;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productPageUrl")
    private final String productPageUrl;

    public e(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.locale = str;
        this.productId = str2;
        this.sku = str3;
        this.productPageUrl = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProductPageUrl() {
        return this.productPageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.locale, eVar.locale) && p005kotlin.jvm.internal.s.g(this.productId, eVar.productId) && p005kotlin.jvm.internal.s.g(this.sku, eVar.sku) && p005kotlin.jvm.internal.s.g(this.productPageUrl, eVar.productPageUrl);
    }

    public final int hashCode() {
        return this.productPageUrl.hashCode() + wr.g.j(wr.g.j(this.locale.hashCode() * 31, 31, this.productId), 31, this.sku);
    }

    public final String toString() {
        String str = this.locale;
        String str2 = this.productId;
        return e5.h(p6.b.i("CrossSellResultDTO(locale=", str, ", productId=", str2, ", sku="), this.sku, ", productPageUrl=", this.productPageUrl, ")");
    }
}
