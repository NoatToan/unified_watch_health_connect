package com.huawei.openalliance.ad.inter.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.fk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.oy;
import com.huawei.openalliance.ad.pa;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class i extends a implements IRewardAd {
    private List<Integer> A;
    private String C;
    private String D;
    private String E;
    private List<String> F;
    private String G;
    private String I;
    private String J;
    private transient IRewardAdStatusListener K;
    private transient INonwifiActionListener L;
    private String M;
    private String O;
    private String P;
    private long Q;
    private RewardItem R;
    private String T;
    private String U;
    private List<Asset> V;
    private TemplateData W;
    private Integer X;
    private VideoConfiguration Y;
    private List<ContentExt> Z;
    private int j;
    private String k;
    private String l;
    private String m;
    private List<ImageInfo> n;
    private List<ImageInfo> o;
    private String p;
    private long q;
    private int r;
    private String s;
    private String t;
    private VideoInfo u;
    private List<String> v;
    private AppInfo w;
    private String x;
    private String y;
    private int z;
    private boolean i = false;
    private boolean B = false;
    private boolean H = false;
    private boolean N = false;
    private int S = 1;
    private boolean aa = false;

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMaxEffectiveShowTime() {
        return 0L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void show(Context context, IRewardAdStatusListener iRewardAdStatusListener) {
        hw.b("RewardAd", ParamConstants.CallbackMethod.ON_SHOW);
        a(iRewardAdStatusListener);
        if (this.w != null) {
            hw.a("RewardAd", "appName:" + this.w.getAppName() + ", uniqueId:" + getUniqueId() + ", appuniqueId:" + this.w.getUniqueId());
        }
        df.a(this);
        if (getPromoteInfo() == null || getPromoteInfo().getType() != 3) {
            ca.a(context, this);
            oy.a(context).b(context);
        } else {
            fk.a(context).a();
            a(context, this.d, at());
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setVideoConfiguration(VideoConfiguration videoConfiguration) {
        if (videoConfiguration == null) {
            return;
        }
        if (HiAd.a() != null) {
            HiAd.a().a(videoConfiguration, pa.G(getCtrlSwitchs()), pa.H(getCtrlSwitchs()), 7);
        }
        if (videoConfiguration.getAutoPlayNetwork() == 1) {
            setMobileDataAlertSwitch(false);
        } else {
            setMobileDataAlertSwitch(true);
        }
        this.Y = videoConfiguration;
        setMute(videoConfiguration.isMute());
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setRewardItem(RewardItem rewardItem) {
        this.R = rewardItem;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setNonwifiActionListener(INonwifiActionListener iNonwifiActionListener) {
        this.L = iNonwifiActionListener;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setMute(boolean z) {
        this.g = z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setMobileDataAlertSwitch(boolean z) {
        this.h = z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setMediaSetVideoCfg(boolean z) {
        this.aa = z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public void setAudioFocusType(int i) {
        this.S = i;
    }

    public void j(List<ContentExt> list) {
        this.Z = list;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public boolean isValid() {
        return (aq() != null && aq().intValue() == 3) || this.u != null;
    }

    public void i(List<Asset> list) {
        this.V = list;
    }

    public void i(int i) {
        this.z = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public boolean hasShown() {
        return T();
    }

    public void h(boolean z) {
        this.N = z;
    }

    public void h(List<String> list) {
        this.F = list;
    }

    public void h(int i) {
        this.r = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IRewardAd
    public RewardItem getRewardItem() {
        return this.R;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMinEffectiveShowTime() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getMinEffectiveShowRatio() {
        return this.r;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCtrlSwitchs() {
        return this.E;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public AppInfo getAppInfo() {
        return this.w;
    }

    public void g(boolean z) {
        this.H = z;
    }

    public void g(List<Integer> list) {
        this.A = list;
    }

    public void g(int i) {
        this.j = i;
    }

    public void f(boolean z) {
        this.B = z;
    }

    public void f(List<String> list) {
        this.v = list;
    }

    public void f(Integer num) {
        this.X = num;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public void e(List<ImageInfo> list) {
        this.o = list;
    }

    public void e(long j) {
        this.Q = j;
    }

    public void d(List<ImageInfo> list) {
        this.n = list;
    }

    public void d(long j) {
        this.q = j;
    }

    public List<ContentExt> as() {
        return this.Z;
    }

    public String ar() {
        return this.f19210a;
    }

    public Integer aq() {
        return this.X;
    }

    public TemplateData ap() {
        return this.W;
    }

    public List<Asset> ao() {
        return this.V;
    }

    public String an() {
        return this.U;
    }

    public String am() {
        return this.T;
    }

    public int al() {
        return this.S;
    }

    public boolean ak() {
        if (pa.G(getCtrlSwitchs()) || !this.aa) {
            H();
        }
        return this.h;
    }

    public long aj() {
        return this.Q;
    }

    public String ai() {
        return this.P;
    }

    public String ah() {
        return this.O;
    }

    public boolean ag() {
        return this.N;
    }

    public String af() {
        return this.M;
    }

    public IRewardAdStatusListener ae() {
        return this.K;
    }

    public boolean ad() {
        if (pa.H(getCtrlSwitchs()) || !this.aa) {
            G();
        }
        return this.g;
    }

    public INonwifiActionListener ac() {
        return this.L;
    }

    public String ab() {
        return this.J;
    }

    public String aa() {
        return this.y;
    }

    public void a(IRewardAdStatusListener iRewardAdStatusListener) {
        this.K = iRewardAdStatusListener;
    }

    public void a(VideoInfo videoInfo) {
        this.u = videoInfo;
    }

    public void a(AppInfo appInfo) {
        this.w = appInfo;
    }

    public void a(TemplateData templateData) {
        this.W = templateData;
    }

    public String Z() {
        return this.k;
    }

    public String Y() {
        return this.I;
    }

    public boolean X() {
        return this.H;
    }

    public String W() {
        return this.G;
    }

    public List<String> V() {
        return this.F;
    }

    public String U() {
        return this.D;
    }

    public boolean T() {
        return this.B;
    }

    public void T(String str) {
        this.f19210a = str;
    }

    public void S(String str) {
        this.U = str;
    }

    public int S() {
        return this.z;
    }

    public void R(String str) {
        this.T = str;
    }

    public List<Integer> R() {
        return this.A;
    }

    public void Q(String str) {
        this.P = str;
    }

    public String Q() {
        return this.x;
    }

    public void P(String str) {
        this.O = str;
    }

    public VideoInfo P() {
        return this.u;
    }

    public void O(String str) {
        this.C = str;
    }

    public String O() {
        return this.t;
    }

    public void N(String str) {
        this.M = str;
    }

    public String N() {
        return this.s;
    }

    public void M(String str) {
        this.J = str;
    }

    public String M() {
        return this.p;
    }

    public void L(String str) {
        this.y = str;
    }

    public List<ImageInfo> L() {
        return this.o;
    }

    public void K(String str) {
        this.k = str;
    }

    public List<ImageInfo> K() {
        return this.n;
    }

    public void J(String str) {
        this.I = str;
    }

    public String J() {
        return this.l;
    }

    public void I(String str) {
        this.G = str;
    }

    public int I() {
        return this.j;
    }

    public void H(String str) {
        this.E = str;
    }

    public void G(String str) {
        this.D = str;
    }

    public void F(String str) {
        this.x = str;
    }

    public void E(String str) {
        this.t = str;
    }

    public void D(String str) {
        this.s = str;
    }

    public void C(String str) {
        this.p = str;
    }

    public void B(String str) {
        this.m = str;
    }

    public void A(String str) {
        this.l = str;
    }

    private String at() {
        for (ContentExt contentExt : this.Z) {
            if (MapKeyNames.PLAYABLE_LINK.equals(contentExt.a())) {
                return contentExt.b();
            }
        }
        return "";
    }

    private void a(Context context, String str, String str2) {
        SafeIntent safeIntent = new SafeIntent(new Intent());
        safeIntent.setAction(Constants.REWARD_ACTIVITY_ACTION);
        safeIntent.putExtra("is_mute", this.g);
        safeIntent.putExtra("url", str);
        safeIntent.putExtra(MapKeyNames.PLAYABLE_LINK, str2);
        safeIntent.putExtra(MapKeyNames.IS_HIAD_PLAY, true);
        if (!(context instanceof Activity)) {
            safeIntent.addFlags(268435456);
        }
        context.startActivity(safeIntent);
    }
}
