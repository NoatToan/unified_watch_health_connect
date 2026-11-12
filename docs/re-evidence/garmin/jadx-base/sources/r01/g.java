package r01;

import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.u;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr01/g;", "Lfe0/g;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements fe0.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f148823i;

    static {
        new a(null);
    }

    public g(l lVar) {
        lVar.getClass();
        this.f148823i = lVar;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25489n;
        if (bool != null) {
            return e0.b(u.z(this.f148823i.t1(), "NUTRITION") == bool.booleanValue());
        }
        a2 a2Var = a2.PROMOTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "PromoNutritionInTabBarValidator", "conditionsProvider.isNutritionInTabBar == null");
        return l0.SHOW;
    }

    @Override // zd0.e0
    public final String e() {
        return com.airbnb.lottie.animation.keyframe.a.h("isNutritionInTabBar ", u.z(this.f148823i.t1(), "NUTRITION"));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr01/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
