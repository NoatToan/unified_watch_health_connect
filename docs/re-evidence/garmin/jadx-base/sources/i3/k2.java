package i3;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.y3 f88658a = new p3.y3(new i01.j(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3.y3 f88659b = new p3.y3(new i01.j(12));

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88660a;

        static {
            int[] iArr = new int[n3.m.values().length];
            try {
                iArr[n3.m.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n3.m.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n3.m.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n3.m.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n3.m.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n3.m.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n3.m.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n3.m.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n3.m.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[n3.m.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[n3.m.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[n3.m.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[n3.m.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[n3.m.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[n3.m.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[n3.m.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[n3.m.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[n3.m.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[n3.m.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[n3.m.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[n3.m.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[n3.m.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[n3.m.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[n3.m.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[n3.m.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[n3.m.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[n3.m.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[n3.m.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[n3.m.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[n3.m.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[n3.m.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[n3.m.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[n3.m.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[n3.m.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[n3.m.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[n3.m.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[n3.m.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[n3.m.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[n3.m.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[n3.m.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[n3.m.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[n3.m.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[n3.m.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[n3.m.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[n3.m.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[n3.m.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[n3.m.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[n3.m.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            f88660a = iArr;
        }
    }

    public static final long a(j2 j2Var, long j8) {
        long j14 = j2Var.f88471a;
        long j15 = j2Var.U;
        long j16 = j2Var.Q;
        long j17 = j2Var.M;
        long j18 = j2Var.f88502q;
        if (o4.d0.d(j8, j14)) {
            return j2Var.f88473b;
        }
        if (o4.d0.d(j8, j2Var.f88481f)) {
            return j2Var.f88483g;
        }
        if (o4.d0.d(j8, j2Var.f88489j)) {
            return j2Var.f88491k;
        }
        if (o4.d0.d(j8, j2Var.f88497n)) {
            return j2Var.f88499o;
        }
        if (o4.d0.d(j8, j2Var.f88508w)) {
            return j2Var.f88509x;
        }
        if (o4.d0.d(j8, j2Var.f88475c)) {
            return j2Var.f88477d;
        }
        if (o4.d0.d(j8, j2Var.f88485h)) {
            return j2Var.f88487i;
        }
        if (o4.d0.d(j8, j2Var.f88493l)) {
            return j2Var.f88495m;
        }
        if (o4.d0.d(j8, j2Var.f88510y)) {
            return j2Var.f88511z;
        }
        if (o4.d0.d(j8, j2Var.f88506u)) {
            return j2Var.f88507v;
        }
        if (o4.d0.d(j8, j2Var.f88501p)) {
            return j18;
        }
        if (o4.d0.d(j8, j2Var.f88503r)) {
            return j2Var.f88504s;
        }
        if (o4.d0.d(j8, j2Var.D) || o4.d0.d(j8, j2Var.F) || o4.d0.d(j8, j2Var.G) || o4.d0.d(j8, j2Var.H) || o4.d0.d(j8, j2Var.I) || o4.d0.d(j8, j2Var.J) || o4.d0.d(j8, j2Var.E)) {
            return j18;
        }
        if (o4.d0.d(j8, j2Var.K) || o4.d0.d(j8, j2Var.L)) {
            return j17;
        }
        if (o4.d0.d(j8, j2Var.O) || o4.d0.d(j8, j2Var.P)) {
            return j16;
        }
        if (o4.d0.d(j8, j2Var.S) || o4.d0.d(j8, j2Var.T)) {
            return j15;
        }
        o4.d0.f128823b.getClass();
        return o4.d0.f128832k;
    }

    public static final long b(long j8, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        mVar.C(89374938);
        s7.f89624a.getClass();
        long jA = a(s7.a(mVar), j8);
        if (jA == 16) {
            jA = ((o4.d0) mVar.A(s2.f89590a)).f128833a;
        }
        mVar.f();
        return jA;
    }

    public static j2 c(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37) {
        n3.k kVar = n3.k.f123028a;
        kVar.getClass();
        long j38 = n3.k.f123030c;
        kVar.getClass();
        long j39 = n3.k.B;
        kVar.getClass();
        long j44 = n3.k.f123037j;
        kVar.getClass();
        long j45 = n3.k.C;
        kVar.getClass();
        long j46 = n3.k.f123038k;
        kVar.getClass();
        long j47 = n3.k.A;
        kVar.getClass();
        long j48 = n3.k.f123036i;
        kVar.getClass();
        long j49 = n3.k.f123031d;
        kVar.getClass();
        long j54 = n3.k.f123029b;
        kVar.getClass();
        long j55 = n3.k.f123041n;
        kVar.getClass();
        long j56 = n3.k.f123044q;
        kVar.getClass();
        long j57 = n3.k.f123047t;
        kVar.getClass();
        long j58 = n3.k.f123048u;
        kVar.getClass();
        long j59 = n3.k.f123049v;
        kVar.getClass();
        long j64 = n3.k.f123050w;
        kVar.getClass();
        long j65 = n3.k.f123051x;
        kVar.getClass();
        long j66 = n3.k.f123052y;
        kVar.getClass();
        long j67 = n3.k.f123053z;
        kVar.getClass();
        long j68 = n3.k.f123042o;
        kVar.getClass();
        long j69 = n3.k.f123043p;
        kVar.getClass();
        long j74 = n3.k.f123032e;
        kVar.getClass();
        long j75 = n3.k.f123033f;
        kVar.getClass();
        long j76 = n3.k.f123045r;
        kVar.getClass();
        long j77 = n3.k.f123046s;
        kVar.getClass();
        long j78 = n3.k.f123034g;
        kVar.getClass();
        long j79 = n3.k.f123035h;
        kVar.getClass();
        long j84 = n3.k.D;
        kVar.getClass();
        long j85 = n3.k.E;
        kVar.getClass();
        long j86 = n3.k.f123039l;
        kVar.getClass();
        return new j2(j8, j14, j15, j16, j38, j17, j18, j19, j24, j39, j44, j45, j46, j25, j26, j27, j28, j47, j48, j8, j49, j54, j29, j34, j35, j36, j37, j55, j56, j57, j67, j58, j59, j64, j65, j66, j68, j69, j74, j75, j76, j77, j78, j79, j84, j85, j86, n3.k.f123040m, null);
    }

    public static final long d(j2 j2Var, n3.m mVar) {
        switch (a.f88660a[mVar.ordinal()]) {
            case 1:
                return j2Var.f88497n;
            case 2:
                return j2Var.f88508w;
            case 3:
                return j2Var.f88510y;
            case 4:
                return j2Var.f88507v;
            case 5:
                return j2Var.f88479e;
            case 6:
                return j2Var.f88506u;
            case 7:
                return j2Var.f88499o;
            case 8:
                return j2Var.f88509x;
            case 9:
                return j2Var.f88511z;
            case 10:
                return j2Var.f88473b;
            case 11:
                return j2Var.f88477d;
            case 12:
                return j2Var.f88483g;
            case 13:
                return j2Var.f88487i;
            case 14:
                return j2Var.f88502q;
            case 15:
                return j2Var.f88504s;
            case 16:
                return j2Var.f88505t;
            case 17:
                return j2Var.f88491k;
            case 18:
                return j2Var.f88495m;
            case 19:
                return j2Var.A;
            case 20:
                return j2Var.B;
            case 21:
                return j2Var.f88471a;
            case 22:
                return j2Var.f88475c;
            case 23:
                return j2Var.C;
            case 24:
                return j2Var.f88481f;
            case 25:
                return j2Var.f88485h;
            case 26:
                return j2Var.f88501p;
            case 27:
                return j2Var.f88503r;
            case 28:
                return j2Var.D;
            case 29:
                return j2Var.F;
            case 30:
                return j2Var.G;
            case 31:
                return j2Var.H;
            case 32:
                return j2Var.I;
            case 33:
                return j2Var.J;
            case 34:
                return j2Var.E;
            case 35:
                return j2Var.f88489j;
            case 36:
                return j2Var.f88493l;
            case 37:
                return j2Var.K;
            case 38:
                return j2Var.L;
            case 39:
                return j2Var.M;
            case 40:
                return j2Var.N;
            case 41:
                return j2Var.O;
            case 42:
                return j2Var.P;
            case 43:
                return j2Var.Q;
            case 44:
                return j2Var.R;
            case 45:
                return j2Var.S;
            case 46:
                return j2Var.T;
            case 47:
                return j2Var.U;
            case 48:
                return j2Var.V;
            default:
                lc.u0.r();
                return 0L;
        }
    }

    public static final long e(n3.m mVar, p3.m mVar2) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        return d(s7.a(mVar2), mVar);
    }
}
