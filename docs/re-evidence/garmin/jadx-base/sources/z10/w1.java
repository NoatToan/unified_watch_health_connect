package z10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentViewModel$getChildIncompleteConsents$1", f = "DataConsentViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class w1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f201283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f201284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z1 z1Var, long j8, t13.d<? super w1> dVar) {
        super(2, dVar);
        this.f201283b = z1Var;
        this.f201284c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w1(this.f201283b, this.f201284c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        s1 s1Var;
        ArrayList arrayList;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201282a;
        z1 z1Var = this.f201283b;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var = z1Var.f201346g;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, s1.a((s1) value, true, false, false, false, null, null, 62)));
            p92.o oVar = p92.o.f136619a;
            s92.l lVar = new s92.l(String.valueOf(this.f201284c));
            this.f201282a = 1;
            obj = oVar.j(true, lVar, this);
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
        List list = (List) obj;
        if (list == null) {
            r53.p2 p2Var2 = z1Var.f201346g;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, s1.a((s1) value3, false, false, false, false, null, null, 62)));
        } else {
            a2 a2Var = (a2) z1Var.f201345f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (com.garmin.android.apps.connectmobile.consent.e.f32282a.contains(((q92.v) obj2).f143783a)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                q92.x xVar = ((q92.v) obj3).f143783a;
                if (xVar != q92.x.DI_CONNECT_LIVETRACK || a2Var == null || a2Var.f200883a) {
                    if (xVar != q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN || a2Var == null || a2Var.f200884b) {
                        if (xVar != q92.x.DI_CONNECT_INSIGHTS || a2Var == null || a2Var.f200885c) {
                            if (xVar != q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION || a2Var == null || a2Var.f200886d) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                }
            }
            r53.p2 p2Var3 = z1Var.f201346g;
            do {
                value2 = p2Var3.getValue();
                s1Var = (s1) value2;
                arrayList = new ArrayList(p13.y.r(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((q92.v) it.next()).f143783a);
                }
            } while (!p2Var3.b(value2, s1.a(s1Var, false, false, false, false, null, arrayList, 30)));
        }
        return Unit.INSTANCE;
    }
}
