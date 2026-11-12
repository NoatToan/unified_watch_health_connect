package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class qer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int f46069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("progress")
    private Map<String, Integer> f46070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private long f46071c;

    @SerializedName("timeZone")
    private String d;

    @SerializedName("createTime")
    private long e;

    public Map<String, Integer> a() {
        return this.f46070b;
    }

    public void a(Map<String, Integer> map) {
        this.f46070b = map;
    }

    public String toString() {
        return "StatusInfo{progress=" + this.f46070b + ", version=" + this.f46071c + ", createTime=" + this.e + ", recordDay=" + this.f46069a + ", timeZone='" + this.d + '}';
    }
}
