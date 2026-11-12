package vq0;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity;
import d6.h;
import d92.c;
import ds.e0;
import e23.l;
import e23.p;
import f5.b1;
import f5.k2;
import f5.v1;
import f5.y0;
import gl1.y;
import h4.d;
import h4.k;
import h4.r;
import i3.i7;
import i3.kb;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import l72.f0;
import o70.f;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.w0;
import s5.x0;
import tn2.s0;
import u1.a2;
import v2.h2;
import v62.e1;
import vx1.e;
import w51.o0;
import w51.q0;
import w52.l0;
import w52.v0;
import w70.g;
import z2.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f179429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f179430c;

    public /* synthetic */ a(int i14, Object obj, Object obj2) {
        this.f179428a = i14;
        this.f179429b = obj;
        this.f179430c = obj2;
    }

    private final Object a(Object obj, Object obj2) {
        List listD;
        RandomAccess randomAccessY0;
        g gVar = (g) this.f179429b;
        x3 x3Var = (x3) this.f179430c;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f fVar = (f) obj2;
        fVar.getClass();
        List list = (List) x3Var.getF182175a();
        p2 p2Var = gVar.f183497j;
        if (zBooleanValue) {
            randomAccessY0 = list != null ? h0.D0(list, fVar) : null;
            if (randomAccessY0 == null) {
                randomAccessY0 = j0.f134944a;
            }
            p2Var.setValue(randomAccessY0);
            g.x4(true, fVar);
        } else {
            if (list != null) {
                ArrayList arrayListY0 = h0.y0(list, fVar);
                f.f129966c.getClass();
                listD = f.a.d(arrayListY0);
            } else {
                listD = null;
            }
            if (listD == null || listD.isEmpty()) {
                gVar.f183492e.k(null, Boolean.TRUE);
            } else {
                randomAccessY0 = list != null ? h0.y0(list, fVar) : null;
                if (randomAccessY0 == null) {
                    randomAccessY0 = j0.f134944a;
                }
                p2Var.setValue(randomAccessY0);
                g.x4(false, fVar);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0458  */
    /* JADX WARN: Code duplicated, block: B:157:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:172:0x0508  */
    /* JADX WARN: Code duplicated, block: B:177:0x0535  */
    /* JADX WARN: Code duplicated, block: B:182:0x0563  */
    /* JADX WARN: Code duplicated, block: B:187:0x058e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:213:0x0647  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:263:0x080a  */
    /* JADX WARN: Code duplicated, block: B:284:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:289:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:294:0x0909  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:344:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:349:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:354:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:363:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:70:0x020f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0237  */
    /* JADX WARN: Code duplicated, block: B:82:0x026e  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a2  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        m mVar;
        int i16 = this.f179428a;
        int i17 = 4;
        int i18 = 29;
        Integer numValueOf = null;
        int i19 = 7;
        m.a aVar = m.f135153a;
        final int i24 = 3;
        boolean z14 = false;
        final int i25 = 2;
        Object obj3 = this.f179430c;
        Object obj4 = this.f179429b;
        final int i26 = 1;
        switch (i16) {
            case 0:
                l lVar = (l) obj4;
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    String str = (String) lVar.invoke(obj3);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = c.b(j92.f.f97932i, mVar2);
                    h.f57752b.getClass();
                    mh.c(str, rVarF, 0L, null, 0L, null, 0L, h.a(h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 48, 0, 130044);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                h82.r rVar = (h82.r) obj4;
                final com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar2 = (com.garmin.android.apps.connectmobile.stress.presentation.view.a) obj3;
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar3.r(aVar2);
                    Object objQ = mVar3.q();
                    if (zR) {
                        final int i27 = 0;
                        objQ = new e23.a() { // from class: vr1.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i27;
                                com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                switch (i28) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("ABOUT_STRESS_LEVEL");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("STRESS_DATA_ACCURACY");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("RELAX_REMINDERS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i28 = 0;
                            objQ = new e23.a() { // from class: vr1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i28;
                                    com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                    switch (i29) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("ABOUT_STRESS_LEVEL");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("STRESS_DATA_ACCURACY");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("RELAX_REMINDERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_about_stress_levels, null, false, (e23.a) objQ, mVar3, 0, 6);
                    boolean zR2 = mVar3.r(aVar2);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: vr1.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i26;
                                com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                switch (i29) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("ABOUT_STRESS_LEVEL");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("STRESS_DATA_ACCURACY");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("RELAX_REMINDERS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: vr1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i26;
                                    com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                    switch (i29) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("ABOUT_STRESS_LEVEL");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("STRESS_DATA_ACCURACY");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("RELAX_REMINDERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ2);
                        }
                    }
                    rVar.B(R.string.lbl_how_to_use_reading, null, false, (e23.a) objQ2, mVar3, 0, 6);
                    boolean zR3 = mVar3.r(aVar2);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: vr1.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i25;
                                com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                switch (i29) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("ABOUT_STRESS_LEVEL");
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("STRESS_DATA_ACCURACY");
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                        aVar3.e("RELAX_REMINDERS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: vr1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i25;
                                    com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar3 = aVar2;
                                    switch (i29) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("ABOUT_STRESS_LEVEL");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("HOW_TO_USE_YOUR_READINGS");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("STRESS_DATA_ACCURACY");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar3.e("RELAX_REMINDERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    rVar.B(R.string.lbl_stress_data_accuracy, null, false, (e23.a) objQ3, mVar3, 0, 6);
                    yb0.a aVar3 = aVar2.f45026f;
                    if (aVar3 == null || aVar3.f195679b.h() <= 0) {
                        mVar3.C(-802650918);
                        mVar3.f();
                    } else {
                        mVar3.C(-802783536);
                        boolean zR4 = mVar3.r(aVar2);
                        Object objQ4 = mVar3.q();
                        if (zR4) {
                            objQ4 = new e23.a() { // from class: vr1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i24;
                                    com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar4 = aVar2;
                                    switch (i29) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar4.e("ABOUT_STRESS_LEVEL");
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar4.e("HOW_TO_USE_YOUR_READINGS");
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar4.e("STRESS_DATA_ACCURACY");
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                            aVar4.e("RELAX_REMINDERS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new e23.a() { // from class: vr1.d
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i29 = i24;
                                        com.garmin.android.apps.connectmobile.stress.presentation.view.a aVar4 = aVar2;
                                        switch (i29) {
                                            case 0:
                                                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a2 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                                aVar4.e("ABOUT_STRESS_LEVEL");
                                                break;
                                            case 1:
                                                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a3 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                                aVar4.e("HOW_TO_USE_YOUR_READINGS");
                                                break;
                                            case 2:
                                                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a4 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                                aVar4.e("STRESS_DATA_ACCURACY");
                                                break;
                                            default:
                                                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a5 = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                                                aVar4.e("RELAX_REMINDERS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ4);
                            }
                        }
                        rVar.B(R.string.device_settings_relax_reminders, null, false, (e23.a) objQ4, mVar3, 0, 6);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = (MultipleImagesShareSampleActivity) obj4;
                p1 p1Var = (p1) obj3;
                m mVar4 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i29 = MultipleImagesShareSampleActivity.f30169a;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    kb.a(x2.d(r.S, 1.0f), null, null, null, null, 0, 0L, 0L, null, z3.f.c(-1490086181, new ry0.g(i18, multipleImagesShareSampleActivity, p1Var), mVar4), mVar4, 805306374, 510);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                vt0.f.a((zt0.c) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                vt0.f.b((vt0.b) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                vt0.f.c((vt0.a) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                vt0.f.d((zt0.c) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                vt0.a aVar4 = (vt0.a) obj4;
                vt0.a aVar5 = (vt0.a) obj3;
                m mVar5 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    if (aVar4 == aVar5) {
                        mVar5.C(-1780747883);
                        b3.b.f15502a.getClass();
                        i7.b(d3.f.a(), null, null, e0.b(d92.b.f58623a, mVar5), mVar5, 48, 4);
                        mVar5.f();
                    } else {
                        mVar5.C(-1780477842);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                FBTTrainingGuidancePlayerActivity.a aVar6 = FBTTrainingGuidancePlayerActivity.f45483c;
                ((FBTTrainingGuidancePlayerActivity) obj4).ba((Uri) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                FBTTrainingGuidancePlayerActivity.a aVar7 = FBTTrainingGuidancePlayerActivity.f45483c;
                ((FBTTrainingGuidancePlayerActivity) obj4).aa((ExoPlayer) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                h82.r rVar2 = (h82.r) obj4;
                final vv0.f fVar = (vv0.f) obj3;
                m mVar6 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i30 = vv0.f.f180442f;
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ = y.Q(mVar6, R.string.lbl_how_it_works_capitalized);
                    boolean zR5 = mVar6.r(fVar);
                    Object objQ5 = mVar6.q();
                    if (zR5) {
                        final int i34 = 0;
                        objQ5 = new e23.a() { // from class: vv0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i35 = i34;
                                f fVar2 = fVar;
                                switch (i35) {
                                    case 0:
                                        int i36 = f.f180442f;
                                        fVar2.e("HOW_IT_WORKS_ACTION");
                                        break;
                                    case 1:
                                        int i37 = f.f180442f;
                                        fVar2.e("LOGGING_TIPS");
                                        break;
                                    default:
                                        int i38 = f.f180442f;
                                        fVar2.e("DEVICE_COMPATIBILITY");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            final int i35 = 0;
                            objQ5 = new e23.a() { // from class: vv0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i36 = i35;
                                    f fVar2 = fVar;
                                    switch (i36) {
                                        case 0:
                                            int i37 = f.f180442f;
                                            fVar2.e("HOW_IT_WORKS_ACTION");
                                            break;
                                        case 1:
                                            int i38 = f.f180442f;
                                            fVar2.e("LOGGING_TIPS");
                                            break;
                                        default:
                                            int i39 = f.f180442f;
                                            fVar2.e("DEVICE_COMPATIBILITY");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ5);
                        }
                    }
                    rVar2.C(strQ, null, false, (e23.a) objQ5, mVar6, 0, 6);
                    String strQ2 = y.Q(mVar6, R.string.lbl_logging_tips);
                    boolean zR6 = mVar6.r(fVar);
                    Object objQ6 = mVar6.q();
                    if (zR6) {
                        objQ6 = new e23.a() { // from class: vv0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i36 = i26;
                                f fVar2 = fVar;
                                switch (i36) {
                                    case 0:
                                        int i37 = f.f180442f;
                                        fVar2.e("HOW_IT_WORKS_ACTION");
                                        break;
                                    case 1:
                                        int i38 = f.f180442f;
                                        fVar2.e("LOGGING_TIPS");
                                        break;
                                    default:
                                        int i39 = f.f180442f;
                                        fVar2.e("DEVICE_COMPATIBILITY");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new e23.a() { // from class: vv0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i36 = i26;
                                    f fVar2 = fVar;
                                    switch (i36) {
                                        case 0:
                                            int i37 = f.f180442f;
                                            fVar2.e("HOW_IT_WORKS_ACTION");
                                            break;
                                        case 1:
                                            int i38 = f.f180442f;
                                            fVar2.e("LOGGING_TIPS");
                                            break;
                                        default:
                                            int i39 = f.f180442f;
                                            fVar2.e("DEVICE_COMPATIBILITY");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ6);
                        }
                    }
                    rVar2.C(strQ2, null, false, (e23.a) objQ6, mVar6, 0, 6);
                    String strQ3 = y.Q(mVar6, R.string.device_compatibility_alert_title);
                    boolean zR7 = mVar6.r(fVar);
                    Object objQ7 = mVar6.q();
                    if (zR7) {
                        objQ7 = new e23.a() { // from class: vv0.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i36 = i25;
                                f fVar2 = fVar;
                                switch (i36) {
                                    case 0:
                                        int i37 = f.f180442f;
                                        fVar2.e("HOW_IT_WORKS_ACTION");
                                        break;
                                    case 1:
                                        int i38 = f.f180442f;
                                        fVar2.e("LOGGING_TIPS");
                                        break;
                                    default:
                                        int i39 = f.f180442f;
                                        fVar2.e("DEVICE_COMPATIBILITY");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: vv0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i36 = i25;
                                    f fVar2 = fVar;
                                    switch (i36) {
                                        case 0:
                                            int i37 = f.f180442f;
                                            fVar2.e("HOW_IT_WORKS_ACTION");
                                            break;
                                        case 1:
                                            int i38 = f.f180442f;
                                            fVar2.e("LOGGING_TIPS");
                                            break;
                                        default:
                                            int i39 = f.f180442f;
                                            fVar2.e("DEVICE_COMPATIBILITY");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar6.K(objQ7);
                        }
                    }
                    rVar2.C(strQ3, null, false, (e23.a) objQ7, mVar6, 0, 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int i36 = e.f180659j;
                ((e) obj4).i((List) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int i37 = e.f180659j;
                ((e) obj4).g((ix1.g) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                l lVar2 = (l) obj4;
                x3 x3Var = (x3) obj3;
                m mVar7 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVarB = a2.b(x2.d(r.S, 1.0f), a2.a(mVar7), true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    r rVarC = k.c(rVarB, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar8);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar7);
                    b0 b0Var = b0.f22601a;
                    List<com.garmin.android.apps.connectmobile.navigation.more.b> list = ((vy0.d) x3Var.getF182175a()).f180701b.f180765a;
                    boolean z15 = ((vy0.d) x3Var.getF182175a()).f180700a;
                    boolean zB = mVar7.B(lVar2);
                    Object objQ8 = mVar7.q();
                    if (zB) {
                        objQ8 = new ta0.j(lVar2, 21);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new ta0.j(lVar2, 21);
                            mVar7.K(objQ8);
                        }
                    }
                    com.garmin.android.apps.connectmobile.navigation.more.a.a(b0Var, list, z15, (l) objQ8, mVar7, 6);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                vz1.k.a((y31.a) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                z3.e eVar = (z3.e) obj3;
                k2 k2Var = (k2) obj;
                g6.a aVar9 = (g6.a) obj2;
                k2Var.getClass();
                List listF0 = k2Var.F0((z3.e) obj4, w11.s.Main);
                ArrayList arrayList = new ArrayList(p13.y.r(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y0) it.next()).Q(g6.a.c(0, 0, 0, 0, 11, aVar9.f75988a)));
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    numValueOf = Integer.valueOf(((v1) it3.next()).f69145b);
                    while (it3.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((v1) it3.next()).f69145b);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                }
                List listF1 = k2Var.F0(new z3.e(-216151927, true, new l72.y0(eVar, numValueOf != null ? numValueOf.intValue() : 0, i18)), w11.s.Dependent);
                ArrayList arrayList2 = new ArrayList(p13.y.r(listF1, 10));
                Iterator it4 = listF1.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((y0) it4.next()).Q(aVar9.f75988a));
                }
                return b1.h0(k2Var, g6.a.j(aVar9.f75988a), g6.a.i(aVar9.f75988a), new w02.b(i17, arrayList2, arrayList));
            case 16:
                x11.k kVar2 = (x11.k) obj4;
                e23.a aVar10 = (e23.a) obj3;
                m mVar8 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    f0 f0Var = f0.f110999a;
                    int i38 = w11.j.a.f181231a[kVar2.f188430a.ordinal()];
                    if (i38 == 1) {
                        i14 = -488977721;
                        i15 = R.string.lbl_next;
                    } else {
                        if (i38 != 2 && i38 != 3) {
                            throw n23.j.m(mVar8, -488980251);
                        }
                        i14 = -488973306;
                        i15 = R.string.lbl_add;
                    }
                    String strH = sn.a.h(mVar8, i14, i15, mVar8);
                    r rVarF2 = x2.f(r.S, 1.0f);
                    boolean z16 = kVar2.f188432c;
                    boolean zB2 = mVar8.B(aVar10);
                    Object objQ9 = mVar8.q();
                    if (zB2) {
                        objQ9 = new ux1.g(aVar10, 29);
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new ux1.g(aVar10, 29);
                            mVar8.K(objQ9);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ9, rVarF2, strH, mVar8, null, z16);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                w2.n nVar = (w2.n) obj4;
                Context context = (Context) obj2;
                boolean zR8 = nVar.r();
                h2 h2Var = nVar.f181365a;
                x.a((n2.a) obj, context, zR8, h2Var.d().f167839c, w0.a(h2Var.d().f167840d), nVar.f181372h, new s0(nVar, 25, (o53.b0) obj3, context));
                return Unit.INSTANCE;
            case 18:
                h82.r rVar3 = (h82.r) obj4;
                final w30.e eVar2 = (w30.e) obj3;
                m mVar9 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i39 = w30.e.f181832f;
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    boolean zR9 = mVar9.r(eVar2);
                    Object objQ10 = mVar9.q();
                    if (zR9) {
                        final int i44 = z14 ? 1 : 0;
                        objQ10 = new e23.a() { // from class: w30.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i45 = i44;
                                e eVar3 = eVar2;
                                switch (i45) {
                                    case 0:
                                        int i46 = e.f181832f;
                                        eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                        break;
                                    case 1:
                                        int i47 = e.f181832f;
                                        eVar3.e("CLIMB_CATEGORIES_ACTION");
                                        break;
                                    case 2:
                                        int i48 = e.f181832f;
                                        eVar3.e("CLIMB_GRADE_ACTION");
                                        break;
                                    default:
                                        int i49 = e.f181832f;
                                        eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            final int i45 = z14 ? 1 : 0;
                            objQ10 = new e23.a() { // from class: w30.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i46 = i45;
                                    e eVar3 = eVar2;
                                    switch (i46) {
                                        case 0:
                                            int i47 = e.f181832f;
                                            eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                            break;
                                        case 1:
                                            int i48 = e.f181832f;
                                            eVar3.e("CLIMB_CATEGORIES_ACTION");
                                            break;
                                        case 2:
                                            int i49 = e.f181832f;
                                            eVar3.e("CLIMB_GRADE_ACTION");
                                            break;
                                        default:
                                            int i410 = e.f181832f;
                                            eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ10);
                        }
                    }
                    rVar3.B(R.string.viewing_climb_details_title, null, false, (e23.a) objQ10, mVar9, 0, 6);
                    boolean zR10 = mVar9.r(eVar2);
                    Object objQ11 = mVar9.q();
                    if (zR10) {
                        objQ11 = new e23.a() { // from class: w30.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i46 = i26;
                                e eVar3 = eVar2;
                                switch (i46) {
                                    case 0:
                                        int i47 = e.f181832f;
                                        eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                        break;
                                    case 1:
                                        int i48 = e.f181832f;
                                        eVar3.e("CLIMB_CATEGORIES_ACTION");
                                        break;
                                    case 2:
                                        int i49 = e.f181832f;
                                        eVar3.e("CLIMB_GRADE_ACTION");
                                        break;
                                    default:
                                        int i410 = e.f181832f;
                                        eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new e23.a() { // from class: w30.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i46 = i26;
                                    e eVar3 = eVar2;
                                    switch (i46) {
                                        case 0:
                                            int i47 = e.f181832f;
                                            eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                            break;
                                        case 1:
                                            int i48 = e.f181832f;
                                            eVar3.e("CLIMB_CATEGORIES_ACTION");
                                            break;
                                        case 2:
                                            int i49 = e.f181832f;
                                            eVar3.e("CLIMB_GRADE_ACTION");
                                            break;
                                        default:
                                            int i410 = e.f181832f;
                                            eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ11);
                        }
                    }
                    rVar3.B(R.string.climb_categories_title, null, false, (e23.a) objQ11, mVar9, 0, 6);
                    boolean zR11 = mVar9.r(eVar2);
                    Object objQ12 = mVar9.q();
                    if (zR11) {
                        objQ12 = new e23.a() { // from class: w30.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i46 = i25;
                                e eVar3 = eVar2;
                                switch (i46) {
                                    case 0:
                                        int i47 = e.f181832f;
                                        eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                        break;
                                    case 1:
                                        int i48 = e.f181832f;
                                        eVar3.e("CLIMB_CATEGORIES_ACTION");
                                        break;
                                    case 2:
                                        int i49 = e.f181832f;
                                        eVar3.e("CLIMB_GRADE_ACTION");
                                        break;
                                    default:
                                        int i410 = e.f181832f;
                                        eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new e23.a() { // from class: w30.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i46 = i25;
                                    e eVar3 = eVar2;
                                    switch (i46) {
                                        case 0:
                                            int i47 = e.f181832f;
                                            eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                            break;
                                        case 1:
                                            int i48 = e.f181832f;
                                            eVar3.e("CLIMB_CATEGORIES_ACTION");
                                            break;
                                        case 2:
                                            int i49 = e.f181832f;
                                            eVar3.e("CLIMB_GRADE_ACTION");
                                            break;
                                        default:
                                            int i410 = e.f181832f;
                                            eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ12);
                        }
                    }
                    rVar3.B(R.string.climb_grade_title, null, false, (e23.a) objQ12, mVar9, 0, 6);
                    boolean zR12 = mVar9.r(eVar2);
                    Object objQ13 = mVar9.q();
                    if (zR12) {
                        objQ13 = new e23.a() { // from class: w30.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i46 = i24;
                                e eVar3 = eVar2;
                                switch (i46) {
                                    case 0:
                                        int i47 = e.f181832f;
                                        eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                        break;
                                    case 1:
                                        int i48 = e.f181832f;
                                        eVar3.e("CLIMB_CATEGORIES_ACTION");
                                        break;
                                    case 2:
                                        int i49 = e.f181832f;
                                        eVar3.e("CLIMB_GRADE_ACTION");
                                        break;
                                    default:
                                        int i410 = e.f181832f;
                                        eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new e23.a() { // from class: w30.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i46 = i24;
                                    e eVar3 = eVar2;
                                    switch (i46) {
                                        case 0:
                                            int i47 = e.f181832f;
                                            eVar3.e("VIEWING_CLIMB_DETAILS_ACTION");
                                            break;
                                        case 1:
                                            int i48 = e.f181832f;
                                            eVar3.e("CLIMB_CATEGORIES_ACTION");
                                            break;
                                        case 2:
                                            int i49 = e.f181832f;
                                            eVar3.e("CLIMB_GRADE_ACTION");
                                            break;
                                        default:
                                            int i410 = e.f181832f;
                                            eVar3.e("CREATE_COURSES_WITH_CLIMBS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ13);
                        }
                    }
                    rVar3.B(R.string.create_courses_with_climbs, null, false, (e23.a) objQ13, mVar9, 0, 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 19:
                w31.h hVar = (w31.h) obj4;
                x3 x3Var2 = (x3) obj3;
                m mVar10 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    y31.a aVar11 = ((o41.b) x3Var2.getF182175a()).f129072a;
                    boolean zR13 = mVar10.r(hVar);
                    Object objQ14 = mVar10.q();
                    if (zR13) {
                        objQ14 = new vu1.b(hVar, i19);
                        mVar10.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new vu1.b(hVar, i19);
                            mVar10.K(objQ14);
                        }
                    }
                    hVar.d(aVar11, (l) objQ14, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                g3 g3Var = (g3) obj4;
                w40.e eVar3 = (w40.e) obj3;
                m mVar11 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                w40.e.a aVar12 = w40.e.f181932h;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    int i46 = w40.e.b.f181934a[g3Var.f35300a.ordinal()];
                    if (i46 == 1) {
                        mVar11.C(1899902429);
                        j61.e eVar4 = (j61.e) g3Var.f35301b;
                        Integer num = g3Var.f35304e;
                        if (num != null && num.intValue() == 204) {
                            mVar11.C(1900086228);
                            w40.a.f181920a.getClass();
                            mVar = mVar11;
                            z02.b.a(false, null, null, null, false, w40.a.f181921b, mVar, 196608, 31);
                            mVar.f();
                        } else {
                            if ((eVar4 != null ? eVar4.f97322a : null) == null) {
                                if ((eVar4 != null ? eVar4.f97323b : null) == null) {
                                    mVar11.C(1900086228);
                                    w40.a.f181920a.getClass();
                                    mVar = mVar11;
                                    z02.b.a(false, null, null, null, false, w40.a.f181921b, mVar, 196608, 31);
                                    mVar.f();
                                }
                            }
                            mVar11.C(1900258991);
                            mVar = mVar11;
                            z02.b.a(false, null, null, null, false, z3.f.c(53740222, new w40.b(eVar3, eVar4), mVar11), mVar, 196608, 31);
                            mVar11.f();
                        }
                        mVar.f();
                    } else if (i46 == 2) {
                        mVar11.C(1900444247);
                        w40.a.f181920a.getClass();
                        z02.b.a(false, null, null, null, false, w40.a.f181922c, mVar11, 196608, 31);
                        mVar11.f();
                    } else {
                        if (i46 != 3) {
                            throw n23.j.m(mVar11, 2139495510);
                        }
                        mVar11.C(1900601107);
                        w40.a.f181920a.getClass();
                        z02.b.a(false, null, null, null, false, w40.a.f181923d, mVar11, 196608, 31);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                o0.c((w51.p0) obj4, (q0) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                String str2 = (String) obj4;
                w51.a aVar13 = (w51.a) obj3;
                m mVar12 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (s.g(str2, aVar13.f182214a)) {
                        mVar12.C(996989165);
                        s62.a.f157643a.getClass();
                        i7.b(e1.a(t62.b.f162798a), null, null, e0.b(d92.b.f58623a, mVar12), mVar12, 48, 4);
                        mVar12.f();
                    } else {
                        mVar12.C(997138120);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                o0.k((r) obj4, (z51.b) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                l0.g((v0) obj4, (Integer) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                l0.h((w52.x0) obj4, (Integer) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                h82.r rVar4 = (h82.r) obj4;
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c cVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.c) obj3;
                m mVar13 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar14 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    boolean zR14 = mVar13.r(cVar);
                    Object objQ15 = mVar13.q();
                    if (zR14) {
                        objQ15 = new w61.l(cVar, 2);
                        mVar13.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new w61.l(cVar, 2);
                            mVar13.K(objQ15);
                        }
                    }
                    rVar4.B(R.string.gcm_training_status_about_title, null, false, (e23.a) objQ15, mVar13, 0, 6);
                    boolean zR15 = mVar13.r(cVar);
                    Object objQ16 = mVar13.q();
                    if (zR15) {
                        objQ16 = new w61.l(cVar, 4);
                        mVar13.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == m.a.f135155b) {
                            objQ16 = new w61.l(cVar, 4);
                            mVar13.K(objQ16);
                        }
                    }
                    rVar4.B(R.string.lbl_vo2_max, null, false, (e23.a) objQ16, mVar13, 0, 6);
                    boolean z17 = cVar.f40126i;
                    boolean z18 = cVar.f40124g;
                    boolean z19 = cVar.f40125h;
                    if (z17) {
                        mVar13.C(-303730454);
                        boolean zR16 = mVar13.r(cVar);
                        Object objQ17 = mVar13.q();
                        if (zR16) {
                            objQ17 = new w61.l(cVar, 5);
                            mVar13.K(objQ17);
                        } else {
                            aVar.getClass();
                            if (objQ17 == m.a.f135155b) {
                                objQ17 = new w61.l(cVar, 5);
                                mVar13.K(objQ17);
                            }
                        }
                        rVar4.B(R.string.ohrv_status, null, false, (e23.a) objQ17, mVar13, 0, 6);
                        mVar13.f();
                    } else {
                        mVar13.C(-303621861);
                        mVar13.f();
                    }
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j.getClass();
                    if (bo1.a.a().c().d()) {
                        mVar13.C(-303537975);
                        boolean zR17 = mVar13.r(cVar);
                        Object objQ18 = mVar13.q();
                        if (zR17) {
                            objQ18 = new w61.l(cVar, 6);
                            mVar13.K(objQ18);
                        } else {
                            aVar.getClass();
                            if (objQ18 == m.a.f135155b) {
                                objQ18 = new w61.l(cVar, 6);
                                mVar13.K(objQ18);
                            }
                        }
                        rVar4.B(R.string.lbl_training_load, null, false, (e23.a) objQ18, mVar13, 0, 6);
                        mVar13.f();
                    } else if (z19) {
                        mVar13.C(682951128);
                        boolean zR18 = mVar13.r(cVar);
                        Object objQ19 = mVar13.q();
                        if (zR18) {
                            objQ19 = new w61.l(cVar, 7);
                            mVar13.K(objQ19);
                        } else {
                            aVar.getClass();
                            if (objQ19 == m.a.f135155b) {
                                objQ19 = new w61.l(cVar, 7);
                                mVar13.K(objQ19);
                            }
                        }
                        rVar4.B(R.string.lbl_training_load, null, false, (e23.a) objQ19, mVar13, 0, 6);
                        mVar13.f();
                    } else {
                        mVar13.C(682954653);
                        boolean zR19 = mVar13.r(cVar);
                        Object objQ20 = mVar13.q();
                        if (zR19) {
                            objQ20 = new w61.l(cVar, 8);
                            mVar13.K(objQ20);
                        } else {
                            aVar.getClass();
                            if (objQ20 == m.a.f135155b) {
                                objQ20 = new w61.l(cVar, 8);
                                mVar13.K(objQ20);
                            }
                        }
                        rVar4.B(R.string.lbl_seven_day_load, null, false, (e23.a) objQ20, mVar13, 0, 6);
                        mVar13.f();
                    }
                    if (z19 || z18) {
                        mVar13.C(-303057785);
                        boolean zR20 = mVar13.r(cVar);
                        Object objQ21 = mVar13.q();
                        if (zR20) {
                            objQ21 = new w61.l(cVar, 9);
                            mVar13.K(objQ21);
                        } else {
                            aVar.getClass();
                            if (objQ21 == m.a.f135155b) {
                                objQ21 = new w61.l(cVar, 9);
                                mVar13.K(objQ21);
                            }
                        }
                        rVar4.B(R.string.gcm_training_status_training_load_focus, null, false, (e23.a) objQ21, mVar13, 0, 6);
                        mVar13.f();
                    } else {
                        mVar13.C(-302915557);
                        mVar13.f();
                    }
                    if (z18) {
                        mVar13.C(-302850736);
                        boolean zR21 = mVar13.r(cVar);
                        Object objQ22 = mVar13.q();
                        if (zR21) {
                            objQ22 = new w61.l(cVar, 10);
                            mVar13.K(objQ22);
                        } else {
                            aVar.getClass();
                            if (objQ22 == m.a.f135155b) {
                                objQ22 = new w61.l(cVar, 10);
                                mVar13.K(objQ22);
                            }
                        }
                        rVar4.B(R.string.lbl_altitude_acclimation, null, false, (e23.a) objQ22, mVar13, 0, 6);
                        boolean zR22 = mVar13.r(cVar);
                        Object objQ23 = mVar13.q();
                        if (zR22) {
                            objQ23 = new w61.l(cVar, 11);
                            mVar13.K(objQ23);
                        } else {
                            aVar.getClass();
                            if (objQ23 == m.a.f135155b) {
                                objQ23 = new w61.l(cVar, 11);
                                mVar13.K(objQ23);
                            }
                        }
                        rVar4.B(R.string.lbl_heat_acclimation, null, false, (e23.a) objQ23, mVar13, 0, 6);
                        mVar13.f();
                    } else {
                        mVar13.C(-302624901);
                        mVar13.f();
                    }
                    boolean zR23 = mVar13.r(cVar);
                    Object objQ24 = mVar13.q();
                    if (zR23) {
                        objQ24 = new w61.l(cVar, 12);
                        mVar13.K(objQ24);
                    } else {
                        aVar.getClass();
                        if (objQ24 == m.a.f135155b) {
                            objQ24 = new w61.l(cVar, 12);
                            mVar13.K(objQ24);
                        }
                    }
                    rVar4.B(R.string.gcm_receiving_training_status, null, false, (e23.a) objQ24, mVar13, 0, 6);
                    if (cVar.f40123f > 0) {
                        mVar13.C(-302464662);
                        boolean zR24 = mVar13.r(cVar);
                        Object objQ25 = mVar13.q();
                        if (zR24) {
                            objQ25 = new w61.l(cVar, 3);
                            mVar13.K(objQ25);
                        } else {
                            aVar.getClass();
                            if (objQ25 == m.a.f135155b) {
                                objQ25 = new w61.l(cVar, 3);
                                mVar13.K(objQ25);
                            }
                        }
                        rVar4.B(R.string.primary_training_device, null, false, (e23.a) objQ25, mVar13, 0, 6);
                        mVar13.f();
                    } else {
                        mVar13.C(-302325317);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                w72.d.a((lc.h0) obj3, (l) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                wb1.c.a((r) obj4, (zd0.e0) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, l lVar, int i14, int i15) {
        this.f179428a = i15;
        this.f179430c = obj;
        this.f179429b = lVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i14, int i15) {
        this.f179428a = i15;
        this.f179429b = obj;
        this.f179430c = obj2;
    }
}
