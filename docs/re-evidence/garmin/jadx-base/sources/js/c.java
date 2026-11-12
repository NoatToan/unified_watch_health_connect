package js;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import g8.i;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljs/c;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f100592a = new c();

    private c() {
    }

    public static Intent a(Intent intent, Context context, String str) {
        Intent intent2 = new Intent("ACTIVITY_DETAILS_SHARE_APP_PICKED");
        intent2.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, intent2, 167772160);
        broadcast.getClass();
        Intent intentCreateChooser = Intent.createChooser(intent, str, broadcast.getIntentSender());
        if (i.w(context) == null) {
            intentCreateChooser.addFlags(268435456);
        }
        intentCreateChooser.getClass();
        return intentCreateChooser;
    }

    public static Intent b(Context context, String str, String str2, String str3, String str4) {
        context.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.putExtra("android.intent.extra.SUBJECT", str4);
        intent.putExtra("EXTRA_WEB_LINK", str2);
        intent.putExtra("Kdescription", str2);
        return a(intent, context, str);
    }
}
