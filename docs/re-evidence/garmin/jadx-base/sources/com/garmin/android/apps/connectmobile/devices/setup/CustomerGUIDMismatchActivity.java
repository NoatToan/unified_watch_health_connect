package com.garmin.android.apps.connectmobile.devices.setup;

import a03.h0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.i0;
import bd0.q;
import bd0.r;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import lc0.k;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z6.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/CustomerGUIDMismatchActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CustomerGUIDMismatchActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34437b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f34438a = gt2.c.b(a2.DEVICES.f28756a);

    public static final void ca(CustomerGUIDMismatchActivity customerGUIDMismatchActivity, long j8, e23.a aVar) {
        customerGUIDMismatchActivity.getClass();
        try {
            k kVar = (k) KoinJavaComponent.get$default(k.class, null, null, 6, null);
            h0 h0Var = new h0(aVar, 6);
            h0 h0Var2 = new h0(aVar, 7);
            int i14 = k.f111948d;
            kVar.a(j8, true, h0Var, h0Var2);
        } catch (Exception e4) {
            customerGUIDMismatchActivity.f34438a.error("", (Throwable) e4);
            aVar.invoke();
        }
    }

    public static final void da(CustomerGUIDMismatchActivity customerGUIDMismatchActivity, long j8) {
        customerGUIDMismatchActivity.getClass();
        try {
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).r(j8);
        } catch (Exception e4) {
            customerGUIDMismatchActivity.f34438a.error("Samd clean-up", (Throwable) e4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            finish();
            return;
        }
        long longExtra = getIntent().getLongExtra("EXTRA_DEVICE_UNIT_ID", -1L);
        String stringExtra = getIntent().getStringExtra("EXTRA_PRODUCT_DISPLAY_NAME");
        String stringExtra2 = getIntent().getStringExtra("EXTRA_ACTION");
        if (longExtra == -1 || stringExtra2 == null) {
            finish();
            return;
        }
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(false, stringExtra);
        a0.a(this).f202582b.cancel(null, 37);
        boolean zEquals = stringExtra2.equals("ACTION_REMOVE");
        Logger logger = this.f34438a;
        if (zEquals) {
            logger.debug("GUID MismatchActivity remove device");
            i0 i0VarW = f0.w(this);
            x53.c cVar = s0.f129406a;
            ge1.b.T(i0VarW, x53.b.f189152a, null, new r(this, longExtra, null), 2);
            return;
        }
        if (!stringExtra2.equals("ACTION_PAIR")) {
            finish();
            return;
        }
        logger.debug("GUID MismatchActivity pair device");
        i0 i0VarW2 = f0.w(this);
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(i0VarW2, x53.b.f189152a, null, new q(this, longExtra, null), 2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/CustomerGUIDMismatchActivity$a;", "", "<init>", "()V", "", "ACTION_REMOVE", "Ljava/lang/String;", "ACTION_PAIR", "EXTRA_PRODUCT_DISPLAY_NAME", "EXTRA_DEVICE_UNIT_ID", "EXTRA_ACTION", "", "NO_DEVICE_ID", "J", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str, String str2) {
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) CustomerGUIDMismatchActivity.class);
            intent.putExtra("EXTRA_ACTION", str2);
            intent.putExtra("EXTRA_DEVICE_UNIT_ID", j8);
            intent.putExtra("EXTRA_PRODUCT_DISPLAY_NAME", str);
            return intent;
        }

        private a() {
        }
    }
}
