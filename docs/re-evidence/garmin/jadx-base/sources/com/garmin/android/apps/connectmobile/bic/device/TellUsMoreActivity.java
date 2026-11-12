package com.garmin.android.apps.connectmobile.bic.device;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import dv.k;
import ew1.h1;
import hv.o;
import hv.p;
import lc.u0;
import o13.h;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.x;
import z10.d1;
import z10.j;
import zb0.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/TellUsMoreActivity;", "Lcom/garmin/android/apps/connectmobile/bic/a;", "Lzb0/r1$c;", "Ldv/k;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TellUsMoreActivity extends com.garmin.android.apps.connectmobile.bic.a implements r1.c, k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f30729i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f30730d = new w1(s0.f105811a.b(o.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30731e = m.a(n.NONE, new c(this, null, null, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f30732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hv.k f30733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hv.k f30734h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30735a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f30735a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f30735a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30735a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30739d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f30736a = gVar;
            this.f30737b = qualifier;
            this.f30738c = aVar;
            this.f30739d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f30736a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f30738c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), f189591b, null, defaultViewModelCreationExtras, this.f30737b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f30739d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30740a;

        public d(g gVar) {
            this.f30740a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30740a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30741a;

        public e(g gVar) {
            this.f30741a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30741a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30743b;

        public f(e23.a aVar, g gVar) {
            this.f30742a = aVar;
            this.f30743b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30742a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30743b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [hv.k] */
    /* JADX WARN: Type inference failed for: r0v4, types: [hv.k] */
    public TellUsMoreActivity() {
        final int i14 = 0;
        this.f30733g = new z0(this) { // from class: hv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TellUsMoreActivity f85774b;

            {
                this.f85774b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                TellUsMoreActivity tellUsMoreActivity = this.f85774b;
                switch (i15) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        TellUsMoreActivity.a aVar = TellUsMoreActivity.f30729i;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            tellUsMoreActivity.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            tellUsMoreActivity.hideProgressOverlay();
                        } else if (kVar instanceof v92.k.b) {
                            tellUsMoreActivity.hideProgressOverlay();
                            tellUsMoreActivity.displayFailedMessage();
                            tellUsMoreActivity.da();
                        } else if (!(kVar instanceof v92.k.a)) {
                            u0.r();
                        } else {
                            ((z10.j) tellUsMoreActivity.f30731e.getValue()).x4(x.DI_CONNECT_UPLOAD);
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        TellUsMoreActivity.a aVar2 = TellUsMoreActivity.f30729i;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(tellUsMoreActivity, eVar.f176402a, eVar.f176403b);
                            break;
                        } else if (iVar instanceof v92.i.b) {
                            d1.u(d1.f200951a, tellUsMoreActivity, (v92.i.b) iVar);
                            break;
                        } else if (iVar instanceof v92.i.a) {
                            tellUsMoreActivity.finish();
                            break;
                        } else if (iVar instanceof v92.i.c) {
                            tellUsMoreActivity.da();
                            break;
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f30734h = new z0(this) { // from class: hv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TellUsMoreActivity f85774b;

            {
                this.f85774b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                TellUsMoreActivity tellUsMoreActivity = this.f85774b;
                switch (i16) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        TellUsMoreActivity.a aVar = TellUsMoreActivity.f30729i;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            tellUsMoreActivity.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            tellUsMoreActivity.hideProgressOverlay();
                        } else if (kVar instanceof v92.k.b) {
                            tellUsMoreActivity.hideProgressOverlay();
                            tellUsMoreActivity.displayFailedMessage();
                            tellUsMoreActivity.da();
                        } else if (!(kVar instanceof v92.k.a)) {
                            u0.r();
                        } else {
                            ((z10.j) tellUsMoreActivity.f30731e.getValue()).x4(x.DI_CONNECT_UPLOAD);
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        TellUsMoreActivity.a aVar2 = TellUsMoreActivity.f30729i;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(tellUsMoreActivity, eVar.f176402a, eVar.f176403b);
                            break;
                        } else if (iVar instanceof v92.i.b) {
                            d1.u(d1.f200951a, tellUsMoreActivity, (v92.i.b) iVar);
                            break;
                        } else if (iVar instanceof v92.i.a) {
                            tellUsMoreActivity.finish();
                            break;
                        } else if (iVar instanceof v92.i.c) {
                            tellUsMoreActivity.da();
                            break;
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // zb0.r1.c
    public final void U0(l lVar) {
        lVar.getClass();
        Intent intent = new Intent(this, (Class<?>) BLEScanningActivity.class);
        intent.putExtra("extra_device_dto", lVar);
        startActivityForResult(intent, 2);
    }

    public final void da() {
        hideProgressOverlay();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        l lVar = this.f30732f;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("arg.device.dto", lVar);
        r1 r1Var = new r1();
        r1Var.setArguments(bundle);
        aVar.l(R.id.content_frame, r1Var, null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.BIC;
        String strG = am.j.g(i14, i15, "onActivityResult: requestCode[", "], resultCode[", "].");
        aVar.getClass();
        i2.a.b(a2Var, "TellUsMoreActivity", strG);
        if (i14 == 2) {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l lVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_parallax_content_frame);
        initActionBar(getString(R.string.pref_garmin_tou), 2);
        setTitleTextColor(R.color.gcm_text_primary);
        if (d1.f()) {
            d1.o(this, new h1(this, 16));
        }
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("extra_device_dto", l.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("extra_device_dto");
                if (!(parcelable2 instanceof l)) {
                    parcelable2 = null;
                }
                parcelable = (l) parcelable2;
            }
            lVar = (l) parcelable;
        } else {
            lVar = null;
        }
        this.f30732f = lVar;
        showProgressOverlay();
        ge1.b.T(f0.w(this), null, null, new hv.n(this, null), 3);
        o oVar = (o) this.f30730d.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(oVar), null, null, new p(y0Var, null), 3);
        y0Var.f(this, new b(new hv.l(this, 0)));
    }

    @Override // zb0.r1.c
    public final void p3() {
        displayFailedMessage();
        finish();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/TellUsMoreActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_SETUP", "I", "EXTRA_DEVICE_DTO", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
