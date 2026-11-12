package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class jwb implements Serializable {
    private static final long serialVersionUID = 484486622498584045L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("spIntervalKm")
    private int f39132c;

    @SerializedName("spKey")
    private String d;

    public jwb(String str, int i) {
        this.d = str;
        this.f39132c = i;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.f39132c;
    }

    public void b(int i) {
        this.f39132c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.d, ((jwb) obj).d);
    }

    public int hashCode() {
        return Objects.hash(this.d, Integer.valueOf(this.f39132c));
    }
}
