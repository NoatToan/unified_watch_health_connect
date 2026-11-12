package com.xiaomi.fitness.device.manager.ui.scan;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.xiaomi.fit.device.bind.HuaMiRequest;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.adapter.PowerfullAdapter;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableProduct;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.extensions.DeviceExtKt;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.SearchCallback;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import defpackage.dui;
import defpackage.uzi;
import defpackage.zv1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001mB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010+\u001a\u00020,*\u00020-H\u0002J\u0010\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020UH\u0002J\u0010\u0010V\u001a\u00020#2\u0006\u0010W\u001a\u00020\u0010H\u0002J\u0018\u0010X\u001a\u00020,2\u0006\u0010T\u001a\u00020U2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0012\u0010[\u001a\u00020,2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u0010\u0010^\u001a\u00020,2\u0006\u0010_\u001a\u00020`H\u0016J\u0006\u0010a\u001a\u00020,J\b\u0010b\u001a\u00020,H\u0002J\u0010\u0010c\u001a\u00020#2\u0006\u0010d\u001a\u00020\bH\u0002J\b\u0010e\u001a\u00020,H\u0002J\u0010\u0010h\u001a\u00020,2\u0006\u0010A\u001a\u00020@H\u0002J\u0010\u0010i\u001a\u00020,2\u0006\u0010_\u001a\u00020`H\u0016J\u0006\u0010j\u001a\u00020,J\u0006\u0010k\u001a\u00020,J\u0006\u0010l\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR0\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001fj\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0011\u0010.\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0017R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001f\u0010;\u001a\u0013\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020,0<¢\u0006\u0002\b>X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010A\u001a\u0004\u0018\u00010@2\b\u0010?\u001a\u0004\u0018\u00010@@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER!\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001e0G8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010*\u001a\u0004\bH\u0010IR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0L¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0P¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00100gX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mSearchingStartTime", "", "searchStatus", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getSearchStatus$device_manager_chinaProductRelease", "()Landroidx/lifecycle/MutableLiveData;", "setSearchStatus$device_manager_chinaProductRelease", "(Landroidx/lifecycle/MutableLiveData;)V", "deviceIcon", "Landroidx/databinding/ObservableField;", "", "getDeviceIcon", "()Landroidx/databinding/ObservableField;", "deviceName", "getDeviceName", "isSearching", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "buttonText", "Landroidx/databinding/ObservableInt;", "getButtonText", "()Landroidx/databinding/ObservableInt;", "mMixedHuamiDevices", "Lkotlin/collections/HashMap;", "Lcom/xiaomi/fitness/device/manager/export/scan/ScannedDeviceInfo;", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "mHaveCheckedDevices", "healthDeviceAccessSwitch", "", "getHealthDeviceAccessSwitch", "mScanTimer", "Landroid/os/CountDownTimer;", "getMScanTimer", "()Landroid/os/CountDownTimer;", "mScanTimer$delegate", "Lkotlin/Lazy;", "filterHuamiDevice", "", "Lcom/xiaomi/fit/device/bind/HuaMiRequest;", "isShowList", "mProductManager", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "getMProductManager", "()Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "setMProductManager", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;)V", "mScanManager", "Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "getMScanManager", "()Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;", "setMScanManager", "(Lcom/xiaomi/fitness/device/manager/ui/scan/ScanManager;)V", "mSearchCallback", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/ui/scan/SearchCallback;", "Lkotlin/ExtensionFunctionType;", "value", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "deviceInfo", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;)V", "adapter", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/PowerfullAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/baseui/recyclerview/adapter/PowerfullAdapter;", "adapter$delegate", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "scannedDeviceList", "Landroidx/databinding/ObservableArrayList;", "getScannedDeviceList", "()Landroidx/databinding/ObservableArrayList;", "isDeviceValid", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "isExist", "mac", "addScanItem", "bleDevice", "Lcom/xiaomi/fitness/device/manager/export/scan/BleDevice;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "startSearch", "searchBleByNamePrefixAndMiBeacon", "isWearProduct", "type", "searchBleByNamePrefix", "FILTER_PRODUCT_MODEL", "Ljava/util/HashSet;", "searchBleSpecial", LifecycleConstantKt.ON_STOP, "stopSearch", "clearCollect", "getCommonConfig", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScanDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanDeviceViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,467:1\n14#2:468\n216#3,2:469\n1863#4,2:471\n1863#4,2:473\n1863#4,2:475\n1863#4,2:477\n*S KotlinDebug\n*F\n+ 1 ScanDeviceViewModel.kt\ncom/xiaomi/fitness/device/manager/ui/scan/ScanDeviceViewModel\n*L\n255#1:468\n138#1:469,2\n347#1:471,2\n365#1:473,2\n395#1:475,2\n148#1:477,2\n*E\n"})
public final class ScanDeviceViewModel extends AbsViewModel {
    private static final int LIST_SHOW_DELAY = 5000;
    private static final int SCAN_TIME = 30000;
    public static final int SEARCH_STATUS_FAIL = 3;
    public static final int SEARCH_STATUS_INITIAL = 0;
    public static final int SEARCH_STATUS_SEARCHING = 1;
    public static final int SEARCH_STATUS_STOP = 4;
    public static final int SEARCH_STATUS_SUCCESS = 2;

    @NotNull
    private static final String SWITCH_OPEN = "0";

    @NotNull
    private static final String TAG = "ScanDevice";

    @NotNull
    private final HashSet<String> FILTER_PRODUCT_MODEL;

    @Nullable
    private DeviceInfo deviceInfo;

    @Nullable
    private HashMap<String, ScannedDeviceInfo> mMixedHuamiDevices;
    public ProductManagerInternal mProductManager;
    public ScanManager mScanManager;
    private long mSearchingStartTime;

    @NotNull
    private MutableLiveData<Integer> searchStatus = new MutableLiveData<>(0);

    @NotNull
    private final ObservableField<String> deviceIcon = new ObservableField<>();

    @NotNull
    private final ObservableField<String> deviceName = new ObservableField<>();

    @NotNull
    private final ObservableBoolean isSearching = new ObservableBoolean();

    @NotNull
    private final ObservableInt buttonText = new ObservableInt(uzi.F1);

    @NotNull
    private final HashMap<String, ScannedDeviceInfo> mHaveCheckedDevices = new HashMap<>();

    @NotNull
    private final MutableLiveData<Boolean> healthDeviceAccessSwitch = new MutableLiveData<>();

    /* JADX INFO: renamed from: mScanTimer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mScanTimer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ldl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScanDeviceViewModel.mScanTimer_delegate$lambda$0(this.f24943a);
        }
    });

    @NotNull
    private final ObservableBoolean isShowList = new ObservableBoolean(false);

    @NotNull
    private final Function1<SearchCallback, Unit> mSearchCallback = new Function1() { // from class: mdl
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ScanDeviceViewModel.mSearchCallback$lambda$11(this.f26042a, (SearchCallback) obj);
        }
    };

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bdl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScanDeviceViewModel.adapter_delegate$lambda$12();
        }
    });

    @NotNull
    private final ItemBinding<ScannedDeviceInfo> itemBinding = ItemBinding.INSTANCE.of(zv1.j, dui.F);

    @NotNull
    private final ObservableArrayList<ScannedDeviceInfo> scannedDeviceList = new ObservableArrayList<>();

    public ScanDeviceViewModel() {
        HashSet<String> hashSet = new HashSet<>();
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            try {
                for (PluginDeviceInfo pluginDeviceInfo : PluginDeviceManager.INSTANCE.getInstance().getPluginInfoMap().values()) {
                    if (!Intrinsics.areEqual(pluginDeviceInfo.l(), "yunmai.scales.ms3001")) {
                        hashSet.add(pluginDeviceInfo.l());
                    }
                }
            } catch (Exception e) {
                Logger.e(TAG, "init mijia product model error", e);
            }
        }
        this.FILTER_PRODUCT_MODEL = hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PowerfullAdapter adapter_delegate$lambda$12() {
        return new PowerfullAdapter(null, 1, null);
    }

    private final void addScanItem(Product product, BleDevice bleDevice) {
        Logger.i(TAG, "addScan BLE device (" + bleDevice + ")");
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            Intrinsics.checkNotNull(deviceInfo);
        } else {
            deviceInfo = DeviceExtKt.toDeviceInfo(product);
        }
        ScannedDeviceInfo scannedDeviceInfo = new ScannedDeviceInfo(bleDevice, deviceInfo, null, 4, null);
        if (!deviceInfo.isHuami()) {
            this.scannedDeviceList.add(scannedDeviceInfo);
            return;
        }
        if (this.mMixedHuamiDevices == null) {
            this.mMixedHuamiDevices = new HashMap<>();
        }
        String address = bleDevice.getAddress();
        HashMap<String, ScannedDeviceInfo> map = this.mMixedHuamiDevices;
        Intrinsics.checkNotNull(map);
        if (map.get(address) == null && this.mHaveCheckedDevices.get(address) == null) {
            HashMap<String, ScannedDeviceInfo> map2 = this.mMixedHuamiDevices;
            Intrinsics.checkNotNull(map2);
            map2.put(address, scannedDeviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filterHuamiDevice(HuaMiRequest huaMiRequest) {
        HashMap<String, ScannedDeviceInfo> map = this.mMixedHuamiDevices;
        if (map == null || map.isEmpty()) {
            return;
        }
        final HashMap<String, ScannedDeviceInfo> map2 = this.mMixedHuamiDevices;
        Intrinsics.checkNotNull(map2);
        this.mMixedHuamiDevices = null;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ScannedDeviceInfo> entry : map2.entrySet()) {
            String bleMac = entry.getValue().getBleMac();
            arrayList.add(new HuaMiRequest.CheckedDevice(bleMac, 0, false, 4, null));
            this.mHaveCheckedDevices.put(bleMac, entry.getValue());
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            huaMiRequest.batchCheckDeviceBind(arrayList, new Function1() { // from class: cdl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ScanDeviceViewModel.filterHuamiDevice$lambda$3(this.f5226a, map2, (List) obj);
                }
            });
        } else {
            this.scannedDeviceList.addAll(map2.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit filterHuamiDevice$lambda$3(ScanDeviceViewModel this$0, HashMap mixedDevices, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mixedDevices, "$mixedDevices");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this$0.scannedDeviceList.addAll(mixedDevices.values());
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HuaMiRequest.CheckedDevice checkedDevice = (HuaMiRequest.CheckedDevice) it.next();
                Object obj = mixedDevices.get(checkedDevice.getMacAddress());
                Intrinsics.checkNotNull(obj);
                ScannedDeviceInfo scannedDeviceInfo = (ScannedDeviceInfo) obj;
                if (!checkedDevice.isBind()) {
                    this$0.scannedDeviceList.add(scannedDeviceInfo);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCommonConfig$lambda$23(ScanDeviceViewModel this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getCommonConfig onSuccess " + it);
        this$0.healthDeviceAccessSwitch.setValue(Boolean.valueOf(TextUtils.isEmpty(it) || Intrinsics.areEqual(it, "0")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCommonConfig$lambda$24(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(TAG, "getCommonConfig onFail " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CountDownTimer getMScanTimer() {
        return (CountDownTimer) this.mScanTimer.getValue();
    }

    private final boolean isDeviceValid(Product product) {
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo == null || deviceInfo.getScanMode() == 1) {
            return true;
        }
        if (deviceInfo.isHuami()) {
            return DeviceExtKt.isHuaMi(product);
        }
        if (deviceInfo.getProductIds() == null) {
            return product.getProductId() == deviceInfo.getProductId();
        }
        List<Integer> productIds = deviceInfo.getProductIds();
        Intrinsics.checkNotNull(productIds);
        return productIds.contains(Integer.valueOf(product.getProductId()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    private final boolean isExist(String mac) {
        if (this.scannedDeviceList.isEmpty()) {
            return false;
        }
        for (ScannedDeviceInfo scannedDeviceInfo : this.scannedDeviceList) {
            if (Intrinsics.areEqual(scannedDeviceInfo.getBleMac(), mac)) {
                if (scannedDeviceInfo != null) {
                    return true;
                }
                return false;
            }
        }
        scannedDeviceInfo = null;
        if (scannedDeviceInfo != null) {
            return true;
        }
        return false;
    }

    private final boolean isWearProduct(int type) {
        return type == 2 || type == 3 || type == 6 || type == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel$mScanTimer$2$1] */
    public static final ScanDeviceViewModel$mScanTimer$2$1 mScanTimer_delegate$lambda$0(final ScanDeviceViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CountDownTimer() { // from class: com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel$mScanTimer$2$1
            private final HuaMiRequest mHuamiRequest;

            {
                super(30000L, 1000L);
                this.mHuamiRequest = new HuaMiRequest();
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                DeviceModelExtKt.logi("ScanDeviceViewModel", "onFinish: ");
                if (this.this$0.getScannedDeviceList().isEmpty()) {
                    Logger.i("ScanDevice", "Search empty device");
                    this.this$0.getSearchStatus$device_manager_chinaProductRelease().setValue(3);
                } else {
                    this.this$0.getSearchStatus$device_manager_chinaProductRelease().setValue(2);
                }
                this.this$0.getMScanManager().stopSearch();
                this.this$0.getMScanTimer().cancel();
                this.this$0.filterHuamiDevice(this.mHuamiRequest);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                Integer value;
                DeviceModelExtKt.logi("ScanDeviceViewModel", "onTick: " + millisUntilFinished + ", " + AppUtil.INSTANCE.isMainThread());
                if (!this.this$0.getIsShowList().get() && !this.this$0.getScannedDeviceList().isEmpty() && (value = this.this$0.getSearchStatus$device_manager_chinaProductRelease().getValue()) != null && value.intValue() == 1) {
                    this.this$0.getSearchStatus$device_manager_chinaProductRelease().setValue(2);
                }
                this.this$0.filterHuamiDevice(this.mHuamiRequest);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mSearchCallback$lambda$11(final ScanDeviceViewModel this$0, SearchCallback searchCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(searchCallback, "<this>");
        searchCallback.setOnFound(new Function1() { // from class: gdl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$8(this.f18859a, (BleDevice) obj);
            }
        });
        searchCallback.setOnFailed(new Function1() { // from class: hdl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$9(this.f19958a, ((Integer) obj).intValue());
            }
        });
        searchCallback.setOnStop(new Function0() { // from class: idl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$10(this.f21030a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mSearchCallback$lambda$11$lambda$10(ScanDeviceViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.loge("bluetooth stop scan");
        this$0.stopSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit mSearchCallback$lambda$11$lambda$8(final ScanDeviceViewModel this$0, final BleDevice device) {
        final RNProduct product;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "device");
        Logger.i("scan device " + device, new Object[0]);
        if (device.getProductId() == 0) {
            Logger.i(device + " is invalid ble device", new Object[0]);
        } else {
            final WearableProduct wearableProduct = (WearableProduct) this$0.getMProductManager().getProductByModel(device.getModel());
            if (wearableProduct != null) {
                Logger.e(TAG, "onFound " + device.getAddress());
                if (!this$0.isDeviceValid(wearableProduct)) {
                    Logger.i(wearableProduct + " is invalid or exit", new Object[0]);
                } else if (!this$0.isExist(device.getAddress())) {
                    ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: adl
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$8$lambda$4(this.f906a, wearableProduct, device);
                        }
                    });
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("mijia device: ");
                sb.append(device);
                if (!this$0.isExist(device.getAddress())) {
                    try {
                        product = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(device.getModel());
                        if (product == null) {
                            product = new Product(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
                        }
                    } catch (Exception e) {
                        Logger.e(TAG, "get product by model error", e);
                        product = new Product(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
                    }
                    ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: edl
                        @Override // java.lang.Runnable
                        public final void run() {
                            ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$8$lambda$5(this.f16536a, device, product);
                        }
                    });
                }
                Logger.i("scan device " + device.getAddress() + " is not in product list", new Object[0]);
                EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(device.getModel());
                final Product deviceProduct = ecoProduct != null ? EcoProductExtKt.toDeviceProduct(ecoProduct) : null;
                Logger.i("get ecoProduct " + deviceProduct, new Object[0]);
                if (deviceProduct != null) {
                    Logger.e(TAG, "onFound eco-device " + device.getAddress());
                    if (!this$0.isDeviceValid(deviceProduct)) {
                        Logger.i(deviceProduct + " is invalid or exit", new Object[0]);
                    } else if (!this$0.isExist(device.getAddress())) {
                        ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: fdl
                            @Override // java.lang.Runnable
                            public final void run() {
                                ScanDeviceViewModel.mSearchCallback$lambda$11$lambda$8$lambda$7$lambda$6(this.f17684a, deviceProduct, device);
                            }
                        });
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mSearchCallback$lambda$11$lambda$8$lambda$4(ScanDeviceViewModel this$0, WearableProduct wearableProduct, BleDevice device) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        this$0.addScanItem(wearableProduct, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mSearchCallback$lambda$11$lambda$8$lambda$5(ScanDeviceViewModel this$0, BleDevice device, Product mijiaProduct) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(mijiaProduct, "$mijiaProduct");
        if (this$0.deviceInfo == null) {
            this$0.addScanItem(mijiaProduct, device);
            return;
        }
        String model = device.getModel();
        DeviceInfo deviceInfo = this$0.deviceInfo;
        Intrinsics.checkNotNull(deviceInfo);
        if (Intrinsics.areEqual(model, deviceInfo.getModel())) {
            this$0.addScanItem(mijiaProduct, device);
            return;
        }
        DeviceInfo deviceInfo2 = this$0.deviceInfo;
        Intrinsics.checkNotNull(deviceInfo2);
        if (deviceInfo2.getProductIds() != null) {
            DeviceInfo deviceInfo3 = this$0.deviceInfo;
            Intrinsics.checkNotNull(deviceInfo3);
            List<Integer> productIds = deviceInfo3.getProductIds();
            Intrinsics.checkNotNull(productIds);
            if (productIds.contains(Integer.valueOf(device.getProductId()))) {
                this$0.setDeviceInfo(DeviceExtKt.toDeviceInfo(mijiaProduct));
                this$0.addScanItem(mijiaProduct, device);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mSearchCallback$lambda$11$lambda$8$lambda$7$lambda$6(ScanDeviceViewModel this$0, Product product, BleDevice device) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        this$0.addScanItem(product, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mSearchCallback$lambda$11$lambda$9(ScanDeviceViewModel this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.loge("fail to scan, code=" + i);
        this$0.stopSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static final Unit onCreate$lambda$15(ScanDeviceViewModel this$0, Integer num) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null) {
            z = num.intValue() == 1;
        }
        this$0.isSearching.set(z);
        if (z) {
            this$0.buttonText.set(uzi.F1);
        } else {
            this$0.buttonText.set(uzi.A1);
        }
        return Unit.INSTANCE;
    }

    private final void searchBleByNamePrefix() {
        ArrayList arrayList = new ArrayList();
        for (DeviceInfo deviceInfo : getMProductManager().getDeviceInfoList()) {
            if (deviceInfo.getType() == 1 || deviceInfo.getType() == 5) {
                arrayList.add(deviceInfo.getBltNamePrefix());
            }
        }
        Logger.i(TAG, "searchBleByNamePrefix: prefixList = " + arrayList);
        getMScanManager().searchByNamePrefix(arrayList, this.mSearchCallback);
    }

    private final void searchBleByNamePrefixAndMiBeacon() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (DeviceInfo deviceInfo : getMProductManager().getDeviceInfoList()) {
            if (deviceInfo.getType() == 1 || deviceInfo.getType() == 5) {
                arrayList.add(deviceInfo.getBltNamePrefix());
            } else if (isWearProduct(deviceInfo.getType())) {
                arrayList2.add(Integer.valueOf(deviceInfo.getProductId()));
                List<Integer> productIds = deviceInfo.getProductIds();
                if (productIds != null) {
                    arrayList2.addAll(productIds);
                }
            } else {
                arrayList3.add(Integer.valueOf(deviceInfo.getProductId()));
                List<Integer> productIds2 = deviceInfo.getProductIds();
                if (productIds2 != null) {
                    arrayList3.addAll(productIds2);
                }
            }
        }
        for (EcoAddDeviceInfo ecoAddDeviceInfo : EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getDeviceInfoList()) {
            if (ecoAddDeviceInfo.getType() != 1 && ecoAddDeviceInfo.getType() != 5 && !isWearProduct(ecoAddDeviceInfo.getType())) {
                Logger.i("eco>>>>>>productId " + ecoAddDeviceInfo + ".productId ", new Object[0]);
                if (!arrayList3.contains(Integer.valueOf(ecoAddDeviceInfo.getProductId()))) {
                    Logger.i("eco>>>>>>localIds " + arrayList3 + " ", new Object[0]);
                    arrayList3.add(Integer.valueOf(ecoAddDeviceInfo.getProductId()));
                }
                List<Integer> productIds3 = ecoAddDeviceInfo.getProductIds();
                if (productIds3 != null) {
                    List<Integer> list = productIds3;
                    if (!arrayList3.containsAll(list)) {
                        Logger.i("eco>>>>>>all localIds " + arrayList3 + " ", new Object[0]);
                        arrayList3.addAll(list);
                    }
                }
            }
        }
        getMScanManager().searchBleByNamePrefixOrMiBeacon(arrayList, arrayList2, arrayList3, this.mSearchCallback);
    }

    private final void searchBleSpecial(DeviceInfo deviceInfo) {
        if (deviceInfo.isWearOs() || deviceInfo.isHuami()) {
            getMScanManager().searchByNamePrefix(CollectionsKt__CollectionsJVMKt.listOf(deviceInfo.getBltNamePrefix()), this.mSearchCallback);
            return;
        }
        if (CollectionsKt___CollectionsKt.contains(this.FILTER_PRODUCT_MODEL, deviceInfo.getModel()) && !AppUtil.INSTANCE.isPlayChannel()) {
            getMScanManager().searchOnlyMijia(this.mSearchCallback);
            return;
        }
        List<Integer> productIds = deviceInfo.getProductIds();
        getMScanManager().searchBleByMiBeacon((productIds == null || productIds.isEmpty()) ? CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(deviceInfo.getProductId())) : deviceInfo.getProductIds(), this.mSearchCallback, !deviceInfo.isSportMachine());
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void clearCollect() {
        this.scannedDeviceList.clear();
        HashMap<String, ScannedDeviceInfo> map = this.mMixedHuamiDevices;
        if (map != null) {
            map.clear();
        }
        this.mHaveCheckedDevices.clear();
    }

    @NotNull
    public final PowerfullAdapter<ScannedDeviceInfo> getAdapter() {
        return (PowerfullAdapter) this.adapter.getValue();
    }

    @NotNull
    public final ObservableInt getButtonText() {
        return this.buttonText;
    }

    public final void getCommonConfig() {
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getCommonConfig(new Function1() { // from class: jdl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceViewModel.getCommonConfig$lambda$23(this.f22679a, (String) obj);
            }
        }, new Function1() { // from class: kdl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceViewModel.getCommonConfig$lambda$24((ApiException) obj);
            }
        });
    }

    @NotNull
    public final ObservableField<String> getDeviceIcon() {
        return this.deviceIcon;
    }

    @Nullable
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final ObservableField<String> getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHealthDeviceAccessSwitch() {
        return this.healthDeviceAccessSwitch;
    }

    @NotNull
    public final ItemBinding<ScannedDeviceInfo> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ProductManagerInternal getMProductManager() {
        ProductManagerInternal productManagerInternal = this.mProductManager;
        if (productManagerInternal != null) {
            return productManagerInternal;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mProductManager");
        return null;
    }

    @NotNull
    public final ScanManager getMScanManager() {
        ScanManager scanManager = this.mScanManager;
        if (scanManager != null) {
            return scanManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mScanManager");
        return null;
    }

    @NotNull
    public final ObservableArrayList<ScannedDeviceInfo> getScannedDeviceList() {
        return this.scannedDeviceList;
    }

    @NotNull
    public final MutableLiveData<Integer> getSearchStatus$device_manager_chinaProductRelease() {
        return this.searchStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: isSearching, reason: from getter */
    public final ObservableBoolean getIsSearching() {
        return this.isSearching;
    }

    @NotNull
    /* JADX INFO: renamed from: isShowList, reason: from getter */
    public final ObservableBoolean getIsShowList() {
        return this.isShowList;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getAdapter().setLifecycle(owner.getLifecycle());
        this.searchStatus.observe(owner, new ScanDeviceViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ddl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ScanDeviceViewModel.onCreate$lambda$15(this.f15412a, (Integer) obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        stopSearch();
    }

    public final void setDeviceInfo(@Nullable DeviceInfo deviceInfo) {
        DeviceModelExtKt.logi(TAG, "startSearch() called with: deviceInfo = " + deviceInfo);
        this.deviceInfo = deviceInfo;
        this.deviceName.set(deviceInfo != null ? deviceInfo.getName() : null);
        this.deviceIcon.set(deviceInfo != null ? deviceInfo.getBigPreview() : null);
    }

    public final void setMProductManager(@NotNull ProductManagerInternal productManagerInternal) {
        Intrinsics.checkNotNullParameter(productManagerInternal, "<set-?>");
        this.mProductManager = productManagerInternal;
    }

    public final void setMScanManager(@NotNull ScanManager scanManager) {
        Intrinsics.checkNotNullParameter(scanManager, "<set-?>");
        this.mScanManager = scanManager;
    }

    public final void setSearchStatus$device_manager_chinaProductRelease(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.searchStatus = mutableLiveData;
    }

    public final void startSearch() {
        Integer value = this.searchStatus.getValue();
        if (value != null && value.intValue() == 1) {
            return;
        }
        this.searchStatus.setValue(1);
        this.mSearchingStartTime = System.currentTimeMillis();
        this.scannedDeviceList.clear();
        getMScanTimer().start();
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo == null) {
            searchBleByNamePrefixAndMiBeacon();
        } else {
            Intrinsics.checkNotNull(deviceInfo);
            searchBleSpecial(deviceInfo);
        }
    }

    public final void stopSearch() {
        getMScanManager().stopSearch();
        this.searchStatus.setValue(4);
        getMScanTimer().cancel();
    }
}
