package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.vm.CourseFeedVM;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/mi/health/course/vm/CourseFeedVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "api", "Lcom/mi/health/course/api/CourseRequest;", "getApi", "()Lcom/mi/health/course/api/CourseRequest;", "setApi", "(Lcom/mi/health/course/api/CourseRequest;)V", "hasMore", "", "nextKey", "", "tag", DailyRecordKey.sportType, "", "stateData", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/health/course/vm/FeedData;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "reqList", "", "more", "initData", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseFeedVM extends AbsViewModel {
    public CourseRequest api;

    @Nullable
    private String nextKey;
    private int sportType;
    private String tag;
    private boolean hasMore = true;

    @NotNull
    private final StateData<List<CourseModel.CourseData>> stateData = new StateData<>();

    @NotNull
    private final MutableLiveData<FeedData> liveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseFeedVM$reqList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseFeedVM$reqList$1", f = "CourseFeedVM.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $more;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$more = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseFeedVM.this.new AnonymousClass1(this.$more, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequest api = CourseFeedVM.this.getApi();
                int i2 = CourseFeedVM.this.sportType;
                String str2 = CourseFeedVM.this.tag;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tag");
                    str = null;
                } else {
                    str = str2;
                }
                String str3 = CourseFeedVM.this.nextKey;
                this.label = 1;
                obj = api.getCourseList(i2, str, str3, 25, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseListData courseListData = (CourseModel.CourseListData) obj;
            List<CourseModel.CourseData> list = courseListData != null ? courseListData.courseList : null;
            CourseFeedVM.this.nextKey = courseListData != null ? courseListData.nextKey : null;
            CourseFeedVM courseFeedVM = CourseFeedVM.this;
            String str4 = courseFeedVM.nextKey;
            courseFeedVM.hasMore = (str4 == null || str4.length() == 0 || list == null || list.size() < 25) ? false : true;
            MutableLiveData<FeedData> liveData = CourseFeedVM.this.getLiveData();
            StateData stateDataA = (list == null || list.isEmpty()) ? CourseFeedVM.this.stateData.a() : CourseFeedVM.this.stateData.r(list);
            Intrinsics.checkNotNull(stateDataA);
            liveData.setValue(new FeedData(stateDataA, this.$more));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ void reqList$default(CourseFeedVM courseFeedVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        courseFeedVM.reqList(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqList$lambda$0(CourseFeedVM this$0, boolean z, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CourseFeedVM", "reqList: " + it);
        MutableLiveData<FeedData> mutableLiveData = this$0.liveData;
        StateData<List<CourseModel.CourseData>> stateDataF = this$0.stateData.f(it);
        Intrinsics.checkNotNullExpressionValue(stateDataF, "exception(...)");
        mutableLiveData.setValue(new FeedData(stateDataF, z));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final CourseRequest getApi() {
        CourseRequest courseRequest = this.api;
        if (courseRequest != null) {
            return courseRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    @NotNull
    public final MutableLiveData<FeedData> getLiveData() {
        return this.liveData;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final void initData(@NotNull String tag, int sportType) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.sportType = sportType;
    }

    public final void reqList(final boolean more) {
        if (!more) {
            MutableLiveData<FeedData> mutableLiveData = this.liveData;
            StateData<List<CourseModel.CourseData>> stateDataL = this.stateData.l();
            Intrinsics.checkNotNullExpressionValue(stateDataL, "loading(...)");
            mutableLiveData.setValue(new FeedData(stateDataL, false));
        }
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(more, null), 1, null).m503catch(new Function2() { // from class: yq4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseFeedVM.reqList$lambda$0(this.f40421a, more, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void setApi(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.api = courseRequest;
    }
}
