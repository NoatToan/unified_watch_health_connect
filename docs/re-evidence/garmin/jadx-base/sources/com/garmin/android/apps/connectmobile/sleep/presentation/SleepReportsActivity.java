package com.garmin.android.apps.connectmobile.sleep.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import e23.l;
import g22.k;
import lc.v;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r1.o;
import r1.p;
import r1.u1;
import r1.w1;
import r53.p2;
import sm1.a0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/SleepReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "showManagePrimaryDeviceInHelp", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SleepReportsActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44239b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44240a = m.a(n.NONE, new j(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f44241a = new b();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f44242a = new c();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f44243a = new d();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f44244a = new e();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f44245a = new f();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f44246a = new g();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f44247a = new h();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f44248a = new i();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44252d;

        public j(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44249a = gVar;
            this.f44250b = qualifier;
            this.f44251c = aVar;
            this.f44252d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, sm1.s] */
        @Override // e23.a
        public final s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f44249a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f44251c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f44250b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44252d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final s da() {
        return (s) this.f44240a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        o82.g gVar;
        DateTime dateTime;
        rl1.i iVar;
        boolean z14;
        s sVar;
        Object value;
        Object value2;
        Object value3;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_SLEEP_NAVIGATION_DATA_TYPE", en1.c.class) : null;
        } else {
            Object serializableExtra3 = intent != null ? intent.getSerializableExtra("EXTRA_SLEEP_NAVIGATION_DATA_TYPE") : null;
            if (!(serializableExtra3 instanceof en1.c)) {
                serializableExtra3 = null;
            }
            serializableExtra = (en1.c) serializableExtra3;
        }
        en1.c cVar = (en1.c) serializableExtra;
        if (cVar == null) {
            cVar = en1.c.SCORE;
        }
        da().D4(cVar);
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("EXTRA_SLEEP_NAVIGATION_OVERLAY_TYPE", rl1.i.class) : null;
        } else {
            Object serializableExtra4 = intent2 != null ? intent2.getSerializableExtra("EXTRA_SLEEP_NAVIGATION_OVERLAY_TYPE") : null;
            if (!(serializableExtra4 instanceof rl1.i)) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (rl1.i) serializableExtra4;
        }
        rl1.i iVar2 = (rl1.i) serializableExtra2;
        da().B4(iVar2 == null ? ((pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null)).c().a() : iVar2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (i14 >= 33) {
                serializable2 = extras.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
            } else {
                Object serializable3 = extras.getSerializable("EXTRA_SELECTED_INTERVAL_TYPE");
                if (!(serializable3 instanceof o82.g)) {
                    serializable3 = null;
                }
                serializable2 = (o82.g) serializable3;
            }
            gVar = (o82.g) serializable2;
        } else {
            gVar = null;
        }
        Bundle extras2 = getIntent().getExtras();
        boolean z15 = false;
        Boolean boolValueOf = extras2 != null ? Boolean.valueOf(extras2.getBoolean("resetBreathingDisruptionsEducation", false)) : null;
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            if (i14 >= 33) {
                serializable = extras3.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Object serializable4 = extras3.getSerializable("EXTRA_INITIAL_DATE");
                if (!(serializable4 instanceof DateTime)) {
                    serializable4 = null;
                }
                serializable = (DateTime) serializable4;
            }
            dateTime = (DateTime) serializable;
        } else {
            dateTime = null;
        }
        Bundle extras4 = getIntent().getExtras();
        String string = extras4 != null ? extras4.getString("EXTRA_SCROLL_TO_SECTION") : null;
        s sVarDa = da();
        com.garmin.android.apps.connectmobile.sleep.presentation.c.f44276b.getClass();
        com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2 = com.garmin.android.apps.connectmobile.sleep.presentation.c.SLEEP_NEED;
        com.garmin.android.apps.connectmobile.sleep.presentation.c cVar3 = p005kotlin.jvm.internal.s.g(string, cVar2.f44279a) ? cVar2 : null;
        p2 p2Var = sVarDa.f160187g;
        if (gVar != null) {
            while (true) {
                Object value4 = p2Var.getValue();
                z14 = z15;
                iVar = iVar2;
                sVar = sVarDa;
                if (p2Var.b(value4, a0.a((a0) value4, false, false, gVar, null, null, 0, null, false, false, false, false, false, null, false, null, null, 262139))) {
                    break;
                }
                sVarDa = sVar;
                z15 = z14;
                iVar2 = iVar;
            }
        } else {
            iVar = iVar2;
            z14 = false;
            sVar = sVarDa;
        }
        if (dateTime != null) {
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, a0.a((a0) value3, false, false, null, k.z(dateTime).b(), null, 0, null, false, false, false, false, false, null, false, null, null, 262135)));
        }
        sVar.y4(iVar != null ? true : z14);
        if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.TRUE)) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, a0.a((a0) value2, false, false, null, null, null, 0, null, false, false, true, false, false, null, false, null, null, 261631)));
        }
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, a0.a((a0) value, false, false, null, null, null, 0, null, false, false, false, false, false, null, false, null, cVar3, 131071)));
        initComposeScreen(new z3.e(304063639, true, new s5.a(this, 16)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/sleep/presentation/SleepReportsActivity$a;", "", "<init>", "()V", "", "EXTRA_SLEEP_NAVIGATION_DATA_TYPE", "Ljava/lang/String;", "EXTRA_SLEEP_NAVIGATION_OVERLAY_TYPE", "EXTRA_SCROLL_TO_SECTION", "MENU_ITEM_HELP", "MENU_ITEM_EDIT_SLEEP_TIMES", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, DateTime dateTime, en1.c cVar, boolean z14, rl1.i iVar, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2) {
            context.getClass();
            Intent intentZ = dh.b.z(SleepReportsActivity.class, context, dateTime, z14);
            if (cVar2 != null) {
                intentZ.putExtra("EXTRA_SCROLL_TO_SECTION", cVar2.f44279a);
            }
            intentZ.putExtra("EXTRA_SLEEP_NAVIGATION_DATA_TYPE", cVar);
            Intent intentPutExtra = intentZ.putExtra("EXTRA_SLEEP_NAVIGATION_OVERLAY_TYPE", iVar);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, DateTime dateTime, en1.c cVar, boolean z14, rl1.i iVar, com.garmin.android.apps.connectmobile.sleep.presentation.c cVar2, int i14) {
            if ((i14 & 2) != 0) {
                dateTime = null;
            }
            if ((i14 & 4) != 0) {
                cVar = null;
            }
            if ((i14 & 8) != 0) {
                z14 = false;
            }
            if ((i14 & 16) != 0) {
                iVar = null;
            }
            if ((i14 & 32) != 0) {
                cVar2 = null;
            }
            aVar.getClass();
            return a(context, dateTime, cVar, z14, iVar, cVar2);
        }

        private a() {
        }
    }
}
