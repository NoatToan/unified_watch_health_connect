package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.k;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements IAd {
    private Integer A;
    private String B;
    private String C;
    private List<Om> D;
    private String E;
    private int G;
    private long H;
    private Integer I;
    private Integer J;
    private boolean K;
    private List<AdSource> L;
    private String M;
    private String N;
    private String O;
    private List<AdvertiserInfo> P;
    private String R;
    private Integer S;
    private transient CtrlExt T;
    private String V;
    private String X;
    private PromoteInfo Y;
    private BiddingInfo Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f19210a;
    private String aa;
    private String ab;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f19211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f19212c;
    protected String d;
    protected String e;
    protected String f;
    private transient AdContentData i;
    private String k;
    private String l;
    private String n;
    private int p;
    private int q;
    private String r;
    private String s;
    private long t;
    private int u;
    private String v;
    private String x;
    private String y;
    private String z;
    private String j = String.valueOf(as.c());
    private boolean m = false;
    private String o = "2";
    private int w = 0;
    private String F = UUID.randomUUID().toString();
    private int Q = 0;
    private boolean U = false;
    private boolean W = false;
    protected boolean g = true;
    protected boolean h = true;
    private Integer ac = 0;

    public boolean isAutoDownloadApp() {
        return true;
    }

    public boolean z() {
        return this.W;
    }

    public void z(String str) {
        this.ab = str;
    }

    public void y(String str) {
        this.aa = str;
    }

    public Integer y() {
        return this.S;
    }

    public void x(String str) {
        this.k = str;
    }

    public int x() {
        return this.Q;
    }

    public void w(String str) {
        this.l = str;
    }

    public int w() {
        return this.q;
    }

    public void v(String str) {
        this.ad = str;
    }

    public AdContentData v() {
        return this.i;
    }

    public void u(String str) {
        this.X = str;
    }

    public String u() {
        return this.M;
    }

    public void t(String str) {
        this.V = str;
    }

    public List<AdSource> t() {
        return this.L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void showAppDetailPage(Context context) {
        ca.a(context, this, (MaterialClickInfo) null);
    }

    public void setUserId(String str) {
        this.f = dg.f(str);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        if (rewardVerifyConfig != null) {
            setCustomData(rewardVerifyConfig.getData());
            setUserId(rewardVerifyConfig.getUserId());
        }
    }

    public void setCustomData(String str) {
        this.e = dg.f(str);
    }

    public void setAutoDownloadApp(boolean z) {
        this.m = z;
    }

    public boolean s() {
        return this.K;
    }

    public void s(String str) {
        this.O = str;
    }

    public void r(String str) {
        this.N = str;
    }

    public Integer r() {
        return this.J;
    }

    public void q(String str) {
        this.M = str;
    }

    public Integer q() {
        return this.I;
    }

    public void p(String str) {
        this.E = str;
    }

    public long p() {
        return this.H;
    }

    public void o(String str) {
        this.C = str;
    }

    public int o() {
        return this.G;
    }

    public void n(String str) {
        this.B = str;
    }

    public String n() {
        return this.E;
    }

    public void m(String str) {
        this.F = str;
    }

    public List<Om> m() {
        return this.D;
    }

    public void l(String str) {
        this.z = str;
    }

    public String l() {
        return this.f;
    }

    public void k(String str) {
        this.y = str;
    }

    public String k() {
        return this.e;
    }

    public void j(String str) {
        this.x = str;
    }

    public String j() {
        return this.C;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isTransparencyOpen() {
        return this.W && !TextUtils.isEmpty(this.V);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isShowAppElement() {
        Integer num = this.S;
        return num != null && num.intValue() == 1;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isExpired() {
        return this.f19212c < System.currentTimeMillis();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isAdIdInWhiteList() {
        Context contextD;
        if (pa.k(getCtrlSwitchs())) {
            return true;
        }
        com.huawei.openalliance.ad.inter.f fVarA = HiAd.a();
        if (fVarA == null || (contextD = fVarA.d()) == null) {
            return false;
        }
        String packageName = contextD.getPackageName();
        return WhiteListPkgList.inWhiteList(packageName, k.e(contextD, packageName));
    }

    public void i(String str) {
        this.v = str;
    }

    public String i() {
        return this.B;
    }

    public int hashCode() {
        String str = this.f19211b;
        return (str != null ? str.hashCode() : -1) & super.hashCode();
    }

    public void h(String str) {
        this.j = str;
    }

    public Integer h() {
        return this.A;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void gotoWhyThisAdPage(Context context) {
        a(context);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getWhyThisAd() {
        return TextUtils.isEmpty(this.x) ? Constants.WHY_THIS_AD_DEFAULT_URL : this.x;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getUniqueId() {
        return this.F;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getTransparencyTplUrl() {
        return this.V;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getTaskId() {
        return this.r;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getStartTime() {
        return this.t;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getShowId() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public RewardVerifyConfig getRewardVerifyConfig() {
        RewardVerifyConfig.Builder builder = new RewardVerifyConfig.Builder();
        builder.setData(k());
        builder.setUserId(l());
        return builder.build();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public PromoteInfo getPromoteInfo() {
        return this.Y;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getLabel() {
        return this.s;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getInterfaceDownloadConfig() {
        return pa.E(getCtrlSwitchs());
    }

    public String getIntent() {
        return this.d;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getHwChannelId() {
        return this.O;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getEndTime() {
        return this.f19212c;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getDspName() {
        AdSource adSourceA = AdSource.a(this.L);
        if (adSourceA != null) {
            return dg.e(adSourceA.a());
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getDspLogo() {
        AdSource adSourceA = AdSource.a(this.L);
        if (adSourceA != null) {
            return adSourceA.b();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCta() {
        return this.n;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getCreativeType() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getContentId() {
        return this.f19211b;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public List<AdvertiserInfo> getCompliance() {
        return this.P;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public BiddingInfo getBiddingInfo() {
        BiddingInfo biddingInfo = this.Z;
        return biddingInfo == null ? new BiddingInfo() : biddingInfo;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdSign() {
        return this.o;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdChoiceUrl() {
        return this.y;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdChoiceIcon() {
        return this.z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAbilityDetailInfo() {
        return this.N;
    }

    public void g(String str) {
        this.d = str;
    }

    public int g() {
        return this.w;
    }

    public void f(String str) {
        this.s = str;
    }

    public void f(int i) {
        this.Q = i;
    }

    public String f() {
        return this.v;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || (str = this.f19211b) == null) {
            return false;
        }
        return TextUtils.equals(str, ((a) obj).f19211b);
    }

    public void e(String str) {
        this.r = str;
    }

    public void e(Integer num) {
        this.S = num;
    }

    public void e(int i) {
        this.q = i;
    }

    public int e() {
        return this.u;
    }

    public void d(boolean z) {
        this.W = z;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.o = str;
    }

    public void d(Integer num) {
        this.J = num;
    }

    public void d(int i) {
        this.G = i;
    }

    public CtrlExt d() {
        if (this.T == null) {
            this.T = (CtrlExt) bk.b(this.R, CtrlExt.class, new Class[0]);
        }
        return this.T;
    }

    public void c(boolean z) {
        this.K = z;
    }

    public void c(List<AdvertiserInfo> list) {
        this.P = list;
    }

    public void c(String str) {
        this.f19211b = str;
    }

    public void c(Integer num) {
        this.I = num;
    }

    public void c(long j) {
        this.H = j;
    }

    public void c(int i) {
        this.w = i;
    }

    public String c() {
        return this.R;
    }

    public boolean b() {
        return this.U;
    }

    public void b(boolean z) {
        AdContentData adContentData = this.i;
        if (adContentData != null) {
            adContentData.a(z);
        }
    }

    public void b(List<AdSource> list) {
        this.L = list;
    }

    public void b(String str) {
        this.n = str;
    }

    public void b(Integer num) {
        this.A = num;
    }

    public void b(long j) {
        this.f19212c = j;
    }

    public void b(int i) {
        this.u = i;
    }

    public void a(boolean z) {
        this.U = z;
    }

    public void a(List<Om> list) {
        this.D = list;
    }

    public void a(String str) {
        this.R = str;
    }

    public void a(Integer num) {
        this.ac = num;
    }

    public void a(BiddingInfo biddingInfo) {
        this.Z = biddingInfo;
    }

    public void a(PromoteInfo promoteInfo) {
        this.Y = promoteInfo;
    }

    public void a(AdContentData adContentData) {
        this.i = adContentData;
    }

    public void a(Context context, MaterialClickInfo materialClickInfo) {
        ca.a(context, this, materialClickInfo);
    }

    public void a(Context context) {
        if (context == null) {
            hw.c("BaseAd", "context is null not call gotoWhyThisAdPage method");
        } else {
            as.a(context, this);
        }
    }

    public void a(long j) {
        this.t = j;
    }

    public void a(int i) {
        this.p = i;
        AdContentData adContentData = this.i;
        if (adContentData != null) {
            adContentData.c(i);
        }
    }

    public Integer a() {
        return this.ac;
    }

    protected void H() {
        hw.b("BaseAd", "reset video config server");
        Map map = (Map) bk.b(this.aa, Map.class, new Class[0]);
        String str = map != null ? (String) map.get(Constants.VIDEO_AUTO_PLAY) : null;
        if (TextUtils.isEmpty(str)) {
            str = "y";
        }
        this.h = !TextUtils.equals(str, "a");
    }

    protected void G() {
        hw.b("BaseAd", "reset video config server");
        Map map = (Map) bk.b(this.aa, Map.class, new Class[0]);
        String str = map != null ? (String) map.get(Constants.VIDEO_PLAY_SOUND) : null;
        if (TextUtils.isEmpty(str)) {
            str = "n";
        }
        this.g = TextUtils.equals(str, "n");
    }

    public String F() {
        return this.ab;
    }

    public String E() {
        return this.aa;
    }

    public String D() {
        return this.k;
    }

    public String C() {
        return this.l;
    }

    public String B() {
        return this.ad;
    }

    public String A() {
        return this.X;
    }
}
