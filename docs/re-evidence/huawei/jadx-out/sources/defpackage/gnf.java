package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class gnf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f35794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("competitions")
    private List<e> f35795b;

    @SerializedName("total")
    private int d;

    @SerializedName("resultCode")
    private int e;

    public List<e> c() {
        return this.f35795b;
    }

    public List<e> b() {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(this.f35795b)) {
            for (e eVar : this.f35795b) {
                if (!lsl.z(eVar.d())) {
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        return "MyCompetitionsBean{resultCode=" + this.e + ", resultDesc='" + this.f35794a + "', total=" + this.d + ", competitions=" + this.f35795b + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnf)) {
            return false;
        }
        gnf gnfVar = (gnf) obj;
        return this.e == gnfVar.e && this.d == gnfVar.d && Objects.equals(this.f35794a, gnfVar.f35794a) && Objects.equals(this.f35795b, gnfVar.f35795b);
    }

    public int hashCode() {
        int i = this.e;
        String str = this.f35794a;
        int i2 = this.d;
        return Objects.hash(Integer.valueOf(i), str, Integer.valueOf(i2), this.f35795b);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(SocialConstants.PARAM_APP_DESC)
        private String f35801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("createTime")
        private long f35802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(DistrictSearchQuery.KEYWORDS_CITY)
        private String f35803c;

        @SerializedName("competitionId")
        private String d;

        @SerializedName("country")
        private String e;

        @SerializedName("id")
        private String f;

        @SerializedName(ParsedFieldTag.TASK_MODIFY_TIME)
        private long g;

        @SerializedName("groups")
        private List<d> h;

        @SerializedName("name")
        private String i;

        @SerializedName("eventTime")
        private long j;

        @SerializedName("source")
        private String k;

        @SerializedName("timeZone")
        private String l;

        @SerializedName(BleConstants.TOTAL_DISTANCE)
        private String m;

        @SerializedName("subType")
        private int n;

        @SerializedName("primary")
        private int o;

        @SerializedName("type")
        private int r;

        @SerializedName("unit")
        private String t;

        public String e() {
            return this.f;
        }

        public String a() {
            return this.d;
        }

        public int g() {
            return this.n;
        }

        public String b() {
            return this.i;
        }

        public long d() {
            return this.j;
        }

        public String i() {
            return this.l;
        }

        public int f() {
            return this.o;
        }

        public List<d> c() {
            return this.h;
        }

        public String toString() {
            return "Competition{id='" + this.f + "', competitionId='" + this.d + "', type=" + this.r + ", subType=" + this.n + ", name='" + this.i + "', source='" + this.k + "', eventTime=" + this.j + ", timeZone='" + this.l + "', totalDistance='" + this.m + "', unit='" + this.t + "', desc='" + this.f35801a + "', country='" + this.e + "', city='" + this.f35803c + "', primary=" + this.o + ", createTime=" + this.f35802b + ", modifyTime=" + this.g + ", groups=" + this.h + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.r == eVar.r && this.n == eVar.n && this.j == eVar.j && this.o == eVar.o && this.f35802b == eVar.f35802b && this.g == eVar.g && Objects.equals(this.f, eVar.f) && Objects.equals(this.d, eVar.d) && Objects.equals(this.i, eVar.i) && Objects.equals(this.k, eVar.k) && Objects.equals(this.l, eVar.l) && Objects.equals(this.m, eVar.m) && Objects.equals(this.t, eVar.t) && Objects.equals(this.f35801a, eVar.f35801a) && Objects.equals(this.e, eVar.e) && Objects.equals(this.f35803c, eVar.f35803c) && Objects.equals(this.h, eVar.h);
        }

        public int hashCode() {
            String str = this.f;
            String str2 = this.d;
            int i = this.r;
            int i2 = this.n;
            String str3 = this.i;
            String str4 = this.k;
            long j = this.j;
            String str5 = this.l;
            String str6 = this.m;
            String str7 = this.t;
            String str8 = this.f35801a;
            String str9 = this.e;
            String str10 = this.f35803c;
            int i3 = this.o;
            long j2 = this.f35802b;
            long j3 = this.g;
            return Objects.hash(str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3, str4, Long.valueOf(j), str5, str6, str7, str8, str9, str10, Integer.valueOf(i3), Long.valueOf(j2), Long.valueOf(j3), this.h);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("groupId")
        private String f35798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("groupType")
        private int f35799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(ComplaintConstants.GROUP_NAME_PARAM_KEY)
        private String f35800c;

        @SerializedName("id")
        private String d;

        @SerializedName(TypedValues.Custom.S_DIMENSION)
        private String e;

        @SerializedName("unit")
        private String f;

        @SerializedName("value")
        private String g;

        @SerializedName("objectiveInfos")
        private List<c> h;

        @SerializedName(ParsedFieldTag.KAKA_VALUE_TYPE)
        private String i;

        public String a() {
            return this.g;
        }

        public List<c> e() {
            return this.h;
        }

        public String toString() {
            return "Group{id='" + this.d + "', groupId='" + this.f35798a + "', groupType=" + this.f35799b + ", groupName='" + this.f35800c + "', dimension='" + this.e + "', valueType='" + this.i + "', value='" + this.g + "', unit='" + this.f + "', objectiveInfos=" + this.h + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f35799b == dVar.f35799b && Objects.equals(this.d, dVar.d) && Objects.equals(this.f35798a, dVar.f35798a) && Objects.equals(this.f35800c, dVar.f35800c) && Objects.equals(this.e, dVar.e) && Objects.equals(this.i, dVar.i) && Objects.equals(this.g, dVar.g) && Objects.equals(this.f, dVar.f) && Objects.equals(this.h, dVar.h);
        }

        public int hashCode() {
            String str = this.d;
            String str2 = this.f35798a;
            int i = this.f35799b;
            return Objects.hash(str, str2, Integer.valueOf(i), this.f35800c, this.e, this.i, this.g, this.f, this.h);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("goalValueType")
        private String f35796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("goalValue")
        private String f35797c;

        @SerializedName("objectiveType")
        private int d;

        @SerializedName("index")
        private int e;

        public String d() {
            return this.f35797c;
        }

        public String toString() {
            return "ObjectiveInfo{index=" + this.e + ", objectiveType=" + this.d + ", goalValue='" + this.f35797c + "', goalValueType='" + this.f35796b + "'}";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.e == cVar.e && this.d == cVar.d && Objects.equals(this.f35797c, cVar.f35797c) && Objects.equals(this.f35796b, cVar.f35796b);
        }

        public int hashCode() {
            int i = this.e;
            int i2 = this.d;
            return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), this.f35797c, this.f35796b);
        }
    }
}
