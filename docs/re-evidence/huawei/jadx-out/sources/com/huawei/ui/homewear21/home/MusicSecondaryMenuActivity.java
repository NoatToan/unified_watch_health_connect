package com.huawei.ui.homewear21.home;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.music.MusicMainActivity;
import com.huawei.ui.device.activity.notification.NotificationTipActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import com.huawei.ui.device.views.devicesettings.DeviceSettingFactoryBaseAdapter;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity;
import defpackage.lzl;
import defpackage.lzq;
import defpackage.mal;
import defpackage.qrs;
import defpackage.rfq;
import defpackage.tfn;
import defpackage.tfp;
import defpackage.tge;
import defpackage.thf;
import defpackage.thh;
import defpackage.thi;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Vector;

/* JADX INFO: loaded from: classes18.dex */
public class MusicSecondaryMenuActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26202b;
    private Context e;
    private DeviceSettingFactoryBaseAdapter g;
    private DeviceSettingsInteractors h;
    private ListView k;
    private NotificationPushInteractor v;
    private RelativeLayout w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f26203c = new Object();
    private volatile List<rfq> n = new Vector(0);
    private String i = "";
    private DeviceCapability j = null;
    private volatile boolean l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f26201a = null;
    private tfp u = null;
    private a x = null;
    private HandlerThread m = null;
    private boolean t = false;
    private boolean q = false;
    private Handler p = new b(this);
    private final AdapterView.OnItemClickListener f = new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Genera onItemClick: parent is ", adapterView, ",view is ", view, ",position is ", Integer.valueOf(i), "idLong is ", Long.valueOf(j));
            if (!qrs.c(500)) {
                if (i >= MusicSecondaryMenuActivity.this.b().size() || i < 0) {
                    return;
                }
                int iB = ((rfq) MusicSecondaryMenuActivity.this.b().get(i)).b();
                LogUtil.a("MusicSecondaryMenu", 1, "MusicSecondaryMenuActivity", "onItemClick: id is ", Integer.valueOf(iB));
                if (iB != 111) {
                    LogUtil.j("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter default");
                    return;
                }
                if (lzq.h()) {
                    MusicSecondaryMenuActivity.this.w.setVisibility(0);
                    MusicSecondaryMenuActivity.this.k.setVisibility(8);
                    lzl lzlVarA = lzl.a(BaseApplication.getContext());
                    MusicSecondaryMenuActivity musicSecondaryMenuActivity = MusicSecondaryMenuActivity.this;
                    lzlVarA.e(musicSecondaryMenuActivity.new e(musicSecondaryMenuActivity));
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("device_id", MusicSecondaryMenuActivity.this.i);
                intent.setClass(view.getContext(), MusicMainActivity.class);
                MusicSecondaryMenuActivity.this.startActivity(intent);
                return;
            }
            LogUtil.a("MusicSecondaryMenuActivity", "isFastDoubleClick");
        }
    };
    private final CompoundButton.OnCheckedChangeListener s = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity.2
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("MusicSecondaryMenuActivity", "MusicControl is onCheckedChanged isChecked is ", Boolean.valueOf(z));
            if (z && !MusicSecondaryMenuActivity.this.v.e() && MusicSecondaryMenuActivity.this.p != null) {
                MusicSecondaryMenuActivity.this.p.sendEmptyMessageDelayed(1, 100L);
                MusicSecondaryMenuActivity.this.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
            }
            MusicSecondaryMenuActivity musicSecondaryMenuActivity = MusicSecondaryMenuActivity.this;
            musicSecondaryMenuActivity.d(musicSecondaryMenuActivity.b(), 34).b(z);
            lzl.a(MusicSecondaryMenuActivity.this.e).c(z, true);
        }
    };
    private final IBaseResponseCallback r = new IBaseResponseCallback() { // from class: tfr
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public final void a(int i, Object obj) {
            this.d.a(i, obj);
        }
    };
    private c o = new c(this) { // from class: com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity.4
        @Override // com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity.c, java.lang.Runnable
        public void run() {
            MusicSecondaryMenuActivity musicSecondaryMenuActivityB = b();
            if (musicSecondaryMenuActivityB != null) {
                musicSecondaryMenuActivityB.q();
            }
        }
    };
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.MusicSecondaryMenuActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("MusicSecondaryMenuActivity", "intent is null!");
                return;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
            if (deviceInfo == null) {
                LogUtil.j("MusicSecondaryMenuActivity", "deviceInfo is null!");
                return;
            }
            if (!lzq.d(deviceInfo)) {
                LogUtil.j("MusicSecondaryMenuActivity", "This device does not have the correspond capability.");
                return;
            }
            if (deviceInfo.getDeviceConnectState() == 2) {
                MusicSecondaryMenuActivity musicSecondaryMenuActivity = MusicSecondaryMenuActivity.this;
                musicSecondaryMenuActivity.d(musicSecondaryMenuActivity.b(), 111).c(true);
                MusicSecondaryMenuActivity.this.g.notifyDataSetChanged();
            } else {
                MusicSecondaryMenuActivity musicSecondaryMenuActivity2 = MusicSecondaryMenuActivity.this;
                musicSecondaryMenuActivity2.d(musicSecondaryMenuActivity2.b(), 111).c(false);
                MusicSecondaryMenuActivity.this.g.notifyDataSetChanged();
            }
        }
    };

    public static /* synthetic */ void a(View view) {
    }

    static class b extends Handler {
        private final WeakReference<MusicSecondaryMenuActivity> d;

        b(MusicSecondaryMenuActivity musicSecondaryMenuActivity) {
            this.d = new WeakReference<>(musicSecondaryMenuActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            MusicSecondaryMenuActivity musicSecondaryMenuActivity = this.d.get();
            if (musicSecondaryMenuActivity == null) {
                return;
            }
            if (musicSecondaryMenuActivity.isFinishing()) {
                LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Activity is finishing or null.");
                return;
            }
            int i = message.what;
            if (i == 1) {
                LogUtil.a("MusicSecondaryMenuActivity", "handleMessage，SHOW_TIP");
                Intent intent = new Intent();
                intent.setClass(musicSecondaryMenuActivity.f26202b, NotificationTipActivity.class);
                try {
                    musicSecondaryMenuActivity.f26202b.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("MusicSecondaryMenuActivity", "ActivityNotFoundException");
                    return;
                }
            }
            if (i != 1016) {
                if (i == 1017) {
                    LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "HandleMessage.");
                    musicSecondaryMenuActivity.h();
                    musicSecondaryMenuActivity.o();
                    musicSecondaryMenuActivity.g();
                    return;
                }
                LogUtil.j("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter default");
            }
        }
    }

    public class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MusicSecondaryMenuActivity> f26207a;

        e(MusicSecondaryMenuActivity musicSecondaryMenuActivity) {
            this.f26207a = new WeakReference<>(musicSecondaryMenuActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("MusicSecondaryMenuActivity", "getAuthorizationStatus");
            if (this.f26207a.get() == null) {
                return;
            }
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() == 100) {
                    MusicSecondaryMenuActivity.this.runOnUiThread(new Runnable() { // from class: tfz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.c();
                        }
                    });
                } else {
                    MusicSecondaryMenuActivity.this.runOnUiThread(new Runnable() { // from class: tfy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49089c.d();
                        }
                    });
                }
            }
            lzl.a(BaseApplication.getContext()).a();
        }

        public /* synthetic */ void c() {
            MusicSecondaryMenuActivity.this.w.setVisibility(8);
            MusicSecondaryMenuActivity.this.k.setVisibility(0);
            Intent intent = new Intent();
            intent.putExtra("device_id", MusicSecondaryMenuActivity.this.i);
            intent.setClass(MusicSecondaryMenuActivity.this, MusicMainActivity.class);
            MusicSecondaryMenuActivity.this.startActivity(intent);
        }

        public /* synthetic */ void d() {
            MusicSecondaryMenuActivity.this.w.setVisibility(8);
            MusicSecondaryMenuActivity.this.k.setVisibility(0);
            MusicSecondaryMenuActivity.this.j();
        }
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0 && (obj instanceof List)) {
            LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "startMessageNotificationObserver count ", Integer.valueOf(((List) obj).size()));
            a().sendEmptyMessage(1016);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<rfq> b() {
        return this.n;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_music_secondary_menu);
        tge.c(true);
        this.f26202b = this;
        Context context = BaseApplication.getContext();
        this.e = context;
        this.h = DeviceSettingsInteractors.e(context);
        this.v = new NotificationPushInteractor(this.e);
        if (mal.b() != null) {
            LogUtil.a("MusicSecondaryMenuActivity", "getHwMusicAccountSendToWear");
            mal.a(this.e, false);
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.i = intent.getStringExtra("device_id");
            this.t = intent.getBooleanExtra("isFromDeepLink", false);
            this.q = intent.getBooleanExtra("musicAuthorizationStatus", false);
        }
        if (this.i != null && tfn.a().e(this.i) != null) {
            this.f26201a = tfn.a().e(this.i);
        }
        if (this.t && !this.q) {
            j();
        }
        l();
        c();
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "UI setContentView");
        HandlerThread handlerThread = new HandlerThread("MusicSecondaryMenuActivity");
        this.m = handlerThread;
        handlerThread.start();
        a aVar = new a(this.m.getLooper(), this);
        this.x = aVar;
        aVar.post(this.o);
        m();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        r();
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("MusicSecondaryMenuActivity", "onDestroy");
        a(this.d);
        e();
    }

    private void e() {
        HandlerThread handlerThread = this.m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.m = null;
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
    }

    private void m() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f26202b, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        this.f26202b.unregisterReceiver(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "refreshSettingView() mGeneralList , ", b());
        ListView listView = (ListView) findViewById(R.id.list_general_settings);
        this.k = listView;
        BaseActivity.cancelLayoutById(listView);
        this.k.setLayerType(2, null);
        DeviceSettingFactoryBaseAdapter deviceSettingFactoryBaseAdapter = new DeviceSettingFactoryBaseAdapter(this, b());
        this.g = deviceSettingFactoryBaseAdapter;
        this.k.setAdapter((ListAdapter) deviceSettingFactoryBaseAdapter);
        b(this.k, this.g);
        this.k.setOnItemClickListener(this.f);
        this.w = (RelativeLayout) findViewById(R.id.progress_rlt);
    }

    private void r() {
        DeviceCapability deviceCapabilityE = this.h.e(this.i);
        this.j = deviceCapabilityE;
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportMusicControl()) {
            return;
        }
        LogUtil.a("MusicSecondaryMenuActivity", "Enter updateMusicState:", Boolean.valueOf(this.v.e()));
        if (!this.v.e()) {
            d(b(), 34).b(false);
            lzl.a(this.e).c(false, true);
            LogUtil.a("MusicSecondaryMenuActivity", "end updateMusicState");
        } else {
            boolean zD = lzl.a(this.e).d();
            d(b(), 34).b(zD);
            lzl.a(this.e).c(zD, false);
        }
    }

    private void c() {
        DeviceInfo deviceInfo = this.f26201a;
        if (deviceInfo != null) {
            this.l = deviceInfo.getDeviceConnectState() == 2;
            LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter onCreateView mIsConnected:", Boolean.valueOf(this.l), " state:", Integer.valueOf(this.f26201a.getDeviceConnectState()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "notifyUpdateSettingList() mGeneralAdapter is ", b());
        DeviceSettingFactoryBaseAdapter deviceSettingFactoryBaseAdapter = this.g;
        if (deviceSettingFactoryBaseAdapter != null) {
            deviceSettingFactoryBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.u.a(this.r);
    }

    private Handler a() {
        return this.p;
    }

    static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MusicSecondaryMenuActivity> f26206a;

        a(Looper looper, MusicSecondaryMenuActivity musicSecondaryMenuActivity) {
            super(looper);
            this.f26206a = new WeakReference<>(musicSecondaryMenuActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            MusicSecondaryMenuActivity musicSecondaryMenuActivity = this.f26206a.get();
            if (musicSecondaryMenuActivity != null) {
                LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "WeakHandler msg.what:", Integer.valueOf(message.what));
                if (message.what == 1019) {
                    musicSecondaryMenuActivity.i();
                    return;
                } else {
                    LogUtil.j("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "WeakHandler default");
                    return;
                }
            }
            LogUtil.j("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "WeakHandler null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter weakRunnableRun");
        d();
    }

    private void d() {
        k();
        Handler handler = this.p;
        if (handler != null) {
            handler.sendEmptyMessage(1017);
        }
    }

    private void k() {
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter startMessageNotificationObserver!");
        tfp tfpVarE = tfp.e();
        this.u = tfpVarE;
        if (tfpVarE != null) {
            tfpVarE.d(this.x);
            this.u.a(this.r);
            LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "startMessageNotificationObserver getMessageTotalList");
            this.u.a();
        } else {
            LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "startMessageNotificationObserver enter null");
        }
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Leave startMessageNotificationObserver!");
    }

    static class c implements Runnable {
        private final WeakReference<MusicSecondaryMenuActivity> e;

        @Override // java.lang.Runnable
        public void run() {
        }

        c(MusicSecondaryMenuActivity musicSecondaryMenuActivity) {
            this.e = new WeakReference<>(musicSecondaryMenuActivity);
        }

        public MusicSecondaryMenuActivity b() {
            return this.e.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "Enter refreshSettingData() mIsConnected:", Boolean.valueOf(this.l));
        if (f()) {
            LogUtil.a("MusicSecondaryMenuActivity", "mDeviceCapability is null, refreshSettingData return!");
        } else {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rfq d(List<rfq> list, int i) {
        rfq rfqVar = new rfq();
        for (rfq rfqVar2 : list) {
            if (rfqVar2.b() == i) {
                LogUtil.a("MusicSecondaryMenu", 0, "MusicSecondaryMenuActivity", "getItem getId is ", Integer.valueOf(rfqVar2.b()));
                rfqVar = rfqVar2;
            }
        }
        return rfqVar;
    }

    private void n() {
        if (this.j.isSupportMusicInfoList()) {
            c(this.l, new thh(0, 111, 8), new thf(getString(R.string.IDS_hw_health_music_management), getString(R.string.IDS_hw_health_music_watch_music_management), ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
        if (this.j.isSupportMusicControl()) {
            String string = getString(R.string.IDS_hw_health_music_watch_control);
            if (qrs.ah(BaseApplication.getContext())) {
                string = getString(R.string.IDS_pad_music_watch_control);
            }
            c(this.l, new thh(0, 34, 9), new thf(string, "", ""), this.s);
            d(b(), 34).b(lzl.a(this.e).d());
        }
    }

    private void c(boolean z, thh thhVar, thf thfVar, CompoundButton.OnCheckedChangeListener... onCheckedChangeListenerArr) {
        synchronized (this.f26203c) {
            b().add(thi.e(z, thhVar, thfVar, onCheckedChangeListenerArr));
        }
    }

    private boolean f() {
        this.j = this.h.e(this.i);
        b().clear();
        b(this.k, this.g);
        g();
        if (this.j == null) {
            LogUtil.a("MusicSecondaryMenuActivity", "refreshSettingInit mDeviceCapability is null");
            return true;
        }
        this.f26201a = tfn.a().e(this.i);
        l();
        return false;
    }

    private void b(ListView listView, DeviceSettingFactoryBaseAdapter deviceSettingFactoryBaseAdapter) {
        if (listView == null || deviceSettingFactoryBaseAdapter == null) {
            return;
        }
        int measuredHeight = 0;
        for (int i = 0; i < deviceSettingFactoryBaseAdapter.getCount(); i++) {
            View view = deviceSettingFactoryBaseAdapter.getView(i, null, listView);
            if (view != null) {
                view.measure(0, 0);
                measuredHeight += view.getMeasuredHeight();
            }
        }
        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = measuredHeight + (listView.getDividerHeight() * (deviceSettingFactoryBaseAdapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }

    private void l() {
        DeviceInfo deviceInfo = this.f26201a;
        if (deviceInfo != null) {
            this.i = deviceInfo.getDeviceIdentify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("MusicSecondaryMenuActivity", "enter noPermissionDialog");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getString(com.huawei.ui.device.R.string.IDS_sync_music_no_authorization)).c(com.huawei.ui.device.R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: tfx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSecondaryMenuActivity.a(view);
            }
        });
        builder.c().show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
