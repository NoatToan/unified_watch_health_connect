package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {646, 233}, m = "invokeSuspend")
public final class c2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2.a f195797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f195798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1 f195799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f195801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(s1<Object, Object> s1Var, t13.d<? super c2> dVar) {
        super(2, dVar);
        this.f195801e = s1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c2(this.f195801e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (yc.s1.a(r1, r4, r3, r7) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s1<Object, Object> s1Var;
        e2.a<Object, Object> aVar;
        z53.b bVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195800d;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    s1Var = this.f195799c;
                    bVar = this.f195798b;
                    aVar = this.f195797a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            s1Var = this.f195801e;
            aVar = s1Var.f196413k;
            z53.b bVar2 = aVar.f195892a;
            this.f195797a = aVar;
            this.f195798b = bVar2;
            this.f195799c = s1Var;
            this.f195800d = 1;
            if (bVar2.c(this) != aVar2) {
                bVar = bVar2;
            }
            return aVar2;
            e2<Object, Object> e2Var = aVar.f195893b;
            r53.v vVar = new r53.v(new g2(e2Var, null), r53.s.p(e2Var.f195888i));
            bVar.e(null);
            c1 c1Var = c1.PREPEND;
            this.f195797a = null;
            this.f195798b = null;
            this.f195799c = null;
            this.f195800d = 2;
        } catch (Throwable th3) {
            bVar.e(null);
            throw th3;
        }
    }
}
