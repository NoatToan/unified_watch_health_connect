package he0;

import c80.h0;
import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhe0/e;", "Lzd0/e0;", "La80/b;", "subscriptionPreferences", "<init>", "(La80/b;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f83483j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f83484k = m0.f25458x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a80.b f83485i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83486a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.WELCOME_GC_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f83486a = iArr;
        }
    }

    public e(a80.b bVar) {
        bVar.getClass();
        this.f83485i = bVar;
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83484k;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        h0 h0Var = n0Var.f25494s;
        if (h0Var == null) {
            return l0.HIDE;
        }
        if (b.f83486a[h0Var.ordinal()] != 1) {
            u0.r();
            return null;
        }
        if (!this.f83485i.i()) {
            return l0.SHOW;
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosAutoDismissValidator", "Auto Dismissing GC Plus Welcome Card");
        return l0.DISMISS;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
