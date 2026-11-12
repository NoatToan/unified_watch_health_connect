package androidx.work;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroidx/work/d$a;", "<anonymous>", "(Lo53/b0;)Landroidx/work/d$a;"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
public final class b extends i implements p<b0, t13.d<? super d.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f11463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CoroutineWorker coroutineWorker, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f11463b = coroutineWorker;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f11463b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super d.a> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11462a;
        if (i14 == 0) {
            r.b(obj);
            this.f11462a = 1;
            Object objC = this.f11463b.c(this);
            return objC == aVar ? aVar : objC;
        }
        if (i14 == 1) {
            r.b(obj);
            return obj;
        }
        h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
