package zd0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lc80/q;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl$getActiveGCPlusFeatures$2", f = "SubscriptionProvider.kt", l = {339}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.l<t13.d<? super List<? extends c80.q>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204081a;

    public m1(t13.d<? super m1> dVar) {
        super(1, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m1(dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super List<? extends c80.q>> dVar) {
        return new m1(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204081a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f204081a = 1;
            obj = xx2.b.a(this);
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
        List<yx2.h> list = (List) ((xx2.e) obj).f192598a;
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (yx2.h hVar : list) {
            c80.q.a aVar2 = c80.q.f25532b;
            String str = hVar.f200084a;
            aVar2.getClass();
            c80.q qVarA = c80.q.a.a(str);
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return arrayList;
    }
}
