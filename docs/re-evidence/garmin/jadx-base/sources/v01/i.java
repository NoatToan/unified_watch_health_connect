package v01;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lq01/b;", "<anonymous>", "(Lo53/b0;)Lq01/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateRecipeUseCase$invoke$2", f = "CreateRecipeUseCase.kt", l = {43, 49}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super q01.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q01.h f174397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<b11.v> f174398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f174399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y22.x f174400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f174401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(q01.h hVar, List<? extends b11.v> list, j jVar, y22.x xVar, Context context, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f174397b = hVar;
        this.f174398c = list;
        this.f174399d = jVar;
        this.f174400e = xVar;
        this.f174401f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f174397b, this.f174398c, this.f174399d, this.f174400e, this.f174401f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super q01.b> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r2 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD0;
        String str;
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174396a;
        j jVar = this.f174399d;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objD0 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = obj;
            }
            return (q01.b) objA;
        }
        o13.r.b(obj);
        q01.h hVar = this.f174397b;
        String str2 = hVar.f142022a;
        Double d14 = hVar.f142025d;
        if (str2 == null || str2.length() == 0 || !zf.b.D(d14)) {
            return new q01.b.a(new IllegalArgumentException("Recipe name or serving amount is invalid"));
        }
        String str3 = hVar.f142022a;
        String str4 = hVar.f142023b;
        String str5 = (str4 == null || str4.length() <= 0 || d53.w.J(str4)) ? null : str4;
        String str6 = hVar.f142024c;
        double dDoubleValue = d14.doubleValue();
        String str7 = hVar.f142027f.f74122a;
        String str8 = hVar.f142030i;
        String str9 = hVar.f142029h;
        List<b11.v> list = this.f174398c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b11.v) it.next()).m1(null));
        }
        j01.a aVar2 = new j01.a(str3, dDoubleValue, str7, str8, str9, str5, str6, arrayList);
        m01.g gVar = jVar.f174414a;
        this.f174396a = 1;
        objD0 = gVar.D0(aVar2, this);
        if (objD0 != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objD0;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new q01.b.a(((v2.a) v2Var).f47383a);
            }
            lc.u0.r();
            return null;
        }
        j01.c cVar = (j01.c) ((v2.b) v2Var).f47386a;
        y22.x xVar = this.f174400e;
        if (xVar == null || (str = cVar.f95997b) == null) {
            return q01.b.c.f141984a;
        }
        q1 q1Var = jVar.f174415b;
        this.f174396a = 2;
        objA = l.a(this.f174401f, xVar, str, q1Var, this);
    }
}
