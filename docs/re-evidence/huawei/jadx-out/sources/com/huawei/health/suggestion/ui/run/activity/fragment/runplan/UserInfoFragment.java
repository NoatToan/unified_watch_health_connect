package com.huawei.health.suggestion.ui.run.activity.fragment.runplan;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.gzx;
import defpackage.ibe;
import defpackage.ibl;
import defpackage.imx;
import defpackage.imz;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class UserInfoFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9926a;
    private ImageView ac;
    private HealthProgressBar ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9928c;
    private int d;
    private HealthButton e;
    private HealthTextView f;
    private HealthTextView i;
    private Context j;
    private String k;
    private HealthColumnRelativeLayout m;
    private HealthColumnRelativeLayout n;
    private RelativeLayout o;
    private HealthColumnRelativeLayout p;
    private RunPlanCreateActivity.OnNextPageListener r;
    private HealthColumnRelativeLayout s;
    private HealthColumnLinearLayout t;
    private HealthTextView u;
    private UserInfomation v;
    private HealthTextView x;
    private UserProfileMgrApi y;
    private List<View> h = new ArrayList();
    private List<View> g = new ArrayList();
    private a q = new a(this);
    private boolean l = false;
    private Handler w = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.suggestion.ui.run.activity.fragment.runplan.UserInfoFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                UserInfoFragment.this.h();
            }
        }
    };

    public static UserInfoFragment e() {
        return new UserInfoFragment();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.j = getContext();
        View viewInflate = layoutInflater.inflate(R.layout.sug_frag_user_info, viewGroup, false);
        a(viewInflate);
        b();
        this.y.getUserInfo(new d(this));
        return viewInflate;
    }

    static class d implements BaseResponseCallback<UserInfomation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<UserInfoFragment> f9930a;

        d(UserInfoFragment userInfoFragment) {
            this.f9930a = new WeakReference<>(userInfoFragment);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, UserInfomation userInfomation) {
            UserInfoFragment userInfoFragment = this.f9930a.get();
            if (userInfoFragment == null || userInfoFragment.isRemoving() || userInfoFragment.isDetached()) {
                return;
            }
            ReleaseLogUtil.d("Suggestion_UserInfoFragment", "GetUserInfoCallback userInfo is ", Boolean.valueOf(userInfomation == null));
            userInfoFragment.v = userInfomation;
            userInfoFragment.w.sendMessage(userInfoFragment.w.obtainMessage(0));
        }
    }

    private void a(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_UserInfoFragment", "initLayout view is null.");
            return;
        }
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.layout_tips);
        this.ad = (HealthProgressBar) healthColumnRelativeLayout.findViewById(R.id.tips_image_progress);
        this.ac = (ImageView) healthColumnRelativeLayout.findViewById(R.id.tips_image);
        this.o = (RelativeLayout) healthColumnRelativeLayout.findViewById(R.id.layout_bubbles);
        HealthTextView healthTextView = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_question);
        healthTextView.setText(R.string.IDS_check_personal_information);
        this.h.add(healthTextView);
        this.t = (HealthColumnLinearLayout) healthColumnRelativeLayout.findViewById(R.id.layout_summary);
        this.u = (HealthTextView) healthColumnRelativeLayout.findViewById(R.id.tips_summary);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.card_view_info);
        this.h.add(healthCardView);
        this.g.add(healthCardView);
        BaseActivity.setViewSafeRegion(true, healthCardView);
        HealthColumnRelativeLayout healthColumnRelativeLayout2 = (HealthColumnRelativeLayout) view.findViewById(R.id.user_gender);
        this.n = healthColumnRelativeLayout2;
        ((HealthTextView) healthColumnRelativeLayout2.findViewById(R.id.tv_key)).setText(R.string.IDS_hw_show_set_gender);
        this.i = (HealthTextView) this.n.findViewById(R.id.tv_value);
        HealthColumnRelativeLayout healthColumnRelativeLayout3 = (HealthColumnRelativeLayout) view.findViewById(R.id.user_birth_date);
        this.m = healthColumnRelativeLayout3;
        ((HealthTextView) healthColumnRelativeLayout3.findViewById(R.id.tv_key)).setText(R.string.IDS_hw_show_set_birthday);
        this.f9928c = (HealthTextView) this.m.findViewById(R.id.tv_value);
        HealthColumnRelativeLayout healthColumnRelativeLayout4 = (HealthColumnRelativeLayout) view.findViewById(R.id.user_height);
        this.p = healthColumnRelativeLayout4;
        ((HealthTextView) healthColumnRelativeLayout4.findViewById(R.id.tv_key)).setText(R.string.IDS_sns_height_title);
        this.f = (HealthTextView) this.p.findViewById(R.id.tv_value);
        HealthColumnRelativeLayout healthColumnRelativeLayout5 = (HealthColumnRelativeLayout) view.findViewById(R.id.user_weight);
        this.s = healthColumnRelativeLayout5;
        ((HealthTextView) healthColumnRelativeLayout5.findViewById(R.id.tv_key)).setText(R.string.IDS_sns_weight_title);
        this.x = (HealthTextView) this.s.findViewById(R.id.tv_value);
        if (LanguageUtil.ba(this.j)) {
            Drawable drawable = ContextCompat.getDrawable(this.j, R.drawable.common_ui_arrow_left);
            this.n.findViewById(R.id.user_info_image_view).setBackground(drawable);
            this.m.findViewById(R.id.user_info_image_view).setBackground(drawable);
            this.p.findViewById(R.id.user_info_image_view).setBackground(drawable);
            this.s.findViewById(R.id.user_info_image_view).setBackground(drawable);
        }
        ibe.b(view, healthColumnRelativeLayout, healthCardView, (RelativeLayout) view.findViewById(R.id.sug_layout_btn), 0);
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.sug_btn_next);
        this.e = healthButton;
        this.h.add(healthButton);
        this.g.add(this.e);
        ibe.a(true, this.h);
        ibl.a(this.j, 5, this.ad, this.ac);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            LogUtil.a("Suggestion_UserInfoFragment", "isHidden fragment.");
        } else {
            this.o.setVisibility(0);
            ibe.a(true, this.h);
        }
    }

    private void b() {
        this.n.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.p.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.l) {
            this.l = false;
            if (d()) {
                ThirdPartyLoginManager.getInstance().queryUserInfo(new e(this), false);
                imz.b("UserInfoFragment");
            } else {
                this.y.sync(new b(this));
            }
        }
    }

    static class b implements CommonCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<UserInfoFragment> f9929b;

        b(UserInfoFragment userInfoFragment) {
            this.f9929b = new WeakReference<>(userInfoFragment);
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onSuccess(Bundle bundle) {
            UserInfoFragment userInfoFragment = this.f9929b.get();
            if (userInfoFragment == null) {
                LogUtil.e("Suggestion_UserInfoFragment", "SynchronousDataCallback fragment is null.");
                return;
            }
            LogUtil.a("Suggestion_UserInfoFragment", "hw sync userinfo success");
            if (userInfoFragment.w == null || userInfoFragment.y == null) {
                return;
            }
            userInfoFragment.v = userInfoFragment.y.getUserInfo();
            userInfoFragment.w.sendEmptyMessage(0);
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onFail(int i) {
            LogUtil.a("Suggestion_UserInfoFragment", "hw sync userinfo fail:", Integer.valueOf(i));
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<UserInfoFragment> f9931a;

        e(UserInfoFragment userInfoFragment) {
            this.f9931a = new WeakReference<>(userInfoFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            UserInfoFragment userInfoFragment = this.f9931a.get();
            if (userInfoFragment != null) {
                if (userInfoFragment.w == null || userInfoFragment.y == null || i != 0) {
                    return;
                }
                userInfoFragment.v = userInfoFragment.y.getUserInfo();
                userInfoFragment.w.sendEmptyMessage(0);
                return;
            }
            LogUtil.e("Suggestion_UserInfoFragment", "QueryUserInfoCallback fragment is null.");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        FragmentActivity activity = getActivity();
        if (activity == null || qrs.c(500)) {
            LogUtil.j("Suggestion_UserInfoFragment", "onClick activity is null or click too fast.");
            return;
        }
        RunPlanCreateActivity.OnNextPageListener onNextPageListener = this.r;
        if (onNextPageListener == null) {
            activity.finish();
            return;
        }
        if (view == this.e) {
            onNextPageListener.backLock();
            ibe.a(false, this.g);
            f();
            ibe.a(this.o, this.t, this.r, true);
            return;
        }
        if (view == this.n) {
            g();
        } else if (view == this.m) {
            i();
        } else {
            c(view);
        }
    }

    private void c(View view) {
        if (view == null || this.v == null) {
            LogUtil.j("Suggestion_UserInfoFragment", "clickHeightOrWeight view or mUserInfo is null.");
            return;
        }
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.loadAccountExtData(this.v);
        if (view == this.p) {
            imx.c(getActivity(), userInfomation, this.q);
        } else if (view != this.s) {
            LogUtil.e("Suggestion_UserInfoFragment", "LayoutClickListener view not define.");
        } else {
            imx.d(getActivity(), userInfomation, this.q);
        }
    }

    private void g() {
        if (j()) {
            this.l = true;
            if (d()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(getActivity(), null);
                return;
            } else {
                imx.a((Activity) getActivity());
                return;
            }
        }
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.loadAccountData(this.v);
        imx.d(getActivity(), 20, userInfomation, this.q);
    }

    private void i() {
        if (j()) {
            this.l = true;
            if (d()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(getActivity(), null);
                return;
            } else {
                imx.a((Activity) getActivity());
                return;
            }
        }
        imx.e(getActivity(), this.f9927b, this.d, this.f9926a, this.q);
    }

    private boolean j() {
        if (TextUtils.isEmpty(this.k)) {
            this.k = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN);
        }
        return !"1".equals(this.k);
    }

    private boolean d() {
        return CommonUtil.z(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(float f) {
        if (f < 10.0f || f > 250.0f) {
            LogUtil.e("Suggestion_UserInfoFragment", "updateWeight weight is invalid.");
            f = 60.0f;
        }
        String strE = imx.e(this.j, f);
        this.v.setWeight(f);
        this.x.setText(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i < 50 || i > 250) {
            LogUtil.e("Suggestion_UserInfoFragment", "updateHeight height is invalid.");
            i = 170;
        }
        String strD = imx.d(this.j, i);
        this.v.setHeight(i);
        this.f.setText(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        String strC = imx.c(this.j, str);
        if (b(qrs.a(str))) {
            qpx.b(this.j.getApplicationContext(), this.j.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_now));
        } else {
            this.v.setBirthday(str);
            this.f9928c.setText(strC);
        }
    }

    private boolean b(int i) {
        Calendar calendar = Calendar.getInstance();
        this.f9927b = i / 10000;
        int i2 = calendar.get(1);
        if (this.f9927b > i2) {
            return true;
        }
        this.d = (i % 10000) / 100;
        int i3 = calendar.get(2);
        if (this.f9927b == i2 && this.d > i3) {
            return true;
        }
        this.f9926a = i % 100;
        return this.f9927b == i2 && this.d == i3 && this.f9926a > calendar.get(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 0) {
            this.i.setText(R.string.IDS_hw_show_set_default_gender_male);
        } else if (i == 1) {
            this.i.setText(R.string.IDS_hw_show_set_default_gender_female);
        } else {
            this.i.setText(R.string.IDS_hw_me_userinfo_secret);
        }
        this.v.setGender(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        UserInfomation userInfomation = this.v;
        if (userInfomation == null) {
            LogUtil.e("Suggestion_UserInfoFragment", "initUserInfo mUserInfo is null.");
            return;
        }
        if (!userInfomation.isGenderValid()) {
            this.v.setGender(2);
        }
        e(this.v.getGender());
        a(this.v.getBirthday());
        a(this.v.getHeight());
        b(this.v.getWeight());
    }

    static class a implements IBaseResponseCallback {
        WeakReference<UserInfoFragment> d;

        a(UserInfoFragment userInfoFragment) {
            this.d = new WeakReference<>(userInfoFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            UserInfoFragment userInfoFragment = this.d.get();
            if (userInfoFragment == null) {
                LogUtil.j("Suggestion_UserInfoFragment", "ShowSetValueDialogListener fragment is null.");
                return;
            }
            if (i == -1) {
                imx.a(userInfoFragment.j);
                return;
            }
            if (!(obj instanceof UserInfomation)) {
                LogUtil.j("Suggestion_UserInfoFragment", "ShowSetValueDialogListener objData is invalid.");
                return;
            }
            UserInfomation userInfomation = (UserInfomation) obj;
            if (i == 20) {
                userInfoFragment.e(ibl.b(userInfomation.getGenderOrDefaultValue()));
                return;
            }
            if (i == 3) {
                userInfoFragment.a(userInfomation.getBirthday());
                return;
            }
            if (i == 0) {
                if (UnitUtil.f()) {
                    userInfoFragment.a(userInfomation.getHeight());
                } else {
                    userInfoFragment.a(userInfomation.getHeight() + 50);
                }
                userInfoFragment.c();
                return;
            }
            if (i != 1) {
                LogUtil.j("Suggestion_UserInfoFragment", "errorCode not define");
                return;
            }
            if (UnitUtil.f()) {
                userInfoFragment.b((float) UnitUtil.i(userInfomation.getWeight() + 22.0f));
            } else {
                userInfoFragment.b(userInfomation.getWeight() + 10.0f);
            }
            userInfoFragment.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.y.setUserInfo(this.v, new c());
    }

    static class c implements ICloudOperationResult<Boolean> {
        c() {
        }

        @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void operationResult(Boolean bool, String str, boolean z) {
            LogUtil.a("Suggestion_UserInfoFragment", "object = ", bool, ", text = ", str, ", isSuccess = ", Boolean.valueOf(z));
        }
    }

    private void f() {
        this.u.setText(gzx.c(this.j, R.string.IDS_sug_link_info, this.i.getText(), this.f9928c.getText(), this.f.getText(), this.x.getText()));
    }

    public UserInfomation a() {
        return this.v;
    }

    public void e(RunPlanCreateActivity.OnNextPageListener onNextPageListener) {
        this.r = onNextPageListener;
    }
}
