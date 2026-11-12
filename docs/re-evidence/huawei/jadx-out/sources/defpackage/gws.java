package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class gws {

    @SerializedName("monthlyDailyAdvices")
    private List<gwp> d;

    @SerializedName("monthlyDailyTasks")
    private List<List<gwx>> e;

    public List<gwp> b() {
        return this.d;
    }

    public List<List<gwx>> a() {
        return this.e;
    }
}
