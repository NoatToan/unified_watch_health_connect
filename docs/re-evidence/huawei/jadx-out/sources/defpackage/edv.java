package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class edv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("product_type")
    private int f32817a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("direct_model")
    private List<String> f32818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("uuid")
    private String f32819c;

    public String c() {
        return this.f32819c;
    }

    public int b() {
        return this.f32817a;
    }

    public List<String> e() {
        return this.f32818b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof edv) && this.f32817a == ((edv) obj).b();
    }

    public int hashCode() {
        return this.f32817a;
    }
}
