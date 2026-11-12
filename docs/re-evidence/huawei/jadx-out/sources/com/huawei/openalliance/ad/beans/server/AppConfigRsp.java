package com.huawei.openalliance.ad.beans.server;

import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.beans.base.RspBean;
import com.huawei.openalliance.ad.beans.metadata.ReduceDisturbRule;
import com.huawei.openalliance.ad.beans.metadata.Rule;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.SpKeys;
import com.huawei.openalliance.ad.utils.bk;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AppConfigRsp extends RspBean {
    private Integer allowAdSkipTime;

    @a
    private String apiWhiteList;
    private String appList;
    private Integer bdinterval;
    private String configMap;
    private Integer configRefreshInterval;
    private List<String> defBrowerPkgList;
    private Long diskCacheValidTime;
    private Integer fcSwitch;
    private String globalSwitch;
    private Integer imeiEncodeMode;
    private Integer iteAdCA;
    private Integer iteAdCloseTm;
    private Integer iteAdExp;
    private Integer iteAdFs;
    private Integer landingMenu;
    private Integer landpageAppPrompt;

    @a
    private String landpageAppWhiteList;

    @a
    private String landpageWebBlackList;
    private double limitOfContainerAspectRatio;
    private Long maxBannerInterval;
    private Long minBannerInterval;
    private Integer notifyKitWhenRequest;
    private Integer oaidReportOnNpa;
    private String reason;
    private ReduceDisturbRule reduceDisturbRule;
    private Integer rwdCloseShowTm;
    private Integer rwdGnTm;
    private List<String> schemeInfo;
    private Integer sdkCacheDelStrategy;
    private Integer sdkCacheTotalMaxNum;
    private Integer sdkCacheTotalMaxSize;

    @a
    private String serverStore;
    private String sha256;
    private List<String> singleInstanceLSModelList;
    private Integer sloganShowTime;
    private String splashFeedbackBtnText;
    private Integer splashInteractCloseEffectiveTime;
    private Integer splashmode;
    private Integer supSdkServerGzip;
    private Integer supportGzip;
    private String testCountryCode;
    private String trustAppList;
    private Integer validityOfClickSkip;
    private Integer validityOfLockEvent;
    private Integer validityOfNativeEvent;
    private Integer validityOfSplashEvent;
    private Integer videoCacheSize;
    private int retcode = -1;

    @d(a = "splashcachenum")
    private int splashCacheNum = 10;
    private int splashshow = 3000;
    private int splashVideoCountdownTime = 5000;
    private int splashSkipArea = 0;

    @d(a = "gif_show_time_upper_limit")
    private int gifShowTimeUpperLimit = 8000;

    @d(a = "gif_show_time_lower_limit_each_frame")
    private int gifShowTimeLowerLimitEachFrame = 100;

    @d(a = SpKeys.GIF_SIZE_UPPER_LIMIT)
    private int gifSizeUpperLimit = Constants.GIF_SIZE_UPPER_LIMIT_KB;

    @d(a = SpKeys.IMG_SIZE_UPPER_LIMIT)
    private int imgSizeUpperLimit = Constants.IMG_SIZE_UPPER_LIMIT_KB;
    private long splashShowTimeInterval = 0;
    private long sloganShowMinTimeRealMode = 300;
    private int splashUserAppDayImpFc = 0;
    private String supportHmsSdkVerCode = Constants.NEW_KIT_HMS_VERSION;
    private long preloadSplashReqTimeInterval = 600000;
    private Long locationExpireTime = 1800000L;
    private Long locationRefreshInterval = 1800000L;
    private int locationSwitch = 0;

    public String z() {
        return this.landpageWebBlackList;
    }

    public long y() {
        return this.preloadSplashReqTimeInterval;
    }

    public String x() {
        return this.supportHmsSdkVerCode;
    }

    public List<String> w() {
        return this.defBrowerPkgList;
    }

    public String v() {
        return this.globalSwitch;
    }

    public Integer u() {
        return this.validityOfNativeEvent;
    }

    public Integer t() {
        return this.validityOfLockEvent;
    }

    public Integer s() {
        return this.validityOfClickSkip;
    }

    public Integer r() {
        return this.validityOfSplashEvent;
    }

    public Integer q() {
        return this.configRefreshInterval;
    }

    public Integer p() {
        return this.landpageAppPrompt;
    }

    public String o() {
        return this.landpageAppWhiteList;
    }

    public Integer n() {
        return this.landingMenu;
    }

    public String m() {
        return this.serverStore;
    }

    public int l() {
        return this.retcode;
    }

    public int k() {
        int i = this.splashSkipArea;
        if (i < 0 || i > 200) {
            return 0;
        }
        return i;
    }

    public Integer j() {
        Integer num = this.splashmode;
        if (num == null) {
            return null;
        }
        return Integer.valueOf((1 == num.intValue() || 2 == this.splashmode.intValue() || 3 == this.splashmode.intValue()) ? this.splashmode.intValue() : 1);
    }

    public int i() {
        int i = this.splashVideoCountdownTime;
        if (i >= 0) {
            return i;
        }
        return 5000;
    }

    public int h() {
        int i = this.splashshow;
        if (i >= 2000) {
            return i;
        }
        return 3000;
    }

    public Integer g() {
        int iAg;
        if (this.sloganShowTime == null) {
            return null;
        }
        Integer numJ = j();
        if (numJ == null || 1 == numJ.intValue()) {
            iAg = ag();
        } else {
            iAg = (2 == numJ.intValue() || 3 == numJ.intValue()) ? af() : 0;
        }
        return Integer.valueOf(iAg);
    }

    public long f() {
        long j = this.sloganShowMinTimeRealMode;
        if (j < 0 || j > 5000) {
            return 300L;
        }
        return j;
    }

    public long e() {
        long j = this.splashShowTimeInterval;
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    public int d(int i) {
        int i2 = this.imgSizeUpperLimit;
        return i2 > 0 ? i2 : i;
    }

    public int d() {
        int i = this.splashUserAppDayImpFc;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    public Long c() {
        return this.maxBannerInterval;
    }

    public int c(int i) {
        int i2 = this.gifSizeUpperLimit;
        return i2 > 0 ? i2 : i;
    }

    public Long b() {
        return this.minBannerInterval;
    }

    public int b(int i) {
        int i2 = this.gifShowTimeLowerLimitEachFrame;
        return i2 > 0 ? i2 : i;
    }

    public Integer ae() {
        return this.fcSwitch;
    }

    public List<String> ad() {
        return this.singleInstanceLSModelList;
    }

    public Integer ac() {
        return this.videoCacheSize;
    }

    public Integer ab() {
        return this.supSdkServerGzip;
    }

    public Integer aa() {
        return this.allowAdSkipTime;
    }

    public String a(String str) {
        ReduceDisturbRule reduceDisturbRule = this.reduceDisturbRule;
        if (reduceDisturbRule != null) {
            return a(reduceDisturbRule.a(), str);
        }
        return null;
    }

    public String a() {
        return this.trustAppList;
    }

    public int a(int i) {
        int i2 = this.gifShowTimeUpperLimit;
        return i2 >= 2000 ? i2 : i;
    }

    public String Z() {
        return this.sha256;
    }

    public Integer Y() {
        return this.oaidReportOnNpa;
    }

    public Integer X() {
        return this.rwdCloseShowTm;
    }

    public Integer W() {
        return this.iteAdCA;
    }

    public Integer V() {
        return this.iteAdExp;
    }

    public Integer U() {
        return this.iteAdFs;
    }

    public Integer T() {
        return this.iteAdCloseTm;
    }

    public Integer S() {
        return this.rwdGnTm;
    }

    public Integer R() {
        return this.supportGzip;
    }

    public String Q() {
        return this.testCountryCode;
    }

    public Integer P() {
        return this.bdinterval;
    }

    public String O() {
        return this.appList;
    }

    public String N() {
        return this.configMap;
    }

    public Integer M() {
        return this.sdkCacheTotalMaxSize;
    }

    public Integer L() {
        return this.sdkCacheTotalMaxNum;
    }

    public Integer K() {
        return this.sdkCacheDelStrategy;
    }

    public Long J() {
        return this.diskCacheValidTime;
    }

    public double I() {
        double d = this.limitOfContainerAspectRatio;
        if (d <= 0.0d) {
            return 0.05000000074505806d;
        }
        return d;
    }

    public String H() {
        return this.splashFeedbackBtnText;
    }

    public Integer G() {
        return this.splashInteractCloseEffectiveTime;
    }

    public Long F() {
        return Long.valueOf(this.locationRefreshInterval.longValue() > 0 ? this.locationRefreshInterval.longValue() : 1800000L);
    }

    public String E() {
        return this.apiWhiteList;
    }

    public int D() {
        return this.locationSwitch;
    }

    public Long C() {
        return Long.valueOf(this.locationExpireTime.longValue() > 0 ? this.locationExpireTime.longValue() : 1800000L);
    }

    public List<String> B() {
        return this.schemeInfo;
    }

    public Integer A() {
        return this.notifyKitWhenRequest;
    }

    private int ag() {
        Integer num = this.sloganShowTime;
        if (num == null) {
            return 2000;
        }
        if (num.intValue() < 0 || this.sloganShowTime.intValue() > 5000) {
            return 0;
        }
        return this.sloganShowTime.intValue();
    }

    private int af() {
        Integer num = this.sloganShowTime;
        if (num != null && num.intValue() >= 500 && this.sloganShowTime.intValue() <= 5000) {
            return this.sloganShowTime.intValue();
        }
        return 2000;
    }

    private String a(List<Rule> list, String str) {
        return (list == null || list.size() > 30) ? str : bk.b(this.reduceDisturbRule);
    }
}
