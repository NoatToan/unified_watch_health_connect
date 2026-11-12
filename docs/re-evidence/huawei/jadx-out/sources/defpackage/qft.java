package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qft extends qet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f46134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("successSnapshotIds")
    private List<String> f46135b;

    @SerializedName("failedSnapshotIds")
    private List<String> d;

    public String b() {
        return this.f46134a;
    }

    public List<String> d() {
        return this.f46135b;
    }

    public List<String> c() {
        return this.d;
    }
}
