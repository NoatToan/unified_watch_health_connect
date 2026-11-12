package defpackage;

import com.xiaomi.fitness.common.utils.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class sp5 {
    public static Date a(String str) {
        try {
            return new SimpleDateFormat(TimeUtils.NEW_FORMAT).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
