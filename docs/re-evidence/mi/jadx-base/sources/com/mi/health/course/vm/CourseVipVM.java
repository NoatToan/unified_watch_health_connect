package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.api.CourseVipRequest;
import com.mi.health.course.export.data.CourseMembership;
import com.mi.health.course.vm.CourseVipVM;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.net.scope.AndroidScope;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/mi/health/course/vm/CourseVipVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseVipRequest;", "getRequest", "()Lcom/mi/health/course/api/CourseVipRequest;", "setRequest", "(Lcom/mi/health/course/api/CourseVipRequest;)V", "courseVipInfoData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/health/course/export/data/CourseMembership;", "getCourseVipInfoData", "()Landroidx/lifecycle/MutableLiveData;", "setCourseVipInfoData", "(Landroidx/lifecycle/MutableLiveData;)V", "getCourseVipInfo", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseVipVM extends AbsViewModel {

    @NotNull
    private MutableLiveData<CourseMembership> courseVipInfoData = new MutableLiveData<>();
    public CourseVipRequest request;

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseVipVM$getCourseVipInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseVipVM$getCourseVipInfo$1", f = "CourseVipVM.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseVipVM.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<CourseMembership> courseVipInfoData = CourseVipVM.this.getCourseVipInfoData();
                CourseVipRequest request = CourseVipVM.this.getRequest();
                this.L$0 = courseVipInfoData;
                this.label = 1;
                Object courseVip = request.getCourseVip(this);
                if (courseVip == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = courseVipInfoData;
                obj = courseVip;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            ((CourseMembership) obj).setStatus(StateData.Status.SUCCESS);
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseVipInfo$lambda$0(CourseVipVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.courseVipInfoData.postValue(new CourseMembership(null, ((it.getCause() instanceof UnknownHostException) || (it.getCause() instanceof SocketTimeoutException)) ? StateData.Status.NO_NET : StateData.Status.ERROR));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getCourseVipInfo() {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(null), 1, null).m503catch(new Function2() { // from class: g05
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseVipVM.getCourseVipInfo$lambda$0(this.f18411a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @NotNull
    public final MutableLiveData<CourseMembership> getCourseVipInfoData() {
        return this.courseVipInfoData;
    }

    @NotNull
    public final CourseVipRequest getRequest() {
        CourseVipRequest courseVipRequest = this.request;
        if (courseVipRequest != null) {
            return courseVipRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final void setCourseVipInfoData(@NotNull MutableLiveData<CourseMembership> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.courseVipInfoData = mutableLiveData;
    }

    public final void setRequest(@NotNull CourseVipRequest courseVipRequest) {
        Intrinsics.checkNotNullParameter(courseVipRequest, "<set-?>");
        this.request = courseVipRequest;
    }
}
