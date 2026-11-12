package co1;

import im.s;
import j23.k;
import j23.l;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.p0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lco1/a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28146a = new a();

    /* JADX INFO: renamed from: co1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0433a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f28147a = w13.b.g(c.values());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ w13.c f28148b = w13.b.g(e.values());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ w13.c f28149c = w13.b.g(g.values());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ w13.c f28150d = w13.b.g(b.values());

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ w13.c f28151e = w13.b.g(d.values());
    }

    private a() {
    }

    public static ArrayList a(boolean z14) {
        double[] dArr = z14 ? new double[]{6.3d, 8.6d, 10.8d, 13.1d} : new double[]{6.3d, 8.2d, 9.9d, 11.8d};
        q13.b bVarB = w.b();
        bVarB.add(Double.valueOf(0.0d));
        for (double d14 : dArr) {
            bVarB.add(Double.valueOf(d14));
        }
        bVarB.add(Double.valueOf(200.0d));
        q13.b bVarA = w.a(bVarB);
        l lVarO = t.o(0, bVarA.getF97124f() - 1);
        ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
        Iterator<Integer> it = lVarO.iterator();
        while (((k) it).f96801c) {
            int iNextInt = ((p0) it).nextInt();
            arrayList.add(new s(((i) i.f28183e.get(iNextInt)).f28186c, ((Number) bVarA.get(iNextInt)).doubleValue(), ((Number) bVarA.get(iNextInt + 1)).doubleValue()));
        }
        return arrayList;
    }
}
