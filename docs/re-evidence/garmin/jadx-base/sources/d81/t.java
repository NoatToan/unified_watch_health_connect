package d81;

import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import i3.e5;
import java.util.ArrayList;
import lc.p0;
import lc.y0;
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
import p5.k0;
import r1.u0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58367a;

    public /* synthetic */ t(int i14) {
        this.f58367a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.f58367a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.a();
                bVar.M();
                return Unit.INSTANCE;
            case 1:
                oi0.b bVar2 = (oi0.b) obj;
                bVar2.getClass();
                bVar2.a();
                bVar2.M();
                return Unit.INSTANCE;
            case 2:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.F();
                bVar3.G();
                return Unit.INSTANCE;
            case 3:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.s();
                bVar4.B();
                return Unit.INSTANCE;
            case 4:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                int i14 = dc0.b.f59108n;
                ((DeviceSettingsDTO) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ud.a aVar = (ud.a) obj;
                com.garmin.android.library.promotionlibrary.database.a.c cVar = com.garmin.android.library.promotionlibrary.database.a.f50541c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * from campaigns ORDER BY campaignEndTimestamp ASC");
                try {
                    int iB = ge1.b.B(cVarM0, "campaignId");
                    int iB2 = ge1.b.B(cVarM0, "offerType");
                    int iB3 = ge1.b.B(cVarM0, "campaignBeginTimestamp");
                    int iB4 = ge1.b.B(cVarM0, "campaignEndTimestamp");
                    int iB5 = ge1.b.B(cVarM0, "updateTimestamp");
                    int iB6 = ge1.b.B(cVarM0, "offerBodyText");
                    int iB7 = ge1.b.B(cVarM0, "offerHeaderText");
                    int iB8 = ge1.b.B(cVarM0, "offerImageUrl");
                    int iB9 = ge1.b.B(cVarM0, "offerImageName");
                    int iB10 = ge1.b.B(cVarM0, "offerShopNowButtonText");
                    int iB11 = ge1.b.B(cVarM0, "offerTitleText");
                    int iB12 = ge1.b.B(cVarM0, "offerViewDetailsButtonText");
                    int iB13 = ge1.b.B(cVarM0, "detailEmailOfferButtonText");
                    int iB14 = ge1.b.B(cVarM0, "detailImageUrl");
                    int iB15 = ge1.b.B(cVarM0, "detailImageName");
                    int iB16 = ge1.b.B(cVarM0, "detailPromoCode");
                    int iB17 = ge1.b.B(cVarM0, "detailPromoCodeDetailText");
                    int iB18 = ge1.b.B(cVarM0, "detailPromoCodeExpirationDate");
                    int iB19 = ge1.b.B(cVarM0, "detailShopNowUrl");
                    int iB20 = ge1.b.B(cVarM0, "detailTitleText");
                    int iB21 = ge1.b.B(cVarM0, "detailBodyText");
                    int iB22 = ge1.b.B(cVarM0, "detailBodyDetailText");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        long j8 = cVarM0.getLong(iB);
                        String strM1 = cVarM0.M1(iB2);
                        long j14 = cVarM0.getLong(iB3);
                        long j15 = cVarM0.getLong(iB4);
                        long j16 = cVarM0.getLong(iB5);
                        String strM2 = cVarM0.M1(iB6);
                        String strM3 = cVarM0.M1(iB7);
                        String strM4 = cVarM0.M1(iB8);
                        String strM5 = cVarM0.M1(iB9);
                        String strM6 = cVarM0.M1(iB10);
                        String strM7 = cVarM0.M1(iB11);
                        String strM8 = cVarM0.M1(iB12);
                        String strM9 = cVarM0.M1(iB13);
                        String strM10 = cVarM0.M1(iB14);
                        int i15 = iB;
                        int i16 = iB15;
                        String strM11 = cVarM0.M1(i16);
                        iB15 = i16;
                        int i17 = iB16;
                        String strM12 = cVarM0.M1(i17);
                        iB16 = i17;
                        int i18 = iB17;
                        String strM13 = cVarM0.M1(i18);
                        iB17 = i18;
                        int i19 = iB18;
                        long j17 = cVarM0.getLong(i19);
                        iB18 = i19;
                        int i24 = iB19;
                        String strM14 = cVarM0.M1(i24);
                        iB19 = i24;
                        int i25 = iB20;
                        String strM15 = cVarM0.M1(i25);
                        iB20 = i25;
                        int i26 = iB21;
                        String strM16 = cVarM0.M1(i26);
                        iB21 = i26;
                        int i27 = iB22;
                        iB22 = i27;
                        arrayList.add(new df2.c(j8, strM1, j14, j15, j16, strM2, strM3, strM4, strM5, strM6, strM7, strM8, strM9, strM10, strM11, strM12, strM13, j17, strM14, strM15, strM16, cVarM0.M1(i27)));
                        iB = i15;
                    }
                    cVarM0.close();
                    return arrayList;
                } catch (Throwable th3) {
                    cVarM0.close();
                    throw th3;
                }
            case 8:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.a();
                return Unit.INSTANCE;
            case 9:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.a();
                return Unit.INSTANCE;
            case 10:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.X();
                return Unit.INSTANCE;
            case 11:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.q();
                bVar8.R();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                bVar9.X();
                bVar9.Y();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar10 = (oi0.b) obj;
                bVar10.getClass();
                bVar10.M();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                p5.h0.E(k0Var, 4.0f);
                return Unit.INSTANCE;
            case 16:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                p5.h0.D(k0Var2);
                return Unit.INSTANCE;
            case 17:
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                p5.h0.E(k0Var3, 1.0f);
                return Unit.INSTANCE;
            case 18:
                k0 k0Var4 = (k0) obj;
                k0Var4.getClass();
                p5.h0.E(k0Var4, 5.0f);
                return Unit.INSTANCE;
            case 19:
                k0 k0Var5 = (k0) obj;
                k0Var5.getClass();
                p5.h0.E(k0Var5, 2.0f);
                return Unit.INSTANCE;
            case 20:
                k0 k0Var6 = (k0) obj;
                k0Var6.getClass();
                p5.h0.E(k0Var6, 3.0f);
                return Unit.INSTANCE;
            case 21:
                dl0.a aVar2 = (dl0.a) obj;
                aVar2.getClass();
                return Long.valueOf(aVar2.f60266a);
            case 22:
                Module module = (Module) obj;
                dp0.a aVar3 = dp0.a.f60634a;
                module.getClass();
                d50.b bVar11 = new d50.b(12);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(gp0.a.class), null, bVar11, kind, j0Var), module));
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.f.LAST_SEVEN_DAYS.a());
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.s.class), stringQualifierNamed, new d50.b(13), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r70.r.class), stringQualifierNamed, new d50.b(14), kind, j0Var), module));
                return Unit.INSTANCE;
            case 23:
                Module module2 = (Module) obj;
                dp0.b bVar12 = dp0.b.f60636a;
                module2.getClass();
                d50.b bVar13 = new d50.b(15);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(gp0.c.class), null, bVar13, kind2, j0Var2), module2));
                StringQualifier stringQualifierNamed2 = QualifierKt.named(o70.f.YESTERDAY.a());
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.s.class), stringQualifierNamed2, new d50.b(16), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(r70.r.class), stringQualifierNamed2, new d50.b(17), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 24:
                k0 k0Var7 = (k0) obj;
                k0Var7.getClass();
                p5.h0.g(k0Var7);
                return Unit.INSTANCE;
            case 25:
                ds.i0 i0Var = ds.i0.f60953a;
                return Unit.INSTANCE;
            case 26:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                dt.a aVar4 = dt.a.INSTANCE;
                aVar4.getClass();
                p0Var.f111836i = aVar4;
                p0Var.f111833f = false;
                y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 27:
                CollectDobActivity.a aVar5 = CollectDobActivity.f30702e;
                return Boolean.valueOf(((androidx.lifecycle.n) obj) instanceof cv.l);
            case 28:
                k0 k0Var8 = (k0) obj;
                k0Var8.getClass();
                p5.h0.g(k0Var8);
                return Unit.INSTANCE;
            default:
                ((r1.n) obj).getClass();
                return r1.b.c(u0.d(s1.l.d(150, 0, null, 6), 2), u0.e(s1.l.d(150, 0, null, 6), 2));
        }
    }
}
