package com.huawei.ui.device.activity.selectcontact.selectmvp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import com.huawei.datatype.Contact;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.selectcontact.selectmvp.adapter.ContactGroupListViewAdapter;
import com.huawei.ui.device.views.music.AlphabetIndexWaveSideBarView;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpActivity;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qzr;
import defpackage.qzv;
import defpackage.xjt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ContactSelectActivity extends CommonBaseMvpActivity<ContactSelectActivityView, qzv> implements ContactSelectActivityView, View.OnClickListener, SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f24701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSearchView f24702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContactGroupListViewAdapter f24703c;
    private ListView d;
    private Context e;
    private LinearLayout f;
    private View g;
    private RelativeLayout h;
    private AlphabetIndexWaveSideBarView i;
    private CustomTitleBar j;
    private HealthToolBar o;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpActivity
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public qzv createPresenter() {
        return new qzv();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseActivity
    public int getLayoutId() {
        return R.layout.activity_select_contact;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseActivity
    public void initView() {
        this.e = this;
        this.j = (CustomTitleBar) findViewById(R.id.contant_select_titlebar);
        this.d = (ListView) findViewById(R.id.hw_contact_select_list);
        this.i = (AlphabetIndexWaveSideBarView) findViewById(R.id.bar_list);
        this.f24702b = (HealthSearchView) findViewById(R.id.contact_search_view);
        this.o = (HealthToolBar) findViewById(R.id.bottom_operate_toolbar);
        this.f = (LinearLayout) findViewById(R.id.lin_no_data);
        this.h = (RelativeLayout) findViewById(R.id.load_progress);
        this.f24701a = (RelativeLayout) findViewById(R.id.rela_info);
        this.g = findViewById(R.id.search_layout);
        this.f24702b.setOnQueryTextListener(this);
        initTitleBar();
        setCustomTitleBar(0);
        initSideBarView();
        initHealthToolBar();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseActivity
    public void initData() {
        LogUtil.a("ContactSelectActivity", "initData enter");
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("com.huawei.community.action.MAX_SELECT_COUNT", 0);
            Serializable serializableExtra = intent.getSerializableExtra("com.huawei.community.action.OLD_CONTACTS");
            if (c(serializableExtra, String.class)) {
                ((qzv) this.mPresenter).setMaxSelectCount(intExtra);
                ((qzv) this.mPresenter).setOldContactList((ArrayList) serializableExtra);
                if (PermissionUtil.e(this, PermissionUtil.PermissionType.READ_CONTACT) != PermissionUtil.PermissionResult.GRANTED) {
                    ReleaseLogUtil.e("DEVMGR_ContactSelectActivity", "initData isHasReadContactPermission false");
                    xjt.a("ContactSelectActivity initData: isHasReadContactPermission is false");
                    finish();
                    return;
                }
                ((qzv) this.mPresenter).initData();
            }
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void setCustomTitleBar(int i) {
        String string;
        LogUtil.a("ContactSelectActivity", "setCustomTitleBar enter selectCount : ", Integer.valueOf(i));
        if (i > 0) {
            this.j.setRightButtonClickable(true);
            string = getResources().getQuantityString(R.plurals.IDS_hw_health_contact_select_count, i, Integer.valueOf(i));
            this.j.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        } else {
            this.j.setRightButtonClickable(false);
            string = this.e.getResources().getString(R.string.IDS_device_wifi_selectNone);
            this.j.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_ok_un_click), qre.f(R.string.IDS_contact_confirm));
        }
        this.j.setTitleText(string);
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void initTitleBar() {
        LogUtil.a("ContactSelectActivity", "initTitleBar enter");
        this.j.setRightButtonVisibility(0);
        this.j.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((qzv) ContactSelectActivity.this.mPresenter).getResultList();
            }
        });
        this.j.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ContactSelectActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public Context getContext() {
        return this.e;
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void setAdapter(List<qzr> list) {
        dismissLoadingView();
        if (list == null || list.isEmpty()) {
            this.f.setVisibility(0);
            this.d.setVisibility(8);
            this.o.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        this.f.setVisibility(8);
        this.d.setVisibility(0);
        this.o.setVisibility(0);
        this.i.setVisibility(0);
        ContactGroupListViewAdapter contactGroupListViewAdapter = new ContactGroupListViewAdapter(list, this.e);
        this.f24703c = contactGroupListViewAdapter;
        this.d.setAdapter((ListAdapter) contactGroupListViewAdapter);
        initListView();
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void initSideBarView() {
        this.i.setOnLetterChangeListener(new AlphabetIndexWaveSideBarView.OnLetterChangeListener() { // from class: com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity.5
            @Override // com.huawei.ui.device.views.music.AlphabetIndexWaveSideBarView.OnLetterChangeListener
            public void onLetterChange(String str) {
                int positionForSection = ContactSelectActivity.this.f24703c.getPositionForSection(str.charAt(0));
                if (positionForSection != -1) {
                    ContactSelectActivity.this.d.setSelection(positionForSection);
                }
            }
        });
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void initListView() {
        this.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ((qzv) ContactSelectActivity.this.mPresenter).itemSelected(i);
                ContactSelectActivity.this.f24703c.notifyDataSetChanged();
            }
        });
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void initHealthToolBar() {
        this.o.d(View.inflate(this.e, R.layout.hw_toolbar_bottomview, null));
        this.o.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivity.3
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public void onSingleTap(int i) {
                if (i == 2) {
                    ((qzv) ContactSelectActivity.this.mPresenter).selectAll();
                    if (ContactSelectActivity.this.f24703c != null) {
                        ContactSelectActivity.this.f24703c.notifyDataSetChanged();
                    }
                }
            }
        });
        this.o.setIcon(2, R.drawable.ic_public_select_all);
        this.o.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_select_all));
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void changeHealthToolBarState(boolean z) {
        ((qzv) this.mPresenter).setIsSelectAll(z);
        if (z) {
            this.o.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_uncheck_all));
            this.o.setIcon(2, R.drawable.ic_public_deselect_all);
        } else {
            this.o.setIcon(2, R.drawable.ic_public_select_all);
            this.o.setIconTitle(2, getResources().getString(R.string.IDS_contact_delete_select_all));
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void finishSelect(List<Contact> list) {
        if (list instanceof Serializable) {
            Intent intent = new Intent();
            intent.putExtra(JsUtil.ServiceType.DATA, (Serializable) list);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void showUpperLimitMessage(int i) {
        qpx.e(this.e, getResources().getQuantityString(R.plurals.IDS_hw_health_contact_can_select_count, i, Integer.valueOf(i)));
    }

    @Override // com.huawei.ui.device.activity.selectcontact.selectmvp.ContactSelectActivityView
    public void dismissLoadingView() {
        this.h.setVisibility(8);
        this.f24701a.setVisibility(0);
        this.g.setVisibility(0);
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        ((qzv) this.mPresenter).onEditTextInputChange(str);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        ((qzv) this.mPresenter).onEditTextInputChange(str);
        return true;
    }

    private boolean c(Object obj, Class cls) {
        if (cls == null || obj == null || !(obj instanceof ArrayList)) {
            return false;
        }
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            if (!cls.isInstance(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        HealthSearchView healthSearchView = this.f24702b;
        if (healthSearchView != null) {
            healthSearchView.clearFocus();
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.base.CommonBaseMvpActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthSearchView healthSearchView = this.f24702b;
        if (healthSearchView != null) {
            healthSearchView.setOnQueryTextListener(null);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null && !(currentFocus instanceof HealthSearchView)) {
                a();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if (getWindow().superDispatchTouchEvent(motionEvent)) {
            return true;
        }
        return onTouchEvent(motionEvent);
    }

    private void a() {
        Object systemService = getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
