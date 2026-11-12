package ox;

import android.content.Context;
import android.util.SparseArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv1.v;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import gs1.l;
import gs1.t;
import gs1.z;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.r0;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:220:0x0392  */
    /* JADX WARN: Code duplicated, block: B:251:0x057d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
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
    public static final void a(boolean z14, bx.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z15;
        boolean z16;
        String strF;
        String str;
        String str2;
        boolean z17;
        sx.a.c cVar;
        boolean z18;
        String str3;
        Integer bodyBatteryMostRecentValue;
        Integer bodyBatteryDrainedValue;
        t tVar;
        z userDailySummary;
        bx.e eVar;
        int i16;
        sx.a.c cVar2;
        z userDailySummary2;
        l payload;
        Integer bodyBatteryMostRecentValue2;
        bx.e eVar2;
        Integer bodyBatteryLowestValue;
        Integer bodyBatteryHighestValue;
        Integer bodyBatteryDrainedValue2;
        Integer bodyBatteryChargedValue;
        z userDailySummary3;
        l lVar;
        boolean z19;
        r.a aVar2;
        String str4;
        l lVar2;
        boolean z24;
        rx.a aVar3;
        float f14;
        o0 o0Var2;
        o0 o0Var3;
        ?? r14;
        boolean z25;
        o0 o0Var4;
        Double bodyBatteryVersion;
        t tVar2;
        z userDailySummary4;
        o0 o0VarE = mVar.E(1880201830);
        int i17 = (i14 & 6) == 0 ? i14 | (o0VarE.h(z14) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            rx.a aVar4 = new rx.a(context);
            l payload2 = (aVar == null || (tVar2 = aVar.f21603b) == null || (userDailySummary4 = tVar2.getUserDailySummary()) == null) ? null : userDailySummary4.getPayload();
            double dDoubleValue = (payload2 == null || (bodyBatteryVersion = payload2.getBodyBatteryVersion()) == null) ? 1.0d : bodyBatteryVersion.doubleValue();
            hx.a bodyBatteryDynamicFeedbackEvent = payload2 != null ? payload2.getBodyBatteryDynamicFeedbackEvent() : null;
            sx.a aVar5 = new sx.a(context, dDoubleValue);
            l lVar3 = payload2;
            if (!s.c(Double.valueOf(dDoubleValue), 3.0d) || bodyBatteryDynamicFeedbackEvent == null) {
                t tVar3 = aVar != null ? aVar.f21603b : null;
                l payload3 = (tVar3 == null || (userDailySummary3 = tVar3.getUserDailySummary()) == null) ? null : userDailySummary3.getPayload();
                if (((payload3 == null || (bodyBatteryChargedValue = payload3.getBodyBatteryChargedValue()) == null) ? -1 : bodyBatteryChargedValue.intValue()) >= 0) {
                    z15 = true;
                } else if (((payload3 == null || (bodyBatteryDrainedValue2 = payload3.getBodyBatteryDrainedValue()) == null) ? -1 : bodyBatteryDrainedValue2.intValue()) >= 0) {
                    z15 = true;
                } else if (((payload3 == null || (bodyBatteryHighestValue = payload3.getBodyBatteryHighestValue()) == null) ? -1 : bodyBatteryHighestValue.intValue()) >= 0) {
                    z15 = true;
                } else if (((payload3 == null || (bodyBatteryLowestValue = payload3.getBodyBatteryLowestValue()) == null) ? -1 : bodyBatteryLowestValue.intValue()) >= 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    if (z14) {
                        if (((aVar == null || (eVar2 = aVar.f21602a) == null) ? null : eVar2.getDeltaValue()) == null) {
                            aVar4 = aVar4;
                            z16 = true;
                            strF = aVar4.f();
                            str = null;
                            str2 = null;
                        }
                    }
                    LinkedHashMap linkedHashMap = aVar5.f161124c;
                    Context context2 = aVar5.f161122a;
                    String string = "";
                    if (z14) {
                        if (aVar == null || (eVar = aVar.f21602a) == null) {
                            aVar4 = aVar4;
                            z17 = true;
                        } else {
                            Integer deltaValue = eVar.getDeltaValue();
                            int iIntValue = deltaValue != null ? deltaValue.intValue() : -1;
                            boolean z26 = eVar.getConfirmedTotalSleepSeconds() != null;
                            bx.d dVarC = eVar.c();
                            t tVar4 = aVar.f21603b;
                            int iIntValue2 = (tVar4 == null || (userDailySummary2 = tVar4.getUserDailySummary()) == null || (payload = userDailySummary2.getPayload()) == null || (bodyBatteryMostRecentValue2 = payload.getBodyBatteryMostRecentValue()) == null) ? -1 : bodyBatteryMostRecentValue2.intValue();
                            z17 = true;
                            String str5 = dVarC.f21619a;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (iIntValue2 == -1 || iIntValue == -1 || w.J(str5)) {
                                aVar4 = aVar4;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                SparseArray sparseArray = (SparseArray) linkedHashMap.get(dVarC);
                                if (sparseArray != null) {
                                    i16 = iIntValue;
                                    int size = sparseArray.size() - 1;
                                    for (int i18 = -1; i18 < size; i18 = -1) {
                                        if (iIntValue2 >= sparseArray.keyAt(size)) {
                                            Object objValueAt = sparseArray.valueAt(size);
                                            objValueAt.getClass();
                                            for (Object obj : (Iterable) objValueAt) {
                                                if (((sx.a.C3042a) obj).f161125a == z26) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                            String str6 = "Found messages: " + arrayList + " for bbValue = " + iIntValue2 + ", timeOfDay = " + dVarC + ", sleepConfirmed = " + z26;
                                            i2.a aVar6 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar6.getClass();
                                            i2.a.b(a2Var, "BodyBatteryMsgManager", str6);
                                            break;
                                        }
                                        size--;
                                    }
                                } else {
                                    i16 = iIntValue;
                                }
                                sx.a.C3042a c3042a = !arrayList.isEmpty() ? (sx.a.C3042a) arrayList.get((int) ((System.currentTimeMillis() / 60000) % ((long) arrayList.size()))) : null;
                                if (c3042a == null) {
                                    i2.a aVar7 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar7.getClass();
                                    i2.a.f(a2Var2, "BodyBatteryMsgManager", "getTodayMessage: no message found!");
                                    cVar2 = new sx.a.c("", false);
                                } else {
                                    int i19 = c3042a.f161130f;
                                    if (i16 > 0) {
                                        int i24 = c3042a.f161127c;
                                        if (i24 != -1) {
                                            string = context2.getString(i24, Integer.valueOf(i16));
                                        }
                                    } else if (i16 == 0) {
                                        int i25 = c3042a.f161128d;
                                        if (i25 != -1) {
                                            string = context2.getString(i25);
                                        }
                                    } else {
                                        int i26 = c3042a.f161129e;
                                        if (i26 != -1) {
                                            string = context2.getString(i26, Integer.valueOf(Math.abs(i16)));
                                        }
                                    }
                                    string.getClass();
                                    String string2 = !w.J(string) ? context2.getString(R.string.string_space_string_pattern, string, context2.getString(i19)) : context2.getString(i19);
                                    string2.getClass();
                                    cVar2 = new sx.a.c(string2, c3042a.f161126b);
                                }
                                str3 = cVar2.f161132a;
                                z16 = true;
                            }
                        }
                        z16 = z17;
                        str3 = null;
                    } else {
                        aVar4 = aVar4;
                        z17 = true;
                        l payload4 = (aVar == null || (tVar = aVar.f21603b) == null || (userDailySummary = tVar.getUserDailySummary()) == null) ? null : userDailySummary.getPayload();
                        int iIntValue3 = (payload4 == null || (bodyBatteryDrainedValue = payload4.getBodyBatteryDrainedValue()) == null) ? -1 : bodyBatteryDrainedValue.intValue();
                        int iIntValue4 = (payload4 == null || (bodyBatteryMostRecentValue = payload4.getBodyBatteryMostRecentValue()) == null) ? -1 : bodyBatteryMostRecentValue.intValue();
                        if (iIntValue4 == -1 || iIntValue3 == -1) {
                            z16 = z17;
                            str3 = null;
                        } else {
                            if (b(aVar) < 43200000) {
                                String string3 = context2.getString(R.string.gcm_body_battery_message_73);
                                string3.getClass();
                                cVar = new sx.a.c(string3, false);
                                z16 = true;
                            } else {
                                SparseArray sparseArray2 = (SparseArray) linkedHashMap.get(bx.d.f.f21624c);
                                if (sparseArray2 != null) {
                                    int size2 = sparseArray2.size() - 1;
                                    while (true) {
                                        if (-1 >= size2) {
                                            z16 = true;
                                            cVar = new sx.a.c("", false);
                                        } else if (iIntValue4 >= sparseArray2.keyAt(size2)) {
                                            Object objValueAt2 = sparseArray2.valueAt(size2);
                                            objValueAt2.getClass();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj2 : (Iterable) objValueAt2) {
                                                j23.l lVar4 = ((sx.a.C3042a) obj2).f161131g;
                                                if (lVar4 != null) {
                                                    z18 = z17;
                                                    if (lVar4.d(iIntValue3) == z18) {
                                                        arrayList2.add(obj2);
                                                    }
                                                } else {
                                                    z18 = z17;
                                                }
                                                z17 = z18;
                                            }
                                            z16 = z17;
                                            if (arrayList2.isEmpty()) {
                                                cVar = new sx.a.c("", false);
                                            } else {
                                                sx.a.C3042a c3042a2 = (sx.a.C3042a) arrayList2.get((int) ((System.currentTimeMillis() / 60000) % ((long) arrayList2.size())));
                                                String string4 = context2.getString(c3042a2.f161130f);
                                                string4.getClass();
                                                cVar = new sx.a.c(string4, c3042a2.f161126b);
                                            }
                                        } else {
                                            size2--;
                                        }
                                    }
                                } else {
                                    z16 = true;
                                    cVar = new sx.a.c("", false);
                                }
                            }
                            str3 = cVar.f161132a;
                        }
                    }
                    if (z14 || str3 == null) {
                        str2 = str3;
                        str = null;
                        strF = null;
                    } else if (b(aVar) < 43200000 ? z16 : false) {
                        strF = aVar4.f();
                        str2 = str3;
                        str = null;
                    } else {
                        str2 = str3;
                        str = null;
                        strF = null;
                    }
                } else {
                    aVar4 = aVar4;
                    z16 = true;
                    strF = aVar4.f();
                    str = null;
                    str2 = null;
                }
            } else {
                rx.b bVarA = aVar4.a(bodyBatteryDynamicFeedbackEvent.getFeedbackShortType(), bodyBatteryDynamicFeedbackEvent.getFeedbackLongType(), bodyBatteryDynamicFeedbackEvent.getBodyBatteryLevel());
                String str7 = bVarA.f154909a;
                String str8 = bVarA.f154910b;
                str = bVarA.f154911c;
                aVar4 = aVar4;
                strF = str7;
                str2 = str8;
                z16 = true;
            }
            r.a aVar8 = r.S;
            r rVarF = x2.f(aVar8, 1.0f);
            float f15 = 16;
            g6.f.a aVar9 = g6.f.f75994b;
            r rVarA = c2.l.A(rVarF, f15, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar10 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar10);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarE.C(-1840245656);
                lVar = lVar3;
                i.a(b0Var, lVar, o0VarE, 6 | (l.W0 << 3));
                z19 = false;
                o0VarE.g0(false);
            } else {
                lVar = lVar3;
                z19 = false;
                o0VarE.C(-1840166141);
                h.a(b0Var, lVar, o0VarE, 6 | (l.W0 << 3));
                o0VarE.g0(false);
            }
            if (strF == null) {
                o0VarE.C(-1840026270);
                o0VarE.g0(z19);
                aVar2 = aVar8;
                str4 = str;
                aVar3 = aVar4;
                f14 = f15;
                lVar2 = lVar;
                r14 = z19;
            } else {
                o0VarE.C(-1840026269);
                aVar2 = aVar8;
                r rVarC2 = c2.l.C(aVar2, 0.0f, 32, 0.0f, 0.0f, 13);
                String string5 = strF.toString();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                str4 = str;
                lVar2 = lVar;
                z24 = z19;
                aVar3 = aVar4;
                f14 = f15;
                mh.c(string5, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 48, 0, 131068);
                Unit unit = Unit.INSTANCE;
                o0Var2.g0(z24);
            }
            if (str2 == null) {
                o0Var2 = o0VarE;
                r14 = z24;
                o0Var3 = o0Var2;
                o0Var3 = o0VarE;
                o0Var3.C(-1839738063);
                o0Var3.g0(r14);
                z25 = true;
                o0Var4 = o0Var3;
            } else {
                o0Var2 = o0VarE;
                r14 = z24;
                o0Var3 = o0Var2;
                o0Var3 = o0VarE;
                o0Var3.C(-1839738062);
                o0Var3.C(1187580600);
                s5.c.b bVar2 = new s5.c.b(r14, 1, null);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97932i;
                int iJ = bVar2.j(d92.c.b(x0Var, o0Var3).f157322a);
                try {
                    bVar2.b(str2.toString());
                    Unit unit2 = Unit.INSTANCE;
                    bVar2.f(iJ);
                    if (str4 == null) {
                        o0Var3.C(-1385628564);
                        o0Var3.g0(r14);
                    } else {
                        o0Var3.C(-1385628563);
                        bVar2.b(StringUtils.SPACE);
                        fVar.getClass();
                        r0 r0Var = new r0(x0.a(x0Var, hb.a.e(o0Var3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a, null, null, null, 14, null);
                        boolean zR = o0Var3.r(context);
                        Object objQ = o0Var3.q();
                        if (zR) {
                            objQ = new e(context, r14);
                            o0Var3.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new e(context, r14);
                                o0Var3.K(objQ);
                            }
                        }
                        int iG = bVar2.g(new s5.m.a(str4, r0Var, (s5.n) objQ));
                        try {
                            bVar2.b(str4);
                            bVar2.f(iG);
                            o0Var3.g0(r14);
                        } catch (Throwable th3) {
                            bVar2.f(iG);
                            throw th3;
                        }
                    }
                    s5.c cVarK = bVar2.k();
                    o0Var3.g0(r14);
                    r rVarC3 = c2.l.C(aVar2, 0.0f, strF != null ? 8 : 32, 0.0f, 0.0f, 13);
                    fVar.getClass();
                    o0 o0Var5 = o0Var3;
                    z25 = true;
                    mh.d(cVarK, rVarC3, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(x0Var, o0Var3), o0Var5, 0, 0, 262140);
                    o0 o0Var6 = o0Var5;
                    o0Var6.g0(r14);
                    o0Var4 = o0Var6;
                } catch (Throwable th4) {
                    bVar2.f(iJ);
                    throw th4;
                }
            }
            i15 = 7;
            l72.x0.f111346a.e(c2.l.C(x2.f(aVar2, 1.0f), 0.0f, 24, 0.0f, f14, 5), z3.f.c(-1834016265, new o72.b(7, aVar3, lVar2), o0Var4), o0Var4, (l72.x0.f111348c << 6) | 54, 0);
            o0Var4.g0(z25);
            o0Var = o0Var4;
        } else {
            i15 = 7;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(z14, aVar, i14, i15);
        }
    }

    public static final long b(bx.a aVar) {
        t tVar;
        gs1.e allDayStressDTO;
        gs1.e.c payload;
        ArrayList arrayListB = (aVar == null || (tVar = aVar.f21603b) == null || (allDayStressDTO = tVar.getAllDayStressDTO()) == null || (payload = allDayStressDTO.getPayload()) == null) ? null : payload.b();
        int i14 = 0;
        if (arrayListB != null && !arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                gs1.e.d dVar = ((gs1.e.a) it.next()).f78730b;
                if (dVar != null && !dVar.equals(gs1.e.d.C1586d.f78742c) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return ((long) i14) * 180000;
    }
}
