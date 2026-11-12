package com.huami.training.util;

import androidx.p008lifecycle.LiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH&¨\u0006\u000f"}, d2 = {"Lcom/huami/training/util/ConfigManager;", "", "", "shouldFetchConfigs", "should", "", "setShouldFetchConfigs", "Landroidx/lifecycle/LiveData;", "", "getPlanBackgroundImageInFitnessPage", "getPlanBackgroundImageInCoursePage", "femaleImageUrl", "maleImageUrl", "setPlanBackgroundImageInFitnessPage", "setPlanBackgroundImageInCoursePage", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface ConfigManager {
    @NotNull
    LiveData<String> getPlanBackgroundImageInCoursePage();

    @NotNull
    LiveData<String> getPlanBackgroundImageInFitnessPage();

    void setPlanBackgroundImageInCoursePage(@NotNull String femaleImageUrl, @NotNull String maleImageUrl);

    void setPlanBackgroundImageInFitnessPage(@NotNull String femaleImageUrl, @NotNull String maleImageUrl);

    void setShouldFetchConfigs(boolean should);

    boolean shouldFetchConfigs();
}
