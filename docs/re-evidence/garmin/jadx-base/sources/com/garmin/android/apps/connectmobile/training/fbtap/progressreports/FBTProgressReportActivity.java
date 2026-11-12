package com.garmin.android.apps.connectmobile.training.fbtap.progressreports;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import fg0.k;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/progressreports/FBTProgressReportActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "", "showTopBar", "Llc/v;", "currentBackStackEntry", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTProgressReportActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45512b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45513a = m.a(n.NONE, new d(this, null, null, null));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45514a;

        static {
            int[] iArr = new int[uv1.b.values().length];
            try {
                iArr[uv1.b.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f45514a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity$onCreate$1$1$1$1$1", f = "FBTProgressReportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tw1.m f45515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FBTProgressReportActivity f45516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uv1.c f45517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pi0.e f45518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f45519e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tw1.m mVar, FBTProgressReportActivity fBTProgressReportActivity, uv1.c cVar, pi0.e eVar, Long l14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f45515a = mVar;
            this.f45516b = fBTProgressReportActivity;
            this.f45517c = cVar;
            this.f45518d = eVar;
            this.f45519e = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f45515a, this.f45516b, this.f45517c, this.f45518d, this.f45519e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            pi0.e eVar = this.f45518d;
            uv1.c cVar = this.f45517c;
            FBTProgressReportActivity fBTProgressReportActivity = this.f45516b;
            tw1.m mVar = this.f45515a;
            if (mVar != null) {
                a aVar2 = FBTProgressReportActivity.f45512b;
                fBTProgressReportActivity.ca().L4(mVar, cVar, eVar);
            } else {
                Long l14 = this.f45519e;
                if (l14 != null) {
                    a aVar3 = FBTProgressReportActivity.f45512b;
                    qv1.b bVarCa = fBTProgressReportActivity.ca();
                    long jLongValue = l14.longValue();
                    bVarCa.getClass();
                    cVar.getClass();
                    eVar.getClass();
                    ge1.b.T(v1.a(bVarCa), null, null, new qv1.i(bVarCa, jLongValue, cVar, eVar, null), 3);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<qv1.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f45521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f45522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f45523d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f45520a = gVar;
            this.f45521b = qualifier;
            this.f45522c = aVar;
            this.f45523d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, qv1.b] */
        @Override // e23.a
        public final qv1.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f45520a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f45522c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qv1.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f45521b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f45523d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final qv1.b ca() {
        return (qv1.b) this.f45513a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        uv1.c cVar;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        Bundle extras = getIntent().getExtras();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = extras != null ? (Parcelable) extras.getParcelable("extras_plan_dto", tw1.m.class) : null;
        } else {
            Parcelable parcelable3 = extras != null ? extras.getParcelable("extras_plan_dto") : null;
            if (!(parcelable3 instanceof tw1.m)) {
                parcelable3 = null;
            }
            parcelable = (tw1.m) parcelable3;
        }
        tw1.m mVar = (tw1.m) parcelable;
        if (extras == null || (cVar = (uv1.c) h0.e0(extras.getInt("extras_event_or_open_loop"), uv1.c.f172938d)) == null) {
            cVar = uv1.c.OPEN_LOOP;
        }
        uv1.c cVar2 = cVar;
        qv1.b bVarCa = ca();
        if (i14 >= 33) {
            parcelable2 = extras != null ? (Parcelable) extras.getParcelable("GCM_extra_sharable_event_dto", k.class) : null;
        } else {
            Parcelable parcelable4 = extras != null ? extras.getParcelable("GCM_extra_sharable_event_dto") : null;
            if (!(parcelable4 instanceof k)) {
                parcelable4 = null;
            }
            parcelable2 = (k) parcelable4;
        }
        bVarCa.f147955x = (k) parcelable2;
        j.a(this, new z3.e(-949097659, true, new ob0.e(this, mVar, cVar2, new pi0.e(this), extras != null ? Long.valueOf(extras.getLong("extras_training_plan_id")) : null, 15)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/progressreports/FBTProgressReportActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_PLAN_DTO", "EXTRAS_EVENT_OR_OPEN_LOOP", "EXTRAS_TRAINING_PLAN_ID", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, long j8, boolean z14) {
            Intent intentD = sn.a.d(context, context, FBTProgressReportActivity.class);
            intentD.putExtra("extras_training_plan_id", j8);
            intentD.putExtra("extras_event_or_open_loop", (z14 ? uv1.c.EVENT : uv1.c.OPEN_LOOP).ordinal());
            context.startActivity(intentD);
        }

        private a() {
        }
    }
}
