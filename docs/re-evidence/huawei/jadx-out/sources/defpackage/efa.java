package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes27.dex */
public class efa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("unit")
    private String f32864a;

    @SerializedName("unitValue")
    private int d;

    public String a() {
        return this.f32864a;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return "ExtensionUnit{mUnit=" + this.f32864a + ", mUnitValue=" + this.d + '}';
    }
}
