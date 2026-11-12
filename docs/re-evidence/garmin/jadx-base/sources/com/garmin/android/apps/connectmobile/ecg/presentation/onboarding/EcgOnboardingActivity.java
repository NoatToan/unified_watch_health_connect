package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import lc.m0;
import mh1.x;
import nf0.o;
import nf0.q;
import nf0.y;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/EcgOnboardingActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgOnboardingActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34765b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f34766a = new w1(s0.f105811a.b(o.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34767a;

        public b(l lVar) {
            lVar.getClass();
            this.f34767a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34767a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34767a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34768a;

        public c(g gVar) {
            this.f34768a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34768a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34769a;

        public d(g gVar) {
            this.f34769a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34769a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f34771b;

        public e(e23.a aVar, g gVar) {
            this.f34770a = aVar;
            this.f34771b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34770a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34771b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // b.g, androidx.lifecycle.y
    public final x1.c getDefaultViewModelProviderFactory() {
        Bundle extras = getIntent().getExtras();
        return new y(extras != null ? extras.getLong("DEVICE_UNIT_ID") : 0L);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ecg_onboarding_activity);
        initActionBar(true, getString(R.string.lbl_ecg_app_setup));
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        m0 m0VarU6 = ((NavHostFragment) fragmentF).u6();
        m0VarU6.a(new nf0.c(0, m0VarU6, this));
        w1 w1Var = this.f34766a;
        ((o) w1Var.getValue()).f125828j.f(this, new b(new x(this, 26)));
        o oVar = (o) w1Var.getValue();
        ge1.b.T(v1.a(oVar), null, null, new q(oVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        getWindow().addFlags(128);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/EcgOnboardingActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DEVICE_UNIT_ID", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
