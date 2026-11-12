package vl2;

import java.util.ArrayList;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvl2/c;", "", "<init>", "()V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f178714a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f178715b = LoggerFactory.getLogger("ApduTransferPackageParser");

    private c() {
    }

    public static void a(ArrayList arrayList) {
        e eVar;
        arrayList.getClass();
        ArrayList arrayListZ = h0.Z(arrayList);
        if (arrayListZ.isEmpty()) {
            return;
        }
        d dVar = (d) h0.d0(arrayListZ);
        String str = dVar != null ? dVar.f178716a : "";
        Object obj = null;
        if (arrayListZ.size() == arrayList.size()) {
            for (Object obj2 : arrayListZ) {
                if (((d) obj2).f178717b != e.SUCCESS) {
                    obj = obj2;
                    break;
                }
            }
            d dVar2 = (d) obj;
            eVar = dVar2 != null ? dVar2.f178717b : e.SUCCESS;
        } else {
            for (Object obj3 : arrayListZ) {
                if (((d) obj3).f178717b != e.SUCCESS) {
                    obj = obj3;
                    break;
                }
            }
            d dVar3 = (d) obj;
            eVar = dVar3 != null ? dVar3.f178717b : e.ERROR;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            d0.v(arrayList2, ((d) it.next()).f178718c);
        }
        new d(str, eVar, arrayList2);
    }
}
