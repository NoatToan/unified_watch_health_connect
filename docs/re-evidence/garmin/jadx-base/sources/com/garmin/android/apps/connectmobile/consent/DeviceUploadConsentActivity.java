package com.garmin.android.apps.connectmobile.consent;

import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.q1;
import p92.o;
import p92.x;
import v92.c0;
import v92.i0;
import v92.r;
import z10.b2;
import z10.c2;
import z10.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DeviceUploadConsentActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceUploadConsentActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32201b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32202a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32206d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32203a = gVar;
            this.f32204b = qualifier;
            this.f32205c = aVar;
            this.f32206d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32203a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f32205c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), f189591b, null, defaultViewModelCreationExtras, this.f32204b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32206d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.golf_lbl_device_upload);
        ge1.b.T(f0.w(this), null, null, new c2(this, null), 3);
        b2 b2Var = new b2(this, 0);
        b2 b2Var2 = new b2(this, 1);
        o oVar = o.f136619a;
        boolean zB = s3.b();
        oVar.getClass();
        r rVar = (r) new x1(this, new c0(null, null, null, 7, null)).b(s0.f105811a.b(r.class));
        w0 w0Var = rVar.f176476k;
        rVar.f176470e = zB;
        w0 w0Var2 = rVar.f176475j;
        w0Var2.l(this);
        w0Var2.f(this, new x.a(new q1(b2Var, 11)));
        w0Var.l(this);
        w0Var.f(this, new x.a(new p92.c(b2Var2, 0)));
        i0.f176404b.getClass();
        i0 i0Var = new i0();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content_frame, i0Var, null);
        aVar.e();
        Unit unit = Unit.INSTANCE;
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildConsent_deviceSync");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/DeviceUploadConsentActivity$a;", "", "<init>", "()V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
