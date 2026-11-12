package au;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Arrays;
import l73.k;
import org.greenrobot.eventbus.ThreadMode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import yt.s;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/f;", "Lpi2/c;", "<init>", "()V", "Lau/e;", "annualReportReadyNotificationEvent", "", "onAnnualReportReadyNotificationReceived", "(Lau/e;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements pi2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static s f12846b;

    static {
        f fVar = new f();
        f12845a = fVar;
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(fVar);
    }

    private f() {
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onAnnualReportReadyNotificationReceived(e annualReportReadyNotificationEvent) {
        annualReportReadyNotificationEvent.getClass();
        if (f12846b != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportReadyNotificationEventListener", "onAnnualReportReadyNotificationReceived: Event intercepted, skip generating push notification");
            return;
        }
        Context context = annualReportReadyNotificationEvent.f12843c;
        int i14 = annualReportReadyNotificationEvent.f12842b;
        PendingIntent activity = PendingIntent.getActivity(context, i14, annualReportReadyNotificationEvent.f12844d, 201326592);
        String string = context.getString(R.string.annual_report_ready_push_title);
        string.getClass();
        x0 x0Var = x0.f105818a;
        String string2 = context.getString(R.string.annual_report_ready_push_text);
        string2.getClass();
        String str = String.format(string2, Arrays.copyOf(new Object[]{2025}, 1));
        sz0.e eVar = sz0.e.J0;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(string);
        qVar.f202684f = q.e(str);
        qVar.m(str);
        qVar.i(16, true);
        qVar.B = "social";
        qVar.f202691m = 0;
        qVar.f202686h = activity;
        o oVar = new o();
        oVar.f202664e = q.e(str);
        qVar.l(oVar);
        sz0.f.a aVar2 = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar2.getClass();
        sz0.f.a.f(context, notificationC, i14, eVar);
    }
}
