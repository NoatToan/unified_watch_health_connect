package com.mi.health.course.eco.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.eco.vm.EcoCourseInfoVM;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/mi/health/course/eco/vm/EcoCourseInfoVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "api", "Lcom/mi/health/course/api/CourseRequest;", "getApi", "()Lcom/mi/health/course/api/CourseRequest;", "setApi", "(Lcom/mi/health/course/api/CourseRequest;)V", "data", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "getData", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "data$delegate", "Lkotlin/Lazy;", "emitter", "Landroidx/lifecycle/MutableLiveData;", "getEmitter", "()Landroidx/lifecycle/MutableLiveData;", "emitter$delegate", "reqInfo", "", "id", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoCourseInfoVM extends AbsViewModel {
    public CourseRequest api;

    /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy data = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: in7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseInfoVM.data_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: emitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kn7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseInfoVM.emitter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.mi.health.course.eco.vm.EcoCourseInfoVM$reqInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.eco.vm.EcoCourseInfoVM$reqInfo$1", f = "EcoCourseInfoVM.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
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
            return EcoCourseInfoVM.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CourseAllInfo courseAllInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequest api = EcoCourseInfoVM.this.getApi();
                long j = this.$id;
                this.label = 1;
                obj = api.getCourseDetail(j, this);
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
            EcoCourseInfoVM.this.getEmitter().setValue(courseDetailResult != null ? EcoCourseInfoVM.this.getData().r(courseDetailResult) : EcoCourseInfoVM.this.getData().a());
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
    public static final Unit reqInfo$lambda$2(EcoCourseInfoVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("EcoCourseInfoVM", "reqInfo: " + it.getMessage());
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
    public final MutableLiveData<StateData<CourseModel.CourseDetailResult>> getEmitter() {
        return (MutableLiveData) this.emitter.getValue();
    }

    public final void reqInfo(long id) {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(id, null), 1, null).m503catch(new Function2() { // from class: mn7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoCourseInfoVM.reqInfo$lambda$2(this.f27022a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void setApi(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.api = courseRequest;
    }
}
