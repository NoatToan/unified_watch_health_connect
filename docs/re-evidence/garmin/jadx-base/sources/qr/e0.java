package qr;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$fetchSticker$1$2", f = "ActivityDetailsViewModel.kt", l = {6044}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f146177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps.q f146178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<fs.e> f146179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(t tVar, Context context, ps.q qVar, List<fs.e> list, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f146176b = tVar;
        this.f146177c = context;
        this.f146178d = qVar;
        this.f146179e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f146176b, this.f146177c, this.f146178d, this.f146179e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146175a;
        t tVar = this.f146176b;
        if (i14 == 0) {
            o13.r.b(obj);
            kr.j jVar = tVar.f146524h2;
            this.f146175a = 1;
            obj = jVar.a(this.f146177c, this.f146178d, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            List list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            if (list != null && !list.isEmpty()) {
                List<fs.e> list2 = this.f146179e;
                list2.addAll(list);
                r53.p2 p2Var = tVar.f146512d2;
                com.garmin.android.apps.connectmobile.g3.f35298f.getClass();
                p2Var.k(null, com.garmin.android.apps.connectmobile.g3.a.d(list2));
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            tVar.f146512d2.k(null, com.garmin.android.apps.connectmobile.g3.a.a(com.garmin.android.apps.connectmobile.g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
