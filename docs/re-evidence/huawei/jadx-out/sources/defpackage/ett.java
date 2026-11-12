package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class ett {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cardType")
    private int f33479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cardId")
    private long f33480c;

    @SerializedName("cardSize")
    private int e;

    public long c() {
        return this.f33480c;
    }

    public void e(long j) {
        this.f33480c = j;
    }

    public void c(int i) {
        this.f33479b = i;
    }

    public void e(int i) {
        this.e = i;
    }

    public boolean e() {
        return this.f33479b == 1;
    }

    public String toString() {
        return "FaForm{mId=" + this.f33480c + ", mType=" + this.f33479b + ", mCardSize=" + this.e + '}';
    }
}
