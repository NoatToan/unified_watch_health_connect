package po2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder$build$1", f = "TransitCardOperationFlowBuilder.kt", l = {173, 175}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<q53.t<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f139293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f139294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f139296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to2.a f139298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f139299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wo2.a f139300h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k0<Object> k0Var, to2.a aVar, String str, wo2.a aVar2, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f139297e = k0Var;
        this.f139298f = aVar;
        this.f139299g = str;
        this.f139300h = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f139297e, this.f139298f, this.f139299g, this.f139300h, dVar);
        m0Var.f139296d = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<Object> tVar, t13.d<? super Unit> dVar) {
        return ((m0) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (q53.r.a(r7, r1, r10) == r0) goto L22;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        o0 o0Var;
        q53.t<? super R> tVar = (q53.t) this.f139296d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139295c;
        k0<Object> k0Var = this.f139297e;
        if (i14 != 0) {
            if (i14 == 1) {
                o0Var = this.f139294b;
                p0 p0Var2 = this.f139293a;
                o13.r.b(obj);
                p0Var = p0Var2;
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
        k0Var.f139261d = tVar;
        k0<Object>.b bVar = k0Var.f139263f;
        if (bVar != null) {
            bVar.f139268b.invoke(new l0(bVar.f139269c, bVar));
        }
        p0 p0Var3 = new p0(k0Var);
        Logger logger = k0.f139257k;
        logger.debug("registerForStreamEvents");
        this.f139298f.i(this.f139299g, p0Var3);
        o0 o0Var2 = new o0(k0Var);
        logger.debug("addApduCommandProcessedListener");
        wo2.a aVar2 = this.f139300h;
        aVar2.getClass();
        aVar2.f186461r.add(o0Var2);
        this.f139296d = tVar;
        this.f139293a = p0Var3;
        this.f139294b = o0Var2;
        this.f139295c = 1;
        if (k0Var.p(this) != aVar) {
            p0Var = p0Var3;
            o0Var = o0Var2;
        }
        return aVar;
        v0 v0Var = k0Var.f139264g;
        if (v0Var != null) {
            v0Var.a();
        }
        ck0.j jVar = new ck0.j((Object) this.f139300h, (Object) o0Var, (Object) this.f139298f, this.f139299g, (Object) p0Var, (Object) tVar, 11);
        this.f139296d = null;
        this.f139293a = null;
        this.f139294b = null;
        this.f139295c = 2;
    }
}
