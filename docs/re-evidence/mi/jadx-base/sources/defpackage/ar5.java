package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class ar5 {
    public static Date a(long j) {
        return new Date(j * 1000);
    }

    public static long b(Date date) {
        return date.getTime() / 1000;
    }
}
