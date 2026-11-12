package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes31.dex */
public class gwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("advice_type")
    private int f36139a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("advice_code")
    private String f36140c;

    @SerializedName("advice_id")
    private int e;

    public void b(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.f36139a = i;
    }

    public void d(String str) {
        this.f36140c = str;
    }
}
