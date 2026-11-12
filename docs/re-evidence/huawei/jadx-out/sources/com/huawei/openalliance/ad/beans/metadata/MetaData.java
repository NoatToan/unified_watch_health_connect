package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.beans.base.RspBean;
import com.huawei.openalliance.ad.utils.bm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class MetaData extends RspBean {
    private String adSign;
    private List<AdSource> adSources;
    private long agentId;
    private ApkInfo apkInfo;
    private String appPromotionChannel;
    private AudioInfo audioInfo;

    @a
    private String clickUrl;
    private String cta;
    private Integer customExposureType;
    private String description;
    private String dwnParameter;
    private List<ImageInfo> icon;
    private Integer iconDispDu;
    private List<ImageInfo> imageInfo;
    private int insreTemplate;

    @a
    private String intent;
    private int isPreload;
    private String label;
    private String landingPageStyle;
    private String landingPageType;
    private String marketAppId;
    private String mediaCachePath;
    private MediaFile mediaFile;
    private List<MediaFile> mediaFiles;
    private Integer minEffectiveVideoPlayProgress;
    private String miniProgramId;
    private String miniProgramLink;
    private String privacyUrl;
    private PromoteInfo promoteInfo;
    private QponInfo qponInfo;
    private String rewardCriterion;
    private List<String> schemeInfo;
    private String screenOrientation;
    private ShareInfo shareInfo;
    private Integer showAppElement;
    private List<String> subDescriptions;
    private String templateId;
    private List<TextState> textStateList;
    private ImageInfo thumbNail;
    private String title;

    @a
    private String vastInfo;
    private VideoInfo videoInfo;
    private long minEffectiveShowTime = 500;
    private long maxEffectiveShowTime = 0;
    private int minEffectiveShowRatio = 50;
    private long duration = 0;

    public String z() {
        return this.rewardCriterion;
    }

    public long y() {
        return this.duration;
    }

    public List<MediaFile> x() {
        return this.mediaFiles;
    }

    public List<TextState> w() {
        return this.textStateList;
    }

    public MediaFile v() {
        return this.mediaFile;
    }

    public String u() {
        return this.adSign;
    }

    public PromoteInfo t() {
        return this.promoteInfo;
    }

    public ApkInfo s() {
        return this.apkInfo;
    }

    public ShareInfo r() {
        return this.shareInfo;
    }

    public void q(String str) {
        this.vastInfo = str;
    }

    public ImageInfo q() {
        return this.thumbNail;
    }

    public void p(String str) {
        this.dwnParameter = str;
    }

    public List<ImageInfo> p() {
        return this.imageInfo;
    }

    public void o(String str) {
        this.landingPageStyle = str;
    }

    public String o() {
        return this.intent;
    }

    public void n(String str) {
        this.mediaCachePath = str;
    }

    public String n() {
        return this.marketAppId;
    }

    public void m(String str) {
        this.privacyUrl = str;
    }

    public String m() {
        return this.appPromotionChannel;
    }

    public void l(String str) {
        this.landingPageType = str;
    }

    public String l() {
        return this.label;
    }

    public void k(String str) {
        this.screenOrientation = str;
    }

    public int k() {
        return this.minEffectiveShowRatio;
    }

    public void j(String str) {
        this.rewardCriterion = str;
    }

    public long j() {
        return this.maxEffectiveShowTime;
    }

    public void i(String str) {
        this.adSign = str;
    }

    public long i() {
        return this.minEffectiveShowTime;
    }

    public void h(String str) {
        this.intent = str;
    }

    public String h() {
        return this.clickUrl;
    }

    public void g(List<String> list) {
        this.subDescriptions = list;
    }

    public void g(String str) {
        this.marketAppId = str;
    }

    public List<ImageInfo> g() {
        return this.icon;
    }

    public void f(List<AdSource> list) {
        this.adSources = list;
    }

    public void f(String str) {
        this.appPromotionChannel = str;
    }

    public String f() {
        return this.description;
    }

    public void e(List<String> list) {
        this.schemeInfo = list;
    }

    public void e(String str) {
        this.label = str;
    }

    public String e() {
        return this.title;
    }

    public void d(List<MediaFile> list) {
        this.mediaFiles = list;
    }

    public void d(String str) {
        this.clickUrl = str;
    }

    public void d(Integer num) {
        this.showAppElement = num;
    }

    public VideoInfo d() {
        return this.videoInfo;
    }

    public void c(List<TextState> list) {
        this.textStateList = list;
    }

    public void c(String str) {
        this.description = str;
    }

    public void c(Integer num) {
        this.iconDispDu = num;
    }

    public void c(long j) {
        this.duration = j;
    }

    public void c(int i) {
        this.insreTemplate = i;
    }

    public Integer c() {
        return this.customExposureType;
    }

    public void b(List<ImageInfo> list) {
        this.imageInfo = list;
    }

    public void b(String str) {
        this.title = str;
    }

    public void b(Integer num) {
        this.customExposureType = num;
    }

    public void b(long j) {
        this.maxEffectiveShowTime = j;
    }

    public void b(int i) {
        this.isPreload = i;
    }

    public Integer b() {
        return this.minEffectiveVideoPlayProgress;
    }

    public void a(List<ImageInfo> list) {
        this.icon = list;
    }

    public void a(String str) {
        this.cta = str;
    }

    public void a(Integer num) {
        this.minEffectiveVideoPlayProgress = num;
    }

    public void a(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public void a(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void a(PromoteInfo promoteInfo) {
        this.promoteInfo = promoteInfo;
    }

    public void a(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    public void a(ImageInfo imageInfo) {
        this.thumbNail = imageInfo;
    }

    public void a(AudioInfo audioInfo) {
        this.audioInfo = audioInfo;
    }

    public void a(ApkInfo apkInfo) {
        this.apkInfo = apkInfo;
    }

    public void a(long j) {
        this.minEffectiveShowTime = j;
    }

    public void a(int i) {
        this.minEffectiveShowRatio = i;
    }

    public String a() {
        return this.cta;
    }

    public String S() {
        return this.miniProgramId;
    }

    public String R() {
        return this.miniProgramLink;
    }

    public long Q() {
        return this.agentId;
    }

    public List<String> P() {
        return this.subDescriptions;
    }

    public Integer O() {
        return this.showAppElement;
    }

    public List<String> N() {
        ArrayList arrayList = new ArrayList();
        if (!bm.a(this.imageInfo)) {
            Iterator<ImageInfo> it = this.imageInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c());
            }
        }
        return arrayList;
    }

    public List<String> M() {
        ArrayList arrayList = new ArrayList();
        VideoInfo videoInfo = this.videoInfo;
        if (videoInfo != null) {
            arrayList.add(videoInfo.a());
        }
        return arrayList;
    }

    public List<AdSource> L() {
        return this.adSources;
    }

    public String K() {
        return this.vastInfo;
    }

    public String J() {
        return this.landingPageStyle;
    }

    public int I() {
        return this.insreTemplate;
    }

    public int H() {
        return this.isPreload;
    }

    public Integer G() {
        return this.iconDispDu;
    }

    public AudioInfo F() {
        return this.audioInfo;
    }

    public List<String> E() {
        return this.schemeInfo;
    }

    public String D() {
        return this.mediaCachePath;
    }

    public String C() {
        return this.privacyUrl;
    }

    public String B() {
        return this.landingPageType;
    }

    public String A() {
        return this.screenOrientation;
    }
}
