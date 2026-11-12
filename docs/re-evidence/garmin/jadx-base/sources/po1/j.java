package po1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.eventbus.ThreadMode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import sz0.n;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpo1/j;", "Lpi2/c;", "<init>", "()V", "Lpo1/i;", "challengeCommentEvent", "", "onChallengeCommentReceived", "(Lpo1/i;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements pi2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f139048a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<a> f139049b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n f139050c;

    private j() {
    }

    @l73.k(threadMode = ThreadMode.MAIN)
    public final void onChallengeCommentReceived(i challengeCommentEvent) {
        a next;
        challengeCommentEvent.getClass();
        int i14 = challengeCommentEvent.f139044d;
        String str = challengeCommentEvent.f139046f;
        Context context = challengeCommentEvent.f139042b;
        if (challengeCommentEvent.f139043c) {
            Iterator<a> it = f139049b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.getIdentifier().equals(challengeCommentEvent.f137869a));
            a aVar = next;
            if (aVar != null) {
                aVar.F();
                return;
            }
        }
        if (str == null || str.length() == 0) {
            i2.a aVar2 = i2.f36769a;
            aVar2.getClass();
            i2.a.p(a2.CHALLENGES, "ChallengeCommentListener", "Failed to format message from push notification for event: " + challengeCommentEvent);
            return;
        }
        n nVar = f139050c;
        if (nVar == null) {
            s.m("commentListenerUtilDelegate");
            throw null;
        }
        PendingIntent activity = PendingIntent.getActivity(context, i14, nVar.a(context, challengeCommentEvent.f139047g), 201326592);
        sz0.e eVar = sz0.e.f161369i;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(challengeCommentEvent.f139045e);
        qVar.f202684f = q.e(str);
        qVar.f202686h = activity;
        o oVar = new o();
        oVar.f202664e = q.e(str);
        qVar.l(oVar);
        qVar.B = "social";
        qVar.i(16, true);
        qVar.f202691m = 0;
        qVar.E = 0;
        sz0.f.a aVar3 = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar3.getClass();
        sz0.f.a.f(context, notificationC, i14, eVar);
    }
}
