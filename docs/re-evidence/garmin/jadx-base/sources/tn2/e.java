package tn2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltn2/e;", "Las2/a;", "Lkotlin/Function1;", "Ljava/text/DecimalFormatSymbols;", "Ljava/text/DecimalFormat;", "formatterFactory", "<init>", "(Le23/l;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends as2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DecimalFormatSymbols f165547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecimalFormat f165548c;

    public e(e23.l<? super DecimalFormatSymbols, ? extends DecimalFormat> lVar) {
        lVar.getClass();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.JAPAN);
        this.f165547b = decimalFormatSymbols;
        this.f165548c = lVar.invoke(decimalFormatSymbols);
    }

    @Override // as2.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public final DecimalFormat getF165548c() {
        return this.f165548c;
    }

    @Override // as2.a
    /* JADX INFO: renamed from: d, reason: from getter */
    public final DecimalFormatSymbols getF165547b() {
        return this.f165547b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ e(e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new t52.c(27) : lVar);
    }
}
