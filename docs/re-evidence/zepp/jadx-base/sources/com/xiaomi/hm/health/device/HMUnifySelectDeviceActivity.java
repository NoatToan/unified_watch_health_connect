package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.chenenyu.router.annotation.Route;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import com.xiaomi.hm.health.device.amazfit_watch.DeviceCloudConfigUtils;
import com.xiaomi.hm.health.device.amazfit_watch.HMSelectWatchActivityNew;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.permission.BindDevicePermissionManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.virtual.HmVirtualDeviceManager;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@Route({RouterHelper.DEVICE_SELECT_PATH})
public class HMUnifySelectDeviceActivity extends BaseTitleActivity {
    private static final String J = "sensitive_data_agree_band";
    private static final String K = "sensitive_data_agree_watch";
    private static final String L = "sensitive_data_agree_scale";
    private static final String M = "sensitive_data_agree_shoe";
    private static final String N = "sensitive_data_agree_earphone";
    private static final String O = "sensitive_data_agree_bluemonkey";
    private static final String P = "sensitive_data_agree_treadmill";
    private static final String Q = "id";
    private static final String R = "time";
    private static final String S = "is_show_by_register";
    private static final String T = "HMSelectDeviceActivity";
    private d A;
    private e B;
    private Disposable C;
    private BindDevicePermissionManager D;
    private List<d> x;
    private String y = "Close";
    private AtomicReference<HMDeviceType> z = new AtomicReference<>();
    private final int E = 3;
    private final Lazy<DeviceUtilsApi> F = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<BindServiceApi> G = KoinJavaComponent.inject(BindServiceApi.class);
    private final Lazy<DeviceManagerApi> H = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> I = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a extends BindDevicePermissionManager {
        public a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.xiaomi.hm.health.device.permission.BindDevicePermissionManager
        public void applyOpenLocationService() {
            HMUnifySelectDeviceActivity.this.Y();
        }

        @Override // com.xiaomi.hm.health.device.permission.BindDevicePermissionManager
        public boolean checkLocationServiceOpen() {
            return ((DeviceUtilsApi) HMUnifySelectDeviceActivity.this.F.getValue()).isLocationServerOpen();
        }

        @Override // com.xiaomi.hm.health.device.permission.BindDevicePermissionManager
        public void cleanBindType() {
            HMUnifySelectDeviceActivity.this.z.set(null);
        }

        @Override // com.xiaomi.hm.health.device.permission.BindDevicePermissionManager
        public void launchBindPage() {
            if (GlobalConfig.get().isBuildMidong()) {
                HMUnifySelectDeviceActivity.this.c0();
            } else {
                HMUnifySelectDeviceActivity.this.d0();
            }
        }
    }

    public class b implements HMWatchDeviceWebAPI.CloudDeviceConfigCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI.CloudDeviceConfigCallback
        public void onFail() {
        }

        @Override // com.xiaomi.hm.health.device.amazfit_watch.HMWatchDeviceWebAPI.CloudDeviceConfigCallback
        public void onSuccess(String str, String str2) {
            if (DeviceCloudConfigUtils.transformCloudDeviceConfig(str, str2).isOn(HMDeviceType.WEIGHT)) {
                HMUnifySelectDeviceActivity.this.x.add(3, HMUnifySelectDeviceActivity.this.A);
                HMUnifySelectDeviceActivity.this.B.notifyDataSetChanged();
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.WATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceType.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceType.TREADMILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceType.EARBUD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceType.HEADSET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class d {
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        public static final int k = 4;
        public static final int l = 5;
        public static final int m = 6;
        public static final int n = 7;
        public String a;
        public String b;
        public final Drawable c;
        public boolean d = true;
        public final int e;

        public d(String str, Drawable drawable, int i2) {
            this.a = str;
            this.c = drawable;
            this.e = i2;
        }

        public HMDeviceType a() {
            switch (this.e) {
                case 1:
                    return HMDeviceType.WATCH;
                case 2:
                    return HMDeviceType.WEIGHT;
                case 3:
                    return HMDeviceType.SHOES;
                case 4:
                    return HMDeviceType.OTHER;
                case 5:
                    return HMDeviceType.TREADMILL;
                case 6:
                    return HMDeviceType.EARBUD;
                default:
                    return HMDeviceType.MILI;
            }
        }
    }

    public class e extends BaseAdapter {
        public final ColorMatrixColorFilter a;

        public class a {
            public TextView a;
            public ImageView b;

            public a() {
            }
        }

        public e() {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.2f);
            this.a = new ColorMatrixColorFilter(colorMatrix);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMUnifySelectDeviceActivity.this.x.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"InflateParams"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = HMUnifySelectDeviceActivity.this.getLayoutInflater().inflate(R.layout.layout_device_bound_item, (ViewGroup) null);
                aVar = new a();
                aVar.a = (TextView) view.findViewById(R.id.device_title_tv);
                aVar.b = (ImageView) view.findViewById(R.id.cinco_bg_img);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            d dVar = (d) HMUnifySelectDeviceActivity.this.x.get(i);
            aVar.a.setText(dVar.a);
            aVar.b.setImageDrawable(dVar.c);
            return view;
        }
    }

    private int F() {
        return R.string.weight_setting_weight_many;
    }

    private void G() {
        this.D = new a(this);
    }

    private void H(final boolean z) {
        this.D.requestCameraPermission(new Function1() { // from class: cm3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.N(z, (Boolean) obj);
            }
        });
    }

    private boolean I() {
        return getIntent().getBooleanExtra(S, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.huami.watch.hmwatchmanager")));
        } catch (ActivityNotFoundException e2) {
            HMLog.i(T, e2.getLocalizedMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(AdapterView adapterView, View view, int i, long j) {
        if (i >= this.x.size()) {
            return;
        }
        d dVar = this.x.get(i);
        boolean z = dVar.d;
        HMLog.i(T, dVar.a + " clickable: " + z, new Object[0]);
        if (!z) {
            g0(dVar.a());
        } else if (dVar.e == 7) {
            f0();
        } else {
            b0(dVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit N(boolean z, Boolean bool) {
        if (!bool.booleanValue()) {
            return null;
        }
        if (z) {
            if (!this.F.getValue().checkConnectedMiLiDevice(this)) {
                UnifyBindWaySelectActivity.INSTANCE.launch(this, true);
            }
        } else if (!this.F.getValue().checkConnectedWatchDevice(this)) {
            UnifyBindWaySelectActivity.INSTANCE.launch(this, false);
        }
        finish();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(DialogInterface dialogInterface, int i) {
        this.z.set(null);
        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(DialogInterface dialogInterface, int i) {
        this.z.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.z.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(HMDeviceType hMDeviceType, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        W(hMDeviceType);
        this.D.requestBindDevicePermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(HMDeviceType hMDeviceType, DialogInterface dialogInterface, int i) {
        switch (c.a[hMDeviceType.ordinal()]) {
            case 1:
                this.I.getValue().startHMMiLiSettingActivity(this);
                break;
            case 2:
                if (this.H.getValue().getBoundDeviceSource(HMDeviceType.SHOES) != HMDeviceSource.SHOES_MARS) {
                    this.I.getValue().startHMShoesSettingActivity(this);
                } else {
                    this.I.getValue().startHMNormandySettingActivity(this);
                }
                break;
            case 3:
                this.I.getValue().startWatchDetailActivity(this);
                break;
            case 4:
                this.I.getValue().startHMWeightSettingActivity(this, null, null);
                break;
            case 5:
                this.I.getValue().startHMBlueMonkeySettingActivity(this);
                break;
            case 6:
                this.I.getValue().startHMTreadmillSettingActivity(this);
                break;
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U(HMDeviceType hMDeviceType) {
        return "default: " + hMDeviceType;
    }

    private void V() {
        HMWatchDeviceWebAPI.asyncRequestCloudDeviceConfig(HMWatchDeviceWebAPI.PARAM_BIND_ENTRY_CONFIG, new b());
    }

    private void W(HMDeviceType hMDeviceType) {
        try {
            String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(Property.PROPERTY_KEY_USER_PRIVACY, "");
            JSONObject jSONObject = TextUtils.isEmpty(property) ? new JSONObject() : new JSONObject(property);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", System.currentTimeMillis() / 1000);
            jSONObject2.put("id", HMLoginManager.getValidUid());
            int i = c.a[hMDeviceType.ordinal()];
            if (i == 2) {
                jSONObject.put(M, jSONObject2);
            } else if (i == 3) {
                jSONObject.put(K, jSONObject2);
            } else if (i == 4) {
                jSONObject.put(L, jSONObject2);
            } else if (i == 5) {
                jSONObject.put(O, jSONObject2);
            } else if (i == 6) {
                jSONObject.put(P, jSONObject2);
            } else if (i != 8) {
                jSONObject.put(J, jSONObject2);
            } else {
                jSONObject.put(N, jSONObject2);
            }
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_KEY_USER_PRIVACY, jSONObject.toString());
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        } catch (JSONException e2) {
            HMLog.i(T, "recordSensitiveOperate: " + e2, new Object[0]);
        }
    }

    private boolean X(HMDeviceType hMDeviceType) {
        return (hMDeviceType == HMDeviceType.TREADMILL || GlobalConfig.get().isBuildMidong() || Language.isSimplifiedChinese()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.loaction_tips).setMessage(R.string.open_loaction_msg).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: am3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: em3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.P(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    private boolean Z() {
        int i;
        final HMDeviceType hMDeviceType = this.z.get();
        if (!X(hMDeviceType)) {
            return false;
        }
        int i2 = c.a[hMDeviceType.ordinal()];
        if (i2 == 2) {
            i = R.string.sensitive_data_sport;
        } else if (i2 == 3) {
            i = R.string.sensitive_data_watch;
        } else if (i2 != 4) {
            i = (i2 == 5 || i2 == 6 || i2 == 8) ? R.string.sensitive_data_blue_monkey : R.string.sensitive_data_mili;
        } else {
            i = R.string.sensitive_data_weight;
        }
        new AlertDialogFragment.Builder(this).setTitle(R.string.sensitive_dialog_title_new).setMessage(i).setCancelable(true).setNegativeButton(R.string.sensitive_data_disagree, new DialogInterface.OnClickListener() { // from class: dm3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.Q(dialogInterface, i3);
            }
        }).setPositiveButton(R.string.sensitive_data_agree, new DialogInterface.OnClickListener() { // from class: fm3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.a.R(hMDeviceType, dialogInterface, i3);
            }
        }).show(getSupportFragmentManager());
        return true;
    }

    private void a0(final HMDeviceType hMDeviceType) {
        String miLiDeviceDescription;
        HMDeviceSource boundDeviceSource = this.H.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        int i = c.a[hMDeviceType.ordinal()];
        if (i == 1) {
            miLiDeviceDescription = this.F.getValue().getMiLiDeviceDescription(boundDeviceSource);
        } else if (i == 2) {
            miLiDeviceDescription = this.F.getValue().getShoesDeviceDescription();
        } else if (i == 3) {
            miLiDeviceDescription = this.F.getValue().getBoundWatchDeviceDescription();
        } else if (i != 4) {
            miLiDeviceDescription = i != 5 ? "" : this.F.getValue().getOtherDeviceDescription();
        } else {
            miLiDeviceDescription = this.F.getValue().getWeightDeviceDescription();
        }
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.unbind_device_tips, new Object[]{miLiDeviceDescription})).setCancelable(true).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: hm3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.unbind_device, new DialogInterface.OnClickListener() { // from class: gm3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.T(hMDeviceType, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    private void b0(HMDeviceType hMDeviceType) {
        if (this.z.get() != null) {
            return;
        }
        this.z.set(hMDeviceType);
        if (Z()) {
            return;
        }
        this.D.requestBindDevicePermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        final HMDeviceType hMDeviceType = this.z.get();
        if (hMDeviceType == null) {
            return;
        }
        switch (c.a[hMDeviceType.ordinal()]) {
            case 1:
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_BAND;
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportBari()) {
                    H(true);
                } else if (!this.F.getValue().checkConnectedMiLiDevice(this)) {
                    e0(hMDeviceType);
                } else {
                    finish();
                }
                break;
            case 2:
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_SHOE;
                this.I.getValue().startHMSelectShoesActivity(this);
                finish();
                break;
            case 3:
                H(false);
                break;
            case 4:
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_SCALE;
                e0(hMDeviceType);
                break;
            case 5:
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_BLUE_MONKEY;
                e0(hMDeviceType);
                break;
            case 6:
                e0(hMDeviceType);
                break;
            case 7:
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_EARBUD;
                startActivity(new Intent(this, (Class<?>) HmSelectEarbudActivity.class));
                finish();
                break;
            default:
                HMLog.error(T, new Function0() { // from class: bm3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMUnifySelectDeviceActivity.U(hMDeviceType);
                    }
                });
                this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_BAND;
                if (!this.F.getValue().checkConnectedMiLiDevice(this)) {
                    e0(hMDeviceType);
                } else {
                    finish();
                }
                break;
        }
        this.z.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        HMDeviceType hMDeviceType = this.z.get();
        if (hMDeviceType == null) {
            return;
        }
        int i = c.a[hMDeviceType.ordinal()];
        if (i == 1) {
            H(true);
        } else if (i == 3) {
            startActivity(new Intent(this, (Class<?>) HMSelectWatchActivityNew.class));
        } else if (i == 4) {
            this.y = StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_SCALE;
            e0(hMDeviceType);
        }
        this.z.set(null);
    }

    private void e0(HMDeviceType hMDeviceType) {
        if (PhoneEnvActivity.testPhoneEnv((Context) this, true, this.G.getValue().getBindType(hMDeviceType))) {
            this.G.getValue().startBindDevice(this, hMDeviceType);
        }
        finish();
    }

    private void f0() {
        DeviceManagerApi value = this.H.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = value.getDevice(hMDeviceType);
        if (device == null || !ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, device.getDeviceSource())) {
            HmVirtualDeviceManager.getInstance().jumpToBindActivity(this);
        } else {
            HmVirtualDeviceManager.getInstance().jumpToDeviceActivity(this, this.H.getValue().getDeviceBound(hMDeviceType));
        }
        finish();
    }

    private void g0(HMDeviceType hMDeviceType) {
        HMDeviceSource boundDeviceSource = this.H.getValue().getBoundDeviceSource(hMDeviceType);
        if (hMDeviceType == HMDeviceType.WATCH && HMDeviceConfig.isWatch(boundDeviceSource)) {
            hMDeviceType = HMDeviceType.MILI;
        }
        a0(hMDeviceType);
    }

    private void init() {
        ListView listView = (ListView) findViewById(R.id.device_list);
        d dVar = new d(getString(R.string.device_band), ContextCompat.getDrawable(this, R.drawable.img_bind_band_unify), 0);
        d dVar2 = new d(getString(R.string.device_watch), ContextCompat.getDrawable(this, R.drawable.img_bind_watch_unify), 1);
        this.A = new d(getString(F()), ContextCompat.getDrawable(this, R.drawable.img_bind_scale_unify), 2);
        new d(getString(R.string.smart_shoes), ContextCompat.getDrawable(this, R.drawable.img_bind_shoes_unify), 3);
        d dVar3 = new d(getString(R.string.device_headset), ContextCompat.getDrawable(this, R.drawable.img_bind_mozart), 6);
        d dVar4 = new d(getString(R.string.device_fitbit), ContextCompat.getDrawable(this, R.drawable.img_bind_fitbit_unify), 7);
        this.x = new ArrayList();
        if (GlobalConfig.get().isBuildMidong()) {
            this.x.add(dVar2);
            this.x.add(dVar);
            this.x.add(dVar3);
            this.x.add(this.A);
            this.x.add(new d(getString(R.string.bolt_device_name), ContextCompat.getDrawable(this, R.drawable.img_bind_bolt_unify), 5));
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportBindFitBit()) {
                this.x.add(dVar4);
            }
        } else {
            this.x.add(dVar);
            this.x.add(dVar2);
            this.x.add(this.A);
        }
        e eVar = new e();
        this.B = eVar;
        listView.setAdapter((ListAdapter) eVar);
        if (!GlobalConfig.get().isBuildMidong()) {
            FrameLayout frameLayout = new FrameLayout(this);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_select_device_footer, (ViewGroup) frameLayout, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: jm3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.J(view);
                }
            });
            frameLayout.addView(viewInflate);
            listView.addFooterView(frameLayout);
        }
        findViewById(R.id.skip_tv).setOnClickListener(new View.OnClickListener() { // from class: km3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K(view);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: lm3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.a.L(adapterView, view, i, j);
            }
        });
        if (I()) {
            getLeft().setVisibility(8);
            findViewById(R.id.layout_bind_not_right_now).setVisibility(0);
            findViewById(R.id.tv_bind_not_right_now).setOnClickListener(new View.OnClickListener() { // from class: im3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.M(view);
                }
            });
        }
    }

    public static void startAfterRegister(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMUnifySelectDeviceActivity.class);
        intent.putExtra(S, true);
        context.startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_device_unify);
        if (GlobalConfig.get().isBuildMidong()) {
            UnifyTitleBarStyle.setUnifyTitleStyle(this, getString(R.string.device_select_title));
        } else {
            setStyle(BaseTitleActivity.STYLE.SINGLE_TITLE, ContextCompat.getColor(this, R.color.pale_grey), getString(R.string.device_select_title), true);
            getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.black70));
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BIND_SELECT_DEVICE));
        G();
        init();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.z.set(null);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BIND_SELECT_DEVICE_EXIT).setValue(this.y));
    }
}
