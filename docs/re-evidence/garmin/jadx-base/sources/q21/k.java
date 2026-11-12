package q21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import s21.e0;
import v01.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq21/k;", "Landroidx/lifecycle/u1;", "Lb63/v;", "timelineStartTime", "timelineEndTime", "Lv01/p0;", "getMealsUseCase", "Lm01/g;", "nutritionRepository", "Ld01/c;", "nutritionStore", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lb63/v;Lb63/v;Lv01/p0;Lm01/g;Ld01/c;Ls01/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f142245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m01.g f142246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d01.c f142247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s01.f f142248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f142249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f142251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f142252h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq21/p;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.settings.viewmodel.LegacyMealWindowsAndTimelineViewModel$uiState$1", f = "LegacyMealWindowsAndTimelineViewModel.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super p>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142253a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super p> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142253a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f142253a = 1;
                if (k.x4(k.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public k(v vVar, v vVar2, p0 p0Var, m01.g gVar, d01.c cVar, s01.f fVar) {
        vVar.getClass();
        vVar2.getClass();
        p0Var.getClass();
        gVar.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f142245a = p0Var;
        this.f142246b = gVar;
        this.f142247c = cVar;
        this.f142248d = fVar;
        boolean zA = fVar.a();
        this.f142250f = zA;
        e0 e0Var = new e0(vVar, null, null, null, 14, null);
        v21.f.f175333a.getClass();
        p2 p2VarA = q2.a(new p(false, zA, null, false, false, false, null, e0Var, new e0(vVar2, v21.f.u(vVar), null, null, 12, null), 125, null));
        this.f142251g = p2VarA;
        r53.v vVar3 = new r53.v(new a(null), r53.s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f142252h = r53.s.K(vVar3, aVarA, k2.a.f150706c, new p(true, zA, null, false, false, false, null, new e0(vVar, null, null, null, 14, null), new e0(vVar2, v21.f.u(vVar), null, null, 12, null), 124, null));
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0138 A[PHI: r4
      0x0138: PHI (r4v6 b63.v) = (r4v5 b63.v), (r4v29 b63.v) binds: [B:45:0x00f2, B:64:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0175  */
    /* JADX WARN: Code duplicated, block: B:83:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x017c  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0189  */
    /* JADX WARN: Code duplicated, block: B:91:0x018c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191 A[PHI: r4
      0x0191: PHI (r4v8 b63.v) = (r4v7 b63.v), (r4v15 b63.v) binds: [B:67:0x013c, B:92:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(k kVar, v13.c cVar) {
        g gVar;
        Object value;
        Object value2;
        Iterable iterable;
        Object value3;
        v vVar;
        v vVar2;
        boolean z14;
        Iterator<T> it;
        Object next;
        int i14;
        Object next2;
        p2 p2Var = kVar.f142251g;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i15 = gVar.f142238c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f142238c = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(kVar, cVar);
            }
        } else {
            gVar = new g(kVar, cVar);
        }
        Object objA = gVar.f142236a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f142238c;
        if (i16 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, p.a((p) value, true, null, false, false, false, null, null, null, 510)));
            p0 p0Var = kVar.f142245a;
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            gVar.f142238c = 1;
            objA = p0.a(p0Var, oVarD, false, gVar, 6);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            z zVar = (z) ((v2.b) v2Var).f47386a;
            kVar.f142249e = zVar;
            if (zVar == null || (iterable = zVar.f74294a) == null) {
                iterable = j0.f134944a;
            }
            ArrayList arrayListY0 = h0.y0(b11.g.f14291i, b11.g.SNACKS);
            ArrayList arrayList = new ArrayList(y.r(arrayListY0, 10));
            Iterator it3 = arrayListY0.iterator();
            while (it3.hasNext()) {
                arrayList.add(((b11.g) it3.next()).f14292a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                if (h0.R(arrayList, ((x) obj).f74276c)) {
                    arrayList2.add(obj);
                }
            }
            List<x> listN0 = h0.N0(arrayList2, new f());
            ArrayList arrayList3 = new ArrayList();
            for (x xVar : listN0) {
                Long l14 = xVar.f74274a;
                String str = xVar.f74276c;
                o21.f fVar = null;
                if (l14 != null && str != null) {
                    v vVar3 = xVar.f74278e;
                    if (vVar3 == null) {
                        b11.g.f14285c.getClass();
                        Iterator<T> it4 = b11.g.f14291i.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                        } while (!p005kotlin.jvm.internal.s.g(((b11.g) next2).f14292a, str));
                        b11.g gVar2 = (b11.g) next2;
                        int i17 = gVar2 == null ? -1 : b11.g.a.C0206a.f14294a[gVar2.ordinal()];
                        if (i17 == 1) {
                            vVar3 = v21.d.f175309m;
                        } else if (i17 != 2) {
                            vVar3 = i17 != 3 ? null : v21.d.f175315s;
                        } else {
                            vVar3 = v21.d.f175312p;
                        }
                        if (vVar3 != null) {
                            vVar = vVar3;
                            vVar2 = xVar.f74279f;
                            if (vVar2 == null) {
                                b11.g.a aVar2 = b11.g.f14285c;
                                z14 = kVar.f142250f;
                                aVar2.getClass();
                                it = b11.g.f14291i.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!p005kotlin.jvm.internal.s.g(((b11.g) next).f14292a, str));
                                b11.g gVar3 = (b11.g) next;
                                i14 = gVar3 != null ? b11.g.a.C0206a.f14294a[gVar3.ordinal()] : -1;
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            vVar2 = null;
                                        } else if (z14) {
                                            vVar2 = v21.d.f175317u;
                                        } else {
                                            vVar2 = v21.d.f175316t;
                                        }
                                    } else if (z14) {
                                        vVar2 = v21.d.f175314r;
                                    } else {
                                        vVar2 = v21.d.f175313q;
                                    }
                                } else if (z14) {
                                    vVar2 = v21.d.f175311o;
                                } else {
                                    vVar2 = v21.d.f175310n;
                                }
                                if (vVar2 != null) {
                                    fVar = new o21.f(xVar.f74274a.longValue(), xVar.f74276c, vVar, vVar2, null, 16, null);
                                }
                            } else {
                                fVar = new o21.f(xVar.f74274a.longValue(), xVar.f74276c, vVar, vVar2, null, 16, null);
                            }
                        }
                    } else {
                        vVar = vVar3;
                        vVar2 = xVar.f74279f;
                        if (vVar2 == null) {
                            b11.g.a aVar3 = b11.g.f14285c;
                            z14 = kVar.f142250f;
                            aVar3.getClass();
                            it = b11.g.f14291i.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!p005kotlin.jvm.internal.s.g(((b11.g) next).f14292a, str));
                            b11.g gVar4 = (b11.g) next;
                            if (gVar4 != null) {
                            }
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        vVar2 = null;
                                    } else if (z14) {
                                        vVar2 = v21.d.f175317u;
                                    } else {
                                        vVar2 = v21.d.f175316t;
                                    }
                                } else if (z14) {
                                    vVar2 = v21.d.f175314r;
                                } else {
                                    vVar2 = v21.d.f175313q;
                                }
                            } else if (z14) {
                                vVar2 = v21.d.f175311o;
                            } else {
                                vVar2 = v21.d.f175310n;
                            }
                            if (vVar2 != null) {
                                fVar = new o21.f(xVar.f74274a.longValue(), xVar.f74276c, vVar, vVar2, null, 16, null);
                            }
                        } else {
                            fVar = new o21.f(xVar.f74274a.longValue(), xVar.f74276c, vVar, vVar2, null, 16, null);
                        }
                    }
                }
                if (fVar != null) {
                    arrayList3.add(fVar);
                }
            }
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, p.a((p) value3, false, null, false, false, false, arrayList3, null, null, 446)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, p.a((p) value2, false, new Integer(R.string.generic_error_message), true, false, false, null, null, null, 498)));
        }
        return Unit.INSTANCE;
    }

    public static boolean y4(List list, e0 e0Var, e0 e0Var2) {
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((o21.f) it.next()).f128673e != null) {
                    return false;
                }
            }
        }
        if ((e0Var != null ? e0Var.f156103d : null) == null) {
            return (e0Var2 != null ? e0Var2.f156103d : null) == null;
        }
        return false;
    }
}
