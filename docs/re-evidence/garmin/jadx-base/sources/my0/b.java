package my0;

import com.garmin.android.apps.connectmobile.g3;
import cy0.o;
import e23.p;
import gy0.f;
import gy0.g;
import gy0.l;
import java.util.List;
import o13.r;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.photos.EpicPhotoViewModel$deleteImages$1", f = "EpicPhotoViewModel.kt", l = {21, 32}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<j<? super g3<? extends Unit>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f121460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<o> f121462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, List<o> list, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f121460c = dVar;
        this.f121461d = str;
        this.f121462e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f121460c, this.f121461d, this.f121462e, dVar);
        bVar.f121459b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(j<? super g3<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
        return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g3 g3VarA;
        j jVar = (j) this.f121459b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121458a;
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
        g gVar = (g) this.f121460c.f121468a.getValue();
        this.f121459b = jVar;
        this.f121458a = 1;
        gVar.getClass();
        obj = c0.e(new f(this.f121462e, gVar, this.f121461d, null), this);
        if (obj != aVar) {
        }
        return aVar;
        l lVar = (l) obj;
        if (!lVar.f80188b.isEmpty()) {
            g3VarA = g3.a.a(g3.f35298f, "Epic Error Deleting Photo", new Exception("Epic Error Deleting Photo"), null, null, 12);
        } else if (lVar.f80187a.isEmpty()) {
            g3VarA = g3.a.a(g3.f35298f, "Epic Error Deleting Photo Failed", new Exception("Epic Error Deleting Photo Failed"), null, null, 12);
        } else {
            g3.a aVar2 = g3.f35298f;
            Unit unit = Unit.INSTANCE;
            aVar2.getClass();
            g3VarA = g3.a.d(unit);
        }
        this.f121459b = null;
        this.f121458a = 2;
    }
}
