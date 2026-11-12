package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sfe extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f33587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33588b;

    public sfe(InputStream inputStream, int i) {
        this.f33587a = inputStream;
        this.f33588b = i;
    }

    public int a() {
        return this.f33588b;
    }

    public void b(boolean z) {
        InputStream inputStream = this.f33587a;
        if (inputStream instanceof l7d) {
            ((l7d) inputStream).d(z);
        }
    }
}
