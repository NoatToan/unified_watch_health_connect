package com.huami.assistant.sms.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class SmsParseUtil {
    public static String match(String body, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(body);
        return matcher.find() ? matcher.group(1) : "";
    }

    public static List<String> matchAll(String body, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(body);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }
}
