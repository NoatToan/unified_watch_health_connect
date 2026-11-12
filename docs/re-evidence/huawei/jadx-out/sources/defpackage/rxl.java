package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.Glide;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.DeviceOperateManager;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel;
import com.huawei.ui.homehealth.operation.deviceempty.bean.EmptyDeviceResource;
import com.huawei.ui.homehealth.view.BatteryView;
import com.huawei.ui.homehealth.view.HalfWidthTextView;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class rxl extends DeviceViewDelegate implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceDisplayViewModel f47812a;
    private HealthTextView aa;
    private HalfWidthTextView ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private HealthTextView ag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinearLayout f47813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer<EmptyDeviceResource> f47814c;
    private DeviceInfo d;
    private ReconnectUtils.ConnectFailTip e;
    private BatteryView f;
    private BatteryView g;
    private BatteryView h;
    private boolean i;
    private BatteryView j;
    private HealthTextView k;
    private ImageView l;
    private BatteryView m;
    private final BroadcastReceiver n;
    private HealthImageView o;
    private LinearLayout p;
    private LinearLayout q;
    private LinearLayout r;
    private LinearLayout s;
    private LinearLayout t;
    private TextView u;
    private HealthTextView v;
    private LinearLayout w;
    private RelativeLayout x;
    private LinearLayout y;
    private HealthTextView z;

    public rxl(ComponentActivity componentActivity) {
        super(componentActivity);
        this.i = false;
        this.n = new BroadcastReceiver() { // from class: rxl.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (rxl.this.d == null) {
                    rxl.this.g();
                } else {
                    ReleaseLogUtil.c("R_DeviceDisplayDelegate", "mGreetingReceiver currentDeviceInfo is not null");
                }
            }
        };
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "DeviceDisplayDelegate enter");
        DeviceDisplayViewModel deviceDisplayViewModel = (DeviceDisplayViewModel) new ViewModelProvider(componentActivity).get(DeviceDisplayViewModel.class);
        this.f47812a = deviceDisplayViewModel;
        deviceDisplayViewModel.d();
        e();
        a();
        h();
        componentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.huawei.ui.homehealth.devicearkui.delegate.DeviceDisplayDelegate$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                LogUtil.a("DeviceDisplayDelegate", "test onResume");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                LogUtil.a("DeviceDisplayDelegate", "test onPause");
            }
        });
    }

    private void e() {
        this.f47812a.a(new DeviceDisplayViewModel.DeviceConnectState() { // from class: rxl.4
            @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel.DeviceConnectState
            public void onDeviceConnectChange(DeviceInfo deviceInfo, int i) {
                if (!mig.d(rxl.this.d, deviceInfo)) {
                    LogUtil.j("DeviceDisplayDelegate", "registerDeviceConnectState devices are different and deviceInfo:", deviceInfo.getDeviceName());
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.a("DeviceDisplayDelegate", "registerDeviceConnectState name:", deviceInfo.getDeviceName(), " connectState:", Integer.valueOf(deviceConnectState), " extraState:", Integer.valueOf(i));
                rxl.this.a(deviceConnectState, i);
            }
        });
    }

    private void a() {
        this.f47812a.a(new DeviceDisplayViewModel.IDeviceBatterState() { // from class: rxl.3
            @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel.IDeviceBatterState
            public void onDeviceBatteryChange(DeviceInfo deviceInfo, mgp mgpVar) {
                if (!mig.d(rxl.this.d, deviceInfo)) {
                    LogUtil.j("DeviceDisplayDelegate", "registerDeviceBatterState devices are different and deviceInfo:", deviceInfo.getDeviceName());
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.a("DeviceDisplayDelegate", "registerDeviceBatterState name:", deviceInfo.getDeviceName(), " connectState:", Integer.valueOf(deviceConnectState), " battery:", Integer.valueOf(mgpVar.d()));
                if (deviceConnectState == 2) {
                    rxl.this.c(mgpVar);
                }
            }
        });
    }

    private void h() {
        this.f47812a.b(new DeviceDisplayViewModel.DeviceImageObtain() { // from class: rxx
            @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceDisplayViewModel.DeviceImageObtain
            public final void setDeviceImage(Bitmap bitmap) {
                this.f47827a.b(bitmap);
            }
        });
    }

    /* synthetic */ void b(final Bitmap bitmap) {
        getActivity().runOnUiThread(new Runnable() { // from class: rxt
            @Override // java.lang.Runnable
            public final void run() {
                this.f47823b.c(bitmap);
            }
        });
    }

    /* synthetic */ void c(Bitmap bitmap) {
        if (bitmap == null) {
            ReleaseLogUtil.d("R_DeviceDisplayDelegate", "registerDeviceImageObtain bitmap is null");
        } else {
            this.l.setImageBitmap(bitmap);
            ReleaseLogUtil.c("R_DeviceDisplayDelegate", "registerDeviceImageObtain bitmap is not null");
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "onCreateView enter");
        View viewInflate = layoutInflater.inflate(R.layout.layout_tab_device, viewGroup, false);
        a(viewInflate);
        return viewInflate;
    }

    private void a(View view) {
        this.q = (LinearLayout) view.findViewById(R.id.ll_tab_device_empty);
        this.ag = (HealthTextView) view.findViewById(R.id.tv_tab_device_time);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_tab_learn_more);
        this.k = healthTextView;
        healthTextView.setOnClickListener(c());
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.iv_tab_default);
        this.o = healthImageView;
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: rxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.onClick(view2);
            }
        });
        view.findViewById(R.id.tv_tab_device_add).setOnClickListener(new View.OnClickListener() { // from class: rxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.onClick(view2);
            }
        });
        this.x = (RelativeLayout) view.findViewById(R.id.rl_tab_device);
        this.ab = (HalfWidthTextView) view.findViewById(R.id.tv_tab_device_name);
        view.findViewById(R.id.tv_tab_device_help).setOnClickListener(new View.OnClickListener() { // from class: rxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.onClick(view2);
            }
        });
        this.l = (ImageView) view.findViewById(R.id.iv_tab_device_image);
        this.t = (LinearLayout) view.findViewById(R.id.ll_tab_device_disconnect);
        cha chaVar = new cha(new View.OnClickListener() { // from class: rxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47822b.e(view2);
            }
        }, true, "");
        qji.a(chaVar, getActivity().toString());
        this.t.setOnClickListener(chaVar);
        this.s = (LinearLayout) view.findViewById(R.id.ll_tab_device_connecting);
        ((HealthProgressBar) view.findViewById(R.id.pb_tab_device_connecting)).setLayerType(1, null);
        this.u = (TextView) view.findViewById(R.id.tv_device_connect);
        this.p = (LinearLayout) view.findViewById(R.id.ll_tab_device_connected);
        this.h = (BatteryView) view.findViewById(R.id.bv_tab_device_battery);
        this.z = (HealthTextView) view.findViewById(R.id.tv_tab_device_battery_number);
        this.r = (LinearLayout) view.findViewById(R.id.ll_tab_device_connected_ear);
        this.j = (BatteryView) view.findViewById(R.id.bv_tab_device_battery_ear);
        this.g = (BatteryView) view.findViewById(R.id.bv_tab_device_battery_ear_left);
        this.f = (BatteryView) view.findViewById(R.id.bv_tab_device_battery_ear_right);
        this.v = (HealthTextView) view.findViewById(R.id.tv_tab_device_battery_ear);
        this.aa = (HealthTextView) view.findViewById(R.id.tv_tab_device_battery_ear_left);
        this.ac = (HealthTextView) view.findViewById(R.id.tv_tab_device_battery_ear_right);
        this.w = (LinearLayout) view.findViewById(R.id.ll_tab_device_ota_update);
        this.f47813b = (LinearLayout) view.findViewById(R.id.ll_tab_device_battery_exception);
        this.y = (LinearLayout) view.findViewById(R.id.ll_tab_device_maca);
        this.m = (BatteryView) view.findViewById(R.id.bv_tab_device_maca);
        this.ad = (HealthTextView) view.findViewById(R.id.tv_tab_device_maca);
        b();
        f();
        d();
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("DeviceDisplayDelegate", "click reconnectDevice");
        c(this.d, 0);
    }

    private cha c() {
        LogUtil.a("DeviceDisplayDelegate", "getMoreDeviceListener enter");
        return new cha(new View.OnClickListener() { // from class: rxw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        }, true, "");
    }

    /* synthetic */ void d(View view) {
        teg.a(getActivity());
    }

    private void b() {
        this.f47814c = new Observer() { // from class: com.huawei.ui.homehealth.devicearkui.delegate.DeviceDisplayDelegate$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f25382c.c((EmptyDeviceResource) obj);
            }
        };
        this.f47812a.b().observe(getActivity(), this.f47814c);
    }

    public /* synthetic */ void c(final EmptyDeviceResource emptyDeviceResource) {
        if (emptyDeviceResource == null) {
            return;
        }
        ReleaseLogUtil.d("R_DeviceDisplayDelegate", "showDeviceEmptyView", Long.valueOf(emptyDeviceResource.e()));
        this.k.setText(emptyDeviceResource.b());
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), b(emptyDeviceResource, 0, 1), 0);
        Glide.with((Activity) getActivity()).load(emptyDeviceResource.j()).placeholder(R.mipmap.ic_tab_device_default).into(this.o);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), b(emptyDeviceResource, 1, 1), 0);
        this.k.setOnClickListener(new View.OnClickListener() { // from class: rxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rxl.a(emptyDeviceResource, view);
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: rxq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rxl.c(emptyDeviceResource, view);
            }
        });
    }

    static /* synthetic */ void a(EmptyDeviceResource emptyDeviceResource, View view) {
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), b(emptyDeviceResource, 0, 2), 0);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(emptyDeviceResource.a());
        }
    }

    static /* synthetic */ void c(EmptyDeviceResource emptyDeviceResource, View view) {
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), b(emptyDeviceResource, 1, 2), 0);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(emptyDeviceResource.h());
        }
    }

    private static Map<String, Object> b(EmptyDeviceResource emptyDeviceResource, int i, int i2) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "Device_0001");
        map.put("event", Integer.valueOf(i2));
        map.put("resourcePositionId", 4156);
        if (i == 0) {
            map.put("resourceId", emptyDeviceResource.l());
            map.put("resourceName", emptyDeviceResource.o());
            map.put("itemCardName", emptyDeviceResource.f());
            return map;
        }
        if (i != 1) {
            return map;
        }
        map.put("resourceId", emptyDeviceResource.i());
        map.put("resourceName", emptyDeviceResource.g());
        map.put("itemCardName", emptyDeviceResource.c());
        return map;
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void setUserVisibleHint(boolean z) {
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "setUserVisibleHint isVisibleToUser: ", Boolean.valueOf(z));
        if (z) {
            DeviceInfo deviceInfo = this.d;
            if (deviceInfo == null) {
                g();
                return;
            }
            if (deviceInfo instanceof CloudDeviceInfo) {
                ReleaseLogUtil.c("R_DeviceDisplayDelegate", "setUserVisibleHint CloudDevice");
                return;
            }
            if (deviceInfo.getDeviceConnectState() == 2) {
                if (this.d.getProductType() == 275) {
                    b(this.d);
                } else {
                    this.f47812a.a();
                }
            }
            b(this.d.getDeviceConnectState());
        }
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.BaseViewDelegate
    public void onDestroy() {
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "onDestroy enter");
        this.f47812a.b().removeObserver(this.f47814c);
        j();
    }

    @Override // com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate
    public void updateDevice(DeviceInfo deviceInfo) {
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "updateDevice enter deviceName:", deviceInfo == null ? Constants.NULL : deviceInfo.getDeviceName());
        d(deviceInfo);
        if (deviceInfo == null) {
            this.d = null;
            this.f47812a.b((DeviceInfo) null);
            f();
            return;
        }
        this.d = deviceInfo;
        this.f47812a.b(deviceInfo);
        i();
        b(deviceInfo.getDeviceConnectState());
        this.f47812a.e();
        if (this.d.getDeviceConnectState() == 2) {
            if (this.d.getProductType() == 275) {
                b(this.d);
            } else {
                this.f47812a.a();
            }
        }
    }

    private void f() {
        this.q.setVisibility(0);
        this.x.setVisibility(8);
        g();
        this.f47812a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HealthTextView healthTextView = this.ag;
        if (healthTextView != null) {
            healthTextView.setText(teg.e());
        }
    }

    private void i() {
        this.q.setVisibility(8);
        this.x.setVisibility(0);
        this.ab.setText(teg.d(this.d));
        this.f47812a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        this.t.setVisibility(8);
        this.s.setVisibility(8);
        this.r.setVisibility(8);
        this.p.setVisibility(8);
        this.w.setVisibility(8);
        this.f47813b.setVisibility(8);
        this.y.setVisibility(8);
        LogUtil.a("DeviceDisplayDelegate", "switchConnectStatus connectState:", Integer.valueOf(i), " extraState:", Integer.valueOf(i2));
        if (i == 1) {
            if (i2 == 1) {
                this.u.setText(R.string.IDS_device_guide_syncing);
            } else {
                this.u.setText(R.string.IDS_device_guide_connecting);
            }
            this.s.setVisibility(0);
            return;
        }
        if (i == 2) {
            boolean zA = rtk.a();
            LogUtil.a("DeviceDisplayDelegate", "showConnectedView otaStatus:", Boolean.valueOf(zA), " isBatteryValid:", Boolean.valueOf(this.i));
            if (zA) {
                this.w.setVisibility(0);
                return;
            }
            if (!this.i) {
                this.f47813b.setVisibility(0);
                return;
            }
            DeviceInfo deviceInfo = this.d;
            if (deviceInfo != null && deviceInfo.getProductType() == 275) {
                this.y.setVisibility(0);
                return;
            }
            boolean zC = teg.c(this.d);
            this.r.setVisibility(zC ? 0 : 8);
            this.p.setVisibility(zC ? 8 : 0);
            return;
        }
        this.t.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(mgp mgpVar) {
        if (this.d.getProductType() == 275) {
            return;
        }
        boolean zC = teg.c(mgpVar.d());
        this.i = zC;
        LogUtil.a("DeviceDisplayDelegate", "updateBattery isBatteryValid:", Boolean.valueOf(zC));
        if (this.i) {
            if (teg.c(this.d)) {
                this.j.setProgress(mgpVar.d(), true);
                this.g.setProgress(mgpVar.b(), true);
                this.f.setProgress(mgpVar.e(), true);
                this.v.setText(teg.c(mgpVar.d(), true));
                this.aa.setText(teg.c(mgpVar.b(), false));
                this.ac.setText(teg.c(mgpVar.e(), false));
            } else {
                this.h.setProgress(mgpVar.d(), false);
                this.z.setText(teg.c(mgpVar.d(), true));
            }
        }
        b(2);
    }

    public void b(DeviceInfo deviceInfo) {
        dmx<Long> matterTimeInfo = ecu.d().getMatterTimeInfo(deviceInfo, 1);
        if (matterTimeInfo.a().intValue() != 0) {
            return;
        }
        this.i = true;
        Long lC = matterTimeInfo.c();
        LogUtil.a("DeviceDisplayDelegate", "updateMatterTime getMatterTime:", lC);
        if (lC != null && lC.longValue() >= 0 && lC.longValue() < 2147483647L) {
            int iIntValue = (int) ((((double) lC.intValue()) * 100.0d) / 23040.0d);
            this.m.setCenterIcon(ContextCompat.getDrawable(getActivity(), R.drawable.ic_tab_device_battery_maca));
            this.m.setMacaProgress(iIntValue);
            this.ad.setText(a(lC.intValue()));
        }
        b(2);
    }

    private String a(int i) {
        if (i < 60) {
            return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_device_remain_time_minute, i, Integer.valueOf(i));
        }
        if (i < 1440) {
            int i2 = i / 60;
            return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_device_remain_time_hours, i2, Integer.valueOf(i2));
        }
        return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_device_remain_time_day, d(i, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL), Integer.valueOf(d(i, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL)));
    }

    private int d(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            ReleaseLogUtil.d("R_DeviceDisplayDelegate", "onClick isFastClick");
            return;
        }
        if (LoginInit.checkBaseServiceModel()) {
            LogUtil.j("DeviceDisplayDelegate", "onClick checkBaseServiceModel");
            return;
        }
        int id = view.getId();
        if (id == R.id.tv_tab_device_add) {
            rdp.a(getActivity());
        } else if (id == R.id.tv_tab_device_help) {
            teg.e(getActivity(), this.d);
        }
    }

    /* JADX INFO: renamed from: rxl$5, reason: invalid class name */
    class AnonymousClass5 implements DeviceOperateManager.ConnectCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47816c;
        final /* synthetic */ int d;

        AnonymousClass5(DeviceInfo deviceInfo, int i) {
            this.f47816c = deviceInfo;
            this.d = i;
        }

        @Override // com.huawei.ui.homehealth.device.DeviceOperateManager.ConnectCallback
        public void onStartConnectSuccess() {
            ComponentActivity componentActivity = rxl.this.activity;
            final DeviceInfo deviceInfo = this.f47816c;
            componentActivity.runOnUiThread(new Runnable() { // from class: rya
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47834c.c(deviceInfo);
                }
            });
        }

        /* synthetic */ void c(DeviceInfo deviceInfo) {
            if (mig.d(rxl.this.d, deviceInfo)) {
                rxl.this.b(1);
            }
        }

        @Override // com.huawei.ui.homehealth.device.DeviceOperateManager.ConnectCallback
        public void onStartConnectFailed() {
            ReleaseLogUtil.c("R_DeviceDisplayDelegate", "reconnectDevice onStartConnectFailed");
        }

        @Override // com.huawei.ui.homehealth.device.DeviceOperateManager.ConnectCallback
        public void onTimeout() {
            ReleaseLogUtil.c("R_DeviceDisplayDelegate", "reconnectDevice onTimeout");
            ComponentActivity componentActivity = rxl.this.activity;
            final DeviceInfo deviceInfo = this.f47816c;
            componentActivity.runOnUiThread(new Runnable() { // from class: rxy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(deviceInfo);
                }
            });
        }

        /* synthetic */ void a(DeviceInfo deviceInfo) {
            if (mig.d(rxl.this.d, deviceInfo)) {
                rxl.this.b(4);
            }
        }

        @Override // com.huawei.ui.homehealth.device.DeviceOperateManager.ConnectCallback
        public void showFailTip() {
            ReleaseLogUtil.c("R_DeviceDisplayDelegate", "reconnectDevice showFailTip");
            ComponentActivity componentActivity = rxl.this.activity;
            final DeviceInfo deviceInfo = this.f47816c;
            final int i = this.d;
            componentActivity.runOnUiThread(new Runnable() { // from class: ryb
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(deviceInfo, i);
                }
            });
        }

        /* synthetic */ void c(final DeviceInfo deviceInfo, int i) {
            if (mig.d(rxl.this.d, deviceInfo)) {
                rxl rxlVar = rxl.this;
                rxlVar.e = ReconnectUtils.a(rxlVar.activity, deviceInfo, i, new ReconnectCallback() { // from class: rxv
                    @Override // com.huawei.ui.homehealth.device.callback.ReconnectCallback
                    public final void reconnect() {
                        this.f47826c.e(deviceInfo);
                    }
                });
            }
        }

        /* synthetic */ void e(DeviceInfo deviceInfo) {
            rxl.this.c(deviceInfo, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, int i) {
        ReleaseLogUtil.c("R_DeviceDisplayDelegate", "reconnectDevice deviceInfo.name:", deviceInfo.getDeviceName());
        this.f47812a.a(deviceInfo, new AnonymousClass5(deviceInfo, i));
    }

    private void d(final DeviceInfo deviceInfo) {
        lss.a(this.e, new Consumer() { // from class: rxu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47825c.a(deviceInfo, (ReconnectUtils.ConnectFailTip) obj);
            }
        });
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, ReconnectUtils.ConnectFailTip connectFailTip) {
        if (connectFailTip.dismiss(deviceInfo)) {
            this.e = null;
        }
    }

    private void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        BroadcastManagerUtil.c(getActivity(), this.n, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void j() {
        try {
            if (this.n != null) {
                getActivity().unregisterReceiver(this.n);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.j("DeviceDisplayDelegate", "unregisterReceiver exception:", ExceptionUtils.c(e));
        }
    }
}
