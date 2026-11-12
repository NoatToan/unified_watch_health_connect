package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class iod implements Serializable {
    private static final long serialVersionUID = 6945617213218402229L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fromSystem")
    private boolean f37899a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    private String f37900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("phoneNumber")
    private String f37901c;

    @SerializedName("contactVersion")
    private String d;

    @SerializedName("uri")
    private String e;

    public String a() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String d() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public boolean c() {
        return this.f37899a;
    }

    public void b(boolean z) {
        this.f37899a = z;
    }

    public String e() {
        return this.f37900b;
    }

    public void e(String str) {
        this.f37900b = str;
    }

    public String b() {
        return this.f37901c;
    }

    public void d(String str) {
        this.f37901c = str;
    }

    public String toString() {
        return "ContactInfo{uri='" + this.e + "', contactVersion='" + this.d + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iod iodVar = (iod) obj;
        return this.d.equals(iodVar.d) && Objects.equals(this.e, iodVar.e);
    }

    public int hashCode() {
        return Objects.hash(this.e, this.d);
    }
}
