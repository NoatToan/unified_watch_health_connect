package he0;

import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhe0/i;", "Lzd0/e0;", "<init>", "()V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f83516i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m0 f83517j = m0.f25459y;

    @Override // zd0.e0
    public final m0 a() {
        return f83517j;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosNFSValidator", "conditionsProvider: " + n0Var);
        Boolean bool = n0Var.f25496u;
        if (bool == null) {
            i2.a.b(a2Var, "PromosNFSValidator", "conditionsProvider.hasFollowings = null");
            return l0.HIDE;
        }
        boolean zBooleanValue = bool.booleanValue();
        boolean z14 = false;
        boolean z15 = ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).a().f86479a.i2(0, "keyNewsfeedFollowingNumber") >= 1;
        if (zBooleanValue && !z15) {
            i2.a.b(a2Var, "PromosNFSValidator", "Display condition: User must have at least one following to show the card");
        } else if (zBooleanValue || !z15) {
            z14 = true;
        } else {
            i2.a.b(a2Var, "PromosNFSValidator", "Display condition: User must have no following to show the card");
        }
        return e0.b(z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
