package com.xiaomi.fitness.devicesettings.huami.handletype;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel;
import com.xiaomi.fitness.settingitem.settingitem.WearHand;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001dR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/handletype/HuaMiHandlerTypeViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "setWearHand", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/settingitem/settingitem/WearHand;", "getSetWearHand", "()Landroidx/lifecycle/MutableLiveData;", "setSetWearHand", "(Landroidx/lifecycle/MutableLiveData;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadWearHandleType", "getWearHandSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setWearHandleType", "way", "Lcom/xiaomi/fitness/settingitem/settingitem/WearHand$Way;", "syncWearLocationConfig", "", "(Lcom/xiaomi/fitness/settingitem/settingitem/WearHand$Way;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiHandlerTypeViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jic
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuaMiHandlerTypeViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<WearHand> setWearHand = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$getWearHandSetting$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel", f = "HuaMiHandlerTypeViewModel.kt", i = {}, l = {44}, m = "getWearHandSetting", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HuaMiHandlerTypeViewModel.this.getWearHandSetting(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$loadWearHandleType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$loadWearHandleType$1", f = "HuaMiHandlerTypeViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C21621(Continuation<? super C21621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiHandlerTypeViewModel.this.new C21621(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiHandlerTypeViewModel huaMiHandlerTypeViewModel = HuaMiHandlerTypeViewModel.this;
                this.label = 1;
                obj = huaMiHandlerTypeViewModel.getWearHandSetting(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HuaMiHandlerTypeViewModel.this.getSetWearHand().postValue((WearHand) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$setWearHandleType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$setWearHandleType$1", f = "HuaMiHandlerTypeViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearHand.Way $way;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21631(WearHand.Way way, Continuation<? super C21631> continuation) {
            super(2, continuation);
            this.$way = way;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuaMiHandlerTypeViewModel.this.new C21631(this.$way, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HuaMiHandlerTypeViewModel huaMiHandlerTypeViewModel = HuaMiHandlerTypeViewModel.this;
                WearHand.Way way = this.$way;
                this.label = 1;
                obj = huaMiHandlerTypeViewModel.syncWearLocationConfig(way, this);
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
            Logger.d("HuaMiHandlerTypeViewModel", "setWearHandleType " + this.$way + " success:" + zBooleanValue);
            if (zBooleanValue) {
                MutableLiveData<WearHand> setWearHand = HuaMiHandlerTypeViewModel.this.getSetWearHand();
                WearHand wearHand = new WearHand();
                wearHand.setWay(this.$way);
                setWearHand.postValue(wearHand);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel$syncWearLocationConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.handletype.HuaMiHandlerTypeViewModel", f = "HuaMiHandlerTypeViewModel.kt", i = {}, l = {70}, m = "syncWearLocationConfig", n = {}, s = {})
    public static final class C21641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21641(Continuation<? super C21641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HuaMiHandlerTypeViewModel.this.syncWearLocationConfig(null, this);
        }
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getWearHandSetting(Continuation<? super WearHand> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HuaMiHandlerTypeViewModel$getWearHandSetting$2$1 huaMiHandlerTypeViewModel$getWearHandSetting$2$1 = new HuaMiHandlerTypeViewModel$getWearHandSetting$2$1(mDeviceModel, null);
                anonymousClass1.label = 1;
                objWithContext = BuildersKt.withContext(io2, huaMiHandlerTypeViewModel$getWearHandSetting$2$1, anonymousClass1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new WearHand();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        WearHand wearHand = (WearHand) objWithContext;
        if (wearHand != null) {
            return wearHand;
        }
        return new WearHand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncWearLocationConfig(WearHand.Way way, Continuation<? super Boolean> continuation) {
        C21641 c21641;
        boolean zBooleanValue;
        if (continuation instanceof C21641) {
            c21641 = (C21641) continuation;
            int i = c21641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21641.label = i - Integer.MIN_VALUE;
            } else {
                c21641 = new C21641(continuation);
            }
        } else {
            c21641 = new C21641(continuation);
        }
        Object objWithContext = c21641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1 huaMiHandlerTypeViewModel$syncWearLocationConfig$2$1 = new HuaMiHandlerTypeViewModel$syncWearLocationConfig$2$1(mDeviceModel, way, null);
                c21641.label = 1;
                objWithContext = BuildersKt.withContext(io2, huaMiHandlerTypeViewModel$syncWearLocationConfig$2$1, c21641);
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
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<WearHand> getSetWearHand() {
        return this.setWearHand;
    }

    public final void loadWearHandleType() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21621(null), 3, null);
    }

    public final void setSetWearHand(@NotNull MutableLiveData<WearHand> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.setWearHand = mutableLiveData;
    }

    public final void setWearHandleType(@NotNull WearHand.Way way) {
        Intrinsics.checkNotNullParameter(way, "way");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21631(way, null), 3, null);
    }
}
