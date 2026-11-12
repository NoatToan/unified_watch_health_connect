package po1;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.eventbus.ThreadMode;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpo1/g;", "Lpo1/h;", "<init>", "()V", "Lpo1/f;", "activityLikeEvent", "", "onActivityLikeReceived", "(Lpo1/f;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f139040a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<c> f139041b = new ArrayList<>();

    private g() {
    }

    @l73.k(threadMode = ThreadMode.MAIN)
    public final void onActivityLikeReceived(f activityLikeEvent) {
        c next;
        int iHashCode;
        activityLikeEvent.getClass();
        Iterator<c> it = f139041b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getIdentifier().equals(activityLikeEvent.f137869a));
        c cVar = next;
        if (cVar == null || !cVar.n3()) {
            DateTime dateTime = activityLikeEvent.f139035d;
            if (dateTime == null) {
                dateTime = new DateTime(0L);
            }
            Intent intentPutExtra = ConversationActivity.a.b(ConversationActivity.f44530c, activityLikeEvent.f139033b, activityLikeEvent.f139034c, activityLikeEvent.f139038g, activityLikeEvent.f139039h, dateTime.compareTo((ReadableInstant) DateTime.now().minusDays(90)) > 0, 32).putExtra("GCM_isFromAndroidNotification", true);
            intentPutExtra.getClass();
            Context context = activityLikeEvent.f139033b;
            String str = activityLikeEvent.f139034c;
            str.getClass();
            try {
                iHashCode = Long.parseLong(str) > 2147483647L ? str.hashCode() : Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                iHashCode = 121212;
            }
            int i14 = iHashCode;
            String string = activityLikeEvent.f139033b.getString(R.string.pn_title_new_like);
            string.getClass();
            h.a(context, i14, string, activityLikeEvent.f139036e, activityLikeEvent.f139037f, intentPutExtra, j0.f134944a);
        }
    }
}
