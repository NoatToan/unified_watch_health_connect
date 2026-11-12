package he0;

import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;
import z70.a0;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhe0/j;", "Lzd0/e0;", "Lz70/a0;", "promosPreferences", "<init>", "(Lz70/a0;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f83518j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m0 f83519k = m0.f25441e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f83520i;

    public j(a0 a0Var) {
        a0Var.getClass();
        this.f83520i = a0Var;
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83519k;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        a2 a2Var = a2.PROMOTIONS;
        Boolean bool = n0Var.f25478c;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "PromosPairedDeviceValidator", "conditionsProvider.hasPairedDevice: " + bool);
        if (bool == null) {
            return l0.HIDE;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (this.f83520i.r()) {
            i2.a.b(a2Var, "PromosPairedDeviceValidator", "Dev setting: should ignore paired device validator is true.");
            return l0.SHOW;
        }
        ed0.a.f63825a.getClass();
        z1 z1Var = ed0.a.f63833i;
        int iIntValue = ((Number) z1Var.getValue()).intValue();
        int iIntValue2 = ((Number) ed0.a.f63831g.getValue()).intValue();
        boolean z14 = false;
        if (zBooleanValue) {
            if (iIntValue > 0 && iIntValue2 > 0) {
                z14 = true;
            }
            if (!z14) {
                i2.a.b(a2Var, "PromosPairedDeviceValidator", tn.k.e(iIntValue, iIntValue2, "Promo requires user has a paired and registered device but user doesn't have one. Paired: ", ", registered: "));
            }
        } else {
            if (zBooleanValue) {
                u0.r();
                return null;
            }
            z14 = ((Number) z1Var.getValue()).intValue() == 0;
            if (!z14) {
                i2.a.b(a2Var, "PromosPairedDeviceValidator", "Promo requires user doesn't have a paired device but user has one.");
            }
        }
        return e0.b(z14);
    }

    @Override // zd0.e0
    public final String e() {
        ed0.a.f63825a.getClass();
        return "Paired device count: " + ed0.a.f63833i.getValue() + ", registered device count: " + ed0.a.f63831g.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhe0/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
