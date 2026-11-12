package com.xiaomi.fit.fitness.sleep.algo.stage;

import android.content.Context;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.sleep.algo.stage.api.JniSleepStageListener;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepRateArray;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStageSummary;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class MiSleepAlgorithmNative implements MiParseModel.OnMiClassifierCallBack, JniSleepStageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MiParseModel f11468a = new MiParseModel();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f11469b;
    public List<SleepStageSummary> c;

    public interface a {
        void onParseResult(List<SleepStageSummary> list, @Nullable SleepRateArray sleepRateArray);
    }

    private native void clear();

    public static native void init(JniSleepStageListener jniSleepStageListener, int i, int i2);

    private static native void onSleepStageAlgoStatus();

    private static native int setSleepStageResult(float[][] fArr);

    private static native int setSourceSleepData(byte[] bArr);

    public final void a(byte[] bArr) {
        onSleepStageAlgoStatus();
        int sourceSleepData = setSourceSleepData(bArr);
        FitnessLogUtils.w("MiSleepAlgorithmNative", "setSourceSleepData errCode = " + sourceSleepData);
        if (sourceSleepData != 0) {
            e(new ArrayList(), null);
        }
    }

    public void b() {
        if (this.f11469b != null) {
            this.f11469b = null;
        }
    }

    public final void c(float[][] fArr) {
        int sleepStageResult = setSleepStageResult(fArr);
        FitnessLogUtils.w("MiSleepAlgorithmNative", "setSleepStageResult errCode = " + sleepStageResult);
        if (sleepStageResult != 0) {
            e(new ArrayList(), null);
        }
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.api.JniSleepStageListener
    public void callBackSleepBreathArrayFromJNI(int i, SleepRateArray sleepRateArray) {
        FitnessLogUtils.i("MiSleepAlgorithmNative", "callBackSleepBreathArrayFromJNI errCode = " + i + ";breathArray:" + sleepRateArray);
        if (i != 0) {
            e(this.c, null);
        } else {
            e(this.c, sleepRateArray);
        }
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.api.JniSleepStageListener
    public void callBackSleepStageArrayFromJNI(int i, List<SleepStageSummary> list) {
        FitnessLogUtils.i("MiSleepAlgorithmNative", "callBackSleepStageArrayFromJNI errCode = " + i);
        this.f11468a.close();
        if (i != 0) {
            e(new ArrayList(), null);
        } else {
            this.c = list;
        }
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.api.JniSleepStageListener
    public void callBackStateFromJNI(int i) {
        FitnessLogUtils.i("MiSleepAlgorithmNative", "callBackStateFromJNI state = " + i);
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.api.JniSleepStageListener
    public void callbackFeaturesFromJNI(float[][] fArr) {
        FitnessLogUtils.i("MiSleepAlgorithmNative", "callbackFeaturesFromJNI tensorFlow");
        this.f11468a.classify(fArr);
    }

    public void d(Context context, byte[] bArr, a aVar) {
        this.f11469b = aVar;
        init(this, 25, 25);
        this.f11468a.initialize(context, this);
        a(bArr);
    }

    public final void e(List<SleepStageSummary> list, SleepRateArray sleepRateArray) {
        this.f11468a.close();
        clear();
        a aVar = this.f11469b;
        if (aVar != null) {
            aVar.onParseResult(list, sleepRateArray);
        }
    }

    @Override // com.xiaomi.fit.fitness.sleep.algo.stage.MiParseModel.OnMiClassifierCallBack
    public void onResult(@Nullable float[][] fArr) {
        FitnessLogUtils.e("MiSleepAlgorithmNative", "OnMiClassifierCallBack tensorFlow-onResult output = " + fArr.length);
        c(fArr);
    }
}
