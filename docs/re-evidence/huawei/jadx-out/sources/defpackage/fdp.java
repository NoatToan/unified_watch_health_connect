package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fdp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("myhuawei")
    private d f33905c;

    @SerializedName("version")
    private int d;

    public int d() {
        return this.d;
    }

    public d a() {
        return this.f33905c;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("myhuawei_country_list")
        private List<String> f33906a;

        @SerializedName("abroad_country_list")
        private Map<String, String> d;

        public Map<String, String> e() {
            return this.d;
        }

        public List<String> c() {
            return this.f33906a;
        }

        public String toString() {
            return "MyHuaweiData{abroadCountryList=" + this.d + ", myHuaweiCountryList=" + this.f33906a + '}';
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyHuaweiFileInfo{version=");
        sb.append(this.d);
        sb.append(", myHuaweiData=");
        d dVar = this.f33905c;
        sb.append(dVar == null ? Constants.NULL : dVar.toString());
        sb.append('}');
        return sb.toString();
    }
}
