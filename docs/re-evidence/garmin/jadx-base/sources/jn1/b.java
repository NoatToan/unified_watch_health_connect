package jn1;

import e23.p;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import sm1.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f99608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f99609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f99610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99611e;

    public /* synthetic */ b(km1.c cVar, DateTime dateTime, s sVar, int i14, int i15) {
        this.f99607a = i15;
        this.f99608b = cVar;
        this.f99609c = dateTime;
        this.f99610d = sVar;
        this.f99611e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f99607a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.a(this.f99608b, this.f99609c, this.f99610d, mVar, p0.t(this.f99611e | 1));
                break;
            case 1:
                c.b(this.f99608b, this.f99609c, this.f99610d, mVar, p0.t(this.f99611e | 1));
                break;
            case 2:
                kn1.d.b(this.f99608b, this.f99609c, this.f99610d, mVar, p0.t(this.f99611e | 1));
                break;
            default:
                kn1.d.c(this.f99608b, this.f99609c, this.f99610d, mVar, p0.t(this.f99611e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
