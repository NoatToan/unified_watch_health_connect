package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("count")
    private int f43480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataFilter")
    private String f43481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("constantsKey")
    private List<String> f43482c;

    @SerializedName("anchor")
    private int d;

    @SerializedName("aggregateType")
    private String e;

    @SerializedName("deviceUuid")
    private String f;

    @SerializedName("dataType")
    private DataType g;

    @SerializedName("groupUnitType")
    private int h;

    @SerializedName("groupUnitSize")
    private int i;

    @SerializedName("endTime")
    private long j;

    @SerializedName("sortOrder")
    private int k;

    @SerializedName("sequenceDataType")
    private int l;

    @SerializedName("readType")
    private int m;

    @SerializedName("localDate")
    private String n;

    @SerializedName("startTime")
    private long o;

    @SerializedName("dataTypes")
    private List<Integer> p;

    @SerializedName("subTypes")
    private List<Integer> t;

    public DataType a() {
        return this.g;
    }

    public long m() {
        return this.o;
    }

    public long j() {
        return this.j;
    }

    public int[] l() {
        return CommonUtil.c(this.p);
    }

    public int g() {
        return this.h;
    }

    public int f() {
        return this.f43480a;
    }

    public int b() {
        return this.d;
    }

    public int k() {
        return this.k;
    }

    public int o() {
        return this.m;
    }

    public String i() {
        return this.f;
    }

    public List<String> d() {
        return this.f43482c;
    }

    public int c() {
        return nqk.e(this.e);
    }

    public int h() {
        return this.i;
    }

    public List<Integer> n() {
        return this.t;
    }

    public Map<Integer, JSONObject> e() {
        HashMap map = new HashMap();
        for (Map.Entry<Integer, Integer> entry : nqj.a().b(l()).entrySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(nqk.f43453a, d());
                jSONObject.put(nqk.d, entry.getValue());
                map.put(entry.getKey(), jSONObject);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return map;
    }

    public String toString() {
        return "AggregateHealthRequest{anchor=" + this.d + ", mDataType=" + this.g + ", mStartTime=" + this.o + ", mEndTime=" + this.j + ", mTypes=" + this.p + ", mLocalDate='" + this.n + "', mCount=" + this.f43480a + ", mSortOrder=" + this.k + ", mReadType=" + this.m + ", mDeviceUuid='" + this.f + "', mConstantsKeys=" + this.f43482c + ", mSequenceDataType=" + this.l + ", mAggregateType='" + this.e + "', mGroupUnitSize=" + this.i + ", mGroupUnitType=" + this.h + ", mDataFilter='" + this.f43481b + "', mSubTypes=" + this.t + '}';
    }
}
