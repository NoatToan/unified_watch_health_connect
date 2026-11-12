package com.mi.fitness.menstrual;

import com.mi.fitness.menstrual.MenstrualAlgo;
import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.mi.fitness.menstrual.data.MenstrualPredictDateRequest;
import com.mi.fitness.menstrual.data.MenstrualSettingRequest;
import com.mi.fitness.menstrual.data.TemperatureBasicInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/mi/fitness/menstrual/MenstrualAlgo;", "", "<init>", "()V", "menstrualAlgo", "Lcom/mi/fitness/menstrual/MenstrualAlgoNative;", "getMenstrualAlgo", "()Lcom/mi/fitness/menstrual/MenstrualAlgoNative;", "menstrualAlgo$delegate", "Lkotlin/Lazy;", "menstrualCycleInfo", "Lcom/mi/fitness/menstrual/data/MenstrualCycleInfo;", "temperatureBasicInfo", "Lcom/mi/fitness/menstrual/data/TemperatureBasicInfo;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "parseMenstrual", "", "currentDateSec", "", "menstrualSetting", "Lcom/mi/fitness/menstrual/data/MenstrualSettingRequest;", "menstrualPredictDate", "Lcom/mi/fitness/menstrual/data/MenstrualPredictDateRequest;", "dataList", "", "", "tempTrendTimeList", "", "dataCallback", "Lcom/mi/fitness/menstrual/MenstrualAlgoNative$JniDataCallback;", "requestType", "", OneTrack.Param.TZ, "Companion", "temperature_algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstrualAlgo {

    @NotNull
    public static final String TAG = "MenstrualAlgo";

    @Nullable
    private MenstrualCycleInfo menstrualCycleInfo;

    @Nullable
    private TemperatureBasicInfo temperatureBasicInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MenstrualAlgo instance = new MenstrualAlgo();

    /* JADX INFO: renamed from: menstrualAlgo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy menstrualAlgo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tpf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MenstrualAlgo.menstrualAlgo_delegate$lambda$0();
        }
    });

    @NotNull
    private final ExecutorCoroutineDispatcher dispatcher = ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, "parseTempAndMenstrual");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/mi/fitness/menstrual/MenstrualAlgo$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/mi/fitness/menstrual/MenstrualAlgo;", "getInstance", "()Lcom/mi/fitness/menstrual/MenstrualAlgo;", "temperature_algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MenstrualAlgo getInstance() {
            return MenstrualAlgo.instance;
        }
    }

    private final MenstrualAlgoNative getMenstrualAlgo() {
        return (MenstrualAlgoNative) this.menstrualAlgo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MenstrualAlgoNative menstrualAlgo_delegate$lambda$0() {
        return new MenstrualAlgoNative();
    }

    public final void parseMenstrual(long currentDateSec, @NotNull MenstrualSettingRequest menstrualSetting, @NotNull MenstrualPredictDateRequest menstrualPredictDate, @NotNull List<byte[]> dataList, @Nullable List<Long> tempTrendTimeList, @NotNull MenstrualAlgoNative.JniDataCallback dataCallback, int requestType, int tz) {
        Intrinsics.checkNotNullParameter(menstrualSetting, "menstrualSetting");
        Intrinsics.checkNotNullParameter(menstrualPredictDate, "menstrualPredictDate");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(dataCallback, "dataCallback");
        FitnessLogUtils.i("MiSleepAlgorithmNative", "parseMenstrual");
        getMenstrualAlgo().initialize(currentDateSec, menstrualSetting, menstrualPredictDate, dataList, tempTrendTimeList, dataCallback, requestType, tz);
    }
}
