package po1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import p005kotlin.Metadata;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpo1/m;", "Lpi2/c;", "<init>", "()V", "Lpo1/l;", "groupPushNotificationEvent", "", "onGroupPushNotificationReceived", "(Lpo1/l;)V", "Lpo1/k;", "groupPushCommentNotificationEvent", "onGroupPushCommentNotificationReceived", "(Lpo1/k;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements pi2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f139065a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<b> f139066b = new ArrayList<>();

    private m() {
    }

    public static void a(Context context, int i14, String str, Bitmap bitmap, String str2, Intent intent, List list) {
        PendingIntent activity = PendingIntent.getActivity(context, i14, intent, 201326592);
        sz0.e eVar = sz0.e.P;
        q qVar = new q(context, eVar.f161386a);
        qVar.j(bitmap);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(str);
        qVar.f202684f = q.e(str2);
        qVar.m(str2);
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

    @l73.k(threadMode = ThreadMode.MAIN)
    public final void onGroupPushCommentNotificationReceived(k groupPushCommentNotificationEvent) {
        b next;
        groupPushCommentNotificationEvent.getClass();
        Iterator<b> it = f139066b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getIdentifier().equals(groupPushCommentNotificationEvent.f137869a));
        b bVar = next;
        if (bVar != null) {
            bVar.F();
            return;
        }
        String str = groupPushCommentNotificationEvent.f139052c;
        str.getClass();
        a(groupPushCommentNotificationEvent.f139051b, str.hashCode(), groupPushCommentNotificationEvent.f139056g, groupPushCommentNotificationEvent.f139054e, groupPushCommentNotificationEvent.f139055f, groupPushCommentNotificationEvent.f139053d, groupPushCommentNotificationEvent.f139057h);
    }

    @l73.k(threadMode = ThreadMode.MAIN)
    public final void onGroupPushNotificationReceived(l groupPushNotificationEvent) {
        groupPushNotificationEvent.getClass();
        String str = groupPushNotificationEvent.f139059c;
        str.getClass();
        a(groupPushNotificationEvent.f139058b, str.hashCode(), groupPushNotificationEvent.f139063g, groupPushNotificationEvent.f139061e, groupPushNotificationEvent.f139062f, groupPushNotificationEvent.f139060d, groupPushNotificationEvent.f139064h);
    }
}
