package com.huawei.ui.main.stories.configuredpage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.sport.configuredpage.ConfiguredPageItemDecoration;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.ActivityHtmlPathApi;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.soical.adpters.SocialActRecyclerAdapter;
import com.huawei.ui.main.stories.soical.interactor.OperationInteractorsApi;
import defpackage.dlp;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class ActivityListFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f26361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f26362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f26363c;
    private HealthRecycleView d;
    private int h;
    private Context i;
    private int k;
    private final OperationInteractorsApi m;
    private JSONArray g = null;
    private List<dlp> n = new ArrayList(2);
    private SocialActRecyclerAdapter e = null;
    private boolean f = true;
    private Pair<Integer, Integer> l = BaseActivity.getSafeRegionWidth();
    private Handler j = new Handler() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (message.what == 1 && (message.obj instanceof List)) {
                ActivityListFragment.this.c((List<dlp>) message.obj);
            }
            super.handleMessage(message);
        }
    };

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public ActivityListFragment() {
        LogUtil.a("Opera_activityListFragment", "ActivityListFragment()");
        this.m = (OperationInteractorsApi) Services.d("OperationBundle", OperationInteractorsApi.class);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Opera_activityListFragment", "onCreate");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i = getActivity();
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j("Opera_activityListFragment", "onCreateView Bundle is null");
        } else {
            this.k = arguments.getInt("PAGE_TYPE");
        }
        LogUtil.a("Opera_activityListFragment", "mPageType: ", Integer.valueOf(this.k));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activity_card_list, viewGroup, false);
        this.f26362b = viewInflate;
        this.f26361a = (LinearLayout) viewInflate.findViewById(R.id.activity_list_container);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.f26362b.findViewById(R.id.activity_list_title);
        this.f26363c = healthSubHeader;
        ViewGroup.LayoutParams layoutParams = healthSubHeader.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = layoutParams2.leftMargin;
            int i2 = layoutParams2.rightMargin;
            layoutParams2.leftMargin = i + ((Integer) this.l.first).intValue();
            layoutParams2.rightMargin = i2 + ((Integer) this.l.second).intValue();
        }
        this.f26363c.setSubHeaderBackgroundColor(0);
        this.f26363c.setMoreText("");
        this.f26363c.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ActivityListFragment.this.b();
            }
        });
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.2
            @Override // java.lang.Runnable
            public void run() {
                ActivityListFragment.this.d();
            }
        });
        this.h = qqp.b(this.i);
        CommonUtil.d("TimeEat_activityListFragment", "Leave onCreateView");
        return this.f26362b;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("Opera_activityListFragment", "onConfigurationChanged");
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d = (HealthRecycleView) this.f26362b.findViewById(R.id.activity_recycle_view);
        SocialActRecyclerAdapter socialActRecyclerAdapter = new SocialActRecyclerAdapter(this.i, this.n);
        this.e = socialActRecyclerAdapter;
        this.d.setAdapter(socialActRecyclerAdapter);
        c();
    }

    private void c() {
        int i;
        int i2;
        if (qrs.af(this.i)) {
            i2 = this.h;
            i = 2;
        } else {
            i = 1;
            i2 = 0;
        }
        if (this.d.getItemDecorationCount() > 0 && this.d.getItemDecorationAt(0) != null) {
            this.d.removeItemDecorationAt(0);
        }
        int[] iArr = new int[4];
        iArr[1] = 0;
        iArr[3] = 0;
        int i3 = this.k;
        if (i3 == 6 || i3 == 4 || i3 == 5 || i3 == 1) {
            iArr[0] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) this.l.first).intValue();
            iArr[2] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) this.l.second).intValue();
        } else {
            iArr[0] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.maxPaddingStart) + ((Integer) this.l.first).intValue();
            iArr[2] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.maxPaddingEnd) + ((Integer) this.l.second).intValue();
        }
        this.d.addItemDecoration(new ConfiguredPageItemDecoration(i2, BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), i, iArr));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.i, i);
        gridLayoutManager.setOrientation(1);
        this.d.setLayoutManager(gridLayoutManager);
        this.d.setHasFixedSize(true);
        this.d.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        GRSManager.c(this.i).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                String str2 = str + ((ActivityHtmlPathApi) Services.b("PluginOperation", ActivityHtmlPathApi.class)).getActivityHtmlPath() + Constants.ACTIVITY_HTML;
                Intent intent = new Intent(ActivityListFragment.this.i, (Class<?>) WebViewActivity.class);
                intent.putExtra("url", str2);
                intent.putExtra("type", "ACT_MORE");
                intent.putExtra("EXTRA_BI_ID", "");
                intent.putExtra("EXTRA_BI_NAME", ActivityListFragment.this.i.getResources().getString(R.string.IDS_main_home_bottom_text_activity));
                intent.putExtra("EXTRA_BI_SOURCE", "ACT_MORE");
                intent.putExtra("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
                intent.setFlags(268435456);
                try {
                    ActivityListFragment.this.i.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    LogUtil.e("Opera_activityListFragment", "ActivityNotFoundException", e.getMessage());
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.d("Opera_activityListFragment", "GRSManager onCallBackFail HEALTH_RECOMMEND code = ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (LoginInit.getInstance(this.i).isKidAccount() || !Utils.o()) {
            LogUtil.a("Opera_activityListFragment", "refreshActivityList isKidAccount return.");
        } else {
            this.m.getOperationList(this.i.getApplicationContext(), -1, null, new HttpResCallback() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.4
                @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                public void onFinished(int i, String str) {
                    LogUtil.a("Opera_activityListFragment", "getActivities resCode = ", Integer.valueOf(i));
                    if (i != 200) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ActivityListFragment.this.e(str);
                    } else {
                        LogUtil.j("Opera_activityListFragment", "refreshActivityList result is empty.");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!TextUtils.isEmpty(string) && "0".equals(string)) {
                String strOptString = jSONObject.optString("currentTime");
                d(strOptString);
                JSONArray jSONArray = jSONObject.getJSONArray("activities");
                if (jSONArray.length() >= 0 && !jSONArray.equals(this.g)) {
                    this.g = jSONArray;
                    ArrayList arrayList = new ArrayList(2);
                    ArrayList arrayList2 = new ArrayList(2);
                    List<String> allLabels = ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getAllLabels(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
                    for (int i = 0; i < this.g.length(); i++) {
                        dlp dlpVarExpoundOperationActivity = this.m.expoundOperationActivity(this.g.getJSONObject(i));
                        if (dlpVarExpoundOperationActivity != null && this.m.getActivityStatus(strOptString, dlpVarExpoundOperationActivity.s(), dlpVarExpoundOperationActivity.o()) != -1) {
                            if (this.m.isMatchPage(this.k, this.m.getActivityPageType(dlpVarExpoundOperationActivity))) {
                                if (dlpVarExpoundOperationActivity.i() > -1 && !arrayList.contains(dlpVarExpoundOperationActivity)) {
                                    arrayList.add(dlpVarExpoundOperationActivity);
                                }
                                if (dlpVarExpoundOperationActivity.i() == -1 && this.m.isUserLabelActivity(dlpVarExpoundOperationActivity, allLabels) && !arrayList2.contains(dlpVarExpoundOperationActivity)) {
                                    arrayList2.add(dlpVarExpoundOperationActivity);
                                }
                            }
                        }
                    }
                    c(arrayList, arrayList2);
                }
            }
        } catch (JSONException e) {
            LogUtil.e("Opera_activityListFragment", "Json data error! JSONException:", e.getMessage());
        }
    }

    private void d(String str) {
        SharedPreferenceManager.e(this.i, Integer.toString(10011), OperationInteractorsApi.OPERATION_ACTIVITY_CURRENT_TIME, str, new StorageParams());
    }

    private void c(List<dlp> list, List<dlp> list2) {
        if (njy.e(list)) {
            list = list2;
        }
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = list;
        this.j.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<dlp> list) {
        LogUtil.a("Opera_activityListFragment", "updateActivityCardList");
        if (njy.e(list)) {
            this.f26361a.setVisibility(8);
            return;
        }
        this.n.clear();
        this.n.addAll(list);
        this.e.notifyDataSetChanged();
        this.f26361a.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("Opera_activityListFragment", "ConfiguredPageFragment onResume");
        if (!this.f && getUserVisibleHint()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.configuredpage.ActivityListFragment.9
                @Override // java.lang.Runnable
                public void run() {
                    ActivityListFragment.this.d();
                }
            });
        }
        this.f = false;
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a("Opera_activityListFragment", "ConfiguredPageFragment onPause");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }
}
