package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.jvm.kt", l = {}, m = "invokeSuspend")
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f196556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v<Object, Object> f196557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f196558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f196559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z14, v<Object, Object> vVar, boolean z15, boolean z16, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f196556a = z14;
        this.f196557b = vVar;
        this.f196558c = z15;
        this.f196559d = z16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f196556a, this.f196557b, this.f196558c, this.f196559d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = this.f196556a;
        v<Object, Object> vVar = this.f196557b;
        if (z14) {
            vVar.f196518k.b();
        }
        if (this.f196558c) {
            vVar.f196522o = true;
        }
        if (this.f196559d) {
            vVar.f196523p = true;
        }
        v.a aVar2 = v.f196516x;
        vVar.t(false);
        return Unit.INSTANCE;
    }
}
