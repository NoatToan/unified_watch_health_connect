package com.huami.sleep.statistic.sleepanalysis.viewmodel;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.sleepanalysis.dto.SleepAnalysisData;
import com.huami.sleep.statistic.sleepanalysis.processer.SleepAnalysisProcessor;
import com.huami.sleep.statistic.sleepanalysis.repo.ISleepAnalysisRepo;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u001cR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u001c¨\u0006)"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/viewmodel/SleepAnalysisViewModel;", "Landroidx/lifecycle/ViewModel;", "", "time", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "setTime", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/statistic/dto/TimeParam;", "a", "Landroidx/lifecycle/MutableLiveData;", "timeParamLiveData", "", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Landroidx/lifecycle/LiveData;", "Lcom/huami/sleep/statistic/sleepanalysis/dto/SleepAnalysisData;", "b", "Landroidx/lifecycle/LiveData;", "sleepAnalysisLiveData", "Lcom/huami/sleep/statistic/sleepanalysis/vo/SleepAnalysisVo;", "c", "getSleepAnalysisVoLiveData", "()Landroidx/lifecycle/LiveData;", "sleepAnalysisVoLiveData", "", GoogleApiAvailabilityLight.a, "getSlpAnalysisShowLiveData", "slpAnalysisShowLiveData", "e", "getSleepBestWorstShowLiveData", "sleepBestWorstShowLiveData", "Lcom/huami/sleep/statistic/sleepanalysis/repo/ISleepAnalysisRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/sleep/statistic/sleepanalysis/repo/ISleepAnalysisRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAnalysisViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeParam> timeParamLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepAnalysisData> sleepAnalysisLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepAnalysisVo> sleepAnalysisVoLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> slpAnalysisShowLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> sleepBestWorstShowLiveData;
    public String userId;

    public SleepAnalysisViewModel(@NotNull final ISleepAnalysisRepo iSleepAnalysisRepo) {
        MutableLiveData<TimeParam> mutableLiveData = new MutableLiveData<>();
        this.timeParamLiveData = mutableLiveData;
        LiveData<SleepAnalysisData> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function<TimeParam, LiveData<SleepAnalysisData>>() { // from class: com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<SleepAnalysisData> apply(TimeParam timeParam) {
                return iSleepAnalysisRepo.getSleepAnalysisData(this.getUserId(), timeParam);
            }
        });
        this.sleepAnalysisLiveData = liveDataSwitchMap;
        LiveData<SleepAnalysisVo> map = Transformations.map(liveDataSwitchMap, new Function<SleepAnalysisData, SleepAnalysisVo>() { // from class: com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel$special$$inlined$map$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final SleepAnalysisVo apply(SleepAnalysisData sleepAnalysisData) {
                return SleepAnalysisProcessor.INSTANCE.getSleepAnalysisVo(KoinExtKt.getAppContext(), (TimeParam) this.a.timeParamLiveData.getValue(), sleepAnalysisData);
            }
        });
        this.sleepAnalysisVoLiveData = map;
        this.slpAnalysisShowLiveData = Transformations.map(map, new Function<SleepAnalysisVo, Boolean>() { // from class: com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepAnalysisVo sleepAnalysisVo) {
                return Boolean.valueOf(!TextUtils.isEmpty(sleepAnalysisVo.getMainTitle()));
            }
        });
        this.sleepBestWorstShowLiveData = Transformations.map(liveDataSwitchMap, new Function<SleepAnalysisData, Boolean>() { // from class: com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepAnalysisData sleepAnalysisData) {
                SleepAnalysisData sleepAnalysisData2 = sleepAnalysisData;
                return Boolean.valueOf((sleepAnalysisData2 == null ? 0 : sleepAnalysisData2.getInvalidDay()) > 1);
            }
        });
    }

    @NotNull
    public final LiveData<SleepAnalysisVo> getSleepAnalysisVoLiveData() {
        return this.sleepAnalysisVoLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getSleepBestWorstShowLiveData() {
        return this.sleepBestWorstShowLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getSlpAnalysisShowLiveData() {
        return this.slpAnalysisShowLiveData;
    }

    @NotNull
    public final String getUserId() {
        String str = this.userId;
        Objects.requireNonNull(str);
        return str;
    }

    public final void setTime(long time, @NotNull TimeMode timeMode) {
        this.timeParamLiveData.setValue(new TimeParam(timeMode, time));
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
