package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.DeleteUserReviewUseCase$deleteTrailReview$1", f = "DeleteUserReviewUseCase.kt", l = {27, 30, 39, 40, 46, 52, 58}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f179778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f179780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f179781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f179782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j8, Context context, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f179780c = fVar;
        this.f179781d = j8;
        this.f179782e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f179780c, this.f179781d, this.f179782e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071 A[PHI: r2
      0x0071: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v17 java.lang.Object) binds: [B:16:0x006d, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[PHI: r2
      0x00b7: PHI (r2v18 java.util.ArrayList) = (r2v15 java.util.ArrayList), (r2v21 java.util.ArrayList) binds: [B:31:0x00b3, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        if (r2.a(r8, r22) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0142, code lost:
    
        if (r2.a(r4, r22) == r1) goto L44;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        z1<pt1.a0> z1Var;
        pt1.a0 a0VarA;
        ArrayList arrayListD1;
        Iterator it;
        Object next;
        pt1.x xVar;
        z1<Boolean> z1Var2;
        Boolean bool;
        z1<pt1.a0> z1Var3;
        pt1.a0 a0VarA2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179779b;
        Context context = this.f179782e;
        long j8 = this.f179781d;
        f fVar = this.f179780c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                z1<pt1.a0> z1Var4 = fVar.f179787c;
                pt1.a0 a0VarA3 = pt1.a0.a(z1Var4.getValue(), false, true, false, null, null, null, null, null, null, false, false, 2041);
                this.f179779b = 1;
                if (z1Var4.emit(a0VarA3, this) != aVar) {
                    ss1.a0 a0Var = fVar.f179785a;
                    this.f179779b = 2;
                    objQ = a0Var.Q(j8, this);
                    if (objQ != aVar) {
                        if (((v2) objQ) instanceof v2.b) {
                            z1Var = fVar.f179787c;
                            a0VarA = pt1.a0.a(z1Var.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2041);
                            this.f179779b = 6;
                            if (z1Var.emit(a0VarA, this) != aVar) {
                                h hVar = fVar.f179789e;
                                pt1.k kVar = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                                this.f179779b = 7;
                            }
                        } else {
                            arrayListD1 = p13.h0.d1(fVar.f179787c.getValue().f140806d);
                            it = arrayListD1.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                xVar = (pt1.x) next;
                                if (xVar != null) {
                                    arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                                }
                                z1Var2 = fVar.f179788d;
                                bool = Boolean.TRUE;
                                this.f179778a = arrayListD1;
                                this.f179779b = 3;
                                if (z1Var2.emit(bool, this) != aVar) {
                                    z1Var3 = fVar.f179787c;
                                    a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                                    this.f179778a = null;
                                    this.f179779b = 4;
                                    if (z1Var3.emit(a0VarA2, this) != aVar) {
                                        h hVar2 = fVar.f179789e;
                                        pt1.k kVar2 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                        this.f179778a = null;
                                        this.f179779b = 5;
                                    }
                                }
                                break;
                            } while (((pt1.x) next).f141004a != j8);
                            xVar = (pt1.x) next;
                            if (xVar != null) {
                                arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                            }
                            z1Var2 = fVar.f179788d;
                            bool = Boolean.TRUE;
                            this.f179778a = arrayListD1;
                            this.f179779b = 3;
                            if (z1Var2.emit(bool, this) != aVar) {
                                z1Var3 = fVar.f179787c;
                                a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                                this.f179778a = null;
                                this.f179779b = 4;
                                if (z1Var3.emit(a0VarA2, this) != aVar) {
                                    h hVar3 = fVar.f179789e;
                                    pt1.k kVar3 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                    this.f179778a = null;
                                    this.f179779b = 5;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                ss1.a0 a0Var2 = fVar.f179785a;
                this.f179779b = 2;
                objQ = a0Var2.Q(j8, this);
                if (objQ != aVar) {
                    if (((v2) objQ) instanceof v2.b) {
                        z1Var = fVar.f179787c;
                        a0VarA = pt1.a0.a(z1Var.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2041);
                        this.f179779b = 6;
                        if (z1Var.emit(a0VarA, this) != aVar) {
                            h hVar4 = fVar.f179789e;
                            pt1.k kVar4 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                            this.f179779b = 7;
                        }
                    } else {
                        arrayListD1 = p13.h0.d1(fVar.f179787c.getValue().f140806d);
                        it = arrayListD1.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            xVar = (pt1.x) next;
                            if (xVar != null) {
                                arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                            }
                            z1Var2 = fVar.f179788d;
                            bool = Boolean.TRUE;
                            this.f179778a = arrayListD1;
                            this.f179779b = 3;
                            if (z1Var2.emit(bool, this) != aVar) {
                                z1Var3 = fVar.f179787c;
                                a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                                this.f179778a = null;
                                this.f179779b = 4;
                                if (z1Var3.emit(a0VarA2, this) != aVar) {
                                    h hVar5 = fVar.f179789e;
                                    pt1.k kVar5 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                    this.f179778a = null;
                                    this.f179779b = 5;
                                }
                            }
                            break;
                        } while (((pt1.x) next).f141004a != j8);
                        xVar = (pt1.x) next;
                        if (xVar != null) {
                            arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                        }
                        z1Var2 = fVar.f179788d;
                        bool = Boolean.TRUE;
                        this.f179778a = arrayListD1;
                        this.f179779b = 3;
                        if (z1Var2.emit(bool, this) != aVar) {
                            z1Var3 = fVar.f179787c;
                            a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                            this.f179778a = null;
                            this.f179779b = 4;
                            if (z1Var3.emit(a0VarA2, this) != aVar) {
                                h hVar6 = fVar.f179789e;
                                pt1.k kVar6 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                this.f179778a = null;
                                this.f179779b = 5;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                o13.r.b(obj);
                objQ = obj;
                if (((v2) objQ) instanceof v2.b) {
                    arrayListD1 = p13.h0.d1(fVar.f179787c.getValue().f140806d);
                    it = arrayListD1.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        xVar = (pt1.x) next;
                        if (xVar != null) {
                            arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                        }
                        z1Var2 = fVar.f179788d;
                        bool = Boolean.TRUE;
                        this.f179778a = arrayListD1;
                        this.f179779b = 3;
                        if (z1Var2.emit(bool, this) != aVar) {
                            z1Var3 = fVar.f179787c;
                            a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                            this.f179778a = null;
                            this.f179779b = 4;
                            if (z1Var3.emit(a0VarA2, this) != aVar) {
                                h hVar7 = fVar.f179789e;
                                pt1.k kVar7 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                this.f179778a = null;
                                this.f179779b = 5;
                            }
                        }
                        break;
                    } while (((pt1.x) next).f141004a != j8);
                    xVar = (pt1.x) next;
                    if (xVar != null) {
                        arrayListD1 = p13.h0.y0(arrayListD1, xVar);
                    }
                    z1Var2 = fVar.f179788d;
                    bool = Boolean.TRUE;
                    this.f179778a = arrayListD1;
                    this.f179779b = 3;
                    if (z1Var2.emit(bool, this) != aVar) {
                        z1Var3 = fVar.f179787c;
                        a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                        this.f179778a = null;
                        this.f179779b = 4;
                        if (z1Var3.emit(a0VarA2, this) != aVar) {
                            h hVar8 = fVar.f179789e;
                            pt1.k kVar8 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                            this.f179778a = null;
                            this.f179779b = 5;
                        }
                    }
                    break;
                } else {
                    z1Var = fVar.f179787c;
                    a0VarA = pt1.a0.a(z1Var.getValue(), false, false, true, null, null, null, null, null, null, false, false, 2041);
                    this.f179779b = 6;
                    if (z1Var.emit(a0VarA, this) != aVar) {
                        h hVar9 = fVar.f179789e;
                        pt1.k kVar9 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179779b = 7;
                    }
                    break;
                }
                return aVar;
            case 3:
                arrayListD1 = this.f179778a;
                o13.r.b(obj);
                z1Var3 = fVar.f179787c;
                a0VarA2 = pt1.a0.a(z1Var3.getValue(), false, false, false, i53.a.e(arrayListD1), null, null, null, null, null, false, false, 2037);
                this.f179778a = null;
                this.f179779b = 4;
                if (z1Var3.emit(a0VarA2, this) != aVar) {
                    h hVar10 = fVar.f179789e;
                    pt1.k kVar10 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                    this.f179778a = null;
                    this.f179779b = 5;
                    break;
                }
                return aVar;
            case 4:
                o13.r.b(obj);
                h hVar11 = fVar.f179789e;
                pt1.k kVar11 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                this.f179778a = null;
                this.f179779b = 5;
                break;
            case 5:
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 6:
                o13.r.b(obj);
                h hVar12 = fVar.f179789e;
                pt1.k kVar12 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                this.f179779b = 7;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
