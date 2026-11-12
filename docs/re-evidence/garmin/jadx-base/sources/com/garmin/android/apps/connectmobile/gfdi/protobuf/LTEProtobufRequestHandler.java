package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/LTEProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "deviceId", "", "requestId", "", "smart", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "run", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LTEProtobufRequestHandler extends ProtobufRequestHandler {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTEProtobufRequestHandler(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        context.getClass();
        smart.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    @Override // java.lang.Runnable
    public void run() {
        qi1.b bVar;
        Context context;
        GDISmartProto.Smart smart = this.requestMsg;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILTEProto.LTEService> generatedExtension = GDILTEExtension.lteService;
        if (((GDILTEProto.LTEService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasLteSubscriptionInfoRequest()) {
            bVar = new qi1.a(this.requestId, this.deviceId);
        } else if (((GDILTEProto.LTEService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasApGeofencingNotification()) {
            long j8 = this.deviceId;
            GDISmartProto.Smart smart2 = this.requestMsg;
            smart2.getClass();
            Object extension = smart2.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
            extension.getClass();
            bVar = new rj1.a(j8, (GDILTEProto.LTEService) extension);
        } else if (((GDILTEProto.LTEService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasLteDeviceInfoRequest()) {
            WeakReference<Context> weakReference = this.contextRef;
            if (weakReference == null || (context = weakReference.get()) == null) {
                bVar = null;
            } else {
                bVar = new pw0.e(context, this.requestId, this.deviceId);
            }
        } else if (((GDILTEProto.LTEService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).hasApValidationNotification()) {
            Long lValueOf = Long.valueOf(this.deviceId);
            GDISmartProto.Smart smart3 = this.requestMsg;
            smart3.getClass();
            Object extension2 = smart3.getExtension((GeneratedMessage.GeneratedExtension<MessageT, Object>) generatedExtension);
            extension2.getClass();
            bVar = new rj1.b(lValueOf, (GDILTEProto.LTEService) extension2);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.a();
        }
    }
}
