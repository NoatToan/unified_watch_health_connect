package com.xiaomi.hm.health.databases;

import android.text.TextUtils;
import com.xiaomi.hm.health.databases.model.HmProperty;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class HMLocalPropertyUtil {
    public static final String LOCAL_PROPERTY_IS_IN_MAINLAND = "IS_IN_MAINLAND";

    @Deprecated
    private static final int a = 1;

    public static synchronized String getLocalProperty(String str, String str2) {
        HmProperty hmPropertyLoad = HMDaoManager.getInstance().getHmPropertyDao().load(str);
        if (hmPropertyLoad != null && !TextUtils.isEmpty(hmPropertyLoad.getValue())) {
            return hmPropertyLoad.getValue();
        }
        return str2;
    }

    public static synchronized void setLocalProperty(String str, String str2) {
        HMDaoManager.getInstance().getHmPropertyDao().insertOrReplace(new HmProperty(str, str2, 1));
    }
}
