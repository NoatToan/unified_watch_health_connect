package nm;

import android.content.Context;
import android.util.SparseArray;
import androidx.compose.ui.platform.ComposeView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import p13.w;
import p13.x;
import r22.s;
import r22.t;
import r22.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnm/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;", "comparisonData", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "workoutComparisonDataList", "", "isFullscreen", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;Lcom/garmin/android/apps/connectmobile/activities/newmodel/l;Landroid/util/SparseArray;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f126530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.p f126531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm.p f126532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f126533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f126534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b> f126535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<g> f126536g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            List<Integer> listC = ((b) t14).c();
            c cVar = c.this;
            return r13.a.b(Boolean.valueOf(listC.contains(Integer.valueOf(cVar.f126531b.getB1()))), Boolean.valueOf(((b) t7).c().contains(Integer.valueOf(cVar.f126531b.getB1()))));
        }
    }

    public c(Context context, zm.p pVar, zm.p pVar2, com.garmin.android.apps.connectmobile.activities.newmodel.l lVar, SparseArray<q0> sparseArray, boolean z14) {
        boolean z15;
        context.getClass();
        pVar.getClass();
        this.f126530a = context;
        this.f126531b = pVar;
        this.f126532c = pVar2;
        this.f126533d = z14;
        this.f126534e = new m(context, pVar, pVar2, lVar != null, z14);
        nm.a aVar = new nm.a(context, pVar, pVar2);
        e eVar = new e(context, pVar, pVar2);
        f fVar = new f(context, pVar, pVar2);
        h hVar = new h(context, pVar, pVar2, lVar);
        if (lVar == null || sparseArray == null) {
            z15 = false;
        } else {
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                if (sparseArray.get(i14).f29639c) {
                    z15 = true;
                }
            }
            z15 = false;
        }
        this.f126535f = x.k(aVar, eVar, fVar, hVar, new j(context, pVar, pVar2, z15), new k(this.f126530a, this.f126531b, this.f126532c), new l(this.f126530a, this.f126531b, this.f126532c), new n(this.f126530a, this.f126531b, this.f126532c), new d(this.f126530a, this.f126531b, this.f126532c), new o(this.f126530a, this.f126531b, this.f126532c), new p(this.f126530a, this.f126531b, this.f126532c), new q(this.f126530a, this.f126531b, this.f126532c), new i(this.f126530a, this.f126531b, this.f126532c));
        this.f126536g = w.c(new g(this.f126530a, this.f126531b, this.f126532c, this.f126533d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [j53.j] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public final i53.c<b> a(boolean z14) {
        ?? B;
        if (z14) {
            B = new ArrayList();
            for (Object obj : this.f126536g) {
                if (((g) obj).d()) {
                    B.add(obj);
                }
            }
        } else {
            B = j53.l.b();
        }
        m mVar = this.f126534e;
        if (mVar.d() && !mVar.b().isEmpty()) {
            return i53.a.e(h0.C0(w.c(mVar), B));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f126535f) {
            if (((b) obj2).d()) {
                arrayList.add(obj2);
            }
        }
        return i53.a.e(h0.C0(h0.N0(arrayList, new a()), B));
    }

    public final ComposeView b() {
        u.a aVar = u.f149901a;
        i53.c<b> cVarA = a(false);
        b bVar = (b) h0.d0(cVarA);
        String strA = bVar != null ? bVar.a() : null;
        if (cVarA.size() != 1 || strA == null) {
            strA = this.f126531b.getF113500j1();
        }
        i53.c<b> cVarA2 = a(true);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = cVarA2.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, it.next().b());
        }
        s sVar = new s(strA, i53.a.e(arrayList));
        aVar.getClass();
        ComposeView composeView = new ComposeView(this.f126530a, null, 0, 6, null);
        composeView.setContent(new z3.e(439568231, true, new t(sVar, 0, (byte) 0)));
        return composeView;
    }
}
