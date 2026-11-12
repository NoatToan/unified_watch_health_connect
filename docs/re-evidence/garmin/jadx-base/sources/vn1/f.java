package vn1;

import android.hardware.camera2.CameraManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f178850f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaPlayer f178851a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f178853c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraManager f178852b = (CameraManager) GarminConnectMobileApp.f28688j.getSystemService("camera");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178854d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178855e = 0;

    private f() {
    }

    public static void a() {
        f fVarE = e();
        fVarE.getClass();
        AudioManager audioManager = (AudioManager) GarminConnectMobileApp.f28688j.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return;
        }
        audioManager.setStreamVolume(3, fVarE.f178854d, 0);
        audioManager.setStreamVolume(4, fVarE.f178855e, 0);
        MediaPlayer mediaPlayer = fVarE.f178851a;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        fVarE.f178851a.stop();
        fVarE.f178851a.reset();
        fVarE.f178851a.release();
        fVarE.f178851a = null;
    }

    public static void b(int i14, boolean z14) {
        f fVarE = e();
        fVarE.getClass();
        AudioManager audioManager = (AudioManager) GarminConnectMobileApp.f28688j.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return;
        }
        boolean z15 = audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
        fVarE.f178855e = audioManager.getStreamVolume(4);
        fVarE.f178854d = audioManager.getStreamVolume(3);
        audioManager.setStreamVolume(3, z15 ? audioManager.getStreamMaxVolume(3) / 2 : audioManager.getStreamMaxVolume(3), 0);
        MediaPlayer mediaPlayer = new MediaPlayer();
        fVarE.f178851a = mediaPlayer;
        try {
            mediaPlayer.setDataSource(GarminConnectMobileApp.f28688j, Uri.parse("android.resource://" + GarminConnectMobileApp.f28688j.getPackageName() + "/" + i14));
            MediaPlayer mediaPlayer2 = fVarE.f178851a;
            if (z14) {
                mediaPlayer2.setAudioStreamType(4);
                audioManager.setStreamVolume(4, audioManager.getStreamMaxVolume(4), 0);
                AudioManager audioManager2 = (AudioManager) GarminConnectMobileApp.f28688j.getSystemService(AudioManager.class);
                AudioDeviceInfo audioDeviceInfo = null;
                if (audioManager2 != null) {
                    for (AudioDeviceInfo audioDeviceInfo2 : audioManager2.getDevices(2)) {
                        if (audioDeviceInfo2 != null && audioDeviceInfo2.getType() == 2) {
                            audioDeviceInfo = audioDeviceInfo2;
                            break;
                        }
                    }
                }
                if (audioDeviceInfo != null && fVarE.f178851a.setPreferredDevice(audioDeviceInfo)) {
                    i2.j("PhoneUtil", "Set phone speaker as preferred device for Find My Phone.");
                }
            } else {
                mediaPlayer2.setAudioStreamType(3);
            }
            fVarE.f178851a.setLooping(true);
            fVarE.f178851a.prepare();
            fVarE.f178851a.start();
        } catch (Exception unused) {
            i2.d("PhoneUtil", "Error playing audio file with resource ID [" + i14 + "].");
        }
    }

    public static void c() {
        f fVarE = e();
        d dVar = fVarE.f178853c;
        if (dVar != null) {
            dVar.f178846b.c(null);
            long j8 = 2000;
            while (j8 > 0 && !fVarE.f178853c.f178848d) {
                try {
                    Thread.sleep(500L);
                    j8 -= 500;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void d() {
        f fVarE = e();
        fVarE.getClass();
        if (!GarminConnectMobileApp.f28688j.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            i2.n("PhoneUtil", "This Android device does not have system feature [android.hardware.camera].");
        } else {
            if (!GarminConnectMobileApp.f28688j.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
                i2.n("PhoneUtil", "This Android device does not have system feature [android.hardware.camera.flash].");
                return;
            }
            d dVar = new d(fVarE.f178852b);
            fVarE.f178853c = dVar;
            ge1.b.T(dVar, null, null, new c(dVar, null), 3);
        }
    }

    public static f e() {
        if (f178850f == null) {
            f178850f = new f();
        }
        return f178850f;
    }
}
