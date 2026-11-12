package org.slf4j.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
class b implements ILoggerFactory {
    public static final String b = "null";
    public static final int c = 23;
    private final ConcurrentMap<String, Logger> a = new ConcurrentHashMap();

    private static String a(String str) {
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            int i = iLastIndexOf + 1;
            if (length - i <= 23) {
                return str.substring(i);
            }
        }
        return '*' + str.substring((length - 23) + 1);
    }

    public static String b(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length <= 23) {
            return str;
        }
        StringBuilder sb = new StringBuilder(26);
        int i = 0;
        int length2 = 0;
        do {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf == -1) {
                int i2 = length - i;
                if (length2 == 0 || length2 + i2 > 23) {
                    return a(str);
                }
                sb.append((CharSequence) str, i, length);
                return sb.toString();
            }
            sb.append(str.charAt(i));
            if (iIndexOf - i > 1) {
                sb.append('*');
            }
            sb.append('.');
            i = iIndexOf + 1;
            length2 = sb.length();
        } while (length2 <= 23);
        return a(str);
    }

    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        String strB = b(str);
        Logger logger = this.a.get(strB);
        if (logger != null) {
            return logger;
        }
        a aVar = new a(strB);
        Logger loggerPutIfAbsent = this.a.putIfAbsent(strB, aVar);
        return loggerPutIfAbsent == null ? aVar : loggerPutIfAbsent;
    }
}
