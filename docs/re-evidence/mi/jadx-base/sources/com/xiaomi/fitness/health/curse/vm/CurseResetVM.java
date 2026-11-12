package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.CurseMixedRecordKt;
import com.xiaomi.fitness.health.curse.vm.CurseResetVM;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.onetrack.c.q;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0019H\u0003J\u0006\u0010\u001c\u001a\u00020\u0019J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eJ\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseResetVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "curseApi", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getCurseApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setCurseApi", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "settingManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "firstConfigObserver", "Landroidx/lifecycle/MutableLiveData;", "", "getFirstConfigObserver", "()Landroidx/lifecycle/MutableLiveData;", "firstConfigObserver$delegate", "Lkotlin/Lazy;", "getSetting", "syncFirstConfig", "", "syncDeviceConfig", "saveSetting", "synPredict", "hasIntelligentCapa", "Landroidx/lifecycle/LiveData;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseResetVM extends AbsViewModel {
    private CurseSetting config;
    public CurseApi curseApi;

    @Nullable
    private final WearableDeviceModel device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private final DeviceSettingManager settingManager = DeviceSettingManager.INSTANCE.getInstance();

    /* JADX INFO: renamed from: firstConfigObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy firstConfigObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wa5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseResetVM.firstConfigObserver_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseResetVM$hasIntelligentCapa$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseResetVM$hasIntelligentCapa$1", f = "CurseResetVM.kt", i = {0}, l = {114, 116}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String did;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                    this.L$0 = null;
                    this.label = 2;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    boolean z = (DeviceManagerExtKt.getInstance(companion).getDeviceCapabilityV2(did) & 65536) == 65536;
                    CurseManager.INSTANCE.getInstance().setHasIntelligentPredictionCapability(z);
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                    this.L$0 = liveDataScope;
                    this.label = 1;
                    if (liveDataScope.emit(boolBoxBoolean2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseResetVM$synPredict$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseResetVM$synPredict$1", f = "CurseResetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24361(Continuation<? super C24361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseResetVM.this.new C24361(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseResetVM.this.saveSetting();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseResetVM$syncDeviceConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseResetVM$syncDeviceConfig$1", f = "CurseResetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24371(Continuation<? super C24371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseResetVM.this.new C24371(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseResetVM.this.saveSetting();
            if (CurseResetVM.this.device == null || !CurseDeviceSyncExtKt.isSupportCurse(CurseResetVM.this.device)) {
                return Unit.INSTANCE;
            }
            if (DeviceModelExtKt.isHuaMi(CurseResetVM.this.device)) {
                CurseSetting curseSetting = CurseResetVM.this.config;
                CurseSetting curseSetting2 = null;
                if (curseSetting == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting = null;
                }
                byte estimatedMenstrualDays = (byte) curseSetting.getEstimatedMenstrualDays();
                CurseSetting curseSetting3 = CurseResetVM.this.config;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                } else {
                    curseSetting2 = curseSetting3;
                }
                CurseDeviceSyncExtKt.curseSetTotalRecord(CurseResetVM.this.device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.getDeviceSet(estimatedMenstrualDays, (byte) curseSetting2.getMenstrualCycle())));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseResetVM$syncFirstConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseResetVM$syncFirstConfig$1", f = "CurseResetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24381(Continuation<? super C24381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseResetVM.this.new C24381(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseSetting curseSetting = CurseResetVM.this.config;
            CurseSetting curseSetting2 = null;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            long jLastMenstrualEnd = CurseExtKt.lastMenstrualEnd(curseSetting);
            CurseSetting curseSetting3 = CurseResetVM.this.config;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting3 = null;
            }
            long lastMenstrualTime = curseSetting3.getLastMenstrualTime();
            long j = 1000;
            long jCurrentTimeMillis = System.currentTimeMillis() / j;
            CurseSetting curseSetting4 = CurseResetVM.this.config;
            if (curseSetting4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting4 = null;
            }
            Record record = new Record(lastMenstrualTime, jLastMenstrualEnd, jCurrentTimeMillis, curseSetting4.getMenstrualCycle(), 0, 16, null);
            CurseResetVM.this.getCurseApi().updateLastModify(System.currentTimeMillis() / j);
            boolean zInsert = CurseResetVM.this.getCurseApi().insert(record);
            CurseSetting curseSetting5 = CurseResetVM.this.config;
            if (curseSetting5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting5 = null;
            }
            Logger.i("CurseResetVM", "syncFirstConfig: ret = " + zInsert + ", setting = " + curseSetting5);
            CurseResetVM.this.getFirstConfigObserver().postValue(Boxing.boxBoolean(zInsert));
            if (!zInsert) {
                return Unit.INSTANCE;
            }
            CurseSetting curseSetting6 = CurseResetVM.this.config;
            if (curseSetting6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting6 = null;
            }
            curseSetting6.setFirst(false);
            CurseResetVM.this.saveSetting();
            if (CurseResetVM.this.device == null || !CurseDeviceSyncExtKt.isSupportCurse(CurseResetVM.this.device)) {
                return Unit.INSTANCE;
            }
            if (DeviceModelExtKt.isHuaMi(CurseResetVM.this.device)) {
                CurseSetting curseSetting7 = CurseResetVM.this.config;
                if (curseSetting7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting7 = null;
                }
                CurseDeviceSyncExtKt.curseSetTotalRecord(CurseResetVM.this.device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.getFirstDeviceSet(curseSetting7)));
                WearableDeviceModel wearableDeviceModel = CurseResetVM.this.device;
                CurseSetting curseSetting8 = CurseResetVM.this.config;
                if (curseSetting8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                } else {
                    curseSetting2 = curseSetting8;
                }
                CurseDeviceSyncExtKt.curseSetPredict(wearableDeviceModel, curseSetting2.isPredictEnable());
            } else {
                CurseManager.INSTANCE.getInstance().syncProtoTotalRecord(CurseResetVM.this.device);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData firstConfigObserver_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSetting() {
        DeviceSettingManager deviceSettingManager = this.settingManager;
        CurseSetting curseSetting = this.config;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            curseSetting = null;
        }
        deviceSettingManager.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
        DeviceSettingManager deviceSettingManager2 = this.settingManager;
        CurseSetting curseSetting3 = this.config;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        } else {
            curseSetting2 = curseSetting3;
        }
        deviceSettingManager2.sendUserSettingItem("curse", curseSetting2, false);
        CurseManager.INSTANCE.getInstance().initData("curseResetVM");
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final CurseApi getCurseApi() {
        CurseApi curseApi = this.curseApi;
        if (curseApi != null) {
            return curseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("curseApi");
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getFirstConfigObserver() {
        return (MutableLiveData) this.firstConfigObserver.getValue();
    }

    @NotNull
    public final CurseSetting getSetting() {
        CurseSetting setting = CurseManager.INSTANCE.getInstance().getSetting();
        if (setting == null) {
            setting = CurseExtKt.m362default(new CurseSetting());
        }
        this.config = setting;
        if (setting != null) {
            return setting;
        }
        Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        return null;
    }

    @NotNull
    public final LiveData<Boolean> hasIntelligentCapa() {
        return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new AnonymousClass1(null), 2, (Object) null);
    }

    public final void setCurseApi(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.curseApi = curseApi;
    }

    public final void synPredict() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24361(null), 2, null);
    }

    public final void syncDeviceConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24371(null), 2, null);
    }

    public final void syncFirstConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24381(null), 2, null);
    }
}
