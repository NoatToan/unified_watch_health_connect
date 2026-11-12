package com.huawei.health.health.utils.functionsetcard;

import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import defpackage.lsr;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HandleCacheDataRunnable {
    protected final String mCacheTag;
    protected final String mVersion;

    public abstract void handleCacheData(HiHealthData hiHealthData, boolean z);

    public HandleCacheDataRunnable(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("cacheTag is empty");
        }
        this.mCacheTag = str;
        this.mVersion = str2;
    }

    private HiHealthData readCacheData() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String healthData = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).readHealthData(this.mCacheTag);
        if (TextUtils.isEmpty(healthData)) {
            LogUtil.a(this.mCacheTag, "readCacheData, return null");
            return null;
        }
        HiHealthData hiHealthData = (HiHealthData) lsr.b(healthData, HiHealthData.CREATOR, this.mVersion);
        String str = this.mCacheTag;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int length = healthData.length();
        LogUtil.a(str, "readCacheData success. times=", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", length=", Integer.valueOf(length), ", ver=", this.mVersion);
        return hiHealthData;
    }

    public void writeCacheData(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).writeHealthData(this.mCacheTag, null);
            LogUtil.a(this.mCacheTag, "writeCacheData delete");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = lsr.d(hiHealthData, this.mVersion);
        if (strD != null) {
            SharedPreferenceUtil.getInstance(BaseApplication.getContext()).writeHealthData(this.mCacheTag, strD);
            String str = this.mCacheTag;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int length = strD.length();
            LogUtil.a(str, "writeCacheData save times=", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), ", length=", Integer.valueOf(length), ", ver=", this.mVersion);
        }
    }

    protected String marshallToString(Parcelable parcelable) {
        String strD = lsr.d(parcelable, (String) null);
        LogUtil.a(this.mCacheTag, "marshallToString, length=", Integer.valueOf(strD.length()));
        return strD;
    }

    protected <T> T unmarshallFromString(String str, Parcelable.Creator<T> creator) {
        T t = (T) lsr.b(str, creator, null);
        LogUtil.a(this.mCacheTag, "unmarshallFromString, length=", Integer.valueOf(str != null ? str.length() : 0));
        return t;
    }

    protected String marshallListToString(List list) {
        String strE = lsr.e(list, null);
        LogUtil.a(this.mCacheTag, "marshallListToString, list size=", Integer.valueOf(list != null ? list.size() : 0), ", dataLen=", Integer.valueOf(strE.length()));
        return strE;
    }

    protected void unmarshallListFromString(String str, List list) {
        lsr.c(str, getClass().getClassLoader(), null, list);
        LogUtil.a(this.mCacheTag, "unmarshallListFromString, list size=", Integer.valueOf(list.size()), ", dataLen=", Integer.valueOf(str != null ? str.length() : 0));
    }
}
