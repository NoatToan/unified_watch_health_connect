package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class cvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f31416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recordName")
    private String f31417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("examinationInstitution")
    private String f31418c;

    @SerializedName("examinationReport")
    private String d;

    @SerializedName("extendData")
    private String e;

    @SerializedName("remarks")
    private String j;

    public void a(String str) {
        this.f31417b = str;
    }

    public String b() {
        return this.f31417b;
    }

    public String c() {
        return this.f31416a;
    }

    public void c(String str) {
        this.f31416a = str;
    }

    public void f(String str) {
        this.j = str;
    }

    public String j() {
        return this.j;
    }

    public String d() {
        return this.f31418c;
    }

    public void b(String str) {
        this.f31418c = str;
    }

    public String a() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }
}
