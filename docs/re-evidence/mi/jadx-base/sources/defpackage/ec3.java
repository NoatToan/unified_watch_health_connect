package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ec3 implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Size> f16478a;

    public ec3(vf3 vf3Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) vf3Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            zpe.c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(34) : null;
        List<Size> listAsList = outputSizes != null ? Arrays.asList((Size[]) outputSizes.clone()) : Collections.emptyList();
        this.f16478a = listAsList;
        zpe.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + listAsList);
    }

    public static boolean b(vf3 vf3Var) {
        Integer num = (Integer) vf3Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> a() {
        return new ArrayList(this.f16478a);
    }
}
