package h7;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh7/a;", "", "<init>", "()V", "a", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f82320a = 0;

    /* JADX INFO: renamed from: h7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh7/a$a;", "", "<init>", "()V", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1629a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1629a f82321a = new C1629a();

        private C1629a() {
        }

        public static void a(int i14) {
            SdkExtensions.getExtensionVersion(i14);
        }
    }

    static {
        new a();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            C1629a.f82321a.getClass();
            C1629a.a(30);
        }
        if (i14 >= 30) {
            C1629a.f82321a.getClass();
            C1629a.a(31);
        }
        if (i14 >= 30) {
            C1629a.f82321a.getClass();
            C1629a.a(33);
        }
        if (i14 >= 30) {
            C1629a.f82321a.getClass();
            C1629a.a(1000000);
        }
    }

    private a() {
    }

    public static final boolean a(String str) {
        String str2 = Build.VERSION.CODENAME;
        Integer num = 0;
        str2.getClass();
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            upperCase.getClass();
            Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
            String upperCase2 = str.toUpperCase(locale);
            upperCase2.getClass();
            num = upperCase2.equals("BAKLAVA") ? 0 : null;
            if (num2 == null || num == null) {
                if (num2 == null && num == null) {
                    String upperCase3 = str2.toUpperCase(locale);
                    upperCase3.getClass();
                    String upperCase4 = str.toUpperCase(locale);
                    upperCase4.getClass();
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num2 != null) {
                    return true;
                }
            } else if (num2.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }
}
