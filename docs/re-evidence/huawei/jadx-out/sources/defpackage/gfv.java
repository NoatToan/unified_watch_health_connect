package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    private String f35044a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("guideText")
    private String f35045c;

    @SerializedName("showLock")
    private boolean d;

    @SerializedName("buttons")
    private List<gfs> e;

    public String e() {
        return this.f35045c;
    }

    public List<gfs> a() {
        return this.e;
    }
}
