package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes28.dex */
public class fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("version")
    private int f33961a;

    @SerializedName(ParsedFieldTag.RECORD_DAY)
    private int e;

    public int e() {
        return this.e;
    }

    public int a() {
        return this.f33961a;
    }

    public void d(int i) {
        this.e = i;
    }

    public void b(int i) {
        this.f33961a = i;
    }

    public String toString() {
        return "HealthLifeVersionDTO{mRecordDay=" + this.e + ", mVersion=" + this.f33961a + '}';
    }
}
