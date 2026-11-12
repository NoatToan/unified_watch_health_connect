package im;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lim/b0;", "Lim/b;", "", "Lps/x1;", "activeSplits", "<init>", "(Ljava/util/List;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b0 extends b {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final a f94135b1 = new a(null);
    public final List<x1> X0;
    public final ArrayList Y0;
    public final ArrayList Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public double f94136a1;

    public b0(List<x1> list) {
        Double dValueOf = Double.valueOf(0.0d);
        list.getClass();
        this.X0 = list;
        ArrayList<x1> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x1) obj).a2() == qs.x.SURF_ACTIVE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x1 x1Var : arrayList) {
            Double maxSpeed = x1Var.getMaxSpeed() != null ? x1Var.getMaxSpeed() : dValueOf;
            if (maxSpeed != null) {
                arrayList2.add(maxSpeed);
            }
        }
        this.Y0 = arrayList2;
        List<x1> list2 = this.X0;
        ArrayList<x1> arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((x1) obj2).a2() == qs.x.SURF_ACTIVE) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (x1 x1Var2 : arrayList3) {
            Double duration = x1Var2.getDuration() != null ? x1Var2.getDuration() : dValueOf;
            if (duration != null) {
                arrayList4.add(duration);
            }
        }
        this.Z0 = arrayList4;
    }

    public final boolean A() {
        int i14;
        ArrayList arrayList = this.Y0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            i14 = 0;
            while (it.hasNext()) {
                if (((Number) it.next()).doubleValue() > 0.0d && (i14 = i14 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        } else {
            i14 = 0;
        }
        return i14 < this.f94122l.size();
    }

    @Override // im.b, zm.p
    /* JADX INFO: renamed from: getTotalDuration, reason: from getter */
    public double getF94136a1() {
        return this.f94136a1;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/b0$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b0 a(b bVar, List list) {
            b0 b0Var = new b0(list);
            b0Var.f94111b = bVar.f94111b;
            b0Var.Y = bVar.Y;
            b0Var.f94112c = bVar.f94112c;
            b0Var.f94114e = bVar.f94114e;
            b0Var.f94115f = bVar.f94115f;
            b0Var.f94116g = bVar.f94116g;
            b0Var.f94117h = bVar.f94117h;
            b0Var.f94118i = bVar.f94118i;
            b0Var.f94119j = bVar.f94119j;
            b0Var.k(bVar.f94122l);
            b0Var.f94124n = bVar.f94124n;
            b0Var.f94125o = bVar.f94125o;
            b0Var.f94126p = bVar.f94126p;
            b0Var.f94127q = bVar.f94127q;
            b0Var.f94128r = bVar.f94128r;
            b0Var.A = bVar.A;
            b0Var.B = bVar.B;
            b0Var.C = bVar.C;
            b0Var.D = bVar.D;
            b0Var.z(bVar.E);
            b0Var.y(bVar.F);
            b0Var.Y = bVar.Y;
            b0Var.f94113d = bVar.f94113d;
            b0Var.f94136a1 = bVar.I0;
            b0Var.f94129t = bVar.f94129t;
            b0Var.f94130v = bVar.f94130v;
            b0Var.Z = bVar.Z;
            b0Var.f94121k0 = bVar.f94121k0;
            b0Var.H0 = bVar.H0;
            b0Var.f94110a = bVar.f94110a;
            b0Var.I = bVar.I;
            ArrayList arrayList = bVar.P;
            if (b0Var.P == null) {
                b0Var.P = new ArrayList();
            }
            b0Var.P.clear();
            if (arrayList != null) {
                b0Var.P.addAll(arrayList);
            }
            b0Var.J0 = bVar.J0;
            b0Var.f94131w = bVar.f94131w;
            b0Var.f94132x = bVar.f94132x;
            b0Var.f94133y = bVar.f94133y;
            b0Var.L0 = bVar.L0;
            rm.a aVar = bVar.f94134z;
            if (aVar != null) {
                b0Var.r(aVar);
            }
            b0Var.M0 = bVar.M0;
            b0Var.s(bVar.T);
            b0Var.T0 = bVar.T0;
            return b0Var;
        }

        private a() {
        }
    }
}
