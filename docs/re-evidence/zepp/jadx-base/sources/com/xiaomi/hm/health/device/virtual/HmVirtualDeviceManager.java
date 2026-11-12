package com.xiaomi.hm.health.device.virtual;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmVirtualDevice;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import de.greenrobot.event.EventBus;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0005R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001f¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager;", "Lorg/koin/core/component/KoinComponent;", "Lio/reactivex/ObservableEmitter;", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "emitter", "", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager$BindCallback;", "callback", "startBind", "Landroid/app/Activity;", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "jumpToDeviceActivity", "jumpToBindActivity", "", "isHasBoundedVirtualDevice", "notifyMutexLoginSuccess", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "c", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Ljava/lang/Object;", "Ljava/lang/Object;", "mMutexLoginObj", "<init>", "()V", "Companion", "BindCallback", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmVirtualDeviceManager implements KoinComponent {

    @NotNull
    private static final String d = "HmVirtualDeviceManager";

    @NotNull
    private static final String e = "0108";
    private static final long f = 20000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Object mMutexLoginObj;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HmVirtualDeviceManager> g = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager$BindCallback;", "", "Lcom/xiaomi/hm/health/device/virtual/VirtualBindResult;", "result", "", "onResult", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public interface BindCallback {
        void onResult(@NotNull VirtualBindResult result);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\bR#\u0010\t\u001a\u00020\u00028F@\u0007X\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager$Companion;", "", "Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager;", "getInstance$annotations", "()V", DefaultSettingsSpiCall.n, "", "MUTEX_LOGIN_CODE", "Ljava/lang/String;", "", "MUTEX_LOGIN_WAIT_TIME", "J", "TAG", "<init>", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final HmVirtualDeviceManager getInstance() {
            return (HmVirtualDeviceManager) HmVirtualDeviceManager.g.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/virtual/HmVirtualDeviceManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HmVirtualDeviceManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HmVirtualDeviceManager invoke() {
            return new HmVirtualDeviceManager(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HmVirtualDeviceManager() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
        this.mMutexLoginObj = new Object();
    }

    public /* synthetic */ HmVirtualDeviceManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceXNavigator c() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HmVirtualDeviceManager hmVirtualDeviceManager, Context context, ObservableEmitter observableEmitter) {
        Object next;
        Device device;
        Device device2;
        Integer activeStatus;
        Integer device_bind_status;
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            observableEmitter.onNext(VirtualBindResult.NO_NETWORK.INSTANCE);
            return;
        }
        if (hmVirtualDeviceManager.isHasBoundedVirtualDevice()) {
            observableEmitter.onNext(VirtualBindResult.HAS_BOUND.INSTANCE);
            return;
        }
        observableEmitter.onNext(VirtualBindResult.START_BIND.INSTANCE);
        final HMHttpResponseData hMHttpResponseData = new HMHttpResponseData();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        HMDeviceWebAPI.getDeviceListFromServerSync(new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager$startBind$1$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "fetch device list from server cancel";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "fetch device list from server completed";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "fetch device list from server error";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public static final d a = new d();

                public d() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "fetch device list from server onData";
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                HMLog.info("HmVirtualDeviceManager", a.a);
                booleanRef.element = true;
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.info("HmVirtualDeviceManager", b.a);
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                HMLog.error("HmVirtualDeviceManager", "", throwable, c.a);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                HMLog.info("HmVirtualDeviceManager", d.a);
                if (item == null) {
                    return;
                }
                hMHttpResponseData.copy(item);
            }
        }, true);
        if (!hMHttpResponseData.isSuccess() && booleanRef.element) {
            hmVirtualDeviceManager.e(observableEmitter);
            return;
        }
        VirtualBindResult virtualBindResult = null;
        if ((hMHttpResponseData.isSuccess() ? hMHttpResponseData : null) != null) {
            ArrayList<Device> deviceListFromWeb = HMDeviceWebAPI.parseDeviceListFromWeb(hMHttpResponseData);
            if (deviceListFromWeb == null) {
                device = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : deviceListFromWeb) {
                    if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, HMDeviceSource.fromValue(((Device) obj).getDevice_source().intValue()))) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        device2 = (Device) next;
                        activeStatus = device2.getActiveStatus();
                    }
                } while (!(activeStatus != null && activeStatus.intValue() == 1 && (device_bind_status = device2.getDevice_bind_status()) != null && device_bind_status.intValue() == 1));
                device = (Device) next;
            }
            if (device != null) {
                device.setStatus(1);
                DeviceManagerApi deviceManagerApiB = hmVirtualDeviceManager.b();
                HMDeviceType hMDeviceType = HMDeviceType.MILI;
                deviceManagerApiB.disableDevice(hMDeviceType);
                hmVirtualDeviceManager.b().bindDevice(new HmVirtualDevice(context, HMDeviceSource.fromValue(device.getDevice_source().intValue()), device.getDevice_address()), device);
                HMDaoManager.getInstance().getDeviceDao().insertOrReplace(device);
                EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, hMDeviceType));
                virtualBindResult = VirtualBindResult.SUCCESS.INSTANCE;
            }
            if (virtualBindResult == null) {
                virtualBindResult = VirtualBindResult.NO_DEVICE.INSTANCE;
            }
        }
        if (virtualBindResult == null) {
            virtualBindResult = VirtualBindResult.FAIL.INSTANCE;
        }
        observableEmitter.onNext(virtualBindResult);
    }

    private final void e(ObservableEmitter<VirtualBindResult> emitter) {
        synchronized (this.mMutexLoginObj) {
            this.mMutexLoginObj.wait(20000L);
            Unit unit = Unit.INSTANCE;
        }
        emitter.onNext(isHasBoundedVirtualDevice() ? VirtualBindResult.SUCCESS.INSTANCE : VirtualBindResult.FAIL.INSTANCE);
    }

    @NotNull
    public static final HmVirtualDeviceManager getInstance() {
        return INSTANCE.getInstance();
    }

    public static /* synthetic */ void jumpToDeviceActivity$default(HmVirtualDeviceManager hmVirtualDeviceManager, Activity activity, Device device, int i, Object obj) {
        if ((i & 2) != 0) {
            device = hmVirtualDeviceManager.b().getBindInfo(HMDeviceType.MILI);
        }
        hmVirtualDeviceManager.jumpToDeviceActivity(activity, device);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isHasBoundedVirtualDevice() {
        return ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE);
    }

    public final void jumpToBindActivity(@NotNull Activity context) {
        c().startBindFitbitActivity(context);
    }

    public final void jumpToDeviceActivity(@NotNull Activity context, @Nullable Device device) {
        if (device == null) {
            return;
        }
        c().startHmFitbitDeviceActivity(context, device);
    }

    public final void notifyMutexLoginSuccess() {
        synchronized (this.mMutexLoginObj) {
            this.mMutexLoginObj.notify();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void startBind(@NotNull final Context context, @NotNull final BindCallback callback) {
        Observable.create(new ObservableOnSubscribe() { // from class: s74
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                HmVirtualDeviceManager.d(this.a, context, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<VirtualBindResult>() { // from class: com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager.startBind.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager$startBind$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "bind virtual device error";
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
            }

            @Override // io.reactivex.Observer
            public void onError(@NotNull Throwable e2) {
                HMLog.error(HmVirtualDeviceManager.d, "", e2, a.a);
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(@NotNull Disposable d2) {
            }

            @Override // io.reactivex.Observer
            public void onNext(@NotNull VirtualBindResult t) {
                callback.onResult(t);
            }
        });
    }
}
