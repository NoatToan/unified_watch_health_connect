package d6;

import lc.u0;
import o4.d0;
import o4.p1;
import o4.t1;
import o4.w;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f57772a = a.f57773a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/l$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f57773a = new a();

        private a() {
        }

        public static l a(float f14, w wVar) {
            if (wVar == null) {
                return b.f57774b;
            }
            if (wVar instanceof t1) {
                return b(k.a(f14, ((t1) wVar).f129007b));
            }
            if (wVar instanceof p1) {
                return new d6.b((p1) wVar, f14);
            }
            u0.r();
            return null;
        }

        public static l b(long j8) {
            return j8 != 16 ? new c(j8, null) : b.f57774b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/l$b;", "Ld6/l;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f57774b = new b();

        private b() {
        }

        @Override // d6.l
        /* JADX INFO: renamed from: a */
        public final float getF57706c() {
            return Float.NaN;
        }

        @Override // d6.l
        /* JADX INFO: renamed from: b */
        public final long getF57707b() {
            d0.f128823b.getClass();
            return d0.f128832k;
        }

        @Override // d6.l
        public final w e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    float getF57706c();

    /* JADX INFO: renamed from: b */
    long getF57707b();

    default l c(e23.a<? extends l> aVar) {
        return !equals(b.f57774b) ? this : aVar.invoke();
    }

    default l d(l lVar) {
        boolean z14 = lVar instanceof d6.b;
        if (!z14 || !(this instanceof d6.b)) {
            if (!z14 || (this instanceof d6.b)) {
                return (z14 || !(this instanceof d6.b)) ? lVar.c(new cq0.g(this, 11)) : this;
            }
            return lVar;
        }
        d6.b bVar = (d6.b) lVar;
        p1 p1Var = bVar.f57705b;
        float f14 = bVar.f57706c;
        if (Float.isNaN(f14)) {
            f14 = ((d6.b) this).f57706c;
        }
        return new d6.b(p1Var, f14);
    }

    w e();
}
