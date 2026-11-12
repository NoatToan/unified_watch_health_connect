package nk0;

import c80.u;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import lc.m0;
import lc.y;
import o13.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f126395b;

    public /* synthetic */ h(m0 m0Var, int i14) {
        this.f126394a = i14;
        this.f126395b = m0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f126394a;
        m0 m0Var = this.f126395b;
        switch (i14) {
            case 0:
                u uVar = (u) obj;
                GearActivity.a aVar = GearActivity.f35500b;
                uVar.getClass();
                y.l(m0Var, new GearRoute.p(uVar, (String) obj2, (String) obj3, false, 8, (p005kotlin.jvm.internal.j) null));
                break;
            case 1:
                u uVar2 = (u) obj;
                GearActivity.a aVar2 = GearActivity.f35500b;
                uVar2.getClass();
                y.l(m0Var, new GearRoute.c(uVar2, (String) obj2, (String) obj3, false, false, 24, (p005kotlin.jvm.internal.j) null));
                break;
            case 2:
                u uVar3 = (u) obj;
                GearActivity.a aVar3 = GearActivity.f35500b;
                uVar3.getClass();
                y.l(m0Var, new GearRoute.p(uVar3, (String) obj2, (String) obj3, false, 8, (p005kotlin.jvm.internal.j) null));
                break;
            case 3:
                u uVar4 = (u) obj;
                GearActivity.a aVar4 = GearActivity.f35500b;
                uVar4.getClass();
                y.l(m0Var, new GearRoute.c(uVar4, (String) obj2, (String) obj3, false, false, 24, (p005kotlin.jvm.internal.j) null));
                break;
            case 4:
                u uVar5 = (u) obj;
                GearActivity.a aVar5 = GearActivity.f35500b;
                uVar5.getClass();
                y.l(m0Var, new GearRoute.p(uVar5, (String) obj2, (String) obj3, false, 8, (p005kotlin.jvm.internal.j) null));
                break;
            case 5:
                u uVar6 = (u) obj;
                GearActivity.a aVar6 = GearActivity.f35500b;
                uVar6.getClass();
                y.l(m0Var, new GearRoute.c(uVar6, (String) obj2, (String) obj3, false, false, 24, (p005kotlin.jvm.internal.j) null));
                break;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                List list = (List) obj2;
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                ot1.u uVar7 = ot1.u.f133824a;
                list.getClass();
                og.a.T(m0Var, ot1.l.f133804a.d(), h7.c.a(new p("imageIndex", num), new p("photosKey", new ArrayList(list)), new p("requesterOwned", bool)));
                break;
            default:
                Integer num2 = (Integer) obj;
                num2.intValue();
                List list2 = (List) obj2;
                Boolean bool2 = (Boolean) obj3;
                bool2.booleanValue();
                ot1.y yVar = ot1.y.f133845a;
                list2.getClass();
                og.a.T(m0Var, ot1.l.f133804a.d(), h7.c.a(new p("imageIndex", num2), new p("photosKey", new ArrayList(list2)), new p("requesterOwned", bool2)));
                break;
        }
        return Unit.INSTANCE;
    }
}
