package ad0;

import a11.h0;
import a42.z;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.r;
import gl1.y;
import i3.e5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.t0;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.l<ub0.a, Unit> {
        public a(Object obj) {
            super(1, obj, zc0.c.class, "onAnimationAction", "onAnimationAction(Lcom/garmin/android/apps/connectmobile/device/setup/presentation/tutorials/components/AnimationAction;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(ub0.a aVar) {
            Object value;
            zc0.a aVar2;
            Object value2;
            Object value3;
            Object value4;
            ub0.a aVar3 = aVar;
            aVar3.getClass();
            zc0.c cVar = (zc0.c) this.receiver;
            p2 p2Var = cVar.f203929d;
            int i14 = zc0.c.a.f203931a[aVar3.ordinal()];
            if (i14 == 1) {
                p2 p2Var2 = cVar.f203927b;
                do {
                    value = p2Var2.getValue();
                    zc0.a aVar4 = (zc0.a) value;
                    if (aVar4 != null) {
                        aVar4.f203922a.f2199g.f2191b++;
                    }
                    if (aVar4 != null) {
                        aa0.d dVar = aVar4.f203922a;
                        aVar2 = new zc0.a(dVar, androidx.core.view.j.f(dVar.f2199g.f2191b, "_0"));
                    } else {
                        aVar2 = null;
                    }
                } while (!p2Var2.b(value, aVar2));
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, ub0.l.PLAYING));
            } else if (i14 == 2) {
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, ub0.l.PAUSED));
            } else if (i14 == 3) {
                do {
                    value4 = p2Var.getValue();
                } while (!p2Var.b(value4, ub0.l.RESUMED));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r<Boolean, d0, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ub0.l f2746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<ub0.a, Unit> f2747b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ub0.l lVar, e23.l<? super ub0.a, Unit> lVar2) {
            this.f2746a = lVar;
            this.f2747b = lVar2;
        }

        @Override // e23.r
        public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
            bool.getClass();
            long j8 = d0Var.f128833a;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
                x1 x1Var = n.f135158a;
                i.a(6, this.f2747b, x2.f(h4.r.S, 1.0f), mVar2, this.f2746a != ub0.l.PAUSED);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2748a;

        static {
            int[] iArr = new int[ub0.l.values().length];
            try {
                iArr[ub0.l.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.l.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2748a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a0 a0Var, String str, zc0.e eVar, ub0.l lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        i53.e eVar2;
        Object next;
        int i16;
        int i17;
        o0 o0VarE = mVar.E(-1723155320);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(eVar) : o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.common_learn_more);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new ba0.a("", strQ));
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            String str2 = eVar.f203939a;
            i53.d<String, Bitmap> dVar = eVar.f203940b;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a81.m(14);
                o0VarE.K(objQ3);
            }
            e23.l lVar2 = (e23.l) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new h0(n1Var, 2);
                o0VarE.K(objQ4);
            }
            e23.l lVar3 = (e23.l) objQ4;
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(eVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a42.i(3, lVar, eVar);
                o0VarE.K(objQ5);
            }
            o0Var = o0VarE;
            ub0.f.a(str2, dVar, false, null, lVar2, lVar3, (e23.l) objQ5, o0Var, 221184, 12);
            int intValue = n1Var.getIntValue();
            i53.d<ba0.a, hv.j> dVar2 = eVar.f203945g;
            ba0.a aVar = null;
            if (dVar2 != null && (eVar2 = (i53.e) dVar2.entrySet()) != null) {
                Iterator<E> it = eVar2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        hv.j jVar = (hv.j) ((Map.Entry) next).getValue();
                        int time = jVar.getTime();
                        int iB = jVar.b();
                        if (intValue < time) {
                            i16 = time - intValue;
                        } else {
                            i16 = intValue > iB ? intValue - iB : 0;
                        }
                        do {
                            Object next2 = it.next();
                            hv.j jVar2 = (hv.j) ((Map.Entry) next2).getValue();
                            int time2 = jVar2.getTime();
                            int iB2 = jVar2.b();
                            if (intValue < time2) {
                                i17 = time2 - intValue;
                            } else {
                                i17 = intValue > iB2 ? intValue - iB2 : 0;
                            }
                            if (i16 > i17) {
                                next = next2;
                                i16 = i17;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    aVar = (ba0.a) entry.getKey();
                }
            }
            if (aVar == null) {
                aVar = new ba0.a("", "");
            }
            p1Var.setValue(aVar);
            ub0.b.a(a0Var, (ba0.a) p1Var.getF182175a(), strQ, str, o0Var, (i15 & 14) | ((i15 << 6) & 7168));
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(a0Var, str, eVar, lVar, i14, 5);
        }
    }

    public static final void b(int i14, zc0.c cVar, String str, e23.a<Unit> aVar, p3.m mVar, int i15) {
        zc0.e eVar;
        LinkedHashMap linkedHashMap;
        hv.j jVar;
        hv.j jVar2;
        cVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1025488235);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        int iB = 0;
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(cVar.f203930e, o0VarE);
            zc0.a aVar2 = (zc0.a) cVar.f203927b.getValue();
            if (aVar2 != null) {
                aa0.d dVar = aVar2.f203922a;
                aa0.c cVar2 = dVar.f2199g;
                List<hv.j> listB = dVar.b(i14);
                int time = (listB == null || (jVar2 = (hv.j) p13.h0.d0(listB)) == null) ? 0 : jVar2.getTime();
                if (listB != null && (jVar = (hv.j) p13.h0.n0(listB)) != null) {
                    iB = jVar.b();
                }
                int i18 = iB;
                if (listB != null) {
                    int iA = t0.a(p13.y.r(listB, 10));
                    linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                    for (hv.j jVar3 : listB) {
                        String comment = jVar3.getComment();
                        if (comment == null) {
                            comment = "";
                        }
                        p pVar = new p(dVar.a(comment), jVar3);
                        linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                    }
                } else {
                    linkedHashMap = null;
                }
                String str2 = dVar.f2193a;
                Map<String, Bitmap> map = dVar.f2196d;
                eVar = new zc0.e(str2, map != null ? i53.a.g(map) : null, cVar2.f2190a.f2189c.size(), cVar2.f2191b, time, i18, linkedHashMap != null ? i53.a.g(linkedHashMap) : null);
            } else {
                eVar = null;
            }
            z02.d.a(false, z3.f.c(1007972976, new a51.g(aVar, i17), o0VarE), null, null, null, z3.f.c(1982120428, new z(eVar, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), str, cVar, p1VarC, 2), o0VarE), o0VarE, 196656, 29);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(i14, cVar, str, aVar, i15);
        }
    }

    public static final void c(ub0.l lVar, zc0.e eVar, String str, e23.l<? super ub0.a, Unit> lVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1001648370);
        int i15 = (o0VarE.k(lVar == null ? -1 : lVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            b82.c.c(z3.f.c(141165896, new b(lVar, lVar2), o0VarE), z3.f.c(-812416958, new a42.a(str, i16, eVar, lVar), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(i14, 2, lVar2, lVar, eVar, str, false);
        }
    }
}
