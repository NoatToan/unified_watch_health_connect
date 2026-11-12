package com.huami.account;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.event.EventAgreeUserExperience;
import com.huami.account.event.EventRegionUpdate;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.account.service.AnonymousService;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.AppChannel;
import com.huami.account.utils.AppChannelKt;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.network.hmnetwork.model.account.LoginData;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.AccountManager;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.HttpDNS;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.NextActions;
import com.huami.passport.entity.Profile;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.UserInfo;
import com.huami.passport.net.HttpConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserInfosDao;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightGoalsDao;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import de.greenrobot.event.EventBus;
import huami.support.account.TokenUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
public class HMLoginManager {
    private static final String a = "HMLoginManager";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static boolean e = false;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static long i = 0;
    private static final long j = 14400000;
    private static AreaUpdateListener k;

    public interface AreaUpdateListener {
        void onAreaUpdate();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppChannel.values().length];
            a = iArr;
            try {
                iArr[AppChannel.MiFit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AppChannel.Zepp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AppChannel.Amazfit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AppChannel.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends AsyncTask<Void, Void, Void> {
        private final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String countryCode;
            String countryState;
            try {
                Profile profile = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProfile();
                countryCode = profile.getCountryCode();
                try {
                    countryState = profile.getCountryState();
                } catch (Exception e) {
                    e = e;
                    HMLog.v(HMLoginManager.a, e.toString(), new Object[0]);
                    countryState = null;
                }
            } catch (Exception e2) {
                e = e2;
                countryCode = null;
            }
            if (TextUtils.isEmpty(countryCode)) {
                try {
                    UserInfo.RegistInfo registInfo = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getUserInfo().getRegistInfo();
                    countryCode = registInfo.getCountryCode();
                    countryState = registInfo.getCountryState();
                } catch (Exception e3) {
                    HMLog.v(HMLoginManager.a, e3.toString(), new Object[0]);
                }
            }
            HMLoginManager.E(countryCode);
            if (this.a) {
                EventBus.getDefault().post(new EventRegionUpdate(countryCode, countryState));
            }
            return null;
        }
    }

    public enum c {
        CHINA("1", "cn"),
        USA("2", Configs.Params.US),
        SINGAPORE("3", "sg"),
        GERMANY("4", "de");

        private String regionCode;
        private String regionValue;

        c(String str, String str2) {
            this.regionCode = str;
            this.regionValue = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(String str) {
        return "ip:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(String str) {
        return "cname:" + str;
    }

    private static void C(final String str) {
        if (Objects.equals(str, h)) {
            return;
        }
        HMLog.info(a, new Function0() { // from class: n03
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMLoginManager.w(str);
            }
        });
        h = str;
    }

    private static void D(final HttpDNS httpDNS) {
        if (AccountExternalsKt.getConfigDelegate().debug()) {
            HMLog.info(a, new Function0() { // from class: j03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLoginManager.z(httpDNS);
                }
            });
            List<String> ips = httpDNS.getIps();
            List<String> cnames = httpDNS.getCnames();
            if (ips != null) {
                for (final String str : ips) {
                    HMLog.info(a, new Function0() { // from class: l03
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMLoginManager.A(str);
                        }
                    });
                }
            }
            if (cnames != null) {
                for (final String str2 : cnames) {
                    HMLog.info(a, new Function0() { // from class: m03
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMLoginManager.B(str2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E(String str) {
        Area areaByCountryCode = SelectAreaHelper.getAreaByCountryCode(str);
        if (areaByCountryCode == null) {
            areaByCountryCode = SelectAreaHelper.getUnknownArea();
        }
        SelectAreaHelper.saveArea(areaByCountryCode);
        HMLocalPropertyUtil.setLocalProperty(HMLocalPropertyUtil.LOCAL_PROPERTY_IS_IN_MAINLAND, String.valueOf(isInMainland()));
        AreaUpdateListener areaUpdateListener = k;
        if (areaUpdateListener != null) {
            areaUpdateListener.onAreaUpdate();
        }
    }

    public static Set<String> accountExceptionErrorCodes() {
        HashSet hashSet = new HashSet();
        hashSet.add(HMWebAccess.AUTH_SERVER_ERROR_DISABLE_APP_LOGIN);
        hashSet.add(HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_DISABLE);
        hashSet.add(HMWebAccess.AUTH_SERVER_ERROR_RIGHTS_RESTRICTIVE);
        return hashSet;
    }

    public static void forceRefreshHttpDns() {
        HMWebAccess.setHadFreshToken(false);
    }

    public static int getAdultAge() {
        if (isInUSA()) {
            return 13;
        }
        return isInMainland() ? 14 : 16;
    }

    public static Calendar getCurrentTime() {
        String serverDate = Utils.getServerDate();
        Calendar calendar = Calendar.getInstance();
        if (!TextUtils.isEmpty(serverDate)) {
            try {
                calendar.setTime(new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).parse(serverDate));
            } catch (Exception e2) {
                HMLog.i(a, e2.toString(), new Object[0]);
            }
        }
        return calendar;
    }

    public static boolean getHmPrivacyDiagnostics() {
        return false;
    }

    public static String getHuamiId() {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        return anonymousInfo != null ? anonymousInfo.getUserId() : AccountManager.getDefault(AccountExternalsKt.getAppContext()).getCurrentUid();
    }

    public static long getMiIdIfExistsOrHuamiID() {
        if (isUseXiaomiLogin()) {
            String thirdId = getThirdId();
            if (!TextUtils.isEmpty(thirdId) && Pattern.compile("^[0-9]+$").matcher(thirdId).matches()) {
                return Long.parseLong(thirdId);
            }
        }
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        if (accountManager.isLogin()) {
            return Long.parseLong(accountManager.getCurrentUid());
        }
        return -1L;
    }

    public static String getRegion() {
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        if (!accountManager.isLogin()) {
            HMLog.info(a, new Function0() { // from class: p03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLoginManager.u();
                }
            });
            return "";
        }
        for (c cVar : c.values()) {
            if (o(cVar)) {
                return cVar.regionCode;
            }
        }
        return accountManager.getCurrentRegion();
    }

    public static String getSecurity() {
        return HMAccountKeeper.INSTANCE.readLoginData().getSecurity();
    }

    public static String getThirdId() {
        return HMAccountKeeper.INSTANCE.readLoginData().getThirdUid();
    }

    public static long getValidUid() {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        if (anonymousInfo != null) {
            try {
                return Long.parseLong(anonymousInfo.getUserId());
            } catch (Exception unused) {
                return -1L;
            }
        }
        LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        if (loginData.isOldValid()) {
            return Long.parseLong(loginData.getThirdUid());
        }
        if (AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin()) {
            return Long.parseLong(getHuamiId());
        }
        return -1L;
    }

    public static void goAccountFaq(Context context, String str) {
        WebHelper.launch(HMServerDef.getUrl(String.format("t/posts/%s?meta_key=tag&category=37&meta_value=faq&platform=%s", str, str)));
    }

    public static void goSurveyHobbies(Context context) {
        int i2 = a.a[AppChannelKt.getAppChannel(context).ordinal()];
        String str = "t/amazfit-survey-hobbies";
        if (i2 == 1) {
            str = "t/survey-hobbies";
        } else if (i2 != 2 && i2 != 3 && i2 == 4) {
            HMLog.info(a, new Function0() { // from class: q03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLoginManager.v();
                }
            });
            return;
        }
        WebHelper.launch(HMServerDef.getUrl(str));
    }

    public static void init(Context context) {
        boolean zIsProductUrl = HMServerDef.isProductUrl();
        AccountManager accountManager = AccountManager.getDefault(context);
        accountManager.setTestMode(!zIsProductUrl);
        accountManager.setLogFileEnable(AccountExternalsKt.getConfigDelegate().debug());
        HMLog.v(a, "isProductUrl:" + zIsProductUrl, new Object[0]);
        HashSet hashSet = new HashSet();
        hashSet.add(HMServerDef.getOriHost());
        hashSet.add(HMServerDef.getOriWatchHost());
        hashSet.add("https://app-analytics.huami.com/");
        AccountExternalsKt.getAccountDelegate().onHttpDnsInit(hashSet);
        Configs.httpDNSHost = HMHttpDnsManager.stitching((String[]) hashSet.toArray(new String[0]));
    }

    public static void initAccountManager() {
        HttpConfig.addHeaders("hm-privacy-diagnostics", String.valueOf(getHmPrivacyDiagnostics()));
        HttpConfig.addHeaders("hm-privacy-ceip", String.valueOf(HMAccountKeeper.INSTANCE.readAgreeUserExperience()));
    }

    public static void initAnonymousUser(Context context) {
        AccountManager.getDefault(context).offlineLogout();
        HMDaoManager.init(context.getApplicationContext(), "0");
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        hMPersonInfo.updateFromServer(new HMBeanPersonInfo());
        hMPersonInfo.getUserInfo().setUserid("0");
        hMPersonInfo.getUserInfo().setWeight(120.0f);
        hMPersonInfo.getMiliConfig().setGoalStepsCount(8000);
        hMPersonInfo.getUserInfo().setNickname("--");
        SelectAreaHelper.saveArea(SelectAreaHelper.getAreaByCountryCode("CN"));
    }

    public static void initCountryCode() {
        initCountryCode(false);
    }

    @Deprecated
    public static boolean isAdult() {
        HMUserInfo userInfo;
        if (AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() && (userInfo = HMPersonInfo.getInstance().getUserInfo()) != null) {
            return isAdult(userInfo.getAge());
        }
        return false;
    }

    public static boolean isAdultForAds() {
        HMUserInfo userInfo;
        if (!AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() || (userInfo = HMPersonInfo.getInstance().getUserInfo()) == null) {
            return false;
        }
        int age = userInfo.getAge();
        int iOptInt = 13;
        try {
            String property = AccountExternalsKt.getCommonDelegate().getProperty(HMAccountWebAPI.APPS_SETTINGS_AD_AGE, "");
            if (!TextUtils.isEmpty(property)) {
                JSONObject jSONObject = new JSONObject(property);
                if (jSONObject.optInt("value") > 0) {
                    iOptInt = jSONObject.optInt("value");
                }
            }
        } catch (Exception unused) {
        }
        return isAdult(age, iOptInt);
    }

    public static boolean isAdultGlobal() {
        HMUserInfo userInfo;
        if (AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() && (userInfo = HMPersonInfo.getInstance().getUserInfo()) != null) {
            return isAdultGlobal(userInfo.getAge());
        }
        return false;
    }

    @Deprecated
    public static boolean isAdultSupportMainlandMinorRegulations() {
        if (!isInMainland()) {
            return isAdult();
        }
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        return userInfo != null && userInfo.getAge() >= 14;
    }

    public static boolean isExistingUser() {
        if (HMProcessLoginDataManager.isInLoginProcess()) {
            return l();
        }
        return j() == 2;
    }

    public static boolean isHuamiSDKLogin() {
        return AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin();
    }

    public static boolean isInBY() {
        return SelectAreaHelper.isBY(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInChina() {
        LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        return loginData.isOldValid() ? m(Long.parseLong(loginData.getThirdUid())) : o(c.CHINA);
    }

    public static boolean isInEU() {
        return SelectAreaHelper.isEU(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInHK() {
        return SelectAreaHelper.isHK(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInIN() {
        return SelectAreaHelper.isIN(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInKR() {
        return SelectAreaHelper.isKR(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInMainland() {
        return SelectAreaHelper.isCN(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInNonContinental() {
        return (isUnknown() || isInMainland()) ? false : true;
    }

    public static boolean isInRU() {
        return SelectAreaHelper.isRU(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInSG() {
        return SelectAreaHelper.isSG(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInTW() {
        return SelectAreaHelper.isTW(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInUA() {
        return SelectAreaHelper.isUA(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isInUSA() {
        return SelectAreaHelper.isUS(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isMainlandUser() {
        return isInChina();
    }

    public static boolean isNewUser() {
        return j() == 1;
    }

    public static boolean isOldAccount() {
        return HMAccountKeeper.INSTANCE.readLoginData().isOldValid();
    }

    @Deprecated
    public static boolean isOldUser() {
        return isExistingUser();
    }

    public static boolean isPhoneEmailAccount(String str) {
        return TextUtils.equals("huami", str) || TextUtils.equals("huami_phone", str);
    }

    public static boolean isPhoneEmailAccountLogin() {
        return isPhoneEmailAccount(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProvider());
    }

    public static boolean isShowExperience() {
        return SelectAreaHelper.isShowUxAgreement(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isSimplifiedChineseInMainland() {
        return SelectAreaHelper.isCN(SelectAreaHelper.getAreaBySave()) && Language.isSimplifiedChinese();
    }

    public static boolean isUnInit() {
        return j() == 0;
    }

    public static boolean isUnknown() {
        return SelectAreaHelper.isUnknown(SelectAreaHelper.getAreaBySave());
    }

    public static boolean isUseXiaomiLogin() {
        return isOldAccount() || t();
    }

    public static boolean isUserAccessSingaporeServer() {
        return o(c.SINGAPORE);
    }

    public static boolean isUserValid() {
        LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        return loginData.isOldValid() || !(!AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() || TextUtils.isEmpty(loginData.getHuamiUid()) || TextUtils.isEmpty(loginData.getThirdUid()));
    }

    private static int j() {
        if (HMProcessLoginDataManager.isInLoginProcess() && AccountExternalsKt.getConfigDelegate().debug()) {
            try {
                throw new IllegalStateException("登录过程中 User Status 尚未确定，使用其他方式获取用户状态");
            } catch (Exception e2) {
                HMLog.e("DebugUserStatus", "登录过程中 User Status 尚未确定，使用其他方式获取用户状态", e2);
            }
        }
        try {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            if (!isUserValid() || !hMPersonInfo.isValidUser() || k(hMPersonInfo.getUserInfo())) {
                C("USER_STATUS_UNINIT");
                return 0;
            }
            if (hMPersonInfo.isNewUser() || HMAccountKeeper.INSTANCE.getCreateTime() <= 0) {
                C("USER_STATUS_NEW");
                return 1;
            }
            C("USER_STATUS_EXISTING");
            return 2;
        } catch (ExceptionInInitializerError unused) {
            C("USER_STATUS_UNINIT(HMPersonInfo init error)");
            return 0;
        }
    }

    private static boolean k(HMUserInfo hMUserInfo) {
        if (Objects.equals(hMUserInfo.getUserid(), "0")) {
            return HMAccountKeeper.INSTANCE.getCreateTime() == -1;
        }
        return hMUserInfo.getCreatTime() > 0 && HMAccountKeeper.INSTANCE.getCreateTime() <= 0;
    }

    private static boolean l() {
        HMUserInfo userInfo;
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        return (hMPersonInfo == null || (userInfo = hMPersonInfo.getUserInfo()) == null || userInfo.getCreatTime() <= 0) ? false : true;
    }

    private static boolean m(long j2) {
        return j2 > 0 && j2 <= Constant.MIID_CHINA_MAX;
    }

    public static void migrate(String str, String str2) {
        if (t()) {
            UserInfos userInfos = new UserInfos();
            HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
            UserInfosDao userInfosDao = HMDaoManager.getInstance().getUserInfosDao();
            userInfo.getUserInfos(userInfos);
            userInfosDao.delete(userInfos);
            userInfo.setUserid(str);
            userInfo.getUserInfos(userInfos);
            userInfosDao.insertOrReplace(userInfos);
            LabActionDao labActionDao = HMDaoManager.getInstance().getLabActionDao();
            List<LabAction> list = labActionDao.queryBuilder().where(LabActionDao.Properties.UserId.eq(Long.valueOf(Long.parseLong(str2))), new WhereCondition[0]).list();
            Iterator<LabAction> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setUserId(str);
            }
            labActionDao.updateInTx(list);
            WeightGoalsDao weightGoalsDao = HMDaoManager.getInstance().getWeightGoalsDao();
            List<WeightGoals> list2 = weightGoalsDao.queryBuilder().where(WeightGoalsDao.Properties.UID.eq(Long.valueOf(Long.parseLong(str2))), new WhereCondition[0]).list();
            Iterator<WeightGoals> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().setUID(str);
            }
            weightGoalsDao.updateInTx(list2);
            HMDaoManager.getInstance().getFriendDao().deleteAll();
            HMDaoManager.getInstance().getFriendMessageDao().deleteAll();
            HMDaoManager.getInstance().getPushDao().deleteAll();
        }
    }

    public static boolean n() {
        return TextUtils.equals(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProvider(), "huami_phone");
    }

    private static boolean o(c cVar) {
        AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
        if (isUnInit() && anonymousInfo != null) {
            return p(cVar, anonymousInfo.getRegion());
        }
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        if (!accountManager.isLogin()) {
            return false;
        }
        String currentRegion = accountManager.getCurrentRegion();
        return cVar.regionValue.equalsIgnoreCase(currentRegion) || cVar.regionCode.equalsIgnoreCase(currentRegion);
    }

    public static synchronized void oldAccount2HuamiAccount() {
        if (isOldAccount()) {
            String thirdId = getThirdId();
            final Token tokenCreateCredentials = TokenUtil.createCredentials(AccountExternalsKt.getAppContext(), "mifit", thirdId, getSecurity());
            if (!TextUtils.isEmpty(tokenCreateCredentials.getErrorCode())) {
                HMLog.info(a, new Function0() { // from class: k03
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMLoginManager.x(tokenCreateCredentials);
                    }
                });
                return;
            }
            HMLog.info(a, new Function0() { // from class: o03
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMLoginManager.y();
                }
            });
            String huamiId = getHuamiId();
            HMAccountKeeper.INSTANCE.keepLoginData(huamiId, thirdId, null);
            migrate(huamiId, thirdId);
        }
    }

    private static boolean p(c cVar, String str) {
        return cVar.regionValue.equalsIgnoreCase(str) || cVar.regionCode.equalsIgnoreCase(str);
    }

    public static boolean q() {
        return r(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProvider());
    }

    public static boolean r(String str) {
        return (TextUtils.equals("huami", str) || TextUtils.equals("huami_phone", str)) ? false : true;
    }

    public static void refreshHttpDns() {
        List<HttpDNS> httpDNS = AccountManager.getDefault(AccountExternalsKt.getAppContext()).getHttpDNS(AccountExternalsKt.getAppContext());
        if (httpDNS == null || httpDNS.isEmpty()) {
            return;
        }
        for (HttpDNS httpDNS2 : httpDNS) {
            HMHttpDnsManager.refreshHttpDns(httpDNS2.getHost(), httpDNS2.getIps(), httpDNS2.getCnames());
            D(httpDNS2);
        }
        AccountExternalsKt.getAccountDelegate().updateCompanionHosts(!HMServerDef.isProductUrl());
    }

    public static void reset() {
        i = 0L;
        g = null;
        f = null;
        HMWebAccess.setHadFreshToken(true);
    }

    public static boolean s() {
        return "wechat".equals(AccountManager.getDefault(AccountExternalsKt.getAppContext()).getProvider());
    }

    public static void saveAgreeUserExperienceForRegister(boolean z) {
        HMAccountKeeper.INSTANCE.keepAgreeUserExperience(z);
        HttpConfig.addHeaders("hm-privacy-ceip", String.valueOf(z));
        EventBus.getDefault().post(new EventAgreeUserExperience(z));
    }

    public static void saveLoginCountryCode() {
        if (TextUtils.isEmpty(f)) {
            return;
        }
        E(f);
    }

    public static void setAreaUpdateListener(AreaUpdateListener areaUpdateListener) {
        k = areaUpdateListener;
    }

    public static void showAction(Context context) {
        if (e || TextUtils.isEmpty(g)) {
            return;
        }
        e = true;
        WebHelper.launch(g, true);
    }

    public static boolean supportAccountBind() {
        return true;
    }

    private static boolean t() {
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        return accountManager.isLogin() && ("xiaomi".equals(accountManager.getProvider()) || "mifit".equals(accountManager.getProvider()));
    }

    public static boolean theSameUser(String str, String str2, String str3) {
        String provider;
        String thirdId;
        String currentUid;
        LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        if (loginData.isOldValid()) {
            currentUid = null;
            thirdId = loginData.getThirdUid();
            provider = "xiaomi";
        } else {
            if (!accountManager.isLogin()) {
                return false;
            }
            provider = accountManager.getProvider();
            thirdId = accountManager.getUserInfo().getThirdId();
            currentUid = accountManager.getCurrentUid();
        }
        if (!TextUtils.isEmpty(currentUid) && !TextUtils.isEmpty(str)) {
            return currentUid.equals(str);
        }
        if (TextUtils.isEmpty(str3) || provider.equals(str3)) {
            return thirdId.equals(str2);
        }
        return "xiaomi".equals(str3) && "mifit".equals(provider) && thirdId.equals(str2);
    }

    public static boolean thirdPartOauthError(String str) {
        return thirdPartOauthErrorCodes().contains(str);
    }

    public static Set<String> thirdPartOauthErrorCodes() {
        HashSet hashSet = new HashSet();
        hashSet.add(ErrorCode.CALL_TPSDK_ERROR);
        hashSet.add(ErrorCode.TPA_DENIED_ERROR);
        hashSet.add(ErrorCode.TPA_DONE_NO_RESULT);
        hashSet.add(ErrorCode.TPA_DONE_ERROR_RESULT);
        hashSet.add(ErrorCode.TPA_OPT_SUCCESS_NO_CODE);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return "not login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "goSurveyHobbies：未知 App";
    }

    public static void verifyHref(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(g)) {
            g = str;
            e = false;
        } else {
            if (g.equals(str)) {
                return;
            }
            g = str;
            e = false;
        }
    }

    public static void verifyLoginSuccessHref(LoginToken loginToken) {
        if (loginToken == null) {
            f = null;
            g = null;
            return;
        }
        f = loginToken.getRegistInfo() == null ? null : loginToken.getRegistInfo().getCountryCode();
        List<NextActions> nextActions = loginToken.getNextActions();
        if (nextActions == null || nextActions.size() == 0) {
            g = null;
        } else {
            verifyHref(nextActions.get(0).getHref());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(String str) {
        return "login_status:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(Token token) {
        return "security to token errorCode:" + token.getErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y() {
        return "security to token success!!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z(HttpDNS httpDNS) {
        return "host:" + httpDNS.getHost();
    }

    public static void initCountryCode(boolean z) {
        if (((AnonymousService) KoinJavaComponent.get(AnonymousService.class)).isAnonymousUser()) {
            return;
        }
        new b(z).execute(new Void[0]);
    }

    @Deprecated
    public static boolean isAdult(int i2) {
        return AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() && (!isInNonContinental() || (!isInUSA() ? i2 < 16 : i2 < 13));
    }

    public static boolean isAdultGlobal(int i2) {
        if (isInUSA()) {
            return i2 >= 13;
        }
        if (isInMainland()) {
            return i2 >= 14;
        }
        return i2 >= 16;
    }

    public static boolean isAdult(int i2, int i3) {
        return AccountManager.getDefault(AccountExternalsKt.getAppContext()).isLogin() && i2 > i3;
    }
}
