package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gwi implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("trans")
    private int f36137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("val")
    private int f36138c;

    public void a(int i) {
        this.f36138c = i;
    }

    public int d() {
        return this.f36138c;
    }

    public void b(int i) {
        this.f36137b = i;
    }

    public int a() {
        return this.f36137b;
    }

    public String toString() {
        return "{\"DailyFactorDescInput\": {\"val\":" + this.f36138c + ", \"trans\":" + this.f36137b + "}}";
    }
}
