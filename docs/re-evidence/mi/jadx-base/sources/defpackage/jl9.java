package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class jl9 implements ej2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f22903a;

    public jl9(File file) {
        this.f22903a = (File) b6i.g(file);
    }

    public static jl9 b(File file) {
        if (file != null) {
            return new jl9(file);
        }
        return null;
    }

    @Override // defpackage.ej2
    public InputStream a() throws IOException {
        return new FileInputStream(this.f22903a);
    }

    public File c() {
        return this.f22903a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof jl9)) {
            return false;
        }
        return this.f22903a.equals(((jl9) obj).f22903a);
    }

    public int hashCode() {
        return this.f22903a.hashCode();
    }

    @Override // defpackage.ej2
    public long size() {
        return this.f22903a.length();
    }
}
