package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public interface m4q {
    static <T extends m4q> T a(T[] tArr, int i) {
        Objects.requireNonNull(tArr);
        for (T t : tArr) {
            if (t.getType() == i) {
                return t;
            }
        }
        throw new IllegalArgumentException("invalid type");
    }

    default int getType() {
        return 0;
    }
}
