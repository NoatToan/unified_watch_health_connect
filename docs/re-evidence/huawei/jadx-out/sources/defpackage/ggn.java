package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.basefitnessadvice.model.NavigationFilter;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.basefitnessadvice.model.TrainStatistics;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.model.model.fitness.FitnessHistoryModel;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseStatusCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import com.huawei.pluginfitnessadvice.TrainAction;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.pluginfitnessadvice.course.EssenceVideoInfo;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = CourseApi.class)
@Singleton
public class ggn implements CourseApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseStatusCallback f35066a;

    @Override // com.huawei.health.course.api.CourseApi
    public void collectCourse(String str, String str2) {
        gls.b().collectBehavior(str, str2);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void collectCourse(String str, int i, UiCallback<Boolean> uiCallback) {
        gls.b().collectBehavior(str, i, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    @Deprecated
    public void uncollectCourse(String str) {
        gls.b().deleteBehavior(str, 0);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void uncollectCourse(String str, int i) {
        gls.b().deleteBehavior(str, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void isCourseCollected(String str, UiCallback<Boolean> uiCallback) {
        gls.b().getCollectBehavior(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getUserCourseList(int i, int i2, int i3, String str, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getUserCourseList: callback is null.");
        } else {
            gls.b().getBehaviorList(i, i2, i3, str, new UiCallback<List<Workout>>() { // from class: ggn.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i4, String str2) {
                    uiCallback.onFailure(i4, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    uiCallback.onSuccess(list);
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    @Deprecated
    public void postUserCourse(String str, String str2, int i) {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveWorkoutId(str);
        workoutRecord.saveVersion(str2);
        gls.b().postExerciseBehavior(workoutRecord, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void postUserCourse(WorkoutRecord workoutRecord, int i) {
        gls.b().postExerciseBehavior(workoutRecord, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getJoinedCourses(final WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        LogUtil.a("CourseImpl", "enter getJoinedCourses");
        if (workoutListBean == null || uiCallback == null) {
            LogUtil.e("CourseImpl", "getJoinedCourses: workoutListBean or call back is null.");
        } else {
            btt.d().c(new Runnable() { // from class: ggk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(workoutListBean, uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        gls.b().getJoinedWorkouts(workoutListBean.getPageStart(), workoutListBean.getPageSize(), workoutListBean.getWorkoutType(), workoutListBean.getDifficulty(), workoutListBean.getTrainingPoints(), workoutListBean.getSupportWear(), workoutListBean.getEquipments(), workoutListBean.getCommodityFlag(), new UiCallback<List<FitWorkout>>() { // from class: ggn.6
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list) {
                uiCallback.onSuccess(pea.f(list));
            }
        });
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void deleteUserJoinedCourses(List<Workout> list, UiCallback<String> uiCallback) {
        gls.b().postDeleteUserWorkout(list, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void searchCourseList(int i, int i2, String str, String str2, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "searchCourseList: callback is null.");
        } else {
            gls.b().searchWorkoutList(i, i2, str, gnv.a(str2), new UiCallback<List<FitWorkout>>() { // from class: ggn.9
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str3) {
                    uiCallback.onFailure(i3, str3);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseFilters(String str, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseFilters: callback is null.");
        } else {
            gls.b().getWorkoutFilters(gnv.a(str), uiCallback);
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getAggregatePageByType(int i, UiCallback<NavigationFilter> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseFilters: callback is null.");
        } else {
            gls.b().getAggregatePageByType(i, uiCallback);
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCoursesWithinCurrentPlan(int i, UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCoursesWithinCurrentPlan: callback is null.");
            return;
        }
        if (i != 0) {
            LogUtil.e("CourseImpl", "getCoursesWithinCurrentPlan: planType not support yet.");
            uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, ResultUtil.c(ResultUtil.ResultCode.PARAMETER_INVALID));
            return;
        }
        List<RunWorkout> runWorkouts = gls.b().getRunWorkouts();
        if (njy.e(runWorkouts)) {
            LogUtil.e("CourseImpl", "getCoursesWithinCurrentPlan: runWorkouts is empty.");
            uiCallback.onFailure(20004, ResultUtil.c(20004));
        } else {
            gnt.e((RunWorkout[]) runWorkouts.toArray(new RunWorkout[0]));
            List<Workout> arrayList = new ArrayList<>(runWorkouts.size());
            arrayList.addAll(runWorkouts);
            uiCallback.onSuccess(arrayList);
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public Workout getCourseWithinCurrentPlanById(int i, String str) {
        if (i != 0) {
            LogUtil.e("CourseImpl", "getCouseWithinCurrentPlanById: planType not support yet.");
            return null;
        }
        return gls.b().getRunWorkout(str);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCoursesBySecondClassifyId(int i, int i2, int i3, int i4, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCoursesBySecondClassifyId: callback is null.");
        } else {
            gls.b().getWorkoutList(i, i2, i3, i4, new UiCallback<List<FitWorkout>>() { // from class: ggn.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i5, String str) {
                    uiCallback.onFailure(i5, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    /* JADX INFO: renamed from: getCoursesByFilter, reason: merged with bridge method [inline-methods] */
    public void d(final WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        if (workoutListBean == null || uiCallback == null) {
            LogUtil.e("CourseImpl", "getCoursesByFilter: workoutListBean is null or callback is null.");
        } else if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: ggo
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(workoutListBean, uiCallback);
                }
            });
        } else {
            gls.b().getFilterFitnessCourses(workoutListBean, new AnonymousClass7(uiCallback));
        }
    }

    /* JADX INFO: renamed from: ggn$7, reason: invalid class name */
    class AnonymousClass7 extends UiCallback<List<Workout>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiCallback f35081c;

        AnonymousClass7(UiCallback uiCallback) {
            this.f35081c = uiCallback;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            final UiCallback uiCallback = this.f35081c;
            HandlerExecutor.b(new Runnable() { // from class: ggr
                @Override // java.lang.Runnable
                public final void run() {
                    uiCallback.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<Workout> list) {
            final UiCallback uiCallback = this.f35081c;
            HandlerExecutor.b(new Runnable() { // from class: ggs
                @Override // java.lang.Runnable
                public final void run() {
                    uiCallback.onSuccess(list);
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCoursesByTopicId(int i, int i2, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCoursesByTopicId: callback is null.");
        } else {
            gls.b().getWorkoutsByTopicId(i, i2, new UiCallback<List<FitWorkout>>() { // from class: ggn.10
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str) {
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseTopicList(int i, final UiCallback<List<Topic>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseTopicList: callback is null.");
        } else {
            gls.b().getFitnessCourseTopicList(i, new UiCallback<List<Topic>>() { // from class: ggn.13
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    uiCallback.onFailure(i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Topic> list) {
                    uiCallback.onSuccess(list);
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseTopicList(int i, int i2, final UiCallback<List<Topic>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseTopicList: callback is null.");
        } else {
            gls.b().getFitnessCourseTopicList(i, i2, new UiCallback<List<Topic>>() { // from class: ggn.12
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str) {
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Topic> list) {
                    uiCallback.onSuccess(list);
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    @Deprecated
    public void getCourseById(String str, String str2, String str3, UiCallback<Workout> uiCallback) {
        getCourseById(new gzl.a(str).d(str2).a(str3).c(), uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseById(gzl gzlVar, final UiCallback<Workout> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseById: callback is null.");
            return;
        }
        if (TextUtils.isEmpty(gzlVar.d())) {
            gzlVar = new gzl.a(gzlVar.g()).d(gzlVar.i()).d(gzlVar.b()).b(gzlVar.a()).a(gld.d()).a(gzlVar.e()).c();
        }
        gls.b().getWorkout(gzlVar, new UiCallback<FitWorkout>() { // from class: ggn.15
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(FitWorkout fitWorkout) {
                uiCallback.onSuccess(fitWorkout);
            }
        });
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseByIds(List<gzl> list, boolean z, UiCallback<List<FitWorkout>> uiCallback) {
        if (njy.e(list)) {
            LogUtil.e("CourseImpl", "getCourseByIds: paramList is empty.");
            uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, ResultUtil.c(ResultUtil.ResultCode.PARAMETER_INVALID));
        } else {
            gls.b().getWorkoutsInfo(list, z, uiCallback);
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseByType(int i, int i2, int i3, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getCourseByType: callback is null.");
        } else {
            gls.b().getWorkoutsByType(i, i2, i3, new UiCallback<List<FitWorkout>>() { // from class: ggn.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i4, String str) {
                    uiCallback.onFailure(i4, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getRecommendCourses(String str, WorkoutListBean workoutListBean, UiCallback<List<Workout>> uiCallback) {
        if (str.equals("RUNNING_COURSE")) {
            LogUtil.e("CourseImpl", "getRecommendCourses: not support RUNNING_COURSE_WORKOUT_TYPE yet.");
        } else if (str.equals("FITNESS_COURSE")) {
            c(workoutListBean, uiCallback);
        } else {
            LogUtil.e("CourseImpl", "getRecommendCourses: courseType not match.");
        }
    }

    private void c(final WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        if (workoutListBean == null || uiCallback == null) {
            LogUtil.e("CourseImpl", "doGetRecommendFitnessCourse: wokoutListBean or callback is null.");
        } else {
            btt.d().c(new Runnable() { // from class: ggl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35061a.b(workoutListBean, uiCallback);
                }
            });
        }
    }

    /* synthetic */ void b(WorkoutListBean workoutListBean, final UiCallback uiCallback) {
        gls.b().getRecommendWorkouts(workoutListBean.getPageStart(), workoutListBean.getPageSize(), workoutListBean.getClassList(), workoutListBean.getDifficulty(), workoutListBean.getTrainingPoints(), workoutListBean.getSupportWear(), workoutListBean.getEquipments(), workoutListBean.getCommodityFlag(), new UiCallback<List<FitWorkout>>() { // from class: ggn.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list) {
                uiCallback.onSuccess(pea.f(list));
            }
        });
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getRecommendCoursesByRules(final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getRecommendCoursesByRules: callback is null.");
        } else {
            gls.b().getWorkoutRecommendList(new UiCallback<List<FitWorkout>>() { // from class: ggn.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getRecWorkoutByCourseType(int i, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("CourseImpl", "getRecommendCoursesByRules: callback is null.");
        } else {
            gls.b().getRecWorkoutByCourseTypeList(i, new UiCallback<List<FitWorkout>>() { // from class: ggn.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    uiCallback.onFailure(i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list) {
                    uiCallback.onSuccess(pea.f(list));
                }
            });
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getRecommendCourseByCloud(DataCallback dataCallback) {
        ghw.b().getRunRecommendCourse(dataCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseRecommendIndexList(RunCourseRecommendCallback runCourseRecommendCallback) {
        new gnp().b(runCourseRecommendCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseActionList(int i, int i2, int i3, int i4, UiCallback<List<AtomicAction>> uiCallback) {
        gls.b().getActionList(i, i2, i3, i4, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void searchCourseActionList(int i, int i2, int i3, String str, UiCallback<List<AtomicAction>> uiCallback) {
        gls.b().searchActionList(i, i2, i3, str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseActionInfo(String str, String str2, UiCallback<AtomicAction> uiCallback) {
        gls.b().getFitnessActionInfo(str, str2, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseTrainAction(List<String> list, UiCallback<List<TrainAction>> uiCallback) {
        gls.b().getActions(list, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public int getCourseMediaFilesLength(String str, String str2) {
        return gls.b().getWorkoutMediaFilesLength(str, str2);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public boolean isCourseMediaFileDownloaded(String str, String str2, int i) {
        return gls.b().isWorkoutMediaFileHasDownloaded(str, str2, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public int getCourseMediaFileSize(String str, String str2, int i) {
        return gls.b().acquireWorkoutMediaFileSize(str, str2, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void downloadCourseMediaFiles(gzd gzdVar, UiCallback<String> uiCallback) {
        gls.b().downloadWorkoutMediaFiles(gzdVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void downloadCourseMediaFileByPosition(String str, String str2, int i, UiCallback<String> uiCallback) {
        gls.b().downloadWorkoutMediaFileByPosition(str, str2, uiCallback, i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void downloadCourseMediaFileList(List<Media> list, long j, UiCallback<String> uiCallback) {
        gls.b().downloadWorkoutMediaFile(list, j, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void cancelDownloadCourseMediaFiles(gzd gzdVar) {
        gls.b().cancelDownloadWorkoutMediaFiles(gzdVar);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void cancelDownloadCourseMediaFiles(String str) {
        ghw.b().cancelDownloadFile(str);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void downloadSubtitles(String str, UiCallback<String> uiCallback) {
        gls.b().downloadSubtitles(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void downloadFile(String str, String str2, UiCallback<String> uiCallback, boolean z) {
        gls.b().downloadFile(str, str2, uiCallback, z);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void queryTrainCountByCourseId(String str, UiCallback<Integer> uiCallback) {
        gls.b().queryTrainCountByWorkoutId(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseTrainStatistics(int i, UiCallback<TrainStatistics> uiCallback) {
        gls.b().getTrainStatistics(i, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void saveCourseTrainstatis(WorkoutRecord workoutRecord) {
        gls.b().savetrainstatis(workoutRecord);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public WorkoutRecord acquireWorkoutRecordByRecordId(int i) {
        return FitnessHistoryModel.getInstance().acquireWorkoutRecordByRecordId(i);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public long getCourseUseCacheSize() {
        return gls.b().getUseCacheSize();
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void delCourseUseCache(UiCallback<Boolean> uiCallback) {
        gls.b().delUseCache(uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void updateCourseDataState() {
        LogUtil.a("CourseImpl", "CourseImpl updateCourseDataState");
        glw.c().b();
        btq.e().e("CACHE_CLEAR");
    }

    @Override // com.huawei.health.course.api.CourseApi
    public List<WorkoutRecord> getWorkoutRecords(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return gls.b().getWorkoutRecords(str);
        }
        return gls.b().getWorkoutRecords(str, str2, str3);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public List<WorkoutRecord> getWorkoutRecords(String str, UiCallback<List<WorkoutRecord>> uiCallback) {
        return gls.b().getWorkoutRecords(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    @Deprecated
    public void getCourseLongVideoInfo(String str, UiCallback<LongVideoInfo> uiCallback) {
        getCourseLongVideoInfo(new gzl.a(str).c(), uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getCourseLongVideoInfo(gzl gzlVar, UiCallback<LongVideoInfo> uiCallback) {
        gls.b().getLongVideoInfo(gzlVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void queryEssenceVideos(String str, UiCallback<List<EssenceVideoInfo>> uiCallback) {
        gls.b().queryEssenceVideos(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void uploadBehavior(pdh pdhVar, UiCallback<Boolean> uiCallback) {
        gls.b().uploadBehavior(pdhVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getWorkoutCount(String str, String str2, UiCallback<Integer> uiCallback) {
        gls.b().getWorkoutCount(new gzl.a(str).d(str2).c(), uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void registerFitnessCourseStatusListen(IBaseStatusCallback iBaseStatusCallback) {
        LogUtil.a("CourseImpl", "registerFitnessCourseStatusListen enter");
        this.f35066a = iBaseStatusCallback;
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void markFitnessCourseStatusOccupied() {
        LogUtil.a("CourseImpl", "mark MotionTrack status onOccupied");
        IBaseStatusCallback iBaseStatusCallback = this.f35066a;
        if (iBaseStatusCallback != null) {
            iBaseStatusCallback.onOccupied();
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void markFitnessCourseStatusAvailable() {
        LogUtil.a("CourseImpl", "mark MotionTrack status onOccupied");
        IBaseStatusCallback iBaseStatusCallback = this.f35066a;
        if (iBaseStatusCallback != null) {
            iBaseStatusCallback.onAvailable();
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public int getTodayTaskStatus(long j) {
        return gme.c().b(j);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public boolean hasDoneTodayRunTask(Plan plan) {
        if (plan == null) {
            LogUtil.j("CourseImpl", "hasDoneTodayRunTask failed, plan == null");
            return false;
        }
        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(plan.acquireId());
        long jA = ift.a(System.currentTimeMillis());
        for (WorkoutRecord workoutRecord : workoutRecords) {
            if (workoutRecord != null && jA == ift.a(workoutRecord.acquireExerciseTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void addUserDefinedWorkout(FitWorkout fitWorkout, UiCallback<FitWorkout> uiCallback) {
        gls.b().addUserDefinedWorkout(fitWorkout, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void modifyUserDefinedWorkout(FitWorkout fitWorkout, UiCallback<FitWorkout> uiCallback) {
        gls.b().modifyUserDefinedWorkout(fitWorkout, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void deleteUserDefinedWorkout(String str, int i, UiCallback<String> uiCallback) {
        gls.b().deleteUserDefinedWorkout(str, i, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public WorkoutRecord acquireWorkoutRecordByExerciseTime(String str, long j, String str2) {
        return gmv.b(str, j, str2);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void queryAudiosPackageBySeriesId(String str, UiCallback<List<SleepAudioPackage>> uiCallback) {
        gls.b().queryAudiosPackageBySeriesId(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getAudioBehaviorList(int i, int i2, int i3, int i4, UiCallback<List<SleepAudioSeries>> uiCallback) {
        gls.b().getAudioBehaviorList(i, i2, i3, i4, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getAudioBehaviorList(gzc gzcVar, UiCallback<List<SleepAudioSeries>> uiCallback) {
        gls.b().getAudioBehaviorList(gzcVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getRecommendResource(List<String> list, UiCallback<pcn> uiCallback) {
        gls.b().getRecommendResource(list, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void operateFavoriteAudio(int i, int i2, UiCallback<Boolean> uiCallback) {
        gls.b().operateFavoriteAudio(i, i2, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void deletePlayRecord(List<Integer> list, UiCallback<Boolean> uiCallback) {
        gls.b().deletePlayRecord(list, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getWorkoutPackageById(gzj gzjVar, UiCallback<WorkoutPackageInfo> uiCallback) {
        if (TextUtils.isEmpty(gzjVar.d())) {
            gzjVar = new gzj.c(gzjVar.e()).c(gld.d()).c();
        }
        gls.b().getWorkoutPackageById(gzjVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public FitWorkout getFitWorkout(String str, String str2) {
        return gls.b().getFitWorkout(str, str2);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public List<Media> getMediaFiles(FitWorkout fitWorkout) {
        return gls.b().getMediaFiles(fitWorkout);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getFitnessActionTemplate(String str, UiCallback<pch> uiCallback) {
        gls.b().getFitnessActionTemplate(str, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getFitnessMaxScore(String str, int i, UiCallback<pcl> uiCallback) {
        gls.b().getFitnessMaxScore(str, i, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void getUserRank(String str, String str2, double d, long j, UiCallback<pcq> uiCallback) {
        git gitVar = new git();
        gitVar.b(str);
        gitVar.a(str2);
        gitVar.a(d);
        gitVar.c(j);
        gls.b().getUserRank(gitVar, uiCallback);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public RecordData coverRecordData(pdr pdrVar) {
        return new ghl().d(pdrVar);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public List<WorkoutRecord> getWorkoutRecords(long j, long j2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("CourseImpl", "getWorkoutRecords(), accountInfo == null");
            return new ArrayList();
        }
        return gmv.a(accountInfo, j, j2);
    }

    @Override // com.huawei.health.course.api.CourseApi
    public void updateCourseDbData(final FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            ReleaseLogUtil.e("CourseImpl", "updateCourseData fitWorkout null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggq
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.e.e(fitWorkout);
                }
            });
        }
    }

    /* synthetic */ void e(FitWorkout fitWorkout) throws Throwable {
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        FitWorkout fitWorkoutA = gmc.g().o().a(huidOrDefault, fitWorkout.acquireId(), fitWorkout.accquireVersion(), gld.d());
        boolean zIsNeedGetFromCloud = isNeedGetFromCloud(fitWorkout, new gzl.a(fitWorkout.acquireId()).d(fitWorkout.accquireVersion()).a(gld.d()).c(), ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo());
        ReleaseLogUtil.d("CourseImpl", "updateCourseDbData isNeedUpdate:", Boolean.valueOf(zIsNeedGetFromCloud));
        if (fitWorkoutA == null || zIsNeedGetFromCloud) {
            glw.c().e(fitWorkout.acquireId(), "", fitWorkout.accquireVersion(), gld.d());
            gmc.g().o().c(huidOrDefault, fitWorkout);
        }
    }

    @Override // com.huawei.health.course.api.CourseApi
    public boolean isNeedGetFromCloud(FitWorkout fitWorkout, gzl gzlVar, UserInfomation userInfomation) {
        if (userInfomation != null) {
            return fitWorkout == null || fitWorkout.acquireCommodityFlag() != 0 || fitWorkout.getTemplateType() == 1 || fitWorkout.getIsAi() == 1 || glw.c().d(gzlVar.g(), glr.d(userInfomation.getGenderOrDefaultValue()), gzlVar.i(), gzlVar.d());
        }
        ReleaseLogUtil.e("CourseImpl", "isNeedGetFromCloud userInfo == null");
        return true;
    }

    @Override // com.huawei.health.course.api.CourseApi
    public boolean homeCountryFitnessDataMigrate(String str) {
        return gls.b().homeCountryFitnessDataMigrate(str);
    }
}
