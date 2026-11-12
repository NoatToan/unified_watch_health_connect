package com.garmin.android.apps.connectmobile.pregnancytracking;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import cq1.l;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import o53.j0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/PregnancyTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f40411g = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.PregnancyTrackingWorker", f = "PregnancyTrackingWorker.kt", l = {21}, m = "doWork", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f40412a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40414c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f40412a = obj;
            this.f40414c |= Integer.MIN_VALUE;
            return PregnancyTrackingWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.PregnancyTrackingWorker$doWork$2", f = "PregnancyTrackingWorker.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f40416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f40417c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.PregnancyTrackingWorker$doWork$2$result$1", f = "PregnancyTrackingWorker.kt", l = {22}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f40418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f40419b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, d<? super a> dVar) {
                super(2, dVar);
                this.f40419b = lVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new a(this.f40419b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f40418a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f40418a = 1;
                    if (this.f40419b.a(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar, d<? super c> dVar) {
            super(2, dVar);
            this.f40417c = lVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f40417c, dVar);
            cVar.f40416b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Object> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            b0 b0Var = (b0) this.f40416b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40415a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    j0 j0VarJ = ge1.b.j(b0Var, null, null, new a(this.f40417c, null), 3);
                    int i15 = q.f128596b;
                    this.f40416b = null;
                    this.f40415a = 1;
                    if (j0VarJ.C(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i16 = q.f128596b;
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
            return q.b(bVar) != null ? new androidx.work.d.a.C0165a() : q.a(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PregnancyTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f40414c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f40414c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f40412a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f40414c;
        if (i15 == 0) {
            r.b(obj);
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar2 = new c(lVar, null);
            bVar.f40414c = 1;
            if (ge1.b.e0(bVar2, cVar2, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return new androidx.work.d.a.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/PregnancyTrackingWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
