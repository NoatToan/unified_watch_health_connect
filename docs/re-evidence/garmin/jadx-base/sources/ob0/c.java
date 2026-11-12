package ob0;

import android.icu.text.DecimalFormatSymbols;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lob0/c;", "", "Landroid/icu/text/DecimalFormatSymbols;", "symbols", "<init>", "(Landroid/icu/text/DecimalFormatSymbols;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f131104a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(DecimalFormatSymbols decimalFormatSymbols, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            decimalFormatSymbols = DecimalFormatSymbols.getInstance();
            decimalFormatSymbols.getClass();
        }
        this(decimalFormatSymbols);
    }

    public c(DecimalFormatSymbols decimalFormatSymbols) {
        decimalFormatSymbols.getClass();
        this.f131104a = decimalFormatSymbols.getDecimalSeparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
