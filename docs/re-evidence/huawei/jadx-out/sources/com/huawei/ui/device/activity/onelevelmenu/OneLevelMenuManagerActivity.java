package com.huawei.ui.device.activity.onelevelmenu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.MenuDragItemTouchHelperCallback;
import com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.MenuDragListAdapter;
import com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.RefreshUiCallback;
import defpackage.lmf;
import defpackage.ltc;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rcx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class OneLevelMenuManagerActivity extends BaseActivity implements RefreshUiCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f24574a;
    private LinearLayout ac;
    private Context f;
    private LinearLayout g;
    private DeviceSettingsInteractors h;
    private CustomTitleBar j;
    private HealthRecycleView k;
    private HealthDivider l;
    private HealthProgressBar m;
    private HealthScrollView n;
    private LinearLayout p;
    private HealthButton s;
    private LinearLayout t;
    private ImageView u;
    private NoTitleCustomAlertDialog w;
    private rcx y;
    private HealthToolBar z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, byte[]> f24575b = new HashMap(16);
    private MenuDragListAdapter d = null;
    private ArrayList<Integer> r = null;
    private ArrayList<Integer> e = null;
    private ArrayList<Integer> q = null;
    private boolean o = false;
    private String i = "";
    private ArrayList<Integer> x = new ArrayList<>(10);
    private HealthToolBar.OnSingleTapListener ab = new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.4
        @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
        public void onSingleTap(int i) {
            if (i != 2) {
                return;
            }
            OneLevelMenuManagerActivity.this.d();
        }
    };
    private Handler v = new a(this);
    private View.OnClickListener aa = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("OneLevelMenuManagerActivity", "=retry");
            OneLevelMenuManagerActivity.this.v.sendEmptyMessage(2);
            OneLevelMenuManagerActivity.this.v.sendEmptyMessageDelayed(3, 5000L);
            OneLevelMenuManagerActivity.this.c();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f24576c = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("OneLevelMenuManagerActivity", "addView");
            OneLevelMenuManagerActivity.this.d();
        }
    };

    class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<OneLevelMenuManagerActivity> f24582b;

        a(OneLevelMenuManagerActivity oneLevelMenuManagerActivity) {
            this.f24582b = new WeakReference<>(oneLevelMenuManagerActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f24582b.get() == null) {
                return;
            }
            LogUtil.a("OneLevelMenuManagerActivity", "Enter handleMessage():", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                OneLevelMenuManagerActivity.this.k();
                return;
            }
            if (i == 2) {
                OneLevelMenuManagerActivity.this.o = false;
                OneLevelMenuManagerActivity.this.b(true);
                OneLevelMenuManagerActivity.this.j.setRightButtonClickable(false);
                return;
            }
            if (i == 3) {
                OneLevelMenuManagerActivity.this.a(true);
                OneLevelMenuManagerActivity.this.o = true;
                OneLevelMenuManagerActivity.this.j.setRightButtonClickable(false);
            } else {
                if (i == 4) {
                    OneLevelMenuManagerActivity.this.b(false);
                    OneLevelMenuManagerActivity.this.a(false);
                    OneLevelMenuManagerActivity.this.o = false;
                    OneLevelMenuManagerActivity.this.j.setRightButtonClickable(true);
                    return;
                }
                if (i == 5) {
                    OneLevelMenuManagerActivity.this.d.c(OneLevelMenuManagerActivity.this.r);
                    OneLevelMenuManagerActivity.this.d.notifyDataSetChanged();
                    OneLevelMenuManagerActivity.this.k();
                    OneLevelMenuManagerActivity.this.f();
                    return;
                }
                LogUtil.e("OneLevelMenuManagerActivity", "not support message:", Integer.valueOf(message.what));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_one_level_menu_activity);
        b();
        i();
    }

    private void b() {
        this.f = this;
        this.h = DeviceSettingsInteractors.e(this);
        this.y = rcx.c();
        this.r = new ArrayList<>(10);
        this.e = new ArrayList<>(10);
        this.q = new ArrayList<>(10);
        LogUtil.a("OneLevelMenuManagerActivity", "mContactTables size = ", Integer.valueOf(this.r.size()));
        Intent intent = getIntent();
        if (intent != null) {
            this.i = intent.getStringExtra("device_id");
        }
    }

    private void i() {
        this.z = (HealthToolBar) qsp.a(this, R.id.one_level_menu_add_bottom_toolbar);
        this.z.d(View.inflate(this.f, R.layout.hw_toolbar_bottomview, null));
        this.z.setIconVisible(3, 8);
        this.z.setIconVisible(1, 8);
        this.z.setIcon(2, R.drawable.ic_addition_create_group);
        this.z.setIconTitle(2, this.f.getResources().getString(R.string.IDS_contact_add));
        this.z.a(this);
        this.z.setOnSingleTapListener(this.ab);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.one_level_menu_titlebar);
        this.j = customTitleBar;
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("OneLevelMenuManagerActivity", "=setRightButtonOnClickListener click right response");
                if (OneLevelMenuManagerActivity.this.y.a()) {
                    return;
                }
                OneLevelMenuManagerActivity.this.j();
                OneLevelMenuManagerActivity.this.finish();
            }
        });
        this.j.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("OneLevelMenuManagerActivity", "=setRightButtonOnClickListener click left response");
                OneLevelMenuManagerActivity.this.a();
            }
        });
        ((HealthTextView) qsp.a(this, R.id.text_1)).setText(ltc.c(1.0d, 1, 0) + ". " + this.f.getResources().getString(R.string.IDS_settings_one_level_menu_settings_bottom_text1));
        ((HealthTextView) qsp.a(this, R.id.text_2)).setText(ltc.c(2.0d, 1, 0) + ". " + this.f.getResources().getString(R.string.IDS_settings_one_level_menu_settings_bottom_text2));
        this.f24574a = (LinearLayout) qsp.a(this, R.id.one_level_menu_add_bottom_no_content_layout);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.disagree);
        this.s = healthButton;
        healthButton.setOnClickListener(this.f24576c);
        this.g = (LinearLayout) qsp.a(this, R.id.one_level_menu_bottom_textview);
        this.p = (LinearLayout) qsp.a(this, R.id.one_level_menu_loading_view);
        HealthProgressBar healthProgressBar = (HealthProgressBar) qsp.a(this, R.id.one_level_menu_loading_image);
        this.m = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        this.l = (HealthDivider) qsp.a(this, R.id.drag_item_divider);
        m();
        c();
    }

    private void m() {
        this.ac = (LinearLayout) qsp.a(this, R.id.one_level_menu_retry_view);
        this.n = (HealthScrollView) qsp.a(this, R.id.one_level_menu_listview);
        this.t = (LinearLayout) qsp.a(this, R.id.one_level_menu_no_content_view);
        ImageView imageView = (ImageView) qsp.a(this, R.id.one_level_menu_retry_image);
        this.u = imageView;
        imageView.setOnClickListener(this.aa);
        LogUtil.a("OneLevelMenuManagerActivity", "mOneMenuHandler=", this.v);
        this.k = (HealthRecycleView) qsp.a(this, R.id.one_level_menu_drag_list);
        this.v.sendEmptyMessage(2);
        this.v.sendEmptyMessageDelayed(3, 5000L);
        e();
    }

    private void e() {
        this.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.9
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 1 && OneLevelMenuManagerActivity.this.d != null) {
                    OneLevelMenuManagerActivity.this.d.notifyDataSetChanged();
                }
                return false;
            }
        });
        this.d = new MenuDragListAdapter(this.f, this.r, this);
        this.k.setLayoutManager(new LinearLayoutManager(this.f));
        this.k.setAdapter(this.d);
        this.k.b(false);
        this.k.e(false);
        new ItemTouchHelper(new MenuDragItemTouchHelperCallback(this.d)).attachToRecyclerView(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("OneLevelMenuManagerActivity", "Enter dealBackButton");
        LogUtil.a("OneLevelMenuManagerActivity", "Enter dealBackButton mMenuTables", this.r);
        LogUtil.a("OneLevelMenuManagerActivity", "Enter dealBackButton mMenuItemFromBandTables", this.q);
        if (!njy.c(this.r, this.q, true)) {
            n();
        } else {
            finish();
        }
    }

    private void n() {
        LogUtil.a("OneLevelMenuManagerActivity", "showPromptSaveDialog()");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_alarm_settings_save_changes).a(this.f.getResources().getString(R.string.IDS_save).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("OneLevelMenuManagerActivity", "showPromptSaveDialog() Yes ...");
                OneLevelMenuManagerActivity.this.w.cancel();
                OneLevelMenuManagerActivity.this.g();
                OneLevelMenuManagerActivity.this.finish();
            }
        }).d(this.f.getResources().getString(R.string.IDS_btn_discard).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneLevelMenuManagerActivity.this.w.cancel();
                OneLevelMenuManagerActivity.this.finish();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.w = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.w.isShowing()) {
            return;
        }
        this.w.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ArrayList<Integer> arrayList = this.r;
        if (arrayList != null && arrayList.size() > 0) {
            LogUtil.e("OneLevelMenuManagerActivity", "get null DBdata, the activity will be shut down!");
            this.g.setVisibility(0);
            this.l.setVisibility(0);
            this.t.setVisibility(8);
            this.f24574a.setVisibility(8);
            this.z.setVisibility(0);
            return;
        }
        this.g.setVisibility(8);
        this.l.setVisibility(8);
        this.t.setVisibility(0);
        this.f24574a.setVisibility(0);
        this.z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Intent intent = new Intent();
        intent.setClass(this.f, OneLevelMenuAddActivity.class);
        intent.putIntegerArrayListExtra("intent_to_next_all_list", this.e);
        intent.putIntegerArrayListExtra("intent_to_next_open_list", this.r);
        LogUtil.a("OneLevelMenuManagerActivity", "mMenuTables=", this.r);
        LogUtil.a("OneLevelMenuManagerActivity", "mAllList=", this.e);
        startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("OneLevelMenuManagerActivity", "saveData() data mContactTables = ", this.r);
        if (this.h == null) {
            LogUtil.a("OneLevelMenuManagerActivity", "mDeviceSettingsInteractors of saveData error null!");
            return;
        }
        if (rcv.a(this.f).a(this.i) != 2) {
            qpx.e(this.f, R.string.IDS_music_management_disconnection);
        }
        LogUtil.a("OneLevelMenuManagerActivity", "=mOneLevelMenuInteractor.isListEqual(mMenuTables,mMenuItemFromBandTables)", Boolean.valueOf(njy.c(this.r, this.q, true)));
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("OneLevelMenuManagerActivity", "onDestroy");
        super.onDestroy();
        h();
    }

    private void h() {
        Handler handler = this.v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.device.views.onelevelmenu.dragonelevelsortlistview.RefreshUiCallback
    public void refreshUi() {
        this.v.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        LogUtil.a("OneLevelMenuManagerActivity", "showLoadingView isShow", Boolean.valueOf(z));
        if (z) {
            this.g.setVisibility(8);
            this.n.setVisibility(8);
            this.ac.setVisibility(8);
            this.p.setVisibility(0);
            this.z.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        this.n.setVisibility(0);
        this.ac.setVisibility(8);
        this.p.setVisibility(8);
        this.z.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("OneLevelMenuManagerActivity", "showRetryView isShow=");
        if (z) {
            this.g.setVisibility(8);
            this.n.setVisibility(8);
            this.ac.setVisibility(0);
            this.p.setVisibility(8);
            this.z.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
        this.n.setVisibility(0);
        this.ac.setVisibility(8);
        this.p.setVisibility(8);
        this.z.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.e == null || this.r == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.e.clone() instanceof ArrayList) {
            arrayList = (ArrayList) this.e.clone();
        }
        arrayList.removeAll(this.r);
        HashMap map = new HashMap(16);
        if (arrayList.size() == 0) {
            map.put("delete_fun", -1);
        } else {
            map.put("delete_fun", arrayList.toString());
        }
        if (this.r.size() > 0) {
            for (int i = 0; i < this.r.size() && i <= 2; i++) {
                if (i == 0) {
                    map.put("first", this.r.get(0));
                } else if (i == 1) {
                    map.put("second", this.r.get(1));
                } else if (i == 2) {
                    map.put("third", this.r.get(2));
                } else {
                    LogUtil.a("OneLevelMenuManagerActivity", "sendCustomFunEvent default i::", Integer.valueOf(i));
                }
            }
        }
        LogUtil.a("OneLevelMenuManagerActivity", "sendCustomFunEvent, ", map.toString());
        lmf.d().c(this.f, AnalyticsValue.SETTING_CUSTOM_FUNCTION_1090034.value(), map, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("OneLevelMenuManagerActivity", "requestCode=", Integer.valueOf(i), "， resultCode=", Integer.valueOf(i2));
        if (i2 != 1) {
            return;
        }
        LogUtil.a("OneLevelMenuManagerActivity", "mMenuTables fromnext mMenuTables is ", this.r);
        try {
            this.r.addAll(intent.getIntegerArrayListExtra("intent_from_next_open_list"));
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.a("OneLevelMenuManagerActivity", "ArrayIndexOutOfBoundsException occur message is ", e.getMessage());
        }
        this.v.sendEmptyMessage(5);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            a();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("OneLevelMenuManagerActivity", "Enter sendDataToBand");
        ArrayList<Integer> arrayList = this.x;
        if (arrayList != null && arrayList.size() > 0) {
            this.r.addAll(this.x);
        }
        this.h.a(this.f, this.i, this.r, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("OneLevelMenuManagerActivity", "sendDataToBand err_code=", Integer.valueOf(i), "objData=", obj);
            }
        });
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("OneLevelMenuManagerActivity", "Enter getDataFromBand()");
        this.h.d(this.f, this.i, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuManagerActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("OneLevelMenuManagerActivity", "getDataFromBand mIsTimeout=", Boolean.valueOf(OneLevelMenuManagerActivity.this.o));
                OneLevelMenuManagerActivity.this.v.removeMessages(3);
                if (OneLevelMenuManagerActivity.this.o) {
                    return;
                }
                LogUtil.a("OneLevelMenuManagerActivity", "getDataFromBand err_code=", Integer.valueOf(i), "objData=", obj);
                if (i == 0) {
                    LogUtil.a("OneLevelMenuManagerActivity", "Enter getDataFromBand():mOneMenuHandler=", OneLevelMenuManagerActivity.this.v);
                    if (obj instanceof Map) {
                        OneLevelMenuManagerActivity.this.f24575b = (Map) obj;
                    }
                    byte[] bArr = OneLevelMenuManagerActivity.this.f24575b.get("all");
                    if (bArr == null) {
                        return;
                    }
                    OneLevelMenuManagerActivity.this.e.clear();
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        if (OneLevelMenuManagerActivity.this.y.c(OneLevelMenuManagerActivity.this.y.d(bArr[i2]))) {
                            OneLevelMenuManagerActivity.this.e.add(Integer.valueOf(OneLevelMenuManagerActivity.this.y.d(bArr[i2])));
                        }
                    }
                    OneLevelMenuManagerActivity.this.o();
                    LogUtil.a("OneLevelMenuManagerActivity", "getDataFromBand mMenuTables=", OneLevelMenuManagerActivity.this.r, "mMenuItemFromBandTables=", OneLevelMenuManagerActivity.this.q);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("OneLevelMenuManagerActivity", "getDataFromBand mAllList=", this.e);
        byte[] bArr = this.f24575b.get("open");
        if (bArr == null) {
            return;
        }
        this.r.clear();
        this.q.clear();
        for (int i = 0; i < bArr.length; i++) {
            rcx rcxVar = this.y;
            if (!rcxVar.c(rcxVar.d(bArr[i]))) {
                this.x.add(Integer.valueOf(this.y.d(bArr[i])));
            } else {
                this.r.add(Integer.valueOf(this.y.d(bArr[i])));
                this.q.add(Integer.valueOf(this.y.d(bArr[i])));
            }
        }
        this.v.sendEmptyMessage(4);
        this.v.sendEmptyMessage(5);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
