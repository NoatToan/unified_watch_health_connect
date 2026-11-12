package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.homeinterface.OnStartDragListener;
import com.huawei.ui.homehealth.util.FunctionSetCardMarketingUtil;
import defpackage.fua;
import defpackage.ioi;
import defpackage.lop;
import defpackage.loq;
import defpackage.lqo;
import defpackage.njy;
import defpackage.qqs;
import defpackage.qqt;
import defpackage.qre;
import defpackage.sio;
import defpackage.sit;
import defpackage.siu;
import defpackage.skw;
import defpackage.sox;
import defpackage.tbf;
import defpackage.tfb;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementActivity extends BaseActivity implements OnStartDragListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<skw> f25465a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FunctionSetCardManagementViewAdapter f25467c;
    private HealthTextView e;
    private sio f;
    private CustomViewDialog g;
    private HealthColumnSystem h;
    private Context i;
    private List<CardConfig> j;
    private ItemTouchHelper k;
    private FunctionSetCardMarketingUtil l;
    private boolean n;
    private HealthSwitchButton p;
    private HealthTextView q;
    private FunctionSetCardManagementNotShowViewAdapter s;
    private StaggeredGridLayoutManager t;
    private StaggeredGridLayoutManager u;
    private FunctionSetCardManagementViewChineseAdapter w;
    private CustomTitleBar y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25466b = false;
    private boolean d = false;
    private List<skw> v = new ArrayList();
    private ArrayList<skw> o = new ArrayList<>();
    private boolean m = true;
    private boolean r = false;
    private boolean x = false;
    private boolean ad = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("FunctionSetCardManagementActivity", "onCreate");
        this.i = this;
        if (!fua.b(BaseApplication.getContext())) {
            setContentView(R.layout.function_set_card_management_chinese);
        } else {
            setContentView(R.layout.function_set_card_management);
        }
        this.l = new FunctionSetCardMarketingUtil(this.i);
        f();
        g();
        if (fua.b(BaseApplication.getContext())) {
            return;
        }
        new ManagementBootPageHelper(BaseApplication.getContext()).showBootPage((LinearLayout) findViewById(R.id.extra_layout_container));
    }

    @Override // com.huawei.ui.homehealth.homeinterface.OnStartDragListener
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        if (fua.b(BaseApplication.getContext())) {
            this.k.startDrag(viewHolder);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.r = true;
        sox.d().a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.a("FunctionSetCardManagementActivity", "onStop()");
        if (fua.b(BaseApplication.getContext())) {
            i();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("FunctionSetCardManagementActivity", "onBackPressed()");
        if (!fua.b(BaseApplication.getContext())) {
            if (i()) {
                finish();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        d();
    }

    public void d() {
        HealthColumnSystem healthColumnSystem = this.h;
        if (healthColumnSystem != null) {
            healthColumnSystem.b(this.i);
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.u;
            if (staggeredGridLayoutManager != null) {
                staggeredGridLayoutManager.setSpanCount(this.h.j() / 2);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.t;
            if (staggeredGridLayoutManager2 != null) {
                staggeredGridLayoutManager2.setSpanCount(this.h.j() / 2);
            }
        }
    }

    private void g() {
        LogUtil.a("FunctionSetCardManagementActivity", "initListView");
        cancelAdaptRingRegion();
        setViewSafeRegion(false, findViewById(R.id.card_management_relative_layout));
        if (!fua.b(BaseApplication.getContext())) {
            e();
        }
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.id_recycler_card_management);
        healthRecycleView.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return FunctionSetCardManagementActivity.this.d(view, motionEvent);
            }
        });
        if (!fua.b(BaseApplication.getContext())) {
            this.w = new FunctionSetCardManagementViewChineseAdapter(this.f25465a, this.i, this);
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.i, 1);
            this.h = healthColumnSystem;
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(healthColumnSystem.j() / 2, 1);
            this.u = staggeredGridLayoutManager;
            healthRecycleView.setLayoutManager(staggeredGridLayoutManager);
            healthRecycleView.setAdapter(this.w);
            healthRecycleView.b(false);
            healthRecycleView.e(false);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ManagementViewCardTouchHelperChineseCallBack(this.w, this.i));
            this.k = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(healthRecycleView);
            j();
            return;
        }
        this.f25467c = new FunctionSetCardManagementViewAdapter(this.f25465a, this.i, this);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.i));
        healthRecycleView.setAdapter(this.f25467c);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        ItemTouchHelper itemTouchHelper2 = new ItemTouchHelper(new ManagementViewCardTouchHelperCallBack(this.f25467c, this.i));
        this.k = itemTouchHelper2;
        itemTouchHelper2.attachToRecyclerView(healthRecycleView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            if (!fua.b(BaseApplication.getContext())) {
                if (this.w != null) {
                    LogUtil.a("FunctionSetCardManagementActivity", "mShowAdapter dispatchTouchEvent");
                    this.w.a();
                }
            } else if (this.f25467c != null) {
                LogUtil.a("FunctionSetCardManagementActivity", "mAdapter dispatchTouchEvent");
                this.f25467c.notifyDataSetChanged();
            }
        }
        return false;
    }

    private void j() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.id_recycler_card_management_not_show);
        this.s = new FunctionSetCardManagementNotShowViewAdapter(this.f25465a, this);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.h.j() / 2, 1);
        this.t = staggeredGridLayoutManager;
        healthRecycleView.setLayoutManager(staggeredGridLayoutManager);
        healthRecycleView.setAdapter(this.s);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
    }

    private void e() {
        ImageView imageView = (ImageView) findViewById(R.id.left_bottom_line);
        if (qqs.e(this.i)) {
            imageView.setBackground(this.i.getResources().getDrawable(R.drawable.left_bottom_line_dark));
        } else {
            imageView.setBackground(this.i.getResources().getDrawable(R.drawable.left_bottom_line));
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.right_bottom_line);
        if (qqs.e(this.i)) {
            imageView2.setBackground(this.i.getResources().getDrawable(R.drawable.right_bottom_line_dark));
        } else {
            imageView2.setBackground(this.i.getResources().getDrawable(R.drawable.right_bottom_line));
        }
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.show_card_title);
        if (fua.q()) {
            healthTextView.setText(this.i.getResources().getString(R.string.IDS_added_today_card));
        } else {
            healthTextView.setText(this.i.getResources().getString(R.string.IDS_function_set_management_show_title));
        }
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.recommend_text);
        this.q = healthTextView2;
        healthTextView2.setText(this.i.getResources().getString(R.string.IDS_function_set_management_recommend_sort));
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.recommend_button);
        this.p = healthSwitchButton;
        healthSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: sku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48291a.c(view);
            }
        });
        this.e = (HealthTextView) findViewById(R.id.card_management_bottom_text);
        r();
        m();
    }

    public /* synthetic */ void c(View view) {
        if (this.p.isChecked()) {
            LogUtil.a("FunctionSetCardManagementActivity", "open switch");
            q();
        } else {
            LogUtil.a("FunctionSetCardManagementActivity", "close switch");
            tfb.d(this.i, false, this.f.i(), 1);
            k();
        }
    }

    private void m() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.card_management_title_layout);
        this.y = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(this.i.getResources().getColor(R.color.colorSubBackground));
        this.y.setRightButtonClickable(true);
        if (qqs.e(this.i)) {
            this.y.setRightButtonDrawable(this.i.getDrawable(R.drawable.function_set_management_right_dark), qre.f(R.string.IDS_contact_confirm));
        } else {
            this.y.setRightButtonDrawable(this.i.getDrawable(R.drawable.function_set_management_right), qre.f(R.string.IDS_contact_confirm));
        }
        this.y.setRightButtonVisibility(0);
        this.y.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "mTitleBar right button is clicked, mIsEditState: ", Boolean.valueOf(FunctionSetCardManagementActivity.this.m), ", mCardEditedByUser: ", Boolean.valueOf(FunctionSetCardManagementActivity.this.f25466b));
                if (FunctionSetCardManagementActivity.this.m) {
                    if (FunctionSetCardManagementActivity.this.f25466b && FunctionSetCardManagementActivity.this.n()) {
                        FunctionSetCardManagementActivity.this.n = false;
                        FunctionSetCardManagementActivity.this.d = true;
                        FunctionSetCardManagementActivity.this.f.a(false);
                        FunctionSetCardManagementActivity.this.f25466b = false;
                    }
                    FunctionSetCardManagementActivity.this.e(false);
                }
            }
        });
        this.y.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "back");
                if (FunctionSetCardManagementActivity.this.i()) {
                    LogUtil.a("FunctionSetCardManagementActivity", "isFinish");
                    FunctionSetCardManagementActivity.this.finish();
                }
            }
        });
    }

    public void e(boolean z) {
        if (z) {
            this.f25466b = false;
        }
        this.m = z;
        if (!z) {
            a(this.v, this.w.c());
            tfb.c(this.i, 1, this.n, this.o, c(), this.v);
            a(this.o, this.v);
            this.x = this.n;
            String strE = SharedPreferenceManager.e(this.i, Integer.toString(10000), "personalized_recommend");
            if (!this.ad && "1".equals(strE)) {
                this.ad = true;
            }
            LogUtil.a("FunctionSetCardManagementActivity", "mTmpIsUpdateByMarketing: ", Boolean.valueOf(this.x), ", mTmpPersonSwitch: ", Boolean.valueOf(this.ad));
        }
        r();
        if (z) {
            this.y.setRightButtonVisibility(0);
        } else {
            this.y.setRightButtonVisibility(8);
        }
        this.w.b();
        this.w.b(z);
        this.s.e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        ArrayList<skw> arrayList = this.o;
        int i = 0;
        if (arrayList == null) {
            return 0;
        }
        Iterator<skw> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().e() == 1) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<skw> a(List<skw> list, List<skw> list2) {
        list.clear();
        for (int i = 0; i < list2.size(); i++) {
            skw skwVar = list2.get(i);
            if (skwVar != null) {
                list.add(skwVar.a());
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        this.f.d("FunctionSetCardManagementActivity", "quit card edit start save changes");
        boolean zN = n();
        LogUtil.a("FunctionSetCardManagementActivity", "isCardListEdited = ", Boolean.valueOf(zN));
        if (zN) {
            LogUtil.a("FunctionSetCardManagementActivity", "mCardManager.saveEditCards(mCardDataList) mIsEditState: ", Boolean.valueOf(this.m));
            if (!fua.b(BaseApplication.getContext()) && this.m) {
                t();
                return false;
            }
            this.f.e(b(), this.d);
        }
        this.f.c("FunctionSetCardManagementActivity", "quit card edit end save changes");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<skw> b() {
        if (!fua.b(BaseApplication.getContext())) {
            FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter = this.w;
            if (functionSetCardManagementViewChineseAdapter != null) {
                return functionSetCardManagementViewChineseAdapter.c();
            }
            return null;
        }
        FunctionSetCardManagementViewAdapter functionSetCardManagementViewAdapter = this.f25467c;
        if (functionSetCardManagementViewAdapter != null) {
            return functionSetCardManagementViewAdapter.a();
        }
        return null;
    }

    private List<skw> h() {
        if (fua.b(BaseApplication.getContext()) || this.w == null) {
            return null;
        }
        return this.v;
    }

    private void t() {
        LogUtil.a("FunctionSetCardManagementActivity", "showNoticeDialog");
        CustomViewDialog customViewDialog = this.g;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.j("FunctionSetCardManagementActivity", "mAuthDialog isShowing");
            return;
        }
        View viewInflate = View.inflate(this.i, R.layout.function_set_management_dialog_des, null);
        ((HealthTextView) viewInflate.findViewById(R.id.dialog_text_alert_message)).setText(this.i.getResources().getString(R.string.IDS_function_set_management_dialog_des));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.i).a(this.i.getResources().getString(R.string.IDS_function_set_management_dialog_title)).d(viewInflate).c(this.i.getResources().getString(R.string.IDS_function_set_management_dialog_left), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "NegativeButton is clicked");
                FunctionSetCardManagementActivity.this.o();
                FunctionSetCardManagementActivity.this.g.dismiss();
                FunctionSetCardManagementActivity.this.finish();
                FunctionSetCardManagementActivity.this.f.c("FunctionSetCardManagementActivity", "quit card edit end save changes");
            }
        }).a(this.i.getResources().getString(R.string.IDS_device_measureactivity_result_save), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "PositiveButton is clicked");
                FunctionSetCardManagementActivity.this.w.b();
                if ((FunctionSetCardManagementActivity.this.f25466b && FunctionSetCardManagementActivity.this.n()) || FunctionSetCardManagementActivity.this.d) {
                    FunctionSetCardManagementActivity.this.d = true;
                }
                String strE = SharedPreferenceManager.e(FunctionSetCardManagementActivity.this.i, Integer.toString(10000), "personalized_recommend");
                if (!FunctionSetCardManagementActivity.this.ad) {
                    if ("1".equals(strE)) {
                        FunctionSetCardManagementActivity.this.ad = true;
                        FunctionSetCardManagementActivity functionSetCardManagementActivity = FunctionSetCardManagementActivity.this;
                        functionSetCardManagementActivity.e(functionSetCardManagementActivity.ad, FunctionSetCardManagementActivity.this.ad ? "1" : "0");
                    }
                }
                FunctionSetCardManagementActivity.this.f.e(FunctionSetCardManagementActivity.this.b(), FunctionSetCardManagementActivity.this.d);
                FunctionSetCardManagementActivity.this.g.dismiss();
                FunctionSetCardManagementActivity.this.finish();
                tfb.c(FunctionSetCardManagementActivity.this.i, 1, FunctionSetCardManagementActivity.this.n, FunctionSetCardManagementActivity.this.o, FunctionSetCardManagementActivity.this.c(), FunctionSetCardManagementActivity.this.b());
                FunctionSetCardManagementActivity functionSetCardManagementActivity2 = FunctionSetCardManagementActivity.this;
                functionSetCardManagementActivity2.a(functionSetCardManagementActivity2.o, (List<skw>) FunctionSetCardManagementActivity.this.b());
                FunctionSetCardManagementActivity.this.f.c("FunctionSetCardManagementActivity", "quit card edit end save changes");
            }
        }).d();
        this.g = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.g.show();
        LogUtil.a("FunctionSetCardManagementActivity", ParamConstants.CallbackMethod.ON_SHOW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("FunctionSetCardManagementActivity", "saveTmpStatus, mCardEditedByUserTotal: ", Boolean.valueOf(this.d), ", mTmpIsUpdateByMarketing: ", Boolean.valueOf(this.x), ", mTmpPersonSwitch: ", Boolean.valueOf(this.ad));
        this.f.e(h(), this.d);
        this.f.a(this.x);
        boolean z = this.ad;
        e(z, z ? "1" : "0");
    }

    private void q() {
        LogUtil.a("FunctionSetCardManagementActivity", "showSwitchDialog");
        CustomViewDialog customViewDialog = this.g;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.j("FunctionSetCardManagementActivity", "mAuthDialog isShowing");
            return;
        }
        View viewInflate = View.inflate(this.i, R.layout.function_set_management_dialog_des, null);
        ((HealthTextView) viewInflate.findViewById(R.id.dialog_text_alert_message)).setText(this.i.getResources().getString(R.string.IDS_function_set_management_switch_dialog));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this.i).d(viewInflate).c(this.i.getResources().getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "NegativeButton is clicked");
                FunctionSetCardManagementActivity.this.b(false);
            }
        }).a(this.i.getResources().getString(R.string.ie_enable_wlan), new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("FunctionSetCardManagementActivity", "PositiveButton is clicked");
                tfb.d(FunctionSetCardManagementActivity.this.i, true, FunctionSetCardManagementActivity.this.f.i(), 1);
                FunctionSetCardManagementActivity.this.a();
            }
        }).d();
        this.g = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.g.show();
        LogUtil.a("FunctionSetCardManagementActivity", ParamConstants.CallbackMethod.ON_SHOW);
    }

    private void k() {
        this.l.c(new HiDataReadResultListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.13
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("FunctionSetCardManagementActivity", "errorCode: ", Integer.valueOf(i), ", object: ", obj);
                if (i == 0) {
                    JSONObject jSONObjectA = FunctionSetCardManagementActivity.this.l.a(obj);
                    if (jSONObjectA != null) {
                        FunctionSetCardManagementActivity.this.b(jSONObjectA);
                        return;
                    }
                    LogUtil.a("FunctionSetCardManagementActivity", "config is null");
                    FunctionSetCardManagementActivity functionSetCardManagementActivity = FunctionSetCardManagementActivity.this;
                    functionSetCardManagementActivity.a(functionSetCardManagementActivity.f.h());
                    return;
                }
                FunctionSetCardManagementActivity functionSetCardManagementActivity2 = FunctionSetCardManagementActivity.this;
                functionSetCardManagementActivity2.a(functionSetCardManagementActivity2.f.h());
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("FunctionSetCardManagementActivity", "getUserConfig intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                FunctionSetCardManagementActivity functionSetCardManagementActivity = FunctionSetCardManagementActivity.this;
                functionSetCardManagementActivity.a(functionSetCardManagementActivity.f.h());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        LogUtil.a("FunctionSetCardManagementActivity", "updateCardByUserConfig");
        if (jSONObject == null) {
            LogUtil.a("FunctionSetCardManagementActivity", "JSONObject is null");
            a(this.f.h());
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userCardOrders");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.a("FunctionSetCardManagementActivity", "array is null");
            a(this.f.h());
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (jSONArrayOptJSONArray.opt(i) instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.opt(i);
                String strOptString = jSONObject2.optString("cardId");
                String strOptString2 = jSONObject2.optString("showFlag");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    e(strOptString, "1".equals(strOptString2), i);
                }
            }
        }
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sit sitVar) {
        LogUtil.a("FunctionSetCardManagementActivity", "updateCardByUserSp");
        if (sitVar == null || njy.e(sitVar.c())) {
            LogUtil.a("FunctionSetCardManagementActivity", "cardConfig is invalid");
            b(true);
            return;
        }
        LinkedList<CardConfig> linkedListC = sitVar.c();
        if (njy.e(linkedListC)) {
            LogUtil.a("FunctionSetCardManagementActivity", "cardConfigLinkedList is invalid");
            b(true);
            return;
        }
        for (int i = 0; i < linkedListC.size(); i++) {
            CardConfig cardConfig = linkedListC.get(i);
            if (cardConfig != null) {
                e(cardConfig.getCardId(), cardConfig.isShow(), i);
            }
        }
        c(true);
    }

    private void e(String str, boolean z, int i) {
        skw skwVarB = b(str);
        if (skwVarB == null) {
            return;
        }
        skwVarB.c(i);
        skwVarB.e(z ? 1 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardManagementActivity.this.b(z);
                }
            });
            return;
        }
        LogUtil.a("FunctionSetCardManagementActivity", "updateSwitchButton isButtonOpen: ", Boolean.valueOf(z));
        this.n = z;
        this.p.setChecked(z);
        this.f.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.5
            @Override // java.lang.Runnable
            public void run() {
                lqo.b(BaseApplication.getContext()).b("function_card", new lop(), new ResultCallback<loq>() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.5.5
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(loq loqVar) {
                        FunctionSetCardManagementActivity.this.d(loqVar);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.e("FunctionSetCardManagementActivity", "get strategy error:", ExceptionUtils.c(th));
                        FunctionSetCardManagementActivity.this.b(false);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(loq loqVar) {
        if (loqVar == null) {
            LogUtil.j("FunctionSetCardManagementActivity", "rsp is null.");
            b(false);
            return;
        }
        LogUtil.a("FunctionSetCardManagementActivity", "rsp: ", loqVar.toString());
        if (loqVar.getResultCode().intValue() != 0) {
            LogUtil.j("FunctionSetCardManagementActivity", "getStrategy rsp resultCode is ", loqVar.getResultCode());
            b(false);
            return;
        }
        if (njy.e(loqVar.a()) || njy.e(loqVar.e()) || njy.e(loqVar.c())) {
            LogUtil.j("FunctionSetCardManagementActivity", "getStrategy rsp data empty");
            b(false);
            return;
        }
        String str = loqVar.c().get(0);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("FunctionSetCardManagementActivity", "getStrategyName empty");
            b(false);
            return;
        }
        LogUtil.a("FunctionSetCardManagementActivity", "json: ", qqt.b(loqVar));
        if (str.equals("[B]")) {
            LogUtil.a("FunctionSetCardManagementActivity", "test B");
            l();
        } else {
            LogUtil.a("FunctionSetCardManagementActivity", "test A");
            b(false);
        }
    }

    private void l() {
        this.l.d(new HttpResCallback() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.2
            @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
            public void onFinished(int i, String str) {
                LogUtil.a("FunctionSetCardManagementActivity", "resCode: ", Integer.valueOf(i), ", response: ", str);
                if (TextUtils.isEmpty(str)) {
                    LogUtil.e("FunctionSetCardManagementActivity", "response is null");
                    FunctionSetCardManagementActivity.this.b(false);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("sortedCardIds");
                    if (jSONArrayOptJSONArray == null) {
                        LogUtil.e("FunctionSetCardManagementActivity", "array is null");
                        FunctionSetCardManagementActivity.this.b(false);
                        return;
                    }
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        Object obj = jSONArrayOptJSONArray.get(i2);
                        if (obj instanceof String) {
                            arrayList.add((String) obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!FunctionSetCardManagementActivity.this.r) {
                            FunctionSetCardManagementActivity.this.c(arrayList);
                            FunctionSetCardManagementActivity.this.c(false);
                            return;
                        } else {
                            LogUtil.a("FunctionSetCardManagementActivity", "activity is destroyed");
                            FunctionSetCardManagementActivity.this.b(false);
                            return;
                        }
                    }
                    LogUtil.e("FunctionSetCardManagementActivity", "list is null");
                    FunctionSetCardManagementActivity.this.b(false);
                } catch (JsonSyntaxException | JSONException unused) {
                    LogUtil.e("FunctionSetCardManagementActivity", "JsonSyntaxException");
                    FunctionSetCardManagementActivity.this.b(false);
                }
            }
        });
    }

    private void a(List<String> list) {
        String name = CardFlowInteractors.CardNameConstants.THREE_CIRCLE_CARD.getName();
        if ("threeLeafCard".equals(tbf.e()) && list.contains("HEALTH_MODEL_CARD_KEY_NEW") && !list.contains(name)) {
            list.set(list.indexOf("HEALTH_MODEL_CARD_KEY_NEW"), name);
        }
        if ("threeCircleCard".equals(tbf.e()) && list.contains(name) && !list.contains("HEALTH_MODEL_CARD_KEY_NEW")) {
            list.set(list.indexOf(name), "HEALTH_MODEL_CARD_KEY_NEW");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<String> list) {
        a(list);
        a(list);
        LogUtil.a("FunctionSetCardManagementActivity", "updateCardDataListByMarketing, list: ", list);
        ArrayList arrayList = new ArrayList();
        boolean zE = siu.e();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str) && b(str) != null && (!"PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(str) || zE)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f25465a.size(); i2++) {
            String strB = this.f25465a.get(i2).b();
            if (!arrayList.contains(strB)) {
                arrayList2.add(strB);
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            skw skwVarB = b((String) arrayList.get(i3));
            if (skwVarB != null) {
                skwVarB.c(i3);
                skwVarB.e(1);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            skw skwVarB2 = b((String) arrayList2.get(i4));
            if (skwVarB2 != null) {
                skwVarB2.c(i4 + size);
                skwVarB2.e(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Collections.sort(this.f25465a, new Comparator<skw>() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementActivity.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(skw skwVar, skw skwVar2) {
                return skwVar.i() - skwVar2.i();
            }
        });
        LogUtil.a("FunctionSetCardManagementActivity", "sortListAndRefreshView, mCardDataList: ", this.f25465a);
        this.w.a(this.f25465a);
        this.s.b(this.f25465a);
        if (!z) {
            e(!z, z ? "0" : "1");
        }
        boolean z2 = !z;
        b(z2);
        this.f.c(z2);
    }

    private skw b(String str) {
        for (int i = 0; i < this.f25465a.size(); i++) {
            if (str.equals(this.f25465a.get(i).b())) {
                return this.f25465a.get(i);
            }
        }
        return null;
    }

    private void r() {
        if (this.n) {
            LogUtil.a("FunctionSetCardManagementActivity", "mRadioButton is opening");
            this.p.setChecked(true);
        } else {
            LogUtil.a("FunctionSetCardManagementActivity", "mRadioButton is closing");
            this.p.setChecked(false);
        }
        if (this.f.l()) {
            this.p.setVisibility(0);
            this.p.setClickable(true);
            this.q.setVisibility(0);
        } else {
            this.p.setVisibility(4);
            this.p.setClickable(false);
            this.q.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, String str) {
        ioi ioiVarD = ioi.d();
        SharedPreferenceManager.e(this.i, Integer.toString(10000), "personalized_recommend", str, new StorageParams());
        ioiVarD.e(12, z, String.valueOf(12), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        List<skw> listB = b();
        if (listB == null) {
            LogUtil.a("FunctionSetCardManagementActivity", "cardDataList is null");
            return false;
        }
        int size = listB.size();
        if (size != this.j.size()) {
            return true;
        }
        LogUtil.a("FunctionSetCardManagementActivity", "cardDataList, getAdapter.size = ", Integer.valueOf(size));
        for (int i = 0; i < listB.size(); i++) {
            if (!this.j.get(i).getCardId().equalsIgnoreCase(listB.get(i).b()) || this.j.get(i).getShowFlag() != listB.get(i).e()) {
                return true;
            }
        }
        return false;
    }

    private void f() {
        LogUtil.a("FunctionSetCardManagementActivity", "initData()");
        sio sioVarC = sio.c();
        this.f = sioVarC;
        boolean zI = sioVarC.i();
        this.n = zI;
        this.x = zI;
        boolean zEquals = "1".equals(SharedPreferenceManager.e(this.i, Integer.toString(10000), "personalized_recommend"));
        this.ad = zEquals;
        LogUtil.a("FunctionSetCardManagementActivity", "init mIsUpdateByMarketing: ", Boolean.valueOf(this.n), ", mTmpPersonSwitch: ", Boolean.valueOf(zEquals));
        this.f25465a = new ArrayList<>(10);
        this.f.b("FunctionSetCardManagementActivity", "enter card Edit");
        List<CardConfig> listE = this.f.e();
        this.j = listE;
        if (listE == null || listE.size() == 0) {
            return;
        }
        LogUtil.a("FunctionSetCardManagementActivity", "mCurrentCardConfigs: ", this.j);
        for (int i = 0; i < this.j.size(); i++) {
            CardConfig cardConfig = this.j.get(i);
            if (!fua.b(BaseApplication.getContext())) {
                this.f25465a.add(new skw(this.i, c(cardConfig), i, cardConfig.getShowFlag(), cardConfig.getCardId(), e(cardConfig.getCardId())));
            } else {
                this.f25465a.add(new skw(this.i, c(cardConfig), i, cardConfig.getShowFlag(), cardConfig.getCardId()));
            }
        }
        LogUtil.a("FunctionSetCardManagementActivity", "mCardDataList: ", this.f25465a);
        a(this.o, this.f25465a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    private String e(String str) {
        str.hashCode();
        switch (str) {
            case "BLOODPRESSURE_CARD_KEY_NEW":
                return "marketing_default_img_bloodpressure";
            case "Health_Record_CARD_KEY_NEW":
                return "health_card_default_img_small";
            case "STRESS_CARD_KEY_NEW":
                return "marketing_default_img_pressure";
            case "SLEEP_CARD_KEY_NEW":
                return "marketing_default_img_sleep";
            case "BLOODSUGAR_CARD_KEY_NEW":
                return "marketing_default_img_bloodsugar";
            case "TEMPERATURE_CARD_KEY_NEW":
                return "marketing_default_img_temperature";
            case "PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW":
                return "marketing_default_img_physiological_cycle";
            case "BLOODOXYGEN_CARD_KEY_NEW":
                return "marketing_default_img_bloodoxygen";
            case "HEALTH_MODEL_CARD_KEY_NEW":
                return "health_life_default_img_small";
            case "WEIGHT_CARD_KEY_NEW":
                return "marketing_default_img_weight";
            case "HEARTRATE_CARD_KAY_NEW":
                return "marketing_default_img_heartrate";
            case "THREE_CIRCLE_CARD_KEY_NEW":
                return "ic_three_circle";
            case "SPORTS_CARD_KEY_NEW":
                return "sports_record_small_img_default";
            default:
                return "";
        }
    }

    private String c(CardConfig cardConfig) {
        return a(cardConfig);
    }

    private String a(CardConfig cardConfig) {
        Resources resources = this.i.getResources();
        String cardNameRes = cardConfig.getCardNameRes();
        if (cardNameRes != null) {
            if (Utils.o() && CardFlowInteractors.CardNameConstants.TEMPERATURE_CARD.getName().equals(cardConfig.getCardId())) {
                cardNameRes = "IDS_health_skin_temperature";
            } else if (Utils.o() && CardFlowInteractors.CardNameConstants.WEIGHT_CARD.getName().equals(cardConfig.getCardId())) {
                cardNameRes = "IDS_hw_show_main_home_page_weight";
            } else if ("HEALTH_MODEL_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
                cardNameRes = "IDS_health_clover_title";
            } else if (Utils.o() && CardFlowInteractors.CardNameConstants.HEALTH_RECORD_CARD.getName().equals(cardConfig.getCardId())) {
                cardNameRes = "IDS_health_examination";
            } else if (CardFlowInteractors.CardNameConstants.STRESS_CARD.getName().equals(cardConfig.getCardId()) && fua.d()) {
                cardNameRes = "IDS_hw_show_main_home_page_card_emotion_title";
            } else {
                LogUtil.a("FunctionSetCardManagementActivity", "getEmptyCardTitle cardNameRes is other");
            }
            int identifier = resources.getIdentifier(cardNameRes, "string", this.i.getPackageName());
            if (identifier > 0) {
                return this.i.getResources().getString(identifier);
            }
            return "";
        }
        return "";
    }

    public void c(int i, int i2) {
        this.f25466b = true;
        this.w.c(i);
    }

    public void b(int i, int i2) {
        this.f25466b = true;
        this.s.d(i);
    }

    public void e(int i, int i2) {
        this.f25466b = true;
    }

    public void d(List<skw> list) {
        this.s.b(list);
    }
}
