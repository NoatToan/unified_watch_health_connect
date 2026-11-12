package com.huawei.hms.mlsdk.asr.energy;

import com.huawei.hms.mlsdk.asr.energy.vo.DetectResult;
import com.huawei.hms.mlsdk.asr.energy.vo.SampleBuffer;
import com.huawei.hms.mlsdk.asr.energy.vo.VoiceDetectParams;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;

/* JADX INFO: loaded from: classes10.dex */
public class NativeVadDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14337a = new Object().hashCode();

    public NativeVadDetector() {
        a();
    }

    private static void a() {
        try {
            System.loadLibrary("ml-vadenergy");
        } catch (UnsatisfiedLinkError e) {
            SmartLogger.e("NativeVadDetector", "loadLibrary e = " + e.getMessage());
        }
    }

    public native DetectResult detect(SampleBuffer sampleBuffer);

    public int getTag() {
        return this.f14337a;
    }

    public native boolean init(VoiceDetectParams voiceDetectParams);

    public native void release();
}
