package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import com.huawei.openalliance.ad.constant.MimeType;
import com.huawei.openalliance.ad.pq;
import com.huawei.openalliance.ad.utils.bm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h extends a implements IPlacementAd, Comparable {
    private String B;
    private List<String> D;
    private String E;
    private String F;
    private String G;
    private String j;
    private int k;
    private String l;
    private String m;
    private List<Integer> n;
    private String o;
    private String p;
    private int q;
    private String r;
    private long s;
    private int t;
    private String u;
    private String v;
    private AppInfo w;
    private PlacementMediaFile x;
    private int z;
    private boolean i = false;
    private List<PlacementMediaFile> y = new ArrayList(4);
    private boolean A = false;
    private boolean C = false;

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMaxEffectiveShowTime() {
        return 0L;
    }

    public void j(int i) {
        this.q = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public boolean isVideoAd() {
        PlacementMediaFile placementMediaFile = this.x;
        return placementMediaFile != null && "video/mp4".equals(placementMediaFile.getMime());
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public boolean isShown() {
        return this.A;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public boolean isImageAd() {
        PlacementMediaFile placementMediaFile = this.x;
        if (placementMediaFile != null) {
            return "image/jpeg".equals(placementMediaFile.getMime()) || MimeType.GIF.equals(this.x.getMime()) || MimeType.JPG.equals(this.x.getMime()) || "image/png".equals(this.x.getMime());
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public boolean isClicked() {
        return this.i;
    }

    public void i(int i) {
        this.z = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public boolean hasAdvertiserInfo() {
        return !bm.a(getCompliance());
    }

    public void h(int i) {
        this.t = i;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getWebConfig() {
        return this.o;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public int getShowLandingPageTitleFlag() {
        return this.z;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public int getSequence() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getPromotionChannel() {
        return this.u;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMinEffectiveShowTime() {
        return this.s;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getMinEffectiveShowRatio() {
        return this.t;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public PlacementMediaFile getMediaFile() {
        return this.x;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getLandWebUrl() {
        return this.r;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getJumpText(Context context) {
        return com.huawei.openalliance.ad.utils.c.a(pq.a(this), context, true);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public int getInterActionType() {
        return this.k;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getEncodedeMonitors() {
        return this.m;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getEncodedParamFromServer() {
        return this.l;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCtrlSwitchs() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public List<Integer> getClickActionList() {
        return this.n;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public String getAppMarketAppId() {
        return this.v;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public AppInfo getAppInfo() {
        return this.w;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public List<AdvertiserInfo> getAdvertiserInfo() {
        if (hasAdvertiserInfo()) {
            return getCompliance();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPlacementAd
    public int getAdinteractiontype() {
        return this.k;
    }

    public void g(boolean z) {
        this.C = z;
    }

    public void g(int i) {
        this.k = i;
    }

    public void f(boolean z) {
        this.A = z;
    }

    public void f(List<String> list) {
        this.D = list;
    }

    public void e(boolean z) {
        this.i = z;
    }

    public void e(List<PlacementMediaFile> list) {
        this.y = list;
    }

    public void d(List<Integer> list) {
        this.n = list;
    }

    public void d(long j) {
        this.s = j;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return ((obj instanceof h) && ((h) obj).getSequence() <= getSequence()) ? 1 : -1;
    }

    public void a(PlacementMediaFile placementMediaFile) {
        this.x = placementMediaFile;
    }

    public void a(AppInfo appInfo) {
        this.w = appInfo;
    }

    public String P() {
        return this.G;
    }

    public String O() {
        return this.F;
    }

    public String N() {
        return this.E;
    }

    public String M() {
        return this.j;
    }

    public void L(String str) {
        this.G = str;
    }

    public List<String> L() {
        return this.D;
    }

    public boolean K() {
        return this.C;
    }

    public void K(String str) {
        this.F = str;
    }

    public void J(String str) {
        this.E = str;
    }

    public String J() {
        return this.B;
    }

    public void I(String str) {
        this.j = str;
    }

    public List<PlacementMediaFile> I() {
        return this.y;
    }

    public void H(String str) {
        this.B = str;
    }

    public void G(String str) {
        this.p = str;
    }

    public void F(String str) {
        this.o = str;
    }

    public void E(String str) {
        this.m = str;
    }

    public void D(String str) {
        this.v = str;
    }

    public void C(String str) {
        this.u = str;
    }

    public void B(String str) {
        this.r = str;
    }

    public void A(String str) {
        this.l = str;
    }
}
