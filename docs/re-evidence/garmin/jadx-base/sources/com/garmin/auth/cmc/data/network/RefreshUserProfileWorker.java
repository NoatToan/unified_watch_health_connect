package com.garmin.auth.cmc.data.network;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/auth/cmc/data/network/RefreshUserProfileWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RefreshUserProfileWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f50706g = new a(null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "com.garmin.auth.cmc.data.network.RefreshUserProfileWorker", f = "RefreshUserProfileWorker.kt", l = {43}, m = "doWork")
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50707a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50709c;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f50707a = obj;
            this.f50709c |= Integer.MIN_VALUE;
            return RefreshUserProfileWorker.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.auth.cmc.data.network.RefreshUserProfileWorker$doWork$2", f = "RefreshUserProfileWorker.kt", l = {45}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, d<? super androidx.work.d.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50710a;

        public c(d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super androidx.work.d.a> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f50710a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    re2.b bVar = re2.b.f152215a;
                    this.f50710a = 1;
                    bVar.getClass();
                    if (re2.b.B(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return new androidx.work.d.a.c();
            } catch (Throwable th3) {
                xi2.a.f191145a.getClass();
                ((zy2.b) xi2.a.a("RefreshUserProfileWorker")).error("", th3);
                return new androidx.work.d.a.C0165a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshUserProfileWorker(Context context, WorkerParameters workerParameters) {
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
            int i14 = bVar.f50709c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f50709c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f50707a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f50709c;
        if (i15 == 0) {
            r.b(objE);
            c cVar = new c(null);
            bVar.f50709c = 1;
            objE = c0.e(cVar, bVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE);
        }
        objE.getClass();
        return objE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/auth/cmc/data/network/RefreshUserProfileWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
