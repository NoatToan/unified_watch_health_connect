package com.xiaomi.hm.health.ui.smartplay.btphone;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.phone.PairDisConnected;
import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
import com.huami.bluetooth.profile.channel.module.phone.Paired;
import com.huami.bluetooth.profile.channel.module.phone.SettingApi;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.tbruyelle.rxpermissions2.Permission;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneDeviceLifeCycle;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.ShowAuthInfo;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 [2\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u001b\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u000fJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u0006R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010+\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R'\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u000b0\u000b0!8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0!8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002030!8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b4\u0010%R\u0019\u0010:\u001a\u0002038\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001f\u0010C\u001a\u0004\u0018\u00010?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b'\u0010BR%\u0010F\u001a\n ,*\u0004\u0018\u00010D0D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\b<\u0010ER%\u0010I\u001a\n ,*\u0004\u0018\u00010G0G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\b6\u0010HR$\u0010K\u001a\t\u0018\u00010?¢\u0006\u0002\bJ8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\b-\u0010BR/\u0010P\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0M\u0012\u0004\u0012\u00020\u000f0L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\b@\u0010OR\u0019\u0010U\u001a\u00020Q8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00060V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010W\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "status", "Lkotlinx/coroutines/Job;", z.j, "", "o", "i", GoogleApiAvailabilityLight.b, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", hl.k, "Lkotlin/Pair;", "m", "", "time", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "Lkotlin/collections/ArrayList;", "e", "checkAuth", "Lcom/tbruyelle/rxpermissions2/Permission;", PointCategory.PERMISSION, "onPermission", "getDelayAlertTime", "enableBtPhone", "enableAlertDelay", "changeAlertDelayTime", "resetPairDialogData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewSetting;", "Landroidx/lifecycle/MutableLiveData;", "getBtPhoneConfigData", "()Landroidx/lifecycle/MutableLiveData;", "btPhoneConfigData", "b", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewSetting;", "getBtPhoneViewSetting", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/BtPhoneViewSetting;", "btPhoneViewSetting", "kotlin.jvm.PlatformType", "c", "getShowPairDialogData", "showPairDialogData", GoogleApiAvailabilityLight.a, "getLoadingData", "loadingData", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "getShowAuthInfoData", "showAuthInfoData", "f", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "getShowAuthInfo", "()Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/ShowAuthInfo;", "showAuthInfo", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "g", "Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "btPhoneApi", "", "h", "Lkotlin/Lazy;", "()Ljava/lang/String;", "btPhoneName", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "()Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "personInfo", "Lcom/xiaomi/hm/health/ui/smartplay/MiuiAPI;", "()Lcom/xiaomi/hm/health/ui/smartplay/MiuiAPI;", "miuiApi", "Lorg/jetbrains/annotations/Nullable;", "deviceAddress", "", "", "l", "()Ljava/util/Map;", "requiredPermissions", "Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "getBleStatusListener", "()Lcom/xiaomi/hm/health/ui/BLEStatueListenerAdapter;", "bleStatusListener", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "waitForInitBlock", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BtPhoneViewModel extends ViewModel {

    @NotNull
    private static final String o = "BtPhoneViewModel";
    private static final int p = 3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private SettingApi btPhoneApi;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BtPhoneViewSetting> btPhoneConfigData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final BtPhoneViewSetting btPhoneViewSetting = new BtPhoneViewSetting(false, false, 0, false, false, 31, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showPairDialogData = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> loadingData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ShowAuthInfo> showAuthInfoData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ShowAuthInfo showAuthInfo = new ShowAuthInfo(null, null, false, null, null, null, 48, null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy btPhoneName = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy personInfo = LazyKt__LazyJVMKt.lazy(o.a);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy miuiApi = LazyKt__LazyJVMKt.lazy(m.a);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceAddress = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy requiredPermissions = LazyKt__LazyJVMKt.lazy(u.a);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final BLEStatueListenerAdapter bleStatusListener = new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$bleStatusListener$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "on Ble device status change: " + this.a;
            }
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        @NotNull
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.MILI;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void notifyStatusWhenSetting(boolean enable) {
            this.a.getLoadingData().setValue(Boolean.TRUE);
            onEnableChange(enable);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            HMLog.info("BtPhoneViewModel", new a(enable));
            this.a.getBtPhoneViewSetting().setDeviceEnable(enable);
            if (enable) {
                this.a.i();
            } else {
                this.a.getBtPhoneConfigData().setValue(this.a.getBtPhoneViewSetting());
                this.a.getLoadingData().setValue(Boolean.FALSE);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final CompletableDeferred<Unit> waitForInitBlock = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$1", f = "BtPhoneViewModel.kt", i = {}, l = {139, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1032a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ BtPhoneViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1032a(boolean z, BtPhoneViewModel btPhoneViewModel) {
                super(0);
                this.a = z;
                this.b = btPhoneViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "has bt phone feature " + this.a + " and bt phone name = " + this.b.b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<PairStatus, Unit> {
            public final /* synthetic */ BtPhoneViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BtPhoneViewModel btPhoneViewModel) {
                super(1);
                this.a = btPhoneViewModel;
            }

            public final void a(@NotNull PairStatus pairStatus) {
                this.a.j(pairStatus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PairStatus pairStatus) {
                a(pairStatus);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BtPhoneViewModel btPhoneViewModel;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    btPhoneViewModel = (BtPhoneViewModel) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CompletableDeferred completableDeferred = BtPhoneViewModel.this.waitForInitBlock;
                Unit unit = Unit.INSTANCE;
                completableDeferred.complete(unit);
                return unit;
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(BtPhoneViewModel.o, new C1032a(HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(20), BtPhoneViewModel.this));
            btPhoneViewModel = BtPhoneViewModel.this;
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            this.a = btPhoneViewModel;
            this.b = 1;
            obj = btPhoneDevice.getBtDeviceApi(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneViewModel.btPhoneApi = (SettingApi) obj;
            SettingApi settingApi = BtPhoneViewModel.this.btPhoneApi;
            if (settingApi != null) {
                b bVar = new b(BtPhoneViewModel.this);
                this.a = null;
                this.b = 2;
                if (settingApi.registerPairStatus(true, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CompletableDeferred completableDeferred2 = BtPhoneViewModel.this.waitForInitBlock;
            Unit unit2 = Unit.INSTANCE;
            completableDeferred2.complete(unit2);
            return unit2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel", f = "BtPhoneViewModel.kt", i = {0, 0}, l = {375}, m = "_changeAlertDelayTime", n = {"this", "time"}, s = {"L$0", "I$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return BtPhoneViewModel.this.a(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, boolean z) {
            super(0);
            this.a = i;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set device delay time: " + this.a + " result: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return BluetoothAdapter.getDefaultAdapter().getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$changeAlertDelayTime$1", f = "BtPhoneViewModel.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BtPhoneViewModel btPhoneViewModel = BtPhoneViewModel.this;
                int i2 = this.c;
                this.a = 1;
                if (btPhoneViewModel.a(i2, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n"}, d2 = {"", "Lorg/jetbrains/annotations/Nullable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$enableAlertDelay$1", f = "BtPhoneViewModel.kt", i = {}, l = {360}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "try to enable alert delay, enable: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneViewModel.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMLog.info(BtPhoneViewModel.o, new a(this.c));
                BtPhoneViewModel.this.g().getMiliConfig().setPhoneNotifyDelayEnable(this.c);
                BtPhoneViewModel.this.g().saveInfo(2);
                BtPhoneViewModel.this.getBtPhoneViewSetting().setDelayAlertEnable(this.c);
                LiveDataExKt.put(BtPhoneViewModel.this.getBtPhoneConfigData(), BtPhoneViewModel.this.getBtPhoneViewSetting());
                int delayAlertTime = this.c ? BtPhoneViewModel.this.getBtPhoneViewSetting().getDelayAlertTime() : 0;
                BtPhoneViewModel btPhoneViewModel = BtPhoneViewModel.this;
                this.a = 1;
                if (btPhoneViewModel.a(delayAlertTime, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$enableBtPhone$1", f = "BtPhoneViewModel.kt", i = {2}, l = {306, 309, SportDeviceUtils.SOURCE_ZURICH_W, 334, 341}, m = "invokeSuspend", n = {"opSuccess"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ BtPhoneViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool, boolean z, BtPhoneViewModel btPhoneViewModel) {
                super(0);
                this.a = bool;
                this.b = z;
                this.c = btPhoneViewModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "enable bt phone result: " + this.a + " and current op: " + this.b + " current status: " + this.c.getBtPhoneViewSetting().getBtPhoneEnable();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "prepare result: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, Continuation<? super h> continuation) {
            super(2, continuation);
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneViewModel.this.new h(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:49:0x0101  */
        /* JADX WARN: Code duplicated, block: B:52:0x012a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x0135  */
        /* JADX WARN: Code duplicated, block: B:57:0x0139  */
        /* JADX WARN: Code duplicated, block: B:59:0x0145 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean bool;
            boolean z;
            BtPhoneViewModel btPhoneViewModel;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            Boolean bool2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(true));
                BtPhoneViewModel btPhoneViewModel2 = BtPhoneViewModel.this;
                this.b = 1;
                obj = btPhoneViewModel2.m(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        bool = (Boolean) obj;
                        HMLog.info(BtPhoneViewModel.o, new a(bool, this.d, BtPhoneViewModel.this));
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true)) && this.d != BtPhoneViewModel.this.getBtPhoneViewSetting().getBtPhoneEnable()) {
                            BtPhoneViewModel.this.getBtPhoneViewSetting().setBtPhoneEnable(this.d);
                            if (this.d) {
                                BtPhoneViewModel.this.g().getMiliConfig().enableInComingCallTime();
                            } else {
                                BtPhoneViewModel.this.g().getMiliConfig().disableInComingCallTime();
                            }
                            BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(this.d);
                            BtPhoneViewModel.this.g().saveInfo(2);
                            z = this.d;
                            this.a = bool;
                            this.b = 3;
                            if (BtPhoneDevice.showContact(z, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                            btPhoneViewModel = BtPhoneViewModel.this;
                            this.a = null;
                            this.b = 4;
                            if (btPhoneViewModel.n(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            btPhoneViewModel = BtPhoneViewModel.this;
                            this.a = null;
                            this.b = 4;
                            if (btPhoneViewModel.n(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i == 3) {
                        bool = (Boolean) this.a;
                        ResultKt.throwOnFailure(obj);
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false)) || !this.d) {
                            btPhoneViewModel = BtPhoneViewModel.this;
                            this.a = null;
                            this.b = 4;
                            if (btPhoneViewModel.n(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            bool2 = (Boolean) obj;
                            HMLog.info(BtPhoneViewModel.o, new b(bool2));
                            LiveDataExKt.put(BtPhoneViewModel.this.getShowPairDialogData(), Boxing.boxBoolean(true));
                            LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    LiveDataExKt.put(BtPhoneViewModel.this.getBtPhoneConfigData(), BtPhoneViewModel.this.getBtPhoneViewSetting());
                    LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) ((Pair) obj).getFirst()).booleanValue() && this.d) {
                SettingApi settingApi = BtPhoneViewModel.this.btPhoneApi;
                if (settingApi != null) {
                    String strB = BtPhoneViewModel.this.b();
                    if (strB == null) {
                        strB = " ";
                    }
                    this.b = 5;
                    obj = settingApi.preparePair(strB, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bool2 = (Boolean) obj;
                }
                HMLog.info(BtPhoneViewModel.o, new b(bool2));
                LiveDataExKt.put(BtPhoneViewModel.this.getShowPairDialogData(), Boxing.boxBoolean(true));
                LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            SettingApi settingApi2 = BtPhoneViewModel.this.btPhoneApi;
            if (settingApi2 == null) {
                bool = null;
            } else {
                ArrayList arrayListE = BtPhoneViewModel.this.e(this.d);
                this.b = 2;
                obj = settingApi2.updateSetting(arrayListE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
            }
            HMLog.info(BtPhoneViewModel.o, new a(bool, this.d, BtPhoneViewModel.this));
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                BtPhoneViewModel.this.getBtPhoneViewSetting().setBtPhoneEnable(this.d);
                if (this.d) {
                    BtPhoneViewModel.this.g().getMiliConfig().enableInComingCallTime();
                } else {
                    BtPhoneViewModel.this.g().getMiliConfig().disableInComingCallTime();
                }
                BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(this.d);
                BtPhoneViewModel.this.g().saveInfo(2);
                z = this.d;
                this.a = bool;
                this.b = 3;
                if (BtPhoneDevice.showContact(z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                btPhoneViewModel = BtPhoneViewModel.this;
                this.a = null;
                this.b = 4;
                if (btPhoneViewModel.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                btPhoneViewModel = BtPhoneViewModel.this;
                this.a = null;
                this.b = 4;
                if (btPhoneViewModel.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LiveDataExKt.put(BtPhoneViewModel.this.getBtPhoneConfigData(), BtPhoneViewModel.this.getBtPhoneViewSetting());
            LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$handlePairStatusChanged$1", f = "BtPhoneViewModel.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"paired"}, s = {"I$0"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ PairStatus c;
        public final /* synthetic */ BtPhoneViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, boolean z2) {
                super(0);
                this.a = z;
                this.b = z2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "query pair status: " + this.a + " and preBtPhoneEnabled: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(PairStatus pairStatus, BtPhoneViewModel btPhoneViewModel, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = pairStatus;
            this.d = btPhoneViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.c instanceof Paired;
                BtPhoneViewModel btPhoneViewModel = this.d;
                this.a = z ? 1 : 0;
                this.b = 1;
                Object objK = btPhoneViewModel.k(this);
                if (objK == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = z ? 1 : 0;
                obj = objK;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.a;
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info(BtPhoneViewModel.o, new a(i != 0, zBooleanValue));
            if (this.d.getBtPhoneViewSetting().getBtPhoneEnable() != zBooleanValue) {
                this.d.getBtPhoneViewSetting().setBtPhoneEnable(zBooleanValue);
                LiveDataExKt.put(this.d.getBtPhoneConfigData(), this.d.getBtPhoneViewSetting());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel", f = "BtPhoneViewModel.kt", i = {}, l = {274}, m = "isBtPhoneEnabled", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneViewModel.this.k(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel", f = "BtPhoneViewModel.kt", i = {}, l = {291}, m = "isPaired", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BtPhoneViewModel.this.m(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bt phone name is null!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/MiuiAPI;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<MiuiAPI> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MiuiAPI getA() {
            return MiuiAPI.getInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Permission a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Permission permission) {
            super(0);
            this.a = permission;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "on Permission: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<HMPersonInfo> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMPersonInfo getA() {
            return HMPersonInfo.getInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel", f = "BtPhoneViewModel.kt", i = {0, 1, 1, 1, 2, 3, 4}, l = {233, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 238, Mtu.ATT_MTU_MAX, 250}, m = "queryBtPhoneSetting", n = {"this", "this", "pairStatus", "preBtPhoneEnabled", "delayTime", "delayTime", "delayTime"}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$0", "I$0"})
    public static final class p extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public /* synthetic */ Object f;
        public int h;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return BtPhoneViewModel.this.n(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "adjust btphone setting reuslt: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<Boolean, Boolean> a;
        public final /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Pair<Boolean, Boolean> pair, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = pair;
            this.b = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "query bt phone setting paired: " + this.a + "; enable: " + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bt phone delay alert enable: " + BtPhoneViewModel.this.getBtPhoneViewSetting().getDelayAlertEnable() + "; delay alert time: " + BtPhoneViewModel.this.getBtPhoneViewSetting().getDelayAlertTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneViewModel$refreshBtPhoneConfig$1", f = "BtPhoneViewModel.kt", i = {}, l = {175, DataTypeSource.SPORT_TYPE_BRIDGE, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BtPhoneViewModel.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean btPhoneEnable;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    btPhoneEnable = BtPhoneViewModel.this.getBtPhoneViewSetting().getBtPhoneEnable();
                    this.a = 3;
                    if (BtPhoneDevice.showContact(btPhoneEnable, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(BtPhoneViewModel.this.getBtPhoneViewSetting().getBtPhoneEnable());
                LiveDataExKt.put(BtPhoneViewModel.this.getBtPhoneConfigData(), BtPhoneViewModel.this.getBtPhoneViewSetting());
                LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CompletableDeferred completableDeferred = BtPhoneViewModel.this.waitForInitBlock;
            this.a = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            BtPhoneViewModel btPhoneViewModel = BtPhoneViewModel.this;
            this.a = 2;
            if (btPhoneViewModel.n(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneEnable = BtPhoneViewModel.this.getBtPhoneViewSetting().getBtPhoneEnable();
            this.a = 3;
            if (BtPhoneDevice.showContact(btPhoneEnable, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(BtPhoneViewModel.this.getBtPhoneViewSetting().getBtPhoneEnable());
            LiveDataExKt.put(BtPhoneViewModel.this.getBtPhoneConfigData(), BtPhoneViewModel.this.getBtPhoneViewSetting());
            LiveDataExKt.put(BtPhoneViewModel.this.getLoadingData(), Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n"}, d2 = {"", "", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<Map<String[], ? extends Integer>> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Map<String[], ? extends Integer> getA() {
            return kotlin.collections.r.mapOf(TuplesKt.to(Build.VERSION.SDK_INT >= 26 ? new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS"} : new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE"}, Integer.valueOf(R.string.tips_call_permission)), TuplesKt.to(new String[]{"android.permission.READ_CONTACTS"}, Integer.valueOf(R.string.tips_contact_permission)), TuplesKt.to(new String[]{"android.permission.READ_CALL_LOG"}, Integer.valueOf(R.string.title_call_log_per_s)));
        }
    }

    public BtPhoneViewModel() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i2, Continuation<? super Boolean> continuation) {
        b bVar;
        BtPhoneViewModel btPhoneViewModel;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.e = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object btPhoneDelay = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = bVar.e;
        if (i4 == 0) {
            ResultKt.throwOnFailure(btPhoneDelay);
            BtPhoneDevice btPhoneDevice = BtPhoneDevice.INSTANCE;
            bVar.a = this;
            bVar.b = i2;
            bVar.e = 1;
            btPhoneDelay = btPhoneDevice.setBtPhoneDelay(i2, bVar);
            if (btPhoneDelay == coroutine_suspended) {
                return coroutine_suspended;
            }
            btPhoneViewModel = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = bVar.b;
            btPhoneViewModel = (BtPhoneViewModel) bVar.a;
            ResultKt.throwOnFailure(btPhoneDelay);
        }
        boolean zBooleanValue = ((Boolean) btPhoneDelay).booleanValue();
        int iMax = Math.max(i2, 3);
        if (zBooleanValue) {
            btPhoneViewModel.g().getMiliConfig().setInComingCallNotifyTime(iMax);
            btPhoneViewModel.g().saveInfo(2);
        }
        HMLog.info(o, new c(i2, zBooleanValue));
        if (zBooleanValue) {
            btPhoneViewModel.getBtPhoneViewSetting().setDelayAlertTime(iMax);
            LiveDataExKt.put(btPhoneViewModel.getBtPhoneConfigData(), btPhoneViewModel.getBtPhoneViewSetting());
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return (String) this.btPhoneName.getValue();
    }

    private final String c() {
        return (String) this.deviceAddress.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<ItemDto> e(boolean enable) {
        ItemDto itemDto = new ItemDto();
        itemDto.value = enable;
        Unit unit = Unit.INSTANCE;
        return CollectionsKt__CollectionsKt.arrayListOf(itemDto);
    }

    private final MiuiAPI f() {
        return (MiuiAPI) this.miuiApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMPersonInfo g() {
        return (HMPersonInfo) this.personInfo.getValue();
    }

    private final Map<String[], Integer> h() {
        return (Map) this.requiredPermissions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job j(PairStatus status) {
        return kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new i(status, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Continuation<? super Boolean> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.c = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objQuerySettings = jVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            SettingApi settingApi = this.btPhoneApi;
            if (settingApi != null) {
                jVar.c = 1;
                objQuerySettings = settingApi.querySettings(jVar);
                if (objQuerySettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQuerySettings);
        List list = (List) objQuerySettings;
        if (list != null) {
            if (list.isEmpty()) {
                return Boxing.boxBoolean(false);
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(((ItemDto) CollectionsKt.first(list)).value);
            if (boolBoxBoolean != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Continuation<? super Pair<Boolean, Boolean>> continuation) {
        k kVar;
        PairStatus pairStatus;
        boolean z;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objQueryPairStatus = kVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryPairStatus);
            String strB = b();
            if (strB == null) {
                HMLog.info(o, l.a);
                return new Pair(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
            }
            SettingApi settingApi = this.btPhoneApi;
            if (settingApi == null) {
                pairStatus = null;
            } else {
                kVar.c = 1;
                objQueryPairStatus = settingApi.queryPairStatus(strB, kVar);
                if (objQueryPairStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (pairStatus == null) {
                return new Pair(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
            }
            boolean z2 = pairStatus instanceof PairDisConnected;
            if (!(pairStatus instanceof Paired) || z2) {
                z = true;
            } else {
                z = false;
            }
            return new Pair(Boxing.boxBoolean(z), Boxing.boxBoolean((z || z2) ? false : true));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQueryPairStatus);
        pairStatus = (PairStatus) objQueryPairStatus;
        if (pairStatus == null) {
            return new Pair(Boxing.boxBoolean(false), Boxing.boxBoolean(false));
        }
        boolean z3 = pairStatus instanceof PairDisConnected;
        if (pairStatus instanceof Paired) {
            z = true;
        } else {
            z = true;
        }
        return new Pair(Boxing.boxBoolean(z), Boxing.boxBoolean((z || z3) ? false : true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0164  */
    /* JADX WARN: Code duplicated, block: B:52:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(Continuation<? super Unit> continuation) {
        p pVar;
        BtPhoneViewModel btPhoneViewModel;
        Ref.BooleanRef booleanRef;
        BtPhoneViewModel btPhoneViewModel2;
        Ref.BooleanRef booleanRef2;
        Pair pair;
        int iMax;
        SettingApi settingApi;
        Ref.BooleanRef booleanRef3;
        Pair pair2;
        BtPhoneViewModel btPhoneViewModel3;
        Boolean bool;
        Ref.BooleanRef booleanRef4;
        Pair pair3;
        int i2;
        Ref.BooleanRef booleanRef5;
        Pair pair4;
        BtPhoneViewModel btPhoneViewModel4;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i3 = pVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.h = i3 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object objM = pVar.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = pVar.h;
        if (i4 != 0) {
            if (i4 == 1) {
                btPhoneViewModel = (BtPhoneViewModel) pVar.a;
                ResultKt.throwOnFailure(objM);
            } else {
                if (i4 == 2) {
                    booleanRef2 = (Ref.BooleanRef) pVar.d;
                    booleanRef = (Ref.BooleanRef) pVar.c;
                    pair = (Pair) pVar.b;
                    btPhoneViewModel2 = (BtPhoneViewModel) pVar.a;
                    ResultKt.throwOnFailure(objM);
                    booleanRef2.element = ((Boolean) objM).booleanValue();
                    iMax = Math.max(btPhoneViewModel2.g().getMiliConfig().getInComingCallNotifyTime(), 3);
                    if (((Boolean) pair.getSecond()).booleanValue() && !booleanRef.element) {
                        settingApi = btPhoneViewModel2.btPhoneApi;
                        if (settingApi == null) {
                            bool = null;
                        } else {
                            ArrayList<ItemDto> arrayListE = btPhoneViewModel2.e(true);
                            pVar.a = btPhoneViewModel2;
                            pVar.b = pair;
                            pVar.c = booleanRef;
                            pVar.d = null;
                            pVar.e = iMax;
                            pVar.h = 3;
                            objM = settingApi.updateSetting(arrayListE, pVar);
                            if (objM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef3 = booleanRef;
                            pair2 = pair;
                            btPhoneViewModel3 = btPhoneViewModel2;
                            bool = (Boolean) objM;
                            btPhoneViewModel2 = btPhoneViewModel3;
                            pair = pair2;
                            booleanRef = booleanRef3;
                        }
                        HMLog.info(o, new q(bool));
                        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                            btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(true);
                            btPhoneViewModel2.g().getMiliConfig().enableInComingCallTime();
                            BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
                            btPhoneViewModel2.g().saveInfo(2);
                            pVar.a = btPhoneViewModel2;
                            pVar.b = pair;
                            pVar.c = booleanRef;
                            pVar.d = null;
                            pVar.e = iMax;
                            pVar.h = 4;
                            if (BtPhoneDevice.showContact(true, pVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef4 = booleanRef;
                            pair3 = pair;
                            if (btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable()) {
                                pVar.a = btPhoneViewModel2;
                                pVar.b = pair3;
                                pVar.c = booleanRef4;
                                pVar.e = iMax;
                                pVar.h = 5;
                                if (btPhoneViewModel2.a(iMax, pVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i2 = iMax;
                                booleanRef5 = booleanRef4;
                                pair4 = pair3;
                                btPhoneViewModel4 = btPhoneViewModel2;
                            } else {
                                booleanRef = booleanRef4;
                                pair = pair3;
                            }
                            booleanRef.element = true;
                        }
                    }
                    HMLog.info(o, new r(pair, booleanRef));
                    btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(booleanRef.element);
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertEnable(btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable());
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertTime(iMax);
                    HMLog.info(o, btPhoneViewModel2.new s());
                    return Unit.INSTANCE;
                }
                if (i4 == 3) {
                    iMax = pVar.e;
                    booleanRef3 = (Ref.BooleanRef) pVar.c;
                    pair2 = (Pair) pVar.b;
                    btPhoneViewModel3 = (BtPhoneViewModel) pVar.a;
                    ResultKt.throwOnFailure(objM);
                    bool = (Boolean) objM;
                    btPhoneViewModel2 = btPhoneViewModel3;
                    pair = pair2;
                    booleanRef = booleanRef3;
                    HMLog.info(o, new q(bool));
                    if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                        btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(true);
                        btPhoneViewModel2.g().getMiliConfig().enableInComingCallTime();
                        BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
                        btPhoneViewModel2.g().saveInfo(2);
                        pVar.a = btPhoneViewModel2;
                        pVar.b = pair;
                        pVar.c = booleanRef;
                        pVar.d = null;
                        pVar.e = iMax;
                        pVar.h = 4;
                        if (BtPhoneDevice.showContact(true, pVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef4 = booleanRef;
                        pair3 = pair;
                        if (btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable()) {
                            pVar.a = btPhoneViewModel2;
                            pVar.b = pair3;
                            pVar.c = booleanRef4;
                            pVar.e = iMax;
                            pVar.h = 5;
                            if (btPhoneViewModel2.a(iMax, pVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = iMax;
                            booleanRef5 = booleanRef4;
                            pair4 = pair3;
                            btPhoneViewModel4 = btPhoneViewModel2;
                        } else {
                            booleanRef = booleanRef4;
                            pair = pair3;
                        }
                        booleanRef.element = true;
                    }
                    HMLog.info(o, new r(pair, booleanRef));
                    btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(booleanRef.element);
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertEnable(btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable());
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertTime(iMax);
                    HMLog.info(o, btPhoneViewModel2.new s());
                    return Unit.INSTANCE;
                }
                if (i4 == 4) {
                    iMax = pVar.e;
                    booleanRef4 = (Ref.BooleanRef) pVar.c;
                    pair3 = (Pair) pVar.b;
                    BtPhoneViewModel btPhoneViewModel5 = (BtPhoneViewModel) pVar.a;
                    ResultKt.throwOnFailure(objM);
                    btPhoneViewModel2 = btPhoneViewModel5;
                    if (btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable()) {
                        pVar.a = btPhoneViewModel2;
                        pVar.b = pair3;
                        pVar.c = booleanRef4;
                        pVar.e = iMax;
                        pVar.h = 5;
                        if (btPhoneViewModel2.a(iMax, pVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = iMax;
                        booleanRef5 = booleanRef4;
                        pair4 = pair3;
                        btPhoneViewModel4 = btPhoneViewModel2;
                    } else {
                        booleanRef = booleanRef4;
                        pair = pair3;
                    }
                    booleanRef.element = true;
                    HMLog.info(o, new r(pair, booleanRef));
                    btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(booleanRef.element);
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertEnable(btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable());
                    btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertTime(iMax);
                    HMLog.info(o, btPhoneViewModel2.new s());
                    return Unit.INSTANCE;
                }
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = pVar.e;
                booleanRef5 = (Ref.BooleanRef) pVar.c;
                pair4 = (Pair) pVar.b;
                btPhoneViewModel4 = (BtPhoneViewModel) pVar.a;
                ResultKt.throwOnFailure(objM);
            }
            btPhoneViewModel2 = btPhoneViewModel4;
            booleanRef = booleanRef5;
            pair = pair4;
            iMax = i2;
            booleanRef.element = true;
            HMLog.info(o, new r(pair, booleanRef));
            btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(booleanRef.element);
            btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertEnable(btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable());
            btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertTime(iMax);
            HMLog.info(o, btPhoneViewModel2.new s());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM);
        pVar.a = this;
        pVar.h = 1;
        objM = m(pVar);
        if (objM == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneViewModel = this;
        Pair pair5 = (Pair) objM;
        booleanRef = new Ref.BooleanRef();
        pVar.a = btPhoneViewModel;
        pVar.b = pair5;
        pVar.c = booleanRef;
        pVar.d = booleanRef;
        pVar.h = 2;
        Object objK = btPhoneViewModel.k(pVar);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        btPhoneViewModel2 = btPhoneViewModel;
        booleanRef2 = booleanRef;
        pair = pair5;
        objM = objK;
        booleanRef2.element = ((Boolean) objM).booleanValue();
        iMax = Math.max(btPhoneViewModel2.g().getMiliConfig().getInComingCallNotifyTime(), 3);
        if (((Boolean) pair.getSecond()).booleanValue()) {
            settingApi = btPhoneViewModel2.btPhoneApi;
            if (settingApi == null) {
                bool = null;
            } else {
                ArrayList<ItemDto> arrayListE2 = btPhoneViewModel2.e(true);
                pVar.a = btPhoneViewModel2;
                pVar.b = pair;
                pVar.c = booleanRef;
                pVar.d = null;
                pVar.e = iMax;
                pVar.h = 3;
                objM = settingApi.updateSetting(arrayListE2, pVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef3 = booleanRef;
                pair2 = pair;
                btPhoneViewModel3 = btPhoneViewModel2;
                bool = (Boolean) objM;
                btPhoneViewModel2 = btPhoneViewModel3;
                pair = pair2;
                booleanRef = booleanRef3;
            }
            HMLog.info(o, new q(bool));
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(true);
                btPhoneViewModel2.g().getMiliConfig().enableInComingCallTime();
                BtPhoneDeviceLifeCycle.INSTANCE.cacheBtPhoneEnable(true);
                btPhoneViewModel2.g().saveInfo(2);
                pVar.a = btPhoneViewModel2;
                pVar.b = pair;
                pVar.c = booleanRef;
                pVar.d = null;
                pVar.e = iMax;
                pVar.h = 4;
                if (BtPhoneDevice.showContact(true, pVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef4 = booleanRef;
                pair3 = pair;
                if (btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable()) {
                    pVar.a = btPhoneViewModel2;
                    pVar.b = pair3;
                    pVar.c = booleanRef4;
                    pVar.e = iMax;
                    pVar.h = 5;
                    if (btPhoneViewModel2.a(iMax, pVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = iMax;
                    booleanRef5 = booleanRef4;
                    pair4 = pair3;
                    btPhoneViewModel4 = btPhoneViewModel2;
                    btPhoneViewModel2 = btPhoneViewModel4;
                    booleanRef = booleanRef5;
                    pair = pair4;
                    iMax = i2;
                } else {
                    booleanRef = booleanRef4;
                    pair = pair3;
                }
                booleanRef.element = true;
            }
        }
        HMLog.info(o, new r(pair, booleanRef));
        btPhoneViewModel2.getBtPhoneViewSetting().setBtPhoneEnable(booleanRef.element);
        btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertEnable(btPhoneViewModel2.g().getMiliConfig().isPhoneNotifyDelayEnable());
        btPhoneViewModel2.getBtPhoneViewSetting().setDelayAlertTime(iMax);
        HMLog.info(o, btPhoneViewModel2.new s());
        return Unit.INSTANCE;
    }

    private final void o() {
        if (!checkAuth()) {
            LiveDataExKt.put(this.loadingData, Boolean.FALSE);
            return;
        }
        Boolean value = this.loadingData.getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(value, bool)) {
            LiveDataExKt.put(this.loadingData, bool);
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new t(null), 2, null);
    }

    @NotNull
    public final Job changeAlertDelayTime(int time) {
        return kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(time, null), 2, null);
    }

    public final boolean checkAuth() {
        boolean z;
        String str;
        synchronized (this.showAuthInfo) {
            getShowAuthInfo().setShow(false);
            getShowAuthInfo().setPermission(null);
            getShowAuthInfo().setTitleRes(null);
            Context context = BraceletApp.getContext();
            for (Map.Entry<String[], Integer> entry : h().entrySet()) {
                String[] key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                int length = key.length;
                int i2 = 0;
                do {
                    if (i2 >= length) {
                        str = null;
                        break;
                    }
                    str = key[i2];
                    i2++;
                } while (!(!Utils.checkPermission(context, str)));
                if (str != null) {
                    getShowAuthInfo().setPermission(key);
                    getShowAuthInfo().setShow(true);
                    getShowAuthInfo().setTitleRes(Integer.valueOf(iIntValue));
                    break;
                }
            }
            getBtPhoneViewSetting().setContactPermissionGained(Utils.checkPermission(context, "android.permission.READ_CONTACTS"));
            LiveDataExKt.put(getShowAuthInfoData(), getShowAuthInfo());
            z = !getShowAuthInfo().getShow();
        }
        return z;
    }

    @NotNull
    public final Job enableAlertDelay(boolean enable) {
        return kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(enable, null), 2, null);
    }

    @NotNull
    public final Job enableBtPhone(boolean enable) {
        return kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(enable, null), 2, null);
    }

    @NotNull
    public final BLEStatueListenerAdapter getBleStatusListener() {
        return this.bleStatusListener;
    }

    @NotNull
    public final MutableLiveData<BtPhoneViewSetting> getBtPhoneConfigData() {
        return this.btPhoneConfigData;
    }

    @NotNull
    public final BtPhoneViewSetting getBtPhoneViewSetting() {
        return this.btPhoneViewSetting;
    }

    public final int getDelayAlertTime() {
        return this.btPhoneViewSetting.getDelayAlertTime();
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadingData() {
        return this.loadingData;
    }

    @NotNull
    public final ShowAuthInfo getShowAuthInfo() {
        return this.showAuthInfo;
    }

    @NotNull
    public final MutableLiveData<ShowAuthInfo> getShowAuthInfoData() {
        return this.showAuthInfoData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowPairDialogData() {
        return this.showPairDialogData;
    }

    public final void onPermission(@NotNull Permission permission) {
        HMLog.info(o, new n(permission));
        o();
    }

    public final void resetPairDialogData() {
        this.showPairDialogData.setValue(Boolean.FALSE);
    }
}
