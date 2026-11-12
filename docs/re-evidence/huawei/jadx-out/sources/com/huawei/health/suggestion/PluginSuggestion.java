package com.huawei.health.suggestion;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Summary;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.sport.CourseUpdateListener;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.gze;
import defpackage.pbx;
import health.compact.a.Services;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class PluginSuggestion extends pbx {
    public abstract void deleteFitnessDataForStoreDemo();

    public abstract RecyclerView.Adapter getBaseRecyclerViewAdapter(List<RecordAction> list);

    public abstract void getFitWorkout(String str, String str2, UiCallback<FitWorkout> uiCallback);

    public abstract H5ProWebView getH5ProWebView();

    public abstract List<Map<String, Object>> getRecordsByDateRange(Date date, Date date2);

    public abstract CourseUpdateListener getRunCourseVoiceManager(List<ChoreographedSingleAction> list, FitWorkout fitWorkout, boolean z, CourseEnvParams courseEnvParams);

    public abstract boolean isInitComplete();

    public abstract void jumpToLongCoach(Context context, int i);

    public abstract void jumpToPlanTab();

    public abstract void jumpToStartTrain(Context context, FitWorkout fitWorkout, PluginSuggestion pluginSuggestion, boolean z);

    public abstract void notifyActivityResult(int i, int i2, Intent intent);

    public abstract void realTimeGuidance(int i, List<Integer> list);

    public abstract void restoreUserDataForDemoVersion();

    public abstract void sendIntelligentPlan();

    public abstract boolean sendSampleEvent(long j, String str, String str2, int i);

    public abstract void setH5ProWebView(H5ProWebView h5ProWebView);

    public abstract void setTargetList(List<gze> list);

    public abstract void startSendIntelligentPlan();

    public abstract void switchToPlanReport(String str);

    public abstract void updateRunSummary(Summary summary);

    public static PluginSuggestion getInstance() {
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi != null) {
            return fitnessAdviceApi.getPluginSuggestion();
        }
        return null;
    }
}
