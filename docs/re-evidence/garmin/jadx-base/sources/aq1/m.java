package aq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls92/g;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl$getConnectPrivacyConsent$2", f = "StartupChecksRepositoryImpl.kt", l = {76, 82}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s92.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f12412c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f12412c, dVar);
        mVar.f12411b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s92.g>> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r13 == r1) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f12411b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12410a;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_PRIVACY;
            this.f12411b = b0Var;
            this.f12410a = 1;
            obj = oVar.c(xVar, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        s92.g gVar = (s92.g) obj;
        if (gVar != null) {
            return new v2.b(gVar, 200, null, null, 12, null);
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "StartupChecksRepository", "GET USER CONNECT PRIVACY CONSENT TEXT -> server call failed");
        return new v2.a(new Exception("GET USER CONNECT PRIVACY CONSENT TEXT -> server call failed"), null, null, 6, null);
        if (((q92.v) obj) == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "StartupChecksRepository", "GET USER CONNECT PRIVACY CONSENT -> server call failed");
            return new v2.a(new Exception("GET USER CONNECT PRIVACY CONSENT -> server call failed"), null, null, 6, null);
        }
        if (!this.f12412c.d()) {
            return new v2.b(null, 200, null, null, 12, null);
        }
        p92.o oVar2 = p92.o.f136619a;
        q92.x xVar2 = q92.x.DI_CONNECT_PRIVACY;
        this.f12411b = b0Var;
        this.f12410a = 2;
        obj = oVar2.f(xVar2, Locale.getDefault(), this);
    }
}
