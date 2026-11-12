package w02;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.common.base.Ascii;
import e2.i0;
import e2.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.t1;
import p008y1.b2;
import p13.h0;
import p13.j0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ps.r0;
import s5.w0;
import w52.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {
    public static final byte[] A(UUID uuid) {
        byte[] bArrArray = ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        bArrArray.getClass();
        return bArrArray;
    }

    public static final long B(long j8, long j14) {
        int iF;
        int iH = w0.h(j8);
        int iG = w0.g(j8);
        if ((w0.h(j14) < w0.g(j8)) && (w0.h(j8) < w0.g(j14))) {
            if (w0.b(j14, j8)) {
                iH = w0.h(j14);
                iG = iH;
            } else {
                if (w0.b(j8, j14)) {
                    iF = w0.f(j14);
                } else {
                    int iH2 = w0.h(j14);
                    if (iH >= w0.g(j14) || iH2 > iH) {
                        iG = w0.h(j14);
                    } else {
                        iH = w0.h(j14);
                        iF = w0.f(j14);
                    }
                }
                iG -= iF;
            }
        } else if (iG > w0.h(j14)) {
            iH -= w0.f(j14);
            iF = w0.f(j14);
            iG -= iF;
        }
        return og.a.l(iH, iG);
    }

    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-107559940);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h82.r rVar = h82.r.f82497a;
            xn.f.f191599a.getClass();
            rVar.k(xn.f.f191601c, o0VarE, 54);
            rVar.j(xn.f.f191603e, o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xg0.v(i14, 14);
        }
    }

    public static final void b(z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-2037525467);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            eVar.invoke(y0.f182761a, o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, 17);
        }
    }

    public static String c(String str) {
        byte[] bArrDoFinal;
        byte[] bArrA;
        try {
            byte[] bArrD = d();
            byte[] bytes = str.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrD, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                bArrA = zg.b.a(zg.a.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8")));
            } catch (Exception unused) {
                bArrA = new byte[16];
            }
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArrA));
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Exception unused2) {
            bArrDoFinal = null;
        }
        if (bArrDoFinal == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArrDoFinal.length * 2);
        for (byte b14 : bArrDoFinal) {
            stringBuffer.append("0123456789ABCDEF".charAt((b14 >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b14 & Ascii.SI));
        }
        return stringBuffer.toString();
    }

    public static byte[] d() {
        return zg.b.a(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, Ascii.SYN, -65, -11, Ascii.RS, 101, -118});
    }

    public static String e(String str) {
        byte[] bArrA;
        try {
            byte[] bArrD = d();
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = i14 * 2;
                bArr[i14] = Integer.valueOf(str.substring(i15, i15 + 2), 16).byteValue();
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrD, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                bArrA = zg.b.a(zg.a.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8")));
            } catch (Exception unused) {
                bArrA = new byte[16];
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArrA));
            return new String(cipher.doFinal(bArr));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final List f(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return j0.f134944a;
        }
        if (size == 1) {
            return p13.w.c(h0.b0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final float g(float f14, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).s0(f14);
    }

    public static final List h(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            ps.x1 x1Var = (ps.x1) obj;
            if (qs.x.TIMING_GATE == (x1Var != null ? x1Var.a2() : null)) {
                arrayListL.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListL) {
            if (hashSet.add(((ps.x1) obj2).getTimingGateIndex())) {
                arrayList.add(obj2);
            }
        }
        return h0.N0(h0.N0(arrayList, new yq.g()), new yq.h());
    }

    public static final ArrayList i(pd1.b bVar) {
        Object next;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        List<Integer> listF = bVar.f();
        ArrayList arrayListZ = listF != null ? h0.Z(listF) : null;
        if (arrayListZ != null && !arrayListZ.isEmpty()) {
            if (arrayListZ.size() == 1 && arrayListZ.contains(0)) {
                arrayList.addAll(wd1.a.f184371l);
                return arrayList;
            }
            Iterator it = arrayListZ.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                w13.c cVar = wd1.a.f184371l;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarN.next();
                } while (((wd1.a) next).f184373b != iIntValue);
                wd1.a aVar = (wd1.a) next;
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public static final ArrayList j(List list, ps.x1 x1Var) {
        Object obj;
        Integer numY1;
        list.getClass();
        x1Var.getClass();
        List listH = h(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            Integer numY2 = ((ps.x1) it.next()).getTimingGateIndex();
            if (numY2 != null) {
                arrayList.add(numY2);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            Iterator it4 = list.iterator();
            while (true) {
                obj = null;
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                ps.x1 x1Var2 = (ps.x1) next;
                if (qs.x.TIMING_GATE == (x1Var2 != null ? x1Var2.a2() : null) && p005kotlin.jvm.internal.s.g(x1Var2.getParentIndex(), x1Var.getMessageIndex()) && (numY1 = x1Var2.getTimingGateIndex()) != null && numY1.intValue() == iIntValue) {
                    obj = next;
                    break;
                }
            }
            ps.x1 x1Var3 = (ps.x1) obj;
            if (x1Var3 == null) {
                x1Var3 = new ps.x1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -169, -1, 2097151, null);
            }
            arrayList2.add(x1Var3);
        }
        return arrayList2;
    }

    public static final ArrayList k(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            ps.x1 x1Var = (ps.x1) obj;
            if (qs.x.TIMING_RUN == (x1Var != null ? x1Var.a2() : null)) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }

    public static final ArrayList l(int i14, List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = k(list).iterator();
        while (it.hasNext()) {
            ArrayList arrayListJ = j(list, (ps.x1) it.next());
            if (i14 < arrayListJ.size()) {
                arrayListL.add(arrayListJ.get(i14));
            }
        }
        return arrayListL;
    }

    public static final boolean m(s5.c cVar) {
        int length = cVar.f157138b.length();
        List<s5.c.d<? extends s5.c.a>> list = cVar.f157137a;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                s5.c.d<? extends s5.c.a> dVar = list.get(i14);
                if ((dVar.f157149a instanceof s5.m) && s5.f.b(0, length, dVar.f157150b, dVar.f157151c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean n(zm1.s sVar) {
        sVar.getClass();
        List<zm1.a> list = sVar.f205338d;
        if (list != null && !list.isEmpty()) {
            for (zm1.a aVar : list) {
                aVar.getClass();
                if (aVar.f205292a != null) {
                    Integer num = aVar.f205293b;
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public static final boolean o(zm1.s sVar) {
        sVar.getClass();
        List<zm1.b> list = sVar.f205342h;
        if (list != null && !list.isEmpty()) {
            for (zm1.b bVar : list) {
                bVar.getClass();
                if (bVar.f205294a != null) {
                    Double d14 = bVar.f205295b;
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue <= 0.0d) {
                            d14 = null;
                        }
                    } else {
                        d14 = null;
                    }
                    if (d14 != null && g22.n.d(bVar.f205296c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean p(zm1.s sVar) {
        sVar.getClass();
        List<zm1.d> list = sVar.f205337c;
        if (list != null && !list.isEmpty()) {
            for (zm1.d dVar : list) {
                dVar.getClass();
                if (dVar.f205300a != null) {
                    Double d14 = dVar.f205301b;
                    if (d14 == null || d14.doubleValue() <= 0.0d) {
                        d14 = null;
                    }
                    if (d14 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public static final boolean q(zm1.s sVar) {
        sVar.getClass();
        List<zm1.e> list = sVar.f205340f;
        if (list != null && !list.isEmpty()) {
            for (zm1.e eVar : list) {
                eVar.getClass();
                if (eVar.f205302a != null) {
                    Double d14 = eVar.f205303b;
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue <= 0.0d) {
                            d14 = null;
                        }
                    } else {
                        d14 = null;
                    }
                    if (d14 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean r(r0 r0Var) {
        r0Var.getClass();
        return r0Var.getRepCount() != null && r0Var.getRepCount().longValue() >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    public static final boolean s(zm1.s sVar) {
        sVar.getClass();
        List<zm1.f> list = sVar.f205341g;
        if (list != null && !list.isEmpty()) {
            for (zm1.f fVar : list) {
                fVar.getClass();
                if (fVar.f205304a != null) {
                    Double d14 = fVar.f205305b;
                    if (d14 != null) {
                        double dDoubleValue = d14.doubleValue();
                        if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue <= 0.0d) {
                            d14 = null;
                        }
                    } else {
                        d14 = null;
                    }
                    if (d14 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean t(zm1.s sVar) {
        sVar.getClass();
        List<zm1.g> list = sVar.f205336b;
        if (list != null && !list.isEmpty()) {
            for (zm1.g gVar : list) {
                gVar.getClass();
                if (gVar.f205306a != null) {
                    Integer num = gVar.f205307b;
                    if (num == null || num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean u(zm1.s sVar) {
        sVar.getClass();
        List<zm1.h> list = sVar.f205339e;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (zm1.h hVar : list) {
            hVar.getClass();
            if (hVar.f205308a != null) {
                em1.a aVar = em1.a.f64616a;
                Double d14 = hVar.f205309b;
                aVar.getClass();
                if (em1.a.a(d14) && em1.a.b(hVar.f205310c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void v(TextView textView) {
        textView.getClass();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setLinksClickable(true);
    }

    public static final float w(float f14, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).d1(f14);
    }

    public static final float x(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        return ((g6.c) mVar.A(t1.f91490h)).c1(i14);
    }

    public static final r y(i0 i0Var, float f14, e23.r rVar, p3.m mVar, int i14) {
        rVar.getClass();
        if ((i14 & 1) != 0) {
            i0Var = k0.a(0, 0, 3, mVar);
        }
        if ((i14 & 2) != 0) {
            f14 = 48;
            g6.f.a aVar = g6.f.f75994b;
        }
        x1 x1Var = p3.n.f135158a;
        float fS0 = ((g6.c) mVar.A(t1.f91490h)).s0(f14);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ == obj) {
            objQ = l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ);
        }
        o53.b0 b0Var = (o53.b0) objQ;
        p1 p1VarQ = p0.q(rVar, mVar);
        boolean zB = mVar.B(i0Var);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == obj) {
            objQ2 = new ct1.c(i0Var, 14);
            mVar.K(objQ2);
        }
        boolean zI = mVar.i(f14) | mVar.B(b0Var) | mVar.B(i0Var) | mVar.k(((b2) p0.f((e23.a) objQ2).getF182175a()).ordinal());
        Object objQ3 = mVar.q();
        if (zI || objQ3 == obj) {
            objQ3 = new r(i0Var, b0Var, p1VarQ, fS0);
            mVar.K(objQ3);
        }
        return (r) objQ3;
    }

    public static final SpannableString z(TextView textView, int i14, int i15, e23.a aVar) {
        textView.getClass();
        SpannableString spannableString = new SpannableString(d53.u.v(d53.u.v(textView.getText().toString(), "<link>", "", false), "</link>", "", false));
        wr2.u.f186888a.getClass();
        spannableString.setSpan(new wr2.t(aVar), i14, i15, 33);
        return spannableString;
    }
}
