package com.garmin.android.apps.connectmobile.consent;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.y;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.ConsentDeleteDataActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import com.garmin.android.consent.network.GdprRevokeException406;
import e23.l;
import kd0.m;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p92.o;
import q92.v;
import q92.x;
import v92.e0;
import z10.e1;
import z10.g1;
import z10.q0;
import z10.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ConsentDeleteDataActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConsentDeleteDataActivity extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32160d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f32161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f32162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f32163c = new w1(s0.f105811a.b(e1.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32164a;

        public b(l lVar) {
            lVar.getClass();
            this.f32164a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32164a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32164a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32165a;

        public c(g gVar) {
            this.f32165a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32165a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32166a;

        public d(g gVar) {
            this.f32166a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32166a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f32168b;

        public e(e23.a aVar, g gVar) {
            this.f32167a = aVar;
            this.f32168b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32167a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32168b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z10.r0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [z10.r0] */
    public ConsentDeleteDataActivity() {
        final int i14 = 0;
        this.f32161a = new z0(this) { // from class: z10.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentDeleteDataActivity f201229b;

            {
                this.f201229b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                ConsentDeleteDataActivity consentDeleteDataActivity = this.f201229b;
                switch (i15) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        ConsentDeleteDataActivity.a aVar = ConsentDeleteDataActivity.f32160d;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            consentDeleteDataActivity.showProgressOverlay();
                            break;
                        } else if (kVar instanceof v92.k.c) {
                            consentDeleteDataActivity.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof v92.k.b) {
                            v92.e eVar = ((v92.k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                Toast.makeText(consentDeleteDataActivity, R.string.txt_error_occurred, 0).show();
                            } else if (!(eVar instanceof v92.e.b)) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.w(consentDeleteDataActivity);
                            } else if (!(((v92.e.b) eVar).f176358b instanceof GdprRevokeException406)) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.w(consentDeleteDataActivity);
                            } else {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.s(consentDeleteDataActivity);
                            }
                            break;
                        } else if (!(kVar instanceof v92.k.a)) {
                            lc.u0.r();
                            break;
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        ConsentDeleteDataActivity.a aVar2 = ConsentDeleteDataActivity.f32160d;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            Uri uri = Uri.parse(((v92.i.e) iVar).f176403b);
                            uri.getClass();
                            g22.a.c(consentDeleteDataActivity, uri);
                        } else if (iVar instanceof v92.i.b) {
                            new androidx.appcompat.app.e.a(consentDeleteDataActivity).setCancelable(false).setTitle(consentDeleteDataActivity.getString(R.string.decline_consent_alert_title)).setMessage(consentDeleteDataActivity.getString(R.string.decline_consent_alert_message)).setPositiveButton(consentDeleteDataActivity.getString(R.string.lbl_common_continue), new xg1.l(iVar, 14)).setNegativeButton(consentDeleteDataActivity.getString(R.string.lbl_cancel), new xk1.v(11)).create().show();
                        } else if (!(iVar instanceof v92.i.c)) {
                            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar3.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ConsentDeleteDataActivity", "ConsentParentAction " + iVar);
                        } else {
                            Bundle bundle = new Bundle();
                            if (((v92.i.c) iVar).f176399b == q92.y.OPT_OUT) {
                                bundle.putBoolean("extra_data_deletion_dialog", true);
                                bv.b.f21239a.getClass();
                                ((kd0.m) bv.b.a()).r();
                            }
                            bv.b.f21239a.getClass();
                            ((kd0.m) bv.b.a()).a(consentDeleteDataActivity, bundle, 268468224);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f32162b = new z0(this) { // from class: z10.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentDeleteDataActivity f201229b;

            {
                this.f201229b = this;
            }

            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                ConsentDeleteDataActivity consentDeleteDataActivity = this.f201229b;
                switch (i16) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        ConsentDeleteDataActivity.a aVar = ConsentDeleteDataActivity.f32160d;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            consentDeleteDataActivity.showProgressOverlay();
                            break;
                        } else if (kVar instanceof v92.k.c) {
                            consentDeleteDataActivity.hideProgressOverlay();
                            break;
                        } else if (kVar instanceof v92.k.b) {
                            v92.e eVar = ((v92.k.b) kVar).f176415a;
                            if (eVar instanceof v92.e.a) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                Toast.makeText(consentDeleteDataActivity, R.string.txt_error_occurred, 0).show();
                            } else if (!(eVar instanceof v92.e.b)) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.w(consentDeleteDataActivity);
                            } else if (!(((v92.e.b) eVar).f176358b instanceof GdprRevokeException406)) {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.w(consentDeleteDataActivity);
                            } else {
                                consentDeleteDataActivity.hideProgressOverlay();
                                d1.s(consentDeleteDataActivity);
                            }
                            break;
                        } else if (!(kVar instanceof v92.k.a)) {
                            lc.u0.r();
                            break;
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        ConsentDeleteDataActivity.a aVar2 = ConsentDeleteDataActivity.f32160d;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            Uri uri = Uri.parse(((v92.i.e) iVar).f176403b);
                            uri.getClass();
                            g22.a.c(consentDeleteDataActivity, uri);
                        } else if (iVar instanceof v92.i.b) {
                            new androidx.appcompat.app.e.a(consentDeleteDataActivity).setCancelable(false).setTitle(consentDeleteDataActivity.getString(R.string.decline_consent_alert_title)).setMessage(consentDeleteDataActivity.getString(R.string.decline_consent_alert_message)).setPositiveButton(consentDeleteDataActivity.getString(R.string.lbl_common_continue), new xg1.l(iVar, 14)).setNegativeButton(consentDeleteDataActivity.getString(R.string.lbl_cancel), new xk1.v(11)).create().show();
                        } else if (!(iVar instanceof v92.i.c)) {
                            com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                            aVar3.getClass();
                            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ConsentDeleteDataActivity", "ConsentParentAction " + iVar);
                        } else {
                            Bundle bundle = new Bundle();
                            if (((v92.i.c) iVar).f176399b == q92.y.OPT_OUT) {
                                bundle.putBoolean("extra_data_deletion_dialog", true);
                                bv.b.f21239a.getClass();
                                ((kd0.m) bv.b.a()).r();
                            }
                            bv.b.f21239a.getClass();
                            ((kd0.m) bv.b.a()).a(consentDeleteDataActivity, bundle, 268468224);
                        }
                        break;
                }
            }
        };
    }

    public final void aa(v vVar) {
        hideProgressOverlay();
        if (vVar == null || !y.a(vVar)) {
            bv.b.f21239a.getClass();
            ((m) bv.b.a()).a(this, null, 268468224);
            return;
        }
        o.x(o.f136619a, this, this, new q0(this, 1), this.f32161a, this.f32162b, x.DI_CONNECT_UPLOAD, vVar, null, e0.ASK_FOR_DEVICE_UPLOAD, false, false, 3392);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_fragment_container_view_layout);
        initActionBar(R.string.lbl_data_privacy, 1);
        v vVar = (v) getIntent().getSerializableExtra("extra_consent_status");
        if (vVar == null) {
            showProgressOverlay();
            e1 e1Var = (e1) this.f32163c.getValue();
            x xVar = x.DI_CONNECT_UPLOAD;
            xVar.getClass();
            y0 y0Var = new y0();
            ge1.b.T(v1.a(e1Var), null, null, new g1(y0Var, xVar, null), 3);
            y0Var.f(this, new b(new q0(this, 0)));
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ConsentDeleteDataActivity", "onCreate() consentStatus from bundle: " + vVar);
        aa(vVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ConsentDeleteDataActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_STATUS", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
