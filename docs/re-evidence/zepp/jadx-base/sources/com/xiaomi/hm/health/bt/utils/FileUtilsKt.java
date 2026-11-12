package com.xiaomi.hm.health.bt.utils;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"", "", "getFileSize", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class FileUtilsKt {
    public static final long getFileSize(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }
}
