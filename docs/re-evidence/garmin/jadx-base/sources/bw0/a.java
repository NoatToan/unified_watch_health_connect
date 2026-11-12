package bw0;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import pv0.s;
import pv0.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lbw0/a;", "", "<init>", "()V", "a", "c", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21562a = new a();

    /* JADX INFO: renamed from: bw0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbw0/a$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0329a f21563a = new C0329a();

        private C0329a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbw0/a$b;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21564a = new b();

        private b() {
        }

        public static int a(y yVar) {
            yVar.getClass();
            if (yVar == y.b.COFFEE) {
                return R.color.gds_data_viz_blue_primary;
            }
            if (yVar == y.b.TEA) {
                return R.color.gds_data_viz_orange_primary;
            }
            if (yVar == y.b.SODA) {
                return R.color.gds_data_viz_yellow_primary;
            }
            if (yVar == y.b.ENERGY_DRINK) {
                return R.color.gds_data_viz_green_secondary;
            }
            if (yVar == y.b.OTHER) {
                return R.color.gds_data_viz_violet_primary;
            }
            if (yVar == y.a.BEER) {
                return R.color.gds_data_viz_blue_primary;
            }
            if (yVar == y.a.WINE) {
                return R.color.gds_data_viz_orange_primary;
            }
            if (yVar == y.a.SPIRIT) {
                return R.color.gds_data_viz_yellow_primary;
            }
            if (yVar == y.a.OTHER) {
                return R.color.gds_data_viz_violet_primary;
            }
            u0.r();
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbw0/a$c;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f21565a = new c();

        private c() {
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21566a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21566a = iArr;
        }
    }

    private a() {
    }

    public static long a(s sVar, m mVar) {
        x1 x1Var = n.f135158a;
        int i14 = sVar == null ? -1 : bw0.b.a.f21567a[sVar.ordinal()];
        if (i14 == -1) {
            mVar.C(-1514825976);
            gl.c.f77766a.getClass();
            long jG = gl.c.a(mVar).g();
            mVar.f();
            return jG;
        }
        if (i14 == 1) {
            mVar.C(-1514829051);
            gl.c.f77766a.getClass();
            long jC = gl.c.a(mVar).c();
            mVar.f();
            return jC;
        }
        if (i14 != 2) {
            throw j.m(mVar, -1514830593);
        }
        mVar.C(-1514827387);
        gl.c.f77766a.getClass();
        long jR = gl.c.a(mVar).r();
        mVar.f();
        return jR;
    }

    public static Integer b(s sVar) {
        int i14;
        if (sVar == null) {
            return null;
        }
        f21562a.getClass();
        int i15 = d.f21566a[sVar.ordinal()];
        if (i15 == -1) {
            i14 = R.color.gds_data_viz_neutral_secondary;
        } else if (i15 == 1) {
            i14 = R.color.gds_data_viz_blue_secondary;
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            i14 = R.color.gds_data_viz_yellow_primary;
        }
        return Integer.valueOf(i14);
    }

    public static int c(s sVar) {
        int i14 = sVar == null ? -1 : d.f21566a[sVar.ordinal()];
        if (i14 == -1) {
            return R.drawable.chart_item_square_stroke;
        }
        if (i14 == 1) {
            return R.drawable.chart_item_circle;
        }
        if (i14 == 2) {
            return R.drawable.chart_item_rhombus;
        }
        u0.r();
        return 0;
    }
}
