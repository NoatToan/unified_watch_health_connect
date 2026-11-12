package com.xiaomi.hm.health.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Vibrator;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.SmartExecutor;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AudioUtils {
    private static AudioUtils i;
    private Vibrator e;
    private AudioManager f;
    private PowerManager.WakeLock g;
    private final String a = "AudioUtils";
    private final long b = 200;
    private final a c = new a();
    private final a d = new a();
    private List<IRingerModeChangedCallback> h = new ArrayList();

    public interface IRingerModeChangedCallback {
        void onChanged(boolean z);
    }

    public class StateException extends Exception {
        public StateException(String str) {
            super(str);
        }
    }

    public class a {
        private int a = -1;
        private int b = -1;

        public a() {
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public void c(int i) {
            this.a = i;
        }

        public void d(int i) {
            this.b = i;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    private AudioUtils() {
        Application context = DeviceXFunctionsKt.getContext();
        this.e = (Vibrator) context.getSystemService("vibrator");
        this.f = (AudioManager) context.getSystemService("audio");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.g = powerManager.newWakeLock(805306374, "AudioUtils");
        }
    }

    private void c(int i2, int i3) {
        try {
            boolean zD = d(i2);
            boolean zD2 = d(i3);
            if (zD2 == zD) {
                return;
            }
            for (IRingerModeChangedCallback iRingerModeChangedCallback : this.h) {
                if (iRingerModeChangedCallback != null) {
                    iRingerModeChangedCallback.onChanged(zD2);
                }
            }
            setRingMode();
        } catch (StateException unused) {
        }
    }

    private boolean d(int i2) throws StateException {
        if (i2 >= 0) {
            return i2 != 2;
        }
        throw new StateException("mode is error:" + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        j(this.f.getRingerMode(), this.f.getStreamVolume(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(a aVar) {
        l(aVar, this.f.getRingerMode(), this.f.getStreamVolume(1));
    }

    private boolean g() {
        return Build.VERSION.SDK_INT >= 26 && Build.BRAND.equals("google") && Build.MODEL.equals("Nexus 6P");
    }

    public static synchronized AudioUtils getInstance() {
        if (i == null) {
            i = new AudioUtils();
        }
        return i;
    }

    private boolean h(int i2, int i3) {
        AudioManager audioManager = this.f;
        if (audioManager == null) {
            return false;
        }
        try {
            audioManager.setRingerMode(i2);
            if (g() && i3 >= 0) {
                this.f.setStreamVolume(1, i3, 0);
            }
            j(i2, i3);
            return true;
        } catch (Exception e) {
            HMLog.i("AudioUtils", e.getMessage(), new Object[0]);
            return false;
        }
    }

    private boolean i() {
        return HMDeviceConfig.hasFeatureMutePhoneDevice();
    }

    public static synchronized void init() {
        i = new AudioUtils();
    }

    private void j(int i2, int i3) {
        int iA = this.d.a();
        l(this.d, i2, i3);
        c(iA, i2);
    }

    private void k(final a aVar) {
        if (this.f == null) {
            return;
        }
        try {
            SmartExecutor.getExecutor().execute(new Runnable() { // from class: com.xiaomi.hm.health.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(aVar);
                }
            });
        } catch (Exception e) {
            HMLog.i("AudioUtils", e.getMessage(), new Object[0]);
        }
    }

    private void l(a aVar, int i2, int i3) {
        aVar.c(i2);
        aVar.d(i3);
    }

    public void initState() {
        k(this.c);
        k(this.d);
    }

    public boolean isCurrentMute() throws StateException {
        return d(this.d.a());
    }

    @SuppressLint({"MissingPermission"})
    public void muteMode(boolean z, boolean z2) throws StateException {
        Vibrator vibrator;
        if (d(this.d.a())) {
            k(this.c);
            return;
        }
        int iA = this.d.a();
        int iB = this.d.b();
        if (h(!z ? 1 : 0, 0)) {
            l(this.c, iA, iB);
            if (!z2 || (vibrator = this.e) == null) {
                return;
            }
            vibrator.vibrate(200L);
        }
    }

    public void normalMode(boolean z) throws StateException {
        PowerManager.WakeLock wakeLock;
        if (d(this.d.a()) && h(2, this.c.b()) && z && (wakeLock = this.g) != null) {
            wakeLock.acquire(200L);
        }
    }

    public void register(IRingerModeChangedCallback iRingerModeChangedCallback) {
        if (iRingerModeChangedCallback == null || this.h.contains(iRingerModeChangedCallback)) {
            return;
        }
        this.h.add(iRingerModeChangedCallback);
    }

    public void resumeMode(boolean z) throws StateException {
        PowerManager.WakeLock wakeLock;
        if (!d(this.c.a()) && h(this.c.a(), this.c.b()) && z && (wakeLock = this.g) != null) {
            wakeLock.acquire(200L);
        }
    }

    public void setPermissionMiss() {
        if (i()) {
            try {
                AudioDeviceUtils.INSTANCE.getInstance().phoneMutePermissionMiss();
            } catch (Exception e) {
                HMLog.i("AudioUtils", e.toString(), new Object[0]);
            }
        }
    }

    public void setRingMode() {
        if (i()) {
            try {
                AudioDeviceUtils.INSTANCE.getInstance().phoneMute(isCurrentMute());
            } catch (Exception e) {
                HMLog.i("AudioUtils", e.toString(), new Object[0]);
            }
        }
    }

    public void unregister(IRingerModeChangedCallback iRingerModeChangedCallback) {
        if (iRingerModeChangedCallback == null || !this.h.contains(iRingerModeChangedCallback)) {
            return;
        }
        this.h.remove(iRingerModeChangedCallback);
    }

    public void updateCurrentState() {
        if (this.f == null) {
            return;
        }
        try {
            SmartExecutor.getExecutor().execute(new Runnable() { // from class: sj
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            });
        } catch (Exception e) {
            HMLog.i("AudioUtils", e.getMessage(), new Object[0]);
        }
    }
}
