package com.huawei.ui.device.activity.selectcontact;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.datatype.Contact;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.selectcontact.ContactOrderbyActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.views.selectcontact.ContactItemDragAdapter;
import com.huawei.ui.device.views.selectcontact.ContactItemDragCallback;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.xjt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ContactOrderbyActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f24694c;
    private Context d;
    private DeviceSettingsInteractors e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Contact> f24693b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f24692a = new Handler() { // from class: com.huawei.ui.device.activity.selectcontact.ContactOrderbyActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                ContactOrderbyActivity.this.g();
            } else if (i == 2) {
                ContactOrderbyActivity.this.c();
            } else {
                if (i != 3) {
                    return;
                }
                ContactOrderbyActivity.this.b();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_device_settings_contact_orderby_activity);
        e();
    }

    private void e() {
        Context applicationContext = getApplicationContext();
        this.d = applicationContext;
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(applicationContext);
        this.e = deviceSettingsInteractorsE;
        List<Contact> listD = deviceSettingsInteractorsE.d(this.d);
        this.f24693b = listD;
        if (listD == null || listD.size() == 0) {
            LogUtil.e("ContactOrderbyActivity", "get null DBdata, the activity will be shut down!");
            return;
        }
        LogUtil.a("ContactOrderbyActivity", "mContactTables size = " + this.f24693b.size());
        Message messageObtainMessage = this.f24692a.obtainMessage();
        messageObtainMessage.what = 3;
        this.f24692a.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.contact_orderby_titlebar);
        this.f24694c = customTitleBar;
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactOrderbyActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ContactOrderbyActivity.this.f24694c.setRightButtonClickable(false);
                ContactOrderbyActivity.this.a();
            }
        });
        d();
        j();
    }

    private void j() {
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.ll_contact_orderby_list);
        if (linearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (((Integer) BaseActivity.getSafeRegionWidth().first).intValue() > 0 || ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() > 0) {
                layoutParams2.setMarginStart(qrs.d(this.d, 24.0f) + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                layoutParams2.setMarginEnd(qrs.d(this.d, 24.0f) + ((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            } else {
                layoutParams2.setMarginStart(qrs.d(this.d, 24.0f));
                layoutParams2.setMarginEnd(qrs.d(this.d, 24.0f));
            }
            linearLayout.setLayoutParams(layoutParams2);
        }
    }

    private void d() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(this, R.id.contact_orderby_drag_list);
        final ContactItemDragAdapter contactItemDragAdapter = new ContactItemDragAdapter(this.d, this.f24693b);
        healthRecycleView.setOnTouchListener(new View.OnTouchListener() { // from class: qzo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ContactOrderbyActivity.d(contactItemDragAdapter, view, motionEvent);
            }
        });
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.d));
        healthRecycleView.setAdapter(contactItemDragAdapter);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        new ItemTouchHelper(new ContactItemDragCallback(contactItemDragAdapter)).attachToRecyclerView(healthRecycleView);
    }

    public static /* synthetic */ boolean d(ContactItemDragAdapter contactItemDragAdapter, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1 && contactItemDragAdapter != null) {
            contactItemDragAdapter.notifyDataSetChanged();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ReleaseLogUtil.d("DEVMGR_ContactOrderbyActivity", "saveData() sort");
        if (this.e == null) {
            ReleaseLogUtil.e("DEVMGR_ContactOrderbyActivity", "mDeviceSettingsInteractors of saveData error null!");
            xjt.a("ContactOrderbyActivity saveData: mDeviceSettingsInteractors is null");
        } else {
            if (rcv.a(this.d).c() != 2) {
                qpx.e(this.d, R.string.IDS_device_not_connect);
            }
            this.e.d(this.d, this.f24693b, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.selectcontact.ContactOrderbyActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0 || ((Integer) obj).intValue() != 100000) {
                        LogUtil.e("ContactOrderbyActivity", "MESSAGE_ORDERBY_FAIL_COMMAND()!");
                        ContactOrderbyActivity.this.f24692a.sendEmptyMessage(2);
                    } else {
                        LogUtil.a("ContactOrderbyActivity", "MESSAGE_ORDERBY_SUCCESS_COMMAND()!");
                        ContactOrderbyActivity.this.f24692a.sendEmptyMessage(1);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f24694c.setRightButtonClickable(true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        qpx.e(this.d, R.string.IDS_settings_mult_alarm_clock_synchroFailed_dialog);
        this.f24694c.setRightButtonClickable(true);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f24692a;
        if (handler != null) {
            handler.removeMessages(1);
            this.f24692a.removeMessages(2);
            this.f24692a = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
