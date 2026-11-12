package fr2;

import androidx.lifecycle.s0;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p13.t0;
import uy2.j;
import uy2.k;
import uy2.p0;
import uy2.r;
import uy2.v;
import xy2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005R,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lfr2/d;", "Lry2/a;", "", "", "h", "()V", "Landroidx/lifecycle/s0;", "", "", "Lns2/a;", "Lms2/e;", "E", "()Landroidx/lifecycle/s0;", "operatorsByDevice", "", "d1", "isOperatorListLoadingInProgress", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d extends ry2.a<d> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfr2/d$a;", "Lxy2/o;", "", "", "Lns2/a;", "Lms2/e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements o<Map<Long, ? extends ns2.a<? extends ms2.e>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uy2.d f73325a;

        public a() {
            uy2.e eVar = uy2.e.f173458a;
            Map mapB = t0.b(new p(1L, gg.b.q(true)));
            eVar.getClass();
            this.f73325a = new uy2.d(mapB);
        }

        @Override // xy2.o
        /* JADX INFO: renamed from: getValue */
        public final Map<Long, ? extends ns2.a<? extends ms2.e>> getF173457a() {
            return (Map) this.f73325a.f173457a;
        }
    }

    @j(keys = {"operators"})
    @r(providerClass = a.class)
    s0<Map<Long, ns2.a<ms2.e>>> E();

    /* synthetic */ s0 N0();

    @j(keys = {"loading"})
    @v
    s0<Boolean> d1();

    @k
    @p0(keys = {"operators", "loading"})
    void h();

    /* synthetic */ s0 s1();
}
