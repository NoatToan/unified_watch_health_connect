package uw0;

import am.x0;
import am.z0;
import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import ps.x1;
import qs.x;
import tq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Luw0/g;", "", "Landroid/content/res/Resources;", "resources", "Lam/x0;", "activityType", "<init>", "(Landroid/content/res/Resources;Lam/x0;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f172986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f172987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f172988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<x> f172989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<x> f172990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f172991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f172992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f172993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f172994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f172995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f172996k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luw0/g$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f172997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x0 f172998b;

        public final g a(Resources resources) {
            x0 x0Var = this.f172998b;
            j jVar = null;
            if (x0Var == null) {
                s.m("activityType");
                throw null;
            }
            g gVar = new g(resources, x0Var, jVar);
            x0 x0Var2 = this.f172998b;
            if (x0Var2 == null) {
                s.m("activityType");
                throw null;
            }
            String str = x0Var2.f4358a;
            gVar.f172991f = z0.X(str) || z0.a0(str);
            x0 x0Var3 = this.f172998b;
            if (x0Var3 == null) {
                s.m("activityType");
                throw null;
            }
            String str2 = x0Var3.f4358a;
            gVar.f172992g = z0.X(str2) || z0.a0(str2);
            x0 x0Var4 = this.f172998b;
            if (x0Var4 == null) {
                s.m("activityType");
                throw null;
            }
            String str3 = x0Var4.f4358a;
            gVar.f172993h = z0.X(str3) || z0.a0(str3);
            x0 x0Var5 = this.f172998b;
            if (x0Var5 == null) {
                s.m("activityType");
                throw null;
            }
            String str4 = x0Var5.f4358a;
            gVar.f172996k = z0.X(str4) || z0.a0(str4);
            boolean z14 = this.f172997a;
            gVar.f172994i = !z14;
            gVar.f172995j = z14;
            return gVar;
        }
    }

    private g(Resources resources, x0 x0Var) {
        c aVar;
        List<x> listC;
        this.f172986a = resources;
        this.f172987b = x0Var;
        new d();
        x0Var.getClass();
        resources.getClass();
        switch (d.e.f172979a[x0Var.ordinal()]) {
            case 1:
                aVar = new d.a(resources);
                break;
            case 2:
                aVar = new d.a(resources);
                break;
            case 3:
                aVar = new d.a(resources);
                break;
            case 4:
            case 5:
                aVar = new d.c(resources);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                aVar = new d.C3237d(resources);
                break;
            default:
                aVar = new d.b(resources);
                break;
        }
        this.f172988c = aVar;
        this.f172989d = k.a(x0Var);
        int i14 = k.a.f166034a[x0Var.ordinal()];
        if (i14 == 1) {
            listC = w.c(x.RUN_ACTIVE);
        } else if (i14 != 3 && i14 != 4 && i14 != 5) {
            if (i14 != 21 && i14 != 22) {
                switch (i14) {
                    case 8:
                    case 9:
                        listC = w.c(x.CLIMB_ACTIVE);
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        listC = w.c(x.SURF_ACTIVE);
                        break;
                    default:
                        listC = j0.f134944a;
                        break;
                }
            } else {
                listC = p13.x.k(x.ASCENT, x.DESCENT);
            }
        } else {
            listC = p13.x.k(x.ASCENT, x.DESCENT, x.TRANSITION);
        }
        this.f172990e = listC;
        this.f172993h = true;
    }

    public final int a(x1 x1Var, boolean z14, boolean z15) {
        c cVar = this.f172988c;
        if (z15 && this.f172993h) {
            return cVar.c();
        }
        return (z14 && this.f172992g) ? cVar.b() : cVar.d(x1Var.a2());
    }

    public final int b() {
        x0 x0Var = this.f172987b;
        String str = x0Var.f4358a;
        String str2 = x0Var.f4358a;
        if (z0.X(str)) {
            return this.f172995j ? R.layout.surf_preview_legend : R.layout.surf_map_legend;
        }
        if (z0.a0(str2)) {
            return this.f172995j ? R.layout.wakesports_preview_legend : R.layout.wakesports_map_legend;
        }
        if (z0.o(str2)) {
            return this.f172995j ? R.layout.ascent_descent_preview_legend : R.layout.ascent_descent_map_legend;
        }
        if (z0.x(str2)) {
            return this.f172995j ? R.layout.cycling_ascent_descent_preview_legend : R.layout.cycling_ascent_descent_map_legend;
        }
        return 0;
    }

    public final boolean c() {
        return p13.x.k(x0.V1, x0.W1, x0.X1, x0.Z1, x0.f4267a2, x0.f4270b2, x0.S0, x0.T0, x0.R0).contains(this.f172987b);
    }

    public /* synthetic */ g(Resources resources, x0 x0Var, j jVar) {
        this(resources, x0Var);
    }
}
