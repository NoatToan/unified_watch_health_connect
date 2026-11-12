package z0;

import android.content.ContentValues;
import android.net.Uri;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f200706b;

    @AutoValue
    public static abstract class a extends s.a {
        public abstract Uri b();
    }

    static {
        new ContentValues();
    }

    public r(a aVar) {
        super(aVar);
        this.f200706b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f200706b.equals(((r) obj).f200706b);
    }

    public final int hashCode() {
        return this.f200706b.hashCode();
    }

    public final String toString() {
        return this.f200706b.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}
