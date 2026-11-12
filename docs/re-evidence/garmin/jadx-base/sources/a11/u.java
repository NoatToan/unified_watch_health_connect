package a11;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.y0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.onboarding.education.VoiceAssistantEducationalActivity;
import i3.cf;
import i3.df;
import i3.j2;
import i3.u7;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.t3;
import p005kotlin.Unit;
import p008y1.x0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.y3;
import v62.h6;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383d;

    public /* synthetic */ u(List list, int i14, boolean z14, boolean z15) {
        this.f380a = 1;
        this.f383d = list;
        this.f381b = z14;
        this.f382c = z15;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:172:0x0452  */
    /* JADX WARN: Code duplicated, block: B:179:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:187:0x050a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        r82.p pVar;
        r82.p pVar2;
        int iB;
        int iIntValue;
        int iIntValue2;
        tj1.e eVar;
        j2 j2VarD;
        int i14 = this.f380a;
        p3.m.a aVar = p3.m.f135153a;
        eVarB = null;
        tj1.e eVarB = null;
        boolean z14 = this.f382c;
        final int i15 = 1;
        boolean z15 = this.f381b;
        final int i16 = 2;
        boolean z16 = false;
        int iF = 0;
        Object obj3 = this.f383d;
        switch (i14) {
            case 0:
                final o21.c cVar = (o21.c) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    int iIntValue4 = ((Number) cVar.f128656l.getF182175a()).intValue();
                    i53.c cVar2 = (i53.c) cVar.f128653i.getF182175a();
                    boolean zB = mVar.B(cVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        final int i17 = z16 ? 1 : 0;
                        objQ = new e23.l() { // from class: a11.x
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                Integer num;
                                o21.g gVar;
                                int i18 = i17;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                switch (i18) {
                                    case 0:
                                        o21.c cVar3 = cVar;
                                        Integer num2 = (Integer) p13.h0.e0(iIntValue5, (i53.c) cVar3.f128653i.getF182175a());
                                        if (num2 != null) {
                                            int iIntValue6 = num2.intValue();
                                            if (!cVar3.f128647c) {
                                                boolean z17 = cVar3.b() == o21.g.AM;
                                                if (z17 && iIntValue6 == 12) {
                                                    iIntValue6 = 0;
                                                } else if (!z17 && iIntValue6 < 12) {
                                                    iIntValue6 += 12;
                                                }
                                            }
                                            b63.v vVarA = cVar3.a();
                                            int minute = vVarA.f16219a.getMinute();
                                            LocalTime localTime = vVarA.f16219a;
                                            cVar3.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue6, minute, localTime.getSecond(), localTime.getNano()), cVar3.f128645a, cVar3.f128646b));
                                        }
                                        break;
                                    case 1:
                                        o21.c cVar4 = cVar;
                                        if (cVar4.f128649e && (num = (Integer) p13.h0.e0(iIntValue5, (i53.c) cVar4.f128654j.getF182175a())) != null) {
                                            cVar4.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar4.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar4.f128645a, cVar4.f128646b));
                                        }
                                        break;
                                    default:
                                        o21.c cVar5 = cVar;
                                        if (!cVar5.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue5, (List) cVar5.f128651g.getF182175a())) != null) {
                                            int hour = cVar5.a().f16219a.getHour();
                                            if (gVar == o21.g.PM && hour < 12) {
                                                hour += 12;
                                            } else if (gVar == o21.g.AM && hour >= 12) {
                                                hour -= 12;
                                            }
                                            b63.v vVarA2 = cVar5.a();
                                            int minute2 = vVarA2.f16219a.getMinute();
                                            LocalTime localTime2 = vVarA2.f16219a;
                                            cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar5.f128645a, cVar5.f128646b));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i18 = z16 ? 1 : 0;
                            objQ = new e23.l() { // from class: a11.x
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    Integer num;
                                    o21.g gVar;
                                    int i19 = i18;
                                    int iIntValue5 = ((Integer) obj4).intValue();
                                    switch (i19) {
                                        case 0:
                                            o21.c cVar3 = cVar;
                                            Integer num2 = (Integer) p13.h0.e0(iIntValue5, (i53.c) cVar3.f128653i.getF182175a());
                                            if (num2 != null) {
                                                int iIntValue6 = num2.intValue();
                                                if (!cVar3.f128647c) {
                                                    boolean z17 = cVar3.b() == o21.g.AM;
                                                    if (z17 && iIntValue6 == 12) {
                                                        iIntValue6 = 0;
                                                    } else if (!z17 && iIntValue6 < 12) {
                                                        iIntValue6 += 12;
                                                    }
                                                }
                                                b63.v vVarA = cVar3.a();
                                                int minute = vVarA.f16219a.getMinute();
                                                LocalTime localTime = vVarA.f16219a;
                                                cVar3.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue6, minute, localTime.getSecond(), localTime.getNano()), cVar3.f128645a, cVar3.f128646b));
                                            }
                                            break;
                                        case 1:
                                            o21.c cVar4 = cVar;
                                            if (cVar4.f128649e && (num = (Integer) p13.h0.e0(iIntValue5, (i53.c) cVar4.f128654j.getF182175a())) != null) {
                                                cVar4.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar4.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar4.f128645a, cVar4.f128646b));
                                            }
                                            break;
                                        default:
                                            o21.c cVar5 = cVar;
                                            if (!cVar5.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue5, (List) cVar5.f128651g.getF182175a())) != null) {
                                                int hour = cVar5.a().f16219a.getHour();
                                                if (gVar == o21.g.PM && hour < 12) {
                                                    hour += 12;
                                                } else if (gVar == o21.g.AM && hour >= 12) {
                                                    hour -= 12;
                                                }
                                                b63.v vVarA2 = cVar5.a();
                                                int minute2 = vVarA2.f16219a.getMinute();
                                                LocalTime localTime2 = vVarA2.f16219a;
                                                cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar5.f128645a, cVar5.f128646b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    r82.p pVar3 = new r82.p(cVar2, iIntValue4, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ, 1020, null);
                    if (z15) {
                        mVar.C(1858881203);
                        int iIntValue5 = ((Number) cVar.f128657m.getF182175a()).intValue();
                        i53.c cVar3 = (i53.c) cVar.f128654j.getF182175a();
                        boolean zB2 = mVar.B(cVar);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new e23.l() { // from class: a11.x
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    Integer num;
                                    o21.g gVar;
                                    int i19 = i15;
                                    int iIntValue6 = ((Integer) obj4).intValue();
                                    switch (i19) {
                                        case 0:
                                            o21.c cVar4 = cVar;
                                            Integer num2 = (Integer) p13.h0.e0(iIntValue6, (i53.c) cVar4.f128653i.getF182175a());
                                            if (num2 != null) {
                                                int iIntValue7 = num2.intValue();
                                                if (!cVar4.f128647c) {
                                                    boolean z17 = cVar4.b() == o21.g.AM;
                                                    if (z17 && iIntValue7 == 12) {
                                                        iIntValue7 = 0;
                                                    } else if (!z17 && iIntValue7 < 12) {
                                                        iIntValue7 += 12;
                                                    }
                                                }
                                                b63.v vVarA = cVar4.a();
                                                int minute = vVarA.f16219a.getMinute();
                                                LocalTime localTime = vVarA.f16219a;
                                                cVar4.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue7, minute, localTime.getSecond(), localTime.getNano()), cVar4.f128645a, cVar4.f128646b));
                                            }
                                            break;
                                        case 1:
                                            o21.c cVar5 = cVar;
                                            if (cVar5.f128649e && (num = (Integer) p13.h0.e0(iIntValue6, (i53.c) cVar5.f128654j.getF182175a())) != null) {
                                                cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar5.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar5.f128645a, cVar5.f128646b));
                                            }
                                            break;
                                        default:
                                            o21.c cVar6 = cVar;
                                            if (!cVar6.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue6, (List) cVar6.f128651g.getF182175a())) != null) {
                                                int hour = cVar6.a().f16219a.getHour();
                                                if (gVar == o21.g.PM && hour < 12) {
                                                    hour += 12;
                                                } else if (gVar == o21.g.AM && hour >= 12) {
                                                    hour -= 12;
                                                }
                                                b63.v vVarA2 = cVar6.a();
                                                int minute2 = vVarA2.f16219a.getMinute();
                                                LocalTime localTime2 = vVarA2.f16219a;
                                                cVar6.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar6.f128645a, cVar6.f128646b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new e23.l() { // from class: a11.x
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        Integer num;
                                        o21.g gVar;
                                        int i19 = i15;
                                        int iIntValue6 = ((Integer) obj4).intValue();
                                        switch (i19) {
                                            case 0:
                                                o21.c cVar4 = cVar;
                                                Integer num2 = (Integer) p13.h0.e0(iIntValue6, (i53.c) cVar4.f128653i.getF182175a());
                                                if (num2 != null) {
                                                    int iIntValue7 = num2.intValue();
                                                    if (!cVar4.f128647c) {
                                                        boolean z17 = cVar4.b() == o21.g.AM;
                                                        if (z17 && iIntValue7 == 12) {
                                                            iIntValue7 = 0;
                                                        } else if (!z17 && iIntValue7 < 12) {
                                                            iIntValue7 += 12;
                                                        }
                                                    }
                                                    b63.v vVarA = cVar4.a();
                                                    int minute = vVarA.f16219a.getMinute();
                                                    LocalTime localTime = vVarA.f16219a;
                                                    cVar4.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue7, minute, localTime.getSecond(), localTime.getNano()), cVar4.f128645a, cVar4.f128646b));
                                                }
                                                break;
                                            case 1:
                                                o21.c cVar5 = cVar;
                                                if (cVar5.f128649e && (num = (Integer) p13.h0.e0(iIntValue6, (i53.c) cVar5.f128654j.getF182175a())) != null) {
                                                    cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar5.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar5.f128645a, cVar5.f128646b));
                                                }
                                                break;
                                            default:
                                                o21.c cVar6 = cVar;
                                                if (!cVar6.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue6, (List) cVar6.f128651g.getF182175a())) != null) {
                                                    int hour = cVar6.a().f16219a.getHour();
                                                    if (gVar == o21.g.PM && hour < 12) {
                                                        hour += 12;
                                                    } else if (gVar == o21.g.AM && hour >= 12) {
                                                        hour -= 12;
                                                    }
                                                    b63.v vVarA2 = cVar6.a();
                                                    int minute2 = vVarA2.f16219a.getMinute();
                                                    LocalTime localTime2 = vVarA2.f16219a;
                                                    cVar6.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar6.f128645a, cVar6.f128646b));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ2);
                            }
                        }
                        r82.p pVar4 = new r82.p(cVar3, iIntValue5, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ2, 1020, null);
                        mVar.f();
                        pVar = pVar4;
                    } else {
                        mVar.C(1859192164);
                        mVar.f();
                        pVar = null;
                    }
                    if (z14) {
                        mVar.C(1859656420);
                        mVar.f();
                        pVar2 = null;
                    } else {
                        mVar.C(1859345459);
                        int iIntValue6 = ((Number) cVar.f128655k.getF182175a()).intValue();
                        i53.c cVar4 = (i53.c) cVar.f128652h.getF182175a();
                        boolean zB3 = mVar.B(cVar);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new e23.l() { // from class: a11.x
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    Integer num;
                                    o21.g gVar;
                                    int i19 = i16;
                                    int iIntValue7 = ((Integer) obj4).intValue();
                                    switch (i19) {
                                        case 0:
                                            o21.c cVar5 = cVar;
                                            Integer num2 = (Integer) p13.h0.e0(iIntValue7, (i53.c) cVar5.f128653i.getF182175a());
                                            if (num2 != null) {
                                                int iIntValue8 = num2.intValue();
                                                if (!cVar5.f128647c) {
                                                    boolean z17 = cVar5.b() == o21.g.AM;
                                                    if (z17 && iIntValue8 == 12) {
                                                        iIntValue8 = 0;
                                                    } else if (!z17 && iIntValue8 < 12) {
                                                        iIntValue8 += 12;
                                                    }
                                                }
                                                b63.v vVarA = cVar5.a();
                                                int minute = vVarA.f16219a.getMinute();
                                                LocalTime localTime = vVarA.f16219a;
                                                cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue8, minute, localTime.getSecond(), localTime.getNano()), cVar5.f128645a, cVar5.f128646b));
                                            }
                                            break;
                                        case 1:
                                            o21.c cVar6 = cVar;
                                            if (cVar6.f128649e && (num = (Integer) p13.h0.e0(iIntValue7, (i53.c) cVar6.f128654j.getF182175a())) != null) {
                                                cVar6.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar6.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar6.f128645a, cVar6.f128646b));
                                            }
                                            break;
                                        default:
                                            o21.c cVar7 = cVar;
                                            if (!cVar7.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue7, (List) cVar7.f128651g.getF182175a())) != null) {
                                                int hour = cVar7.a().f16219a.getHour();
                                                if (gVar == o21.g.PM && hour < 12) {
                                                    hour += 12;
                                                } else if (gVar == o21.g.AM && hour >= 12) {
                                                    hour -= 12;
                                                }
                                                b63.v vVarA2 = cVar7.a();
                                                int minute2 = vVarA2.f16219a.getMinute();
                                                LocalTime localTime2 = vVarA2.f16219a;
                                                cVar7.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar7.f128645a, cVar7.f128646b));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e23.l() { // from class: a11.x
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        Integer num;
                                        o21.g gVar;
                                        int i19 = i16;
                                        int iIntValue7 = ((Integer) obj4).intValue();
                                        switch (i19) {
                                            case 0:
                                                o21.c cVar5 = cVar;
                                                Integer num2 = (Integer) p13.h0.e0(iIntValue7, (i53.c) cVar5.f128653i.getF182175a());
                                                if (num2 != null) {
                                                    int iIntValue8 = num2.intValue();
                                                    if (!cVar5.f128647c) {
                                                        boolean z17 = cVar5.b() == o21.g.AM;
                                                        if (z17 && iIntValue8 == 12) {
                                                            iIntValue8 = 0;
                                                        } else if (!z17 && iIntValue8 < 12) {
                                                            iIntValue8 += 12;
                                                        }
                                                    }
                                                    b63.v vVarA = cVar5.a();
                                                    int minute = vVarA.f16219a.getMinute();
                                                    LocalTime localTime = vVarA.f16219a;
                                                    cVar5.f128650f.setValue((b63.v) j23.t.k(new b63.v(iIntValue8, minute, localTime.getSecond(), localTime.getNano()), cVar5.f128645a, cVar5.f128646b));
                                                }
                                                break;
                                            case 1:
                                                o21.c cVar6 = cVar;
                                                if (cVar6.f128649e && (num = (Integer) p13.h0.e0(iIntValue7, (i53.c) cVar6.f128654j.getF182175a())) != null) {
                                                    cVar6.f128650f.setValue((b63.v) j23.t.k(new b63.v(cVar6.a().f16219a.getHour(), num.intValue(), 0, 0, 12, null), cVar6.f128645a, cVar6.f128646b));
                                                }
                                                break;
                                            default:
                                                o21.c cVar7 = cVar;
                                                if (!cVar7.f128647c && (gVar = (o21.g) p13.h0.e0(iIntValue7, (List) cVar7.f128651g.getF182175a())) != null) {
                                                    int hour = cVar7.a().f16219a.getHour();
                                                    if (gVar == o21.g.PM && hour < 12) {
                                                        hour += 12;
                                                    } else if (gVar == o21.g.AM && hour >= 12) {
                                                        hour -= 12;
                                                    }
                                                    b63.v vVarA2 = cVar7.a();
                                                    int minute2 = vVarA2.f16219a.getMinute();
                                                    LocalTime localTime2 = vVarA2.f16219a;
                                                    cVar7.f128650f.setValue((b63.v) j23.t.k(new b63.v(hour, minute2, localTime2.getSecond(), localTime2.getNano()), cVar7.f128645a, cVar7.f128646b));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar.K(objQ3);
                            }
                        }
                        r82.p pVar5 = new r82.p(cVar4, iIntValue6, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ3, 1020, null);
                        mVar.f();
                        pVar2 = pVar5;
                    }
                    z.a(null, pVar3, pVar, pVar2, mVar, 0, 1);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                gw1.k.a((List) obj3, z15, z14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                c2.a0 a0Var = (c2.a0) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z17 = z15 || z14;
                    i11.a.f87072a.getClass();
                    r1.c0.c(a0Var, z17, null, null, null, null, i11.a.f87073b, mVar2, 1572864, 30);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                cf cfVar = (cf) obj3;
                m0 m0Var = p008y1.e.f193170a;
                x0 x0Var = new x0();
                float f14 = (int) (((g6.m) obj).f76013a >> 32);
                x0Var.a(df.Settled, 0.0f);
                if (z15) {
                    x0Var.a(df.StartToEnd, f14);
                }
                if (z14) {
                    x0Var.a(df.EndToStart, -f14);
                }
                Unit unit = Unit.INSTANCE;
                float[] fArr = x0Var.f193705b;
                ArrayList arrayList = x0Var.f193704a;
                int size = arrayList.size();
                fArr.getClass();
                p13.l.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                return new o13.p(new p008y1.a0(arrayList, fArrCopyOfRange), (df) cfVar.f87782a.f193587i.getF182175a());
            case 4:
                t3 t3Var = (t3) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                VoiceAssistantEducationalActivity.a aVar4 = VoiceAssistantEducationalActivity.f39694a;
                if (mVar3.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, R.string.lbl_access_your_phone_voice_assistant);
                    String strQ2 = gl1.y.Q(mVar3, R.string.msg_onboarding_phone_assistant);
                    String strQ3 = gl1.y.Q(mVar3, R.string.lbl_how_to_set_up_phone_assistant);
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA = a72.d.a(h6.f175899a);
                    boolean zH = mVar3.h(z15) | mVar3.h(z14) | mVar3.r(t3Var);
                    Object objQ4 = mVar3.q();
                    if (zH) {
                        objQ4 = new pk0.a(z15, z14, t3Var, 2);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new pk0.a(z15, z14, t3Var, 2);
                            mVar3.K(objQ4);
                        }
                    }
                    m31.a.a(strQ, strQ2, strQ3, dVarA, (e23.a) objQ4, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                mm1.b bVar2 = (mm1.b) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    b10.b bVar3 = new b10.b((Context) mVar4.A(y3Var));
                    b10.d dVar = new b10.d((Context) mVar4.A(y3Var));
                    mm1.a overallStats = bVar2 != null ? bVar2.getOverallStats() : null;
                    if (!z15 || overallStats == null) {
                        mVar4.C(380821091);
                        mVar4.f();
                    } else {
                        mVar4.C(379755342);
                        l72.x0.f111346a.e(null, z3.f.c(789029619, new h21.m(overallStats, dVar, bVar3, this.f382c, 12), mVar4), mVar4, (l72.x0.f111348c << 6) | 48, 1);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ir0.e eVar2 = (ir0.e) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (eVar2 != null) {
                        List<ir0.f> list = eVar2.f94793a;
                        if (eVar2.m()) {
                            mVar5.C(-1114922281);
                            boolean z18 = this.f381b;
                            if (z18) {
                                ArrayList arrayListK = list != null ? eVar2.k(list) : null;
                                if (arrayListK != null) {
                                    Iterator it = arrayListK.iterator();
                                    iIntValue2 = 0;
                                    while (it.hasNext()) {
                                        Integer numD = ((ir0.f) it.next()).d();
                                        iIntValue2 += numD != null ? numD.intValue() : 0;
                                    }
                                } else {
                                    iIntValue2 = 0;
                                }
                                int iCeil = (int) Math.ceil(((double) (arrayListK != null ? arrayListK.size() : 0)) / 7.0d);
                                iB = iCeil > 0 ? iIntValue2 / iCeil : 0;
                            } else {
                                iB = eVar2.b();
                            }
                            if (z18) {
                                ArrayList arrayListK2 = list != null ? eVar2.k(list) : null;
                                if (arrayListK2 != null) {
                                    Iterator it3 = arrayListK2.iterator();
                                    iIntValue = 0;
                                    while (it3.hasNext()) {
                                        Integer numG = ((ir0.f) it3.next()).g();
                                        iIntValue += numG != null ? numG.intValue() : 0;
                                    }
                                } else {
                                    iIntValue = 0;
                                }
                                int iCeil2 = (int) Math.ceil(((double) (arrayListK2 != null ? arrayListK2.size() : 0)) / 7.0d);
                                if (iCeil2 > 0) {
                                    iF = iIntValue / iCeil2;
                                }
                            } else {
                                iF = eVar2.f();
                            }
                            rr0.q.b(Integer.valueOf(iB), Integer.valueOf(iF), Integer.valueOf(eVar2.d()), this.f382c, z18, mVar5, 0, 0);
                            mVar5.f();
                        } else {
                            mVar5.C(-1115029634);
                            rr0.q.b(null, null, null, false, false, mVar5, 0, 31);
                            mVar5.f();
                        }
                    } else {
                        mVar5.C(-1115029634);
                        rr0.q.b(null, null, null, false, false, mVar5, 0, 31);
                        mVar5.f();
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dialogInterface.getClass();
                if (!dVar2.f43765z) {
                    dVar2.y6();
                } else if (z15 && z14) {
                    pj1.s sVarW6 = dVar2.w6();
                    sVarW6.f137986x = false;
                    g3<tj1.e> g3VarD = sVarW6.C4().d();
                    if (g3VarD != null && (eVar = g3VarD.f35301b) != null) {
                        eVarB = tj1.e.b(eVar, Boolean.FALSE, null, 2);
                    }
                    y0<g3<tj1.e>> y0VarC4 = sVarW6.C4();
                    g3.f35298f.getClass();
                    y0VarC4.m(g3.a.d(eVarB));
                    dVar2.y6();
                } else {
                    dVar2.D.f(false);
                    ((b.u) dVar2.C.getValue()).d();
                }
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            default:
                e23.p pVar6 = (e23.p) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (z15) {
                        mVar6.C(959482749);
                        j2VarD = d92.c.c(d92.b.f58623a, mVar6, d92.b.f58626d);
                        mVar6.f();
                    } else {
                        mVar6.C(959547260);
                        j2VarD = d92.c.d(d92.b.f58623a, mVar6, d92.b.f58626d);
                        mVar6.f();
                    }
                    j2 j2Var = j2VarD;
                    if (z14) {
                        mVar6.C(959709080);
                        mVar6.f();
                    } else {
                        mVar6.C(959634122);
                        d92.b.f58623a.getClass();
                        z02.b.b(d92.b.a(mVar6).c().c(), mVar6, 0);
                        mVar6.f();
                    }
                    u7.b(j2Var, null, null, pVar6, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u(Object obj, boolean z14, boolean z15, int i14) {
        this.f380a = i14;
        this.f383d = obj;
        this.f381b = z14;
        this.f382c = z15;
    }

    public /* synthetic */ u(boolean z14, boolean z15, Object obj, int i14) {
        this.f380a = i14;
        this.f381b = z14;
        this.f382c = z15;
        this.f383d = obj;
    }
}
