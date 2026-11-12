package defpackage;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public final class ljt implements ojt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f25142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fkt f25143b;
    public final /* synthetic */ sjt c;

    public ljt(sjt sjtVar, Set set, fkt fktVar) {
        this.c = sjtVar;
        this.f25142a = set;
        this.f25143b = fktVar;
    }

    @Override // defpackage.ojt
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.f25142a.addAll(sjt.a(this.c, set, this.f25143b, zipFile));
    }
}
