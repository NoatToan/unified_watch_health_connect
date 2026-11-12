package com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.a;
import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftAlarmProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "deviceId", "", "requestId", "", "requestMsg", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "mTag", "", "run", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AntiTheftAlarmProtobufRequestHandler extends ProtobufRequestHandler {
    public static final int $stable = 8;
    private final String mTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntiTheftAlarmProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        context.getClass();
        smart.getClass();
        this.mTag = "AntiTheftAlarmProtobufRequestHandler";
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context = this.contextRef.get();
        if (context == null) {
            String str = this.mTag;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, str, "Aborting. Context is null");
            return;
        }
        GDIAntiTheftAlarmProto.AntiTheftAlarmService antiTheftAlarmService = (GDIAntiTheftAlarmProto.AntiTheftAlarmService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) GDIAntiTheftAlarmExtension.antiTheftAlarmService);
        if (antiTheftAlarmService.hasMovementAlertNotification()) {
            new a(context, this.deviceId).b(a.EnumC0797a.BIKE_ALARM_ACTIVATED);
            String str2 = this.mTag;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.k(a2Var2, str2, "Received Movement alert notification request");
            oi2.a.C2513a.a(oi2.a.f132270a, new AntiTheftMovementAlertEvent(true));
            return;
        }
        if (antiTheftAlarmService.hasSettingChangeRequest()) {
            String str3 = this.mTag;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.k(a2Var3, str3, "Received Setting change request");
            a aVar4 = new a(context, this.deviceId);
            if (antiTheftAlarmService.getSettingChangeRequest().getIsEnabled()) {
                aVar4.b(a.EnumC0797a.BIKE_ALARM_ON);
            } else {
                aVar4.b(a.EnumC0797a.BIKE_ALARM_OFF);
            }
            oi2.a.C2513a.a(oi2.a.f132270a, new AntiTheftSettingChangeRequestEvent(antiTheftAlarmService.getSettingChangeRequest().getIsEnabled()));
            return;
        }
        boolean zHasDisableRequest = antiTheftAlarmService.hasDisableRequest();
        String str4 = this.mTag;
        if (!zHasDisableRequest) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar5.getClass();
            i2.a.p(a2Var4, str4, "Empty message");
            return;
        }
        i2.a aVar6 = i2.f36769a;
        a2 a2Var5 = a2.GENERAL;
        aVar6.getClass();
        i2.a.k(a2Var5, str4, "Received Disable request");
        oi2.a.C2513a.a(oi2.a.f132270a, new AntiTheftDisableRequestEvent());
    }
}
