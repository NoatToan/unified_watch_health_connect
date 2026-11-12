package com.xiaomi.ai.domain.phonecall.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class UAUtils {
    private static final Pattern buildPattern = Pattern.compile("Build/(\\d+) ");

    public static int buildNumber(String str) {
        if (str == null || "".equals(str)) {
            return -1;
        }
        Matcher matcher = buildPattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }
}
