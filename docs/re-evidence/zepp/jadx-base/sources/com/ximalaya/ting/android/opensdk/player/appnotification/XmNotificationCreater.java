package com.ximalaya.ting.android.opensdk.player.appnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.receive.PlayerReceiver;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerConfig;
import com.ximalaya.ting.android.opensdk.util.FileUtilBase;
import com.ximalaya.ting.android.opensdk.util.Logger;

/* JADX INFO: loaded from: classes22.dex */
public class XmNotificationCreater {
    public static final String ACTION_CONTROL_CLOSE = "com.ximalaya.ting.android.ACTION_CLOSE";
    public static final String ACTION_CONTROL_CLOSE_MAIN = "com.ximalaya.ting.android.ACTION_CLOSE_MAIN";
    public static final String ACTION_CONTROL_PLAY_NEXT = "com.ximalaya.ting.android.ACTION_CONTROL_PLAY_NEXT";
    public static final String ACTION_CONTROL_PLAY_NEXT_MAIN = "com.ximalaya.ting.android.ACTION_CONTROL_PLAY_NEXT_MAIN";
    public static final String ACTION_CONTROL_PLAY_PRE = "com.ximalaya.ting.android.ACTION_CONTROL_PLAY_PRE";
    public static final String ACTION_CONTROL_PLAY_PRE_MAIN = "com.ximalaya.ting.android.ACTION_CONTROL_PLAY_PRE_MAIN";
    public static final String ACTION_CONTROL_RELEASE_SERVICE = "com.ximalaya.ting.android.ACTION_CONTROL_RELEASE_SERVICE";
    public static final String ACTION_CONTROL_START_PAUSE = "com.ximalaya.ting.android.ACTION_CONTROL_START_PAUSE";
    public static final String ACTION_CONTROL_START_PAUSE_LIVE = "com.ximalaya.ting.android.ACTION_CONTROL_START_PAUSE_LIVE";
    public static final String ACTION_CONTROL_START_PAUSE_MAIN = "com.ximalaya.ting.android.ACTION_CONTROL_START_PAUSE_MAIN";
    public static final String CHANNEL_ID = "com.ximalaya.android.sdk";
    public static final String IMG_NOTIFYCLOSE = "img_notifyClose";
    public static final String IMG_NOTIFYICON = "img_notifyIcon";
    public static final String IMG_NOTIFYICON_DRAWABLE = "notification_default";
    public static final String IMG_NOTIFYICON_DRAWABLE_L = "notification_icon";
    public static final String IMG_NOTIFYICON_DRAWABLE_S = "ting";
    public static final String IMG_NOTIFYNEXT = "img_notifyNext";
    public static final String IMG_NOTIFYNEXT_DRAWABLE_DISABLE = "notify_btn_next_pressed";
    public static final String IMG_NOTIFYNEXT_DRAWABLE_DISABLE_LIGHT = "notify_btn_next_pressed";
    public static final String IMG_NOTIFYNEXT_DRAWABLE_NORMAL = "notify_btn_dark_next_normal_xml";
    public static final String IMG_NOTIFYNEXT_DRAWABLE_NORMAL_LIGHT = "notify_btn_light_next_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE = "img_notifyPlayOrPause";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PAUSE = "notify_btn_dark_play_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PAUSE_LIGHT = "notify_btn_light_play_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PLAY = "notify_btn_dark_pause_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PLAY_LIGHT = "notify_btn_light_pause_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PAUSE = "notify_btn_dark_play2_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PAUSE_LIGHT = "notify_btn_light_play2_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PLAY = "notify_btn_dark_pause2_normal_xml";
    public static final String IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PLAY_LIGHT = "notify_btn_light_pause2_normal_xml";
    public static final String IMG_NOTIFYPRE = "img_notifyPre";
    public static final String IMG_NOTIFYPRE_DRAWABLE_DISABLE = "notify_btn_prev_pressed";
    public static final String IMG_NOTIFYPRE_DRAWABLE_DISABLE_LIGHT = "notify_btn_prev_pressed";
    public static final String IMG_NOTIFYPRE_DRAWABLE_NORMAL = "notify_btn_dark_prev_normal_xml";
    public static final String IMG_NOTIFYPRE_DRAWABLE_NORMAL_LIGHT = "notify_btn_light_prev_normal_xml";
    public static final String NOTIFICATION_EXTRY_KEY = "notification_entry";
    public static final String NOTIFICATION__EXTYR_DATA = "com.ximalaya.ting.android.EXTRY_NOTIFICATION_TO_MAINACTIVITY";
    public static final String REMOTEVIEW_LAYOUT = "view_notify_play";
    public static final String REMOTEVIEW_LAYOUT_BIG = "view_notify_play_big";
    public static final String TXT_NOTIFYMUSICNAME = "txt_notifyMusicName";
    public static final String TXT_NOTIFYNICKNAME = "txt_notifyNickName";
    public static final String VIEW_NOTIFY_DARK_PLAY = "view_notify_dark_play";
    public static final String VIEW_NOTIFY_DARK_PLAY_BIG = "view_notify_dark_play_big";
    private static XmNotificationCreater instanse;
    private RemoteViews bigRemoteView;
    private PendingIntent closeIntent;
    private RemoteViews mBigRemoteView;
    private Context mContext;
    private RemoteViews mRemoteView;
    private PendingIntent nextIntent;
    private String packageName;
    private PendingIntent preIntent;
    private RemoteViews remoteView;
    private Resources res;
    private PendingIntent startOrPauseIntent;
    private int version = Build.VERSION.SDK_INT;
    private RemoteViewDetailModel mRemoteViewDetailModel = new RemoteViewDetailModel();

    public class RemoteViewDetailModel {
        public boolean isDark;
        public boolean isDisableNextBtn;
        public boolean isDisablePreBtn;
        public boolean isPause;
        public String nickName;
        public Bitmap trackCoverBitmap;
        public String trackDetail;

        private RemoteViewDetailModel() {
        }
    }

    private XmNotificationCreater(Context context) {
        this.packageName = "";
        this.mContext = context;
        this.res = context.getResources();
        this.packageName = this.mContext.getPackageName();
    }

    private void chanageTextColor(boolean z, RemoteViews remoteViews, RemoteViews remoteViews2) {
        if (remoteViews != null) {
            NotificationColorUtils.setTitleTextColor(this.mContext, remoteViews, getResourceId(TXT_NOTIFYMUSICNAME, "id"));
            NotificationColorUtils.setContentTextColor(this.mContext, remoteViews, getResourceId(TXT_NOTIFYNICKNAME, "id"));
        }
        NotificationColorUtils.setTitleTextColor(this.mContext, remoteViews2, getResourceId(TXT_NOTIFYMUSICNAME, "id"));
        NotificationColorUtils.setContentTextColor(this.mContext, remoteViews2, getResourceId(TXT_NOTIFYNICKNAME, "id"));
    }

    private boolean checkAndroidVersion() {
        return this.version >= 16;
    }

    @Nullable
    private RemoteViews createBigRemoteViews(Context context, boolean z) {
        if (!checkAndroidVersion()) {
            return null;
        }
        RemoteViews remoteViews = z ? new RemoteViews(context.getPackageName(), getResourceId(VIEW_NOTIFY_DARK_PLAY_BIG, "layout")) : new RemoteViews(context.getPackageName(), getResourceId(REMOTEVIEW_LAYOUT_BIG, "layout"));
        if (this.preIntent == null) {
            setPrePendingIntent(null);
        }
        if (this.preIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYPRE, "id"), this.preIntent);
        }
        if (this.closeIntent == null) {
            setClosePendingIntent(null);
        }
        if (this.closeIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYCLOSE, "id"), this.closeIntent);
        }
        if (this.startOrPauseIntent == null) {
            setStartOrPausePendingIntent(null);
        }
        if (this.startOrPauseIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), this.startOrPauseIntent);
        }
        if (this.nextIntent == null) {
            setNextPendingIntent(null);
        }
        if (this.nextIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYNEXT, "id"), this.nextIntent);
        }
        return remoteViews;
    }

    private RemoteViews createBigRemoteViewsForLive(Context context, PendingIntent pendingIntent, boolean z) {
        if (!checkAndroidVersion()) {
            return null;
        }
        RemoteViews remoteViews = z ? new RemoteViews(context.getPackageName(), getResourceId(VIEW_NOTIFY_DARK_PLAY_BIG, "layout")) : new RemoteViews(context.getPackageName(), getResourceId(REMOTEVIEW_LAYOUT_BIG, "layout"));
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), pendingIntent);
        }
        return remoteViews;
    }

    private RemoteViews createRemoteViews(Context context, boolean z) {
        RemoteViews remoteViews = z ? new RemoteViews(context.getPackageName(), getResourceId(VIEW_NOTIFY_DARK_PLAY, "layout")) : new RemoteViews(context.getPackageName(), getResourceId(REMOTEVIEW_LAYOUT, "layout"));
        if (this.startOrPauseIntent == null) {
            setStartOrPausePendingIntent(null);
        }
        if (this.startOrPauseIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), this.startOrPauseIntent);
        }
        if (this.nextIntent == null) {
            setNextPendingIntent(null);
        }
        if (this.nextIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYNEXT, "id"), this.nextIntent);
        }
        if (this.closeIntent == null) {
            setClosePendingIntent(null);
        }
        if (this.closeIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYCLOSE, "id"), this.closeIntent);
        }
        return remoteViews;
    }

    private RemoteViews createRemoteViewsForLive(Context context, PendingIntent pendingIntent, boolean z) {
        RemoteViews remoteViews = z ? new RemoteViews(context.getPackageName(), getResourceId(VIEW_NOTIFY_DARK_PLAY, "layout")) : new RemoteViews(context.getPackageName(), getResourceId(REMOTEVIEW_LAYOUT, "layout"));
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), pendingIntent);
        }
        return remoteViews;
    }

    private void disableNextBtn(boolean z, boolean z2) {
        int resourceId;
        int resourceId2;
        if (checkAndroidVersion() && this.remoteView != null) {
            if (z) {
                resourceId2 = z2 ? getResourceId("notify_btn_next_pressed", "drawable") : getResourceId("notify_btn_next_pressed", "drawable");
            } else {
                resourceId2 = z2 ? getResourceId(IMG_NOTIFYNEXT_DRAWABLE_NORMAL_LIGHT, "drawable") : getResourceId(IMG_NOTIFYNEXT_DRAWABLE_NORMAL, "drawable");
            }
            try {
                this.remoteView.setImageViewResource(getResourceId(IMG_NOTIFYNEXT, "id"), resourceId2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!checkAndroidVersion() || this.bigRemoteView == null) {
            return;
        }
        if (z) {
            resourceId = z2 ? getResourceId("notify_btn_next_pressed", "drawable") : getResourceId("notify_btn_next_pressed", "drawable");
        } else {
            resourceId = z2 ? getResourceId(IMG_NOTIFYNEXT_DRAWABLE_NORMAL_LIGHT, "drawable") : getResourceId(IMG_NOTIFYNEXT_DRAWABLE_NORMAL, "drawable");
        }
        this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYNEXT, "id"), resourceId);
    }

    private void disablePreBtn(boolean z, boolean z2) {
        int resourceId;
        if (!checkAndroidVersion() || this.bigRemoteView == null) {
            return;
        }
        if (z) {
            resourceId = z2 ? getResourceId("notify_btn_prev_pressed", "drawable") : getResourceId("notify_btn_prev_pressed", "drawable");
        } else {
            resourceId = z2 ? getResourceId(IMG_NOTIFYPRE_DRAWABLE_NORMAL_LIGHT, "drawable") : getResourceId(IMG_NOTIFYPRE_DRAWABLE_NORMAL, "drawable");
        }
        try {
            this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYPRE, "id"), resourceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static XmNotificationCreater getInstanse(Context context) {
        if (instanse == null) {
            synchronized (XmNotificationCreater.class) {
                if (instanse == null) {
                    instanse = new XmNotificationCreater(context.getApplicationContext());
                }
            }
        }
        return instanse;
    }

    private int getResourceId(String str, String str2) {
        return this.res.getIdentifier(str, str2, this.mContext.getPackageName());
    }

    public static void release() {
        XmNotificationCreater xmNotificationCreater = instanse;
        if (xmNotificationCreater != null) {
            xmNotificationCreater.mRemoteView = null;
            xmNotificationCreater.mBigRemoteView = null;
            xmNotificationCreater.remoteView = null;
            xmNotificationCreater.bigRemoteView = null;
            instanse = null;
        }
    }

    public static NotificationCompat.Builder setSmallIcon(Context context, NotificationCompat.Builder builder) {
        return builder.setSmallIcon(context.getResources().getIdentifier(Build.VERSION.SDK_INT >= 21 ? IMG_NOTIFYICON_DRAWABLE_L : IMG_NOTIFYICON_DRAWABLE_S, "drawable", context.getPackageName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRemoteViewDetail(RemoteViewDetailModel remoteViewDetailModel, NotificationManager notificationManager, Notification notification, int i) {
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        RemoteViews remoteViews3;
        if (notificationManager == null || notification == null) {
            return;
        }
        if (TextUtils.isEmpty(remoteViewDetailModel.nickName)) {
            remoteViewDetailModel.nickName = XmPlayerConfig.getInstance(this.mContext).getDefaultNotificationNickName();
        }
        if (TextUtils.isEmpty(remoteViewDetailModel.trackDetail)) {
            remoteViewDetailModel.trackDetail = XmPlayerConfig.getInstance(this.mContext).getDefualtNotificationInfo();
        }
        chanageTextColor(remoteViewDetailModel.isDark, this.bigRemoteView, this.remoteView);
        if (checkAndroidVersion() && (remoteViews3 = this.bigRemoteView) != null) {
            remoteViews3.setTextViewText(getResourceId(TXT_NOTIFYMUSICNAME, "id"), remoteViewDetailModel.trackDetail);
            this.bigRemoteView.setTextViewText(getResourceId(TXT_NOTIFYNICKNAME, "id"), remoteViewDetailModel.nickName);
            if (remoteViewDetailModel.isDark) {
                if (remoteViewDetailModel.isPause) {
                    this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PAUSE_LIGHT, "drawable"));
                } else {
                    this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PLAY_LIGHT, "drawable"));
                }
            } else if (remoteViewDetailModel.isPause) {
                this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PAUSE, "drawable"));
            } else {
                this.bigRemoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_PLAY, "drawable"));
            }
        }
        this.remoteView.setTextViewText(getResourceId(TXT_NOTIFYMUSICNAME, "id"), remoteViewDetailModel.trackDetail);
        this.remoteView.setTextViewText(getResourceId(TXT_NOTIFYNICKNAME, "id"), remoteViewDetailModel.nickName);
        if (remoteViewDetailModel.isDark) {
            if (remoteViewDetailModel.isPause) {
                this.remoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PAUSE_LIGHT, "drawable"));
            } else {
                this.remoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PLAY_LIGHT, "drawable"));
            }
        } else if (remoteViewDetailModel.isPause) {
            this.remoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PAUSE, "drawable"));
        } else {
            this.remoteView.setImageViewResource(getResourceId(IMG_NOTIFYPLAYORPAUSE, "id"), getResourceId(IMG_NOTIFYPLAYORPAUSE_DRAWABLE_SMALL_PLAY, "drawable"));
        }
        disableNextBtn(remoteViewDetailModel.isDisableNextBtn, remoteViewDetailModel.isDark);
        disablePreBtn(remoteViewDetailModel.isDisablePreBtn, remoteViewDetailModel.isDark);
        Bitmap bitmap = remoteViewDetailModel.trackCoverBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            RemoteViews remoteViews4 = this.remoteView;
            if (remoteViews4 != null) {
                try {
                    remoteViews4.setInt(getResourceId(IMG_NOTIFYICON, "id"), "setImageResource", getResourceId(IMG_NOTIFYICON_DRAWABLE, "drawable"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (checkAndroidVersion() && (remoteViews = this.bigRemoteView) != null) {
                try {
                    remoteViews.setInt(getResourceId(IMG_NOTIFYICON, "id"), "setImageResource", getResourceId(IMG_NOTIFYICON_DRAWABLE, "drawable"));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            RemoteViews remoteViews5 = this.remoteView;
            if (remoteViews5 != null) {
                remoteViews5.setImageViewBitmap(getResourceId(IMG_NOTIFYICON, "id"), remoteViewDetailModel.trackCoverBitmap);
            }
            if (checkAndroidVersion() && (remoteViews2 = this.bigRemoteView) != null) {
                remoteViews2.setImageViewBitmap(getResourceId(IMG_NOTIFYICON, "id"), remoteViewDetailModel.trackCoverBitmap);
            }
        }
        try {
            notificationManager.notify(i, notification);
        } catch (Throwable unused) {
        }
    }

    public <T> Notification createNotification(Context context, Class<T> cls) {
        boolean zIsDarkNotificationBar = NotificationColorUtils.isDarkNotificationBar(context);
        this.mBigRemoteView = createBigRemoteViews(context, zIsDarkNotificationBar);
        RemoteViews remoteViewsCreateRemoteViews = createRemoteViews(context, zIsDarkNotificationBar);
        this.mRemoteView = remoteViewsCreateRemoteViews;
        chanageTextColor(zIsDarkNotificationBar, this.mBigRemoteView, remoteViewsCreateRemoteViews);
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = i >= 26 ? new Notification.Builder(context, CHANNEL_ID) : new Notification.Builder(context);
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra(NOTIFICATION_EXTRY_KEY, NOTIFICATION__EXTYR_DATA);
        builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH)).setContentTitle(XmPlayerConfig.getInstance(context).getDefaultNotificationNickName()).setContentText(XmPlayerConfig.getInstance(context).getDefualtNotificationInfo()).setOngoing(true).setSmallIcon(getResourceId(i >= 21 ? IMG_NOTIFYICON_DRAWABLE_L : IMG_NOTIFYICON_DRAWABLE_S, "drawable"));
        if (i >= 16) {
            builder.setPriority(2);
        }
        if (i >= 24) {
            builder.setCustomContentView(this.mRemoteView);
            builder.setCustomBigContentView(this.mBigRemoteView);
        }
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("player");
        }
        Notification notificationBuild = i >= 16 ? builder.build() : builder.getNotification();
        if (i < 24) {
            notificationBuild.contentView = this.mRemoteView;
            if (i >= 16) {
                notificationBuild.bigContentView = this.mBigRemoteView;
            }
        }
        return notificationBuild;
    }

    public <T> Notification initNotification(Context context, Class<T> cls) {
        setNextPendingIntent(null);
        setPrePendingIntent(null);
        setStartOrPausePendingIntent(null);
        setClosePendingIntent(null);
        return createNotification(context, cls);
    }

    public void setClosePendingIntent(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.closeIntent = pendingIntent;
            return;
        }
        Intent intent = new Intent(this.packageName.equals("com.ximalaya.ting.android") ? ACTION_CONTROL_CLOSE_MAIN : ACTION_CONTROL_CLOSE);
        intent.setClass(this.mContext, PlayerReceiver.class);
        this.closeIntent = PendingIntent.getBroadcast(this.mContext, 0, intent, 0);
    }

    public void setNextPendingIntent(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.nextIntent = pendingIntent;
            return;
        }
        Intent intent = new Intent(this.packageName.equals("com.ximalaya.ting.android") ? ACTION_CONTROL_PLAY_NEXT_MAIN : ACTION_CONTROL_PLAY_NEXT);
        intent.setClass(this.mContext, PlayerReceiver.class);
        this.nextIntent = PendingIntent.getBroadcast(this.mContext, 0, intent, 0);
    }

    public void setPrePendingIntent(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.preIntent = pendingIntent;
            return;
        }
        Intent intent = new Intent(this.packageName.equals("com.ximalaya.ting.android") ? ACTION_CONTROL_PLAY_PRE_MAIN : ACTION_CONTROL_PLAY_PRE);
        intent.setClass(this.mContext, PlayerReceiver.class);
        this.preIntent = PendingIntent.getBroadcast(this.mContext, 0, intent, 0);
    }

    public void setStartOrPausePendingIntent(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.startOrPauseIntent = pendingIntent;
            return;
        }
        Intent intent = new Intent(this.packageName.equals("com.ximalaya.ting.android") ? ACTION_CONTROL_START_PAUSE_MAIN : ACTION_CONTROL_START_PAUSE);
        intent.setClass(this.mContext, PlayerReceiver.class);
        this.startOrPauseIntent = PendingIntent.getBroadcast(this.mContext, 0, intent, 0);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    public void updateModelDetail(XmPlayListControl xmPlayListControl, final NotificationManager notificationManager, final Notification notification, final int i, boolean z) {
        String nickname;
        if (notification == null) {
            return;
        }
        this.bigRemoteView = createBigRemoteViews(this.mContext, z);
        if (checkAndroidVersion() && Build.VERSION.SDK_INT >= 16) {
            notification.bigContentView = this.bigRemoteView;
        }
        RemoteViews remoteViewsCreateRemoteViews = createRemoteViews(this.mContext, z);
        this.remoteView = remoteViewsCreateRemoteViews;
        notification.contentView = remoteViewsCreateRemoteViews;
        PlayableModel currentPlayableModel = xmPlayListControl.getCurrentPlayableModel();
        if (currentPlayableModel == null || this.remoteView == null || notificationManager == null) {
            this.mRemoteViewDetailModel.trackDetail = XmPlayerConfig.getInstance(this.mContext).getDefualtNotificationInfo();
            this.mRemoteViewDetailModel.nickName = XmPlayerConfig.getInstance(this.mContext).getDefaultNotificationNickName();
            RemoteViewDetailModel remoteViewDetailModel = this.mRemoteViewDetailModel;
            remoteViewDetailModel.isDark = z;
            remoteViewDetailModel.isPause = false;
            remoteViewDetailModel.trackCoverBitmap = null;
            remoteViewDetailModel.isDisableNextBtn = true;
            remoteViewDetailModel.isDisablePreBtn = true;
            updateRemoteViewDetail(remoteViewDetailModel, notificationManager, notification, i);
            return;
        }
        Track track = (Track) currentPlayableModel;
        String trackTitle = track.getTrackTitle();
        if (TextUtils.isEmpty(trackTitle)) {
            trackTitle = "";
        }
        if (PlayableModel.isTrackKind(currentPlayableModel.getKind()) || PlayableModel.KIND_LIVE_FLV.equals(currentPlayableModel.getKind())) {
            if (track.getAnnouncer() != null) {
                nickname = track.getAnnouncer().getNickname();
            } else {
                nickname = null;
            }
        } else if ("radio".equals(currentPlayableModel.getKind())) {
            nickname = track.getTrackIntro();
        } else if (!"schedule".equals(currentPlayableModel.getKind()) || track.getAnnouncer() == null) {
            nickname = null;
        } else {
            nickname = track.getAnnouncer().getNickname();
        }
        String str = TextUtils.isEmpty(nickname) ? "" : nickname;
        RemoteViewDetailModel remoteViewDetailModel2 = this.mRemoteViewDetailModel;
        remoteViewDetailModel2.trackDetail = trackTitle;
        remoteViewDetailModel2.nickName = str;
        remoteViewDetailModel2.isDark = z;
        remoteViewDetailModel2.isPause = false;
        remoteViewDetailModel2.trackCoverBitmap = null;
        if (xmPlayListControl.getPlayList() != null && xmPlayListControl.getPlayList().size() > 0) {
            int currIndex = xmPlayListControl.getCurrIndex();
            int size = xmPlayListControl.getPlayList().size();
            if (currentPlayableModel instanceof Track) {
                if (currIndex == 0) {
                    RemoteViewDetailModel remoteViewDetailModel3 = this.mRemoteViewDetailModel;
                    remoteViewDetailModel3.isDisablePreBtn = true;
                    if (size == 1) {
                        remoteViewDetailModel3.isDisableNextBtn = true;
                    } else {
                        remoteViewDetailModel3.isDisableNextBtn = false;
                    }
                } else if (currIndex == size - 1) {
                    RemoteViewDetailModel remoteViewDetailModel4 = this.mRemoteViewDetailModel;
                    remoteViewDetailModel4.isDisableNextBtn = true;
                    if (size >= 2) {
                        remoteViewDetailModel4.isDisablePreBtn = false;
                    } else {
                        remoteViewDetailModel4.isDisablePreBtn = true;
                    }
                } else {
                    RemoteViewDetailModel remoteViewDetailModel5 = this.mRemoteViewDetailModel;
                    remoteViewDetailModel5.isDisablePreBtn = false;
                    remoteViewDetailModel5.isDisableNextBtn = false;
                }
            }
        }
        updateRemoteViewDetail(this.mRemoteViewDetailModel, notificationManager, notification, i);
        int iDp2px = dp2px(this.mContext, 64.0f);
        if (checkAndroidVersion()) {
            iDp2px = dp2px(this.mContext, 110.0f);
        }
        FileUtilBase.getBitmapByUrl(this.mContext, track, iDp2px, iDp2px, new FileUtilBase.IBitmapDownOkCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater.2
            @Override // com.ximalaya.ting.android.opensdk.util.FileUtilBase.IBitmapDownOkCallBack
            public void onSuccess(Bitmap bitmap) {
                XmNotificationCreater.this.mRemoteViewDetailModel.trackCoverBitmap = bitmap;
                XmNotificationCreater xmNotificationCreater = XmNotificationCreater.this;
                xmNotificationCreater.updateRemoteViewDetail(xmNotificationCreater.mRemoteViewDetailModel, notificationManager, notification, i);
            }
        });
    }

    public void updateViewStateAtPause(NotificationManager notificationManager, Notification notification, int i, boolean z) {
        if (notification == null) {
            return;
        }
        RemoteViews remoteViewsCreateBigRemoteViews = createBigRemoteViews(this.mContext, z);
        this.bigRemoteView = remoteViewsCreateBigRemoteViews;
        if (Build.VERSION.SDK_INT >= 16) {
            notification.bigContentView = remoteViewsCreateBigRemoteViews;
        }
        RemoteViews remoteViewsCreateRemoteViews = createRemoteViews(this.mContext, z);
        this.remoteView = remoteViewsCreateRemoteViews;
        notification.contentView = remoteViewsCreateRemoteViews;
        RemoteViewDetailModel remoteViewDetailModel = this.mRemoteViewDetailModel;
        remoteViewDetailModel.isDark = z;
        remoteViewDetailModel.isPause = true;
        try {
            updateRemoteViewDetail(remoteViewDetailModel, notificationManager, notification, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateViewStateAtPauseForLive(NotificationManager notificationManager, Notification notification, int i, PendingIntent pendingIntent, boolean z) {
        if (notification == null) {
            return;
        }
        RemoteViews remoteViewsCreateBigRemoteViewsForLive = createBigRemoteViewsForLive(this.mContext, pendingIntent, z);
        this.bigRemoteView = remoteViewsCreateBigRemoteViewsForLive;
        if (Build.VERSION.SDK_INT >= 16) {
            notification.bigContentView = remoteViewsCreateBigRemoteViewsForLive;
        }
        RemoteViews remoteViewsCreateRemoteViewsForLive = createRemoteViewsForLive(this.mContext, pendingIntent, z);
        this.remoteView = remoteViewsCreateRemoteViewsForLive;
        notification.contentView = remoteViewsCreateRemoteViewsForLive;
        RemoteViewDetailModel remoteViewDetailModel = this.mRemoteViewDetailModel;
        remoteViewDetailModel.isDark = z;
        remoteViewDetailModel.isPause = true;
        remoteViewDetailModel.isDisablePreBtn = true;
        remoteViewDetailModel.isDisableNextBtn = true;
        updateRemoteViewDetail(remoteViewDetailModel, notificationManager, notification, i);
    }

    public void updateViewStateAtStart(NotificationManager notificationManager, Notification notification, int i, boolean z) {
        if (notification == null) {
            return;
        }
        RemoteViews remoteViewsCreateBigRemoteViews = createBigRemoteViews(this.mContext, z);
        this.bigRemoteView = remoteViewsCreateBigRemoteViews;
        if (Build.VERSION.SDK_INT >= 16) {
            notification.bigContentView = remoteViewsCreateBigRemoteViews;
        }
        RemoteViews remoteViewsCreateRemoteViews = createRemoteViews(this.mContext, z);
        this.remoteView = remoteViewsCreateRemoteViews;
        notification.contentView = remoteViewsCreateRemoteViews;
        RemoteViewDetailModel remoteViewDetailModel = this.mRemoteViewDetailModel;
        remoteViewDetailModel.isDark = z;
        remoteViewDetailModel.isPause = false;
        updateRemoteViewDetail(remoteViewDetailModel, notificationManager, notification, i);
    }

    public void updateViewStateAtStartForLive(long j, String str, String str2, String str3, final NotificationManager notificationManager, final Notification notification, final int i, PendingIntent pendingIntent, boolean z) {
        if (notification == null) {
            return;
        }
        Log.i("LiveAudio", "LiveplayerManager init id:" + i + " false coverUrl" + str);
        this.bigRemoteView = createBigRemoteViewsForLive(this.mContext, pendingIntent, z);
        if (checkAndroidVersion() && Build.VERSION.SDK_INT >= 16) {
            notification.bigContentView = this.bigRemoteView;
        }
        RemoteViews remoteViewsCreateRemoteViewsForLive = createRemoteViewsForLive(this.mContext, pendingIntent, z);
        this.remoteView = remoteViewsCreateRemoteViewsForLive;
        notification.contentView = remoteViewsCreateRemoteViewsForLive;
        if (str == null || "".equals(str) || this.remoteView == null || notificationManager == null) {
            this.mRemoteViewDetailModel.trackDetail = XmPlayerConfig.getInstance(this.mContext).getDefualtNotificationInfo();
            this.mRemoteViewDetailModel.nickName = XmPlayerConfig.getInstance(this.mContext).getDefaultNotificationNickName();
            RemoteViewDetailModel remoteViewDetailModel = this.mRemoteViewDetailModel;
            remoteViewDetailModel.isDark = z;
            remoteViewDetailModel.isPause = false;
            remoteViewDetailModel.trackCoverBitmap = null;
            remoteViewDetailModel.isDisableNextBtn = true;
            remoteViewDetailModel.isDisablePreBtn = true;
            updateRemoteViewDetail(remoteViewDetailModel, notificationManager, notification, i);
            return;
        }
        int iDp2px = dp2px(this.mContext, 64.0f);
        if (checkAndroidVersion()) {
            iDp2px = dp2px(this.mContext, 110.0f);
        }
        Track track = new Track();
        track.setDataId(j);
        track.setCoverUrlLarge(str);
        track.setCoverUrlMiddle(str);
        track.setCoverUrlSmall(str);
        RemoteViewDetailModel remoteViewDetailModel2 = this.mRemoteViewDetailModel;
        remoteViewDetailModel2.isDark = z;
        remoteViewDetailModel2.isPause = false;
        remoteViewDetailModel2.trackCoverBitmap = null;
        remoteViewDetailModel2.isDisableNextBtn = true;
        remoteViewDetailModel2.isDisablePreBtn = true;
        remoteViewDetailModel2.nickName = str2;
        remoteViewDetailModel2.trackDetail = str3;
        updateRemoteViewDetail(remoteViewDetailModel2, notificationManager, notification, i);
        FileUtilBase.getBitmapByUrl(this.mContext, track, iDp2px, iDp2px, new FileUtilBase.IBitmapDownOkCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater.1
            @Override // com.ximalaya.ting.android.opensdk.util.FileUtilBase.IBitmapDownOkCallBack
            public void onSuccess(Bitmap bitmap) {
                Logger.log("getBitmapByUrl  onSuccess  " + bitmap);
                XmNotificationCreater.this.mRemoteViewDetailModel.trackCoverBitmap = bitmap;
                XmNotificationCreater xmNotificationCreater = XmNotificationCreater.this;
                xmNotificationCreater.updateRemoteViewDetail(xmNotificationCreater.mRemoteViewDetailModel, notificationManager, notification, i);
            }
        });
    }
}
