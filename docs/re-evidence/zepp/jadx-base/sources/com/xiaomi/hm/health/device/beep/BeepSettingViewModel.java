package com.xiaomi.hm.health.device.beep;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.beep.BeepItem;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\b\u0010\b\u001a\u00020\u0006H\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/beep/BeepSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/device/beep/BeepType;", "", "pair", "", "setBeepSettingToDevice", "onCleared", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmdevice", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "_result", "c", "_isShowLoading", "Landroidx/lifecycle/LiveData;", "getResult", "()Landroidx/lifecycle/LiveData;", "result", "isShowLoading", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BeepSettingViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HMBaseDevice hmdevice = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.MILI);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isShowLoading;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.beep.BeepSettingViewModel$setBeepSettingToDevice$1$1", f = "BeepSettingViewModel.kt", i = {0}, l = {54}, m = "invokeSuspend", n = {"beeps"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Pair<BeepType, Boolean> c;
        public final /* synthetic */ BeepSettingViewModel d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.beep.BeepSettingViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.beep.BeepSettingViewModel$setBeepSettingToDevice$1$1$withTimeoutOrNull$1", f = "BeepSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0804a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ BeepSettingViewModel b;
            public final /* synthetic */ List<Pair<BeepType, Boolean>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0804a(BeepSettingViewModel beepSettingViewModel, List<Pair<BeepType, Boolean>> list, Continuation<? super C0804a> continuation) {
                super(2, continuation);
                this.b = beepSettingViewModel;
                this.c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0804a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0804a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Boolean boolBoxBoolean;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDevice = this.b.hmdevice;
                boolean zBooleanValue = false;
                if (hMBaseDevice == null ? true : hMBaseDevice instanceof HMMiLiProDevice) {
                    List<Pair<BeepType, Boolean>> list = this.c;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        arrayList.add(new BeepItem(((BeepType) pair.getFirst()).ordinal(), ByteUtilsKt.toByte(((Boolean) pair.getSecond()).booleanValue())));
                    }
                    HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.b.hmdevice;
                    if (hMMiLiProDevice != null && (boolBoxBoolean = Boxing.boxBoolean(hMMiLiProDevice.setBeepsSync(arrayList))) != null) {
                        zBooleanValue = boolBoxBoolean.booleanValue();
                    }
                    zBooleanValue = Boxing.boxBoolean(zBooleanValue).booleanValue();
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Pair<? extends BeepType, Boolean> pair, BeepSettingViewModel beepSettingViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = pair;
            this.d = beepSettingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<Pair<BeepType, Boolean>> list;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BeepPropertyRepo beepPropertyRepo = BeepPropertyRepo.INSTANCE;
                List<Pair<BeepType, Boolean>> listUpdateBeepTypes = beepPropertyRepo.updateBeepTypes(this.c, beepPropertyRepo.getDefaultBeeps());
                C0804a c0804a = new C0804a(this.d, listUpdateBeepTypes, null);
                this.a = listUpdateBeepTypes;
                this.b = 1;
                Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(30000L, c0804a, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = listUpdateBeepTypes;
                obj = objWithTimeoutOrNull;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.a;
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                BeepPropertyRepo.INSTANCE.saveProperty(list);
            }
            boolean zBooleanValue = false;
            this.d._isShowLoading.postValue(Boxing.boxBoolean(false));
            MutableLiveData mutableLiveData = this.d._result;
            boolean z = bool == null;
            if (!z) {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                zBooleanValue = bool.booleanValue();
            }
            mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    public BeepSettingViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._result = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this._isShowLoading = mutableLiveData2;
    }

    @NotNull
    public final LiveData<Boolean> getResult() {
        return this._result;
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0011  */
    public final void setBeepSettingToDevice(@NotNull Pair<? extends BeepType, Boolean> pair) {
        HMBaseDevice hMBaseDevice = this.hmdevice;
        if (hMBaseDevice != null) {
            boolean z = false;
            if (hMBaseDevice != null && !hMBaseDevice.isConnected()) {
                z = true;
            }
            if (z) {
                this._result.setValue(Boolean.FALSE);
            }
        } else {
            this._result.setValue(Boolean.FALSE);
        }
        this._isShowLoading.setValue(Boolean.TRUE);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new BeepSettingViewModel$setBeepSettingToDevice$$inlined$safeLaunch$1(null, pair, this), 2, null);
    }
}
