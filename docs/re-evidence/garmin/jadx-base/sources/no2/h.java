package no2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import po2.h0;
import po2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lno2/h;", "Lno2/i;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements i {
    @Override // no2.i
    public final Object a(t13.d<? super List<h0>> dVar) {
        throw new ns2.d("Forged history getter");
    }

    @Override // no2.i
    public final Object b(w.e eVar) {
        return Boolean.FALSE;
    }

    @Override // no2.i
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // no2.i
    public final Object d(v13.c cVar) {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        LocalDate localDateNow2 = LocalDate.now();
        localDateNow2.getClass();
        return new fo2.h(localDateNow, localDateNow2);
    }

    @Override // no2.i
    public final Object e(zn2.w wVar) {
        CurrencyValue.a aVar = CurrencyValue.f51217c;
        ko2.a.b bVar = ko2.a.f105768a;
        aVar.getClass();
        return CurrencyValue.a.a(0L, bVar);
    }
}
