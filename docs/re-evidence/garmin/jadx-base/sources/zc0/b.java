package zc0;

import com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceTutorialsActivity f203925b;

    public /* synthetic */ b(DeviceTutorialsActivity deviceTutorialsActivity, int i14) {
        this.f203924a = i14;
        this.f203925b = deviceTutorialsActivity;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f203924a;
        DeviceTutorialsActivity deviceTutorialsActivity = this.f203925b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DeviceTutorialsActivity.a aVar = DeviceTutorialsActivity.f34381b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    v.a(g02.d.f74342a.c(deviceTutorialsActivity.getOnBackPressedDispatcher()), z3.f.c(336846619, new b(deviceTutorialsActivity, i16), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DeviceTutorialsActivity.a aVar2 = DeviceTutorialsActivity.f34381b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-48053679, new b(deviceTutorialsActivity, i15), mVar2), mVar2, 221184, 15);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                DeviceTutorialsActivity.a aVar3 = DeviceTutorialsActivity.f34381b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String stringExtra = deviceTutorialsActivity.getIntent().getStringExtra("product_display_name");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    ad0.d.a(stringExtra, (c) deviceTutorialsActivity.f34382a.getValue(), mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
