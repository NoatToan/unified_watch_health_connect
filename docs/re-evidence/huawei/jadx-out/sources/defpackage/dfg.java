package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public class dfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("systemLanguage")
    private String f31732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("systemTimeZone")
    private String f31733b;

    public String c() {
        return this.f31733b;
    }

    public void c(String str) {
        this.f31733b = str;
    }

    public String e() {
        return this.f31732a;
    }

    public void e(String str) {
        this.f31732a = str;
    }
}
