package com.mapbox.maps;

import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.developer.realtimedata.TestRealTimeDataActivity;
import com.mapbox.maps.renderer.MapboxRenderThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f54416d;

    public /* synthetic */ d(Object obj, int i14, int i15, int i16) {
        this.f54413a = i16;
        this.f54416d = obj;
        this.f54414b = i14;
        this.f54415c = i15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f54413a;
        int i15 = 0;
        int i16 = this.f54415c;
        int i17 = this.f54414b;
        Object obj = this.f54416d;
        switch (i14) {
            case 0:
                MapController.onSizeChanged$lambda$9((MapController) obj, i17, i16);
                break;
            case 1:
                MapboxRenderThread.onSurfaceSizeChanged$lambda$10((MapboxRenderThread) obj, i17, i16);
                break;
            case 2:
                ((j1.b) obj).f96203b = i17;
                Integer.toBinaryString(i16);
                Integer.toBinaryString(i17);
                break;
            case 3:
                TestRealTimeDataActivity testRealTimeDataActivity = (TestRealTimeDataActivity) obj;
                int i18 = TestRealTimeDataActivity.f33670z;
                testRealTimeDataActivity.getClass();
                if (i17 == -1 || i16 == -1) {
                    testRealTimeDataActivity.f33680j.setText("-");
                } else {
                    int i19 = i17 - i16;
                    testRealTimeDataActivity.f33680j.setText(String.valueOf(i19 > 0 ? i19 : 0));
                }
                break;
            case 4:
                r0.o oVar = (r0.o) obj;
                int i24 = 1;
                if (oVar.f148751i != i17) {
                    oVar.f148751i = i17;
                    i15 = 1;
                }
                if (oVar.f148750h != i16) {
                    oVar.f148750h = i16;
                } else {
                    i24 = i15;
                }
                if (i24 != 0) {
                    oVar.f();
                }
                break;
            default:
                DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = (DeviceSettingsFirmwareUpdate) obj;
                int i25 = DeviceSettingsFirmwareUpdate.B;
                deviceSettingsFirmwareUpdate.f30790j = (int) ((((long) i17) * 100) / ((long) i16));
                deviceSettingsFirmwareUpdate.f30802x.post(new tv.f(deviceSettingsFirmwareUpdate, i15));
                break;
        }
    }
}
