package com.xiaomi.fitness.aivs.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.aivs.bluetooth.SpeechSynthesizerCapabilityImpl;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 I2\u00020\u0001:\u0002HIB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0016J\u0006\u00104\u001a\u00020(J\u001a\u0010?\u001a\u00020(2\b\u0010A\u001a\u0004\u0018\u0001062\b\u0010;\u001a\u0004\u0018\u00010<J\u0006\u0010B\u001a\u00020(J\b\u0010E\u001a\u00020(H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0012\u0010C\u001a\u00060DR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/SpeechSynthesizerCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/SpeechSynthesizerCapability;", "<init>", "()V", "value", "", "isStart", "()Z", "isPcmDataLoaded", "isPlayFinished", "mAudioTrack", "Landroid/media/AudioTrack;", "getMAudioTrack", "()Landroid/media/AudioTrack;", "setMAudioTrack", "(Landroid/media/AudioTrack;)V", "bluetoothHeadset", "Landroid/bluetooth/BluetoothHeadset;", "mSCOState", "", "intentFilter", "Landroid/content/IntentFilter;", "getIntentFilter", "()Landroid/content/IntentFilter;", "setIntentFilter", "(Landroid/content/IntentFilter;)V", "sampleRate", "getSampleRate", "()I", "setSampleRate", "(I)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "blueHeadsetListener", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "onPlayStart", "", "i", "onPlayFinish", "onPcmData", "bytes", "", "dataQueue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getDataQueue", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "setDataQueue", "(Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "release", "recognizerManager", "Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSpeechRecognizerManager;", "getRecognizerManager", "()Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSpeechRecognizerManager;", "setRecognizerManager", "(Lcom/xiaomi/fitness/aivs/bluetooth/BluetoothSpeechRecognizerManager;)V", "expectSpeech", "Lcom/xiaomi/ai/api/SpeechRecognizer$ExpectSpeech;", "getExpectSpeech", "()Lcom/xiaomi/ai/api/SpeechRecognizer$ExpectSpeech;", "setExpectSpeech", "(Lcom/xiaomi/ai/api/SpeechRecognizer$ExpectSpeech;)V", "mAivsSpeechRecognizerManager", "stopPlay", "mReceiver", "Lcom/xiaomi/fitness/aivs/bluetooth/SpeechSynthesizerCapabilityImpl$BluetoothNotificationReceiver;", BroadcastsKt.SILENT_PUSHING_STOP, "playAudioTrack", "stopAudioTrack", "BluetoothNotificationReceiver", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeechSynthesizerCapabilityImpl extends SpeechSynthesizerCapability {

    @NotNull
    private static final String TAG = "SpeechSynthesizerCapabilityImpl";

    @Nullable
    private BluetoothHeadset bluetoothHeadset;

    @Nullable
    private SpeechRecognizer.ExpectSpeech expectSpeech;
    private volatile boolean isPcmDataLoaded;
    private volatile boolean isPlayFinished;
    private volatile boolean isStart;

    @Nullable
    private volatile AudioTrack mAudioTrack;

    @NotNull
    private final BluetoothNotificationReceiver mReceiver;
    private int mSCOState;

    @Nullable
    private BluetoothSpeechRecognizerManager recognizerManager;

    @NotNull
    private IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
    private int sampleRate = 16000;

    @NotNull
    private Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private BluetoothProfile.ServiceListener blueHeadsetListener = new SpeechSynthesizerCapabilityImpl$blueHeadsetListener$1(this);

    @NotNull
    private ConcurrentLinkedQueue<byte[]> dataQueue = new ConcurrentLinkedQueue<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/aivs/bluetooth/SpeechSynthesizerCapabilityImpl$BluetoothNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/xiaomi/fitness/aivs/bluetooth/SpeechSynthesizerCapabilityImpl;)V", "onReceive", "", "arg0", "Landroid/content/Context;", "arg1", "Landroid/content/Intent;", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BluetoothNotificationReceiver extends BroadcastReceiver {
        public BluetoothNotificationReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context arg0, @NotNull Intent arg1) {
            Optional<SpeechRecognizer.PostBack> postBack;
            SpeechRecognizer.ExpectSpeech expectSpeech;
            Optional<SpeechRecognizer.PostBack> postBack2;
            Intrinsics.checkNotNullParameter(arg0, "arg0");
            Intrinsics.checkNotNullParameter(arg1, "arg1");
            String action = arg1.getAction();
            Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  action:" + action + "  hasStart:" + SpeechSynthesizerCapabilityImpl.this.getIsStart());
            if (StringsKt__StringsJVMKt.equals(action, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", true)) {
                int intExtra = arg1.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  state:" + intExtra);
                int i = SpeechSynthesizerCapabilityImpl.this.mSCOState;
                SpeechSynthesizerCapabilityImpl.this.mSCOState = intExtra;
                if (i == 11 && intExtra == 12) {
                    Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  connection->connected");
                    if (SpeechSynthesizerCapabilityImpl.this.getIsStart()) {
                        Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  begin play");
                        SpeechSynthesizerCapabilityImpl.this.playAudioTrack();
                        return;
                    }
                    return;
                }
                if (intExtra == 10) {
                    Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  connection->disconnected");
                    if (SpeechSynthesizerCapabilityImpl.this.getRecognizerManager() != null && SpeechSynthesizerCapabilityImpl.this.getExpectSpeech() != null) {
                        Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "connection->disconnected startExpectSpeech");
                        BluetoothSpeechRecognizerManager recognizerManager = SpeechSynthesizerCapabilityImpl.this.getRecognizerManager();
                        if (recognizerManager != null) {
                            SpeechRecognizer.ExpectSpeech expectSpeech2 = SpeechSynthesizerCapabilityImpl.this.getExpectSpeech();
                            recognizerManager.startExpectSpeech((expectSpeech2 == null || (postBack = expectSpeech2.getPostBack()) == null || !postBack.c() || (expectSpeech = SpeechSynthesizerCapabilityImpl.this.getExpectSpeech()) == null || (postBack2 = expectSpeech.getPostBack()) == null) ? null : postBack2.b());
                        }
                        SpeechSynthesizerCapabilityImpl.this.setExpectSpeech(null);
                    }
                    if (SpeechSynthesizerCapabilityImpl.this.getIsStart()) {
                        Logger.i(SpeechSynthesizerCapabilityImpl.TAG, "receive  stop");
                        SpeechSynthesizerCapabilityImpl.this.stop();
                    }
                }
            }
        }
    }

    public SpeechSynthesizerCapabilityImpl() {
        BluetoothNotificationReceiver bluetoothNotificationReceiver = new BluetoothNotificationReceiver();
        this.mReceiver = bluetoothNotificationReceiver;
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(bluetoothNotificationReceiver, this.intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(bluetoothNotificationReceiver, this.intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playAudioTrack() {
        if (this.mAudioTrack == null) {
            this.mAudioTrack = new AudioTrack(0, this.sampleRate, 4, 2, AudioTrack.getMinBufferSize(this.sampleRate, 4, 2), 1);
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null) {
                audioTrack.play();
            }
        }
        new Thread(new Runnable() { // from class: v5n
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                SpeechSynthesizerCapabilityImpl.playAudioTrack$lambda$2(this.f36509a);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playAudioTrack$lambda$2(final SpeechSynthesizerCapabilityImpl this$0) throws InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (this$0.isStart) {
            if (this$0.isPcmDataLoaded) {
                byte[] bArrPoll = this$0.dataQueue.poll();
                if (bArrPoll != null) {
                    if ((!(bArrPoll.length == 0)) && !NotifyHelperExtKt.getNotificationManagerExport().getIsOutGoingCall()) {
                        Logger.i(TAG, "mAudioTrack.write:data.length = " + bArrPoll.length);
                        AudioTrack audioTrack = this$0.mAudioTrack;
                        if (audioTrack != null) {
                            audioTrack.write(bArrPoll, 0, bArrPoll.length);
                        }
                    }
                }
                if (this$0.isPlayFinished) {
                    Logger.i(TAG, "soundData is empty, stop");
                    this$0.handler.postDelayed(new Runnable() { // from class: t5n
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpeechSynthesizerCapabilityImpl.playAudioTrack$lambda$2$lambda$0(this.f34348a);
                        }
                    }, 200L);
                    return;
                }
            } else {
                if (this$0.isPlayFinished) {
                    Logger.i(TAG, "pcm data not loaded but play finished, stop");
                    this$0.handler.postDelayed(new Runnable() { // from class: u5n
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpeechSynthesizerCapabilityImpl.playAudioTrack$lambda$2$lambda$1(this.f35434a);
                        }
                    }, 200L);
                    return;
                }
                Thread.sleep(10L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playAudioTrack$lambda$2$lambda$0(SpeechSynthesizerCapabilityImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playAudioTrack$lambda$2$lambda$1(SpeechSynthesizerCapabilityImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stop() {
        this.dataQueue.clear();
        Logger.i(TAG, BroadcastsKt.SILENT_PUSHING_STOP);
        if (!this.isStart) {
            Logger.i(TAG, "stop  not start,just return");
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Boolean boolValueOf = null;
        String mac = wearableDeviceModel != null ? DeviceModelExtKt.getMac(wearableDeviceModel) : null;
        Object systemService = ApplicationExtKt.getApplication().getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothManager bluetoothManager = (BluetoothManager) systemService;
        BluetoothDevice remoteDevice = bluetoothManager.getAdapter().getRemoteDevice(mac);
        BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        if (bluetoothHeadset != null && remoteDevice != null) {
            if (bluetoothHeadset != null) {
                try {
                    boolValueOf = Boolean.valueOf(bluetoothHeadset.stopVoiceRecognition(remoteDevice));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Logger.i(TAG, "stopVoiceRecognition:" + boolValueOf);
        }
        if (this.bluetoothHeadset != null) {
            bluetoothManager.getAdapter().closeProfileProxy(1, this.bluetoothHeadset);
        }
        this.isStart = false;
        this.isPcmDataLoaded = false;
        this.isPlayFinished = false;
        stopAudioTrack();
    }

    private final void stopAudioTrack() {
        AudioTrack audioTrack;
        AudioTrack audioTrack2;
        if (this.mAudioTrack != null) {
            try {
                AudioTrack audioTrack3 = this.mAudioTrack;
                if (audioTrack3 != null && audioTrack3.getState() == 1 && (((audioTrack = this.mAudioTrack) == null || audioTrack.getPlayState() != 1) && (audioTrack2 = this.mAudioTrack) != null)) {
                    audioTrack2.stop();
                }
                AudioTrack audioTrack4 = this.mAudioTrack;
                if (audioTrack4 != null) {
                    audioTrack4.release();
                }
                this.mAudioTrack = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @NotNull
    public final ConcurrentLinkedQueue<byte[]> getDataQueue() {
        return this.dataQueue;
    }

    @Nullable
    public final SpeechRecognizer.ExpectSpeech getExpectSpeech() {
        return this.expectSpeech;
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final IntentFilter getIntentFilter() {
        return this.intentFilter;
    }

    @Nullable
    public final AudioTrack getMAudioTrack() {
        return this.mAudioTrack;
    }

    @Nullable
    public final BluetoothSpeechRecognizerManager getRecognizerManager() {
        return this.recognizerManager;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: isPcmDataLoaded, reason: from getter */
    public final boolean getIsPcmDataLoaded() {
        return this.isPcmDataLoaded;
    }

    /* JADX INFO: renamed from: isPlayFinished, reason: from getter */
    public final boolean getIsPlayFinished() {
        return this.isPlayFinished;
    }

    /* JADX INFO: renamed from: isStart, reason: from getter */
    public final boolean getIsStart() {
        return this.isStart;
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPcmData(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (NotifyHelperExtKt.getNotificationManagerExport().getIsOutGoingCall()) {
            return;
        }
        Logger.i(TAG, "onPcmData bytes.length :" + bytes.length);
        this.dataQueue.offer(bytes);
        this.isPcmDataLoaded = true;
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPlayFinish() {
        Logger.i(TAG, "onPlayFinish");
        this.isPlayFinished = true;
    }

    @Override // com.xiaomi.ai.android.capability.SpeechSynthesizerCapability
    public void onPlayStart(int i) {
        if (NotifyHelperExtKt.getNotificationManagerExport().getIsOutGoingCall()) {
            return;
        }
        this.sampleRate = i;
        Logger.i(TAG, "onPlayStart:" + i);
        if (this.isStart) {
            Logger.i(TAG, "start  hasStart,just return");
            return;
        }
        this.dataQueue.clear();
        Object systemService = ApplicationExtKt.getApplication().getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        ((BluetoothManager) systemService).getAdapter().getProfileProxy(ApplicationExtKt.getApplication(), this.blueHeadsetListener, 1);
        this.isStart = true;
        this.isPlayFinished = false;
        this.isPcmDataLoaded = false;
    }

    public final void release() {
        ApplicationExtKt.getApplication().unregisterReceiver(this.mReceiver);
        stop();
    }

    public final void setDataQueue(@NotNull ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue) {
        Intrinsics.checkNotNullParameter(concurrentLinkedQueue, "<set-?>");
        this.dataQueue = concurrentLinkedQueue;
    }

    public final void setExpectSpeech(@Nullable SpeechRecognizer.ExpectSpeech expectSpeech) {
        this.expectSpeech = expectSpeech;
    }

    public final void setHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.handler = handler;
    }

    public final void setIntentFilter(@NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(intentFilter, "<set-?>");
        this.intentFilter = intentFilter;
    }

    public final void setMAudioTrack(@Nullable AudioTrack audioTrack) {
        this.mAudioTrack = audioTrack;
    }

    public final void setRecognizerManager(@Nullable BluetoothSpeechRecognizerManager bluetoothSpeechRecognizerManager) {
        this.recognizerManager = bluetoothSpeechRecognizerManager;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public final void stopPlay() {
        this.expectSpeech = null;
        stop();
    }

    public final void setExpectSpeech(@Nullable BluetoothSpeechRecognizerManager mAivsSpeechRecognizerManager, @Nullable SpeechRecognizer.ExpectSpeech expectSpeech) {
        this.recognizerManager = mAivsSpeechRecognizerManager;
        this.expectSpeech = expectSpeech;
    }
}
