package u21;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel$saveNutritionSettings$1", f = "NutritionSetupViewModel.kt", l = {394, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 408, WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f167895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f167896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f167897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u0 u0Var, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f167897c = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a1(this.f167897c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:101:0x0307  */
    /* JADX WARN: Code duplicated, block: B:34:0x0158  */
    /* JADX WARN: Code duplicated, block: B:85:0x0293 A[PHI: r2
      0x0293: PHI (r2v30 com.garmin.android.apps.connectmobile.v2) = 
      (r2v27 com.garmin.android.apps.connectmobile.v2)
      (r2v27 com.garmin.android.apps.connectmobile.v2)
      (r2v27 com.garmin.android.apps.connectmobile.v2)
      (r2v43 com.garmin.android.apps.connectmobile.v2)
     binds: [B:79:0x0277, B:81:0x0283, B:83:0x0290, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b3 A[PHI: r2
      0x02b3: PHI (r2v31 com.garmin.android.apps.connectmobile.v2) = 
      (r2v30 com.garmin.android.apps.connectmobile.v2)
      (r2v30 com.garmin.android.apps.connectmobile.v2)
      (r2v44 com.garmin.android.apps.connectmobile.v2)
     binds: [B:86:0x02a3, B:88:0x02b0, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02dc  */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d6, code lost:
    
        if (u21.u0.y4(r8, r2, r76) == r1) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Boolean bool;
        l01.h hVar;
        l01.k kVar;
        s21.o oVar;
        Object objB0;
        v2 v2Var;
        Object value;
        s01.c cVar;
        v2 v2Var2;
        p2 p2Var;
        Object value2;
        s21.a0 a0Var;
        Boolean bool2;
        boolean z14;
        o13.p pVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167896b;
        char c14 = 3;
        char c15 = 2;
        u0 u0Var = this.f167897c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objB0 = obj;
            } else {
                if (i14 == 2) {
                    v2Var = this.f167895a;
                    o13.r.b(obj);
                    if (p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                        cVar = u0Var.f168158i;
                        this.f167895a = v2Var;
                        this.f167896b = 3;
                        if (cVar.b(this) != aVar) {
                            v2Var2 = v2Var;
                            if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                                p2Var = u0Var.f168164o;
                                do {
                                    value2 = p2Var.getValue();
                                    a0Var = (s21.a0) value2;
                                    Boolean bool3 = a0Var.f156037b;
                                    bool2 = Boolean.TRUE;
                                    z14 = !p005kotlin.jvm.internal.s.g(bool3, bool2);
                                    if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                        pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                                    } else {
                                        pVar = null;
                                    }
                                } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                                return Unit.INSTANCE;
                            }
                            l01.k kVar2 = (l01.k) ((v2.b) v2Var2).f47386a;
                            this.f167895a = null;
                            this.f167896b = 4;
                        }
                    } else {
                        v2Var2 = v2Var;
                        if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                            p2Var = u0Var.f168164o;
                            do {
                                value2 = p2Var.getValue();
                                a0Var = (s21.a0) value2;
                                Boolean bool4 = a0Var.f156037b;
                                bool2 = Boolean.TRUE;
                                z14 = !p005kotlin.jvm.internal.s.g(bool4, bool2);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                    pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                                } else {
                                    pVar = null;
                                }
                            } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                            return Unit.INSTANCE;
                        }
                        l01.k kVar3 = (l01.k) ((v2.b) v2Var2).f47386a;
                        this.f167895a = null;
                        this.f167896b = 4;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    v2Var = this.f167895a;
                    o13.r.b(obj);
                    v2Var2 = v2Var;
                    if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                        p2Var = u0Var.f168164o;
                        do {
                            value2 = p2Var.getValue();
                            a0Var = (s21.a0) value2;
                            Boolean bool5 = a0Var.f156037b;
                            bool2 = Boolean.TRUE;
                            z14 = !p005kotlin.jvm.internal.s.g(bool5, bool2);
                            if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                            } else {
                                pVar = null;
                            }
                        } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                        return Unit.INSTANCE;
                    }
                    l01.k kVar4 = (l01.k) ((v2.b) v2Var2).f47386a;
                    this.f167895a = null;
                    this.f167896b = 4;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var2 = u0Var.f168164o;
        s01.f fVar = u0Var.f168153d;
        p2 p2Var3 = u0Var.f168164o;
        while (true) {
            Object value3 = p2Var2.getValue();
            if (p2Var2.b(value3, s21.a0.a((s21.a0) value3, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, false, false, null, null, null, null, 0, -16777217, 3))) {
                break;
            }
            c15 = c15;
            c14 = c14;
        }
        List<q01.e> list = u0Var.f168163n;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(og2.k.P((q01.e) it.next()));
        }
        s21.s sVar = ((s21.a0) p2Var3.getValue()).f156041f;
        s21.s sVar2 = s21.s.NO_GOAL;
        if (sVar == sVar2) {
            kVar = new l01.k(sVar2.f156170a, (b63.o) null, (Integer) null, (String) null, (Integer) null, (Boolean) null, (Integer) null, (l01.i) null, (l01.h) null, (Boolean) null, ((s21.a0) p2Var3.getValue()).f156058w.f128594a, ((s21.a0) p2Var3.getValue()).f156059x.f128594a, ((s21.a0) p2Var3.getValue()).E, ((s21.a0) p2Var3.getValue()).F, (Double) null, (Double) null, ((s21.a0) p2Var3.getValue()).G.b(), !arrayList.isEmpty() ? arrayList : null, 50174, (p005kotlin.jvm.internal.j) null);
        } else {
            s21.a0 a0Var2 = (s21.a0) p2Var3.getValue();
            boolean zE = fVar.e();
            a0Var2.getClass();
            s21.e eVar = a0Var2.f156055t;
            String str = a0Var2.f156041f.f156170a;
            b63.o oVar2 = a0Var2.f156048m;
            Float f14 = a0Var2.f156049n;
            if (f14 != null) {
                int iFloatValue = (int) f14.floatValue();
                Integer numValueOf = Integer.valueOf(iFloatValue);
                if (iFloatValue > 0) {
                    num = numValueOf;
                } else {
                    num = null;
                }
            } else {
                num = null;
            }
            l01.a aVar2 = a0Var2.f156051p;
            String str2 = aVar2 != null ? aVar2.f107836a : null;
            Integer num2 = a0Var2.f156052q;
            Integer num3 = (num2 == null || num2.intValue() <= 0) ? null : num2;
            Boolean bool6 = a0Var2.f156053r;
            Integer num4 = a0Var2.f156054s;
            Integer num5 = (num4 == null || num4.intValue() <= 0) ? null : num4;
            l01.i iVar = eVar != null ? new l01.i(eVar.f156097a, eVar.f156098b, eVar.f156099c) : null;
            if (!zE || (oVar = a0Var2.f156056u) == null) {
                bool = bool6;
                hVar = null;
            } else {
                Boolean boolValueOf = Boolean.valueOf(oVar.f156159a);
                List<s21.n> list2 = oVar.f156160b;
                ArrayList arrayList2 = new ArrayList(p13.y.r(list2, 10));
                for (s21.n nVar : list2) {
                    nVar.getClass();
                    boolean z15 = nVar.f156151a;
                    String str3 = nVar.f156153c;
                    String str4 = nVar.f156152b;
                    Boolean bool7 = bool6;
                    Double d14 = nVar.f156154d;
                    arrayList2.add(new l01.g(str3, str4, nVar.f156155e, Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d), z15, Integer.valueOf(nVar.f156156f)));
                    bool6 = bool7;
                }
                bool = bool6;
                hVar = new l01.h(boolValueOf, arrayList2);
            }
            kVar = new l01.k(str, oVar2, num, str2, num3, bool, num5, iVar, hVar, a0Var2.f156057v, a0Var2.f156058w.f128594a, a0Var2.f156059x.f128594a, a0Var2.E, a0Var2.F, a0Var2.f156046k, a0Var2.f156047l, a0Var2.G.b(), !arrayList.isEmpty() ? arrayList : null);
        }
        m01.g gVar = u0Var.f168150a;
        int iB = fVar.b();
        b63.o oVarD = g22.l.d(b63.o.INSTANCE);
        this.f167896b = 1;
        objB0 = gVar.b0(iB, oVarD, kVar, this);
        if (objB0 != aVar) {
        }
        return aVar;
        v2Var = (v2) objB0;
        if (v2Var instanceof v2.b) {
            l01.k kVar5 = (l01.k) ((v2.b) v2Var).f47386a;
            u0Var.f168162m = kVar5;
            d01.c cVar2 = u0Var.f168151b;
            cVar2.d();
            cVar2.f();
            cVar2.k();
            if (u0Var.f168161l && !p005kotlin.jvm.internal.s.g(kVar5.f107878a, s21.s.NO_GOAL.f156170a)) {
                m01.g gVar2 = u0Var.f168150a;
                this.f167895a = v2Var;
                this.f167896b = 2;
                if (gVar2.B(this) != aVar) {
                    if (p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                        cVar = u0Var.f168158i;
                        this.f167895a = v2Var;
                        this.f167896b = 3;
                        if (cVar.b(this) != aVar) {
                            v2Var2 = v2Var;
                            if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                                l01.k kVar6 = (l01.k) ((v2.b) v2Var2).f47386a;
                                this.f167895a = null;
                                this.f167896b = 4;
                            } else {
                                p2Var = u0Var.f168164o;
                                do {
                                    value2 = p2Var.getValue();
                                    a0Var = (s21.a0) value2;
                                    Boolean bool8 = a0Var.f156037b;
                                    bool2 = Boolean.TRUE;
                                    z14 = !p005kotlin.jvm.internal.s.g(bool8, bool2);
                                    if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                        pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                                    } else {
                                        pVar = null;
                                    }
                                } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                            }
                        }
                    } else {
                        v2Var2 = v2Var;
                        if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                            l01.k kVar7 = (l01.k) ((v2.b) v2Var2).f47386a;
                            this.f167895a = null;
                            this.f167896b = 4;
                        } else {
                            p2Var = u0Var.f168164o;
                            do {
                                value2 = p2Var.getValue();
                                a0Var = (s21.a0) value2;
                                Boolean bool9 = a0Var.f156037b;
                                bool2 = Boolean.TRUE;
                                z14 = !p005kotlin.jvm.internal.s.g(bool9, bool2);
                                if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                    pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                                } else {
                                    pVar = null;
                                }
                            } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                        }
                    }
                }
            } else if (p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                cVar = u0Var.f168158i;
                this.f167895a = v2Var;
                this.f167896b = 3;
                if (cVar.b(this) != aVar) {
                    v2Var2 = v2Var;
                    if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                        l01.k kVar8 = (l01.k) ((v2.b) v2Var2).f47386a;
                        this.f167895a = null;
                        this.f167896b = 4;
                    } else {
                        p2Var = u0Var.f168164o;
                        do {
                            value2 = p2Var.getValue();
                            a0Var = (s21.a0) value2;
                            Boolean bool10 = a0Var.f156037b;
                            bool2 = Boolean.TRUE;
                            z14 = !p005kotlin.jvm.internal.s.g(bool10, bool2);
                            if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                                pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                            } else {
                                pVar = null;
                            }
                        } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                    }
                }
            } else {
                v2Var2 = v2Var;
                if (!p005kotlin.jvm.internal.s.g(((s21.a0) u0Var.f168164o.getValue()).f156037b, Boolean.FALSE)) {
                    l01.k kVar9 = (l01.k) ((v2.b) v2Var2).f47386a;
                    this.f167895a = null;
                    this.f167896b = 4;
                } else {
                    p2Var = u0Var.f168164o;
                    do {
                        value2 = p2Var.getValue();
                        a0Var = (s21.a0) value2;
                        Boolean bool11 = a0Var.f156037b;
                        bool2 = Boolean.TRUE;
                        z14 = !p005kotlin.jvm.internal.s.g(bool11, bool2);
                        if (p005kotlin.jvm.internal.s.g(a0Var.f156037b, bool2)) {
                            pVar = new o13.p(bool2, ((v2.b) v2Var2).f47386a);
                        } else {
                            pVar = null;
                        }
                    } while (!p2Var.b(value2, s21.a0.a(a0Var, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, z14, pVar, null, null, null, 0, -889192449, 3)));
                }
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        p2 p2Var4 = u0Var.f168164o;
        do {
            value = p2Var4.getValue();
        } while (!p2Var4.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, s21.y.SETTINGS, false, false, null, null, null, null, 0, -83886081, 3)));
        return Unit.INSTANCE;
    }
}
