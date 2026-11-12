package com.mi.health.course.activity.eco;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.activity.eco.EcoRoutingActivityViewModel;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.dvq;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoRoutingActivityViewModel;", "Ldvq;", "", "id", "", "reqInfo", "(J)V", "Lcom/mi/health/course/api/CourseRequest;", "api", "Lcom/mi/health/course/api/CourseRequest;", "getApi", "()Lcom/mi/health/course/api/CourseRequest;", "setApi", "(Lcom/mi/health/course/api/CourseRequest;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "data$delegate", "Lkotlin/Lazy;", "getData", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "data", "Landroidx/lifecycle/MutableLiveData;", "emitter$delegate", "getEmitter", "()Landroidx/lifecycle/MutableLiveData;", "emitter", "<init>", "()V", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoRoutingActivityViewModel extends dvq {

    @NotNull
    private static final String TAG = "EcoRoutingActivityViewModel";
    public CourseRequest api;

    /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy data = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iw7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoRoutingActivityViewModel.data_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: emitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jw7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoRoutingActivityViewModel.emitter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoRoutingActivityViewModel$reqInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoRoutingActivityViewModel$reqInfo$1", f = "EcoRoutingActivityViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
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
            return EcoRoutingActivityViewModel.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CourseAllInfo courseAllInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequest api = EcoRoutingActivityViewModel.this.getApi();
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
            EcoRoutingActivityViewModel.this.getEmitter().setValue(courseDetailResult != null ? EcoRoutingActivityViewModel.this.getData().r(courseDetailResult) : EcoRoutingActivityViewModel.this.getData().a());
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
    public static final Unit reqInfo$lambda$2(EcoRoutingActivityViewModel this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getEmitter().setValue(this$0.getData().a());
        return Unit.INSTANCE;
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
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(id, null), 1, null).m503catch(new Function2() { // from class: hw7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoRoutingActivityViewModel.reqInfo$lambda$2(this.f20536a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void setApi(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.api = courseRequest;
    }
}
