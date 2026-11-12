package com.garmin.android.apps.connectmobile.pulseox.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import g22.k;
import ic1.c;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pulseox/presentation/PulseOxActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PulseOxActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41055b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41056a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<ic1.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41060d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41057a = gVar;
            this.f41058b = qualifier;
            this.f41059c = aVar;
            this.f41060d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ic1.m] */
        @Override // e23.a
        public final ic1.m invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41057a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f41059c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(ic1.m.class), viewModelStore, null, defaultViewModelCreationExtras, this.f41058b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41060d, 4, null);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        o82.g gVar;
        Object value;
        Object value2;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable3 = extras.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable3 instanceof DateTime)) {
                    serializable3 = null;
                }
                serializable2 = (DateTime) serializable3;
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
                Object serializable4 = extras2.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                if (!(serializable4 instanceof o82.g)) {
                    serializable4 = null;
                }
                serializable = (o82.g) serializable4;
            }
            gVar = (o82.g) serializable;
        } else {
            gVar = null;
        }
        p2 p2Var = ((ic1.m) this.f41056a.getValue()).f92630b;
        if (dateTime != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, ic1.n.a((ic1.n) value2, k.z(dateTime).b(), null, false, 6)));
        }
        if (gVar != null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ic1.n.a((ic1.n) value, null, gVar, false, 5)));
        }
        initComposeScreen(new e(-1320809568, true, new c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pulseox/presentation/PulseOxActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP_PULSE_OX", "Ljava/lang/String;", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
