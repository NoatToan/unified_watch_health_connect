package hf;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwf/i;", "<anonymous>", "(Lo53/b0;)Lwf/i;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", l = {142}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<b0, t13.d<? super wf.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf.f f83609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f83610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xf.g f83611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f83612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f83613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wf.f fVar, n nVar, xf.g gVar, e eVar, h hVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f83609b = fVar;
        this.f83610c = nVar;
        this.f83611d = gVar;
        this.f83612e = eVar;
        this.f83613f = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f83609b, this.f83610c, this.f83611d, this.f83612e, this.f83613f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wf.i> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83608a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<of.j> list = this.f83610c.f83581d.f83541a;
        boolean z14 = this.f83613f != null;
        wf.f fVar = this.f83609b;
        of.l lVar = new of.l(fVar, list, 0, fVar, this.f83611d, this.f83612e, z14);
        this.f83608a = 1;
        Object objA = lVar.a(this);
        return objA == aVar ? aVar : objA;
    }
}
