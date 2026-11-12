package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.utils.dg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class ShareInfo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19203c;
    private String d;

    public String getTitle() {
        return this.f19202b;
    }

    public String getShareUrl() {
        return this.d;
    }

    public String getIconUrl() {
        return this.f19201a;
    }

    public String getDescription() {
        return this.f19203c;
    }

    public ShareInfo(com.huawei.openalliance.ad.beans.metadata.ShareInfo shareInfo) {
        if (shareInfo != null) {
            this.f19201a = shareInfo.a();
            this.f19202b = dg.e(shareInfo.b());
            this.f19203c = dg.e(shareInfo.c());
            this.d = shareInfo.d();
        }
    }

    public ShareInfo() {
    }
}
