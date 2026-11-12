package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class dfp {
    public static boolean a(long j, long j2, long j3, long j4) {
        return (j3 <= j2 || j4 <= j2) && j4 >= j;
    }

    public static String b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }
}
