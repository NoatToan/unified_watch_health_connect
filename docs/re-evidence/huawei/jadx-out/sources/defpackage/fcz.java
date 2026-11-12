package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f33867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("duration")
    private int f33868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f33869c;

    @SerializedName("resultType")
    private int j;

    @SerializedName("isFromCloud")
    private boolean e = false;

    @SerializedName("fileList")
    private List<fcw> d = new ArrayList(0);

    public int c() {
        return this.f33869c;
    }

    public boolean b() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public List<fcw> a() {
        return this.d;
    }
}
