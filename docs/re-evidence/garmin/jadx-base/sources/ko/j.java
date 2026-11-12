package ko;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import d53.u;
import e23.l;
import fw.m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.p;
import ps.x1;
import qs.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lko/j;", "Landroidx/lifecycle/u1;", "Lam/x0;", "activityType", "Lps/p;", "activitySplits", "Lko/h;", "intervalDataMapper", "<init>", "(Lam/x0;Lps/p;Lko/h;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f105730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f105731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f105732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0<m<Object>> f105733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Boolean> f105734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Boolean> f105735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<Boolean> f105736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<List<e>> f105737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<Integer, String> f105738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<Integer, String> f105739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<Integer, n> f105740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f105741l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f105742a;

        public b(l lVar) {
            lVar.getClass();
            this.f105742a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f105742a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f105742a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public j(x0 x0Var, p pVar, h hVar) {
        List<Integer> listP0;
        pVar.getClass();
        hVar.getClass();
        this.f105730a = x0Var;
        this.f105731b = pVar;
        this.f105732c = hVar;
        this.f105733d = new w0<>();
        this.f105734e = new y0<>();
        this.f105735f = new y0<>();
        this.f105736g = new y0<>();
        this.f105737h = new y0<>();
        this.f105738i = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<>();
        this.f105739j = map;
        this.f105740k = new HashMap<>();
        this.f105741l = new LinkedHashSet();
        map.clear();
        LinkedHashMap linkedHashMapB = d.b(pVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<x1> listI = pVar.i();
        if (listI != null) {
            for (x1 x1Var : listI) {
                g0.a aVar = g0.f29436c;
                String strO0 = x1Var.o0();
                aVar.getClass();
                if (g0.a.a(strO0) == g0.WALK && (listP0 = x1Var.p0()) != null) {
                    linkedHashSet.addAll(listP0);
                }
            }
        }
        List<ps.x0> listG = this.f105731b.g();
        if (listG != null) {
            for (ps.x0 x0Var2 : listG) {
                n nVarA = (n) linkedHashMapB.get(Integer.valueOf(x0Var2.getLapIndex()));
                nVarA = nVarA == null ? d.a(x0Var2) : nVarA;
                this.f105740k.put(Integer.valueOf(x0Var2.getLapIndex()), nVarA);
                String strName = (linkedHashSet.contains(Integer.valueOf(x0Var2.getLapIndex())) || u.p(x0Var2.getIntensityType(), "_WALK", false)) ? "WALK" : nVarA.name();
                this.f105739j.put(Integer.valueOf(x0Var2.getLapIndex()), strName);
                this.f105738i.put(Integer.valueOf(x0Var2.getLapIndex()), strName);
            }
        }
        this.f105737h.m(this.f105732c.a(this.f105730a, this.f105731b, this.f105739j, this.f105738i));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lko/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
