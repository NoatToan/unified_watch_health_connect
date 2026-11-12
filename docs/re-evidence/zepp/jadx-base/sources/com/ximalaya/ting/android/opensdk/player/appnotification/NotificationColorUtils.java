package com.ximalaya.ting.android.opensdk.player.appnotification;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes22.dex */
public class NotificationColorUtils {
    private static final double COLOR_THRESHOLD = 180.0d;
    public static int COLOR_UNDEF = 987654321;
    public static String NOTIFICATION_CONTENT = "ximalaya_content";
    public static String NOTIFICATION_TITLE = "ximalaya_title";
    private static NotificationColorModel mNotificationColorModel;
    public static int NOTIFICATION_TITLE_COLOR = Color.parseColor("#de000000");
    public static int NOTIFICATION_LINE2_COLOR = Color.parseColor("#8a000000");
    public static int EVENTCONTENT_TITLE_COLOR = -1;
    public static int EVENTCONTENT_COLOR = Color.parseColor("#b3ffffff");
    private static TextView titleView = null;
    private static TextView contentView = null;
    public static boolean isTargerSDKVersion24More = false;

    public static class NotificationColorModel {
        private int contentColor;
        private boolean isDarkNotificationBg;
        private int titleColor;

        public NotificationColorModel() {
            int i = NotificationColorUtils.COLOR_UNDEF;
            this.titleColor = i;
            this.contentColor = i;
            this.isDarkNotificationBg = true;
        }

        public int getContentColor() {
            return this.contentColor;
        }

        public int getTitleColor() {
            return this.titleColor;
        }

        public boolean isDarkNotificationBg() {
            return this.isDarkNotificationBg;
        }

        public void setContentColor(int i) {
            this.contentColor = i;
        }

        public void setDarkNotificationBg(boolean z) {
            this.isDarkNotificationBg = z;
        }

        public void setTitleColor(int i) {
            this.titleColor = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNotificationColor(Context context) {
        int i = Build.VERSION.SDK_INT;
        int identifier = 0;
        if (i >= 24 && isTargerSDKVersion24More) {
            return 0;
        }
        if (i <= 15) {
            return COLOR_UNDEF;
        }
        try {
            identifier = context.getResources().getIdentifier(XmNotificationCreater.IMG_NOTIFYICON_DRAWABLE, "drawable", context.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Notification.Builder contentText = new Notification.Builder(context).setSmallIcon(identifier).setContentTitle(NOTIFICATION_TITLE).setContentText(NOTIFICATION_CONTENT);
        Notification notificationBuild = contentText.build();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        getTextView(Build.VERSION.SDK_INT >= 24 ? (ViewGroup) contentText.createContentView().apply(context, linearLayout) : (ViewGroup) notificationBuild.contentView.apply(context, linearLayout), NOTIFICATION_TITLE, NOTIFICATION_CONTENT);
        TextView textView = titleView;
        if (textView == null) {
            return COLOR_UNDEF;
        }
        int currentTextColor = textView.getCurrentTextColor();
        mNotificationColorModel.setTitleColor(currentTextColor);
        TextView textView2 = contentView;
        if (textView2 != null) {
            mNotificationColorModel.setContentColor(textView2.getCurrentTextColor());
        }
        return currentTextColor;
    }

    private static TextView getTextView(ViewGroup viewGroup, String str, String str2) {
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getText().equals(NOTIFICATION_TITLE)) {
                    titleView = textView;
                }
                if (textView.getText().equals(NOTIFICATION_CONTENT)) {
                    contentView = textView;
                }
            } else if (childAt instanceof ViewGroup) {
                getTextView((ViewGroup) childAt, str, str2);
            }
        }
        return null;
    }

    public static synchronized boolean isDarkNotificationBar(final Context context) {
        if (mNotificationColorModel == null) {
            mNotificationColorModel = new NotificationColorModel();
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            final CountDownLatch countDownLatch = z ? null : new CountDownLatch(1);
            Runnable runnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.appnotification.NotificationColorUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int notificationColor = NotificationColorUtils.getNotificationColor(context);
                        if (notificationColor == NotificationColorUtils.COLOR_UNDEF) {
                            NotificationColorUtils.mNotificationColorModel.setTitleColor(NotificationColorUtils.COLOR_UNDEF);
                            NotificationColorUtils.mNotificationColorModel.setContentColor(NotificationColorUtils.COLOR_UNDEF);
                            NotificationColorUtils.mNotificationColorModel.setDarkNotificationBg(true);
                        } else {
                            NotificationColorUtils.mNotificationColorModel.setDarkNotificationBg(!NotificationColorUtils.isTextColorSimilar(-16777216, notificationColor));
                        }
                    } catch (Exception unused) {
                        NotificationColorUtils.mNotificationColorModel.setTitleColor(NotificationColorUtils.COLOR_UNDEF);
                        NotificationColorUtils.mNotificationColorModel.setContentColor(NotificationColorUtils.COLOR_UNDEF);
                        NotificationColorUtils.mNotificationColorModel.setDarkNotificationBg(true);
                    }
                    if (NotificationColorUtils.mNotificationColorModel.getTitleColor() == NotificationColorUtils.COLOR_UNDEF && Build.VERSION.SDK_INT >= 21) {
                        if (NotificationColorUtils.mNotificationColorModel.isDarkNotificationBg()) {
                            NotificationColorUtils.mNotificationColorModel.setTitleColor(NotificationColorUtils.EVENTCONTENT_TITLE_COLOR);
                        } else {
                            NotificationColorUtils.mNotificationColorModel.setTitleColor(NotificationColorUtils.NOTIFICATION_TITLE_COLOR);
                        }
                    }
                    if (NotificationColorUtils.mNotificationColorModel.getContentColor() == NotificationColorUtils.COLOR_UNDEF && Build.VERSION.SDK_INT >= 21) {
                        if (NotificationColorUtils.mNotificationColorModel.isDarkNotificationBg()) {
                            NotificationColorUtils.mNotificationColorModel.setContentColor(NotificationColorUtils.EVENTCONTENT_COLOR);
                        } else {
                            NotificationColorUtils.mNotificationColorModel.setContentColor(NotificationColorUtils.NOTIFICATION_LINE2_COLOR);
                        }
                    }
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                }
            };
            if (z) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
                if (countDownLatch != null) {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return mNotificationColorModel.isDarkNotificationBg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTextColorSimilar(int i, int i2) {
        int i3 = i | (-16777216);
        int i4 = i2 | (-16777216);
        int iRed = Color.red(i3) - Color.red(i4);
        int iGreen = Color.green(i3) - Color.green(i4);
        int iBlue = Color.blue(i3) - Color.blue(i4);
        return Math.sqrt((double) (((iRed * iRed) + (iGreen * iGreen)) + (iBlue * iBlue))) < COLOR_THRESHOLD;
    }

    public static void setContentTextColor(Context context, RemoteViews remoteViews, int i) {
        if (mNotificationColorModel == null) {
            isDarkNotificationBar(context);
        }
        if (mNotificationColorModel.getContentColor() == COLOR_UNDEF && Build.VERSION.SDK_INT >= 21) {
            if (mNotificationColorModel.isDarkNotificationBg()) {
                mNotificationColorModel.setContentColor(EVENTCONTENT_COLOR);
            } else {
                mNotificationColorModel.setContentColor(NOTIFICATION_LINE2_COLOR);
            }
        }
        remoteViews.setTextColor(i, mNotificationColorModel.getContentColor());
    }

    public static void setTitleTextColor(Context context, RemoteViews remoteViews, int i) {
        if (mNotificationColorModel == null) {
            isDarkNotificationBar(context);
        }
        if (mNotificationColorModel.getTitleColor() == COLOR_UNDEF && Build.VERSION.SDK_INT >= 21) {
            if (mNotificationColorModel.isDarkNotificationBg()) {
                mNotificationColorModel.setTitleColor(EVENTCONTENT_TITLE_COLOR);
            } else {
                mNotificationColorModel.setTitleColor(NOTIFICATION_TITLE_COLOR);
            }
        }
        remoteViews.setTextColor(i, mNotificationColorModel.getTitleColor());
    }
}
