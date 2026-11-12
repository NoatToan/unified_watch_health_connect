package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class qon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cityName")
    String f46565a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("detailAddress")
    String f46566c;

    @SerializedName("cityCenterLatLng")
    qol e;

    public String c() {
        return this.f46565a;
    }

    public void b(String str) {
        this.f46565a = str;
    }

    public String b() {
        return this.f46566c;
    }

    public void d(String str) {
        this.f46566c = str;
    }

    public qol a() {
        return this.e;
    }

    public void e(qol qolVar) {
        this.e = qolVar;
    }
}
