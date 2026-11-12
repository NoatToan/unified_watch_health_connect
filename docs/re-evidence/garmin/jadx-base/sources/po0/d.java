package po0;

import e23.l;
import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ co0.c f139010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f139011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f139012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f139013e;

    public /* synthetic */ d(co0.c cVar, LocalDate localDate, LocalDate localDate2, l lVar, int i14, int i15) {
        this.f139009a = i15;
        this.f139010b = cVar;
        this.f139011c = localDate;
        this.f139012d = localDate2;
        this.f139013e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f139009a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                g.a(this.f139010b, this.f139011c, this.f139012d, this.f139013e, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                h.a(this.f139010b, this.f139011c, this.f139012d, this.f139013e, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
