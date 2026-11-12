package com.xiaomi.hm.health.device.setting.pattern.action;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p010navigation.NavController;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.DeviceSpeechSupportFuncKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.XiaoAiEntranceHelper;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.market.sdk.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0014\u0007\u000bB#\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory;", "Lcom/xiaomi/hm/health/device/setting/pattern/action/DefaultActionFactory;", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", Constants.JSON_FEATURE, "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "createAction", "Landroid/content/Context;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "c", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/Fragment;", GoogleApiAvailabilityLight.a, "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OtherActionFactory extends DefaultActionFactory {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Fragment fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SoftFeature.values().length];
            iArr[SoftFeature.ALEXA.ordinal()] = 1;
            iArr[SoftFeature.JS_APP_SETTING.ordinal()] = 2;
            iArr[SoftFeature.XIAOAI.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory$a", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements AppItemAction {
        public a() {
        }

        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            ((DeviceXNavigator) OtherActionFactory.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), null, null)).startAlexaAuthActivity(OtherActionFactory.this.context, OtherActionFactory.this.fragmentManager);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory$b", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class b implements AppItemAction {
        public b() {
        }

        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            ((DeviceXNavigator) OtherActionFactory.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), null, null)).startJsAppPage(OtherActionFactory.this.context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"com/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory$c", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Landroidx/navigation/NavController;", "nv", "", "action", "Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper;", "xiaoAiHelper", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Lcom/xiaomi/hm/health/device/setting/pattern/action/OtherActionFactory;Landroidx/fragment/app/Fragment;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class c implements AppItemAction {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy xiaoAiHelper;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/XiaoAiEntranceHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<XiaoAiEntranceHelper> {
            public final /* synthetic */ Fragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Fragment fragment) {
                super(0);
                this.a = fragment;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaoAiEntranceHelper getA() {
                return new XiaoAiEntranceHelper(this.a, (XiaoAiEntranceHelper.LoadingDialogDelegate) null, 2, (DefaultConstructorMarker) null);
            }
        }

        public c(Fragment fragment) {
            this.xiaoAiHelper = LazyKt__LazyJVMKt.lazy(new a(fragment));
        }

        private final XiaoAiEntranceHelper b() {
            return (XiaoAiEntranceHelper) this.xiaoAiHelper.getValue();
        }

        @Nullable
        public final HMBaseDevice a() {
            return ((DeviceManagerApi) OtherActionFactory.this.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null)).getDevice(HMDeviceType.MILI);
        }

        @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
        public void action(@NotNull NavController nv) {
            HMBaseDevice hMBaseDeviceA = a();
            if (hMBaseDeviceA == null) {
                return;
            }
            if (DeviceSpeechSupportFuncKt.supportMIAI(hMBaseDeviceA) && (hMBaseDeviceA instanceof HMBaseBleDevice)) {
                b().initMiotPermissionPromptShow((HMBaseBleDevice) hMBaseDeviceA);
            }
            b().navigateAuthPageOrFaq();
        }
    }

    public /* synthetic */ OtherActionFactory(Context context, FragmentManager fragmentManager, Fragment fragment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, (i & 4) != 0 ? null : fragment);
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.action.DefaultActionFactory, com.xiaomi.hm.health.device.setting.pattern.action.ActionFactory
    @NotNull
    public AppItemAction createAction(@NotNull SoftFeature feature) throws Exception {
        int i = WhenMappings.$EnumSwitchMapping$0[feature.ordinal()];
        if (i == 1) {
            return new a();
        }
        if (i == 2) {
            return new b();
        }
        if (i != 3) {
            return super.createAction(feature);
        }
        Fragment fragment = this.fragment;
        if (fragment != null) {
            return new c(fragment);
        }
        throw new Exception("Error fragment is null.");
    }

    public OtherActionFactory(@NotNull Context context, @NotNull FragmentManager fragmentManager, @Nullable Fragment fragment) {
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.fragment = fragment;
    }
}
