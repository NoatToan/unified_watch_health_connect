package com.huawei.health.device.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.ui.measure.adapter.WeightOfflineDataAdapter;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dnj;
import defpackage.dof;
import defpackage.drw;
import defpackage.dsb;
import defpackage.dso;
import defpackage.dxw;
import defpackage.enw;
import defpackage.era;
import defpackage.lmf;
import defpackage.njy;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WeightOfflineDataSelectActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private enw f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeightOfflineDataAdapter f6333c;
    private String d;
    private HealthButton e;
    private HealthDevice f;
    private HealthButton g;
    private String h;
    private RelativeLayout j;
    private HealthTextView k;
    private HealthTextView l;
    private ListView m;
    private dsb n;
    private ArrayList<dso> o = new ArrayList<>(10);
    private Handler i = new Handler() { // from class: com.huawei.health.device.ui.WeightOfflineDataSelectActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == -1) {
                WeightOfflineDataSelectActivity weightOfflineDataSelectActivity = WeightOfflineDataSelectActivity.this;
                weightOfflineDataSelectActivity.e(weightOfflineDataSelectActivity.g);
            } else {
                if (i != 0) {
                    return;
                }
                WeightOfflineDataSelectActivity.this.finish();
            }
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity onCreate ...");
        setContentView(R.layout.activity_layout_weight_offline_data_sync);
        this.f6331a = this;
        this.n = dsb.b(this);
        this.d = MultiUsersManager.INSTANCE.getCurrentUser() == null ? null : MultiUsersManager.INSTANCE.getCurrentUser().i();
        setFinishOnTouchOutside(false);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.h = intent.getStringExtra("productId");
            } catch (Exception unused) {
                LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity onCreate Exception");
            }
            if (TextUtils.isEmpty(this.h)) {
                LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity onCreate mProductId is null");
                finish();
                return;
            } else {
                LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity mProductId is::" + this.h);
                d();
                return;
            }
        }
        LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity onCreate intent is null");
        finish();
    }

    private void d() {
        b();
        if (this.o.size() <= 0) {
            LogUtil.j("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity no suspected data");
            finish();
        }
        e();
        c();
        a();
    }

    private void e() {
        this.j = (RelativeLayout) findViewById(R.id.weight_offline_data_layout);
        this.l = (HealthTextView) findViewById(R.id.weight_offline_data_current_user_tv);
        this.m = (ListView) findViewById(R.id.weight_offline_data_list);
        this.k = (HealthTextView) findViewById(R.id.weight_offline_sync_title_type);
        this.e = (HealthButton) findViewById(R.id.weight_offline_data_cancle);
        this.g = (HealthButton) findViewById(R.id.weight_offline_data_save);
        if (this.h != null) {
            this.f = drw.e().b(this.h);
        }
        if (this.f != null) {
            this.f6332b = new enw(10006);
        }
    }

    private void b() {
        this.o.clear();
        if (!Utils.h()) {
            this.d = dof.d().a();
        }
        for (dso dsoVar : this.n.c(this.d)) {
            if (dsoVar != null && dsoVar.s()) {
                this.o.add(dsoVar);
            }
        }
        LogUtil.a("WeightOfflineDataSelectActivity", "weight offline data size is : ", Integer.valueOf(this.o.size()));
    }

    private void c() {
        this.g.setTextColor(this.f6331a.getResources().getColor(R.color.color_orange_30alpha));
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null) {
            a("current user is null");
            return;
        }
        if (TextUtils.isEmpty(currentUser.h())) {
            List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
            if (allUser.isEmpty()) {
                a("no cache user info");
                return;
            }
            String strI = currentUser.i();
            if (TextUtils.isEmpty(strI)) {
                a("current user tag is empty.");
                return;
            }
            for (dnj dnjVar : allUser) {
                if (strI.equals(dnjVar.i()) && !TextUtils.isEmpty(dnjVar.h())) {
                    currentUser.e(dnjVar.h());
                    a(currentUser);
                    return;
                }
            }
            a("can not find current name from cache");
            return;
        }
        a(currentUser);
    }

    private void a(String str) {
        LogUtil.a("WeightOfflineDataSelectActivity", "current user is lose info, change user : ", str);
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (!d(mainUser)) {
            LogUtil.a("WeightOfflineDataSelectActivity", "current and main user is empty, please check code.");
            finish();
        } else {
            MultiUsersManager.INSTANCE.setCurrentUser(mainUser);
            a(mainUser);
        }
    }

    private boolean d(dnj dnjVar) {
        if (dnjVar != null) {
            return !TextUtils.isEmpty(dnjVar.h()) || Utils.k();
        }
        return false;
    }

    private void a(dnj dnjVar) {
        if (!d(dnjVar)) {
            LogUtil.a("WeightOfflineDataSelectActivity", "can not get current user, please check getCurrentUser method.");
            finish();
            return;
        }
        this.l.setText(this.f6331a.getResources().getString(R.string.IDS_device_current_user, dnjVar.h()));
        LogUtil.a("WeightOfflineDataSelectActivity", "user num is :" + MultiUsersManager.INSTANCE.getAllUser().size());
        if (MultiUsersManager.INSTANCE.getAllUser().size() == 1) {
            this.l.setVisibility(8);
            this.k.setText(this.f6331a.getResources().getString(R.string.IDS_device_select_data_keep));
        }
        WeightOfflineDataAdapter weightOfflineDataAdapter = new WeightOfflineDataAdapter(this.f6331a, this.o, this.i);
        this.f6333c = weightOfflineDataAdapter;
        weightOfflineDataAdapter.a(this.o);
        this.m.setAdapter((ListAdapter) this.f6333c);
        this.g.setEnabled(false);
        int iE = era.e(this.m);
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        LogUtil.a("WeightOfflineDataSelectActivity", "listViewHeight ===" + iE);
        if (iE < 650) {
            layoutParams.height = iE;
        } else {
            layoutParams.height = 650;
        }
        this.m.setLayoutParams(layoutParams);
    }

    private void a() {
        this.g.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthButton healthButton) {
        WeightOfflineDataAdapter weightOfflineDataAdapter = this.f6333c;
        if (weightOfflineDataAdapter != null && weightOfflineDataAdapter.d() > 0) {
            healthButton.setEnabled(true);
            healthButton.setTextColor(this.f6331a.getResources().getColor(R.color.common_colorAccent));
        } else {
            healthButton.setEnabled(false);
            healthButton.setTextColor(this.f6331a.getResources().getColor(R.color.color_orange_30alpha));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("WeightOfflineDataSelectActivity", "onClick view is null");
            return;
        }
        if (view.getId() == R.id.weight_offline_data_cancle) {
            if (this.j.getVisibility() == 0) {
                this.j.setVisibility(4);
            }
            g();
        } else if (view.getId() != R.id.weight_offline_data_save) {
            LogUtil.a("WeightOfflineDataSelectActivity", "Unknown click event.");
        } else {
            d(this.f6333c.e());
            this.i.sendEmptyMessage(0);
        }
    }

    private void g() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f6331a);
        builder.e(this.f6331a.getString(R.string.IDS_device_bluetooth_open)).a(this.f6331a.getString(R.string.IDS_device_confirm_once_again_before_abandon_claim_data_tip)).b(this.f6331a.getString(R.string.IDS_device_ui_dialog_yes), new View.OnClickListener() { // from class: com.huawei.health.device.ui.WeightOfflineDataSelectActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!Utils.h()) {
                    WeightOfflineDataSelectActivity.this.b(dof.d().a(), WeightOfflineDataSelectActivity.this.o);
                } else {
                    WeightOfflineDataSelectActivity.this.b(MultiUsersManager.INSTANCE.getCurrentUser().i(), WeightOfflineDataSelectActivity.this.o);
                }
                WeightOfflineDataSelectActivity.this.i.sendEmptyMessage(0);
            }
        }).a(this.f6331a.getString(R.string.IDS_device_ui_dialog_no), new View.OnClickListener() { // from class: com.huawei.health.device.ui.WeightOfflineDataSelectActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WeightOfflineDataSelectActivity", "onClick cancle.");
                if (WeightOfflineDataSelectActivity.this.j.getVisibility() != 0) {
                    WeightOfflineDataSelectActivity.this.j.setVisibility(0);
                }
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.show();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
    }

    private void d(ArrayList<Boolean> arrayList) {
        enw enwVar;
        dso dsoVar;
        ArrayList arrayList2 = new ArrayList(10);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2).booleanValue() && njy.c(this.o, i2) && (dsoVar = this.o.get(i2)) != null) {
                arrayList2.add(a(dsoVar));
                i++;
            }
        }
        Collections.sort(arrayList2, new Comparator<HealthData>() { // from class: com.huawei.health.device.ui.WeightOfflineDataSelectActivity.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(HealthData healthData, HealthData healthData2) {
                long startTime = healthData.getStartTime() - healthData.getStartTime();
                if (startTime > 0) {
                    return -1;
                }
                return startTime < 0 ? 1 : 0;
            }
        });
        LogUtil.a("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity saveData num :", Integer.valueOf(i));
        HealthDevice healthDevice = this.f;
        if (healthDevice != null && (enwVar = this.f6332b) != null) {
            enwVar.onDataChanged(healthDevice, arrayList2);
        } else {
            LogUtil.j("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity saveData device or dataHandler is null! ");
        }
        j();
        if (!Utils.h()) {
            b(dof.d().a(), this.o);
        } else {
            b(MultiUsersManager.INSTANCE.getCurrentUser().i(), this.o);
        }
        a(i, this.o);
    }

    private void a(int i, ArrayList<dso> arrayList) {
        if (arrayList.size() == 0) {
            LogUtil.j("WeightOfflineDataSelectActivity", "suspectedWeightData is empty");
            return;
        }
        double dDoubleValue = new BigDecimal(((double) i) / ((double) arrayList.size())).setScale(2, RoundingMode.DOWN).doubleValue();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("saveData", Double.valueOf(dDoubleValue));
        map.put("cancleData", Double.valueOf(1.0d - dDoubleValue));
        lmf.d().c(this.f6331a, AnalyticsValue.HEALTH_PLUGIN_DEVICE_WEIGHT_BODYFATSCALE_OFFLINE_CLAIM_DATA_2060030.value(), map, 0);
    }

    private dso a(dso dsoVar) {
        if (dsoVar.getStartTime() <= 0) {
            LogUtil.j("WeightOfflineDataSelectActivity", "WeightOfflineDataSelectActivity convertTimeStamp time zero");
            return dsoVar;
        }
        dso dsoVarMo828clone = dsoVar.mo828clone();
        LogUtil.d("WeightOfflineDataSelectActivity", "convertTimeStamp before :", Long.valueOf(dsoVar.getStartTime()));
        long startTime = ((dsoVar.getStartTime() / 1000) * 1000) + ((long) Calendar.getInstance().get(14));
        dsoVarMo828clone.setStartTime(startTime);
        dsoVarMo828clone.setEndTime(startTime);
        LogUtil.d("WeightOfflineDataSelectActivity", "convertTimeStamp success :", Long.valueOf(dsoVarMo828clone.getStartTime()));
        return dsoVarMo828clone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, ArrayList<dso> arrayList) {
        if (arrayList == null || str == null) {
            return;
        }
        Iterator<dso> it = arrayList.iterator();
        while (it.hasNext()) {
            this.n.e(str, it.next().getStartTime());
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            moveTaskToBack(false);
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void j() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(HiSyncType.HiSyncDataType.f12263a);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, new HiCommonListener() { // from class: com.huawei.health.device.ui.WeightOfflineDataSelectActivity.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("WeightOfflineDataSelectActivity", "syncDataStart onSuccess");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("WeightOfflineDataSelectActivity", "syncDataStart onFailure");
            }
        });
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
