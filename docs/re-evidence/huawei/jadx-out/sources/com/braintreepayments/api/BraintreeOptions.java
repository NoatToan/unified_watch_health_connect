package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/braintreepayments/api/BraintreeOptions;", "", ParamConstants.Param.CONTEXT, "Landroid/content/Context;", "sessionId", "", "returnUrlScheme", "appLinkReturnUri", "Landroid/net/Uri;", "initialAuthString", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "integrationType", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lcom/braintreepayments/api/ClientTokenProvider;Ljava/lang/String;)V", "getAppLinkReturnUri", "()Landroid/net/Uri;", "getClientTokenProvider", "()Lcom/braintreepayments/api/ClientTokenProvider;", "getContext", "()Landroid/content/Context;", "getInitialAuthString", "()Ljava/lang/String;", "getIntegrationType", "getReturnUrlScheme", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BraintreeOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClientTokenProvider f4018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4020c;
    private final Uri d;
    private final Context e;
    private final String f;
    private final String j;

    public BraintreeOptions(Context context, String str, String str2, Uri uri, String str3, ClientTokenProvider clientTokenProvider, String str4) {
        zcp.c(context, "");
        this.e = context;
        this.f = str;
        this.j = str2;
        this.d = uri;
        this.f4020c = str3;
        this.f4018a = clientTokenProvider;
        this.f4019b = str4;
    }

    public /* synthetic */ BraintreeOptions(Context context, String str, String str2, Uri uri, String str3, ClientTokenProvider clientTokenProvider, String str4, int i, zcm zcmVar) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : clientTokenProvider, (i & 64) == 0 ? str4 : null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF4020c() {
        return this.f4020c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ClientTokenProvider getF4018a() {
        return this.f4018a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF4019b() {
        return this.f4019b;
    }

    public String toString() {
        return "BraintreeOptions(context=" + this.e + ", sessionId=" + this.f + ", returnUrlScheme=" + this.j + ", appLinkReturnUri=" + this.d + ", initialAuthString=" + this.f4020c + ", clientTokenProvider=" + this.f4018a + ", integrationType=" + this.f4019b + g4.l;
    }

    public int hashCode() {
        int iHashCode = this.e.hashCode();
        String str = this.f;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.j;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Uri uri = this.d;
        int iHashCode4 = uri == null ? 0 : uri.hashCode();
        String str3 = this.f4020c;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        ClientTokenProvider clientTokenProvider = this.f4018a;
        int iHashCode6 = clientTokenProvider == null ? 0 : clientTokenProvider.hashCode();
        String str4 = this.f4019b;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BraintreeOptions)) {
            return false;
        }
        BraintreeOptions braintreeOptions = (BraintreeOptions) other;
        return zcp.b(this.e, braintreeOptions.e) && zcp.b((Object) this.f, (Object) braintreeOptions.f) && zcp.b((Object) this.j, (Object) braintreeOptions.j) && zcp.b(this.d, braintreeOptions.d) && zcp.b((Object) this.f4020c, (Object) braintreeOptions.f4020c) && zcp.b(this.f4018a, braintreeOptions.f4018a) && zcp.b((Object) this.f4019b, (Object) braintreeOptions.f4019b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context) {
        this(context, null, null, null, null, null, null, 126, null);
        zcp.c(context, "");
    }
}
