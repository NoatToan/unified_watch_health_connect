package v01;

import android.content.Context;
import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateMealException;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomMealImageDeleteFailed;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomMealImageUploadFailed;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomMealUploadFailed;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateMealUseCase$invoke$2", f = "CreateMealUseCase.kt", l = {69, 87, 98}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b11.a.b f174372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d11.d f174374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.x f174375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y22.x f174376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f174377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f174378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d11.d dVar, y22.x xVar, y22.x xVar2, h hVar, Context context, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f174374c = dVar;
        this.f174375d = xVar;
        this.f174376e = xVar2;
        this.f174377f = hVar;
        this.f174378g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f174374c, this.f174375d, this.f174376e, this.f174377f, this.f174378g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100 A[LOOP:0: B:57:0x00fa->B:59:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x013c A[PHI: r2
      0x013c: PHI (r2v20 java.lang.Object) = (r2v15 java.lang.Object), (r2v37 java.lang.Object) binds: [B:64:0x0139, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        if (r2 == r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long l14;
        Object objD0;
        ArrayList arrayList;
        Iterator<b11.v> it;
        String str;
        Object objL;
        v2 v2Var;
        b11.a.b bVarA;
        Object objE0;
        b11.a.b bVar;
        v2 v2Var2;
        f01.e eVar;
        List<f01.d> list;
        f01.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174373b;
        y22.x xVar = this.f174376e;
        h hVar = this.f174377f;
        d11.d dVar2 = this.f174374c;
        String str2 = null;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objD0 = obj;
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    objL = obj;
                    v2Var = (v2) objL;
                    if (!(v2Var instanceof v2.b)) {
                        if (v2Var instanceof v2.a) {
                            return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
                        }
                        lc.u0.r();
                        return null;
                    }
                    bVarA = ((g01.e) ((v2.b) v2Var).f47386a).a();
                    if (bVarA == null) {
                        return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
                    }
                    if (xVar != null && xVar.f194330b == null) {
                        q1 q1Var = hVar.f174389b;
                        PhotoCategory photoCategory = PhotoCategory.CUSTOM_MEAL;
                        String strValueOf = String.valueOf(bVarA.f14228d);
                        this.f174372a = bVarA;
                        this.f174373b = 3;
                        objE0 = ge1.b.e0(q1Var.f174513b, new r1(q1Var, this.f174378g, xVar, photoCategory, strValueOf, null), this);
                        if (objE0 != aVar) {
                            bVar = bVarA;
                        }
                        return aVar;
                    }
                    return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.f174372a;
                o13.r.b(obj);
                objE0 = obj;
            }
            v2Var2 = (v2) objE0;
            if (!(v2Var2 instanceof v2.b)) {
                if (v2Var2 instanceof v2.a) {
                    return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            eVar = (f01.e) ((v2.b) v2Var2).f47386a;
            if (eVar != null && (list = eVar.f67688a) != null && (dVar = (f01.d) p13.h0.d0(list)) != null) {
                str2 = dVar.f67684a;
            }
            if (str2 == null) {
                return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
            }
            return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
        }
        ArrayList arrayListX = v.h.x(obj);
        String str3 = dVar2.f57058b;
        i53.c<b11.v> cVar = dVar2.f57059c;
        if (str3 == null || str3.length() == 0) {
            arrayListX.add(f.MISSING_MEAL_NAME);
        }
        if (cVar.isEmpty()) {
            arrayListX.add(f.NO_FOOD);
        }
        if (cVar.size() > 20) {
            arrayListX.add(f.FOOD_LIMIT_EXCEEDED);
        }
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<b11.v> it3 = cVar.iterator();
            while (it3.hasNext()) {
                if (it3.next().getF14235b() == 0.0d) {
                    arrayListX.add(f.FOOD_SERVING_QUANTITY_INVALID);
                    break;
                }
            }
        }
        if (!arrayListX.isEmpty()) {
            return new v2.a(new CreateMealException(i53.a.j(arrayListX)), null, null, 6, null);
        }
        y22.x xVar2 = this.f174375d;
        if (p005kotlin.jvm.internal.s.g(xVar2 != null ? xVar2.f194330b : null, xVar != null ? xVar.f194330b : null) || (l14 = dVar2.f57057a) == null) {
            i53.c<b11.v> cVar2 = dVar2.f57059c;
            arrayList = new ArrayList(p13.y.r(cVar2, 10));
            it = cVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().A3());
            }
            Long l15 = dVar2.f57057a;
            str = dVar2.f57058b;
            if (str == null) {
                str = "";
            }
            g01.b bVar2 = new g01.b(new g01.e(l15, str, false, (Integer) null, (String) null, (List) arrayList, (List) null, (g01.c0) null, false, 476, (p005kotlin.jvm.internal.j) null));
            m01.g gVar = hVar.f174388a;
            this.f174373b = 2;
            objL = gVar.L(bVar2, this);
            if (objL != aVar) {
                v2Var = (v2) objL;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                bVarA = ((g01.e) ((v2.b) v2Var).f47386a).a();
                if (bVarA == null) {
                    return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
                }
                if (xVar != null) {
                    q1 q1Var2 = hVar.f174389b;
                    PhotoCategory photoCategory2 = PhotoCategory.CUSTOM_MEAL;
                    String strValueOf2 = String.valueOf(bVarA.f14228d);
                    this.f174372a = bVarA;
                    this.f174373b = 3;
                    objE0 = ge1.b.e0(q1Var2.f174513b, new r1(q1Var2, this.f174378g, xVar, photoCategory2, strValueOf2, null), this);
                    if (objE0 != aVar) {
                        bVar = bVarA;
                        v2Var2 = (v2) objE0;
                        if (!(v2Var2 instanceof v2.b)) {
                            if (v2Var2 instanceof v2.a) {
                                return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
                            }
                            lc.u0.r();
                            return null;
                        }
                        eVar = (f01.e) ((v2.b) v2Var2).f47386a;
                        if (eVar != null) {
                            str2 = dVar.f67684a;
                        }
                        if (str2 == null) {
                            return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
                        }
                    }
                }
                return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
            }
        } else {
            m01.g gVar2 = hVar.f174388a;
            PhotoCategory photoCategory3 = PhotoCategory.CUSTOM_MEAL;
            String strValueOf3 = String.valueOf(l14.longValue());
            this.f174373b = 1;
            objD0 = gVar2.d0(photoCategory3, strValueOf3, this);
        }
        return aVar;
        if (((v2) objD0) instanceof v2.a) {
            return new v2.a(new CustomMealImageDeleteFailed(), null, null, 6, null);
        }
        i53.c<b11.v> cVar3 = dVar2.f57059c;
        arrayList = new ArrayList(p13.y.r(cVar3, 10));
        it = cVar3.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().A3());
        }
        Long l16 = dVar2.f57057a;
        str = dVar2.f57058b;
        if (str == null) {
            str = "";
        }
        g01.b bVar3 = new g01.b(new g01.e(l16, str, false, (Integer) null, (String) null, (List) arrayList, (List) null, (g01.c0) null, false, 476, (p005kotlin.jvm.internal.j) null));
        m01.g gVar3 = hVar.f174388a;
        this.f174373b = 2;
        objL = gVar3.L(bVar3, this);
        if (objL != aVar) {
            v2Var = (v2) objL;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            bVarA = ((g01.e) ((v2.b) v2Var).f47386a).a();
            if (bVarA == null) {
                return new v2.a(new CustomMealUploadFailed(), null, null, 6, null);
            }
            if (xVar != null) {
                q1 q1Var3 = hVar.f174389b;
                PhotoCategory photoCategory4 = PhotoCategory.CUSTOM_MEAL;
                String strValueOf4 = String.valueOf(bVarA.f14228d);
                this.f174372a = bVarA;
                this.f174373b = 3;
                objE0 = ge1.b.e0(q1Var3.f174513b, new r1(q1Var3, this.f174378g, xVar, photoCategory4, strValueOf4, null), this);
                if (objE0 != aVar) {
                    bVar = bVarA;
                    v2Var2 = (v2) objE0;
                    if (!(v2Var2 instanceof v2.b)) {
                        if (v2Var2 instanceof v2.a) {
                            return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
                        }
                        lc.u0.r();
                        return null;
                    }
                    eVar = (f01.e) ((v2.b) v2Var2).f47386a;
                    if (eVar != null) {
                        str2 = dVar.f67684a;
                    }
                    if (str2 == null) {
                        return new v2.a(new CustomMealImageUploadFailed(bVar.f14228d), null, null, 6, null);
                    }
                }
            }
            return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
        }
        return aVar;
    }
}
