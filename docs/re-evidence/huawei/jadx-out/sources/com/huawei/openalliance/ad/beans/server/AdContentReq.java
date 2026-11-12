package com.huawei.openalliance.ad.beans.server;

import android.content.Context;
import com.huawei.hms.ads.data.SearchInfo;
import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.annotations.f;
import com.huawei.openalliance.ad.beans.base.ReqBean;
import com.huawei.openalliance.ad.beans.metadata.AdSlot30;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.Device;
import com.huawei.openalliance.ad.beans.metadata.ExtraReqField;
import com.huawei.openalliance.ad.beans.metadata.Location;
import com.huawei.openalliance.ad.beans.metadata.Network;
import com.huawei.openalliance.ad.beans.metadata.Options;
import com.huawei.openalliance.ad.beans.metadata.SdkExposureHistoryRecord;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.en;
import com.huawei.openalliance.ad.inter.data.SearchTerm;
import com.huawei.openalliance.ad.nf;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.o;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AdContentReq extends ReqBean {

    @d(a = "gACString")
    @a
    private String acString;
    private App app;

    @a
    private List<String> audIds;
    private List<String> blkTptIds;
    private List<String> cacheSloganId;
    private List<String> cachecontentid;
    private List<String> cachedTemplates;
    private String clientAdRequestId;

    @a
    private String consent;
    private List<String> cur;
    private Device device;

    @d(a = "reqExt")
    private ExtraReqField extraReqField;

    @a
    private String hwACString;
    private Integer hwDspNpa;

    @f
    private boolean isDirectNpa;
    private Integer isQueryUseEnabled;

    @d(a = "geo")
    private Location loc;
    private List<AdSlot30> multislot;
    private Network network;
    private Integer nonPersonalizedAd;

    @d(a = "regs")
    private Options opts;
    private int parentCtrlUser;
    private int pdToOther;

    @a
    private String ppsStore;

    @d(a = "pltm")
    private Integer preloadTriggerMode;
    private List<String> removedContentId;
    private Integer requestType;
    private int scrnReadStat;
    private List<SdkExposureHistoryRecord> sdkExposureHistoryData;
    private int[] sdkMonitors;

    @d(a = "search")
    private SearchInfo searchInfo;

    @d(a = "srch")
    private SearchTerm searchTerm;
    private Integer tMax;

    @a
    private Map<String, String> tag;
    private Integer thirdDspNpa;
    private String tptEngineVer;
    private Map<String, Integer> unsptTptTags;
    private String version = Constants.INTER_VERSION;
    private String sdkversion = "3.4.84.300";
    private int reqPurpose = 1;

    @d(a = "rtenv")
    private Integer appRunningStatus = 1;
    private Boolean supportTptAd = false;
    private Integer suptRelateRank = 0;

    @f
    private String acdReqUri = Constants.ACD_REQ_URI;

    @f
    private String acdRealm = Constants.ACD_REALM;

    public SearchInfo z() {
        return this.searchInfo;
    }

    public SearchTerm y() {
        return this.searchTerm;
    }

    public Location x() {
        return this.loc;
    }

    public Options w() {
        return this.opts;
    }

    public Integer v() {
        return this.thirdDspNpa;
    }

    public Integer u() {
        return this.hwDspNpa;
    }

    public Integer t() {
        return this.isQueryUseEnabled;
    }

    public Integer s() {
        return this.nonPersonalizedAd;
    }

    public String r() {
        return this.clientAdRequestId;
    }

    public List<String> q() {
        return this.cachedTemplates;
    }

    public int p() {
        return this.pdToOther;
    }

    public int o() {
        return this.reqPurpose;
    }

    public String n() {
        return this.ppsStore;
    }

    public List<String> m() {
        return this.removedContentId;
    }

    public List<String> l() {
        return this.cachecontentid;
    }

    public List<AdSlot30> k() {
        return this.multislot;
    }

    public Network j() {
        return this.network;
    }

    public Device i() {
        return this.device;
    }

    public void h(String str) {
        this.acdRealm = str;
    }

    public void h(Integer num) {
        this.tMax = num;
    }

    public App h() {
        return this.app;
    }

    public void g(String str) {
        this.acdReqUri = str;
    }

    public void g(Integer num) {
        this.suptRelateRank = num;
    }

    public String g() {
        return this.sdkversion;
    }

    public void f(List<SdkExposureHistoryRecord> list) {
        this.sdkExposureHistoryData = list;
    }

    public void f(String str) {
        this.tptEngineVer = str;
    }

    public void f(Integer num) {
        this.requestType = num;
    }

    public String f() {
        return this.version;
    }

    public void e(List<String> list) {
        this.cur = list;
    }

    public void e(String str) {
        this.hwACString = str;
    }

    public void e(Integer num) {
        this.preloadTriggerMode = num;
    }

    public int e() {
        return this.scrnReadStat;
    }

    public void d(List<String> list) {
        this.audIds = list;
    }

    public void d(String str) {
        this.acString = str;
    }

    public void d(Integer num) {
        this.thirdDspNpa = num;
    }

    public int d() {
        return this.parentCtrlUser;
    }

    public void c(List<String> list) {
        this.blkTptIds = list;
    }

    public void c(String str) {
        this.consent = dg.f(str);
    }

    public void c(Integer num) {
        this.hwDspNpa = num;
    }

    public void b(Map<String, Integer> map) {
        this.unsptTptTags = map;
    }

    public void b(List<String> list) {
        this.removedContentId = list;
    }

    public void b(String str) {
        this.clientAdRequestId = str;
    }

    public void b(Integer num) {
        this.isQueryUseEnabled = num;
    }

    public void b(int i) {
        this.pdToOther = i;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String b() {
        return this.acdReqUri;
    }

    public void a(int[] iArr) {
        this.sdkMonitors = iArr;
    }

    public void a(boolean z) {
        this.isDirectNpa = z;
    }

    public void a(Map<String, Integer> map, List<String> list) {
        if (bm.a(this.multislot) || this.multislot.get(0) == null || !dg.d(this.multislot.get(0).s())) {
            return;
        }
        this.supportTptAd = true;
        this.tptEngineVer = this.multislot.get(0).s();
        this.unsptTptTags = map;
        this.blkTptIds = list;
    }

    public void a(Map<String, String> map) {
        this.tag = map;
    }

    public void a(List<AdSlot30> list) {
        this.multislot = list;
    }

    public void a(String str) {
        this.ppsStore = str;
    }

    public void a(Integer num) {
        this.nonPersonalizedAd = num;
    }

    public void a(Boolean bool) {
        this.supportTptAd = bool;
    }

    public void a(SearchTerm searchTerm) {
        this.searchTerm = searchTerm;
    }

    public void a(Options options) {
        this.opts = options;
    }

    public void a(Location location) {
        this.loc = location;
    }

    public void a(ExtraReqField extraReqField) {
        this.extraReqField = extraReqField;
    }

    public void a(Device device) {
        this.device = device;
    }

    public void a(App app) {
        this.app = app;
    }

    public void a(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public void a(int i) {
        this.reqPurpose = i;
    }

    @Override // com.huawei.openalliance.ad.beans.base.ReqBean
    public String a() {
        return this.acdRealm;
    }

    public boolean P() {
        return this.isDirectNpa;
    }

    public List<String> O() {
        return this.cur;
    }

    public int[] N() {
        return this.sdkMonitors;
    }

    public Integer M() {
        return this.tMax;
    }

    public Integer L() {
        return this.suptRelateRank;
    }

    public Integer K() {
        return this.requestType;
    }

    public List<String> J() {
        return this.audIds;
    }

    public List<String> I() {
        return this.blkTptIds;
    }

    public Map<String, Integer> H() {
        return this.unsptTptTags;
    }

    public String G() {
        return this.tptEngineVer;
    }

    public Integer F() {
        return this.preloadTriggerMode;
    }

    public Map<String, String> E() {
        return this.tag;
    }

    public String D() {
        return this.hwACString;
    }

    public String C() {
        return this.acString;
    }

    public String B() {
        return this.consent;
    }

    public Integer A() {
        return this.appRunningStatus;
    }

    public AdContentReq(final Context context, List<AdSlot30> list, List<String> list2, List<String> list3, List<String> list4, AdSlotParam adSlotParam, boolean z) {
        int iD = adSlotParam.d();
        int iF = adSlotParam.f();
        int iE = adSlotParam.e();
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.beans.server.AdContentReq.1
            @Override // java.lang.Runnable
            public void run() {
                AdContentReq.this.appRunningStatus = Integer.valueOf(!dk.n(context) ? 1 : 0);
            }
        });
        this.multislot = list;
        en enVarA = en.a(context);
        App appB = enVarA.b();
        this.app = appB == null ? new App(context) : appB;
        Network networkA = enVarA.a();
        if (networkA != null) {
            this.network = networkA;
            enVarA.a((Network) null);
        } else {
            this.network = new Network(context, z);
        }
        Device deviceC = enVarA.c();
        if (deviceC != null) {
            this.device = deviceC;
            deviceC.a(context, iE, iF, iD);
        } else {
            this.device = new Device(context, iE, iF, iD, z);
        }
        this.device.b(nf.a().a(context));
        this.cachecontentid = list2;
        this.cacheSloganId = list3;
        this.cachedTemplates = list4;
        this.parentCtrlUser = com.huawei.openalliance.ad.utils.d.p(context);
        this.scrnReadStat = com.huawei.openalliance.ad.utils.d.r(context);
        com.huawei.openalliance.ad.utils.d.B(context);
    }

    public AdContentReq() {
    }
}
