package fd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.targetedselection.l;
import e23.p;
import et1.a2;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.c2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.a f70451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.targetedselection.b f70452c;

    public /* synthetic */ b(int i14, com.garmin.android.apps.connectmobile.devices.targetedselection.b bVar, l.a aVar) {
        this.f70450a = i14;
        this.f70451b = aVar;
        this.f70452c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strI;
        String str;
        Object objQ;
        Object obj3;
        boolean zR;
        Object obj4;
        int i14 = this.f70450a;
        final com.garmin.android.apps.connectmobile.devices.targetedselection.b bVar = this.f70452c;
        boolean z14 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.devices.targetedselection.b.f34591c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(366451962, new b(i15, bVar, this.f70451b), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                final l.a aVar = this.f70451b;
                bz.d dVar = aVar.f34621j;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.devices.targetedselection.b.f34591c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Integer f22267f = dVar != null ? dVar.getF22267f() : null;
                    Object objQ2 = mVar2.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    Object obj5 = objQ2;
                    if (objQ2 == c2565a) {
                        c2 c2VarN = p0.n(Boolean.FALSE);
                        mVar2.K(c2VarN);
                        obj5 = c2VarN;
                    }
                    p1 p1Var = (p1) obj5;
                    boolean zR2 = mVar2.r(bVar) | mVar2.r(aVar);
                    Object objQ3 = mVar2.q();
                    Object obj6 = objQ3;
                    if (zR2 || objQ3 == c2565a) {
                        final boolean z15 = z14 ? 1 : 0;
                        e23.a aVar2 = new e23.a() { // from class: fd0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z15) {
                                    case 0:
                                        bVar.f34592a.a3(aVar);
                                        break;
                                    default:
                                        bVar.f34592a.a3(aVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar2);
                        obj6 = aVar2;
                    }
                    e23.a aVar3 = (e23.a) obj6;
                    Object objQ4 = mVar2.q();
                    Object obj7 = objQ4;
                    if (objQ4 == c2565a) {
                        a2 a2Var = new a2(p1Var, 13);
                        mVar2.K(a2Var);
                        obj7 = a2Var;
                    }
                    e23.a aVar4 = (e23.a) obj7;
                    boolean zR3 = mVar2.r(bVar) | mVar2.r(aVar);
                    Object objQ5 = mVar2.q();
                    Object obj8 = objQ5;
                    if (zR3 || objQ5 == c2565a) {
                        e23.a aVar5 = new e23.a() { // from class: fd0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        bVar.f34592a.a3(aVar);
                                        break;
                                    default:
                                        bVar.f34592a.a3(aVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar5);
                        obj8 = aVar5;
                    }
                    com.garmin.android.apps.connectmobile.devices.targetedselection.c.a(aVar, aVar3, aVar4, (e23.a) obj8, mVar2, 384);
                    if (!((Boolean) p1Var.getF182175a()).booleanValue() || f22267f == null) {
                        mVar2.C(-835106456);
                        mVar2.f();
                    } else {
                        mVar2.C(-835877178);
                        Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                        int iIntValue3 = f22267f.intValue();
                        List<String> listA = dVar.a();
                        bVar.getClass();
                        String string = context.getString(R.string.lbl_or);
                        string.getClass();
                        Integer numValueOf = listA != null ? Integer.valueOf(listA.size()) : null;
                        if (numValueOf != null && numValueOf.intValue() == 1) {
                            str = listA.get(0);
                        } else if (numValueOf != null && numValueOf.intValue() == 2) {
                            str = ((Object) listA.get(0)) + StringUtils.SPACE + string + StringUtils.SPACE + ((Object) listA.get(1));
                        } else {
                            if (numValueOf != null && numValueOf.intValue() == 3) {
                                str = ((Object) listA.get(0)) + ", " + ((Object) listA.get(1)) + StringUtils.SPACE + string + StringUtils.SPACE + ((Object) listA.get(2));
                            } else {
                                strI = "";
                            }
                            String str2 = strI;
                            objQ = mVar2.q();
                            obj3 = objQ;
                            if (objQ == c2565a) {
                                a2 a2Var2 = new a2(p1Var, 14);
                                mVar2.K(a2Var2);
                                obj3 = a2Var2;
                            }
                            e23.a aVar6 = (e23.a) obj3;
                            zR = mVar2.r(context);
                            Object objQ6 = mVar2.q();
                            obj4 = objQ6;
                            if (zR || objQ6 == c2565a) {
                                by1.p pVar = new by1.p(context, p1Var, 1);
                                mVar2.K(pVar);
                                obj4 = pVar;
                            }
                            com.garmin.android.apps.connectmobile.devices.targetedselection.c.b(aVar, iIntValue3, str2, aVar6, (e23.a) obj4, mVar2, 3072);
                            mVar2.f();
                        }
                        strI = hb.a.i(str);
                        String str3 = strI;
                        objQ = mVar2.q();
                        obj3 = objQ;
                        if (objQ == c2565a) {
                            a2 a2Var3 = new a2(p1Var, 14);
                            mVar2.K(a2Var3);
                            obj3 = a2Var3;
                        }
                        e23.a aVar7 = (e23.a) obj3;
                        zR = mVar2.r(context);
                        Object objQ7 = mVar2.q();
                        obj4 = objQ7;
                        if (zR) {
                            by1.p pVar2 = new by1.p(context, p1Var, 1);
                            mVar2.K(pVar2);
                            obj4 = pVar2;
                        } else {
                            by1.p pVar3 = new by1.p(context, p1Var, 1);
                            mVar2.K(pVar3);
                            obj4 = pVar3;
                        }
                        com.garmin.android.apps.connectmobile.devices.targetedselection.c.b(aVar, iIntValue3, str3, aVar7, (e23.a) obj4, mVar2, 3072);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
