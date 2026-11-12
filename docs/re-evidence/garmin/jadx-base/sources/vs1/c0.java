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
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.TranslateReviewUseCase$translateReviewFromOverview$1", f = "TranslateReviewUseCase.kt", l = {93, 94, 97, 111, 112}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1<pt1.o> f179765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f179766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f179767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f179768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f179769f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z1<pt1.o> z1Var, d0 d0Var, long j8, String str, Context context, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f179765b = z1Var;
        this.f179766c = d0Var;
        this.f179767d = j8;
        this.f179768e = str;
        this.f179769f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f179765b, this.f179766c, this.f179767d, this.f179768e, this.f179769f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:42:0x016e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (r11.emit(r2, r40) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0188, code lost:
    
        if (r2.a(r7, r40) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objH0;
        v2 v2Var;
        pt1.o oVarA;
        i53.c<pt1.x> cVar;
        i53.c cVarE;
        ArrayList arrayList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179764a;
        long j8 = this.f179767d;
        d0 d0Var = this.f179766c;
        z1<pt1.o> z1Var = this.f179765b;
        if (i14 == 0) {
            o13.r.b(obj);
            pt1.o oVarA2 = pt1.o.a(z1Var.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
            this.f179764a = 1;
            if (z1Var.emit(oVarA2, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objH0 = obj;
                v2Var = (v2) objH0;
                if (v2Var instanceof v2.b) {
                    pt1.o value = z1Var.getValue();
                    cVar = z1Var.getValue().f140919q;
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
                    pt1.o oVarA3 = pt1.o.a(value, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE, null, null, null, null, null, null, null, false, false, false, false, false, 1073676283);
                    this.f179764a = 3;
                } else {
                    oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179764a = 4;
                    if (z1Var.emit(oVarA, this) != aVar) {
                        h hVar = d0Var.f179777c;
                        pt1.k kVar = new pt1.k(this.f179769f.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179764a = 5;
                    }
                }
                return aVar;
            }
            if (i14 != 3) {
                if (i14 == 4) {
                    o13.r.b(obj);
                    h hVar2 = d0Var.f179777c;
                    pt1.k kVar2 = new pt1.k(this.f179769f.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f179764a = 5;
                } else if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ss1.a0 a0Var = d0Var.f179776b;
        this.f179764a = 2;
        objH0 = a0Var.H0(j8, this.f179768e, this);
        if (objH0 != aVar) {
            v2Var = (v2) objH0;
            if (v2Var instanceof v2.b) {
                pt1.o value2 = z1Var.getValue();
                cVar = z1Var.getValue().f140919q;
                if (cVar != null) {
                    arrayList = new ArrayList(p13.y.r(cVar, 10));
                    while (r5.hasNext()) {
                        if (xVarA.f141004a == j8) {
                            xVarA = pt1.x.a(xVarA, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                        }
                        arrayList.add(xVarA);
                    }
                    cVarE = i53.a.e(arrayList);
                } else {
                    cVarE = null;
                }
                pt1.o oVarA4 = pt1.o.a(value2, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE, null, null, null, null, null, null, null, false, false, false, false, false, 1073676283);
                this.f179764a = 3;
            } else {
                oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179764a = 4;
                if (z1Var.emit(oVarA, this) != aVar) {
                    h hVar3 = d0Var.f179777c;
                    pt1.k kVar3 = new pt1.k(this.f179769f.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f179764a = 5;
                }
            }
        }
        return aVar;
    }
}
