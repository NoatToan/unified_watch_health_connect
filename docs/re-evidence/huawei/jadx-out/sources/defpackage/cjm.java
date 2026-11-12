package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class cjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    public String f1630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("uuid")
    public String f1631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceType")
    public String f1632c;

    @SerializedName("h5EntryDefaultImg")
    public String d;

    @SerializedName("bluetoothType")
    public String e;

    @SerializedName("versionInfo")
    public cjq g;

    @SerializedName("kindId")
    public String h;

    public void b(String str) {
        this.f1630a = str;
    }

    public void d(String str) {
        this.f1631b = str;
    }

    public void j(String str) {
        this.h = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.f1632c = str;
    }

    public void a(cjq cjqVar) {
        this.g = cjqVar;
    }

    public void c(String str) {
        this.d = str;
    }
}
