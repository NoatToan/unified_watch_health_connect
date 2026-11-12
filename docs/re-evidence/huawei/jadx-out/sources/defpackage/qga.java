package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class qga extends qek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("scheduleEndDay")
    private int f46151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f46152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("includeResult")
    private boolean f46153c;

    @SerializedName("scheduleStartDay")
    private int d;

    @SerializedName("planId")
    private String e;

    @SerializedName("type")
    private int j;

    public String b() {
        return this.e;
    }

    public String a() {
        return this.f46152b;
    }

    public boolean c() {
        return this.f46153c;
    }

    public Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("timeZone", this.f46152b);
        return map;
    }

    @Override // defpackage.qek, com.huawei.networkclient.IRequest
    public String getUrl() {
        return super.getUrl() + "plans/" + this.e + "/tasks?";
    }

    @Override // defpackage.qek
    public String toString() {
        return "QueryTaskReq{planId='" + this.e + ", timeZone='" + this.f46152b + ", type=" + this.j + ", scheduleStartDay=" + this.d + ", scheduleEndDay=" + this.f46151a + ", isIncludeResult=" + this.f46153c + '}';
    }
}
