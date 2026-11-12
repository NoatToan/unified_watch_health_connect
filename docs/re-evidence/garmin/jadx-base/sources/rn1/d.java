package rn1;

import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm1.f f153645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f153646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f153647d;

    public /* synthetic */ d(mm1.f fVar, LocalDate localDate, LocalDate localDate2, int i14, int i15) {
        this.f153644a = i15;
        this.f153645b = fVar;
        this.f153646c = localDate;
        this.f153647d = localDate2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f153644a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                e.a(this.f153645b, this.f153646c, this.f153647d, mVar, p0.t(9));
                break;
            case 1:
                h.a(this.f153645b, this.f153646c, this.f153647d, mVar, p0.t(9));
                break;
            default:
                n.a(this.f153645b, this.f153646c, this.f153647d, mVar, p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }
}
