package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class cm9 implements jx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5480a;

    public cm9(long j) {
        this.f5480a = j;
    }

    @Override // defpackage.jx1
    public boolean c(File file) {
        return file.length() > this.f5480a;
    }
}
