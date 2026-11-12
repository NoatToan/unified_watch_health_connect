package o31;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lht2/g;", "<anonymous>", "(Lo53/b0;)Lht2/g;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager$getConfig$2", f = "InAppUpdateManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super ht2.g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f128789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f128790b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f128790b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f128790b, dVar);
        gVar.f128789a = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super ht2.g> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        d dVar = this.f128790b;
        try {
            int i14 = q.f128596b;
            String strE = dVar.f128764a.e("in_app_update_config");
            if (strE == null || w.J(strE)) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "InAppUpdateManager", "Remote config -> In-app update config is empty or null, using default config enabled=false");
                bVar = new ht2.g(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 254, (j) null);
            } else {
                ht2.g.Companion companion = ht2.g.INSTANCE;
                companion.getClass();
                n63.b.a aVar3 = n63.b.f123892d;
                aVar3.getClass();
                bVar = (ht2.g) aVar3.c(companion.serializer(), strE);
            }
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB == null) {
            return bVar;
        }
        String strP = am.j.p("Remote config -> Failed to get in-app update config ", thB);
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var2, "InAppUpdateManager", strP);
        return new ht2.g(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 254, (j) null);
    }
}
