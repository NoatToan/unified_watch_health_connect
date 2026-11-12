package com.mi.fitness.ecg;

import com.mi.fitness.ecg.mi.MiEcgAlgoNative;
import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.EcgReportKey;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.cqh;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/ecg/EcgFilterAlgo;", "", "<init>", "()V", "filter", "Lcom/mi/fitness/ecg/EcgOutputData;", "srcData", "", "sampleFreq", "", EcgReportKey.dataSource, "([FILjava/lang/Integer;)Lcom/mi/fitness/ecg/EcgOutputData;", "ecgMiDev", "testMask", "filterForTest", "Companion", "ecg-filter-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgFilterAlgo {

    @NotNull
    private static final String TAG = "EcgFilterAlgo";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final EcgFilterAlgo instance = new EcgFilterAlgo();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mi/fitness/ecg/EcgFilterAlgo$Companion;", "", "<init>", "()V", "instance", "Lcom/mi/fitness/ecg/EcgFilterAlgo;", "getInstance", "()Lcom/mi/fitness/ecg/EcgFilterAlgo;", "TAG", "", "ecg-filter-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcgFilterAlgo getInstance() {
            return EcgFilterAlgo.instance;
        }
    }

    private EcgFilterAlgo() {
    }

    private final EcgOutputData ecgMiDev(float[] srcData, int sampleFreq, int dataSource, int testMask) {
        FitnessLogUtils.i(TAG, "mi dev ecg algo - start testMask(" + testMask + ')');
        int length = srcData.length;
        float[] fArr = new float[length];
        MiEcgAlgoNative.ecg_midev(srcData, fArr, length, sampleFreq, dataSource, testMask);
        FitnessLogUtils.i(TAG, "mi dev ecg algo - end");
        return new EcgOutputData(fArr, 0);
    }

    public static /* synthetic */ EcgOutputData ecgMiDev$default(EcgFilterAlgo ecgFilterAlgo, float[] fArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return ecgFilterAlgo.ecgMiDev(fArr, i, i2, i3);
    }

    private final EcgOutputData filterForTest(float[] srcData, int sampleFreq) {
        int length = srcData.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = cqh.d(srcData[i]);
        }
        return new EcgOutputData(fArr, 0);
    }

    @NotNull
    public final EcgOutputData filter(@NotNull float[] srcData, int sampleFreq, @Nullable Integer dataSource) {
        EcgOutputData ecgOutputData;
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        synchronized (this) {
            try {
                try {
                    if (!AppUtil.INSTANCE.isDevChannel()) {
                        return ecgMiDev$default(this, srcData, sampleFreq, dataSource != null ? dataSource.intValue() : 0, 0, 8, null);
                    }
                    int ecg_filter_algo = FitnessTestPref.INSTANCE.getECG_FILTER_ALGO();
                    if (ecg_filter_algo == 0) {
                        FitnessLogUtils.i(TAG, "return src data");
                        ecgOutputData = new EcgOutputData(srcData, 0);
                    } else if (ecg_filter_algo == 1 || ecg_filter_algo == 2) {
                        ecgOutputData = ecgMiDev$default(this, srcData, sampleFreq, dataSource != null ? dataSource.intValue() : 0, 0, 8, null);
                    } else if (ecg_filter_algo != 3) {
                        ecgOutputData = ecgMiDev$default(this, srcData, sampleFreq, dataSource != null ? dataSource.intValue() : 0, 0, 8, null);
                    } else {
                        ecgOutputData = ecgMiDev(srcData, sampleFreq, dataSource != null ? dataSource.intValue() : 0, 1);
                    }
                    return ecgOutputData;
                } catch (Exception e) {
                    FitnessLogUtils.i(TAG, "ecg filter", e);
                    return new EcgOutputData(srcData, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
