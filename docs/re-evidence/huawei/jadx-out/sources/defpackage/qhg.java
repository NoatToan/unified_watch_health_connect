package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class qhg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("modify_timestamp")
    private long f46233c;

    @SerializedName("switch")
    private String d;

    public long a() {
        return this.f46233c;
    }

    public void b(long j) {
        this.f46233c = j;
    }

    public String d() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qhg)) {
            return false;
        }
        qhg qhgVar = (qhg) obj;
        return Objects.equals(this.d, qhgVar.d) && qhgVar.f46233c == this.f46233c;
    }

    public int hashCode() {
        return Objects.hash(this.d, Long.valueOf(this.f46233c));
    }

    public String toString() {
        return "SportSwitchBean{mModifiedTime='" + this.f46233c + "', mSwitch=" + this.d + '}';
    }
}
