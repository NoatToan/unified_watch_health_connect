package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes13.dex */
public class our {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timestamp")
    private long f44819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.GAIN_COUNT)
    private int f44820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.MEDAL_ID)
    private String f44821c;

    @SerializedName("gainTime")
    private String d;

    @SerializedName(ParsedFieldTag.MEDAL_TYPE)
    private String e;

    public String b() {
        return this.f44821c;
    }

    public void b(String str) {
        this.f44821c = str;
    }

    public void b(int i) {
        this.f44820b = i;
    }

    public void e(String str) {
        this.d = str;
    }

    public void b(long j) {
        this.f44819a = j;
    }

    public String a() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }
}
