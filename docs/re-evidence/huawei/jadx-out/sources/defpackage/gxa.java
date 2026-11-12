package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class gxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("user_info")
    private gxg f36175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sleep_info")
    private List<gwz> f36176b;

    @SerializedName("identifier")
    private int d;

    @SerializedName("questionnaire")
    private List<gwy> e;

    public void b(int i) {
        this.d = i;
    }

    public void a(List<gwz> list) {
        this.f36176b = list;
    }

    public void e(gxg gxgVar) {
        this.f36175a = gxgVar;
    }

    public void d(List<gwy> list) {
        this.e = list;
    }
}
