package n70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ln70/i3;", "", "Lkn/b;", "getPostDiveActivityUseCase", "<init>", "(Lkn/b;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn.b f124279a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124280a;

        static {
            int[] iArr = new int[o70.t.values().length];
            try {
                iArr[o70.t.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.t.I0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.t.J0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.t.f130063g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.t.f130064h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.t.f130065i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.t.f130066j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.t.T.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o70.t.f130067k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o70.t.f130070m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o70.t.f130071n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[o70.t.f130075r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[o70.t.f130072o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[o70.t.f130073p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[o70.t.f130074q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[o70.t.f130077v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[o70.t.f130080y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[o70.t.A.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[o70.t.f130081z.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[o70.t.C.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[o70.t.D.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[o70.t.E.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[o70.t.f130078w.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[o70.t.f130079x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[o70.t.Z.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[o70.t.H0.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[o70.t.K0.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[o70.t.L0.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[o70.t.M0.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[o70.t.N0.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[o70.t.O0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[o70.t.P.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[o70.t.P0.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[o70.t.Q0.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[o70.t.X.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[o70.t.F.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[o70.t.Y.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[o70.t.f130069l.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[o70.t.I.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[o70.t.f130076t.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f124280a = iArr;
        }
    }

    static {
        new a(null);
    }

    public i3(kn.b bVar) {
        bVar.getClass();
        this.f124279a = bVar;
    }

    public final List a(List list, r53.o2 o2Var, r53.o2 o2Var2, e23.a aVar) {
        o2Var.getClass();
        o2Var2.getClass();
        if (list == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o70.t tVar = (o70.t) it.next();
            Object s4Var = null;
            switch (b.f124280a[tVar.ordinal()]) {
                case 1:
                    s4Var = new s4(o2Var);
                    break;
                case 2:
                    s4Var = new d5(o2Var);
                    break;
                case 3:
                    s4Var = new m5(o2Var);
                    break;
                case 4:
                    s4Var = new n5(o2Var);
                    break;
                case 5:
                    s4Var = new o5(o2Var);
                    break;
                case 6:
                    s4Var = new r53.u1(o2Var, o2Var2, new o4(null));
                    break;
                case 7:
                    s4Var = new r53.u1(o2Var, o2Var2, new p4(null));
                    break;
                case 8:
                    s4Var = new p5(o2Var);
                    break;
                case 9:
                    s4Var = new q5(o2Var);
                    break;
                case 10:
                    s4Var = new r5(o2Var);
                    break;
                case 11:
                    s4Var = new s5(o2Var);
                    break;
                case 12:
                    s4Var = new r53.u1(o2Var, o2Var2, new m3(null));
                    break;
                case 13:
                case 14:
                case 15:
                    s4Var = new t4(o2Var);
                    break;
                case 16:
                    s4Var = new r53.u1(o2Var, o2Var2, new o3(null));
                    break;
                case 17:
                    s4Var = new u4(o2Var);
                    break;
                case 18:
                    s4Var = new v4(o2Var);
                    break;
                case 19:
                    s4Var = new w4(o2Var);
                    break;
                case 20:
                    s4Var = new r53.u1(o2Var, o2Var2, new s3(null));
                    break;
                case 21:
                case 22:
                    s4Var = new x4(o2Var);
                    break;
                case 23:
                    s4Var = new y4(o2Var);
                    break;
                case 24:
                    s4Var = new z4(o2Var);
                    break;
                case 25:
                    s4Var = new a5(o2Var);
                    break;
                case 26:
                    s4Var = new r53.u1(o2Var, o2Var2, new y3(null));
                    break;
                case 27:
                    s4Var = new b5(o2Var);
                    break;
                case 28:
                    s4Var = r53.s.l(o2Var, o2Var2, (r53.i) aVar.invoke(), new a4(this, null));
                    break;
                case 29:
                case 30:
                case 31:
                    s4Var = new c5(o2Var);
                    break;
                case 32:
                    s4Var = new e5(o2Var);
                    break;
                case 33:
                    s4Var = new f5(o2Var);
                    break;
                case 34:
                    s4Var = new g5(o2Var);
                    break;
                case 35:
                    s4Var = new h5(o2Var);
                    break;
                case 36:
                    s4Var = new i5(o2Var);
                    break;
                case 37:
                    s4Var = new r53.u1(o2Var, o2Var2, new i4(null));
                    break;
                case 38:
                    s4Var = new j5(o2Var);
                    break;
                case 39:
                    s4Var = new k5(o2Var);
                    break;
                case 40:
                    s4Var = new l5(o2Var);
                    break;
                default:
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DASHBOARD, "GetSecondaryStatsItemsUseCase Secondary Stat Type " + tVar + " data not handled!");
                    break;
            }
            r70.s sVarB = m70.f.b(s4Var, tVar.a());
            if (sVarB != null) {
                arrayList.add(sVarB);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln70/i3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
