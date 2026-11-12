package com.ximalaya.ting.android.opensdk.player.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.ximalaya.ting.android.opensdk.player.constants.PlayerConstants;
import com.ximalaya.ting.android.opensdk.util.Logger;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerAudioFocusControl {
    private AudioManager audioManager;
    private Context mContext;
    private boolean mIsStopAudioByFocus;
    private TelephonyManager telephonyManager;
    private TelephonyManager telephonyManager1;
    private TelephonyManager telephonyManager2;
    private boolean telPauseFlag = false;
    private boolean isContinuePlay = false;
    private PhoneStateListener mPhoneStateListener = new PhoneStateListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerAudioFocusControl.1
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (i == 0) {
                XmPlayerAudioFocusControl.this.callStateIdle();
            } else if (i == 1) {
                XmPlayerAudioFocusControl.this.callStateRinging();
            } else {
                if (i != 2) {
                    return;
                }
                XmPlayerAudioFocusControl.this.callStateRinging();
            }
        }
    };
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerAudioFocusControl.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(PlayerConstants.ACTION_NOTIFICATION_EXIT)) {
                return;
            }
            if (!action.equals("android.intent.action.HEADSET_PLUG") && !"android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                if (action.equals(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION) || action.equals(PlayerConstants.ACTION_NOTIFICATION_SWITCH_PLAY_PAUSE) || action.equals(PlayerConstants.ACTION_NOTIFICATION_PLAY_NEXT)) {
                    return;
                }
                action.equals(PlayerConstants.ACTION_NOTIFICATION_PLAY_PRE);
                return;
            }
            if (intent.getIntExtra("state", 0) == 1) {
                return;
            }
            if (XmPlayerAudioFocusControl.this.isContinuePlay) {
                new Timer().schedule(new TimerTask() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerAudioFocusControl.2.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        XmPlayerAudioFocusControl.this.isContinuePlay = false;
                    }
                }, 3000L);
                return;
            }
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice == null || !playerSrvice.isPlaying()) {
                return;
            }
            playerSrvice.pausePlay();
        }
    };
    private BroadcastReceiver mBroadcastReceiverPhoneCall = new BroadcastReceiver() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerAudioFocusControl.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.NEW_OUTGOING_CALL")) {
                XmPlayerAudioFocusControl.this.callStateRinging();
                return;
            }
            int callState = ((TelephonyManager) context.getSystemService("phone")).getCallState();
            if (callState == 0) {
                XmPlayerAudioFocusControl.this.callStateIdle();
            } else if (callState == 1) {
                XmPlayerAudioFocusControl.this.callStateRinging();
            } else {
                if (callState != 2) {
                    return;
                }
                XmPlayerAudioFocusControl.this.callStateRinging();
            }
        }
    };
    private AudioManager.OnAudioFocusChangeListener audioFoucusListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerAudioFocusControl.4
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Logger.log("XmPlayerAudioFocusControl : onAudioFocusChange = " + i);
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (i == -1) {
                if (XmPlayerAudioFocusControl.this.isContinuePlay) {
                    XmPlayerAudioFocusControl.this.isContinuePlay = false;
                    return;
                }
                if (playerSrvice != null) {
                    playerSrvice.setLossAudioFocus(true);
                    playerSrvice.pausePlay();
                }
                if (XmPlayerAudioFocusControl.this.audioManager != null) {
                    XmPlayerAudioFocusControl.this.audioManager.abandonAudioFocus(XmPlayerAudioFocusControl.this.audioFoucusListener);
                    return;
                }
                return;
            }
            if (i == -2) {
                if (playerSrvice != null) {
                    if (playerSrvice.isPlaying()) {
                        playerSrvice.pausePlay();
                        XmPlayerAudioFocusControl.this.mIsStopAudioByFocus = true;
                        return;
                    } else {
                        if (playerSrvice.getPlayControl() == null || playerSrvice.getPlayControl().getPlayerState() != 9) {
                            return;
                        }
                        playerSrvice.setLossAudioFocus(true);
                        XmPlayerAudioFocusControl.this.mIsStopAudioByFocus = true;
                        return;
                    }
                }
                return;
            }
            if (i == 2) {
                return;
            }
            if (i == 1) {
                if (playerSrvice != null) {
                    playerSrvice.setLossAudioFocus(false);
                    if (XmPlayerAudioFocusControl.this.mIsStopAudioByFocus) {
                        playerSrvice.startPlay();
                        XmPlayerAudioFocusControl.this.mIsStopAudioByFocus = false;
                    }
                    playerSrvice.setVolume(1.0f, 1.0f);
                    return;
                }
                return;
            }
            if (i == -3) {
                if (playerSrvice != null) {
                    playerSrvice.setVolume(XmPlayerConfig.getInstance(XmPlayerAudioFocusControl.this.mContext).getReceviceDuckVolume(), XmPlayerConfig.getInstance(XmPlayerAudioFocusControl.this.mContext).getReceviceDuckVolume());
                }
            } else {
                if (i != 3 || playerSrvice == null) {
                    return;
                }
                playerSrvice.setVolume(XmPlayerConfig.getInstance(XmPlayerAudioFocusControl.this.mContext).getReceviceDuckVolume(), XmPlayerConfig.getInstance(XmPlayerAudioFocusControl.this.mContext).getReceviceDuckVolume());
            }
        }
    };

    public XmPlayerAudioFocusControl(Context context) {
        this.mContext = context.getApplicationContext();
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callStateIdle() {
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice != null && this.telPauseFlag) {
            playerSrvice.startPlay();
        }
        this.telPauseFlag = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callStateRinging() {
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || !playerSrvice.isPlaying()) {
            return;
        }
        this.telPauseFlag = true;
        playerSrvice.pausePlay();
    }

    private void initListener() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.audioManager = (AudioManager) context.getSystemService("audio");
        if (XmPlayerConfig.getInstance(this.mContext).isSDKHandleHeadsetPlugAudioFocus()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter);
        }
        if (XmPlayerConfig.getInstance(this.mContext).isSDKHandlePhoneComeAudioFocus()) {
            initTelephonyManager();
            this.mContext.registerReceiver(this.mBroadcastReceiverPhoneCall, new IntentFilter());
        }
    }

    private void initTelephonyManager() {
        this.telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        boolean z = false;
        try {
            String[] strArr = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str.contains("READ_PHONE_STATE")) {
                        z = true;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z) {
            this.telephonyManager.listen(this.mPhoneStateListener, 32);
            try {
                TelephonyManager telephonyManager = (TelephonyManager) this.mContext.getSystemService("phone1");
                this.telephonyManager1 = telephonyManager;
                telephonyManager.listen(this.mPhoneStateListener, 32);
            } catch (Exception unused) {
            }
            try {
                TelephonyManager telephonyManager2 = (TelephonyManager) this.mContext.getSystemService("phone2");
                this.telephonyManager2 = telephonyManager2;
                telephonyManager2.listen(this.mPhoneStateListener, 32);
            } catch (Exception unused2) {
            }
        }
    }

    public AudioManager getAudioManager() {
        return this.audioManager;
    }

    public void needContinuePlay(boolean z) {
        this.isContinuePlay = z;
    }

    public void setAudioFocusAtStartState() {
        if (!XmPlayerConfig.getInstance(this.mContext).isSDKHandleAudioFocus() || XmPlayerConfig.isNoHandleAudioFocus()) {
            return;
        }
        try {
            this.audioManager.requestAudioFocus(this.audioFoucusListener, 3, 1);
            XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
            if (playerSrvice != null) {
                playerSrvice.setLossAudioFocus(false);
            }
        } catch (Exception unused) {
        }
    }

    public void setAudioFocusAtStopState() {
        if (XmPlayerConfig.getInstance(this.mContext).isSDKHandleAudioFocus()) {
            this.audioManager.abandonAudioFocus(this.audioFoucusListener);
        }
    }

    public void setAudioPauseManual(boolean z) {
        this.mIsStopAudioByFocus = !z;
    }
}
