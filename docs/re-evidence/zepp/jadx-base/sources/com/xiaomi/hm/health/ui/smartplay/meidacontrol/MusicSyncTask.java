package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes22.dex */
public class MusicSyncTask {
    private static final String h = "MusicSyncTask";
    public static final long i = 500;
    private static final String j = "music_control";
    private AtomicBoolean b;
    private Handler c;
    private ConditionVariable d;
    private HMMediaInfo e;
    private HMMediaInfo f;
    private boolean a = false;
    private int g = 0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMMediaState.values().length];
            a = iArr;
            try {
                iArr[HMMediaState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMMediaState.BUFFERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMMediaState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMMediaState.DISABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMMediaState.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMMediaState.NOTIFICATION_DISABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements Runnable {
        private boolean a;

        public class a extends HMCallback {
            public final /* synthetic */ HMMediaInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean onUIThread, final HMMediaInfo val$syncInfo) {
                super(onUIThread);
                this.a = val$syncInfo;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.d(MusicSyncTask.h, "sendMusicControl: " + result, new Object[0]);
                if (result) {
                    try {
                        MusicSyncTask.this.f = (HMMediaInfo) this.a.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
                if (this.a.state == HMMediaState.DISABLE) {
                    MusicSyncTask.this.f = null;
                    MusicSyncTask.this.i();
                }
                MusicSyncTask.this.d.open();
            }
        }

        public b(boolean onlyVolume) {
            this.a = onlyVolume;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMMusicControl hMMusicControl;
            try {
                boolean andSet = MusicSyncTask.this.b.getAndSet(false);
                int iB = MediaUtil.b();
                if (!andSet && !MusicSyncTask.this.e.a(MusicSyncTask.this.f) && MusicSyncTask.this.g == iB) {
                    HMLog.i(MusicSyncTask.h, "mediaInfo no change.", new Object[0]);
                    return;
                }
                MusicSyncTask.this.g = iB;
                MusicSyncTask.this.d.close();
                HMMediaInfo hMMediaInfo = (HMMediaInfo) MusicSyncTask.this.e.clone();
                if (hMMediaInfo == null) {
                    return;
                }
                HMLog.i(MusicSyncTask.h, "syncInfo: " + hMMediaInfo, new Object[0]);
                HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
                if (hMMiLiProDevice != null && hMMiLiProDevice.isConnected()) {
                    switch (a.a[hMMediaInfo.state.ordinal()]) {
                        case 1:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PLAY);
                            break;
                        case 2:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                            break;
                        case 3:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                            break;
                        case 4:
                        case 5:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                            hMMusicControl.setException(HMMusicControl.AppException.NO_MUSIC);
                            break;
                        case 6:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                            hMMusicControl.setException(HMMusicControl.AppException.NO_PERMISSION);
                            break;
                        default:
                            hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                            hMMusicControl.setException(HMMusicControl.AppException.APP_KILL);
                            break;
                    }
                    hMMusicControl.setElapsedTime((int) (hMMediaInfo.position / 1000));
                    boolean z = (MusicSyncTask.this.f == null || !TextUtils.equals(MusicSyncTask.this.f.a, hMMediaInfo.a) || !TextUtils.equals(MusicSyncTask.this.f.b, hMMediaInfo.b) || !TextUtils.equals(MusicSyncTask.this.f.title, hMMediaInfo.title) || andSet || hMMusicControl.getException() == HMMusicControl.AppException.NO_MUSIC || hMMusicControl.getException() == HMMusicControl.AppException.NO_PERMISSION) ? false : true;
                    if (z) {
                        hMMusicControl.setException(HMMusicControl.AppException.UNKNOWN);
                    } else {
                        hMMusicControl.setArtist(hMMediaInfo.a);
                        hMMusicControl.setAlbum(hMMediaInfo.b);
                        hMMusicControl.setDuration((int) (hMMediaInfo.duration / 1000));
                        hMMusicControl.setTitle(hMMediaInfo.title);
                    }
                    hMMusicControl.setOnlyVolume(this.a);
                    HMLog.i(MusicSyncTask.h, "onlyVolume: " + this.a, new Object[0]);
                    HMLog.i(MusicSyncTask.h, "onlyStatus: " + z, new Object[0]);
                    HMLog.i(MusicSyncTask.h, "sendMusicControl exec, " + hMMediaInfo.title, new Object[0]);
                    if (HMDeviceConfig.hasFeatureMusicVolume()) {
                        hMMusicControl.setVolume(iB);
                    }
                    HMLog.i(MusicSyncTask.h, "control: " + hMMusicControl, new Object[0]);
                    hMMiLiProDevice.sendMusicControl(hMMusicControl, new a(false, hMMediaInfo));
                    MusicSyncTask.this.d.block();
                    return;
                }
                HMLog.d(MusicSyncTask.h, "device disable.", new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MusicSyncTask() {
        HandlerThread handlerThread = new HandlerThread(j);
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.d = new ConditionVariable(false);
        this.b = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.e = null;
        k();
    }

    public Handler getHandler() {
        return this.c;
    }

    public AtomicBoolean getStart() {
        return this.b;
    }

    public HMMediaInfo j() {
        return this.e;
    }

    public void k() {
        if (this.e == null) {
            this.e = new HMMediaInfo();
        }
    }

    public void l(HMMediaInfo mediaInfo) {
        this.e = mediaInfo;
    }

    public void setControl(boolean control) {
        this.a = control;
    }

    public void syncMediaInfo2Device() {
        syncMediaInfo2Device(false);
    }

    public void syncMediaInfo2Device(boolean onlyVolume) {
        if (MediaUtil.shouldInitMusic()) {
            if (this.e == null) {
                HMLog.i(h, "mediaInfo null.", new Object[0]);
                return;
            }
            if (!this.a) {
                HMLog.i(h, "sync no need.", new Object[0]);
                return;
            }
            if (!HMDeviceConfig.supportMusicControl(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
                HMLog.i(h, "device not support.", new Object[0]);
                return;
            }
            if (onlyVolume) {
                onlyVolume = MediaUtil.b() != this.g;
            }
            this.c.removeCallbacksAndMessages(null);
            this.c.postDelayed(new b(onlyVolume), onlyVolume ? 0L : 500L);
        }
    }
}
