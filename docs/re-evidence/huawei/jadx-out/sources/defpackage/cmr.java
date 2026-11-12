package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class cmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isConnectNewPhone")
    private boolean f1794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("identify")
    private String f1795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pairMode")
    private int f1796c;

    @SerializedName("isCompatibleDevice")
    private boolean d;

    @SerializedName("isUseSynergy")
    private boolean e;

    public String b() {
        return this.f1795b;
    }

    public void d(String str) {
        this.f1795b = str;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public boolean a() {
        return this.f1794a;
    }

    public void b(boolean z) {
        this.f1794a = z;
    }

    public int d() {
        return this.f1796c;
    }

    public void d(int i) {
        this.f1796c = i;
    }
}
