package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gwk implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("trans")
    private int f36141a;

    @SerializedName("val")
    private int d;

    public void a(int i) {
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    public void b(int i) {
        this.f36141a = i;
    }

    public int a() {
        return this.f36141a;
    }

    public String toString() {
        return "{\"DailyProblemDescInput\": {\"val\":" + this.d + ", \"trans\":" + this.f36141a + "}}";
    }
}
