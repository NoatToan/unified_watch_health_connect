package c31;

import com.garmin.android.gncs.NotificationConstants;
import e23.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.onboarding.data.local.a f24080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d31.c f24081c;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar, d31.c cVar, int i14) {
        this.f24079a = i14;
        this.f24080b = aVar;
        this.f24081c = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f24079a;
        d31.c cVar = this.f24081c;
        com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar = this.f24080b;
        switch (i14) {
            case 0:
                ud.a aVar2 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar2.getClass();
                ud.c cVarM0 = aVar2.M0("SELECT * FROM device_onboarding_items WHERE status = ?");
                try {
                    aVar.f39665c.getClass();
                    cVarM0.q3(1, a.e(cVar));
                    int iB = ge1.b.B(cVarM0, "deviceId");
                    int iB2 = ge1.b.B(cVarM0, "deviceRegistrationSortOrder");
                    int iB3 = ge1.b.B(cVarM0, "deviceName");
                    int iB4 = ge1.b.B(cVarM0, "deviceProductNumber");
                    int iB5 = ge1.b.B(cVarM0, "sortOrder");
                    int iB6 = ge1.b.B(cVarM0, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB7 = ge1.b.B(cVarM0, "associationType");
                    int iB8 = ge1.b.B(cVarM0, "status");
                    int iB9 = ge1.b.B(cVarM0, "coreItem");
                    int iB10 = ge1.b.B(cVarM0, "reminderDate");
                    int iB11 = ge1.b.B(cVarM0, "deviceImageUrl");
                    ArrayList arrayList = new ArrayList();
                    while (cVarM0.J0()) {
                        int i15 = iB11;
                        arrayList.add(new d31.a(cVarM0.getLong(iB), (int) cVarM0.getLong(iB2), cVarM0.isNull(iB3) ? null : cVarM0.M1(iB3), cVarM0.isNull(iB4) ? null : cVarM0.M1(iB4), (int) cVarM0.getLong(iB5), a.d(cVarM0.M1(iB6)), a.a(cVarM0.M1(iB7)), a.c(cVarM0.M1(iB8)), ((int) cVarM0.getLong(iB9)) != 0, a.b(cVarM0.isNull(iB10) ? null : cVarM0.M1(iB10)), cVarM0.isNull(i15) ? null : cVarM0.M1(i15)));
                        iB11 = i15;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarM0.close();
                }
            default:
                ud.a aVar3 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar2 = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
                aVar3.getClass();
                ud.c cVarM1 = aVar3.M0("SELECT * FROM device_onboarding_items WHERE status = ?");
                try {
                    aVar.f39665c.getClass();
                    cVarM1.q3(1, a.e(cVar));
                    int iB12 = ge1.b.B(cVarM1, "deviceId");
                    int iB13 = ge1.b.B(cVarM1, "deviceRegistrationSortOrder");
                    int iB14 = ge1.b.B(cVarM1, "deviceName");
                    int iB15 = ge1.b.B(cVarM1, "deviceProductNumber");
                    int iB16 = ge1.b.B(cVarM1, "sortOrder");
                    int iB17 = ge1.b.B(cVarM1, NotificationConstants.KEY_DATA_MIME_TYPE);
                    int iB18 = ge1.b.B(cVarM1, "associationType");
                    int iB19 = ge1.b.B(cVarM1, "status");
                    int iB20 = ge1.b.B(cVarM1, "coreItem");
                    int iB21 = ge1.b.B(cVarM1, "reminderDate");
                    int iB22 = ge1.b.B(cVarM1, "deviceImageUrl");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM1.J0()) {
                        int i16 = iB12;
                        arrayList2.add(new d31.a(cVarM1.getLong(iB12), (int) cVarM1.getLong(iB13), cVarM1.isNull(iB14) ? null : cVarM1.M1(iB14), cVarM1.isNull(iB15) ? null : cVarM1.M1(iB15), (int) cVarM1.getLong(iB16), a.d(cVarM1.M1(iB17)), a.a(cVarM1.M1(iB18)), a.c(cVarM1.M1(iB19)), ((int) cVarM1.getLong(iB20)) != 0, a.b(cVarM1.isNull(iB21) ? null : cVarM1.M1(iB21)), cVarM1.isNull(iB22) ? null : cVarM1.M1(iB22)));
                        iB12 = i16;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM1.close();
                }
        }
    }
}
