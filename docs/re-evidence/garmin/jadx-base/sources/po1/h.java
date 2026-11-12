package po1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpo1/h;", "Lpi2/c;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h implements pi2.c {
    static {
        new a(null);
    }

    public static void a(Context context, int i14, String str, Bitmap bitmap, String str2, Intent intent, List list) {
        context.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, i14, intent, 201326592);
        sz0.e eVar = sz0.e.f161379r;
        q qVar = new q(context, eVar.f161386a);
        qVar.j(bitmap);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(str);
        qVar.f202684f = q.e(str2);
        qVar.m(str2);
        qVar.f202700v = String.valueOf(i14);
        qVar.i(16, true);
        qVar.B = "social";
        qVar.f202691m = 0;
        qVar.f202686h = activity;
        o oVar = new o();
        oVar.f202664e = q.e(str2);
        qVar.l(oVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qVar.b((z6.k) it.next());
        }
        sz0.f.a aVar = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar.getClass();
        sz0.f.a.f(context, notificationC, i14, eVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo1/h$a;", "", "<init>", "()V", "", "DEFAULT_ACTIVITY_NOTIFICATION_ID", "I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
