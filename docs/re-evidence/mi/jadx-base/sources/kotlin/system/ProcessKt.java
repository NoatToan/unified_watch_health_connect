package kotlin.system;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes4.dex */
@JvmName(name = "ProcessKt")
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
