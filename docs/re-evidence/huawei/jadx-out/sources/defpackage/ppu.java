package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class ppu implements Serializable {
    private static final long serialVersionUID = 5896619171447527539L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("supportArV2")
    private int f45784a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private String f45785c;

    @SerializedName("model")
    private List<String> e;

    public String a() {
        return this.f45785c;
    }

    public List<String> b() {
        return this.e;
    }

    public void d(int i) {
        this.f45784a = i;
    }
}
