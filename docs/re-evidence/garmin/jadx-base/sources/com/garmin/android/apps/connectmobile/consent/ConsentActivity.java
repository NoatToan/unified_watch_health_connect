package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c22.s3;
import f12.l;
import g22.n;
import kd0.m;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q92.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ConsentActivity;", "Lcom/garmin/android/apps/connectmobile/consent/a;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConsentActivity extends com.garmin.android.apps.connectmobile.consent.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f32155r = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f32156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bv.e f32158q = (bv.e) KoinJavaComponent.get$default(bv.e.class, null, null, 6, null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32159a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.DI_CONNECT_INSIGHTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.DI_CONNECT_LIVETRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32159a = iArr;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    /* JADX INFO: renamed from: ma */
    public final x getF32154o() {
        x xVar = this.f32156o;
        xVar.getClass();
        return xVar;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        ya();
        if (s3.b()) {
            x xVar = this.f32156o;
            int i14 = xVar == null ? -1 : b.f32159a[xVar.ordinal()];
            if (i14 != 1) {
                str = i14 != 2 ? null : "PageViewChildConsent_livetrack";
            } else {
                str = "PageViewChildConsent_insights";
            }
            if (n.d(str)) {
                ht.a.f85464a.getClass();
                ht.a.a(null, str);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void sa() {
        displayFailedMessage();
        setResult(0);
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void ta() {
        l.f68084a.getClass();
        l.a.a().T3(true);
        setResult(-1, getIntent());
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void ua() {
        sn.a.o(l.f68084a, true);
        if (this.f32157p) {
            bv.b.f21239a.getClass();
            ((m) bv.b.a()).a(this, null, 268468224);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_consent_revoked", true);
        setResult(0, intent);
        x xVar = this.f32156o;
        xVar.getClass();
        if (xVar == x.DI_CONNECT_AUTO_ACTIVITY_DETECTION && s.g(this.f32249g, hl.a.c.f84256b)) {
            this.f32158q.a("ConsentActivity_RevokeConsent");
        }
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
        Object serializableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("extra_consent_feature", x.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("extra_consent_feature");
            if (!(serializableExtra2 instanceof x)) {
                serializableExtra2 = null;
            }
            serializableExtra = (x) serializableExtra2;
        }
        this.f32156o = (x) serializableExtra;
        this.f32157p = intent.getBooleanExtra("extra_revoke_navigate_my_day", false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ConsentActivity$a;", "", "<init>", "()V", "", "EXTRA_CONSENT_FEATURE", "Ljava/lang/String;", "EXTRA_REVOKE_NAVIGATE_MY_DAY", "EXTRA_CONSENT_REVOKED", "TAG", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, x xVar, boolean z14, boolean z15, hl.a aVar) {
            context.getClass();
            xVar.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) ConsentActivity.class);
            intent.putExtra("extra_consent_feature", xVar);
            intent.putExtra("extra_revoke_navigate_my_day", z14);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            intent.putExtra("extra_creation_consent_flow", z15);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, x xVar, boolean z14, hl.a aVar2, int i14) {
            if ((i14 & 16) != 0) {
                aVar2 = hl.a.c.f84256b;
            }
            aVar.getClass();
            return a(context, xVar, z14, false, aVar2);
        }

        public static void c(Context context, hl.a aVar, x xVar, boolean z14) {
            context.getClass();
            xVar.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) ConsentActivity.class);
            intent.putExtra("extra_consent_feature", xVar);
            intent.putExtra("extra_revoke_navigate_my_day", z14);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
