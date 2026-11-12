package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qee {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f46053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("highlights")
    private qdw f46054c;

    @SerializedName("dayRemains")
    private List<qdu> d = new ArrayList();

    @SerializedName("indexCard")
    private qdz e;

    public qdw a() {
        return this.f46054c;
    }

    public qdz b() {
        return this.e;
    }

    public List<qdu> d() {
        return this.d;
    }

    public String toString() {
        return "SummaryResponse{mResultCode=" + this.f46053b + ", mHighlights=" + this.f46054c + ", indexCard=" + this.e + ", dayRemains=" + this.d + '}';
    }
}
