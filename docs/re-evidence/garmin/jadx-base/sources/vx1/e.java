package vx1;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import ix1.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import mx1.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.w;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t21.v0;
import tr2.o;
import vd0.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvx1/e;", "Lh82/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h82.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f180659j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f180660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f180661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f180662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f180663i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180664a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.EXPLORATION_BENCHMARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.DELOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.ACCUMULATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.INTENSIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.REALIZATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f180664a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static String j(g gVar, Context context, boolean z14) {
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (z14) {
            int i14 = b.f180664a[gVar.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    str = "6";
                } else if (i14 == 3) {
                    str = "2";
                } else if (i14 != 4) {
                    if (i14 != 5) {
                        u0.r();
                        return null;
                    }
                    str = "5";
                } else {
                    str = "3-4";
                }
            }
        } else {
            int i15 = b.f180664a[gVar.ordinal()];
            if (i15 == 2) {
                str = "5";
            } else if (i15 != 3) {
                if (i15 != 4) {
                    str = i15 != 5 ? "" : "4";
                } else {
                    str = "2-3";
                }
            }
        }
        String string = context.getString(R.string.lbl_week_number, str);
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        f fVar;
        Object next;
        o0 o0VarE = mVar.E(1201528508);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            String string = bundle.getString("TITLE", "");
            string.getClass();
            this.f180660f = string;
            String string2 = bundle.getString("PLAN_TYPE", "");
            if (string2 != null) {
                Iterator<T> it = mx1.g.f121410h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((f) next).f121395a.equals(string2));
                fVar = (f) next;
                if (fVar == null) {
                    fVar = mx1.g.f121403a;
                }
            } else {
                fVar = mx1.g.f121403a;
            }
            this.f180661g = fVar;
            this.f180662h = bundle.getBoolean("HAS_EXPLORATION_BENCHMARKING_PHASE", false);
            this.f180663i = bundle.getBoolean("HAS_DELOAD_PHASE", false);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        q13.b bVarB = w.b();
        w13.c cVar = g.f95741j;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            g gVar = (g) bVarN.next();
            int i14 = b.f180664a[gVar.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    bVarB.add(gVar);
                } else if (this.f180663i) {
                    bVarB.add(gVar);
                }
            } else if (this.f180662h) {
                bVarB.add(gVar);
            }
        }
        q13.b bVarA = w.a(bVarB);
        List listC = w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(661566684, true, new vv0.e(4, this, bVarA)), 4, null));
        ArrayList arrayList = new ArrayList(y.r(bVarA, 10));
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar2 = (q13.b.c) listIterator;
            if (!cVar2.hasNext()) {
                return h0.C0(listC, arrayList);
            }
            g gVar2 = (g) cVar2.next();
            arrayList.add(new h82.c.b(gVar2.name(), j(gVar2, context, this.f180662h), null, new z3.e(-1767842809, true, new vv0.e(5, this, gVar2)), 4, null));
        }
    }

    public final void g(g gVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-174676476);
        int i15 = (o0VarE.k(gVar.ordinal()) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1518473327, new v0(gVar, 16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(this, gVar, i14, 12);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-697801329);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1320862622, new v0(this, 15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, 29);
        }
    }

    public final void i(List<? extends g> list, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1850048640);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-512170675, new s0(this, 3, list, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(this, list, i14, 11);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lvx1/e$a;", "", "<init>", "()V", "", "EXTRA_TITLE_KEY", "Ljava/lang/String;", "EXTRA_PLAN_TYPE_KEY", "EXTRA_HAS_EXPLORATION_BENCHMARKING_PHASE", "EXTRA_HAS_DELOAD_PHASE", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
