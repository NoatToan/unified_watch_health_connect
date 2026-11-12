package com.xiaomi.infra.galaxy.fds.model;

import com.xiaomi.infra.galaxy.fds.bean.ThirdPartyObjectBean;

/* JADX INFO: loaded from: classes22.dex */
public class ThirdPartyObject {
    private ThirdPartyObjectBean a;
    private FDSObjectMetadata b;

    public FDSObjectMetadata getObjectMetadata() {
        return this.b;
    }

    public ThirdPartyObjectBean getThirdPartyObjectBean() {
        return this.a;
    }

    public void setObjectMetadata(FDSObjectMetadata fDSObjectMetadata) {
        this.b = fDSObjectMetadata;
    }

    public void setThirdPartyObjectBean(ThirdPartyObjectBean thirdPartyObjectBean) {
        this.a = thirdPartyObjectBean;
    }
}
