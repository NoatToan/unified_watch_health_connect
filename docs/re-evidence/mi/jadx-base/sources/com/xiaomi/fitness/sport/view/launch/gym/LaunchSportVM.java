package com.xiaomi.fitness.sport.view.launch.gym;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseModel;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport.course.CourseMoreData;
import com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM;
import com.xiaomi.fitness.sport.view.launch.gym.data.CourseFirstPageData;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.statistics.StatConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J0\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0006\u0010=\u001a\u00020\u0007J\b\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020\u0007H\u0002J\u0012\u0010A\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0012\u0010D\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010-H\u0002J\b\u0010E\u001a\u00020\u0007H\u0002J\u0014\u0010F\u001a\u00020\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010-H\u0002J\u0012\u0010G\u001a\u00020H2\b\u0010B\u001a\u0004\u0018\u00010-H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020601¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u000e\u00108\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/LaunchSportVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "<init>", "()V", "gymSportStart", "Lkotlin/Function0;", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "addGymSportStartListener", StatConstants.PARAM_START, LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onSportStarted", "code", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "isLocalLaunchSport", "", "onSportRestarted", "onSportPaused", "onSportFinished", "validSport", "ids", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "courseApi", "Lcom/mi/health/course/export/CourseApi;", "getCourseApi", "()Lcom/mi/health/course/export/CourseApi;", "setCourseApi", "(Lcom/mi/health/course/export/CourseApi;)V", "recentEnd", "videoEnd", "recent", "", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourse;", "videoFirst", "Lcom/mi/health/course/export/data/CourseModel$CourseListData;", "nextKey", "", "firstEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sport/view/launch/gym/data/CourseFirstPageData;", "getFirstEmitter", "()Landroidx/lifecycle/MutableLiveData;", "moreEmitter", "Lcom/xiaomi/fitness/sport/course/CourseMoreData;", "getMoreEmitter", "firstVideoRet", "firstRecentRet", "scene", "type", "", "reqData", "reqRecent", "reqVideoFirst", "setFirstPage", "setRecentData", "data", "Lcom/mi/health/course/export/data/CourseModel$PracticedCourseList;", "setVideoFirst", "reqVideoMore", "setVideoMore", "status", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLaunchSportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportVM.kt\ncom/xiaomi/fitness/sport/view/launch/gym/LaunchSportVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class LaunchSportVM extends AbsViewModel implements ISportStateChangedListener {
    public CourseApi courseApi;
    private boolean firstRecentRet;
    private boolean firstVideoRet;

    @Nullable
    private Function0<Unit> gymSportStart;

    @Nullable
    private String nextKey;

    @Nullable
    private List<? extends CourseModel.PracticedCourse> recent;
    private boolean recentEnd;
    private boolean videoEnd;

    @Nullable
    private CourseModel.CourseListData videoFirst;

    @NotNull
    private final MutableLiveData<CourseFirstPageData> firstEmitter = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<CourseMoreData> moreEmitter = new MutableLiveData<>();

    @NotNull
    private final String scene = CourseApiKt.getCourseScene(CourseApiKt.COURSE_PAGE_TREADMILL, "default");

    @NotNull
    private final int[] type = {1};

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqRecent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqRecent$1", f = "LaunchSportVM.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                this.label = 1;
                obj = courseApi.getPracticedCourseList(0, "treadmill", null, 3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.PracticedCourseList practicedCourseList = (CourseModel.PracticedCourseList) new WeakReference(obj).get();
            if (practicedCourseList != null) {
                LaunchSportVM.this.setRecentData(practicedCourseList);
            } else {
                Logger.i("LaunchSportVM", "reqRecent: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqVideoFirst$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqVideoFirst$1", f = "LaunchSportVM.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C30151(Continuation<? super C30151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C30151(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                String str = LaunchSportVM.this.scene;
                int[] iArr = LaunchSportVM.this.type;
                this.label = 1;
                obj = courseApi.getCourseList(str, iArr, null, null, 25, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseListData courseListData = (CourseModel.CourseListData) new WeakReference(obj).get();
            if (courseListData != null) {
                LaunchSportVM.this.setVideoFirst(courseListData);
            } else {
                Logger.i("LaunchSportVM", "reqVideoFirst: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqVideoMore$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.gym.LaunchSportVM$reqVideoMore$1", f = "LaunchSportVM.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C30161(Continuation<? super C30161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportVM.this.new C30161(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseApi courseApi = LaunchSportVM.this.getCourseApi();
                String str = LaunchSportVM.this.scene;
                int[] iArr = LaunchSportVM.this.type;
                String str2 = LaunchSportVM.this.nextKey;
                this.label = 1;
                obj = courseApi.getCourseList(str, iArr, null, str2, 25, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseListData courseListData = (CourseModel.CourseListData) new WeakReference(obj).get();
            if (courseListData != null) {
                LaunchSportVM.this.setVideoMore(courseListData);
            } else {
                Logger.i("LaunchSportVM", "reqVideoMore: data is null");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean isLocalLaunchSport() {
        int appLaunchType = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getAppLaunchType();
        return (appLaunchType == 4 || appLaunchType == 5) ? false : true;
    }

    private final void reqRecent() {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(null), 1, null).m503catch(new Function2() { // from class: e5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqRecent$lambda$0(this.f16281a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqRecent$lambda$0(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqRecent: " + it.getMessage());
        this$0.setRecentData(null);
        return Unit.INSTANCE;
    }

    private final void reqVideoFirst() {
        ScopeExtKt.scopeNetLife$default(this, null, new C30151(null), 1, null).m503catch(new Function2() { // from class: a5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqVideoFirst$lambda$1(this.f638a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqVideoFirst$lambda$1(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqRecent: " + it.getMessage());
        this$0.setVideoFirst(null);
        return Unit.INSTANCE;
    }

    private final void reqVideoMore() {
        ScopeExtKt.scopeNetLife$default(this, null, new C30161(null), 1, null).m503catch(new Function2() { // from class: c5e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchSportVM.reqVideoMore$lambda$2(this.f4941a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqVideoMore$lambda$2(LaunchSportVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("LaunchSportVM", "reqRecent: " + it.getMessage());
        this$0.setVideoMore(null);
        return Unit.INSTANCE;
    }

    private final void setFirstPage() {
        if (this.recentEnd && this.videoEnd) {
            Status status = (this.firstVideoRet && this.firstRecentRet) ? status(this.videoFirst) : Status.FAIL;
            MutableLiveData<CourseFirstPageData> mutableLiveData = this.firstEmitter;
            CourseModel.CourseListData courseListData = this.videoFirst;
            mutableLiveData.setValue(new CourseFirstPageData(courseListData != null ? courseListData.courseList : null, this.recent, status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecentData(CourseModel.PracticedCourseList data) {
        List<? extends CourseModel.PracticedCourse> arrayList;
        if (data == null || (arrayList = data.data) == null) {
            arrayList = new ArrayList<>();
        }
        this.recent = arrayList;
        this.recentEnd = true;
        this.firstRecentRet = data != null;
        setFirstPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoFirst(CourseModel.CourseListData data) {
        this.videoFirst = data;
        this.videoEnd = true;
        this.firstVideoRet = data != null;
        this.nextKey = data != null ? data.nextKey : null;
        setFirstPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoMore(CourseModel.CourseListData data) {
        if (data != null) {
            this.nextKey = data.nextKey;
        }
        this.moreEmitter.setValue(new CourseMoreData(data != null ? data.courseList : null, status(data)));
    }

    public static /* synthetic */ void setVideoMore$default(LaunchSportVM launchSportVM, CourseModel.CourseListData courseListData, int i, Object obj) {
        if ((i & 1) != 0) {
            courseListData = null;
        }
        launchSportVM.setVideoMore(courseListData);
    }

    private final Status status(CourseModel.CourseListData data) {
        String str;
        if (data == null) {
            return Status.FAIL;
        }
        List<CourseModel.CourseData> list = data.courseList;
        if (list != null) {
            Status status = (list.size() < 25 || (str = this.nextKey) == null || str.length() == 0) ? Status.DONE : Status.MORE;
            if (status != null) {
                return status;
            }
        }
        return Status.DONE;
    }

    public final void addGymSportStartListener(@NotNull Function0<Unit> start) {
        Intrinsics.checkNotNullParameter(start, "start");
        this.gymSportStart = start;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).addSportStateChangedListener(LaunchSportVM.class, this);
    }

    @NotNull
    public final CourseApi getCourseApi() {
        CourseApi courseApi = this.courseApi;
        if (courseApi != null) {
            return courseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("courseApi");
        return null;
    }

    @NotNull
    public final MutableLiveData<CourseFirstPageData> getFirstEmitter() {
        return this.firstEmitter;
    }

    @NotNull
    public final MutableLiveData<CourseMoreData> getMoreEmitter() {
        return this.moreEmitter;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        FitnessLogUtils.i("LaunchSportVM", LifecycleConstantKt.ON_DESTROY);
        this.gymSportStart = null;
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeSportStateChangedListener(LaunchSportVM.class);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        Function0<Unit> function0;
        if (sportLaunchType == 1 && isLocalLaunchSport() && (function0 = this.gymSportStart) != null) {
            function0.invoke();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }

    public final void reqData() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            if (this.firstRecentRet && this.firstVideoRet) {
                reqVideoMore();
            }
            if (!this.firstRecentRet) {
                reqRecent();
            }
            if (this.firstVideoRet) {
                return;
            }
            reqVideoFirst();
        }
    }

    public final void setCourseApi(@NotNull CourseApi courseApi) {
        Intrinsics.checkNotNullParameter(courseApi, "<set-?>");
        this.courseApi = courseApi;
    }
}
