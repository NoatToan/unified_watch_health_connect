package com.garmin.android.apps.connectmobile.consent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import kd0.m;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p92.o;
import q92.v;
import q92.x;
import q92.y;
import s92.l;
import v92.e0;
import yr.o0;
import z10.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataStorageConsentActivity;", "Lcom/garmin/android/apps/connectmobile/consent/a;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DataStorageConsentActivity extends com.garmin.android.apps.connectmobile.consent.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f32194t = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f32195o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f32197q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32196p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bv.e f32198r = (bv.e) KoinJavaComponent.get$default(bv.e.class, null, null, 6, null);

    @Override // com.garmin.android.apps.connectmobile.consent.a
    /* JADX INFO: renamed from: ma */
    public final x getF201311o() {
        return x.DI_CONNECT_UPLOAD;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final e0 oa() {
        return this.f32196p ? e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY : e0.ASK_FOR_DEVICE_UPLOAD;
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hl.a aVar = this.f32249g;
        if (s.g(aVar, hl.a.c.f84256b)) {
            o oVar = o.f136619a;
            x xVar = x.DI_CONNECT_UPLOAD;
            oVar.getClass();
            this.f32197q = o.n(xVar);
        } else {
            if (!(aVar instanceof hl.a.b)) {
                u0.r();
                return;
            }
            hl.a aVar2 = this.f32249g;
            aVar2.getClass();
            l lVar = new l(String.valueOf(((hl.a.b) aVar2).f84252b));
            o oVar2 = o.f136619a;
            x xVar2 = x.DI_CONNECT_UPLOAD;
            oVar2.getClass();
            v vVarO = o.o(xVar2, lVar);
            this.f32197q = vVarO;
            if (vVarO == null) {
                na();
            }
        }
        ya();
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildConsent_dataUpload");
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
        bv.b.f21239a.getClass();
        ((m) bv.b.a()).p();
        setResult(-1, getIntent());
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void ua() {
        hl.a aVar = this.f32249g;
        if (aVar instanceof hl.a.b) {
            v vVar = this.f32197q;
            if ((vVar != null ? vVar.f143784b : null) != y.OPT_IN && (vVar == null || !q92.c.a(vVar))) {
                onNavigateUp();
                return;
            }
            o0 o0Var = new o0(this, 6);
            d1 d1Var = d1.f200951a;
            new androidx.appcompat.app.e.a(this).setCancelable(false).setTitle(getString(R.string.lbl_child_consent_data_being_deleted)).setMessage(getString(R.string.msg_child_consent_data_permanently_deleted)).setPositiveButton(getString(R.string.lbl_ok), new xg1.l(o0Var, 16)).create().show();
            return;
        }
        hl.a.c cVar = hl.a.c.f84256b;
        if (!s.g(aVar, cVar)) {
            u0.r();
            return;
        }
        this.f32198r.a("DataStorageConsentActivity_RevokeConsent");
        bv.b.f21239a.getClass();
        ((m) bv.b.a()).r();
        ((m) bv.b.a()).p();
        Bundle bundle = new Bundle();
        v vVar2 = this.f32197q;
        if ((vVar2 != null ? vVar2.f143784b : null) == y.OPT_IN) {
            bundle.putBoolean("extra_data_deletion_dialog", true);
        }
        if (s.g(this.f32249g, cVar) && this.f32195o) {
            ((m) bv.b.a()).a(this, bundle, 268468224);
            return;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        Unit unit = Unit.INSTANCE;
        setResult(0, intent);
        onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void va(v vVar) {
        if (this.f32249g instanceof hl.a.b) {
            this.f32197q = vVar;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
        this.f32195o = intent.getBooleanExtra("extra_revoke_navigate_my_day", false);
        this.f32196p = intent.getBooleanExtra("extra_implicit_device_upload_consent", true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DataStorageConsentActivity$a;", "", "<init>", "()V", "", "EXTRA_REVOKE_NAVIGATE_MY_DAY", "Ljava/lang/String;", "EXTRA_IMPLICIT_DEVICE_UPLOAD_CONSENT", "TAG", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, hl.a aVar2, int i14) {
            boolean z14 = (i14 & 4) != 0;
            if ((i14 & 8) != 0) {
                aVar2 = hl.a.c.f84256b;
            }
            boolean z15 = (i14 & 16) == 0;
            aVar.getClass();
            context.getClass();
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) DataStorageConsentActivity.class);
            intent.putExtra("extra_revoke_navigate_my_day", false);
            intent.putExtra("extra_implicit_device_upload_consent", z14);
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            intent.putExtra("extra_creation_consent_flow", z15);
            return intent;
        }

        public static void b(Context context, boolean z14, boolean z15, hl.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DataStorageConsentActivity.class);
            intent.putExtra("extra_revoke_navigate_my_day", z14);
            intent.putExtra("extra_implicit_device_upload_consent", z15);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            context.startActivity(intent);
        }

        public static /* synthetic */ void c(a aVar, Context context) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            b(context, true, true, cVar);
        }

        public static void d(a aVar, Activity activity, int i14) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            cVar.getClass();
            Intent intent = new Intent(activity, (Class<?>) DataStorageConsentActivity.class);
            intent.putExtra("extra_revoke_navigate_my_day", false);
            intent.putExtra("extra_implicit_device_upload_consent", true);
            intent.putExtra("GCM_extra_screen_access_role", cVar);
            activity.startActivityForResult(intent, i14);
        }

        public static void e(a aVar, Fragment fragment, boolean z14, int i14, Bundle bundle, int i15) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            cVar.getClass();
            Intent intent = new Intent(fragment.getContext(), (Class<?>) DataStorageConsentActivity.class);
            intent.putExtra("extra_revoke_navigate_my_day", z14);
            intent.putExtra("extra_implicit_device_upload_consent", true);
            intent.putExtra("GCM_extra_screen_access_role", cVar);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            fragment.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
