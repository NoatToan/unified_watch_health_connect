package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class qgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("modifiedTime")
    private long f46208a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.GOAL)
    private int f46209c;

    public long e() {
        return this.f46208a;
    }

    public void c(long j) {
        this.f46208a = j;
    }

    public int d() {
        return this.f46209c;
    }

    public void a(int i) {
        this.f46209c = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qgx)) {
            return false;
        }
        qgx qgxVar = (qgx) obj;
        return qgxVar.f46209c == this.f46209c && qgxVar.f46208a == this.f46208a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46209c), Long.valueOf(this.f46208a));
    }

    public String toString() {
        return "CircleGoalBean{mModifiedTime='" + this.f46208a + "', mGoalValue=" + this.f46209c + '}';
    }
}
