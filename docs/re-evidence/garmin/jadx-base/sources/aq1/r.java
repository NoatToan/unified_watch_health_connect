package aq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lq92/v;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl$grantConnectPrivacyConsent$2", f = "StartupChecksRepositoryImpl.kt", l = {98, 101, 102}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends q92.v>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.v f12422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s92.g f12425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s92.g gVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f12425d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f12425d, dVar);
        rVar.f12424c = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends q92.v>> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r10.h(r9) == r1) goto L24;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q92.v vVar;
        o53.b0 b0Var = (o53.b0) this.f12424c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12423b;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
            this.f12424c = b0Var;
            this.f12423b = 1;
            obj = oVar.p(xVar, this.f12425d, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            vVar = this.f12422a;
            o13.r.b(obj);
            p92.o oVar2 = p92.o.f136619a;
            this.f12424c = null;
            this.f12422a = vVar;
            this.f12423b = 3;
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vVar = this.f12422a;
            o13.r.b(obj);
        }
        return new v2.b(vVar, 200, null, null, 12, null);
        q92.v vVar2 = (q92.v) obj;
        if (vVar2 == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StartupChecksRepository", "GRANT USER CONNECT PRIVACY CONSENT -> server call failed");
            return new v2.a(new Exception("GRANT USER CONNECT PRIVACY CONSENT -> server call failed"), null, null, 6, null);
        }
        p92.o oVar3 = p92.o.f136619a;
        q92.x xVar2 = q92.x.DI_CONNECT_UPLOAD;
        this.f12424c = null;
        this.f12422a = vVar2;
        this.f12423b = 2;
        if (oVar3.c(xVar2, this) != aVar) {
            vVar = vVar2;
            p92.o oVar4 = p92.o.f136619a;
            this.f12424c = null;
            this.f12422a = vVar;
            this.f12423b = 3;
        }
        return aVar;
    }
}
