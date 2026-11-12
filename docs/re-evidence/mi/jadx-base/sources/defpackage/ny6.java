package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ny6 implements fy6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f28558b;

    public interface a {
        File a();
    }

    public ny6(a aVar, long j) {
        this.f28557a = j;
        this.f28558b = aVar;
    }

    @Override // fy6.a
    public fy6 build() {
        File fileA = this.f28558b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return oy6.c(fileA, this.f28557a);
        }
        return null;
    }
}
