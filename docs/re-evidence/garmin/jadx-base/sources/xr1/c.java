package xr1;

import e23.p;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f192027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f192028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f192029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f192030e;

    public /* synthetic */ c(LocalDate localDate, LocalDate localDate2, List list, int i14, int i15) {
        this.f192026a = i15;
        this.f192027b = localDate;
        this.f192028c = localDate2;
        this.f192029d = list;
        this.f192030e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f192026a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d.a(p0.t(this.f192030e | 1), this.f192029d, this.f192027b, this.f192028c, mVar);
                break;
            default:
                e.b(p0.t(this.f192030e | 1), this.f192029d, this.f192027b, this.f192028c, mVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
