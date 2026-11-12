package defpackage;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public final class jjt implements ojt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fkt f22875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f22876b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ sjt d;

    public jjt(sjt sjtVar, fkt fktVar, Set set, AtomicBoolean atomicBoolean) {
        this.d = sjtVar;
        this.f22875a = fktVar;
        this.f22876b = set;
        this.c = atomicBoolean;
    }

    @Override // defpackage.ojt
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.d.f(this.f22875a, set, new gjt(this));
    }
}
