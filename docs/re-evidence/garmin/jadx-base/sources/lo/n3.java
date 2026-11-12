package lo;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveEditGasesActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n3 implements r22.i1.b, r22.y1.d, r22.g0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.manual.a f113923b;

    public /* synthetic */ n3(com.garmin.android.apps.connectmobile.activities.manual.a aVar, int i14) {
        this.f113922a = i14;
        this.f113923b = aVar;
    }

    @Override // r22.i1.b
    public void a(int i14, ps.z1 z1Var) {
        switch (this.f113922a) {
            case 1:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113923b;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a = aVar.f29169p;
                if (interfaceC0448a != null) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = ((ActivityDiveEditGasesActivity) interfaceC0448a).f29130d.get(aVar.f29167n.f29646e);
                    rVar.f29649h = i14;
                    rVar.f29650i = z1Var;
                    rVar.f29652k = z1Var;
                    aVar.a(rVar);
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar2 = this.f113923b;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a2 = aVar2.f29169p;
                if (interfaceC0448a2 != null) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = ((ActivityDiveEditGasesActivity) interfaceC0448a2).f29130d.get(aVar2.f29167n.f29646e);
                    rVar2.f29651j = i14;
                    rVar2.f29652k = z1Var;
                    rVar2.f29650i = z1Var;
                    aVar2.a(rVar2);
                }
                break;
        }
    }

    @Override // r22.g0.a
    public void b(double d14) {
        com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113923b;
        com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a = aVar.f29169p;
        if (interfaceC0448a != null) {
            com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = ((ActivityDiveEditGasesActivity) interfaceC0448a).f29130d.get(aVar.f29167n.f29646e);
            rVar.f29655n = d14;
            aVar.a(rVar);
        }
    }

    @Override // r22.y1.d
    public void c(Object obj) {
        String string;
        switch (this.f113922a) {
            case 3:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = this.f113923b;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a = aVar.f29169p;
                if (interfaceC0448a != null) {
                    int iIntValue = ((Integer) obj).intValue() + 1;
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = ((ActivityDiveEditGasesActivity) interfaceC0448a).f29130d.get(aVar.f29167n.f29646e);
                    rVar.f29645d = iIntValue;
                    aVar.a(rVar);
                }
                break;
            case 4:
            default:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar2 = this.f113923b;
                Context context = aVar2.f29154a;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a2 = aVar2.f29169p;
                if (interfaceC0448a2 != null) {
                    int iIntValue2 = ((Integer) obj).intValue();
                    if (iIntValue2 == 0) {
                        string = context.getString(R.string.lbl_tank_material_aluminium);
                    } else if (iIntValue2 != 1) {
                        string = iIntValue2 != 2 ? "" : context.getString(R.string.lbl_other);
                    } else {
                        string = context.getString(R.string.lbl_tank_material_steel);
                    }
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = ((ActivityDiveEditGasesActivity) interfaceC0448a2).f29130d.get(aVar2.f29167n.f29646e);
                    rVar2.f29648g = string;
                    aVar2.a(rVar2);
                }
                break;
            case 5:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar3 = this.f113923b;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a3 = aVar3.f29169p;
                if (interfaceC0448a3 != null) {
                    int iIntValue3 = ((Integer) obj).intValue();
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar3 = ((ActivityDiveEditGasesActivity) interfaceC0448a3).f29130d.get(aVar3.f29167n.f29646e);
                    rVar3.f29642a = iIntValue3;
                    aVar3.a(rVar3);
                }
                break;
        }
    }
}
