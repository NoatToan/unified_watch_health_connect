package com.xiaomi.hm.health.device.wifi.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.view.PasswordEditText;
import com.loc.z;
import com.xiaomi.hm.health.device.wifi.WifiSetting;
import com.xiaomi.hm.health.device.wifi.WifiSettingHook;
import com.xiaomi.hm.health.device.wifi.ui.HookWifiActivity;
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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u001f\u0010\u000e\u001a\u0004\u0018\u00010\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/wifi/ui/HookWifiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "g", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "a", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "wifiSetting", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "b", "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtil", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HookWifiActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy wifiSetting = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtil;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/wifi/WifiSettingHook;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WifiSettingHook> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiSettingHook invoke() {
            return WifiSetting.INSTANCE.findHookApi();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HookWifiActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtil = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.wifi.ui.HookWifiActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtil.getValue();
    }

    private final WifiSettingHook f() {
        return (WifiSettingHook) this.wifiSetting.getValue();
    }

    private final void g() {
        ((TextView) findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: d94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HookWifiActivity.h(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_connect)).setOnClickListener(new View.OnClickListener() { // from class: e94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HookWifiActivity.i(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HookWifiActivity hookWifiActivity, View view) {
        hookWifiActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HookWifiActivity hookWifiActivity, View view) {
        hookWifiActivity.e().closeSoftInput(hookWifiActivity);
        hookWifiActivity.j();
    }

    private final void j() {
        String strFindSsid;
        WifiSettingHook wifiSettingHookF = f();
        String str = "";
        if (wifiSettingHookF != null && (strFindSsid = wifiSettingHookF.findSsid()) != null) {
            str = strFindSsid;
        }
        Editable text = ((PasswordEditText) findViewById(R.id.wifi_pwd_edit_box)).getText();
        WifiSettingHook wifiSettingHookF2 = f();
        if (!(wifiSettingHookF2 == null ? false : wifiSettingHookF2.setPwdString(str, text.toString()))) {
            HMLog.e("SettingWifi", "can not setting with protocol!", new Object[0]);
        }
        finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strFindSsid;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook_wifi);
        ((TextView) findViewById(R.id.tv_connect)).setEnabled(false);
        WifiSettingHook wifiSettingHookF = f();
        if (wifiSettingHookF != null && (strFindSsid = wifiSettingHookF.findSsid()) != null) {
            ((TextView) findViewById(R.id.tv_title)).setText(strFindSsid);
        }
        ((PasswordEditText) findViewById(R.id.wifi_pwd_edit_box)).addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.hm.health.device.wifi.ui.HookWifiActivity$onCreate$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                ((TextView) this.a.findViewById(R.id.tv_connect)).setEnabled(!(text == null || text.length() == 0));
            }
        });
        g();
        WifiSettingHook wifiSettingHookFindHookApi = WifiSetting.INSTANCE.findHookApi();
        if (wifiSettingHookFindHookApi == null) {
            return;
        }
        wifiSettingHookFindHookApi.regCurrentUI(this);
    }
}
