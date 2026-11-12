package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class f extends CacheSpan {
    public static final String a = ".exo";
    private static final String b = ".v3.exo";
    private static final Pattern c = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern d = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern e = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private f(String key, long position, long length, long lastTouchTimestamp, @Nullable File file) {
        super(key, position, length, lastTouchTimestamp, file);
    }

    @Nullable
    public static f b(File file, long length, long lastTouchTimestamp, d index) {
        File file2;
        String strL;
        String name = file.getName();
        if (name.endsWith(b)) {
            file2 = file;
        } else {
            File fileG = g(file, index);
            if (fileG == null) {
                return null;
            }
            file2 = fileG;
            name = fileG.getName();
        }
        Matcher matcher = e.matcher(name);
        if (!matcher.matches() || (strL = index.l(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length2 = length == -1 ? file2.length() : length;
        if (length2 == 0) {
            return null;
        }
        return new f(strL, Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), length2, lastTouchTimestamp == C.TIME_UNSET ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))) : lastTouchTimestamp, file2);
    }

    @Nullable
    public static f c(File file, long length, d index) {
        return b(file, length, C.TIME_UNSET, index);
    }

    public static f d(String key, long position, long length) {
        return new f(key, position, length, C.TIME_UNSET, null);
    }

    public static f e(String key, long position) {
        return new f(key, position, -1L, C.TIME_UNSET, null);
    }

    public static File f(File cacheDir, int id, long position, long timestamp) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(id);
        sb.append(".");
        sb.append(position);
        sb.append(".");
        sb.append(timestamp);
        sb.append(b);
        return new File(cacheDir, sb.toString());
    }

    @Nullable
    private static File g(File file, d index) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = d.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = c.matcher(name);
            strUnescapeFileName = matcher.matches() ? (String) Assertions.checkNotNull(matcher.group(1)) : null;
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File fileF = f((File) Assertions.checkStateNotNull(file.getParentFile()), index.f(strUnescapeFileName), Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))));
        if (file.renameTo(fileF)) {
            return fileF;
        }
        return null;
    }

    public f a(File file, long lastTouchTimestamp) {
        Assertions.checkState(this.isCached);
        return new f(this.key, this.position, this.length, lastTouchTimestamp, file);
    }
}
