package com.ximalaya.ting.android.opensdk.player.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.player.appnotification.XmNotificationCreater;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayListControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.Logger;

/* JADX INFO: loaded from: classes22.dex */
public class PlayerReceiver extends BroadcastReceiver {
    private static final String BYD_PACKAGE_NAME = "com.ximalaya.ting.android.car";
    private static final String TAG = "PLAYERRECEIVER";
    private int index = -1;
    private long mLastActionTimestamp;

    private void handleAction(Context context, Intent intent, XmPlayerService xmPlayerService, boolean z) {
        if (xmPlayerService == null) {
            return;
        }
        Logger.d(TAG, "handleAction " + intent.getAction());
        if (XmNotificationCreater.ACTION_CONTROL_CLOSE_MAIN.equals(intent.getAction()) || XmNotificationCreater.ACTION_CONTROL_CLOSE.equals(intent.getAction())) {
            Logger.log("process Main is running");
            xmPlayerService.closeNotification();
            xmPlayerService.closeApp();
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_PRE_MAIN)) {
            xmPlayerService.playPre();
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_NEXT_MAIN)) {
            xmPlayerService.playNext();
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_START_PAUSE_MAIN)) {
            if (xmPlayerService.isPlaying()) {
                xmPlayerService.pausePlay();
                return;
            }
            XmPlayerControl playControl = xmPlayerService.getPlayControl();
            XmPlayListControl playListControl = xmPlayerService.getPlayListControl();
            if (playControl == null || playListControl == null || playControl.getPlayerState() != 4) {
                xmPlayerService.startPlay(z);
                return;
            }
            int currIndex = playListControl.getCurrIndex();
            if (currIndex == -1) {
                currIndex = this.index;
            }
            if (currIndex == -1) {
                return;
            }
            xmPlayerService.play(currIndex);
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_NEXT)) {
            xmPlayerService.playNext();
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_PLAY_PRE)) {
            xmPlayerService.playPre();
            return;
        }
        if (intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_START_PAUSE)) {
            if (xmPlayerService.getPlayListSize() != 0 || !context.getApplicationInfo().packageName.equalsIgnoreCase(BYD_PACKAGE_NAME)) {
                if (xmPlayerService.isPlaying()) {
                    xmPlayerService.pausePlay();
                    return;
                } else {
                    xmPlayerService.startPlay(z);
                    return;
                }
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("tingcar://open"));
            intent2.addFlags(268435456);
            if (intent2.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction().equals(XmNotificationCreater.ACTION_CONTROL_RELEASE_SERVICE)) {
            XmPlayerManager.unBind();
            return;
        }
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if ((playerSrvice == null && XmNotificationCreater.ACTION_CONTROL_CLOSE_MAIN.equals(intent.getAction())) || playerSrvice == null) {
            return;
        }
        handleAction(context, intent, XmPlayerService.getPlayerSrvice(), false);
    }
}
