package com.huami.core.device.wifi_settings.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.bean.WiFiConnectStatus;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.bean.WifiMultiBean;
import com.huami.core.device.wifi_settings.service.IWiFiControllerProxy;
import com.huami.core.device.wifi_settings.service.WiFiSettingInit;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u000289B\u000f\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ&\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0005H\u0014R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR)\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001e0\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R#\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u001d8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010!R)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00120'8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010*R#\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u001d8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010!R#\u00103\u001a\b\u0012\u0004\u0012\u0002000\u001d8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010!¨\u0006:"}, d2 = {"Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel;", "Landroidx/lifecycle/ViewModel;", "", "ssId", "wifiPwd", "", "connectWifi", "cancelConnectWifi", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy$ClickType;", "type", "clickHelp", "registerWifiStatusCallBack", "getConfigWifiList", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "removeWifi", "", "nearbyList", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "nearByTitle", "configTitle", "mixNearByWithConfigWifi", "onCleared", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "a", "Lcom/huami/core/device/wifi_settings/service/IWiFiControllerProxy;", "mWifiProxy", "Landroidx/lifecycle/MutableLiveData;", "", "b", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "mConfigWifiListLiveData", "", "c", "getMRemoveResultLiveData", "mRemoveResultLiveData", "Landroidx/lifecycle/MediatorLiveData;", GoogleApiAvailabilityLight.a, "getMWifiListLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "mWifiListLiveData", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "e", "getMWifiConnectStatus", "mWifiConnectStatus", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel$UpdateState;", "f", "getMStatusLiveData", "mStatusLiveData", "", "source", "<init>", "(I)V", "Companion", "UpdateState", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "WifiViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final IWiFiControllerProxy mWifiProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConfigWifiListLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRemoveResultLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWifiListLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWifiConnectStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStatusLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel$UpdateState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "FAIL", com.alipay.sdk.m.f0.c.p, "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public enum UpdateState {
        START,
        FAIL,
        SUCCESS
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$cancelConnectWifi$1", f = "WifiViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0339a extends Lambda implements Function0<String> {
            public static final C0339a a = new C0339a();

            public C0339a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "cancel connect wifi...";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWiFiControllerProxy iWiFiControllerProxy = WifiViewModel.this.mWifiProxy;
                if (iWiFiControllerProxy != null) {
                    this.a = 1;
                    if (iWiFiControllerProxy.cancel(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(WifiViewModel.TAG, C0339a.a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$connectWifi$1", f = "WifiViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiViewModel.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WifiViewModel.this.getMStatusLiveData().postValue(UpdateState.START);
                IWiFiControllerProxy iWiFiControllerProxy = WifiViewModel.this.mWifiProxy;
                if (iWiFiControllerProxy != null) {
                    String str = this.c;
                    String str2 = this.d;
                    this.a = 1;
                    obj = iWiFiControllerProxy.setPassword(str, str2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (zBooleanValue) {
                    WifiViewModel.this.getMStatusLiveData().postValue(UpdateState.SUCCESS);
                } else {
                    WifiViewModel.this.getMStatusLiveData().postValue(UpdateState.FAIL);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                WifiViewModel.this.getMStatusLiveData().postValue(UpdateState.SUCCESS);
            } else {
                WifiViewModel.this.getMStatusLiveData().postValue(UpdateState.FAIL);
            }
            return Unit.INSTANCE;
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
            return "mWifiProxy is Empty!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$getConfigWifiList$2", f = "WifiViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<WifiMultiBean> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<WifiMultiBean> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("getConfigWifiList:", this.a);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IWiFiControllerProxy iWiFiControllerProxy = WifiViewModel.this.mWifiProxy;
                this.a = 1;
                obj = iWiFiControllerProxy.getConfigWifiList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<WifiBean> list = (List) obj;
            if (list == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (WifiBean wifiBean : list) {
                    wifiBean.setWifiType(1);
                    arrayList2.add(new WifiMultiBean(2, wifiBean));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            HMLog.info(WifiViewModel.TAG, new a(arrayList));
            WifiViewModel.this.a().postValue(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MutableLiveData<List<? extends WifiMultiBean>>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<WifiMultiBean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel$UpdateState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<MutableLiveData<UpdateState>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<UpdateState> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/core/device/wifi_settings/bean/WiFiConnectStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MutableLiveData<WiFiConnectStatus>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<WiFiConnectStatus> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MediatorLiveData<List<WifiMultiBean>>> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<List<WifiMultiBean>> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$mixNearByWithConfigWifi$1", f = "WifiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<WifiBean> c;
        public final /* synthetic */ WifiMultiBean d;
        public final /* synthetic */ WifiMultiBean e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<WifiMultiBean> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<WifiMultiBean> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("config change :", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$mixNearByWithConfigWifi$1$1$2", f = "WifiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ List<WifiBean> b;
            public final /* synthetic */ WifiMultiBean c;
            public final /* synthetic */ List<WifiMultiBean> d;
            public final /* synthetic */ WifiMultiBean e;
            public final /* synthetic */ WifiViewModel f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List<WifiBean> list, WifiMultiBean wifiMultiBean, List<WifiMultiBean> list2, WifiMultiBean wifiMultiBean2, WifiViewModel wifiViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = list;
                this.c = wifiMultiBean;
                this.d = list2;
                this.e = wifiMultiBean2;
                this.f = wifiViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                List<WifiBean> list = this.b;
                List arrayList2 = null;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (WifiBean wifiBean : list) {
                        wifiBean.setWifiType(0);
                        arrayList3.add(new WifiMultiBean(0, wifiBean, 1, (DefaultConstructorMarker) null));
                    }
                    arrayList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                if (!arrayList2.isEmpty()) {
                    arrayList2.add(0, this.c);
                }
                List<WifiMultiBean> list2 = this.d;
                if (list2 != null) {
                    for (WifiMultiBean wifiMultiBean : list2) {
                        int iIndexOf = arrayList2.indexOf(wifiMultiBean);
                        wifiMultiBean.setNearBy(iIndexOf >= 0);
                        if (iIndexOf >= 0) {
                            wifiMultiBean.setWifiBean(((WifiMultiBean) arrayList2.get(iIndexOf)).getWifiBean());
                        }
                    }
                }
                List<WifiMultiBean> list3 = this.d;
                if (list3 != null && (!list3.isEmpty())) {
                    arrayList.add(0, this.e);
                    arrayList.addAll(this.d);
                }
                arrayList.addAll(arrayList2);
                this.f.getMWifiListLiveData().postValue(arrayList);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<WifiBean> list, WifiMultiBean wifiMultiBean, WifiMultiBean wifiMultiBean2, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = wifiMultiBean;
            this.e = wifiMultiBean2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WifiViewModel wifiViewModel, List list, WifiMultiBean wifiMultiBean, WifiMultiBean wifiMultiBean2, List list2) {
            HMLog.info(WifiViewModel.TAG, new a(list2));
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(wifiViewModel), Dispatchers.getIO(), null, new b(list, wifiMultiBean, list2, wifiMultiBean2, wifiViewModel, null), 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WifiViewModel.this.new j(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WifiViewModel.this.getMWifiListLiveData().removeSource(WifiViewModel.this.a());
            MediatorLiveData<List<WifiMultiBean>> mWifiListLiveData = WifiViewModel.this.getMWifiListLiveData();
            MutableLiveData mutableLiveDataA = WifiViewModel.this.a();
            final WifiViewModel wifiViewModel = WifiViewModel.this;
            final List<WifiBean> list = this.c;
            final WifiMultiBean wifiMultiBean = this.d;
            final WifiMultiBean wifiMultiBean2 = this.e;
            mWifiListLiveData.addSource(mutableLiveDataA, new Observer() { // from class: com.huami.core.device.wifi_settings.viewmodel.a
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj2) {
                    WifiViewModel.j.b(wifiViewModel, list, wifiMultiBean, wifiMultiBean2, (List) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$removeWifi$1$1", f = "WifiViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WifiBean b;
        public final /* synthetic */ WifiViewModel c;
        public final /* synthetic */ IWiFiControllerProxy d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ WifiBean a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WifiBean wifiBean, boolean z) {
                super(0);
                this.a = wifiBean;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return ((Object) this.a.getWifiSSID()) + ":removeWifi:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(WifiBean wifiBean, WifiViewModel wifiViewModel, IWiFiControllerProxy iWiFiControllerProxy, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = wifiBean;
            this.c = wifiViewModel;
            this.d = iWiFiControllerProxy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String wifiSSID = this.b.getWifiSSID();
                if (wifiSSID == null) {
                    zBooleanValue = false;
                } else {
                    IWiFiControllerProxy iWiFiControllerProxy = this.d;
                    this.a = 1;
                    obj = iWiFiControllerProxy.deleteWiFi(wifiSSID, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMLog.info(WifiViewModel.TAG, new a(this.b, zBooleanValue));
                this.c.getMRemoveResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            HMLog.info(WifiViewModel.TAG, new a(this.b, zBooleanValue));
            this.c.getMRemoveResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    public WifiViewModel(int i2) {
        IWiFiControllerProxy controllerProxy = WiFiSettingInit.INSTANCE.getControllerProxy(i2);
        this.mWifiProxy = controllerProxy;
        this.mConfigWifiListLiveData = LazyKt__LazyJVMKt.lazy(e.a);
        this.mRemoveResultLiveData = LazyKt__LazyJVMKt.lazy(f.a);
        this.mWifiListLiveData = LazyKt__LazyJVMKt.lazy(i.a);
        this.mWifiConnectStatus = LazyKt__LazyJVMKt.lazy(h.a);
        this.mStatusLiveData = LazyKt__LazyJVMKt.lazy(g.a);
        if (controllerProxy == null) {
            return;
        }
        controllerProxy.eventBusConnect(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<WifiMultiBean>> a() {
        return (MutableLiveData) this.mConfigWifiListLiveData.getValue();
    }

    public static /* synthetic */ void connectWifi$default(WifiViewModel wifiViewModel, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        wifiViewModel.connectWifi(str, str2);
    }

    public final void cancelConnectWifi() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void clickHelp(@NotNull Context context, @NotNull IWiFiControllerProxy.ClickType type) {
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.onClickHelp(context, type);
    }

    public final void connectWifi(@NotNull String ssId, @Nullable String wifiPwd) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(ssId, wifiPwd, null), 2, null);
    }

    public final void getConfigWifiList() {
        if (this.mWifiProxy != null) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(null), 2, null);
        } else {
            HMLog.info(TAG, c.a);
            a().postValue(null);
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getMRemoveResultLiveData() {
        return (MutableLiveData) this.mRemoveResultLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<UpdateState> getMStatusLiveData() {
        return (MutableLiveData) this.mStatusLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<WiFiConnectStatus> getMWifiConnectStatus() {
        return (MutableLiveData) this.mWifiConnectStatus.getValue();
    }

    @NotNull
    public final MediatorLiveData<List<WifiMultiBean>> getMWifiListLiveData() {
        return (MediatorLiveData) this.mWifiListLiveData.getValue();
    }

    public final void mixNearByWithConfigWifi(@Nullable List<WifiBean> nearbyList, @NotNull WifiMultiBean nearByTitle, @NotNull WifiMultiBean configTitle) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new j(nearbyList, nearByTitle, configTitle, null), 2, null);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.eventBusConnect(false);
    }

    public final void registerWifiStatusCallBack() {
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        iWiFiControllerProxy.setWiFiControllerCallback(new IWiFiControllerProxy.IWiFiControllerCallback() { // from class: com.huami.core.device.wifi_settings.viewmodel.WifiViewModel.registerWifiStatusCallBack.1

            /* JADX INFO: renamed from: com.huami.core.device.wifi_settings.viewmodel.WifiViewModel$registerWifiStatusCallBack$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ WiFiConnectStatus a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(WiFiConnectStatus wiFiConnectStatus) {
                    super(0);
                    this.a = wiFiConnectStatus;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("onWiFiStateChanged:", this.a);
                }
            }

            @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
            public void onAddWifiRequest(@Nullable String str) {
                IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onAddWifiRequest(this, str);
            }

            @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
            public void onCancel() {
                IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onCancel(this);
            }

            @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
            public void onPwdRequest(@NotNull String str) {
                IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onPwdRequest(this, str);
            }

            @Override // com.huami.core.device.wifi_settings.service.IWiFiControllerProxy.IWiFiControllerCallback
            public void onWiFiStateChanged(@NotNull WiFiConnectStatus wifiStatus) {
                IWiFiControllerProxy.IWiFiControllerCallback.DefaultImpls.onWiFiStateChanged(this, wifiStatus);
                HMLog.info(WifiViewModel.TAG, new a(wifiStatus));
                WifiViewModel.this.getMWifiConnectStatus().postValue(wifiStatus);
            }
        });
    }

    public final void removeWifi(@NotNull WifiBean wifiBean) {
        IWiFiControllerProxy iWiFiControllerProxy = this.mWifiProxy;
        if (iWiFiControllerProxy == null) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new k(wifiBean, this, iWiFiControllerProxy, null), 2, null);
    }
}
