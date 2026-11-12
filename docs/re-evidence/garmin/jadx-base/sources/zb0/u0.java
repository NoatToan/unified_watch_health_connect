package zb0;

import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import okhttp3.internal.http.StatusLine;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't5' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class u0 {
    public static final u0 A5;
    public static final u0 B5;
    public static final u0 C5;
    public static final u0 D5;
    public static final u0 E5;
    public static final u0 F5;
    public static final u0 G5;
    public static final u0 H5;
    public static final u0 I5;
    public static final u0 J5;
    public static final u0 K5;
    public static final u0 L5;
    public static final u0 M5;
    public static final u0 N5;
    public static final u0 O5;
    public static final u0 P5;
    public static final u0 Q5;
    public static final u0 R5;
    public static final u0 S5;
    public static final u0 T5;
    public static final u0 U5;
    public static final u0 V5;
    public static final u0 W5;
    public static final u0 X5;
    public static final u0 Y5;
    public static final u0 Z5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final u0 f203697a6;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final u0 f203703b6;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final u0 f203709c6;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final u0 f203715d6;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final u0 f203720e6;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final u0 f203726f6;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final u0 f203732g6;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final u0 f203739h6;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final u0 f203746i6;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final u0 f203753j6;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final u0 f203761k6;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final u0 f203768l6;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static final u0 f203775m6;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static final HashMap f203782n6;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final /* synthetic */ u0[] f203789o6;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final u0 f203818t5;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final u0 f203823u5;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final u0 f203829v5;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final u0 f203835w5;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final u0 f203841x5;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final u0 f203847y5;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final u0 f203853z5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f203858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f203859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f203860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u0 f203733h = new u0("UNKNOWN", 0, yl2.b.f197686f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u0 f203740i = new u0("EDGE_25", 1, yl2.b.f197693g, cd0.q.class.getName(), cd0.r.class.getName(), cd0.t.class.getName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u0 f203747j = new u0("EDGE_510", 2, yl2.b.f197700h);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u0 f203754k = new u0("EDGE_520", 3, yl2.b.f197707i);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u0 f203762l = new u0("EDGE_810", 4, yl2.b.f197714j);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u0 f203769m = new u0("EDGE_820", 5, yl2.b.f197721k);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u0 f203776n = new u0("EDGE_820_Explore", 6, yl2.b.f197729l);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u0 f203783o = new u0("EDGE_1000", 7, yl2.b.f197736m);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u0 f203790p = new u0("EDGE_1000_Touring", 8, yl2.b.f197743n);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u0 f203796q = new u0("EDGE_1030", 9, yl2.b.f197750o);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u0 f203802r = new u0("EDGE_1030_BONTRAGER", 10, yl2.b.f197757p);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u0 f203813t = new u0("EDGE_130", 11, yl2.b.f197764q);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u0 f203824v = new u0("EDGE_1030_PLUS", 12, yl2.b.f197771r);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u0 f203830w = new u0("EDGE_130_PLUS", 13, yl2.b.f197797v);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u0 f203836x = new u0("EDGE_1040", 14, yl2.b.C);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final u0 f203842y = new u0("EDGE_EXPLORE", 15, yl2.b.f197804w);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u0 f203848z = new u0("EDGE_EXPLORE_2", 16, yl2.b.f197784t);
    public static final u0 A = new u0("EDGE_520_PLUS", 17, yl2.b.f197811x);
    public static final u0 B = new u0("EDGE_530", 18, yl2.b.f197818y);
    public static final u0 C = new u0("EDGE_830", 19, yl2.b.f197825z);
    public static final u0 D = new u0("EDGE_540", 20, yl2.b.A);
    public static final u0 E = new u0("EDGE_840", 21, yl2.b.B);
    public static final u0 F = new u0("EDGE_1050", 22, yl2.b.D);
    public static final u0 I = new u0("EDGE_MTB", 23, yl2.b.E);
    public static final u0 P = new u0("EDGE_550", 24, yl2.b.F);
    public static final u0 T = new u0("EDGE_850", 25, yl2.b.I);
    public static final u0 X = new u0("GRETA", 26, yl2.b.P);
    public static final u0 Y = new u0("CHRISTIE", 27, yl2.b.T);
    public static final u0 Z = new u0("ANNA", 28, yl2.b.X);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final u0 f203755k0 = new u0("RAY", 29, yl2.b.Y);
    public static final u0 H0 = new u0("INDEX_SMART_SCALE", 30, yl2.b.Z, cd0.e0.class.getName(), cd0.d0.class.getName(), cd0.n.class.getName());
    public static final u0 I0 = new u0("FORERUNNER_220", 31, yl2.b.f197722k0, cd0.a0.class.getName(), cd0.z.class.getName(), cd0.n.class.getName());
    public static final u0 J0 = new u0("FORERUNNER_223", 32, yl2.b.H0, cd0.l.class.getName(), cd0.k.class.getName(), cd0.n.class.getName());
    public static final u0 K0 = new u0("FORERUNNER_225", 33, yl2.b.I0, cd0.l.class.getName(), cd0.k.class.getName(), cd0.n.class.getName());
    public static final u0 L0 = new u0("FORERUNNER_230", 34, yl2.b.J0, cd0.y.class.getName(), cd0.x.class.getName(), cd0.n.class.getName());
    public static final u0 M0 = new u0("FORERUNNER_235", 35, yl2.b.K0);
    public static final u0 N0 = new u0("FORERUNNER_235L", 36, yl2.b.L0);
    public static final u0 O0 = new u0("FORERUNNER_245", 37, yl2.b.M0);
    public static final u0 P0 = new u0("FORERUNNER_245M", 38, yl2.b.N0);
    public static final u0 Q0 = new u0("FORERUNNER_255S", 39, yl2.b.O0);
    public static final u0 R0 = new u0("FORERUNNER_255", 40, yl2.b.P0);
    public static final u0 S0 = new u0("FORERUNNER_255S_MUSIC", 41, yl2.b.Q0);
    public static final u0 T0 = new u0("FORERUNNER_255_MUSIC", 42, yl2.b.R0);
    public static final u0 U0 = new u0("FORERUNNER_645", 43, yl2.b.S0);
    public static final u0 V0 = new u0("FORERUNNER_645M", 44, yl2.b.T0);
    public static final u0 W0 = new u0("FORERUNNER_935", 45, yl2.b.U0);
    public static final u0 X0 = new u0("FORERUNNER_945", 46, yl2.b.V0);
    public static final u0 Y0 = new u0("FORERUNNER_945_LTE", 47, yl2.b.W0);
    public static final u0 Z0 = new u0("FORERUNNER_955", 48, yl2.b.X0);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final u0 f203692a1 = new u0("FORERUNNER_965", 49, yl2.b.Y0);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final u0 f203698b1 = new u0("FORERUNNER_265S", 50, yl2.b.Z0);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final u0 f203704c1 = new u0("FORERUNNER_265", 51, yl2.b.f197657a1);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final u0 f203710d1 = new u0("FILLY", 52, yl2.b.f197663b1);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final u0 f203716e1 = new u0("FILLYM", 53, yl2.b.f197669c1);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final u0 f203721f1 = new u0("RABBIT", 54, yl2.b.f197694g1);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final u0 f203727g1 = new u0("HARE", 55, yl2.b.f197701h1);

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final u0 f203734h1 = new u0("DEER", 56, yl2.b.f197708i1);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final u0 f203741i1 = new u0("ROSS", 57, yl2.b.f197715j1);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final u0 f203748j1 = new u0("RACHEL", 58, yl2.b.f197723k1);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final u0 f203756k1 = new u0("CHANDLER", 59, yl2.b.f197730l1);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final u0 f203763l1 = new u0("MONICA", 60, yl2.b.f197737m1);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final u0 f203770m1 = new u0("JOEY", 61, yl2.b.f197744n1);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final u0 f203777n1 = new u0("PHOEBE", 62, yl2.b.f197751o1);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final u0 f203784o1 = new u0("HOGLET", 63, yl2.b.f197758p1);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final u0 f203791p1 = new u0("HEDGEHOG", 64, yl2.b.f197675d1);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final u0 f203797q1 = new u0("FAWN", 65, yl2.b.f197681e1);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final u0 f203803r1 = new u0("FAWNM", 66, yl2.b.f197687f1);

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final u0 f203808s1 = new u0("FORERUNNER_620", 67, yl2.b.f197765q1, cd0.a0.class.getName(), cd0.z.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final u0 f203814t1 = new u0("FORERUNNER_630", 68, yl2.b.f197772r1, cd0.y.class.getName(), cd0.x.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final u0 f203819u1 = new u0("FORERUNNER_920XT", 69, yl2.b.f197778s1, cd0.l.class.getName(), cd0.k.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final u0 f203825v1 = new u0("FORERUNNER_735XT", 70, yl2.b.f197785t1, cd0.y.class.getName(), cd0.x.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final u0 f203831w1 = new u0("FORERUNNER_745", 71, yl2.b.f197791u1);

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final u0 f203837x1 = new u0("FORERUNNER_25", 72, yl2.b.f197798v1, cd0.l.class.getName(), cd0.k.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final u0 f203843y1 = new u0("FORERUNNER_35", 73, yl2.b.f197805w1);

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final u0 f203849z1 = new u0("FORERUNNER_30", 74, yl2.b.f197812x1);
    public static final u0 A1 = new u0("FORERUNNER_45", 75, yl2.b.f197819y1);
    public static final u0 B1 = new u0("FORERUNNER_45_PLUS", 76, yl2.b.f197826z1);
    public static final u0 C1 = new u0("FORERUNNER_55", 77, yl2.b.A1);
    public static final u0 D1 = new u0("KONIK", 78, yl2.b.B1);
    public static final u0 E1 = new u0("VIVOFIT", 79, yl2.b.C1, cd0.p0.class.getName(), cd0.o0.class.getName(), cd0.n.class.getName());
    public static final u0 F1 = new u0("VIVOFIT2", 80, yl2.b.D1, cd0.n0.class.getName(), cd0.o0.class.getName(), cd0.n.class.getName());
    public static final u0 G1 = new u0("VIVOFIT3", 81, yl2.b.E1);
    public static final u0 H1 = new u0("VIVOFIT4", 82, yl2.b.F1);
    public static final u0 I1 = new u0("VIVOMOVE", 83, yl2.b.G1, cd0.r0.class.getName(), cd0.o0.class.getName(), cd0.n.class.getName());
    public static final u0 J1 = new u0("VIVOMOVE_HR", 84, yl2.b.H1);
    public static final u0 K1 = new u0("VIVOMOVE_3_CLASSIC", 85, yl2.b.I1);
    public static final u0 L1 = new u0("VIVOMOVE_3_SPORT", 86, yl2.b.J1);
    public static final u0 M1 = new u0("QUARTZ", 87, yl2.b.K1);
    public static final u0 N1 = new u0("JADE", 88, yl2.b.L1);
    public static final u0 O1 = new u0("VIVOKI", 89, yl2.b.M1, cd0.q0.class.getName(), cd0.o0.class.getName(), cd0.n.class.getName());
    public static final u0 P1 = new u0("VIVOSMART", 90, yl2.b.N1, cd0.u0.class.getName(), cd0.o0.class.getName(), cd0.n.class.getName());
    public static final u0 Q1 = new u0("VIVOSMART_HR", 91, yl2.b.O1);
    public static final u0 R1 = new u0("VIVOSMART_GPS_HR", 92, yl2.b.P1);
    public static final u0 S1 = new u0("VIVOSMART_3", 93, yl2.b.Q1);
    public static final u0 T1 = new u0("VIVOSMART_4", 94, yl2.b.R1);
    public static final u0 U1 = new u0("FRANKLIN", 95, yl2.b.S1);
    public static final u0 V1 = new u0("VIVOSPORT", 96, yl2.b.T1);
    public static final u0 W1 = new u0("VIVOACTIVE", 97, yl2.b.U1, cd0.m0.class.getName(), cd0.l0.class.getName(), cd0.n.class.getName());
    public static final u0 X1 = new u0("VIVOACTIVE_HR", 98, yl2.b.V1);
    public static final u0 Y1 = new u0("VIVOACTIVE_3", 99, yl2.b.W1);
    public static final u0 Z1 = new u0("VIVOACTIVE_3T", 100, yl2.b.X1);

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final u0 f203693a2 = new u0("VIVOLIFE", 101, yl2.b.Y1);

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final u0 f203699b2 = new u0("VIVOACTIVE_3_MUSIC", 102, yl2.b.f197658a2);

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final u0 f203705c2 = new u0("VIVOACTIVE_3_MUSIC_LTE", 103, yl2.b.f197664b2);

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final u0 f203711d2 = new u0("VIVOACTIVE_3_DAIMLER", 104, yl2.b.Z1);

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final u0 f203717e2 = new u0("VIVOACTIVE_4S", 105, yl2.b.f197670c2);

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final u0 f203722f2 = new u0("VIVOACTIVE_4_VENU", 106, yl2.b.f197676d2);

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final u0 f203728g2 = new u0("VIVOACTIVE_4", 107, yl2.b.f197682e2);

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final u0 f203735h2 = new u0("VIVOACTIVE_4_CAPTAIN_MARVEL", 108, yl2.b.f197688f2);

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final u0 f203742i2 = new u0("VIVOACTIVE_4_FIRST_AVENGER", 109, yl2.b.f197695g2);

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final u0 f203749j2 = new u0("VIVOACTIVE_4_REY", 110, yl2.b.f197702h2);

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final u0 f203757k2 = new u0("VIVOACTIVE_4_DARTH_VADER", 111, yl2.b.f197709i2);

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final u0 f203764l2 = new u0("LUMEN", 112, yl2.b.f197738m2);

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final u0 f203771m2 = new u0("LUNA", 113, yl2.b.f197745n2);

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final u0 f203778n2 = new u0("FLARE", 114, yl2.b.f197752o2);

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final u0 f203785o2 = new u0("ELF", 115, yl2.b.E2);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final u0 f203792p2 = new u0("VENU_D2_AIR", 116, yl2.b.f197759p2);

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final u0 f203798q2 = new u0("VENU_DAIMLER", 117, yl2.b.f197766q2);

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final u0 f203804r2 = new u0("VENU_2", 118, yl2.b.f197773r2);

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final u0 f203809s2 = new u0("VENU_2S", 119, yl2.b.f197779s2);

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final u0 f203815t2 = new u0("VENU_2_DAIMLER", 120, yl2.b.f197786t2);

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final u0 f203820u2 = new u0("VENU_2S_DAIMLER", 121, yl2.b.f197792u2);

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final u0 f203826v2 = new u0("VENU_2_PLUS", 122, yl2.b.f197799v2);

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final u0 f203832w2 = new u0("VENU_2_PLUS_PROPELLER", 123, yl2.b.f197806w2);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final u0 f203838x2 = new u0("D2_AIR_X15", 124, yl2.b.f197813x2);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final u0 f203844y2 = new u0("VENU_3", 125, yl2.b.f197820y2);

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final u0 f203850z2 = new u0("VENU_3S", 126, yl2.b.f197827z2);
    public static final u0 A2 = new u0("VENU_4", 127, yl2.b.A2);
    public static final u0 B2 = new u0("VENU_4S", 128, yl2.b.B2);
    public static final u0 C2 = new u0("ROMEO", 129, yl2.b.C2);
    public static final u0 D2 = new u0("JULIET", 130, yl2.b.D2);
    public static final u0 E2 = new u0("KOI_BASIC", 131, yl2.b.f197716j2);
    public static final u0 F2 = new u0("KOI_MUSIC", 132, yl2.b.f197724k2);
    public static final u0 G2 = new u0("IMP", 133, yl2.b.F2);
    public static final u0 H2 = new u0("FENIX", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, yl2.b.H2, cd0.f0.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());
    public static final u0 I2 = new u0("FENIX2", TsExtractor.TS_STREAM_TYPE_E_AC3, yl2.b.I2, cd0.f0.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());
    public static final u0 J2 = new u0("FENIX3", SyslogConstants.LOG_LOCAL1, yl2.b.J2, cd0.w.class.getName(), cd0.u.class.getName(), cd0.n.class.getName());
    public static final u0 K2 = new u0("FENIX3HR", 137, yl2.b.K2, cd0.w.class.getName(), cd0.u.class.getName(), cd0.n.class.getName());
    public static final u0 L2 = new u0("FENIX_CHRONOS", TsExtractor.TS_STREAM_TYPE_DTS, yl2.b.L2);
    public static final u0 M2 = new u0("FENIX_INSTINCT", 139, yl2.b.M2);
    public static final u0 N2 = new u0("FENIX_5", 140, yl2.b.N2);
    public static final u0 O2 = new u0("FENIX_5X", 141, yl2.b.O2);
    public static final u0 P2 = new u0("FENIX_5S", 142, yl2.b.P2);
    public static final u0 Q2 = new u0("FENIX_5_PLUS", 143, yl2.b.Q2);
    public static final u0 R2 = new u0("FENIX_5S_PLUS", SyslogConstants.LOG_LOCAL2, yl2.b.R2);
    public static final u0 S2 = new u0("FENIX_5X_PLUS", 145, yl2.b.S2);
    public static final u0 T2 = new u0("FENIX_6_PRO", 146, yl2.b.Y2);
    public static final u0 U2 = new u0("FENIX_6S_PRO", 147, yl2.b.Z2);
    public static final u0 V2 = new u0("FENIX_6X", 148, yl2.b.f197659a3);
    public static final u0 W2 = new u0("FENIX_6", 149, yl2.b.f197665b3);
    public static final u0 X2 = new u0("FENIX_6S", 150, yl2.b.f197683e3);
    public static final u0 Y2 = new u0("STARBRIDGE", 151, yl2.b.T2);
    public static final u0 Z2 = new u0("RODMAN", SyslogConstants.LOG_LOCAL3, yl2.b.f197689f3);

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final u0 f203694a3 = new u0("MAPLE", 153, yl2.b.f197696g3);

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final u0 f203700b3 = new u0("BONSAI", 154, yl2.b.f197703h3);

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final u0 f203706c3 = new u0("SEQUOIA", ModuleDescriptor.MODULE_VERSION, yl2.b.f197710i3);

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final u0 f203712d3 = new u0("SHERMAN", 156, yl2.b.f197780s3);

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final u0 f203718e3 = new u0("LOKI", 157, yl2.b.f197717j3);

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final u0 f203723f3 = new u0("THOR", 158, yl2.b.f197725k3);

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final u0 f203729g3 = new u0("ODIN", 159, yl2.b.f197732l3);

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final u0 f203736h3 = new u0("ELM", SyslogConstants.LOG_LOCAL4, yl2.b.f197739m3);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final u0 f203743i3 = new u0("GINKGO", 161, yl2.b.f197746n3);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final u0 f203750j3 = new u0("AUSTIN", 162, yl2.b.f197753o3);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final u0 f203758k3 = new u0("XWING", 163, yl2.b.f197787t3);

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final u0 f203765l3 = new u0("ARTOO", 164, yl2.b.f197793u3);

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final u0 f203772m3 = new u0("EBONY", 165, yl2.b.f197800v3);

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final u0 f203779n3 = new u0("MOGO", 166, yl2.b.f197807w3);

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final u0 f203786o3 = new u0("FREYA", 167, yl2.b.f197760p3);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final u0 f203793p3 = new u0("NORD", 168, yl2.b.f197767q3);

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final u0 f203799q3 = new u0("MODI", 169, yl2.b.f197774r3);

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final u0 f203805r3 = new u0("PARKER", 170, yl2.b.f197814x3);

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final u0 f203810s3 = new u0("DUNCAN", 171, yl2.b.f197821y3);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final u0 f203816t3 = new u0("KEMP", TsExtractor.TS_STREAM_TYPE_AC4, yl2.b.f197828z3);

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final u0 f203821u3 = new u0("PERKINS", 173, yl2.b.A3);

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final u0 f203827v3 = new u0("BOWEN", 174, yl2.b.E3);

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final u0 f203833w3 = new u0("PANDO", 175, yl2.b.B3);

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final u0 f203839x3 = new u0("BRISTLECONE", SyslogConstants.LOG_LOCAL6, yl2.b.C3);

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final u0 f203845y3 = new u0("GOBI", 177, yl2.b.D3);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final u0 f203851z3 = new u0("KENON_ALDRIDGE", 178, yl2.b.F3);
    public static final u0 A3 = new u0("ALLEN", 179, yl2.b.K3);
    public static final u0 B3 = new u0("MARGAY_CARACAL", 180, yl2.b.G3);
    public static final u0 C3 = new u0("BENGAL_SIBERIAN", 181, yl2.b.H3);
    public static final u0 D3 = new u0("PANTHER", 182, yl2.b.I3);
    public static final u0 E3 = new u0("GERVIN_ROBINSON", 183, yl2.b.J3);
    public static final u0 F3 = new u0("SHATNER_NIMOY", SyslogConstants.LOG_LOCAL7, yl2.b.L3);
    public static final u0 G3 = new u0("BENDER", 185, yl2.b.M3);
    public static final u0 H3 = new u0("TABBY", 186, yl2.b.P3);
    public static final u0 I3 = new u0("OCELOT", 187, yl2.b.Q3);
    public static final u0 J3 = new u0("TIGER", TsExtractor.TS_PACKET_SIZE, yl2.b.R3);
    public static final u0 K3 = new u0("SERVAL", PsExtractor.PRIVATE_STREAM_1, yl2.b.S3);
    public static final u0 L3 = new u0("LEOPARD", 190, yl2.b.T3);
    public static final u0 M3 = new u0("PERSIAN", 191, yl2.b.U3);
    public static final u0 N3 = new u0("JAGA", 192, yl2.b.f197666b4);
    public static final u0 O3 = new u0("COUGAR", 193, yl2.b.X3);
    public static final u0 P3 = new u0("CORYDORA", 194, yl2.b.V3);
    public static final u0 Q3 = new u0("PICTUS", 195, yl2.b.W3);
    public static final u0 R3 = new u0("LEAH_SNARF", 196, yl2.b.Y3);
    public static final u0 S3 = new u0("TORR_CHEETARA", 197, yl2.b.Z3);
    public static final u0 T3 = new u0("WILYCUB_PANTHRO", 198, yl2.b.f197660a4);
    public static final u0 U3 = new u0("VENU_X1", 199, yl2.b.G2);
    public static final u0 V3 = new u0("CRANSTON", 200, yl2.b.f197672c4);
    public static final u0 W3 = new u0("ODENKIRK", 201, yl2.b.f197678d4);
    public static final u0 X3 = new u0("INSTINCT_CROSSOVER", 202, yl2.b.e4);
    public static final u0 Y3 = new u0("INSTINCT_CROSSOVER_AMOLED", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, yl2.b.f197690f4);
    public static final u0 Z3 = new u0("CRAWFORD", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, yl2.b.f197697g4);

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final u0 f203695a4 = new u0("ECLAIR", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, yl2.b.f197704h4);

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final u0 f203701b4 = new u0("CANNOLI", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, yl2.b.f197711i4);

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final u0 f203707c4 = new u0("DONUT", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, yl2.b.f197718j4);

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final u0 f203713d4 = new u0("PIE", 208, yl2.b.f197726k4);
    public static final u0 e4 = new u0("BAKLAVA", 209, yl2.b.f197733l4);

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final u0 f203724f4 = new u0("BISCUIT", 210, yl2.b.f197740m4);

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final u0 f203730g4 = new u0("EASYBAKE", 211, yl2.b.f197747n4);

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final u0 f203737h4 = new u0("SKINK", 212, yl2.b.f197754o4);

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final u0 f203744i4 = new u0("BASILISK", 213, yl2.b.f197761p4);

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final u0 f203751j4 = new u0("CAIMAN", 214, yl2.b.f197768q4);

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final u0 f203759k4 = new u0("MAMBA", 215, yl2.b.f197775r4);

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final u0 f203766l4 = new u0("ANACONDA", 216, yl2.b.f197781s4);

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final u0 f203773m4 = new u0("MARQ_ATHLETE", 217, yl2.b.f197788t4);

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final u0 f203780n4 = new u0("MARQ_AVIATOR", 218, yl2.b.f197794u4);

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final u0 f203787o4 = new u0("MARQ_CAPTAIN", 219, yl2.b.f197801v4);

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final u0 f203794p4 = new u0("MARQ_COMMANDER", 220, yl2.b.f197808w4);

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final u0 f203800q4 = new u0("MARQ_DRIVER", 221, yl2.b.f197822y4);

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final u0 f203806r4 = new u0("MARQ_EXPEDITION", 222, yl2.b.f197829z4);

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final u0 f203811s4 = new u0("MARQ_ADVENTURER", 223, yl2.b.A4);

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final u0 f203817t4 = new u0("MAGO", 224, yl2.b.B4);

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final u0 f203822u4 = new u0("MAGNA", 225, yl2.b.C4);

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final u0 f203828v4 = new u0("MAGNA_AV", 226, yl2.b.D4);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final u0 f203834w4 = new u0("OREO", 227, yl2.b.f197815x4);

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final u0 f203840x4 = new u0("FORTIS", 228, yl2.b.E4);

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final u0 f203846y4 = new u0("D2_CHARLIE", 229, yl2.b.U2);

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final u0 f203852z4 = new u0("D2_DELTA", 230, yl2.b.V2);
    public static final u0 A4 = new u0("D2_DELTA_S", 231, yl2.b.W2);
    public static final u0 B4 = new u0("D2_DELTA_PX", 232, yl2.b.X2);
    public static final u0 C4 = new u0("EPIX", 233, yl2.b.F4, cd0.w.class.getName(), cd0.u.class.getName(), cd0.n.class.getName());
    public static final u0 D4 = new u0("D2_BRAVO", 234, yl2.b.G4, cd0.w.class.getName(), cd0.u.class.getName(), cd0.n.class.getName());
    public static final u0 E4 = new u0("D2_BRAVO_TITANIUM", 235, yl2.b.H4, cd0.w.class.getName(), cd0.u.class.getName(), cd0.n.class.getName());
    public static final u0 F4 = new u0("GPSMAP_64", 236, yl2.b.I4);
    public static final u0 G4 = new u0("GPSMAP_64SC", 237, yl2.b.J4);
    public static final u0 H4 = new u0("GPSMAP_64x", 238, yl2.b.K4);
    public static final u0 I4 = new u0("GPSMAP_64csx", 239, yl2.b.L4);
    public static final u0 J4 = new u0("GPSMAP_65", PsExtractor.VIDEO_STREAM_MASK, yl2.b.M4);
    public static final u0 K4 = new u0("BADGER", 241, yl2.b.N4);
    public static final u0 L4 = new u0("GPSMAP_66", 242, yl2.b.O4);
    public static final u0 M4 = new u0("GPSMAP_66i", 243, yl2.b.P4);
    public static final u0 N4 = new u0("GPSMAP_66sr", 244, yl2.b.Q4);
    public static final u0 O4 = new u0("BRIMSTONE", 245, yl2.b.R4);
    public static final u0 P4 = new u0("GPSMAP_86s", 246, yl2.b.S4);
    public static final u0 Q4 = new u0("GPSMAP_86sc", 247, yl2.b.T4);
    public static final u0 R4 = new u0("GPSMAP_86I", 248, yl2.b.U4);
    public static final u0 S4 = new u0("GPSMAP_86scI", 249, yl2.b.V4);
    public static final u0 T4 = new u0("MONTANA_7XX", 250, yl2.b.W4);
    public static final u0 U4 = new u0("DRISKO", 251, yl2.b.X4);
    public static final u0 V4 = new u0("ETREX_TOUCH_35", 252, yl2.b.Y4, cd0.f0.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());
    public static final u0 W4 = new u0("PORQUEROLLES", 253, yl2.b.Z4);
    public static final u0 X4 = new u0("OREGON_7XX", 254, yl2.b.f197673c5);
    public static final u0 Y4 = new u0("CHEBEAGUE", 255, yl2.b.f197691f5);
    public static final u0 Z4 = new u0("MARCO", 256, yl2.b.f197661a5);

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final u0 f203696a5 = new u0("POLO", TsExtractor.TS_STREAM_TYPE_AIT, yl2.b.f197667b5);

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final u0 f203702b5 = new u0("FORETREX", 258, yl2.b.f197679d5, cd0.c0.class.getName(), cd0.g0.class.getName(), cd0.b0.class.getName());

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final u0 f203708c5 = new u0("STRETFORD", 259, yl2.b.f197684e5);

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final u0 f203714d5 = new u0("APPROACH_G7", 260, yl2.b.f197698g5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final u0 f203719e5 = new u0("APPROACH_G8", 261, yl2.b.f197705h5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final u0 f203725f5 = new u0("APPROACH_G30", 262, yl2.b.f197712i5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final u0 f203731g5 = new u0("APPROACH_G80", 263, yl2.b.f197789t5, null, null, null);

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final u0 f203738h5 = new u0("POINTBREAK", 264, yl2.b.f197809w5, null, null, null);

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final u0 f203745i5 = new u0("APPROACH_S12", 265, yl2.b.f197748n5, null, null, null);

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final u0 f203752j5 = new u0("APPROACH_G12", 266, yl2.b.f197795u5, null, null, null);

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final u0 f203760k5 = new u0("JAMES", 267, yl2.b.E5);

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final u0 f203767l5 = new u0("APPROACH_S40", 268, yl2.b.F5, cd0.w.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final u0 f203774m5 = new u0("APPROACH_S42", 269, yl2.b.G5, cd0.w.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final u0 f203781n5 = new u0("APPROACH_S2", 270, yl2.b.f197719j5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final u0 f203788o5 = new u0("APPROACH_S4", 271, yl2.b.f197727k5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final u0 f203795p5 = new u0("APPROACH_S5", 272, yl2.b.f197734l5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final u0 f203801q5 = new u0("APPROACH_S6", 273, yl2.b.f197741m5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final u0 f203807r5 = new u0("APPROACH_S20", 274, yl2.b.f197755o5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final u0 f203812s5 = new u0("APPROACH_S60", 275, yl2.b.f197762p5, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName());

    static {
        yl2.b bVar = yl2.b.f197769q5;
        f203818t5 = new u0("APPROACH_S62", 276, bVar, bVar.f197832a, cd0.j.class.getName(), cd0.g0.class.getName(), cd0.n.class.getName(), true);
        f203823u5 = new u0("APPROACH_S70", 277, yl2.b.f197776r5);
        f203829v5 = new u0("APPROACH_S70S", 278, yl2.b.f197782s5);
        f203835w5 = new u0("CLYDE", 279, yl2.b.L5);
        f203841x5 = new u0("BONNIE", 280, yl2.b.M5);
        f203847y5 = new u0("TEA", 281, yl2.b.J5);
        f203853z5 = new u0("LEMONADE", 282, yl2.b.I5);
        A5 = new u0("APPROACH_X40", 283, yl2.b.H5);
        B5 = new u0("APPROACH_Z82", 284, yl2.b.B5, null, null, null);
        C5 = new u0("APPROACH_R10", 285, yl2.b.C5, null, null, null);
        D5 = new u0("KNEEBOARD", 286, yl2.b.f197802v5);
        E5 = new u0("TRU_SWING", 287, yl2.b.N5, cd0.i0.class.getName(), cd0.j0.class.getName(), cd0.n.class.getName());
        F5 = new u0("DESCENT", 288, yl2.b.O5);
        G5 = new u0("GENTOO", 289, yl2.b.P5);
        H5 = new u0("BLUE", 290, yl2.b.Q5);
        I5 = new u0("MINKE", 291, yl2.b.W5);
        J5 = new u0("LEVIATHAN", 292, yl2.b.R5);
        K5 = new u0("NESSIE", 293, yl2.b.S5);
        yl2.b bVar2 = yl2.b.f197674c6;
        L5 = new u0("VECTOR_3", 294, bVar2, bVar2.f197832a, null, cd0.k0.class.getName(), null, true);
        M5 = new u0("GARMIN_SWIM_2", 295, yl2.b.f197668b6);
        N5 = new u0("SPEED_SENSOR_ORCA", 296, yl2.b.Z5);
        O5 = new u0("SPEED_SENSOR_ORCA_CND", 297, yl2.b.f197662a6);
        P5 = new u0("INDEX_SMART_SCALE_2", 298, yl2.b.f197699g6);
        Q5 = new u0("HRM_DUAL_ADVANCED", 299, yl2.b.f197706h6);
        R5 = new u0("RALLY", 300, yl2.b.f197713i6);
        S5 = new u0("MERCURY", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, yl2.b.f197720j6);
        T5 = new u0("SPLASH", 302, yl2.b.f197728k6);
        U5 = new u0("CINEMA", 303, yl2.b.f197763p6);
        V5 = new u0("HRM_FIT", 304, yl2.b.f197735l6);
        W5 = new u0("APHRODITE", 305, yl2.b.f197756o6);
        X5 = new u0("HERMES", 306, yl2.b.f197742m6);
        Y5 = new u0("CHAMOMILE", StatusLine.HTTP_TEMP_REDIRECT, yl2.b.f197749n6);
        Z5 = new u0("ONI", StatusLine.HTTP_PERM_REDIRECT, yl2.b.f197731l2);
        f203697a6 = new u0("CONCHA", 309, yl2.b.X5);
        f203703b6 = new u0("MACHOP", 310, yl2.b.f197770q6);
        f203709c6 = new u0("MACHAMP", 311, yl2.b.f197777r6);
        f203715d6 = new u0("YOGI", 312, yl2.b.f197796u6);
        f203720e6 = new u0("ARABICA", 313, yl2.b.f197803v6);
        f203726f6 = new u0("XCEL_SPRINT_BASE", 314, yl2.b.f197783s6);
        f203732g6 = new u0("XCEL_SPRINT_SENSOR", 315, yl2.b.f197790t6);
        f203739h6 = new u0("DECAF", 316, yl2.b.f197810w6);
        f203746i6 = new u0("KYUREM", 317, yl2.b.f197817x6);
        f203753j6 = new u0("KYUREMP", 318, yl2.b.f197824y6);
        f203761k6 = new u0("SMALLS", 319, yl2.b.K5);
        f203768l6 = new u0("KAPPA", 320, yl2.b.f197831z6);
        f203775m6 = new u0("Rogers", 321, yl2.b.A6);
        f203789o6 = a();
        f203782n6 = new HashMap();
        for (u0 u0Var : values()) {
            for (String str : u0Var.f203854a.split(",")) {
                if (!TextUtils.isEmpty(str)) {
                    f203782n6.put(str, u0Var);
                }
            }
        }
    }

    private u0(String str, int i14, yl2.b bVar, String str2, String str3, String str4, String str5, boolean z14) {
        super(str, i14);
        this.f203854a = str2;
        this.f203855b = str3;
        this.f203856c = str4;
        this.f203857d = str5;
        this.f203859f = z14;
        this.f203858e = bVar.f197834c;
        this.f203860g = bVar.name();
    }

    public static /* synthetic */ u0[] a() {
        return new u0[]{f203733h, f203740i, f203747j, f203754k, f203762l, f203769m, f203776n, f203783o, f203790p, f203796q, f203802r, f203813t, f203824v, f203830w, f203836x, f203842y, f203848z, A, B, C, D, E, F, I, P, T, X, Y, Z, f203755k0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f203692a1, f203698b1, f203704c1, f203710d1, f203716e1, f203721f1, f203727g1, f203734h1, f203741i1, f203748j1, f203756k1, f203763l1, f203770m1, f203777n1, f203784o1, f203791p1, f203797q1, f203803r1, f203808s1, f203814t1, f203819u1, f203825v1, f203831w1, f203837x1, f203843y1, f203849z1, A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1, f203693a2, f203699b2, f203705c2, f203711d2, f203717e2, f203722f2, f203728g2, f203735h2, f203742i2, f203749j2, f203757k2, f203764l2, f203771m2, f203778n2, f203785o2, f203792p2, f203798q2, f203804r2, f203809s2, f203815t2, f203820u2, f203826v2, f203832w2, f203838x2, f203844y2, f203850z2, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2, Q2, R2, S2, T2, U2, V2, W2, X2, Y2, Z2, f203694a3, f203700b3, f203706c3, f203712d3, f203718e3, f203723f3, f203729g3, f203736h3, f203743i3, f203750j3, f203758k3, f203765l3, f203772m3, f203779n3, f203786o3, f203793p3, f203799q3, f203805r3, f203810s3, f203816t3, f203821u3, f203827v3, f203833w3, f203839x3, f203845y3, f203851z3, A3, B3, C3, D3, E3, F3, G3, H3, I3, J3, K3, L3, M3, N3, O3, P3, Q3, R3, S3, T3, U3, V3, W3, X3, Y3, Z3, f203695a4, f203701b4, f203707c4, f203713d4, e4, f203724f4, f203730g4, f203737h4, f203744i4, f203751j4, f203759k4, f203766l4, f203773m4, f203780n4, f203787o4, f203794p4, f203800q4, f203806r4, f203811s4, f203817t4, f203822u4, f203828v4, f203834w4, f203840x4, f203846y4, f203852z4, A4, B4, C4, D4, E4, F4, G4, H4, I4, J4, K4, L4, M4, N4, O4, P4, Q4, R4, S4, T4, U4, V4, W4, X4, Y4, Z4, f203696a5, f203702b5, f203708c5, f203714d5, f203719e5, f203725f5, f203731g5, f203738h5, f203745i5, f203752j5, f203760k5, f203767l5, f203774m5, f203781n5, f203788o5, f203795p5, f203801q5, f203807r5, f203812s5, f203818t5, f203823u5, f203829v5, f203835w5, f203841x5, f203847y5, f203853z5, A5, B5, C5, D5, E5, F5, G5, H5, I5, J5, K5, L5, M5, N5, O5, P5, Q5, R5, S5, T5, U5, V5, W5, X5, Y5, Z5, f203697a6, f203703b6, f203709c6, f203715d6, f203720e6, f203726f6, f203732g6, f203739h6, f203746i6, f203753j6, f203761k6, f203768l6, f203775m6};
    }

    public static u0 b(String str) {
        return (u0) f203782n6.get(str);
    }

    public static boolean c(String str) {
        return n(str, f203804r2, f203826v2, f203809s2, f203815t2, f203820u2, f203832w2, E2, F2, f203844y2, f203850z2, U3, A2, B2, f203838x2, f203694a3, f203700b3, f203706c3, f203772m3, f203779n3, f203750j3, f203758k3, f203712d3, f203822u4, f203828v4, f203834w4, f203786o3, f203793p3, f203799q3, f203718e3, f203723f3, f203729g3, f203736h3, f203743i3, f203823u5, f203829v5, f203835w5, f203841x5, f203847y5, f203853z5, f203805r3, f203810s3, f203816t3, f203821u3, f203833w3, f203827v3, f203851z3, A3, E3, F3, G3, H3, I3, J3, K3, L3, M3, N3, R3, S3, T3, P3, Q3, O3, J5, K5, f203765l3, B3, C3, D3);
    }

    public static boolean d(u0 u0Var, String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (u0Var == V2 && lowerCase.contains("quatix")) {
            return lowerCase.contains("solar") || lowerCase.contains("dualpower");
        }
        return false;
    }

    public static boolean e(u0 u0Var, String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (u0Var == T2 && lowerCase.contains("quatix")) {
            return lowerCase.contains("titanium") || lowerCase.contains("sapphire");
        }
        return false;
    }

    public static boolean f(u0 u0Var, String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (u0Var == V2 && lowerCase.contains("tactixdelta")) {
            return lowerCase.contains("solar") || lowerCase.contains("ballistic");
        }
        return false;
    }

    public static boolean g(String str) {
        return E1.f203854a.contains(str) || F1.f203854a.contains(str) || G1.f203854a.contains(str) || H1.f203854a.contains(str) || I1.f203854a.contains(str);
    }

    public static boolean h(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("lte");
    }

    public static boolean i(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("mk2i");
    }

    public static boolean k(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("mk3si");
    }

    public static boolean l(String str) {
        u0 u0Var = (u0) f203782n6.get(str);
        if (u0Var == null) {
            return false;
        }
        switch (u0Var.ordinal()) {
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
                return true;
            default:
                return false;
        }
    }

    public static boolean m(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("porsche");
    }

    public static boolean n(String str, u0... u0VarArr) {
        if (str != null) {
            u0 u0Var = (u0) f203782n6.get(str);
            for (u0 u0Var2 : u0VarArr) {
                if (u0Var2 == u0Var) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(String str) {
        String[] strArr = {"4442", "4518"};
        for (int i14 = 0; i14 < 2; i14++) {
            if (Objects.equals(str, strArr[i14])) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(String str, boolean z14) {
        u0[] u0VarArr = {f203731g5, f203767l5, f203774m5, f203818t5, B5, f203817t4, f203745i5, f203752j5, C5, f203823u5, f203829v5, f203847y5, f203853z5, f203822u4, f203834w4, D5, f203761k6, f203738h5, f203835w5, f203841x5, f203760k5, f203840x4};
        for (int i14 = 0; i14 < 22; i14++) {
            if (n(str, u0VarArr[i14]) && z14) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        u0 u0Var = (u0) f203782n6.get(str);
        return u0Var == Q5 || u0Var == T5 || u0Var == V5 || u0Var == W5 || u0Var == X5;
    }

    public static boolean r(String str) {
        u0 u0Var;
        if (TextUtils.isEmpty(str) || (u0Var = (u0) f203782n6.get(str)) == null) {
            return false;
        }
        int iOrdinal = u0Var.ordinal();
        return iOrdinal == 30 || iOrdinal == 298;
    }

    public static boolean s(String str) {
        return !TextUtils.isEmpty(str) && ((u0) f203782n6.get(str)) == f203715d6;
    }

    public static boolean t(String str) {
        u0 u0Var;
        if (TextUtils.isEmpty(str) || (u0Var = (u0) f203782n6.get(str)) == null) {
            return false;
        }
        int iOrdinal = u0Var.ordinal();
        if (iOrdinal == 294 || iOrdinal == 296 || iOrdinal == 297 || iOrdinal == 299 || iOrdinal == 300 || iOrdinal == 314 || iOrdinal == 315) {
            return true;
        }
        switch (iOrdinal) {
            case 302:
            case 303:
            case 304:
            case 305:
            case 306:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean u(String str, boolean z14) {
        return p(str, z14) || o(str);
    }

    public static boolean v(String str) {
        u0 u0Var;
        if (TextUtils.isEmpty(str) || (u0Var = (u0) f203782n6.get(str)) == null) {
            return false;
        }
        switch (u0Var.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            default:
                return false;
        }
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f203789o6.clone();
    }

    public static boolean w(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("quatix");
    }

    public static boolean x(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("tactical");
    }

    public static boolean y(String str) {
        return str != null && str.toLowerCase(Locale.US).contains("tactix");
    }

    private u0(String str, int i14, yl2.b bVar, String str2, String str3, String str4) {
        this(str, i14, bVar, bVar.f197832a, str2, str3, str4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private u0(String str, int i14, yl2.b bVar) {
        String str2 = bVar.f197832a;
        String str3 = bVar.f197836e;
        String str4 = bVar.f197835d;
        this(str, i14, bVar, str2, str3, str4, str4, true);
    }
}
