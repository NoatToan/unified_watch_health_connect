package v01;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateFoodException;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomFoodImageDeleteFailed;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomFoodImageUploadFailed;
import com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CustomFoodUploadFailed;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.CreateFoodUseCase$invoke$2", f = "CreateFoodUseCase.kt", l = {103, 109, SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g01.c0 f174273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b11.e f174274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d11.c f174276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y22.x f174277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y22.x f174278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f174279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f174280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d11.c cVar, y22.x xVar, y22.x xVar2, e eVar, Context context, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f174276d = cVar;
        this.f174277e = xVar;
        this.f174278f = xVar2;
        this.f174279g = eVar;
        this.f174280h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f174276d, this.f174277e, this.f174278f, this.f174279g, this.f174280h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x023f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0243  */
    /* JADX WARN: Code duplicated, block: B:107:0x0252  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2 A[PHI: r2
      0x01a2: PHI (r2v27 java.lang.Object) = (r2v23 java.lang.Object), (r2v45 java.lang.Object) binds: [B:69:0x019f, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0209  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:98:0x021c  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (r2 == r1) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        g01.c0 c0Var;
        String str;
        Object objD0;
        String str2;
        g01.w wVar;
        String str3;
        Object objG;
        v2 v2Var;
        b11.e eVarA;
        String str4;
        Object objE0;
        b11.e eVar;
        v2 v2Var2;
        f01.e eVar2;
        List<f01.d> list;
        f01.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174275c;
        y22.x xVar = this.f174278f;
        e eVar3 = this.f174279g;
        d11.c cVar = this.f174276d;
        if (i14 != 0) {
            if (i14 == 1) {
                g01.c0 c0Var2 = this.f174273a;
                o13.r.b(obj);
                c0Var = c0Var2;
                objD0 = obj;
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    objG = obj;
                    v2Var = (v2) objG;
                    if (!(v2Var instanceof v2.b)) {
                        if (v2Var instanceof v2.a) {
                            return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
                        }
                        lc.u0.r();
                        return null;
                    }
                    eVarA = ((g01.i) ((v2.b) v2Var).f47386a).a();
                    if (eVarA == null) {
                        return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
                    }
                    if (xVar != null && xVar.f194330b == null) {
                        q1 q1Var = eVar3.f174312b;
                        PhotoCategory photoCategory = PhotoCategory.CUSTOM_FOOD;
                        String str5 = eVarA.f14261a.f14253a;
                        str4 = null;
                        this.f174273a = null;
                        this.f174274b = eVarA;
                        this.f174275c = 3;
                        objE0 = ge1.b.e0(q1Var.f174513b, new r1(q1Var, this.f174280h, xVar, photoCategory, str5, null), this);
                        if (objE0 != aVar) {
                            eVar = eVarA;
                        }
                        return aVar;
                    }
                    return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar = this.f174274b;
                o13.r.b(obj);
                objE0 = obj;
                str4 = null;
            }
            v2Var2 = (v2) objE0;
            if (!(v2Var2 instanceof v2.b)) {
                if (v2Var2 instanceof v2.a) {
                    return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            eVar2 = (f01.e) ((v2.b) v2Var2).f47386a;
            if (eVar2 != null && (list = eVar2.f67688a) != null && (dVar = (f01.d) p13.h0.d0(list)) != null) {
                str4 = dVar.f67684a;
            }
            if (str4 == null) {
                return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
            }
            return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
        }
        ArrayList arrayListX = v.h.x(obj);
        String str6 = cVar.f57049b;
        b11.f fVar = cVar.f57054g;
        g01.c cVar2 = cVar.f57053f;
        if (str6 == null || str6.length() == 0) {
            arrayListX.add(c.MISSING_FOOD_NAME);
        }
        Double d14 = cVar.f57051d;
        if (d14 == null) {
            arrayListX.add(c.MISSING_SERVING_SIZE);
        } else {
            double dDoubleValue = d14.doubleValue();
            if (0.001d > dDoubleValue || dDoubleValue > 99999.999d) {
                arrayListX.add(c.INVALID_SERVING_SIZE);
            }
        }
        if (cVar2 == null) {
            arrayListX.add(c.MISSING_SERVING_UNIT);
        }
        if (fVar.f14266a == null) {
            arrayListX.add(c.MISSING_CALORIES);
        }
        if (!arrayListX.isEmpty()) {
            return new v2.a(new CreateFoodException(i53.a.j(arrayListX)), null, null, 6, null);
        }
        c0Var = new g01.c0(cVar.f57052e, cVar2 != null ? cVar2.f74122a : null, cVar.f57051d, fVar.f14266a, fVar.f14267b, fVar.f14268c, fVar.f14269d, fVar.f14270e, fVar.f14271f, fVar.f14272g, fVar.f14273h, fVar.f14274i, fVar.f14275j, fVar.f14276k, fVar.f14277l, fVar.f14278m, fVar.f14279n, fVar.f14280o, fVar.f14281p, fVar.f14282q, fVar.f14283r, fVar.f14284t);
        y22.x xVar2 = this.f174277e;
        if (p005kotlin.jvm.internal.s.g(xVar2 != null ? xVar2.f194330b : null, xVar != null ? xVar.f194330b : null) || (str = cVar.f57048a) == null) {
            m01.g gVar = eVar3.f174311a;
            String str7 = cVar.f57048a;
            str2 = cVar.f57050c;
            String str8 = cVar.f57049b;
            if (g22.n.d(str2)) {
                wVar = g01.w.BRAND;
            } else {
                wVar = g01.w.GENERIC;
            }
            g01.w wVar2 = wVar;
            if (str2 != null || d53.w.J(str2)) {
                str3 = null;
            } else {
                str3 = str2;
            }
            g01.i iVar = new g01.i(new g01.o(str7, str8, wVar2, str3, "GARMIN", cVar.f57056i, cVar.f57055h, (String) null, 128, (p005kotlin.jvm.internal.j) null), p13.w.c(c0Var), (List) p13.j0.f134944a, false, 8, (p005kotlin.jvm.internal.j) null);
            this.f174273a = null;
            this.f174275c = 2;
            objG = gVar.g(iVar, this);
            if (objG != aVar) {
                v2Var = (v2) objG;
                if (!(v2Var instanceof v2.b)) {
                    if (v2Var instanceof v2.a) {
                        return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
                    }
                    lc.u0.r();
                    return null;
                }
                eVarA = ((g01.i) ((v2.b) v2Var).f47386a).a();
                if (eVarA == null) {
                    return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
                }
                if (xVar != null) {
                    q1 q1Var2 = eVar3.f174312b;
                    PhotoCategory photoCategory2 = PhotoCategory.CUSTOM_FOOD;
                    String str9 = eVarA.f14261a.f14253a;
                    str4 = null;
                    this.f174273a = null;
                    this.f174274b = eVarA;
                    this.f174275c = 3;
                    objE0 = ge1.b.e0(q1Var2.f174513b, new r1(q1Var2, this.f174280h, xVar, photoCategory2, str9, null), this);
                    if (objE0 != aVar) {
                        eVar = eVarA;
                        v2Var2 = (v2) objE0;
                        if (!(v2Var2 instanceof v2.b)) {
                            if (v2Var2 instanceof v2.a) {
                                return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
                            }
                            lc.u0.r();
                            return null;
                        }
                        eVar2 = (f01.e) ((v2.b) v2Var2).f47386a;
                        if (eVar2 != null) {
                            str4 = dVar.f67684a;
                        }
                        if (str4 == null) {
                            return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
                        }
                    }
                }
                return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
            }
        } else {
            m01.g gVar2 = eVar3.f174311a;
            PhotoCategory photoCategory3 = PhotoCategory.CUSTOM_FOOD;
            this.f174273a = c0Var;
            this.f174275c = 1;
            objD0 = gVar2.d0(photoCategory3, str, this);
        }
        return aVar;
        if (((v2) objD0) instanceof v2.a) {
            return new v2.a(new CustomFoodImageDeleteFailed(), null, null, 6, null);
        }
        m01.g gVar3 = eVar3.f174311a;
        String str10 = cVar.f57048a;
        str2 = cVar.f57050c;
        String str11 = cVar.f57049b;
        if (g22.n.d(str2)) {
            wVar = g01.w.BRAND;
        } else {
            wVar = g01.w.GENERIC;
        }
        g01.w wVar3 = wVar;
        if (str2 != null) {
            str3 = null;
        } else {
            str3 = null;
        }
        g01.i iVar2 = new g01.i(new g01.o(str10, str11, wVar3, str3, "GARMIN", cVar.f57056i, cVar.f57055h, (String) null, 128, (p005kotlin.jvm.internal.j) null), p13.w.c(c0Var), (List) p13.j0.f134944a, false, 8, (p005kotlin.jvm.internal.j) null);
        this.f174273a = null;
        this.f174275c = 2;
        objG = gVar3.g(iVar2, this);
        if (objG != aVar) {
            v2Var = (v2) objG;
            if (!(v2Var instanceof v2.b)) {
                if (v2Var instanceof v2.a) {
                    return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
                }
                lc.u0.r();
                return null;
            }
            eVarA = ((g01.i) ((v2.b) v2Var).f47386a).a();
            if (eVarA == null) {
                return new v2.a(new CustomFoodUploadFailed(), null, null, 6, null);
            }
            if (xVar != null) {
                q1 q1Var3 = eVar3.f174312b;
                PhotoCategory photoCategory4 = PhotoCategory.CUSTOM_FOOD;
                String str12 = eVarA.f14261a.f14253a;
                str4 = null;
                this.f174273a = null;
                this.f174274b = eVarA;
                this.f174275c = 3;
                objE0 = ge1.b.e0(q1Var3.f174513b, new r1(q1Var3, this.f174280h, xVar, photoCategory4, str12, null), this);
                if (objE0 != aVar) {
                    eVar = eVarA;
                    v2Var2 = (v2) objE0;
                    if (!(v2Var2 instanceof v2.b)) {
                        if (v2Var2 instanceof v2.a) {
                            return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
                        }
                        lc.u0.r();
                        return null;
                    }
                    eVar2 = (f01.e) ((v2.b) v2Var2).f47386a;
                    if (eVar2 != null) {
                        str4 = dVar.f67684a;
                    }
                    if (str4 == null) {
                        return new v2.a(new CustomFoodImageUploadFailed(eVar), null, null, 6, null);
                    }
                }
            }
            return new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
        }
        return aVar;
    }
}
