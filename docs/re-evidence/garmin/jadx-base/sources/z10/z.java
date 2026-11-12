package z10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowViewModel$getChildIncompleteConsents$1", f = "ChildConsentsFlowViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f201330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f201331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f201332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j8, b0 b0Var, String str, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f201330b = j8;
        this.f201331c = b0Var;
        this.f201332d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f201330b, this.f201331c, this.f201332d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        r53.p2 p2Var;
        Object value;
        Object next;
        Object next2;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201329a;
        if (i14 == 0) {
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            s92.l lVar = new s92.l(String.valueOf(this.f201330b));
            this.f201329a = 1;
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
        b0 b0Var = this.f201331c;
        if (list == null) {
            r53.p2 p2Var2 = b0Var.f200892b;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, c0.ERROR));
        } else {
            boolean zIsEmpty = list.isEmpty();
            String str = this.f201332d;
            if (zIsEmpty) {
                b0Var.getClass();
                arrayList = new ArrayList();
                if (str != null && ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).c(str)) {
                    arrayList.add(c0.PRIVACY_POLICY);
                }
                arrayList.addAll(p13.x.k(c0.STORAGE_AND_PROCESSING_CONSENT, c0.PRODUCT_IMPROVEMENT, c0.END_FLOW));
                b0Var.f200891a = arrayList;
                p2Var = b0Var.f200892b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, (c0) p13.h0.b0(b0Var.f200891a)));
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (q92.c.a((q92.v) it.next())) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            q92.v vVar = (q92.v) obj2;
                            if (q92.c.a(vVar) || (vVar.f143783a == q92.x.DI_CONNECT_UPLOAD && vVar.f143785c != q92.u.CUSTOMER)) {
                                arrayList2.add(obj2);
                            }
                        }
                        b0Var.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (((q92.v) next).f143783a != q92.x.DI_CONNECT_PRIVACY);
                        q92.v vVar2 = (q92.v) next;
                        Iterator it4 = arrayList2.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                        } while (((q92.v) next2).f143783a != q92.x.DI_CONNECT_UPLOAD);
                        q92.v vVar3 = (q92.v) next2;
                        if (vVar2 != null || (str != null && str.length() != 0 && ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).c(str))) {
                            arrayList3.add(c0.PRIVACY_POLICY);
                        }
                        if (vVar3 == null) {
                            arrayList3.add(c0.PRODUCT_IMPROVEMENT);
                            arrayList3.add(c0.END_FLOW);
                        } else {
                            arrayList3.add(c0.STORAGE_AND_PROCESSING_CONSENT);
                            if (!arrayList2.isEmpty()) {
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    if (((q92.v) it5.next()).f143783a == q92.x.DI_CONNECT_LIVETRACK) {
                                        arrayList3.add(c0.LIVETRACK_CONSENT_NOTICE);
                                        arrayList3.add(c0.LIVETRACK_CONSENT);
                                        break;
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it6 = arrayList2.iterator();
                                while (it6.hasNext()) {
                                    if (((q92.v) it6.next()).f143783a == q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN) {
                                        arrayList3.add(c0.COACH_CONSENT);
                                        break;
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    if (((q92.v) it7.next()).f143783a == q92.x.DI_CONNECT_INSIGHTS) {
                                        arrayList3.add(c0.INSIGHT_CONSENT);
                                        break;
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    if (((q92.v) it8.next()).f143783a == q92.x.DI_CONNECT_AUTO_ACTIVITY_DETECTION) {
                                        arrayList3.add(c0.AUTO_DETECTION_ACTIVITY);
                                        break;
                                    }
                                }
                            }
                            arrayList3.add(c0.PRODUCT_IMPROVEMENT);
                            arrayList3.add(c0.END_FLOW);
                        }
                        b0Var.f200891a = arrayList3;
                        r53.p2 p2Var3 = b0Var.f200892b;
                        do {
                            value2 = p2Var3.getValue();
                        } while (!p2Var3.b(value2, (c0) p13.h0.b0(b0Var.f200891a)));
                    }
                }
                b0Var.getClass();
                arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(c0.PRIVACY_POLICY);
                }
                arrayList.addAll(p13.x.k(c0.STORAGE_AND_PROCESSING_CONSENT, c0.PRODUCT_IMPROVEMENT, c0.END_FLOW));
                b0Var.f200891a = arrayList;
                p2Var = b0Var.f200892b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, (c0) p13.h0.b0(b0Var.f200891a)));
            }
        }
        return Unit.INSTANCE;
    }
}
