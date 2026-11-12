package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class mlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mlh f41869a;
    private Context d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41870c = new Object();
    private MediaPlayer o = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f41871b = null;
    private int k = 0;
    private int h = 0;
    private int j = 0;
    private int l = 0;
    private boolean g = false;
    private boolean f = false;
    private Handler i = new Handler(Looper.getMainLooper()) { // from class: mlh.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                mlh.this.j();
                mlh.this.b(2);
            } else {
                LogUtil.j("HwFindPhoneMgr", "mHandler unknown command");
            }
        }
    };

    private mlh(Context context) {
        this.d = context;
    }

    public void b() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i = null;
        }
        a();
    }

    private static void a() {
        synchronized (e) {
            f41869a = null;
        }
    }

    public static mlh e(Context context) {
        mlh mlhVar;
        synchronized (e) {
            if (f41869a == null) {
                f41869a = new mlh(context);
            }
            mlhVar = f41869a;
        }
        return mlhVar;
    }

    public void b(byte[] bArr) {
        ReleaseLogUtil.d("DEVMGR_HwFindPhoneMgr", "handleFindPhoneOperationReport() enter");
        if (bArr == null) {
            LogUtil.j("HwFindPhoneMgr", "handleFindPhoneOperationReport ,dataInfos is null, return");
            return;
        }
        if (bArr.length < 5) {
            LogUtil.j("HwFindPhoneMgr", "handleFindPhoneOperationReport ,length less than 5, return");
            return;
        }
        if (bArr[1] == 1) {
            byte b2 = bArr[4];
            if (b2 == 1) {
                LogUtil.a("HwFindPhoneMgr", "operation = ", Byte.valueOf(b2), ",Find phone start");
                e();
            } else if (b2 != 2) {
                LogUtil.j("HwFindPhoneMgr", "handleFindPhoneOperationReport unknown command");
            } else {
                LogUtil.a("HwFindPhoneMgr", "operation = ", Byte.valueOf(b2), ",Find phone stop");
                j();
            }
        }
    }

    private void e() {
        synchronized (f41870c) {
            try {
                try {
                    MediaPlayer mediaPlayer = this.o;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        LogUtil.j("HwFindPhoneMgr", "startFindPhone isPlaying");
                        return;
                    }
                    Object systemService = this.d.getSystemService("audio");
                    if (systemService instanceof AudioManager) {
                        this.f41871b = (AudioManager) systemService;
                    }
                    AudioManager audioManager = this.f41871b;
                    if (audioManager != null) {
                        this.k = audioManager.getStreamMaxVolume(3);
                        this.h = this.f41871b.getStreamVolume(3);
                        this.l = this.f41871b.getStreamMaxVolume(0);
                        this.j = this.f41871b.getStreamVolume(0);
                        boolean zIsSpeakerphoneOn = this.f41871b.isSpeakerphoneOn();
                        this.g = zIsSpeakerphoneOn;
                        LogUtil.a("HwFindPhoneMgr", "startFindPhone mCurrentRingVolume:", Integer.valueOf(this.h), ", mMaxRingVolume:", Integer.valueOf(this.k), " mIsSpeakerphoneOn:", Boolean.valueOf(zIsSpeakerphoneOn), " mCurrentCallVolume:", Integer.valueOf(this.j), ", mMaxCallVolume:", Integer.valueOf(this.l));
                    }
                    c();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    Handler handler = this.i;
                    if (handler != null) {
                        handler.sendMessageDelayed(messageObtain, 13000L);
                    }
                } catch (IllegalStateException unused) {
                    LogUtil.e("HwFindPhoneMgr", "startFindPhone IllegalStateException");
                    xjt.s("startFindPhone IllegalStateException");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("HwFindPhoneMgr", "Stop phone lost alert");
        synchronized (f41870c) {
            Handler handler = this.i;
            if (handler != null) {
                handler.removeMessages(1);
            }
            if (this.f) {
                LogUtil.j("HwFindPhoneMgr", "stopFindPhone mIsStoppingPlayRing is true");
                return;
            }
            this.f = true;
            i();
            this.f = false;
        }
    }

    private void c() {
        LogUtil.a("HwFindPhoneMgr", "startPlayRing");
        AudioManager audioManager = this.f41871b;
        if (audioManager != null) {
            audioManager.requestAudioFocus(null, 3, 4);
            this.f41871b.setMode(3);
            if (CommonUtil.bd()) {
                d();
            } else {
                this.f41871b.setSpeakerphoneOn(true);
                this.f41871b.stopBluetoothSco();
                this.f41871b.setBluetoothScoOn(false);
            }
        }
        try {
            if (this.o == null) {
                String strB = LanguageUtil.b(BaseApplication.getContext());
                LogUtil.a("HwFindPhoneMgr", "Language Type", strB);
                if (MLAsrConstants.LAN_ZH.equals(strB)) {
                    this.o = MediaPlayer.create(this.d, R.raw.ring_vivid);
                } else {
                    this.o = MediaPlayer.create(this.d, R.raw.ring_vivid_en);
                }
            }
            MediaPlayer mediaPlayer = this.o;
            if (mediaPlayer == null) {
                LogUtil.j("HwFindPhoneMgr", "mMediaPlayer is null");
                return;
            }
            mediaPlayer.setAudioStreamType(3);
            this.o.setLooping(true);
            e(this.k, 3);
            e(this.l, 0);
            this.o.start();
            LogUtil.a("HwFindPhoneMgr", "startPlayRing start");
        } catch (IllegalStateException e2) {
            LogUtil.e("HwFindPhoneMgr", "startPlayRing fos IllegalStateException = ", e2.getMessage());
            xjt.s("startPlayRing fos IllegalStateException = " + e2.getMessage());
        } catch (Exception e3) {
            LogUtil.e("HwFindPhoneMgr", "startPlayRing fos Exception ", ExceptionUtils.c(e3));
            xjt.s("startPlayRing fos Exception " + ExceptionUtils.c(e3));
        }
    }

    private void d() {
        LogUtil.a("HwFindPhoneMgr", "setHonorFindPhone enter.");
        if (this.f41871b.isBluetoothScoOn()) {
            this.f41871b.stopBluetoothSco();
            this.f41871b.setBluetoothScoOn(false);
        }
        this.f41871b.setSpeakerphoneOn(true);
    }

    private void i() {
        MediaPlayer mediaPlayer = this.o;
        try {
            if (mediaPlayer != null) {
                try {
                    if (mediaPlayer.isPlaying()) {
                        LogUtil.a("HwFindPhoneMgr", "stopPlayRing mMediaPlayer");
                        this.o.stop();
                    }
                } catch (IllegalStateException unused) {
                    LogUtil.e("stopPlayRing IllegalStateException", new Object[0]);
                    xjt.s("stopPlayRing IllegalStateException");
                }
                this.o.reset();
                this.o.release();
                this.o = null;
            }
            AudioManager audioManager = this.f41871b;
            if (audioManager == null) {
                LogUtil.j("HwFindPhoneMgr", "stopPlayRing mAudioManager is null");
                return;
            }
            audioManager.setMode(0);
            try {
                this.f41871b.setSpeakerphoneOn(this.g);
            } catch (NullPointerException unused2) {
                ReleaseLogUtil.d("DEVMGR_HwFindPhoneMgr", "AudioManager.setSpeakerphoneOn error");
            }
            e(this.h, 3);
            e(this.j, 0);
            this.f41871b.abandonAudioFocus(null);
            LogUtil.a("HwFindPhoneMgr", "stopPlayRing end");
        } catch (Throwable th) {
            this.o.reset();
            this.o.release();
            this.o = null;
            throw th;
        }
    }

    private void e(int i, int i2) {
        AudioManager audioManager = this.f41871b;
        if (audioManager != null) {
            try {
                audioManager.setStreamVolume(i2, i, 0);
                LogUtil.a("HwFindPhoneMgr", "setRingVolume: ", Integer.valueOf(i), ", streamType:", Integer.valueOf(i2));
            } catch (Exception e2) {
                LogUtil.e("HwFindPhoneMgr", "setRingVolume Exception ", ExceptionUtils.c(e2));
                xjt.s("setRingVolume Exception " + ExceptionUtils.c(e2));
            }
        }
    }

    public void b(int i) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(11);
        deviceCommand.setCommandID(2);
        deviceCommand.setNeedAck(false);
        String str = eeq.d(1) + eeq.d(1) + eeq.d(i);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        mkf.e(this.d).sendDeviceData(deviceCommand);
    }
}
