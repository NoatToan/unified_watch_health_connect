package po1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.social.service.LikeOnCommentService;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.eventbus.ThreadMode;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpo1/e;", "Lpo1/h;", "<init>", "()V", "Lpo1/d;", "activityCommentEvent", "", "onActivityCommentReceived", "(Lpo1/d;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f139031a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<b> f139032b = new ArrayList<>();

    private e() {
    }

    @l73.k(threadMode = ThreadMode.MAIN)
    public final void onActivityCommentReceived(d activityCommentEvent) {
        b next;
        int iHashCode;
        activityCommentEvent.getClass();
        Iterator<b> it = f139032b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getIdentifier().equals(activityCommentEvent.f137869a));
        b bVar = next;
        if (bVar != null) {
            bVar.F();
            return;
        }
        Context context = activityCommentEvent.f139024b;
        DateTime dateTime = activityCommentEvent.f139026d;
        if (dateTime == null) {
            dateTime = new DateTime(0L);
        }
        Intent intentPutExtra = ConversationActivity.a.b(ConversationActivity.f44530c, context, activityCommentEvent.f139025c, true, activityCommentEvent.f139027e, dateTime.compareTo((ReadableInstant) DateTime.now().minusDays(90)) < 0, 32).putExtra("GCM_isFromAndroidNotification", true);
        intentPutExtra.getClass();
        String str = activityCommentEvent.f139025c;
        str.getClass();
        try {
            iHashCode = Long.parseLong(str) > 2147483647L ? str.hashCode() : Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            iHashCode = 121212;
        }
        Intent intent = new Intent(context, (Class<?>) LikeOnCommentService.class);
        intent.putExtra("GCM_conversation_comment_id", activityCommentEvent.f139027e);
        intent.putExtra("extra.notification.id", iHashCode);
        h.a(context, iHashCode, activityCommentEvent.f139029g, activityCommentEvent.f139028f, activityCommentEvent.f139030h, intentPutExtra, w.c(new z6.k(0, context.getString(R.string.lbl_like), PendingIntent.getService(context, iHashCode, intent, 201326592))));
    }
}
