package com.huawei.openalliance.ad.beans.inner;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.f;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.InteractCfg;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.JSFeedbackInfo;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.db;
import com.huawei.openalliance.ad.utils.dg;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AdContentData {
    private String abilityDetailInfo;
    private String abilityDetailInfoEncode;
    private String adChoiceIcon;
    private String adChoiceUrl;
    private int apiVer;
    private List<Asset> assets;
    private String bannerRefSetting;
    private String bubbleInfo;
    private List<Integer> clickActionList;
    private List<AdvertiserInfo> compliance;
    private String configMap;
    private String contentDownMethod;
    private List<ContentExt> contentExts;
    private String contentId;
    private int creativeType;
    private String creativeUniqueId;
    private String cshareUrl;
    private String ctrlExt;
    private CtrlExt ctrlExtObj;
    private String ctrlSwitchs;
    private Integer customExposureType;
    private DefaultTemplate defaultTemplate;
    private String detailUrl;
    private int displayCount;
    private String displayDate;
    private long endTime;
    private List<ImpEX> ext;
    private List<FeedbackInfo> feedbackInfoList;
    private Integer fileCachePriority;
    private int height;
    private String intentUri;
    private InteractCfg interactCfg;
    private int interactiontype;
    private boolean isDownloaded;
    private boolean isJssdkInWhiteList;
    private boolean isVastAd;
    private List<JSFeedbackInfo> jsFeedbackInfos;
    private List<String> keyWords;
    private List<String> keyWordsType;
    private String landPageWhiteListStr;
    private int landingTitleFlag;
    private String landingType;
    private long lastShowTime;
    private String logo2Pos;
    private String logo2Text;

    @a
    private String metaData;

    @f
    private MetaData metaDataObj;
    private int minEffectiveShowRatio;
    private long minEffectiveShowTime;
    private Integer minEffectiveVideoPlayProgress;
    private boolean needAppDownload;
    private List<String> noReportEventList;
    private List<Om> omArgs;
    private int originCreativeType;
    private String paramFromServer;
    private int priority;
    private String proDesc;
    private String recordtaskinfo;
    private String requestId;
    private Integer requestType;
    private int rewardAmount;
    private int rewardDisplayInAd;
    private String rewardType;
    private int sequence;
    private String skipText;
    private int skipTextHeight;
    private String skipTextPos;
    private int skipTextSize;
    private String slotId;
    private String splashMediaPath;
    private int splashPreContentFlag;
    private long startTime;
    private String strAssets;
    private String style;
    private String styleExt;
    private String styleId;
    private String taskId;
    private String templateContent;
    private TemplateData templateData;
    private int templateId;
    private String templateIdV3;
    private String templateStyle;
    private String templateUrl;
    private List<TextState> textStateList;
    private boolean transparencyOpen;
    private boolean transparencySwitch;
    private String transparencyTplUrl;
    private String uniqueId;
    private long updateTime;
    private int useGaussianBlur;
    private VideoConfiguration videoConfiguration;
    private String webConfig;
    private String whyThisAd;
    private int width;
    private String showId = String.valueOf(as.c());
    private int sdkVer = 30484300;
    private int showAppLogoFlag = 1;
    private String fcCtrlDate = "";
    private int adType = -1;
    private boolean autoDownloadApp = false;
    private boolean directReturnVideoAd = false;
    private int linkedVideoMode = 10;
    private boolean isLast = false;
    private boolean isSpare = false;
    private int splashSkipBtnDelayTime = -111111;
    private int splashShowTime = -111111;
    private boolean rewarded = false;

    public void k(String str) {
        this.creativeUniqueId = str;
    }

    public void j(String str) {
        this.styleId = str;
    }

    public TemplateData j() {
        return this.templateData;
    }

    public void i(String str) {
        this.styleExt = str;
    }

    public String i() {
        return this.templateIdV3;
    }

    public boolean h() {
        return this.isSpare;
    }

    public void h(String str) {
        this.style = str;
    }

    public void g(String str) {
        this.bubbleInfo = str;
    }

    public String g() {
        return this.requestId;
    }

    public void f(String str) {
        this.strAssets = str;
    }

    public String f() {
        return this.uniqueId;
    }

    public void e(String str) {
        this.templateUrl = str;
    }

    public long e() {
        return this.lastShowTime;
    }

    public void d(String str) {
        this.templateIdV3 = str;
    }

    public void d(int i) {
        this.originCreativeType = i;
    }

    public String d() {
        return this.contentId;
    }

    public void c(String str) {
        this.contentId = str;
    }

    public void c(int i) {
        this.creativeType = i;
    }

    public String c() {
        return this.slotId;
    }

    public void b(List<FeedbackInfo> list) {
        if (bm.a(list)) {
            return;
        }
        this.jsFeedbackInfos = new ArrayList();
        for (FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null) {
                this.jsFeedbackInfos.add(new JSFeedbackInfo(feedbackInfo));
            }
        }
    }

    public void b(String str) {
        this.slotId = str;
    }

    public void b(int i) {
        this.apiVer = i;
    }

    public String b() {
        return this.showId;
    }

    public void a(boolean z) {
        this.isDownloaded = z;
    }

    public void a(List<Asset> list) {
        this.assets = list;
    }

    public void a(String str) {
        this.metaData = str;
        this.metaDataObj = null;
    }

    public void a(Integer num) {
        this.fileCachePriority = num;
    }

    public void a(TemplateData templateData) {
        this.templateData = templateData;
    }

    public void a(DefaultTemplate defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public void a(int i) {
        this.adType = i;
    }

    public int a() {
        return this.adType;
    }

    private static ArrayList<FeedbackInfo> b(e eVar) {
        if (!bm.a(eVar.getFeedbackInfoList()) || bm.a(eVar.getAdCloseKeyWords()) || bm.a(eVar.V()) || eVar.getAdCloseKeyWords().size() != eVar.V().size()) {
            return null;
        }
        ArrayList<FeedbackInfo> arrayList = new ArrayList<>();
        for (int i = 0; i < eVar.getAdCloseKeyWords().size(); i++) {
            FeedbackInfo feedbackInfo = new FeedbackInfo();
            feedbackInfo.a(eVar.getAdCloseKeyWords().get(i));
            feedbackInfo.a(dg.a(eVar.V().get(i), -1L));
            feedbackInfo.a(1);
            arrayList.add(feedbackInfo);
        }
        return arrayList;
    }

    private static String b(Context context, ContentRecord contentRecord) {
        if (contentRecord.A() == null) {
            return null;
        }
        if (contentRecord.A().startsWith(Scheme.CONTENT.toString())) {
            return contentRecord.A();
        }
        String strC = dk.a(context, "normal").c(contentRecord.A());
        if (!dg.b(strC) && ai.d(new File(strC))) {
            return strC;
        }
        String strC2 = dk.a(context, Constants.TPLATE_CACHE).c(contentRecord.A());
        if (dg.b(strC2) || !ai.d(new File(strC2))) {
            return null;
        }
        return strC2;
    }

    public static AdContentData a(e eVar) {
        return a((Context) null, eVar);
    }

    public static AdContentData a(Context context, e eVar) {
        if (eVar == null) {
            return null;
        }
        AdContentData adContentData = new AdContentData();
        adContentData.showId = eVar.getShowId();
        adContentData.slotId = eVar.getSlotId();
        adContentData.contentId = eVar.getContentId();
        adContentData.taskId = eVar.getTaskId();
        adContentData.endTime = eVar.getEndTime();
        adContentData.startTime = eVar.getStartTime();
        adContentData.intentUri = eVar.getIntentUri();
        adContentData.adType = eVar.e();
        adContentData.a(eVar.W());
        adContentData.bubbleInfo = eVar.C();
        adContentData.logo2Text = eVar.u();
        adContentData.clickActionList = eVar.Z();
        adContentData.ctrlSwitchs = eVar.getCtrlSwitchs();
        adContentData.uniqueId = eVar.getUniqueId();
        adContentData.requestId = eVar.f();
        adContentData.creativeType = eVar.getCreativeType();
        adContentData.interactiontype = eVar.getInterActionType();
        adContentData.whyThisAd = dg.e(eVar.getWhyThisAd());
        adContentData.adChoiceUrl = dg.e(eVar.getAdChoiceUrl());
        adContentData.adChoiceIcon = dg.e(eVar.getAdChoiceIcon());
        adContentData.omArgs = eVar.m();
        adContentData.requestType = Integer.valueOf(eVar.g());
        adContentData.contentExts = eVar.as();
        adContentData.feedbackInfoList = eVar.getFeedbackInfoList();
        adContentData.b(eVar.getFeedbackInfoList());
        if (!bm.a(b(eVar))) {
            adContentData.b(b(eVar));
            adContentData.feedbackInfoList = b(eVar);
        }
        adContentData.isVastAd = eVar.s();
        adContentData.apiVer = eVar.ai() == null ? -1 : eVar.ai().intValue();
        adContentData.assets = eVar.af();
        adContentData.strAssets = eVar.aH();
        adContentData.templateIdV3 = eVar.ae();
        adContentData.templateData = eVar.ag();
        adContentData.templateStyle = eVar.ah();
        adContentData.style = eVar.aE();
        adContentData.styleExt = eVar.aF();
        adContentData.styleId = eVar.aG();
        adContentData.templateUrl = eVar.aC();
        adContentData.customExposureType = eVar.q();
        adContentData.minEffectiveVideoPlayProgress = eVar.r();
        adContentData.minEffectiveShowTime = eVar.getMinEffectiveShowTime();
        adContentData.minEffectiveShowRatio = eVar.getMinEffectiveShowRatio();
        adContentData.defaultTemplate = eVar.aj();
        adContentData.originCreativeType = eVar.w();
        adContentData.compliance = eVar.getCompliance();
        adContentData.bannerRefSetting = eVar.aq();
        adContentData.ctrlExt = eVar.c();
        adContentData.transparencySwitch = eVar.z();
        adContentData.transparencyTplUrl = eVar.getTransparencyTplUrl();
        adContentData.transparencyOpen = eVar.isTransparencyOpen();
        adContentData.abilityDetailInfoEncode = dg.e(eVar.getAbilityDetailInfo());
        adContentData.cshareUrl = dg.e(eVar.aD());
        adContentData.videoConfiguration = eVar.getVideoConfiguration();
        adContentData.ext = eVar.ar();
        adContentData.fileCachePriority = eVar.h();
        adContentData.configMap = eVar.E();
        adContentData.paramFromServer = db.a(eVar.av());
        return adContentData;
    }

    public static AdContentData a(Context context, ContentRecord contentRecord) {
        if (contentRecord == null) {
            return null;
        }
        AdContentData adContentData = new AdContentData();
        adContentData.showId = contentRecord.l();
        adContentData.slotId = contentRecord.n();
        adContentData.contentId = contentRecord.o();
        adContentData.taskId = contentRecord.p();
        adContentData.showAppLogoFlag = contentRecord.q();
        adContentData.lastShowTime = contentRecord.r();
        adContentData.endTime = contentRecord.s();
        adContentData.startTime = contentRecord.t();
        adContentData.priority = contentRecord.E();
        adContentData.width = contentRecord.u();
        adContentData.height = contentRecord.v();
        adContentData.updateTime = contentRecord.w();
        adContentData.fcCtrlDate = contentRecord.x();
        adContentData.displayCount = contentRecord.y();
        adContentData.displayDate = contentRecord.z();
        adContentData.detailUrl = contentRecord.C();
        adContentData.interactiontype = contentRecord.D();
        adContentData.intentUri = contentRecord.I();
        adContentData.splashPreContentFlag = contentRecord.k();
        adContentData.adType = contentRecord.f();
        adContentData.skipText = contentRecord.g();
        adContentData.skipTextPos = contentRecord.N();
        adContentData.a(contentRecord.h());
        adContentData.keyWords = contentRecord.K();
        adContentData.keyWordsType = contentRecord.L();
        adContentData.logo2Text = contentRecord.P();
        adContentData.logo2Pos = contentRecord.R();
        adContentData.landingTitleFlag = contentRecord.Q();
        adContentData.clickActionList = contentRecord.O();
        adContentData.contentDownMethod = contentRecord.V();
        adContentData.ctrlSwitchs = contentRecord.X();
        adContentData.textStateList = contentRecord.Y();
        adContentData.uniqueId = contentRecord.ac();
        adContentData.landingType = contentRecord.af();
        adContentData.requestId = contentRecord.ai();
        adContentData.rewardType = contentRecord.ax();
        adContentData.rewardAmount = contentRecord.ay();
        RewardItem rewardItemAj = contentRecord.aj();
        if (rewardItemAj != null) {
            adContentData.rewardType = rewardItemAj.getType();
            adContentData.rewardAmount = rewardItemAj.getAmount();
            adContentData.rewardDisplayInAd = rewardItemAj.getDisplayInAd();
        }
        adContentData.whyThisAd = dg.e(contentRecord.ab());
        adContentData.adChoiceUrl = dg.e(contentRecord.am());
        adContentData.adChoiceIcon = dg.e(contentRecord.an());
        adContentData.skipTextHeight = contentRecord.al();
        adContentData.skipTextSize = contentRecord.ak();
        adContentData.omArgs = contentRecord.b(context);
        adContentData.fileCachePriority = dg.j(contentRecord.ap());
        adContentData.useGaussianBlur = contentRecord.aE();
        adContentData.splashShowTime = contentRecord.aw();
        adContentData.splashSkipBtnDelayTime = contentRecord.av();
        adContentData.proDesc = contentRecord.az();
        adContentData.requestType = Integer.valueOf(contentRecord.ao());
        adContentData.ext = contentRecord.aG();
        adContentData.contentExts = contentRecord.aH();
        adContentData.configMap = contentRecord.aJ();
        adContentData.feedbackInfoList = contentRecord.aN();
        adContentData.isVastAd = contentRecord.aO();
        adContentData.apiVer = contentRecord.aQ();
        adContentData.assets = contentRecord.aY();
        adContentData.strAssets = contentRecord.br();
        adContentData.templateIdV3 = contentRecord.aP();
        adContentData.templateData = contentRecord.aV();
        adContentData.templateStyle = contentRecord.aR();
        adContentData.style = contentRecord.bo();
        adContentData.styleExt = contentRecord.bp();
        adContentData.styleId = contentRecord.bq();
        adContentData.splashMediaPath = b(context, contentRecord);
        adContentData.interactCfg = contentRecord.aL();
        adContentData.defaultTemplate = contentRecord.aX();
        adContentData.ctrlExt = contentRecord.bb();
        adContentData.transparencySwitch = contentRecord.bf();
        adContentData.transparencyTplUrl = contentRecord.be();
        adContentData.transparencyOpen = contentRecord.bf() && !TextUtils.isEmpty(contentRecord.be());
        adContentData.abilityDetailInfoEncode = dg.e(contentRecord.aS());
        adContentData.bubbleInfo = contentRecord.bt();
        adContentData.configMap = contentRecord.aJ();
        adContentData.paramFromServer = db.a(contentRecord.c(context));
        return adContentData;
    }
}
