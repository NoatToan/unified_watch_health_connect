package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class gdp implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("id")
    private int f34943c;

    @SerializedName("name")
    private String d;

    public gdp(String str, int i) {
        this.d = str;
        this.f34943c = i;
    }

    public String d() {
        String str = this.d;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f34943c;
    }

    public String toString() {
        return this.d;
    }
}
