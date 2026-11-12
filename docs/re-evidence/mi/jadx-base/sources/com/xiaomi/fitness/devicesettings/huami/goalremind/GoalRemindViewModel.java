package com.xiaomi.fitness.devicesettings.huami.goalremind;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/goalremind/GoalRemindViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "remindSwitch", "Landroidx/lifecycle/MutableLiveData;", "", "getRemindSwitch", "()Landroidx/lifecycle/MutableLiveData;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadGoalRemindSwitch", "readGoalRemindSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGoalRemindSwitch", "switch", "syncGoalRemindConfig", "enable", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalRemindViewModel extends BaseLoadableBindingViewModel {
    public static final int LOAD_SET_ERROR = 5;

    @NotNull
    public static final String TAG = "GoalRemindViewModel";

    @Nullable
    private WearableDeviceModel deviceModel;

    @NotNull
    private final MutableLiveData<Boolean> remindSwitch = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$loadGoalRemindSwitch$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$loadGoalRemindSwitch$1", f = "GoalRemindViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoalRemindViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoalRemindViewModel goalRemindViewModel = GoalRemindViewModel.this;
                this.label = 1;
                obj = goalRemindViewModel.readGoalRemindSetting(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(GoalRemindViewModel.TAG, "loadGoalRemindSwitch enable " + zBooleanValue);
            GoalRemindViewModel.this.getRemindSwitch().postValue(Boxing.boxBoolean(zBooleanValue));
            DeviceSettingsPreference.INSTANCE.setKEY_GOAL_REMIND_ENABLE(zBooleanValue);
            GoalRemindViewModel.this.postDataLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$readGoalRemindSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel", f = "GoalRemindViewModel.kt", i = {}, l = {55}, m = "readGoalRemindSetting", n = {}, s = {})
    public static final class C21591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21591(Continuation<? super C21591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoalRemindViewModel.this.readGoalRemindSetting(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$setGoalRemindSwitch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$setGoalRemindSwitch$1", f = "GoalRemindViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $switch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21601(boolean z, Continuation<? super C21601> continuation) {
            super(2, continuation);
            this.$switch = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoalRemindViewModel.this.new C21601(this.$switch, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoalRemindViewModel goalRemindViewModel = GoalRemindViewModel.this;
                boolean z = this.$switch;
                this.label = 1;
                obj = goalRemindViewModel.syncGoalRemindConfig(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            GoalRemindViewModel.this.postDataLoaded();
            if (zBooleanValue) {
                DeviceSettingsPreference.INSTANCE.setKEY_GOAL_REMIND_ENABLE(this.$switch);
                GoalRemindViewModel.this.getRemindSwitch().postValue(Boxing.boxBoolean(this.$switch));
            } else {
                GoalRemindViewModel.this.postLoadStatus(5);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel$syncGoalRemindConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel", f = "GoalRemindViewModel.kt", i = {}, l = {80}, m = "syncGoalRemindConfig", n = {}, s = {})
    public static final class C21611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21611(Continuation<? super C21611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoalRemindViewModel.this.syncGoalRemindConfig(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readGoalRemindSetting(Continuation<? super Boolean> continuation) {
        C21591 c21591;
        if (continuation instanceof C21591) {
            c21591 = (C21591) continuation;
            int i = c21591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21591.label = i - Integer.MIN_VALUE;
            } else {
                c21591 = new C21591(continuation);
            }
        } else {
            c21591 = new C21591(continuation);
        }
        Object objWithContext = c21591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21591.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            if (wearableDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                GoalRemindViewModel$readGoalRemindSetting$2$1 goalRemindViewModel$readGoalRemindSetting$2$1 = new GoalRemindViewModel$readGoalRemindSetting$2$1(wearableDeviceModel, null);
                c21591.label = 1;
                objWithContext = BuildersKt.withContext(io2, goalRemindViewModel$readGoalRemindSetting$2$1, c21591);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        Boolean bool = (Boolean) objWithContext;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncGoalRemindConfig(boolean z, Continuation<? super Boolean> continuation) {
        C21611 c21611;
        boolean zBooleanValue;
        if (continuation instanceof C21611) {
            c21611 = (C21611) continuation;
            int i = c21611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21611.label = i - Integer.MIN_VALUE;
            } else {
                c21611 = new C21611(continuation);
            }
        } else {
            c21611 = new C21611(continuation);
        }
        Object objWithContext = c21611.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            if (wearableDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                GoalRemindViewModel$syncGoalRemindConfig$2$1 goalRemindViewModel$syncGoalRemindConfig$2$1 = new GoalRemindViewModel$syncGoalRemindConfig$2$1(wearableDeviceModel, z, null);
                c21611.label = 1;
                objWithContext = BuildersKt.withContext(io2, goalRemindViewModel$syncGoalRemindConfig$2$1, c21611);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        zBooleanValue = ((Boolean) objWithContext).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final MutableLiveData<Boolean> getRemindSwitch() {
        return this.remindSwitch;
    }

    public final void loadGoalRemindSwitch() {
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setGoalRemindSwitch(boolean z) {
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21601(z, null), 3, null);
    }
}
