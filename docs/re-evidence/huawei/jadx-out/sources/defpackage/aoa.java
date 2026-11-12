package defpackage;

import com.google.common.escape.ElementTypesAreNonnullByDefault;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<char[]> f616a = new ThreadLocal<char[]>() { // from class: aoa.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    };

    public static char[] e() {
        return (char[]) Objects.requireNonNull(f616a.get());
    }
}
