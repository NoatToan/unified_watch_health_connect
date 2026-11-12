package pt0;

import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.Iterator;
import mt0.j1;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import yc.m2;
import yt0.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lpt0/o;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f140741e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f140742a = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new b(this, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f140743b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f140744c = new j1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f140745d = o13.m.b(new ov1.u(this, 20));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f140746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f140747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f140748c;

        public b(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f140746a = koinComponent;
            this.f140747b = qualifier;
            this.f140748c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yt0.r0] */
        @Override // e23.a
        public final r0 invoke() {
            KoinComponent koinComponent = this.f140746a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.room.a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(r0.class), this.f140747b, this.f140748c);
        }
    }

    static {
        new a(null);
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void x4() {
        m2 m2Var;
        o13.t tVar = this.f140745d;
        if (((s51.a) tVar.getValue()).f157372c.d() != s51.e.LOADED || (m2Var = (m2) ((s51.a) tVar.getValue()).f157370a.d()) == null) {
            return;
        }
        m2Var.e().b();
    }

    public final void y4(String str, boolean z14) {
        str.getClass();
        ArrayList arrayList = this.f140743b;
        Iterator it = arrayList.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.leaderboard.model.p) it.next()).getUuid(), str)) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 != -1) {
            arrayList.set(i14, com.garmin.android.apps.connectmobile.leaderboard.model.p.b((com.garmin.android.apps.connectmobile.leaderboard.model.p) arrayList.get(i14), Boolean.valueOf(!z14), -134217729));
            x4();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt0/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PAGE_SIZE", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
