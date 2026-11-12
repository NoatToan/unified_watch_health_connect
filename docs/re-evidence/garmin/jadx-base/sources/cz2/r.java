package cz2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import o53.b0;
import o53.l1;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 6, 0})
@v13.e(c = "com.garmin.util.coroutines.StillAliveMonitor$run$2", f = "StillAliveMonitor.kt", l = {77}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q<Object> f56968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q<Object> qVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f56968b = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f56968b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:28|14) */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:12:0x0024). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j8;
        l1 l1Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56967a;
        q<Object> qVar = this.f56968b;
        if (i14 == 0) {
            o13.r.b(obj);
            j8 = qVar.f56960b;
            this.f56967a = 1;
            if (m0.b(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o53.s sVar = qVar.f56963e;
        o53.s sVar2 = qVar.f56963e;
        long j14 = qVar.f56961c;
        AtomicLong atomicLong = qVar.f56964f;
        if (sVar.isActive()) {
            qVar.f56959a.invoke();
        }
        if (atomicLong.addAndGet(qVar.f56960b) < j14 || !sVar2.isActive()) {
            if (atomicLong.get() >= j14) {
                l1Var = qVar.f56965g.get();
                if (l1Var != null) {
                    l1Var.c(new CancellationException("Max polling duration exceeded"));
                }
                sVar2.O(new TimeoutException("Max polling duration exceeded"));
            }
            return Unit.INSTANCE;
        }
        j8 = qVar.f56960b;
        this.f56967a = 1;
        if (m0.b(j8, this) == aVar) {
            return aVar;
        }
        o53.s sVar3 = qVar.f56963e;
        o53.s sVar4 = qVar.f56963e;
        long j15 = qVar.f56961c;
        AtomicLong atomicLong2 = qVar.f56964f;
        if (sVar3.isActive()) {
            qVar.f56959a.invoke();
        }
        if (atomicLong2.addAndGet(qVar.f56960b) < j15) {
        }
        if (atomicLong2.get() >= j15) {
            l1Var = qVar.f56965g.get();
            if (l1Var != null) {
                l1Var.c(new CancellationException("Max polling duration exceeded"));
            }
            sVar4.O(new TimeoutException("Max polling duration exceeded"));
        }
        return Unit.INSTANCE;
    }
}
