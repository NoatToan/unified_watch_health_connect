package defpackage;

import org.ahocorasick.interval.Intervalable;

/* JADX INFO: loaded from: classes20.dex */
public class zul extends zuj implements Intervalable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54580b;

    public zul(int i, int i2, String str) {
        super(i, i2);
        this.f54580b = str;
    }

    public String c() {
        return this.f54580b;
    }

    @Override // defpackage.zuj
    public String toString() {
        return super.toString() + "=" + this.f54580b;
    }
}
