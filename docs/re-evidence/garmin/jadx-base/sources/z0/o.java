package z0;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f200700b;

    @AutoValue
    public static abstract class a extends s.a {
    }

    public o(a aVar) {
        super(aVar);
        this.f200700b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f200700b.equals(((o) obj).f200700b);
    }

    public final int hashCode() {
        return this.f200700b.hashCode();
    }

    public final String toString() {
        return this.f200700b.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
