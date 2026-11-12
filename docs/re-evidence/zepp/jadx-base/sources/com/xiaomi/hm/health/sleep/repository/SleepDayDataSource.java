package com.xiaomi.hm.health.sleep.repository;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.model.summery.SelectDateData;
import de.greenrobot.event.EventBus;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R>\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u0011j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012`\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/SleepDayDataSource;", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "data", "", "date", "", "postData", "userId", "Landroidx/lifecycle/LiveData;", "getSleepInfo", "removeDaySportLiveData", "Lcom/xiaomi/hm/health/eventbus/EventDateDataAnalysisJobFinished;", "event", "onEvent", "mTag", "Ljava/lang/String;", "Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/collections/HashMap;", "mDataSource", "Ljava/util/HashMap;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepDayDataSource implements ISleepDayDataSource {

    @NotNull
    private final String mTag = "SleepDayDataSource";

    @NotNull
    private final HashMap<String, MutableLiveData<SleepInfo>> mDataSource = new HashMap<>();

    public SleepDayDataSource() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    private final void postData(SleepInfo data, String date) {
        if (!this.mDataSource.containsKey(date) || this.mDataSource.get(date) == null) {
            this.mDataSource.put(date, new MutableLiveData<>());
        }
        MutableLiveData<SleepInfo> mutableLiveData = this.mDataSource.get(date);
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.postValue(data);
    }

    @Override // com.huami.sleep.datasource.ISleepDayDataSource
    @NotNull
    public LiveData<SleepInfo> getSleepInfo(@NotNull String userId, @NotNull final String date) {
        if (this.mDataSource.containsKey(date) && this.mDataSource.get(date) != null) {
            return this.mDataSource.get(date);
        }
        this.mDataSource.put(date, new MutableLiveData<>());
        HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepDayDataSource.getSleepInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                String str = date;
                MutableLiveData mutableLiveData = (MutableLiveData) this.mDataSource.get(date);
                return str + "  " + (mutableLiveData == null ? null : (SleepInfo) mutableLiveData.getValue());
            }
        });
        return this.mDataSource.get(date);
    }

    public final void onEvent(@NotNull final EventDateDataAnalysisJobFinished event) {
        if (event.getData() != null && !HmEarbudDateDataUtil.INSTANCE.getSelectData(event.getData().getKey(), true).getIsEarbud()) {
            HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepDayDataSource.onEvent.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return event.getData().getKey() + "  有手环数据";
                }
            });
            event.getData().getSleepInfo().setSportDay(event.getData().getSportDay());
            postData(event.getData().getSleepInfo(), event.getData().getKey());
        }
        if (event.getEarbudData() != null) {
            final SelectDateData selectData = HmEarbudDateDataUtil.INSTANCE.getSelectData(event.getEarbudData().getKey(), true);
            HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepDayDataSource.onEvent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return event.getEarbudData().getKey() + "  isearbud: " + selectData.getIsEarbud();
                }
            });
            if (selectData.getIsEarbud()) {
                HMLog.info(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepDayDataSource.onEvent.3
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "有耳机数据";
                    }
                });
                event.getEarbudData().getSleepInfo().setSportDay(event.getEarbudData().getSportDay());
                postData(event.getEarbudData().getSleepInfo(), event.getEarbudData().getKey());
            }
        }
    }

    @Override // com.huami.sleep.datasource.ISleepDayDataSource
    public void removeDaySportLiveData(@NotNull String date) {
        this.mDataSource.remove(date);
    }
}
