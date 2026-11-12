package com.garmin.android.apps.connectmobile.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p92.o;
import q92.x;
import z10.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/CoachConsentActivity;", "Lcom/garmin/android/apps/connectmobile/consent/a;", "Lz10/d0;", "Lq92/x;", "consentFeature", "<init>", "(Lq92/x;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CoachConsentActivity extends com.garmin.android.apps.connectmobile.consent.a implements d0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f32153p = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f32154o;

    public /* synthetic */ CoachConsentActivity(x xVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN : xVar);
    }

    @Override // z10.d0
    public final void S3() {
        List<Fragment> listF = getSupportFragmentManager().f7372c.f();
        listF.getClass();
        for (Fragment fragment : listF) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.k(fragment);
            aVar.f();
        }
        ya();
    }

    @Override // z10.d0
    public final void T1() {
        setResult(0, null);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    /* JADX INFO: renamed from: ma, reason: from getter */
    public final x getF32154o() {
        return this.f32154o;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hl.a aVar = this.f32249g;
        if (s.g(aVar, hl.a.c.f84256b)) {
            ya();
        } else {
            if (!(aVar instanceof hl.a.b)) {
                u0.r();
                return;
            }
            na();
        }
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildConsent_atp");
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
        l.f68084a.getClass();
        l.a.a().T3(true);
        Intent intent = new Intent();
        intent.putExtra("extra_consent_revoked", true);
        setResult(0, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void va(q92.v vVar) {
        hl.a aVar = this.f32249g;
        if (aVar instanceof hl.a.b) {
            if (vVar != null) {
                o oVar = o.f136619a;
                hl.a aVar2 = this.f32249g;
                aVar2.getClass();
                s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar2).f84252b));
                oVar.getClass();
                vVar = o.o(this.f32154o, lVar);
            }
            if (vVar != null && !vVar.b()) {
                setTitle(getString(R.string.wallet_terms_and_conditions_title));
                v supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                b.f32262b.getClass();
                aVar3.l(R.id.content_frame, new b(), null);
                aVar3.e();
                return;
            }
        } else if (!s.g(aVar, hl.a.c.f84256b)) {
            u0.r();
            return;
        }
        ya();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/CoachConsentActivity$a;", "", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, hl.a aVar2, int i14) {
            if ((i14 & 2) != 0) {
                aVar2 = hl.a.c.f84256b;
            }
            aVar.getClass();
            context.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) CoachConsentActivity.class);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            intent.putExtra("extra_creation_consent_flow", false);
            return intent;
        }

        private a() {
        }
    }

    public CoachConsentActivity(x xVar) {
        xVar.getClass();
        this.f32154o = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoachConsentActivity() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
