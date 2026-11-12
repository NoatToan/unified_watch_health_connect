package gp;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78350b;

        static {
            int[] iArr = new int[jr.l.values().length];
            try {
                iArr[jr.l.ActivityName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.l.ActivityType.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78349a = iArr;
            int[] iArr2 = new int[jr.e.values().length];
            try {
                iArr2[jr.e.Dive.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f78350b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x031b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final ps.q qVar, final ps.m mVar, p3.m mVar2, final int i14) {
        final h4.r rVar2;
        int i15;
        o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        jr.q qVar2;
        String strB;
        String str;
        String str2;
        Object obj;
        String encodedSamples;
        String strB2;
        Object next;
        o0 o0VarE = mVar2.E(-967276042);
        if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i15 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i15 = i14;
        }
        int i16 = i15 | 48;
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(mVar) : o0VarE.r(mVar) ? 2048 : 1024;
        }
        int i17 = i16 | 24576;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            x0 x0VarO = qVar.o();
            List<jr.q> listA = new kr.a(context).a(x0VarO).a();
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((jr.q) next).d() != jr.s.Home);
                qVar2 = (jr.q) next;
            } else {
                qVar2 = null;
            }
            if (qVar2 == null) {
                x1 x1Var2 = p3.n.f135158a;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 0;
                pVar = new e23.p() { // from class: gp.c
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int i19 = i18;
                        p3.m mVar3 = (p3.m) obj2;
                        ((Integer) obj3).getClass();
                        switch (i19) {
                            case 0:
                                d.a(rVar2, qVar, mVar, mVar3, p0.t(i14 | 1));
                                break;
                            default:
                                d.a(rVar2, qVar, mVar, mVar3, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                ArrayList arrayListA = is.o.a(qVar2.g(), qVar);
                String string = context.getString(R.string.no_value_card);
                string.getClass();
                jr.p pVar2 = (jr.p) h0.e0(0, arrayListA);
                ls.e eVarA = pVar2 != null ? is.m.a(pVar2) : null;
                jr.p pVar3 = (jr.p) h0.e0(1, arrayListA);
                ls.e eVarA2 = pVar3 != null ? is.m.a(pVar3) : null;
                jr.p pVar4 = (jr.p) h0.e0(2, arrayListA);
                ls.e eVarA3 = pVar4 != null ? is.m.a(pVar4) : null;
                if (eVarA == null || (strB = ss.k.b(eVarA, new l22.a(context), ss.k.k(eVarA, qVar), ss.k.c(eVarA))) == null) {
                    strB = "";
                }
                String str3 = (eVarA2 == null || (strB2 = ss.k.b(eVarA2, new l22.a(context), ss.k.k(eVarA2, qVar), ss.k.c(eVarA2))) == null) ? "" : strB2;
                String strB3 = eVarA3 != null ? ss.k.b(eVarA3, new l22.a(context), ss.k.k(eVarA3, qVar), ss.k.c(eVarA3)) : null;
                ArrayList arrayList = new ArrayList(y.r(arrayListA, 10));
                Iterator it3 = arrayListA.iterator();
                while (it3.hasNext()) {
                    ls.e eVarA4 = is.m.a((jr.p) it3.next());
                    arrayList.add(ss.k.b(eVarA4, new l22.a(context), ss.k.k(eVarA4, qVar), 32));
                }
                String activityName = qVar.getActivityName();
                String strT = gl1.d.T(x0VarO.f4360c, o0VarE, 0);
                int i19 = a.f78349a[qVar2.c().ordinal()];
                if (i19 != 1) {
                    if (i19 != 2) {
                        u0.r();
                        return;
                    }
                    activityName = strT;
                }
                String strG = tn.k.g(activityName, ".");
                String str4 = activityName;
                if (qVar2.c() != jr.l.ActivityType) {
                    o0VarE.C(-1183333930);
                    strG = ((Object) strG) + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.txt_activity_type) + ", " + strT;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1183128276);
                    o0VarE.g0(false);
                }
                ArrayList arrayListB = qVar2.b();
                if (arrayListB != null) {
                    boolean isDecoDive = qVar.getIsDecoDive();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = arrayListB.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        String str5 = strB;
                        if (a.f78350b[((jr.e) it4.next()).ordinal()] != 1) {
                            u0.r();
                            return;
                        }
                        if (isDecoDive) {
                            arrayList2.add(new o13.p(context.getString(R.string.abbrev_decompression_dive), context.getString(R.string.lbl_decompression_dive)));
                        }
                        strB = str5;
                        strB3 = strB3;
                        it4 = it5;
                    }
                    str = strB;
                    str2 = strB3;
                    obj = arrayList2;
                } else {
                    str = strB;
                    str2 = strB3;
                    obj = j0.f134944a;
                }
                Iterable iterable = (Iterable) obj;
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    strG = ((Object) strG) + StringUtils.SPACE + ((o13.p) it6.next()).f128595b + ".";
                }
                u4.d dVar = x0VarO.f4362e;
                f02.h.f67736a.getClass();
                long jA = f02.h.a(o0VarE);
                long jA2 = n5.a.a(o0VarE, x0VarO.f4366i);
                ArrayList arrayList3 = new ArrayList(y.r(iterable, 10));
                Iterator it7 = iterable.iterator();
                while (it7.hasNext()) {
                    arrayList3.add((String) ((o13.p) it7.next()).f128594a);
                }
                String str6 = str4 == null ? string : str4;
                String str7 = (String) h0.e0(0, arrayList);
                String str8 = (String) h0.e0(1, arrayList);
                String str9 = (String) h0.e0(2, arrayList);
                List listC = (!qVar2.getShowPolyline() || mVar == null || (encodedSamples = mVar.getEncodedSamples()) == null) ? null : w.c(PolyUtil.decode(encodedSamples));
                boolean showExternalLinkIcon = qVar2.getShowExternalLinkIcon();
                String str10 = str6;
                boolean zR = o0VarE.r(null) | ((i17 & 896) == 256 || ((i17 & 512) != 0 && o0VarE.r(qVar))) | o0VarE.k(x0VarO.ordinal()) | o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new fk0.a(qVar, 12, x0VarO, context);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fk0.a(qVar, 12, x0VarO, context);
                        o0VarE.K(objQ);
                    }
                }
                o0Var = o0VarE;
                an.c.a(rVar, false, dVar, jA, jA2, arrayList3, 0.0f, 0.0f, str10, str, str3, str2, strG, str7, str8, str9, listC, showExternalLinkIcon, false, false, false, (e23.a) objQ, o0Var, i17 & 126, 0, 0, 1835200);
                x1 x1Var3 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i24 = 1;
            pVar = new e23.p() { // from class: gp.c
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i110 = i24;
                    p3.m mVar3 = (p3.m) obj2;
                    ((Integer) obj3).getClass();
                    switch (i110) {
                        case 0:
                            d.a(rVar, qVar, mVar, mVar3, p0.t(i14 | 1));
                            break;
                        default:
                            d.a(rVar, qVar, mVar, mVar3, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
