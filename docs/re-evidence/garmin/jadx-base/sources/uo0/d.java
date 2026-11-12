package uo0;

import c83.a0;
import e23.l;
import java.util.Set;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import u1.y1;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lvo0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.here.api.HereRepositoryImpl$getAutoSuggestResult$2", f = "HereRepositoryImpl.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<vo0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f172094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f172095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f172096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f172097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Set<h> f172098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f172099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f172100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, String str, double d14, double d15, Set<? extends h> set, Integer num, String str2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f172094b = cVar;
        this.f172095c = str;
        this.f172096d = d14;
        this.f172097e = d15;
        this.f172098f = set;
        this.f172099g = num;
        this.f172100h = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f172094b, this.f172095c, this.f172096d, this.f172097e, this.f172098f, this.f172099g, this.f172100h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<vo0.f>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172093a;
        Integer numValueOf = null;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        int i15 = c.f172081c;
        c cVar = this.f172094b;
        cVar.getClass();
        String str = this.f172096d + "," + this.f172097e;
        Set<h> set = this.f172098f;
        String strK0 = set != null ? h0.k0(set, ",", null, null, new y1(17), 30) : null;
        Integer num = this.f172099g;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue < 1) {
                iIntValue = 1;
            } else if (iIntValue > 100) {
                iIntValue = 100;
            }
            numValueOf = Integer.valueOf(iIntValue);
        }
        c.a aVar2 = new c.a(this.f172095c, str, strK0, numValueOf, this.f172100h);
        i0<a0<vo0.f>> i0VarA = cVar.f172082a.a(aVar2.f172084a, "xd2FdRlwb0D_TDtOB79r0hYQFQAb6Fdgolo7Ne_6GvI", aVar2.f172085b, aVar2.f172086c, aVar2.f172087d, aVar2.f172088e);
        this.f172093a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
