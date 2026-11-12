package yw2;

import android.content.Context;
import android.content.DialogInterface;
import bv2.n;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.realtimesettings.app.initialization.RealTimeSettingsInitializerActivity;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import yr.o0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.realtimesettings.app.presentationlayer.c f200006b;

    public /* synthetic */ j(com.garmin.realtimesettings.app.presentationlayer.c cVar, int i14) {
        this.f200005a = i14;
        this.f200006b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f200005a;
        com.garmin.realtimesettings.app.presentationlayer.c cVar = this.f200006b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                ((DialogInterface) obj).getClass();
                SettingsDeviceActivity settingsDeviceActivityW6 = cVar.w6();
                if (settingsDeviceActivityW6 != null) {
                    settingsDeviceActivityW6.finish();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar2 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                ((DialogInterface) obj).getClass();
                SettingsDeviceActivity settingsDeviceActivityW7 = cVar.w6();
                if (settingsDeviceActivityW7 != null) {
                    settingsDeviceActivityW7.finish();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar3 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                ((DialogInterface) obj).getClass();
                RealTimeSettingsInitializerActivity.a aVar4 = RealTimeSettingsInitializerActivity.f52581r;
                Context contextRequireContext = cVar.requireContext();
                contextRequireContext.getClass();
                RealTimeSettingsInitializerActivity.a.a(aVar4, contextRequireContext, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, false, 12);
                break;
            default:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.realtimesettings.app.presentationlayer.c.a aVar5 = com.garmin.realtimesettings.app.presentationlayer.c.f52641v;
                if (mVar.n(iIntValue & 1, (iIntValue & 11) != 2)) {
                    n.a(new o0(cVar, 5), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
