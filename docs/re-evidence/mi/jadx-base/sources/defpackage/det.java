package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public class det {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f15464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15465b;
        public final String c;

        public a() {
            this(":", ",");
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f15464a.length() > 0) {
                    this.f15464a.append(this.c);
                }
                StringBuilder sb = this.f15464a;
                sb.append(str);
                sb.append(this.f15465b);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f15464a.toString();
        }

        public a(String str, String str2) {
            this.f15464a = new StringBuilder();
            this.f15465b = str;
            this.c = str2;
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

    public static long b(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static boolean c() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean d(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static int e(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }
}
