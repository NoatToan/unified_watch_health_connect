package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ks5 extends ms5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24252b;
    public final int c;
    public final boolean d;

    public ks5(int i, String str) {
        super(i);
        this.f24252b = str;
        this.d = false;
        this.c = 0;
    }

    public String b() {
        return this.f24252b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public ks5(int i, String str, int i2) {
        super(i);
        this.d = true;
        this.c = i2;
        this.f24252b = str;
    }
}
