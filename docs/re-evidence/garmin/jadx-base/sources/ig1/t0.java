package ig1;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t0 implements rk1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f93412d;

    public /* synthetic */ t0(Object obj, int i14, Object obj2, Object obj3) {
        this.f93409a = i14;
        this.f93410b = obj;
        this.f93411c = obj2;
        this.f93412d = obj3;
    }

    @Override // rk1.b.c
    public final void a(ArrayList arrayList) {
        Integer num;
        int i14 = this.f93409a;
        Object obj = this.f93412d;
        Object obj2 = this.f93411c;
        Object obj3 = this.f93410b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj2;
                u0 u0Var = (u0) obj;
                int i15 = u0.f93414j;
                String str = ((String[]) obj3)[Integer.parseInt((String) p13.h0.b0(arrayList))];
                Object obj4 = fVar.f34132b.get("cadenceAlertCustomLowValue");
                num = obj4 instanceof Integer ? (Integer) obj4 : null;
                if (num != null && num.intValue() >= Integer.parseInt(str)) {
                    new androidx.appcompat.app.e.a(u0Var.f70343a).setCancelable(true).setTitle(R.string.lbl_invalid_stroke_rate).setMessage(R.string.msg_stroke_rate_error).setPositiveButton(R.string.lbl_ok, new f20.i(25)).show();
                } else {
                    u0Var.f93324g.setButtonRightLabel(str);
                    fVar.y1("cadenceAlertCustomHighValue", Integer.valueOf(Integer.parseInt(str)));
                    u0Var.p();
                }
                break;
            case 1:
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = (com.garmin.android.apps.connectmobile.devices.model.f) obj2;
                z0 z0Var = (z0) obj;
                int i16 = z0.f93431j;
                String str2 = ((String[]) obj3)[Integer.parseInt((String) p13.h0.b0(arrayList))];
                Object obj5 = fVar2.f34132b.get("cadenceAlertCustomHighValue");
                num = obj5 instanceof Integer ? (Integer) obj5 : null;
                if (num != null && num.intValue() <= Integer.parseInt(str2)) {
                    new androidx.appcompat.app.e.a(z0Var.f70343a).setCancelable(true).setTitle(R.string.lbl_invalid_stroke_rate).setMessage(R.string.msg_stroke_rate_error).setPositiveButton(R.string.lbl_ok, new f20.i(26)).show();
                } else {
                    z0Var.f93324g.setButtonRightLabel(str2);
                    fVar2.y1("cadenceAlertCustomLowValue", Integer.valueOf(Integer.parseInt(str2)));
                    z0Var.p();
                }
                break;
            default:
                List list = (List) obj3;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj2;
                p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                if (Integer.parseInt((String) arrayList.get(0)) < list.size()) {
                    a0Var.F6().M6((my1.g) list.get(Integer.parseInt((String) arrayList.get(0))));
                    p0Var.f105807a = list.indexOf(list.get(Integer.parseInt((String) arrayList.get(0))));
                } else {
                    a0Var.F6().M6(null);
                }
                a0Var.E6();
                break;
        }
    }
}
