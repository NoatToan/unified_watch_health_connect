package com.huawei.health.device.ui.measure.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.ui.measure.adapter.SubUserAuthListAdapter;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceAuthorizeByMainUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetSubUserAuthMsgRsp;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubUserAuthMsg;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.ecl;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WifiDeviceAuthRequestListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SubUserAuthListAdapter.AuthButtonClickCallback f6356b = new SubUserAuthListAdapter.AuthButtonClickCallback() { // from class: duk
        @Override // com.huawei.health.device.ui.measure.adapter.SubUserAuthListAdapter.AuthButtonClickCallback
        public final void onAuthButtonClick(WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, boolean z) {
            this.e.d(wifiDeviceSubUserAuthMsg, z);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f6357c;
    private Context d;
    private RelativeLayout e;
    private ListView g;

    public /* synthetic */ void d(WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, boolean z) {
        if (qrs.r()) {
            LogUtil.j("WifiDeviceAuthRequestListActivity", "onAuthButtonClick click too fast.");
        } else {
            LogUtil.a("WifiDeviceAuthRequestListActivity", "reply auth:", wifiDeviceSubUserAuthMsg.getSubHuid(), Boolean.valueOf(z));
            d(this.d, wifiDeviceSubUserAuthMsg, this.f6355a, z);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this;
        setContentView(R.layout.activity_auth_request_list);
        e();
        if (d()) {
            b();
        }
    }

    private void e() {
        this.g = (ListView) findViewById(R.id.list_view);
        this.e = (RelativeLayout) findViewById(R.id.no_message_layout);
        this.f6357c = (RelativeLayout) findViewById(R.id.no_network_layout);
        if (CommonUtil.ab(this.d)) {
            return;
        }
        a();
    }

    private boolean d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("WifiDeviceAuthRequestListActivity", "intent null,return");
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            LogUtil.j("WifiDeviceAuthRequestListActivity", "intent null,return");
            return false;
        }
        String string = extras.getString("dev_id");
        this.f6355a = string;
        if (!TextUtils.isEmpty(string)) {
            return true;
        }
        LogUtil.j("WifiDeviceAuthRequestListActivity", "bundle.getString(BUNDLE_KEY_DEV_ID) return empty");
        return false;
    }

    private void d(final Context context, WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg, String str, final boolean z) {
        WifiDeviceAuthorizeByMainUserReq wifiDeviceAuthorizeByMainUserReq = new WifiDeviceAuthorizeByMainUserReq();
        wifiDeviceAuthorizeByMainUserReq.setSubHuid(wifiDeviceSubUserAuthMsg.getSubHuid());
        wifiDeviceAuthorizeByMainUserReq.setDevId(str);
        wifiDeviceAuthorizeByMainUserReq.setIntent(z ? 1 : 2);
        lqo.b(context).b(wifiDeviceAuthorizeByMainUserReq, new ICloudOperationResult() { // from class: duj
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z2) {
                this.f32389c.d(context, z, (CloudCommonReponse) obj, str2, z2);
            }
        });
    }

    public /* synthetic */ void d(Context context, boolean z, CloudCommonReponse cloudCommonReponse, String str, boolean z2) {
        LogUtil.a("WifiDeviceAuthRequestListActivity", "getRequestAuthorizationDetail request result: ", Boolean.valueOf(z2));
        ecl.b(context, cloudCommonReponse.getResultCode().intValue(), z2, z);
        b();
    }

    private void b(final List<WifiDeviceSubUserAuthMsg> list) {
        runOnUiThread(new Runnable() { // from class: due
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(list);
            }
        });
    }

    public /* synthetic */ void c(List list) {
        if (njy.e(list)) {
            LogUtil.j("WifiDeviceAuthRequestListActivity", "refreshListView return fail: subUserAuthMsgs is empty");
            a();
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WifiDeviceSubUserAuthMsg wifiDeviceSubUserAuthMsg = (WifiDeviceSubUserAuthMsg) it.next();
            if (wifiDeviceSubUserAuthMsg.getStatus() <= 4) {
                arrayList.add(wifiDeviceSubUserAuthMsg);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j("WifiDeviceAuthRequestListActivity", "refreshListView return fail: tmpSubUserAuthMsgs is empty");
            a();
        } else {
            Collections.sort(arrayList);
            this.g.setAdapter((ListAdapter) new SubUserAuthListAdapter(this.d, arrayList, this.f6356b));
            this.g.setVisibility(0);
        }
    }

    private void b() {
        WifiDeviceGetSubUserAuthMsgReq wifiDeviceGetSubUserAuthMsgReq = new WifiDeviceGetSubUserAuthMsgReq();
        wifiDeviceGetSubUserAuthMsgReq.setDevId(this.f6355a);
        lqo.b(this.d).b(wifiDeviceGetSubUserAuthMsgReq, new ICloudOperationResult() { // from class: dud
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f32383b.b((CloudCommonReponse) obj, str, z);
            }
        });
    }

    public /* synthetic */ void b(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        LogUtil.a("WifiDeviceAuthRequestListActivity", "wifiDeviceGetSubUserAuthMsg request result: ", Boolean.valueOf(z));
        if (z) {
            WifiDeviceGetSubUserAuthMsgRsp wifiDeviceGetSubUserAuthMsgRsp = (WifiDeviceGetSubUserAuthMsgRsp) new Gson().fromJson(str, WifiDeviceGetSubUserAuthMsgRsp.class);
            if (wifiDeviceGetSubUserAuthMsgRsp == null) {
                LogUtil.j("WifiDeviceAuthRequestListActivity", "wifiDeviceGetSubUserAuthMsg return fail: authMsgRsp is null");
                a();
                return;
            } else {
                b(wifiDeviceGetSubUserAuthMsgRsp.getAuthMsgs());
                return;
            }
        }
        a();
    }

    private void a() {
        runOnUiThread(new Runnable() { // from class: dug
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.g.setVisibility(8);
        if (!CommonUtil.ab(this.d)) {
            this.f6357c.setVisibility(0);
            this.e.setVisibility(8);
        } else {
            this.f6357c.setVisibility(8);
            this.e.setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (intent == null) {
            LogUtil.e("WifiDeviceAuthRequestListActivity", "intent is null");
        } else {
            super.onNewIntent(intent);
            b();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
