package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwonesdk.datastructure.request.DataType;

/* JADX INFO: loaded from: classes11.dex */
public class nrj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f43533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataType")
    private DataType f43534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endLocalDate")
    private String f43535c;

    @SerializedName("modifiedTime")
    private long d;

    @SerializedName("startLocalDate")
    private String e;

    @SerializedName("timeZone")
    private String h;

    @SerializedName("subUser")
    private String i;

    @SerializedName("startTime")
    private long j;

    public DataType a() {
        return this.f43534b;
    }

    public long f() {
        return this.j;
    }

    public long e() {
        return this.f43533a;
    }

    public String i() {
        return this.h;
    }

    public long c() {
        return this.d;
    }

    public String toString() {
        return "SampleDataBase{dataType=" + this.f43534b + ", startLocalDate='" + this.e + "', endLocalDate='" + this.f43535c + "', startTime=" + this.j + ", endTime=" + this.f43533a + ", timeZone='" + this.h + "', modifiedTime=" + this.d + ", subUser='" + this.i + "'}";
    }
}
