package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class pds implements Serializable, Cloneable {
    private static final long serialVersionUID = 5664805502014025933L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f45206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("picture")
    private String f45207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("duration")
    private long f45208c;

    @SerializedName("durationMan")
    private long d;

    @SerializedName("id")
    private String e;

    public String d() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String b() {
        return this.f45206a;
    }

    public void a(String str) {
        this.f45206a = str;
    }

    public String c() {
        return this.f45207b;
    }

    public long e() {
        if (ied.e() == 0) {
            long j = this.d;
            if (j != 0) {
                return j;
            }
        }
        return this.f45208c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
