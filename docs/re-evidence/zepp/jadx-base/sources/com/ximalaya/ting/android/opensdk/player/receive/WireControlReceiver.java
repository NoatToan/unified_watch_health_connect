package com.ximalaya.ting.android.opensdk.player.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.Logger;

/* JADX INFO: loaded from: classes22.dex */
public class WireControlReceiver extends BroadcastReceiver {
    public static final int DELAY_MILLIS = 600;
    private static final String TAG = WireControlReceiver.class.getSimpleName();
    private static int lastLongRepeatCount = 0;
    private static Handler clickHandler = new Handler(Looper.getMainLooper());
    private static int playOrPauseClickCount = 0;
    private static int nextClickCount = 0;
    private static int preClickCount = 0;
    public static boolean willAbortBroadcast = true;
    public static Runnable playOrPauseRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.1
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.playOrPauseClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                if (playerSrvice.isPlaying()) {
                    playerSrvice.pausePlay();
                } else {
                    playerSrvice.startPlay();
                }
            }
        }
    };
    public static Runnable playOrPauseDoubleClickRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.2
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.playOrPauseClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.playNext();
            }
        }
    };
    public static Runnable playNextRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.3
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.nextClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.playNext();
            }
        }
    };
    public static Runnable playPreRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.4
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.preClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.playPre();
            }
        }
    };
    public static Runnable doubleNextRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.5
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.nextClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.seekTo(playerSrvice.getPlayCurrPosition() + 15000);
            }
        }
    };
    public static Runnable doublePreRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver.6
        @Override // java.lang.Runnable
        public void run() {
            int unused = WireControlReceiver.preClickCount = 0;
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.seekTo(playerSrvice.getPlayCurrPosition() - 15000);
            }
        }
    };

    private void seekOrNotif(boolean z, boolean z2) {
        int duration;
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || (duration = playerSrvice.getDuration()) <= 0) {
            return;
        }
        int playCurrPosition = playerSrvice.getPlayCurrPosition() + ((int) ((((lastLongRepeatCount * duration) * 1.0f) / 100.0f) * (z ? 1 : -1)));
        if (playCurrPosition > duration) {
            playCurrPosition = duration;
        }
        if (z2) {
            playerSrvice.notifProgress(playCurrPosition, duration);
        } else {
            playerSrvice.seekTo(playCurrPosition);
            lastLongRepeatCount = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:0x0194  */
    /* JADX WARN: Code duplicated, block: B:56:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x019e  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0167, please report this as an issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        int i;
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        if (keyEvent.getRepeatCount() > 0) {
            lastLongRepeatCount = keyEvent.getRepeatCount();
        }
        if (!(keyEvent.getAction() == 1)) {
            Logger.logToSd("WireControlReceiver  0  " + keyEvent + "   " + lastLongRepeatCount);
            if (keyEvent.getKeyCode() == 87) {
                if (lastLongRepeatCount > 0) {
                    seekOrNotif(true, true);
                    return;
                }
                return;
            } else {
                if (keyEvent.getKeyCode() != 88 || lastLongRepeatCount <= 0) {
                    return;
                }
                seekOrNotif(false, true);
                return;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79) {
            playOrPauseClickCount++;
            Logger.logToSd("WireControlReceiver  3  == " + playOrPauseClickCount);
            clickHandler.removeCallbacks(playOrPauseRunnable);
            clickHandler.removeCallbacks(playOrPauseDoubleClickRunnable);
            i = playOrPauseClickCount;
            if (i == 1) {
                clickHandler.postDelayed(playOrPauseRunnable, 600L);
            } else if (i != 2) {
                clickHandler.postDelayed(playOrPauseDoubleClickRunnable, 400L);
            } else {
                playOrPauseClickCount = 0;
                playerSrvice.playPre();
            }
        } else if (keyCode == 126) {
            Logger.logToSd("WireControlReceiver  2");
            playerSrvice.startPlay();
        } else if (keyCode != 127) {
            switch (keyCode) {
                case 85:
                    playOrPauseClickCount++;
                    Logger.logToSd("WireControlReceiver  3  == " + playOrPauseClickCount);
                    clickHandler.removeCallbacks(playOrPauseRunnable);
                    clickHandler.removeCallbacks(playOrPauseDoubleClickRunnable);
                    i = playOrPauseClickCount;
                    if (i == 1) {
                        clickHandler.postDelayed(playOrPauseRunnable, 600L);
                    } else if (i != 2) {
                        playOrPauseClickCount = 0;
                        playerSrvice.playPre();
                    } else {
                        clickHandler.postDelayed(playOrPauseDoubleClickRunnable, 400L);
                    }
                    break;
                case 86:
                    Logger.logToSd("WireControlReceiver  1");
                    playerSrvice.pausePlay();
                    break;
                case 87:
                    Logger.logToSd("WireControlReceiver  4  " + lastLongRepeatCount);
                    if (lastLongRepeatCount <= 0) {
                        nextClickCount++;
                        Logger.logToSd("WireControlReceiver  5  " + nextClickCount);
                        if (nextClickCount < 2) {
                            clickHandler.removeCallbacks(playNextRunnable);
                            clickHandler.postDelayed(playNextRunnable, 600L);
                        } else {
                            clickHandler.removeCallbacks(playNextRunnable);
                            clickHandler.removeCallbacks(doubleNextRunnable);
                            clickHandler.postDelayed(doubleNextRunnable, 600L);
                        }
                    } else {
                        seekOrNotif(true, false);
                    }
                    break;
                case 88:
                    Logger.logToSd("WireControlReceiver  6  " + lastLongRepeatCount);
                    if (lastLongRepeatCount <= 0) {
                        preClickCount++;
                        Logger.logToSd("WireControlReceiver  7  " + preClickCount);
                        if (preClickCount < 2) {
                            clickHandler.removeCallbacks(playPreRunnable);
                            clickHandler.postDelayed(playPreRunnable, 600L);
                        } else {
                            clickHandler.removeCallbacks(playPreRunnable);
                            clickHandler.removeCallbacks(doublePreRunnable);
                            clickHandler.postDelayed(doublePreRunnable, 600L);
                        }
                    } else {
                        seekOrNotif(false, false);
                    }
                    break;
            }
        } else {
            Logger.logToSd("WireControlReceiver  1");
            playerSrvice.pausePlay();
        }
        try {
            if (isOrderedBroadcast() && willAbortBroadcast) {
                abortBroadcast();
            }
        } catch (Exception unused) {
        }
    }
}
