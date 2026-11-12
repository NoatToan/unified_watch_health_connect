package com.garmin.android.livesessionview;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import au0.d0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import of2.c0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/livesessionview/LiveActivityActivity;", "Lb/g;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveActivityActivity extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50544d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50545a = m.a(n.NONE, new e(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50547c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.LiveActivityActivity$onCreate$1$2$1", f = "LiveActivityActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50548a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ LiveActivityActivity f50550a;

            public a(LiveActivityActivity liveActivityActivity) {
                this.f50550a = liveActivityActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                LiveActivityActivity liveActivityActivity = this.f50550a;
                Toast.makeText(liveActivityActivity, R.string.txt_error_occurred, 1).show();
                liveActivityActivity.finish();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.livesessionview.LiveActivityActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1010b implements r53.i<Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f50551a;

            /* JADX INFO: renamed from: com.garmin.android.livesessionview.LiveActivityActivity$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f50552a;

                /* JADX INFO: renamed from: com.garmin.android.livesessionview.LiveActivityActivity$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.livesessionview.LiveActivityActivity$onCreate$1$2$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "LiveActivityActivity.kt", l = {50}, m = "emit", v = 2)
                public static final class C1011a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f50553a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f50554b;

                    public C1011a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f50553a = obj;
                        this.f50554b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(j jVar) {
                    this.f50552a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1011a c1011a;
                    if (dVar instanceof C1011a) {
                        c1011a = (C1011a) dVar;
                        int i14 = c1011a.f50554b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1011a.f50554b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1011a = new C1011a(dVar);
                        }
                    } else {
                        c1011a = new C1011a(dVar);
                    }
                    Object obj2 = c1011a.f50553a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1011a.f50554b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (obj instanceof com.garmin.android.livesessionview.c.a) {
                            c1011a.f50554b = 1;
                            if (this.f50552a.emit(obj, c1011a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C1010b(r53.i iVar) {
                this.f50551a = iVar;
            }

            @Override // r53.i
            public final Object collect(j<? super Object> jVar, t13.d dVar) {
                Object objCollect = this.f50551a.collect(new a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LiveActivityActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50548a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = LiveActivityActivity.f50544d;
                LiveActivityActivity liveActivityActivity = LiveActivityActivity.this;
                C1010b c1010b = new C1010b(((com.garmin.android.livesessionview.a) liveActivityActivity.f50545a.getValue()).f50570d);
                a aVar3 = new a(liveActivityActivity);
                this.f50548a = 1;
                if (c1010b.collect(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<tg2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f50557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f50558c;

        public c(ComponentCallbacks componentCallbacks, Qualifier qualifier, e23.a aVar) {
            this.f50556a = componentCallbacks;
            this.f50557b = qualifier;
            this.f50558c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tg2.a] */
        @Override // e23.a
        public final tg2.a invoke() {
            return AndroidKoinScopeExtKt.getKoinScope(this.f50556a).get((k23.d<?>) s0.f105811a.b(tg2.a.class), this.f50557b, this.f50558c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<kg2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f50559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f50560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f50561c;

        public d(ComponentCallbacks componentCallbacks, Qualifier qualifier, e23.a aVar) {
            this.f50559a = componentCallbacks;
            this.f50560b = qualifier;
            this.f50561c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kg2.b] */
        @Override // e23.a
        public final kg2.b invoke() {
            return AndroidKoinScopeExtKt.getKoinScope(this.f50559a).get((k23.d<?>) s0.f105811a.b(kg2.b.class), this.f50560b, this.f50561c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.livesessionview.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f50562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f50563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f50564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f50565d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f50562a = gVar;
            this.f50563b = qualifier;
            this.f50564c = aVar;
            this.f50565d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.livesessionview.a] */
        @Override // e23.a
        public final com.garmin.android.livesessionview.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f50562a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f50564c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.livesessionview.a.class), viewModelStore, null, defaultViewModelCreationExtras, this.f50563b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f50565d, 4, null);
        }
    }

    public LiveActivityActivity() {
        n nVar = n.SYNCHRONIZED;
        this.f50546b = m.a(nVar, new c(this, null, null));
        this.f50547c = m.a(nVar, new d(this, null, null));
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, o13.l] */
    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        qf2.a aVar;
        super.onCreate(bundle);
        getWindow().addFlags(128);
        b.j.a(this);
        com.garmin.android.livesessionview.a aVar2 = (com.garmin.android.livesessionview.a) this.f50545a.getValue();
        Intent intent = getIntent();
        intent.getClass();
        ig2.a aVar3 = new ig2.a(intent);
        aVar2.getClass();
        if (s.g(aVar2.f50569c.getValue(), com.garmin.android.livesessionview.c.b.f50575a)) {
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityViewModel", "Session already created, skipping initialization");
        } else {
            c0 c0Var = aVar2.f50568b;
            d0 d0Var = c0Var.f131779h;
            if (d0Var != null) {
                aVar = d0Var.a();
            } else {
                aVar = new qf2.a(0, 0, 0, false, false, false, 63, null);
            }
            c0Var.f131780i = aVar;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityViewModel", "Session configuration updated");
            ge1.b.T(v1.a(aVar2), null, null, new com.garmin.android.livesessionview.b(aVar2, aVar3, null), 3);
        }
        c.j.a(this, new z3.e(460336921, true, new lf2.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/livesessionview/LiveActivityActivity$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context) {
            return sn.a.d(context, context, LiveActivityActivity.class);
        }

        public static Intent b(Context context, long j8, zf2.d dVar, zf2.i iVar, String str, boolean z14, boolean z15, boolean z16) {
            context.getClass();
            dVar.getClass();
            Intent intentA = a(context);
            ig2.e eVar = new ig2.e(new ig2.a(intentA));
            eVar.c();
            eVar.a(Long.valueOf(j8));
            ho0.g gVar = new ho0.g(dVar, 23);
            ig2.b bVar = eVar.f93439a;
            bVar.f(gVar);
            if (iVar instanceof zf2.i.c) {
                final Integer numValueOf = Integer.valueOf(((zf2.i.c) iVar).f204654a);
                final int i14 = 3;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        Integer num = numValueOf;
                        Intent intent = (Intent) obj;
                        switch (i15) {
                            case 0:
                                int i16 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num);
                                break;
                            case 1:
                                int i17 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num);
                                break;
                            case 2:
                                int i18 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num);
                                break;
                            default:
                                int i19 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            } else if (iVar instanceof zf2.i.b) {
                final Integer numValueOf2 = Integer.valueOf(((zf2.i.b) iVar).f204653a);
                final int i15 = 2;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        Integer num = numValueOf2;
                        Intent intent = (Intent) obj;
                        switch (i16) {
                            case 0:
                                int i17 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num);
                                break;
                            case 1:
                                int i18 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num);
                                break;
                            case 2:
                                int i19 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num);
                                break;
                            default:
                                int i110 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            } else if (iVar instanceof zf2.i.a) {
                zf2.i.a aVar = (zf2.i.a) iVar;
                final Integer numValueOf3 = Integer.valueOf(aVar.f204651a);
                final int i16 = 0;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        Integer num = numValueOf3;
                        Intent intent = (Intent) obj;
                        switch (i17) {
                            case 0:
                                int i18 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num);
                                break;
                            case 1:
                                int i19 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num);
                                break;
                            case 2:
                                int i110 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num);
                                break;
                            default:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final Integer numValueOf4 = Integer.valueOf(aVar.f204652b);
                final int i17 = 1;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        Integer num = numValueOf4;
                        Intent intent = (Intent) obj;
                        switch (i18) {
                            case 0:
                                int i19 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num);
                                break;
                            case 1:
                                int i110 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num);
                                break;
                            case 2:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num);
                                break;
                            default:
                                int i112 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            } else {
                if (iVar != null) {
                    u0.r();
                    return null;
                }
                final int i18 = 3;
                final Integer num = null;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        Integer num2 = num;
                        Intent intent = (Intent) obj;
                        switch (i19) {
                            case 0:
                                int i110 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num2);
                                break;
                            case 1:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num2);
                                break;
                            case 2:
                                int i112 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num2);
                                break;
                            default:
                                int i113 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i19 = 2;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i19;
                        Integer num2 = num;
                        Intent intent = (Intent) obj;
                        switch (i110) {
                            case 0:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num2);
                                break;
                            case 1:
                                int i112 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num2);
                                break;
                            case 2:
                                int i113 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num2);
                                break;
                            default:
                                int i114 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i24 = 0;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i24;
                        Integer num2 = num;
                        Intent intent = (Intent) obj;
                        switch (i110) {
                            case 0:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num2);
                                break;
                            case 1:
                                int i112 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num2);
                                break;
                            case 2:
                                int i113 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num2);
                                break;
                            default:
                                int i114 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i25 = 1;
                bVar.f(new l() { // from class: ig2.c
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i25;
                        Integer num2 = num;
                        Intent intent = (Intent) obj;
                        switch (i110) {
                            case 0:
                                int i111 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_timestamp", num2);
                                break;
                            case 1:
                                int i112 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_adaptive_coach_workout_index", num2);
                                break;
                            case 2:
                                int i113 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_rec_index", num2);
                                break;
                            default:
                                int i114 = e.f93438b;
                                intent.getClass();
                                intent.putExtra("extra_workout_id", num2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            bVar.f(new i11.g(str, 20));
            bVar.f(new a81.j(z14, 15));
            bVar.f(new a81.j(z15, 13));
            bVar.f(new a81.j(z16, 14));
            eVar.e();
            return intentA;
        }

        private a() {
        }
    }
}
