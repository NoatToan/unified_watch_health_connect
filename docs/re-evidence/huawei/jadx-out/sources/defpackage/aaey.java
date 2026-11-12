package defpackage;

import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes20.dex */
public class aaey {
    static MDCAdapter d;

    private static MDCAdapter e() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    static {
        try {
            d = e();
        } catch (Exception e) {
            aafg.c("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            d = new aafc();
            String message = e2.getMessage();
            if (message != null && message.contains("StaticMDCBinder")) {
                aafg.c("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
                aafg.c("Defaulting to no-operation MDCAdapter implementation.");
                aafg.c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
                return;
            }
            throw e2;
        }
    }

    public static void a(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = d;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.put(str, str2);
    }

    public static void b() {
        MDCAdapter mDCAdapter = d;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }
}
