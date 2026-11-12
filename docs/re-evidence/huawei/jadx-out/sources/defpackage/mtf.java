package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mtf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("operation")
    private int f42394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("minor")
    private long f42395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("major")
    private String f42396c;

    @SerializedName("sortLetter")
    private String d;

    @SerializedName("contactsList")
    private List<msw> e;

    public void e(String str) {
        this.f42396c = str;
    }

    public void e(long j) {
        this.f42395b = j;
    }

    public void a(int i) {
        this.f42394a = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public void c(List<msw> list) {
        this.e = list;
    }
}
