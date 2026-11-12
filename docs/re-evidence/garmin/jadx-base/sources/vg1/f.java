package vg1;

import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final GDIAntiTheftAlarmProto.AntiTheftAlarmService a(GDISmartProto.Smart smart) {
        smart.getClass();
        Object extension = smart.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) GDIAntiTheftAlarmExtension.antiTheftAlarmService);
        extension.getClass();
        return (GDIAntiTheftAlarmProto.AntiTheftAlarmService) extension;
    }

    public static final void b(GDISmartProto.Smart.Builder builder, GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builder2) {
        builder.setExtension(GDIAntiTheftAlarmExtension.antiTheftAlarmService, builder2.build());
    }
}
