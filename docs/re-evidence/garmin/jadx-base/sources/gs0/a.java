package gs0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import cs0.c;
import d53.u;
import f21.a0;
import g11.e;
import gp.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import yr0.l;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgs0/a;", "Lr70/r;", "Lhs0/a;", "stateHolder", "<init>", "(Lhs0/a;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs0.a f78682a;

    public a(hs0.a aVar) {
        aVar.getClass();
        this.f78682a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0184  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x018b  */
    /* JADX WARN: Code duplicated, block: B:138:0x026d  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        ArrayList arrayList;
        String string;
        yr0.m mVar2;
        boolean z14;
        int i15;
        yr0.m mVar3;
        boolean z15;
        String string2;
        boolean z16;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -2001979734);
        int i16 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarQ.B(this) : o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i16 & 1, (i16 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            c cVarInvoke = this.f78682a.f85339a.invoke();
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            if (cVarInvoke == null) {
                o0VarQ.C(-1062181620);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(-1062181619);
                ks0.c cVar = new ks0.c(context);
                i53.c<l> cVar2 = cVarInvoke.f55451d;
                Integer num = cVarInvoke.f55455h;
                boolean z17 = cVarInvoke.f55450c;
                int i17 = R.string.lbl_none;
                Double dValueOf = null;
                l22.a aVar = cVar.f106382a;
                if (z17) {
                    string = aVar.getString(R.string.lbl_none);
                } else {
                    if (cVar2 != null) {
                        arrayList = new ArrayList();
                        for (l lVar : cVar2) {
                            l lVar2 = lVar;
                            ns0.b.f127812a.getClass();
                            if (lVar2 != null) {
                                DateTime dateTimeD = lVar2.d();
                                DateTime dateTimeB = lVar2.b();
                                if (dateTimeD != null && dateTimeB != null && ((dateTimeD.isBeforeNow() || dateTimeD.isEqualNow()) && (dateTimeB.isEqualNow() || dateTimeB.isAfterNow()))) {
                                    arrayList.add(lVar);
                                }
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        i17 = R.string.lbl_none;
                        string = aVar.getString(R.string.lbl_none);
                    } else {
                        if (arrayList.size() == 1) {
                            string = cVar.f(((l) arrayList.get(0)).f());
                        } else if (arrayList.size() == 2) {
                            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((l) it.next()).f());
                            }
                            ns0.b bVar = ns0.b.f127812a;
                            yr0.m mVar4 = (yr0.m) arrayList2.get(0);
                            bVar.getClass();
                            if (mVar4 != null && (mVar4 == yr0.m.SLEEP || mVar4 == yr0.m.LIGHT_AVOIDANCE)) {
                                yr0.m mVar5 = (yr0.m) arrayList2.get(1);
                                if (mVar5 != null && (mVar5 == yr0.m.SLEEP || mVar5 == yr0.m.LIGHT_AVOIDANCE)) {
                                    i15 = R.string.lbl_sleep_and_avoid_light;
                                } else {
                                    mVar2 = (yr0.m) arrayList2.get(0);
                                    if (mVar2 == null) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        mVar3 = (yr0.m) arrayList2.get(1);
                                        if (mVar3 == null) {
                                            z15 = false;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            i15 = R.string.lbl_seek_light_and_be_active;
                                        } else {
                                            i15 = R.string.no_value;
                                        }
                                    } else {
                                        i15 = R.string.no_value;
                                    }
                                }
                            } else {
                                mVar2 = (yr0.m) arrayList2.get(0);
                                if (mVar2 == null && (mVar2 == yr0.m.ACTIVITY || mVar2 == yr0.m.LIGHT_EXPOSURE)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i15 = R.string.no_value;
                                } else {
                                    mVar3 = (yr0.m) arrayList2.get(1);
                                    if (mVar3 == null && (mVar3 == yr0.m.ACTIVITY || mVar3 == yr0.m.LIGHT_EXPOSURE)) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        i15 = R.string.lbl_seek_light_and_be_active;
                                    } else {
                                        i15 = R.string.no_value;
                                    }
                                }
                            }
                            string = aVar.getString(i15);
                        } else {
                            string = aVar.getString(R.string.no_value);
                        }
                        i17 = R.string.lbl_none;
                    }
                }
                String strV = u.v(string, aVar.getString(i17), aVar.getString(R.string.lbl_no_guidance), false);
                String lowerCase = strV.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String strA = oi0.c.A(context, new e(23), lowerCase);
                t tVar = cVarInvoke.f55452e;
                ns0.b bVar2 = ns0.b.f127812a;
                Integer num2 = cVarInvoke.f55453f;
                bVar2.getClass();
                boolean zP = ns0.b.p(num2, tVar);
                CharSequence charSequenceC = cVar.c(num);
                if (num != null) {
                    dValueOf = Double.valueOf(((double) num.intValue()) / 60.0d);
                    cVar = cVar;
                }
                CharSequence charSequenceB = cVar.b(dValueOf);
                int i18 = tVar == null ? -1 : b.a.f78683a[tVar.ordinal()];
                if (i18 != 1 && i18 != 2 && i18 != 3) {
                    if (cVarInvoke.f55454g) {
                        charSequenceC = charSequenceB;
                    } else {
                        charSequenceC = context.getString(R.string.lbl_acclimated);
                        charSequenceC.getClass();
                    }
                }
                String strH = cVar.h(tVar);
                if (zP) {
                    string2 = context.getString(R.string.no_value_card);
                } else if (strH != null) {
                    string2 = strH + StringUtils.SPACE + ((Object) charSequenceC);
                } else {
                    string2 = charSequenceC.toString();
                }
                string2.getClass();
                o13.u uVar = new o13.u(strV, strA, string2);
                String str = (String) uVar.f128605a;
                String str2 = (String) uVar.f128606b;
                String str3 = (String) uVar.f128607c;
                boolean zR = o0VarQ.r(cVarInvoke) | o0VarQ.r(context);
                Object objQ = o0VarQ.q();
                if (zR) {
                    z16 = false;
                    objQ = new f(cVarInvoke, 4, context, z16);
                    o0VarQ.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        z16 = false;
                        objQ = new f(cVarInvoke, 4, context, z16);
                        o0VarQ.K(objQ);
                    } else {
                        z16 = false;
                    }
                }
                b.a(i16 & 14, (e23.a) objQ, rVar, str, str2, str3, o0VarQ);
                o0VarQ.g0(z16);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0((r) this, rVar, qVar, i14, 28);
        }
    }
}
