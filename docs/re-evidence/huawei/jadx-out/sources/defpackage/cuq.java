package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.featureuserprofile.UserInfoBroadcastReceiver;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.UnitUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class cuq extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cuq f31324c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ioi f31325a;
    private boolean e;
    private UserInfoBroadcastReceiver f;
    private cup i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31323b = new Object();
    private static HashSet<String> d = new HashSet<>(Arrays.asList("com.huawei.bone.action.CLOUD_SWITCH_CHANGED", "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"));

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        return true;
    }

    private cuq(Context context) {
        super(context);
        this.i = null;
        this.f31325a = null;
        this.e = false;
        LogUtil.a("UserProfileMgr", "HWUserProfileMgr init");
        this.i = cup.c(context);
        this.f31325a = ioi.d();
        this.f = new UserInfoBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        BroadcastManagerUtil.d(context, this.f, intentFilter, BroadcastManagerUtil.f36518c, null);
    }

    public static cuq a(Context context) {
        cuq cuqVar;
        if (context == null) {
            LogUtil.j("UserProfileMgr", "getInstance context is null");
            return null;
        }
        if (!EnvironmentUtils.d()) {
            LogUtil.j("UserProfileMgr", "getInstance isMainProcess false, UserProfileMgr error.");
        }
        synchronized (f31323b) {
            if (f31324c == null) {
                f31324c = new cuq(context.getApplicationContext());
            }
            cuqVar = f31324c;
        }
        return cuqVar;
    }

    public void a(ioj iojVar) {
        if (this.e) {
            LogUtil.j("UserProfileMgr", "init should be called only once");
            return;
        }
        if (iojVar.a()) {
            LogUtil.a("UserProfileMgr", "init allow login area");
            g();
            a();
        } else {
            LogUtil.a("UserProfileMgr", "init not allow login area");
            d(BaseApplication.getContext());
        }
        i();
        this.e = true;
    }

    public boolean k() {
        return this.i.h();
    }

    public boolean e() {
        return this.i.d();
    }

    public void a() {
        this.i.b();
        this.f31325a.b();
    }

    void i() {
        this.i.e();
    }

    public void h() {
        this.i.a();
        this.f31325a.e();
    }

    public void j() {
        this.i.i();
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        dab.d(iBaseResponseCallback);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        dab.b(iBaseResponseCallback);
    }

    public void f() {
        dab.b();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1004;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Set<String> getAvailableBroadcastSet() {
        return d;
    }

    public void d(UserInfomation userInfomation, ICloudOperationResult<Boolean> iCloudOperationResult) {
        this.i.e(userInfomation, iCloudOperationResult);
    }

    public UserInfomation c() {
        return this.i.c();
    }

    public void e(BaseResponseCallback<UserInfomation> baseResponseCallback) {
        LogUtil.a("UserProfileMgr", "getUserInfo() callback");
        if (baseResponseCallback == null) {
            LogUtil.j("UserProfileMgr", "getUserInfo callback == null");
        } else {
            this.i.a(baseResponseCallback);
        }
    }

    public void d(CommonCallback commonCallback) {
        this.i.d(commonCallback);
    }

    public void g() {
        this.i.j();
    }

    public void d(Context context) {
        LogUtil.a("UserProfileMgr", "setNoAllowLoginArea() enter");
        this.i.g();
        LoginInit loginInit = LoginInit.getInstance(context);
        loginInit.setIsLogined(true);
        loginInit.setAccountInfo(1011, "0", null);
        loginInit.setAccountInfo(1004, "0", null);
        loginInit.setIsBrowseModeToPd(context, false);
    }

    public iof b() {
        return EmergencyInfoManager.a().b();
    }

    public static Bitmap b(Context context) {
        UserInfomation userInfomationC = a(context).c();
        String picPath = userInfomationC != null ? userInfomationC.getPicPath() : null;
        if (!TextUtils.isEmpty(picPath)) {
            return qqf.a(context, picPath);
        }
        LogUtil.j("UserProfileMgr", "initHeadIcon, imgUrl is null");
        return null;
    }

    public static UserInfomation d() {
        cuq cuqVarA = a(BaseApplication.getContext());
        if (cuqVarA != null) {
            UserInfomation userInfomationC = cuqVarA.c();
            if (userInfomationC != null) {
                LogUtil.a("UserProfileMgr", "getLocalUserInfo return  MerryuserInformation");
                return userInfomationC;
            }
            UserInfomation userInfomation = new UserInfomation(UnitUtil.f() ? 1 : 0);
            LogUtil.a("UserProfileMgr", "getLocalUserInfo is null");
            return userInfomation;
        }
        UserInfomation userInfomation2 = new UserInfomation(UnitUtil.f() ? 1 : 0);
        LogUtil.e("UserProfileMgr", "getLocalUserInfo hwUserProfileMgr is null");
        return userInfomation2;
    }
}
