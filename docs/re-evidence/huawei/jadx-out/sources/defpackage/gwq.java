package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes31.dex */
public class gwq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("task_type")
    private int f36151a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("task_id")
    private int f36152c;

    @SerializedName("daily_task_card")
    private gwm d;

    @SerializedName("task_code")
    private String e;

    public int a() {
        return this.f36152c;
    }

    public int c() {
        return this.f36151a;
    }

    public String e() {
        return this.e;
    }

    public gwm d() {
        return this.d;
    }
}
