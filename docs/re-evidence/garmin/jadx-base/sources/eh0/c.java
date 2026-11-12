package eh0;

import b63.o;
import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import ih0.s;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Leh0/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "Leh0/b;", "Leh0/a;", "apiService", "<init>", "(Leh0/a;)V", "a", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f0, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0.a f64025a;

    static {
        new a(null);
    }

    public /* synthetic */ c(eh0.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? (eh0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, eh0.a.class, new h.a[0], null, null, null, 88) : aVar);
    }

    @Override // eh0.b
    public final Object a(o oVar, s.g gVar) {
        return f0.J(this, new g(this, oVar, null), gVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eh0.b
    public final Object b(o oVar, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f64032c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f64032c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f64030a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f64032c;
        if (i15 == 0) {
            r.b(objJ);
            f fVar = new f(this, oVar, null);
            eVar.f64032c = 1;
            objJ = f0.J(this, fVar, eVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            if (!(bVar.f47386a instanceof dh0.c)) {
                return new v2.b(new dh0.c((String) null, (Integer) null, (Double) null, (Double) null, (Double) null, (dh0.b) null, (String) null, 127, (j) null), bVar.f47387b, null, null, 12, null);
            }
        }
        return v2Var;
    }

    @Override // eh0.b
    public final Object c(o oVar, o oVar2, s.e eVar) {
        return f0.J(this, new d(this, oVar, oVar2, null), eVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Leh0/c$a;", "", "<init>", "()V", "", "WEEKS_IN_YEAR", "Ljava/lang/String;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(eh0.a aVar) {
        aVar.getClass();
        this.f64025a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
