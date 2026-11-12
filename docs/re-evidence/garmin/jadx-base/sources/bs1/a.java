package bs1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import sz0.e;
import sz0.f;
import z6.q;
import z6.t;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: bs1.a$a, reason: collision with other inner class name */
    public static class C0295a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19651c;
    }

    public static Intent a() {
        return new Intent("android.intent.action.VIEW", Uri.parse(GCMSettingManager.k().i().concat("/sas/gcapp/?productId=125677&contentId=oRFoANiwdW8hd9LSqjr8X8")));
    }

    public static void b(Context context, e eVar, Intent intent, String str, C0295a c0295a) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        t tVar = new t();
        tVar.f202742b = q.e(str);
        String str2 = c0295a.f19649a;
        ArrayList<CharSequence> arrayList = tVar.f202715e;
        if (str2 != null) {
            arrayList.add(q.e(str2));
        }
        String str3 = c0295a.f19650b;
        if (str3 != null) {
            arrayList.add(q.e(str3));
        }
        String str4 = c0295a.f19651c;
        if (str4 != null) {
            arrayList.add(q.e(str4));
        }
        String str5 = c0295a.f19649a + "\n" + c0295a.f19650b;
        String str6 = c0295a.f19649a + "\n" + c0295a.f19650b;
        q qVar = new q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = q.e(str);
        qVar.f202684f = q.e(str5);
        qVar.f202689k = q.e("");
        notification.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
        qVar.f202691m = 0;
        qVar.B = "recommendation";
        qVar.l(tVar);
        qVar.f202686h = activity;
        qVar.m(str6);
        f.a(context, qVar.c(), 7, eVar);
    }
}
