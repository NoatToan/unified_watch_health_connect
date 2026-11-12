package defpackage;

import com.huawei.hms.framework.common.ExceptionCode;
import java.util.Date;

/* JADX INFO: loaded from: classes20.dex */
public final class xpk {
    public static String c() {
        int iNextInt = (xpj.e().nextInt(ExceptionCode.CRASH_EXCEPTION) + ExceptionCode.CRASH_EXCEPTION) % ExceptionCode.CRASH_EXCEPTION;
        if (iNextInt < 1000000) {
            iNextInt += 1000000;
        }
        return xpq.e(new Date(System.currentTimeMillis()), "yyyyMMddHHmmssSSS") + iNextInt;
    }
}
