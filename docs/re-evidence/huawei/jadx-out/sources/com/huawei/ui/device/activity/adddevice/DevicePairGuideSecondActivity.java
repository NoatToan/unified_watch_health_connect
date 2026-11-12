package com.huawei.ui.device.activity.adddevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.adapter.RightListAdapter;
import defpackage.edg;
import defpackage.edl;
import defpackage.edn;
import defpackage.edu;
import defpackage.edx;
import defpackage.eev;
import defpackage.lvi;
import defpackage.mfs;
import defpackage.njy;
import defpackage.pig;
import defpackage.pis;
import defpackage.piu;
import defpackage.qsp;
import defpackage.qtx;
import defpackage.rba;
import defpackage.rcv;
import defpackage.rej;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class DevicePairGuideSecondActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rcv f24139b;
    private CustomTitleBar d;
    private HealthRecycleView e;
    private LinearLayout h;
    private String j;
    private HealthProgressBar k;
    private LinearLayout l;
    private HealthTextView n;
    private RightListAdapter o;
    private qtx q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<rba> f24140c = new ArrayList(16);
    private List<String> t = new ArrayList(16);
    private Object p = null;
    private Map<String, String> m = new HashMap(16);
    private Map<String, edu> r = new HashMap(16);
    private List<String> g = new ArrayList(16);
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("DevicePairGuideSecondActivity", "NetBroadcastReceiver intent is null");
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    DevicePairGuideSecondActivity.this.o();
                    DevicePairGuideSecondActivity.this.n();
                } else {
                    LogUtil.d("DevicePairGuideSecondActivity", "net work is error");
                }
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.d("DevicePairGuideSecondActivity", "mPairBroadcastReceiver intent is null");
            } else if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("DevicePairGuideSecondActivity", "pair device success");
                if (DevicePairGuideSecondActivity.this.isFinishing()) {
                    return;
                }
                DevicePairGuideSecondActivity.this.finish();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24138a = this;
        setContentView(R.layout.activity_devic_pair_guide_sceond);
        this.q = new qtx();
        d();
        e();
    }

    private void d() {
        this.d = (CustomTitleBar) qsp.a(this, R.id.device_second_title);
        this.e = (HealthRecycleView) qsp.a(this, R.id.device_list);
        this.h = (LinearLayout) qsp.a(this, R.id.device_error_bad_layout);
        this.l = (LinearLayout) qsp.a(this, R.id.device_download_bad_layout);
        this.k = (HealthProgressBar) qsp.a(this, R.id.download_progress);
        this.n = (HealthTextView) qsp.a(this, R.id.resource_error);
        this.d.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DevicePairGuideSecondActivity.this.finish();
            }
        });
        mfs.c(this, -1);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.t = intent.getStringArrayListExtra(BasePairManagerJsApi.UUID_LIST);
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.c("DevicePairGuideSecondActivity", "get intent is ArrayIndexOutOfBoundsException");
            }
            this.j = intent.getStringExtra("kind_id");
            Serializable serializableExtra = intent.getSerializableExtra("pair_guide_array");
            if (serializableExtra instanceof Map) {
                this.m = (Map) serializableExtra;
            }
            List<String> list = this.t;
            if (list == null || list.isEmpty()) {
                LogUtil.d("DevicePairGuideSecondActivity", "device uuids is empty");
                return;
            }
            if (TextUtils.isEmpty(this.j)) {
                LogUtil.d("DevicePairGuideSecondActivity", "mKindType is empty");
                return;
            }
            Map<String, String> map = this.m;
            if (map == null || map.isEmpty()) {
                LogUtil.d("DevicePairGuideSecondActivity", "mPairGuideArray is empty");
                return;
            }
            this.p = intent.getSerializableExtra("second_resource");
        }
        o();
        this.f24139b = rcv.a(BaseApplication.getContext());
    }

    static class e implements DownloadDeviceInfoCallBack {
        private final WeakReference<DevicePairGuideSecondActivity> d;

        private e(DevicePairGuideSecondActivity devicePairGuideSecondActivity) {
            this.d = new WeakReference<>(devicePairGuideSecondActivity);
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onSuccess() {
            DevicePairGuideSecondActivity devicePairGuideSecondActivity = this.d.get();
            if (c(devicePairGuideSecondActivity)) {
                devicePairGuideSecondActivity.g();
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onFailure(int i) {
            DevicePairGuideSecondActivity devicePairGuideSecondActivity = this.d.get();
            if (c(devicePairGuideSecondActivity)) {
                devicePairGuideSecondActivity.c(i);
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void netWorkError() {
            DevicePairGuideSecondActivity devicePairGuideSecondActivity = this.d.get();
            if (c(devicePairGuideSecondActivity)) {
                devicePairGuideSecondActivity.h();
            }
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onDownload(int i) {
            DevicePairGuideSecondActivity devicePairGuideSecondActivity = this.d.get();
            if (c(devicePairGuideSecondActivity)) {
                devicePairGuideSecondActivity.a(i);
            }
        }

        private boolean c(DevicePairGuideSecondActivity devicePairGuideSecondActivity) {
            if (devicePairGuideSecondActivity != null && !devicePairGuideSecondActivity.isFinishing() && !devicePairGuideSecondActivity.isDestroyed()) {
                return true;
            }
            LogUtil.a("DevicePairGuideSecondActivity", "activity is null, finish or destroyed");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.k.setVisibility(0);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(this.t, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.h.setVisibility(8);
        Object obj = this.p;
        if (obj != null && (obj instanceof Map)) {
            Map<String, edu> map = (Map) obj;
            this.r = map;
            LogUtil.a("DevicePairGuideSecondActivity", "mSecondResourceMap: ", map.toString());
            j();
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.h.setVisibility(8);
        if (i == -3) {
            this.n.setText(R.string.IDS_download_error_storage);
        } else {
            this.n.setText(R.string.IDS_no_device_res);
        }
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DevicePairGuideSecondActivity.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            BroadcastManagerUtil.a(this, this.i, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("DevicePairGuideSecondActivity", "handleDownloadNetError register receiver is error");
        }
        this.k.setVisibility(8);
        this.h.setVisibility(0);
        this.l.setVisibility(8);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DevicePairGuideSecondActivity.this.q.a(DevicePairGuideSecondActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.k.setVisibility(0);
        this.h.setVisibility(8);
        this.l.setVisibility(8);
        if (i > 0) {
            this.k.setProgress(i);
        }
    }

    private void j() {
        i();
        for (String str : this.r.keySet()) {
            LogUtil.a("DevicePairGuideSecondActivity", "setDeviceInfoByIndexAll mUuidList : ", this.t.toString());
            LogUtil.a("DevicePairGuideSecondActivity", "setDeviceInfo mDeviceUuidList : ", this.g.toString());
            LogUtil.a("DevicePairGuideSecondActivity", "setDeviceInfoByIndexAll secondResourcebean: ", this.r.get(str));
            String str2 = this.r.get(str).g().get(0);
            if (!edg.a().containsKey(str2) && !this.g.contains(str2)) {
                LogUtil.d("DevicePairGuideSecondActivity", "setDeviceInfoByIndexAll this device is not support show");
            } else {
                LogUtil.a("DevicePairGuideSecondActivity", "setDeviceInfo uuid : ", str2);
                rba rbaVar = new rba();
                rbaVar.f(this.m.get(str2));
                rbaVar.a(this.j);
                rbaVar.j(3);
                boolean zA = edg.a(str2);
                rej rejVar = new rej(null);
                if (this.r.get(str) != null) {
                    rbaVar.d(rejVar.a(this.r.get(str).c()));
                    rbaVar.c(0);
                    rbaVar.j(str2);
                    rbaVar.e(this.r.get(str).b());
                    rbaVar.c(rejVar.a(this.r.get(str).d()));
                    this.f24140c.add(rbaVar);
                } else {
                    edn ednVarC = lvi.c(str2, zA);
                    if (ednVarC == null) {
                        LogUtil.d("DevicePairGuideSecondActivity", " deviceInfoNew is null");
                    } else {
                        rbaVar.d(ednVarC.i());
                        rbaVar.c(1);
                        rbaVar.j(str2);
                        rbaVar.d(ednVarC.y());
                        rbaVar.c(ednVarC.h());
                        this.f24140c.add(rbaVar);
                    }
                }
            }
        }
        c();
    }

    private void f() {
        i();
        for (String str : this.t) {
            if (!edg.a().containsKey(str) && !this.g.contains(str)) {
                LogUtil.d("DevicePairGuideSecondActivity", "this device is not support show");
            } else {
                rba rbaVar = new rba();
                rbaVar.f(this.m.get(str));
                rbaVar.a(this.j);
                rbaVar.j(3);
                edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
                boolean zA = edg.a(str);
                if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
                    rbaVar.d(pluginInfoByUuid.i().ah());
                    rbaVar.c(0);
                    rbaVar.j(str);
                    rbaVar.e(d(pluginInfoByUuid));
                    rbaVar.c(pluginInfoByUuid.i().h());
                    this.f24140c.add(rbaVar);
                } else {
                    edn ednVarC = lvi.c(str, zA);
                    if (ednVarC == null) {
                        LogUtil.d("DevicePairGuideSecondActivity", " deviceInfoNew is null");
                    } else {
                        rbaVar.d(ednVarC.i());
                        rbaVar.c(1);
                        rbaVar.j(str);
                        rbaVar.d(ednVarC.y());
                        rbaVar.c(ednVarC.h());
                        this.f24140c.add(rbaVar);
                    }
                }
            }
        }
        c();
    }

    private void i() {
        this.g.clear();
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        if (indexList == null || indexList.size() <= 0) {
            LogUtil.a("DevicePairGuideSecondActivity", "have no index info");
            return;
        }
        for (edx edxVar : indexList) {
            if (edxVar.g() != null) {
                String strB = edxVar.b();
                if (this.t.contains(strB)) {
                    if (!eev.d(edxVar.h())) {
                        LogUtil.d("DevicePairGuideSecondActivity", "app version is not supported");
                    } else if (Utils.o()) {
                        if (TextUtils.equals(edxVar.f(), "2") || TextUtils.equals(edxVar.f(), "3")) {
                            this.g.add(strB);
                        }
                    } else if (TextUtils.equals(edxVar.f(), "1") || TextUtils.equals(edxVar.f(), "3")) {
                        this.g.add(strB);
                    }
                }
            }
        }
    }

    private String d(edl edlVar) {
        return pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + edlVar.i().az() + ".png";
    }

    private void c() {
        if (this.f24140c.isEmpty()) {
            LogUtil.d("DevicePairGuideSecondActivity", "mDeviceInfos is empty");
            return;
        }
        this.o = new RightListAdapter(this.f24140c);
        this.e.setLayoutManager(new LinearLayoutManager(this));
        this.e.setAdapter(this.o);
        this.o.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity.7
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                if (obj instanceof rba) {
                    DevicePairGuideSecondActivity.this.e((rba) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(rba rbaVar) {
        b();
        String strI = rbaVar.i();
        LogUtil.a("DevicePairGuideSecondActivity", "pairGuid,:", strI);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.d("DevicePairGuideSecondActivity", "pairGuid is empty");
            return;
        }
        if (!this.j.startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
            LogUtil.d("DevicePairGuideSecondActivity", "other device");
            return;
        }
        if ("3".equals(strI)) {
            d(rbaVar);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(16);
        String strL = rbaVar.l();
        if (TextUtils.isEmpty(strL)) {
            LogUtil.d("DevicePairGuideSecondActivity", "intentPairGuid uuid is empty");
            return;
        }
        if ("b81581e1-5c5a-4e30-b099-0a448ef56a24".equals(strL) && this.p != null) {
            arrayList.addAll(this.r.get("b81581e1-5c5a-4e30-b099-0a448ef56a24").g());
        } else {
            arrayList.add(strL);
        }
        if (njy.e(arrayList)) {
            LogUtil.d("DevicePairGuideSecondActivity", "intentPairGuid, uuidList is empty");
            return;
        }
        Intent intent = new Intent(this, (Class<?>) PairingGuideActivity.class);
        if (arrayList instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        }
        intent.putExtra("kind_id", this.j);
        intent.putExtra("pair_guide", rbaVar.i());
        startActivity(intent);
    }

    private void d(rba rbaVar) {
        ArrayList arrayList = new ArrayList(16);
        String strL = rbaVar.l();
        if (TextUtils.isEmpty(strL)) {
            LogUtil.d("DevicePairGuideSecondActivity", "enterLeoPairGuide uuid is empty");
            return;
        }
        arrayList.add(strL);
        rbaVar.d(arrayList);
        this.q.e(rbaVar, this.f24138a, this.f24139b);
    }

    private void b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
            LocalBroadcastManager.getInstance().registerReceiver(this.f, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("DevicePairGuideSecondActivity", "resisterPairReceiver is error");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k();
        a();
    }

    private void a() {
        for (pis pisVar : piu.c().b()) {
            if (pisVar != null && this.t.contains(pisVar.b())) {
                piu.c().a(pisVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            BroadcastReceiver broadcastReceiver = this.i;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.i = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("DevicePairGuideSecondActivity", "unRegisterNet is error");
        }
    }

    private void l() {
        try {
            if (this.f != null) {
                LogUtil.a("DevicePairGuideSecondActivity", "unregisterBroadcastReceiver mReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(this.f);
                this.f = null;
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.c("DevicePairGuideSecondActivity", "unRegisterNet is error");
        }
    }

    private void k() {
        n();
        l();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
