package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.ads.AdFeedbackListener;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.activity.FeedbackActivity;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.beans.metadata.DefaultTemplate;
import com.huawei.openalliance.ad.beans.metadata.ImpEX;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.v3.Asset;
import com.huawei.openalliance.ad.beans.metadata.v3.TemplateData;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.os;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.sw;
import com.huawei.openalliance.ad.tu;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.cl;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dj;
import com.huawei.openalliance.ad.vv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class e extends a implements INativeAd {
    private AppInfo A;
    private String B;
    private String C;
    private AudioInfo D;
    private int F;
    private List<Integer> G;
    private String I;
    private String J;
    private List<String> K;
    private String L;
    private String N;
    private String O;
    private String P;
    private String R;
    private List<String> S;
    private transient IAdEvent T;
    private String V;

    @com.huawei.openalliance.ad.annotations.f
    private long W;
    private String X;
    private int Y;
    private List<ImpEX> Z;
    private List<ContentExt> aa;
    private List<FeedbackInfo> ab;
    private String ac;
    private List<Asset> ad;
    private String ae;
    private TemplateData af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private Integer ak;
    private DefaultTemplate al;
    private byte[] an;
    private String ao;
    private List<Monitor> ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private transient VideoConfiguration au;
    private String av;
    private int j;
    private String k;
    private String l;
    private String m;
    private List<String> n;
    private ImageInfo o;
    private List<ImageInfo> p;
    private List<ImageInfo> q;
    private String r;
    private long s;
    private long t;
    private int u;
    private String v;
    private String w;
    private VideoInfo x;
    private List<String> y;
    private List<String> z;
    private boolean i = false;
    private boolean E = false;
    private boolean H = false;
    private boolean M = false;
    private boolean Q = false;
    private boolean U = false;
    private boolean am = true;

    @Override // com.huawei.openalliance.ad.inter.data.a
    public void y(String str) {
        this.av = str;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean triggerClick(Context context, Bundle bundle) {
        if (context == null || !isAdIdInWhiteList()) {
            return false;
        }
        return a(context, bundle);
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean showFeedback(Context context, View view, AdFeedbackListener adFeedbackListener) {
        try {
            hw.b("INativeAd", "show feedback");
            com.huawei.openalliance.ad.views.feedback.c cVar = new com.huawei.openalliance.ad.views.feedback.c();
            cVar.a(view);
            cVar.b(adFeedbackListener);
            df.a(this);
            FeedbackActivity.a(context, cVar);
            return true;
        } catch (Throwable th) {
            hw.c("INativeAd", "showFeedback err, %s", th.getClass().getSimpleName());
            return false;
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public void setVideoConfiguration(VideoConfiguration videoConfiguration) {
        this.au = videoConfiguration;
        if (HiAd.a() != null) {
            HiAd.a().a(videoConfiguration, pa.G(getCtrlSwitchs()), pa.H(getCtrlSwitchs()), 3);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean recordShowStartEvent(Context context, Bundle bundle) {
        if (context == null || !isAdIdInWhiteList()) {
            return false;
        }
        this.W = System.currentTimeMillis();
        hw.b("INativeAd", "recordShowStartEvent.");
        c(this.W);
        h(String.valueOf(as.c()));
        return b(context, bundle);
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean recordImpressionEvent(Context context, Bundle bundle) {
        if (context == null || !isAdIdInWhiteList()) {
            return false;
        }
        return c(context, bundle);
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean recordClickEvent(Context context, Bundle bundle) {
        if (context != null && isAdIdInWhiteList()) {
            return a(context, bundle, ClickDestination.ADCONTENTINTERFACE);
        }
        hw.b("INativeAd", "record click event failed.");
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean preCheck(Context context, Integer num, String str) {
        Context applicationContext = context.getApplicationContext();
        if (num == null) {
            hw.a("INativeAd", "preCheck: param type is empty ");
            return false;
        }
        if (num.intValue() != 1) {
            return false;
        }
        return c(applicationContext);
    }

    public void p(List<Monitor> list) {
        this.ap = list;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean onFeedback(Context context, int i, List<FeedbackInfo> list) {
        hw.b("INativeAd", "report feedback");
        pc pcVarD = d(context);
        if (pcVarD == null) {
            hw.b("INativeAd", "eventProcessor is null");
            return false;
        }
        if (1 == i || 3 == i) {
            pcVarD.c(list);
        } else if (2 == i) {
            pcVarD.b(list);
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public void onAdClose(Context context, List<String> list) {
        if (context == null || !isAdIdInWhiteList()) {
            return;
        }
        hw.b("INativeAd", "onAdClose, in whitelist, report onAdCloseEvent.");
        b(context).onAdClosed(list);
    }

    public void o(List<FeedbackInfo> list) {
        this.ab = list;
    }

    public void n(List<ContentExt> list) {
        this.aa = list;
    }

    public void m(List<ImpEX> list) {
        this.Z = list;
    }

    public void m(int i) {
        this.Y = i;
    }

    public void l(boolean z) {
        this.E = z;
    }

    public void l(List<ImageInfo> list) {
        this.q = list;
    }

    public void l(int i) {
        this.F = i;
    }

    public void k(boolean z) {
        this.am = z;
    }

    public void k(List<String> list) {
        this.S = list;
    }

    public void k(int i) {
        this.u = i;
    }

    public void j(boolean z) {
        this.U = z;
    }

    public void j(List<Asset> list) {
        this.ad = list;
    }

    public void j(int i) {
        this.j = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean isVideoAd() {
        return this.x != null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean isValid(final Context context) {
        if (this.x == null || this.Q) {
            return true;
        }
        return ((Boolean) dj.a(new Callable<Boolean>() { // from class: com.huawei.openalliance.ad.inter.data.e.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                boolean z = false;
                if (bm.a(e.this.p)) {
                    return false;
                }
                if (((ImageInfo) e.this.p.get(0)).a(context) && e.this.x.a(context)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, 100L, false)).booleanValue();
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean isUseGaussianBlur() {
        return this.Y == 1;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean isSupportFirstOpen() {
        return this.E;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean isClicked() {
        return this.i;
    }

    public void i(boolean z) {
        this.Q = z;
        VideoInfo videoInfo = this.x;
        if (videoInfo != null) {
            videoInfo.e(true);
        }
    }

    public void i(List<String> list) {
        this.K = list;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public boolean hasAdvertiserInfo() {
        return !bm.a(getCompliance());
    }

    public void h(boolean z) {
        this.M = z;
    }

    public void h(List<Integer> list) {
        this.G = list;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public VideoInfo getVideoInfo() {
        return this.x;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public VideoConfiguration getVideoConfiguration() {
        return this.au;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getTitle() {
        return this.l;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<String> getSubDescription() {
        return this.n;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getSlotId() {
        return this.L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<ImageInfo> getRawImageInfos() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getPrivacyLink() {
        MetaData metaData = (MetaData) bk.b(this.B, MetaData.class, new Class[0]);
        if (metaData != null) {
            return metaData.C();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMinEffectiveShowTime() {
        return this.s;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getMinEffectiveShowRatio() {
        return this.u;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMaxEffectiveShowTime() {
        return this.t;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getLandWebUrl() {
        return this.r;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getJumpText(Context context) {
        return com.huawei.openalliance.ad.utils.c.a(pl.a(this), context, true);
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<String> getInvalidContentIds() {
        return this.S;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public int getInterActionType() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getIntentUri() {
        return dg.e(this.d);
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<ImageInfo> getImageInfos() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public ImageInfo getIcon() {
        return this.o;
    }

    public List<FeedbackInfo> getFeedbackInfoList() {
        return this.ab;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public Map<String, String> getExt() {
        HashMap map = new HashMap();
        if (!bm.a(this.aa)) {
            for (ContentExt contentExt : this.aa) {
                map.put(contentExt.a(), dg.e(contentExt.b()));
            }
        }
        if (!bm.a(this.Z)) {
            for (ImpEX impEX : this.Z) {
                map.put(impEX.a(), dg.e(impEX.b()));
            }
        }
        return map;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public String getDescription() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCtrlSwitchs() {
        return this.J;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public AudioInfo getAudioInfo() {
        return this.D;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public AppInfo getAppInfo() {
        return this.A;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<AdvertiserInfo> getAdvertiserInfo() {
        if (hasAdvertiserInfo()) {
            return getCompliance();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.INativeAd
    public List<String> getAdCloseKeyWords() {
        return this.y;
    }

    public void g(boolean z) {
        this.H = z;
    }

    public void g(List<String> list) {
        this.z = list;
    }

    public void f(boolean z) {
        this.i = z;
    }

    public void f(List<String> list) {
        this.y = list;
    }

    public void f(Integer num) {
        this.ak = num;
    }

    public void f(long j) {
        this.t = j;
    }

    public void e(List<ImageInfo> list) {
        this.p = list;
    }

    public void e(long j) {
        this.W = j;
    }

    public void d(List<String> list) {
        this.n = list;
    }

    public void d(long j) {
        this.s = j;
    }

    public IAdEvent b(Context context) {
        if (this.T == null) {
            if (context != null) {
                this.T = new os(context.getApplicationContext(), this);
            } else {
                hw.b("INativeAd", " context is null, ");
            }
        }
        return this.T;
    }

    public boolean az() {
        return this.Q;
    }

    public String ay() {
        return this.ar;
    }

    public String ax() {
        return this.aq;
    }

    public List<Monitor> aw() {
        return this.ap;
    }

    public String av() {
        return this.ao;
    }

    public byte[] au() {
        byte[] bArr = this.an;
        return bArr != null ? Arrays.copyOf(bArr, bArr.length) : new byte[0];
    }

    public boolean at() {
        return this.am;
    }

    public List<ContentExt> as() {
        return this.aa;
    }

    public List<ImpEX> ar() {
        return this.Z;
    }

    public String aq() {
        return this.X;
    }

    public Map<String, String> ap() {
        HashMap map = new HashMap();
        map.put("appId", T());
        map.put("thirdId", S());
        if (getVideoInfo() != null) {
            map.put(MapKeyNames.LINKED_CUSTOM_SHOW_ID, getShowId());
            int iB = getVideoInfo().b();
            hw.b("INativeAd", "buildLinkedAdConfig, set progress from native view %s %s", Integer.valueOf(iB), getVideoInfo().i());
            map.put(MapKeyNames.LINKED_CUSTOM_RETURN_VIDEO_DIRECT, (ai() == null || ai().intValue() != 3 ? !getVideoInfo().f() : !az()) ? "false" : "true");
            map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, getVideoInfo().getSoundSwitch());
            map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS, String.valueOf(iB));
            map.put(MapKeyNames.LINKED_SPLASH_MEDIA_PATH, this.V);
            map.put(MapKeyNames.USE_TEMPLATE, getVideoInfo().i());
            if (getVideoConfiguration() != null) {
                map.put(MapKeyNames.AUTO_PLAY_VIDEO_NETWORK, String.valueOf(getVideoConfiguration().getAutoPlayNetwork()));
                map.put(MapKeyNames.PLAY_VIDEO_IS_MUTE, Boolean.toString(getVideoConfiguration().isMute()));
            }
        }
        return map;
    }

    public boolean ao() {
        return this.U;
    }

    public String an() {
        return this.R;
    }

    public String am() {
        return this.P;
    }

    public String al() {
        return this.O;
    }

    public String ak() {
        return this.N;
    }

    public DefaultTemplate aj() {
        return this.al;
    }

    public Integer ai() {
        return this.ak;
    }

    public String ah() {
        return this.ag;
    }

    public TemplateData ag() {
        return this.af;
    }

    public List<Asset> af() {
        return this.ad;
    }

    public void ae(String str) {
        this.ae = str;
    }

    public String ae() {
        return this.ac;
    }

    public boolean ad() {
        return this.M;
    }

    public void ad(String str) {
        this.ai = str;
    }

    public void ac(String str) {
        this.aj = str;
    }

    public List<String> ac() {
        return this.K;
    }

    public void ab(String str) {
        this.ah = str;
    }

    public String ab() {
        return this.I;
    }

    public boolean aa() {
        return this.H;
    }

    public void aa(String str) {
        this.at = str;
    }

    public String aH() {
        return this.ae;
    }

    public String aG() {
        return this.aj;
    }

    public String aF() {
        return this.ai;
    }

    public String aE() {
        return this.ah;
    }

    public String aD() {
        return this.at;
    }

    public String aC() {
        return this.as;
    }

    public int aB() {
        return this.Y;
    }

    public long aA() {
        return this.W;
    }

    public boolean a(Context context, Bundle bundle) {
        f(true);
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(context, pl.a(this), ap());
        boolean zA = aVarA.a();
        if (zA) {
            a(context, bundle, aVarA.c());
        }
        return zA;
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            this.an = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public void a(VideoInfo videoInfo) {
        this.x = videoInfo;
    }

    public void a(ImageInfo imageInfo) {
        this.o = imageInfo;
    }

    public void a(AudioInfo audioInfo) {
        this.D = audioInfo;
    }

    public void a(AppInfo appInfo) {
        this.A = appInfo;
    }

    public void a(TemplateData templateData) {
        this.af = templateData;
    }

    public void a(DefaultTemplate defaultTemplate) {
        this.al = defaultTemplate;
    }

    public MaterialClickInfo a(Bundle bundle) {
        JSONObject jSONObjectB = dg.b(bundle);
        int iOptInt = jSONObjectB.optInt(MapKeyNames.CLICK_X, -111111);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObjectB.optInt(MapKeyNames.CLICK_Y, -111111);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        String strOptString = jSONObjectB.optString(MapKeyNames.CREATIVE_SIZE, "");
        Float fA = dg.a(jSONObjectB.optString(MapKeyNames.DENSITY, "-111111"), Float.valueOf(-111111.0f));
        int iOptInt3 = jSONObjectB.optInt(MapKeyNames.UP_X, -111111);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObjectB.optInt(MapKeyNames.UP_Y, -111111);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        int iOptInt5 = jSONObjectB.optInt(MapKeyNames.SLD, -111111);
        Integer numValueOf5 = Integer.valueOf(iOptInt5);
        long jOptLong = jSONObjectB.optLong(MapKeyNames.CLICK_DOWN_TIME);
        Long lValueOf = Long.valueOf(jOptLong);
        long jOptLong2 = jSONObjectB.optLong(MapKeyNames.CLICK_UP_TIME);
        Long lValueOf2 = Long.valueOf(jOptLong2);
        String strOptString2 = jSONObjectB.optString(MapKeyNames.SHAKE_ANGLE, "");
        numValueOf.getClass();
        if (iOptInt == -111111) {
            numValueOf = null;
        }
        numValueOf2.getClass();
        if (iOptInt2 == -111111) {
            numValueOf2 = null;
        }
        if (!dg.r(strOptString)) {
            strOptString = null;
        }
        if (fA.floatValue() == -111111.0f) {
            fA = null;
        }
        numValueOf3.getClass();
        if (iOptInt3 == -111111) {
            numValueOf3 = null;
        }
        numValueOf4.getClass();
        if (iOptInt4 == -111111) {
            numValueOf4 = null;
        }
        numValueOf5.getClass();
        if (iOptInt5 == -111111) {
            numValueOf5 = null;
        }
        lValueOf.getClass();
        if (jOptLong == 0) {
            lValueOf = null;
        }
        lValueOf2.getClass();
        Long l = jOptLong2 == 0 ? null : lValueOf2;
        if (dg.b(strOptString2)) {
            strOptString2 = null;
        }
        return new MaterialClickInfo.a().a(numValueOf).b(numValueOf2).b(strOptString).c(numValueOf5).a(fA).d(numValueOf3).e(numValueOf4).b(lValueOf).a(l).a(strOptString2).a();
    }

    public void Z(String str) {
        this.as = str;
    }

    public List<Integer> Z() {
        return this.G;
    }

    public void Y(String str) {
        this.ar = str;
    }

    public int Y() {
        return this.F;
    }

    public void X(String str) {
        this.aq = str;
    }

    public String X() {
        return this.C;
    }

    public void W(String str) {
        this.ao = str;
    }

    public String W() {
        return this.B;
    }

    public void V(String str) {
        this.X = str;
    }

    public List<String> V() {
        return this.z;
    }

    public boolean U() {
        List<Asset> list;
        Integer num = this.ak;
        if (num == null || num.intValue() != 3 || (list = this.ad) == null) {
            return false;
        }
        for (Asset asset : list) {
            if (asset != null && asset.e() != null) {
                return true;
            }
        }
        return false;
    }

    public void U(String str) {
        this.R = str;
    }

    public void T(String str) {
        this.P = str;
    }

    public String T() {
        return this.w;
    }

    public void S(String str) {
        this.O = str;
    }

    public String S() {
        return this.v;
    }

    public void R(String str) {
        this.N = str;
    }

    public String R() {
        return this.k;
    }

    public void Q(String str) {
        this.ag = str;
    }

    public void P(String str) {
        this.ac = str;
    }

    public void O(String str) {
        this.L = str;
    }

    public void N(String str) {
        this.J = str;
    }

    public void M(String str) {
        this.I = str;
    }

    public void L(String str) {
        this.C = str;
    }

    public void K(String str) {
        this.B = str;
    }

    public String K() {
        return this.V;
    }

    public void J(String str) {
        this.w = str;
    }

    public void I(String str) {
        this.v = str;
    }

    public void H(String str) {
        this.r = str;
    }

    public void G(String str) {
        this.m = str;
    }

    public void F(String str) {
        this.l = str;
    }

    public void E(String str) {
        this.k = str;
    }

    @Override // com.huawei.openalliance.ad.inter.data.a
    public String E() {
        return this.av;
    }

    public void B(String str) {
        this.V = str;
    }

    private pc d(Context context) {
        ContentRecord contentRecordA = pl.a(this);
        if (contentRecordA == null) {
            hw.b("INativeAd", "contentRecord is empty when convert from nativeAd");
            return null;
        }
        pc pcVar = new pc(context, sw.a(context, contentRecordA.f()));
        pcVar.a(contentRecordA);
        return pcVar;
    }

    private boolean c(Context context, Bundle bundle) {
        pc pcVarD = d(context);
        if (pcVarD == null) {
            hw.b("INativeAd", "eventProcessor is null");
            return false;
        }
        hw.b("INativeAd", "api onAdShowed");
        long jMin = Math.min(System.currentTimeMillis() - this.W, getMinEffectiveShowTime());
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(jMin)).a(Integer.valueOf(this.u)).b((Integer) 7).a(com.huawei.openalliance.ad.utils.b.a(context)).e(vv.a(bundle)).d(vv.b(bundle)).b(dg.a(bundle));
        pcVarD.a(c0229a.a());
        return true;
    }

    private boolean c(Context context) {
        List<String> list;
        if (!isSupportFirstOpen()) {
            hw.a("INativeAd", "preCheck: not support first open");
            return true;
        }
        ContentRecord contentRecordA = pl.a(this);
        String strB = com.huawei.openalliance.ad.utils.c.b(contentRecordA);
        if (dg.b(strB)) {
            hw.a("INativeAd", "preCheck: get the pkgName from app info is null");
            return true;
        }
        String strO = contentRecordA.o();
        HashMap map = new HashMap();
        map.put(strO, strB);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strO);
        ArrayList arrayList2 = new ArrayList();
        try {
            List<String> listA = cl.a(context, map, arrayList);
            try {
                return listA.contains(strO);
            } catch (Throwable th) {
                th = th;
                list = listA;
                hw.c("INativeAd", "preCheck: getNeedShowFirstOpenFromKit catch error,, %s", th.getClass().getSimpleName());
                cl.a(context, map, -1L, list, "");
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
            list = arrayList2;
        }
    }

    private boolean b(Context context, Bundle bundle) {
        pc pcVarD = d(context);
        if (pcVarD == null) {
            hw.b("INativeAd", "eventProcessor is null");
            return false;
        }
        pcVarD.a(dg.a(bundle));
        return true;
    }

    private boolean a(Context context, Bundle bundle, String str) {
        pc pcVarD = d(context);
        if (pcVarD == null) {
            hw.b("INativeAd", "eventProcessor is null");
            return false;
        }
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        MaterialClickInfo materialClickInfoA = a(bundle);
        if (materialClickInfoA.l() == null && materialClickInfoA.k() == null) {
            materialClickInfoA.h(1);
        }
        aVar.b(str).a((Integer) 12).c(dg.a(bundle)).a(materialClickInfoA).d(com.huawei.openalliance.ad.utils.b.a(context));
        pcVarD.a(aVar.a());
        return true;
    }
}
