package ko2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lko2/b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f105773a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f105774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f105775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecimalFormat f105776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DecimalFormat f105777e;

    static {
        Locale locale = Locale.CHINA;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);
        f105774b = decimalFormat;
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(locale);
        currencyInstance2.getClass();
        DecimalFormat decimalFormat2 = (DecimalFormat) currencyInstance2;
        decimalFormat2.setMaximumFractionDigits(2);
        decimalFormat2.setMinimumFractionDigits(2);
        decimalFormat2.setPositivePrefix(Marker.ANY_NON_NULL_MARKER + decimalFormat2.getPositivePrefix());
        f105775c = decimalFormat2;
        NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(locale);
        currencyInstance3.getClass();
        DecimalFormat decimalFormat3 = (DecimalFormat) currencyInstance3;
        decimalFormat3.setMaximumFractionDigits(2);
        decimalFormat3.setMinimumFractionDigits(0);
        f105776d = decimalFormat3;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.getClass();
        DecimalFormat decimalFormat4 = (DecimalFormat) numberFormat;
        decimalFormat4.setMaximumFractionDigits(2);
        decimalFormat4.setMinimumFractionDigits(0);
        f105777e = decimalFormat4;
    }

    private b() {
    }
}
