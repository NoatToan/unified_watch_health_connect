package ohos.ace.plugin.notificationmanager;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes46.dex */
public class NotificationTools {
    private static final String TAG = "NotificationTools";

    public enum ContentType {
        NONE(0),
        BASIC_TEXT(1),
        CONVERSATION(2),
        LONG_TEXT(3),
        MEDIA(4),
        MULTILINE(5),
        PICTURE(6),
        LOCAL_LIVE_VIEW(7),
        LIVE_VIEW(8);

        private int value;

        ContentType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Notification.Style getStyle(Context context, NotificationRequest.NotificationContent notificationContent) {
        if (context != null && notificationContent != null && notificationContent.content != null) {
            if (notificationContent.contentType == ContentType.LONG_TEXT.getValue()) {
                if (!(notificationContent.content instanceof NotificationRequest.NotificationLongTextContent)) {
                    return null;
                }
                NotificationRequest.NotificationLongTextContent notificationLongTextContent = (NotificationRequest.NotificationLongTextContent) notificationContent.content;
                Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
                bigTextStyle.bigText(notificationLongTextContent.longText);
                bigTextStyle.setSummaryText(notificationLongTextContent.briefText);
                bigTextStyle.setBigContentTitle(notificationLongTextContent.expandedTitle);
                return bigTextStyle;
            }
            if (notificationContent.contentType == ContentType.MULTILINE.getValue()) {
                if (!(notificationContent.content instanceof NotificationRequest.NotificationMultiLineContent)) {
                    return null;
                }
                NotificationRequest.NotificationMultiLineContent notificationMultiLineContent = (NotificationRequest.NotificationMultiLineContent) notificationContent.content;
                Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
                if (notificationMultiLineContent.allLines != null) {
                    for (int i = 0; i < notificationMultiLineContent.allLines.length; i++) {
                        inboxStyle.addLine(notificationMultiLineContent.allLines[i]);
                    }
                }
                inboxStyle.setSummaryText(notificationMultiLineContent.briefText);
                inboxStyle.setBigContentTitle(notificationMultiLineContent.expandedTitle);
                return inboxStyle;
            }
            if (notificationContent.contentType != ContentType.PICTURE.getValue() || !(notificationContent.content instanceof NotificationRequest.NotificationPictureContent)) {
                return null;
            }
            NotificationRequest.NotificationPictureContent notificationPictureContent = (NotificationRequest.NotificationPictureContent) notificationContent.content;
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setSummaryText(notificationPictureContent.briefText);
            bigPictureStyle.setBigContentTitle(notificationPictureContent.expandedTitle);
            bigPictureStyle.bigPicture(getBitmapFromFilePath(notificationPictureContent.picture));
            return bigPictureStyle;
        }
        return null;
    }

    public static Bitmap getBitmapFromFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BitmapFactory.decodeFile(str);
        } catch (OutOfMemoryError unused) {
            Log.e(TAG, "getBitmapFromFilePath except");
            return null;
        }
    }

    public static Icon getIconFromFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return getAppIcon(context);
        }
        return Icon.createWithBitmap(getBitmapFromFilePath(str));
    }

    private static Icon getAppIcon(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return Icon.createWithBitmap(drawableToBitmap(context.getPackageManager().getApplicationIcon(context.getPackageName())));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "getAppIcon error");
            return null;
        }
    }

    private static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String getFirstUpperStr(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 1) {
            return str;
        }
        String upperCase = str.substring(0, 1).toUpperCase();
        if (str.length() <= 1) {
            return upperCase;
        }
        return upperCase + str.substring(1);
    }
}
