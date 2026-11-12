package of;

import dg.t;
import e23.p;
import java.util.LinkedHashMap;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wf.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwf/p;", "<anonymous>", "(Lo53/b0;)Lwf/p;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super wf.p>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f131637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wf.f f131638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f131639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f131640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hf.e f131641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf.b.C2864b f131642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j.a f131643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, wf.f fVar, Object obj, m mVar, hf.e eVar, rf.b.C2864b c2864b, j.a aVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f131637b = aVar;
        this.f131638c = fVar;
        this.f131639d = obj;
        this.f131640e = mVar;
        this.f131641f = eVar;
        this.f131642g = c2864b;
        this.f131643h = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f131637b, this.f131638c, this.f131639d, this.f131640e, this.f131641f, this.f131642g, this.f131643h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wf.p> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        boolean z14;
        rf.b bVarD;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131636a;
        if (i14 == 0) {
            r.b(obj);
            this.f131636a = 1;
            objC = a.c(this.f131637b, this.f131638c, this.f131639d, this.f131640e, this.f131641f, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objC = obj;
        }
        a.b bVar = (a.b) objC;
        a aVar2 = this.f131637b;
        aVar2.f131586b.a();
        rf.c cVar = aVar2.f131588d;
        cVar.getClass();
        rf.b.C2864b c2864b = this.f131642g;
        if (c2864b == null || !this.f131638c.f184915n.f184898b || !bVar.f131589a.getF83554b() || (bVarD = cVar.f152369a.d()) == null) {
            z14 = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.f131590b));
            String str = bVar.f131592d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            bVarD.f(c2864b, new rf.b.c(bVar.f131589a, linkedHashMap));
            z14 = true;
        }
        hf.h hVar = bVar.f131589a;
        lf.e eVar = bVar.f131591c;
        rf.b.C2864b c2864b2 = z14 ? c2864b : null;
        String str2 = bVar.f131592d;
        boolean z15 = bVar.f131590b;
        t.a aVar3 = t.f59501a;
        j.a aVar4 = this.f131643h;
        return new wf.p(hVar, this.f131638c, eVar, c2864b2, str2, z15, (aVar4 instanceof l) && ((l) aVar4).f131664g);
    }
}
