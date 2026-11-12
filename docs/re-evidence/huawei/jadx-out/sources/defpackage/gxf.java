package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes31.dex */
public class gxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("task_prob")
    private String f36187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("task_id")
    private int f36188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("task_code")
    private String f36189c;

    @SerializedName("daily_task_card")
    private gwm d;

    @SerializedName("task_type")
    private int e;

    public void d(int i) {
        this.f36188b = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void d(String str) {
        this.f36189c = str;
    }

    public void b(gwm gwmVar) {
        this.d = gwmVar;
    }
}
