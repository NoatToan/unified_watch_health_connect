package ik0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sz0.f;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lik0/e;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f93907a;

    static {
        new a(null);
    }

    public e() {
        int i14 = gt2.c.f79010a;
        this.f93907a = gt2.b.f79005a.h("WeatherLocationHelper");
    }

    public final void a(Context context, String str, String str2, String str3, PendingIntent pendingIntent, PendingIntent pendingIntent2, int i14) {
        this.f93907a.debug("postNotification:");
        sz0.e eVar = sz0.e.f161384y;
        q qVar = new q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(str);
        qVar.f202684f = q.e(str2);
        qVar.f202689k = q.e("");
        qVar.B = "recommendation";
        notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
        qVar.f202691m = 1;
        o oVar = new o();
        oVar.f202664e = q.e(str3);
        qVar.l(oVar);
        qVar.f202686h = pendingIntent;
        if (pendingIntent2 != null) {
            qVar.a(2131232010, context.getResources().getString(R.string.button_dont_ask_again), pendingIntent2);
        }
        Notification notificationC = qVar.c();
        notificationC.getClass();
        notificationC.flags = 16;
        f.f161394a.getClass();
        f.a.f(context, notificationC, i14, eVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lik0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "WEATHER_SHARED_PREFS", "LAST_LOCATION_PERMISSION_NEEDED_NOTIFICATION", "LAST_LOCATION_SERVICES_NEEDED_NOTIFICATION", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
