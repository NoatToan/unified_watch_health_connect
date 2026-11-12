package com.huawei.featureuserprofile.route.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.route.activity.EditRouteActivity;
import com.huawei.featureuserprofile.route.adapter.RouteTypeAdapter;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.route.Manger.MyRouteInfoManager;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.SceneType;
import com.huawei.route.utils.RouteSourceUtils;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.cxq;
import defpackage.lmf;
import defpackage.lua;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class EditRouteActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5614b;
    private HealthEditText d;
    private HealthButton e;
    private int f;
    private RelativeLayout h;
    private CustomTitleBar i;
    private RouteData j;
    private String m;
    private final Handler g = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputFilter f5615c = new InputFilter() { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.1
        final Pattern e = Pattern.compile("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-\u1f6ff]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?|[🨀-\u1faff])", 66);

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!this.e.matcher(charSequence).find()) {
                return charSequence;
            }
            LogUtil.d("Track_EditRouteActivity", "can not insert emoji");
            return "";
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_edit_route_activity);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_NEED_CHANGE_POINT", false);
        this.f = getIntent().getIntExtra("from", 0);
        a(booleanExtra);
        e(booleanExtra);
        c();
    }

    private void a(boolean z) {
        getWindow().setBackgroundDrawableResource(R.color.colorSubBackground);
        ((HealthSubHeader) findViewById(R.id.sub_header)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.title_bar);
        this.i = customTitleBar;
        customTitleBar.setLeftButtonVisibility(0);
        this.i.setLeftButtonDrawable(getDrawable(R.drawable.hwsearchview_ic_public_back), qre.f(R.string.accessibility_go_back));
        this.i.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        this.i.setTitleText(getString(R.string.IDS_hwh_my_route_save));
        this.i.setRightButtonVisibility(8);
        this.i.setRightButtonDrawable(getDrawable(R.drawable.ic_appbar_confirm), qre.f(R.string.IDS_contact_confirm));
        this.e = (HealthButton) findViewById(R.id.route_type_confirm_btn);
        c(z);
        HealthEditText healthEditText = (HealthEditText) findViewById(R.id.et_name);
        this.d = healthEditText;
        d(healthEditText);
        this.d.requestFocus();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.d.setTextDirection(4);
        }
        getWindow().setSoftInputMode(5);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rel_route_loading);
        this.h = relativeLayout;
        relativeLayout.setVisibility(8);
    }

    private void c(final boolean z) {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: cxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(z, view);
            }
        });
    }

    public /* synthetic */ void b(boolean z, View view) {
        final String strTrim = this.d.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            c(getString(R.string.IDS_my_route_line_name_invalid));
            return;
        }
        RouteData routeData = this.j;
        if (routeData != null && routeData.getRoutePoints().size() > 80000) {
            ReleaseLogUtil.e("Track_EditRouteActivity", "points is over 80000");
            qpx.b(com.huawei.haf.application.BaseApplication.b(), R.string.IDS_edit_route_point_too_many);
        } else if (this.f5613a && z && !this.f5614b) {
            LogUtil.a("Track_EditRouteActivity", "transfer point not finish,please try again");
        } else {
            c(new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.4
                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void goNext() {
                    ReleaseLogUtil.d("Track_EditRouteActivity", "goNext");
                    EditRouteActivity.this.a(strTrim);
                }

                @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                public void notGoNext() {
                    ReleaseLogUtil.d("Track_EditRouteActivity", "notGoNext");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (CommonUtil.ab(this)) {
            RouteData routeData = this.j;
            if (routeData != null) {
                routeData.setRouteName(str);
            }
            this.i.setRightButtonClickable(false);
            this.h.setVisibility(0);
            if (this.f5613a) {
                d();
                return;
            } else {
                f();
                return;
            }
        }
        e(com.huawei.health.servicesui.R.string.IDS_hw_show_set_about_privacy_connectting_error);
    }

    private boolean e() {
        return lua.a(Integer.toString(10000), "sp_key_my_route_agr_up_cloud", false);
    }

    public void c(final RunPopularRoutesUtil.DialogCallBack dialogCallBack) {
        if (e()) {
            dialogCallBack.goNext();
            return;
        }
        LogUtil.a("Track_EditRouteActivity", "showFirstSaveRouteDialog enter");
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_service_area_notice_title).c(R.string.IDS_hw_routes_save_up_cloud_tips).a(R.string.IDS_device_release_user_profile_log_collect_cancel, new DialogInterface.OnClickListener() { // from class: cwz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditRouteActivity.d(dialogCallBack, dialogInterface, i);
            }
        }).d(R.string.IDS_device_release_user_profile_log_collect_agree, new DialogInterface.OnClickListener() { // from class: cww
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditRouteActivity.c(dialogCallBack, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
    }

    public static /* synthetic */ void d(RunPopularRoutesUtil.DialogCallBack dialogCallBack, DialogInterface dialogInterface, int i) {
        LogUtil.a("Track_EditRouteActivity", "showFirstSaveRouteDialog click cancel");
        dialogCallBack.notGoNext();
    }

    public static /* synthetic */ void c(RunPopularRoutesUtil.DialogCallBack dialogCallBack, DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.d("Track_EditRouteActivity", "showFirstSaveRouteDialog click agree");
        lua.d(Integer.toString(10000), "sp_key_my_route_agr_up_cloud", true);
        dialogCallBack.goNext();
    }

    private void c() {
        ((HealthSubHeader) findViewById(R.id.sub_header_route_type)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
        final ArrayList arrayList = new ArrayList();
        arrayList.add(getString(R.string.IDS_route_type_walk_run));
        arrayList.add(getString(R.string.IDS_route_type_bike));
        arrayList.add(getString(R.string.IDS_route_type_exp));
        arrayList.add(getString(R.string.IDS_route_type_other));
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.hrv_route_type);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this) { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        final RouteTypeAdapter routeTypeAdapter = new RouteTypeAdapter(this, arrayList);
        Intent intent = getIntent();
        int iSceneType = SceneType.WR.sceneType();
        if (intent != null) {
            iSceneType = intent.getIntExtra(RouteData.SCENE_TYPE, iSceneType);
            routeTypeAdapter.e(SceneType.getSceneType(iSceneType).position());
        } else {
            routeTypeAdapter.e(iSceneType);
        }
        RouteData routeData = this.j;
        if (routeData != null) {
            routeData.setSceneType(iSceneType);
        }
        healthRecycleView.setAdapter(routeTypeAdapter);
        routeTypeAdapter.b(new RouteTypeAdapter.OnItemClickListener() { // from class: cwt
            @Override // com.huawei.featureuserprofile.route.adapter.RouteTypeAdapter.OnItemClickListener
            public final void onItemClick(int i) {
                this.f31452a.e(arrayList, routeTypeAdapter, i);
            }
        });
    }

    public /* synthetic */ void e(List list, RouteTypeAdapter routeTypeAdapter, int i) {
        if (njy.c(list, i)) {
            LogUtil.j("Track_EditRouteActivity", "onItemClick position error");
        }
        routeTypeAdapter.e(i);
        RouteData routeData = this.j;
        if (routeData == null) {
            ReleaseLogUtil.e("Track_EditRouteActivity", "initRouteTypeData mRouteData is null");
        } else {
            routeData.setSceneType(SceneType.getSceneTypeByPosition(i).sceneType());
        }
    }

    private void d(EditText editText) {
        ArrayList arrayList = new ArrayList(Arrays.asList(editText.getFilters()));
        arrayList.add(this.f5615c);
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
    }

    private void e(boolean z) {
        RouteData routeData = RouteDataStorageManager.getRouteData();
        RouteData routeDataM1409clone = routeData != null ? routeData.m1409clone() : null;
        this.j = routeDataM1409clone;
        if (routeDataM1409clone == null) {
            LogUtil.e("Track_EditRouteActivity", "initData mRouteData == null");
            finish();
            return;
        }
        this.d.setText(routeDataM1409clone.getRouteName());
        this.m = this.j.getRouteName();
        HealthEditText healthEditText = this.d;
        healthEditText.setSelection(healthEditText.getText().toString().length());
        boolean booleanExtra = getIntent().getBooleanExtra("is_add", true);
        this.f5613a = booleanExtra;
        if (booleanExtra && z) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        RouteData routeData = this.j;
        if (routeData != null) {
            routeData.setRoutePoints(cxq.a(routeData.getRoutePoints()));
            this.f5614b = true;
        }
        LogUtil.a("Track_EditRouteActivity", "transferTrackPoint waste time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private void d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.j);
        MyRouteInfoManager.addRouteDetails(arrayList, new RouteResultCallBack<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.5
            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                EditRouteActivity.this.d(cloudCommonReponse, true);
            }

            @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
            public void onFailure(Throwable th) {
                LogUtil.e("Track_EditRouteActivity", "saveRoute onFailure:", th.getMessage());
                if (EditRouteActivity.this.j != null) {
                    EditRouteActivity.this.j.setRouteName(EditRouteActivity.this.m);
                }
                EditRouteActivity.this.a();
            }
        });
    }

    private void c(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Track_EditRouteActivity", "from:", Integer.valueOf(i));
                HashMap map = new HashMap();
                map.put("click", 1);
                map.put("from", Integer.valueOf(i));
                lmf.d().c(BaseApplication.getContext(), RouteSourceUtils.RUNNING_ROUTE_ANALYSIS_1040120, map, 0);
            }
        });
    }

    private void f() {
        MyRouteInfoManager.updateRouteDetail(this.j, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.route.activity.EditRouteActivity.10
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                EditRouteActivity.this.d(cloudCommonReponse, false);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Track_EditRouteActivity", "updateRoute onFailure:", th.getMessage());
                if (EditRouteActivity.this.j != null) {
                    EditRouteActivity.this.j.setRouteName(EditRouteActivity.this.m);
                }
                EditRouteActivity.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CloudCommonReponse cloudCommonReponse, final boolean z) {
        int i;
        LogUtil.a("Track_EditRouteActivity", "isSave=", Boolean.valueOf(z), " result = ", cloudCommonReponse.toString());
        if (cloudCommonReponse.getResultCode().intValue() == 0) {
            runOnUiThread(new Runnable() { // from class: cwr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(z);
                }
            });
            if (z && (i = this.f) == 1) {
                c(i);
            }
            Intent intent = new Intent();
            intent.setClassName(this, RouteDataStorageManager.ACTIVITY_MY_ROUTE);
            if (z) {
                RouteDataStorageManager.setRouteData(this.j);
            }
            intent.putExtra(RouteDataStorageManager.IS_ADD_NEW_ROUTE, z);
            startActivity(intent);
            finish();
            return;
        }
        if (cloudCommonReponse.getResultCode().intValue() == 31013) {
            e(R.string.IDS_add_track_duplicate);
        } else if (cloudCommonReponse.getResultCode().intValue() == 31014) {
            e(R.string.IDS_add_track_already_exit);
        } else if (cloudCommonReponse.getResultCode().intValue() == 31015) {
            e(R.string.IDS_add_track_more_than_max);
        } else if (cloudCommonReponse.getResultCode().intValue() == 1001) {
            e(R.string.IDS_upload_fail_try_again);
        } else {
            LogUtil.a("Track_EditRouteActivity", "save or update resp resultCode:", cloudCommonReponse.getResultCode(), ",resp resultDesc:", cloudCommonReponse.getResultDesc());
        }
        RouteData routeData = this.j;
        if (routeData != null) {
            routeData.setRouteName(this.m);
        }
        a();
    }

    public /* synthetic */ void d(boolean z) {
        if (z) {
            return;
        }
        c(getString(R.string.IDS_edit_route_success));
    }

    private void e(int i) {
        Message messageObtainMessage = this.g.obtainMessage();
        messageObtainMessage.obj = getString(i);
        messageObtainMessage.what = 1;
        this.g.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Toast.makeText(this, str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Message messageObtainMessage = this.g.obtainMessage();
        messageObtainMessage.what = 2;
        this.g.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class d extends BaseHandler<EditRouteActivity> {
        private d(EditRouteActivity editRouteActivity) {
            super(editRouteActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(EditRouteActivity editRouteActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof String) {
                    editRouteActivity.c((String) message.obj);
                }
            } else {
                if (i != 2) {
                    return;
                }
                editRouteActivity.h.setVisibility(8);
                editRouteActivity.i.setRightButtonClickable(true);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.j = null;
        RouteDataStorageManager.clearRouteData();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
