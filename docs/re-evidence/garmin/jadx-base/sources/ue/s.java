package ue;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f170118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<Object>, Object> f170119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a<Object> f170120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(e23.p<? super o53.b0, ? super t13.d<Object>, ? extends Object> pVar, androidx.concurrent.futures.b.a<Object> aVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f170119c = pVar;
        this.f170120d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f170119c, this.f170120d, dVar);
        sVar.f170118b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170117a;
        androidx.concurrent.futures.b.a<Object> aVar2 = this.f170120d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f170118b;
                e23.p<o53.b0, t13.d<Object>, Object> pVar = this.f170119c;
                this.f170117a = 1;
                obj = pVar.invoke(b0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            aVar2.b(obj);
        } catch (CancellationException unused) {
            aVar2.c();
        } catch (Throwable th3) {
            aVar2.d(th3);
        }
        return Unit.INSTANCE;
    }
}
