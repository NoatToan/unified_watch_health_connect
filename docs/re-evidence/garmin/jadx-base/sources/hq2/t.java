package hq2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq2/t;", "Las2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends as2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecimalFormatSymbols f85280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecimalFormat f85281c;

    public t() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.TAIWAN);
        this.f85280b = decimalFormatSymbols;
        DecimalFormat decimalFormat = new DecimalFormat("¤###,###,###", decimalFormatSymbols);
        decimalFormat.setMaximumFractionDigits(0);
        this.f85281c = decimalFormat;
    }

    @Override // as2.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final DecimalFormat getF85281c() {
        return this.f85281c;
    }

    @Override // as2.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final DecimalFormatSymbols getF85280b() {
        return this.f85280b;
    }
}
