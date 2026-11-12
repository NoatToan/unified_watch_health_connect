package com.garmin.android.apps.connectmobile.calories.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import bv.b;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.k1;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import sy.k;
import sy.l;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calories/presentation/CaloriesReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CaloriesReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31240b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31241a = m.a(n.NONE, new a(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f31242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f31243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f31244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f31245d;

        public a(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f31242a = gVar;
            this.f31243b = qualifier;
            this.f31244c = aVar;
            this.f31245d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, sy.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f31242a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f31244c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f31243b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f31245d, 4, null);
        }
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
        Object value3;
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
        p2 p2Var = ((k) this.f31241a.getValue()).f161185f;
        if (dateTime != null) {
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, l.a((l) value3, dateTime, null, false, 6)));
        }
        if (gVar != null) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, l.a((l) value2, null, gVar, false, 5)));
        }
        b.f21239a.getClass();
        b.a();
        boolean zW0 = k1.f37122a.w0();
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, l.a((l) value, null, null, zW0, 3)));
        initComposeScreen(new e(783582552, true, new s5.a(this, 18)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ht.a.f85464a.getClass();
        ht.a.a(null, "PageViewHealthCaloriesSummary");
    }
}
