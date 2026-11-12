package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class qfn extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("startDay")
    private Integer f46121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("planId")
    private String f46122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endDay")
    private Integer f46123c;

    @SerializedName("timeZone")
    private String d;

    @SerializedName("day")
    private int e;

    public qfn() {
    }

    public qfn(String str, int i, String str2) {
        this.f46122b = str;
        this.e = i;
        this.d = str2;
    }

    public String a() {
        return this.f46122b;
    }

    public void a(String str) {
        this.f46122b = str;
    }

    public int b() {
        return this.e;
    }

    public Integer g() {
        return this.f46121a;
    }

    public Integer d() {
        return this.f46123c;
    }

    public String f() {
        return this.d;
    }

    public Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("day", String.valueOf(this.e));
        map.put("timeZone", this.d);
        return map;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans/" + this.f46122b + "/schedules";
    }

    @Override // defpackage.qek
    public String toString() {
        return "QuerySchedulesReq{" + super.toString() + ",planId='" + this.f46122b + ", day=" + this.e + ", startDay=" + this.f46121a + ", endDay=" + this.f46123c + ", timeZone='" + this.d + '}';
    }
}
