package com.xiaomi.fitness.common.extensions;

import com.xiaomi.fitness.common.log.Logger;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"closeSilently", "", "", "closeables", "", "Ljava/io/Closeable;", "(Ljava/lang/Object;[Ljava/io/Closeable;)V", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IOExtKt {
    public static final void closeSilently(@NotNull Object obj, @NotNull Closeable... closeables) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        if (closeables.length == 0) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    Logger.w(closeable + " close failed " + e, new Object[0]);
                }
            }
        }
    }
}
