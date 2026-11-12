package aj1;

import androidx.lifecycle.t0;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lsd2/f;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getScreenlessRegisteredDevices$1", f = "NotificationsViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<t0<List<? extends sd2.f>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f3467c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f3467c, dVar);
        nVar.f3466b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends sd2.f>> t0Var, t13.d<? super Unit> dVar) {
        return ((n) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        t0 t0Var = (t0) this.f3466b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3465a;
        if (i14 == 0) {
            r.b(obj);
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            if (arrayListD != null) {
                arrayList = new ArrayList();
                for (Object obj2 : arrayListD) {
                    if (this.f3467c.f3489j.a((sd2.f) obj2)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = j0.f134944a;
            }
            this.f3466b = null;
            this.f3465a = 1;
            if (t0Var.emit(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
