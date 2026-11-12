package defpackage;

import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class lis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25115b;
    public long c;
    public String d;
    public long e;

    public lis() {
        this(0, 0L, 0L, null);
    }

    public int a() {
        return this.f25114a;
    }

    public lis b(JSONObject jSONObject) {
        this.f25115b = jSONObject.getLong("cost");
        this.e = jSONObject.getLong(MediaStoreUtil.MediaInfo.SIZE);
        this.c = jSONObject.getLong(DeviceTagInterface.TAG_DATA_START);
        this.f25114a = jSONObject.getInt("wt");
        this.d = jSONObject.optString("expt");
        return this;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f25115b);
        jSONObject.put(MediaStoreUtil.MediaInfo.SIZE, this.e);
        jSONObject.put(DeviceTagInterface.TAG_DATA_START, this.c);
        jSONObject.put("wt", this.f25114a);
        jSONObject.put("expt", this.d);
        return jSONObject;
    }

    public lis(int i, long j, long j2, Exception exc) {
        this.f25114a = i;
        this.f25115b = j;
        this.e = j2;
        this.c = System.currentTimeMillis();
        if (exc != null) {
            this.d = exc.getClass().getSimpleName();
        }
    }
}
