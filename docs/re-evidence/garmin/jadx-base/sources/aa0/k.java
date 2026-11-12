package aa0;

import java.io.File;
import java.util.zip.ZipEntry;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Laa0/k;", "", "Ljava/util/zip/ZipEntry;", "entry", "Ljava/io/File;", "output", "<init>", "(Ljava/util/zip/ZipEntry;Ljava/io/File;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZipEntry f2216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2217b;

    public k(ZipEntry zipEntry, File file) {
        zipEntry.getClass();
        file.getClass();
        this.f2216a = zipEntry;
        this.f2217b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2216a.equals(kVar.f2216a) && this.f2217b.equals(kVar.f2217b);
    }

    public final int hashCode() {
        return this.f2217b.hashCode() + (this.f2216a.hashCode() * 31);
    }

    public final String toString() {
        return "ZipIO(entry=" + this.f2216a + ", output=" + this.f2217b + ")";
    }
}
