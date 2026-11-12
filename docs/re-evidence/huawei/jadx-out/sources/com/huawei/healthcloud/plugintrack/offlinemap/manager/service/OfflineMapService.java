package com.huawei.healthcloud.plugintrack.offlinemap.manager.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.CityListBean;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineMapCityList;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.iyb;
import defpackage.jcd;
import defpackage.jcg;
import defpackage.lmf;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineMapService extends Service implements OfflineMapManager.OfflineMapDownloadListener, OfflineMapManager.OfflineLoadedListener {
    private a f;
    private SharedPreferences p;
    private ExecutorService q;
    private String l = "北京";
    private ArrayList<String> k = new ArrayList<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OfflineMapManager f10513c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10511a = null;
    private final IBinder d = new ServiceBinder();
    private BroadcastReceiver e = new c(this);
    private e r = null;
    private ArrayList<OfflineMapCity> n = new ArrayList<>(10);
    private List<String> s = Collections.synchronizedList(new ArrayList(10));
    private boolean i = false;
    private boolean h = false;
    private boolean o = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExternalStatus f10512b = ExternalStatus.INVALID;
    private boolean g = false;
    private boolean m = false;
    private boolean j = true;

    public enum ExternalStatus {
        OFFLINE_ACTIVITY_DESTROY,
        OFFLINE_ACTIVITY_EXIT,
        MAIN_ACTIVITY_CREATE,
        INVALID
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a("OfflineMapService", "onBind()");
        return this.d;
    }

    public class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        public OfflineMapService getService() {
            return OfflineMapService.this;
        }
    }

    static class a extends BaseHandler<OfflineMapService> {
        a(OfflineMapService offlineMapService) {
            super(offlineMapService);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OfflineMapService offlineMapService, Message message) {
            if (offlineMapService == null || message == null) {
                return;
            }
            Object obj = message.obj;
            switch (message.what) {
                case 101:
                    c(offlineMapService, message);
                    break;
                case 102:
                    e(offlineMapService, obj);
                    break;
                case 103:
                    b(offlineMapService, obj);
                    break;
                case 104:
                    c(offlineMapService, obj);
                    break;
                case 106:
                    a(offlineMapService, obj);
                    break;
                case 107:
                    LogUtil.d("OfflineMapService", "RECEIVE_DESTROY_SERVICE11=", 107);
                    offlineMapService.stopSelf();
                    break;
                case 108:
                    offlineMapService.o = false;
                    offlineMapService.f10512b = ExternalStatus.OFFLINE_ACTIVITY_DESTROY;
                    offlineMapService.o();
                    break;
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                    offlineMapService.h();
                    break;
            }
        }

        private void a(OfflineMapService offlineMapService, Object obj) {
            if (!(obj instanceof Intent)) {
                LogUtil.e("OfflineMapService", "DownLoadHandler RECEIVE_WAIT_CITY obj is not intent");
            } else {
                offlineMapService.o = false;
                offlineMapService.j(((Intent) obj).getStringExtra("TAG_ONE_CITY_STRING_AS"));
            }
        }

        private void c(OfflineMapService offlineMapService, Object obj) {
            if (obj instanceof Intent) {
                String stringExtra = ((Intent) obj).getStringExtra("TAG_ONE_CITY_STRING_AS");
                if (stringExtra != null) {
                    offlineMapService.k(stringExtra);
                    return;
                }
                return;
            }
            LogUtil.e("OfflineMapService", "DownLoadHandler RECEIVE_UPDATE_CITY obj is not intent");
        }

        private void b(OfflineMapService offlineMapService, Object obj) {
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                String stringExtra = intent.getStringExtra("TAG_ONE_CITY_STRING_AS");
                boolean booleanExtra = intent.getBooleanExtra("TAG_BOOLEAN_ISRESTART_AS", false);
                offlineMapService.e(stringExtra);
                if (booleanExtra) {
                    offlineMapService.d((ArrayList<OfflineMapCity>) offlineMapService.n);
                    return;
                }
                return;
            }
            LogUtil.e("OfflineMapService", "DownLoadHandler RECEIVE_DELETE_CITY obj is not intent");
        }

        private void e(OfflineMapService offlineMapService, Object obj) {
            if (!(obj instanceof Intent)) {
                LogUtil.e("OfflineMapService", "DownLoadHandler MSG_RECEIVE_LOAD_CITY obj is not intent");
            } else {
                offlineMapService.d(((Intent) obj).getStringExtra("TAG_ONE_CITY_STRING_AS"));
                offlineMapService.j();
            }
        }

        private void c(OfflineMapService offlineMapService, Message message) {
            Bundle data = message.getData();
            if (data == null) {
                LogUtil.j("OfflineMapService", "DownLoadHandler MSG_GET_DATA_SUCCESS bundle is null");
                return;
            }
            String string = data.getString("TAG_MSG_SEND_INTENT");
            Parcelable parcelable = data.getParcelable("TAG_MSG_SEND_LIST");
            if (parcelable instanceof OfflineMapCityList) {
                offlineMapService.b(string, (OfflineMapCityList) parcelable);
            }
            if (data.getBoolean("TAG_IS_CHECK_UPDATE")) {
                LogUtil.a("OfflineMapService", "DownLoadHandler MSG_GET_DATA_SUCCESS mIsInitActivity OK");
                offlineMapService.i = true;
                offlineMapService.o = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LogUtil.a("OfflineMapService", "resetManager: ");
        a aVar = this.f;
        if (aVar != null) {
            aVar.removeMessages(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        }
        if (!this.j) {
            LogUtil.a("OfflineMapService", "resetManager: Manager VerifyCompleted");
            return;
        }
        LogUtil.a("OfflineMapService", "resetManager: reset Manager ");
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this, this);
            this.f10513c = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e2) {
            LogUtil.j("OfflineMapService", "resetManager: ", LogAnonymous.b(e2));
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        LogUtil.a("OfflineMapService", "onCreate()");
        super.onCreate();
        this.f10511a = getApplicationContext();
        this.f = new a(this);
        this.q = Executors.newFixedThreadPool(4);
        MapsInitializer.updatePrivacyShow(this.f10511a, true, true);
        MapsInitializer.updatePrivacyAgree(this.f10511a, true);
        i();
    }

    private void i() {
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this, this);
            this.f10513c = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e2) {
            LogUtil.j("OfflineMapService", "initFirst: ", LogAnonymous.b(e2));
        }
        if (this.f != null) {
            LogUtil.a("OfflineMapService", "initFirst: Delayed send RESET_OFFLINE_MANAGER ");
            this.f.sendEmptyMessageDelayed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 5000L);
        }
        this.p = getSharedPreferences("TAG_SAVE_LOCAL_CITY_CODE", 0);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this, (Class<?>) OfflineMapTabActivity.class));
        intent.setFlags(270532608);
        f();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("OfflineMapService", "onStartCommand()");
        if (intent == null) {
            LogUtil.j("OfflineMapService", "handleIntent() intent null");
            return 2;
        }
        if (!this.j) {
            d(intent);
        } else if (this.f != null) {
            LogUtil.a("OfflineMapService", "onStartCommand: Delayed send RESET_OFFLINE_MANAGER ");
            this.f.removeMessages(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
            this.f.sendEmptyMessageDelayed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 5000L);
        }
        return 2;
    }

    private void d(Intent intent) {
        this.i = false;
        if (this.p == null) {
            this.p = getSharedPreferences("TAG_SAVE_LOCAL_CITY_CODE", 0);
        }
        String string = this.p.getString("TAG_SAVE_LOCAL_CITY_CODE", "");
        ArrayList<String> arrayListA = a(this.p.getString("TAG_SAVE_LOADING_ERROR_CITY", ""));
        this.k = arrayListA;
        LogUtil.d("OfflineMapService", "onStartCommand city", arrayListA.toString());
        if (!TextUtils.isEmpty(string) && !Constants.NULL.equals(string)) {
            LogUtil.d("OfflineMapService", "onStartCommand() mLocalCode = code");
            this.l = string;
        }
        a(intent);
        g();
    }

    private void a(Intent intent) {
        if (intent == null) {
            LogUtil.j("OfflineMapService", "handleIntent() intent null");
            return;
        }
        String action = intent.getAction();
        LogUtil.a("OfflineMapService", "handleIntent() action: ", action);
        if (jcg.e(this.f10511a)) {
            this.m = true;
        }
        if (action != null && action.equals("ACTION_OFFLINE_MAP_ACTIVTY_START_AS")) {
            this.f10512b = ExternalStatus.OFFLINE_ACTIVITY_EXIT;
            b();
        } else {
            if (action == null || !action.equals("ACTION_MAIN_ACTIVITY_START_AS")) {
                return;
            }
            this.o = false;
            this.f10512b = ExternalStatus.MAIN_ACTIVITY_CREATE;
            o();
        }
    }

    private void c(final String str, final boolean z) {
        LogUtil.d("OfflineMapService", "getAllData() intent:", str, ",isCheckUpdate:", Boolean.valueOf(z));
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(3);
        }
        this.q.execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayListD = OfflineMapService.this.d();
                OfflineMapService offlineMapService = OfflineMapService.this;
                OfflineMapCityList offlineMapCityListB = offlineMapService.b((ArrayList<OfflineMapProvince>) arrayListD, (List<String>) offlineMapService.s);
                Message messageObtainMessage = OfflineMapService.this.f.obtainMessage();
                messageObtainMessage.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("TAG_MSG_SEND_INTENT", str);
                bundle.putParcelable("TAG_MSG_SEND_LIST", offlineMapCityListB);
                bundle.putBoolean("TAG_IS_CHECK_UPDATE", z);
                messageObtainMessage.setData(bundle);
                OfflineMapService.this.f.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<OfflineMapCity> b(ArrayList<OfflineMapProvince> arrayList) {
        int state;
        ArrayList<OfflineMapCity> arrayList2 = new ArrayList<>(10);
        Iterator<OfflineMapProvince> it = arrayList.iterator();
        while (it.hasNext()) {
            for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                if (offlineMapCity != null && ((state = offlineMapCity.getState()) == 0 || state == 1 || state == 2)) {
                    arrayList2.add(offlineMapCity);
                }
            }
        }
        LogUtil.d("OfflineMapService", "getDownloadingCityList() finish mLoadingCityList:", Integer.valueOf(arrayList2.size()));
        this.n = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<OfflineMapProvince> d() {
        OfflineMapManager offlineMapManager = this.f10513c;
        if (offlineMapManager == null) {
            LogUtil.j("OfflineMapService", "getProvinceList: offline manager is null");
            return new ArrayList<>();
        }
        return offlineMapManager.getOfflineMapProvinceList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OfflineMapCityList b(ArrayList<OfflineMapProvince> arrayList, List<String> list) {
        d dVarJ = new d(arrayList, list).j();
        HashMap<Integer, CityListBean> mapC = dVarJ.c();
        ArrayList<OfflineMapProvince> arrayListD = dVarJ.d();
        this.m = false;
        a(arrayList, arrayListD);
        mapC.put(0, dVarJ.f());
        mapC.put(1, dVarJ.e());
        mapC.put(2, dVarJ.a());
        OfflineMapCityList offlineMapCityList = new OfflineMapCityList();
        offlineMapCityList.setCityMap(mapC);
        ArrayList<OfflineMapCity> arrayListI = dVarJ.i();
        ArrayList<OfflineMapCity> arrayListB = dVarJ.b();
        this.n = arrayListI;
        offlineMapCityList.setLoadingCityList(arrayListI);
        offlineMapCityList.setDownCityList(arrayListB);
        offlineMapCityList.setProvinceList(arrayList);
        LogUtil.a("OfflineMapService", "getOfflineMapCityList() finish mProvinceList:", Integer.valueOf(arrayList.size()), ",mCityMap:", Integer.valueOf(mapC.size()), ",mLoadingCityList:", Integer.valueOf(arrayListI.size()), ",mDownCityList:", Integer.valueOf(arrayListB.size()));
        return offlineMapCityList;
    }

    private void a(ArrayList<OfflineMapProvince> arrayList, ArrayList<OfflineMapProvince> arrayList2) {
        OfflineMapProvince offlineMapProvince = new OfflineMapProvince();
        offlineMapProvince.setProvinceName("概要图");
        arrayList.add(0, offlineMapProvince);
        OfflineMapProvince offlineMapProvince2 = new OfflineMapProvince();
        offlineMapProvince2.setProvinceName("直辖市");
        arrayList.add(1, offlineMapProvince2);
        OfflineMapProvince offlineMapProvince3 = new OfflineMapProvince();
        offlineMapProvince3.setProvinceName("港澳");
        arrayList.add(2, offlineMapProvince3);
        arrayList.removeAll(arrayList2);
        OfflineMapProvince offlineMapProvince4 = new OfflineMapProvince();
        offlineMapProvince4.setProvinceName("台湾省");
        arrayList.add(offlineMapProvince4);
    }

    @Override // android.app.Service
    public void onDestroy() {
        LogUtil.a("OfflineMapService", "onDestroy()");
        super.onDestroy();
        OfflineMapManager offlineMapManager = this.f10513c;
        if (offlineMapManager != null) {
            offlineMapManager.destroy();
        }
        iyb.a(this.f10511a, this.e);
        e eVar = this.r;
        if (eVar != null) {
            unregisterReceiver(eVar);
        }
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.shutdown();
            this.q = null;
        }
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(3);
        }
        this.q.execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.5
            @Override // java.lang.Runnable
            public void run() {
                boolean zE = OfflineMapService.this.e((ArrayList<OfflineMapCity>) OfflineMapService.this.b((ArrayList<OfflineMapProvince>) OfflineMapService.this.d()));
                boolean zE2 = jcd.e(OfflineMapService.this.f10511a, OfflineMapTabActivity.class.getName());
                LogUtil.a("OfflineMapService", "startStopServiceThread() mExternalStatus : ", OfflineMapService.this.f10512b, " ,isLoading : ", Boolean.valueOf(zE), " ,isTopActivity : ", Boolean.valueOf(zE2));
                if (zE2) {
                    OfflineMapService.this.o = true;
                } else {
                    if (zE || OfflineMapService.this.f10512b == ExternalStatus.OFFLINE_ACTIVITY_EXIT) {
                        return;
                    }
                    OfflineMapService.this.f.sendEmptyMessage(107);
                }
            }
        });
    }

    private void g() {
        if (this.h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        this.r = new e(this);
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.r, intentFilter);
        this.h = true;
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACITON_ACTIVITY_LOAD_CITY_AS");
        intentFilter.addAction("ACITON_ACTIVITY_DELETE_CITY_AS");
        intentFilter.addAction("ACITON_ACTIVITY_WAIT_CITY_AS");
        intentFilter.addAction("ACTION_ACTIVITY_PAUSE_CITY_AS");
        intentFilter.addAction("ACTION_ACITITY_DESTROY_AS");
        intentFilter.addAction("ACTION_SPORT_START_DESTROY_SERVICE_AS");
        intentFilter.addAction("ACTION_MAP_ONCHRCKUPDATE_AS");
        iyb.d(this.f10511a, this.e, intentFilter);
        LogUtil.a("OfflineMapService", "registerMyBroadcast: completed");
    }

    static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<OfflineMapService> f10528a;

        e(OfflineMapService offlineMapService) {
            this.f10528a = new WeakReference<>(offlineMapService);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("OfflineMapService", "NetWorkBroadcastReceiver onReceive() intent null");
                return;
            }
            if (context == null) {
                LogUtil.j("OfflineMapService", "NetWorkBroadcastReceiver onReceive() context null");
                return;
            }
            OfflineMapService offlineMapService = this.f10528a.get();
            if (offlineMapService == null) {
                LogUtil.j("OfflineMapService", "NetWorkBroadcastReceiver onReceive() service null");
                return;
            }
            if (offlineMapService.f10513c == null) {
                LogUtil.j("OfflineMapService", "onReceive: offline manager is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("OfflineMapService", "NetWorkBroadcastReceiver onReceive() action = ", action);
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                if (jcg.e(context)) {
                    LogUtil.a("OfflineMapService", "NetWorkBroadcastReceiver onReceive() network is wifi");
                    for (OfflineMapCity offlineMapCity : offlineMapService.n) {
                        if (offlineMapCity.getState() != 3) {
                            offlineMapService.d(offlineMapCity.getCity());
                        }
                    }
                    return;
                }
                if (jcg.c(context)) {
                    LogUtil.a("OfflineMapService", "NetWorkBroadcastReceiver onReceive() network is not wifi");
                    Iterator it = offlineMapService.n.iterator();
                    while (it.hasNext()) {
                        if (((OfflineMapCity) it.next()).getState() == 0) {
                            LogUtil.a("OfflineMapService", "NetWorkBroadcastReceiver onReceive() network is not wifi pause loading");
                            offlineMapService.f10513c.pause();
                            offlineMapService.b(R.string.IDS_motiontrack_offlinemap_service_net_change);
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("OfflineMapService", "NetWorkBroadcastReceiver onReceive() no network");
            }
        }
    }

    static class c extends BroadcastReceiver {
        private final WeakReference<OfflineMapService> e;

        c(OfflineMapService offlineMapService) {
            this.e = new WeakReference<>(offlineMapService);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("OfflineMapService", "MyBroadcastReceiver onReceive() intent null");
                return;
            }
            OfflineMapService offlineMapService = this.e.get();
            if (offlineMapService == null) {
                LogUtil.j("OfflineMapService", "MyBroadcastReceiver onReceive() service null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("OfflineMapService", "MyBroadcastReceiver onReceive() action: ", action);
            if (!"ACITON_ACTIVITY_LOAD_CITY_AS".equals(action)) {
                if (!"ACITON_ACTIVITY_DELETE_CITY_AS".equals(action)) {
                    if (!"ACTION_ACTIVITY_PAUSE_CITY_AS".equals(action)) {
                        if (!"ACITON_ACTIVITY_WAIT_CITY_AS".equals(action)) {
                            if (!"ACTION_ACITITY_DESTROY_AS".equals(action)) {
                                if (!"ACTION_SPORT_START_DESTROY_SERVICE_AS".equals(action)) {
                                    if ("ACTION_MAP_ONCHRCKUPDATE_AS".equals(action)) {
                                        offlineMapService.f.sendMessage(offlineMapService.f.obtainMessage(104, 0, 0, intent));
                                        return;
                                    }
                                    return;
                                }
                                offlineMapService.f10512b = ExternalStatus.INVALID;
                                offlineMapService.f.sendEmptyMessage(107);
                                return;
                            }
                            offlineMapService.f.sendEmptyMessage(108);
                            return;
                        }
                        offlineMapService.f.sendMessage(offlineMapService.f.obtainMessage(106, 0, 0, intent));
                        return;
                    }
                    offlineMapService.f.sendMessage(offlineMapService.f.obtainMessage(105, 0, 0, intent));
                    return;
                }
                offlineMapService.f.sendMessage(offlineMapService.f.obtainMessage(103, 0, 0, intent));
                return;
            }
            offlineMapService.f.sendMessage(offlineMapService.f.obtainMessage(102, 0, 0, intent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onDownload(int i, int i2, String str) {
        LogUtil.a("OfflineMapService", "onDownload() ", "state:", Integer.valueOf(i), ", complete:", Integer.valueOf(i2));
        if (this.g) {
            LogUtil.a("OfflineMapService", "onDownload() Service is destroy");
            return;
        }
        if (i == -1) {
            g(str);
            i(str);
            e();
        } else if (i == 0) {
            i(str);
        } else if (i == 3) {
            e();
        } else if (i == 4) {
            h(str);
        } else if (i == 5) {
            e();
        } else if (i == 6) {
            c(str);
            f(str);
        } else if (i == 10 || i == 1002) {
            e();
        } else {
            switch (i) {
                case 101:
                    i(str);
                    b(R.string.IDS_motiontrack_offlinemap_download_network_error);
                    e();
                    break;
                case 102:
                    m(str);
                    e();
                    break;
                case 103:
                    a();
                    i(str);
                    e();
                    break;
            }
        }
        if (this.i && this.o) {
            c();
        }
    }

    private void c(String str) {
        if (this.k.contains(str)) {
            LogUtil.a("OfflineMapService", "onRemove loadErrorCity=null");
            d(this.n);
        }
    }

    private void m(String str) {
        o(String.format(getString(R.string.IDS_motiontrack_offlinemap_service_show_amap_error), str));
    }

    private void g(String str) {
        o(String.format(getString(R.string.IDS_motiontrack_offlinemap_service_download_error), str));
    }

    private void h(String str) {
        if (this.f10513c == null) {
            LogUtil.j("OfflineMapService", "offlineMapDownSuccess: offline is null");
            return;
        }
        LogUtil.a("OfflineMapService", "onDownload SUCCESS");
        if (this.k.contains(str)) {
            b(str);
        }
        f(str);
        if (!jcg.e(this.f10511a)) {
            LogUtil.a("OfflineMapService", "onDownload SUCCESS is no wifi manager pause");
            this.f10513c.pause();
        }
        e();
    }

    private void e() {
        if (jcd.e(this.f10511a, OfflineMapTabActivity.class.getName())) {
            return;
        }
        o();
    }

    private void a() {
        long usableSpace;
        try {
            usableSpace = CommonUtil.f(this.f10511a).getUsableSpace();
        } catch (SecurityException unused) {
            LogUtil.e("OfflineMapService", "getUsableSpace error");
            usableSpace = -1;
        }
        if (usableSpace < 0 || (usableSpace / 1024.0f) / 1024.0f > 10.0f) {
            b(R.string.IDS_hwh_motiontrack_offlinemap_error_toast);
        } else {
            b(R.string.IDS_motiontrack_offlinemap_download_storage_error);
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onCheckUpdate(boolean z, String str) {
        LogUtil.a("OfflineMapService", "onCheckUpdate() isNew:", Boolean.valueOf(z));
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onRemove(boolean z, String str, String str2) {
        LogUtil.a("OfflineMapService", "onRemove() success:", Boolean.valueOf(z), " status:", str2);
        if (this.g) {
            LogUtil.a("OfflineMapService", "onDownload() Service is destroy");
            return;
        }
        if (z) {
            o(String.format(getString(R.string.IDS_motiontrack_offlinemap_service_delete_ok), str));
            if (this.k.contains(str)) {
                LogUtil.a("OfflineMapService", "onRemove loadErrorCity=null");
                b(str);
                d(this.n);
            }
            f(str);
        } else {
            o(String.format(getString(R.string.IDS_motiontrack_offlinemap_service_delete_fail), str));
        }
        if (this.i && this.o) {
            n();
        }
    }

    private void f(String str) {
        LogUtil.d("OfflineMapService", "removeUpdateListCity city:", str);
        for (int i = 0; i < this.s.size(); i++) {
            if (str.equals(this.s.get(i))) {
                LogUtil.d("OfflineMapService", "removeUpdateListCity equals remove : ", Integer.valueOf(i));
                this.s.remove(i);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        b(str);
        LogUtil.a("OfflineMapService", "deleteCity()");
        if (str == null) {
            LogUtil.j("OfflineMapService", "deleteCity() city is null");
            return;
        }
        if (Constants.NULL.equals(str) || str.isEmpty()) {
            LogUtil.j("OfflineMapService", "deleteCity() city is null");
            return;
        }
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(3);
        }
        this.q.execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.2
            @Override // java.lang.Runnable
            public void run() {
                if (OfflineMapService.this.f10513c == null) {
                    LogUtil.j("OfflineMapService", "run: offline manager is null");
                } else {
                    OfflineMapService.this.f10513c.remove(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final String str) {
        LogUtil.a("OfflineMapService", "loadWaitThread()");
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(3);
        }
        this.q.execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.4
            @Override // java.lang.Runnable
            public void run() {
                OfflineMapService offlineMapService = OfflineMapService.this;
                List listA = offlineMapService.a(offlineMapService.n);
                OfflineMapService.this.l();
                OfflineMapService.this.d(str);
                OfflineMapService.this.a((List<String>) listA, str);
                OfflineMapService.this.m();
            }
        });
    }

    private void c() {
        c("ACTION_MAP_ONDOWNLOAD_SA", false);
    }

    private void b() {
        LogUtil.a("OfflineMapService", "initActivity()");
        this.s.clear();
        c("ACTION_INIT_ACTIVITY_SA", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        c("ACTION_REFRESH_ACTIVITY_SA", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.a("OfflineMapService", "updateWait()");
        OfflineMapCityList offlineMapCityListB = b(d(), this.s);
        Message messageObtainMessage = this.f.obtainMessage();
        messageObtainMessage.what = 101;
        Bundle bundle = new Bundle();
        bundle.putString("TAG_MSG_SEND_INTENT", "ACTION_MAP_LOAD_WAIT_SUCCESS_SA");
        bundle.putParcelable("TAG_MSG_SEND_LIST", offlineMapCityListB);
        messageObtainMessage.setData(bundle);
        this.f.sendMessage(messageObtainMessage);
    }

    private void n() {
        LogUtil.a("OfflineMapService", "updateDelete()");
        c("ACTION_MAP_ONREMOVE_SA", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f10513c == null) {
            LogUtil.j("OfflineMapService", "loadCity: offline manager is null");
            return;
        }
        if (str == null) {
            LogUtil.j("OfflineMapService", "loadCity() city is null");
            d(this.n);
            return;
        }
        if (Constants.NULL.equals(str) || str.isEmpty()) {
            LogUtil.j("OfflineMapService", "loadCity() city is null");
            d(this.n);
            return;
        }
        OfflineMapCity itemByCityName = this.f10513c.getItemByCityName(str);
        if (itemByCityName == null) {
            LogUtil.j("OfflineMapService", "City : ", str, "not exist");
            return;
        }
        if (itemByCityName.getState() == 0) {
            LogUtil.a("OfflineMapService", "loadCity() city is loading");
            return;
        }
        try {
            HashMap map = new HashMap(16);
            map.put("click", 1);
            map.put(DistrictSearchQuery.KEYWORDS_CITY, str);
            lmf.d().c(this.f10511a, AnalyticsValue.HEALTH_MINE_SETTINGS_OFFINE_MAP_DOWNLOAD_2040017.value(), map, 0);
            this.f10513c.downloadByCityName(str);
            LogUtil.a("OfflineMapService", "loadCity() finish");
        } catch (AMapException e2) {
            String errorMessage = e2.getErrorMessage();
            LogUtil.e("OfflineMapService", errorMessage);
            o(errorMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<OfflineMapCity> arrayList) {
        if (this.f10513c == null) {
            LogUtil.j("OfflineMapService", "restart: offline manager is null");
            return;
        }
        int size = arrayList.size();
        LogUtil.a("OfflineMapService", "loadWaitCity() mLoadingCityList:", Integer.valueOf(size));
        if (size <= 0) {
            this.f10513c.restart();
            return;
        }
        for (OfflineMapCity offlineMapCity : arrayList) {
            if (offlineMapCity != null) {
                int state = offlineMapCity.getState();
                String city = offlineMapCity.getCity();
                if (state == 2) {
                    d(city);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list, String str) {
        LogUtil.a("OfflineMapService", "loadWaitingCity() list:", Integer.valueOf(list.size()));
        for (String str2 : list) {
            if (!str2.equals(str)) {
                d(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> a(List<OfflineMapCity> list) {
        LogUtil.a("OfflineMapService", "getWaitCityList() list:", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(10);
        for (OfflineMapCity offlineMapCity : list) {
            String city = offlineMapCity.getCity();
            if (offlineMapCity.getState() == 2 || offlineMapCity.getState() == 0) {
                arrayList.add(city);
            }
        }
        LogUtil.a("OfflineMapService", "getWaitCityList() waitList:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f10513c == null) {
            LogUtil.j("OfflineMapService", "stopLoadingCity: offline manager is null");
        } else {
            LogUtil.a("OfflineMapService", "stopLoadingCity()");
            this.f10513c.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        f(str);
        d(str);
    }

    private void o(final String str) {
        LogUtil.a("OfflineMapService", "toastMessage() message", str);
        a aVar = this.f;
        if (aVar == null) {
            LogUtil.j("OfflineMapService", "toastMessage() mHandler null");
        } else {
            aVar.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.3
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(OfflineMapService.this.f10511a, str, 1).show();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        LogUtil.a("OfflineMapService", "toastMessage() message", Integer.valueOf(i));
        a aVar = this.f;
        if (aVar == null) {
            LogUtil.j("OfflineMapService", "toastMessage() mHandler null");
        } else {
            aVar.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.10
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(OfflineMapService.this.f10511a, i, 1).show();
                }
            });
        }
    }

    private void i(String str) {
        StringBuilder sb = new StringBuilder(16);
        if (!this.k.contains(str)) {
            this.k.add(str);
        }
        Iterator<String> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("|");
        }
        sb.append(str);
        if (this.p == null) {
            this.p = getSharedPreferences("TAG_SAVE_LOCAL_CITY_CODE", 0);
        }
        SharedPreferences.Editor editorEdit = this.p.edit();
        editorEdit.putString("TAG_SAVE_LOADING_ERROR_CITY", sb.toString());
        editorEdit.commit();
    }

    private void b(String str) {
        StringBuilder sb = new StringBuilder(16);
        if (str == null) {
            return;
        }
        if (this.k.contains(str)) {
            this.k.remove(str);
        }
        Iterator<String> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("|");
        }
        if (this.p == null) {
            this.p = getSharedPreferences("TAG_SAVE_LOCAL_CITY_CODE", 0);
        }
        SharedPreferences.Editor editorEdit = this.p.edit();
        editorEdit.putString("TAG_SAVE_LOADING_ERROR_CITY", sb.toString());
        editorEdit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, OfflineMapCityList offlineMapCityList) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("OfflineMapService", "sendDataToActivity() action is empty");
            return;
        }
        LogUtil.a("OfflineMapService", "sendDataToActivity() action:", str);
        Intent intent = new Intent(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("TAG_ALL_CITY_LIST_SA", offlineMapCityList);
        intent.putExtras(bundle);
        if ("ACTION_MAP_LOAD_WAIT_SUCCESS_SA".equals(str)) {
            this.o = true;
        }
        iyb.e(this.f10511a, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(ArrayList<OfflineMapCity> arrayList) {
        int size = arrayList.size();
        LogUtil.a("OfflineMapService", "isLoading() size:", Integer.valueOf(size));
        if (size > 0) {
            return true;
        }
        LogUtil.a("OfflineMapService", "mLoadingCityList.size()=0");
        return false;
    }

    private ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("\\|")) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public void onVerifyComplete() {
        LogUtil.a("OfflineMapService", "onVerifyComplete: ");
        this.j = false;
        d(new Intent("ACTION_OFFLINE_MAP_ACTIVTY_START_AS"));
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<OfflineMapCity> f10525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<OfflineMapProvince> f10526b;
        private CityListBean d;
        private HashMap<Integer, CityListBean> e;
        private CityListBean f;
        private List<String> g;
        private ArrayList<OfflineMapCity> h;
        private ArrayList<OfflineMapProvince> i;
        private CityListBean j;

        d(ArrayList<OfflineMapProvince> arrayList, List<String> list) {
            this.i = arrayList;
            this.g = list;
        }

        public HashMap<Integer, CityListBean> c() {
            return this.e;
        }

        public ArrayList<OfflineMapProvince> d() {
            return this.f10526b;
        }

        public CityListBean e() {
            return this.d;
        }

        public CityListBean a() {
            return this.j;
        }

        public CityListBean f() {
            return this.f;
        }

        public ArrayList<OfflineMapCity> b() {
            return this.f10525a;
        }

        public ArrayList<OfflineMapCity> i() {
            return this.h;
        }

        public d j() {
            LogUtil.a("OfflineMapService", "getOfflineMapCityList() enter mProvinceList:", Integer.valueOf(this.i.size()));
            this.e = new HashMap<>(16);
            this.f10526b = new ArrayList<>(10);
            this.d = new CityListBean();
            this.j = new CityListBean();
            this.f = new CityListBean();
            this.f10525a = new ArrayList<>(10);
            this.h = new ArrayList<>(10);
            for (int i = 0; i < this.i.size(); i++) {
                OfflineMapProvince offlineMapProvince = this.i.get(i);
                CityListBean cityListBean = new CityListBean();
                e(offlineMapProvince, cityListBean);
                this.e.put(Integer.valueOf(i + 3), cityListBean);
            }
            return this;
        }

        private void e(OfflineMapProvince offlineMapProvince, CityListBean cityListBean) {
            for (OfflineMapCity offlineMapCity : offlineMapProvince.getCityList()) {
                if (offlineMapCity != null) {
                    int state = offlineMapCity.getState();
                    String city = offlineMapCity.getCity();
                    a(offlineMapCity, state, city);
                    a(offlineMapProvince, cityListBean, offlineMapCity);
                    e(offlineMapCity, city);
                }
            }
            if (offlineMapProvince.getCityList().size() == 1) {
                this.f10526b.add(offlineMapProvince);
            }
        }

        private void a(OfflineMapProvince offlineMapProvince, CityListBean cityListBean, OfflineMapCity offlineMapCity) {
            if (offlineMapProvince.getCityList().size() != 1) {
                cityListBean.add(offlineMapCity);
            }
        }

        private void e(OfflineMapCity offlineMapCity, String str) {
            if (str.contains("香港") || str.contains("澳门")) {
                this.j.add(offlineMapCity);
            }
            if (str.contains("全国概要图")) {
                this.f.add(offlineMapCity);
            }
            if (str.contains("北京") || str.contains("上海")) {
                this.d.add(offlineMapCity);
            }
            if (str.contains("天津") || str.contains("重庆")) {
                this.d.add(offlineMapCity);
            }
        }

        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        private void a(com.amap.api.maps.offlinemap.OfflineMapCity r3, int r4, java.lang.String r5) {
            /*
                r2 = this;
                r0 = 7
                if (r4 == r0) goto L4c
                r0 = 10
                if (r4 == r0) goto L46
                java.lang.String r0 = "OfflineMapService"
                java.lang.String r1 = "offlineMapCity11=="
                switch(r4) {
                    case -1: goto L19;
                    case 0: goto L31;
                    case 1: goto L31;
                    case 2: goto L31;
                    case 3: goto L31;
                    case 4: goto L13;
                    case 5: goto L31;
                    default: goto Lf;
                }
            Lf:
                switch(r4) {
                    case 101: goto L31;
                    case 102: goto L31;
                    case 103: goto L31;
                    default: goto L12;
                }
            L12:
                return
            L13:
                java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r4 = r2.f10525a
                r4.add(r3)
                return
            L19:
                java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r4 = r2.h
                r4.add(r3)
                r2.e(r5)
                int r3 = r3.getState()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
                com.huawei.hwlogsmodel.LogUtil.d(r0, r3)
                return
            L31:
                java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r4 = r2.h
                r4.add(r3)
                int r3 = r3.getState()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
                com.huawei.hwlogsmodel.LogUtil.d(r0, r3)
                return
            L46:
                java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> r4 = r2.f10525a
                r4.add(r3)
                return
            L4c:
                java.util.List<java.lang.String> r3 = r2.g
                r3.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService.d.a(com.amap.api.maps.offlinemap.OfflineMapCity, int, java.lang.String):void");
        }

        private void e(String str) {
            if (OfflineMapService.this.m) {
                OfflineMapService.this.d(str);
            }
        }
    }
}
