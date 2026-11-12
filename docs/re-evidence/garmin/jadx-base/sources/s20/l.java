package s20;

import gg1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.l0;
import p13.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls20/l;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f156021a = new l();

    private l() {
    }

    public static k a() {
        return new k((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    public static ArrayList b() {
        Object next;
        k kVarA = a();
        w13.c cVar = fn0.c.f72172o;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = cVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fn0.c cVar2 = (fn0.c) it.next();
            String str = g22.n.d(cVar2.f72173a) ? cVar2.f72173a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set<String> setG1 = h0.g1(arrayList);
        Set<String> setD0 = kVarA.f156020a.D0("KeyHazardTypes", setG1);
        if (setD0 != null) {
            setG1 = setD0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : setG1) {
            fn0.c.f72162e.getClass();
            str2.getClass();
            Iterator<T> it3 = fn0.c.f72172o.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((fn0.c) next).f72173a, str2));
            fn0.c cVar3 = (fn0.c) next;
            if (cVar3 != null) {
                arrayList2.add(cVar3);
            }
        }
        if (((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).c()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((fn0.c) obj) != fn0.c.ROAD_CLOSURE) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public static ArrayList c() {
        k kVarA = a();
        Set<String> setM0 = ((h) KoinJavaComponent.get$default(h.class, null, null, 6, null)).c() ? u.m0(new String[]{com.garmin.android.apps.connectmobile.courses.model.h.f32947e.f32965a, com.garmin.android.apps.connectmobile.courses.model.h.f32948f.f32965a, com.garmin.android.apps.connectmobile.courses.model.h.f32949g.f32965a, com.garmin.android.apps.connectmobile.courses.model.h.f32950h.f32965a}) : l0.f134950a;
        Set<String> setD0 = kVarA.f156020a.D0("KeyPointOfInterestTypes", setM0);
        if (setD0 != null) {
            setM0 = setD0;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : setM0) {
            com.garmin.android.apps.connectmobile.courses.model.h.f32946d.getClass();
            com.garmin.android.apps.connectmobile.courses.model.h hVarA = com.garmin.android.apps.connectmobile.courses.model.h.a.a(str);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return arrayList;
    }

    public static v0 d() {
        v0.a aVar = v0.T;
        String strName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name();
        aVar.getClass();
        return v0.a.a(strName);
    }
}
