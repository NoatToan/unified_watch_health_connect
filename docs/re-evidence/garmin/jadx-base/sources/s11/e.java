package s11;

import android.os.Parcelable;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b11.i;
import b11.l;
import b63.k;
import b63.m;
import b63.o;
import b63.z;
import c22.c3;
import c22.g2;
import c22.x0;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import e53.j;
import g01.a0;
import g01.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ls11/e;", "Landroidx/lifecycle/u1;", "Lb63/o;", "fromDate", "", "isTimelineView", "Li01/a;", "action", "", "Lb11/i;", "foods", "Lm01/g;", "repository", "Lv01/b;", "bulkEditFoodUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "Lbv/d;", "baseUserPreferenceDelegate", "<init>", "(Lb63/o;ZLi01/a;Ljava/util/List;Lm01/g;Lv01/b;Ls01/f;Lbv/d;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f155898m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f155899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i01.a f155901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i> f155902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m01.g f155903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v01.b f155904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s01.f f155905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bv.d f155906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f155907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f155908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f155909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b2 f155910l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155911a;

        static {
            int[] iArr = new int[i01.a.values().length];
            try {
                iArr[i01.a.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i01.a.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155911a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((l) t7).f14337g), Integer.valueOf(((l) t14).f14337g));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls11/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.edit.viewmodel.MoveCopyFoodViewModel$uiState$1", f = "MoveCopyFoodViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<r53.j<? super s11.d>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155912a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s11.d> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155912a;
            if (i14 == 0) {
                r.b(obj);
                this.f155912a = 1;
                if (e.x4(e.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(o oVar, boolean z14, i01.a aVar, List<? extends i> list, m01.g gVar, v01.b bVar, s01.f fVar, bv.d dVar) {
        oVar.getClass();
        aVar.getClass();
        list.getClass();
        gVar.getClass();
        bVar.getClass();
        fVar.getClass();
        dVar.getClass();
        this.f155899a = oVar;
        this.f155900b = z14;
        this.f155901c = aVar;
        this.f155902d = list;
        this.f155903e = gVar;
        this.f155904f = bVar;
        this.f155905g = fVar;
        this.f155906h = dVar;
        z.INSTANCE.getClass();
        this.f155907i = b63.b.a(oVar, z.f16226b);
        p2 p2VarA = q2.a(A4(aVar));
        this.f155909k = p2VarA;
        v vVar = new v(new d(null), s.d(p2VarA));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f155910l = s.K(vVar, aVarA, k2.a.f150706c, s11.d.a(A4(aVar), null, null, null, true, false, null, false, 0L, null, null, 523775));
    }

    public static List D4(a0 a0Var, o oVar, o oVar2) {
        return c0.s(new c53.a0(new c53.c(c0.p(c0.l(c0.h(h0.M(a0Var.f74097c), new rk0.g(16, oVar, oVar2)), new rw0.b(26)), new rw0.b(27)), new rw0.b(28)), new c()));
    }

    public static o F4(long j8) {
        j.f63112c.getClass();
        j jVarA = j.a.a(j8);
        z.INSTANCE.getClass();
        return b63.b.e(jVarA, z.f16226b).b();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[EDGE_INSN: B:37:0x00c5->B:38:0x00c6 BREAK  A[LOOP:0: B:32:0x00b2->B:60:?]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(e eVar, v13.c cVar) {
        f fVar;
        Object value;
        Object value2;
        Long l14;
        Long l15;
        Object value3;
        List<i> list = eVar.f155902d;
        p2 p2Var = eVar.f155909k;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f155916c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f155916c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar, cVar);
            }
        } else {
            fVar = new f(eVar, cVar);
        }
        Object objD = fVar.f155914a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f155916c;
        if (i15 == 0) {
            r.b(objD);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, true, false, null, false, 0L, null, null, 523775)));
            m01.g gVar = eVar.f155903e;
            o oVarF4 = F4(eVar.C4());
            o oVarF5 = F4(eVar.B4());
            fVar.f155916c = 1;
            objD = gVar.d(oVarF4, oVarF5, fVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            a0 a0Var = (a0) ((v2.b) v2Var).f47386a;
            eVar.f155908j = a0Var;
            o oVar = eVar.f155899a;
            List listD4 = D4(a0Var, oVar, oVar);
            i iVar = (i) h0.d0(list);
            if (iVar == null) {
                l14 = null;
                break;
            }
            l14 = new Long(iVar.getF14318d());
            long jLongValue = l14.longValue();
            if (list.size() == 1 && (listD4 == null || !listD4.isEmpty())) {
                Iterator it = listD4.iterator();
                do {
                    if (!it.hasNext()) {
                        l14 = null;
                        break;
                    }
                } while (((l) it.next()).f14331a != jLongValue);
            } else {
                l14 = null;
                break;
            }
            if (((s11.d) p2Var.getValue()).f155879a || l14 == null) {
                l lVarL = zf.b.L(listD4, ((s11.d) p2Var.getValue()).f155879a, ((s11.d) p2Var.getValue()).f155886h, null, eVar.f155905g.a());
                l15 = lVarL != null ? new Long(lVarL.f14331a) : null;
            } else {
                l15 = l14;
            }
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, s11.d.a((s11.d) value3, listD4, l15, null, false, false, null, false, 0L, null, null, 523679)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, s11.d.a((s11.d) value2, null, null, null, false, false, null, true, 0L, null, null, 519679)));
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "MoveCopyFoodViewModel", "fetchMealsRange: error retrieving meals range.");
        }
        return Unit.INSTANCE;
    }

    public final s11.d A4(i01.a aVar) {
        int i14;
        c3 c3VarB;
        String str;
        j23.l lVar = new j23.l(F4(C4()).f16206a.getYear(), F4(B4()).f16206a.getYear());
        long jC = this.f155907i.c();
        h hVar = new h(this);
        List<i> list = this.f155902d;
        b63.v f14317c = list.size() == 1 ? ((i) h0.b0(list)).getF14317c() : g22.l.f(b63.v.INSTANCE);
        boolean zA = this.f155905g.a();
        int iN = this.f155906h.N();
        i01.a.INSTANCE.getClass();
        int i15 = i01.a.Companion.C1721a.f86724a[aVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.lbl_copy;
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            i14 = R.string.label_move;
        }
        Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
        boolean z14 = aVar == i01.a.COPY;
        boolean z15 = list.size() == 1;
        int i16 = b.f155911a[aVar.ordinal()];
        boolean z16 = this.f155900b;
        if (i16 != 1) {
            if (i16 != 2) {
                u0.r();
                return null;
            }
            if (z16 && z15) {
                x0.f23314a.getClass();
                str = x0.f23480jf;
            } else if (z16) {
                x0.f23314a.getClass();
                str = x0.f23448hf;
            } else if (z15) {
                x0.f23314a.getClass();
                str = x0.f23398ef;
            } else {
                x0.f23314a.getClass();
                str = x0.f23382df;
            }
            c3VarB = g2.b(str);
        } else if (z16 && z15) {
            c3VarB = c22.i.b(R.string.move_food_date_time);
        } else if (z16) {
            c3VarB = c22.i.b(R.string.move_foods_date_time);
        } else if (z15) {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.gf);
        } else {
            x0.f23314a.getClass();
            c3VarB = g2.b(x0.f23415ff);
        }
        return new s11.d(this.f155900b, zA, hVar, lVar, list, null, null, f14317c, iN, false, false, null, false, z14, jC, null, null, c22.i.b(i14), c3VarB, 106080, null);
    }

    public final long B4() {
        o.Companion companion = o.INSTANCE;
        z.INSTANCE.getClass();
        k kVar = z.f16226b;
        j jVarA = b63.b.a(g22.l.c(companion, kVar), kVar);
        b63.i.INSTANCE.getClass();
        b63.i.c cVar = b63.i.f16190d;
        return Math.min(m.c(this.f155907i, cVar, kVar).c(), m.c(jVarA, cVar, kVar).c());
    }

    public final long C4() {
        b63.i.INSTANCE.getClass();
        b63.i.c cVar = b63.i.f16190d;
        z.INSTANCE.getClass();
        k kVar = z.f16226b;
        j jVar = this.f155907i;
        jVar.getClass();
        cVar.getClass();
        kVar.getClass();
        return m.b(jVar, -90, cVar, kVar).c();
    }

    public final void E4(long j8) {
        p2 p2Var;
        Object value;
        o oVarF4 = F4(j8);
        do {
            p2Var = this.f155909k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, j8, null, null, 475135)));
        a0 a0Var = this.f155908j;
        if (a0Var != null) {
            H4(D4(a0Var, oVarF4, oVarF4));
        }
    }

    public final g2 G4(Long l14) {
        a0 a0Var = this.f155908j;
        if (a0Var == null) {
            return null;
        }
        o13.p<o, o> pVarZ4 = z4();
        o oVar = pVarZ4.f128594a;
        o oVar2 = pVarZ4.f128595b;
        List<g01.g> list = a0Var.f74097c;
        ArrayList<g01.g> arrayList = new ArrayList();
        for (Object obj : list) {
            if (oVar.d(oVar2).contains((Object) ((g01.g) obj).f74182a)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        for (g01.g gVar : arrayList) {
            if (gVar.f74184c == l01.e.CLASSICAL) {
                Collection collection = gVar.f74183b;
                if (collection == null) {
                    collection = j0.f134944a;
                }
                if (collection == null || !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(((x) it.next()).f74274a, l14)) {
                            }
                        }
                    }
                }
                int i14 = b.f155911a[this.f155901c.ordinal()];
                if (i14 == 1) {
                    x0.f23314a.getClass();
                    return g2.b(x0.Bf);
                }
                if (i14 == 2) {
                    x0.f23314a.getClass();
                    return g2.b(x0.f23548nf);
                }
                u0.r();
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void H4(List<l> list) {
        o13.p pVar;
        l lVar;
        Object value;
        b2 b2Var = this.f155910l;
        boolean z14 = ((s11.d) b2Var.f150540a.getValue()).f155879a;
        p2 p2Var = this.f155909k;
        Long lValueOf = null;
        if (z14) {
            List<l> list2 = ((s11.d) b2Var.f150540a.getValue()).f155884f;
            l lVarL = zf.b.L(list2, true, ((s11.d) b2Var.f150540a.getValue()).f155886h, null, this.f155905g.a());
            pVar = new o13.p(lVarL != null ? Long.valueOf(lVarL.f14331a) : null, list2);
        } else {
            Long l14 = ((s11.d) p2Var.getValue()).f155885g;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        long j8 = ((l) it.next()).f14331a;
                        if (l14 != null && j8 == l14.longValue()) {
                            lValueOf = l14;
                        }
                    } else {
                        lVar = (l) h0.d0(list);
                        if (lVar != null) {
                            lValueOf = Long.valueOf(lVar.f14331a);
                        }
                    }
                }
            } else {
                lVar = (l) h0.d0(list);
                if (lVar != null) {
                    lValueOf = Long.valueOf(lVar.f14331a);
                }
            }
            pVar = new o13.p(lValueOf, list);
        }
        Long l15 = (Long) pVar.f128594a;
        List list3 = (List) pVar.f128595b;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, s11.d.a((s11.d) value, list3, l15, null, false, false, null, false, 0L, null, G4(l15), 458655)));
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f155909k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s11.d.a((s11.d) value, null, null, null, false, false, null, false, 0L, null, null, 518143)));
    }

    public final o13.p<o, o> z4() {
        s11.d dVar = (s11.d) this.f155909k.getValue();
        o oVarF4 = F4(dVar.f155893o);
        Long l14 = dVar.f155894p;
        return new o13.p<>(oVarF4, l14 != null ? F4(l14.longValue()) : oVarF4);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls11/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
