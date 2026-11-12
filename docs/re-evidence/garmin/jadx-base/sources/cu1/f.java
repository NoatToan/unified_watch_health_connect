package cu1;

import androidx.lifecycle.t0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lfu1/h;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.dashboard.ArticleContentViewModel$getArticleDetails$1", f = "ArticleContentActivity.kt", l = {182, SyslogConstants.LOG_LOCAL7, SyslogConstants.LOG_LOCAL7, 187}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<t0<g3<? extends fu1.h>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f55666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.a f55667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f55669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f55670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f55671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f55670e = eVar;
        this.f55671f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f55670e, this.f55671f, dVar);
        fVar.f55669d = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends fu1.h>> t0Var, t13.d<? super Unit> dVar) {
        return ((f) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r8.emit(r0, r16) == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r2.emit(r0, r16) == r3) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g3.a aVar;
        Object objAwait;
        t0 t0Var;
        t0 t0Var2 = (t0) this.f55669d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55668c;
        String str = this.f55671f;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f55669d = t0Var2;
                this.f55668c = 1;
                if (t0Var2.emit(g3VarC, this) != aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                aVar = this.f55667b;
                t0 t0Var3 = this.f55666a;
                o13.r.b(obj);
                t0Var = t0Var3;
                objAwait = obj;
                aVar.getClass();
                g3 g3VarD = g3.a.d(objAwait);
                this.f55669d = t0Var2;
                this.f55666a = null;
                this.f55667b = null;
                this.f55668c = 3;
            } else if (i14 == 3) {
                o13.r.b(obj);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            aVar = g3.f35298f;
            o53.r<fu1.h> rVarH = this.f55670e.f55663a.H(str);
            this.f55669d = t0Var2;
            this.f55666a = t0Var2;
            this.f55667b = aVar;
            this.f55668c = 2;
            objAwait = rVarH.await(this);
            if (objAwait != aVar2) {
                t0Var = t0Var2;
                aVar.getClass();
                g3 g3VarD2 = g3.a.d(objAwait);
                this.f55669d = t0Var2;
                this.f55666a = null;
                this.f55667b = null;
                this.f55668c = 3;
            }
        } catch (BizOperationException e4) {
            String str2 = "Failed getArticleDetails() articleId[" + str + "]: " + e4;
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "ArticleContentViewModel", str2);
            g3 g3VarA = g3.a.a(g3.f35298f, null, e4, null, null, 13);
            this.f55669d = null;
            this.f55666a = null;
            this.f55667b = null;
            this.f55668c = 4;
        }
        return aVar2;
    }
}
