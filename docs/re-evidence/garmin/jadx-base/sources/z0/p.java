package z0;

import com.google.auto.value.AutoValue;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f200703b;

    @AutoValue
    public static abstract class a extends s.a {
        public abstract File b();
    }

    public p(a aVar) {
        super(aVar);
        this.f200703b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return this.f200703b.equals(((p) obj).f200703b);
    }

    public final int hashCode() {
        return this.f200703b.hashCode();
    }

    public final String toString() {
        return this.f200703b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
