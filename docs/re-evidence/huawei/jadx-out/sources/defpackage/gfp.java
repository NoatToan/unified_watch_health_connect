package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes29.dex */
public class gfp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("coordinate")
    private String f35034b;

    @SerializedName("lat")
    private double d;

    @SerializedName("lon")
    private double e;

    public void a(String str) {
        this.f35034b = str;
    }

    public void a(double d) {
        this.e = d;
    }

    public void c(double d) {
        this.d = d;
    }
}
