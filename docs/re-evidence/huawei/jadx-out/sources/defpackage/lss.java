package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class lss {
    public static <T> void a(T t, Consumer<T> consumer) {
        if (t != null) {
            consumer.accept(t);
        }
    }
}
