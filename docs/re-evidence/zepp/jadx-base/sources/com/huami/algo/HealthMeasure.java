package com.huami.algo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u0013\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/huami/algo/HealthMeasure;", "", "", "a", LogUtil.D, "getBmi", "()D", "bmi", "b", "getAge", "age", "c", "getCvdRisk", "cvdRisk", GoogleApiAvailabilityLight.a, "getStdCvdRisk", "stdCvdRisk", "e", "getScore", "score", "f", "getUseECG", "useECG", "", "param", "<init>", "([D)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HealthMeasure {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double bmi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double age;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double cvdRisk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double stdCvdRisk;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double score;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final double useECG;

    public HealthMeasure(@Nullable double[] dArr) {
        if (dArr == null || dArr.length != 6) {
            HMLog.e("HealthMeasure", "ECGHealth GetHealthMeasure bad length", new Object[0]);
            throw new IllegalArgumentException("GetHealthMeasure bad length");
        }
        HMLog.i("HealthMeasure", " age:" + dArr[1] + ",cvdRisk:" + dArr[2] + ",stdcvdrisk:" + dArr[3] + ",score:" + dArr[4] + ",useECG:" + dArr[5], new Object[0]);
        this.bmi = dArr[0];
        this.age = dArr[1];
        this.cvdRisk = dArr[2];
        this.stdCvdRisk = dArr[3];
        this.score = dArr[4];
        this.useECG = dArr[5];
    }

    public final double getAge() {
        return this.age;
    }

    public final double getBmi() {
        return this.bmi;
    }

    public final double getCvdRisk() {
        return this.cvdRisk;
    }

    public final double getScore() {
        return this.score;
    }

    public final double getStdCvdRisk() {
        return this.stdCvdRisk;
    }

    public final double getUseECG() {
        return this.useECG;
    }
}
