package uy0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Luy0/b0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "Lzd0/j1;", "subscriptionProvider", "Lx01/i;", "nutritionStateProvider", "Lo53/z;", "backgroundDispatcher", "Llc0/h;", "isScreenlessDeviceUseCase", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/b1;Lzd0/j1;Lx01/i;Lo53/z;Llc0/h;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f173090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zd0.j1 f173091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x01.i f173092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.z f173093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lc0.h f173094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ty0.b f173095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f173096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f173097i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173098a;

        static {
            int[] iArr = new int[ty0.l.values().length];
            try {
                iArr[ty0.l.f167014t1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.l.f167019w1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.l.f167005o1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ty0.l.f167011r1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ty0.l.I0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ty0.l.H0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ty0.l.f166996k0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ty0.l.f166995k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ty0.l.f167008q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ty0.l.f167020x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ty0.l.E.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ty0.l.F.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ty0.l.S0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ty0.l.f166986f1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ty0.l.f166999l1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ty0.l.Z0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ty0.l.X.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ty0.l.f167017v1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ty0.l.P0.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ty0.l.O0.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ty0.l.M0.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ty0.l.K0.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f173098a = iArr;
        }
    }

    public b0(Context context, com.garmin.android.apps.connectmobile.b1 b1Var, zd0.j1 j1Var, x01.i iVar, o53.z zVar, lc0.h hVar) {
        context.getClass();
        b1Var.getClass();
        j1Var.getClass();
        iVar.getClass();
        zVar.getClass();
        hVar.getClass();
        this.f173089a = context;
        this.f173090b = b1Var;
        this.f173091c = j1Var;
        this.f173092d = iVar;
        this.f173093e = zVar;
        this.f173094f = hVar;
        this.f173095g = ty0.b.f166879i2;
        this.f173096h = o13.m.b(new ux1.b(22));
        this.f173097i = o13.m.b(new ux1.b(23));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r11 == r4) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b0 b0Var, ty0.l lVar, v13.c cVar) {
        c0 c0Var;
        zd0.j1 j1Var = b0Var.f173091c;
        o13.t tVar = b0Var.f173096h;
        com.garmin.android.apps.connectmobile.b1 b1Var = b0Var.f173090b;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f173108c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f173108c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(b0Var, cVar);
            }
        } else {
            c0Var = new c0(b0Var, cVar);
        }
        Object objI = c0Var.f173106a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f173108c;
        boolean zT = true;
        if (i15 == 0) {
            o13.r.b(objI);
            switch (a.f173098a[lVar.ordinal()]) {
                case 3:
                    zT = b1Var.T();
                    return Boolean.valueOf(zT);
                case 4:
                    zT = b1Var.d();
                    return Boolean.valueOf(zT);
                case 5:
                    c0Var.f173108c = 1;
                    objI = j1Var.i(c0Var);
                    break;
                case 6:
                    c0Var.f173108c = 2;
                    Object objB = b0Var.b(c0Var);
                    if (objB == obj) {
                        return obj;
                    }
                    return objB;
                case 7:
                    c80.q qVar = c80.q.LIVE_ACTIVITY;
                    c0Var.f173108c = 3;
                    Object objL = j1Var.l(qVar, c0Var);
                    if (objL == obj) {
                        return obj;
                    }
                    return objL;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    if (((Boolean) tVar.getValue()).booleanValue()) {
                        zT = false;
                    }
                    return Boolean.valueOf(zT);
                case 17:
                case 18:
                    if (!((Boolean) tVar.getValue()).booleanValue() && !((Boolean) b0Var.f173097i.getValue()).booleanValue()) {
                        zT = false;
                    }
                    return Boolean.valueOf(zT);
                case 19:
                    zT = b1Var.W();
                    return Boolean.valueOf(zT);
                case 20:
                    zT = b1Var.Q();
                    return Boolean.valueOf(zT);
                case 21:
                    zT = b1Var.n0();
                    return Boolean.valueOf(zT);
                case 22:
                    zT = b1Var.Q0();
                    return Boolean.valueOf(zT);
                default:
                    return Boolean.valueOf(zT);
            }
        } else {
            if (i15 != 1) {
                if (i15 == 2) {
                    o13.r.b(objI);
                    return objI;
                }
                if (i15 == 3) {
                    o13.r.b(objI);
                    return objI;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        zT = objI instanceof c80.s.a;
        return Boolean.valueOf(zT);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) {
        e0 e0Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f173152c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f173152c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object objL = e0Var.f173150a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f173152c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objL);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objL);
            }
            boolean z14 = ((x01.e) objL).f188255d == x01.f.ACTIVE;
            return Boolean.valueOf(z14);
        }
        o13.r.b(objL);
        if (this.f173090b.w0()) {
            c80.q qVar = c80.q.NUTRITION;
            e0Var.f173152c = 1;
            objL = this.f173091c.l(qVar, e0Var);
            if (objL != aVar) {
            }
            return aVar;
        }
        return Boolean.valueOf(z14);
        if (((Boolean) objL).booleanValue()) {
            e0Var.f173152c = 2;
            objL = this.f173092d.a(true, e0Var);
        }
        return Boolean.valueOf(z14);
    }

    public b0(Context context, com.garmin.android.apps.connectmobile.b1 b1Var, zd0.j1 j1Var, x01.i iVar, o53.z zVar, lc0.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, b1Var, j1Var, iVar, (i14 & 16) != 0 ? o53.s0.f129406a : zVar, hVar);
    }
}
