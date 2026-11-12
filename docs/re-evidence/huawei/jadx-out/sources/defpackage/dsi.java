package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class dsi implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("updateLog")
    private String f32315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fileSize")
    private long f32316c;

    @SerializedName("versionId")
    private String e;

    public void d(String str) {
        this.e = str;
    }

    public void c(long j) {
        this.f32316c = j;
    }

    public void b(String str) {
        this.f32315b = str;
    }
}
