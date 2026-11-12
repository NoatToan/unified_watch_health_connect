package py0;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final String a(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        str.getClass();
        try {
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return simpleDateFormat2.format(date);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
