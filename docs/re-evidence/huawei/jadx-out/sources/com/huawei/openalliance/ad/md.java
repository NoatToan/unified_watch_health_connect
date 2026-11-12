package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class md {
    public static me a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return new mc();
        }
        if (contentRecord.T() != null || (contentRecord.U() != null && "video/mp4".equals(contentRecord.U().a()))) {
            if (mg.e()) {
                return new mg();
            }
        } else if (lz.a()) {
            return new lz();
        }
        return new mc();
    }
}
