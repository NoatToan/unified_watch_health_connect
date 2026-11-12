package zf;

import a61.f;
import a73.n;
import am.l1;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import at1.d;
import b.g;
import b11.l;
import b21.d7;
import b63.v;
import c22.q2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.h2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.github.mikephil.charting.data.Entry;
import d53.u;
import d53.w;
import da2.i;
import ey1.j;
import g63.o;
import gl1.y;
import j23.h;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import l72.c1;
import lc.m0;
import m52.k;
import o13.z;
import o4.d0;
import o4.z0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import ps.x1;
import qs.x;
import vh.p;
import vh.q;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final boolean A(List list) {
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                x xVarA2 = ((x1) obj2).a2();
                String str = xVarA2 != null ? xVarA2.f147220a : null;
                if (s.g(str, ln.b.f113634h.f113640a) || s.g(str, ln.b.f113636j.f113640a) || s.g(str, ln.b.f113635i.f113640a) || s.g(str, ln.b.f113633g.f113640a) || s.g(str, ln.b.f113637k.f113640a)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (x1) obj;
        }
        return obj != null;
    }

    public static final boolean B(WorkoutDetailsDTO workoutDetailsDTO) {
        workoutDetailsDTO.getClass();
        List<h0> list = workoutDetailsDTO.Q0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h0) obj).f48193h == k.f116758r) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }

    public static final boolean C(i iVar, long j8, SupportedCapability supportedCapability) {
        iVar.getClass();
        supportedCapability.getClass();
        for (DeviceProfile deviceProfile : ((da2.b) iVar).a(j8)) {
            if (l2.q(supportedCapability, deviceProfile.getConfigurationFlags())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue())) ? false : true;
    }

    public static final boolean E(String str, String str2, String str3, String str4) {
        return s.g(str, str3) && s.g(str2, str4);
    }

    public static final Double F(Double d14, Double d15) {
        if (D(d14) && D(d15)) {
            return Double.valueOf(d15.doubleValue() + d14.doubleValue());
        }
        if (D(d14)) {
            return d14;
        }
        if (D(d15)) {
            return d15;
        }
        return null;
    }

    public static final d7 G(m0 m0Var) {
        m0Var.getClass();
        return new d7(m0Var, 24);
    }

    public static final String H(String str) {
        return hb.a.i(u.v(str, StringUtils.SPACE, "", false));
    }

    public static final List I(int i14, int i15, List list) {
        Entry entry;
        fz.b bVar = new fz.b((Entry) list.get(i14), (Entry) list.get(i15));
        int i16 = i14 + 1;
        double d14 = 0.0d;
        int i17 = -1;
        while (true) {
            entry = bVar.f73960a;
            if (i16 >= i15) {
                break;
            }
            Entry entry2 = (Entry) list.get(i16);
            entry2.getClass();
            double dAbs = ((double) Math.abs(((entry2.getX() - entry.getX()) * bVar.f73963d) - ((entry2.getY() - entry.getY()) * bVar.f73962c))) / bVar.f73964e;
            if (dAbs > d14) {
                i17 = i16;
                d14 = dAbs;
            }
            i16++;
        }
        if (d14 <= 1.0d) {
            return p13.x.k(entry, bVar.f73961b);
        }
        List listI = I(i14, i17, list);
        List listI2 = I(i17, i15, list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listI);
        int size = listI2.size();
        for (int i18 = 1; i18 < size; i18++) {
            arrayList.add(listI2.get(i18));
        }
        return arrayList;
    }

    public static final List J(List list) {
        list.getClass();
        return list.size() < 2 ? list : I(0, list.size() - 1, list);
    }

    public static final void K(ArrayList arrayList, Set set) {
        arrayList.removeIf(new n(new f(set, 1), 4));
    }

    public static final l L(List list, boolean z14, v vVar, b11.k kVar, boolean z15) {
        list.getClass();
        vVar.getClass();
        LocalTime localTime = vVar.f16219a;
        Object obj = null;
        if (!z14) {
            for (Object obj2 : list) {
                l lVar = (l) obj2;
                if (kVar != null && lVar.f14331a == kVar.f14326a) {
                    obj = obj2;
                    break;
                }
            }
            l lVar2 = (l) obj;
            return lVar2 == null ? (l) p13.h0.d0(list) : lVar2;
        }
        if (kVar != null) {
            String str = kVar.f14327b;
            if (!s.g(str, b11.c.SNACKS.f14250a) && !s.g(str, b11.c.UNCATEGORIZED.f14250a) && kVar.f14328c == null && kVar.f14329d == null) {
                for (Object obj3 : list) {
                    if (((l) obj3).f14331a == kVar.f14326a) {
                        obj = obj3;
                        break;
                    }
                }
                l lVar3 = (l) obj;
                return lVar3 == null ? (l) p13.h0.n0(list) : lVar3;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar4 = (l) it.next();
            v vVar2 = lVar4.f14334d;
            v vVar3 = lVar4.f14335e;
            if (vVar2 != null && vVar3 != null) {
                if (z15) {
                    v vVar4 = new v(localTime.getHour(), localTime.getMinute(), 0, 0, 12, null);
                    if (vVar4.compareTo(vVar2) < 0 || vVar4.compareTo(vVar3) > 0) {
                    }
                    return lVar4;
                }
                if (z15) {
                    continue;
                } else {
                    v vVar5 = lVar4.f14334d;
                    vVar5.getClass();
                    if (new h(vVar5, vVar3).contains(new v(localTime.getHour(), localTime.getMinute(), 0, 0, 12, null))) {
                        return lVar4;
                    }
                }
            }
        }
        for (Object obj4 : list) {
            if (((l) obj4).f14332b.equals(b11.c.SNACKS.f14250a)) {
                obj = obj4;
                break;
            }
        }
        l lVar5 = (l) obj;
        return lVar5 == null ? (l) p13.h0.n0(list) : lVar5;
    }

    public static final boolean M(n61.i iVar) {
        if (iVar.b().size() != 11) {
            return false;
        }
        List<Float> listB = iVar.b();
        if (listB != null && listB.isEmpty()) {
            return false;
        }
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).floatValue() != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static final ey1.a N(m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        g gVarT = t((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        if (gVarT == null) {
            vb.h.z("No ComponentActivity found!");
            return null;
        }
        mVar.L(-1614864554);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(ey1.a.class), gVarT.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVarT), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        return (ey1.a) u1VarResolveViewModel;
    }

    public static final boolean O(q qVar, Map map) {
        boolean zBooleanValue;
        qVar.getClass();
        Iterator<T> it = qVar.f178373d.iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            p pVar = (p) it.next();
            Object obj = map.get(pVar.f178364a);
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (pVar.f178365b) {
                zBooleanValue = !zBooleanValue;
            }
        } while (zBooleanValue);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public static final j P(long j8, m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        g gVarT = t((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        if (gVarT == null) {
            vb.h.z("No ComponentActivity found!");
            return null;
        }
        boolean z14 = (((i14 & 14) ^ 6) > 4 && mVar.l(j8)) || (i14 & 6) == 4;
        Object objQ = mVar.q();
        if (z14) {
            objQ = new a90.b(j8, 3);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new a90.b(j8, 3);
                mVar.K(objQ);
            }
        }
        mVar.L(-1614864554);
        u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(j.class), gVarT.getF189591b(), null, CreationExtrasExtKt.defaultExtras(gVarT), null, KoinApplicationKt.currentKoinScope(mVar, 0), (e23.a) objQ);
        mVar.R();
        return (j) u1VarResolveViewModel;
    }

    public static final boolean Q(n61.i iVar) {
        List<Float> list = iVar.f123872g;
        if (list.size() != 11 || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).floatValue() != 0.0f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [p13.j0] */
    public static o13.p R(double d14) {
        Object arrayList;
        Integer num = 1;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        if (Double.isNaN(d14)) {
            j0 j0Var = j0.f134944a;
            return new o13.p(j0Var, j0Var);
        }
        num = num.intValue() < 0 ? null : 1;
        BigDecimal bigDecimalAbs = new BigDecimal(String.valueOf(d14)).abs();
        if (num != null && roundingMode != null) {
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            bigDecimalAbs = bigDecimalAbs.setScale(num.intValue(), roundingMode);
        }
        BigInteger bigInteger = bigDecimalAbs.toBigInteger();
        BigDecimal bigDecimalSubtract = bigDecimalAbs.subtract(new BigDecimal(bigInteger));
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalMovePointRight = bigDecimalSubtract.movePointRight(num != null ? num.intValue() : bigDecimalSubtract.precision());
        int iIntValue = bigInteger.intValue();
        ArrayList arrayList2 = new ArrayList();
        do {
            arrayList2.add(0, Integer.valueOf(iIntValue % 10));
            iIntValue /= 10;
        } while (iIntValue > 0);
        if (num != null && num.intValue() == 0) {
            arrayList = j0.f134944a;
        } else {
            int iIntValue2 = bigDecimalMovePointRight.intValue();
            arrayList = new ArrayList();
            do {
                arrayList.add(0, Integer.valueOf(iIntValue2 % 10));
                iIntValue2 /= 10;
            } while (iIntValue2 > 0);
        }
        return new o13.p(arrayList2, arrayList);
    }

    public static final b11.k S(l lVar) {
        lVar.getClass();
        return new b11.k(lVar.f14331a, lVar.f14332b, lVar.f14334d, lVar.f14335e);
    }

    public static final q01.h T(d11.g gVar, String str, String str2) {
        gVar.getClass();
        str.getClass();
        str2.getClass();
        return new q01.h(gVar.f57069a, gVar.f57070b, gVar.f57071c, gVar.f57072d, null, gVar.f57073e, null, str, str2, null, 592, null);
    }

    public static final o13.x U(String str) {
        int i14;
        d53.a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i15 = 0;
        char cCharAt = str.charAt(0);
        if (s.h(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i14 = 0;
        }
        o13.x.a aVar = o13.x.f128613b;
        int iDivideUnsigned = 119304647;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i15, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i16 = i15 * 10;
            int i17 = iDigit + i16;
            if (Integer.compareUnsigned(i17, i16) < 0) {
                return null;
            }
            i14++;
            i15 = i17;
        }
        return o13.x.a(i15);
    }

    public static final z V(String str) {
        str.getClass();
        d53.a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        if (s.h(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j8 = 10;
        z.a aVar = z.f128618b;
        long j14 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j14, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j8);
                if (Long.compareUnsigned(j14, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j15 = j14 * j8;
            o13.x.a aVar2 = o13.x.f128613b;
            long j16 = (((long) iDigit) & 4294967295L) + j15;
            if (Long.compareUnsigned(j16, j15) < 0) {
                return null;
            }
            i14++;
            j14 = j16;
        }
        return z.a(j14);
    }

    public static final void a(boolean z14, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 955759770);
        int i15 = i14 | (o0VarP.h(z14) ? 4 : 2) | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarP, z14 ? R.string.lbl_pacepro_save_title : R.string.lbl_pacepro_update_title), y.Q(o0VarP, R.string.lbl_pacepro_update_message), null, null, y.Q(o0VarP, z14 ? R.string.lbl_save : R.string.lbl_update), false, false, aVar, y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i15 << 21) & 234881024) | 6, (i15 >> 6) & 14, 216);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.a(z14, aVar, aVar2, i14, 0);
        }
    }

    public static final void b(String str, String str2, e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        String str3;
        String str4;
        int i15;
        String strQ;
        String strQ2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1554146439);
        int i16 = (i14 & 6) == 0 ? i14 | 2 : i14;
        if ((i14 & 48) == 0) {
            i16 |= 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                i15 = i16 & (-127);
                strQ = y.Q(o0VarE, R.string.lbl_content_reported);
                strQ2 = y.Q(o0VarE, R.string.lbl_content_reported_message);
            } else {
                o0VarE.e();
                i15 = i16 & (-127);
                strQ = str;
                strQ2 = str2;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            c1.f110940a.a(false, strQ, strQ2, null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0Var, 6 | ((i15 << 18) & 234881024), 0, 1752);
            str3 = strQ;
            str4 = strQ2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str;
            str4 = str2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(str3, str4, aVar, i14, 0);
        }
    }

    public static g6.d c() {
        return new g6.d(1.0f, 1.0f);
    }

    public static final void d(String str, z0 z0Var, String str2, d0 d0Var, Boolean bool, m mVar, int i14, int i15) {
        int i16;
        Object obj;
        int i17;
        Object obj2;
        int i18;
        String str3;
        Object obj3;
        Object obj4;
        str.getClass();
        o0 o0VarE = mVar.E(-2076615537);
        int i19 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(z0Var) ? 32 : 16);
        int i24 = i15 & 4;
        if (i24 != 0) {
            i16 = i19 | 384;
        } else {
            i16 = i19 | (o0VarE.B(str2) ? 256 : 128);
        }
        int i25 = i15 & 8;
        if (i25 != 0) {
            i17 = i16 | 3072;
            obj = d0Var;
        } else {
            obj = d0Var;
            i17 = i16 | (o0VarE.B(obj) ? 2048 : 1024);
        }
        int i26 = i15 & 16;
        if (i26 != 0) {
            i18 = i17 | 24576;
            obj2 = bool;
        } else {
            obj2 = bool;
            i18 = i17 | (o0VarE.B(obj2) ? 16384 : 8192);
        }
        if (o0VarE.n(i18 & 1, (i18 & 9363) != 9362)) {
            str3 = i24 != 0 ? null : str2;
            obj3 = i25 != 0 ? null : obj;
            obj4 = i26 != 0 ? null : obj2;
            p3.x1 x1Var = p3.n.f135158a;
            an1.c.a(z3.f.c(1254365474, new ak0.j(str, z0Var, str3, obj3, obj4, 8), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
            str3 = str2;
            obj3 = obj;
            obj4 = obj2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(str, z0Var, str3, obj3, obj4, i14, i15, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(p1 p1Var, m mVar, int i14) {
        p1Var.getClass();
        o0 o0VarE = mVar.E(-660896142);
        int i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-626748125);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.review_rejected_dialog_title);
                String strQ2 = y.Q(o0VarE, R.string.review_rejected_dialog_message);
                String strQ3 = y.Q(o0VarE, R.string.review_edit_menu_item);
                boolean z14 = (i15 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new ak0.z(p1Var, 7);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ak0.z(p1Var, 7);
                        o0VarE.K(objQ);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, o0VarE, 0, 0, 1753);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-626397360);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l1(p1Var, i14);
        }
    }

    public static final List f(Iterable iterable, String str, boolean z14, e23.l lVar) {
        iterable.getClass();
        str.getClass();
        String strH = H(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (w.z(H((String) lVar.invoke(obj)), strH, false)) {
                arrayList.add(obj);
            }
        }
        return z14 ? p13.h0.N0(arrayList, new e22.b(lVar, strH)) : arrayList;
    }

    public static final d7 g(m0 m0Var) {
        m0Var.getClass();
        return new d7(m0Var, 23);
    }

    public static final void h(AutoCloseable autoCloseable, Throwable th3) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th3 != null) {
                try {
                    vb.h.p(autoCloseable);
                    return;
                } catch (Throwable th4) {
                    o13.g.a(th3, th4);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    vb.h.w();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z14 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z14) {
                        executorService.shutdownNow();
                        z14 = true;
                    }
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final p1 i(a2.j jVar, m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = p0.n(Boolean.FALSE);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        boolean z14 = (((i14 & 14) ^ 6) > 4 && mVar.B(jVar)) || (i14 & 6) == 4;
        Object objQ2 = mVar.q();
        if (z14 || objQ2 == c2565a) {
            objQ2 = new a2.g(jVar, p1Var, null);
            mVar.K(objQ2);
        }
        l0.e((e23.p) objQ2, jVar, mVar);
        return p1Var;
    }

    public static final o j(List list) {
        list.getClass();
        j0 j0Var = j0.f134944a;
        o oVar = new o(j0Var, j0Var);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                oVar = k((o) listIterator.previous(), oVar);
            }
        }
        return l(oVar, j0.f134944a);
    }

    public static final o k(o oVar, o oVar2) {
        boolean zIsEmpty = oVar.f76150b.isEmpty();
        List<g63.m<Output>> list = oVar.f76149a;
        if (zIsEmpty) {
            return new o(p13.h0.C0(list, oVar2.f76149a), oVar2.f76150b);
        }
        Collection collection = oVar.f76150b;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k((o) it.next(), oVar2));
        }
        return new o(list, arrayList);
    }

    public static final o l(o oVar, List list) {
        List listC;
        Collection collectionC;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListD1 = p13.h0.d1(list);
        Iterator it = oVar.f76149a.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            g63.m mVar = (g63.m) it.next();
            if (mVar instanceof g63.g) {
                if (arrayList2 != null) {
                    arrayList2.addAll(((g63.g) mVar).f76137a);
                } else {
                    arrayList2 = new ArrayList(((g63.g) mVar).f76137a);
                }
            } else if (mVar instanceof g63.w) {
                arrayListD1.add(mVar);
            } else {
                if (arrayList2 != null) {
                    arrayList.add(new g63.g(arrayList2));
                    arrayList2 = null;
                }
                arrayList.add(mVar);
            }
        }
        Collection collection = oVar.f76150b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = collection.iterator();
        while (it3.hasNext()) {
            o oVarL = l((o) it3.next(), arrayListD1);
            if (oVarL.f76149a.isEmpty()) {
                collectionC = oVarL.f76150b;
                if (collectionC.isEmpty()) {
                    collectionC = p13.w.c(oVarL);
                }
            } else {
                collectionC = p13.w.c(oVarL);
            }
            p13.d0.v(arrayList3, collectionC);
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        List<o> list2 = arrayList3;
        if (zIsEmpty) {
            listC = p13.w.c(new o(arrayListD1, j0.f134944a));
        }
        if (arrayList2 == null) {
            list2 = listC;
            return new o(arrayList, list2);
        }
        if (!list2.isEmpty()) {
            list2 = listC;
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                g63.m mVar2 = (g63.m) p13.h0.d0(((o) it4.next()).f76149a);
                if (mVar2 != null && (mVar2 instanceof g63.g)) {
                    ArrayList arrayList4 = new ArrayList(p13.y.r(list2, 10));
                    for (o oVar2 : list2) {
                        List<g63.m<Output>> list3 = oVar2.f76149a;
                        List<o<Output>> list4 = oVar2.f76150b;
                        g63.m mVar3 = (g63.m) p13.h0.d0(list3);
                        arrayList4.add(mVar3 instanceof g63.g ? new o(p13.h0.C0(p13.w.c(new g63.g(p13.h0.C0(arrayList2, ((g63.g) mVar3).f76137a))), p13.h0.U(list3, 1)), list4) : mVar3 == null ? new o(p13.w.c(new g63.g(arrayList2)), list4) : new o(p13.h0.C0(p13.w.c(new g63.g(arrayList2)), list3), list4));
                    }
                    return new o(arrayList, arrayList4);
                }
            }
        }
        list2 = listC;
        arrayList.add(new g63.g(arrayList2));
        return new o(arrayList, list2);
    }

    public static final boolean m(n61.i iVar) {
        List<Float> list = iVar.f123873h;
        if (list.size() != 11 || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).floatValue() != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static final com.garmin.android.apps.connectmobile.repcounting.model.d n(String str, String str2, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
            if (E(dVar.f41102a, dVar.f41106e, str, str2)) {
                return (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
            }
        }
        next = null;
        return (com.garmin.android.apps.connectmobile.repcounting.model.d) next;
    }

    public static final int o(e23.l lVar, List list) {
        Object next;
        list.getClass();
        lVar.getClass();
        Iterator it = p13.h0.j1(list).iterator();
        do {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                next = null;
                break;
            }
            next = o0Var.next();
        } while (!((Boolean) lVar.invoke(((p13.m0) next).f134952b)).booleanValue());
        p13.m0 m0Var = (p13.m0) next;
        if (m0Var != null) {
            return m0Var.f134951a;
        }
        return -1;
    }

    public static final String p(b63.o oVar) {
        oVar.getClass();
        String str = DateTimeFormatter.ofPattern("MMM d").format(oVar.f16206a);
        str.getClass();
        return str;
    }

    public static final String q(Context context, b63.u uVar) {
        context.getClass();
        uVar.getClass();
        String str = DateTimeFormatter.ofPattern(DateFormat.is24HourFormat(context) ? "HH:mm" : "h:mm a").format(uVar.f16216a);
        str.getClass();
        return str;
    }

    public static final h2 r() {
        return ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).d();
    }

    public static final ViewModelStoreOwner s(View view2) {
        view2.getClass();
        while (view2 != null) {
            Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
            ViewModelStoreOwner viewModelStoreOwner = tag instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) tag : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            Object objA = gl1.d.A(view2);
            view2 = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final g t(Context context) {
        if (context instanceof g) {
            return (g) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return t(baseContext);
    }

    public static final Integer u(c22.p2 p2Var, Context context) {
        p2Var.getClass();
        context.getClass();
        Integer num = p2Var.f23193b;
        if (num != null) {
            return Integer.valueOf(a7.b.getColor(context, num.intValue()));
        }
        return null;
    }

    public static final String v(com.garmin.android.apps.connectmobile.repcounting.model.f fVar, String str, String str2) {
        fVar.getClass();
        Map<String, String> map = fVar.f41127b;
        if (str != null && str.equals(str2)) {
            return fVar.f41126a.get(str);
        }
        String str3 = map.get(str + "_" + str2);
        return str3 == null ? map.get(str2) : str3;
    }

    public static final DateTime w(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        String str = (String) p13.h0.e0(2, pathSegments);
        if (str == null || !new d53.k("^\\d{4}-\\d{2}-\\d{2}$").d(str)) {
            return null;
        }
        return DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(str);
    }

    public static final yz1.z x(fc1.h hVar) {
        boolean z14;
        if (hVar == null) {
            return yz1.z.EMPTY;
        }
        if (hVar instanceof fc1.a) {
            z14 = ((fc1.a) hVar).f70397e;
        } else {
            z14 = hVar instanceof fc1.g ? ((fc1.g) hVar).f70413f : false;
        }
        return !z14 ? yz1.z.EMPTY : yz1.z.VALID_DATA;
    }

    public static final Drawable y(c22.p2 p2Var, Context context) {
        Integer num = p2Var.f23192a;
        Drawable drawable = num != null ? a7.b.getDrawable(context, num.intValue()) : null;
        if (drawable == null) {
            return null;
        }
        Integer numU = u(p2Var, context);
        if (numU != null) {
            drawable.setTint(numU.intValue());
        }
        return drawable;
    }

    public static final Drawable z(q2 q2Var, Context context, Object obj) {
        q2Var.getClass();
        c22.p2 p2VarA = q2Var.a(obj);
        if (p2VarA != null) {
            return y(p2VarA, context);
        }
        return null;
    }
}
