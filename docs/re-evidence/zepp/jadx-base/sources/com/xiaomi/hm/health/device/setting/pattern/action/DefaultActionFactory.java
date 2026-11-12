package com.xiaomi.hm.health.device.setting.pattern.action;

import android.widget.Toast;
import androidx.p010navigation.NavController;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.market.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u0004\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory;", "Lcom/xiaomi/hm/health/device/setting/pattern/action/ActionFactory;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "b", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "createAction", "Lcom/huami/devicex/injection/BuildConfigApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/BuildConfigApi;", "buildConfigApi", "<init>", "()V", "c", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class DefaultActionFactory implements ActionFactory, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy buildConfigApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SoftFeature.values().length];
            iArr[SoftFeature.MUSIC.ordinal()] = 1;
            iArr[SoftFeature.WEATHER.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory$a", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements AppItemAction {
        public a() {
        }

        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            HMBaseDevice hMBaseDeviceB = DefaultActionFactory.this.b();
            if (hMBaseDeviceB == null) {
                return;
            }
            if (SyncCenterManager.INSTANCE.isSyncing(hMBaseDeviceB)) {
                Toast.makeText(DeviceXBuilder.INSTANCE.getContext(), R.string.wf_sync_other_data, 0).show();
            } else {
                nv.navigate(R.id.action_to_musicTransferActivity);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory$b", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b implements AppItemAction {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Action to nothing";
            }
        }

        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            HMLog.warn$default(null, null, a.a, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory$c", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class c implements AppItemAction {
        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            nv.navigate(R.id.action_to_weatherSettingActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultActionFactory() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.buildConfigApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BuildConfigApi>() { // from class: com.xiaomi.hm.health.device.setting.pattern.action.DefaultActionFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.BuildConfigApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BuildConfigApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BuildConfigApi.class), qualifier, objArr);
            }
        });
    }

    private final BuildConfigApi a() {
        return (BuildConfigApi) this.buildConfigApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice b() {
        return HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.action.ActionFactory
    @NotNull
    public AppItemAction createAction(@NotNull SoftFeature feature) {
        int i = WhenMappings.$EnumSwitchMapping$0[feature.ordinal()];
        if (i == 1) {
            return new a();
        }
        if (i == 2) {
            return ((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip() ? new b() : new c();
        }
        a().isDebug();
        return new b();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
