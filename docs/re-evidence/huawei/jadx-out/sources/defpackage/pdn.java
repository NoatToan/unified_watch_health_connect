package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pdn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private int f45198b;

    @SerializedName("allPlans")
    private List<pcp> e;

    public List<pcp> a() {
        return this.e;
    }
}
