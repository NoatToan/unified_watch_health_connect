package com.huawei.hms.kit.awareness.b.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13886a = "^[a-zA-Z0-9]+-dr([a-zA-Z]+)\\.dt\\.(hicloud.com|dbankcloud.cn)";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f13887b = Pattern.compile(f13886a);

    public static String b(String str) {
        Matcher matcherA = a(str);
        return matcherA.find() ? matcherA.group(1) : "";
    }

    public static boolean a(String str, String str2) {
        String str3 = str == null ? str2 : str;
        if (str3 == null) {
            return true;
        }
        return str3.equals(str2) && str3.equals(str);
    }

    public static Matcher a(String str) {
        return f13887b.matcher(str);
    }
}
