package com.huawei.openalliance.ad.db.bean;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.c;
import com.huawei.openalliance.ad.annotations.e;
import com.huawei.openalliance.ad.annotations.f;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.metadata.MediaFile;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.beans.vast.Tracking;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ContentRecord extends a implements Serializable {
    public static final String AD_TYPE = "adType";
    public static final String API_VER = "apiVer";
    public static final String CONTENT_ID = "contentId";

    @e
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String DISPLAY_COUNT = "displayCount";
    public static final String DISPLAY_DATE = "displayDate";
    public static final String END_TIME = "endTime";
    public static final String FC_CTRL_DATE = "fcCtrlDate";
    public static final String HEIGHT = "height";
    public static final String LAST_SHOW_TIME = "lastShowTime";
    public static final String PRIORITY = "priority";
    public static final String SLOT_ID = "slotId";
    public static final String SPLASH_MEDIA_PATH = "splashMediaPath";
    public static final String SPLASH_PRE_CONTENT_FLAG = "splashPreContentFlag";
    public static final String START_TIME = "startTime";
    public static final String TASK_ID = "taskId";
    public static final String TEMPLATE_ID = "templateId";
    public static final String TIMESTAMP = "timestamp";
    public static final String UNIQUE_ID = "uniqueId";
    public static final String UPDATE_TIME = "updateTime";
    public static final String WIDTH = "width";
    private static final long serialVersionUID = 30414300;
    private String abilityDetailInfo;
    private String adChoiceIcon;
    private String adChoiceUrl;

    @e
    private long addTime;
    private int apiVer;
    private String appCountry;
    private String appLanguage;

    @c
    private List<Asset> assets;
    private String bubbleInfo;
    private String cid;
    private List<Integer> clickActionList;
    private List<AdvertiserInfo> compliance;
    private String configMap;
    private String contentDownMethod;
    private List<ContentExt> contentExts;
    private String contentId_;
    private String creativeUniqueId;

    @f
    @e
    private String cshareUrl;
    private String ctrlExt;

    @e
    private CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private String cur;
    private String customData;
    private DefaultTemplate defaultTemplate;
    private String detailUrl_;
    private int displayCount_;
    private String displayDate_;
    private String dspId;
    private long endTime_;
    private int exposure;
    private List<ImpEX> ext;
    private List<FeedbackInfo> feedbackInfoList;
    private String fileCachePriority;
    private boolean hasSetShowId;
    private int height_;
    private String hwChannelId;
    private String intentUri_;
    private InteractCfg interactCfg;
    private int interactiontype_;

    @e
    private String isAdContainerSizeMatched;

    @f
    private EncryptionField<String> jssdkAllowListStr;
    private List<String> keyWords;
    private List<String> keyWordsType;

    @f
    private EncryptionField<String> landPageWhiteListStr;
    private int landingTitleFlag;
    private String landingType;
    private String landpgDlInteractionCfg;
    private long lastShowTime_;
    private String logo2Pos;
    private String logo2Text;
    private String lurl;

    @e
    private Map<String, String> mapConfigMap;
    private long maxEffectiveShowTime;

    @e
    private MetaData metaDataInner;
    private String metaData_;
    private int minEffectiveShowRatio;
    private long minEffectiveShowTime;
    private int minEffectiveVideoPlayProgress;

    @f
    private EncryptionField<List<Monitor>> monitors;
    private List<String> noReportEventList;
    private String nurl;

    @f
    private EncryptionField<List<Om>> om;

    @f
    private EncryptionField<String> paramFromServer;

    @f
    private EncryptionField<String> price;
    private int priority_;
    private String proDesc;
    private String realAppPkgName;
    private int recallSource;
    private String recordtaskinfo;
    private String requestId;
    private int rewardAmount;
    private RewardItem rewardItem;
    private String rewardType;
    private int sdkMonitor;
    private int skipTextHeight;
    private String skipTextPos;
    private int skipTextSize;
    private String skipText_;
    private String slotId_;
    private String splashMediaPath;
    private int splashPreContentFlag_;
    private long startShowTime;
    private long startTime_;
    private String strAssets;
    private String style;
    private String styleExt;
    private String styleId;
    private String tag;
    private String taskId_;

    @e
    private TemplateData templateData;
    private String templateId;

    @e
    private String templateStyle;
    private String templateUrl;
    private List<TextState> textStateList;
    private long timestamp;
    private String trackVersion;
    private Map<String, List<Tracking>> trackingEvents;
    private int transparencySwitch;
    private String transparencyTplUrl;
    private String uniqueId;
    private String uniqueIdForUnifyDownload;
    private long updateTime_;
    private int useGaussianBlur;
    private String userId;

    @e
    private long videoTime;
    private String webConfig;
    private String whyThisAd;
    private int width_;

    @e
    private String showId = String.valueOf(as.c());
    private int showAppLogoFlag_ = 1;
    private String fcCtrlDate_ = "";
    private int creativeType_ = 2;
    private int adType_ = -1;

    @e
    private boolean autoDownloadApp = false;
    private int requestType = 0;

    @e
    private boolean isFromExSplash = false;

    @e
    private boolean isSpare = false;
    private int splashSkipBtnDelayTime = -111111;
    private int splashShowTime = -111111;
    private int isVastAd = 0;

    @e
    private boolean isPreload = false;

    public void z(String str) {
        this.adChoiceUrl = str;
    }

    public String z() {
        return this.displayDate_;
    }

    public void y(String str) {
        this.requestId = str;
    }

    public int y() {
        return this.displayCount_;
    }

    public void x(String str) {
        this.landingType = str;
    }

    public String x() {
        return this.fcCtrlDate_;
    }

    public void w(String str) {
        if (this.landPageWhiteListStr == null) {
            this.landPageWhiteListStr = new EncryptionField<>(String.class);
        }
        this.landPageWhiteListStr.a(str);
    }

    public long w() {
        return this.updateTime_;
    }

    public void v(String str) {
        this.uniqueId = str;
    }

    public int v() {
        return this.height_;
    }

    public void u(String str) {
        this.whyThisAd = str;
    }

    public int u() {
        return this.width_;
    }

    public void t(String str) {
        this.recordtaskinfo = str;
    }

    public void t(int i) {
        this.recallSource = i;
    }

    public long t() {
        return this.startTime_;
    }

    public void s(String str) {
        this.ctrlSwitchs = str;
    }

    public void s(int i) {
        this.apiVer = i;
    }

    public long s() {
        return this.endTime_;
    }

    public void r(String str) {
        this.webConfig = str;
    }

    public void r(int i) {
        this.useGaussianBlur = i;
    }

    public long r() {
        return this.lastShowTime_;
    }

    public void q(String str) {
        this.contentDownMethod = str;
    }

    public void q(int i) {
        this.splashShowTime = i;
    }

    public int q() {
        return this.showAppLogoFlag_;
    }

    public void p(String str) {
        this.logo2Pos = str;
    }

    public void p(int i) {
        this.splashSkipBtnDelayTime = i;
    }

    public String p() {
        return this.taskId_;
    }

    public void o(String str) {
        this.logo2Text = str;
    }

    public void o(int i) {
        this.requestType = i;
    }

    public String o() {
        return this.contentId_;
    }

    public void n(String str) {
        this.skipTextPos = str;
    }

    public void n(int i) {
        this.skipTextHeight = i;
    }

    public String n() {
        return this.slotId_;
    }

    public void m(String str) {
        this.intentUri_ = str;
    }

    public void m(int i) {
        this.skipTextSize = i;
    }

    public int m() {
        return this.exposure;
    }

    public void l(List<Asset> list) {
        this.assets = list;
    }

    public void l(String str) {
        if (this.paramFromServer == null) {
            this.paramFromServer = new EncryptionField<>(String.class);
        }
        this.paramFromServer.a(str);
    }

    public void l(int i) {
        this.landingTitleFlag = i;
    }

    public String l() {
        return this.showId;
    }

    public void k(List<AdvertiserInfo> list) {
        this.compliance = list;
    }

    public void k(String str) {
        this.detailUrl_ = str;
    }

    public void k(int i) {
        this.creativeType_ = i;
    }

    public int k() {
        return this.splashPreContentFlag_;
    }

    public void j(List<FeedbackInfo> list) {
        this.feedbackInfoList = list;
    }

    public void j(String str) {
        MetaData metaDataJ;
        if (TextUtils.isEmpty(str) || (metaDataJ = j()) == null) {
            return;
        }
        metaDataJ.n(str);
        b(bk.b(metaDataJ));
    }

    public void j(long j) {
        this.videoTime = j;
    }

    public void j(int i) {
        this.priority_ = i;
    }

    public MetaData j() {
        String str = this.metaData_;
        if (str == null) {
            return null;
        }
        return (MetaData) bk.b(str, MetaData.class, new Class[0]);
    }

    public void i(List<ContentExt> list) {
        this.contentExts = list;
    }

    public void i(String str) {
        this.splashMediaPath = str;
    }

    public void i(long j) {
        this.addTime = j;
    }

    public void i(int i) {
        this.interactiontype_ = i;
    }

    public MetaData i() {
        String str = this.metaData_;
        if (str == null) {
            return null;
        }
        return (MetaData) bk.b(str, MetaData.class, new Class[0]);
    }

    public void h(List<ImpEX> list) {
        this.ext = list;
    }

    public void h(String str) {
        this.displayDate_ = str;
    }

    public void h(long j) {
        this.startShowTime = j;
    }

    public void h(int i) {
        this.displayCount_ = i;
    }

    public String h() {
        return this.metaData_;
    }

    public void g(List<String> list) {
        this.noReportEventList = list;
    }

    public void g(String str) {
        this.fcCtrlDate_ = str;
    }

    public void g(long j) {
        this.updateTime_ = j;
    }

    public void g(int i) {
        this.height_ = i;
    }

    public String g() {
        return this.skipText_;
    }

    public void f(boolean z) {
        this.isPreload = z;
    }

    public void f(List<TextState> list) {
        this.textStateList = list;
    }

    public void f(String str) {
        this.taskId_ = str;
    }

    public void f(long j) {
        this.startTime_ = j;
    }

    public void f(int i) {
        this.width_ = i;
    }

    public int f() {
        return this.adType_;
    }

    public void e(boolean z) {
        this.transparencySwitch = z ? 1 : 0;
    }

    public void e(List<Integer> list) {
        this.clickActionList = list;
    }

    public void e(String str) {
        this.contentId_ = str;
    }

    public void e(long j) {
        this.endTime_ = j;
    }

    public void e(int i) {
        this.showAppLogoFlag_ = i;
    }

    public int e() {
        return this.minEffectiveVideoPlayProgress;
    }

    public void d(boolean z) {
        this.isVastAd = z ? 1 : 0;
    }

    public void d(List<Om> list) {
        EncryptionField<List<Om>> encryptionField = new EncryptionField<>(List.class, Om.class);
        encryptionField.a(list);
        this.om = encryptionField;
    }

    public void d(String str) {
        this.slotId_ = str;
    }

    public void d(EncryptionField<String> encryptionField) {
        this.jssdkAllowListStr = encryptionField;
    }

    public void d(long j) {
        this.lastShowTime_ = j;
    }

    public void d(int i) {
        this.exposure = i;
    }

    public int d() {
        return this.minEffectiveShowRatio;
    }

    public void c(boolean z) {
        this.isSpare = z;
    }

    public void c(List<Monitor> list) {
        EncryptionField<List<Monitor>> encryptionField = new EncryptionField<>(List.class, Monitor.class);
        encryptionField.a(list);
        this.monitors = encryptionField;
    }

    public void c(String str) {
        this.showId = str;
        this.hasSetShowId = true;
    }

    public void c(EncryptionField<String> encryptionField) {
        this.landPageWhiteListStr = encryptionField;
    }

    public void c(long j) {
        this.maxEffectiveShowTime = j;
    }

    public void c(int i) {
        this.splashPreContentFlag_ = i;
    }

    public String c(Context context) {
        EncryptionField<String> encryptionField = this.paramFromServer;
        if (encryptionField != null) {
            return encryptionField.a(context);
        }
        return null;
    }

    public long c() {
        return this.minEffectiveShowTime;
    }

    public String bv() {
        return this.dspId;
    }

    public String bu() {
        return this.creativeUniqueId;
    }

    public String bt() {
        return this.bubbleInfo;
    }

    public String bs() {
        return this.trackVersion;
    }

    public String br() {
        return this.strAssets;
    }

    public String bq() {
        return this.styleId;
    }

    public String bp() {
        return this.styleExt;
    }

    public String bo() {
        return this.style;
    }

    public String bn() {
        return this.lurl;
    }

    public String bm() {
        return this.nurl;
    }

    public EncryptionField<String> bl() {
        EncryptionField<String> encryptionField = this.price;
        if (encryptionField == null) {
            return null;
        }
        return encryptionField;
    }

    public String bk() {
        return this.cur;
    }

    public boolean bj() {
        return this.isPreload;
    }

    public String bi() {
        return this.realAppPkgName;
    }

    public long bh() {
        return this.videoTime;
    }

    public long bg() {
        return this.addTime;
    }

    public boolean bf() {
        return this.transparencySwitch == 1;
    }

    public String be() {
        return this.transparencyTplUrl;
    }

    public String bd() {
        return this.uniqueIdForUnifyDownload;
    }

    public CtrlExt bc() {
        if (this.ctrlExtObj == null) {
            this.ctrlExtObj = (CtrlExt) bk.b(this.ctrlExt, CtrlExt.class, new Class[0]);
        }
        return this.ctrlExtObj;
    }

    public String bb() {
        return this.ctrlExt;
    }

    public String ba() {
        return this.templateUrl;
    }

    public void b(boolean z) {
        this.isFromExSplash = z;
    }

    public void b(List<String> list) {
        this.keyWordsType = list;
    }

    public void b(String str) {
        this.metaData_ = str;
    }

    public void b(Integer num) {
        if (num != null) {
            this.minEffectiveVideoPlayProgress = num.intValue();
        }
    }

    public void b(EncryptionField<List<Monitor>> encryptionField) {
        this.monitors = encryptionField;
    }

    public void b(long j) {
        this.minEffectiveShowTime = j;
    }

    public void b(int i) {
        this.adType_ = i;
    }

    public List<Om> b(Context context) {
        EncryptionField<List<Om>> encryptionField = this.om;
        if (encryptionField != null) {
            return encryptionField.a(context);
        }
        return null;
    }

    public int b() {
        return this.sdkMonitor;
    }

    public String az() {
        return dg.e(this.proDesc);
    }

    public int ay() {
        return this.rewardAmount;
    }

    public String ax() {
        return this.rewardType;
    }

    public int aw() {
        return this.splashShowTime;
    }

    public int av() {
        return this.splashSkipBtnDelayTime;
    }

    public boolean au() {
        return this.isSpare;
    }

    public String at() {
        return this.appCountry;
    }

    public String as() {
        return this.appLanguage;
    }

    public boolean ar() {
        return this.isFromExSplash;
    }

    public String aq() {
        return this.isAdContainerSizeMatched;
    }

    public String ap() {
        return this.fileCachePriority;
    }

    public int ao() {
        return this.requestType;
    }

    public String an() {
        return this.adChoiceIcon;
    }

    public String am() {
        return this.adChoiceUrl;
    }

    public int al() {
        return this.skipTextHeight;
    }

    public int ak() {
        return this.skipTextSize;
    }

    public RewardItem aj() {
        return this.rewardItem;
    }

    public String ai() {
        return this.requestId;
    }

    public PromoteInfo ah() {
        MetaData metaDataJ = j();
        if (metaDataJ == null) {
            return null;
        }
        return metaDataJ.t();
    }

    public void ag(String str) {
        this.dspId = str;
    }

    public AppInfo ag() {
        ApkInfo apkInfoS;
        MetaData metaDataJ = j();
        if (metaDataJ == null || (apkInfoS = metaDataJ.s()) == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo(apkInfoS);
        appInfo.m(metaDataJ.o());
        appInfo.v(this.uniqueId);
        appInfo.h(metaDataJ.C());
        return appInfo;
    }

    public void af(String str) {
        this.creativeUniqueId = str;
    }

    public String af() {
        return this.landingType;
    }

    public boolean ae() {
        return this.autoDownloadApp;
    }

    public void ae(String str) {
        this.bubbleInfo = str;
    }

    public void ad(String str) {
        this.trackVersion = str;
    }

    public EncryptionField<String> ad() {
        return this.landPageWhiteListStr;
    }

    public void ac(String str) {
        this.strAssets = str;
    }

    public String ac() {
        return this.uniqueId;
    }

    public void ab(String str) {
        this.styleId = str;
    }

    public String ab() {
        return this.whyThisAd;
    }

    public void aa(String str) {
        this.styleExt = str;
    }

    public String aa() {
        return this.recordtaskinfo;
    }

    @Override // com.huawei.openalliance.ad.db.bean.a
    public String a_() {
        return "materialId";
    }

    public int aZ() {
        return this.recallSource;
    }

    public List<Asset> aY() {
        return this.assets;
    }

    public DefaultTemplate aX() {
        return this.defaultTemplate;
    }

    public String aW() {
        TemplateData templateData;
        if (dg.b(this.tag) && (templateData = this.templateData) != null && dg.d(templateData.e())) {
            P(this.templateData.e());
        }
        return this.tag;
    }

    public TemplateData aV() {
        return this.templateData;
    }

    public List<AdvertiserInfo> aU() {
        return this.compliance;
    }

    public String aT() {
        return this.hwChannelId;
    }

    public String aS() {
        return this.abilityDetailInfo;
    }

    public String aR() {
        return this.templateStyle;
    }

    public int aQ() {
        return this.apiVer;
    }

    public String aP() {
        return this.templateId;
    }

    public boolean aO() {
        return 1 == this.isVastAd;
    }

    public List<FeedbackInfo> aN() {
        return this.feedbackInfoList;
    }

    public long aM() {
        return this.startShowTime;
    }

    public InteractCfg aL() {
        return this.interactCfg;
    }

    public Map<String, String> aK() {
        if (this.mapConfigMap == null) {
            this.mapConfigMap = (Map) bk.b(this.configMap, Map.class, new Class[0]);
        }
        return this.mapConfigMap;
    }

    public String aJ() {
        return this.configMap;
    }

    public String aI() {
        return this.landpgDlInteractionCfg;
    }

    public List<ContentExt> aH() {
        return this.contentExts;
    }

    public List<ImpEX> aG() {
        return this.ext;
    }

    public EncryptionField<String> aF() {
        return this.jssdkAllowListStr;
    }

    public int aE() {
        return this.useGaussianBlur;
    }

    public String aD() {
        return this.userId;
    }

    public String aC() {
        return this.customData;
    }

    public int aB() {
        if (U() != null) {
            return U().i();
        }
        if (T() != null) {
            return T().h();
        }
        return -1;
    }

    public String aA() {
        MetaData metaDataJ = j();
        if (metaDataJ == null) {
            return null;
        }
        VideoInfo videoInfoD = metaDataJ.d();
        if (videoInfoD != null) {
            return String.valueOf(videoInfoD.c());
        }
        MediaFile mediaFileV = metaDataJ.v();
        if (mediaFileV != null) {
            return String.valueOf(mediaFileV.d());
        }
        List<ImageInfo> listP = metaDataJ.p();
        if (!bm.a(listP)) {
            for (ImageInfo imageInfo : listP) {
                if (imageInfo != null) {
                    return String.valueOf(imageInfo.f());
                }
            }
        }
        List<ImageInfo> listG = metaDataJ.g();
        if (!bm.a(listG)) {
            for (ImageInfo imageInfo2 : listG) {
                if (imageInfo2 != null) {
                    return String.valueOf(imageInfo2.f());
                }
            }
        }
        return null;
    }

    public boolean a() {
        return this.hasSetShowId;
    }

    public void a(boolean z) {
        this.autoDownloadApp = z;
    }

    public void a(List<String> list) {
        this.keyWords = list;
    }

    public void a(String str) {
        this.skipText_ = str;
    }

    public void a(Integer num) {
        if (num != null) {
            this.sdkMonitor = num.intValue();
        }
    }

    public void a(Float f) {
        if (f == null) {
            return;
        }
        if (this.price == null) {
            this.price = new EncryptionField<>(Float.class);
        }
        this.price.a(f.toString());
    }

    public void a(RewardItem rewardItem) {
        this.rewardItem = rewardItem;
    }

    public void a(EncryptionField<String> encryptionField) {
        this.paramFromServer = encryptionField;
    }

    public void a(TemplateData templateData) {
        this.templateData = templateData;
        if (templateData == null || !dg.d(templateData.e())) {
            return;
        }
        P(templateData.e());
    }

    public void a(InteractCfg interactCfg) {
        this.interactCfg = interactCfg;
    }

    public void a(DefaultTemplate defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public void a(long j) {
        this.timestamp = j;
    }

    public void a(int i) {
        this.minEffectiveShowRatio = i;
    }

    public List<Monitor> a(Context context) {
        EncryptionField<List<Monitor>> encryptionField = this.monitors;
        if (encryptionField != null) {
            return encryptionField.a(context);
        }
        return null;
    }

    public void Z(String str) {
        this.style = str;
    }

    public List<String> Z() {
        return this.noReportEventList;
    }

    public void Y(String str) {
        this.lurl = str;
    }

    public List<TextState> Y() {
        return this.textStateList;
    }

    public void X(String str) {
        this.nurl = str;
    }

    public String X() {
        return this.ctrlSwitchs;
    }

    public void W(String str) {
        this.cur = str;
    }

    public String W() {
        return this.webConfig;
    }

    public void V(String str) {
        this.cshareUrl = str;
    }

    public String V() {
        return this.contentDownMethod;
    }

    public void U(String str) {
        this.realAppPkgName = str;
    }

    public MediaFile U() {
        MetaData metaDataJ = j();
        if (metaDataJ != null) {
            return metaDataJ.v();
        }
        return null;
    }

    public void T(String str) {
        this.transparencyTplUrl = str;
    }

    public VideoInfo T() {
        MetaData metaData = (MetaData) bk.b(this.metaData_, MetaData.class, new Class[0]);
        if (metaData != null) {
            return metaData.d();
        }
        return null;
    }

    public void S(String str) {
        this.uniqueIdForUnifyDownload = str;
    }

    public ImageInfo S() {
        List<ImageInfo> listP;
        MetaData metaData = (MetaData) bk.b(this.metaData_, MetaData.class, new Class[0]);
        if (metaData == null || (listP = metaData.p()) == null || listP.size() <= 0) {
            return null;
        }
        return listP.get(0);
    }

    public void R(String str) {
        this.ctrlExt = str;
    }

    public String R() {
        return this.logo2Pos;
    }

    public void Q(String str) {
        this.templateUrl = str;
    }

    public int Q() {
        return this.landingTitleFlag;
    }

    public void P(String str) {
        this.tag = str;
    }

    public String P() {
        return this.logo2Text;
    }

    public void O(String str) {
        this.hwChannelId = str;
    }

    public List<Integer> O() {
        return this.clickActionList;
    }

    public void N(String str) {
        this.abilityDetailInfo = str;
    }

    public String N() {
        return this.skipTextPos;
    }

    public void M(String str) {
        this.templateStyle = str;
    }

    public EncryptionField<List<Monitor>> M() {
        return this.monitors;
    }

    public void L(String str) {
        this.templateId = str;
    }

    public List<String> L() {
        return this.keyWordsType;
    }

    public void K(String str) {
        this.configMap = str;
    }

    public List<String> K() {
        return this.keyWords;
    }

    public void J(String str) {
        this.landpgDlInteractionCfg = str;
    }

    public void J() {
        this.displayCount_++;
        this.priority_ = 1;
        this.lastShowTime_ = as.c();
    }

    public void I(String str) {
        if (this.jssdkAllowListStr == null) {
            this.jssdkAllowListStr = new EncryptionField<>(String.class);
        }
        this.jssdkAllowListStr.a(str);
    }

    public String I() {
        return this.intentUri_;
    }

    public void H(String str) {
        this.userId = str;
    }

    public EncryptionField<String> H() {
        return this.paramFromServer;
    }

    public void G(String str) {
        this.customData = str;
    }

    public void F(String str) {
        this.proDesc = str;
    }

    public int F() {
        return this.creativeType_;
    }

    public void E(String str) {
        this.appCountry = str;
    }

    public int E() {
        return this.priority_;
    }

    public void D(String str) {
        this.appLanguage = str;
    }

    public int D() {
        return this.interactiontype_;
    }

    public void C(String str) {
        this.isAdContainerSizeMatched = str;
    }

    public String C() {
        return this.detailUrl_;
    }

    public void B(String str) {
        this.fileCachePriority = str;
    }

    public String B() {
        MetaData metaDataJ = j();
        if (metaDataJ != null) {
            return metaDataJ.D();
        }
        return null;
    }

    public void A(String str) {
        this.adChoiceIcon = str;
    }

    public String A() {
        return this.splashMediaPath;
    }
}
