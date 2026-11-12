package com.xiaomi.hm.health.device.headset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.ui.HeadsetStateCheckFragment;
import com.xiaomi.hm.health.device.headset.ui.MozartUpgradeCheckFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0006\u0010\n\u001a\u00020\u0005R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "onLeftClicked", "onReady", "", "x", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/devicex/manager/DeviceManagerApi;", "y", "Lkotlin/Lazy;", "l", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MozartUpgradePrepareActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String z = "device_address";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartUpgradePrepareActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Landroid/content/Intent;", "newIntent", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) MozartUpgradePrepareActivity.class);
            intent.putExtra(MozartUpgradePrepareActivity.z, address);
            return intent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MozartUpgradePrepareActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.MozartUpgradePrepareActivity$special$$inlined$inject$default$1
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

    private final DeviceManagerApi l() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @JvmStatic
    @NotNull
    public static final Intent newIntent(@NotNull Context context, @NotNull String str) {
        return INSTANCE.newIntent(context, str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        Integer device_source;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        HMDeviceSource hMDeviceSourceFromValue = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        if (savedInstanceState == null || (string = savedInstanceState.getString(z)) == null) {
            string = "";
        }
        this.address = string;
        Objects.requireNonNull(string);
        if (m.isBlank(string)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_mozart_upgrade_prepare);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.SINGLE_BACK);
        DeviceManagerApi deviceManagerApiL = l();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str = this.address;
        Objects.requireNonNull(str);
        Device bindDevice = deviceManagerApiL.getBindDevice(hMDeviceType, str);
        if (bindDevice != null && (device_source = bindDevice.getDevice_source()) != null) {
            hMDeviceSourceFromValue = HMDeviceSource.fromValue(device_source.intValue());
        }
        if (hMDeviceSourceFromValue == HMDeviceSource.OTHER_MOZART) {
            MozartUpgradeCheckFragment.Companion companion = MozartUpgradeCheckFragment.INSTANCE;
            String str2 = this.address;
            Objects.requireNonNull(str2);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, companion.newInstance(str2)).commit();
            return;
        }
        HeadsetStateCheckFragment.Companion companion2 = HeadsetStateCheckFragment.INSTANCE;
        String str3 = this.address;
        Objects.requireNonNull(str3);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, companion2.newInstance(str3)).commit();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }

    public final void onReady() {
        setResult(-1);
        finish();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        if (!m.isBlank(str)) {
            String str2 = this.address;
            Objects.requireNonNull(str2);
            outState.putString(z, str2);
        }
    }
}
