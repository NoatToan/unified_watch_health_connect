package com.garmin.feature.garminpay.ui.privacy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.x1;
import gt2.c;
import hr2.b;
import op2.o;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/privacy/FitPayPrivacyPolicyActivity;", "Lhr2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayPrivacyPolicyActivity extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f52141k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f52142l;

    static {
        int i14 = c.f79010a;
        f52142l = gt2.b.f79005a.h("PAY#FitPayPrivacyPolicyActivity");
    }

    @Override // hr2.b
    public final void ca() {
        this.f85293g = (hr2.c) new x1(this).a(o.class);
    }

    @Override // hr2.b, hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/garminpay/")));
            finish();
        } catch (Exception e4) {
            f52142l.error("Failed to open url in external browser", (Throwable) e4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/privacy/FitPayPrivacyPolicyActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
