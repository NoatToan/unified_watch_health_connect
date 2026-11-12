package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class cmu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1800a = -32768;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("scanType")
    private int f1801b;

    @SerializedName("rssi")
    public int d() {
        return this.f1800a;
    }

    public void a(int i) {
        this.f1800a = i;
    }

    public int c() {
        return this.f1801b;
    }

    public void e(int i) {
        this.f1801b = i;
    }
}
