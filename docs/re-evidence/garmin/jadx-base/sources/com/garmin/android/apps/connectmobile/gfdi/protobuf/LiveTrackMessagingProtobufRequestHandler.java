package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.Context;
import com.garmin.android.library.livetrack.LivetrackService;
import com.garmin.proto.generated.GDILiveTrackMessagingExtension;
import com.garmin.proto.generated.GDILiveTrackMessagingProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import org.slf4j.Logger;
import wd2.g1;
import wd2.j;
import wd2.q;
import wd2.q0;
import wd2.r0;
import wd2.v;
import wd2.w;

/* JADX INFO: loaded from: classes8.dex */
public class LiveTrackMessagingProtobufRequestHandler extends ProtobufRequestHandler {
    private Context context;
    private String macAddress;

    public LiveTrackMessagingProtobufRequestHandler(Context context, long j8, int i14, String str, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
        this.macAddress = str;
        this.context = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        GDISmartProto.Smart smart = this.requestMsg;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDILiveTrackMessagingProto.LiveTrackMessagingService> generatedExtension = GDILiveTrackMessagingExtension.liveTrackMessagingService;
        GDILiveTrackMessagingProto.LiveTrackMessagingService liveTrackMessagingService = smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDILiveTrackMessagingProto.LiveTrackMessagingService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
        if (liveTrackMessagingService == null) {
            return;
        }
        if (!liveTrackMessagingService.hasSendLiveTrackMessageRequest()) {
            if (liveTrackMessagingService.hasGetLiveTrackMessagesRequest()) {
                Context context = this.context;
                int i14 = this.requestId;
                long j8 = this.deviceId;
                String str = this.macAddress;
                long lastReceivedTrackerMessageSeq = liveTrackMessagingService.getGetLiveTrackMessagesRequest().getLastReceivedTrackerMessageSeq();
                context.getClass();
                str.getClass();
                q qVarC = q.f184563f.c();
                if (!qVarC.e(Long.valueOf(j8))) {
                    ge1.b.T(qVarC, null, null, new v(j8, context, i14, str, null), 3);
                    return;
                }
                Logger logger = q.f184565h;
                if (logger != null) {
                    wr.g.w("handleGrouptrackGetMessagesRequest for device ", j8, logger);
                }
                g1 g1Var = qVarC.f184567b;
                if (g1Var != null) {
                    LivetrackService livetrackService = g1Var.f184472d;
                    if (livetrackService != null) {
                        ge1.b.T(livetrackService, null, null, new q0(livetrackService, j8, i14, str, lastReceivedTrackerMessageSeq, null), 3);
                        return;
                    } else {
                        g1Var.f184471c.error("Not initialized");
                        return;
                    }
                }
                return;
            }
            return;
        }
        GDILiveTrackMessagingProto.SendLiveTrackMessageRequest sendLiveTrackMessageRequest = liveTrackMessagingService.getSendLiveTrackMessageRequest();
        GDILiveTrackMessagingProto.LiveTrackMessageBody liveTrackMessageBody = sendLiveTrackMessageRequest.hasLiveTrackMessageBody() ? sendLiveTrackMessageRequest.getLiveTrackMessageBody() : null;
        j jVar = new j(sendLiveTrackMessageRequest.getRecipientSessionIdsList(), (liveTrackMessageBody == null || !liveTrackMessageBody.hasMessageId()) ? null : Long.valueOf(liveTrackMessageBody.getMessageId()), (liveTrackMessageBody == null || !liveTrackMessageBody.hasMessageText()) ? null : liveTrackMessageBody.getMessageText(), (liveTrackMessageBody == null || !liveTrackMessageBody.hasTimestamp()) ? null : Long.valueOf(liveTrackMessageBody.getTimestamp()));
        Context context2 = this.context;
        int i15 = this.requestId;
        long j14 = this.deviceId;
        String str2 = this.macAddress;
        context2.getClass();
        str2.getClass();
        q qVarC2 = q.f184563f.c();
        if (!qVarC2.e(Long.valueOf(j14))) {
            ge1.b.T(qVarC2, null, null, new w(j14, jVar, context2, i15, str2, null), 3);
            return;
        }
        Logger logger2 = q.f184565h;
        if (logger2 != null) {
            logger2.debug("handleGrouptrackSendMessagesRequest for device " + j14 + " with message " + jVar);
        }
        g1 g1Var2 = qVarC2.f184567b;
        if (g1Var2 != null) {
            LivetrackService livetrackService2 = g1Var2.f184472d;
            if (livetrackService2 != null) {
                ge1.b.T(livetrackService2, null, null, new r0(livetrackService2, j14, i15, str2, jVar, null), 3);
            } else {
                g1Var2.f184471c.error("Not initialized");
            }
        }
    }
}
