package com.huami.training.navigation;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u001c\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/training/navigation/NavigationController;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "navigateToPlanDetailPage", "navigateToCreatePlanPage", "", "url", "navigateToWebPage", "navigateToTrainingEntrance", "", "courseId", "Lcom/huami/training/dto/TrainingType;", "trainingType", "navigateToTrainingDetail", "jumpType", "navigateToTrainingFilterList", "navigateToSearch", "navigateToJoinedTrainingList", "", "mode", "navigateToSpecialPagerFromAd", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface NavigationController {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void navigateToTrainingFilterList$default(NavigationController navigationController, Context context, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToTrainingFilterList");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            navigationController.navigateToTrainingFilterList(context, str);
        }
    }

    void navigateToCreatePlanPage(@NotNull Context context);

    void navigateToJoinedTrainingList(@NotNull Context context);

    void navigateToPlanDetailPage(@NotNull Context context);

    void navigateToSearch(@NotNull Context context);

    void navigateToSpecialPagerFromAd(@NotNull Context context, @Nullable Integer mode, @Nullable String url);

    void navigateToTrainingDetail(@NotNull Context context, long courseId, @NotNull TrainingType trainingType);

    void navigateToTrainingEntrance(@NotNull Context context);

    void navigateToTrainingFilterList(@NotNull Context context, @Nullable String jumpType);

    void navigateToWebPage(@NotNull Context context, @NotNull String url);
}
