package yq;

import e23.l;
import i3.e5;
import java.util.ArrayList;
import o70.t;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.h0;
import p5.k0;
import p92.y;
import pt1.i;
import r70.r;
import r70.s;
import s1.o;
import x5.l0;
import z2.d1;
import z2.r1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198727a;

    public /* synthetic */ d(int i14) {
        this.f198727a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        byte b14 = 0;
        switch (this.f198727a) {
            case 0:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                str.getClass();
                return str;
            case 2:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.f(k0Var);
                return Unit.INSTANCE;
            case 3:
                i iVar = (i) obj;
                iVar.getClass();
                return iVar.f140858c;
            case 4:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                return ((ot.l) obj).getClass().getSimpleName();
            case 6:
                return ((ot.l) obj).getClass().getSimpleName();
            case 7:
                return Unit.INSTANCE;
            case 8:
                com.garmin.android.library.backgroundtaskmanagement.b.c cVar = (com.garmin.android.library.backgroundtaskmanagement.b.c) obj;
                yx0.b bVar = yx0.b.f200016a;
                cVar.getClass();
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    y.f136664a.getClass();
                    y.a.c("MenstrualNotificationsUtil", "call to fetch period reminders failed");
                }
                return Unit.INSTANCE;
            case 9:
                yz1.b bVar2 = yz1.b.f200243a;
                return "11,548";
            case 10:
                yz1.b bVar3 = yz1.b.f200243a;
                return "10,000";
            case 11:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.D(k0Var2);
                return Unit.INSTANCE;
            case 12:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                p5.l.f136032b.getClass();
                h0.w(k0Var3, p5.l.f136036f);
                return Unit.INSTANCE;
            case 16:
                oi0.b bVar4 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a.C0710a c0710a = com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.a.f39609n;
                bVar4.getClass();
                bVar4.L();
                return Unit.INSTANCE;
            case 17:
                n4.c cVar2 = (n4.c) obj;
                long j8 = cVar2.f123544a;
                return (9223372034707292159L & j8) != 9205357640488583168L ? new o(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (4294967295L & cVar2.f123544a))) : d1.f201559a;
            case 18:
                o oVar = (o) obj;
                float f14 = oVar.f155672a;
                return n4.c.a((4294967295L & ((long) Float.floatToRawIntBits(oVar.f155673b))) | (((long) Float.floatToRawIntBits(f14)) << 32));
            case 19:
                return r1.j(((Long) obj).longValue());
            case 20:
                return Unit.INSTANCE;
            case 21:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.V();
                return Unit.INSTANCE;
            case 24:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.r();
                bVar6.A();
                return Unit.INSTANCE;
            case 26:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                return l0Var;
            case 27:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                return l0Var2;
            case 28:
                Module module = (Module) obj;
                z60.a aVar = z60.a.f202752a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130069l.a());
                z21.a aVar2 = new z21.a(b14, 16);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(s.class), stringQualifierNamed, aVar2, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new z21.a(b14, 17), kind, j0Var), module));
                return Unit.INSTANCE;
            default:
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.persistence.a.b bVar7 = com.garmin.android.apps.connectmobile.persistence.a.f40315c;
                aVar3.getClass();
                ud.c cVarM0 = aVar3.M0("SELECT * FROM activity_types");
                try {
                    int iB = ge1.b.B(cVarM0, "typeId");
                    int iB2 = ge1.b.B(cVarM0, "typeKey");
                    int iB3 = ge1.b.B(cVarM0, "parentTypeId");
                    int iB4 = ge1.b.B(cVarM0, "sortOrder");
                    int iB5 = ge1.b.B(cVarM0, "isHidden");
                    int iB6 = ge1.b.B(cVarM0, "restricted");
                    int iB7 = ge1.b.B(cVarM0, "trimmable");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        arrayList.add(new to.o((int) cVarM0.getLong(iB), cVarM0.M1(iB2), cVarM0.isNull(iB3) ? null : Integer.valueOf((int) cVarM0.getLong(iB3)), cVarM0.isNull(iB4) ? null : Integer.valueOf((int) cVarM0.getLong(iB4)), ((int) cVarM0.getLong(iB5)) != 0, ((int) cVarM0.getLong(iB6)) != 0, ((int) cVarM0.getLong(iB7)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
        }
    }
}
