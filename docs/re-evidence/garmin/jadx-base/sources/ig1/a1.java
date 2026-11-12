package ig1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a1 implements rk1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93282c;

    public /* synthetic */ a1(int i14, Object obj, Object obj2) {
        this.f93280a = i14;
        this.f93282c = obj;
        this.f93281b = obj2;
    }

    @Override // rk1.b.c
    public final void a(ArrayList arrayList) {
        int i14 = this.f93280a;
        Object obj = this.f93281b;
        Object obj2 = this.f93282c;
        switch (i14) {
            case 0:
                b1 b1Var = (b1) obj2;
                int i15 = b1.f93287k;
                int i16 = Integer.parseInt((String) arrayList.get(0));
                GCMComplexOneLineButton gCMComplexOneLineButton = b1Var.f93324g;
                l3.a aVar = l3.f23124b;
                Context context = b1Var.f70343a;
                context.getClass();
                gCMComplexOneLineButton.setButtonRightLabel(l3.a.H(aVar, new l22.a(context), i16, true));
                ((com.garmin.android.apps.connectmobile.devices.model.f) obj).D1(i16);
                b1Var.p();
                return;
            case 1:
                e2 e2Var = (e2) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i17 = e2.f93302k;
                Object obj3 = arrayList.get(0);
                obj3.getClass();
                e2Var.f93303j = Integer.parseInt((String) obj3);
                fVar.y1("distanceAlertMeter", Double.valueOf(fVar.k0() * ((double) e2Var.f93303j)));
                e2Var.p();
                return;
            default:
                pk1.u uVar = (pk1.u) obj;
                pk1.u.a aVar2 = pk1.u.E;
                Object obj4 = arrayList.get(0);
                obj4.getClass();
                gg1.m mVar = ((gg1.m[]) obj2)[Integer.parseInt((String) obj4)];
                uVar.B.H4(mVar);
                GCMSettingsItemView gCMSettingsItemView = uVar.f138339z;
                if (gCMSettingsItemView == null) {
                    p005kotlin.jvm.internal.s.m("firstDayOfWeekView");
                    throw null;
                }
                String string = uVar.getString(mVar.f77272d);
                string.getClass();
                gCMSettingsItemView.setSummary(string);
                return;
        }
    }
}
