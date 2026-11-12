package com.huawei.ui.main.stories.member;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.operationbundle.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.main.stories.soical.MemberCenterFragment;
import defpackage.btw;
import defpackage.fcn;
import defpackage.irz;
import defpackage.lsy;
import defpackage.qqy;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes3.dex */
public class MemberRelayActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f28609b;
    private boolean e;
    private UserMemberInfo f;
    private Fragment g;
    private int i = 7;
    private boolean d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28608a = false;
    private boolean h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28610c = false;
    private String j = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.member_relay_container);
        this.f = irz.a();
        b();
        c();
    }

    private void b() {
        Intent intent = getIntent();
        this.f28609b = intent;
        String stringExtra = intent.getStringExtra("memberTabRelayUri");
        this.i = this.f28609b.getIntExtra("from", 7);
        a(stringExtra);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = qqy.a(str);
        this.j = strA;
        LogUtil.a("MemberRelayActivity", "handleUrl url：", strA);
        Uri uri = Uri.parse(strA);
        this.h = uri.getBooleanQueryParameter("scrollDown", false);
        this.f28610c = uri.getBooleanQueryParameter("popUpTypeSelect", false);
        String stringExtra = this.f28609b.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM);
        String stringExtra2 = this.f28609b.getStringExtra("fromPageTitle");
        String queryParameter = uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = queryParameter;
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        fcn.i(stringExtra);
        String queryParameter2 = uri.getQueryParameter("fromPageTitle");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = queryParameter2;
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        fcn.d(stringExtra2);
        String queryParameter3 = uri.getQueryParameter("pullOrder");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        fcn.t(queryParameter3);
        String queryParameter4 = uri.getQueryParameter("resourceName");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        fcn.q(queryParameter4);
        String queryParameter5 = uri.getQueryParameter("resourceId");
        if (queryParameter5 == null) {
            queryParameter5 = "";
        }
        fcn.s(queryParameter5);
        String queryParameter6 = uri.getQueryParameter("payResourceType");
        if (queryParameter6 == null) {
            queryParameter6 = "";
        }
        fcn.p(queryParameter6);
        String queryParameter7 = uri.getQueryParameter("benefitName");
        fcn.a(queryParameter7 != null ? queryParameter7 : "");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("MemberRelayActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        Fragment fragment = this.g;
        if (fragment instanceof MemberIntroFragment) {
            ((MemberIntroFragment) fragment).onVisibilityChange(true);
            ((MemberIntroFragment) this.g).e(this.h);
            ((MemberIntroFragment) this.g).a(this.f28610c);
            ((MemberIntroFragment) this.g).c(this.j);
        }
        Fragment fragment2 = this.g;
        if (fragment2 instanceof MemberCenterFragment) {
            ((MemberCenterFragment) fragment2).onVisibilityChange(true);
            ((MemberCenterFragment) this.g).c(this.f28610c);
            ((MemberCenterFragment) this.g).d(this.j);
        }
        if (!this.d) {
            ObserverManagerUtil.e("REFRESH_MEMBER_INFO_CARD_VIEW", true);
            e();
        }
        this.d = false;
        ObserverManagerUtil.e("MEMBER_PAGE_IS_VISIBLE_TO_USER", true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("MemberRelayActivity", "onActivityResult requestCode: ", Integer.valueOf(i));
        if (intent == null) {
            LogUtil.a("MemberRelayActivity", "onActivityResult data: ", intent);
            return;
        }
        int intExtra = intent.getIntExtra("shoppingResult", -1);
        LogUtil.a("MemberRelayActivity", "onActivityResult shoppingResult: ", Integer.valueOf(intExtra));
        if (intExtra != 0) {
            return;
        }
        ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", true);
        a();
    }

    private void d() {
        fcn.q("");
        fcn.s("");
        fcn.t("");
        fcn.i("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: vxw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51686b.a();
                }
            });
        }
        Fragment fragment = this.g;
        if (fragment != null) {
            d(fragment);
        }
        this.f28608a = true;
        MemberCenterFragment memberCenterFragment = new MemberCenterFragment();
        this.g = memberCenterFragment;
        LogUtil.a("MemberRelayActivity", "switch mVipFragment ", memberCenterFragment.getClass());
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_SHOW_TITLE_RETURN_BUTTOM", true);
        this.g.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.isDestroyed()) {
            return;
        }
        supportFragmentManager.beginTransaction().replace(R.id.member_relay_activity_layout, this.g).commitNowAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f28608a) {
            this.f28608a = false;
            return;
        }
        boolean zB = b(this.f);
        Fragment fragment = this.g;
        if (fragment != null) {
            d(fragment);
        }
        boolean zE = btw.e();
        this.e = zE;
        Fragment memberCenterFragment = (zB || zE) ? new MemberCenterFragment() : new MemberIntroFragment();
        this.g = memberCenterFragment;
        LogUtil.a("MemberRelayActivity", "initFragment ", memberCenterFragment.getClass());
        i();
        h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_SHOW_TITLE_RETURN_BUTTOM", true);
        this.g.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.isDestroyed()) {
            LogUtil.e("MemberRelayActivity", "initFragment fm is destroyed");
        } else {
            supportFragmentManager.beginTransaction().replace(R.id.member_relay_activity_layout, this.g).commitNowAllowingStateLoss();
        }
    }

    private void d(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.isDestroyed()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.remove(fragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void i() {
        Fragment fragment;
        UserMemberInfo userMemberInfo = this.f;
        if (userMemberInfo == null || (fragment = this.g) == null || !(fragment instanceof MemberIntroFragment)) {
            return;
        }
        if (userMemberInfo.getMemberFlag() == -1) {
            ((MemberIntroFragment) this.g).b(0);
        } else {
            if (this.f.getNowTime() <= this.f.getExpireTime() || this.e) {
                return;
            }
            ((MemberIntroFragment) this.g).b(2);
        }
    }

    private void h() {
        Fragment fragment;
        UserMemberInfo userMemberInfo = this.f;
        if (userMemberInfo == null || (fragment = this.g) == null || !(fragment instanceof MemberCenterFragment)) {
            return;
        }
        if (userMemberInfo.getAutoRenew() == 1) {
            ((MemberCenterFragment) this.g).d(0);
        } else {
            ((MemberCenterFragment) this.g).d(1);
        }
    }

    private boolean b(Object obj) {
        if (!(obj instanceof UserMemberInfo)) {
            return false;
        }
        UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
        return userMemberInfo.getMemberFlag() == 1 && !irz.d(userMemberInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("MemberRelayActivity", "checkVipUser");
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.member.MemberRelayActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    MemberRelayActivity.this.e();
                }
            });
        } else {
            ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new AnonymousClass1());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.member.MemberRelayActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements VipCallback {
        @Override // com.huawei.health.vip.api.VipCallback
        public void onFailure(int i, String str) {
        }

        AnonymousClass1() {
        }

        @Override // com.huawei.health.vip.api.VipCallback
        public void onSuccess(Object obj) {
            LogUtil.a("MemberRelayActivity", "checkVipUser onSuccess: mUserMemberInfo ", MemberRelayActivity.this.f, " result ", obj);
            if (obj instanceof UserMemberInfo) {
                ObserverManagerUtil.e("USER_MEMBER_INFO_UPDATE", obj);
                if (MemberRelayActivity.this.f == null || MemberRelayActivity.this.d(obj)) {
                    MemberRelayActivity.this.f = (UserMemberInfo) obj;
                    LogUtil.a("MemberRelayActivity", "checkVipUser refresh");
                    HandlerExecutor.b(new Runnable() { // from class: vyc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51689c.d();
                        }
                    });
                }
            }
        }

        public /* synthetic */ void d() {
            MemberRelayActivity.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Object obj) {
        if ((this.g instanceof MemberIntroFragment) && b(obj)) {
            return true;
        }
        return (!(this.g instanceof MemberCenterFragment) || b(obj) || this.e) ? false : true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
