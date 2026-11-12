package pt0;

import androidx.lifecycle.u1;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lpt0/n;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f140733d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f140734a = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new b(this, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt0.l0 f140735b = new mt0.l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f140736c = o13.m.b(new ov1.u(this, 19));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f140737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f140738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f140739c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f140737a = koinComponent;
            this.f140738b = qualifier;
            this.f140739c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yt0.r0] */
        @Override // e23.a
        public final r0 invoke() {
            KoinComponent koinComponent = this.f140737a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(r0.class), this.f140738b, this.f140739c);
        }
    }

    static {
        new a(null);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt0/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PAGE_SIZE", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
