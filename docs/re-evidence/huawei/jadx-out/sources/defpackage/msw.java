package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class msw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("phoneList")
    private List<msx> f42360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    private String f42361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sortKey")
    private String f42362c;

    @SerializedName("uuid")
    private String d;

    @SerializedName("sortLetter")
    private String e;

    public void e(String str) {
        this.f42361b = str;
    }

    public void d(String str) {
        this.f42362c = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public void b(List<msx> list) {
        this.f42360a = list;
    }

    public void c(String str) {
        this.e = str;
    }
}
