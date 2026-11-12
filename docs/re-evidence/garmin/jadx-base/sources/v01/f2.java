package v01;

import android.content.Context;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lq01/b;", "<anonymous>", "(Lo53/b0;)Lq01/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.UpdateRecipeUseCase$invoke$2", f = "UpdateRecipeUseCase.kt", l = {47, 56, 63}, m = "invokeSuspend", v = 2)
public final class f2 extends v13.i implements e23.p<o53.b0, t13.d<? super q01.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j01.c f174361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.h f174364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2 f174365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<b11.v> f174366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<b11.v> f174367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f174368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y22.x f174369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y22.x f174370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f174371k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f2(q01.h hVar, g2 g2Var, List<? extends b11.v> list, List<? extends b11.v> list2, String str, y22.x xVar, y22.x xVar2, Context context, t13.d<? super f2> dVar) {
        super(2, dVar);
        this.f174364d = hVar;
        this.f174365e = g2Var;
        this.f174366f = list;
        this.f174367g = list2;
        this.f174368h = str;
        this.f174369i = xVar;
        this.f174370j = xVar2;
        this.f174371k = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f2(this.f174364d, this.f174365e, this.f174366f, this.f174367g, this.f174368h, this.f174369i, this.f174370j, this.f174371k, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super q01.b> dVar) {
        return ((f2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0179, code lost:
    
        if (r2 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019b, code lost:
    
        if (r2 == r1) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<b11.v> list;
        Object objH;
        String str;
        j01.c cVar;
        int i14;
        String str2;
        Object objA;
        String str3;
        Object objA2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f174363c;
        y22.x xVar = this.f174369i;
        g2 g2Var = this.f174365e;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                objH = obj;
            } else if (i15 == 2) {
                int i16 = this.f174362b;
                cVar = this.f174361a;
                o13.r.b(obj);
                i14 = i16;
                objA = obj;
                q01.b bVar = (q01.b) objA;
                if (bVar instanceof q01.b.C2663b) {
                    return bVar;
                }
                if (xVar != null || i14 == 0 || (str3 = cVar.f95997b) == null) {
                    return q01.b.c.f141984a;
                }
                q1 q1Var = g2Var.f174386b;
                this.f174361a = null;
                this.f174362b = i14;
                this.f174363c = 3;
                objA2 = l.a(this.f174371k, xVar, str3, q1Var, this);
            } else {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA2 = obj;
            }
            return (q01.b) objA2;
        }
        o13.r.b(obj);
        q01.h hVar = this.f174364d;
        String str4 = hVar.f142022a;
        Double d14 = hVar.f142025d;
        if (str4 == null || str4.length() == 0 || !zf.b.D(d14)) {
            return new q01.b.a(new IllegalArgumentException("Recipe name or serving amount is invalid"));
        }
        String str5 = hVar.f142022a;
        String str6 = hVar.f142023b;
        String str7 = hVar.f142024c;
        double dDoubleValue = d14.doubleValue();
        String str8 = hVar.f142027f.f74122a;
        String str9 = hVar.f142030i;
        String str10 = hVar.f142029h;
        g2Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f174366f.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f174367g;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            b11.v vVar = (b11.v) next;
            if (list == null || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        b11.v vVar2 = (b11.v) it3.next();
                        str = str10;
                        Iterator it4 = it3;
                        if (!p005kotlin.jvm.internal.s.g(vVar2.getF14238e().f14253a, vVar.getF14238e().f14253a) || !vVar2.getF14239f().f14372a.equals(vVar.getF14239f().f14372a)) {
                            it3 = it4;
                            str10 = str;
                        }
                    } else {
                        str = str10;
                        arrayList.add(next);
                    }
                }
            } else {
                str = str10;
                arrayList.add(next);
            }
            str10 = str;
        }
        String str11 = str10;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((b11.v) it5.next()).m1(Boolean.TRUE));
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((b11.v) it6.next()).m1(Boolean.FALSE));
        }
        j01.a aVar2 = new j01.a(str5, dDoubleValue, str8, str9, str11, str6, str7, p13.h0.C0(arrayList2, arrayList3));
        m01.g gVar = g2Var.f174385a;
        this.f174363c = 1;
        objH = gVar.H(this.f174368h, aVar2, this);
        if (objH != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objH;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return new q01.b.a(((v2.a) v2Var).f47383a);
            }
            lc.u0.r();
            return null;
        }
        cVar = (j01.c) ((v2.b) v2Var).f47386a;
        Uri uri = xVar != null ? xVar.f194329a : null;
        y22.x xVar2 = this.f174370j;
        boolean zG = p005kotlin.jvm.internal.s.g(uri, xVar2 != null ? xVar2.f194329a : null);
        i14 = !zG ? 1 : 0;
        if ((xVar2 != null ? xVar2.f194329a : null) == null || zG || (str2 = cVar.f95997b) == null) {
            if (xVar != null) {
            }
            return q01.b.c.f141984a;
        }
        this.f174361a = cVar;
        this.f174362b = i14;
        this.f174363c = 2;
        objA = g2.a(g2Var, str2, this);
        return aVar;
    }
}
