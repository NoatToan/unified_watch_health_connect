package cf2;

import androidx.room.a0;
import ca0.d4;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o13.t;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcf2/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "Lff2/a;", "Lcf2/g;", "Lkf2/a;", "userAction", "", "campaignId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lkf2/a;JLcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.e<ff2.a> implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f27024r = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kf2.a f27025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f27026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f27028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f27029q;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f27030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f27031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f27032c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f27030a = koinComponent;
            this.f27031b = qualifier;
            this.f27032c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [cf2.d, java.lang.Object] */
        @Override // e23.a
        public final d invoke() {
            KoinComponent koinComponent = this.f27030a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(d.class), this.f27031b, this.f27032c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kf2.a aVar, long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar2) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar2);
        aVar.getClass();
        this.f27025m = aVar;
        this.f27026n = j8;
        this.f27027o = o13.m.b(new d4(11));
        this.f27028p = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new a(this, null, null));
        this.f27029q = "ANDROID";
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ b(kf2.a aVar, long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, j8, (i14 & 4) != 0 ? null : aVar2);
    }
}
