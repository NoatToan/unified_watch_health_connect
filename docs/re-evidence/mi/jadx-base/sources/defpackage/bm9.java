package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class bm9 extends c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4363b;

    public bm9(long j, int i) {
        this.f4362a = j;
        this.f4363b = i;
    }

    @Override // defpackage.ix1
    public int b() {
        return this.f4363b;
    }

    @Override // defpackage.jx1
    public boolean c(File file) {
        return file.length() > this.f4362a;
    }
}
