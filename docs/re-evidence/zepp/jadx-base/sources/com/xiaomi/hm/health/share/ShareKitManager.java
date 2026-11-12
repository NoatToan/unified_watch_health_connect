package com.xiaomi.hm.health.share;

import android.text.TextUtils;
import com.huami.widget.share.config.ShareKitConfig;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class ShareKitManager {
    public static void setShareChannel() {
        String localProperty = HMLocalPropertyUtil.getLocalProperty(HMLocalPropertyUtil.LOCAL_PROPERTY_IS_IN_MAINLAND, "");
        if (TextUtils.isEmpty(localProperty)) {
            ShareKitConfig.INSTANCE.setMainLandChannel(Locale.SIMPLIFIED_CHINESE.getCountry().equals(Locale.getDefault().getCountry()));
        } else {
            ShareKitConfig.INSTANCE.setMainLandChannel("true".equals(localProperty));
        }
    }
}
