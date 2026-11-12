package com.xiaomi.fitness.eco.device.manager.ui.tab;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import androidx.databinding.ObservableArrayList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceParameter;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.manager.EcoDeviceModelClient;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoBluetoothExtKt;
import com.xiaomi.fitness.eco.device.manager.ui.BloodSugarDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.EarPhoneDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import defpackage.dw1;
import defpackage.fui;
import defpackage.ms7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0002ag\b\u0007\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001{B\t\b\u0007¢\u0006\u0004\bz\u0010\u0012J3\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u001d\u0010 \u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015H\u0002¢\u0006\u0004\b \u0010\u0019J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010'\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u0012J\u001d\u0010.\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b0\u0010$J\u001d\u00102\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010-\u001a\u000201¢\u0006\u0004\b4\u00103J\u001b\u00105\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b5\u0010\u0019J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b6\u0010\u001bJ\u001f\u00108\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020G8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020B0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR(\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR%\u0010[\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\u00060\u00060R8\u0006¢\u0006\f\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010WR\u0016\u0010]\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR5\u0010q\u001a#\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010n¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\n0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabModel;", "", "did", "mac", "", "connect", "", "status", "", "updateConnectStatus", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "Lms7;", "deviceModel", "isDeviceConnecting", "(Lms7;)Z", "updateDeviceItemsOnMain", "()V", "addBloodSugarDevice", "addEarPhoneDevice", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", TSMAuthContants.PARAM_DEVICE_MODELS, "connectThirdPartyDevices", "(Ljava/util/List;)V", "realConnect", "(Ljava/lang/String;)V", "connectThirdPartyDevicesByDid", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "preConnectDevice", "requestPermissionIfNeed", "connectDevices", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "removeItem", "isRefresh", "updateDeviceList", "(Z)V", "updateDeviceItems", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "bindDevice", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/fitness/device/manager/a;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/device/manager/l$a;", "unbindDevice", "(Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/l$a;)V", "unbindEarPhoneDevice", "preConnectThirdPartyDevice", "preConnectThirdPartyDeviceByDid", "isAuto", "syncWearDevice", "(Ljava/lang/String;Z)V", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "ecoDeviceManager", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "getEcoDeviceManager", "()Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "setEcoDeviceManager", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;)V", "Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "items", "Landroidx/databinding/ObservableArrayList;", "getItems", "()Landroidx/databinding/ObservableArrayList;", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceAdapterV4;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceAdapterV4;", "adapter", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/ConnectStatus;", "bleReconnect", "Landroidx/lifecycle/MutableLiveData;", "getBleReconnect", "()Landroidx/lifecycle/MutableLiveData;", "setBleReconnect", "(Landroidx/lifecycle/MutableLiveData;)V", "kotlin.jvm.PlatformType", "showConnectPermission", "getShowConnectPermission", "mOwner", "Landroidx/lifecycle/LifecycleOwner;", "isOpenBluetoothShowed", "Z", "com/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$mEcoDeviceStatusListener$1", "mEcoDeviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$mEcoDeviceStatusListener$1;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "deviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "com/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$deviceSpecificStatusListener$1", "deviceSpecificStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$deviceSpecificStatusListener$1;", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", "mSyncStateListener", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lkotlin/ParameterName;", "name", "deviceChangeListener", "Lkotlin/jvm/functions/Function1;", "FROM_REBIND", "I", "getFROM_REBIND", "()I", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOtherDeviceTabV4ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherDeviceTabV4ViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n27#2,5:569\n774#3:574\n865#3,2:575\n1872#3,3:577\n1863#3,2:580\n1863#3,2:582\n*S KotlinDebug\n*F\n+ 1 OtherDeviceTabV4ViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel\n*L\n85#1:569,5\n353#1:574\n353#1:575,2\n354#1:577,3\n435#1:580,2\n539#1:582,2\n*E\n"})
public final class OtherDeviceTabV4ViewModel extends BaseViewModel<OtherDeviceTabModel> {

    @NotNull
    public static final String ADD_NEW_DID = "did-add-new";

    @NotNull
    public static final String EMPTY_DID = "did-empty";
    private static final int REQUEST_PERMISSION_INTERVAL = 172800000;
    private final int FROM_REBIND;

    @NotNull
    private MutableLiveData<ConnectStatus> bleReconnect;

    @NotNull
    private final Function1<DeviceModel<?>, Unit> deviceChangeListener;

    @NotNull
    private final OtherDeviceTabV4ViewModel$deviceSpecificStatusListener$1 deviceSpecificStatusListener;

    @NotNull
    private final OnDeviceStatusListener deviceStatusListener;
    public EcoDeviceManagerWrapper ecoDeviceManager;
    private boolean isOpenBluetoothShowed;

    @NotNull
    private final ItemBinding<EcoDeviceDetail> itemBinding;

    @NotNull
    private final OtherDeviceTabV4ViewModel$mEcoDeviceStatusListener$1 mEcoDeviceStatusListener;
    private LifecycleOwner mOwner;

    @NotNull
    private final SyncStateListener mSyncStateListener;

    @NotNull
    private final MutableLiveData<Boolean> showConnectPermission;

    @NotNull
    private final ObservableArrayList<EcoDeviceDetail> items = new ObservableArrayList<>();

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ndh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtherDeviceTabV4ViewModel.adapter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$updateDeviceItemsOnMain$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$updateDeviceItemsOnMain$1", f = "OtherDeviceTabV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOtherDeviceTabV4ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherDeviceTabV4ViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$updateDeviceItemsOnMain$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,568:1\n774#2:569\n865#2,2:570\n1863#2,2:572\n1863#2,2:574\n*S KotlinDebug\n*F\n+ 1 OtherDeviceTabV4ViewModel.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel$updateDeviceItemsOnMain$1\n*L\n249#1:569\n249#1:570,2\n251#1:572,2\n276#1:574,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OtherDeviceTabV4ViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EcoDevice ecoDevice;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OtherDeviceTabV4ViewModel.this.getItems().clear();
            Iterable deviceModels = OtherDeviceTabV4ViewModel.this.getEcoDeviceManager().getDeviceModels();
            Logger.i(OtherDeviceTabV4ViewModel.this.getTAG(), String.valueOf(deviceModels));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : deviceModels) {
                if (EcoDeviceModelExtKt.isEco((EcoDeviceModel) obj2)) {
                    arrayList.add(obj2);
                }
            }
            Logger.i(OtherDeviceTabV4ViewModel.this.getTAG(), "device list changed to " + arrayList.size());
            OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel = OtherDeviceTabV4ViewModel.this;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) it.next();
                EcoDeviceDetail ecoDeviceDetail = new EcoDeviceDetail();
                ecoDeviceDetail.setDid(ecoDeviceModel.getDid());
                ecoDeviceDetail.setIcon(DeviceModelExtKt.getDeviceIconUrl(ecoDeviceModel, 3));
                ecoDeviceDetail.setName(EcoDeviceModelExtKt.getName(ecoDeviceModel));
                Intrinsics.checkNotNull(ecoDeviceModel, "null cannot be cast to non-null type com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelWrapper");
                ecoDeviceDetail.setConnecting(otherDeviceTabV4ViewModel.isDeviceConnecting((ms7) ecoDeviceModel));
                ecoDeviceDetail.setConnectStatus(ecoDeviceModel.getDeviceStatus());
                ecoDeviceDetail.setCurrent(ecoDeviceModel.getIsCurrent());
                ecoDeviceDetail.setEco(EcoDeviceModelExtKt.isEco(ecoDeviceModel));
                if ((ecoDeviceModel instanceof EcoDeviceModelClient) && (ecoDevice = (EcoDevice) ((EcoDeviceModelClient) ecoDeviceModel).getDeviceInfo().device) != null) {
                    String shareId = ecoDevice.getShareId();
                    ecoDeviceDetail.setPendingPairing(shareId != null && shareId.length() > 0);
                    ecoDeviceDetail.setShareId(ecoDevice.getShareId());
                    ecoDeviceDetail.setUserId(ecoDevice.getUserId());
                    ecoDeviceDetail.setShareUserId(ecoDevice.getShareUserId());
                    ecoDeviceDetail.setModel(ecoDevice.getModel());
                    ecoDeviceDetail.setOwner(ecoDevice.getIsOwner());
                    ecoDeviceDetail.setMac(ecoDevice.getMac());
                }
                otherDeviceTabV4ViewModel.getItems().add(ecoDeviceDetail);
            }
            Iterable<RNDeviceModel> deviceModels2 = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
            OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel2 = OtherDeviceTabV4ViewModel.this;
            for (RNDeviceModel rNDeviceModel : deviceModels2) {
                if (!Intrinsics.areEqual(DeviceModelExtKt.getModel(rNDeviceModel), "yunmai.scales.ms3001")) {
                    EcoDeviceDetail ecoDeviceDetail2 = new EcoDeviceDetail();
                    ecoDeviceDetail2.setDid(rNDeviceModel.getDid());
                    ecoDeviceDetail2.setIcon(DeviceModelExtKt.getDeviceIconUrl(rNDeviceModel, 3));
                    ecoDeviceDetail2.setName(DeviceModelExtKt.getName(rNDeviceModel));
                    ecoDeviceDetail2.setConnecting(rNDeviceModel.getIsDeviceConnected() || rNDeviceModel.getDeviceStatus() == 2);
                    ecoDeviceDetail2.setConnectStatus(rNDeviceModel.getDeviceStatus());
                    ecoDeviceDetail2.setCurrent(rNDeviceModel.getIsCurrent());
                    ecoDeviceDetail2.setEco(false);
                    ecoDeviceDetail2.setDeviceType(3);
                    ecoDeviceDetail2.setOwner(rNDeviceModel.isOwner());
                    RNDevice rNDevice = (RNDevice) rNDeviceModel.getDeviceInfo().device;
                    if (rNDevice != null) {
                        ecoDeviceDetail2.setModel(rNDevice.getModel());
                        ecoDeviceDetail2.setMac(rNDevice.getMac());
                    }
                    otherDeviceTabV4ViewModel2.getItems().add(ecoDeviceDetail2);
                }
            }
            OtherDeviceTabV4ViewModel.this.addBloodSugarDevice();
            OtherDeviceTabV4ViewModel.this.addEarPhoneDevice();
            if (OtherDeviceTabV4ViewModel.this.getItems().isEmpty()) {
                EcoDeviceDetail ecoDeviceDetail3 = new EcoDeviceDetail();
                ecoDeviceDetail3.setDid(OtherDeviceTabV4ViewModel.ADD_NEW_DID);
                OtherDeviceTabV4ViewModel.this.getItems().add(ecoDeviceDetail3);
            }
            OtherDeviceTabV4ViewModel.this.preConnectDevice(arrayList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$updateDeviceList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$updateDeviceList$1", f = "OtherDeviceTabV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C23031(Continuation<? super C23031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OtherDeviceTabV4ViewModel.this.new C23031(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                OtherDeviceTabV4ViewModel.this.getMModel().updateDevices();
                OtherDeviceTabV4ViewModel.this.updateDeviceItems();
            } catch (Exception e) {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.loge("update device list error", e);
                OtherDeviceTabV4ViewModel.this.updateDeviceItems();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C23031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$mEcoDeviceStatusListener$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$deviceSpecificStatusListener$1] */
    public OtherDeviceTabV4ViewModel() {
        final Function3 function3 = new Function3() { // from class: pdh
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return OtherDeviceTabV4ViewModel.itemBinding$lambda$1((ItemBinding) obj, ((Integer) obj2).intValue(), (EcoDeviceDetail) obj3);
            }
        };
        this.itemBinding = ItemBinding.INSTANCE.of(new OnItemBind<EcoDeviceDetail>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$special$$inlined$itemBindingOf$1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<EcoDeviceDetail> itemBinding, int position, EcoDeviceDetail item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                function3.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
        this.bleReconnect = new MutableLiveData<>();
        this.showConnectPermission = new MutableLiveData<>(Boolean.FALSE);
        this.mEcoDeviceStatusListener = new OnEcoDeviceStatusListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$mEcoDeviceStatusListener$1
            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
            public void onConnectFailure(String did, String mac, int errorCode, int retryTimes) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                this.this$0.updateConnectStatus(did, mac, false, 1);
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
            public void onConnectStart(String did, String mac) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                this.this$0.updateConnectStatus(did, mac, false, 2);
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
            public void onConnectSuccess(String did, String mac) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                this.this$0.updateConnectStatus(did, mac, true, 3);
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
            public void onDisconnect(String did, String mac) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                this.this$0.updateConnectStatus(did, mac, false, 4);
            }
        };
        this.deviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$deviceStatusListener$1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
                WearableDeviceModel wearableDeviceModel;
                Logger.i(this.this$0.getTAG(), "onConnectFailure did = " + did + ", errorCode = " + errorCode);
                this.this$0.updateConnectStatus(did, null, false, 1);
                if (did != null) {
                    OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel = this.this$0;
                    if (errorCode != 2005 || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
                        return;
                    }
                    Logger.i(otherDeviceTabV4ViewModel.getTAG(), "lostDevice " + wearableDeviceModel);
                    if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone(wearableDeviceModel)) {
                        otherDeviceTabV4ViewModel.getBleReconnect().postValue(new ConnectStatus(errorCode, wearableDeviceModel, 0, 4, null));
                    }
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
                Logger.i(this.this$0.getTAG(), "onConnectStart did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 2);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                Logger.i(this.this$0.getTAG(), "onConnectSuccess did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 3);
                if (did == null || did.length() <= 0) {
                    return;
                }
                OtherDeviceTabV4ViewModel.syncWearDevice$default(this.this$0, did, false, 2, null);
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
                Logger.i(this.this$0.getTAG(), "onDisconnect did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 4);
            }
        };
        this.deviceSpecificStatusListener = new OnSpecificDeviceStatusListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$deviceSpecificStatusListener$1
            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceConnectFailure(String did, String model, int errorCode) {
                Logger.i(this.this$0.getTAG(), "onConnectFailure did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 1);
            }

            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceConnectStart(String did, String model) {
                Logger.i(this.this$0.getTAG(), "onConnectStart did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 2);
            }

            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceConnectSuccess(String did, String model) {
                Logger.i(this.this$0.getTAG(), "onConnectSuccess did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 3);
            }

            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceDisconnect(String did, String model) {
                Logger.i(this.this$0.getTAG(), "onDisconnect did = " + did);
                this.this$0.updateConnectStatus(did, null, false, 4);
            }
        };
        this.mSyncStateListener = new SyncStateListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel$mSyncStateListener$1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(this.this$0.getTAG(), "mSyncStateListener.mSyncStateListener.onFinish  did:" + did + "  code:" + code);
                if (code == 0) {
                    AnyExtKt.main$default(null, new OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$1(this.this$0, did, null), 1, null);
                } else {
                    AnyExtKt.main$default(null, new OtherDeviceTabV4ViewModel$mSyncStateListener$1$onFinish$2(this.this$0, did, null), 1, null);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(this.this$0.getTAG(), "mSyncStateListener.onStart  " + did);
                AnyExtKt.main$default(null, new OtherDeviceTabV4ViewModel$mSyncStateListener$1$onStart$1(this.this$0, did, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
                Logger.i(this.this$0.getTAG(), "mSyncStateListener.onSyncing  " + did);
            }
        };
        this.deviceChangeListener = new Function1() { // from class: qdh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabV4ViewModel.deviceChangeListener$lambda$3(this.f31410a, (DeviceModel) obj);
            }
        };
        this.FROM_REBIND = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtherDeviceAdapterV4 adapter_delegate$lambda$0() {
        return new OtherDeviceAdapterV4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addBloodSugarDevice() {
        Object next;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        Device deviceByModelFromAllDevice = DeviceManagerExtKt.getInstance(companion).getDeviceByModelFromAllDevice(BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).getModel());
        if (deviceByModelFromAllDevice != null) {
            Logger.i(getTAG(), "bloodSugarDevice = " + deviceByModelFromAllDevice);
            BloodSugarDeviceDetail bloodSugarDeviceDetail = new BloodSugarDeviceDetail();
            bloodSugarDeviceDetail.setDeviceType(2);
            bloodSugarDeviceDetail.setName(deviceByModelFromAllDevice.getName());
            bloodSugarDeviceDetail.setModel(deviceByModelFromAllDevice.getModel());
            Iterator it = DeviceManagerExtKt.getInstance(companion).getDeviceModels().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!BloodSugarExtKt.isBloodSugar((WearableDeviceModel) next));
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) next;
            Logger.i(getTAG(), "bloodSugarDeviceModel = " + wearableDeviceModel + " + " + (wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null) + " + " + (wearableDeviceModel != null ? Integer.valueOf(wearableDeviceModel.getDeviceStatus()) : null));
            if (wearableDeviceModel != null) {
                bloodSugarDeviceDetail.setDid(wearableDeviceModel.getDid());
                bloodSugarDeviceDetail.setConnecting(wearableDeviceModel.getIsDeviceConnected() || wearableDeviceModel.getDeviceStatus() == 2);
                bloodSugarDeviceDetail.setConnectStatus(wearableDeviceModel.getDeviceStatus());
                bloodSugarDeviceDetail.setCurrent(wearableDeviceModel.getIsCurrent());
                bloodSugarDeviceDetail.setEco(false);
                this.items.add(bloodSugarDeviceDetail);
                if (!wearableDeviceModel.getIsDeviceConnected()) {
                    preConnectThirdPartyDevice(CollectionsKt__CollectionsJVMKt.listOf(wearableDeviceModel));
                }
            } else {
                bloodSugarDeviceDetail.setConnectStatus(-1);
                bloodSugarDeviceDetail.setConnecting(false);
                bloodSugarDeviceDetail.setCurrent(false);
                bloodSugarDeviceDetail.setEco(false);
                this.items.add(bloodSugarDeviceDetail);
            }
            Logger.i(getTAG(), "deviceDetail = " + bloodSugarDeviceDetail);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEarPhoneDevice() {
        Iterable localDeviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModels();
        Logger.i(getTAG(), "localDeviceModels: " + localDeviceModels);
        ArrayList arrayList = new ArrayList();
        for (Object obj : localDeviceModels) {
            if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone((WearableDeviceModel) obj)) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) obj2;
            Logger.i(getTAG(), "earPhoneDevice = " + wearableDeviceModel);
            EarPhoneDeviceDetail earPhoneDeviceDetail = new EarPhoneDeviceDetail();
            earPhoneDeviceDetail.setDeviceType(4);
            earPhoneDeviceDetail.setName(DeviceModelExtKt.getName(wearableDeviceModel));
            earPhoneDeviceDetail.setIcon(DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 3));
            earPhoneDeviceDetail.setModel(DeviceModelExtKt.getModel(wearableDeviceModel));
            earPhoneDeviceDetail.setDid(wearableDeviceModel.getDid());
            earPhoneDeviceDetail.setConnectStatus(wearableDeviceModel.getDeviceStatus());
            earPhoneDeviceDetail.setCurrent(wearableDeviceModel.getIsCurrent());
            earPhoneDeviceDetail.setEco(false);
            this.items.add(earPhoneDeviceDetail);
            if (!wearableDeviceModel.getIsDeviceConnected()) {
                preConnectThirdPartyDevice(CollectionsKt__CollectionsJVMKt.listOf(wearableDeviceModel));
            }
            updateConnectStatus(wearableDeviceModel.getDid(), null, false, wearableDeviceModel.getDeviceStatus());
            Logger.i(getTAG(), "deviceDetail = " + earPhoneDeviceDetail);
            i = i2;
        }
    }

    private final void connectDevices(final List<? extends EcoDeviceModel> deviceModels) {
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi(getTAG(), "connectDevices");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        if (defaultAdapter.isEnabled() || !this.isOpenBluetoothShowed) {
            LifecycleOwner lifecycleOwner = this.mOwner;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOwner");
                lifecycleOwner = null;
            }
            BaseActivity baseActivity = (BaseActivity) ((BaseFragment) lifecycleOwner).getActivity();
            if (baseActivity == null) {
                com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("activity is null, return!");
            } else {
                this.isOpenBluetoothShowed = true;
                EcoBluetoothExtKt.openBluetooth(baseActivity, new Function0() { // from class: rdh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtherDeviceTabV4ViewModel.connectDevices$lambda$20(deviceModels, this);
                    }
                }, new Function1() { // from class: sdh
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OtherDeviceTabV4ViewModel.connectDevices$lambda$21(((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectDevices$lambda$20(List deviceModels, OtherDeviceTabV4ViewModel this$0) {
        EcoDevice ecoDevice;
        String shareId;
        Intrinsics.checkNotNullParameter(deviceModels, "$deviceModels");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = deviceModels.iterator();
        while (it.hasNext()) {
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) it.next();
            Logger.i(this$0.getTAG(), "connectDevices it : " + ecoDeviceModel);
            boolean z = false;
            if ((ecoDeviceModel instanceof EcoDeviceModelClient) && (ecoDevice = (EcoDevice) ((EcoDeviceModelClient) ecoDeviceModel).getDeviceInfo().device) != null && (shareId = ecoDevice.getShareId()) != null && shareId.length() > 0) {
                z = true;
            }
            Logger.i(this$0.getTAG(), "connectDevices isEco : " + EcoDeviceModelExtKt.isEco(ecoDeviceModel));
            Logger.i(this$0.getTAG(), "connectDevices isDeviceConnected : " + ecoDeviceModel.getIsDeviceConnected());
            Logger.i(this$0.getTAG(), "connectDevices isPendingPairing : " + z);
            if (EcoDeviceModelExtKt.isEco(ecoDeviceModel) && !ecoDeviceModel.getIsDeviceConnected() && !z) {
                EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).connectDevice(ecoDeviceModel.getDid());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectDevices$lambda$21(int i) {
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("Cannot open bluetooth");
        return Unit.INSTANCE;
    }

    private final void connectThirdPartyDevices(final List<? extends WearableDeviceModel> deviceModels) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        if (defaultAdapter.isEnabled() || !this.isOpenBluetoothShowed) {
            this.isOpenBluetoothShowed = true;
            LifecycleOwner lifecycleOwner = this.mOwner;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOwner");
                lifecycleOwner = null;
            }
            BaseActivity baseActivity = (BaseActivity) ((BaseFragment) lifecycleOwner).getActivity();
            if (baseActivity != null) {
                EcoBluetoothExtKt.openBluetooth(baseActivity, new Function0() { // from class: vdh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtherDeviceTabV4ViewModel.connectThirdPartyDevices$lambda$13$lambda$11(deviceModels);
                    }
                }, new Function1() { // from class: wdh
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OtherDeviceTabV4ViewModel.connectThirdPartyDevices$lambda$13$lambda$12(((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectThirdPartyDevices$lambda$13$lambda$11(List deviceModels) {
        Intrinsics.checkNotNullParameter(deviceModels, "$deviceModels");
        Iterator it = deviceModels.iterator();
        while (it.hasNext()) {
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(((WearableDeviceModel) it.next()).getDid());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectThirdPartyDevices$lambda$13$lambda$12(int i) {
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("Cannot open bluetooth");
        return Unit.INSTANCE;
    }

    private final void connectThirdPartyDevicesByDid(final String did) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        if (defaultAdapter.isEnabled() || !this.isOpenBluetoothShowed) {
            this.isOpenBluetoothShowed = true;
            LifecycleOwner lifecycleOwner = this.mOwner;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOwner");
                lifecycleOwner = null;
            }
            BaseActivity baseActivity = (BaseActivity) ((BaseFragment) lifecycleOwner).getActivity();
            if (baseActivity != null) {
                EcoBluetoothExtKt.openBluetooth(baseActivity, new Function0() { // from class: tdh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtherDeviceTabV4ViewModel.connectThirdPartyDevicesByDid$lambda$18$lambda$16(did);
                    }
                }, new Function1() { // from class: udh
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OtherDeviceTabV4ViewModel.connectThirdPartyDevicesByDid$lambda$18$lambda$17(((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectThirdPartyDevicesByDid$lambda$18$lambda$16(String did) {
        Intrinsics.checkNotNullParameter(did, "$did");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(did);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connectThirdPartyDevicesByDid$lambda$18$lambda$17(int i) {
        com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt.logi("Cannot open bluetooth");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChangeListener$lambda$3(OtherDeviceTabV4ViewModel this$0, DeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (deviceModel != null) {
            Logger.i(this$0.getTAG(), "onDeviceChange " + deviceModel);
            this$0.updateDeviceItems();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDeviceConnecting(ms7 deviceModel) {
        return deviceModel.getIsDeviceConnected() || deviceModel.getDeviceStatus() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemBinding$lambda$1(ItemBinding itemBinding, int i, EcoDeviceDetail item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        itemBinding.set(dw1.c, fui.m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preConnectDevice(List<? extends EcoDeviceModel> deviceModels) {
        Logger.i(getTAG(), "preConnectDevice " + deviceModels.size());
        if (deviceModels.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            connectDevices(deviceModels);
        } else if (!PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT")) {
            requestPermissionIfNeed();
        } else {
            connectDevices(deviceModels);
            this.showConnectPermission.postValue(Boolean.FALSE);
        }
    }

    private final void realConnect(final String did) {
        Logger.i(getTAG(), "realConnect " + did);
        LifecycleOwner lifecycleOwner = this.mOwner;
        if (lifecycleOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOwner");
            lifecycleOwner = null;
        }
        BaseActivity baseActivity = (BaseActivity) ((BaseFragment) lifecycleOwner).getActivity();
        if (baseActivity == null) {
            Logger.i(getTAG(), "activity is null, return!");
        } else {
            EcoBluetoothExtKt.openBluetooth(baseActivity, new Function0() { // from class: xdh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtherDeviceTabV4ViewModel.realConnect$lambda$14(this.f39018a, did);
                }
            }, new Function1() { // from class: odh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OtherDeviceTabV4ViewModel.realConnect$lambda$15(this.f29036a, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realConnect$lambda$14(OtherDeviceTabV4ViewModel this$0, String did) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        this$0.connectThirdPartyDevicesByDid(did);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realConnect$lambda$15(OtherDeviceTabV4ViewModel this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "Cannot open bluetooth");
        return Unit.INSTANCE;
    }

    private final void requestPermissionIfNeed() {
        EcoDevicePreference ecoDevicePreference = EcoDevicePreference.INSTANCE;
        long last_request_permission_time = ecoDevicePreference.getLAST_REQUEST_PERMISSION_TIME();
        long last_show_blue_data_dialog_time = ecoDevicePreference.getLAST_SHOW_BLUE_DATA_DIALOG_TIME();
        if (last_request_permission_time > 0 || ecoDevicePreference.getAGREE_BLUE_DATA_ENABLE()) {
            if (System.currentTimeMillis() - last_request_permission_time < 172800000) {
                return;
            }
        } else if (System.currentTimeMillis() - last_show_blue_data_dialog_time < 172800000) {
            return;
        }
        this.showConnectPermission.postValue(Boolean.TRUE);
    }

    public static /* synthetic */ void syncWearDevice$default(OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        otherDeviceTabV4ViewModel.syncWearDevice(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConnectStatus(String did, String mac, boolean connect, int status) {
        Logger.i(getTAG(), "updateConnectStatus, did=" + did + ", mac = " + mac + ",connect=" + connect + ", status=" + status);
        getAdapter().updateItem(did, mac, connect, status);
    }

    private final void updateDeviceItemsOnMain() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }

    public static /* synthetic */ void updateDeviceList$default(OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        otherDeviceTabV4ViewModel.updateDeviceList(z);
    }

    public final void bindDevice(@NotNull WearableDeviceInfo deviceInfo, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (deviceInfo.getMac() == null) {
            Logger.e(getTAG(), "bindDevice mac is null");
            return;
        }
        Logger.i(getTAG(), "bindDevice " + deviceInfo.getMac());
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String model = deviceInfo.getModel();
        String mac = deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        deviceManagerExtKt.bindDevice(new DeviceParameter(model, mac, deviceInfo.getBleName(), deviceInfo.getNodeID(), null, false, deviceInfo.getDid(), this.FROM_REBIND, 32, null), callback);
    }

    @NotNull
    public final OtherDeviceAdapterV4 getAdapter() {
        return (OtherDeviceAdapterV4) this.adapter.getValue();
    }

    @NotNull
    public final MutableLiveData<ConnectStatus> getBleReconnect() {
        return this.bleReconnect;
    }

    @NotNull
    public final EcoDeviceManagerWrapper getEcoDeviceManager() {
        EcoDeviceManagerWrapper ecoDeviceManagerWrapper = this.ecoDeviceManager;
        if (ecoDeviceManagerWrapper != null) {
            return ecoDeviceManagerWrapper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ecoDeviceManager");
        return null;
    }

    public final int getFROM_REBIND() {
        return this.FROM_REBIND;
    }

    @NotNull
    public final ItemBinding<EcoDeviceDetail> getItemBinding() {
        return this.itemBinding;
    }

    @NotNull
    public final ObservableArrayList<EcoDeviceDetail> getItems() {
        return this.items;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowConnectPermission() {
        return this.showConnectPermission;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "OtherDeviceTabV4ViewModel";
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.mOwner = owner;
        EcoDeviceDetail.INSTANCE.setMode(1);
        getEcoDeviceManager().addDeviceStatusListener(this.mEcoDeviceStatusListener);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(this.deviceSpecificStatusListener);
        DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(this.deviceStatusListener);
        DeviceManagerExtKt.getInstance(companion).addDeviceChangeListener(this.deviceChangeListener);
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChangeListener);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        getEcoDeviceManager().removeDeviceStatusListener(this.mEcoDeviceStatusListener);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion).removeDeviceStatusListener(this.deviceStatusListener);
        DeviceManagerExtKt.getInstance(companion).removeDeviceStatusListener(this.deviceSpecificStatusListener);
        DeviceManagerExtKt.getInstance(companion).removeDeviceChangeListener(this.deviceChangeListener);
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChangeListener);
    }

    public final void preConnectThirdPartyDevice(@NotNull List<? extends WearableDeviceModel> deviceModels) {
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        if (deviceModels.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            connectThirdPartyDevices(deviceModels);
        } else if (!PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT")) {
            requestPermissionIfNeed();
        } else {
            connectThirdPartyDevices(deviceModels);
            this.showConnectPermission.postValue(Boolean.FALSE);
        }
    }

    public final void preConnectThirdPartyDeviceByDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (did.length() == 0) {
            Logger.i(getTAG(), "connectThirdPartyDevicesByDid but did is empty");
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            realConnect(did);
        } else if (PermissionsUtil.INSTANCE.checkPermission("android.permission.BLUETOOTH_CONNECT")) {
            realConnect(did);
        } else {
            requestPermissionIfNeed();
        }
    }

    public final void removeItem(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        getEcoDeviceManager().removeDeviceModel(did);
        updateDeviceItems();
    }

    public final void setBleReconnect(@NotNull MutableLiveData<ConnectStatus> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bleReconnect = mutableLiveData;
    }

    public final void setEcoDeviceManager(@NotNull EcoDeviceManagerWrapper ecoDeviceManagerWrapper) {
        Intrinsics.checkNotNullParameter(ecoDeviceManagerWrapper, "<set-?>");
        this.ecoDeviceManager = ecoDeviceManagerWrapper;
    }

    public final void syncWearDevice(@NotNull String did, boolean isAuto) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(getTAG(), "syncWearDevice did = " + did);
        DeviceContact.Companion companion = DeviceContact.INSTANCE;
        DeviceSyncExtKt.getInstance(companion).addSyncStateListener(this.mSyncStateListener);
        DeviceSyncExtKt.getInstance(companion).syncData(did, isAuto);
    }

    public final void unbindDevice(@NotNull String did, @NotNull l.a callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        getEcoDeviceManager().unbindDevice(did, callback);
    }

    public final void unbindEarPhoneDevice(@NotNull String did, @NotNull l.a callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).unbindDevice(did, callback);
    }

    public final void updateDeviceItems() {
        updateDeviceItemsOnMain();
    }

    public final void updateDeviceList(boolean isRefresh) {
        if (isRefresh) {
            AnyExtKt.io$default(null, new C23031(null), 1, null);
        } else {
            updateDeviceItems();
        }
    }
}
