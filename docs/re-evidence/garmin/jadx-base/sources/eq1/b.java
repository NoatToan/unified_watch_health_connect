package eq1;

import android.content.Context;
import e23.p;
import fq1.s;
import java.util.Iterator;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.startup.init.GCMStartupInitializer$create$1", f = "GCMStartupInitializer.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f65040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f65041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f65044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d<? super b> dVar) {
        super(2, dVar);
        this.f65044e = context;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f65044e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        Context context;
        Iterator it;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f65043d;
        if (i15 == 0) {
            r.b(obj);
            fq1.i.f73249d.getClass();
            Iterator it3 = fq1.i.a.a().iterator();
            i14 = 0;
            context = this.f65044e;
            it = it3;
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f65042c;
            it = this.f65041b;
            context = this.f65040a;
            r.b(obj);
        }
        while (it.hasNext()) {
            s sVar = (s) it.next();
            this.f65040a = context;
            this.f65041b = it;
            this.f65042c = i14;
            this.f65043d = 1;
            if (sVar.b(context, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
