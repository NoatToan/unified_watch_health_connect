package ch.qos.logback.core.util;

import am.j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class FileSize {
    private static final int DOUBLE_GROUP = 1;
    private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    private static final String LENGTH_PART = "([0-9]+)";
    public static final long MB_COEFFICIENT = 1048576;
    private static final int UNIT_GROUP = 2;
    private static final String UNIT_PART = "(|kb|mb|gb)s?";
    final long size;

    public FileSize(long j8) {
        this.size = j8;
    }

    public static FileSize valueOf(String str) {
        long j8;
        Matcher matcher = FILE_SIZE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            h.s(j.m("String value [", str, "] is not in the expected format."));
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        long jLongValue = Long.valueOf(strGroup).longValue();
        if (strGroup2.equalsIgnoreCase("")) {
            j8 = 1;
        } else if (strGroup2.equalsIgnoreCase("kb")) {
            j8 = 1024;
        } else if (strGroup2.equalsIgnoreCase("mb")) {
            j8 = 1048576;
        } else {
            if (!strGroup2.equalsIgnoreCase("gb")) {
                h.z("Unexpected ".concat(strGroup2));
                return null;
            }
            j8 = 1073741824;
        }
        return new FileSize(jLongValue * j8);
    }

    public long getSize() {
        return this.size;
    }

    public String toString() {
        long j8 = this.size;
        long j14 = j8 / 1024;
        if (j14 == 0) {
            return j.i(this.size, " Bytes", new StringBuilder());
        }
        long j15 = j8 / 1048576;
        if (j15 == 0) {
            return j14 + " KB";
        }
        long j16 = j8 / 1073741824;
        if (j16 == 0) {
            return j15 + " MB";
        }
        return j16 + " GB";
    }
}
