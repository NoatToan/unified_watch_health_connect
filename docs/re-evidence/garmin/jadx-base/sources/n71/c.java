package n71;

import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c extends q implements p<LocalDate, Integer, LocalDate> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f124831a = new c();

    public c() {
        super(2, LocalDate.class, "plusDays", "plusDays(I)Lorg/joda/time/LocalDate;", 0);
    }

    @Override // e23.p
    public final LocalDate invoke(LocalDate localDate, Integer num) {
        LocalDate localDate2 = localDate;
        int iIntValue = num.intValue();
        localDate2.getClass();
        return localDate2.plusDays(iIntValue);
    }
}
