package he0;

import au0.x;
import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhe0/h;", "Lzd0/e0;", "Lau0/x;", "liveActivityPreferences", "<init>", "(Lau0/x;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements e0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f83512k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m0 f83513l = m0.f25460z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f83514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f83515j;

    public h(x xVar) {
        xVar.getClass();
        this.f83514i = xVar;
        this.f83515j = new AtomicBoolean(false);
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83513l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        ?? arrayList;
        ((pc0.j) KoinJavaComponent.get$default(pc0.j.class, null, null, 6, null)).getClass();
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD != null) {
            arrayList = new ArrayList();
            for (Object obj : arrayListD) {
                if (((sd2.f) obj).isPaired()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        Iterable iterable = (Iterable) arrayList;
        boolean z14 = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!((lc0.h) KoinJavaComponent.get$default(lc0.h.class, null, null, 6, null)).a((sd2.f) it.next())) {
                    z14 = false;
                    break;
                }
            }
        }
        this.f83515j.set(z14);
        a2 a2Var = a2.PROMOTIONS;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("onlyHasManualDevice: ", z14);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosMinLiveActivityVersionValidator", strH);
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosMinLiveActivityVersionValidator", "conditionsProvider: " + n0Var);
        Integer num = n0Var.f25497v;
        if (num == null) {
            i2.a.b(a2Var, "PromosMinLiveActivityVersionValidator", "conditionsProvider.minLiveActivityVersion = null");
            return l0.HIDE;
        }
        int iIntValue = num.intValue();
        int iB = this.f83514i.b();
        boolean z14 = iIntValue <= iB && !this.f83515j.get();
        if (!z14) {
            i2.a.b(a2Var, "PromosMinLiveActivityVersionValidator", am.j.g(iIntValue, iB, "Promo requires live activity version ", " but max supported is ", "."));
        }
        return e0.b(z14);
    }

    @Override // zd0.e0
    public final String e() {
        return am.j.h(this.f83514i.b(), "maxLiveActivityVersion: ");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
