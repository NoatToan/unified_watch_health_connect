package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwr extends bwi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("stats")
    private List<fff> f1257b;

    public List<fff> d() {
        return this.f1257b;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelStatResponse{mStats=" + this.f1257b + "}";
    }
}
