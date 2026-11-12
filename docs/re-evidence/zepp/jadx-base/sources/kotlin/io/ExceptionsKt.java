package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ExceptionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(Intrinsics.stringPlus(" -> ", file2));
        }
        if (str != null) {
            sb.append(Intrinsics.stringPlus(": ", str));
        }
        return sb.toString();
    }
}
