package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.PromoteInfo;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.k;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ContentRecord f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MetaData f19222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppInfo f19223c;

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public BiddingInfo getBiddingInfo() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void showAppDetailPage(Context context) {
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void setRewardVerifyConfig(RewardVerifyConfig rewardVerifyConfig) {
        ContentRecord contentRecord;
        if (rewardVerifyConfig == null || (contentRecord = this.f19221a) == null) {
            return;
        }
        contentRecord.G(dg.f(rewardVerifyConfig.getData()));
        this.f19221a.H(dg.f(rewardVerifyConfig.getUserId()));
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isTransparencyOpen() {
        ContentRecord contentRecord = this.f19221a;
        return (contentRecord == null || !contentRecord.bf() || TextUtils.isEmpty(this.f19221a.be())) ? false : true;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isShowAppElement() {
        Integer numO;
        MetaData metaData = this.f19222b;
        return (metaData == null || (numO = metaData.O()) == null || numO.intValue() != 1) ? false : true;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public boolean isExpired() {
        ContentRecord contentRecord = this.f19221a;
        return contentRecord == null || contentRecord.s() < System.currentTimeMillis();
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

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public void gotoWhyThisAdPage(Context context) {
        if (this.f19221a == null) {
            return;
        }
        a(context);
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getWhyThisAd() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.ab();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getUniqueId() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.ac();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getTransparencyTplUrl() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.be();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getTaskId() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.p();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getStartTime() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return 0L;
        }
        return contentRecord.t();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getShowId() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.l();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public RewardVerifyConfig getRewardVerifyConfig() {
        if (this.f19221a == null) {
            return null;
        }
        RewardVerifyConfig.Builder builder = new RewardVerifyConfig.Builder();
        builder.setData(this.f19221a.aC());
        builder.setUserId(this.f19221a.aD());
        return builder.build();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public PromoteInfo getPromoteInfo() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.ah();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMinEffectiveShowTime() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return metaData.i();
        }
        return 500L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getMinEffectiveShowRatio() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return metaData.k();
        }
        return 50;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getMaxEffectiveShowTime() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return metaData.j();
        }
        return 0L;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getLabel() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return dg.e(metaData.l());
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getInterfaceDownloadConfig() {
        return pa.E(getCtrlSwitchs());
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getHwChannelId() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.aT();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public long getEndTime() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return 0L;
        }
        return contentRecord.s();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getDspName() {
        AdSource adSourceA;
        MetaData metaData = this.f19222b;
        if (metaData == null || (adSourceA = AdSource.a(metaData.L())) == null) {
            return null;
        }
        return dg.e(adSourceA.a());
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getDspLogo() {
        AdSource adSourceA;
        MetaData metaData = this.f19222b;
        if (metaData == null || (adSourceA = AdSource.a(metaData.L())) == null) {
            return null;
        }
        return adSourceA.b();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCtrlSwitchs() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.X();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getCta() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return dg.e(metaData.a());
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public int getCreativeType() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return 0;
        }
        return contentRecord.F();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getContentId() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.o();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public List<AdvertiserInfo> getCompliance() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.aU();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public AppInfo getAppInfo() {
        AppInfo appInfo = this.f19223c;
        if (appInfo != null) {
            return appInfo;
        }
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        AppInfo appInfoAg = contentRecord.ag();
        this.f19223c = appInfoAg;
        return appInfoAg;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdSign() {
        MetaData metaData = this.f19222b;
        if (metaData != null) {
            return metaData.u();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdChoiceUrl() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.am();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAdChoiceIcon() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.an();
    }

    @Override // com.huawei.openalliance.ad.inter.data.IAd
    public String getAbilityDetailInfo() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord == null) {
            return null;
        }
        return contentRecord.aS();
    }

    public String b() {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord != null) {
            return contentRecord.bd();
        }
        return null;
    }

    public void a(String str) {
        ContentRecord contentRecord = this.f19221a;
        if (contentRecord != null) {
            contentRecord.S(str);
        }
    }

    public void a(Context context) {
        if (context == null) {
            hw.c("UnifyAd", "context is null not call gotoWhyThisAdPage method");
        } else {
            as.a(context, this);
        }
    }

    public ContentRecord a() {
        return this.f19221a;
    }

    public j(ContentRecord contentRecord) {
        this.f19221a = contentRecord;
        if (contentRecord != null) {
            this.f19222b = contentRecord.j();
        }
    }
}
