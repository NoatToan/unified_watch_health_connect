package com.mi.health.course.activity.eco;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.mi.health.course.activity.eco.EcoCourseInfoVM;
import com.mi.health.course.api.CourseRequest;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.extension.EcoDeviceModelExtKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack;
import defpackage.fs9;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\t\b\u0007¢\u0006\u0004\b@\u0010AJ#\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\u00020,8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006C"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoCourseInfoVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "Lfs9;", "", "key", "findEco", "([Lfs9;I)Lfs9;", "", "id", "", "reqInfo", "(J)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function1;", "", "callback", "readEcoSettingConfig", "(Lkotlin/jvm/functions/Function1;)V", "value", "setEcoSettingItem", "(IILkotlin/jvm/functions/Function1;)V", "Lcom/mi/health/course/api/CourseRequest;", "api", "Lcom/mi/health/course/api/CourseRequest;", "getApi", "()Lcom/mi/health/course/api/CourseRequest;", "setApi", "(Lcom/mi/health/course/api/CourseRequest;)V", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", "data$delegate", "Lkotlin/Lazy;", "getData", "()Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "data", "Landroidx/lifecycle/MutableLiveData;", "emitter$delegate", "getEmitter", "()Landroidx/lifecycle/MutableLiveData;", "emitter", "", "model", "Ljava/lang/String;", "getModel", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "mEcoSettingList", "[Lfs9;", "SWITCH_OFF", "I", "getSWITCH_OFF", "()I", "SWITCH_ON", "getSWITCH_ON", "<init>", "()V", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoCourseInfoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoCourseInfoVM.kt\ncom/mi/health/course/activity/eco/EcoCourseInfoVM\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n13402#2,2:120\n*S KotlinDebug\n*F\n+ 1 EcoCourseInfoVM.kt\ncom/mi/health/course/activity/eco/EcoCourseInfoVM\n*L\n65#1:120,2\n*E\n"})
public final class EcoCourseInfoVM extends AbsViewModel {

    @NotNull
    private static final String TAG = "EcoCourseInfoVM";
    private final int SWITCH_OFF;
    public CourseRequest api;

    /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy data = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ln7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseInfoVM.data_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: emitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy emitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nn7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoCourseInfoVM.emitter_delegate$lambda$1();
        }
    });

    @NotNull
    private final String model = "runmi.exbike.jscrm1";

    @Nullable
    private EcoDeviceModel mDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel("runmi.exbike.jscrm1");

    @Nullable
    private fs9[] mEcoSettingList = new fs9[0];
    private final int SWITCH_ON = 1;

    /* JADX INFO: renamed from: com.mi.health.course.activity.eco.EcoCourseInfoVM$reqInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.activity.eco.EcoCourseInfoVM$reqInfo$1", f = "EcoCourseInfoVM.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14231(long j, Continuation<? super C14231> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoCourseInfoVM.this.new C14231(this.$id, continuation);
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
            return ((C14231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public final fs9 findEco(fs9[] fs9VarArr, int i) {
        for (fs9 fs9Var : fs9VarArr) {
            if (fs9Var.c == i) {
                return fs9Var;
            }
        }
        return null;
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
        FitnessLogUtils.d(TAG, "reqInfo: " + it.getMessage());
        this$0.getEmitter().setValue(this$0.getData().f(it));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        if (this.mDeviceModel == null) {
            this.mDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
        }
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

    @Nullable
    public final EcoDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final int getSWITCH_OFF() {
        return this.SWITCH_OFF;
    }

    public final int getSWITCH_ON() {
        return this.SWITCH_ON;
    }

    public final void readEcoSettingConfig(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.mDeviceModel == null) {
            this.mDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
        }
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel != null) {
            EcoDeviceModelExtKt.getEcoGYMSettings(ecoDeviceModel, new DeviceTaskCallBack<fs9[]>() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoVM.readEcoSettingConfig.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
                public void onError(int errorCode) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new EcoCourseInfoVM$readEcoSettingConfig$1$onError$1(callback, null));
                }

                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
                public void onResult(fs9[] result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    ScopeExtKt.scope(Dispatchers.getMain(), new EcoCourseInfoVM$readEcoSettingConfig$1$onResult$1(EcoCourseInfoVM.this, result, callback, null));
                }
            });
        }
    }

    public final void reqInfo(long id) {
        androidx.lifecycle.ScopeExtKt.scopeNetLife$default(this, null, new C14231(id, null), 1, null).m503catch(new Function2() { // from class: jn7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoCourseInfoVM.reqInfo$lambda$2(this.f22940a, (AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    public final void setApi(@NotNull CourseRequest courseRequest) {
        Intrinsics.checkNotNullParameter(courseRequest, "<set-?>");
        this.api = courseRequest;
    }

    public final void setEcoSettingItem(final int key, final int value, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        fs9 fs9Var = new fs9();
        fs9Var.c = key;
        fs9Var.d = value;
        Unit unit = Unit.INSTANCE;
        fs9[] fs9VarArr = {fs9Var};
        if (this.mDeviceModel == null) {
            this.mDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.model);
        }
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel != null) {
            EcoDeviceModelExtKt.setEcoGYMSettings(ecoDeviceModel, fs9VarArr, new DeviceTaskCallBack<Boolean>() { // from class: com.mi.health.course.activity.eco.EcoCourseInfoVM.setEcoSettingItem.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
                public void onError(int errorCode) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new EcoCourseInfoVM$setEcoSettingItem$1$onError$1(key, value, errorCode, callback, null));
                }

                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.DeviceTaskCallBack
                public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                    onResult(bool.booleanValue());
                }

                public void onResult(boolean result) {
                    ScopeExtKt.scope(Dispatchers.getMain(), new EcoCourseInfoVM$setEcoSettingItem$1$onResult$1(key, value, callback, null));
                }
            });
        }
    }

    public final void setMDeviceModel(@Nullable EcoDeviceModel ecoDeviceModel) {
        this.mDeviceModel = ecoDeviceModel;
    }
}
