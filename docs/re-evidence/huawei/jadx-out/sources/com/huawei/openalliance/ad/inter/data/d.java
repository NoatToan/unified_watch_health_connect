package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.oy;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.bm;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class d extends a implements b {
    private String B;
    private String C;
    private List<String> D;
    private String E;
    private String G;
    private String H;
    private com.huawei.openalliance.ad.inter.listeners.a I;
    private RewardItem J;
    private String K;
    private String M;
    private String N;
    private long O;
    private String P;
    private VideoConfiguration Q;
    private Integer R;
    private String S;
    private List<Asset> T;
    private TemplateData U;
    private int j;
    private String k;
    private String l;
    private String m;
    private List<ImageInfo> n;
    private String o;
    private long p;
    private int q;
    private String r;
    private String s;
    private VideoInfo t;
    private List<String> u;
    private AppInfo v;
    private String w;
    private String x;
    private int y;
    private List<Integer> z;
    private boolean i = false;
    private boolean A = false;
    private boolean F = false;
    private boolean L = false;
    private boolean V = false;

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMaxEffectiveShowTime() {
        return 0L;
    }

    public void i(boolean z) {
        this.V = z;
    }

    public void i(int i) {
        this.y = i;
    }

    public void h(boolean z) {
        this.h = z;
    }

    public void h(List<Integer> list) {
        this.z = list;
    }

    public void h(int i) {
        this.q = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMinEffectiveShowTime() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getMinEffectiveShowRatio() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCtrlSwitchs() {
        return this.C;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public AppInfo getAppInfo() {
        return this.v;
    }

    public void g(boolean z) {
        this.F = z;
    }

    public void g(List<Asset> list) {
        this.T = list;
    }

    public void g(int i) {
        this.j = i;
    }

    public void f(boolean z) {
        this.g = z;
    }

    public void f(List<String> list) {
        this.D = list;
    }

    public void f(Integer num) {
        this.R = num;
    }

    public void e(boolean z) {
        this.A = z;
    }

    public void e(List<String> list) {
        this.u = list;
    }

    public void e(long j) {
        this.O = j;
    }

    @Override // com.huawei.openalliance.ad.inter.data.b
    public boolean d_() {
        Integer num;
        return (this.T == null || (num = this.R) == null || num.intValue() != 3) ? false : true;
    }

    public void d(List<ImageInfo> list) {
        this.n = list;
    }

    public void d(long j) {
        this.p = j;
    }

    @Override // com.huawei.openalliance.ad.inter.data.b
    public boolean c_() {
        if (d_()) {
            return true;
        }
        int creativeType = getCreativeType();
        if (creativeType == 2 || creativeType == 4) {
            return !bm.a(this.n);
        }
        return creativeType == 9 && this.t != null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.b
    public boolean b_() {
        return this.A;
    }

    public boolean aj() {
        if (pa.G(getCtrlSwitchs()) || (this.Q == null && !this.V)) {
            H();
        }
        return this.h;
    }

    public com.huawei.openalliance.ad.inter.listeners.a ai() {
        return this.I;
    }

    public String ah() {
        return this.P;
    }

    public List<Integer> ag() {
        return this.z;
    }

    public List<Asset> af() {
        return this.T;
    }

    public TemplateData ae() {
        return this.U;
    }

    public String ad() {
        return this.S;
    }

    public Integer ac() {
        return this.R;
    }

    public long ab() {
        return this.O;
    }

    public String aa() {
        return this.N;
    }

    public void a(com.huawei.openalliance.ad.inter.listeners.a aVar) {
        this.I = aVar;
    }

    public void a(VideoInfo videoInfo) {
        this.t = videoInfo;
    }

    public void a(RewardItem rewardItem) {
        this.J = rewardItem;
    }

    public void a(AppInfo appInfo) {
        this.v = appInfo;
    }

    public void a(TemplateData templateData) {
        this.U = templateData;
    }

    @Override // com.huawei.openalliance.ad.inter.data.b
    public void a(VideoConfiguration videoConfiguration) {
        if (videoConfiguration == null) {
            return;
        }
        this.Q = videoConfiguration;
        if (HiAd.a() != null) {
            HiAd.a().a(videoConfiguration, pa.G(getCtrlSwitchs()), pa.H(getCtrlSwitchs()), 12);
        }
        if (videoConfiguration.getAutoPlayNetwork() == 1) {
            h(false);
        } else {
            h(true);
        }
        f(videoConfiguration.isMute());
    }

    @Override // com.huawei.openalliance.ad.inter.data.b
    public void a(Context context, com.huawei.openalliance.ad.inter.listeners.a aVar) {
        if (context == null) {
            return;
        }
        e(true);
        a(aVar);
        AppInfo appInfo = getAppInfo();
        if (appInfo != null) {
            hw.a("InnerInterstitialAd", "appName:%s, uniqueId:%s, appuniqueId:%s", appInfo.getAppName(), getUniqueId(), appInfo.getUniqueId());
        }
        ca.a(context, this);
        oy.a(context).b(context);
    }

    public boolean Z() {
        if (pa.H(getCtrlSwitchs()) || (this.Q == null && !this.V)) {
            G();
        }
        return this.g;
    }

    public String Y() {
        return this.H;
    }

    public String X() {
        return this.G;
    }

    public boolean W() {
        return this.F;
    }

    public String V() {
        return this.E;
    }

    public List<String> U() {
        return this.D;
    }

    public String T() {
        return this.B;
    }

    public void S(String str) {
        this.f19210a = str;
    }

    public int S() {
        return this.y;
    }

    public void R(String str) {
        this.P = str;
    }

    public String R() {
        return this.x;
    }

    public void Q(String str) {
        this.S = str;
    }

    public String Q() {
        return this.w;
    }

    public void P(String str) {
        this.N = str;
    }

    public VideoInfo P() {
        return this.t;
    }

    public void O(String str) {
        this.M = str;
    }

    public String O() {
        return this.s;
    }

    public void N(String str) {
        this.K = str;
    }

    public String N() {
        return this.r;
    }

    public void M(String str) {
        this.H = str;
    }

    public String M() {
        return this.o;
    }

    public void L(String str) {
        this.G = str;
    }

    public String L() {
        return this.l;
    }

    public void K(String str) {
        this.E = str;
    }

    public String K() {
        return this.k;
    }

    public void J(String str) {
        this.C = str;
    }

    public int J() {
        return this.j;
    }

    public void I(String str) {
        this.B = str;
    }

    public RewardItem I() {
        return this.J;
    }

    public void H(String str) {
        this.x = str;
    }

    public void G(String str) {
        this.w = str;
    }

    public void F(String str) {
        this.s = str;
    }

    public void E(String str) {
        this.r = str;
    }

    public void D(String str) {
        this.o = str;
    }

    public void C(String str) {
        this.m = str;
    }

    public void B(String str) {
        this.l = str;
    }

    public void A(String str) {
        this.k = str;
    }
}
