package am;

import java.util.regex.Pattern;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lam/w1;", "", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w1 {
    static {
        new a(null);
    }

    public static double a(String str) {
        str.getClass();
        if (!Pattern.compile("^(-?(([0-9]|[1-8][0-9])$?[.,]\\d?\\d?\\d?\\d?\\d?\\d?)|90)").matcher(str).matches()) {
            throw new NumberFormatException("String does not match latitude format");
        }
        double d14 = Double.parseDouble(d53.u.v(str, ",", ".", false));
        if (-90.0d <= d14 && d14 <= 90.0d) {
            return d14;
        }
        vb.h.s("Value is not in allowable latitude range");
        return 0.0d;
    }

    public static double b(String str) {
        str.getClass();
        if (!Pattern.compile("^(-?(([0-9]|[1-9][0-9]|1[0-7][0-9])$?[.,]\\d?\\d?\\d?\\d?\\d?\\d?)|180)").matcher(str).matches()) {
            throw new NumberFormatException("String does not match longitude format");
        }
        double d14 = Double.parseDouble(d53.u.v(str, ",", ".", false));
        if (-180.0d <= d14 && d14 <= 180.0d) {
            return d14;
        }
        vb.h.s("Value is not in allowable longitude range");
        return 0.0d;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lam/w1$a;", "", "<init>", "()V", "", "LATITUDE_REGEX", "Ljava/lang/String;", "LONGITUDE_REGEX", "", "MIN_LATITUDE", "D", "MAX_LATITUDE", "MIN_LONGITUDE", "MAX_LONGITUDE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
