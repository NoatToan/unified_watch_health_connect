package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Li53/f;", "Lpe0/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.GetBreedsUseCase$invoke$2", f = "GetBreedsUseCase.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends i53.f<? extends pe0.d>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f125515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f125516c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((pe0.d) t7).f137417b, ((pe0.d) t14).f137417b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, String str, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f125515b = tVar;
        this.f125516c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f125515b, this.f125516c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends i53.f<? extends pe0.d>>> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125514a;
        if (i14 == 0) {
            o13.r.b(obj);
            me0.w wVar = this.f125515b.f125517a;
            this.f125514a = 1;
            wVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.k(wVar, this.f125516c, null), this);
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
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        Map map = (Map) bVar.f47386a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            String str = (String) entry.getValue();
            str.getClass();
            arrayList.add(new pe0.d(jLongValue, new d53.k("[^\\p{L}\\p{N}_]").f(str, "")));
        }
        return new v2.b(i53.a.j(p13.h0.N0(arrayList, new a())), bVar.f47387b, null, null, 12, null);
    }
}
