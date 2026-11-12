package com.xiaomi.channel.commonutils.android;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes18.dex */
public class l {

    public static class a {
        private final StringBuilder a;
        private final String b;
        private final String c;

        public a() {
            this(":", ",");
        }

        public a(String str, String str2) {
            this.a = new StringBuilder();
            this.b = str;
            this.c = str2;
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.a.length() > 0) {
                    this.a.append(this.c);
                }
                StringBuilder sb = this.a;
                sb.append(str);
                sb.append(this.b);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.a.toString();
        }
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static int b(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }
}
