package po2;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import com.github.mikephil.chartingv2.highlight.Highlight;
import i3.e5;
import java.util.Arrays;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139304a;

    public /* synthetic */ o(int i14) {
        this.f139304a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14 = false;
        switch (this.f139304a) {
            case 0:
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) obj;
                bVar.getClass();
                bVar.b().d(new lo2.c("9000", null, null));
                return Unit.INSTANCE;
            case 1:
                return p.X0(obj);
            case 2:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                return LayoutInflater.from(context).inflate(R.layout.activity_reports_chart_view, (ViewGroup) null);
            case 10:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.a();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.a();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.a();
                return Unit.INSTANCE;
            case 13:
                Highlight highlight = (Highlight) obj;
                int i14 = pr0.e.f139613j;
                if (highlight != null && highlight.getXIndex() <= 0) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 14:
                Highlight highlight2 = (Highlight) obj;
                int i15 = pr0.j.f139626j;
                if (highlight2 != null && highlight2.getXIndex() < 0) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 15:
                return Boolean.FALSE;
            case 16:
                PostUserAuthenticationActivity.a aVar = PostUserAuthenticationActivity.f30291i;
                return Boolean.valueOf(((androidx.lifecycle.n) obj) instanceof cv.l);
            case 17:
                Module module = (Module) obj;
                py.a aVar2 = py.a.f141871a;
                module.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.t.f130066j.a());
                pa0.a aVar3 = new pa0.a(20);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(r70.s.class), stringQualifierNamed, aVar3, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new pa0.a(21), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(my.a.class), null, new pa0.a(22), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oy.a.class), null, new pa0.a(23), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(sy.k.class), null, new pa0.a(24), kind, j0Var), module));
                return Unit.INSTANCE;
            case 18:
                sy0.r rVar = (sy0.r) obj;
                rVar.getClass();
                return rVar.f161279b;
            case 19:
                Byte b14 = (Byte) obj;
                b14.byteValue();
                int i16 = pz0.b.f141922d;
                return String.format("%02X", Arrays.copyOf(new Object[]{b14}, 1));
            case 20:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.V();
                return Unit.INSTANCE;
            case 21:
                g3 g3Var = (g3) obj;
                t60.a aVar4 = q42.y.f142744q;
                g3Var.getClass();
                int i17 = q42.y.c.f142763a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    v60.a aVar5 = (v60.a) g3Var.f35301b;
                    return aVar5 == null ? new v60.a(false, null) : aVar5;
                }
                if (i17 != 2) {
                    return new v60.a(false, null);
                }
                i2.a aVar6 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                Exception exc = g3Var.f35303d;
                aVar6.getClass();
                i2.a.g(a2Var, "WeightCrossSellingItem", exc);
                return new v60.a(false, null);
            case 22:
                ItemPickerActivity.a.b bVar6 = (ItemPickerActivity.a.b) obj;
                int i18 = ItemPickerActivity.a.f39975d;
                if (bVar6 instanceof ItemPickerActivity.a.b.C0738a) {
                    return (ItemPickerActivity.a.b.C0738a) bVar6;
                }
                return null;
            case 23:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.M();
                bVar7.a();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.M();
                bVar8.a();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.V();
                return Unit.INSTANCE;
            case 27:
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                bVar10.V();
                return Unit.INSTANCE;
            case 28:
                ((Float) obj).floatValue();
                qb0.a aVar7 = qb0.a.f143954a;
                return Unit.INSTANCE;
            default:
                oi0.b bVar11 = (oi0.b) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                bVar11.getClass();
                bVar11.M();
                bVar11.m();
                return Unit.INSTANCE;
        }
    }
}
