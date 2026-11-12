package com.mi.health.course.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.export.data.CourseSeriesInfoData;
import com.mi.health.course.vm.CourseSeriesVM;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.log.Logger;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/mi/health/course/vm/CourseSeriesVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "request", "Lcom/mi/health/course/api/CourseRequestV3;", "getRequest", "()Lcom/mi/health/course/api/CourseRequestV3;", "setRequest", "(Lcom/mi/health/course/api/CourseRequestV3;)V", "seriesInfoData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/health/course/export/data/CourseSeriesInfoData;", "getSeriesInfoData", "()Landroidx/lifecycle/MutableLiveData;", "setSeriesInfoData", "(Landroidx/lifecycle/MutableLiveData;)V", "getSeriesInfo", "", "id", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseSeriesVM extends AbsViewModel {
    public CourseRequestV3 request;

    @NotNull
    private MutableLiveData<CourseSeriesInfoData> seriesInfoData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.mi.health.course.vm.CourseSeriesVM$getSeriesInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.vm.CourseSeriesVM$getSeriesInfo$1", f = "CourseSeriesVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
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
            return CourseSeriesVM.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseRequestV3 request = CourseSeriesVM.this.getRequest();
                long j = this.$id;
                this.label = 1;
                obj = request.getSeriesInfo(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CourseSeriesInfoData courseSeriesInfoData = (CourseSeriesInfoData) obj;
            Logger.d("CourseSeriesVM", "getSeriesInfo " + courseSeriesInfoData);
            MutableLiveData<CourseSeriesInfoData> seriesInfoData = CourseSeriesVM.this.getSeriesInfoData();
            courseSeriesInfoData.setStatus(StateData.Status.SUCCESS);
            seriesInfoData.postValue(courseSeriesInfoData);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSeriesInfo$lambda$0(CourseSeriesVM this$0, AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        Logger.d("CourseSeriesVM", "result onFailure:" + it);
        this$0.seriesInfoData.postValue(new CourseSeriesInfoData(null, ((it.getCause() instanceof UnknownHostException) || (it.getCause() instanceof SocketTimeoutException)) ? StateData.Status.NO_NET : StateData.Status.ERROR));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final CourseRequestV3 getRequest() {
        CourseRequestV3 courseRequestV3 = this.request;
        if (courseRequestV3 != null) {
            return courseRequestV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("request");
        return null;
    }

    public final void getSeriesInfo(long id) {
        ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass1(id, null), 1, null).m503catch(new Function2() { // from class: fx4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CourseSeriesVM.getSeriesInfo$lambda$0(this.f18336a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @NotNull
    public final MutableLiveData<CourseSeriesInfoData> getSeriesInfoData() {
        return this.seriesInfoData;
    }

    public final void setRequest(@NotNull CourseRequestV3 courseRequestV3) {
        Intrinsics.checkNotNullParameter(courseRequestV3, "<set-?>");
        this.request = courseRequestV3;
    }

    public final void setSeriesInfoData(@NotNull MutableLiveData<CourseSeriesInfoData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.seriesInfoData = mutableLiveData;
    }
}
