package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;

/* JADX INFO: loaded from: classes41.dex */
public class ow implements ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gf f19925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f19926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f19927c;

    @Override // com.huawei.openalliance.ad.ra
    public String a(ImageInfo imageInfo, long j) {
        sn snVarB = b(imageInfo, j);
        if (snVarB == null) {
            return null;
        }
        so soVarA = this.f19925a.a(snVarB);
        if (soVarA != null) {
            return soVarA.a();
        }
        hw.c("BannerAdProcessor", "downloadBannerImg sourceResult is null");
        return null;
    }

    private sn b(ImageInfo imageInfo, long j) {
        if (imageInfo == null) {
            return null;
        }
        sn snVar = new sn();
        snVar.d(imageInfo.getUrl());
        snVar.c(imageInfo.getSha256());
        snVar.b(imageInfo.isCheckSha256());
        snVar.a(Long.valueOf(j));
        gk gkVar = this.f19927c;
        snVar.c(gkVar == null ? Constants.IMG_SIZE_UPPER_LIMIT_KB : gkVar.e());
        snVar.a(this.f19926b);
        snVar.c(true);
        return snVar;
    }

    public ow(Context context, INativeAd iNativeAd) {
        this.f19925a = fi.a(context);
        this.f19927c = fp.b(context);
        this.f19925a = fi.a(context);
        if (iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e) {
            this.f19926b = pl.a((com.huawei.openalliance.ad.inter.data.e) iNativeAd);
        }
    }
}
