package com.xiaomi.hm.health.training;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.amap.api.mapcore.util.hl;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.dto.TrainingType;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.course.TrainingFilterListActivity;
import com.huami.training.ui.joined.JoinedCourseListActivity;
import com.huami.training.ui.search.SearchActivity;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.training.TrainingNavigationController;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.activity.FormulateCurriculumActivity;
import com.xiaomi.hm.health.training.ui.activity.TrainedCourseActivity;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.training.utils.WebBrowserUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/training/TrainingNavigationController;", "Lcom/huami/training/navigation/NavigationController;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", hl.k, "navigateToPlanDetailPage", "navigateToCreatePlanPage", "navigateToTrainingEntrance", "navigateToSearch", "", "url", "navigateToWebPage", "", "courseId", "Lcom/huami/training/dto/TrainingType;", "trainingType", "navigateToTrainingDetail", "jumpType", "navigateToTrainingFilterList", "navigateToJoinedTrainingList", "", "mode", "navigateToSpecialPagerFromAd", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)V", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TrainingNavigationController implements NavigationController {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainingType.values().length];
            iArr[TrainingType.ACTION.ordinal()] = 1;
            iArr[TrainingType.YOGA.ordinal()] = 2;
            iArr[TrainingType.FEATURED_COURSE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable f(TrainingCourse trainingCourse) {
        return trainingCourse != null ? Observable.just(trainingCourse) : RequestTrainingAPI.reqTrainingPlansDetail().map(new Func1() { // from class: fx7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return TrainingNavigationController.g((TrainingCourse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingCourse g(TrainingCourse trainingCourse) {
        TrainingDBUtils.addIntoTrainingCourse(trainingCourse, false);
        return trainingCourse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, LoadingDialogHelper loadingDialogHelper, TrainingCourse trainingCourse) {
        TrainedCourseActivity.startActvity(context, trainingCourse);
        loadingDialogHelper.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LoadingDialogHelper loadingDialogHelper, Throwable th) {
        Loggers.getLogger().w(RequestTrainingAPI.TAG, th, new Supplier() { // from class: cx7
            @Override // com.xiaomi.hm.health.training.api.function.Supplier
            public final Object get() {
                return TrainingNavigationController.j();
            }
        });
        loadingDialogHelper.setFail(com.huami.watch.hmwatchmanager.R.string.loading_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j() {
        return "请求训练计划详细信息发生错误";
    }

    private final void k(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToCreatePlanPage(@NotNull Context context) {
        k(context, new Intent(context, (Class<?>) FormulateCurriculumActivity.class));
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToJoinedTrainingList(@NotNull Context context) {
        k(context, new Intent(context, (Class<?>) JoinedCourseListActivity.class));
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToPlanDetailPage(@NotNull final Context context) {
        final LoadingDialogHelper loadingDialogHelper = new LoadingDialogHelper((Activity) context);
        loadingDialogHelper.showLoading();
        TrainingDBUtils.queryTrainedCourseFastRx().flatMap(new Func1() { // from class: gx7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return TrainingNavigationController.f((TrainingCourse) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: dx7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainingNavigationController.h(context, loadingDialogHelper, (TrainingCourse) obj);
            }
        }, new Action1() { // from class: ex7
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                TrainingNavigationController.i(loadingDialogHelper, (Throwable) obj);
            }
        });
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToSearch(@NotNull Context context) {
        k(context, new Intent(context, (Class<?>) SearchActivity.class));
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToSpecialPagerFromAd(@NotNull Context context, @Nullable Integer mode, @Nullable String url) {
        HMAdManager.doJumpAction$default(context, mode, url, null, null, null, 32, null);
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToTrainingDetail(@NotNull Context context, long courseId, @NotNull TrainingType trainingType) {
        com.xiaomi.hm.health.training.navigation.TrainingNavigationController navigationController = TrainingInjection.get().getNavigationController();
        int i = WhenMappings.$EnumSwitchMapping$0[trainingType.ordinal()];
        if (i == 1 || i == 2) {
            navigationController.navigateToActionOrYogaTrainingDetail(context, courseId);
        } else {
            if (i != 3) {
                return;
            }
            navigationController.navigateToFeaturedCourseDetail(context, String.valueOf(courseId));
        }
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToTrainingEntrance(@NotNull Context context) {
        k(context, new Intent(context, (Class<?>) MainTabActivity.class).putExtra("tab_index", 2));
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToTrainingFilterList(@NotNull Context context, @Nullable String jumpType) {
        Intent intent = new Intent(context, (Class<?>) TrainingFilterListActivity.class);
        if (jumpType == null) {
            jumpType = "";
        }
        k(context, intent.putExtra(TrainingFilterListActivity.JUMP_TYPE, jumpType));
    }

    @Override // com.huami.training.navigation.NavigationController
    public void navigateToWebPage(@NotNull Context context, @NotNull String url) {
        WebBrowserUtils.jump2WebBrowser(context, url, "");
    }
}
