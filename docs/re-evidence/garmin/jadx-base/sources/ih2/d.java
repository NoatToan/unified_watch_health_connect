package ih2;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.R;
import com.garmin.android.gncs.mms.GNCSMediaException;
import z6.a0;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f93519a = R.drawable.gcm3_notificationbar_icon_connect;

    public static final q a(Context context, String str, String str2) {
        q qVar = new q(context, "access_required");
        qVar.i(16, true);
        qVar.B = "recommendation";
        qVar.f202691m = 2;
        Notification notification = qVar.N;
        notification.icon = f93519a;
        qVar.f202683e = q.e(str);
        qVar.f202684f = q.e(str2);
        o oVar = new o();
        oVar.f202664e = q.e(str2);
        qVar.l(oVar);
        notification.vibrate = new long[]{500, 1000};
        return qVar;
    }

    @SuppressLint({"UseKtx"})
    public static final Bitmap b(GNCSListenerService gNCSListenerService, Icon icon) {
        b.b("MMS# SystemNotificationUtil.NotificationListenerService.getBitmapFromIcon ->  Getting Bitmap from ICON.");
        Drawable drawableLoadDrawable = icon.loadDrawable(gNCSListenerService);
        if (drawableLoadDrawable == null) {
            throw new GNCSMediaException("MMS# SystemNotificationUtil.NotificationListenerService.getBitmapFromIcon ->  Unable to get bitmap from icon", null, 2, null);
        }
        drawableLoadDrawable.setBounds(new Rect(0, 0, drawableLoadDrawable.getIntrinsicWidth(), drawableLoadDrawable.getIntrinsicHeight()));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableLoadDrawable.getIntrinsicWidth(), drawableLoadDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final void c(Context context) {
        int i14 = R.string.notification_access_required;
        String string = context.getString(i14);
        string.getClass();
        String string2 = context.getString(R.string.missing_sms_permission);
        string2.getClass();
        q qVarA = a(context, string, string2);
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null));
        data.getClass();
        qVarA.a(0, context.getString(R.string.open_settings), PendingIntent.getActivity(context, 0, data, 201326592));
        String string3 = context.getString(i14);
        string3.getClass();
        a0 a0VarA = a0.a(context);
        a0VarA.f202582b.createNotificationChannel(new NotificationChannel("access_required", string3, 4));
        a0VarA.c(99, qVarA.c());
    }
}
