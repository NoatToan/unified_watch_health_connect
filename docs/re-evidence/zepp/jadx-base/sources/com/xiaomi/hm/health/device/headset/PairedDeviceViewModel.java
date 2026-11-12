package com.xiaomi.hm.health.device.headset;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.DeviceNameConfig;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0011\u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "c", "b", "", "regexList", "input", "", "e", "", PointCategory.LOAD, "getBoundPairedDevice", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setSource", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getDeviceListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deviceListLiveData", "getBoundDeviceListLiveData", "boundDeviceListLiveData", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"MissingPermission"})
public final class PairedDeviceViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource source = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PairedDevice>> deviceListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<PairedDevice>> boundDeviceListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.PairedDeviceViewModel$getBoundPairedDevice$1", f = "PairedDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PairedDeviceViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData<List<PairedDevice>> boundDeviceListLiveData = PairedDeviceViewModel.this.getBoundDeviceListLiveData();
            PairedDeviceViewModel pairedDeviceViewModel = PairedDeviceViewModel.this;
            boundDeviceListLiveData.postValue(pairedDeviceViewModel.b(pairedDeviceViewModel.getSource()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.PairedDeviceViewModel$load$1", f = "PairedDeviceViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.headset.PairedDeviceViewModel$load$1$1", f = "PairedDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PairedDeviceViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PairedDeviceViewModel pairedDeviceViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = pairedDeviceViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableLiveData<List<PairedDevice>> deviceListLiveData = this.b.getDeviceListLiveData();
                PairedDeviceViewModel pairedDeviceViewModel = this.b;
                deviceListLiveData.postValue(pairedDeviceViewModel.c(pairedDeviceViewModel.getSource()));
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PairedDeviceViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(PairedDeviceViewModel.this, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PairedDeviceViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.PairedDeviceViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final List<PairedDevice> b(HMDeviceSource source) {
        boolean z;
        ArrayList<String> arrayList = DeviceNameConfig.getDEVICE_REGEX_MAP().get(source);
        List<PairedDevice> listEmptyList = null;
        if (arrayList != null) {
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            if (bondedDevices != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bondedDevices, 10));
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    arrayList2.add(new PairedDevice(bluetoothDevice.getName(), bluetoothDevice));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    PairedDevice pairedDevice = (PairedDevice) obj;
                    if (pairedDevice.getName() == null) {
                        z = false;
                    } else {
                        String name = pairedDevice.getName();
                        if (name == null) {
                            name = "";
                        }
                        if (e(arrayList, name) && a().isBoundDevice(pairedDevice.getDevice(), source)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        arrayList3.add(obj);
                    }
                }
                listEmptyList = arrayList3;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return listEmptyList == null ? CollectionsKt__CollectionsKt.emptyList() : listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final List<PairedDevice> c(HMDeviceSource source) {
        boolean z;
        ArrayList<String> arrayList = DeviceNameConfig.getDEVICE_REGEX_MAP().get(source);
        List<PairedDevice> listEmptyList = null;
        if (arrayList != null) {
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            if (bondedDevices != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bondedDevices, 10));
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    arrayList2.add(new PairedDevice(bluetoothDevice.getName(), bluetoothDevice));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    PairedDevice pairedDevice = (PairedDevice) obj;
                    if (pairedDevice.getName() == null) {
                        z = false;
                    } else {
                        String name = pairedDevice.getName();
                        if (name == null) {
                            name = "";
                        }
                        if (!e(arrayList, name) || a().isBoundDevice(pairedDevice.getDevice(), source)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        arrayList3.add(obj);
                    }
                }
                listEmptyList = arrayList3;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        return listEmptyList == null ? CollectionsKt__CollectionsKt.emptyList() : listEmptyList;
    }

    private final boolean e(List<String> regexList, String input) {
        Iterator<String> it2 = regexList.iterator();
        while (it2.hasNext()) {
            if (Pattern.matches(it2.next(), input)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final MutableLiveData<List<PairedDevice>> getBoundDeviceListLiveData() {
        return this.boundDeviceListLiveData;
    }

    public final void getBoundPairedDevice() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<PairedDevice>> getDeviceListLiveData() {
        return this.deviceListLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final HMDeviceSource getSource() {
        return this.source;
    }

    public final void load() {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    public final void setSource(@NotNull HMDeviceSource hMDeviceSource) {
        this.source = hMDeviceSource;
    }
}
