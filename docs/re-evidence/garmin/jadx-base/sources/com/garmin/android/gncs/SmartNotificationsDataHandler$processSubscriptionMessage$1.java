package com.garmin.android.gncs;

import com.garmin.android.gncs.messages.NotificationServiceSubscriptionMessage;
import com.garmin.android.gncs.messages.NotificationServiceSubscriptionResponseMessage;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;
import rs2.y;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$processSubscriptionMessage$1", f = "SmartNotificationsDataHandler.kt", l = {345, 359}, m = "invokeSuspend")
public final class SmartNotificationsDataHandler$processSubscriptionMessage$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ byte[] $payload;
    final /* synthetic */ x $responder;
    Object L$0;
    int label;
    final /* synthetic */ SmartNotificationsDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler$processSubscriptionMessage$1(byte[] bArr, SmartNotificationsDataHandler smartNotificationsDataHandler, x xVar, t13.d<? super SmartNotificationsDataHandler$processSubscriptionMessage$1> dVar) {
        super(2, dVar);
        this.$payload = bArr;
        this.this$0 = smartNotificationsDataHandler;
        this.$responder = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new SmartNotificationsDataHandler$processSubscriptionMessage$1(this.$payload, this.this$0, this.$responder, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((SmartNotificationsDataHandler$processSubscriptionMessage$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[Catch: all -> 0x00a9, TRY_ENTER, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0099, B:28:0x00a1, B:31:0x00ab), top: B:42:0x0099, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0099, B:28:0x00a1, B:31:0x00ab), top: B:42:0x0099, outer: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r6.b(r1, r5) == r0) goto L36;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationServiceSubscriptionMessage notificationServiceSubscriptionMessage;
        NotificationServiceSubscriptionMessage notificationServiceSubscriptionMessage2;
        boolean zIsSubscribing;
        SmartNotificationsDataHandler smartNotificationsDataHandler;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                r.b(obj);
                try {
                    notificationServiceSubscriptionMessage = new NotificationServiceSubscriptionMessage(this.$payload);
                    ih2.b.b(this.this$0.logTag + "processSubscriptionMessage, received request " + notificationServiceSubscriptionMessage);
                } catch (Throwable th3) {
                    ih2.b.c(this.this$0.logTag + "processSubscriptionMessage, failed to parse 'NotificationServiceSubscriptionMessage'", th3);
                    notificationServiceSubscriptionMessage = null;
                }
                if (notificationServiceSubscriptionMessage != null) {
                    NotificationServiceSubscriptionResponseMessage notificationServiceSubscriptionResponseMessage = new NotificationServiceSubscriptionResponseMessage();
                    notificationServiceSubscriptionResponseMessage.setResponse(NotificationServiceSubscriptionResponseMessage.ResponseType.SUCCESSFUL);
                    notificationServiceSubscriptionResponseMessage.setIntent(notificationServiceSubscriptionMessage.getIntentIndicator());
                    notificationServiceSubscriptionResponseMessage.setFeatureFlags(notificationServiceSubscriptionMessage.getFeatureFlags());
                    x xVar = this.$responder;
                    y yVar = y.ACK;
                    byte[] payload = notificationServiceSubscriptionResponseMessage.getPayload();
                    payload.getClass();
                    this.L$0 = notificationServiceSubscriptionMessage;
                    this.label = 1;
                    if (xVar.a(yVar, payload, this) != aVar) {
                        notificationServiceSubscriptionMessage2 = notificationServiceSubscriptionMessage;
                        zIsSubscribing = notificationServiceSubscriptionMessage2.isSubscribing();
                        smartNotificationsDataHandler = this.this$0;
                        if (zIsSubscribing) {
                            smartNotificationsDataHandler.callback.onNotificationServiceSubscribe(notificationServiceSubscriptionMessage2);
                        } else {
                            smartNotificationsDataHandler.callback.onNotificationServiceUnsubscribe(notificationServiceSubscriptionMessage2);
                        }
                    }
                } else {
                    x xVar2 = this.$responder;
                    y yVar2 = y.LENGTH_ERROR;
                    this.label = 2;
                }
                return aVar;
            }
            if (i14 == 1) {
                notificationServiceSubscriptionMessage2 = (NotificationServiceSubscriptionMessage) this.L$0;
                r.b(obj);
                try {
                    zIsSubscribing = notificationServiceSubscriptionMessage2.isSubscribing();
                    smartNotificationsDataHandler = this.this$0;
                    if (zIsSubscribing) {
                        smartNotificationsDataHandler.callback.onNotificationServiceSubscribe(notificationServiceSubscriptionMessage2);
                    } else {
                        smartNotificationsDataHandler.callback.onNotificationServiceUnsubscribe(notificationServiceSubscriptionMessage2);
                    }
                } catch (Throwable th4) {
                    ih2.b.c(this.this$0.logTag + "processSubscriptionMessage, callback failed", th4);
                }
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Throwable th5) {
            ih2.b.c(this.this$0.logTag + "processSubscriptionMessage, failed to respond to 'NotificationServiceSubscriptionMessage'", th5);
        }
        return Unit.INSTANCE;
    }
}
