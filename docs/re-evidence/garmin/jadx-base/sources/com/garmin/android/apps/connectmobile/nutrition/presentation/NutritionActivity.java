package com.garmin.android.apps.connectmobile.nutrition.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import b.u;
import b21.fb;
import b21.l4;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.apps.connectmobile.u2;
import e23.p;
import java.io.Serializable;
import lc.m0;
import lc.v;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.x3;
import r1.n;
import r1.o;
import r1.u1;
import r1.w1;
import z10.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/NutritionActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "Lx01/j;", "nutritionUIState", "", "showInstallMPFDialog", "showDataSourceChangedDialog", "Llc/v;", "currentEntry", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NutritionActivity extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39581f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f39582e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity$createUiWithIntent$1$1$1$1$1", f = "NutritionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x01.k f39583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f39584b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x01.k kVar, boolean z14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f39583a = kVar;
            this.f39584b = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f39583a, this.f39584b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f39583a.z4(this.f39584b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity$createUiWithIntent$1$1$1$2$1", f = "NutritionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (s3.b()) {
                ht.a.f85464a.getClass();
                ht.a.a(null, "PageViewChildNutrition");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity$createUiWithIntent$1$1$1$3$1$1$1$1$1", f = "NutritionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<x01.j> f39586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x3<x01.j> x3Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f39586b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return NutritionActivity.this.new d(this.f39586b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = NutritionActivity.f39581f;
            x3<x01.j> x3Var = this.f39586b;
            fb fbVar = x3Var.getF182175a().f188283b;
            l4 l4Var = x3Var.getF182175a().f188284c;
            NutritionActivity nutritionActivity = NutritionActivity.this;
            if (fbVar != null) {
                m0 m0Var = nutritionActivity.f39582e;
                if (m0Var == null) {
                    s.m("navHostController");
                    throw null;
                }
                m0Var.h(new x01.c(nutritionActivity, 2), fbVar);
            } else if (l4Var != null) {
                m0 m0Var2 = nutritionActivity.f39582e;
                if (m0Var2 == null) {
                    s.m("navHostController");
                    throw null;
                }
                m0Var2.h(new x01.c(nutritionActivity, 3), l4Var);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity$createUiWithIntent$1$1$1$3$1$1$1$2$1", f = "NutritionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f39587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NutritionActivity f39588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<x01.j> f39589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, NutritionActivity nutritionActivity, x3<x01.j> x3Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f39587a = context;
            this.f39588b = nutritionActivity;
            this.f39589c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f39587a, this.f39588b, this.f39589c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = NutritionActivity.f39581f;
            if (this.f39589c.getF182175a().f188285d) {
                Toast.makeText(this.f39587a, R.string.generic_error_message, 0).show();
                this.f39588b.getOnBackPressedDispatcher().d();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements e23.a<Unit> {
        public f(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements e23.a<Unit> {
        public g(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class h extends q implements e23.a<Unit> {
        public h(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f39590a = new i();

        @Override // e23.l
        public final u1 invoke(n<v> nVar) {
            n<v> nVar2 = nVar;
            nVar2.getClass();
            n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l<n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f39591a = new j();

        @Override // e23.l
        public final w1 invoke(n<v> nVar) {
            n<v> nVar2 = nVar;
            nVar2.getClass();
            n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l<n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f39592a = new k();

        @Override // e23.l
        public final u1 invoke(n<v> nVar) {
            n<v> nVar2 = nVar;
            nVar2.getClass();
            n.a.f149168b.getClass();
            return nVar2.e(n.a.f149169c, s1.l.d(500, 0, null, 6), o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.l<n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f39593a = new l();

        @Override // e23.l
        public final w1 invoke(n<v> nVar) {
            n<v> nVar2 = nVar;
            nVar2.getClass();
            n.a.f149168b.getClass();
            return nVar2.b(n.a.f149169c, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    public static boolean na(m0 m0Var) {
        Object bVar;
        try {
            int i14 = o13.q.f128596b;
            m0Var.c(s0.f105811a.b(l4.y0.class));
            bVar = Boolean.TRUE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof o13.q.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final void da() {
        if (ha()) {
            super.da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "NUTRITION";
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final boolean ga() {
        m0 m0Var = this.f39582e;
        if (m0Var == null) {
            s.m("navHostController");
            throw null;
        }
        if (m0Var.f() != null) {
            getOnBackPressedDispatcher().d();
            return true;
        }
        if (!getIntent().getBooleanExtra("FROM_SEARCH", false)) {
            return false;
        }
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final boolean la() {
        return true;
    }

    public final void ma() {
        Parcelable parcelable;
        Object serializableExtra;
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        Serializable serializableExtra2 = null;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_START_DESTINATION", l4.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_START_DESTINATION") : null;
            if (!(parcelableExtra instanceof l4)) {
                parcelableExtra = null;
            }
            parcelable = (l4) parcelableExtra;
        }
        l4 l4Var = (l4) parcelable;
        boolean booleanExtra = getIntent().getBooleanExtra("FROM_PAYWALL", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("FROM_SEARCH", false);
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra = intent2 != null ? intent2.getSerializableExtra("EXTRA_INITIAL_DATE", DateTime.class) : null;
        } else {
            Object serializableExtra3 = intent2 != null ? intent2.getSerializableExtra("EXTRA_INITIAL_DATE") : null;
            if (!(serializableExtra3 instanceof DateTime)) {
                serializableExtra3 = null;
            }
            serializableExtra = (DateTime) serializableExtra3;
        }
        DateTime dateTime = (DateTime) serializableExtra;
        Intent intent3 = getIntent();
        if (i14 < 33) {
            Serializable serializableExtra4 = intent3 != null ? intent3.getSerializableExtra("EXTRA_SELECTED_INTERVAL_TYPE") : null;
            serializableExtra2 = (o82.g) (serializableExtra4 instanceof o82.g ? serializableExtra4 : null);
        } else if (intent3 != null) {
            serializableExtra2 = intent3.getSerializableExtra("EXTRA_SELECTED_INTERVAL_TYPE", o82.g.class);
        }
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(415954438, true, new x01.d(this, l4Var, booleanExtra2, getIntent().getBooleanExtra("CHECK_FOR_MFP", false), booleanExtra, dateTime, (o82.g) serializableExtra2, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b.j.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        ca("NUTRITION");
        ma();
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        ma();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ca("NUTRITION");
        da();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/nutrition/presentation/NutritionActivity$a;", "", "<init>", "()V", "", "EXTRA_START_DESTINATION", "Ljava/lang/String;", "FROM_PAYWALL", "FROM_SEARCH", "CHECK_FOR_MFP", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, DateTime dateTime, o82.g gVar, l4 l4Var, boolean z14, boolean z15, int i14) {
            if ((i14 & 2) != 0) {
                dateTime = null;
            }
            if ((i14 & 4) != 0) {
                gVar = o82.g.f130850c;
            }
            if ((i14 & 8) != 0) {
                l4Var = null;
            }
            if ((i14 & 16) != 0) {
                z14 = false;
            }
            if ((i14 & 32) != 0) {
                z15 = false;
            }
            aVar.getClass();
            context.getClass();
            gVar.getClass();
            u2 u2Var = new u2();
            u2Var.f46492a = dateTime;
            u2Var.f46493b = gVar;
            Intent intentA = u2Var.a(context, NutritionActivity.class);
            intentA.putExtra("EXTRA_START_DESTINATION", l4Var);
            intentA.putExtra("FROM_PAYWALL", z14);
            intentA.putExtra("FROM_SEARCH", z15);
            return intentA;
        }

        private a() {
        }
    }
}
