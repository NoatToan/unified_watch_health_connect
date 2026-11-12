package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class gwf implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("advice_code")
    private String f36132a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("advice_id")
    private int f36133c;

    @SerializedName("advice_type")
    private int d;

    public void c(int i) {
        this.f36133c = i;
    }

    public int a() {
        return this.f36133c;
    }

    public void b(int i) {
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public void b(String str) {
        this.f36132a = str;
    }

    public String e() {
        return this.f36132a;
    }

    public String toString() {
        return "{\"DailyAdvice\": {\"adviceId\":" + this.f36133c + ", \"adviceType\":" + this.d + ", \"adviceCode\": \"" + this.f36132a + "\"}}";
    }
}
