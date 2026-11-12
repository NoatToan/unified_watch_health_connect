package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.adapter.BloodOxygenHistoryRecordAdapter;
import defpackage.qre;
import defpackage.qrk;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenHistoryRecordActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f26608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26610c;
    private ExpandableListView d;
    private HealthProgressBar e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_oxygen_history_layout);
        this.f26610c = this;
        b();
        d();
        c();
    }

    private void b() {
        this.f26609b = (LinearLayout) findViewById(R.id.blood_oxygen_history_data_loading);
        HealthProgressBar healthProgressBar = (HealthProgressBar) findViewById(R.id.blood_oxygen_history_data_loading_img);
        this.e = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.f26608a = (CustomTitleBar) findViewById(R.id.blood_oxygen_history_data_title);
        this.d = (ExpandableListView) findViewById(R.id.blood_oxygen_history_data_layout);
        this.f26609b.setVisibility(0);
        this.f26608a.setTitleText(getString(R.string.IDS_hw_health_blood_oxygen_lower_spo2));
        if (!LanguageUtil.ba(this.f26610c)) {
            this.f26608a.setLeftButtonDrawable(getResources().getDrawable(R.drawable.health_navbar_back_selector), qre.f(R.string.accessibility_go_back));
        } else {
            this.f26608a.setLeftButtonDrawable(getResources().getDrawable(R.mipmap.ic_health_rtl_back_black), qre.f(R.string.accessibility_go_back));
        }
        cancelAdaptRingRegion();
    }

    private void d() {
        this.f26608a.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: twn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49736b.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity.BloodOxygenHistoryRecordActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements ResponseCallback<List<HiHealthData>> {
        AnonymousClass4() {
        }

        @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(int i, List<HiHealthData> list) {
            if (i == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                BloodOxygenHistoryRecordActivity.this.c(list, arrayList, arrayList2);
                final BloodOxygenHistoryRecordAdapter bloodOxygenHistoryRecordAdapter = new BloodOxygenHistoryRecordAdapter(BloodOxygenHistoryRecordActivity.this.f26610c, arrayList, arrayList2);
                BloodOxygenHistoryRecordActivity.this.runOnUiThread(new Runnable() { // from class: twj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49734c.b(bloodOxygenHistoryRecordAdapter);
                    }
                });
            }
        }

        public /* synthetic */ void b(BloodOxygenHistoryRecordAdapter bloodOxygenHistoryRecordAdapter) {
            BloodOxygenHistoryRecordActivity.this.d.setAdapter(bloodOxygenHistoryRecordAdapter);
            BloodOxygenHistoryRecordActivity.this.f26609b.setVisibility(8);
            if (bloodOxygenHistoryRecordAdapter.getGroupCount() > 0) {
                BloodOxygenHistoryRecordActivity.this.d.expandGroup(0);
            }
        }
    }

    private void c() {
        d(this.f26610c, 0L, System.currentTimeMillis(), new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, List<String> list2, List<List<HiHealthData>> list3) {
        if (list == null) {
            LogUtil.j("BloodOxygenHistoryRecordActivity", "classifyDataByMonth healthDataList is null");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData == null) {
                LogUtil.j("BloodOxygenHistoryRecordActivity", "healthDataList hiHealthData.get(", Integer.valueOf(i), ") is null");
            } else {
                String strA = qrk.a(this.f26610c, hiHealthData.getEndTime(), 36);
                if (list2.contains(strA)) {
                    list3.get(list2.indexOf(strA)).add(hiHealthData);
                } else {
                    list2.add(strA);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hiHealthData);
                    list3.add(arrayList);
                }
            }
        }
    }

    private void d(Context context, long j, long j2, final ResponseCallback<List<HiHealthData>> responseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        LogUtil.a("BloodOxygenHistoryRecordActivity", "startTime：", Long.valueOf(j), "endTime", Long.valueOf(j2));
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{2107});
        HiHealthNativeApi.a(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.detailactivity.BloodOxygenHistoryRecordActivity.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                List arrayList;
                if (obj == null) {
                    LogUtil.j("BloodOxygenHistoryRecordActivity", "blood oxygen remind data is null");
                    responseCallback.onResult(-1, null);
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("BloodOxygenHistoryRecordActivity", "data is not SparseArray<Object> type");
                    responseCallback.onResult(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() == 0) {
                    arrayList = new ArrayList();
                } else {
                    Object obj2 = sparseArray.get(2107);
                    arrayList = BloodOxygenHistoryRecordActivity.this.b(obj2) ? (List) obj2 : null;
                    if (arrayList == null) {
                        LogUtil.j("BloodOxygenHistoryRecordActivity", "bloodOxygenRemindRecordList is null");
                        responseCallback.onResult(-1, null);
                        return;
                    }
                }
                responseCallback.onResult(0, arrayList);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("BloodOxygenHistoryRecordActivity", "requestDayOxygenData onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!(it.next() instanceof HiHealthData)) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
