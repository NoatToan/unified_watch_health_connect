package fq1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq1/a;", "Lfq1/s;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements s {
    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        zk.c cVar = zk.c.f205034a;
        ht.h.f85473a.getClass();
        yt2.a.b bVar = yt2.a.f199649f;
        GarminConnectMobileApp.f28685g.getClass();
        Context contextA = GarminConnectMobileApp.a.a();
        ha0.a aVar = new ha0.a(23);
        ha0.a aVar2 = new ha0.a(24);
        bVar.getClass();
        yt2.a aVar3 = new yt2.a(contextA, "ConnectMobile", new yt2.b(aVar), aVar2, null);
        yt2.c cVar2 = new yt2.c(false, false, 0L, 0, 0L, 0, 0L, 127, null);
        ArrayList arrayListM = x.m(xe0.a.GCPlus.f190415a);
        vf1.f.f177895a.getClass();
        hx2.a[] aVarArrValues = hx2.a.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (hx2.a aVar4 : aVarArrValues) {
            String str = aVar4.f86311a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(aVar4);
        }
        arrayListM.addAll(h0.b1(linkedHashMap.keySet()));
        arrayListM.add("ConnectMobileLiveActivity");
        Unit unit = Unit.INSTANCE;
        fl.b bVar2 = new fl.b(aVar3, cVar2, arrayListM);
        ht.h.f85473a.getClass();
        zk.f[] fVarArr = {bVar2, new bl.b(new ht.g(), context, true)};
        cVar.getClass();
        d0.w(zk.c.f205035b, fVarArr);
        return Unit.INSTANCE;
    }
}
