package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nqy extends nqu {

    @SerializedName("fields")
    private Map<String, Object> d;

    @SerializedName("sampleStatDataType")
    private DataType e;

    public DataType l() {
        return this.e;
    }

    public Map<String, Object> o() {
        return this.d;
    }

    @Override // defpackage.nqu
    public Map<Integer, JsonObject> h() {
        HashMap map = new HashMap();
        for (Map.Entry<String, Object> entry : this.d.entrySet()) {
            if (entry.getValue() instanceof Map) {
                for (String str : ((Map) entry.getValue()).keySet()) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty(nqk.f43453a, str);
                    jsonObject.addProperty(nqk.h, entry.getKey());
                    jsonObject.addProperty(nqk.d, Integer.valueOf(this.e.getmId()));
                    map.put(Integer.valueOf(nqj.a().a(this.e.getmId(), str)), jsonObject);
                }
            }
        }
        return map;
    }

    @Override // defpackage.nqu, defpackage.nqp
    public String toString() {
        return super.toString() + "SampleStatReadRequest{mType=" + this.e + ", mFields=" + this.d + '}';
    }
}
