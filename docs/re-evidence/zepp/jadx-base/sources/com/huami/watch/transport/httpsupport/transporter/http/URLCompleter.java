package com.huami.watch.transport.httpsupport.transporter.http;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class URLCompleter {

    public static class URLSeat {
        private static final String a = "[=>..^$^S]";
        private static final String b = "[E*$*..<=]";
        public static final String USER_ID = a("UID");
        public static final String PROVIDER = a("PRD");
        public static final String TOKEN = a("TK");

        private static String a(String str) {
            return a + str + b;
        }
    }

    public static String fillWithTokenRelated(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str.replace(str2, str3);
    }
}
