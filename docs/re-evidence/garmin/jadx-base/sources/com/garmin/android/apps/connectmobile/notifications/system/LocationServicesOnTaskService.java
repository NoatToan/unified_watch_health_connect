package com.garmin.android.apps.connectmobile.notifications.system;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.BluetoothInBadStateNotificationActivity;
import com.garmin.android.apps.connectmobile.R;
import hk0.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sz0.e;
import sz0.f;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/system/LocationServicesOnTaskService;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationServicesOnTaskService extends Worker {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationServicesOnTaskService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        if (!p.d().isEmpty()) {
            return new d.a.c();
        }
        Context context = this.f11469a;
        Intent intent = new Intent(context, (Class<?>) BluetoothInBadStateNotificationActivity.class);
        intent.setFlags(1082130432);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        e eVar = e.f161367g;
        q qVar = new q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(context.getText(R.string.lbl_bluetooth_troubleshooting));
        qVar.f202684f = q.e(context.getText(R.string.location_services_on_title));
        qVar.f202689k = q.e("");
        notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
        qVar.f202691m = 0;
        o oVar = new o();
        oVar.f202664e = q.e(context.getString(R.string.android_notification_bad_bluetooth_state_content_text_long, context.getString(R.string.os_name_android)));
        qVar.l(oVar);
        qVar.f202686h = activity;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        f.f161394a.getClass();
        f.a.f(context, notificationC, 3, eVar);
        return new d.a.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/notifications/system/LocationServicesOnTaskService$a;", "", "<init>", "()V", "", "TASK_TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
