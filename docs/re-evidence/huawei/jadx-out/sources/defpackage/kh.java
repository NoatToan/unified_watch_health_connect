package defpackage;

import android.app.ApplicationExitInfo;
import android.content.res.loader.ResourcesLoader;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrengthNr;
import android.webkit.SafeBrowsingResponse;
import android.webkit.TracingConfig;
import android.webkit.WebViewRenderProcess;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh {
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse B_(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    public static /* synthetic */ TracingConfig.Builder C_() {
        return new TracingConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ WebViewRenderProcess J_(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    public static /* synthetic */ void f() {
    }

    public static /* bridge */ /* synthetic */ boolean h(Object obj) {
        return obj instanceof CellInfoNr;
    }

    public static /* bridge */ /* synthetic */ boolean i(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo m_(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ ResourcesLoader p_() {
        return new ResourcesLoader();
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source s_(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable u_(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr w_(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr x_(Object obj) {
        return (CellInfoNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr z_(Object obj) {
        return (CellSignalStrengthNr) obj;
    }
}
