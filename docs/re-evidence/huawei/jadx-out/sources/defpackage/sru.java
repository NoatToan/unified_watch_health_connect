package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class sru {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cacheTime")
    protected long f48577b;

    public long e() {
        return this.f48577b;
    }

    public void a(long j) {
        this.f48577b = j;
    }

    public boolean d() {
        return this.f48577b != 0;
    }
}
