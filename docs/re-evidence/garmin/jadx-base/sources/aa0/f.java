package aa0;

import e23.l;
import i3.e5;
import java.io.File;
import java.util.zip.ZipEntry;
import k80.n;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f2207b;

    public /* synthetic */ f(File file, int i14) {
        this.f2206a = i14;
        this.f2207b = file;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f2206a;
        File file = this.f2207b;
        ZipEntry zipEntry = (ZipEntry) obj;
        switch (i14) {
            case 0:
                int i15 = g.f2208c;
                return new k(zipEntry, new File(e5.g(file.getAbsolutePath(), File.separator, zipEntry.getName())));
            default:
                int i16 = k80.a.f103330g;
                return new n(zipEntry, new File(e5.g(file.getAbsolutePath(), File.separator, zipEntry.getName())));
        }
    }
}
