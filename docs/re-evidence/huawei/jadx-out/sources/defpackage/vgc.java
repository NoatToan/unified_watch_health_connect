package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("kiloCalorie")
    private float f51059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("whichMeal")
    private int f51060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("eatTime")
    private long f51061c;

    @SerializedName("sugRange")
    private int[] d;

    @SerializedName("hasFood")
    private boolean e;

    public vgc(int i, long j, float f, int[] iArr) {
        this.f51060b = i;
        this.f51061c = j;
        this.f51059a = f;
        this.d = iArr;
    }

    public int d() {
        return this.f51060b;
    }

    public long a() {
        return this.f51061c;
    }

    public void a(boolean z) {
        this.e = z;
    }
}
