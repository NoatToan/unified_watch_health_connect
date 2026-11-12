package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.TranslateReviewUseCase$translateReviewFromBottomSheet$1", f = "TranslateReviewUseCase.kt", l = {73, 74, 76, 78, 80, 81}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f179740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1<pt1.o> f179742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f179743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f179744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f179745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z1<pt1.x> f179746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f179747h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z1<pt1.o> z1Var, d0 d0Var, long j8, String str, z1<pt1.x> z1Var2, Context context, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f179742c = z1Var;
        this.f179743d = d0Var;
        this.f179744e = j8;
        this.f179745f = str;
        this.f179746g = z1Var2;
        this.f179747h = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f179742c, this.f179743d, this.f179744e, this.f179745f, this.f179746g, this.f179747h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0088 A[PHI: r2
      0x0088: PHI (r2v6 java.lang.Object) = (r2v5 java.lang.Object), (r2v8 java.lang.Object) binds: [B:15:0x0084, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00d1 A[PHI: r2
      0x00d1: PHI (r2v9 com.garmin.android.apps.connectmobile.v2) = (r2v7 com.garmin.android.apps.connectmobile.v2), (r2v20 com.garmin.android.apps.connectmobile.v2) binds: [B:18:0x00cd, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:32:0x0140  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        if (r3.emit(r2, r35) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015d, code lost:
    
        if (r2.a(r6, r35) == r1) goto L34;
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
        pt1.o oVarA2;
        pt1.x value;
        pt1.x xVarA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179741b;
        d0 d0Var = this.f179743d;
        z1<pt1.o> z1Var = this.f179742c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                pt1.o oVarA3 = pt1.o.a(z1Var.getValue(), true, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179741b = 1;
                if (z1Var.emit(oVarA3, this) != aVar) {
                    ss1.a0 a0Var = d0Var.f179776b;
                    this.f179741b = 2;
                    objH0 = a0Var.H0(this.f179744e, this.f179745f, this);
                    if (objH0 != aVar) {
                        v2Var = (v2) objH0;
                        oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179740a = v2Var;
                        this.f179741b = 3;
                        if (z1Var.emit(oVarA, this) != aVar) {
                            if (!(v2Var instanceof v2.b)) {
                                oVarA2 = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                                this.f179740a = null;
                                this.f179741b = 5;
                                if (z1Var.emit(oVarA2, this) != aVar) {
                                    h hVar = d0Var.f179777c;
                                    pt1.k kVar = new pt1.k(this.f179747h.getString(R.string.txt_error_occurred), null, null, 6, null);
                                    this.f179740a = null;
                                    this.f179741b = 6;
                                }
                            } else {
                                z1<pt1.x> z1Var2 = this.f179746g;
                                value = z1Var2.getValue();
                                if (value != null) {
                                    xVarA = pt1.x.a(value, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                                } else {
                                    xVarA = null;
                                }
                                this.f179740a = null;
                                this.f179741b = 4;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                ss1.a0 a0Var2 = d0Var.f179776b;
                this.f179741b = 2;
                objH0 = a0Var2.H0(this.f179744e, this.f179745f, this);
                if (objH0 != aVar) {
                    v2Var = (v2) objH0;
                    oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179740a = v2Var;
                    this.f179741b = 3;
                    if (z1Var.emit(oVarA, this) != aVar) {
                        if (!(v2Var instanceof v2.b)) {
                            oVarA2 = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                            this.f179740a = null;
                            this.f179741b = 5;
                            if (z1Var.emit(oVarA2, this) != aVar) {
                                h hVar2 = d0Var.f179777c;
                                pt1.k kVar2 = new pt1.k(this.f179747h.getString(R.string.txt_error_occurred), null, null, 6, null);
                                this.f179740a = null;
                                this.f179741b = 6;
                            }
                        } else {
                            z1<pt1.x> z1Var3 = this.f179746g;
                            value = z1Var3.getValue();
                            if (value != null) {
                                xVarA = pt1.x.a(value, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                            } else {
                                xVarA = null;
                            }
                            this.f179740a = null;
                            this.f179741b = 4;
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objH0 = obj;
                v2Var = (v2) objH0;
                oVarA = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                this.f179740a = v2Var;
                this.f179741b = 3;
                if (z1Var.emit(oVarA, this) != aVar) {
                    if (!(v2Var instanceof v2.b)) {
                        oVarA2 = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                        this.f179740a = null;
                        this.f179741b = 5;
                        if (z1Var.emit(oVarA2, this) != aVar) {
                            h hVar3 = d0Var.f179777c;
                            pt1.k kVar3 = new pt1.k(this.f179747h.getString(R.string.txt_error_occurred), null, null, 6, null);
                            this.f179740a = null;
                            this.f179741b = 6;
                        }
                    } else {
                        z1<pt1.x> z1Var4 = this.f179746g;
                        value = z1Var4.getValue();
                        if (value != null) {
                            xVarA = pt1.x.a(value, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                        } else {
                            xVarA = null;
                        }
                        this.f179740a = null;
                        this.f179741b = 4;
                    }
                    break;
                }
                return aVar;
            case 3:
                v2Var = this.f179740a;
                o13.r.b(obj);
                if (!(v2Var instanceof v2.b)) {
                    z1<pt1.x> z1Var5 = this.f179746g;
                    value = z1Var5.getValue();
                    if (value != null) {
                        xVarA = pt1.x.a(value, 0, false, (String) ((v2.b) v2Var).f47386a, 4186111);
                    } else {
                        xVarA = null;
                    }
                    this.f179740a = null;
                    this.f179741b = 4;
                    break;
                } else {
                    oVarA2 = pt1.o.a(z1Var.getValue(), false, null, false, false, 0, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741819);
                    this.f179740a = null;
                    this.f179741b = 5;
                    if (z1Var.emit(oVarA2, this) != aVar) {
                        h hVar4 = d0Var.f179777c;
                        pt1.k kVar4 = new pt1.k(this.f179747h.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179740a = null;
                        this.f179741b = 6;
                    }
                    break;
                }
                return aVar;
            case 4:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 5:
                o13.r.b(obj);
                h hVar5 = d0Var.f179777c;
                pt1.k kVar5 = new pt1.k(this.f179747h.getString(R.string.txt_error_occurred), null, null, 6, null);
                this.f179740a = null;
                this.f179741b = 6;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
