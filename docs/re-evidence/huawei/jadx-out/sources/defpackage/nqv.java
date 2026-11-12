package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("appId")
    private String f43488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("appBundleName")
    private String f43489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataSourceId")
    private String f43490c;

    @SerializedName("dataSourceFilter")
    private c d;

    @SerializedName("deviceUniqueId")
    private String e;

    public String b() {
        return this.f43490c;
    }

    public String d() {
        return this.e;
    }

    public String c() {
        return this.f43489b;
    }

    public c a() {
        return this.d;
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("dataType")
        private List<DataType> f43491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("endTime")
        private long f43492c;

        @SerializedName("startTime")
        private long e;

        public long d() {
            return this.e;
        }

        public long b() {
            return this.f43492c;
        }

        public List<DataType> e() {
            return this.f43491b;
        }
    }

    public String toString() {
        return "DataSourceOptions{mDataSourceId='" + this.f43490c + "', mDeviceUniqueId='" + this.e + "', mAppBundleName='" + this.f43489b + "', mAppId='" + this.f43488a + "'}";
    }
}
