package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class gbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f18816a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f18817b = "";

    public static String a() {
        if (TextUtils.isEmpty(f18817b)) {
            f18817b = qcs.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f18817b);
        long j = f18816a;
        f18816a = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e) {
            x9s.D("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }

    public static String c() {
        return qcs.a(32);
    }
}
