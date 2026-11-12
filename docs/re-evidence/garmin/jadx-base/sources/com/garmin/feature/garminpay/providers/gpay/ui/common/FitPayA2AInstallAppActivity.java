package com.garmin.feature.garminpay.providers.gpay.ui.common;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/FitPayA2AInstallAppActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayA2AInstallAppActivity extends hn2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Logger f51544h;

    static {
        new a(null);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Object obj = extras != null ? extras.get("app.package.name") : null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        int i14 = gt2.c.f79010a;
        Logger loggerH = gt2.b.f79005a.h("FitPayA2AInstallAppActivity");
        this.f51544h = loggerH;
        com.airbnb.lottie.animation.keyframe.a.w("onCreate: ", str, loggerH);
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(str)));
                intent.setPackage(str);
                startActivity(intent);
                return;
            } catch (Exception unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
                finish();
                return;
            }
        }
        Logger logger = this.f51544h;
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.error("onCreate -> App Package Name is NULL.");
        hn2.c.U9(this, this, t0.b(new p("cardVerification.status", Boolean.FALSE)), 2);
        finish();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z14 = this.f51543g;
        Logger logger = this.f51544h;
        if (!z14) {
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.debug("onResume");
            this.f51543g = true;
            return;
        }
        if (logger == null) {
            s.m("logger");
            throw null;
        }
        logger.debug("onResume: launching UserWalletActivity...");
        hn2.c.U9(this, this, null, 10);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/FitPayA2AInstallAppActivity$a;", "", "<init>", "()V", "", "EXTRA_APP_PACKAGE_NAME", "Ljava/lang/String;", "TAG", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
