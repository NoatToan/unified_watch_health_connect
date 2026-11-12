package bn;

import am.b2;
import b71.i;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;
import zy0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbn/b;", "Lbn/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lam/b2;", "activitiesAPI", "Lzy0/b;", "cachedDataSource", "Lf12/l;", "userSettings", "<init>", "(Lam/b2;Lzy0/b;Lf12/l;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements bn.a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f18964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy0.b f18965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f18966c;

    static {
        new a(null);
    }

    public b(b2 b2Var, zy0.b bVar, l lVar) {
        b2Var.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f18964a = b2Var;
        this.f18965b = bVar;
        this.f18966c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // bn.a
    public final Object a(long j8, v13.c cVar, boolean z14) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f18969c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f18969c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object objB = cVar3.f18967a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f18969c;
        if (i15 == 0) {
            r.b(objB);
            String str = zy0.a.GET_HISTORICAL_ACTIVITY_TYPES_URL.f207440a;
            d dVar = new d();
            e eVar = new e(this, null);
            Long l14 = new Long(j8);
            cVar3.f18969c = 1;
            objB = zy0.b.b(this.f18965b, eVar, dVar, z14, str, l14, cVar3, 32);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        p pVar = (p) objB;
        zy0.c cVar4 = pVar.f207460b;
        v2<T> v2Var = pVar.f207459a;
        if (cVar4 == zy0.c.SERVER) {
            String strF = i.f("getHistoricalActivityTypes: network call: ", v2Var);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "HistoricalActivityTypesRepository", strF);
            l lVar = this.f18966c;
            lVar.J(false);
            lVar.H0(true);
        }
        return v2Var;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbn/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
