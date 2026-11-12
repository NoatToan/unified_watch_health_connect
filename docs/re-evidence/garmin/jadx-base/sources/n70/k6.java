package n70;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "dismissed", "", "<unused var>", "", "", "Ln80/a;", "<anonymous>", "(Ljava/util/Set;IZ)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetUnlinkedDevicesCardsUseCase$invoke$1", f = "GetUnlinkedDevicesCardsUseCase.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class k6 extends v13.i implements e23.r<Set<? extends String>, Integer, Boolean, t13.d<? super List<? extends n80.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Set f124367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f124368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(i6 i6Var, t13.d<? super k6> dVar) {
        super(4, dVar);
        this.f124368c = i6Var;
    }

    @Override // e23.r
    public final Object invoke(Set<? extends String> set, Integer num, Boolean bool, t13.d<? super List<? extends n80.a>> dVar) {
        num.intValue();
        bool.getClass();
        k6 k6Var = new k6(this.f124368c, dVar);
        k6Var.f124367b = set;
        return k6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Set set = this.f124367b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124366a;
        if (i14 == 0) {
            o13.r.b(obj);
            m80.a aVar2 = this.f124368c.f124288a;
            this.f124367b = set;
            this.f124366a = 1;
            obj = aVar2.g(this);
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            n80.a aVar3 = (n80.a) obj2;
            if (!set.contains(aVar3.f124927a)) {
                m80.a.C2223a c2223a = m80.a.f117132a;
                String str = aVar3.f124929c;
                c2223a.getClass();
                ic0.b bVar = (ic0.b) KoinJavaComponent.get$default(ic0.b.class, null, null, 6, null);
                if (!zb0.u0.t(str) && !bVar.d(str)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }
}
