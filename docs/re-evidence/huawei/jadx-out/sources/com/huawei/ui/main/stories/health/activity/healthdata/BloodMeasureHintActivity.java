package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.nkb;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class BloodMeasureHintActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f27396c;
    private LinearLayout d;
    private RelativeLayout e;
    private HealthTextView f;
    private int g;
    private String[] h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private Handler j;
    private BloodPressureSyncManager l;
    private long m;
    private List<Integer> n;

    static /* synthetic */ int m(BloodMeasureHintActivity bloodMeasureHintActivity) {
        int i = bloodMeasureHintActivity.g + 1;
        bloodMeasureHintActivity.g = i;
        return i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_measure_hint);
        if (getIntent() != null) {
            this.f27394a = getIntent().getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
        }
        LogUtil.a("BloodMeasureHintActivity_tag", "fromtype: ", Integer.valueOf(this.f27394a));
        d();
        HiHealthNativeApi.a(this).subscribeHiHealthData(HiSubscribeType.f12261c, new c(this));
        this.l = BloodPressureSyncManager.d();
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (LanguageUtil.bm(this)) {
            this.f27395b.setHyphenationFrequency(1);
            this.f27395b.setBreakStrategy(2);
        }
    }

    private void d() {
        this.f27396c = (LinearLayout) findViewById(R.id.blood_measure_hint_layout);
        this.d = (LinearLayout) findViewById(R.id.blood_measure_process_layout);
        this.e = (RelativeLayout) findViewById(R.id.blood_measure_failed_layout);
        this.f = (HealthTextView) findViewById(R.id.progress_text);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.blood_measure_posture_hint);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.blood_measure_posture_hint2);
        healthTextView.setText(getString(R.string.IDS_blood_measure_posture_hint1, new Object[]{1, 5}));
        healthTextView2.setText(getString(R.string.IDS_blood_measure_posture_hint2, new Object[]{2}));
        this.f27395b = (HealthTextView) findViewById(R.id.blood_measure_process_hint_text);
        findViewById(R.id.blood_measure_failed_retry).setOnClickListener(new View.OnClickListener() { // from class: unq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50410a.a(view);
            }
        });
        this.h = new String[]{getString(R.string.IDS_blood_measure_process_hint), getString(R.string.IDS_blood_measure_process_hint2)};
        this.j = new d(getMainLooper(), this);
    }

    public /* synthetic */ void a(View view) {
        c();
    }

    private void c() {
        this.l.d(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        nkb.d().d(this.m, System.currentTimeMillis(), 1, new b(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HiHealthNativeApi.a(this).unSubscribeHiHealthData(this.n, null);
        this.j.removeMessages(0);
        this.l.c();
        super.onDestroy();
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements BloodPressureSyncManager.IBloodPressureMeasureCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<BloodMeasureHintActivity> f27398c;

        e(BloodMeasureHintActivity bloodMeasureHintActivity) {
            this.f27398c = new WeakReference<>(bloodMeasureHintActivity);
        }

        @Override // com.huawei.basichealth.bloodpressure.BloodPressureSyncManager.IBloodPressureMeasureCallback
        public void onNotifyMeasure(int i) {
            BloodMeasureHintActivity bloodMeasureHintActivity = this.f27398c.get();
            if (bloodMeasureHintActivity != null) {
                LogUtil.a("BloodMeasureHintActivity_tag", "onNotifyMeasure=", Integer.valueOf(i));
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.arg1 = i;
                bloodMeasureHintActivity.j.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.basichealth.bloodpressure.BloodPressureSyncManager.IBloodPressureMeasureCallback
        public void onMeasureStart(long j) {
            BloodMeasureHintActivity bloodMeasureHintActivity = this.f27398c.get();
            if (bloodMeasureHintActivity != null) {
                LogUtil.a("BloodMeasureHintActivity_tag", "onMeasureStart=", Long.valueOf(j));
                bloodMeasureHintActivity.m = j * 1000;
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                bloodMeasureHintActivity.j.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.basichealth.bloodpressure.BloodPressureSyncManager.IBloodPressureMeasureCallback
        public void onMeasureFinish(int i, long j) {
            BloodMeasureHintActivity bloodMeasureHintActivity = this.f27398c.get();
            if (bloodMeasureHintActivity == null) {
                return;
            }
            if (i != 0) {
                bloodMeasureHintActivity.j.sendEmptyMessage(3);
                return;
            }
            LogUtil.a("BloodMeasureHintActivity_tag", "onMeasureFinish=", Integer.valueOf(i), ", endTime=", Long.valueOf(j));
            bloodMeasureHintActivity.i.set(true);
            bloodMeasureHintActivity.e();
            bloodMeasureHintActivity.j.sendEmptyMessage(4);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d extends BaseHandler<BloodMeasureHintActivity> {
        public d(Looper looper, BloodMeasureHintActivity bloodMeasureHintActivity) {
            super(looper, bloodMeasureHintActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodMeasureHintActivity bloodMeasureHintActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                bloodMeasureHintActivity.f27395b.setText(bloodMeasureHintActivity.h[BloodMeasureHintActivity.m(bloodMeasureHintActivity) % 2]);
                bloodMeasureHintActivity.j.sendEmptyMessageDelayed(0, 5000L);
                return;
            }
            if (i == 1) {
                if (message.arg1 == 0) {
                    bloodMeasureHintActivity.f27396c.setVisibility(0);
                    bloodMeasureHintActivity.e.setVisibility(8);
                } else {
                    bloodMeasureHintActivity.e.setVisibility(0);
                    bloodMeasureHintActivity.f27396c.setVisibility(8);
                }
                bloodMeasureHintActivity.d.setVisibility(8);
                return;
            }
            if (i == 2) {
                bloodMeasureHintActivity.d.setVisibility(0);
                bloodMeasureHintActivity.f27396c.setVisibility(8);
                bloodMeasureHintActivity.e.setVisibility(8);
                bloodMeasureHintActivity.j.sendEmptyMessageDelayed(0, 5000L);
                return;
            }
            if (i == 3) {
                bloodMeasureHintActivity.j.removeMessages(0);
                bloodMeasureHintActivity.e.setVisibility(0);
                bloodMeasureHintActivity.f27396c.setVisibility(8);
                bloodMeasureHintActivity.d.setVisibility(8);
                return;
            }
            if (i == 4) {
                bloodMeasureHintActivity.f.setText(bloodMeasureHintActivity.getString(R.string.IDS_blood_measure_sync));
                return;
            }
            if (i != 5) {
                return;
            }
            Intent intent = new Intent(bloodMeasureHintActivity, (Class<?>) BloodMeasureResultActivity.class);
            intent.putExtra(ArkUIXConstants.FROM_TYPE, bloodMeasureHintActivity.f27394a);
            if (message.obj instanceof Long) {
                LogUtil.a("BloodMeasureHintActivity_tag", "onFinish, dataTime=", message.obj);
                intent.putExtra("dataTime", (Long) message.obj);
            }
            bloodMeasureHintActivity.startActivity(intent);
            bloodMeasureHintActivity.finish();
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements HiSubscribeListener {
        private final WeakReference<BloodMeasureHintActivity> e;

        c(BloodMeasureHintActivity bloodMeasureHintActivity) {
            this.e = new WeakReference<>(bloodMeasureHintActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (list == null || list.isEmpty()) {
                LogUtil.j("BloodMeasureHintActivity_tag", "registerBloodPressureListener failed");
                return;
            }
            LogUtil.a("BloodMeasureHintActivity_tag", "registerBloodPressureListener success");
            BloodMeasureHintActivity bloodMeasureHintActivity = this.e.get();
            if (bloodMeasureHintActivity != null) {
                bloodMeasureHintActivity.n = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("BloodMeasureHintActivity_tag", "type=", Integer.valueOf(i), ", changeKey=", str, ", newValue=", hiHealthData, ", time=", Long.valueOf(j));
            BloodMeasureHintActivity bloodMeasureHintActivity = this.e.get();
            if (bloodMeasureHintActivity != null && i == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value() && ArkUIXConstants.INSERT.equals(str) && bloodMeasureHintActivity.i.get()) {
                bloodMeasureHintActivity.e();
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<BloodMeasureHintActivity> f27397a;

        b(BloodMeasureHintActivity bloodMeasureHintActivity) {
            this.f27397a = new WeakReference<>(bloodMeasureHintActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("BloodMeasureHintActivity_tag", "ReadComplete onResponse Success");
            BloodMeasureHintActivity bloodMeasureHintActivity = this.f27397a.get();
            if (bloodMeasureHintActivity == null) {
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty()) {
                    HiHealthData hiHealthData = (HiHealthData) list.get(list.size() - 1);
                    if (hiHealthData.getEndTime() < bloodMeasureHintActivity.m) {
                        LogUtil.a("BloodMeasureHintActivity_tag", "not tag data, time=", Long.valueOf(hiHealthData.getEndTime()));
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 5;
                    messageObtain.obj = Long.valueOf(hiHealthData.getEndTime());
                    bloodMeasureHintActivity.j.sendMessage(messageObtain);
                    return;
                }
            }
            LogUtil.a("BloodMeasureHintActivity_tag", "data is null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
