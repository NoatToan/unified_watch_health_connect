package ol1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.shareableevents.ShareableEventViewModel$onAddToCalendarClicked$1$1", f = "ShareableEventViewModel.kt", l = {303}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.shareableevents.a f132861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f132862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.apps.connectmobile.shareableevents.a aVar, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f132861b = aVar;
        this.f132862c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f132861b, this.f132862c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132860a;
        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = this.f132861b;
        if (i14 == 0) {
            r.b(obj);
            zx.f fVar = aVar2.f44226c;
            if (fVar == null) {
                s.m("calendarRepository");
                throw null;
            }
            this.f132860a = 1;
            obj = f0.J(fVar, new zx.j(fVar, this.f132862c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            aVar2.A4();
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }
}
