package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nrb extends nqu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sampleSequenceDataType")
    private DataType f43504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subDataType")
    private List<SubDataType> f43505c;

    @SerializedName("readOptions")
    private b e;

    public DataType l() {
        return this.f43504b;
    }

    public int[] k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.f43504b.getmId()));
        return CommonUtil.c((List<Integer>) arrayList);
    }

    @Override // defpackage.nqu
    public Map<Integer, List<JsonObject>> h() {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(this.f43504b.getmId()), nqj.a().a(this.f43504b.getmId(), this.f43504b.getmId()));
        return map;
    }

    public b n() {
        return this.e;
    }

    public List<SubDataType> m() {
        return this.f43505c;
    }

    public int[] o() {
        List<SubDataType> listM = m();
        if (njy.e(listM)) {
            LogUtil.e("SampleSequenceReadRequest", "getQueryTypes: subDataTypeList is empty");
            return new int[0];
        }
        int size = listM.size();
        int[] iArr = new int[size];
        int i = 0;
        for (SubDataType subDataType : listM) {
            if (subDataType == null) {
                LogUtil.e("SampleSequenceReadRequest", "getQueryTypes: skip null subDataType, index=" + i);
                iArr[i] = 0;
            } else {
                iArr[i] = subDataType.getmId();
            }
            i++;
        }
        LogUtil.b("SampleSequenceReadRequest", "getQueryTypes: success, result length=" + size);
        return iArr;
    }

    @Override // defpackage.nqu, defpackage.nqp
    public String toString() {
        return "SampleSequenceReadRequest{mType=" + this.f43504b + ", mReadOptions=" + this.e + '}';
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("withSummary")
        private boolean f43506a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("withDetails")
        private boolean f43507c;

        public boolean e() {
            return this.f43507c;
        }

        public String toString() {
            return "SampleSequenceReadOptions{mWithSummary=" + this.f43506a + ", mWithDetails=" + this.f43507c + '}';
        }
    }
}
