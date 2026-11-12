package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEnableReceivedEvent;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideConsentActivity;
import com.garmin.proto.generated.GDISmartProto;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/GroupRideEnableProtobufRequestHandler;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "deviceId", "", "requestMsg", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "requestId", "", "<init>", "(Landroid/content/Context;JLcom/garmin/proto/generated/GDISmartProto$Smart;I)V", "getContext", "()Landroid/content/Context;", "run", "", "showNotification", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupRideEnableProtobufRequestHandler extends ProtobufRequestHandler {
    public static final int $stable = 8;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupRideEnableProtobufRequestHandler(Context context, long j8, GDISmartProto.Smart smart, int i14) {
        super(context, j8, i14, smart);
        context.getClass();
        smart.getClass();
        this.context = context;
    }

    private final void showNotification(Context context) {
        LivetrackGroupRideConsentActivity.a aVar = LivetrackGroupRideConsentActivity.f38667k;
        long j8 = this.deviceId;
        aVar.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 0, LivetrackGroupRideConsentActivity.a.a(context, j8, false), 201326592);
        sz0.e eVar = sz0.e.f161376o;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(context.getString(R.string.lbl_group_ride_enable));
        qVar.f202684f = q.e(context.getString(R.string.msg_group_ride_enable));
        o oVar = new o();
        oVar.f202664e = q.e("\n" + context.getString(R.string.msg_group_ride_enable));
        qVar.l(oVar);
        qVar.f202691m = 1;
        qVar.i(16, true);
        qVar.f202686h = activity;
        sz0.f.a aVar2 = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar2.getClass();
        sz0.f.a.f(context, notificationC, 39, eVar);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).i()) {
            showNotification(this.context);
        } else {
            oi2.a.C2513a.a(oi2.a.f132270a, new GroupRideEnableReceivedEvent(this.deviceId));
        }
    }
}
