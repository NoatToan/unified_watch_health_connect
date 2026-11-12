package com.ximalaya.ting.android.opensdk.player.appwidget;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseAppWidgetProvider extends AppWidgetProvider {
    public abstract void onInitUI(Context context, Track track);

    public abstract void onPausePlay(Context context);

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PlayableModel playableModel;
        Track track;
        super.onReceive(context, intent);
        if (intent == null) {
            return;
        }
        if (intent.getAction().equals(ConstantsOpenSdk.PAUSE_PLAYER_ACTION)) {
            onPausePlay(context);
            return;
        }
        if (intent.getAction().equals(ConstantsOpenSdk.START_PLAYER_ACTION)) {
            onStartPlay(context);
            return;
        }
        if (intent.getAction().equals(ConstantsOpenSdk.STATE_COMPLETE_ACTION)) {
            onPausePlay(context);
            return;
        }
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            String string = SharedPreferencesUtil.getInstance(context).getString("lasttrack");
            if (string != null) {
                Track track2 = null;
                try {
                    track2 = (Track) new Gson().fromJson(string, Track.class);
                } catch (Exception unused) {
                }
                if (track2 == null) {
                    return;
                }
                onInitUI(context, track2);
                return;
            }
            return;
        }
        if (intent.getAction().equals(ConstantsOpenSdk.UI_INIT_ACTION)) {
            Bundle extras = intent.getExtras();
            if (extras == null || (track = (Track) extras.get("track")) == null) {
                return;
            }
            onInitUI(context, track);
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_PRE_MAIN)) {
            PlayableModel playableModel2 = XmPlayerService.getPlayerSrvice().getPlayableModel();
            if (playableModel2 != null) {
                onInitUI(context, (Track) playableModel2);
                return;
            }
            return;
        }
        if (!intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_NEXT_MAIN) || (playableModel = XmPlayerService.getPlayerSrvice().getPlayableModel()) == null) {
            return;
        }
        onInitUI(context, (Track) playableModel);
    }

    public abstract void onStartPlay(Context context);
}
