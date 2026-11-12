package ig2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.feature.garminpay.devicedrivensocket.NativeDeviceDrivenSocketApi;
import e23.l;
import fw.p;
import i3.e5;
import id0.p5;
import ih0.s;
import ij1.g;
import im.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lc.u0;
import li0.d0;
import o70.t;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import p003ji0.m;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p5.k0;
import ps.x1;
import qs.w;
import r70.r;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93437a;

    public /* synthetic */ d(int i14) {
        this.f93437a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Serializable serializable = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.f93437a) {
            case 0:
                Intent intent = (Intent) obj;
                int i14 = e.f93438b;
                intent.getClass();
                Bundle extras = intent.getExtras();
                return Boolean.valueOf(extras != null ? extras.getBoolean("extra_show_enable_location_permission", false) : false);
            case 1:
                Intent intent2 = (Intent) obj;
                int i15 = e.f93438b;
                intent2.getClass();
                Bundle extras2 = intent2.getExtras();
                if (extras2 == null) {
                    return null;
                }
                int i16 = extras2.getInt("extra_workout_id", -1);
                Integer numValueOf = Integer.valueOf(i16);
                if (i16 > 0) {
                    return numValueOf;
                }
                return null;
            case 2:
                Intent intent3 = (Intent) obj;
                int i17 = e.f93438b;
                intent3.getClass();
                Bundle extras3 = intent3.getExtras();
                if (extras3 == null) {
                    return null;
                }
                int i18 = extras3.getInt("extra_adaptive_coach_workout_timestamp", -1);
                Integer numValueOf2 = Integer.valueOf(i18);
                if (i18 > 0) {
                    return numValueOf2;
                }
                return null;
            case 3:
                Intent intent4 = (Intent) obj;
                int i19 = e.f93438b;
                intent4.getClass();
                Bundle extras4 = intent4.getExtras();
                if (Build.VERSION.SDK_INT < 33) {
                    Serializable serializable2 = extras4 != null ? extras4.getSerializable("extra_activity_type") : null;
                    serializable = (zf2.d) (serializable2 instanceof zf2.d ? serializable2 : null);
                } else if (extras4 != null) {
                    serializable = extras4.getSerializable("extra_activity_type", zf2.d.class);
                }
                return (zf2.d) serializable;
            case 4:
                Intent intent5 = (Intent) obj;
                int i24 = e.f93438b;
                intent5.getClass();
                Bundle extras5 = intent5.getExtras();
                if (extras5 == null) {
                    return null;
                }
                int i25 = extras5.getInt("extra_workout_rec_index", -1);
                Integer numValueOf3 = Integer.valueOf(i25);
                if (i25 >= 0) {
                    return numValueOf3;
                }
                return null;
            case 5:
                g3 g3Var = (g3) obj;
                t60.a aVar = s.f93481l;
                g3Var.getClass();
                int i26 = s.c.f93495a[g3Var.f35300a.ordinal()];
                if (i26 == 1) {
                    v60.a aVar2 = (v60.a) g3Var.f35301b;
                    return aVar2 == null ? new v60.a(false, null) : aVar2;
                }
                if (i26 != 2) {
                    return new v60.a(false, null);
                }
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                Exception exc = g3Var.f35303d;
                aVar3.getClass();
                i2.a.g(a2Var, "FitnessAgeCrossSellingItem", exc);
                return new v60.a(false, null);
            case 6:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                String str = d0Var.f112650c;
                return str == null ? Integer.valueOf(d0Var.hashCode()) : str;
            case 7:
                d0 d0Var2 = (d0) obj;
                d0Var2.getClass();
                String str2 = d0Var2.f112650c;
                return str2 == null ? Integer.valueOf(d0Var2.hashCode()) : str2;
            case 8:
                d0 d0Var3 = (d0) obj;
                d0Var3.getClass();
                String str3 = d0Var3.f112650c;
                return str3 == null ? Integer.valueOf(d0Var3.hashCode()) : str3;
            case 9:
                m mVar = (m) obj;
                mVar.getClass();
                if (mVar instanceof m.a) {
                    d0 d0Var4 = ((m.a) mVar).f98798a;
                    String str4 = d0Var4.f112650c;
                    return str4 == null ? Integer.valueOf(d0Var4.hashCode()) : str4;
                }
                if (mVar instanceof m.b) {
                    return Integer.valueOf(((m.b) mVar).f98799a);
                }
                u0.r();
                return null;
            case 10:
                gj1.b bVar = (gj1.b) obj;
                int i27 = g.f93833m;
                bVar.getClass();
                String displayName = bVar.getDisplayName();
                return displayName != null ? displayName : "";
            case 11:
                Module module = (Module) obj;
                il.a aVar4 = il.a.f93936a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(t.f130063g.a());
                p5 p5Var = new p5(objArr4 == true ? 1 : 0, 26);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, p5Var, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed, new p5(objArr3 == true ? 1 : 0, 27), kind, j0Var), module));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(t.f130080y.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.s.class), stringQualifierNamed2, new p5(objArr2 == true ? 1 : 0, 28), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), stringQualifierNamed2, new p5(objArr == true ? 1 : 0, 29), kind, j0Var), module));
                return Unit.INSTANCE;
            case 12:
                ((zf2.d) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((zf2.d) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                x1 x1Var = (x1) obj;
                z zVar = z.f94209a;
                x1Var.getClass();
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(x1Var.getInternalStatus(), w.CLIMB_ATTEMPTED.f147194a));
            case 16:
                x1 x1Var2 = (x1) obj;
                z zVar2 = z.f94209a;
                x1Var2.getClass();
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(x1Var2.getInternalStatus(), w.CLIMB_COMPLETED.f147194a) && !x1Var2.getClimbSend());
            case 17:
                x1 x1Var3 = (x1) obj;
                z zVar3 = z.f94209a;
                x1Var3.getClass();
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(x1Var3.getInternalStatus(), w.CLIMB_COMPLETED.f147194a) && x1Var3.getClimbSend());
            case 18:
                x1 x1Var4 = (x1) obj;
                z zVar4 = z.f94209a;
                x1Var4.getClass();
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(x1Var4.getInternalStatus(), w.CLIMB_ATTEMPTED.f147194a));
            case 19:
                x1 x1Var5 = (x1) obj;
                z zVar5 = z.f94209a;
                x1Var5.getClass();
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(x1Var5.getInternalStatus(), w.CLIMB_COMPLETED.f147194a));
            case 20:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.J();
                bVar2.n();
                return Unit.INSTANCE;
            case 24:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 25:
                Module module2 = (Module) obj;
                NativeDeviceDrivenSocketApi.a aVar5 = NativeDeviceDrivenSocketApi.f50945a;
                module2.getClass();
                t0 t0Var2 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), t0Var2.b(in2.a.class), new TypeQualifier(t0Var2.b(NativeDeviceDrivenSocketApi.class)), new in2.e(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0), Kind.Singleton, j0.f134944a), module2);
                if (module2.get_createdAtStart()) {
                    module2.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module2, singleInstanceFactoryP);
                return Unit.INSTANCE;
            case 26:
                ud.a aVar6 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.b bVar3 = com.garmin.android.apps.connectmobile.activities.stats.exercises.database.a.f29923c;
                aVar6.getClass();
                ud.c cVarM0 = aVar6.M0("SELECT * from recent_selected_exercises ORDER BY selectTimestamp DESC LIMIT 30");
                try {
                    int iB = ge1.b.B(cVarM0, Action.KEY_ATTRIBUTE);
                    int iB2 = ge1.b.B(cVarM0, "category");
                    int iB3 = ge1.b.B(cVarM0, "categoryTranslation");
                    int iB4 = ge1.b.B(cVarM0, "counterPart");
                    int iB5 = ge1.b.B(cVarM0, "isBodyWeight");
                    int iB6 = ge1.b.B(cVarM0, "exerciseTypeKey");
                    int iB7 = ge1.b.B(cVarM0, "exerciseTranslation");
                    int iB8 = ge1.b.B(cVarM0, "selectTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        arrayList.add(new iq.c(cVarM0.M1(iB), cVarM0.M1(iB2), cVarM0.M1(iB3), cVarM0.M1(iB4), ((int) cVarM0.getLong(iB5)) != 0, cVarM0.M1(iB6), cVarM0.M1(iB7), cVarM0.getLong(iB8)));
                    }
                    cVarM0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            case 27:
                g3 g3Var2 = (g3) obj;
                g3Var2.getClass();
                if (g3Var2.f35300a == p.SUCCESS) {
                    return (List) g3Var2.f35301b;
                }
                return null;
            case 28:
                String str5 = (String) obj;
                str5.getClass();
                if (str5.length() <= 0) {
                    return str5;
                }
                StringBuilder sb3 = new StringBuilder();
                String strValueOf = String.valueOf(str5.charAt(0));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb3.append((Object) upperCase);
                sb3.append(str5.substring(1));
                return sb3.toString();
            default:
                return Unit.INSTANCE;
        }
    }
}
