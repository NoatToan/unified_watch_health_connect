package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.EventMonitorRecord;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
class vgy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(EventMonitorRecord.EVENT_ID)
    private String f51087c;

    @SerializedName("biMap")
    private Map<String, Object> d;

    vgy() {
    }

    public String e() {
        return this.f51087c;
    }

    public Map<String, Object> c() {
        return this.d;
    }

    public String toString() {
        return "BiMetaData{mEventId='" + this.f51087c + "', mBiMap=" + this.d + '}';
    }
}
