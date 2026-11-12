package com.huawei.ui.device.activity.onelevelmenu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.onelevelmenu.OneLevelMenuAddListAdapter;
import defpackage.qsp;
import defpackage.rcx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class OneLevelMenuAddActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f24570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f24571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Integer> f24572c;
    private Context d;
    private ArrayList<Integer> e;
    private LinearLayout f;
    private OneLevelMenuAddListAdapter g;
    private ListView h;
    private rcx i;
    private ArrayList<Integer> j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_one_level_add_menu_layout);
        e();
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    private void e() {
        this.d = getApplicationContext();
        this.i = rcx.c();
        if (getIntent() != null) {
            try {
                this.f24572c = getIntent().getIntegerArrayListExtra("intent_to_next_all_list");
                this.j = getIntent().getIntegerArrayListExtra("intent_to_next_open_list");
            } catch (ArrayIndexOutOfBoundsException e) {
                LogUtil.a("OneLevelMenuAddActivity", "ArrayIndexOutOfBoundsException occur message is ", e.getMessage());
            }
        }
        ArrayList<Integer> arrayList = this.f24572c;
        if (arrayList == null) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.j;
        if (arrayList2 == null) {
            this.e = arrayList;
            return;
        }
        LogUtil.a("OneLevelMenuAddActivity", "mAllItemTables:", arrayList, "mMenuItemTables:", arrayList2);
        this.e = rcx.c().b(this.j, this.f24572c);
        LogUtil.a("OneLevelMenuAddActivity", "mContactTables size = ", Integer.valueOf(this.j.size()));
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.one_level_add_menu_titlebar);
        this.f24570a = customTitleBar;
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuAddActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                OneLevelMenuAddActivity.this.f24570a.setRightButtonClickable(true);
                OneLevelMenuAddActivity.this.b();
            }
        });
        this.f = (LinearLayout) qsp.a(this, R.id.one_level_add_menu_no_content_view);
        this.f24571b = (LinearLayout) qsp.a(this, R.id.one_level_add_menu_layout);
        this.h = (ListView) qsp.a(this, R.id.one_level_add_menu_listview);
        ArrayList<Integer> arrayList = this.e;
        if (arrayList != null && arrayList.size() > 0) {
            a(false);
            LogUtil.a("OneLevelMenuAddActivity", "mDuplicateListItemTables", this.e);
            this.h.setSelector(R.drawable.device_settings_contact_listview_item_selector_black);
            OneLevelMenuAddListAdapter oneLevelMenuAddListAdapter = new OneLevelMenuAddListAdapter(this.d, this.e);
            this.g = oneLevelMenuAddListAdapter;
            this.h.setAdapter((ListAdapter) oneLevelMenuAddListAdapter);
            this.h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.onelevelmenu.OneLevelMenuAddActivity.5
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    OneLevelMenuAddListAdapter.d dVar = view.getTag() instanceof OneLevelMenuAddListAdapter.d ? (OneLevelMenuAddListAdapter.d) view.getTag() : null;
                    if (dVar == null) {
                        LogUtil.e("OneLevelMenuAddActivity", "holder == null");
                        return;
                    }
                    dVar.c().toggle();
                    OneLevelMenuAddListAdapter.a().put(Integer.valueOf(i), Boolean.valueOf(dVar.c().isChecked()));
                    LogUtil.a("OneLevelMenuAddActivity", "ContactDeleteListAdapter map = ", OneLevelMenuAddListAdapter.a());
                }
            });
            return;
        }
        a(true);
    }

    private void a(boolean z) {
        if (z) {
            this.f.setVisibility(0);
            this.f24571b.setVisibility(8);
        } else {
            this.f.setVisibility(8);
            this.f24571b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList<Integer> arrayList;
        LogUtil.d("OneLevelMenuAddActivity", "saveData() delete data before mContactTables = " + this.j);
        if (this.i.a() || (arrayList = this.e) == null) {
            return;
        }
        int size = arrayList.size();
        LogUtil.a("OneLevelMenuAddActivity", "map=", OneLevelMenuAddListAdapter.a());
        while (true) {
            size--;
            if (size >= 0) {
                LogUtil.a("OneLevelMenuAddActivity", "mContactTables i=", Integer.valueOf(size));
                if (!OneLevelMenuAddListAdapter.a().get(Integer.valueOf(size)).booleanValue()) {
                    LogUtil.a("OneLevelMenuAddActivity", "getIsSelected i=", Integer.valueOf(size), " is selected!");
                    this.e.remove(size);
                }
            } else {
                LogUtil.a("OneLevelMenuAddActivity", "saveData() delete data after mContactTables = " + this.e);
                Intent intent = new Intent();
                intent.putIntegerArrayListExtra("intent_from_next_open_list", this.e);
                LogUtil.a("OneLevelMenuAddActivity", "mMenuTables gotonext mMenuTables" + rcx.c().b(this.f24572c, this.e));
                setResult(1, intent);
                finish();
                return;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
