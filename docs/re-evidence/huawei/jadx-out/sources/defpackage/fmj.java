package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes29.dex */
public class fmj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile fmj f34265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f34266c = new Object();
    private UserMemberInfo e;

    public static fmj e() {
        LogUtil.a("QueryMemberManager", "QueryMemberManager getInstance");
        if (f34265b == null) {
            synchronized (f34266c) {
                if (f34265b == null) {
                    f34265b = new fmj();
                }
            }
        }
        return f34265b;
    }

    protected List<String> a(List<String> list) {
        LogUtil.a("QueryMemberManager", "getMemberInfo start");
        ArrayList arrayList = new ArrayList(3);
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "USER_VIP_INFO_KEY");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("QueryMemberManager", "getMemberInfo from sp is empty. use netWork request.");
            return b(list, arrayList);
        }
        LogUtil.a("QueryMemberManager", "getMemberInfo from sp");
        UserMemberInfo userMemberInfo = (UserMemberInfo) peh.b(strE, UserMemberInfo.class);
        this.e = userMemberInfo;
        if (userMemberInfo == null) {
            return b(list, arrayList);
        }
        a(list, arrayList);
        return arrayList;
    }

    private List<String> b(List<String> list, List<String> list2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d(list2, countDownLatch, list);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e("QueryMemberManager", "getVipMemberInfo:InterruptedException exception = ", e.getMessage());
        }
        LogUtil.a("QueryMemberManager", "getviplabel by network finish.");
        return list2;
    }

    private void d(List<String> list) {
        String str;
        UserMemberInfo userMemberInfo = this.e;
        if (userMemberInfo == null) {
            LogUtil.j("QueryMemberManager", "mUserMemberInfo is null.");
            return;
        }
        int memberFlag = userMemberInfo.getMemberFlag();
        long expireTime = this.e.getExpireTime();
        long nowTime = this.e.getNowTime();
        if (!Double.isNaN(expireTime) && !Double.isNaN(nowTime) && expireTime > nowTime && memberFlag == 1) {
            str = "UserMemberFlag_1";
        } else {
            str = "UserMemberFlag_0";
        }
        LogUtil.d("QueryMemberManager", "generateMemberFlagLabel value = ", str);
        list.add(str);
    }

    private void c(List<String> list) {
        String str;
        UserMemberInfo userMemberInfo = this.e;
        if (userMemberInfo == null) {
            LogUtil.j("QueryMemberManager", "mUserMemberInfo is null.");
            return;
        }
        int autoRenew = userMemberInfo.getAutoRenew();
        if (!Double.isNaN(autoRenew) && autoRenew == 1) {
            str = "UserMemberType_1";
        } else {
            str = "UserMemberType_0";
        }
        LogUtil.d("QueryMemberManager", "generateMemberTypeLabel value = ", str);
        list.add(str);
    }

    private void b(List<String> list) {
        String str;
        UserMemberInfo userMemberInfo = this.e;
        if (userMemberInfo == null) {
            LogUtil.j("QueryMemberManager", "mUserMemberInfo is null.");
            return;
        }
        long expireTime = userMemberInfo.getExpireTime();
        long nowTime = this.e.getNowTime();
        if (Double.isNaN(expireTime) || Double.isNaN(nowTime)) {
            str = "";
        } else if (expireTime < nowTime) {
            str = "UserMemberStage_0";
        } else if (expireTime > nowTime && expireTime - nowTime <= 259200000) {
            str = "UserMemberStage_1";
        } else {
            LogUtil.a("QueryMemberManager", "memberFlag value = ", Integer.valueOf(this.e.getMemberFlag()));
            str = "";
        }
        LogUtil.d("QueryMemberManager", "generateMemberStageLabel value = ", str);
        list.add(str);
    }

    private void d(final List<String> list, final CountDownLatch countDownLatch, final List<String> list2) {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.j("QueryMemberManager", "refreshVipStateData VipApi is null");
            countDownLatch.countDown();
        } else {
            vipApi.getVipInfo(new VipCallback() { // from class: fmj.3
                @Override // com.huawei.health.vip.api.VipCallback
                public void onSuccess(Object obj) {
                    if (obj == null) {
                        LogUtil.a("QueryMemberManager", "getVipMemberInfo onSuccess result is null");
                        countDownLatch.countDown();
                        return;
                    }
                    if (obj instanceof UserMemberInfo) {
                        fmj.this.e = (UserMemberInfo) obj;
                        if (fmj.this.e == null) {
                            LogUtil.j("QueryMemberManager", "getVipMemberInfo memberInfo == null ");
                            countDownLatch.countDown();
                            return;
                        } else {
                            LogUtil.a("QueryMemberManager", "getVipMemberInfo mUserMemberInfo = ", fmj.this.e.toString());
                            fmj.this.a(list2, list);
                        }
                    }
                    countDownLatch.countDown();
                }

                @Override // com.huawei.health.vip.api.VipCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("QueryMemberManager", "getVipMemberInfo errorCode=", Integer.valueOf(i), " errMsg=", str);
                    countDownLatch.countDown();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list, List<String> list2) {
        if (list.contains("health_sport_member_flag")) {
            d(list2);
        }
        if (list.contains("health_sport_member_stage")) {
            b(list2);
        }
        if (list.contains("health_sport_member_type")) {
            c(list2);
        }
    }
}
