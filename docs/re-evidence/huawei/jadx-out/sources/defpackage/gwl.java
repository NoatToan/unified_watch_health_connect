package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class gwl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("isUpdated")
    private boolean f36142b;

    @SerializedName("result")
    private Map<String, Object> e;

    public Map<String, Object> e() {
        return this.e;
    }

    public void b(Map<String, Object> map) {
        this.e = map;
    }

    public boolean c() {
        return this.f36142b;
    }

    public void a(boolean z) {
        this.f36142b = z;
    }
}
