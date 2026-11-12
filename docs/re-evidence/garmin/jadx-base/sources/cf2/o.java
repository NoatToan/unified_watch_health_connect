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
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcf2/o;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "Lff2/f;", "Lcf2/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends com.garmin.android.library.backgroundtaskmanagement.e<ff2.f> implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f27068p = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f27069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f27070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f27071o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f27072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f27073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f27074c;

        public a(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f27072a = koinComponent;
            this.f27073b = qualifier;
            this.f27074c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [cf2.d, java.lang.Object] */
        @Override // e23.a
        public final d invoke() {
            KoinComponent koinComponent = this.f27072a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(d.class), this.f27073b, this.f27074c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        context.getClass();
        this.f27069m = context;
        this.f27070n = o13.m.b(new d4(13));
        this.f27071o = o13.m.a(KoinPlatformTools.INSTANCE.defaultLazyMode(), new a(this, null, null));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final Logger m() {
        return (Logger) this.f27070n.getValue();
    }

    public /* synthetic */ o(Context context, com.garmin.android.library.backgroundtaskmanagement.b.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : aVar);
    }
}
