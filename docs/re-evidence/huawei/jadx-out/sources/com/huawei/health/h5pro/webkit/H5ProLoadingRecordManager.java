package com.huawei.health.h5pro.webkit;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.LogUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProLoadingRecordManager {
    public static final H5ProLoadingRecordManager d = new H5ProLoadingRecordManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f7027b = Collections.synchronizedMap(new HashMap(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f7028c = Collections.synchronizedMap(new HashMap(1));

    private H5ProLoadingRecordManager() {
    }

    public void recordStartTime(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProLoadRecordManager", "recordStartTime: packageName is empty");
            } else {
                if (this.f7027b.containsKey(str)) {
                    LogUtil.w("H5PRO_H5ProLoadRecordManager", "recordStartTime: containsKey -> " + str);
                    return;
                }
                this.f7027b.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public void recordDownloadTime(String str, long j) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProLoadRecordManager", "recordDownloadTime: packageName is empty");
            } else if (!this.f7027b.containsKey(str)) {
                this.f7028c.remove(str);
                LogUtil.w("H5PRO_H5ProLoadRecordManager", "recordDownloadTime: loading start time not recorded");
            } else {
                this.f7028c.put(str, Long.valueOf(j));
            }
        }
    }

    public JSONObject getLoadingRecord(String str) {
        synchronized (this) {
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                LogUtil.w("H5PRO_H5ProLoadRecordManager", "getLoadingRecord: packageName is empty");
                return null;
            }
            Long l = this.f7027b.get(str);
            if (l != null) {
                long jLongValue = 0;
                try {
                    if (l.longValue() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("packageName", str);
                            jSONObject.put("totalTime", System.currentTimeMillis() - l.longValue());
                            Long l2 = this.f7028c.get(str);
                            if (l2 == null || l2.longValue() <= 0) {
                                i = 1;
                            }
                            jSONObject.put("hasDownload", i);
                            if (l2 != null && l2.longValue() > 0) {
                                jLongValue = l2.longValue();
                            }
                            jSONObject.put("downloadTime", jLongValue);
                            this.f7027b.remove(str);
                            this.f7028c.remove(str);
                            return jSONObject;
                        } catch (JSONException e) {
                            LogUtil.w("H5PRO_H5ProLoadRecordManager", "getLoadingRecord: exception -> " + e.getMessage());
                            this.f7027b.remove(str);
                            this.f7028c.remove(str);
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    this.f7027b.remove(str);
                    this.f7028c.remove(str);
                    throw th;
                }
            }
            LogUtil.w("H5PRO_H5ProLoadRecordManager", "getLoadingRecord: loading start time not recorded");
            return null;
        }
    }

    public void removeLoadingRecord(String str) {
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                this.f7027b.remove(str);
                this.f7028c.remove(str);
            }
        }
    }
}
