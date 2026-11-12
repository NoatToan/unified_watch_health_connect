package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endLocalDate")
    private String f43458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("groupBy")
    private d f43459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataSourceOptions")
    private nqv f43460c;

    @SerializedName("count")
    private int d;

    @SerializedName("dataType")
    private DataType e;

    @SerializedName("subDataType")
    private List<SubDataType> f;

    @SerializedName("metrics")
    private JsonObject g;

    @SerializedName("startLocalDate")
    private String h;

    @SerializedName("sortOrder")
    private int j;

    public d e() {
        return this.f43459b;
    }

    public int b() {
        return this.d;
    }

    public List<c> f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, JsonElement> entry : this.g.entrySet()) {
            c cVar = new c();
            cVar.c(entry.getKey());
            cVar.e(entry.getValue().getAsJsonArray());
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public nqv a() {
        return this.f43460c;
    }

    public String g() {
        return this.h;
    }

    public String c() {
        return this.f43458a;
    }

    public DataType d() {
        return this.e;
    }

    public List<SubDataType> k() {
        return this.f;
    }

    public int h() {
        return this.j;
    }

    public String toString() {
        return "AggregateDataRequest{groupBy=" + this.f43459b + ", metrics=" + this.g + ", startLocalDate='" + this.h + "', endLocalDate='" + this.f43458a + "', dataType=" + this.e + ", subDataTypeList=" + this.f + ", sortOrder=" + this.j + ", dataSourceOptions=" + this.f43460c + '}';
    }

    public class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("unitType")
        private int f43464c;

        @SerializedName("duration")
        private int d;

        public int b() {
            return this.f43464c;
        }

        public int c() {
            return this.d;
        }

        public String toString() {
            return "Group{unitType=" + this.f43464c + ",unitSize=" + this.d + '}';
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f43463c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f43462b = new ArrayList();

        public c() {
        }

        public String a() {
            return this.f43461a;
        }

        public void c(String str) {
            this.f43461a = str;
        }

        public List<String> d() {
            return this.f43462b;
        }

        public List<Integer> e() {
            return this.f43463c;
        }

        public void e(JsonArray jsonArray) {
            this.f43463c.clear();
            this.f43462b.clear();
            for (JsonElement jsonElement : jsonArray) {
                this.f43463c.add(Integer.valueOf(nqk.e(jsonElement.getAsString())));
                this.f43462b.add(jsonElement.getAsString());
            }
        }

        public String toString() {
            return "Metric{key='" + this.f43461a + "', aggregateTypes=" + this.f43463c + '}';
        }
    }

    public int[] j() {
        DataType dataType = this.e;
        int i = 0;
        if (dataType == null) {
            LogUtil.e("AggregateDataRequest", "getQueryTypes: dataType is null");
            return new int[0];
        }
        int i2 = dataType.getmId();
        List<SubDataType> listK = k();
        if (njy.e(listK)) {
            LogUtil.e("AggregateDataRequest", "getQueryTypes: subDataTypeList is empty");
            return new int[0];
        }
        if (njy.e(f()) || f().get(0) == null) {
            LogUtil.e("AggregateDataRequest", "getQueryTypes: metrics is null or empty");
            return new int[0];
        }
        String strA = f().get(0).a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.e("AggregateDataRequest", "getQueryTypes: statName is empty");
            return new int[0];
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SubDataType subDataType : listK) {
            if (subDataType != null) {
                int iE = nqj.a().e(i2, subDataType.getmId(), strA);
                if (iE != 0) {
                    linkedHashSet.add(Integer.valueOf(iE));
                }
            }
        }
        int[] iArr = new int[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public int[] i() {
        DataType dataType = this.e;
        if (dataType == null) {
            LogUtil.e("AggregateDataRequest", "getHiHealthTypes: dataType is null");
            return new int[0];
        }
        int i = dataType.getmId();
        List<SubDataType> listK = k();
        if (njy.e(listK)) {
            LogUtil.e("AggregateDataRequest", "getHiHealthTypes: subDataTypeList is empty");
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        for (SubDataType subDataType : listK) {
            if (subDataType == null) {
                LogUtil.c("AggregateDataRequest", "getHiHealthTypes: skip null subDataType");
            } else {
                int i2 = subDataType.getmId();
                int iB = nqj.a().b(i, i2);
                if (iB != 0) {
                    arrayList.add(Integer.valueOf(iB));
                } else {
                    LogUtil.c("AggregateDataRequest", "getHiHealthTypes: invalid mappingId(0) for subTypeId=" + i2);
                }
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        LogUtil.b("AggregateDataRequest", "getHiHealthTypes: success, valid mappingId count=" + size);
        return iArr;
    }
}
