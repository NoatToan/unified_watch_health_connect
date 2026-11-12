package en0;

import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDIHandCalibrationExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static final GDIHandCalibration.HandCalibrationService a(GDISmartProto.Smart smart) {
        smart.getClass();
        Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) GDIHandCalibrationExtension.handCalibrationService);
        extension.getClass();
        return (GDIHandCalibration.HandCalibrationService) extension;
    }
}
