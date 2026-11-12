package p40;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.device.nfc.NfcCommandHandler;
import com.google.common.util.concurrent.Futures;
import i3.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.slf4j.Logger;
import p005kotlin.Unit;
import ps.x0;
import ps.y0;
import ps.y1;
import r22.t1;
import sg0.e1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135665a;

    public /* synthetic */ h(int i14) {
        this.f135665a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        aq.d dVar;
        aq.d dVar2;
        int i14 = 10;
        Object y0Var = null;
        switch (this.f135665a) {
            case 0:
                ((Float) obj).floatValue();
                i iVar = i.f135676a;
                return Unit.INSTANCE;
            case 1:
                int i15 = p61.e.f136211b;
                return c22.j0.b((DateTime) obj, "yyyy-MM-dd", null);
            case 2:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 0) {
                    return str;
                }
                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
            case 3:
                Module module = (Module) obj;
                p91.b bVar = p91.b.f136560a;
                module.getClass();
                e eVar = new e(20);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                p13.j0 j0Var = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(m91.a.class), null, eVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(o91.a.class), null, new e(21), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(zp.a.class), null, new e(22), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ba1.d.class), null, new e(23), kind, j0Var), module));
                return Unit.INSTANCE;
            case 4:
                o13.p pVar = (o13.p) obj;
                int i16 = androidx.navigation.fragment.a.f10129j;
                pVar.getClass();
                return (String) pVar.f128594a;
            case 5:
                int i17 = androidx.navigation.fragment.a.f10129j;
                ((CreationExtras) obj).getClass();
                return new androidx.navigation.fragment.a.C0135a();
            case 6:
                n63.e eVar2 = (n63.e) obj;
                pc0.j.a aVar = pc0.j.f137223i;
                eVar2.getClass();
                eVar2.f123904c = true;
                return Unit.INSTANCE;
            case 7:
                Module module2 = (Module) obj;
                pg0.a aVar2 = pg0.a.f137594a;
                module2.getClass();
                pa0.a aVar3 = new pa0.a(8);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Factory;
                p13.j0 j0Var2 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier2, t0Var2.b(e1.class), null, aVar3, kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(ug0.q.class), null, new pa0.a(9), kind2, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(sg0.f0.class), null, new pa0.a(i14), kind2, j0Var2), module2));
                return Unit.INSTANCE;
            case 8:
                l20.a aVar4 = (l20.a) obj;
                int i18 = pj1.s.f137969j1;
                aVar4.getClass();
                String firstName = aVar4.getFirstName();
                if (firstName == null) {
                    firstName = "";
                }
                String lastName = aVar4.getLastName();
                return d53.w.i0(firstName + StringUtils.SPACE + (lastName != null ? lastName : "")).toString();
            case 9:
                l20.a aVar5 = (l20.a) obj;
                int i19 = pj1.s.f137969j1;
                aVar5.getClass();
                String firstName2 = aVar5.getFirstName();
                if (firstName2 == null) {
                    firstName2 = "";
                }
                String lastName2 = aVar5.getLastName();
                return d53.w.i0(firstName2 + StringUtils.SPACE + (lastName2 != null ? lastName2 : "")).toString();
            case 10:
                g3 g3Var = (g3) obj;
                int i24 = pj1.s.f137969j1;
                return new g3(g3Var.f35300a, new wj1.a((tj1.e) g3Var.f35301b), g3Var.f35302c, null, g3Var.f35304e);
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 12:
                pk0.r rVar = (pk0.r) obj;
                rVar.getClass();
                return rVar.getF138270c();
            case 13:
                Context context = (Context) obj;
                context.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                layoutInflaterFrom.getClass();
                return layoutInflaterFrom.inflate(R.layout.gcm3_birthdate_picker, (ViewGroup) null);
            case 14:
                wk2.i iVar2 = (wk2.i) obj;
                int i25 = pk2.b.f138357m;
                iVar2.getClass();
                return Boolean.valueOf(iVar2.getF205152b().a());
            case 15:
                pk2.f0 f0Var = (pk2.f0) obj;
                int i26 = pk2.b.f138357m;
                f0Var.getClass();
                return f0Var.A();
            case 16:
                Logger logger = NfcCommandHandler.f50799g;
                return Futures.immediateFuture(Unit.INSTANCE);
            case 17:
                List list = (List) obj;
                int i27 = com.garmin.android.apps.connectmobile.group.details.challenges.c.f36301h;
                ArrayList<GroupChallengeDTO> arrayListL = androidx.core.view.j.l(list);
                for (Object obj2 : list) {
                    com.garmin.android.apps.connectmobile.group.details.challenges.b.a aVar6 = com.garmin.android.apps.connectmobile.group.details.challenges.b.f36295b;
                    GroupChallengeDTO.b bVar2 = ((GroupChallengeDTO) obj2).f31513b;
                    bVar2.getClass();
                    aVar6.getClass();
                    if (com.garmin.android.apps.connectmobile.group.details.challenges.b.CURRENT.f36299a.contains(bVar2)) {
                        arrayListL.add(obj2);
                    }
                }
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListL, 10));
                for (GroupChallengeDTO groupChallengeDTO : arrayListL) {
                    ArrayList arrayList2 = groupChallengeDTO.f31519h;
                    arrayList2.getClass();
                    Object objB0 = p13.h0.b0(arrayList2);
                    objB0.getClass();
                    ArrayList arrayList3 = groupChallengeDTO.f31519h;
                    arrayList3.getClass();
                    List listE1 = p13.h0.e1(arrayList3);
                    Collections.shuffle(listE1);
                    arrayList.add(new com.garmin.android.apps.connectmobile.group.details.challenges.a.b(groupChallengeDTO, (GroupChallengePlayerDTO) objB0, listE1));
                }
                return arrayList;
            case 18:
                GroupChallengePlayerDTO groupChallengePlayerDTO = (GroupChallengePlayerDTO) obj;
                int i28 = com.garmin.android.apps.connectmobile.group.details.challenges.d.C0641d.f36330d;
                groupChallengePlayerDTO.getClass();
                String str3 = groupChallengePlayerDTO.f31538b;
                str3.getClass();
                return str3;
            case 19:
                Module module3 = (Module) obj;
                pn.b bVar3 = pn.b.f138643a;
                module3.getClass();
                pa0.a aVar7 = new pa0.a(13);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier3 = companion3.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                p13.j0 j0Var3 = p13.j0.f134944a;
                p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var3.b(on.k.class), null, aVar7, kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qn.a.class), null, new pa0.a(14), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qn.c.class), null, new pa0.a(15), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(com.garmin.android.apps.connectmobile.activities.health.presentation.e.class), null, new pa0.a(16), kind3, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(qn.b.class), null, new pa0.a(17), kind3, j0Var3), module3));
                return Unit.INSTANCE;
            case 20:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                t1 t1Var = (t1) obj;
                po.k.a aVar8 = po.k.f138917m;
                t1Var.getClass();
                return Boolean.valueOf(!t1Var.f149897g);
            case 23:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.p();
                return Unit.INSTANCE;
            case 24:
                fw.m mVar = (fw.m) obj;
                Long l14 = mVar.f73768a;
                fw.p pVar2 = mVar.f73769b;
                aq.d dVar3 = (aq.d) mVar.f73770c;
                return new fw.m(l14, pVar2, dVar3 != null ? dVar3.f11879a : null, mVar.f73771d);
            case 25:
                fw.m mVar2 = (fw.m) obj;
                Long l15 = mVar2.f73768a;
                fw.p pVar3 = mVar2.f73769b;
                aq.d dVar4 = (aq.d) mVar2.f73770c;
                return new fw.m(l15, pVar3, dVar4 != null ? dVar4.f11889k : null, mVar2.f73771d);
            case 26:
                fw.m mVar3 = (fw.m) obj;
                ps.p pVar4 = (mVar3 == null || (dVar = (aq.d) mVar3.f73770c) == null) ? null : dVar.f11891m;
                return new fw.m(mVar3.f73768a, mVar3.f73769b, pVar4 != null ? new y1(pVar4.getActivityId(), pVar4.i()) : null, mVar3.f73771d);
            case 27:
                fw.m mVar4 = (fw.m) obj;
                ps.p pVar5 = (mVar4 == null || (dVar2 = (aq.d) mVar4.f73770c) == null) ? null : dVar2.f11891m;
                List<x0> listG = pVar5 != null ? pVar5.g() : null;
                if (listG != null && !listG.isEmpty()) {
                    y0Var = new y0(pVar5.getActivityId(), pVar5.f(), listG);
                }
                return new fw.m(mVar4.f73768a, mVar4.f73769b, y0Var, mVar4.f73771d);
            case 28:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.b();
                return Unit.INSTANCE;
            default:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.b();
                return Unit.INSTANCE;
        }
    }
}
