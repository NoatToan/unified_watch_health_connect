package et1;

import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailDetailsScreenKt$TrailDetailsScreen$3$1$3$6$1", f = "TrailDetailsScreen.kt", l = {475, 479}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pt1.o f65691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f65692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m4.q f65693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f65694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.p1<pt1.n> f65695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(pt1.o oVar, mc mcVar, m4.q qVar, e23.a<Unit> aVar, p3.p1<pt1.n> p1Var, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f65691b = oVar;
        this.f65692c = mcVar;
        this.f65693d = qVar;
        this.f65694e = aVar;
        this.f65695f = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f65691b, this.f65692c, this.f65693d, this.f65694e, this.f65695f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r1.d(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1.g(r5) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f65690a;
        pt1.o oVar = this.f65691b;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zG = p005kotlin.jvm.internal.s.g(oVar.f140922t, pt1.n.b.f140894a);
            mc mcVar = this.f65692c;
            if (zG) {
                this.f65690a = 1;
            } else {
                this.f65690a = 2;
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            this.f65693d.y(true);
            this.f65694e.invoke();
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f65695f.setValue(oVar.f140922t);
        return Unit.INSTANCE;
    }
}
