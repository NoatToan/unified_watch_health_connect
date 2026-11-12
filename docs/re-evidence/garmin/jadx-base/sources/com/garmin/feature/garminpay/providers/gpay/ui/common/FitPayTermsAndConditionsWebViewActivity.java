package com.garmin.feature.garminpay.providers.gpay.ui.common;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.x1;
import aq2.j;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import ms2.d;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import sl2.f;
import zn2.f1;
import zn2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/FitPayTermsAndConditionsWebViewActivity;", "Lhr2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayTermsAndConditionsWebViewActivity extends hr2.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51545k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f51546l;

    static {
        int i14 = gt2.c.f79010a;
        f51546l = gt2.b.f79005a.h("PAY#FitPayTermsAndConditionsWebViewActivity");
    }

    @Override // hr2.b
    public final void ca() {
        this.f85293g = (hr2.c) new x1(this).a(op2.b.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hr2.b, hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String language;
        is2.a nfcInfo;
        super.onCreate(bundle);
        op2.b bVar = (op2.b) da();
        d dVar = bVar.f85300c;
        hs2.a f85273c = dVar != null ? dVar.getF85273c() : null;
        kj0.b.f104940a.getClass();
        zi2.a aVarA = kj0.b.a();
        j.f12491a.getClass();
        String strB = j.b(aVarA);
        String f12510g = j.a(aVarA).getF12510g();
        k.f205614a.getClass();
        p pVarA = k.a();
        if (pVarA == null || (language = (String) pVarA.f128595b) == null) {
            language = Locale.ENGLISH.getLanguage();
        }
        String str = language;
        str.getClass();
        String str2 = (String) j.f12492b.getValue();
        f1.f205508a.getClass();
        String strB2 = f1.b();
        String str3 = strB2 == null ? "" : strB2;
        f nfcChipType = (f85273c == null || (nfcInfo = f85273c.getNfcInfo()) == null) ? null : nfcInfo.getNfcChipType();
        Integer numValueOf = f85273c != null ? Integer.valueOf(f85273c.getFirmwareVersion()) : null;
        Integer numValueOf2 = f85273c != null ? Integer.valueOf(f85273c.getProductNumber()) : null;
        hr2.a aVar = bVar.f85298a;
        aVar.getClass();
        sd2.f fVar = aVar.f85290c;
        String softwareVersion = fVar.getSoftwareVersion();
        String str4 = softwareVersion == null ? "" : softwareVersion;
        String softwareVersion2 = fVar.getSoftwareVersion();
        try {
            ((WebView) findViewById(R.id.containedWebView)).loadUrl("https://webapp.fit-pay.com/terms?config=".concat(new cq2.a("", true, strB, "https://static.garmincdn.com/com.garmin.connect/ui/css/pay-fitpay-v2.2-min.css", f12510g, str, str2, str3, false, null, false, false, new cq2.b("WATCH", "GARMIN", fVar.getProductDisplayName(), str4, "Garmin OS", fVar.getProductNumber(), fVar.getProductNumber(), null, softwareVersion2 == null ? "" : softwareVersion2, "", "", fVar.d0(), null, null, null, null, 61568, null), nfcChipType, numValueOf, numValueOf2, null, 69376, null).a()));
        } catch (Exception e4) {
            f51546l.error("Failed to open url in WebView", (Throwable) e4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/FitPayTermsAndConditionsWebViewActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
