package kl1;

import android.text.TextUtils;
import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.t0;
import p13.u0;
import p13.w;
import p13.x;
import p13.y;
import zf2.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lkl1/c;", "", "<init>", "()V", "b", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f105264a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f105265b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkl1/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        DEFAULT_ONLY,
        WHEELCHAIR_ONLY,
        RING_BAND_DEFAULT_ONLY,
        ALL
    }

    /* JADX INFO: renamed from: kl1.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C2027c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f105274b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.DEFAULT_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.WHEELCHAIR_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.RING_BAND_DEFAULT_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105273a = iArr;
            int[] iArr2 = new int[il1.a.values().length];
            try {
                iArr2[il1.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[il1.a.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[il1.a.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[il1.a.GYM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[il1.a.OUTDOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f105274b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        il1.a aVar = il1.a.GYM;
        int i14 = 2;
        a aVar2 = new a(d.N0, null, i14, 0 == true ? 1 : 0);
        a aVar3 = new a(d.O0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        a aVar4 = new a(d.P0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        a aVar5 = new a(d.Q0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        a aVar6 = new a(d.V0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        a aVar7 = new a(d.W0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        d dVar = d.X0;
        b bVar = b.DEFAULT_ONLY;
        a aVar8 = new a(dVar, bVar);
        a aVar9 = new a(d.Y0, bVar);
        a aVar10 = new a(d.Z0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        a aVar11 = new a(d.S1, bVar);
        d dVar2 = d.f204625y;
        b bVar2 = b.WHEELCHAIR_ONLY;
        p pVar = new p(aVar, x.k(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, new a(dVar2, bVar2), new a(d.f204580a1, null, i14, 0 == true ? 1 : 0), new a(d.f204582b1, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0), new a(d.f204584c1, bVar), new a(d.f204586d1, null, i14, 0 == true ? 1 : 0), new a(d.f204588e1, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0), new a(d.f204590f1, bVar)));
        int i15 = 2;
        p pVar2 = new p(il1.a.OUTDOOR, x.k(new a(d.N1, bVar), new a(d.Q1, bVar), new a(d.V1, null, i15, 0 == true ? 1 : 0), new a(d.W1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0), new a(d.X1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0), new a(d.Y1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0), new a(d.Z1, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0), new a(d.f204581a2, bVar)));
        p pVar3 = new p(il1.a.RUNNING, x.k(new a(d.f204603m, bVar), new a(d.f204605n, bVar), new a(d.f204609p, bVar), new a(d.f204611q, bVar), new a(d.f204619v, bVar), new a(d.f204623x, bVar2), new a(d.f204621w, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0)));
        il1.a aVar12 = il1.a.CYCLING;
        a aVar13 = new a(d.f204627z, bVar);
        a aVar14 = new a(d.D, bVar);
        a aVar15 = new a(d.I, bVar);
        a aVar16 = new a(d.Y, bVar);
        d dVar3 = d.H0;
        b bVar3 = b.ALL;
        a aVar17 = new a(dVar3, bVar3);
        a aVar18 = new a(d.f204599k0, bVar3);
        d dVar4 = d.B;
        b bVar4 = b.RING_BAND_DEFAULT_ONLY;
        int i16 = 2;
        int i17 = 2;
        f105265b = u0.e(pVar, pVar2, pVar3, new p(aVar12, x.k(aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, new a(dVar4, bVar4), new a(d.C, bVar4), new a(d.J0, bVar4), new a(d.Z, bVar4), new a(d.A, bVar4), new a(d.L0, bVar4))), new p(il1.a.SWIMMING, w.c(new a(d.M0, null, i16, 0 == true ? 1 : 0))), new p(il1.a.RACKET_SPORT, x.k(new a(d.F1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.H1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.I1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.J1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.K1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.L1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.M1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0))), new p(il1.a.TEAM_SPORT, x.k(new a(d.f204615s1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204617t1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204618u1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204620v1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204622w1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204624x1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204626y1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204628z1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.A1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.B1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.C1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.D1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.E1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0))), new p(il1.a.WINTER_SPORT, x.k(new a(d.f204592g1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204594h1, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new a(d.f204596i1, bVar), new a(d.f204598j1, bVar), new a(d.f204600k1, bVar), new a(d.f204602l1, null, i17, 0 == true ? 1 : 0))), new p(il1.a.WATER_SPORT, x.k(new a(d.f204604m1, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204606n1, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204608o1, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204610p1, bVar), new a(d.f204612q1, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204614r1, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0))), new p(il1.a.OTHER, x.k(new a(d.f204583b2, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204585c2, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204587d2, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204589e2, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0), new a(d.f204591f2, 0 == true ? 1 : 0, i17, 0 == true ? 1 : 0))));
    }

    private c() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static LinkedHashMap a(String str, boolean z14) {
        zb0.u0 u0Var;
        ?? r14 = f105265b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(r14.size()));
        for (Map.Entry entry : r14.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int i14 = C2027c.f105273a[((a) obj).f105267b.ordinal()];
                boolean z15 = true;
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            z15 = z14;
                        } else {
                            if (i14 != 4) {
                                lc.u0.r();
                                return null;
                            }
                            if ((!zb0.u0.s(str) && (TextUtils.isEmpty(str) || ((u0Var = (zb0.u0) zb0.u0.f203782n6.get(str)) != zb0.u0.f203739h6 && u0Var != zb0.u0.f203720e6))) || z14) {
                                z15 = false;
                            }
                        }
                    } else if (z14) {
                        z15 = false;
                    }
                }
                if (z15) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a) it.next()).f105266a);
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkl1/c$a;", "", "Lzf2/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkl1/c$b;", "mode", "<init>", "(Lzf2/d;Lkl1/c$b;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f105266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f105267b;

        public a(d dVar, b bVar) {
            dVar.getClass();
            bVar.getClass();
            this.f105266a = dVar;
            this.f105267b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105266a == aVar.f105266a && this.f105267b == aVar.f105267b;
        }

        public final int hashCode() {
            return this.f105267b.hashCode() + (this.f105266a.hashCode() * 31);
        }

        public final String toString() {
            return "ActivityEntry(type=" + this.f105266a + ", mode=" + this.f105267b + ")";
        }

        public /* synthetic */ a(d dVar, b bVar, int i14, j jVar) {
            this(dVar, (i14 & 2) != 0 ? b.ALL : bVar);
        }
    }
}
