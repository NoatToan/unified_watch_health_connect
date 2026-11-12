package com.huami.training.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.util.SharedPreferenceConfigManager;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B%\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006)"}, d2 = {"Lcom/huami/training/util/SharedPreferenceConfigManager;", "Lcom/huami/training/util/ConfigManager;", "", "femaleKey", "maleKey", "c", "", "shouldFetchConfigs", "should", "", "setShouldFetchConfigs", "femaleImageUrl", "maleImageUrl", "setPlanBackgroundImageInFitnessPage", "setPlanBackgroundImageInCoursePage", "Landroidx/lifecycle/LiveData;", "getPlanBackgroundImageInFitnessPage", "getPlanBackgroundImageInCoursePage", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "isMale", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sp", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "planBgImageInFitness", "e", "planBgImageInCourse", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferenceConfigManager implements ConfigManager {

    @NotNull
    private static final String f = "TrainingConfig";

    @NotNull
    private static final String g = "ShouldFetchConfigs";

    @NotNull
    private static final String h = "FemalePlanBgImageInFitness";

    @NotNull
    private static final String i = "MalePlanBgImageInFitness";

    @NotNull
    private static final String j = "FemalePlanBgImageInCourse";

    @NotNull
    private static final String k = "MalePlanBgImageInCourse";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isMale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SharedPreferences sp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> planBgImageInFitness = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> planBgImageInCourse = new MutableLiveData<>();

    public SharedPreferenceConfigManager(@NotNull Context context, @NotNull Executor executor, @NotNull Function0<Boolean> function0) {
        this.executor = executor;
        this.isMale = function0;
        this.sp = context.getSharedPreferences(f, 0);
    }

    private final String c(String femaleKey, String maleKey) {
        String string = this.sp.getString(femaleKey, null);
        String string2 = this.sp.getString(maleKey, null);
        if (this.isMale.invoke().booleanValue()) {
            if (string2 == null) {
                return string;
            }
        } else if (string != null) {
            return string;
        }
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SharedPreferenceConfigManager sharedPreferenceConfigManager) {
        sharedPreferenceConfigManager.planBgImageInCourse.postValue(sharedPreferenceConfigManager.c(j, k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SharedPreferenceConfigManager sharedPreferenceConfigManager) {
        sharedPreferenceConfigManager.planBgImageInFitness.postValue(sharedPreferenceConfigManager.c(h, i));
    }

    @Override // com.huami.training.util.ConfigManager
    @NotNull
    public LiveData<String> getPlanBackgroundImageInCoursePage() {
        return this.planBgImageInCourse;
    }

    @Override // com.huami.training.util.ConfigManager
    @NotNull
    public LiveData<String> getPlanBackgroundImageInFitnessPage() {
        return this.planBgImageInFitness;
    }

    @Override // com.huami.training.util.ConfigManager
    public void setPlanBackgroundImageInCoursePage(@NotNull String femaleImageUrl, @NotNull String maleImageUrl) {
        SharedPreferences.Editor editorEdit = this.sp.edit();
        editorEdit.putString(j, femaleImageUrl);
        editorEdit.putString(k, maleImageUrl);
        editorEdit.apply();
        this.executor.execute(new Runnable() { // from class: ys6
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferenceConfigManager.d(this.a);
            }
        });
    }

    @Override // com.huami.training.util.ConfigManager
    public void setPlanBackgroundImageInFitnessPage(@NotNull String femaleImageUrl, @NotNull String maleImageUrl) {
        SharedPreferences.Editor editorEdit = this.sp.edit();
        editorEdit.putString(h, femaleImageUrl);
        editorEdit.putString(i, maleImageUrl);
        editorEdit.apply();
        this.executor.execute(new Runnable() { // from class: zs6
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferenceConfigManager.e(this.a);
            }
        });
    }

    @Override // com.huami.training.util.ConfigManager
    public void setShouldFetchConfigs(boolean should) {
        SharedPreferences.Editor editorEdit = this.sp.edit();
        editorEdit.putBoolean(g, should);
        editorEdit.apply();
    }

    @Override // com.huami.training.util.ConfigManager
    public boolean shouldFetchConfigs() {
        return this.sp.getBoolean(g, true);
    }
}
