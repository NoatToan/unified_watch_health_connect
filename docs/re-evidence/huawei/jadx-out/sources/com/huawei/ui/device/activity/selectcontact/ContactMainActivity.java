package com.huawei.ui.device.activity.selectcontact;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huawei.datatype.Contact;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.views.selectcontact.ContactMainListAdapter;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.qzq;
import defpackage.rcv;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class ContactMainActivity extends BaseActivity implements View.OnClickListener, ActivityCompat.OnRequestPermissionsResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f24681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f24682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f24683c;
    private HealthTextView d;
    private ImageView e;
    private HealthButton f;
    private ContactMainListAdapter h;
    private HealthTextView j;
    private Context k;
    private String l;
    private DeviceSettingsInteractors o;
    private HealthToolBar p;
    private LinearLayout q;
    private ListView s;
    private LinearLayout t;
    private boolean n = false;
    private List<Contact> i = null;
    private long m = 0;
    private int r = 5;
    private Handler g = new a(this);

    class a extends Handler {
        WeakReference<ContactMainActivity> d;

        a(ContactMainActivity contactMainActivity) {
            this.d = new WeakReference<>(contactMainActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("ContactMainActivity", "handleMessage message is null");
                return;
            }
            if (this.d.get() == null) {
                LogUtil.j("ContactMainActivity", "handleMessage activity is null");
                return;
            }
            LogUtil.a("ContactMainActivity", "handleMessage message.what: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                ContactMainActivity.this.e();
                return;
            }
            if (i == 2) {
                ContactMainActivity.this.c();
                return;
            }
            if (i != 3) {
                LogUtil.j("ContactMainActivity", "handleMessage not support message:", Integer.valueOf(message.what));
            } else if (message.obj instanceof Boolean) {
                ContactMainActivity.this.c(((Boolean) message.obj).booleanValue());
            } else {
                LogUtil.j("ContactMainActivity", "handleMessage message.obj not instanceof Boolean");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("ContactMainActivity", "enter handleSetSuccess!");
        e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("ContactMainActivity", "enter handleSetFail!");
        qpx.e(this.k, R.string.IDS_settings_mult_alarm_clock_synchroFailed_dialog);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_device_settings_contact_main_activity_black);
        g();
        d(bundle);
    }

    private void g() {
        this.p = (HealthToolBar) findViewById(R.id.buttomview);
        View viewInflate = View.inflate(BaseApplication.getContext(), R.layout.activity_device_settings_contact_main_activity_black_bottomview, null);
        this.p.b(viewInflate);
        this.p.a(this);
        this.j = (HealthTextView) qsp.a(this, R.id.contact_main_null_tv);
        this.t = (LinearLayout) qsp.a(this, R.id.contact_main_listview_layout);
        this.q = (LinearLayout) qsp.a(this, R.id.contact_main_null_layout);
        this.f24682b = (LinearLayout) viewInflate.findViewById(R.id.contact_main_bottom_add_layout);
        this.f24681a = (LinearLayout) viewInflate.findViewById(R.id.contact_main_bottom_orderby_layout);
        this.f24683c = (LinearLayout) viewInflate.findViewById(R.id.contact_main_bottom_delete_layout);
        this.e = (ImageView) viewInflate.findViewById(R.id.contact_main_bottom_add_image);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.contact_main_bottom_add);
        this.f = (HealthButton) qsp.a(this, R.id.no_contact_add_button);
        this.f24682b.setOnClickListener(this);
        this.f24681a.setOnClickListener(this);
        this.f24683c.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (this.n) {
            f();
        } else {
            j();
        }
        if (z) {
            n();
        }
    }

    private void d(Bundle bundle) {
        this.k = getApplicationContext();
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(getApplicationContext());
        this.o = deviceSettingsInteractorsE;
        int iB = deviceSettingsInteractorsE.b(this.k);
        this.r = iB;
        LogUtil.a("ContactMainActivity", "initData mMaxContactNumber: ", Integer.valueOf(iB));
        if (bundle != null) {
            int i = bundle.getInt("maxContactNumber");
            this.r = i;
            ReleaseLogUtil.d("ContactMainActivity", "initData savedInstanceState mMaxContactNumber: ", Integer.valueOf(i));
        }
        if (this.r <= 0) {
            this.r = 5;
            LogUtil.j("ContactMainActivity", "initData get error mMaxContactNumber");
        }
        String strA = rcv.a(this.k).a();
        this.l = strA;
        if (TextUtils.isEmpty(strA) && bundle != null) {
            String string = bundle.getString("deviceName");
            this.l = string;
            ReleaseLogUtil.d("ContactMainActivity", "initData mDeviceName: ", CommonUtil.n(string));
        }
        e(false);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("deviceName", this.l);
        bundle.putInt("maxContactNumber", this.r);
    }

    private void e(final boolean z) {
        LogUtil.a("ContactMainActivity", "loadData");
        this.o.b(this.k, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ContactMainActivity contactMainActivity = ContactMainActivity.this;
                contactMainActivity.i = contactMainActivity.o.d(ContactMainActivity.this.k);
                if (ContactMainActivity.this.i == null || ContactMainActivity.this.i.isEmpty()) {
                    ContactMainActivity.this.n = false;
                    ContactMainActivity.this.i = new ArrayList(10);
                    LogUtil.a("ContactMainActivity", "loadDataWhenContactDatabaseNotHasData");
                } else {
                    ContactMainActivity.this.n = true;
                    LogUtil.a("ContactMainActivity", "loadDataWhenContactDatabaseHasData mContactTables: ", ContactMainActivity.this.i);
                }
                Message messageObtainMessage = ContactMainActivity.this.g.obtainMessage();
                messageObtainMessage.obj = Boolean.valueOf(z);
                messageObtainMessage.what = 3;
                ContactMainActivity.this.g.sendMessage(messageObtainMessage);
            }
        });
    }

    private void f() {
        ListView listView = (ListView) qsp.a(this, R.id.contact_main_listview);
        this.s = listView;
        if (listView != null) {
            listView.setSelector(R.drawable.device_settings_contact_listview_item_selector_black);
            this.h = new ContactMainListAdapter(this, this.i);
            LogUtil.a("ContactMainActivity", "loadViewWhenContactDatabaseHasData getFooterViewsCount size: ", Integer.valueOf(this.s.getFooterViewsCount()));
            if (this.s.getFooterViewsCount() == 0) {
                LogUtil.a("ContactMainActivity", "loadViewWhenContactDatabaseHasData getFooterViewsCount size is 0");
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.activity_device_settings_contact_main_listview_bottom_item_layout_black, (ViewGroup) null);
                ((HealthTextView) qsp.a(viewInflate, R.id.footer_tv)).setText(String.format(Locale.ROOT, getResources().getString(R.string.IDS_contact_most_introduce), this.l, UnitUtil.e(this.r, 1, 0)));
                this.s.addFooterView(viewInflate);
            }
            this.s.setAdapter((ListAdapter) this.h);
        }
        this.f.setVisibility(8);
        this.p.setVisibility(0);
        this.t.setVisibility(0);
        this.f24682b.setVisibility(0);
        if (this.i.size() > 1) {
            this.f24681a.setVisibility(0);
        } else {
            this.f24681a.setVisibility(8);
        }
        if (this.i.size() > this.r - 1) {
            this.e.setImageResource(R.mipmap.ic_add_disable);
            this.d.setTextColor(ContextCompat.getColor(this.k, R.color.textColorTertiary));
        } else {
            this.e.setImageResource(R.drawable.common_add_new_21);
            this.d.setTextColor(ContextCompat.getColorStateList(this.k, R.color.color_contact_selector));
        }
        this.f24683c.setVisibility(0);
        this.q.setVisibility(8);
    }

    private void j() {
        this.q.setVisibility(0);
        this.p.setVisibility(8);
        this.f24682b.setVisibility(8);
        this.t.setVisibility(8);
        this.f24681a.setVisibility(8);
        this.f24683c.setVisibility(8);
        this.f.setVisibility(0);
        this.j.setText(String.format(Locale.ROOT, getResources().getString(R.string.IDS_contact_no_contact_introduce), this.l));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (i()) {
            return;
        }
        int id = view.getId();
        if (id == R.id.contact_main_bottom_add_layout) {
            LogUtil.a("03", 1, "ContactMainActivity", "contact_main_bottom_add_layout");
            h();
            return;
        }
        if (id == R.id.contact_main_bottom_orderby_layout) {
            LogUtil.a("ContactMainActivity", "contact_main_bottom_orderby_layout");
            k();
            return;
        }
        if (id == R.id.contact_main_bottom_delete_layout) {
            LogUtil.a("03", 1, "ContactMainActivity", "contact_main_bottom_delete_layout");
            o();
            HashMap map = new HashMap(16);
            map.put("click", "1");
            map.put("status", "delete");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010031.value(), map, 0);
            return;
        }
        if (id == R.id.no_contact_add_button) {
            LogUtil.a("03", 1, "ContactMainActivity", "no_contact_add_button");
            h();
            HashMap map2 = new HashMap(16);
            map2.put("click", "1");
            map2.put("status", "add");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010031.value(), map2, 0);
            return;
        }
        LogUtil.j("ContactMainActivity", "viewId: ", Integer.valueOf(id));
    }

    private boolean i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.m < 1000) {
            LogUtil.a("ContactMainActivity", "isClickFast click too much");
            this.m = jCurrentTimeMillis;
            return true;
        }
        this.m = jCurrentTimeMillis;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        List<Contact> list = this.i;
        if (list == null) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "startAddContactActivity mContactTables is null");
            xjt.a("ContactMainActivity startAddContactActivity: mContactTables is null");
            return;
        }
        int size = list.size();
        int i = this.r;
        if (size >= i) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "startAddContactActivity mMaxContactNumber: ", Integer.valueOf(i));
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            Contact contact = this.i.get(i2);
            arrayList.add(contact.getName() + contact.getPhoneNumbers().get(0).getPhoneNumber());
        }
        int size2 = this.r - this.i.size();
        if (z) {
            Intent intent = new Intent(this.k, (Class<?>) ContactSelectActivity.class);
            intent.putExtra("com.huawei.community.action.MAX_SELECT_COUNT", size2);
            intent.putExtra("com.huawei.community.action.OLD_CONTACTS", arrayList);
            startActivityForResult(intent, 1);
            return;
        }
        Intent intent2 = new Intent(this.k, (Class<?>) ContactPermissionActivity.class);
        intent2.putExtra("com.huawei.community.action.MAX_SELECT_COUNT", size2);
        startActivityForResult(intent2, 2);
    }

    private void h() {
        List<Contact> list = this.i;
        if (list == null) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "requestPermissions mContactTables is null");
            xjt.a("ContactMainActivity requestPermissions: mContactTables is null");
            return;
        }
        int size = list.size();
        int i = this.r;
        if (size >= i) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "requestPermissions mMaxContactNumber: ", Integer.valueOf(i));
        } else {
            PermissionUtil.d(this, PermissionUtil.PermissionType.READ_CONTACT, new CustomPermissionAction(this.k) { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.5
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    ContactMainActivity.this.b(true);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    LogUtil.j("ContactMainActivity", "requestPermissions isContactPermission and isCallLogPermission onDenied");
                    if (CommonUtil.bh()) {
                        ContactMainActivity.this.d();
                    } else {
                        ContactMainActivity.this.b();
                    }
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.j("ContactMainActivity", "requestPermissions isContactPermission and isCallLogPermission onForeverDenied");
                    if (CommonUtil.bh()) {
                        ContactMainActivity.this.d();
                    } else {
                        ContactMainActivity.this.b();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        View viewInflate = View.inflate(this, R.layout.dialog_contact_permission_layout, null);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.a(viewInflate).b((String) null).d(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("ContactMainActivity", "gotoSettingPermission go setting");
                qzq.b(ContactMainActivity.this, 3);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("ContactMainActivity", "gotoSettingPermission go add");
                ContactMainActivity.this.b(false);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.a(R.string.IDS_hwh_home_other_permissions_title).b(R.string.IDS_contact_have_no_permission_to_read_health).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ContactMainActivity", "gotoSettingPermissionOtherPhone go setting");
                qzq.b(ContactMainActivity.this, 3);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ContactMainActivity", "gotoSettingPermissionOtherPhone go add");
                ContactMainActivity.this.b(false);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void k() {
        if (CollectionUtils.a(this.i)) {
            LogUtil.j("ContactMainActivity", "startOrderByContactActivity mContactTables is null");
            qpx.e(this.k, R.string.IDS_contact_reach_min_contact_count);
        } else {
            Intent intent = new Intent();
            intent.setClass(this.k, ContactOrderbyActivity.class);
            startActivity(intent);
        }
    }

    private void o() {
        if (this.i.isEmpty()) {
            qpx.e(this.k, R.string.IDS_contact_reach_min_contact_count);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(this.k, ContactDeleteActivity.class);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "onActivityResult data is null");
            return;
        }
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("DEVMGR_ContactMainActivity", "onActivityResult requestCode:", Integer.valueOf(i), " resultCode:", Integer.valueOf(i2));
        if (i != 1 && i != 2) {
            LogUtil.j("ContactMainActivity", "onActivityResult not support requestCode:", Integer.valueOf(i));
            return;
        }
        if (!(intent instanceof List)) {
            LogUtil.j("ContactMainActivity", "onActivityResult SYSTEM_CONTACT_ACTIVITY data not instanceof List");
        }
        List list = intent.getSerializableExtra(JsUtil.ServiceType.DATA) instanceof List ? (List) intent.getSerializableExtra(JsUtil.ServiceType.DATA) : null;
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "onActivityResult SYSTEM_CONTACT_ACTIVITY resultList is null or empty");
            xjt.a("ContactMainActivity onActivityResult: resultList is null or empty");
        } else if (this.i != null) {
            ReleaseLogUtil.d("DEVMGR_ContactMainActivity", "onActivityResult SYSTEM_CONTACT_ACTIVITY mContactTables not null");
            this.i.addAll(list);
            a();
        }
    }

    private void n() {
        HashMap map = new HashMap(16);
        List<Contact> list = this.i;
        if (list != null) {
            map.put("contact_num", Integer.valueOf(list.size()));
        } else {
            LogUtil.j("ContactMainActivity", "sendContactBiEvent mContactTables is null!");
        }
        lmf.d().c(this.k, AnalyticsValue.SETTING_CONTACT_1090033.value(), map, 0);
    }

    public void a() {
        ReleaseLogUtil.d("DEVMGR_ContactMainActivity", "sendToDevice mContactTables size is ", Integer.valueOf(this.i.size()));
        if (this.o == null) {
            ReleaseLogUtil.e("DEVMGR_ContactMainActivity", "sendToDevice mDeviceSettingsInteractors is null");
            xjt.a("ContactMainActivity sendToDevice: mDeviceSettingsInteractors is null");
        } else {
            if (rcv.a(this.k).c() != 2) {
                l();
            }
            this.o.d(this.k, this.i, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.selectcontact.ContactMainActivity.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof Integer)) {
                        LogUtil.j("ContactMainActivity", "sendToDevice objectData not instanceof Integer");
                        return;
                    }
                    if (i == 0 && ((Integer) obj).intValue() == 100000) {
                        LogUtil.a("ContactMainActivity", "sendToDevice MESSAGE_ADD_SUCCESS_COMMAND");
                        ContactMainActivity.this.g.sendEmptyMessage(1);
                    } else {
                        LogUtil.a("ContactMainActivity", "sendToDevice MESSAGE_ADD_FAIL_COMMAND");
                        ContactMainActivity.this.g.sendEmptyMessage(2);
                    }
                }
            });
        }
    }

    private void l() {
        ReleaseLogUtil.d("DEVMGR_ContactMainActivity", "showNoConnectedToast()");
        qpx.e(this.k, R.string.IDS_device_not_connect);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("ContactMainActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        e(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CommonUtil.d(this.k);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
