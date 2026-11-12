package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class gwm implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("task_num")
    private int f36143b;

    @SerializedName("task_time")
    private int d;

    public void d(int i) {
        this.f36143b = i;
    }

    public int d() {
        return this.f36143b;
    }

    public void c(int i) {
        this.d = i;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "{\"DailyTaskCard\": {\"taskNum\":" + this.f36143b + ", \"taskTime\":" + this.d + "}}";
    }
}
