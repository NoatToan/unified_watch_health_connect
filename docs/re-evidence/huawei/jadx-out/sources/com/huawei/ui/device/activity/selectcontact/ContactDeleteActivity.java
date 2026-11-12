package com.huawei.ui.device.activity.selectcontact;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import com.huawei.datatype.Contact;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.views.selectcontact.ContactDeleteListAdapter;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.xjt;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ContactDeleteActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f24677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    NoTitleCustomAlertDialog f24678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<Contact> f24679c;
    ContactDeleteListAdapter d;
    DeviceSettingsInteractors e;
    private HealthTextView f;
    private HealthTextView g;
    private LinearLayout h;
    private ImageView i;
    private ImageView j;
    private int k;
    private CustomTitleBar l;
    private long m = 0;
    private Handler n = new e(this);
    private Context o;
    private ListView p;
    private HealthToolBar s;

    static /* synthetic */ int c(ContactDeleteActivity contactDeleteActivity) {
        int i = contactDeleteActivity.k;
        contactDeleteActivity.k = i + 1;
        return i;
    }

    static /* synthetic */ int i(ContactDeleteActivity contactDeleteActivity) {
        int i = contactDeleteActivity.k;
        contactDeleteActivity.k = i - 1;
        return i;
    }

    class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<ContactDeleteActivity> f24680a;

        e(ContactDeleteActivity contactDeleteActivity) {
            this.f24680a = new WeakReference<>(contactDeleteActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f24680a.get() == null) {
                return;
            }
            LogUtil.a("ContactDeleteActivity", "Enter handleMessage():" + message.what);
            int i = message.what;
            if (i == 1) {
                ContactDeleteActivity.this.a();
                return;
            }
            if (i == 2) {
                ContactDeleteActivity.this.c();
            } else {
                if (i == 3) {
                    ContactDeleteActivity.this.b();
                    return;
                }
                LogUtil.a("ContactDeleteActivity", "do not support message:" + message.what);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("ContactDeleteActivity", "enter handleSetSuccess");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("ContactDeleteActivity", "enter handleSetFail");
        qpx.e(this.o, R.string.IDS_settings_mult_alarm_clock_synchroFailed_dialog);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_settings_contact_delete_activity_black);
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.n;
        if (handler != null) {
            handler.removeMessages(1);
            this.n.removeMessages(2);
            this.n = null;
        }
    }

    private void d() {
        Context applicationContext = getApplicationContext();
        this.o = applicationContext;
        this.k = 0;
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(applicationContext);
        this.e = deviceSettingsInteractorsE;
        List<Contact> listD = deviceSettingsInteractorsE.d(this.o);
        this.f24679c = listD;
        if (listD == null || listD.size() == 0) {
            LogUtil.e("ContactDeleteActivity", "error ContactDB, get null DB, the activity will be finished!");
            return;
        }
        LogUtil.a("ContactDeleteActivity", "mContactTables size = " + this.f24679c.size());
        Message messageObtainMessage = this.n.obtainMessage();
        messageObtainMessage.what = 3;
        this.n.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.s = (HealthToolBar) findViewById(R.id.buttomview);
        View viewInflate = View.inflate(BaseApplication.getContext(), R.layout.activity_device_settings_contact_delete_activity_black_bottomview, null);
        this.s.b(viewInflate);
        this.s.a(this);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.contact_delete_bottom_delete_layout);
        this.f24677a = linearLayout;
        linearLayout.setOnClickListener(this);
        this.i = (ImageView) viewInflate.findViewById(R.id.contact_remove_img);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.contact_remove_txt);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.contact_delete_bottom_seleteall_layout);
        this.h = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.j = (ImageView) viewInflate.findViewById(R.id.contact_delete_bottom_seleteall_img);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.contact_delete_bottom_seleteall_textview);
        this.l = (CustomTitleBar) qsp.a(this, R.id.contact_delete_titlebar);
        b(0);
        ListView listView = (ListView) qsp.a(this, R.id.contact_delete_listview);
        this.p = listView;
        listView.setSelector(R.drawable.device_settings_contact_listview_item_selector_black);
        ContactDeleteListAdapter contactDeleteListAdapter = new ContactDeleteListAdapter(this.o, this.f24679c);
        this.d = contactDeleteListAdapter;
        this.p.setAdapter((ListAdapter) contactDeleteListAdapter);
        this.p.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactDeleteActivity.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ContactDeleteListAdapter.c cVar = view.getTag() instanceof ContactDeleteListAdapter.c ? (ContactDeleteListAdapter.c) view.getTag() : null;
                if (cVar == null) {
                    LogUtil.e("ContactDeleteActivity", "holder == null");
                    return;
                }
                LogUtil.a("ContactDeleteActivity", "ContactDeleteListAdapter ViewHolder = " + cVar);
                cVar.e.toggle();
                ContactDeleteListAdapter.d().put(Integer.valueOf(i), Boolean.valueOf(cVar.e.isChecked()));
                LogUtil.a("ContactDeleteActivity", "position = ", Integer.valueOf(i), "checkBox.isChecked() = ", Boolean.valueOf(cVar.e.isChecked()));
                LogUtil.a("ContactDeleteActivity", "ContactDeleteListAdapter map = " + ContactDeleteListAdapter.d());
                if (cVar.e.isChecked()) {
                    ContactDeleteActivity.c(ContactDeleteActivity.this);
                } else {
                    ContactDeleteActivity.i(ContactDeleteActivity.this);
                }
                LogUtil.a("ContactDeleteActivity", "mCheckNum = " + ContactDeleteActivity.this.k);
                ContactDeleteActivity contactDeleteActivity = ContactDeleteActivity.this;
                contactDeleteActivity.b(contactDeleteActivity.k);
                if (ContactDeleteActivity.this.k == ContactDeleteActivity.this.f24679c.size()) {
                    ContactDeleteActivity.this.h();
                } else {
                    ContactDeleteActivity.this.k();
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.contact_delete_bottom_delete_layout) {
            LogUtil.a("ContactDeleteActivity", "contact_delete_bottom_delete_layout");
            if (i()) {
                return;
            }
            if (this.k == 0) {
                LogUtil.a("ContactDeleteActivity", "onClick() contact_delete_bottom_delete_layout if (mCheckNum == 0)");
                return;
            } else {
                m();
                return;
            }
        }
        if (id == R.id.contact_delete_bottom_seleteall_layout) {
            LogUtil.a("ContactDeleteActivity", "contact_delete_bottom_seleteall_layout");
            e();
        } else {
            LogUtil.a("ContactDeleteActivity", "i = " + id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i != 0) {
            this.l.setTitleText(getResources().getQuantityString(R.plurals.IDS_hw_weight_delete_check_measure_data, 1, Integer.valueOf(i)));
            this.i.setImageResource(R.drawable.ic_contact_remove);
            this.g.setTextColor(ContextCompat.getColorStateList(this.o, R.color.color_contact_selector));
        } else {
            this.l.setTitleText(getString(R.string.IDS_hw_show_main_health_page_healthdata_selectNone));
            this.i.setImageResource(R.drawable.ic_contact_remove_disable);
            this.g.setTextColor(ContextCompat.getColor(this.o, R.color.textColorTertiary));
        }
    }

    private void e() {
        LogUtil.a("ContactDeleteActivity", "handleSelectAll mCheckNum=" + this.k);
        if (this.k == this.f24679c.size()) {
            g();
        } else {
            j();
        }
        b(this.k);
    }

    private void g() {
        for (int i = 0; i < this.f24679c.size(); i++) {
            ContactDeleteListAdapter.d().put(Integer.valueOf(i), false);
        }
        this.k = 0;
        this.d.notifyDataSetChanged();
        k();
    }

    private void j() {
        for (int i = 0; i < this.f24679c.size(); i++) {
            ContactDeleteListAdapter.d().put(Integer.valueOf(i), true);
        }
        this.k = this.f24679c.size();
        this.d.notifyDataSetChanged();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f.setText(R.string.IDS_contact_delete_select_all);
        this.j.setImageDrawable(getResources().getDrawable(R.drawable.common_selectall_new_21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f.setText(R.string.IDS_contact_delete_uncheck_all);
        this.j.setImageDrawable(getResources().getDrawable(R.drawable.common_desselectall_new_21));
    }

    private void m() {
        Resources resources = getResources();
        int i = R.plurals.IDS_settings_gemini_contact_delete_confirm;
        int i2 = this.k;
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(resources.getQuantityString(i, i2, UnitUtil.e(i2, 1, 0))).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactDeleteActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).a(getResources().getString(R.string.IDS_common_remove_text).toUpperCase(Locale.ENGLISH), R.color.common_dialog_red_btn_color, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactDeleteActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ContactDeleteActivity.this.f();
            }
        }).c();
        this.f24678b = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        int size = this.f24679c.size();
        ReleaseLogUtil.d("DEVMGR_ContactDeleteActivity", "saveData() delete data before mContactTables size :", Integer.valueOf(size));
        LogUtil.a("ContactDeleteActivity", "map=" + ContactDeleteListAdapter.d());
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            LogUtil.a("ContactDeleteActivity", "mContactTables i=" + size);
            if (ContactDeleteListAdapter.d().get(Integer.valueOf(size)).booleanValue()) {
                LogUtil.a("ContactDeleteActivity", "getIsSelected i=" + size + " is selected!");
                this.f24679c.remove(size);
            }
        }
        this.d.notifyDataSetChanged();
        List<Contact> list = this.f24679c;
        ReleaseLogUtil.d("DEVMGR_ContactDeleteActivity", "saveData() delete data after mContactTables ", list == null ? Constants.NULL : Integer.valueOf(list.size()));
        if (this.e == null) {
            ReleaseLogUtil.e("DEVMGR_ContactDeleteActivity", "mDeviceSettingsInteractors of saveData error null!");
            xjt.a("ContactDeleteActivity saveData: mDeviceSettingsInteractors is null");
        } else {
            if (rcv.a(this.o).c() != 2) {
                qpx.e(this.o, R.string.IDS_device_not_connect);
            }
            this.e.d(this.o, this.f24679c, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.selectcontact.ContactDeleteActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0 || ((Integer) obj).intValue() != 100000) {
                        LogUtil.e("ContactDeleteActivity", "MESSAGE_DELETE_FAIL_COMMAND()!");
                        ContactDeleteActivity.this.n.sendEmptyMessage(2);
                    } else {
                        LogUtil.a("ContactDeleteActivity", "MESSAGE_DELETE_SUCCESS_COMMAND()!");
                        ContactDeleteActivity.this.n.sendEmptyMessage(1);
                    }
                }
            });
        }
    }

    private boolean i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (1000 > jCurrentTimeMillis - this.m) {
            LogUtil.a("ContactDeleteActivity", "onClick", "click too much");
            this.m = jCurrentTimeMillis;
            return true;
        }
        this.m = jCurrentTimeMillis;
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
