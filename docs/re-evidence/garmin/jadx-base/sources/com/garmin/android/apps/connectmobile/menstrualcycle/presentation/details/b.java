package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c22.h0;
import hx0.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import o53.b0;
import o53.c2;
import o53.e2;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import ww0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/b;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "Lyw0/a;", "repository", "<init>", "(Lyw0/a;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw0.a f38882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<LocalDate, s0> f38884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocalDate f38885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LocalDate f38886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap<LocalDate, h0> f38887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f38888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f38889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f38890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2 f38891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<cx0.a<Unit>> f38892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f38893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LocalDate f38894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2 f38895n;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/b$a;", "", "", "Lorg/joda/time/LocalDate;", "Lhx0/s0;", "daySummaries", "Lc22/h0;", "range", "<init>", "(Ljava/util/Map;Lc22/h0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<LocalDate, s0> f38896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0 f38897b;

        public a(Map<LocalDate, s0> map, h0 h0Var) {
            map.getClass();
            h0Var.getClass();
            this.f38896a = map;
            this.f38897b = h0Var;
        }
    }

    public b(yw0.a aVar) {
        aVar.getClass();
        this.f38882a = aVar;
        this.f38883b = new LinkedHashMap();
        this.f38884c = new HashMap<>();
        this.f38885d = LocalDate.now();
        this.f38886e = LocalDate.now();
        this.f38887f = new TreeMap<>();
        this.f38889h = new ReentrantLock();
        this.f38890i = new LinkedHashMap();
        this.f38892k = new y0<>();
        this.f38893l = LocalDate.now().plusMonths(6);
        this.f38895n = ge1.b.h();
    }

    public static final void x4(b bVar, List list) {
        bVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (bVar.f38888g == null && lVar != null && !lVar.I() && lVar.getStartDate().compareTo((ReadablePartial) LocalDate.now()) <= 0) {
                bVar.f38888g = lVar.z();
            }
            if ((lVar != null ? lVar.getStartDate() : null) != null) {
                bVar.f38887f.put(lVar.getStartDate(), lVar.z());
            }
        }
    }

    public static ArrayList z4(h0 h0Var, List list) {
        LocalDate localDate;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (j23.g.a.a(h0Var, (LocalDate) obj)) {
                arrayList2.add(obj);
            }
        }
        for (LocalDate localDate2 : p13.h0.M0(arrayList2)) {
            if (arrayList.isEmpty()) {
                arrayList.add(x.m(localDate2));
            } else {
                List list2 = (List) p13.h0.n0(arrayList);
                if (list2 != null && (localDate = (LocalDate) p13.h0.n0(list2)) != null) {
                    if (jg.b.G(localDate).equals(localDate2)) {
                        ((List) p13.h0.m0(arrayList)).add(localDate2);
                    } else {
                        arrayList.add(x.m(localDate2));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return o53.s0.f129406a.plus(this.f38895n);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f38895n.c(null);
        super.onCleared();
    }

    public final s0 y4(LocalDate localDate) {
        HashMap<LocalDate, s0> map = this.f38884c;
        s0 s0Var = map.get(localDate);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(localDate, null, null, null, false, null, false, false, 254, null);
        map.put(localDate, s0Var2);
        return s0Var2;
    }
}
