package cr0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcr0/g;", "", "<init>", "()V", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f55332a = new g();

    private g() {
    }

    public static void a(Context context, Intent intent) {
        context.getClass();
        sz0.e eVar = sz0.e.f161377p;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(context.getString(R.string.lbl_instant_keyboard));
        qVar.f202684f = q.e(context.getString(R.string.instant_input_notification_message));
        qVar.i(2, true);
        qVar.B = "service";
        qVar.E = 1;
        qVar.f202686h = PendingIntent.getActivity(context, 1, intent, 201326592);
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.c(context, eVar);
        sz0.f.a.f(context, notificationC, 17, eVar);
    }
}
