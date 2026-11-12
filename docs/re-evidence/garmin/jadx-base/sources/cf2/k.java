package cf2;

import android.content.Context;
import androidx.room.a0;
import ca0.d4;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o13.t;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcf2/k;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "Lff2/a;", "Lcf2/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "campaignId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkf2/d;", "", "validityCheckCompletion", "<init>", "(Landroid/content/Context;JLcom/garmin/android/library/backgroundtaskmanagement/b$a;Le23/p;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends com.garmin.android.library.backgroundtaskmanagement.e<ff2.a> implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f27049r = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f27050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f27051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e23.p<ff2.a, kf2.d, Unit> f27052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f27054q;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f27055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f27056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f27057c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f27055a = koinComponent;
            this.f27056b = qualifier;
            this.f27057c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [cf2.d, java.lang.Object] */
        @Override // e23.a
        public final d invoke() {
            KoinComponent koinComponent = this.f27055a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(d.class), this.f27056b, this.f27057c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, e23.p<? super ff2.a, ? super kf2.d, Unit> pVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        context.getClass();
        this.f27050m = context;
        this.f27051n = j8;
        this.f27052o = pVar;
        this.f27053p = o13.m.b(new d4(12));
        this.f27054q = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new a(this, null, null));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final Logger m() {
        return (Logger) this.f27053p.getValue();
    }
}
