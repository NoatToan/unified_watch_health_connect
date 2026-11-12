package i3;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104B©\u0002\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b3\u00105Bñ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b3\u00106¨\u00067"}, d2 = {"Li3/j2;", "", "Lo4/d0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j2 {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long R;
    public final long S;
    public final long T;
    public final long U;
    public final long V;
    public b1 W;
    public b1 X;
    public b1 Y;
    public k1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88471a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public k1 f88472a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88473b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public xb f88474b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88475c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public mj f88476c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88477d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q1 f88478d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88479e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public b3 f88480e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f88481f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e7 f88482f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88483g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j7 f88484g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f88485h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public w7 f88486h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f88487i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public m9 f88488i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f88489j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public va f88490j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f88491k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ob f88492k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f88493l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public uc f88494l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f88495m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public sg f88496m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f88497n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public sg f88498n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f88499o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ph f88500o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f88501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f88502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f88503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f88504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f88505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f88506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f88507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f88508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f88509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f88510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f88511z;

    private j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, long j69, long j74, long j75, long j76, long j77, long j78, long j79, long j84, long j85, long j86, long j87, long j88) {
        this.f88471a = j8;
        this.f88473b = j14;
        this.f88475c = j15;
        this.f88477d = j16;
        this.f88479e = j17;
        this.f88481f = j18;
        this.f88483g = j19;
        this.f88485h = j24;
        this.f88487i = j25;
        this.f88489j = j26;
        this.f88491k = j27;
        this.f88493l = j28;
        this.f88495m = j29;
        this.f88497n = j34;
        this.f88499o = j35;
        this.f88501p = j36;
        this.f88502q = j37;
        this.f88503r = j38;
        this.f88504s = j39;
        this.f88505t = j44;
        this.f88506u = j45;
        this.f88507v = j46;
        this.f88508w = j47;
        this.f88509x = j48;
        this.f88510y = j49;
        this.f88511z = j54;
        this.A = j55;
        this.B = j56;
        this.C = j57;
        this.D = j58;
        this.E = j59;
        this.F = j64;
        this.G = j65;
        this.H = j66;
        this.I = j67;
        this.J = j68;
        this.K = j69;
        this.L = j74;
        this.M = j75;
        this.N = j76;
        this.O = j77;
        this.P = j78;
        this.Q = j79;
        this.R = j84;
        this.S = j85;
        this.T = j86;
        this.U = j87;
        this.V = j88;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColorScheme(primary=");
        r1.q2.m(this.f88471a, "onPrimary=", sb3);
        r1.q2.m(this.f88473b, "primaryContainer=", sb3);
        r1.q2.m(this.f88475c, "onPrimaryContainer=", sb3);
        long j8 = this.f88477d;
        r1.q2.m(j8, "inversePrimary=", sb3);
        r1.q2.m(this.f88479e, "secondary=", sb3);
        r1.q2.m(this.f88481f, "onSecondary=", sb3);
        r1.q2.m(this.f88483g, "secondaryContainer=", sb3);
        r1.q2.m(this.f88485h, "onSecondaryContainer=", sb3);
        r1.q2.m(this.f88487i, "tertiary=", sb3);
        r1.q2.m(this.f88489j, "onTertiary=", sb3);
        r1.q2.m(this.f88491k, "tertiaryContainer=", sb3);
        r1.q2.m(this.f88493l, "onTertiaryContainer=", sb3);
        r1.q2.m(this.f88495m, "background=", sb3);
        r1.q2.m(this.f88497n, "onBackground=", sb3);
        r1.q2.m(this.f88499o, "surface=", sb3);
        r1.q2.m(this.f88501p, "onSurface=", sb3);
        r1.q2.m(this.f88502q, "surfaceVariant=", sb3);
        r1.q2.m(this.f88503r, "onSurfaceVariant=", sb3);
        r1.q2.m(this.f88504s, "surfaceTint=", sb3);
        r1.q2.m(this.f88505t, "inverseSurface=", sb3);
        r1.q2.m(this.f88506u, "inverseOnSurface=", sb3);
        r1.q2.m(this.f88507v, "error=", sb3);
        r1.q2.m(this.f88508w, "onError=", sb3);
        r1.q2.m(this.f88509x, "errorContainer=", sb3);
        r1.q2.m(this.f88510y, "onErrorContainer=", sb3);
        r1.q2.m(this.f88511z, "outline=", sb3);
        r1.q2.m(this.A, "outlineVariant=", sb3);
        r1.q2.m(this.B, "scrim=", sb3);
        r1.q2.m(this.C, "surfaceBright=", sb3);
        r1.q2.m(this.D, "surfaceDim=", sb3);
        r1.q2.m(this.E, "surfaceContainer=", sb3);
        r1.q2.m(this.F, "surfaceContainerHigh=", sb3);
        r1.q2.m(this.G, "surfaceContainerHighest=", sb3);
        r1.q2.m(this.H, "surfaceContainerLow=", sb3);
        r1.q2.m(this.I, "surfaceContainerLowest=", sb3);
        r1.q2.m(this.J, "primaryFixed=", sb3);
        r1.q2.m(this.K, "primaryFixedDim=", sb3);
        r1.q2.m(this.L, "onPrimaryFixed=", sb3);
        r1.q2.m(j8, "onPrimaryFixedVariant=", sb3);
        r1.q2.m(this.N, "secondaryFixed=", sb3);
        r1.q2.m(this.O, "secondaryFixedDim=", sb3);
        r1.q2.m(this.P, "onSecondaryFixed=", sb3);
        r1.q2.m(this.Q, "onSecondaryFixedVariant=", sb3);
        r1.q2.m(this.R, "tertiaryFixed=", sb3);
        r1.q2.m(this.S, "tertiaryFixedDim=", sb3);
        r1.q2.m(this.T, "onTertiaryFixed=", sb3);
        r1.q2.m(this.U, "onTertiaryFixedVariant=", sb3);
        sb3.append((Object) o4.d0.j(this.V));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @o13.e
    public /* synthetic */ j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j59, j64, j65, j66, j67, j68);
    }

    @o13.e
    public /* synthetic */ j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57);
    }

    public /* synthetic */ j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68, long j69, long j74, long j75, long j76, long j77, long j78, long j79, long j84, long j85, long j86, long j87, long j88, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j59, j64, j65, j66, j67, j68, j69, j74, j75, j76, j77, j78, j79, j84, j85, j86, j87, j88);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57, long j58, long j59, long j64, long j65, long j66, long j67, long j68) {
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j69 = o4.d0.f128832k;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j59, j64, j65, j66, j67, j68, j69, j69, j69, j69, j69, j69, j69, j69, j69, j69, j69, j69, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private j2(long j8, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, long j38, long j39, long j44, long j45, long j46, long j47, long j48, long j49, long j54, long j55, long j56, long j57) {
        o4.d0.a aVar = o4.d0.f128823b;
        aVar.getClass();
        long j58 = o4.d0.f128832k;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this(j8, j14, j15, j16, j17, j18, j19, j24, j25, j26, j27, j28, j29, j34, j35, j36, j37, j38, j39, j44, j45, j46, j47, j48, j49, j54, j55, j56, j57, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, j58, null);
    }
}
