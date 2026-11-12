package com.ximalaya.ting.android.opensdk.player.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater;
import com.ximalaya.ting.android.opensdk.player.receive.PlayerReceiver;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.FileUtilBase;

/* JADX INFO: loaded from: classes22.dex */
public class WidgetProvider extends BaseAppWidgetProvider {
    /* JADX INFO: Access modifiers changed from: private */
    public void commitUpdate(Context context, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        ComponentName componentName = new ComponentName(context, getClass());
        if (appWidgetManager == null || remoteViews == null) {
            return;
        }
        appWidgetManager.updateAppWidget(componentName, remoteViews);
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void setDataToView(Context context, Track track, RemoteViews remoteViews) {
        if (track == null || context == null || remoteViews == null) {
            return;
        }
        try {
            if (XmPlayerService.getPlayerSrvice() != null) {
                if (XmPlayerService.getPlayerSrvice().isPlaying()) {
                    remoteViews.setImageViewResource(getResourceId(context, "appwidget_playOrPause", "id"), getResourceId(context, "host_reflect_widget_pause", "drawable"));
                } else {
                    remoteViews.setImageViewResource(getResourceId(context, "appwidget_playOrPause", "id"), getResourceId(context, "host_reflect_widget_play", "drawable"));
                }
            }
            String trackTitle = track.getTrackTitle();
            String nickname = track.getAnnouncer() == null ? "" : track.getAnnouncer().getNickname();
            remoteViews.setTextViewText(getResourceId(context, "appwidget_title", "id"), trackTitle);
            remoteViews.setTextViewText(getResourceId(context, "appwidget_name", "id"), nickname);
            if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                updateRomoteBitmap(context, track, remoteViews);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateLayout(Context context) {
        PlayableModel playableModel;
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || (playableModel = playerSrvice.getPlayableModel()) == null) {
            return;
        }
        updateWedgitUI(context, (Track) playableModel);
    }

    private void updateRomoteBitmap(final Context context, Track track, final RemoteViews remoteViews) {
        int iDp2px = dp2px(context, 55.0f);
        if (!checkAndroidVersion()) {
            iDp2px = dp2px(context, 30.0f);
        }
        try {
            FileUtilBase.getBitmapByUrl(context, track, iDp2px, iDp2px, new FileUtilBase.IBitmapDownOkCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.appwidget.WidgetProvider.1
                @Override // com.ximalaya.ting.android.opensdk.util.FileUtilBase.IBitmapDownOkCallBack
                public void onSuccess(Bitmap bitmap) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        RemoteViews remoteViews2 = remoteViews;
                        if (remoteViews2 != null) {
                            remoteViews2.setInt(WidgetProvider.this.getResourceId(context, "appwidget_icon_small", "id"), "setImageResource", WidgetProvider.this.getResourceId(context, XmNotificationCreater.IMG_NOTIFYICON_DRAWABLE, "drawable"));
                        }
                    } else {
                        RemoteViews remoteViews3 = remoteViews;
                        if (remoteViews3 != null) {
                            remoteViews3.setImageViewBitmap(WidgetProvider.this.getResourceId(context, "appwidget_icon_small", "id"), bitmap);
                        }
                    }
                    RemoteViews remoteViews4 = remoteViews;
                    if (remoteViews4 != null) {
                        WidgetProvider.this.commitUpdate(context, remoteViews4);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateWedgitUI(Context context, Track track) {
        RemoteViews remoteViews = null;
        if (context != null) {
            try {
                remoteViews = new RemoteViews(context.getPackageName(), getResourceId(context, "host_reflect_appwidget_layout", "layout"));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (remoteViews == null || track == null) {
            return;
        }
        setDataToView(context, track, remoteViews);
        commitUpdate(context, remoteViews);
    }

    private void updateWidgetForWallPaperChanged(Context context) {
        try {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getResourceId(context, "host_reflect_appwidget_layout", "layout"));
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            String str = XmNotificationCreater.ACTION_CONTROL_START_PAUSE;
            if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                str = XmNotificationCreater.ACTION_CONTROL_START_PAUSE_MAIN;
            }
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
            intent.setAction(str);
            remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_playOrPause", "id"), PendingIntent.getBroadcast(context, 0, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH));
            if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
                intent2.setAction(XmNotificationCreater.ACTION_CONTROL_PLAY_PRE_MAIN);
                remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_pre", "id"), PendingIntent.getBroadcast(context, 0, intent2, AMapEngineUtils.HALF_MAX_P20_WIDTH));
                Intent intent3 = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
                intent3.setAction(XmNotificationCreater.ACTION_CONTROL_PLAY_NEXT_MAIN);
                remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_next", "id"), PendingIntent.getBroadcast(context, 0, intent3, AMapEngineUtils.HALF_MAX_P20_WIDTH));
            }
            Intent intent4 = new Intent("android.intent.action.VIEW");
            if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                intent4.setData(Uri.parse("itingwelcom://open"));
                remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_icon_small", "id"), PendingIntent.getActivity(context, 0, intent4, 0));
            } else {
                intent4.setData(Uri.parse("tingcar://open"));
                remoteViews.setOnClickPendingIntent(getResourceId(context, "ll_open_app", "id"), PendingIntent.getActivity(context, 0, intent4, 0));
            }
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            ComponentName componentName = new ComponentName(context, getClass());
            if (playerSrvice == null) {
                appWidgetManager.updateAppWidget(componentName, remoteViews);
                return;
            }
            PlayableModel playableModel = playerSrvice.getPlayableModel();
            if (playableModel instanceof Track) {
                setDataToView(context, (Track) playableModel, remoteViews);
            }
            appWidgetManager.updateAppWidget(componentName, remoteViews);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkAndroidVersion() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public int getResourceId(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override // com.ximalaya.ting.android.opensdk.player.appwidget.BaseAppWidgetProvider
    public void onInitUI(Context context, Track track) {
        updateWedgitUI(context, track);
    }

    @Override // com.ximalaya.ting.android.opensdk.player.appwidget.BaseAppWidgetProvider
    public void onPausePlay(Context context) {
        RemoteViews remoteViews = null;
        if (context != null) {
            try {
                remoteViews = new RemoteViews(context.getPackageName(), getResourceId(context, "host_reflect_appwidget_layout", "layout"));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (remoteViews != null) {
            remoteViews.setImageViewResource(getResourceId(context, "appwidget_playOrPause", "id"), getResourceId(context, "host_reflect_widget_play", "drawable"));
            commitUpdate(context, remoteViews);
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.appwidget.BaseAppWidgetProvider, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.w("WidgetProvider", "onReceive action " + intent.getAction());
        super.onReceive(context, intent);
        if ("android.intent.action.WALLPAPER_CHANGED".equals(intent.getAction())) {
            updateWidgetForWallPaperChanged(context);
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.appwidget.BaseAppWidgetProvider
    public void onStartPlay(Context context) {
        updateLayout(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        try {
            if (iArr.length > 0) {
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getResourceId(context, "host_reflect_appwidget_layout", "layout"));
                String str = XmNotificationCreater.ACTION_CONTROL_START_PAUSE;
                if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                    str = XmNotificationCreater.ACTION_CONTROL_START_PAUSE_MAIN;
                }
                Intent intent = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
                intent.setAction(str);
                remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_playOrPause", "id"), PendingIntent.getBroadcast(context, 0, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH));
                if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                    Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
                    intent2.setAction(XmNotificationCreater.ACTION_CONTROL_PLAY_PRE_MAIN);
                    remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_pre", "id"), PendingIntent.getBroadcast(context, 0, intent2, AMapEngineUtils.HALF_MAX_P20_WIDTH));
                    Intent intent3 = new Intent(context.getApplicationContext(), (Class<?>) PlayerReceiver.class);
                    intent3.setAction(XmNotificationCreater.ACTION_CONTROL_PLAY_NEXT_MAIN);
                    remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_next", "id"), PendingIntent.getBroadcast(context, 0, intent3, AMapEngineUtils.HALF_MAX_P20_WIDTH));
                }
                Intent intent4 = new Intent("android.intent.action.VIEW");
                if (context.getPackageName().equals("com.ximalaya.ting.android")) {
                    intent4.setData(Uri.parse("itingwelcom://open"));
                    remoteViews.setOnClickPendingIntent(getResourceId(context, "appwidget_icon_small", "id"), PendingIntent.getActivity(context, 0, intent4, 0));
                } else {
                    intent4.setData(Uri.parse("tingcar://open"));
                    remoteViews.setOnClickPendingIntent(getResourceId(context, "ll_open_app", "id"), PendingIntent.getActivity(context, 0, intent4, 0));
                }
                XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
                if (playerSrvice == null) {
                    appWidgetManager.updateAppWidget(iArr, remoteViews);
                    return;
                }
                PlayableModel playableModel = playerSrvice.getPlayableModel();
                if (playableModel instanceof Track) {
                    setDataToView(context, (Track) playableModel, remoteViews);
                }
                appWidgetManager.updateAppWidget(iArr, remoteViews);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
