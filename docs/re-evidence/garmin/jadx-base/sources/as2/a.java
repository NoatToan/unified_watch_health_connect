package as2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Las2/a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f12684a = new DecimalFormat("###,###,###");

    public final String a(Number number) {
        number.getClass();
        String str = c().format(number);
        str.getClass();
        return str;
    }

    public final String b(Number number) {
        if (number != null) {
            return a(number);
        }
        String currencySymbol = d().getCurrencySymbol();
        currencySymbol.getClass();
        return currencySymbol.concat(" --");
    }

    public abstract DecimalFormat c();

    public abstract DecimalFormatSymbols d();
}
