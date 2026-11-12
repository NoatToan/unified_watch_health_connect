package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.NightModeActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import io.netty.util.internal.StringUtil;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class NightModeActivity extends BaseTitleActivity {
    private static final String H = "NightModeActivity";
    private HMNightModeConfig A;
    private int B;
    private int C;
    private int D;
    private final Lazy<DeviceUtilsApi> E = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceManagerApi> F = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> G = KoinJavaComponent.inject(DeviceXNavigator.class);
    private ListTile x;
    private ListTile y;
    private ListTile z;

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            NightModeActivity.this.E(z);
        }
    }

    public class b extends HMCallback {
        public b(boolean z) {
            super(z);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.d(NightModeActivity.H, "setAutoBacklight: " + z, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(DialogInterface dialogInterface, int i) {
        if (i != this.D) {
            if (1 != i || u()) {
                this.D = i;
                I();
                H();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, int i, int i2) {
        if (z) {
            atomicInteger.set((i * 60) + i2);
        } else {
            atomicInteger2.set((i * 60) + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    public /* synthetic */ void C(boolean z, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, DialogInterface dialogInterface, int i) {
        boolean z2 = true;
        if (z) {
            int i2 = atomicInteger.get();
            if (i2 == -1) {
                return;
            }
            if (i2 != this.B) {
                this.B = i2;
            } else {
                z2 = false;
            }
        } else {
            int i3 = atomicInteger2.get();
            if (i3 == -1) {
                return;
            }
            if (i3 != this.C) {
                this.C = i3;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            J();
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit D(Boolean bool) {
        if (bool.booleanValue()) {
            return null;
        }
        DeviceXFunctionsKt.getWeatherApi().requestLocation();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z) {
        this.x.setEnabled(z);
        boolean z2 = this.A.getNightMode() == 2;
        this.y.setEnabled(z && z2);
        this.z.setEnabled(z && z2);
    }

    private void F() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.night_mode_set).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(this.D).setItems(R.array.night_mode_array), new DialogInterface.OnClickListener() { // from class: ye5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.A(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void G(final boolean z) {
        int i;
        int i2;
        String string;
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        if (z) {
            int i3 = this.B;
            i = i3 / 60;
            i2 = i3 % 60;
            string = getString(R.string.avoid_disturb_on_time);
        } else {
            int i4 = this.C;
            i = i4 / 60;
            i2 = i4 % 60;
            string = getString(R.string.avoid_disturb_off_time);
        }
        hMTimeChooseView.setInitialTime(i, i2);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: df5
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i5, int i6) {
                NightModeActivity.B(z, atomicInteger, atomicInteger2, i5, i6);
            }
        });
        new AlertDialogFragment.Builder(this).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: ze5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                this.a.C(z, atomicInteger, atomicInteger2, dialogInterface, i5);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(true).show(getSupportFragmentManager());
    }

    private void H() {
        this.A.setStartMinute(this.B);
        this.A.setEndMinute(this.C);
        this.A.setNightMode(this.D);
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_NIGHT_MODE, this.A.toJsonString());
        DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        HMDeviceSource boundDeviceSource = this.F.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.F.getValue().getDevice(boundDeviceSource.getType());
        if (boundDeviceSource == HMDeviceSource.VDEVICE || hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            return;
        }
        hMMiLiProDevice.setAutoBacklight(this.A.generateAutoBacklightInfo(), new b(true));
        if (this.A.getNightMode() == 1) {
            hMMiLiProDevice.supportHuamiOSWeather(new Function1() { // from class: ef5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NightModeActivity.D((Boolean) obj);
                }
            });
        }
    }

    private void I() {
        int i = this.D;
        if (i == 0) {
            this.x.setTips(R.string.close);
        } else if (i == 1) {
            this.x.setTips(R.string.night_mode_open_after_sunset);
        } else if (i == 2) {
            this.x.setTips(R.string.night_mode_open_time);
            this.z.setEnabled(false);
        }
        this.y.setEnabled(this.D == 2);
        this.z.setEnabled(this.D == 2);
    }

    private void J() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (this.B >= this.C) {
            sb2.append(getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), this.B));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), this.C));
        this.y.setTips(sb.toString());
        this.z.setTips(sb2.toString());
    }

    private void initViews() {
        ListTile listTile = (ListTile) findViewById(R.id.night_mode_iv);
        this.x = listTile;
        listTile.setSubtitle(HMDeviceConfig.hasBoundWatch() ? R.string.night_mode_tips_watch : R.string.night_mode_tips);
        this.x.setOnClickListener(new View.OnClickListener() { // from class: bf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
        ListTile listTile2 = (ListTile) findViewById(R.id.start_time_item);
        this.y = listTile2;
        listTile2.setOnClickListener(new View.OnClickListener() { // from class: af5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.x(view);
            }
        });
        ListTile listTile3 = (ListTile) findViewById(R.id.end_time_item);
        this.z = listTile3;
        listTile3.setOnClickListener(new View.OnClickListener() { // from class: cf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y(view);
            }
        });
        I();
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new a());
    }

    private boolean u() {
        if (this.E.getValue().checkPermission("android.permission.ACCESS_FINE_LOCATION") || this.E.getValue().checkPermission("android.permission.ACCESS_COARSE_LOCATION")) {
            return true;
        }
        showBeforeMsgLocationPermissionDialog();
        return false;
    }

    private void v() {
        HMNightModeConfig hMNightModeConfigFromJsonString = HMNightModeConfig.fromJsonString();
        this.A = hMNightModeConfigFromJsonString;
        this.B = hMNightModeConfigFromJsonString.getStartMinute();
        this.C = this.A.getEndMinute();
        this.D = this.A.getNightMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        G(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        G(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(DialogInterface dialogInterface, int i) {
        this.G.getValue().startAppSettings(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_night_mode);
        BaseTitleBarExtKt.setTitleBar(this, getString(R.string.night_mode), null, R.color.s38, BaseTitleActivity.STYLE.BACK_AND_TITLE);
        v();
        initViews();
        if (this.A.getNightMode() == 1) {
            u();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        J();
    }

    public void showBeforeMsgLocationPermissionDialog() {
        new AlertDialogFragment.Builder(this).setTitle("").setMessage(R.string.locate_content).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: xe5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }
}
