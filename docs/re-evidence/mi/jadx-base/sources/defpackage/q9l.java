package defpackage;

import com.xiaomi.fitness.sample.SamplingAverageStrategy;
import com.xiaomi.fitness.sample.SamplingFirstStrategy;
import com.xiaomi.fitness.sample.SamplingLastStrategy;
import com.xiaomi.fitness.sample.SamplingStrategyType;
import com.xiaomi.fitness.sample.SamplingSumStrategy;

/* JADX INFO: loaded from: classes8.dex */
public class q9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9l f31262a = new q9l();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31263a;

        static {
            int[] iArr = new int[SamplingStrategyType.values().length];
            f31263a = iArr;
            try {
                iArr[SamplingStrategyType.STRATEGY_SUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31263a[SamplingStrategyType.STRATEGY_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31263a[SamplingStrategyType.STRATEGY_AVERAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31263a[SamplingStrategyType.STRATEGY_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static q9l a() {
        return f31262a;
    }

    public vxc b(SamplingStrategyType samplingStrategyType) {
        int i = a.f31263a[samplingStrategyType.ordinal()];
        if (i == 1) {
            return new SamplingSumStrategy();
        }
        if (i == 2) {
            return new SamplingFirstStrategy();
        }
        if (i != 3) {
            return i != 4 ? new l9l() : new SamplingLastStrategy();
        }
        return new SamplingAverageStrategy();
    }
}
