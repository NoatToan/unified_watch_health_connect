package ya1;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.json.JSONObject;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195562a;

    public /* synthetic */ h(int i14) {
        this.f195562a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f195562a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.f();
                return Unit.INSTANCE;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.X();
                return Unit.INSTANCE;
            case 2:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.Z();
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar4 = (oi0.b) obj;
                int i14 = v.a.f195618j;
                bVar4.getClass();
                bVar4.s();
                bVar4.B();
                return Unit.INSTANCE;
            case 4:
                oi0.b bVar5 = (oi0.b) obj;
                int i15 = v.a.f195618j;
                bVar5.getClass();
                bVar5.y();
                bVar5.g();
                return Unit.INSTANCE;
            case 5:
                n63.e eVar = (n63.e) obj;
                int i16 = yc2.b.f196743h;
                eVar.getClass();
                eVar.f123904c = true;
                eVar.f123908g = true;
                eVar.f123906e = true;
                return Unit.INSTANCE;
            case 6:
                Module module = (Module) obj;
                ye0.a aVar = ye0.a.f196813a;
                module.getClass();
                y20.k kVar = new y20.k(21);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(af0.h.class), null, kVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ze0.a.class), null, new y20.k(22), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ze0.b.class), null, new y20.k(23), kind, j0Var), module));
                return Unit.INSTANCE;
            case 7:
                h hVar = yf.e.f196844g;
                return Float.valueOf(1.0f);
            case 8:
                h hVar2 = yf.e.f196844g;
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case 9:
                ((Integer) obj).intValue();
                yg2.d dVar = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj).intValue();
                yg2.d dVar2 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj).intValue();
                yg2.d dVar3 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj).intValue();
                yg2.d dVar4 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj).intValue();
                yg2.d dVar5 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj).intValue();
                yg2.d dVar6 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj).intValue();
                yg2.d dVar7 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj).intValue();
                yg2.d dVar8 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj).intValue();
                yg2.d dVar9 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj).intValue();
                yg2.d dVar10 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj).intValue();
                yg2.d dVar11 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj).intValue();
                yg2.d dVar12 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj).intValue();
                yg2.d dVar13 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj).intValue();
                yg2.d dVar14 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj).intValue();
                yg2.d dVar15 = yg2.d.f196958a;
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.K();
                bVar6.a();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.K();
                bVar7.a();
                return Unit.INSTANCE;
            case 26:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                int i17 = yn2.b.G0;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_export_failed);
                aVar2.setMessage(R.string.wallet_we_encountered_an_error);
                aVar2.setCancelable(true);
                aVar2.setPositiveButton(R.string.lbl_ok, new xk1.v(7));
                return Unit.INSTANCE;
            case 27:
                int i18 = yn2.b.G0;
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                sy2.e eVar2 = (sy2.e) obj;
                eVar2.getClass();
                ((yn2.c) eVar2.b()).g(new JSONObject("{\n  \"apiVersion\": 2,\n  \"apiVersionMinor\": 0,\n  \"paymentMethodData\": {\n    \"type\": \"CARD\",\n    \"description\": \"Visa\u2006••••\u20061234\",\n    \"info\": {\n      \"cardNetwork\": \"VISA\",\n      \"cardDetails\": \"1234\"\n    },\n    \"tokenizationData\": {\n      \"type\": \"PAYMENT_GATEWAY\",\n      \"token\": \"examplePaymentMethodToken\"\n    }\n  }\n}"));
                return Unit.INSTANCE;
            default:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.M();
                return Unit.INSTANCE;
        }
    }
}
