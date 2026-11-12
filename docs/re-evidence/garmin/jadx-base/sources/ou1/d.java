package ou1;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import p005kotlin.Metadata;
import r53.c2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lou1/d;", "", "Lru1/b;", "exerciseListRepository", "Lru1/d;", "exerciseTranslationsRepository", "<init>", "(Lru1/b;Lru1/d;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ru1.b f134023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru1.d f134024b;

    static {
        new a(null);
    }

    public d(ru1.b bVar, ru1.d dVar) {
        bVar.getClass();
        dVar.getClass();
        this.f134023a = bVar;
        this.f134024b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.garmin.android.apps.connectmobile.repcounting.model.d[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final Serializable a(x0 x0Var, com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr, v13.c cVar) {
        e eVar;
        ?? r14;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f134043d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f134043d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objA = eVar.f134041b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f134043d;
        if (i15 == 0) {
            o13.r.b(objA);
            eVar.f134040a = dVarArr;
            eVar.f134043d = 1;
            objA = ru1.d.a(this.f134024b, x0Var, eVar);
            if (objA == aVar) {
                r14 = dVarArr;
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArr2 = eVar.f134040a;
            o13.r.b(objA);
            r14 = dVarArr2;
        }
        r14 = dVarArr;
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.a) {
            String strN = fb1.c.n("Could not retrieve Translation For exercises: ", ((v2.a) v2Var).f47385c);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "GetExerciseListWithTranslationUseCase", strN);
            return null;
        }
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        com.garmin.android.apps.connectmobile.repcounting.model.d.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.d.f41101j;
        String str = (String) ((v2.b) v2Var).f47386a;
        bVar.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.d.b.c(r14, str);
        return r14;
    }

    public final c2 b(x0 x0Var, boolean z14) {
        return new c2(new f(this, x0Var, z14, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lou1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
