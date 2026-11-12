package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public class gwn implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("task_code")
    private String f36144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("daily_task_card")
    private gwm f36145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("task_type")
    private int f36146c;

    @SerializedName("task_id")
    private int e;

    public void c(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    public void e(int i) {
        this.f36146c = i;
    }

    public int b() {
        return this.f36146c;
    }

    public void c(String str) {
        this.f36144a = str;
    }

    public String c() {
        return this.f36144a;
    }

    public void d(gwm gwmVar) {
        this.f36145b = gwmVar;
    }

    public gwm e() {
        return this.f36145b;
    }

    public String toString() {
        return "{\"DailyTask\": {\"taskId\":" + this.e + ", \"taskType\":" + this.f36146c + ", \"taskCode\": \"" + this.f36144a + "\", \"dailyTaskCard\":" + this.f36145b + "}}";
    }
}
