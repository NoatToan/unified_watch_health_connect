package w51;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$loadBySummary$3", f = "PendingActivityDetailsViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 208, 216}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f182432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f182433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f182434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f182435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f182436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f182437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z51.h f182438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f182439h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lam/x0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivityDetailsViewModel$loadBySummary$3$noGpsTypesDeferred$1", f = "PendingActivityDetailsViewModel.kt", l = {201}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends am.x0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f182440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f182441b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f182441b = q0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f182441b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends am.x0>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f182440a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f182440a = 1;
                Object objY4 = q0.y4(this.f182441b, this);
                return objY4 == aVar ? aVar : objY4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(q0 q0Var, z51.h hVar, String str, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f182437f = q0Var;
        this.f182438g = hVar;
        this.f182439h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u0 u0Var = new u0(this.f182437f, this.f182438g, this.f182439h, dVar);
        u0Var.f182436e = obj;
        return u0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b5 A[PHI: r3
      0x00b5: PHI (r3v9 java.lang.Object) = (r3v4 java.lang.Object), (r3v27 java.lang.Object) binds: [B:23:0x00b1, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    /* JADX WARN: Code duplicated, block: B:31:0x010a  */
    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0176  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    /* JADX WARN: Code duplicated, block: B:51:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0193  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0265  */
    /* JADX WARN: Code duplicated, block: B:87:0x0269 A[LOOP:4: B:41:0x011e->B:87:0x0269, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x0270 A[LOOP:3: B:26:0x00c2->B:90:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0101 A[EDGE_INSN: B:98:0x0101->B:28:0x0101 BREAK  A[LOOP:3: B:26:0x00c2->B:90:0x0270], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0161 A[EDGE_INSN: B:99:0x0161->B:43:0x0161 BREAK  A[LOOP:4: B:41:0x011e->B:87:0x0269], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r12 == r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.j0 j0VarJ;
        Object objX4;
        Object objAwait;
        Object value;
        p2 p2Var;
        boolean zC4;
        Object value2;
        boolean z14;
        b63.o oVar;
        fz0.c cVarA;
        boolean z15;
        Object value3;
        boolean z16;
        Object objA;
        boolean z17;
        ?? r15;
        v2 v2Var;
        p2 p2Var2;
        Object value4;
        z51.a aVar;
        i53.c cVarE;
        boolean z18;
        p2 p2Var3;
        Object value5;
        p0 p0Var;
        Iterator it;
        Object next;
        boolean z19;
        z51.d dVar;
        boolean z24;
        o53.b0 b0Var = (o53.b0) this.f182436e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f182435d;
        String str = this.f182439h;
        z51.h hVar = this.f182438g;
        q0 q0Var = this.f182437f;
        if (i14 == 0) {
            o13.r.b(obj);
            j0VarJ = ge1.b.j(b0Var, null, null, new a(q0Var, null), 3);
            if (q0Var.f182382m) {
                b63.u uVar = hVar.f202512h;
                b63.u uVar2 = hVar.f202513i;
                this.f182436e = b0Var;
                this.f182432a = j0VarJ;
                this.f182435d = 1;
                objX4 = q0.x4(q0Var, uVar, uVar2, this);
            } else {
                this.f182436e = b0Var;
                this.f182432a = null;
                this.f182435d = 2;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar2) {
                    int i15 = q0.f182369n;
                    q0Var.getClass();
                    p2Var = q0Var.f182375f;
                    zC4 = q0.C4(str, (List) objAwait);
                    while (true) {
                        value2 = p2Var.getValue();
                        z14 = zC4;
                        if (p2Var.b(value2, p0.a((p0) value2, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, zC4, null, false, null, false, false, false, false, 16711679))) {
                            break;
                            break;
                        }
                        zC4 = z14;
                    }
                    oVar = hVar.f202506b;
                    if (oVar != null) {
                        cVarA = fz0.d.a(oVar);
                    } else {
                        cVarA = null;
                    }
                    if (cVarA != null) {
                        if (!hVar.f202515k) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        while (true) {
                            value3 = p2Var.getValue();
                            z16 = z15;
                            if (p2Var.b(value3, p0.a((p0) value3, null, null, null, null, null, null, null, null, 0.0d, false, z15, false, false, false, false, false, null, q0Var.f182382m, null, false, false, false, false, 16514047))) {
                                break;
                                break;
                            }
                            z15 = z16 ? 1 : 0;
                        }
                        y51.a aVar3 = q0Var.f182370a;
                        String str2 = hVar.f202505a;
                        this.f182436e = b0Var;
                        this.f182432a = null;
                        this.f182433b = z14;
                        this.f182434c = z16 ? 1 : 0;
                        this.f182435d = 3;
                        objA = aVar3.a(str2, cVarA, this);
                        if (objA != aVar2) {
                            z17 = z14;
                            r15 = z16;
                            v2Var = (v2) objA;
                            if (v2Var instanceof v2.b) {
                                aVar = (z51.a) ((v2.b) v2Var).f47386a;
                                cVarE = i53.a.e(aVar.f202466c);
                                u51.c cVar = q0Var.f182373d;
                                if (z17) {
                                    z18 = true;
                                } else {
                                    z18 = true;
                                }
                                boolean zA = cVar.a(z18);
                                p2Var3 = q0Var.f182375f;
                                do {
                                    value5 = p2Var3.getValue();
                                    p0Var = (p0) value5;
                                    it = cVarE.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (((z51.c) next).f202485b == null);
                                    if (next != null) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (r15 != 0) {
                                        dVar = aVar.f202465b;
                                    } else {
                                        dVar = null;
                                    }
                                    if (!hVar.f202515k) {
                                        z24 = false;
                                    } else {
                                        z24 = false;
                                    }
                                } while (!p2Var3.b(value5, p0.a(p0Var, null, null, null, dVar, null, null, null, null, 0.0d, false, false, false, false, false, false, false, cVarE, false, null, z19, false, false, z24, 6945783)));
                            } else {
                                if (!(v2Var instanceof v2.a)) {
                                    lc.u0.r();
                                    return null;
                                }
                                a2 a2Var = a2.PENDING_ACTIVITIES;
                                String strN = fb1.c.n("fetchCompletePendingActivity: ", ((v2.a) v2Var).f47383a.getMessage());
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "PendingActivityDetailsViewModel", strN);
                                p2Var2 = q0Var.f182375f;
                                do {
                                    value4 = p2Var2.getValue();
                                } while (!p2Var2.b(value4, p0.a((p0) value4, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, true, false, 12319231)));
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar2;
        }
        if (i14 == 1) {
            j0VarJ = this.f182432a;
            o13.r.b(obj);
            objX4 = obj;
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                objAwait = obj;
                int i16 = q0.f182369n;
                q0Var.getClass();
                p2Var = q0Var.f182375f;
                zC4 = q0.C4(str, (List) objAwait);
                while (true) {
                    value2 = p2Var.getValue();
                    z14 = zC4;
                    if (p2Var.b(value2, p0.a((p0) value2, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, zC4, null, false, null, false, false, false, false, 16711679))) {
                        break;
                    }
                    zC4 = z14;
                }
                oVar = hVar.f202506b;
                if (oVar != null) {
                    cVarA = fz0.d.a(oVar);
                } else {
                    cVarA = null;
                }
                if (cVarA != null) {
                    if (!hVar.f202515k && hVar.f202516l && q0Var.f182381l) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    while (true) {
                        value3 = p2Var.getValue();
                        z16 = z15;
                        if (p2Var.b(value3, p0.a((p0) value3, null, null, null, null, null, null, null, null, 0.0d, false, z15, false, false, false, false, false, null, q0Var.f182382m, null, false, false, false, false, 16514047))) {
                            break;
                        }
                        z15 = z16 ? 1 : 0;
                    }
                    y51.a aVar4 = q0Var.f182370a;
                    String str3 = hVar.f202505a;
                    this.f182436e = b0Var;
                    this.f182432a = null;
                    this.f182433b = z14;
                    this.f182434c = z16 ? 1 : 0;
                    this.f182435d = 3;
                    objA = aVar4.a(str3, cVarA, this);
                    if (objA != aVar2) {
                        z17 = z14;
                        r15 = z16;
                    }
                    return aVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = this.f182434c;
            z17 = this.f182433b;
            o13.r.b(obj);
            r15 = i17;
            objA = obj;
        }
        v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            aVar = (z51.a) ((v2.b) v2Var).f47386a;
            cVarE = i53.a.e(aVar.f202466c);
            u51.c cVar2 = q0Var.f182373d;
            if (z17 || str == null) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zA2 = cVar2.a(z18);
            p2Var3 = q0Var.f182375f;
            do {
                value5 = p2Var3.getValue();
                p0Var = (p0) value5;
                it = cVarE.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((z51.c) next).f202485b == null);
                if (next != null) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (r15 != 0) {
                    dVar = aVar.f202465b;
                } else {
                    dVar = null;
                }
                if (!hVar.f202515k && q0Var.f182381l && zA2) {
                    z24 = true;
                } else {
                    z24 = false;
                }
            } while (!p2Var3.b(value5, p0.a(p0Var, null, null, null, dVar, null, null, null, null, 0.0d, false, false, false, false, false, false, false, cVarE, false, null, z19, false, false, z24, 6945783)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            a2 a2Var2 = a2.PENDING_ACTIVITIES;
            String strN2 = fb1.c.n("fetchCompletePendingActivity: ", ((v2.a) v2Var).f47383a.getMessage());
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "PendingActivityDetailsViewModel", strN2);
            p2Var2 = q0Var.f182375f;
            do {
                value4 = p2Var2.getValue();
            } while (!p2Var2.b(value4, p0.a((p0) value4, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, true, false, 12319231)));
        }
        return Unit.INSTANCE;
        o53.j0 j0Var = j0VarJ;
        gs1.t tVar = (gs1.t) objX4;
        p2 p2Var4 = q0Var.f182375f;
        do {
            value = p2Var4.getValue();
        } while (!p2Var4.b(value, p0.a((p0) value, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, tVar, false, false, false, false, 16252927)));
        j0VarJ = j0Var;
        this.f182436e = b0Var;
        this.f182432a = null;
        this.f182435d = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar2) {
            int i18 = q0.f182369n;
            q0Var.getClass();
            p2Var = q0Var.f182375f;
            zC4 = q0.C4(str, (List) objAwait);
            while (true) {
                value2 = p2Var.getValue();
                z14 = zC4;
                if (p2Var.b(value2, p0.a((p0) value2, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, zC4, null, false, null, false, false, false, false, 16711679))) {
                    break;
                    break;
                }
                zC4 = z14;
            }
            oVar = hVar.f202506b;
            if (oVar != null) {
                cVarA = fz0.d.a(oVar);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                if (!hVar.f202515k) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                while (true) {
                    value3 = p2Var.getValue();
                    z16 = z15;
                    if (p2Var.b(value3, p0.a((p0) value3, null, null, null, null, null, null, null, null, 0.0d, false, z15, false, false, false, false, false, null, q0Var.f182382m, null, false, false, false, false, 16514047))) {
                        break;
                        break;
                    }
                    z15 = z16 ? 1 : 0;
                }
                y51.a aVar5 = q0Var.f182370a;
                String str4 = hVar.f202505a;
                this.f182436e = b0Var;
                this.f182432a = null;
                this.f182433b = z14;
                this.f182434c = z16 ? 1 : 0;
                this.f182435d = 3;
                objA = aVar5.a(str4, cVarA, this);
                if (objA != aVar2) {
                    z17 = z14;
                    r15 = z16;
                    v2Var = (v2) objA;
                    if (v2Var instanceof v2.b) {
                        aVar = (z51.a) ((v2.b) v2Var).f47386a;
                        cVarE = i53.a.e(aVar.f202466c);
                        u51.c cVar3 = q0Var.f182373d;
                        if (z17) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        boolean zA3 = cVar3.a(z18);
                        p2Var3 = q0Var.f182375f;
                        do {
                            value5 = p2Var3.getValue();
                            p0Var = (p0) value5;
                            it = cVarE.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (((z51.c) next).f202485b == null);
                            if (next != null) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (r15 != 0) {
                                dVar = aVar.f202465b;
                            } else {
                                dVar = null;
                            }
                            if (!hVar.f202515k) {
                                z24 = false;
                            } else {
                                z24 = false;
                            }
                        } while (!p2Var3.b(value5, p0.a(p0Var, null, null, null, dVar, null, null, null, null, 0.0d, false, false, false, false, false, false, false, cVarE, false, null, z19, false, false, z24, 6945783)));
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            lc.u0.r();
                            return null;
                        }
                        a2 a2Var3 = a2.PENDING_ACTIVITIES;
                        String strN3 = fb1.c.n("fetchCompletePendingActivity: ", ((v2.a) v2Var).f47383a.getMessage());
                        i2.f36769a.getClass();
                        i2.a.b(a2Var3, "PendingActivityDetailsViewModel", strN3);
                        p2Var2 = q0Var.f182375f;
                        do {
                            value4 = p2Var2.getValue();
                        } while (!p2Var2.b(value4, p0.a((p0) value4, null, null, null, null, null, null, null, null, 0.0d, false, false, false, false, false, false, false, null, false, null, false, false, true, false, 12319231)));
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
