package am;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lam/g;", "Landroid/os/Parcelable;", "", "Lc22/c3;", "titleId", "Lam/x0;", "filterType", "", "paginationEnabled", "personalRecordsEnabled", "enableSearchAndFiltering", "<init>", "(Ljava/lang/String;ILc22/c3;Lam/x0;ZZZ)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements Parcelable {
    public static final g A;
    public static final /* synthetic */ g[] B;
    public static final Parcelable.Creator<g> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f3942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f3943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f3944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f3945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f3946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f3947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f3948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f3949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f3950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f3951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f3952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f3953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f3954r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f3955t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f3956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f3957w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f3958x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f3959y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f3960z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f3961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f3962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3965e;

    static {
        c22.i iVarB = c22.i.b(R.string.activity_title_all_activities);
        x0 x0Var = x0.f4304m;
        g gVar = new g(Rule.ALL, 0, iVarB, x0Var, true, false, true);
        f3942f = gVar;
        int i14 = 16;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = false;
        g gVar2 = new g("BADGE", 1, c22.i.b(R.string.concept_activities), x0Var, z14, z15, z16, i14, jVar);
        f3943g = gVar2;
        g gVar3 = new g("CONNECTION_BADGE", 2, c22.i.b(R.string.concept_activities), x0Var, z14, z15, z16, i14, jVar);
        f3944h = gVar3;
        x0 x0Var2 = x0.f4331t;
        g gVar4 = new g("WALKING", 3, x0Var2.f4360c, x0Var2, z14, z15, z16, i14, jVar);
        f3945i = gVar4;
        x0 x0Var3 = x0.f4312o;
        boolean z17 = true;
        g gVar5 = new g("CYCLING", 4, x0Var3.f4360c, x0Var3, true, z17, false, 16, null);
        f3946j = gVar5;
        x0 x0Var4 = x0.f4324r;
        boolean z18 = true;
        g gVar6 = new g("SWIMMING", 5, x0Var4.f4360c, x0Var4, z17, z18, false, 16, null);
        f3947k = gVar6;
        x0 x0Var5 = x0.f4268a3;
        boolean z19 = true;
        boolean z24 = false;
        g gVar7 = new g("PARASPORTS", 6, x0Var5.f4360c, x0Var5, z18, z19, z24, 16, null);
        f3948l = gVar7;
        x0 x0Var6 = x0.f4320q;
        g gVar8 = new g("HIKING", 7, x0Var6.f4360c, x0Var6, z19, z24, false, 16, null);
        f3949m = gVar8;
        x0 x0Var7 = x0.f4308n;
        boolean z25 = true;
        boolean z26 = false;
        g gVar9 = new g("RUNNING", 8, x0Var7.f4360c, x0Var7, true, z25, z26, 16, null);
        f3950n = gVar9;
        x0 x0Var8 = x0.C;
        g gVar10 = new g("MULTISPORT", 9, x0Var8.f4360c, x0Var8, z25, z26, false, 16, null);
        f3951o = gVar10;
        x0 x0Var9 = x0.f4309n1;
        boolean z27 = true;
        g gVar11 = new g("STRENGTHTRAINING", 10, x0Var9.f4360c, x0Var9, true, z27, false, 16, null);
        f3952p = gVar11;
        x0 x0Var10 = x0.f4316p;
        g gVar12 = new g("FITNESSEQUIPMENT", 11, x0Var10.f4360c, x0Var10, z27, true, false, 16, null);
        f3953q = gVar12;
        x0 x0Var11 = x0.f4322q2;
        int i15 = 16;
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z28 = true;
        boolean z29 = false;
        boolean z34 = false;
        g gVar13 = new g("YOGA", 12, x0Var11.f4360c, x0Var11, z28, z29, z34, i15, jVar2);
        f3954r = gVar13;
        x0 x0Var12 = x0.f4326r2;
        g gVar14 = new g("PILATES", 13, x0Var12.f4360c, x0Var12, z28, z29, z34, i15, jVar2);
        x0 x0Var13 = x0.E;
        boolean z35 = false;
        g gVar15 = new g("SAFETY", 14, x0Var13.f4360c, x0Var13, true, false, z35, 16, null);
        f3955t = gVar15;
        x0 x0Var14 = x0.f4277d3;
        boolean z36 = false;
        g gVar16 = new g("TEAM_SPORTS", 15, x0Var14.f4360c, x0Var14, true, z35, z36, 16, null);
        f3956v = gVar16;
        x0 x0Var15 = x0.f4323q3;
        boolean z37 = false;
        g gVar17 = new g("RACKET_SPORTS", 16, x0Var15.f4360c, x0Var15, true, z36, z37, 16, null);
        f3957w = gVar17;
        x0 x0Var16 = x0.Y2;
        boolean z38 = false;
        g gVar18 = new g("HANDCYCLING", 17, x0Var16.f4360c, x0Var16, true, z37, z38, 16, null);
        x0 x0Var17 = x0.f4271b3;
        boolean z39 = false;
        g gVar19 = new g("PUSH_RUN_SPEED", 18, x0Var17.f4360c, x0Var17, true, z38, z39, 16, null);
        x0 x0Var18 = x0.f4350y;
        boolean z44 = false;
        g gVar20 = new g("WATER_SPORTS", 19, x0Var18.f4360c, x0Var18, true, z39, z44, 16, null);
        f3958x = gVar20;
        x0 x0Var19 = x0.U1;
        boolean z45 = false;
        g gVar21 = new g("WINTER_SPORTS", 20, x0Var19.f4360c, x0Var19, true, z44, z45, 16, null);
        f3959y = gVar21;
        x0 x0Var20 = x0.f4346x;
        g gVar22 = new g("OTHER", 21, x0Var20.f4360c, x0Var20, true, z45, false, 16, null);
        f3960z = gVar22;
        g gVar23 = new g("JUMP_ROPE", 22, x0.D3.f4360c, x0Var10, true, false, false, 16, null);
        A = gVar23;
        B = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23};
        CREATOR = new Parcelable.Creator<g>() { // from class: am.g.a
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                parcel.getClass();
                return g.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i16) {
                return new g[i16];
            }
        };
    }

    public /* synthetic */ g(String str, int i14, c3 c3Var, x0 x0Var, boolean z14, boolean z15, boolean z16, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, c3Var, x0Var, z14, z15, (i15 & 16) != 0 ? false : z16);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) B.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }

    private g(String str, int i14, c3 c3Var, x0 x0Var, boolean z14, boolean z15, boolean z16) {
        super(str, i14);
        this.f3961a = c3Var;
        this.f3962b = x0Var;
        this.f3963c = z14;
        this.f3964d = z15;
        this.f3965e = z16;
    }
}
