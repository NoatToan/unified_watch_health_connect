package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class tl extends com.huawei.openalliance.ad.uriaction.interfaces.a {
    @Override // com.huawei.openalliance.ad.uriaction.interfaces.a
    public boolean a() {
        hw.b("FeatureAbilityAction", "The current SDK does not support opening HARMONY SERVICE");
        return b();
    }

    public tl(Context context, ContentRecord contentRecord) {
        super(context, contentRecord);
    }
}
