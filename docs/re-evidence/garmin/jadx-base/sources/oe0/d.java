package oe0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import ne0.j0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loe0/d;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f131256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f131257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f131258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f131259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f131260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f131261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f131262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f131263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f131264i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ne0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131267c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131265a = koinComponent;
            this.f131266b = qualifier;
            this.f131267c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.c] */
        @Override // e23.a
        public final ne0.c invoke() {
            KoinComponent koinComponent = this.f131265a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.c.class), this.f131266b, this.f131267c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<ne0.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131270c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131268a = koinComponent;
            this.f131269b = qualifier;
            this.f131270c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.t] */
        @Override // e23.a
        public final ne0.t invoke() {
            KoinComponent koinComponent = this.f131268a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(ne0.t.class), this.f131269b, this.f131270c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f131271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f131272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f131273c;

        public c(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f131271a = koinComponent;
            this.f131272b = qualifier;
            this.f131273c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ne0.j0] */
        @Override // e23.a
        public final j0 invoke() {
            KoinComponent koinComponent = this.f131271a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(j0.class), this.f131272b, this.f131273c);
        }
    }

    public d() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f131256a = o13.m.a(koinPlatformTools.defaultLazyMode(), new a(this, null, null));
        this.f131257b = o13.m.a(koinPlatformTools.defaultLazyMode(), new b(this, null, null));
        this.f131258c = o13.m.a(koinPlatformTools.defaultLazyMode(), new c(this, null, null));
        p2 p2VarA = q2.a(new oe0.a(false, false, false, 7, null));
        this.f131259d = p2VarA;
        this.f131260e = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(new pe0.c(null, null, null, null, null, 0.0d, null, null, false, null, 1023, null));
        this.f131261f = p2VarA2;
        this.f131262g = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(j53.l.b());
        this.f131263h = p2VarA3;
        this.f131264i = r53.s.d(p2VarA3);
        ge1.b.T(v1.a(this), null, null, new oe0.b(this, null), 3);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void x4(String str) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f131261f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, pe0.c.a((pe0.c) value, null, null, null, null, null, 0.0d, str, null, false, null, 959)));
    }
}
