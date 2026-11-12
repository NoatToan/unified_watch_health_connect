package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.up.api.UpApi;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.dnj;
import defpackage.imz;
import defpackage.iun;
import defpackage.qsp;
import defpackage.vbs;
import defpackage.vei;
import defpackage.wsp;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WeightUserManagerActivity extends BaseActivity implements HealthToolBar.OnSingleTapListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeightUserManagerActivity f27679b;
    private b d;
    private a e;
    private ListView f;
    private LocalBroadcastManager g;
    private HealthToolBar i;
    private UserProfileMgrApi j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27680c = false;
    private final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightUserManagerActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("HealthWeight_WeightUserManagerActivity", "mUserProfileReceiver action ", intent.getAction());
            WeightUserManagerActivity.this.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CommonCallback f27678a = new CommonCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightUserManagerActivity.2
        @Override // com.huawei.up.callback.CommonCallback
        public void onSuccess(Bundle bundle) {
            LogUtil.a("HealthWeight_WeightUserManagerActivity", "toGetRemoteHeadImage get new headImg and name from cloud success.");
            WeightUserManagerActivity.this.a();
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onFail(int i) {
            LogUtil.a("HealthWeight_WeightUserManagerActivity", "toGetRemoteHeadImage get new headImg and name from cloud failure.");
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_user_manager);
        this.f27679b = this;
        this.d = new b(this);
        b();
        d();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.g = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.h, new IntentFilter("com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));
        this.j = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b extends BaseHandler<WeightUserManagerActivity> {
        b(WeightUserManagerActivity weightUserManagerActivity) {
            super(weightUserManagerActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightUserManagerActivity weightUserManagerActivity, Message message) {
            if (message.what == 2) {
                if (message.obj instanceof UserInfomation) {
                    weightUserManagerActivity.e((UserInfomation) message.obj);
                    return;
                }
                return;
            }
            LogUtil.j("HealthWeight_WeightUserManagerActivity", "handleMessageWhenReferenceNotNull msg.what ", Integer.valueOf(message.what));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UserInfomation userInfomation) {
        LogUtil.d("HealthWeight_WeightUserManagerActivity", "handleWhenGetUserInfoSuccess userInfo is ", userInfomation.toString());
        String strE = wsp.e(userInfomation);
        if (TextUtils.isEmpty(strE)) {
            String accountName = new UpApi(this.f27679b).getAccountName();
            LogUtil.d("HealthWeight_WeightUserManagerActivity", "handleWhenGetUserInfoSuccess accountName is ", accountName);
            if (!TextUtils.isEmpty(accountName)) {
                MultiUsersManager.INSTANCE.getMainUser().e(accountName);
                UserInfomation userInfo = this.j.getUserInfo();
                if (userInfo != null) {
                    if (TextUtils.isEmpty(userInfo.getName())) {
                        userInfo.setName(accountName);
                        this.j.setUserInfo(userInfo, null);
                    }
                } else {
                    LogUtil.j("HealthWeight_WeightUserManagerActivity", "userInfomation is null");
                }
            }
        } else {
            MultiUsersManager.INSTANCE.getMainUser().e(strE);
        }
        MultiUsersManager.INSTANCE.getMainUser().c(wsp.c(userInfomation));
        e();
    }

    private void b() {
        ((CustomTitleBar) qsp.a(this.f27679b, R.id.fitness_detail_titlebar)).setTitleText(getString(R.string.IDS_hw_base_health_user_list_manager_user));
        this.f = (ListView) qsp.a(this.f27679b, R.id.weight_user_manager_list_view);
        HealthToolBar healthToolBar = (HealthToolBar) findViewById(R.id.buttomview);
        this.i = healthToolBar;
        healthToolBar.d(View.inflate(this.f27679b, R.layout.hw_toolbar_bottomview, null));
        this.i.setIcon(1, R.drawable.achieve_user_device_icon);
        this.i.setIconTitle(1, getResources().getString(R.string.IDS_hw_health_show_healthdata_heart_add));
        this.i.setIcon(3, R.drawable.flightmode_active);
        this.i.setIconTitle(3, getResources().getString(R.string.IDS_main_btn_state_settings));
        this.i.a(this);
        this.i.setOnSingleTapListener(this);
        a aVar = new a(MultiUsersManager.INSTANCE.getMainAllUser());
        this.e = aVar;
        this.f.setAdapter((ListAdapter) aVar);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, this.f);
    }

    @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
    public void onSingleTap(int i) {
        if (i == 1) {
            d("");
            vei.b(this.f27679b, AnalyticsValue.WEIGHT_PAGE_CKICK_MANAGE_MEMBERS_2160120.value(), 2);
        } else {
            LogUtil.j("HealthWeight_WeightUserManagerActivity", "onSingleTap position ", Integer.valueOf(i));
        }
    }

    private void d() {
        this.f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightUserManagerActivity.3
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                dnj item = WeightUserManagerActivity.this.e.getItem(i);
                if (i != 0) {
                    if (item != null) {
                        WeightUserManagerActivity.this.d(item.i());
                        return;
                    } else {
                        LogUtil.j("HealthWeight_WeightUserManagerActivity", "user is null");
                        return;
                    }
                }
                if (WeightUserManagerActivity.this.f27679b != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("bundleKeyJumpUserInfoActivity", true);
                    AppRouter.c("/HWUserProfileMgr/UserInfoActivity").d(bundle).b(WeightUserManagerActivity.this.f27679b);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.j.getUserInfo(new BaseResponseCallback() { // from class: usf
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.c(i, (UserInfomation) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, UserInfomation userInfomation) {
        if (i == 0) {
            if (userInfomation == null) {
                LogUtil.j("HealthWeight_WeightUserManagerActivity", "updateUserInfo objData is null");
                return;
            }
            LogUtil.d("HealthWeight_WeightUserManagerActivity", "updateUserInfo objData ", userInfomation.toString());
            Message messageObtain = Message.obtain();
            messageObtain.obj = userInfomation;
            messageObtain.what = 2;
            if (this.d == null) {
                this.d = new b(this.f27679b);
            }
            this.d.sendMessage(messageObtain);
        }
    }

    private void e() {
        List<dnj> mainAllUser = MultiUsersManager.INSTANCE.getMainAllUser();
        this.e.a(mainAllUser);
        if (mainAllUser.size() >= 10) {
            this.i.setIconVisible(1, 8);
        } else {
            this.i.setIconVisible(1, 0);
        }
        this.i.setIconVisible(3, 8);
        LogUtil.a("HealthWeight_WeightUserManagerActivity", "initData list ", mainAllUser);
        iun.e("HealthWeight_WeightUserManagerActivity", mainAllUser);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
        this.e = null;
        this.d = null;
    }

    public void c() {
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver == null) {
            LogUtil.j("HealthWeight_WeightUserManagerActivity", "unregisterGetUserProfileBroadcast, but mUserProfileReceiver is null");
        } else {
            this.g.unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("HealthWeight_WeightUserManagerActivity", "onActivityResult requestCode is ", Integer.valueOf(i), " resultCode is ", Integer.valueOf(i2));
        if (i == 1) {
            this.j.sync(this.f27678a);
            imz.b("WeightUserManagerActivity");
        } else {
            if (i != 2 || intent == null) {
                return;
            }
            if (!this.f27680c) {
                this.f27680c = intent.getBooleanExtra("isChange", false);
            }
            LogUtil.a("HealthWeight_WeightUserManagerActivity", "onActivityResult isChange ", Boolean.valueOf(this.f27680c));
            if (this.f27680c) {
                vei.d((Activity) this, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Intent intent = new Intent(this.f27679b, (Class<?>) AddOrEditWeightUserActivity.class);
        intent.putExtra("weight_user_id_key", str);
        startActivityForResult(intent, 2);
    }

    /* JADX INFO: loaded from: classes19.dex */
    class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<dnj> f27685b = new ArrayList();
        private final LayoutInflater e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        a(List<dnj> list) {
            this.e = LayoutInflater.from(WeightUserManagerActivity.this.f27679b);
            a(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<dnj> list) {
            this.f27685b.clear();
            this.f27685b.addAll(list);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f27685b.size();
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public dnj getItem(int i) {
            if (i < 0 || i > this.f27685b.size() - 1) {
                LogUtil.j("HealthWeight_WeightUserManagerActivity", "position param exception");
                return null;
            }
            return this.f27685b.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate;
            e eVar;
            if (view == null) {
                eVar = new e();
                viewInflate = this.e.inflate(R.layout.item_weight_user_manager_list_view, (ViewGroup) null);
                eVar.f27687b = (ImageView) qsp.a(viewInflate, R.id.item_weight_current_user_photo);
                eVar.d = (HealthTextView) qsp.a(viewInflate, R.id.item_right_title_text);
                eVar.f27688c = (ImageView) qsp.a(viewInflate, R.id.hw_health_weight_user_manager_arrow);
                eVar.f27686a = (HealthDivider) qsp.a(viewInflate, R.id.user_manager_line);
                viewInflate.setTag(eVar);
            } else {
                viewInflate = view;
                eVar = (e) view.getTag();
            }
            if (this.f27685b.size() == i + 1) {
                eVar.f27686a.setVisibility(4);
            } else {
                eVar.f27686a.setVisibility(0);
            }
            dnj item = getItem(i);
            if (item == null) {
                LogUtil.j("HealthWeight_WeightUserManagerActivity", "getView user is null");
            } else {
                vbs.d(item, eVar.d, eVar.f27687b);
            }
            if (LanguageUtil.ba(WeightUserManagerActivity.this.f27679b)) {
                eVar.f27688c.setImageResource(R.drawable.common_ui_arrow_left);
                return viewInflate;
            }
            eVar.f27688c.setImageResource(R.drawable.common_ui_arrow_right);
            return viewInflate;
        }

        class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private HealthDivider f27686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private ImageView f27687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ImageView f27688c;
            private HealthTextView d;

            e() {
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
