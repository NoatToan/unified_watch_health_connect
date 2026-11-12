package f5;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface b1 extends x {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/b1$a", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<f5.a, Integer> f68899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<e2, Unit> f68900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f68901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b1 f68902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.l<v1.a, Unit> f68903g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, b1 b1Var, e23.l<? super v1.a, Unit> lVar2) {
            this.f68901e = i14;
            this.f68902f = b1Var;
            this.f68903g = lVar2;
            this.f68897a = i14;
            this.f68898b = i15;
            this.f68899c = map;
            this.f68900d = lVar;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF68898b() {
            return this.f68898b;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF68897a() {
            return this.f68897a;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f68899c;
        }

        @Override // f5.a1
        public final void q() {
            b1 b1Var = this.f68902f;
            boolean z14 = b1Var instanceof h5.l0;
            e23.l<v1.a, Unit> lVar = this.f68903g;
            if (z14) {
                lVar.invoke(((h5.l0) b1Var).f81866l);
                return;
            }
            lVar.invoke(new h2(this.f68901e, b1Var.getF69049a(), b1Var.getF68959d(), b1Var.getF68960e()));
        }

        @Override // f5.a1
        public final e23.l<e2, Unit> r() {
            return this.f68900d;
        }
    }

    static a1 Z0(b1 b1Var, int i14, int i15, e23.l lVar, e23.l lVar2) {
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        return b1Var.P(i14, i15, k0Var, lVar, lVar2);
    }

    static a1 h0(b1 b1Var, int i14, int i15, e23.l lVar) {
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        return b1Var.H1(i14, i15, k0Var, lVar);
    }

    default a1 H1(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super v1.a, Unit> lVar) {
        return P(i14, i15, map, null, lVar);
    }

    default a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2) {
        if (!((i14 & (-16777216)) == 0 && ((-16777216) & i15) == 0)) {
            e5.a.b("Size(" + i14 + " x " + i15 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i14, i15, map, lVar, this, lVar2);
    }
}
