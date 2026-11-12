package com.huawei.ui.openservice.db.control;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.openservice.R;
import com.huawei.ui.openservice.db.SpUtil;
import com.huawei.ui.openservice.db.manager.ChildServiceDbManager;
import com.huawei.ui.openservice.db.manager.SecurityUrlDbManager;
import com.huawei.ui.openservice.db.manager.ServiceDbManager;
import com.huawei.ui.openservice.db.manager.ServiceTypeDbManager;
import com.huawei.ui.openservice.db.manager.ServiceVersionDbManager;
import com.huawei.ui.openservice.db.manager.UserHomePageServiceDbManager;
import com.huawei.ui.openservice.db.manager.UserServiceAuthDbManager;
import com.huawei.ui.openservice.db.model.ChildService;
import com.huawei.ui.openservice.db.model.HomePageServiceOrder;
import com.huawei.ui.openservice.db.model.OpenService;
import com.huawei.ui.openservice.db.model.OpenServiceGroup;
import com.huawei.ui.openservice.db.model.SecurityUrl;
import com.huawei.ui.openservice.db.model.SecurityUrlConfig;
import com.huawei.ui.openservice.db.model.ServiceListConfig;
import com.huawei.ui.openservice.db.model.UserServiceAuth;
import defpackage.lon;
import defpackage.lsy;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes19.dex */
public class OpenServiceControl {
    private static final String IS_USER_HOMEPAGE_EDITED = "IfUserHomepageEdited";
    private static final String LIGHT_CLOUD = "lightcloud";
    private static final String LOG_TAG = "Opera_OpenServiceControl";
    private static final CopyOnWriteArraySet<String> M_URL_WHITE_LIST = new CopyOnWriteArraySet<>();
    private static final String SP = "OpenServiceControl";
    private static final String SUPER_SERVICE_ID = "super_service";
    private static final String WHITE_SERVICE_ID = "white_service";
    private static Context mContext;
    private static SecurityUrlDbManager mSecurityUrlManager;
    private ChildServiceDbManager mChildServiceDbManager;
    private String mIconPath;
    private ServiceDbManager mServiceManager;
    private ServiceTypeDbManager mServiceTypeManager;
    private UserHomePageServiceDbManager mUserHomePageServiceManager;
    private UserServiceAuthDbManager mUserServiceAuthManager;

    private OpenServiceControl() {
        this.mServiceManager = new ServiceDbManager(mContext);
        this.mServiceTypeManager = new ServiceTypeDbManager(mContext);
        this.mUserHomePageServiceManager = new UserHomePageServiceDbManager(mContext);
        mSecurityUrlManager = new SecurityUrlDbManager(mContext);
        this.mUserServiceAuthManager = new UserServiceAuthDbManager(mContext);
        this.mChildServiceDbManager = new ChildServiceDbManager(mContext);
        obtainWatchFaceGrsUrl();
        try {
            this.mIconPath = mContext.getFilesDir().getCanonicalPath() + File.separator + LIGHT_CLOUD + File.separator + "servicefw" + File.separator + "res" + File.separator;
        } catch (IOException unused) {
            LogUtil.a(LOG_TAG, "IOException");
        }
    }

    public void obtainWatchFaceGrsUrl() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.openservice.db.control.OpenServiceControl.1
            @Override // java.lang.Runnable
            public void run() {
                OpenServiceControl.addWhiteUrlList();
            }
        });
    }

    private static void addWhiteUrlList(CopyOnWriteArraySet<String> copyOnWriteArraySet, String str, String str2) {
        if (copyOnWriteArraySet == null || TextUtils.isEmpty(str)) {
            return;
        }
        copyOnWriteArraySet.add(str + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addWhiteUrlList() {
        Context context = BaseApplication.getContext();
        GRSManager gRSManagerC = GRSManager.c(context);
        CopyOnWriteArraySet<String> copyOnWriteArraySet = M_URL_WHITE_LIST;
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("activityUrl"), File.separator);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("achievementUrl"), File.separator);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("healthRecommendUrl"), File.separator);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("messageCenterUrl"), File.separator);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("domainMyHuawei"), File.separator);
        addContentCenterWhiteUrl(gRSManagerC);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("domainResourcephsVmall"), File.separator);
        if (CommonUtil.cl()) {
            copyOnWriteArraySet.add("");
            copyOnWriteArraySet.add("");
        } else {
            copyOnWriteArraySet.addAll(Arrays.asList(context.getResources().getStringArray(R.array.white_url)));
        }
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        String noCheckUrl = gRSManagerC.getNoCheckUrl("domainContentcenterDbankcdnNew", commonCountryCode);
        addWhiteUrlList(copyOnWriteArraySet, noCheckUrl, "/cch5/health/watchFace/index.html");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        if (strE != null && strE.equals("1")) {
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_WATCHFACE", "app_watchface_change_url");
            if (strE2 == null || strE2.length() == 0) {
                strE2 = "watchFaceBeta";
            }
            addWhiteUrlList(copyOnWriteArraySet, noCheckUrl, Constants.H5_URL_BASE_PATH_BETA + strE2 + "/index.html");
        } else {
            addWhiteUrlList(copyOnWriteArraySet, noCheckUrl, "/sandbox/cch5/health/watchFaceBeta/index.html");
        }
        if (CommonUtil.ap()) {
            copyOnWriteArraySet.add("");
        }
        copyOnWriteArraySet.add(gRSManagerC.getNoCheckUrl("watchFaceH5", commonCountryCode));
        copyOnWriteArraySet.addAll(Arrays.asList(context.getResources().getStringArray(R.array.white_url_other)));
        addHelpWhiteUrl(gRSManagerC.getUrl("domainTipsResDbankcdn"));
        if (CommonUtil.cl()) {
            addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("appMarketH5Url"), "");
        }
        addSuperService(gRSManagerC);
        addWhiteUrlList(copyOnWriteArraySet, gRSManagerC.getUrl("domainPrivacyLegalCloudHuawei"), "/terms/scope/huaweihealth/appgallery-terms.htm?country=CN&language=zh_Hans_CN");
    }

    private static void addContentCenterWhiteUrl(GRSManager gRSManager) {
        String url = gRSManager.getUrl("domainContentcenterDbankcdnNew");
        if (CommonUtil.bu()) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = M_URL_WHITE_LIST;
            addWhiteUrlList(copyOnWriteArraySet, url, Constants.H5_URL_BASE_PATH_RELEASE);
            addWhiteUrlList(copyOnWriteArraySet, url, "/cch5/HuaweiHealth/");
            addWhiteUrlList(copyOnWriteArraySet, url, "/cch5/h5builder/SportHealth-");
            return;
        }
        addWhiteUrlList(M_URL_WHITE_LIST, url, File.separator);
    }

    private static void addHelpWhiteUrl(String str) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = M_URL_WHITE_LIST;
        addWhiteUrlList(copyOnWriteArraySet, str, File.separator);
        String strD = lon.c().d("scale_new_honor_help");
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        addWhiteUrlList(copyOnWriteArraySet, strD, File.separator);
    }

    private static void addSuperService(GRSManager gRSManager) {
        List<String> listQueryUrlList = queryUrlList(SUPER_SERVICE_ID);
        if (njy.b(listQueryUrlList)) {
            for (String str : listQueryUrlList) {
                if (!TextUtils.isEmpty(str)) {
                    addWhiteUrlList(M_URL_WHITE_LIST, str, "");
                }
            }
            return;
        }
        ReleaseLogUtil.e(LOG_TAG, "superService is empty");
        String url = gRSManager.getUrl("domainVenusVmall");
        if (TextUtils.isEmpty(url)) {
            return;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = M_URL_WHITE_LIST;
        addWhiteUrlList(copyOnWriteArraySet, url, "/vmall/");
        addWhiteUrlList(copyOnWriteArraySet, url, "/huaweihealth/");
    }

    private String getFilePath() {
        try {
            if (Utils.o()) {
                return mContext.getFilesDir().getCanonicalPath() + File.separator + LIGHT_CLOUD + File.separator + "servicefwo";
            }
            return mContext.getFilesDir().getCanonicalPath() + File.separator + LIGHT_CLOUD + File.separator + "servicefw";
        } catch (IOException unused) {
            LogUtil.a(LOG_TAG, "IOException");
            return "";
        }
    }

    static class Instance {
        public static final OpenServiceControl INSTANCE = new OpenServiceControl();

        private Instance() {
        }
    }

    public static OpenServiceControl getInstance(Context context) {
        mContext = context.getApplicationContext();
        return Instance.INSTANCE;
    }

    public List<OpenService> queryAllService() {
        return this.mServiceManager.queryUserLegalService();
    }

    public void initHomePageService(String str) throws Throwable {
        initOpenServiceDbDefault();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        initHomePageOrder(str);
    }

    public int initOpenServiceDB(String str) throws Throwable {
        LogUtil.a(LOG_TAG, "initOpenServiceDB");
        if (TextUtils.isEmpty(str)) {
            str = LoginInit.getInstance(mContext).getHuidOrDefault();
            if (TextUtils.isEmpty(str) || "0".equals(str)) {
                return 0;
            }
        }
        SecurityUrlConfig securityUrlConfigInitSecurityUrlConfig = initSecurityUrlConfig();
        if (securityUrlConfigInitSecurityUrlConfig == null) {
            LogUtil.a(LOG_TAG, "initOpenServiceDB data error!");
            return 0;
        }
        mSecurityUrlManager.refreshUrls(securityUrlConfigInitSecurityUrlConfig.getSecurityUrl());
        int i = 1;
        if (!Utils.o()) {
            ServiceListConfig serviceListConfigInitServiceListConfig = initServiceListConfig();
            if (serviceListConfigInitServiceListConfig == null) {
                LogUtil.a(LOG_TAG, "initOpenServiceDB data error!");
                return 0;
            }
            List<OpenService> serviceList = serviceListConfigInitServiceListConfig.getServiceList();
            List<OpenServiceGroup> serviceTypeList = serviceListConfigInitServiceListConfig.getServiceTypeList();
            List<ChildService> childServiceList = serviceListConfigInitServiceListConfig.getChildServiceList();
            if (!checkServiceData(serviceList, serviceTypeList)) {
                LogUtil.j(LOG_TAG, "check data error !");
                return 0;
            }
            addIconPathPreToList(serviceList, childServiceList, this.mIconPath);
            if (isNewServiceComes(serviceList)) {
                LogUtil.a(LOG_TAG, "initOpenServiceDB new service comes");
                i = 2;
            }
            initHomePageOrder(str);
            this.mServiceTypeManager.refreshAllTypes(serviceTypeList);
            this.mServiceManager.refreshAllService(serviceList);
            this.mChildServiceDbManager.refreshAllService(childServiceList);
            new ServiceVersionDbManager(mContext).refreshVersion(serviceListConfigInitServiceListConfig);
        }
        return i;
    }

    private void initOpenServiceDbDefault() throws Throwable {
        if (SpUtil.isUpgrade(mContext)) {
            LogUtil.a(LOG_TAG, "start initOpenServiceDBDefault");
            SpUtil.setUpgrade(mContext, false);
            SecurityUrlConfig securityUrlConfigInitSecurityUrlConfig = initSecurityUrlConfig();
            if (securityUrlConfigInitSecurityUrlConfig == null) {
                LogUtil.a(LOG_TAG, "initOpenServiceDBDefault data error!");
                return;
            }
            mSecurityUrlManager.refreshUrls(securityUrlConfigInitSecurityUrlConfig.getSecurityUrl());
            if (Utils.o()) {
                return;
            }
            ServiceListConfig serviceListConfigInitServiceListConfig = initServiceListConfig();
            if (serviceListConfigInitServiceListConfig == null) {
                LogUtil.a(LOG_TAG, "initOpenServiceDBDefault data error!");
                return;
            }
            List<OpenService> serviceList = serviceListConfigInitServiceListConfig.getServiceList();
            List<ChildService> childServiceList = serviceListConfigInitServiceListConfig.getChildServiceList();
            List<OpenServiceGroup> serviceTypeList = serviceListConfigInitServiceListConfig.getServiceTypeList();
            if (!checkServiceData(serviceList, serviceTypeList)) {
                LogUtil.j(LOG_TAG, "initOpenServiceDBDefault check data error !");
                return;
            }
            addIconPathPreToList(serviceList, childServiceList, this.mIconPath);
            this.mServiceTypeManager.refreshAllTypes(serviceTypeList);
            this.mServiceManager.refreshAllService(serviceList);
            this.mChildServiceDbManager.refreshAllService(childServiceList);
            new ServiceVersionDbManager(mContext).refreshVersion(serviceListConfigInitServiceListConfig);
        }
    }

    public static List<String> queryUrlList(String str) {
        List<SecurityUrl> listQueryUrlList = mSecurityUrlManager.queryUrlList(str);
        ArrayList arrayList = new ArrayList();
        if (!SecurityUrl.isEmpty(listQueryUrlList)) {
            for (SecurityUrl securityUrl : listQueryUrlList) {
                if (securityUrl.getUrl() != null) {
                    arrayList.add(securityUrl.getUrl());
                }
            }
        }
        return arrayList;
    }

    public OpenService queryServiceByID(String str) {
        return this.mServiceManager.queryUserLegalServiceById(str);
    }

    public List<ChildService> queryServiceByLocation(String str) {
        return this.mChildServiceDbManager.queryUserLegalLocation(str);
    }

    public UserServiceAuth queryServiceAuth(String str, String str2) {
        OpenService openServiceQueryUserLegalServiceById;
        UserServiceAuth userServiceAuthQueryAuth = this.mUserServiceAuthManager.queryAuth(str, str2);
        if ((userServiceAuthQueryAuth != null && userServiceAuthQueryAuth.fetchAuthType() == 1) || (openServiceQueryUserLegalServiceById = this.mServiceManager.queryUserLegalServiceById(str2)) == null || openServiceQueryUserLegalServiceById.getServiceSource() == null || !openServiceQueryUserLegalServiceById.getServiceSource().contains("HUAWEI")) {
            return userServiceAuthQueryAuth;
        }
        UserServiceAuth userServiceAuth = new UserServiceAuth(str, str2, 1);
        this.mUserServiceAuthManager.insertOrUpdate(userServiceAuth);
        return userServiceAuth;
    }

    public boolean insertOrUpdateUserAuth(UserServiceAuth userServiceAuth) {
        return this.mUserServiceAuthManager.insertOrUpdate(userServiceAuth);
    }

    public String getServiceIdByUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(LOG_TAG, "getServiceIdByUrl error url");
            return null;
        }
        List<SecurityUrl> listQueryAllUrl = mSecurityUrlManager.queryAllUrl();
        if (SecurityUrl.isEmpty(listQueryAllUrl)) {
            LogUtil.j(LOG_TAG, "getServiceIdByUrl empty SecurityURL list");
            return null;
        }
        for (SecurityUrl securityUrl : listQueryAllUrl) {
            String url = securityUrl.getUrl();
            if (TextUtils.isEmpty(url)) {
                LogUtil.a(LOG_TAG, "getServiceIdByUrl empty url, error is ", securityUrl.getServiceID());
            } else if (str.startsWith(url)) {
                return securityUrl.getServiceID();
            }
        }
        return null;
    }

    public boolean checkUrlAuth(String str, String str2) {
        LogUtil.a(LOG_TAG, "checkUrlAuth");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(LOG_TAG, "checkUrlAuth error input");
            return false;
        }
        Iterator<String> it = M_URL_WHITE_LIST.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                LogUtil.a(LOG_TAG, "checkUrlAuth white list url");
                return true;
            }
        }
        String serviceIdByUrl = getServiceIdByUrl(str);
        if (TextUtils.isEmpty(serviceIdByUrl)) {
            LogUtil.a(LOG_TAG, "checkUrlAuth error serviceId");
            return false;
        }
        if (WHITE_SERVICE_ID.equals(serviceIdByUrl)) {
            LogUtil.a(LOG_TAG, "checkUrlAuth white list url serviceId");
            return true;
        }
        UserServiceAuth userServiceAuthQueryAuth = this.mUserServiceAuthManager.queryAuth(str2, serviceIdByUrl);
        if (userServiceAuthQueryAuth != null && userServiceAuthQueryAuth.fetchAuthType() != 0) {
            return true;
        }
        LogUtil.d(LOG_TAG, "checkUrlAuth the url has not auth! url is ", str, ", serviceId is", serviceIdByUrl);
        return false;
    }

    public boolean checkWhiteUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(LOG_TAG, "checkWhiteUrl error input");
            return false;
        }
        for (String str2 : M_URL_WHITE_LIST) {
            if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                LogUtil.a(LOG_TAG, "checkWhiteUrl white list url");
                return true;
            }
        }
        if (WHITE_SERVICE_ID.equals(getServiceIdByUrl(str))) {
            LogUtil.a(LOG_TAG, "checkWhiteUrl white list url serviceID");
            return true;
        }
        if (!com.huawei.operation.utils.Utils.isBleWhiteUrl(str)) {
            return false;
        }
        LogUtil.a(LOG_TAG, "checkWhiteUrl white list url fileUrl");
        return true;
    }

    private boolean isNewServiceComes(List<OpenService> list) {
        LogUtil.a(LOG_TAG, "isNewServiceComes");
        List<OpenService> legalCloudService = getLegalCloudService(list);
        if (OpenService.isEmpty(legalCloudService)) {
            LogUtil.a(LOG_TAG, "isNewServiceComes no legal date cloud service");
            return false;
        }
        List<OpenService> listQueryUserLegalService = this.mServiceManager.queryUserLegalService();
        if (OpenService.isEmpty(listQueryUserLegalService)) {
            LogUtil.a(LOG_TAG, "isNewServiceComes no legal date local service");
            return true;
        }
        for (OpenService openService : legalCloudService) {
            if (!checkServiceIdExist(openService.getServiceID(), listQueryUserLegalService)) {
                LogUtil.a(LOG_TAG, "isNewServiceComes new service comes , service is ", openService.getServiceID());
                return true;
            }
        }
        return false;
    }

    private ServiceListConfig initServiceListConfig() throws Throwable {
        LogUtil.a(LOG_TAG, "initServiceListConfig");
        String strQ = CommonUtil.q(getFilePath() + File.separator + "ServiceListConfigNew.txt");
        if (TextUtils.isEmpty(strQ)) {
            LogUtil.j(LOG_TAG, "initServiceListConfig ServiceListConfigNew.txt is not exist.");
            strQ = CommonUtil.q(getFilePath() + File.separator + "ServiceListConfig.txt");
            if (TextUtils.isEmpty(strQ)) {
                LogUtil.j(LOG_TAG, "initServiceListConfig ServiceListConfig.txt is not exist.");
                return null;
            }
        }
        try {
            return (ServiceListConfig) HiJsonUtil.d(strQ, ServiceListConfig.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e(LOG_TAG, "initServiceListConfig JsonSyntaxException, e is ", e.getMessage());
            return null;
        } catch (Exception unused) {
            LogUtil.e(LOG_TAG, "initServiceListConfig error Exception");
            return null;
        }
    }

    private SecurityUrlConfig initSecurityUrlConfig() throws Throwable {
        LogUtil.a(LOG_TAG, "initSecurityURLConfig");
        String strQ = CommonUtil.q(getFilePath() + File.separator + "SecurityURLConfig.txt");
        if (TextUtils.isEmpty(strQ)) {
            LogUtil.j(LOG_TAG, "initSecurityURLConfig str is null");
            return null;
        }
        try {
            return (SecurityUrlConfig) HiJsonUtil.d(strQ, SecurityUrlConfig.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e(LOG_TAG, "initSecurityURLConfig JsonSyntaxException, exception is ", e.getMessage());
            return null;
        } catch (Exception unused) {
            LogUtil.e(LOG_TAG, "initSecurityURLConfig error Exception");
            return null;
        }
    }

    private void initHomePageOrder(String str) {
        synchronized (this) {
            if (isUserHomepageEdited(str)) {
                return;
            }
            LogUtil.a(LOG_TAG, "initHomePageOrder new homePage comes");
            ServiceListConfig serviceListConfigInitServiceListConfig = initServiceListConfig();
            if (serviceListConfigInitServiceListConfig == null) {
                return;
            }
            List<HomePageServiceOrder> serviceHomePageCard = serviceListConfigInitServiceListConfig.getServiceHomePageCard();
            if (serviceHomePageCard == null) {
                LogUtil.a(LOG_TAG, "initHomePageOrder error homePage data");
                return;
            }
            HomePageServiceOrder.setHuidToList(serviceHomePageCard, str);
            this.mUserHomePageServiceManager.refreshOrders(str, serviceHomePageCard);
            setIsUserHomepageEdited(str, true);
        }
    }

    private boolean checkServiceData(List<OpenService> list, List<OpenServiceGroup> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (OpenService openService : list) {
            if (openService == null || !openService.checkData()) {
                return false;
            }
        }
        for (OpenServiceGroup openServiceGroup : list2) {
            if (openServiceGroup == null || TextUtils.isEmpty(openServiceGroup.getServiceTypeID())) {
                return false;
            }
        }
        return true;
    }

    private List<OpenService> getLegalCloudService(List<OpenService> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j(LOG_TAG, "isNewServiceComes empty cloud service");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OpenService openService : list) {
            if (openService != null) {
                if (!openService.isDateLegal()) {
                    LogUtil.a(LOG_TAG, "getLegalCloudService cloud service is not right date ! date is ", Integer.valueOf(HiDateUtil.d(System.currentTimeMillis())), " start day is ", Integer.valueOf(openService.getStartDate()), " end day is ", Integer.valueOf(openService.getEndDate()));
                } else {
                    arrayList.add(openService);
                }
            }
        }
        return arrayList;
    }

    private boolean checkServiceIdExist(String str, List<OpenService> list) {
        for (OpenService openService : list) {
            if (openService != null && str.equals(openService.getServiceID())) {
                return true;
            }
        }
        return false;
    }

    private void addIconPathPreToList(List<OpenService> list, List<ChildService> list2, String str) {
        LogUtil.a(LOG_TAG, "addIconPathPreToList");
        if (list == null || list.isEmpty()) {
            return;
        }
        for (OpenService openService : list) {
            String str2 = str + openService.getServiceIcon();
            String str3 = str + openService.getHomePageIcon();
            String str4 = str + openService.getServiceMidIcon();
            openService.setServiceIcon(str2);
            openService.setHomePageIcon(str3);
            openService.setServiceMidIcon(str4);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        for (ChildService childService : list2) {
            childService.setImageUrl(str + childService.getImageUrl());
        }
    }

    private boolean isUserHomepageEdited(String str) {
        return mContext.getSharedPreferences(SP, 0).getBoolean(IS_USER_HOMEPAGE_EDITED + str, false);
    }

    private void setIsUserHomepageEdited(String str, boolean z) {
        mContext.getSharedPreferences(SP, 0).edit().putBoolean(IS_USER_HOMEPAGE_EDITED + str, z).apply();
    }
}
