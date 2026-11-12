package my0;

import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import gy0.q1;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoViewModel$saveReorderedList$1", f = "EpicPhotoViewModel.kt", l = {38, 45}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<j<? super g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f121465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f121467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, List<String> list, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f121465c = dVar;
        this.f121466d = str;
        this.f121467e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f121465c, this.f121466d, this.f121467e, dVar);
        cVar.f121464b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super g3<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L19;
     */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g3 g3VarA;
        j jVar = (j) this.f121464b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121463a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        q1 q1Var = (q1) this.f121465c.f121469b.getValue();
        this.f121464b = jVar;
        this.f121463a = 1;
        obj = q1Var.a(this.f121466d, this.f121467e, this);
        if (obj != aVar) {
        }
        return aVar;
        if (((Boolean) obj).booleanValue()) {
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            g3VarA = g3.a.d(unit);
        } else {
            g3VarA = g3.a.a(g3.f35298f, "Epic Error Reordering Photos", new Exception("Epic Error Reordering Photos"), null, null, 12);
        }
        this.f121464b = null;
        this.f121463a = 2;
    }
}
