package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gxz implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mBitmapId")
    private int f36212a;

    @SerializedName("mWatermarkId")
    private int e;

    public void a(int i) {
        this.e = i;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        this.f36212a = i;
    }

    public int e() {
        return this.f36212a;
    }
}
