package xz2;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static Calendar a() {
        Calendar calendar = Calendar.getInstance();
        int i14 = calendar.get(1);
        int i15 = calendar.get(2);
        int i16 = calendar.get(5);
        calendar.clear();
        calendar.set(i14, i15, i16);
        return calendar;
    }
}
