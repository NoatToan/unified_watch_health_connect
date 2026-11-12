package gb1;

import c83.a0;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyListViewModel$getPregnancyList$1", f = "PregnancyListViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f76704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f76704b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f76704b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76703a;
        s sVar = this.f76704b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                this.f76703a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.i(this);
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
            a0 a0Var = (a0) obj;
            List list = (List) a0Var.f25746b;
            if (list != null) {
                i52.a aVar2 = i52.a.f91796a;
                boolean zIsEmpty = true ^ list.isEmpty();
                aVar2.getClass();
                i52.a.s(zIsEmpty);
                if (list.isEmpty()) {
                    sVar.f76705a = null;
                    sVar.f76706b = null;
                } else {
                    ArrayList arrayListZ = h0.Z(list);
                    s.x4(sVar, arrayListZ);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListZ) {
                        if (!p005kotlin.jvm.internal.s.g((db1.m) obj2, sVar.f76705a)) {
                            arrayList.add(obj2);
                        }
                    }
                    sVar.f76706b = arrayList;
                }
            }
            sVar.y4().j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
        } catch (Throwable th3) {
            sVar.y4().j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
