package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class inz extends qle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("labelName")
    private String f37886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("userDisable")
    private int f37887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("serviceId")
    private int f37888c;

    @SerializedName("labelDisplayName")
    private String d;

    public inz() {
    }

    public inz(int i, String str, String str2, int i2) {
        this.f37888c = i;
        this.f37886a = str;
        this.d = str2;
        this.f37887b = i2;
    }

    public int b() {
        return this.f37888c;
    }

    public String d() {
        return this.f37886a;
    }

    public String a() {
        return this.d;
    }

    public int c() {
        return this.f37887b;
    }

    public void a(int i) {
        this.f37887b = i;
    }

    @Override // defpackage.qle
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inz)) {
            return false;
        }
        inz inzVar = (inz) obj;
        return this.f37888c == inzVar.f37888c && Objects.equals(this.f37886a, inzVar.f37886a) && Objects.equals(this.d, inzVar.d);
    }

    public int hashCode() {
        int i = this.f37888c;
        return Objects.hash(Integer.valueOf(i), this.f37886a, this.d);
    }
}
