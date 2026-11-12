package com.huawei.ui.device.activity.adddevice;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.views.adddevice.SelectDeviceListAdapter;
import com.huawei.up.utils.ErrorCode;
import defpackage.dxw;
import defpackage.edl;
import defpackage.edn;
import defpackage.edx;
import defpackage.edz;
import defpackage.lmf;
import defpackage.lvi;
import defpackage.mfs;
import defpackage.pig;
import defpackage.qsp;
import defpackage.qtk;
import defpackage.rct;
import defpackage.rcv;
import defpackage.rfk;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AddDeviceChildSecondActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rcv f24094c;
    private CustomTitleBar d;
    private int g;
    private String h;
    private ListView j;
    private ArrayList<rfk> i = new ArrayList<>(16);
    private SelectDeviceListAdapter f = null;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DownloadManagerApi f24092a = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        Context context = BaseApplication.getContext();
        this.f24093b = context;
        if (context != null) {
            this.f24094c = rcv.a(BaseApplication.getContext());
        }
        LogUtil.a("AddDeviceChildSecondActivity", "onCreate()");
        e();
    }

    private void e() {
        setContentView(R.layout.activity_add_device_child);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.select_device_detail_title_bar);
        this.d = customTitleBar;
        customTitleBar.setVisibility(0);
        this.d.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.adddevice.AddDeviceChildSecondActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AddDeviceChildSecondActivity.this.finish();
            }
        });
        this.j = (ListView) qsp.a(this, R.id.list_setup_device);
        a();
        mfs.c(this, -1);
    }

    private void a() {
        LogUtil.a("AddDeviceChildSecondActivity", "initListView");
        this.d.setTitleText(this.f24093b.getString(R.string.IDS_app_display_name_porc));
        for (edn ednVar : rct.c()) {
            LogUtil.a("AddDeviceChildSecondActivity", "initViewForWatch() type: ", Integer.valueOf(ednVar.l()));
            d(ednVar.l(), ednVar.i(), ednVar.h(), ednVar.y());
        }
        c();
        a("SMART_WATCH");
    }

    private void a(String str) {
        List<edx> indexList = this.f24092a.getIndexList();
        if (indexList == null || indexList.size() <= 0) {
            LogUtil.j("AddDeviceChildSecondActivity", "indexInfoCaches.size equals 0");
            return;
        }
        LogUtil.a("AddDeviceChildSecondActivity", "indexInfoCaches.size greater 0");
        for (edx edxVar : indexList) {
            if (edxVar.g() != null && TextUtils.equals(edxVar.g(), str)) {
                LogUtil.a("AddDeviceChildSecondActivity", "has band plugin info from cache, uuid: ", edxVar.b());
                if (!this.f24092a.isResourcesAvailable(edxVar.b())) {
                    LogUtil.j("AddDeviceChildSecondActivity", "No resource file exists under the uuid");
                } else {
                    e(this.f24092a.getPluginInfoByUuid(edxVar.b()));
                }
            }
        }
    }

    private void e(edl edlVar) {
        if (edlVar == null || edlVar.i() == null) {
            LogUtil.j("AddDeviceChildSecondActivity", "updateUiForWear is null");
            return;
        }
        LogUtil.a("AddDeviceChildSecondActivity", "deviceType is ", Integer.valueOf(edlVar.i().ag()));
        if (edlVar.i().bv()) {
            c(edlVar);
            b();
        }
    }

    private void c(edl edlVar) {
        int iB = lvi.b(edlVar.c());
        if (edlVar.i() == null) {
            return;
        }
        edl edlVar2 = new edl();
        edz edzVar = new edz();
        edzVar.d(edlVar.i().a());
        edlVar2.d(edzVar);
        if (qtk.c(edlVar2, iB, CommonUtil.e(this.f24093b))) {
            LogUtil.a("AddDeviceChildSecondActivity", "ezPluginInfo: ", edlVar.toString());
            if ("".equals(edlVar.i().ah())) {
                return;
            }
            a(iB, -1);
            rfk rfkVar = new rfk(-1, edlVar.i().ah(), edlVar.i().h(), true, b(edlVar));
            rfkVar.e(1);
            rfkVar.b(new b(rfkVar));
            this.i.add(0, rfkVar);
            return;
        }
        edn ednVarA = lvi.a(iB);
        rfk rfkVar2 = new rfk(iB, ednVarA.i(), ednVarA.h(), true, b(edlVar));
        rfkVar2.e(1);
        rfkVar2.b(new b(rfkVar2));
        this.i.add(0, rfkVar2);
    }

    private void a(int i, int i2) {
        if (lvi.a(i) != null) {
            lvi.a(i).a(i2);
        }
    }

    private void b() {
        LogUtil.a("AddDeviceChildSecondActivity", "listNotifyDataSetChanged mlist size is ", Integer.valueOf(this.i.size()));
        this.f.a(this.i);
        this.f.notifyDataSetChanged();
    }

    private void c() {
        LogUtil.a("AddDeviceChildSecondActivity", "setListAdapter mlist size is ", Integer.valueOf(this.i.size()));
        SelectDeviceListAdapter selectDeviceListAdapter = new SelectDeviceListAdapter(this.i);
        this.f = selectDeviceListAdapter;
        this.j.setAdapter((ListAdapter) selectDeviceListAdapter);
    }

    private String b(edl edlVar) {
        return pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + edlVar.i().az() + ".png";
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("AddDeviceChildSecondActivity", "onDestroy()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a("AddDeviceChildSecondActivity", "onStart()");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        rfk f24096c;

        b(rfk rfkVar) {
            this.f24096c = rfkVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = this.f24096c.b().getInt(OpAnalyticsConstants.OPERATION_ID);
            LogUtil.a("AddDeviceChildSecondActivity", "MyOnClickListener(): item.getID() ", Integer.valueOf(i), " device name: ", this.f24096c.b().getString("mContent"));
            HashMap map = new HashMap(16);
            map.put("click", "1");
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_SELECT_DEVICE_2060002.value(), map, 0);
            if (this.f24096c.a() == -1) {
                qtk.e(AddDeviceChildSecondActivity.this.f24093b, AddDeviceChildSecondActivity.this);
            } else {
                this.f24096c.b().getInt(OpAnalyticsConstants.OPERATION_ID);
                AddDeviceChildSecondActivity.this.c(this.f24096c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(rfk rfkVar) {
        Intent intent = new Intent(this, (Class<?>) AddDeviceIntroActivity.class);
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, rfkVar.b().getInt(OpAnalyticsConstants.OPERATION_ID));
        if (rfkVar.a() == 10) {
            intent.putExtra("isPorc", true);
            intent.putExtra("IS_PROC", true);
        }
        intent.putExtra("dname", rfkVar.c());
        this.h = rfkVar.f();
        startActivityForResult(intent, 99);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("AddDeviceChildSecondActivity", "Enter onActivityResult(): ", " resultCode: ", Integer.valueOf(i2), " requestCode: ", Integer.valueOf(i));
        if (i == 1) {
            if (i2 == 0) {
                return;
            }
            setResult(2, intent);
            finish();
        } else if (i == 99) {
            int intExtra = (i2 != 101 || intent == null) ? -10 : intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -10);
            if (intExtra != -10) {
                c(intExtra);
            }
        } else {
            LogUtil.a("AddDeviceChildSecondActivity", "unknown resultCode");
        }
        this.e = false;
        super.onActivityResult(i, i2, intent);
    }

    private void c(int i) {
        a(i, this.h);
    }

    private void a(int i, String str) {
        LogUtil.a("AddDeviceChildSecondActivity", "enter enterDevicePairGuide, The device to be connected is:", Integer.valueOf(i), " mIsClicked:", Boolean.valueOf(this.e));
        if (this.e) {
            return;
        }
        this.e = true;
        this.g = i;
        edn ednVarA = rct.a(i);
        if (i != 10) {
            LogUtil.a("AddDeviceChildSecondActivity", "start enterDevicePairGuide");
            c(ednVarA.l(), ednVarA.i(), str);
        } else {
            d();
        }
    }

    private void c(int i, String str, String str2) {
        Intent intent = new Intent(this.f24093b, (Class<?>) DevicePairGuideActivity.class);
        intent.putExtra("pairGuideProductType", i);
        intent.putExtra("pairGuideProductName", str);
        intent.putExtra("pairGuideSelectName", str2);
        intent.putExtra("pairGuideFromScanList", false);
        intent.putExtra("isHeartRateDevice", false);
        intent.putExtra("pairGuideDeviceMode", ErrorCode.HWID_IS_STOPED);
        startActivityForResult(intent, 1);
    }

    private void d() {
        LogUtil.a("AddDeviceChildSecondActivity", "enterW1PairGuide");
        Intent intent = new Intent(this.f24093b, (Class<?>) DevicePairGuideActivity.class);
        qtk.a(intent, this.g, this.f24094c);
        intent.putExtra("pairGuideProductType", 10);
        intent.putExtra("pairGuideProductName", this.f24093b.getString(R.string.IDS_app_display_name_leo));
        intent.putExtra("IS_PROC", true);
        intent.putExtra("pairGuideFromScanList", false);
        intent.putExtra("pairGuideDeviceMode", ErrorCode.HWID_IS_STOPED);
        startActivityForResult(intent, 1);
    }

    private void d(int i, String str, String str2, int i2) {
        rfk rfkVarD = rct.d(i, str, str2, i2);
        rfkVarD.e(1);
        rfkVarD.b(new b(rfkVarD));
        this.i.add(rfkVarD);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
