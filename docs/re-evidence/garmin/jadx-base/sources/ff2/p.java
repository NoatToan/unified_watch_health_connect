package ff2;

import c80.m0;
import c80.n0;
import c80.s0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z70.a0;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lff2/p;", "Lzd0/e0;", "Lz70/a0;", "promosPreferences", "<init>", "(Lz70/a0;)V", "a", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f71196i;

    static {
        new a(null);
    }

    public p(a0 a0Var) {
        a0Var.getClass();
        this.f71196i = a0Var;
    }

    @Override // zd0.e0
    public final m0 a() {
        return null;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        a0 a0Var = this.f71196i;
        if (a0Var.w()) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "PromosHomeDismissalDateValidator", "Skipping validation due to development override");
            return l0.SHOW;
        }
        Long lJ = a0Var.j(s0.HOME);
        if (lJ != null) {
            long jLongValue = lJ.longValue();
            b63.l.INSTANCE.getClass();
            return e0.b(b63.l.Companion.a(jLongValue).b(a0Var.d()).compareTo(b63.a.C0229a.f16171a.a()) <= 0);
        }
        a2 a2Var2 = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "PromosHomeDismissalDateValidator", "No dismissal date found. Returning true.");
        return l0.SHOW;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lff2/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
