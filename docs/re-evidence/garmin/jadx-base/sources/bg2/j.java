package bg2;

import androidx.lifecycle.u1;
import androidx.room.a0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lbg2/j;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17890a = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new b(this, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f17891b = q2.a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f17892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f17893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f17894c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f17892a = koinComponent;
            this.f17893b = qualifier;
            this.f17894c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [bg2.i, java.lang.Object] */
        @Override // e23.a
        public final i invoke() {
            KoinComponent koinComponent = this.f17892a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(i.class), this.f17893b, this.f17894c);
        }
    }

    static {
        new a(null);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbg2/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
