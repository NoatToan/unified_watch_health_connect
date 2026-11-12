package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.featuremarketing.db.MarketingEventDbMgr;
import com.huawei.health.marketing.datatype.CycleRuleBase;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SpecificDateTimePeriod;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class evu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f33542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f33543c;
    private boolean d = false;
    private String e;
    private String h;

    public evu(int i, ResourceBriefInfo resourceBriefInfo) {
        Context contextB = BaseApplication.b();
        this.f33542b = contextB;
        this.f33541a = i;
        this.e = LoginInit.getInstance(contextB).getHuidOrDefault();
        this.f33543c = resourceBriefInfo;
        this.h = resourceBriefInfo.getResourceId();
    }

    public boolean a() {
        if (this.f33541a == 8002 && e()) {
            return false;
        }
        if (this.f33543c.getMarketingRule() == null || this.f33543c.getMarketingRule().getTriggerCycle() == null || c()) {
            return b();
        }
        return l(this.f33543c.getMarketingRule().getTriggerCycle());
    }

    private boolean e() {
        long jD = SharedPreferenceManager.d(Integer.toString(10000), "marketing_float_bar_close_time", 0L);
        ReleaseLogUtil.d("R_MarketingCyclesMgr", "isShowFloatBarInSevenDay nowTime = ", Long.valueOf(System.currentTimeMillis()), "; lastCloseTime = ", Long.valueOf(jD));
        if (System.currentTimeMillis() - jD >= 604800000) {
            return false;
        }
        ReleaseLogUtil.d("R_MarketingCyclesMgr", "CLOSE BEFORE 7 DAYS");
        return true;
    }

    private boolean c() {
        if (this.f33541a != 4048 || this.f33543c.getContentType() != 15) {
            return false;
        }
        LogUtil.a("MarketingCyclesMgr", "time rule bypassed resource, positionId: ", Integer.valueOf(this.f33541a), " contentType: ", Integer.valueOf(this.f33543c.getContentType()));
        return true;
    }

    private boolean l(CycleRuleBase cycleRuleBase) {
        LogUtil.a("MarketingCyclesMgr", "isTimeRules. positionId: ", Integer.valueOf(this.f33541a));
        if (b()) {
            int cycleType = cycleRuleBase.getCycleType();
            LogUtil.a("MarketingCyclesMgr", "cycle Type is:", Integer.valueOf(cycleType), " positionId: ", Integer.valueOf(this.f33541a));
            switch (cycleType) {
                case 1:
                    LogUtil.a("MarketingCyclesMgr", "time rules one single, positionId: ", Integer.valueOf(this.f33541a));
                    return f();
                case 2:
                    LogUtil.a("MarketingCyclesMgr", "time rules everyday, positionId: ", Integer.valueOf(this.f33541a));
                    return j();
                case 3:
                    LogUtil.a("MarketingCyclesMgr", "time rules every week, positionId: ", Integer.valueOf(this.f33541a));
                    return a(cycleRuleBase) && j();
                case 4:
                    LogUtil.a("MarketingCyclesMgr", "time rules several days, positionId: ", Integer.valueOf(this.f33541a));
                    return b(cycleRuleBase) && j();
                case 5:
                    LogUtil.a("MarketingCyclesMgr", "time rules every month, positionId: ", Integer.valueOf(this.f33541a));
                    return d(cycleRuleBase) && j();
                case 6:
                    LogUtil.a("MarketingCyclesMgr", "time rules specific, positionId: ", Integer.valueOf(this.f33541a));
                    return g(cycleRuleBase) && j();
                case 7:
                    LogUtil.a("MarketingCyclesMgr", "time rules login days. cycle: ", Integer.valueOf(cycleType), " positionId: ", Integer.valueOf(this.f33541a));
                    return e(cycleRuleBase) && j();
                case 8:
                case 9:
                    LogUtil.a("MarketingCyclesMgr", "vip time rule. cycleType: ", Integer.valueOf(cycleType), " positionId: ", Integer.valueOf(this.f33541a));
                    return o(cycleRuleBase) && j();
                case 10:
                case 11:
                    LogUtil.a("MarketingCyclesMgr", "equity time rule. cycleType: ", Integer.valueOf(cycleType), " positionId: ", Integer.valueOf(this.f33541a));
                    LogUtil.a("MarketingCyclesMgr", "isEquityGapForDays.", Boolean.valueOf(c(cycleRuleBase)));
                    return c(cycleRuleBase) && j();
                case 12:
                    return i(cycleRuleBase) && j();
                case 13:
                    LogUtil.a("MarketingCyclesMgr", "spec date time period. cyclevalue: ", cycleRuleBase.getCycleValue());
                    return f(cycleRuleBase) && j();
                case 14:
                    return i(cycleRuleBase) && f();
                default:
                    LogUtil.d("MarketingCyclesMgr", "No cycle match. match failed.");
                    return false;
            }
        }
        LogUtil.d("MarketingCyclesMgr", "cycle is not in effective Time.");
        return false;
    }

    private boolean b() {
        long effectiveTime = this.f33543c.getEffectiveTime();
        long expirationTime = this.f33543c.getExpirationTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (effectiveTime > jCurrentTimeMillis || jCurrentTimeMillis > expirationTime) {
            LogUtil.a("MarketingCyclesMgr", "time is not in effective time, positionId: ", Integer.valueOf(this.f33541a));
            return false;
        }
        LogUtil.a("MarketingCyclesMgr", "time is effective time, positionId: ", Integer.valueOf(this.f33541a));
        return true;
    }

    private boolean f() {
        return MarketingEventDbMgr.b(this.f33542b).d(this.e, this.f33541a, this.h) == null;
    }

    private boolean j() {
        String str = " and triggerTime >= " + String.valueOf(lsl.r(System.currentTimeMillis()));
        LogUtil.a("MarketingCyclesMgr", "condition: ", str);
        if (MarketingEventDbMgr.b(this.f33542b).b(this.e, this.f33541a, this.h, str).isEmpty()) {
            LogUtil.a("MarketingCyclesMgr", "marketingEventDBMgrList is null");
            return true;
        }
        LogUtil.a("MarketingCyclesMgr", "marketingEventDBMgrList is not null");
        return false;
    }

    private boolean a(CycleRuleBase cycleRuleBase) {
        int cycleSubType = cycleRuleBase.getCycleSubType();
        if (cycleSubType == 1) {
            return j(cycleRuleBase);
        }
        if (cycleSubType != 2) {
            return false;
        }
        return h(cycleRuleBase);
    }

    private boolean j(CycleRuleBase cycleRuleBase) {
        int i;
        try {
            i = Integer.parseInt(cycleRuleBase.getCycleValue());
        } catch (NumberFormatException e) {
            LogUtil.e("MarketingCyclesMgr", "NumberFormatException", e.getMessage());
            i = 0;
        }
        String str = " and triggerTime >= " + lsl.e(System.currentTimeMillis(), 2, 0);
        LogUtil.a("MarketingCyclesMgr", "condition: ", str);
        return MarketingEventDbMgr.b(this.f33542b).b(this.e, this.f33541a, this.h, str).size() < i;
    }

    private boolean h(CycleRuleBase cycleRuleBase) {
        String[] strArrSplit = cycleRuleBase.getCycleValue().split(",");
        int i = Calendar.getInstance().get(7);
        for (String str : strArrSplit) {
            if (String.valueOf(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(CycleRuleBase cycleRuleBase) {
        int i;
        try {
            i = Integer.parseInt(cycleRuleBase.getCycleValue());
        } catch (NumberFormatException e) {
            LogUtil.e("MarketingCyclesMgr", "parseInt exception", e.getMessage());
            i = 0;
        }
        return d(i);
    }

    private boolean d(CycleRuleBase cycleRuleBase) {
        int i;
        try {
            i = Integer.parseInt(cycleRuleBase.getCycleValue());
        } catch (NumberFormatException e) {
            LogUtil.e("MarketingCyclesMgr", "parseInt exception", e.getMessage());
            i = 0;
        }
        String str = " and triggerTime >= " + lsl.p(System.currentTimeMillis());
        LogUtil.a("MarketingCyclesMgr", "condition: ", str);
        return MarketingEventDbMgr.b(this.f33542b).b(this.e, this.f33541a, this.h, str).size() < i;
    }

    private boolean g(CycleRuleBase cycleRuleBase) {
        String[] strArrSplit = cycleRuleBase.getCycleValue().split(",");
        String strD = DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        for (String str : strArrSplit) {
            if (strD.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean e(CycleRuleBase cycleRuleBase) {
        return TextUtils.equals(cycleRuleBase.getCycleValue(), SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10000), "user_last_login_days"));
    }

    private boolean o(CycleRuleBase cycleRuleBase) {
        UserMemberInfo userMemberInfoD = d();
        if (userMemberInfoD == null || userMemberInfoD.getExpireTime() == 0) {
            LogUtil.j("MarketingCyclesMgr", "vip userMemberInfo is null or expireTime is null.");
            return false;
        }
        String[] strArrSplit = cycleRuleBase.getCycleValue().split(Constants.LINK);
        int iN = CommonUtil.n(BaseApplication.b(), strArrSplit[0]);
        int iN2 = CommonUtil.n(BaseApplication.b(), strArrSplit[1]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long expireTime = userMemberInfoD.getExpireTime();
        LogUtil.a("MarketingCyclesMgr", "vip expiredTime: ", Long.valueOf(expireTime));
        int iC = fxl.c(jCurrentTimeMillis, expireTime);
        LogUtil.a("MarketingCyclesMgr", "vip gapDay: ", Integer.valueOf(iC));
        if (iC < iN || iC > iN2) {
            LogUtil.j("MarketingCyclesMgr", "date out of range.");
            return false;
        }
        int cycleType = cycleRuleBase.getCycleType();
        LogUtil.a("MarketingCyclesMgr", "vip time rule. vip time rule CYCLETYPE: ", Integer.valueOf(cycleType));
        if (cycleType != 8) {
            if (cycleType == 9 && !irz.d(userMemberInfoD)) {
                return d(iN2 - iC);
            }
            return false;
        }
        if (irz.d(userMemberInfoD)) {
            return d(iC - iN);
        }
        return false;
    }

    private boolean c(final CycleRuleBase cycleRuleBase) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("MarketingCyclesMgr", "payApi is null");
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: evt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.b(cycleRuleBase, countDownLatch, i, obj);
                }
            });
        }
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LogUtil.e("MarketingCyclesMgr", e.toString());
        }
        return this.d;
    }

    /* synthetic */ void b(CycleRuleBase cycleRuleBase, CountDownLatch countDownLatch, int i, Object obj) {
        if (i == 0 && (obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.a("MarketingCyclesMgr", "hasEquity");
            this.d = d(cycleRuleBase, (RepeatResourceBenefitInfo) obj);
            countDownLatch.countDown();
        }
    }

    private boolean i(CycleRuleBase cycleRuleBase) {
        String cycleValue = cycleRuleBase.getCycleValue();
        LogUtil.a("MarketingCyclesMgr", "isTimePeriodTrigger ", cycleValue);
        if (TextUtils.isEmpty(cycleValue)) {
            LogUtil.j("MarketingCyclesMgr", "isTimePeriodTrigger cycleValue is empty, return false");
            return false;
        }
        String[] strArrSplit = cycleValue.split(",");
        String strD = DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC);
        for (String str : strArrSplit) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("MarketingCyclesMgr", "timePeriod is empty");
            } else {
                String[] strArrSplit2 = str.split(Constants.LINK);
                if (strArrSplit2 == null || strArrSplit2.length <= 1) {
                    LogUtil.a("MarketingCyclesMgr", "invalid timePeriod. timePeriod = ", str);
                } else {
                    String str2 = strArrSplit2[0];
                    String str3 = strArrSplit2[1];
                    if (strD.compareTo(str2) > 0 && strD.compareTo(str3) < 0) {
                        LogUtil.a("MarketingCyclesMgr", "isTimePeriodTrigger true");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean f(CycleRuleBase cycleRuleBase) {
        String cycleValue = cycleRuleBase.getCycleValue();
        LogUtil.a("MarketingCyclesMgr", "cycleValue", cycleRuleBase.getCycleValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = DateFormatUtil.d(jCurrentTimeMillis, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD);
        String strD2 = DateFormatUtil.d(jCurrentTimeMillis, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC);
        try {
            JSONArray jSONArray = new JSONArray(cycleValue);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (a(strD, strD2, b(jSONArray.getJSONObject(i)))) {
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("MarketingCyclesMgr", "cycleValue jsonArray fail");
        }
        return false;
    }

    private boolean a(String str, String str2, SpecificDateTimePeriod specificDateTimePeriod) {
        if (specificDateTimePeriod == null) {
            return false;
        }
        String dates = specificDateTimePeriod.getDates();
        String startTime = specificDateTimePeriod.getStartTime();
        String endTime = specificDateTimePeriod.getEndTime();
        String[] strArrSplit = dates.split(",");
        if (str2.compareTo(startTime) < 0 || str2.compareTo(endTime) > 0) {
            LogUtil.a("MarketingCyclesMgr", "time period not hit");
            return false;
        }
        LogUtil.a("MarketingCyclesMgr", "time period hit");
        for (String str3 : strArrSplit) {
            if (str.equals(str3)) {
                LogUtil.a("MarketingCyclesMgr", "date hit");
                return true;
            }
        }
        LogUtil.a("MarketingCyclesMgr", "date not hit");
        return false;
    }

    private SpecificDateTimePeriod b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        SpecificDateTimePeriod specificDateTimePeriod = new SpecificDateTimePeriod();
        try {
            if (!jSONObject.isNull("dates")) {
                specificDateTimePeriod.setDates(jSONObject.getString("dates"));
            }
            if (!jSONObject.isNull("startTime")) {
                specificDateTimePeriod.setStartTime(jSONObject.getString("startTime"));
            }
            if (!jSONObject.isNull("endTime")) {
                specificDateTimePeriod.setEndTime(jSONObject.getString("endTime"));
            }
            return specificDateTimePeriod;
        } catch (JSONException e) {
            LogUtil.e("MarketingCyclesMgr", "expoundOperationActivity parse json meet exception: ", e.getMessage());
            return null;
        }
    }

    private boolean d(CycleRuleBase cycleRuleBase, RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        String[] strArrSplit = cycleRuleBase.getCycleValue().split(Constants.LINK);
        int iN = CommonUtil.n(BaseApplication.b(), strArrSplit[0]);
        int iN2 = CommonUtil.n(BaseApplication.b(), strArrSplit[1]);
        long nowTime = repeatResourceBenefitInfo.getNowTime();
        Long expireTime = repeatResourceBenefitInfo.getExpireTime();
        long jLongValue = expireTime.longValue();
        LogUtil.a("MarketingCyclesMgr", "benefit expiredTime: ", expireTime);
        int iC = fxl.c(nowTime, jLongValue);
        LogUtil.a("MarketingCyclesMgr", "benefit gapDay: ", Integer.valueOf(iC));
        if (iC < iN || iC > iN2) {
            LogUtil.j("MarketingCyclesMgr", "date out of range.");
            return false;
        }
        int cycleType = cycleRuleBase.getCycleType();
        LogUtil.a("MarketingCyclesMgr", "benefit time rule. benefit time rule CYCLETYPE: ", Integer.valueOf(cycleType));
        if (cycleType != 10) {
            return cycleType == 11 && nowTime <= jLongValue;
        }
        if (nowTime > jLongValue) {
            return f();
        }
        return false;
    }

    private boolean d(int i) {
        String str = " and triggerTime >= " + lsl.d(System.currentTimeMillis(), -i);
        LogUtil.a("MarketingCyclesMgr", "condition: ", str);
        return MarketingEventDbMgr.b(this.f33542b).b(this.e, this.f33541a, this.h, str).size() == 0;
    }

    private UserMemberInfo d() {
        String strE = SharedPreferenceManager.e(this.f33542b, Integer.toString(10000), "USER_VIP_INFO_KEY");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("MarketingCyclesMgr", "get vipInfo is null.");
            return null;
        }
        return (UserMemberInfo) peh.b(strE, UserMemberInfo.class);
    }
}
