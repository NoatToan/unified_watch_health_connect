package com.xiaomi.hm.health.utils;

import android.content.Context;
import com.huami.account.XiaomiTokenMananger;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.grsp.AudioSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.SensorDataFragment;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.speech.aiengine.EngineProcessor;
import com.xiaomi.hm.health.speech.utils.SpeechErrorShowUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class RecordUtils {
    private static Context j;
    private static RecordUtils k;
    private static final Object l = new Object();
    private final String a = "RecordUtils";
    private String c = null;
    private String d = null;
    private FileOutputStream e = null;
    private FileOutputStream f = null;
    private final Object g = new Object();
    private boolean h = false;
    private EngineProcessor b = new EngineProcessor(j);
    private boolean i = false;

    public class a implements IHMSensorDataCallback {
        private a() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
        public void onSensorData(SensorDataFragment dataFragment) {
            ArrayList<AudioSensorData> data = dataFragment.getData();
            if (data == null || data.size() == 0) {
                return;
            }
            for (AudioSensorData audioSensorData : data) {
                synchronized (RecordUtils.this.g) {
                    try {
                        RecordUtils.this.e.write(audioSensorData.getPacket());
                    } catch (IOException e) {
                        HMLog.i("RecordUtils", "IOException:" + e.getMessage(), new Object[0]);
                    }
                }
                RecordUtils.this.b.addBuffer(audioSensorData.getPacket(), RecordUtils.this.f);
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
        public void onSensorOriginData(byte[] value) {
            HMLog.d("RecordUtils", "onOriginData:" + GattUtils.bytesToHexString(value), new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
        public void onSensorStart() {
            RecordUtils.this.r();
            RecordUtils.this.h = false;
            HMLog.d("RecordUtils", "onSensorStart ", new Object[0]);
            RecordUtils.this.c = null;
            File file = new File(RecordUtils.j.getCacheDir().getPath());
            if (!file.exists()) {
                file.mkdir();
            }
            RecordUtils.this.d = null;
            File file2 = new File(RecordUtils.j.getCacheDir().getPath());
            if (!file2.exists()) {
                file2.mkdir();
            }
            try {
                RecordUtils recordUtils = RecordUtils.this;
                recordUtils.c = recordUtils.s();
                RecordUtils.this.e = new FileOutputStream(RecordUtils.this.c);
            } catch (Exception e) {
                HMLog.d("RecordUtils", "FileOutputStream exception:" + e.getMessage(), new Object[0]);
            }
            try {
                RecordUtils recordUtils2 = RecordUtils.this;
                recordUtils2.d = recordUtils2.t();
                RecordUtils.this.f = new FileOutputStream(RecordUtils.this.d);
            } catch (Exception e2) {
                HMLog.d("RecordUtils", "FileVadOutputStream exception:" + e2.getMessage(), new Object[0]);
            }
            RecordUtils.this.b.initSpeechEngineWithVadMode();
            RecordUtils.this.b.initOpus();
        }

        @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
        public void onSensorStop(boolean result) {
            HMLog.d("RecordUtils", "onSensorStop " + result, new Object[0]);
            synchronized (RecordUtils.this.g) {
                try {
                    RecordUtils.this.e.flush();
                    RecordUtils.this.e.close();
                } catch (Exception unused) {
                }
                RecordUtils.this.b.deinitOpus();
                if (RecordUtils.this.h) {
                    RecordUtils.this.v();
                }
            }
            try {
                RecordUtils.this.f.flush();
                RecordUtils.this.f.close();
            } catch (IOException unused2) {
            }
        }
    }

    private RecordUtils() {
    }

    public static RecordUtils getInstance(Context context) {
        j = context;
        if (k == null) {
            k = new RecordUtils();
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        File externalCacheDir = j.getExternalCacheDir();
        if (externalCacheDir == null) {
            return;
        }
        for (File file : externalCacheDir.listFiles()) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void releaseSpeechResource() {
        RecordUtils recordUtils = k;
        if (recordUtils == null) {
            return;
        }
        recordUtils.b.releaseSpeechEngineResource();
        RecordUtils recordUtils2 = k;
        recordUtils2.i = false;
        recordUtils2.b = null;
        k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        return j.getExternalCacheDir() + File.separator + "audio-" + new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t() {
        return j.getExternalCacheDir() + File.separator + "vadAudio-" + new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()) + ".wav";
    }

    private void u() {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            return;
        }
        SpeechErrorShowUtils.showError(j, hMMiLiProDevice, !XiaomiTokenMananger.hasXiaomiAiToken() ? 4 : 3);
    }

    public static void updateSpeechEngineThirdToken(String... tokenParams) {
        RecordUtils recordUtils = k;
        if (recordUtils == null) {
            return;
        }
        recordUtils.b.updateSpeechEngineThirdToken(tokenParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws Throwable {
        this.b.interruptSpeechEngineRequest();
        this.b.userManuallyStartSpeechRequest(this.c);
    }

    public void enableAudioData(boolean enable) {
        HMLog.d("RecordUtils", "enableAudioData " + enable, new Object[0]);
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i("RecordUtils", "enableAudioData return as device not connected!!!", new Object[0]);
            return;
        }
        if (!enable) {
            hMMiLiDevice.stopSensorData();
            this.h = true;
        } else if (this.i && XiaomiTokenMananger.hasXiaomiAiToken()) {
            hMMiLiDevice.startSensorData(SensorType.ADATA.getValue(), new a());
        } else {
            u();
        }
    }

    public void exitSpeechEngine() {
        this.h = false;
        this.b.interruptSpeechEngineRequest();
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i("RecordUtils", "exitSpeechEngine return as device not connected!!!", new Object[0]);
        } else {
            hMMiLiDevice.stopSensorData();
        }
    }

    public void speechEngineVadModeDetectionNotify() {
        HMLog.d("RecordUtils", "speech vad end callback", new Object[0]);
        this.h = false;
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i("RecordUtils", "speechEngineVadModeDetectionNotify return as device not connected!!!", new Object[0]);
        } else {
            hMMiLiDevice.stopSensorData();
        }
    }

    public void speechErrorNotify() {
        HMLog.d("RecordUtils", "speech error", new Object[0]);
        this.h = false;
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            HMLog.i("RecordUtils", "speechErrorNotify return as device not connected!!!", new Object[0]);
        } else {
            hMMiLiDevice.stopSensorData();
        }
    }

    public void speechManualRequestSuccessNotify() {
        HMLog.d("RecordUtils", "speech manual request end callback", new Object[0]);
    }

    public void updateSpeechEngineAuthorize(String... authParams) {
        this.b.updateSpeechEngineAuthorize(authParams);
    }
}
