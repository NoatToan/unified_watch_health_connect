package xq1;

import e23.p;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jq1.i f191933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f191934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f191935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd1.b f191936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191937f;

    public /* synthetic */ k(jq1.i iVar, LocalDate localDate, LocalDate localDate2, yd1.b bVar, int i14, int i15) {
        this.f191932a = i15;
        this.f191933b = iVar;
        this.f191934c = localDate;
        this.f191935d = localDate2;
        this.f191936e = bVar;
        this.f191937f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f191932a) {
            case 0:
                ((Integer) obj2).getClass();
                l.a(this.f191933b, this.f191934c, this.f191935d, this.f191936e, (p3.m) obj, p0.t(this.f191937f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m.a(this.f191933b, this.f191934c, this.f191935d, this.f191936e, (p3.m) obj, p0.t(this.f191937f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
