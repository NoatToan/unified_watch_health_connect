package bl2;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer$start$newJob$1", f = "AbstractActiveTransfer.kt", l = {178, 180, 181}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f18665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f18667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f18668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, b bVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, e23.a<Unit> aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f18665b = lVar;
        this.f18666c = bVar;
        this.f18667d = lVar2;
        this.f18668e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f18665b, this.f18666c, this.f18667d, this.f18668e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6.invoke(r5) == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18664a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                this.f18664a = 1;
                if (this.f18665b.invoke(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                e23.l<t13.d<? super Unit>, Object> lVar = this.f18667d;
                this.f18664a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            b bVar = this.f18666c;
            this.f18664a = 2;
            if (b.a(bVar, this) != aVar) {
                e23.l<t13.d<? super Unit>, Object> lVar2 = this.f18667d;
                this.f18664a = 3;
            }
            return aVar;
        } catch (CancellationException unused) {
            this.f18668e.invoke();
        }
    }
}
