package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ams {
    @ParametricNullness
    public static <T> T c() {
        return null;
    }

    @ParametricNullness
    public static <T> T e(@CheckForNull T t) {
        return t;
    }
}
