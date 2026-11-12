package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class gwd extends ayx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isWakeupFeel")
    private boolean f36129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("isSleepRemind")
    private boolean f36130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isThreshold")
    private boolean f36131c;

    @SerializedName("maxRecordHour")
    private int d;

    @SerializedName("enableRecord")
    private boolean e;

    @SerializedName("sleepMinute")
    private int f;

    @SerializedName("sleepHour")
    private int i;

    @SerializedName("thresholdSize")
    private int j;

    private gwd() {
        this.i = 23;
        this.e = true;
        this.d = 10;
        this.f36131c = false;
        this.j = 100;
        this.f36130b = true;
        this.f36129a = true;
    }

    public gwd(int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.i = 23;
        this.e = true;
        this.d = 10;
        this.f36131c = false;
        this.j = 100;
        this.f36130b = true;
        this.f36129a = true;
    }

    public int l() {
        return this.f;
    }

    public void e(int i) {
        this.f = i;
    }

    public int i() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public boolean n() {
        return this.e;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public int g() {
        return this.d;
    }

    public boolean m() {
        return this.f36131c;
    }

    public int k() {
        return this.j;
    }

    public boolean o() {
        return this.f36130b;
    }

    public void a(boolean z) {
        this.f36130b = z;
    }

    public boolean r() {
        return this.f36129a;
    }
}
