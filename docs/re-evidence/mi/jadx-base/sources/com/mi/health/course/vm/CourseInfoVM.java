package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.vm.CourseInfoVM;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.scope.AndroidScope;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/mi/health/course/vm/CourseInfoVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "apiV3", "Lcom/mi/health/course/api/CourseRequestV3;", "getApiV3", "()Lcom/mi/health/course/api/CourseRequestV3;", "setApiV3", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "api", "Lcom/mi/health/course/api/CourseRequest;", "getApi", "()Lcom/mi/health/course/api/CourseRequest;", "setApi", "(Lcom/mi/health/course/api/CourseRequest;)V", "data", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "getData", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "data$delegate", "Lkotlin/Lazy;", "emitter", "Landroidx/lifecycle/MutableLiveData;", "getEmitter", "()Landroidx/lifecycle/MutableLiveData;", "emitter$delegate", "reqInfo", "", "id", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseInfoVM extends AbsViewModel {
    public CourseRequest api;
    public CourseRequestV3 apiV3;

    /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy data = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qt4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseInfoVM.data_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: emitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rt4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseInfoVM.emitter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseInfoVM$reqInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseInfoVM$reqInfo$1", f = "CourseInfoVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseInfoVM.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CourseAllInfo courseAllInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequestV3 apiV3 = CourseInfoVM.this.getApiV3();
                long j = this.$id;
                this.label = 1;
                obj = apiV3.getCourseDetail(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseModel.CourseDetailResult courseDetailResult = (CourseModel.CourseDetailResult) obj;
            if (courseDetailResult != null && (courseAllInfo = courseDetailResult.allInfo) != null) {
                courseAllInfo.genConfig();
            }
            CourseInfoVM.this.getEmitter().setValue(courseDetailResult != null ? CourseInfoVM.this.getData().r(courseDetailResult) : CourseInfoVM.this.getData().a());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateData data_delegate$lambda$0() {
        return new StateData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData emitter_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateData<CourseModel.CourseDetailResult> getData() {
        return (StateData) this.data.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqInfo$lambda$2(CourseInfoVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("CourseInfoVm", "reqInfo: " + it.getMessage());
        this$0.getEmitter().setValue(this$0.getData().f(it));
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
    public final CourseRequestV3 getApiV3() {
        CourseRequestV3 courseRequestV3 = this.apiV3;
        if (courseRequestV3 != null) {
            return courseRequestV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apiV3");
        return null;
    }

    @NotNull
    public final MutableLiveData<StateData<CourseModel.CourseDetailResult>> getEmitter() {
        return (MutableLiveData) this.emitter.getValue();
    }

    public final void reqInfo(long id) {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(id, null), 1, null).m503catch(new Function2() { // from class: st4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseInfoVM.reqInfo$lambda$2(this.f33963a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void setApi(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.api = courseRequest;
    }

    public final void setApiV3(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.apiV3 = courseRequestV3;
    }
}
