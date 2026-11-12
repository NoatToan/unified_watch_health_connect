package com.xiaomi.hm.health.device.assistant.viewmodel;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantModule;
import com.huami.bluetooth.profile.channel.module.assistant.AssistantVersion;
import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardFactory;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVoConvert;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import com.xiaomi.hm.health.device.assistant.viewmodel.adapter.SmartCardAdapter;
import com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeaturesViewModel;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bJ\u0014\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0012\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u001aR%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b&\u0010 R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b(\u0010 R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b#\u0010,R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeaturesViewModel;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/adapter/SmartCardAdapter;", "g", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "loadDisplayMatters", "", "isEnable", "updateDisplayMatters", "loadAppCards", "", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/ItemVo;", "data", "updateCards", "resortDataAction", "Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "b", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "deviceFeatureDepends", "Landroid/content/Context;", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getAppCardsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "appCardsLiveData", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/UpdateStatus;", "e", "getStatueLiveData", "statueLiveData", "getLimitLiveData", "limitLiveData", "getDisplayMattersSettingLiveData", "displayMattersSettingLiveData", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "h", "()Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "resourceMapper", "i", "Ljava/util/List;", "resortValues", "<init>", "()V", z.j, "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartCardsSettingViewModel extends DeviceFeaturesViewModel implements KoinComponentAdapter {

    @NotNull
    private static final a j = new a(null);

    @Deprecated
    @NotNull
    private static final String k = "SmartCardsSettingViewModel";

    @Deprecated
    private static final int l = 20;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFeatureDepends;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<ItemVo>> appCardsLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UpdateStatus> statueLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> limitLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> displayMattersSettingLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourceMapper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private List<? extends ItemVo> resortValues;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel$a", "", "", "LIMIT_WITHOUT_ALEXA", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
            return "error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel", f = "SmartCardsSettingViewModel.kt", i = {0}, l = {106}, m = "loadDisplayLimit", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SmartCardsSettingViewModel.this.f(this);
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
            return "error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<DisplayItemVoConvert> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayItemVoConvert invoke() {
            return new DisplayItemVoConvert();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCardsSettingViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceFeatureDepends = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IDeviceFeatureDepends>() { // from class: com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDeviceFeatureDepends invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDeviceFeatureDepends.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.context = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<Context>() { // from class: com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), objArr2, objArr3);
            }
        });
        this.appCardsLiveData = new MutableLiveData<>();
        this.statueLiveData = new MutableLiveData<>();
        this.limitLiveData = new MutableLiveData<>();
        this.displayMattersSettingLiveData = new MutableLiveData<>();
        this.resourceMapper = LazyKt__LazyJVMKt.lazy(e.a);
        this.resortValues = new ArrayList();
    }

    private final Context b() {
        return (Context) this.context.getValue();
    }

    private final IDeviceFeatureDepends c() {
        return (IDeviceFeatureDepends) this.deviceFeatureDepends.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayItemVoConvert e() {
        return (DisplayItemVoConvert) this.resourceMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(Continuation<? super Integer> continuation) throws Exception {
        c cVar;
        SmartCardsSettingViewModel smartCardsSettingViewModel;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objQueryVersion = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryVersion);
            SmartCardAdapter smartCardAdapterG = g();
            cVar.a = this;
            cVar.d = 1;
            objQueryVersion = smartCardAdapterG.queryVersion(cVar);
            if (objQueryVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
            smartCardsSettingViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            smartCardsSettingViewModel = (SmartCardsSettingViewModel) cVar.a;
            ResultKt.throwOnFailure(objQueryVersion);
        }
        AssistantVersion assistantVersion = (AssistantVersion) objQueryVersion;
        return Boxing.boxInt((assistantVersion.getMaxLimitCards() > 0 ? assistantVersion.getMaxLimitCards() : 20) - ByteUtilsKt.toInt(smartCardsSettingViewModel.c().supportAlexa(smartCardsSettingViewModel.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartCardAdapter g() throws Exception {
        SmartCardAdapter smartCardAdapter = null;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SmartCardsSettingViewModel$loadSmartCardAdapter$$inlined$safeLaunch$1(null, this), 2, null);
        HMBaseDevice hMBaseDeviceFindDevice = findDevice();
        if (hMBaseDeviceFindDevice != null) {
            AssistantModule assistantModule = (AssistantModule) hMBaseDeviceFindDevice.getChannelModule(AssistantModule.class);
            if (assistantModule == null) {
                throw new Exception("AssistantModule is null");
            }
            smartCardAdapter = new SmartCardAdapter(QuickCardFactory.INSTANCE.build(assistantModule, null).create(), hMBaseDeviceFindDevice);
        }
        if (smartCardAdapter != null) {
            return smartCardAdapter;
        }
        throw new Exception("初始化失败");
    }

    @NotNull
    public final MutableLiveData<List<ItemVo>> getAppCardsLiveData() {
        return this.appCardsLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDisplayMattersSettingLiveData() {
        return this.displayMattersSettingLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getLimitLiveData() {
        return this.limitLiveData;
    }

    @NotNull
    public final MutableLiveData<UpdateStatus> getStatueLiveData() {
        return this.statueLiveData;
    }

    public final void loadAppCards() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmartCardsSettingViewModel$loadAppCards$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadDisplayMatters() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmartCardsSettingViewModel$loadDisplayMatters$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void resortDataAction(@NotNull List<? extends ItemVo> data) {
        if (data.isEmpty()) {
            return;
        }
        this.resortValues = data;
    }

    public final void updateCards(@NotNull List<? extends ItemVo> data) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmartCardsSettingViewModel$updateCards$$inlined$safeLaunch$1(null, this, data), 2, null);
    }

    public final void updateDisplayMatters(boolean isEnable) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SmartCardsSettingViewModel$updateDisplayMatters$$inlined$safeLaunch$1(null, this, isEnable), 2, null);
    }
}
