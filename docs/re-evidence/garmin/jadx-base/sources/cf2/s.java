package cf2;

import android.content.Context;
import androidx.room.a0;
import ca0.d4;
import ch.qos.logback.core.CoreConstants;
import o13.t;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcf2/s;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "", "Lcf2/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "campaignId", "Lkotlin/Function1;", "", "operationCallback", "<init>", "(Landroid/content/Context;JLe23/l;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends com.garmin.android.library.backgroundtaskmanagement.e<Boolean> implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f27086r = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f27087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f27088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e23.l<Boolean, Unit> f27089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f27091q;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f27092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f27093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f27094c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f27092a = koinComponent;
            this.f27093b = qualifier;
            this.f27094c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [cf2.d, java.lang.Object] */
        @Override // e23.a
        public final d invoke() {
            KoinComponent koinComponent = this.f27092a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(d.class), this.f27093b, this.f27094c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Context context, long j8, e23.l<? super Boolean, Unit> lVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, null);
        context.getClass();
        this.f27087m = context;
        this.f27088n = j8;
        this.f27089o = lVar;
        this.f27090p = o13.m.b(new d4(14));
        this.f27091q = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new a(this, null, null));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
