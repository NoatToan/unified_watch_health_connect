package nc;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import lc.h0;
import lc.i0;
import lc.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.u1;
import r1.w1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rBO\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000f\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnc/f;", "Llc/i0;", "Lnc/e$b;", "Lnc/e;", "navigator", "", "route", "Lkotlin/Function2;", "Lr1/l;", "Llc/v;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lnc/e;Ljava/lang/String;Le23/r;)V", "Lk23/d;", "", "Lk23/p;", "Llc/q0;", "typeMap", "(Lnc/e;Lk23/d;Ljava/util/Map;Le23/r;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends i0<e.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f125272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.r<r1.l, lc.v, p3.m, Integer, Unit> f125273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.l<r1.n<lc.v>, u1> f125274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e23.l<r1.n<lc.v>, w1> f125275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e23.l<r1.n<lc.v>, u1> f125276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e23.l<r1.n<lc.v>, w1> f125277m;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e eVar, String str, e23.r<? super r1.l, ? super lc.v, ? super p3.m, ? super Integer, Unit> rVar) {
        super(eVar, str);
        this.f125272h = eVar;
        this.f125273i = rVar;
    }

    @Override // lc.i0
    public final h0 a() {
        e.b bVar = (e.b) super.a();
        bVar.f125267h = this.f125274j;
        bVar.f125268i = this.f125275k;
        bVar.f125269j = this.f125276l;
        bVar.f125270k = this.f125277m;
        return bVar;
    }

    @Override // lc.i0
    public final h0 b() {
        return new e.b(this.f125272h, this.f125273i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(e eVar, k23.d<?> dVar, Map<k23.p, q0<?>> map, e23.r<? super r1.l, ? super lc.v, ? super p3.m, ? super Integer, Unit> rVar) {
        super(eVar, dVar, map);
        this.f125272h = eVar;
        this.f125273i = rVar;
    }
}
