package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class vhc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("id")
    private int f51091c = 0;

    @SerializedName("setting")
    private vhi d;

    public vhc(vhi vhiVar) {
        this.d = vhiVar;
    }

    public int a() {
        return this.f51091c;
    }

    public vhi d() {
        return this.d;
    }

    public String toString() {
        return "FastingLiteMode{mId=" + this.f51091c + ", mSetting=" + this.d + '}';
    }
}
