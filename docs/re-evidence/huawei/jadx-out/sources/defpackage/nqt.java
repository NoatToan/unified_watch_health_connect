package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwonesdk.datastructure.request.DataType;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nqt extends nqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fields")
    private Map<String, Object> f43485a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("samplePointDataType")
    private List<DataType> f43486c;

    @SerializedName("dataSourceId")
    private String d;

    public int[] n() {
        ArrayList arrayList = new ArrayList();
        Iterator<DataType> it = this.f43486c.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getmId()));
        }
        return CommonUtil.c((List<Integer>) arrayList);
    }

    public void c(List<DataType> list) {
        this.f43486c = list;
    }

    public Map<String, Object> m() {
        return this.f43485a;
    }

    public Map<Integer, List<JsonObject>> c(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        int[] iArrC = CommonUtil.c(nqj.a().d(n()));
        Map<Integer, Integer> mapC = nqj.a().c(n());
        for (int i : iArrC) {
            map2.put(Integer.valueOf(i), e(nqj.a().a(mapC.get(Integer.valueOf(i)).intValue(), i), map));
        }
        return map2;
    }

    private List<JsonObject> e(List<JsonObject> list, Map<String, Object> map) {
        if (CollectionUtils.c(map)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (JsonObject jsonObject : list) {
            String asString = jsonObject.has(nqk.f43453a) ? jsonObject.get(nqk.f43453a).getAsString() : null;
            if (asString != null && map.containsKey(asString)) {
                arrayList.add(jsonObject);
            }
        }
        return arrayList;
    }

    public List<DataType> k() {
        return this.f43486c;
    }

    @Override // defpackage.nqu, defpackage.nqp
    public String toString() {
        return super.toString() + "SamplePointReadRequest{mType=" + this.f43486c + ", mFields=" + this.f43485a + '}';
    }
}
