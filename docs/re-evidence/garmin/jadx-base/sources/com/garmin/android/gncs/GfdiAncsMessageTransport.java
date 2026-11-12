package com.garmin.android.gncs;

import android.content.Context;
import com.garmin.android.ancs.ANCSMessageManager;
import com.garmin.android.ancs.DeviceCapability;
import com.garmin.android.ancs.IANCSMessageTransport;
import com.garmin.android.gncs.messages.NotificationServiceSubscriptionMessage;
import com.garmin.android.gncs.mms.GNCSMediaRequest;
import com.garmin.android.gncs.mms.GNCSMediaResponse;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0015\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%¨\u0006&"}, d2 = {"Lcom/garmin/android/gncs/GfdiAncsMessageTransport;", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler$Callback;", "Lcom/garmin/android/ancs/IANCSMessageTransport;", "Landroid/content/Context;", "appContext", "Lrs2/c;", "deviceInfo", "<init>", "(Landroid/content/Context;Lrs2/c;)V", "", "deviceMacAddress", "Lcom/garmin/android/gncs/SmartNotificationsDataHandler;", "getDataHandler", "(Ljava/lang/String;)Lcom/garmin/android/gncs/SmartNotificationsDataHandler;", "", "Lcom/garmin/android/ancs/DeviceCapability;", "deviceCapabilities", "", "onCapabilitiesReceived", "(Ljava/util/List;)V", "Lcom/garmin/android/gncs/messages/NotificationServiceSubscriptionMessage;", "request", "onNotificationServiceSubscribe", "(Lcom/garmin/android/gncs/messages/NotificationServiceSubscriptionMessage;)V", "onNotificationServiceUnsubscribe", "", "payload", "onGncsMessageReceived", "([B)V", "Lcom/garmin/android/gncs/mms/GNCSMediaRequest;", "Lcom/garmin/android/gncs/mms/GNCSMediaResponse;", "processMediaRequest", "(Lcom/garmin/android/gncs/mms/GNCSMediaRequest;Lt13/d;)Ljava/lang/Object;", "sendGncsNotificationSource", "([BLjava/lang/String;)V", "sendGncsDataSource", "Landroid/content/Context;", "Lrs2/c;", "gncs-gdi_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GfdiAncsMessageTransport implements SmartNotificationsDataHandler.Callback, IANCSMessageTransport {
    private final Context appContext;
    private final rs2.c deviceInfo;

    public GfdiAncsMessageTransport(Context context, rs2.c cVar) {
        context.getClass();
        cVar.getClass();
        this.appContext = context;
        this.deviceInfo = cVar;
    }

    private final SmartNotificationsDataHandler getDataHandler(String deviceMacAddress) {
        return (SmartNotificationsDataHandler) da2.d.c(this.appContext).f58886a.f111646e.getCapability(deviceMacAddress, SmartNotificationsDataHandler.class);
    }

    @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Callback
    public void onCapabilitiesReceived(List<? extends DeviceCapability> deviceCapabilities) {
        deviceCapabilities.getClass();
        ih2.b.b("GfdiAncsMsgTransport.onCapabilitiesReceived -> calling 'ANCSMessageManager.setDeviceCapabilities'...");
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).setDeviceCapabilities(this.deviceInfo.getF92741e(), deviceCapabilities);
    }

    @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Callback
    public void onGncsMessageReceived(byte[] payload) {
        payload.getClass();
        try {
            ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).onMessageReceived(payload, this.deviceInfo.getF92741e());
        } catch (Throwable th3) {
            ih2.b.c("GfdiAncsMsgTransport.onGncsMessageReceived", th3);
        }
    }

    @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Callback
    public void onNotificationServiceSubscribe(NotificationServiceSubscriptionMessage request) {
        request.getClass();
        int f92744h = this.deviceInfo.getF92744h();
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).subscribe(this.deviceInfo.getF92741e(), (f92744h == 3851 || f92744h == 4017 || f92744h == 4125) ? w.c(DeviceCapability.MODIFIED_NOTIFICATIONS_AFTER_ADDED) : j0.f134944a, this);
    }

    @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Callback
    public void onNotificationServiceUnsubscribe(NotificationServiceSubscriptionMessage request) {
        request.getClass();
        ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).unsubscribe(this.deviceInfo.getF92741e());
    }

    @Override // com.garmin.android.gncs.SmartNotificationsDataHandler.Callback
    public Object processMediaRequest(GNCSMediaRequest gNCSMediaRequest, t13.d<? super GNCSMediaResponse> dVar) {
        ih2.b.b("GfdiAncsMsgTransport.onGncsMessageReceived");
        try {
            return ((ANCSMessageManager) jb2.b.a(ANCSMessageManager.class)).processMediaRequest(gNCSMediaRequest, this.deviceInfo.getF92741e());
        } catch (Throwable th3) {
            ih2.b.c("GfdiAncsMsgTransport.onGncsMessageReceived", th3);
            return null;
        }
    }

    @Override // com.garmin.android.ancs.IANCSMessageTransport
    public void sendGncsDataSource(byte[] payload, String deviceMacAddress) {
        payload.getClass();
        deviceMacAddress.getClass();
        SmartNotificationsDataHandler dataHandler = getDataHandler(deviceMacAddress);
        if (dataHandler != null) {
            ih2.b.b("GfdiAncsMsgTransport.sendGncsDataSource -> device [" + deviceMacAddress + "], payload (" + SmartNotificationsUtil.obfuscatePayloadIfNeeded(payload) + ")");
            dataHandler.sendGncsDataSource(payload);
        }
    }

    @Override // com.garmin.android.ancs.IANCSMessageTransport
    public void sendGncsNotificationSource(byte[] payload, String deviceMacAddress) {
        payload.getClass();
        deviceMacAddress.getClass();
        SmartNotificationsDataHandler dataHandler = getDataHandler(deviceMacAddress);
        if (dataHandler != null) {
            dataHandler.sendGncsNotificationSource(payload);
        }
    }
}
