package defpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes43.dex */
public class wpv {
    public static final wpv d = new wpv("no_match", Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("min_version")
    @Expose
    private int f52335a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("max_version")
    @Expose
    private int f52336c;

    @SerializedName("feature_name")
    @Expose
    private String e;

    wpv(String str, int i, int i2) {
        this.e = str;
        this.f52335a = i;
        this.f52336c = i2;
    }
}
