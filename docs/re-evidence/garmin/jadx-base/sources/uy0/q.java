package uy0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luy0/q;", "", "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "Lak0/a;", "gcPlusDelegate", "<init>", "(Lcom/garmin/android/apps/connectmobile/b1;Lak0/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f173279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak0.a f173280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty0.b f173281c;

    public q(com.garmin.android.apps.connectmobile.b1 b1Var, ak0.a aVar) {
        b1Var.getClass();
        aVar.getClass();
        this.f173279a = b1Var;
        this.f173280b = aVar;
        this.f173281c = ty0.b.f166880i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(v13.c cVar) {
        p pVar;
        ArrayList arrayList;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f173277d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f173277d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f173275b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f173277d;
        if (i15 == 0) {
            o13.r.b(obj);
            ArrayList arrayListM = p13.x.m(ty0.b.U2, ty0.b.V2, ty0.b.W2, ty0.b.f166871f3, ty0.b.f166874g3, ty0.b.f166877h3);
            pVar.f173274a = arrayListM;
            pVar.f173277d = 1;
            Object objG = this.f173280b.g(pVar);
            if (objG == aVar) {
                return aVar;
            }
            arrayList = arrayListM;
            obj = objG;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = pVar.f173274a;
            o13.r.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            arrayList.remove(ty0.b.f166871f3);
        }
        if (!this.f173279a.r0()) {
            arrayList.remove(ty0.b.f166874g3);
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.e(this.f173281c, (ty0.b) it.next(), null, false, 12, null));
        }
        return arrayList2;
    }
}
