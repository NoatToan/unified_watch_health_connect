package rq0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.w;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import tq0.l;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyq0/e;", "<anonymous>", "(Lo53/b0;)Lyq0/e;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.domain.GetInsightsCompareHistogramUseCase$invoke$2", f = "GetInsightsCompareHistogramUseCase.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super yq0.e>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f154128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq0.b f154129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f154130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, yq0.b bVar, l lVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f154128b = eVar;
        this.f154129c = bVar;
        this.f154130d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f154128b, this.f154129c, this.f154130d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super yq0.e> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154127a;
        if (i14 == 0) {
            r.b(obj);
            yq0.b bVar = this.f154129c;
            String str2 = bVar.f198735c;
            tq0.e eVar = bVar.f198734b;
            String str3 = eVar != null ? eVar.f166052a : null;
            this.f154127a = 1;
            e eVar2 = this.f154128b;
            bv.d dVar = eVar2.f154126b;
            ar0.a aVar2 = eVar2.f154125a;
            String str4 = str3 == null ? "" : str3;
            String str5 = w.z(str2, "75", false) ? "75" : str2;
            l lVar = this.f154130d;
            tq0.a aVar3 = lVar.f166099a;
            String str6 = aVar3.f166036a;
            tq0.b bVar2 = (tq0.b) h0.e0(lVar.f166100b, aVar3.f166037b);
            objJ = f0.J(aVar2, new ar0.b(aVar2, str4, str5, str6, (bVar2 == null || (str = bVar2.f166040a) == null) ? "" : str, lVar.f166102d, lVar.f166101c, false, dVar.g().f77293c, dVar.b(), null), this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objJ = obj;
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return new yq0.e(false, this.f154130d, (tq0.c) ((v2.b) v2Var).f47386a, false, 9, null);
        }
        if (v2Var instanceof v2.a) {
            return new yq0.e(false, this.f154130d, null, true, 5, null);
        }
        u0.r();
        return null;
    }
}
