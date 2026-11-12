package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.OutputConfiguration;
import android.health.connect.datatypes.PlannedExerciseSessionRecord;
import android.health.connect.datatypes.SkinTemperatureRecord;
import android.service.chooser.ChooserResult;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ CameraDevice.CameraDeviceSetup d(Object obj) {
        return (CameraDevice.CameraDeviceSetup) obj;
    }

    public static /* synthetic */ OutputConfiguration g(Size size, int i14) {
        return new OutputConfiguration(i14, size);
    }

    public static /* bridge */ /* synthetic */ ChooserResult i(Object obj) {
        return (ChooserResult) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return ChooserResult.class;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return PlannedExerciseSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return SkinTemperatureRecord.class;
    }
}
