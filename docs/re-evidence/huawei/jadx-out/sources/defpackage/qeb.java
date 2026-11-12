package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qeb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46052c;
    private int d;
    private long e;
    private long i;

    public qeb(JSONObject jSONObject, String str) {
        if (jSONObject.has("fallAsleepTime")) {
            a(jSONObject);
        }
        if (jSONObject.has("wakeupTime")) {
            d(jSONObject);
        }
        if (jSONObject.has("sleepDataQuality")) {
            try {
                int i = jSONObject.getInt("sleepDataQuality");
                this.d = i;
                ReleaseLogUtil.d("BTSYNC_CoreSleep_MetaDataCoreField", " mSleepDataQuality is ", Integer.valueOf(i));
            } catch (JSONException e) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_MetaDataCoreField", " get mSleepDataQuality error: ", ExceptionUtils.c(e));
            }
        }
        if (jSONObject.has("sleepScore")) {
            try {
                this.f46051b = jSONObject.getInt("sleepScore");
            } catch (JSONException e2) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_MetaDataCoreField", " get mScore error: ", ExceptionUtils.c(e2));
            }
        }
        if (jSONObject.has("validData")) {
            try {
                this.f46052c = jSONObject.getInt("validData");
            } catch (JSONException e3) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_MetaDataCoreField", " get mValidData error: ", ExceptionUtils.c(e3));
            }
        }
        this.f46050a = str;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_MetaDataCoreField", "sleepDataQuality is ", Integer.valueOf(this.d), ", validData is ", Integer.valueOf(this.f46052c));
        LogUtil.a("MetaDataCoreField", "fallAsleepTime is ", Long.valueOf(this.e), ", wakeupTime is ", Long.valueOf(this.i), ", score is ", Integer.valueOf(this.f46051b), ", mDeviceUuid is ", str);
    }

    private void a(JSONObject jSONObject) {
        try {
            long j = jSONObject.getLong("fallAsleepTime");
            if (j % 60 != 0) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_MetaDataCoreField", "fallAsleepTime not whole minute");
                j = (j / 60) * 60;
            }
            this.e = j * 1000;
        } catch (JSONException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_MetaDataCoreField", "get mFallAsleepTime error: ", ExceptionUtils.c(e));
        }
    }

    private void d(JSONObject jSONObject) {
        try {
            long j = jSONObject.getLong("wakeupTime");
            if (j % 60 != 0) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_MetaDataCoreField", "mWakeupTime not whole minute");
                j = (j / 60) * 60;
            }
            this.i = j * 1000;
        } catch (JSONException e) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_MetaDataCoreField", " get mWakeupTime error: ", ExceptionUtils.c(e));
        }
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.i;
    }

    public int a() {
        return this.f46051b;
    }

    public int e() {
        return this.f46052c;
    }

    public String d() {
        return this.f46050a;
    }
}
