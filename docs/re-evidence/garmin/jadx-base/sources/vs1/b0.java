package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.TranslateReviewUseCase$translateReviewFromDetails$1", f = "TranslateReviewUseCase.kt", l = {32, 38, 41, 55, 60}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i53.c f179751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1<pt1.w> f179753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f179754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f179755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f179756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f179757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z1<pt1.w> z1Var, d0 d0Var, long j8, String str, Context context, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f179753c = z1Var;
        this.f179754d = d0Var;
        this.f179755e = j8;
        this.f179756f = str;
        this.f179757g = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f179753c, this.f179754d, this.f179755e, this.f179756f, this.f179757g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        if (r11.emit(r2, r22) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
    
        if (r2.a(r13, r22) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i53.c<pt1.x> cVar;
        Object objH0;
        v2 v2Var;
        pt1.w wVarA;
        i53.c cVarE;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179752b;
        long j8 = this.f179755e;
        d0 d0Var = this.f179754d;
        z1<pt1.w> z1Var = this.f179753c;
        if (i14 == 0) {
            o13.r.b(obj);
            cVar = z1Var.getValue().f141000d;
            pt1.w wVarA2 = pt1.w.a(z1Var.getValue(), false, false, null, false, true, false, 95);
            this.f179751a = cVar;
            this.f179752b = 1;
            if (z1Var.emit(wVarA2, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            cVar = this.f179751a;
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                cVar = this.f179751a;
                o13.r.b(obj);
                objH0 = obj;
                v2Var = (v2) objH0;
                if (v2Var instanceof v2.b) {
                    pt1.w value = z1Var.getValue();
                    if (cVar != null) {
                        arrayList = new ArrayList(p13.y.r(cVar, 10));
                        for (pt1.x xVarA : cVar) {
                            if (xVarA.f141004a == j8) {
                                xVarA = pt1.x.a(xVarA, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                            }
                            arrayList.add(xVarA);
                        }
                        cVarE = i53.a.e(arrayList);
                    } else {
                        cVarE = null;
                    }
                    pt1.w wVarA3 = pt1.w.a(value, false, false, cVarE, false, false, false, 87);
                    this.f179751a = null;
                    this.f179752b = 3;
                } else {
                    wVarA = pt1.w.a(z1Var.getValue(), false, false, null, false, false, false, 95);
                    this.f179751a = null;
                    this.f179752b = 4;
                    if (z1Var.emit(wVarA, this) != aVar) {
                        h hVar = d0Var.f179777c;
                        pt1.k kVar = new pt1.k(this.f179757g.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179751a = null;
                        this.f179752b = 5;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 == 4) {
                    o13.r.b(obj);
                    h hVar2 = d0Var.f179777c;
                    pt1.k kVar2 = new pt1.k(this.f179757g.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f179751a = null;
                    this.f179752b = 5;
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ss1.a0 a0Var = d0Var.f179776b;
        this.f179751a = cVar;
        this.f179752b = 2;
        objH0 = a0Var.H0(j8, this.f179756f, this);
        if (objH0 != aVar) {
            v2Var = (v2) objH0;
            if (v2Var instanceof v2.b) {
                pt1.w value2 = z1Var.getValue();
                if (cVar != null) {
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    while (r2.hasNext()) {
                        if (xVarA.f141004a == j8) {
                            xVarA = pt1.x.a(xVarA, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                        }
                        arrayList.add(xVarA);
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                pt1.w wVarA4 = pt1.w.a(value2, false, false, cVarE, false, false, false, 87);
                this.f179751a = null;
                this.f179752b = 3;
            } else {
                wVarA = pt1.w.a(z1Var.getValue(), false, false, null, false, false, false, 95);
                this.f179751a = null;
                this.f179752b = 4;
                if (z1Var.emit(wVarA, this) != aVar) {
                    h hVar3 = d0Var.f179777c;
                    pt1.k kVar3 = new pt1.k(this.f179757g.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f179751a = null;
                    this.f179752b = 5;
                }
            }
        }
        return aVar;
    }
}
