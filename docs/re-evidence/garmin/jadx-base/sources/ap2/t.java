package ap2;

import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$loadPaymentCardsNotInDevice$1", f = "FitPayAddCardViewModel.kt", l = {489}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f11784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, h hVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f11783c = str;
        this.f11784d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f11783c, this.f11784d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ep2.b bVar;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11782b;
        h hVar = this.f11784d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger loggerA = h.a.a(h.f11695y);
                String str = this.f11783c;
                com.airbnb.lottie.animation.keyframe.a.w("loadPaymentCardsNotInDevice: deviceId: ", str, loggerA);
                List<ep2.b> listD = hVar.f11714r.d();
                if (listD != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : listD) {
                        if (((ep2.b) obj2).d().contains(ep2.a.NFC)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                g1 g1Var = hVar.E4().f205979a;
                this.f11781a = arrayList;
                this.f11782b = 1;
                obj = g1Var.L(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                arrayList2 = arrayList;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList2 = this.f11781a;
                o13.r.b(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                zo2.a aVar2 = (zo2.a) obj3;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((ep2.b) next).getCardType(), aVar2.getCardType()));
                    bVar = (ep2.b) next;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList3.add(obj3);
                }
            }
            hVar.f11708l.j(arrayList3);
        } catch (Exception e4) {
            e0.v("loadPaymentCardsNotInDevice: ", e4.getMessage(), h.a.a(h.f11695y));
            hVar.f11708l.j(j0.f134944a);
        }
        return Unit.INSTANCE;
    }
}
