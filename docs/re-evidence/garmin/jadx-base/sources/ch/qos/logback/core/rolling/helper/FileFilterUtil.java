package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class FileFilterUtil {
    public static String afterLastSlash(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern patternCompile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = patternCompile.matcher(name);
        if (matcher.matches()) {
            return Integer.valueOf(matcher.group(1)).intValue();
        }
        h.z(e0.g("The regex [", str, "] should match [", name, "]"));
        return 0;
    }

    public static File[] filesInFolderMatchingStemRegex(File file, final String str) {
        if (file == null) {
            return new File[0];
        }
        return (file.exists() && file.isDirectory()) ? file.listFiles(new FilenameFilter() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.matches(str);
            }
        }) : new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i14 = Integer.MIN_VALUE;
        for (File file : fileArr) {
            int iExtractCounter = extractCounter(file, str);
            if (i14 < iExtractCounter) {
                i14 = iExtractCounter;
            }
        }
        return i14;
    }

    public static String slashify(String str) {
        return str.replace('\\', IOUtils.DIR_SEPARATOR_UNIX);
    }
}
