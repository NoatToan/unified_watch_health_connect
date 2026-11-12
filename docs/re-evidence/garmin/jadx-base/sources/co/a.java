package co;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lco/a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static boolean a(i53.c cVar) {
        cVar.getClass();
        boolean z14 = false;
        if (!cVar.isEmpty()) {
            Iterator<E> it = cVar.iterator();
            while (it.hasNext()) {
                jo.c cVar2 = (jo.c) it.next();
                if (cVar2 instanceof jo.c.a.C1917c) {
                    jo.c.a.C1917c c1917c = (jo.c.a.C1917c) cVar2;
                    if (c1917c.f99709f != null || c1917c.f99710g != null) {
                        z14 = true;
                        break;
                    }
                } else if (cVar2 instanceof jo.c.a.e) {
                    jo.c.a.e eVar = (jo.c.a.e) cVar2;
                    if (eVar.f99717e != null || eVar.f99718f != null) {
                        z14 = true;
                        break;
                    }
                } else if (cVar2 instanceof jo.c.a.f) {
                    jo.c.a.f fVar = (jo.c.a.f) cVar2;
                    if (fVar.f99723f != null || fVar.f99724g != null) {
                        z14 = true;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return !z14;
    }
}
