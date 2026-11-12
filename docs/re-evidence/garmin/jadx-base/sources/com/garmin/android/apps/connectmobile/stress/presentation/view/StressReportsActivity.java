package com.garmin.android.apps.connectmobile.stress.presentation.view;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import e23.l;
import g22.k;
import java.io.Serializable;
import o13.h;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import vr1.i;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/stress/presentation/view/StressReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "Lqr1/c;", "uiState", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StressReportsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45013d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45014a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f45015b = new w1(s0.f105811a.b(yb0.a.class), new c(this), new vd1.c(16), new d(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nr1.a f45016c = (nr1.a) KoinJavaComponent.get$default(nr1.a.class, null, null, 6, null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45017a;

        public a(l lVar) {
            lVar.getClass();
            this.f45017a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45017a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45017a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<qr1.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f45019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f45020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f45021d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f45018a = gVar;
            this.f45019b = qualifier;
            this.f45020c = aVar;
            this.f45021d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, qr1.d] */
        @Override // e23.a
        public final qr1.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f45018a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f45020c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qr1.d.class), f189591b, null, defaultViewModelCreationExtras, this.f45019b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f45021d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45022a;

        public c(g gVar) {
            this.f45022a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45022a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45024b;

        public d(e23.a aVar, g gVar) {
            this.f45023a = aVar;
            this.f45024b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45023a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45024b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        Object value;
        Object value2;
        Serializable serializable;
        Object serializable2;
        super.onCreate(bundle);
        ((yb0.a) this.f45015b.getValue()).f195678a.f(this, new a(new vr1.h(this, 0)));
        Bundle extras = getIntent().getExtras();
        Serializable serializable3 = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable4 = extras.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable2 = (DateTime) serializable4;
            }
            dateTime = (DateTime) serializable2;
        } else {
            dateTime = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
            } else {
                Serializable serializable5 = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                serializable = (o82.g) (serializable5 instanceof o82.g ? serializable5 : null);
            }
            serializable3 = (o82.g) serializable;
        }
        o82.g gVar = serializable3;
        p2 p2Var = ((qr1.d) this.f45014a.getValue()).f146911g;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, qr1.c.a((qr1.c) value2, k.z(dateTime).b(), null, false, false, false, false, 0, false, 254)));
        }
        if (gVar != 0) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, gVar, false, false, false, gVar == o82.g.f130850c, 0, false, 221)));
        }
        initComposeScreen(new e(-1541510009, true, new i(this, 0)));
    }
}
