package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes20.dex */
public class xnl extends xnn {
    public xms e;
    public String g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53201b = -99;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("returnDesc")
    private String f53200a = null;

    public void d(String str) {
        this.g = str;
    }

    public String a() {
        return this.f53200a;
    }

    public void c(String str) {
        this.f53200a = str;
    }

    public void a(int i) {
        this.f53201b = i;
    }
}
