package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class nrg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("min")
    private Object f43523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("count")
    private Object f43524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sum")
    private Object f43525c;

    @SerializedName("max")
    private Object d;

    @SerializedName("avg")
    private Object e;

    public void a(Object obj) {
        this.e = obj;
    }

    public void e(Object obj) {
        this.d = obj;
    }

    public void c(Object obj) {
        this.f43523a = obj;
    }

    public void b(Object obj) {
        this.f43525c = obj;
    }

    public void d(Object obj) {
        this.f43524b = obj;
    }
}
