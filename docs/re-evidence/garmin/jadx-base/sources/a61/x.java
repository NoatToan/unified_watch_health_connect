package a61;

import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00124\u0010\n\u001a0\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La61/x;", "Lf32/p;", "Lo71/e;", "Lo71/i;", "viewModel", "Lkotlin/Function4;", "Lorg/joda/time/LocalDate;", "Lt13/d;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "requestStrengthStats", "<init>", "(Lo71/i;Le23/r;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends f32.p<o71.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71.i f1692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.r<o71.i, LocalDate, LocalDate, t13.d<? super v2<o71.e>>, Object> f1693b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(o71.i iVar, e23.r<? super o71.i, ? super LocalDate, ? super LocalDate, ? super t13.d<? super v2<o71.e>>, ? extends Object> rVar) {
        iVar.getClass();
        rVar.getClass();
        this.f1692a = iVar;
        this.f1693b = rVar;
    }

    @Override // f32.p
    public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends o71.e>> dVar) {
        LocalDate localDate = dateTime.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = dateTime2.toLocalDate();
        localDate2.getClass();
        return this.f1693b.invoke(this.f1692a, localDate, localDate2, dVar);
    }
}
