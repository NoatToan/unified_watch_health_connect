package ta2;

import java.sql.Date;
import p005kotlin.Metadata;
import xz2.j;
import xz2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta2/a;", "Lxz2/j;", "Ljava/sql/Date;", "selectableIntervalStart", "selectableIntervalEnd", "<init>", "(Ljava/sql/Date;Ljava/sql/Date;)V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f163505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f163506b;

    public a(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        this.f163505a = date;
        this.f163506b = date2;
    }

    @Override // xz2.j
    public final boolean a(xz2.b bVar) {
        bVar.getClass();
        return bVar.i(xz2.b.d(this.f163505a)) || bVar.h(xz2.b.d(this.f163506b));
    }

    @Override // xz2.j
    public final void b(k kVar) {
        kVar.a();
    }
}
