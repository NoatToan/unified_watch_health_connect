package my0;

import androidx.lifecycle.u1;
import gy0.g;
import gy0.q1;
import o13.m;
import o13.n;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmy0/d;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f121468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f121469b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f121470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f121471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f121472c;

        public a(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f121470a = scope;
            this.f121471b = qualifier;
            this.f121472c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.g, java.lang.Object] */
        @Override // e23.a
        public final g invoke() {
            return this.f121470a.get(s0.f105811a.b(g.class), this.f121471b, this.f121472c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<q1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f121473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f121474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f121475c;

        public b(Scope scope, Qualifier qualifier, e23.a aVar) {
            this.f121473a = scope;
            this.f121474b = qualifier;
            this.f121475c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gy0.q1, java.lang.Object] */
        @Override // e23.a
        public final q1 invoke() {
            return this.f121473a.get(s0.f105811a.b(q1.class), this.f121474b, this.f121475c);
        }
    }

    public d() {
        Scope scopeV = xy2.b.v();
        n nVar = n.SYNCHRONIZED;
        this.f121468a = m.a(nVar, new a(scopeV, null, null));
        this.f121469b = m.a(nVar, new b(xy2.b.v(), null, null));
    }
}
