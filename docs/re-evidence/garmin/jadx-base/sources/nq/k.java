package nq;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.activities.newmodel.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.t;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnq/k;", "Landroidx/lifecycle/u1;", "", "activityId", "Lam/x0;", "activityType", "", "isWheelchairEnabled", "<init>", "(JLam/x0;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f126916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f126917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f126919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final am.m f126920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ou1.d f126921f;

    public k(long j8, x0 x0Var, boolean z14) {
        x0Var.getClass();
        this.f126916a = j8;
        this.f126917b = x0Var;
        this.f126918c = z14;
        this.f126919d = o13.m.b(new n61.h(25));
        this.f126920e = am.m.a.a(am.m.f4066e, 7);
        this.f126921f = (ou1.d) KoinJavaComponent.get$default(ou1.d.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    public static final void x4(k kVar, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, y0 y0Var) {
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        kVar.getClass();
        List<c0> listF = fVar.f();
        if (listF != null) {
            ArrayList arrayList3 = new ArrayList(y.r(listF, 10));
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                arrayList3.add(((c0) it.next()).f());
            }
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                return;
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                Collection collection = (List) it3.next();
                List list2 = (List) next;
                if (list2 != null) {
                    arrayList2 = new ArrayList(list2);
                } else {
                    arrayList = new ArrayList();
                }
                if (collection != null) {
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    collection = j0.f134944a;
                }
                arrayList2.addAll(collection);
                next = arrayList2;
            }
            list = (List) next;
            if (list == null) {
                list = j0.f134944a;
            }
        } else {
            list = j0.f134944a;
        }
        List list3 = list;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list3) {
            if (((com.garmin.android.apps.connectmobile.repcounting.model.e) obj).e0()) {
                arrayList4.add(obj);
            }
        }
        w9.a aVarA = v1.a(kVar);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new j(kVar, list3, arrayList4, y0Var, fVar, null), 2);
    }
}
