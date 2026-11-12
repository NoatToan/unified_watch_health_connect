package x90;

import c22.l3;
import gg1.o0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z80.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx90/a;", "", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    static {
        new C3527a(null);
    }

    public static double a(o0 o0Var, k kVar) {
        double d14;
        double d15;
        if (o0Var.a()) {
            d14 = kVar == k.MALE ? 88 : 75;
            l3.f23124b.getClass();
            d15 = 1000;
        } else {
            d14 = kVar == k.MALE ? 195 : 165;
            l3.f23124b.getClass();
            d15 = 453.592d;
        }
        return d14 * d15;
    }

    /* JADX INFO: renamed from: x90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lx90/a$a;", "", "<init>", "()V", "", "DEFAULT_WEIGHT_MALE_STATUTE", "I", "DEFAULT_WEIGHT_FEMALE_STATUTE", "DEFAULT_WEIGHT_MALE_METRIC", "DEFAULT_WEIGHT_FEMALE_METRIC", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3527a {
        public /* synthetic */ C3527a(j jVar) {
            this();
        }

        private C3527a() {
        }
    }
}
