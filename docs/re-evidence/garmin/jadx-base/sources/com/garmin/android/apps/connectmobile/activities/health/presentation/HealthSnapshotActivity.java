package com.garmin.android.apps.connectmobile.activities.health.presentation;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import tn.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/HealthSnapshotActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HealthSnapshotActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29015d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f29016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f29017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29018c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29019a;

        public b(b.g gVar) {
            this.f29019a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29019a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29020a;

        public c(b.g gVar) {
            this.f29020a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29020a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f29022b;

        public d(e23.a aVar, b.g gVar) {
            this.f29021a = aVar;
            this.f29022b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29021a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29022b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29023a;

        public e(b.g gVar) {
            this.f29023a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f29023a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f29024a;

        public f(b.g gVar) {
            this.f29024a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f29024a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f29025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f29026b;

        public g(e23.a aVar, b.g gVar) {
            this.f29025a = aVar;
            this.f29026b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f29025a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f29026b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public HealthSnapshotActivity() {
        b bVar = new b(this);
        t0 t0Var = s0.f105811a;
        this.f29016a = new w1(t0Var.b(com.garmin.android.apps.connectmobile.activities.health.presentation.e.class), new c(this), bVar, new d(null, this));
        this.f29017b = new w1(t0Var.b(v.class), new f(this), new e(this), new g(null, this));
    }

    public static Unit da(HealthSnapshotActivity healthSnapshotActivity) {
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    public final com.garmin.android.apps.connectmobile.activities.health.presentation.e ea() {
        return (com.garmin.android.apps.connectmobile.activities.health.presentation.e) this.f29016a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelable = null;
        ((qn.b) KoinJavaComponent.get$default(qn.b.class, null, null, 6, null)).a(this);
        Bundle extras = getIntent().getExtras();
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = extras != null ? extras.getParcelable("ACTIVITY_EXTRA") : null;
            parcelable = (sn.h) (parcelable2 instanceof sn.h ? parcelable2 : null);
        } else if (extras != null) {
            parcelable = (Parcelable) extras.getParcelable("ACTIVITY_EXTRA", sn.h.class);
        }
        sn.h hVar = (sn.h) parcelable;
        if (hVar != null) {
            ea().A4(new com.garmin.android.apps.connectmobile.activities.health.presentation.b.c(hVar));
        } else {
            ((v) this.f29017b.getValue()).A4(com.garmin.android.apps.connectmobile.activities.health.presentation.d.a.f29057a);
        }
        boolean z14 = hVar != null;
        this.f29018c = z14;
        initComposeScreen(new z3.e(-651695683, true, new tn.e(z14 ? "details" : "list", this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/HealthSnapshotActivity$a;", "", "<init>", "()V", "", "ACTIVITY_EXTRA", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
