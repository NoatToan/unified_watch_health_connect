package aa2;

import a03.t0;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.util.Pair;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import aq.n2;
import b21.ja;
import b82.q1;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import c62.e1;
import ca0.b2;
import ca0.j1;
import ca0.n1;
import ca0.v0;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.garmin.android.apps.connectmobile.AppConfigurationViewActivity;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.ViewMultisportWorkoutActivity;
import f5.z0;
import f72.bb;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import l72.c1;
import lc.m0;
import li0.c0;
import li0.d0;
import m4.b0;
import m92.y;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.y0;
import u21.h0;
import u21.i0;
import u21.u0;
import v62.o1;
import w5.f0;
import w52.z1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2322c;

    public /* synthetic */ f(u2.h hVar, b0 b0Var) {
        this.f2320a = 2;
        this.f2322c = hVar;
        this.f2321b = b0Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        fd1.e eVar = (fd1.e) this.f2321b;
        i53.c cVar = (i53.c) this.f2322c;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ArrayList arrayList = null;
            fd1.b bVar = eVar != null ? eVar.f70492c.get(f14 != null ? Integer.valueOf((int) f14.floatValue()) : null) : null;
            if (bVar != null) {
                i53.c<fd1.a> cVar2 = bVar.f70479a;
                ArrayList arrayList2 = new ArrayList();
                for (fd1.a aVar : cVar2) {
                    if (cVar.contains(aVar.f70477a)) {
                        arrayList2.add(aVar);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                mVar.C(-107427497);
                mVar.f();
            } else {
                mVar.C(-107788833);
                y.a(bVar.f70480b, z3.f.c(106564021, new a31.b(arrayList, 7), mVar), mVar, 384);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0246  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) this.f2321b;
        LottieCompositionResult lottieCompositionResult = (LottieCompositionResult) this.f2322c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarC = x2.c(aVar, 0.7f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97919d;
            h4.r rVarC2 = c2.l.C(rVarC, 0.0f, f14, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarC2, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar);
            u2 u2Var = u2.f22900a;
            LottieAnimationKt.LottieAnimation(lottieCompositionResult.getF182175a(), c2.l.v(l4.k.h(aVar, 1.25f, 1.25f), 0.0f, eVar.f97920e, 1), false, false, null, 0.0f, 0, false, false, false, null, false, false, lottieDynamicProperties, null, null, false, false, null, false, null, mVar, 0, LottieDynamicProperties.$stable << 9, 0, 2088956);
            mVar.y();
            h4.r rVarF = x2.f(x2.c(aVar, 0.3f), 1.0f);
            mg2.w.f118432a.getClass();
            h4.r rVarV = c2.l.v(rVarF, 0.0f, mg2.w.f118436e, 1);
            s2 s2VarA2 = q2.a(c2.j.f22696f, h4.d.a.f81534l, mVar, 54);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC4 = h4.k.c(rVarV, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(eVar2, s2VarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC4, mVar);
            gl.c.f77766a.getClass();
            long jL = gl.c.a(mVar).l();
            long jR = gl.c.a(mVar).r();
            h4.r rVarQ = x2.q(aVar, f14);
            boolean zL = mVar.l(jL);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zL) {
                objQ = new a02.a(jL, 10);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a02.a(jL, 10);
                    mVar.K(objQ);
                }
            }
            u1.n.b(rVarQ, (e23.l) objQ, mVar, 0);
            h4.r rVarC5 = c2.l.C(aVar, eVar.f97917b, 0.0f, eVar.f97921f, 0.0f, 10);
            String strQ = gl1.y.Q(mVar, R.string.lbl_primary_muscles);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97934k;
            mh.c(strQ, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131068);
            h4.r rVarQ2 = x2.q(aVar, f14);
            boolean zL2 = mVar.l(jR);
            Object objQ2 = mVar.q();
            if (zL2) {
                objQ2 = new a02.a(jR, 11);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a02.a(jR, 11);
                    mVar.K(objQ2);
                }
            }
            u1.n.b(rVarQ2, (e23.l) objQ2, mVar, 0);
            mh.c(gl1.y.Q(mVar, R.string.lbl_secondary_muscles), c2.l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        AppConfigurationViewActivity appConfigurationViewActivity = (AppConfigurationViewActivity) this.f2321b;
        Pair pair = (Pair) this.f2322c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = AppConfigurationViewActivity.f28625b;
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Object obj4 = pair.first;
            obj4.getClass();
            String str = (String) obj4;
            Object obj5 = pair.second;
            obj5.getClass();
            appConfigurationViewActivity.aa(384, x2.x(x2.f(h4.r.S, 1.0f), null, 3), str, (String) obj5, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        e23.a aVar = (e23.a) this.f2321b;
        i53.c cVar = (i53.c) this.f2322c;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            b82.s sVar = b82.s.f16758a;
            cp1.a.f54895a.getClass();
            z3.e eVar = cp1.a.f54897c;
            z3.e eVarC = z3.f.c(-462798815, new cp1.d(a0Var, cVar), mVar);
            String strQ = gl1.y.Q(mVar, R.string.common_button_got_it);
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new v0(aVar, 17);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v0(aVar, 17);
                    mVar.K(objQ);
                }
            }
            sVar.d(eVar, eVarC, strQ, (e23.a) objQ, mVar, 54, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        z20.e eVar = (z20.e) this.f2321b;
        p1 p1Var = (p1) this.f2322c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            String str = eVar.f201897a;
            z20.e eVar2 = (z20.e) p1Var.getF182175a();
            boolean zEquals = str.equals(eVar2 != null ? eVar2.f201897a : null);
            boolean zB = mVar.B(eVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new j1(17, eVar, p1Var);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j1(17, eVar, p1Var);
                    mVar.K(objQ);
                }
            }
            e60.c.a(eVar, zEquals, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2, Object obj3) {
        o13.u uVar;
        k61.a aVar;
        k61.a aVar2;
        k61.a aVar3;
        k61.a next;
        k61.a next2;
        k61.a next3;
        k61.b bVar = (k61.b) this.f2321b;
        o82.g gVar = (o82.g) this.f2322c;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (f14 != null) {
                int iFloatValue = (int) f14.floatValue();
                i53.c<k61.a> cVar = bVar.f103168f;
                if (cVar != null) {
                    Iterator<k61.a> it = cVar.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (((int) next3.f103160a.f117346a) != iFloatValue);
                    aVar = next3;
                } else {
                    aVar = null;
                }
                i53.c<k61.a> cVar2 = bVar.f103169g;
                if (cVar2 != null) {
                    Iterator<k61.a> it3 = cVar2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((int) next2.f103160a.f117346a) != iFloatValue);
                    aVar2 = next2;
                } else {
                    aVar2 = null;
                }
                i53.c<k61.a> cVar3 = bVar.f103170h;
                if (cVar3 != null) {
                    Iterator<k61.a> it4 = cVar3.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (((int) next.f103160a.f117346a) != iFloatValue);
                    aVar3 = next;
                } else {
                    aVar3 = null;
                }
                uVar = new o13.u(aVar, aVar2, aVar3);
            } else {
                uVar = null;
            }
            if (uVar == null) {
                mVar.C(-1834173375);
                mVar.f();
            } else {
                mVar.C(-1834173374);
                k61.a aVar4 = (k61.a) uVar.f128605a;
                hz.d dVar = aVar4 != null ? new hz.d(aVar4.f103161b, aVar4.f103160a.f117347b) : null;
                k61.a aVar5 = (k61.a) uVar.f128606b;
                hz.d dVar2 = aVar5 != null ? new hz.d(aVar5.f103161b, aVar5.f103160a.f117347b) : null;
                k61.a aVar6 = (k61.a) uVar.f128607c;
                d70.g.a(dVar, dVar2, aVar6 != null ? new hz.d(aVar6.f103161b, aVar6.f103160a.f117347b) : null, gVar, mVar, 584);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        String strA;
        d70.b bVar = (d70.b) this.f2321b;
        o82.g gVar = (o82.g) this.f2322c;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            k61.a aVar = null;
            if (f14 != null) {
                int iFloatValue = (int) f14.floatValue();
                for (k61.a aVar2 : bVar.f58085d) {
                    if (((int) aVar2.f103160a.f117346a) == iFloatValue) {
                        aVar = aVar2;
                        break;
                    }
                }
                aVar = aVar;
            }
            if (aVar == null) {
                mVar.C(307786954);
                mVar.f();
            } else {
                mVar.C(307786955);
                int i14 = (int) aVar.f103160a.f117347b;
                DateTime dateTime = aVar.f103161b;
                pi0.e eVar = new pi0.e((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                int i15 = d70.j.a.f58113a[gVar.ordinal()];
                if (i15 == 1) {
                    strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY);
                } else if (i15 != 2) {
                    strA = i15 != 3 ? "" : eVar.a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_NO_DAY);
                } else {
                    DateTime dateTimePlusDays = dateTime.plusDays(6);
                    if (dateTimePlusDays.isAfter(DateTime.now())) {
                        dateTimePlusDays = DateTime.now();
                    }
                    dateTimePlusDays.getClass();
                    strA = eVar.g(dateTime, dateTimePlusDays, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
                }
                d70.j.a(i14, strA, bVar.f58083b, mVar, 0);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        g81.y yVar = (g81.y) this.f2321b;
        String str = (String) this.f2322c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            String str2 = yVar.f76420a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_hill_score_avg_score);
            b92.a aVarA = wz1.a.a(str);
            int i14 = b92.a.f16960b;
            int i15 = (iIntValue & 14) | (l72.x0.f111348c << 24);
            x0Var.a(i15, 60, aVarA, t2Var, null, null, str2, strQ, null, null, mVar);
            x0Var.a(i15, 124, null, t2Var, null, null, yVar.f76421b, gl1.y.Q(mVar, R.string.lbl_hill_score_max_score), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        g81.a0 a0Var = (g81.a0) this.f2321b;
        String str = (String) this.f2322c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            String str2 = a0Var.f76264a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_hill_score_avg_score);
            b92.a aVarA = wz1.a.a(str);
            int i14 = b92.a.f16960b;
            int i15 = (iIntValue & 14) | (l72.x0.f111348c << 24);
            x0Var.a(i15, 60, aVarA, t2Var, null, null, str2, strQ, null, null, mVar);
            x0Var.a(i15, 124, null, t2Var, null, null, a0Var.f76265b, gl1.y.Q(mVar, R.string.lbl_hill_score_max_score), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        String strP;
        i53.c cVar = (i53.c) this.f2321b;
        v21.e eVar = (v21.e) this.f2322c;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        if (cVar.contains(v01.c.MISSING_SERVING_SIZE)) {
            mVar.C(-1109000691);
            strP = gl1.y.P(R.string.value_is_required, new Object[]{gl1.y.Q(mVar, R.string.lbl_nutrition_amount)}, mVar);
            mVar.f();
        } else {
            mVar.C(-1108773430);
            eVar.getClass();
            strP = gl1.y.P(R.string.msg_serving_amt_invalid, new Object[]{v21.e.h(0.001d), v21.e.h(99999.999d)}, mVar);
            mVar.f();
        }
        h4.r rVarF = x2.f(h4.r.S, 1.0f);
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        j92.e eVar2 = j92.b.f97899b;
        h4.r rVarA = c2.l.A(c2.l.C(rVarF, 0.0f, eVar2.f97917b, 0.0f, eVar2.f97918c, 5), eVar2.f97920e, 0.0f, 2);
        String strN = fb1.c.n(Marker.ANY_MARKER, strP);
        d6.h.f57752b.getClass();
        int i14 = d6.h.f57757g;
        d92.b.f58624b.getClass();
        mh.c(strN, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0086  */
    /* JADX WARN: Code duplicated, block: B:161:0x0487  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:276:0x087d  */
    /* JADX WARN: Code duplicated, block: B:281:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:349:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:36:0x011c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:376:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:385:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0258  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0064  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        int i14;
        float f14;
        Throwable th3;
        h4.r.a aVar;
        int i15 = this.f2320a;
        int i16 = 3;
        int i17 = 18;
        p3.m.a aVar2 = p3.m.f135153a;
        int i18 = 6;
        int i19 = 2;
        int i24 = 1;
        int i25 = 0;
        Object obj6 = this.f2322c;
        Object obj7 = this.f2321b;
        switch (i15) {
            case 0:
                m3 m3Var = (m3) obj6;
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(-697380320, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                m4.e.a(rVar, (b0) obj7);
                boolean zB = mVar.B(m3Var);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new a03.f(m3Var, i18);
                    mVar.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a03.f(m3Var, i18);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarB = m4.e.b(rVar, (e23.l) objQ);
                mVar.f();
                return rVarB;
            case 1:
                we1.d dVar = (we1.d) obj7;
                lc.y yVar = (lc.y) obj6;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                float f15 = eVar.f97917b;
                float f16 = eVar.f97920e;
                h4.r rVarF = x2.f(u1.n.e(c2.l.A(aVar3, 0.0f, f15, 1), d92.b.a(mVar2).c().b(), m1.f128891a), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                int iHashCode = Long.hashCode(mVar2.getU());
                i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarF, mVar2);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar4);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.b0 b0Var = c2.b0.f22601a;
                l72.s sVar = l72.s.f111232a;
                h4.r rVarZ = c2.l.z(aVar3, f16, f16);
                s62.a.f157643a.getClass();
                u4.d dVarA = bb.a(t62.c.f162799a);
                String strQ = gl1.y.Q(mVar2, R.string.add_running_economy_banner_title);
                String strQ2 = gl1.y.Q(mVar2, R.string.add_running_economy_banner_message);
                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_go_to_home_settings);
                boolean zR = mVar2.r(dVar);
                Object objQ2 = mVar2.q();
                if (zR) {
                    objQ2 = new af1.c(dVar, false ? 1 : 0);
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new af1.c(dVar, false ? 1 : 0);
                        mVar2.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                boolean zR2 = mVar2.r(dVar) | mVar2.r(yVar);
                Object objQ3 = mVar2.q();
                if (zR2) {
                    objQ3 = new a11.n(15, dVar, yVar);
                    mVar2.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a11.n(15, dVar, yVar);
                        mVar2.K(objQ3);
                    }
                }
                sVar.c(rVarZ, dVarA, null, null, strQ, strQ2, strQ3, false, aVar5, (e23.a) objQ3, mVar2, 0, 0, 396);
                mVar2.y();
                return Unit.INSTANCE;
            case 2:
                u2.h hVar = (u2.h) obj6;
                b0 b0Var2 = (b0) obj7;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC2 = c2.l.C(aVar6, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar3, 48);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    an0.c.a(hVar, m4.e.a(u2.f22900a.a(aVar6, 1.0f, true), b0Var2), mVar3, 0);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = o1.a(t62.b.f162798a);
                    String strQ4 = gl1.y.Q(mVar3, R.string.lbl_delete);
                    h4.r rVarQ = x2.q(c2.l.C(aVar6, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97905d);
                    boolean zB2 = mVar3.B(hVar);
                    Object objQ4 = mVar3.q();
                    if (zB2) {
                        objQ4 = new an0.b(hVar, false ? 1 : 0);
                        mVar3.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new an0.b(hVar, false ? 1 : 0);
                            mVar3.K(objQ4);
                        }
                    }
                    i7.b(dVarA2, strQ4, u1.w.d(rVarQ, false, null, null, (e23.a) objQ4, 15), 0L, mVar3, 0, 8);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                wn1.m.a aVar8 = (wn1.m.a) obj7;
                li0.f fVar = (li0.f) obj6;
                e2.d dVar2 = (e2.d) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar4.B(dVar2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    c0.f112641a.a(aVar8.f186260a, fVar, e2.d.c(dVar2, h4.r.S), z3.f.c(346439999, new t0(11, aVar8, fVar), mVar4), mVar4, d0.f112647j | 3072 | (li0.f.f112658h << 3), 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                int i26 = 4;
                n2.b bVar4 = (n2.b) obj7;
                n2 n2Var = (n2) obj6;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i27 = n2.f12114f;
                rVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    if (!mVar5.B(rVar2)) {
                        i26 = 2;
                    }
                    iIntValue3 |= i26;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i28 = bVar4.f12119a;
                    String[] strArr = bVar4.f12126h;
                    Integer[] numArr = bVar4.f12125g;
                    Integer[] numArr2 = bVar4.f12124f;
                    int i29 = (iIntValue3 << 3) & 112;
                    rVar2.D(i28, mVar5, i29);
                    int i30 = (iIntValue3 << 6) & 896;
                    rVar2.l(bVar4.f12120b, i30, 2, null, mVar5);
                    if (numArr2.length == 0) {
                        mVar5.C(-1505328622);
                        mVar5.f();
                    } else {
                        mVar5.C(-1506459719);
                        int iIntValue4 = numArr2[0].intValue();
                        int iIntValue5 = numArr[0].intValue();
                        String strP = gl1.y.P(R.string.string_line_string_pattern_no_space, new Object[]{strArr[0], strArr[1]}, mVar5);
                        int i34 = h82.c.f82429e << 9;
                        n2Var.g(iIntValue4, iIntValue5, i34, strP, mVar5);
                        n2Var.g(numArr2[1].intValue(), numArr[1].intValue(), i34, gl1.y.P(R.string.string_line_string_pattern_no_space, new Object[]{strArr[1], strArr[2]}, mVar5), mVar5);
                        n2Var.g(numArr2[2].intValue(), numArr[2].intValue(), i34, gl1.y.P(R.string.lbl_string_with_positive_sign_end, new Object[]{strArr[2]}, mVar5), mVar5);
                        mVar5.f();
                    }
                    if (bVar4.f12123e != -1) {
                        mVar5.C(-1505266467);
                        rVar2.o(bVar4.f12123e, i30, 2, null, mVar5);
                        mVar5.f();
                    } else {
                        mVar5.C(-1505184782);
                        mVar5.f();
                    }
                    rVar2.t(bVar4.f12121c, mVar5, i29);
                    rVar2.o(bVar4.f12122d, i30, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                u0 u0Var = (u0) obj7;
                e23.l lVar = (e23.l) obj6;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    mVar6.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(i0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar6, 0), null);
                    mVar6.R();
                    p1 p1VarC = s9.c.c(((i0) u1VarResolveViewModel).f168005a, mVar6);
                    Boolean boolValueOf = Boolean.valueOf(((h0) p1VarC.getF182175a()).f167987a);
                    boolean zB3 = mVar6.B(p1VarC) | mVar6.r(u0Var);
                    Object objQ5 = mVar6.q();
                    if (zB3) {
                        obj4 = objQ5;
                        ja jaVar = new ja(u0Var, p1VarC, null);
                        mVar6.K(jaVar);
                        obj4 = jaVar;
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            obj4 = objQ5;
                            ja jaVar2 = new ja(u0Var, p1VarC, null);
                            mVar6.K(jaVar2);
                            obj4 = jaVar2;
                        }
                    }
                    obj4 = objQ5;
                    l0.e((e23.p) obj4, boolValueOf, mVar6);
                    boolean z14 = ((h0) p1VarC.getF182175a()).f167987a;
                    boolean zR3 = mVar6.r(u0Var) | mVar6.B(lVar);
                    Object objQ6 = mVar6.q();
                    if (zR3) {
                        obj5 = objQ6;
                        a42.i iVar = new a42.i(21, u0Var, lVar);
                        mVar6.K(iVar);
                        obj5 = iVar;
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            obj5 = objQ6;
                            a42.i iVar2 = new a42.i(21, u0Var, lVar);
                            mVar6.K(iVar2);
                            obj5 = iVar2;
                        }
                    }
                    obj5 = objQ6;
                    t21.u0.a(z14, (e23.l) obj5, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                v21.e eVar3 = (v21.e) obj7;
                x3 x3Var = (x3) obj6;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    t21.x0.a((s21.w) x3Var.getF182175a(), eVar3, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                CourseDetailsActivity courseDetailsActivity = (CourseDetailsActivity) obj7;
                int iIntValue8 = ((Integer) obj2).intValue();
                int iIntValue9 = ((Integer) obj3).intValue();
                CourseDetailsActivity.a aVar9 = CourseDetailsActivity.f33024k;
                ((ClimbDTO) obj).getClass();
                androidx.fragment.app.v supportFragmentManager = courseDetailsActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.g((List) obj6, iIntValue8, iIntValue9, supportFragmentManager, new b50.f(courseDetailsActivity, i24), new b50.c(courseDetailsActivity, i19), new b50.c(courseDetailsActivity, i16));
                b50.p pVarIa = courseDetailsActivity.ia();
                int i35 = courseDetailsActivity.getResources().getDisplayMetrics().heightPixels / 2;
                pVarIa.getClass();
                pVarIa.z4(new e50.b.o(i35));
                b50.p pVarIa2 = courseDetailsActivity.ia();
                pVarIa2.getClass();
                pVarIa2.z4(new e50.b.g(iIntValue8));
                return Unit.INSTANCE;
            case 8:
                Spannable spannable = (Spannable) obj7;
                a6.c cVar = (a6.c) obj6;
                s5.i0 i0Var = (s5.i0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int iIntValue11 = ((Integer) obj3).intValue();
                w5.q qVar = i0Var.fontFamily;
                f0 f0Var = i0Var.fontWeight;
                if (f0Var == null) {
                    f0.f182097b.getClass();
                    f0Var = f0.f182102g;
                }
                w5.b0 b0Var3 = i0Var.fontStyle;
                if (b0Var3 != null) {
                    i25 = b0Var3.f182072a;
                } else {
                    w5.b0.f182070b.getClass();
                }
                w5.b0 b0VarA = w5.b0.a(i25);
                w5.c0 c0Var = i0Var.fontSynthesis;
                if (c0Var != null) {
                    i14 = c0Var.f182079a;
                } else {
                    w5.c0.f182075b.getClass();
                    i14 = w5.c0.f182078e;
                }
                spannable.setSpan(new v5.m((Typeface) cVar.invoke(qVar, f0Var, b0VarA, w5.c0.a(i14))), iIntValue10, iIntValue11, 33);
                return Unit.INSTANCE;
            case 9:
                e23.p pVar = (e23.p) obj7;
                e23.p pVar2 = (e23.p) obj6;
                a0 a0Var = (a0) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                b82.s sVar2 = b82.s.f16758a;
                a0Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar8.B(a0Var) ? 4 : 2;
                }
                if (mVar8.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    float f17 = 40;
                    g6.f.a aVar11 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar10, f17), mVar8);
                    if (pVar != null) {
                        mVar8.C(887898689);
                        h4.r rVarC4 = c2.l.C(aVar10, f17, 0.0f, f17, 0.0f, 10);
                        aVar = aVar10;
                        f14 = f17;
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode3 = Long.hashCode(mVar8.getU());
                        i2 i2VarX3 = mVar8.x();
                        h4.r rVarC5 = h4.k.c(rVarC4, mVar8);
                        h5.g.V.getClass();
                        th3 = null;
                        e0.a aVar12 = h5.g.a.f81805b;
                        if (mVar8.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar12);
                        } else {
                            mVar8.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar8);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar8);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar8, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar8);
                        c2.u uVar = c2.u.f22885a;
                        pVar.invoke(mVar8, 0);
                        mVar8.y();
                        mVar8.f();
                    } else {
                        f14 = f17;
                        th3 = null;
                        aVar = aVar10;
                        mVar8.C(888047644);
                        mVar8.f();
                    }
                    h4.r rVarB2 = c2.l.B(aVar, f14, 32, f14, 24);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode4 = Long.hashCode(mVar8.getU());
                    i2 i2VarX4 = mVar8.x();
                    h4.r rVarC6 = h4.k.c(rVarB2, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw th3;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar13);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar8);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar8, iHashCode4, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar8);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    pVar2.invoke(mVar8, 0);
                    mVar8.y();
                    c2.l.f(a0Var.a(aVar, 1.0f, true), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 10:
                String str = (String) obj7;
                u4.o oVar = (u4.o) obj6;
                jf.w wVar = (jf.w) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                q1 q1Var = q1.f16749a;
                wVar.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar9.B(wVar) ? 4 : 2;
                }
                if (mVar9.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (((jf.d.c) s9.c.c(wVar.getF98679b().f98632q, mVar9).getF182175a()) instanceof jf.d.c.C1894d) {
                        mVar9.C(-1848373183);
                        y0.a(wVar.getF98679b(), str, c2.l.g(x2.f(h4.r.S, 1.0f), 1.0f), null, null, 0.0f, null, mVar9, 384, 120);
                        mVar9.f();
                    } else {
                        mVar9.C(-1847988597);
                        long jB = ds.e0.b(d92.b.f58623a, mVar9);
                        h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), d92.b.a(mVar9).e().g(), m1.f128891a);
                        d92.b.f58625c.getClass();
                        i7.a(oVar, null, c2.l.y(rVarE, j92.b.f97899b.f97918c), jB, mVar9, 56, 0);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                e23.l lVar2 = (e23.l) obj7;
                bb1.g gVar = (bb1.g) obj6;
                e23.a aVar14 = (e23.a) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                aVar14.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar10.r(aVar14) ? 4 : 2;
                }
                if (mVar10.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    c1 c1Var = c1.f110940a;
                    String strQ5 = gl1.y.Q(mVar10, R.string.delete_power_guide_msg);
                    String strQ6 = gl1.y.Q(mVar10, R.string.lbl_delete);
                    int i36 = iIntValue14 & 14;
                    boolean zB4 = (i36 == 4) | mVar10.B(lVar2) | mVar10.B(gVar);
                    Object objQ7 = mVar10.q();
                    if (zB4) {
                        objQ7 = new ak0.m(aVar14, lVar2, gVar);
                        mVar10.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new ak0.m(aVar14, lVar2, gVar);
                            mVar10.K(objQ7);
                        }
                    }
                    e23.a<Unit> aVar15 = (e23.a) objQ7;
                    String strQ7 = gl1.y.Q(mVar10, R.string.lbl_cancel);
                    i24 = i36 != 4 ? 0 : 1;
                    Object objQ8 = mVar10.q();
                    if (i24 == 0) {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new as.n(aVar14, 19);
                            mVar10.K(objQ8);
                        }
                    } else {
                        objQ8 = new as.n(aVar14, 19);
                        mVar10.K(objQ8);
                    }
                    c1Var.a(false, null, strQ5, null, null, strQ6, false, false, aVar15, strQ7, (e23.a) objQ8, mVar10, 0, 0, 219);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                e23.l lVar3 = (e23.l) obj7;
                Double d14 = (Double) obj6;
                c2.t tVar = (c2.t) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar11.B(tVar) ? 4 : 2;
                }
                if (mVar11.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    String str2 = (String) lVar3.invoke(d14);
                    h4.r.a aVar16 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC7 = tVar.c(aVar16, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str2, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar11), mVar11, 0, 0, 131068);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                Context context = (Context) obj7;
                e50.i iVar3 = (e50.i) obj6;
                t2 t2Var = (t2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar12.B(t2Var) ? 4 : 2;
                }
                if (mVar12.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    s20.e eVar4 = s20.e.f156007a;
                    double d15 = iVar3.f63034a;
                    boolean z15 = iVar3.f63043j;
                    eVar4.getClass();
                    String strB = s20.e.b(d15, context, z15);
                    if (strB == null) {
                        strB = "";
                    }
                    x0Var.f((iIntValue16 & 14) | (l72.x0.f111348c << 24), 116, null, t2Var, null, null, strB, gl1.y.Q(mVar12, R.string.lbl_distance), gl1.y.Q(mVar12, z15 ? R.string.lbl_km : R.string.lbl_mile), null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                ViewMultisportWorkoutActivity viewMultisportWorkoutActivity = (ViewMultisportWorkoutActivity) obj7;
                m0 m0Var = (m0) obj6;
                w52.v0 v0Var = (w52.v0) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ViewMultisportWorkoutActivity.a aVar17 = ViewMultisportWorkoutActivity.f48481g;
                v0Var.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= (iIntValue17 & 8) == 0 ? mVar13.B(v0Var) : mVar13.r(v0Var) ? 4 : 2;
                }
                if (mVar13.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = viewMultisportWorkoutActivity.ea();
                    e62.e eVar5 = e62.e.INSTANCE;
                    boolean zR4 = mVar13.r(viewMultisportWorkoutActivity);
                    Object objQ9 = mVar13.q();
                    if (zR4) {
                        objQ9 = new b41.a(viewMultisportWorkoutActivity, i17);
                        mVar13.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new b41.a(viewMultisportWorkoutActivity, i17);
                            mVar13.K(objQ9);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ9;
                    boolean zR5 = mVar13.r(viewMultisportWorkoutActivity);
                    Object objQ10 = mVar13.q();
                    if (zR5) {
                        objQ10 = new c32.k(viewMultisportWorkoutActivity, i18);
                        mVar13.K(objQ10);
                    } else {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new c32.k(viewMultisportWorkoutActivity, i18);
                            mVar13.K(objQ10);
                        }
                    }
                    e23.a aVar18 = (e23.a) objQ10;
                    boolean zR6 = mVar13.r(m0Var) | mVar13.r(viewMultisportWorkoutActivity);
                    Object objQ11 = mVar13.q();
                    if (zR6) {
                        objQ11 = new bb0.d(23, m0Var, viewMultisportWorkoutActivity);
                        mVar13.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new bb0.d(23, m0Var, viewMultisportWorkoutActivity);
                            mVar13.K(objQ11);
                        }
                    }
                    e62.d.a(v0Var, fVarEa, m0Var, eVar5, lVar4, aVar18, (e23.a) objQ11, mVar13, (iIntValue17 & 14) | 3072);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                c62.t tVar2 = (c62.t) obj7;
                e23.a aVar19 = (e23.a) obj6;
                p3.m mVar14 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var14 = p3.n.f135158a;
                h4.r.a aVar20 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC8 = c2.l.C(aVar20, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                boolean zR7 = mVar14.r(tVar2);
                Object objQ12 = mVar14.q();
                if (zR7) {
                    objQ12 = new e1.a(tVar2);
                    mVar14.K(objQ12);
                } else {
                    aVar2.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new e1.a(tVar2);
                        mVar14.K(objQ12);
                    }
                }
                z1.a(rVarC8, (e23.a) ((k23.g) objQ12), aVar19, mVar14, 0);
                return Unit.INSTANCE;
            case 16:
                m0 m0Var2 = (m0) obj7;
                f fVar2 = (f) obj6;
                q90.c cVar2 = (q90.c) obj;
                q90.f fVar3 = (q90.f) obj2;
                Boolean bool = (Boolean) obj3;
                boolean zBooleanValue = bool.booleanValue();
                cVar2.getClass();
                fVar3.getClass();
                int i37 = 22;
                if (fVar3 instanceof q90.f.c) {
                    q90.f.c cVar3 = (q90.f.c) fVar3;
                    m0Var2.h(new ca0.k(i37), new n1.l(cVar2, cVar3.f143524a, cVar3.f143525b, zBooleanValue));
                } else if (fVar3 instanceof q90.f.b) {
                    m0Var2.h(new ca0.k(i37), new n1.k(cVar2, ((q90.f.b) fVar3).f143523a, zBooleanValue));
                } else {
                    fVar2.invoke(cVar2, fVar3, bool);
                }
                return Unit.INSTANCE;
            case 17:
                x80.e eVar6 = (x80.e) obj7;
                m0 m0Var3 = (m0) obj6;
                q90.c cVar4 = (q90.c) obj;
                q90.f fVar4 = (q90.f) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                cVar4.getClass();
                fVar4.getClass();
                eVar6.getClass();
                eVar6.f189499a.f(cVar4, "paired_device");
                eVar6.f189517t = zBooleanValue2;
                hk0.a.f().n(hk0.a.EnumC1667a.STARTED, cVar4.f143494b);
                ge1.b.T(o53.c0.a(eVar6.f189513o), null, null, new x80.f(eVar6, cVar4, null), 3);
                x53.c cVar5 = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new x80.l(fVar4, eVar6, null), 3);
                m0Var3.h(zf.b.g(m0Var3), eVar6.A4(b2.PAIRING));
                return Unit.INSTANCE;
            case 18:
                return a(obj, obj2, obj3);
            case 19:
                return b(obj, obj2, obj3);
            case 20:
                e23.a aVar21 = (e23.a) obj7;
                e23.a aVar22 = (e23.a) obj6;
                p3.m mVar15 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var15 = p3.n.f135158a;
                c1 c1Var2 = c1.f110940a;
                String strQ8 = gl1.y.Q(mVar15, R.string.title_never_miss_a_deal);
                String strQ9 = gl1.y.Q(mVar15, R.string.msg_enable_push_notifications_for_exclusive_offers);
                String strQ10 = gl1.y.Q(mVar15, R.string.gdpr_livetrack_strava_beacon_enable);
                String strQ11 = gl1.y.Q(mVar15, R.string.lbl_cancel);
                boolean zB5 = mVar15.B(aVar21) | mVar15.B(aVar22);
                Object objQ13 = mVar15.q();
                if (zB5) {
                    objQ13 = new at1.e(aVar21, aVar22, 2);
                    mVar15.K(objQ13);
                } else {
                    aVar2.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new at1.e(aVar21, aVar22, 2);
                        mVar15.K(objQ13);
                    }
                }
                e23.a<Unit> aVar23 = (e23.a) objQ13;
                boolean zB6 = mVar15.B(aVar21);
                Object objQ14 = mVar15.q();
                if (zB6) {
                    objQ14 = new v0(aVar21, 13);
                    mVar15.K(objQ14);
                } else {
                    aVar2.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new v0(aVar21, 13);
                        mVar15.K(objQ14);
                    }
                }
                c1Var2.a(false, strQ8, strQ9, null, null, strQ10, false, false, aVar23, strQ11, (e23.a) objQ14, mVar15, 6, 0, 216);
                return Unit.INSTANCE;
            case 21:
                return c(obj, obj2, obj3);
            case 22:
                return d(obj, obj2, obj3);
            case 23:
                return e(obj, obj2, obj3);
            case 24:
                return f(obj, obj2, obj3);
            case 25:
                return g(obj, obj2, obj3);
            case 26:
                return h(obj, obj2, obj3);
            case 27:
                return i(obj, obj2, obj3);
            case 28:
                return j(obj, obj2, obj3);
            default:
                f11.a aVar24 = (f11.a) obj7;
                e23.l lVar5 = (e23.l) obj6;
                p3.m mVar16 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var16 = p3.n.f135158a;
                c1 c1Var3 = c1.f110940a;
                String strQ12 = gl1.y.Q(mVar16, R.string.pregnancy_something_went_wrong);
                String strQ13 = gl1.y.Q(mVar16, R.string.connect_iq_try_again);
                String strQ14 = gl1.y.Q(mVar16, R.string.lbl_ok);
                String strQ15 = gl1.y.Q(mVar16, R.string.lbl_cancel);
                boolean zR8 = mVar16.r(aVar24);
                Object objQ15 = mVar16.q();
                if (zR8) {
                    objQ15 = new e11.h(aVar24, i24);
                    mVar16.K(objQ15);
                } else {
                    aVar2.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new e11.h(aVar24, i24);
                        mVar16.K(objQ15);
                    }
                }
                e23.a<Unit> aVar25 = (e23.a) objQ15;
                boolean zB7 = mVar16.B(lVar5) | mVar16.r(aVar24);
                Object objQ16 = mVar16.q();
                if (zB7) {
                    objQ16 = new dl0.g(7, lVar5, aVar24);
                    mVar16.K(objQ16);
                } else {
                    aVar2.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new dl0.g(7, lVar5, aVar24);
                        mVar16.K(objQ16);
                    }
                }
                c1Var3.a(true, strQ12, strQ13, null, null, strQ14, false, false, aVar25, strQ15, (e23.a) objQ16, mVar16, 6, 0, 216);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f2320a = i14;
        this.f2321b = obj;
        this.f2322c = obj2;
    }
}
