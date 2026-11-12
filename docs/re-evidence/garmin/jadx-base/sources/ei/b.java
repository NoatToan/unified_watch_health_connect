package ei;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/s0$a;", "D", "Lr53/j;", "Lvh/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1", f = "ApolloCacheInterceptor.kt", l = {194, 194, 196, 196}, m = "invokeSuspend")
public final class b extends v13.i implements e23.p<r53.j<? super vh.f<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f64083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f64084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f64085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f64086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ki.b f64087g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z14, a aVar, vh.e<Object> eVar, z zVar, ki.b bVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f64083c = z14;
        this.f64084d = aVar;
        this.f64085e = eVar;
        this.f64086f = zVar;
        this.f64087g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f64083c, this.f64084d, this.f64085e, this.f64086f, this.f64087g, dVar);
        bVar.f64082b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super vh.f<Object>> jVar, t13.d<? super Unit> dVar) {
        return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r53.s.v(r1, (r53.i) r11, r10) == r0) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64081a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        jVar = (r53.j) this.f64082b;
                        o13.r.b(obj);
                        this.f64082b = null;
                        this.f64081a = 4;
                    } else if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                o13.r.b(obj);
            } else {
                jVar = (r53.j) this.f64082b;
                o13.r.b(obj);
                this.f64082b = null;
                this.f64081a = 2;
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        jVar = (r53.j) this.f64082b;
        z zVar = this.f64086f;
        vh.e<Object> eVar = this.f64085e;
        boolean z14 = this.f64083c;
        a aVar2 = this.f64084d;
        if (z14) {
            this.f64082b = jVar;
            this.f64081a = 1;
            obj = a.b(aVar2, eVar, zVar, this);
            if (obj != aVar) {
                this.f64082b = null;
                this.f64081a = 2;
            }
        } else {
            this.f64082b = jVar;
            this.f64081a = 3;
            a.C1358a c1358a = a.f64079b;
            aVar2.getClass();
            int i15 = mi.a.f118679a;
            f fVar = new f(new m1(this.f64087g.a(eVar), new g(aVar2, eVar, zVar, null)), System.currentTimeMillis());
            if (fVar != aVar) {
                obj = fVar;
                this.f64082b = null;
                this.f64081a = 4;
            }
        }
        return aVar;
    }
}
