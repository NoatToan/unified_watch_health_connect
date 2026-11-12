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
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.DeleteTrailDetailsReviewUseCase$deleteTrailReview$2", f = "DeleteTrailDetailsReviewUseCase.kt", l = {29, 30, 40, 50, 55, 62, 68}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f179758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f179760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f179761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f179762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f179763f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, long j8, Context context, e23.a<Unit> aVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f179760c = dVar;
        this.f179761d = j8;
        this.f179762e = context;
        this.f179763f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f179760c, this.f179761d, this.f179762e, this.f179763f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[PHI: r2
      0x0071: PHI (r2v6 com.garmin.android.apps.connectmobile.v2) = (r2v4 com.garmin.android.apps.connectmobile.v2), (r2v17 com.garmin.android.apps.connectmobile.v2) binds: [B:17:0x006d, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
    
        if (r2.a(r8, r37) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c3, code lost:
    
        if (r2.a(r8, r37) == r1) goto L76;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        v2 v2Var;
        z1<pt1.w> z1Var;
        pt1.w wVarA;
        z1<pt1.w> z1Var2;
        pt1.w wVarA2;
        i53.c<pt1.x> cVar;
        ArrayList arrayListY0;
        pt1.x xVar;
        z1<pt1.w> z1Var3;
        i53.c cVarE;
        pt1.w wVarA3;
        Iterator it;
        Object next;
        i53.c<pt1.x> cVar2;
        ArrayList arrayListY1;
        pt1.x xVar2;
        z1<pt1.o> z1Var4;
        i53.c cVarE2;
        pt1.o oVarA;
        Iterator it3;
        Object next2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179759b;
        Context context = this.f179762e;
        long j8 = this.f179761d;
        d dVar = this.f179760c;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                ss1.a0 a0Var = dVar.f179770a;
                this.f179759b = 1;
                objQ = a0Var.Q(j8, this);
                if (objQ != aVar) {
                    v2Var = (v2) objQ;
                    z1Var = dVar.f179772c;
                    wVarA = pt1.w.a(z1Var.getValue(), false, true, null, false, false, false, 125);
                    this.f179758a = v2Var;
                    this.f179759b = 2;
                    if (z1Var.emit(wVarA, this) != aVar) {
                        if (v2Var instanceof v2.b) {
                            z1Var2 = dVar.f179772c;
                            wVarA2 = pt1.w.a(z1Var2.getValue(), false, false, null, false, false, true, 61);
                            this.f179758a = null;
                            this.f179759b = 6;
                            if (z1Var2.emit(wVarA2, this) != aVar) {
                                h hVar = dVar.f179774e;
                                pt1.k kVar = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                                this.f179758a = null;
                                this.f179759b = 7;
                            }
                        } else {
                            cVar = dVar.f179772c.getValue().f141000d;
                            if (cVar != null) {
                                arrayListY0 = new ArrayList(cVar);
                            } else {
                                arrayListY0 = null;
                            }
                            if (arrayListY0 != null) {
                                it = arrayListY0.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    xVar = (pt1.x) next;
                                } while (((pt1.x) next).f141004a != j8);
                                xVar = (pt1.x) next;
                            } else {
                                xVar = null;
                            }
                            if (xVar != null) {
                                arrayListY0 = p13.h0.y0(arrayListY0, xVar);
                            }
                            z1Var3 = dVar.f179772c;
                            pt1.w value = z1Var3.getValue();
                            if (arrayListY0 != null) {
                                cVarE = i53.a.e(arrayListY0);
                            } else {
                                cVarE = null;
                            }
                            wVarA3 = pt1.w.a(value, false, false, cVarE, false, false, false, 117);
                            this.f179758a = null;
                            this.f179759b = 3;
                            if (z1Var3.emit(wVarA3, this) != aVar) {
                                cVar2 = dVar.f179773d.getValue().f140919q;
                                if (cVar2 != null) {
                                    arrayListY1 = new ArrayList(cVar2);
                                } else {
                                    arrayListY1 = null;
                                }
                                if (arrayListY1 != null) {
                                    it3 = arrayListY1.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                        } else {
                                            next2 = null;
                                        }
                                        xVar2 = (pt1.x) next2;
                                    } while (((pt1.x) next2).f141004a != j8);
                                    xVar2 = (pt1.x) next2;
                                } else {
                                    xVar2 = null;
                                }
                                if (xVar2 != null) {
                                    arrayListY1 = p13.h0.y0(arrayListY1, xVar2);
                                }
                                z1Var4 = dVar.f179773d;
                                pt1.o value2 = z1Var4.getValue();
                                if (arrayListY1 != null) {
                                    cVarE2 = i53.a.e(arrayListY1);
                                } else {
                                    cVarE2 = null;
                                }
                                oVarA = pt1.o.a(value2, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE2, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                                this.f179758a = null;
                                this.f179759b = 4;
                                if (z1Var4.emit(oVarA, this) != aVar) {
                                    h hVar2 = dVar.f179774e;
                                    pt1.k kVar2 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                    this.f179758a = null;
                                    this.f179759b = 5;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                objQ = obj;
                v2Var = (v2) objQ;
                z1Var = dVar.f179772c;
                wVarA = pt1.w.a(z1Var.getValue(), false, true, null, false, false, false, 125);
                this.f179758a = v2Var;
                this.f179759b = 2;
                if (z1Var.emit(wVarA, this) != aVar) {
                    if (v2Var instanceof v2.b) {
                        z1Var2 = dVar.f179772c;
                        wVarA2 = pt1.w.a(z1Var2.getValue(), false, false, null, false, false, true, 61);
                        this.f179758a = null;
                        this.f179759b = 6;
                        if (z1Var2.emit(wVarA2, this) != aVar) {
                            h hVar3 = dVar.f179774e;
                            pt1.k kVar3 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                            this.f179758a = null;
                            this.f179759b = 7;
                        }
                    } else {
                        cVar = dVar.f179772c.getValue().f141000d;
                        if (cVar != null) {
                            arrayListY0 = new ArrayList(cVar);
                        } else {
                            arrayListY0 = null;
                        }
                        if (arrayListY0 != null) {
                            it = arrayListY0.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                xVar = (pt1.x) next;
                            } while (((pt1.x) next).f141004a != j8);
                            xVar = (pt1.x) next;
                        } else {
                            xVar = null;
                        }
                        if (xVar != null) {
                            arrayListY0 = p13.h0.y0(arrayListY0, xVar);
                        }
                        z1Var3 = dVar.f179772c;
                        pt1.w value3 = z1Var3.getValue();
                        if (arrayListY0 != null) {
                            cVarE = i53.a.e(arrayListY0);
                        } else {
                            cVarE = null;
                        }
                        wVarA3 = pt1.w.a(value3, false, false, cVarE, false, false, false, 117);
                        this.f179758a = null;
                        this.f179759b = 3;
                        if (z1Var3.emit(wVarA3, this) != aVar) {
                            cVar2 = dVar.f179773d.getValue().f140919q;
                            if (cVar2 != null) {
                                arrayListY1 = new ArrayList(cVar2);
                            } else {
                                arrayListY1 = null;
                            }
                            if (arrayListY1 != null) {
                                it3 = arrayListY1.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                    } else {
                                        next2 = null;
                                    }
                                    xVar2 = (pt1.x) next2;
                                } while (((pt1.x) next2).f141004a != j8);
                                xVar2 = (pt1.x) next2;
                            } else {
                                xVar2 = null;
                            }
                            if (xVar2 != null) {
                                arrayListY1 = p13.h0.y0(arrayListY1, xVar2);
                            }
                            z1Var4 = dVar.f179773d;
                            pt1.o value4 = z1Var4.getValue();
                            if (arrayListY1 != null) {
                                cVarE2 = i53.a.e(arrayListY1);
                            } else {
                                cVarE2 = null;
                            }
                            oVarA = pt1.o.a(value4, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE2, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                            this.f179758a = null;
                            this.f179759b = 4;
                            if (z1Var4.emit(oVarA, this) != aVar) {
                                h hVar4 = dVar.f179774e;
                                pt1.k kVar4 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                                this.f179758a = null;
                                this.f179759b = 5;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                v2Var = this.f179758a;
                o13.r.b(obj);
                if (v2Var instanceof v2.b) {
                    cVar = dVar.f179772c.getValue().f141000d;
                    if (cVar != null) {
                        arrayListY0 = new ArrayList(cVar);
                    } else {
                        arrayListY0 = null;
                    }
                    if (arrayListY0 != null) {
                        it = arrayListY0.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            xVar = (pt1.x) next;
                        } while (((pt1.x) next).f141004a != j8);
                        xVar = (pt1.x) next;
                    } else {
                        xVar = null;
                    }
                    if (xVar != null) {
                        arrayListY0 = p13.h0.y0(arrayListY0, xVar);
                    }
                    z1Var3 = dVar.f179772c;
                    pt1.w value5 = z1Var3.getValue();
                    if (arrayListY0 != null) {
                        cVarE = i53.a.e(arrayListY0);
                    } else {
                        cVarE = null;
                    }
                    wVarA3 = pt1.w.a(value5, false, false, cVarE, false, false, false, 117);
                    this.f179758a = null;
                    this.f179759b = 3;
                    if (z1Var3.emit(wVarA3, this) != aVar) {
                        cVar2 = dVar.f179773d.getValue().f140919q;
                        if (cVar2 != null) {
                            arrayListY1 = new ArrayList(cVar2);
                        } else {
                            arrayListY1 = null;
                        }
                        if (arrayListY1 != null) {
                            it3 = arrayListY1.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                } else {
                                    next2 = null;
                                }
                                xVar2 = (pt1.x) next2;
                            } while (((pt1.x) next2).f141004a != j8);
                            xVar2 = (pt1.x) next2;
                        } else {
                            xVar2 = null;
                        }
                        if (xVar2 != null) {
                            arrayListY1 = p13.h0.y0(arrayListY1, xVar2);
                        }
                        z1Var4 = dVar.f179773d;
                        pt1.o value6 = z1Var4.getValue();
                        if (arrayListY1 != null) {
                            cVarE2 = i53.a.e(arrayListY1);
                        } else {
                            cVarE2 = null;
                        }
                        oVarA = pt1.o.a(value6, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE2, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                        this.f179758a = null;
                        this.f179759b = 4;
                        if (z1Var4.emit(oVarA, this) != aVar) {
                            h hVar5 = dVar.f179774e;
                            pt1.k kVar5 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                            this.f179758a = null;
                            this.f179759b = 5;
                        }
                    }
                    break;
                } else {
                    z1Var2 = dVar.f179772c;
                    wVarA2 = pt1.w.a(z1Var2.getValue(), false, false, null, false, false, true, 61);
                    this.f179758a = null;
                    this.f179759b = 6;
                    if (z1Var2.emit(wVarA2, this) != aVar) {
                        h hVar6 = dVar.f179774e;
                        pt1.k kVar6 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                        this.f179758a = null;
                        this.f179759b = 7;
                    }
                    break;
                }
                return aVar;
            case 3:
                o13.r.b(obj);
                cVar2 = dVar.f179773d.getValue().f140919q;
                if (cVar2 != null) {
                    arrayListY1 = new ArrayList(cVar2);
                } else {
                    arrayListY1 = null;
                }
                if (arrayListY1 != null) {
                    it3 = arrayListY1.iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                        } else {
                            next2 = null;
                        }
                        xVar2 = (pt1.x) next2;
                    } while (((pt1.x) next2).f141004a != j8);
                    xVar2 = (pt1.x) next2;
                } else {
                    xVar2 = null;
                }
                if (xVar2 != null) {
                    arrayListY1 = p13.h0.y0(arrayListY1, xVar2);
                }
                z1Var4 = dVar.f179773d;
                pt1.o value7 = z1Var4.getValue();
                if (arrayListY1 != null) {
                    cVarE2 = i53.a.e(arrayListY1);
                } else {
                    cVarE2 = null;
                }
                oVarA = pt1.o.a(value7, false, null, false, false, 0, false, false, null, 0, false, null, null, null, cVarE2, null, null, null, null, null, null, null, false, false, false, false, false, 1073676287);
                this.f179758a = null;
                this.f179759b = 4;
                if (z1Var4.emit(oVarA, this) != aVar) {
                    h hVar7 = dVar.f179774e;
                    pt1.k kVar7 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                    this.f179758a = null;
                    this.f179759b = 5;
                    break;
                }
                return aVar;
            case 4:
                o13.r.b(obj);
                h hVar8 = dVar.f179774e;
                pt1.k kVar8 = new pt1.k(context.getString(R.string.review_deleted_confirmation_message), null, null, 6, null);
                this.f179758a = null;
                this.f179759b = 5;
                break;
            case 5:
                o13.r.b(obj);
                this.f179763f.invoke();
                return Unit.INSTANCE;
            case 6:
                o13.r.b(obj);
                h hVar9 = dVar.f179774e;
                pt1.k kVar9 = new pt1.k(context.getString(R.string.txt_error_occurred), null, null, 6, null);
                this.f179758a = null;
                this.f179759b = 7;
                break;
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
