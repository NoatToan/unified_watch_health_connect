package ei;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.l0;
import vh.g0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvh/n0$a;", "D", "", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$maybeWriteToCache$2", f = "ApolloCacheInterceptor.kt", l = {79, 83}, m = "invokeSuspend")
public final class d extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh.f<Object> f64091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f64092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f64093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f64094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set<String> f64095f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vh.f<Object> fVar, vh.e<Object> eVar, a aVar, z zVar, Set<String> set, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f64091b = fVar;
        this.f64092c = eVar;
        this.f64093d = aVar;
        this.f64094e = zVar;
        this.f64095f = set;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f64091b, this.f64092c, this.f64093d, this.f64094e, this.f64095f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if (r14 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        if (r1.e(r14, r13) == r0) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Set set;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64090a;
        a aVar2 = this.f64093d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                dVar = this;
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
        vh.f<Object> fVar = this.f64091b;
        if (fVar.f178309c != 0) {
            vh.e<Object> eVar = this.f64092c;
            eVar.getClass();
            g0 g0Var = eVar.f178290c;
            bi.b.a aVar3 = bi.b.f17921c;
            bi.b bVar = (bi.b) g0Var.b(aVar3);
            ci.a aVar4 = bVar != null ? bVar.f17922b : ci.a.f27591c;
            bi.b bVar2 = (bi.b) fVar.f178312f.b(aVar3);
            ci.a aVar5 = bVar2 != null ? bVar2.f17922b : ci.a.f27591c;
            aVar4.getClass();
            aVar5.getClass();
            ci.a.b bVar3 = ci.a.f27590b;
            bVar3.getClass();
            ci.a.C0420a c0420a = new ci.a.C0420a();
            Map<String, String> map = aVar4.f27592a;
            LinkedHashMap linkedHashMap = c0420a.f27593a;
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(aVar5.f27592a);
            ci.a aVar6 = new ci.a(linkedHashMap);
            bi.o oVar = (bi.o) g0Var.b(bi.o.f18004c);
            if (oVar != null ? oVar.f18005b : false) {
                a.f64079b.getClass();
                ci.a.C0420a c0420a2 = new ci.a.C0420a();
                int i15 = mi.a.f118679a;
                String strValueOf = String.valueOf(System.currentTimeMillis() / ((long) 1000));
                strValueOf.getClass();
                LinkedHashMap linkedHashMap2 = c0420a2.f27593a;
                linkedHashMap2.put("apollo-date", strValueOf);
                ci.a aVar7 = new ci.a(linkedHashMap2);
                bVar3.getClass();
                LinkedHashMap linkedHashMap3 = new ci.a.C0420a().f27593a;
                linkedHashMap3.putAll(aVar6.f27592a);
                linkedHashMap3.putAll(aVar7.f27592a);
                aVar6 = new ci.a(linkedHashMap3);
            }
            bi.a aVar8 = aVar2.f64080a;
            n0 n0Var = eVar.f178288a;
            n0.a aVar9 = fVar.f178309c;
            aVar9.getClass();
            this.f64090a = 1;
            dVar = this;
            obj = aVar8.a(aVar6, dVar, this.f64094e, aVar9, n0Var);
        } else {
            dVar = this;
            set = l0.f134950a;
            bi.a aVar10 = aVar2.f64080a;
            LinkedHashSet linkedHashSetH = c1.h(set, dVar.f64095f);
            dVar.f64090a = 2;
        }
        return aVar;
        set = (Set) obj;
        bi.a aVar11 = aVar2.f64080a;
        LinkedHashSet linkedHashSetH2 = c1.h(set, dVar.f64095f);
        dVar.f64090a = 2;
    }
}
