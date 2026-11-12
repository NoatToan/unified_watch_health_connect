package com.huawei.indoorequip.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.iov;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes40.dex */
public class StartSportTransitActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f17793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f17794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f17795c;
    private static List<String> d;
    private static List<String> e;
    private static String h;
    private boolean i = false;
    private Context j;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add("290");
        d.add("291");
        ArrayList arrayList2 = new ArrayList();
        e = arrayList2;
        arrayList2.add("261");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("StartSportTransitActivity", "enter onCreate");
        this.j = this;
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("startSportParam");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            c(stringExtra);
            if (a()) {
                e(this.j, e());
                return;
            }
            return;
        }
        LogUtil.j("StartSportTransitActivity", "StartSportTransitActivity intent == null");
    }

    @Override // android.app.Activity
    protected void onResume() {
        LogUtil.a("StartSportTransitActivity", "onResume then finish self");
        super.onResume();
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        LogUtil.a("StartSportTransitActivity", "onDestroy");
        super.onDestroy();
    }

    private void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            h = jSONObject.get("ftmp").toString();
            f17794b = jSONObject.getString("deviceType");
            f17793a = jSONObject.getString("macAddress");
            f17795c = jSONObject.getString(BleConstants.SPORT_TYPE);
            this.i = jSONObject.optBoolean("ExitApp");
        } catch (JSONException e2) {
            LogUtil.e("StartSportTransitActivity", "JSONException ", e2.getMessage());
        }
    }

    private boolean a() {
        if (TextUtils.isEmpty(f17793a)) {
            LogUtil.a("StartSportTransitActivity", "mMacAddress or  mDeviceType is empty");
            return false;
        }
        if (d.contains(f17795c) && e.contains(f17794b)) {
            return true;
        }
        LogUtil.a("StartSportTransitActivity", "mDeviceType or mSportType is error, mDeviceType = ", f17794b, "mSportType = ", f17795c);
        return false;
    }

    private String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("ftmp=");
        sb.append(h);
        sb.append("&t=");
        sb.append(f17794b);
        sb.append("&ble=");
        sb.append(f17793a);
        sb.append("&stype=");
        sb.append(f17795c);
        return sb.toString();
    }

    private void e(Context context, String str) {
        if (context == null) {
            LogUtil.a("StartSportTransitActivity", "startIndoorEquipConnectedActivity context is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("PAYLOAD_FROM_NFC", str);
        intent.putExtra("ExitApp", this.i);
        if (this.i) {
            intent.setFlags(335577088);
        }
        intent.setClass(context, IndoorEquipConnectedActivity.class);
        iov.d(context, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
