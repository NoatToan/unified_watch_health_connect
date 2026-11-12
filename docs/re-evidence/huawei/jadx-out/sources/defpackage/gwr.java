package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes31.dex */
public class gwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("taskNum")
    private int f36153a;

    @SerializedName("taskTime")
    private int e;

    public int a() {
        return this.f36153a;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return "{\"DailyTaskCard\": {\"taskNum\":" + this.f36153a + ", \"taskTime\":" + this.e + "}}";
    }
}
