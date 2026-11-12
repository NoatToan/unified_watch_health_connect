package ne0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lje0/f;", "<anonymous>", "(Lo53/b0;)Lje0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.domain.UpdateDogUseCase$invoke$2", f = "UpdateDogUseCase.kt", l = {19, 24}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super je0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f125456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe0.j f125457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f125458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, pe0.j jVar, long j8, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f125456b = i0Var;
        this.f125457c = jVar;
        this.f125458d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f125456b, this.f125457c, this.f125458d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super je0.f> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r2 == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objJ;
        Object objA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125455a;
        pe0.j jVar = this.f125457c;
        i0 i0Var = this.f125456b;
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
            return (je0.f) objA;
        }
        o13.r.b(obj);
        i0Var.getClass();
        String str = jVar.f137451a;
        String str2 = !d53.w.J(str) ? str : null;
        je0.g gVar = jVar.f137454d;
        String str3 = gVar != null ? gVar.f98524a : null;
        pe0.d dVar = jVar.f137452b;
        Long lValueOf = dVar != null ? Long.valueOf(dVar.f137416a) : null;
        i53.c<pe0.d> cVar = jVar.f137453c;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<pe0.d> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().f137416a));
        }
        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
        String str4 = jVar.f137457g;
        String str5 = !d53.w.J(str4) ? str4 : null;
        String str6 = jVar.f137458h;
        String str7 = !d53.w.J(str6) ? str6 : null;
        double d14 = jVar.f137456f;
        je0.s sVar = new je0.s(str2, (String) null, str3, lValueOf, arrayList2, jVar.f137455e, d14 > 0.0d ? Double.valueOf(d14) : null, str5, str7, 2, (p005kotlin.jvm.internal.j) null);
        me0.w wVar = i0Var.f125478a;
        this.f125455a = 1;
        wVar.getClass();
        objJ = com.garmin.android.apps.connectmobile.f0.J(wVar, new me0.t(wVar, this.f125458d, sVar, null), this);
        if (objJ != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                q2.u("Failed to update dog");
                return null;
            }
            u0.r();
            return null;
        }
        je0.f fVar = (je0.f) ((v2.b) v2Var).f47386a;
        if (fVar.f98502b == null) {
            return fVar;
        }
        boolean z14 = !jVar.f137459i;
        this.f125455a = 2;
        objA = i0.a(i0Var, fVar, z14, this);
    }
}
