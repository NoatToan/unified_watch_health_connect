package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lje0/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.CreateDogUseCase$invoke$2", f = "CreateDogUseCase.kt", l = {19, 24}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends je0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f125429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe0.c f125430c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, pe0.c cVar2, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f125429b = cVar;
        this.f125430c = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f125429b, this.f125430c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends je0.f>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        if (r2 == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t13.d dVar;
        String str;
        Object objJ;
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125428a;
        pe0.c cVar = this.f125430c;
        c cVar2 = this.f125429b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objJ = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = obj;
            }
            return (v2) objA;
        }
        o13.r.b(obj);
        cVar2.getClass();
        String str2 = cVar.f137406a;
        pe0.d dVar2 = cVar.f137407b;
        Long lValueOf = dVar2 != null ? Long.valueOf(dVar2.f137416a) : null;
        i53.c<pe0.d> cVar3 = cVar.f137408c;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar3, 10));
        Iterator<pe0.d> it = cVar3.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().f137416a));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        String str3 = cVar.f137409d;
        String str4 = !d53.w.J(str3) ? str3 : null;
        Boolean bool = cVar.f137410e;
        double d14 = cVar.f137411f;
        Double dValueOf = d14 > 0.0d ? Double.valueOf(d14) : null;
        String str5 = cVar.f137412g;
        String str6 = !d53.w.J(str5) ? str5 : null;
        String str7 = cVar.f137413h;
        if (d53.w.J(str7)) {
            dVar = null;
            str = null;
        } else {
            str = str7;
            dVar = null;
        }
        je0.e eVar = new je0.e(str2, lValueOf, arrayList, str4, bool, dValueOf, str6, str);
        me0.w wVar = cVar2.f125432a;
        this.f125428a = 1;
        wVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.c(wVar, eVar, dVar), this);
        if (objJ != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            je0.f fVar = (je0.f) ((v2.b) v2Var).f47386a;
            if (fVar.f98502b != null) {
                boolean z14 = !cVar.f137414i;
                this.f125428a = 2;
                objA = c.a(cVar2, fVar, z14, this);
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return v2Var;
    }
}
