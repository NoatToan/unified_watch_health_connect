package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class c6s {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return "";
        }
        return strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
