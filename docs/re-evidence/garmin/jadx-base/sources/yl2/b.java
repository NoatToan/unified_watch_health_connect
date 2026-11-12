package yl2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.stats.CodePackage;
import com.google.mlkit.common.MlKitException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.internal.http.StatusLine;
import qm2.h;
import qm2.l;
import qm2.o;
import qm2.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
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
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final b A;
    public static final b A1;
    public static final b A2;
    public static final b A3;
    public static final b A4;
    public static final b A5;
    public static final b A6;
    public static final b B;
    public static final b B1;
    public static final b B2;
    public static final b B3;
    public static final b B4;
    public static final b B5;
    public static final HashMap B6;
    public static final b C;
    public static final b C1;
    public static final b C2;
    public static final b C3;
    public static final b C4;
    public static final b C5;
    public static final /* synthetic */ b[] C6;
    public static final b D;
    public static final b D1;
    public static final b D2;
    public static final b D3;
    public static final b D4;
    public static final b D5;
    public static final b E;
    public static final b E1;
    public static final b E2;
    public static final b E3;
    public static final b E4;
    public static final b E5;
    public static final b F;
    public static final b F1;
    public static final b F2;
    public static final b F3;
    public static final b F4;
    public static final b F5;
    public static final b G1;
    public static final b G2;
    public static final b G3;
    public static final b G4;
    public static final b G5;
    public static final b H0;
    public static final b H1;
    public static final b H2;
    public static final b H3;
    public static final b H4;
    public static final b H5;
    public static final b I;
    public static final b I0;
    public static final b I1;
    public static final b I2;
    public static final b I3;
    public static final b I4;
    public static final b I5;
    public static final b J0;
    public static final b J1;
    public static final b J2;
    public static final b J3;
    public static final b J4;
    public static final b J5;
    public static final b K0;
    public static final b K1;
    public static final b K2;
    public static final b K3;
    public static final b K4;
    public static final b K5;
    public static final b L0;
    public static final b L1;
    public static final b L2;
    public static final b L3;
    public static final b L4;
    public static final b L5;
    public static final b M0;
    public static final b M1;
    public static final b M2;
    public static final b M3;
    public static final b M4;
    public static final b M5;
    public static final b N0;
    public static final b N1;
    public static final b N2;
    public static final b N3;
    public static final b N4;
    public static final b N5;
    public static final b O0;
    public static final b O1;
    public static final b O2;
    public static final b O3;
    public static final b O4;
    public static final b O5;
    public static final b P;
    public static final b P0;
    public static final b P1;
    public static final b P2;
    public static final b P3;
    public static final b P4;
    public static final b P5;
    public static final b Q0;
    public static final b Q1;
    public static final b Q2;
    public static final b Q3;
    public static final b Q4;
    public static final b Q5;
    public static final b R0;
    public static final b R1;
    public static final b R2;
    public static final b R3;
    public static final b R4;
    public static final b R5;
    public static final b S0;
    public static final b S1;
    public static final b S2;
    public static final b S3;
    public static final b S4;
    public static final b S5;
    public static final b T;
    public static final b T0;
    public static final b T1;
    public static final b T2;
    public static final b T3;
    public static final b T4;
    public static final b T5;
    public static final b U0;
    public static final b U1;
    public static final b U2;
    public static final b U3;
    public static final b U4;
    public static final b U5;
    public static final b V0;
    public static final b V1;
    public static final b V2;
    public static final b V3;
    public static final b V4;
    public static final b V5;
    public static final b W0;
    public static final b W1;
    public static final b W2;
    public static final b W3;
    public static final b W4;
    public static final b W5;
    public static final b X;
    public static final b X0;
    public static final b X1;
    public static final b X2;
    public static final b X3;
    public static final b X4;
    public static final b X5;
    public static final b Y;
    public static final b Y0;
    public static final b Y1;
    public static final b Y2;
    public static final b Y3;
    public static final b Y4;
    public static final b Y5;
    public static final b Z;
    public static final b Z0;
    public static final b Z1;
    public static final b Z2;
    public static final b Z3;
    public static final b Z4;
    public static final b Z5;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final b f197657a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final b f197658a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final b f197659a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final b f197660a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final b f197661a5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final b f197662a6;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final b f197663b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final b f197664b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final b f197665b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final b f197666b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final b f197667b5;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final b f197668b6;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final b f197669c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final b f197670c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final b f197671c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final b f197672c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final b f197673c5;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final b f197674c6;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final b f197675d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final b f197676d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final b f197677d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final b f197678d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final b f197679d5;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final b f197680d6;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final b f197681e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final b f197682e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final b f197683e3;
    public static final b e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final b f197684e5;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final b f197685e6;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final b f197687f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final b f197688f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final b f197689f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final b f197690f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final b f197691f5;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final b f197692f6;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final b f197694g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final b f197695g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final b f197696g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final b f197697g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final b f197698g5;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final b f197699g6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f197700h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final b f197701h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final b f197702h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final b f197703h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final b f197704h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final b f197705h5;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final b f197706h6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f197707i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final b f197708i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final b f197709i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final b f197710i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final b f197711i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final b f197712i5;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final b f197713i6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f197714j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final b f197715j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final b f197716j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final b f197717j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final b f197718j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final b f197719j5;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final b f197720j6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f197721k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final b f197722k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final b f197723k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final b f197724k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final b f197725k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final b f197726k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final b f197727k5;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final b f197728k6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f197729l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final b f197730l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final b f197731l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final b f197732l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final b f197733l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final b f197734l5;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final b f197735l6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f197736m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final b f197737m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final b f197738m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final b f197739m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final b f197740m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final b f197741m5;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static final b f197742m6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f197743n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final b f197744n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final b f197745n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final b f197746n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final b f197747n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final b f197748n5;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static final b f197749n6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f197750o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final b f197751o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final b f197752o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final b f197753o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final b f197754o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final b f197755o5;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final b f197756o6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f197757p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final b f197758p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final b f197759p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final b f197760p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final b f197761p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final b f197762p5;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final b f197763p6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f197764q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final b f197765q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final b f197766q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final b f197767q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final b f197768q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final b f197769q5;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public static final b f197770q6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f197771r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final b f197772r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final b f197773r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final b f197774r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final b f197775r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final b f197776r5;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final b f197777r6;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final b f197778s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final b f197779s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final b f197780s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final b f197781s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final b f197782s5;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final b f197783s6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f197784t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final b f197785t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final b f197786t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final b f197787t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final b f197788t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final b f197789t5;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final b f197790t6;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final b f197791u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final b f197792u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final b f197793u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final b f197794u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final b f197795u5;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public static final b f197796u6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f197797v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final b f197798v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final b f197799v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final b f197800v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final b f197801v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final b f197802v5;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final b f197803v6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f197804w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final b f197805w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final b f197806w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final b f197807w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final b f197808w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final b f197809w5;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final b f197810w6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f197811x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final b f197812x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final b f197813x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final b f197814x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final b f197815x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final b f197816x5;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final b f197817x6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f197818y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final b f197819y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final b f197820y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final b f197821y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final b f197822y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final b f197823y5;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final b f197824y6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f197825z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final b f197826z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final b f197827z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final b f197828z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final b f197829z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final b f197830z5;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final b f197831z6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f197833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f197835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f197836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f197686f = new b("NONE", 0, "", "", l.f145741h, null, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f197693g = new b("EDGE_25", 1, "2147,2288,2289", CodePackage.FITNESS, l.D);

    static {
        l lVar = l.C;
        f197700h = new b("EDGE_510", 2, "1561,1821,1742,1918", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197707i = new b("EDGE_520", 3, "2067,2260,2261", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197714j = new b("EDGE_810", 4, "1567,1822,1721,1823", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197721k = new b("EDGE_820", 5, "2530,2599,2600,2628,2629,2630", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197729l = new b("EDGE_820_Explore", 6, "2531", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197736m = new b("EDGE_1000", 7, "1836,2052,2053,2070,2100,2274", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        f197743n = new b("EDGE_1000_Touring", 8, "2204", CodePackage.FITNESS, lVar, qm2.b.class.getName(), h.class.getName());
        l lVar2 = l.E;
        f197750o = new b("EDGE_1030", 9, "2713,2924", CodePackage.FITNESS, lVar2, qm2.b.class.getName(), h.class.getName());
        f197757p = new b("EDGE_1030_BONTRAGER", 10, "3095", CodePackage.FITNESS, lVar2, qm2.b.class.getName(), h.class.getName());
        l lVar3 = l.F;
        f197764q = new b("EDGE_130", 11, "2909,3092", CodePackage.FITNESS, lVar3);
        f197771r = new b("EDGE_1030_PLUS", 12, "3570,3812", CodePackage.FITNESS, l.P, qm2.b.class.getName(), h.class.getName());
        f197784t = new b("MEWTWO", 13, "4169", CodePackage.FITNESS, lVar3);
        f197797v = new b("EDGE_130_PLUS", 14, "3558,3813", CodePackage.FITNESS, l.I);
        f197804w = new b("EDGE_EXPLORE", 15, "3011", CodePackage.FITNESS, lVar3);
        f197811x = new b("EDGE_520_PLUS", 16, "3112,3142", CodePackage.FITNESS, lVar2, qm2.b.class.getName(), h.class.getName());
        f197818y = new b("EDGE_530", 17, "3121,3349,4320,4330", CodePackage.FITNESS, lVar2, qm2.b.class.getName(), h.class.getName());
        f197825z = new b("EDGE_830", 18, "3122,3350,4321,4331", CodePackage.FITNESS, lVar2, qm2.b.class.getName(), h.class.getName());
        A = new b("EDGE_540", 19, "4061", CodePackage.FITNESS, lVar3);
        B = new b("EDGE_840", 20, "4062", CodePackage.FITNESS, lVar3);
        C = new b("EDGE_1040", 21, "3843,4305", CodePackage.FITNESS, lVar3);
        D = new b("EDGE_1050", 22, "4440", CodePackage.FITNESS, lVar3);
        E = new b("EDGE_MTB", 23, "4655", CodePackage.FITNESS, lVar3);
        F = new b("EDGE_550", 24, "4633", CodePackage.FITNESS, lVar3);
        I = new b("EDGE_850", 25, "4634", CodePackage.FITNESS, lVar3);
        P = new b("GRETA", 26, "4962", CodePackage.FITNESS, lVar3);
        T = new b("CHRISTIE", 27, "5135", CodePackage.FITNESS, lVar3);
        X = new b("ANNA", 28, "5136", CodePackage.FITNESS, lVar3);
        Y = new b("RAY", 29, "5064", CodePackage.FITNESS, lVar3);
        l lVar4 = l.f145753t;
        Z = new b("INDEX_SMART_SCALE", 30, "2429", "WELLNESS", lVar4, o.class.getName(), mm2.c.class.getName());
        l lVar5 = l.f145743j;
        f197722k0 = new b("FORERUNNER_220", 31, "1632,1931,1930,2073,2174", CodePackage.FITNESS, lVar5);
        l lVar6 = l.f145744k;
        H0 = new b("FORERUNNER_223", 32, "2229", "FITNESS,WELLNESS", lVar6);
        I0 = new b("FORERUNNER_225", 33, "2153,2219,2220", "FITNESS,WELLNESS", lVar6);
        l lVar7 = l.f145746l;
        J0 = new b("FORERUNNER_230", 34, "2157,2313", "FITNESS,WELLNESS", lVar7);
        K0 = new b("FORERUNNER_235", 35, "2431,2396,2397,2516,2653,2733", "FITNESS,WELLNESS", lVar7);
        L0 = new b("FORERUNNER_235L", 36, "3144", "FITNESS,WELLNESS", lVar7);
        l lVar8 = l.f145747m;
        M0 = new b("FORERUNNER_245", 37, "3076,3145,3914", "FITNESS,WELLNESS", lVar8);
        N0 = new b("FORERUNNER_245M", 38, "3077,3321,3913", "FITNESS,WELLNESS", lVar8);
        O0 = new b("FORERUNNER_255S", 39, "3993", "FITNESS,WELLNESS", lVar8);
        P0 = new b("FORERUNNER_255", 40, "3992", "FITNESS,WELLNESS", lVar8);
        Q0 = new b("FORERUNNER_255S_MUSIC", 41, "3991", "FITNESS,WELLNESS", lVar8);
        R0 = new b("FORERUNNER_255_MUSIC", 42, "3990", "FITNESS,WELLNESS", lVar8);
        S0 = new b("FORERUNNER_645", 43, "2886,3003", "FITNESS,WELLNESS", lVar7);
        T0 = new b("FORERUNNER_645M", 44, "2888,3004", "FITNESS,WELLNESS", lVar7);
        U0 = new b("FORERUNNER_935", 45, "2691,2833", "FITNESS,WELLNESS", lVar7);
        l lVar9 = l.f145754v;
        V0 = new b("FORERUNNER_945", 46, "3113,3441", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        W0 = new b("FORERUNNER_945_LTE", 47, "3652,3978", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        X0 = new b("FORERUNNER_955", 48, "4024", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        Y0 = new b("FORERUNNER_965", 49, "4315", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        Z0 = new b("FORERUNNER_265S", 50, "4258", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197657a1 = new b("FORERUNNER_265", 51, "4257", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197663b1 = new b("FILLY", 52, "4432", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197669c1 = new b("FILLYM", 53, "4433", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197675d1 = new b("HEDGEHOG", 54, "4916", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197681e1 = new b("FAWN", 55, "4815", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197687f1 = new b("FAWNM", 56, "4814", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197694g1 = new b("RABBIT", 57, "4574", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197701h1 = new b("HARE", 58, "4570", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197708i1 = new b("DEER", 59, "4565", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197715j1 = new b("ROSS", 60, "5096", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197723k1 = new b("RACHEL", 61, "5097", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197730l1 = new b("CHANDLER", 62, "5098", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197737m1 = new b("MONICA", 63, "5099", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197744n1 = new b("JOEY", 64, "5100", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197751o1 = new b("PHOEBE", 65, "5101", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197758p1 = new b("HOGLET", 66, "5214", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197765q1 = new b("FORERUNNER_620", 67, "1623,1929,1928,2072,2173", CodePackage.FITNESS, lVar5);
        f197772r1 = new b("FORERUNNER_630", 68, "2156,2310,2311", "FITNESS,WELLNESS", lVar7);
        f197778s1 = new b("FORERUNNER_920XT", 69, "1765,2130,2131,2132", "FITNESS,WELLNESS", lVar6);
        f197785t1 = new b("FORERUNNER_735XT", 70, "2158,2533,2534", "FITNESS,WELLNESS", lVar7);
        f197791u1 = new b("FORERUNNER_745", 71, "3589,3794", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        f197798v1 = new b("FORERUNNER_25", 72, "2148", "FITNESS,WELLNESS", lVar6);
        f197805w1 = new b("FORERUNNER_35", 73, "2503,2667,2668,2650,2727,2814", "FITNESS,WELLNESS", lVar7);
        f197812x1 = new b("FORERUNNER_30", 74, "2891,2977", "FITNESS,WELLNESS", lVar7);
        f197819y1 = new b("FORERUNNER_45", 75, "3282,3469", "FITNESS,WELLNESS", lVar7);
        f197826z1 = new b("FORERUNNER_45_PLUS", 76, "3847", "FITNESS,WELLNESS", lVar7);
        A1 = new b("FORERUNNER_55", 77, "3869,4033", "FITNESS,WELLNESS", lVar7);
        B1 = new b("KONIK", 78, "4838", "FITNESS,WELLNESS", lVar7);
        l lVar10 = l.f145748n;
        C1 = new b("VIVOFIT", 79, "1837", "WELLNESS", lVar10);
        D1 = new b("VIVOFIT2", 80, "2150", "FITNESS,WELLNESS", lVar10);
        E1 = new b("VIVOFIT3", 81, "2406", "FITNESS,WELLNESS", l.f145749o);
        F1 = new b("VIVOFIT4", 82, "2878", "FITNESS,WELLNESS", l.f145750p);
        G1 = new b("VIVOMOVE", 83, "2368", "WELLNESS", lVar10);
        l lVar11 = l.f145751q;
        H1 = new b("VIVOMOVE_HR", 84, "2772,2945", "FITNESS,WELLNESS", lVar11, p.class.getName(), mm2.c.class.getName());
        I1 = new b("VIVOMOVE_3_CLASSIC", 85, "3308,3572", "FITNESS,WELLNESS", lVar11, p.class.getName(), mm2.c.class.getName());
        J1 = new b("VIVOMOVE_3_SPORT", 86, "3378,3422,3573", "FITNESS,WELLNESS", lVar11, p.class.getName(), mm2.c.class.getName());
        K1 = new b("QUARTZ", 87, "3982", "FITNESS,WELLNESS", lVar11, p.class.getName(), mm2.c.class.getName());
        L1 = new b("JADE", 88, "3983", "FITNESS,WELLNESS", lVar11, p.class.getName(), mm2.c.class.getName());
        l lVar12 = l.f145742i;
        M1 = new b("VIVOKI", 89, "1885", "WELLNESS", lVar12, null, null);
        N1 = new b("VIVOSMART", 90, "1956,2135,2294", "WELLNESS", lVar10);
        O1 = new b("VIVOSMART_HR", 91, "2348,2361", "WELLNESS", lVar11);
        P1 = new b("VIVOSMART_GPS_HR", 92, "2347,2362,2639", "FITNESS,WELLNESS", lVar11);
        Q1 = new b("VIVOSMART_3", 93, "2622,2831", "FITNESS,WELLNESS", lVar11);
        R1 = new b("VIVOSMART_4", 94, "2927,3218", "FITNESS,WELLNESS", lVar11);
        S1 = new b("FRANKLIN", 95, "4063", "FITNESS,WELLNESS", lVar11);
        T1 = new b("VIVOSPORT", 96, "2623,2832", "FITNESS,WELLNESS", lVar11);
        U1 = new b("VIVOACTIVE", 97, "1907,2160", "FITNESS,WELLNESS,GOLF", lVar9);
        V1 = new b("VIVOACTIVE_HR", 98, "2337,2497", "FITNESS,WELLNESS,GOLF", lVar9);
        W1 = new b("VIVOACTIVE_3", 99, "2700,2976", "FITNESS,WELLNESS,GOLF", lVar9);
        X1 = new b("VIVOACTIVE_3T", 100, "3446", "FITNESS,WELLNESS,GOLF", lVar9);
        Y1 = new b("VIVOLIFE", 101, "3428", "FITNESS,WELLNESS,GOLF", lVar9);
        Z1 = new b("VIVOACTIVE_3_DAIMLER", 102, "3473,3477", "FITNESS,WELLNESS,GOLF", lVar9);
        f197658a2 = new b("VIVOACTIVE_3_MUSIC", 103, "2988,3163", "FITNESS,WELLNESS,GOLF", lVar9);
        f197664b2 = new b("VIVOACTIVE_3_MUSIC_LTE", 104, "3066", "FITNESS,WELLNESS,GOLF", lVar9);
        f197670c2 = new b("VIVOACTIVE_4S", 105, "3224,3387", "FITNESS,WELLNESS,GOLF", lVar9);
        f197676d2 = new b("VIVOACTIVE_4_VENU", 106, "3226,3389", "FITNESS,WELLNESS,GOLF", lVar9);
        f197682e2 = new b("VIVOACTIVE_4", 107, "3225,3388", "FITNESS,WELLNESS,GOLF", lVar9);
        f197688f2 = new b("VIVOACTIVE_4_CAPTAIN_MARVEL", 108, "3500,3535", "FITNESS,WELLNESS,GOLF", lVar9);
        f197695g2 = new b("VIVOACTIVE_4_FIRST_AVENGER", 109, "3501,3536", "FITNESS,WELLNESS,GOLF", lVar9);
        f197702h2 = new b("VIVOACTIVE_4_REY", 110, "3498,3537", "FITNESS,WELLNESS,GOLF", lVar9);
        f197709i2 = new b("VIVOACTIVE_4_DARTH_VADER", 111, "3499,3538", "FITNESS,WELLNESS,GOLF", lVar9);
        f197716j2 = new b("KOI_BASIC", 112, "4425", "FITNESS,WELLNESS,GOLF", lVar9);
        f197724k2 = new b("KOI_MUSIC", 113, "4426", "FITNESS,WELLNESS,GOLF", lVar9);
        f197731l2 = new b("ONI", 114, "4625", "FITNESS,WELLNESS,GOLF", lVar9);
        f197738m2 = new b("LUMEN", 115, "3615,3809", "FITNESS,WELLNESS,GOLF", lVar9);
        f197745n2 = new b("LUNA", 116, "4380,4912", "FITNESS,WELLNESS,GOLF", lVar9);
        f197752o2 = new b("FLARE", 117, "4477", "FITNESS,WELLNESS,GOLF", lVar9);
        f197759p2 = new b("VENU_D2_AIR", 118, "2187", "FITNESS,WELLNESS,GOLF", lVar9);
        f197766q2 = new b("VENU_DAIMLER", 119, "3740,3737", "FITNESS,WELLNESS,GOLF", lVar9);
        f197773r2 = new b("VENU_2", 120, "3703,3950", "FITNESS,WELLNESS,GOLF", lVar9);
        f197779s2 = new b("VENU_2S", 121, "3704,3949", "FITNESS,WELLNESS,GOLF", lVar9);
        f197786t2 = new b("VENU_2_DAIMLER", 122, "4171,1731,4180", "FITNESS,WELLNESS,GOLF", lVar9);
        f197792u2 = new b("VENU_2S_DAIMLER", 123, "4175,1732,4181", "FITNESS,WELLNESS,GOLF", lVar9);
        f197799v2 = new b("VENU_2_PLUS", 124, "3851,4017", "FITNESS,WELLNESS,GOLF", lVar9);
        f197806w2 = new b("VENU_2_PLUS_PROPELLER", 125, "4125,1693", "FITNESS,WELLNESS,GOLF", lVar9);
        f197813x2 = new b("D2_AIR_X15", 126, "4944", "FITNESS,WELLNESS,GOLF", lVar9);
        f197820y2 = new b("VENU_3", 127, "4260", "FITNESS,WELLNESS,GOLF", lVar9);
        f197827z2 = new b("VENU_3S", 128, "4261", "FITNESS,WELLNESS,GOLF", lVar9);
        A2 = new b("VENU_4", 129, "4643", "FITNESS,WELLNESS,GOLF", lVar9);
        B2 = new b("VENU_4S", 130, "4644", "FITNESS,WELLNESS,GOLF", lVar9);
        C2 = new b("ROMEO", 131, "5045", "FITNESS,WELLNESS,GOLF", lVar9);
        D2 = new b("JULIET", 132, "5046", "FITNESS,WELLNESS,GOLF", lVar9);
        E2 = new b("ELF", 133, "3600,3837,3603,3596,3838,3599,4118,4119", "FITNESS,WELLNESS,GOLF", lVar9);
        F2 = new b("IMP", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, "4115,4116", "FITNESS,WELLNESS,GOLF", lVar9);
        G2 = new b("VENU_X1", TsExtractor.TS_STREAM_TYPE_E_AC3, "4603", "FITNESS,WELLNESS,GOLF,OUTDOOR", lVar9);
        l lVar13 = l.f145755w;
        H2 = new b("FENIX", SyslogConstants.LOG_LOCAL1, "1551,1676,1677,1678,1679", CodePackage.FITNESS, lVar13);
        I2 = new b("FENIX2", 137, "1967,2054,2094", CodePackage.FITNESS, lVar13);
        J2 = new b("FENIX3", TsExtractor.TS_STREAM_TYPE_DTS, "2050,2051,2543,2188,2189,2293,2407,2408", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        K2 = new b("FENIX3HR", 139, "2413,2473,2474,2475,2476,2477", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        L2 = new b("FENIX_CHRONOS", 140, "2432,2675", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        M2 = new b("FENIX_INSTINCT", 141, "3126,3273", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        N2 = new b("FENIX_5", 142, "2697,2796", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        O2 = new b("FENIX_5X", 143, "2604,2798,2084,2085,2086", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        P2 = new b("FENIX_5S", SyslogConstants.LOG_LOCAL2, "2544,2797", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Q2 = new b("FENIX_5_PLUS", 145, "3110,3089", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        R2 = new b("FENIX_5S_PLUS", 146, "2900,3134", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        S2 = new b("FENIX_5X_PLUS", 147, "3111,3135", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        T2 = new b("INSTINCT_SOLAR", 148, "3466,3778,3779", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        U2 = new b("D2_CHARLIE", 149, "2819,2994", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        V2 = new b("D2_DELTA", 150, "3197", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        W2 = new b("D2_DELTA_S", 151, "3196", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        X2 = new b("D2_DELTA_PX", SyslogConstants.LOG_LOCAL3, "3198,3324", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Y2 = new b("FENIX_6", 153, "3290,3515,3767,3771,3782", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Z2 = new b("FENIX_6S", 154, "3288,3513,3765,3769", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197659a3 = new b("FENIX_6X", ModuleDescriptor.MODULE_VERSION, "3291,3516,3783", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197665b3 = new b("FENIX_6_SPORT", 156, "3289,3514,3766", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197671c3 = new b("JORDAN_CT", 157, "4136", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197677d3 = new b("LONGLY_CT", 158, "4137", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197683e3 = new b("FENIX_6S_SPORT", 159, "3287,3512,3764", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197689f3 = new b("ENDURO", SyslogConstants.LOG_LOCAL4, "3638,3872", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197696g3 = new b("MAPLE", 161, "3906,3909", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197703h3 = new b("BONSAI", 162, "3905,3908", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197710i3 = new b("SEQUOIA", 163, "3907,3910", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197717j3 = new b("LOKI", 164, "4374", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197725k3 = new b("THOR", 165, "4375", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197732l3 = new b("ODIN", 166, "4376", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197739m3 = new b("ELM", 167, "4595", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197746n3 = new b("GINKGO", 168, "4596", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197753o3 = new b("AUSTIN", 169, "3943,3944", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197760p3 = new b("FREYA", 170, "4312", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197767q3 = new b("NORD", 171, "4313", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197774r3 = new b("MODI", TsExtractor.TS_STREAM_TYPE_AC4, "4314", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197780s3 = new b("SHERMAN", 173, "4341", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197787t3 = new b("XWING", 174, "4079", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197793u3 = new b("ARTOO", 175, "4556", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197800v3 = new b("EBONY", SyslogConstants.LOG_LOCAL6, "4135", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197807w3 = new b("MOGO", 177, "4542", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197814x3 = new b("PARKER", 178, "4534", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197821y3 = new b("DUNCAN", 179, "4536", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197828z3 = new b("KEMP", 180, "4532", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        A3 = new b("PERKINS", 181, "4533", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        B3 = new b("PANDO", 182, "4575", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        C3 = new b("BRISTLECONE", 183, "5169", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        D3 = new b("GOBI", SyslogConstants.LOG_LOCAL7, "5179", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        E3 = new b("BOWEN", 185, "4666", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        F3 = new b("KENON_ALDRIDGE", 186, "4775", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        G3 = new b("MARGAY_CARACAL", 187, "5161", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        H3 = new b("BENGAL_SIBERIAN", TsExtractor.TS_PACKET_SIZE, "5162", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        I3 = new b("PANTHER", PsExtractor.PRIVATE_STREAM_1, "5164", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        J3 = new b("GERVIN_ROBINSON", 190, "4631", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        K3 = new b("ALLEN", 191, "4776", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        L3 = new b("SHATNER_NIMOY", 192, "4879", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        M3 = new b("BENDER", 193, "5056", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        N3 = new b("MANTICORE", 194, "4977", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        O3 = new b("TARDIGRADE", 195, "4978", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        P3 = new b("TABBY", 196, "4952", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Q3 = new b("OCELOT", 197, "4953", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        R3 = new b("TIGER", 198, "4954", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        S3 = new b("SERVAL", 199, "4955", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        T3 = new b("LEOPARD", 200, "4956", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        U3 = new b("PERSIAN", 201, "5133", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        V3 = new b("CORYDORA", 202, "5189", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        W3 = new b("PICTUS", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, "5190", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        X3 = new b("COUGAR", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "5134", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Y3 = new b("LEAH_SNARF", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "5143", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        Z3 = new b("TORR_CHEETARA", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, "5144", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197660a4 = new b("WILYCUB_PANTHRO", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "5145", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197666b4 = new b("JAGA", 208, "5165", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197672c4 = new b("CRANSTON", 209, "3888,4071", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197678d4 = new b("ODENKIRK", 210, "3889,4091", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        e4 = new b("INSTINCT_CROSSOVER", 211, "4155", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197690f4 = new b("INSTINCT_CROSSOVER_AMOLED", 212, "4678", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197697g4 = new b("CRAWFORD", 213, "4394", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197704h4 = new b("ECLAIR", 214, "4586", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197711i4 = new b("CANNOLI", 215, "4587", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197718j4 = new b("DONUT", 216, "4585", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197726k4 = new b("PIE", 217, "4759", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197733l4 = new b("BAKLAVA", 218, "4583", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197740m4 = new b("BISCUIT", 219, "4584", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197747n4 = new b("EASYBAKE", 220, "4734", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        f197754o4 = new b("SKINK", 221, "4984", "FITNESS,OUTDOOR,WELLNESS,GOLF", lVar9);
        f197761p4 = new b("BASILISK", 222, "4985", "FITNESS,OUTDOOR,WELLNESS,GOLF", lVar9);
        f197768q4 = new b("CAIMAN", 223, "4986", "FITNESS,OUTDOOR,WELLNESS,GOLF", lVar9);
        f197775r4 = new b("MAMBA", 224, "4987", "FITNESS,OUTDOOR,WELLNESS,GOLF", lVar9);
        f197781s4 = new b("ANACONDA", 225, "4988", "FITNESS,OUTDOOR,WELLNESS,GOLF", lVar9);
        f197788t4 = new b("MARQ_ATHLETE", 226, "3251,3451", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197794u4 = new b("MARQ_AVIATOR", 227, "3247,3421", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197801v4 = new b("MARQ_CAPTAIN", 228, "3248,3448", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197808w4 = new b("MARQ_COMMANDER", 229, "3249,3449", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197815x4 = new b("OREO", 230, "4472", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197822y4 = new b("MARQ_DRIVER", 231, "3246,3420", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        f197829z4 = new b("MARQ_EXPEDITION", 232, "3250,3450", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        A4 = new b("MARQ_ADVENTURER", 233, "3624,3648", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        B4 = new b("MARQ_GOLFER", 234, "3739,3850", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        C4 = new b("MAGNA", 235, "4105", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        D4 = new b("MAGNA_AV", 236, "4124", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        E4 = new b("FORTIS", 237, "5000", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        F4 = new b("EPIX", 238, "1988,2330,2331,2332,2457", "FITNESS,OUTDOOR,WELLNESS", lVar9);
        G4 = new b("D2_BRAVO", 239, "2262,2467", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        H4 = new b("D2_BRAVO_TITANIUM", PsExtractor.VIDEO_STREAM_MASK, "2547", "FITNESS,OUTDOOR,GOLF,WELLNESS", lVar9);
        l lVar14 = l.f145756x;
        I4 = new b("GPSMAP_64", 241, "1859,2123,2124,2281,2285", "OUTDOOR", lVar14);
        J4 = new b("GPSMAP_64SC", 242, "2614,2763,2764,2765,2766,2767,2937,3115", "OUTDOOR", lVar14);
        K4 = new b("GPSMAP_64x", 243, "3431,3660,3661", "OUTDOOR", lVar14);
        L4 = new b("GPSMAP_64csx", 244, "3432,3663,3664,3665,3666,3667,3668", "OUTDOOR", lVar14);
        M4 = new b("GPSMAP_65", 245, "3725,4003", "OUTDOOR", lVar14);
        N4 = new b("BADGER", 246, "5020", "OUTDOOR", lVar14);
        O4 = new b("GPSMAP_66", 247, "3028,3657", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        P4 = new b("GPSMAP_66i", 248, "3284,3658", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        Q4 = new b("GPSMAP_66sr", 249, "3694", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        R4 = new b("BRIMSTONE", 250, "4336,4473", "OUTDOOR", lVar14);
        S4 = new b("GPSMAP_86s", 251, "3452,4720", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        T4 = new b("GPSMAP_86sc", 252, "3453", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        U4 = new b("GPSMAP_86I", 253, "3454", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        V4 = new b("GPSMAP_86scI", 254, "3455", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        W4 = new b("MONTANA_7XX", 255, "3459,4415,5015", "OUTDOOR", lVar2, qm2.b.class.getName(), h.class.getName());
        X4 = new b("DRISKO", 256, "4552", "OUTDOOR", lVar14);
        Y4 = new b("ETREX_TOUCH_35", TsExtractor.TS_STREAM_TYPE_AIT, "2140,2563,2997", "FITNESS,OUTDOOR", lVar13);
        Z4 = new b("PORQUEROLLES", 258, "4522", "OUTDOOR", lVar13);
        f197661a5 = new b("MARCO", 259, "4201,4367,5080", "OUTDOOR", lVar13);
        f197667b5 = new b("POLO", 260, "4202,4368,5081", "OUTDOOR", lVar13);
        f197673c5 = new b("OREGON_7XX", 261, "2512,2444,2479,2681,2692,3187,3262", "OUTDOOR", l.T, qm2.b.class.getName(), h.class.getName());
        f197679d5 = new b("FORETREX", 262, "2769,3317", "OUTDOOR", lVar13);
        f197684e5 = new b("STRETFORD", 263, "4362,4578,5082", "OUTDOOR", lVar13);
        f197691f5 = new b("CHEBEAGUE", 264, "4783", "OUTDOOR", lVar13);
        l lVar15 = l.f145757y;
        f197698g5 = new b("APPROACH_G7", 265, "1842", "GOLF", lVar15);
        f197705h5 = new b("APPROACH_G8", 266, "1917", "GOLF", lVar15);
        f197712i5 = new b("APPROACH_G30", 267, "2652", "GOLF", lVar15);
        f197719j5 = new b("APPROACH_S2", 268, "1649,1999,1891", "GOLF", lVar15);
        f197727k5 = new b("APPROACH_S4", 269, "1811,2035", "GOLF", lVar15);
        f197734l5 = new b("APPROACH_S5", 270, "2182", "GOLF", lVar15);
        f197741m5 = new b("APPROACH_S6", 271, "1936,2194", "GOLF", lVar15);
        f197748n5 = new b("APPROACH_S12", 272, "3823,3986", "GOLF", lVar15);
        f197755o5 = new b("APPROACH_S20", 273, "2266,2559", "GOLF,WELLNESS", lVar15);
        f197762p5 = new b("APPROACH_S60", 274, "2656,2907", "GOLF,WELLNESS", lVar15);
        f197769q5 = new b("APPROACH_S62", 275, "3393,3700", "GOLF,WELLNESS", lVar15);
        f197776r5 = new b("APPROACH_S70", 276, "4234", "GOLF,WELLNESS", lVar15);
        f197782s5 = new b("APPROACH_S70S", 277, "4233", "GOLF, WELLNESS", lVar15);
        l lVar16 = l.A;
        f197789t5 = new b("APPROACH_G80", 278, "3085,3519", "GOLF,WELLNESS", lVar16);
        f197795u5 = new b("APPROACH_G12", 279, "3927,4001", "GOLF,WELLNESS", lVar16);
        f197802v5 = new b("KNEEBOARD", 280, "4488", "GOLF,WELLNESS", lVar16);
        f197809w5 = new b("POINTBREAK", 281, "4635", "GOLF,WELLNESS", lVar16);
        f197816x5 = new b("PINTAIL", 282, "4543,4960", "GOLF", lVar15);
        f197823y5 = new b("FIN", 283, "4969", "GOLF", lVar15);
        f197830z5 = new b("PAROS", 284, "4770", "GOLF", lVar15);
        A5 = new b("SIROS", 285, "3871", "GOLF", lVar15);
        B5 = new b("APPROACH_Z82", 286, "3526,3710", "GOLF", lVar15);
        C5 = new b("APPROACH_R10", 287, "3622", "GOLF", lVar16);
        D5 = new b("PAIPO", 288, "4777", "GOLF", lVar16);
        E5 = new b("JAMES", 289, "5129", "GOLF, WELLNESS", lVar15);
        l lVar17 = l.B;
        F5 = new b("APPROACH_S40", 290, "3314,3447", "GOLF, WELLNESS", lVar17);
        G5 = new b("APPROACH_S42", 291, "3934,4002", "GOLF, WELLNESS", lVar17);
        H5 = new b("APPROACH_X40", 292, "2292", "GOLF,WELLNESS", l.f145758z);
        I5 = new b("LEMONADE", 293, "4656", "GOLF,WELLNESS", lVar15);
        J5 = new b("TEA", 294, "4657", "GOLF,WELLNESS", lVar15);
        K5 = new b("SMALLS", 295, "4825", "GOLF, WELLNESS", lVar15);
        L5 = new b("CLYDE", 296, "4874", "GOLF, WELLNESS", lVar15);
        M5 = new b("BONNIE", 297, "4875", "GOLF, WELLNESS", lVar15);
        N5 = new b("TRU_SWING", 298, "2175", "GOLF", lVar12, null, null);
        O5 = new b("DESCENT", 299, "2859,2991", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        P5 = new b("DESCENT_MK2", 300, "3258,3702", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        Q5 = new b("DESCENT_MK2S", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, "3542,3930", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        R5 = new b("LEVIATHAN", 302, "4223,4225", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        S5 = new b("NESSIE", 303, "4222,4224", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        T5 = new b("CUTTLEFISH", 304, "4802", "DIVE", lVar9);
        U5 = new b("TENREC", 305, "4518", "DIVE", lVar9);
        V5 = new b("UNAGI", 306, "5026", "DIVE", lVar9);
        W5 = new b("MINKE", StatusLine.HTTP_TEMP_REDIRECT, "4005,4132", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        X5 = new b("CONCHA", StatusLine.HTTP_PERM_REDIRECT, "4588", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        Y5 = new b("PEPPERCORN", 309, "5146", "FITNESS,OUTDOOR,GOLF,WELLNESS,DIVE", lVar9);
        l lVar18 = l.X;
        Z5 = new b("SPEED_SENSOR_ORCA", 310, "3192", "", lVar18);
        f197662a6 = new b("SPEED_SENSOR_ORCA_CND", 311, "3307", "", lVar18);
        f197668b6 = new b("GARMIN_SWIM_2", 312, "3405,3639", "FITNESS,WELLNESS", lVar7);
        f197674c6 = new b("VECTOR_3", 313, "2787", "", lVar12, null, null);
        f197680d6 = new b("VECTOR_AIR", 314, "2839", "", lVar12, null, null);
        l lVar19 = l.f145752r;
        f197685e6 = new b("VIVOFITJR", 315, "2606", "", lVar19, null, null);
        f197692f6 = new b("VIVOFITJR2", 316, "2944", "", lVar19, null, null);
        f197699g6 = new b("INDEX_SMART_SCALE_2", 317, "3461,4980", "WELLNESS", lVar4);
        l lVar20 = l.Y;
        f197706h6 = new b("HRM_DUAL_ADVANCED", 318, "3300", "", lVar20);
        l lVar21 = l.Z;
        f197713i6 = new b("RALLY", 319, "3578", "", lVar21);
        f197720j6 = new b("MERCURY", 320, "3827", "WELLNESS", lVar4);
        f197728k6 = new b("SPLASH", 321, "4130", "", lVar20);
        f197735l6 = new b("HRM_FIT", 322, "4446", "", lVar20);
        f197742m6 = new b("HERMES", 323, "4607", "", lVar20);
        f197749n6 = new b("CHAMOMILE", 324, "4662", "", lVar20);
        f197756o6 = new b("APHRODITE", 325, "4606", "", lVar20);
        f197763p6 = new b("CINEMA", 326, "4525", "", lVar21);
        f197770q6 = new b("MACHOP", 327, "4877", CodePackage.FITNESS, l.H0);
        f197777r6 = new b("MACHAMP", 328, "4878", CodePackage.FITNESS, l.f145745k0);
        f197783s6 = new b("XCEL_SPRINT_BASE", 329, "4865", CodePackage.FITNESS, lVar2);
        f197790t6 = new b("XCEL_SPRINT_SENSOR", 330, "4864", CodePackage.FITNESS, lVar2);
        f197796u6 = new b("YOGI", 331, "4971", "FITNESS,WELLNESS", lVar20);
        f197803v6 = new b("ARABICA", 332, "4965", "FITNESS,WELLNESS", lVar9);
        f197810w6 = new b("DECAF", 333, "5019", "FITNESS,WELLNESS", lVar9);
        f197817x6 = new b("KYUREM", 334, "4970", CodePackage.FITNESS, lVar3);
        f197824y6 = new b("KYUREMP", 335, "4972", CodePackage.FITNESS, lVar3);
        f197831z6 = new b("KAPPA", 336, "5042", "FITNESS,WELLNESS,GOLF", lVar9);
        A6 = new b("Rogers", 337, "5193", "FITNESS,WELLNESS", lVar11);
        C6 = a();
        B6 = null;
        B6 = new HashMap();
        for (b bVar : values()) {
            for (String str : bVar.f197832a.split(",")) {
                b bVar2 = (b) B6.put(str, bVar);
                if (bVar2 != null) {
                    StringBuilder sbL = hb.a.l("Product number ", str, " for ");
                    sbL.append(bVar.name());
                    sbL.append(" already defined by ");
                    com.nimbusds.jose.shaded.gson.internal.a.v(sbL, bVar2.name());
                    return;
                }
            }
        }
    }

    private b(String str, int i14, String str2, String str3, l lVar) {
        this(str, i14, str2, str3, lVar, lVar != null ? qm2.a.class.getName() : null, lVar != null ? mm2.c.class.getName() : null);
    }

    public static /* synthetic */ b[] a() {
        return new b[]{f197686f, f197693g, f197700h, f197707i, f197714j, f197721k, f197729l, f197736m, f197743n, f197750o, f197757p, f197764q, f197771r, f197784t, f197797v, f197804w, f197811x, f197818y, f197825z, A, B, C, D, E, F, I, P, T, X, Y, Z, f197722k0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f197657a1, f197663b1, f197669c1, f197675d1, f197681e1, f197687f1, f197694g1, f197701h1, f197708i1, f197715j1, f197723k1, f197730l1, f197737m1, f197744n1, f197751o1, f197758p1, f197765q1, f197772r1, f197778s1, f197785t1, f197791u1, f197798v1, f197805w1, f197812x1, f197819y1, f197826z1, A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1, f197658a2, f197664b2, f197670c2, f197676d2, f197682e2, f197688f2, f197695g2, f197702h2, f197709i2, f197716j2, f197724k2, f197731l2, f197738m2, f197745n2, f197752o2, f197759p2, f197766q2, f197773r2, f197779s2, f197786t2, f197792u2, f197799v2, f197806w2, f197813x2, f197820y2, f197827z2, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2, Q2, R2, S2, T2, U2, V2, W2, X2, Y2, Z2, f197659a3, f197665b3, f197671c3, f197677d3, f197683e3, f197689f3, f197696g3, f197703h3, f197710i3, f197717j3, f197725k3, f197732l3, f197739m3, f197746n3, f197753o3, f197760p3, f197767q3, f197774r3, f197780s3, f197787t3, f197793u3, f197800v3, f197807w3, f197814x3, f197821y3, f197828z3, A3, B3, C3, D3, E3, F3, G3, H3, I3, J3, K3, L3, M3, N3, O3, P3, Q3, R3, S3, T3, U3, V3, W3, X3, Y3, Z3, f197660a4, f197666b4, f197672c4, f197678d4, e4, f197690f4, f197697g4, f197704h4, f197711i4, f197718j4, f197726k4, f197733l4, f197740m4, f197747n4, f197754o4, f197761p4, f197768q4, f197775r4, f197781s4, f197788t4, f197794u4, f197801v4, f197808w4, f197815x4, f197822y4, f197829z4, A4, B4, C4, D4, E4, F4, G4, H4, I4, J4, K4, L4, M4, N4, O4, P4, Q4, R4, S4, T4, U4, V4, W4, X4, Y4, Z4, f197661a5, f197667b5, f197673c5, f197679d5, f197684e5, f197691f5, f197698g5, f197705h5, f197712i5, f197719j5, f197727k5, f197734l5, f197741m5, f197748n5, f197755o5, f197762p5, f197769q5, f197776r5, f197782s5, f197789t5, f197795u5, f197802v5, f197809w5, f197816x5, f197823y5, f197830z5, A5, B5, C5, D5, E5, F5, G5, H5, I5, J5, K5, L5, M5, N5, O5, P5, Q5, R5, S5, T5, U5, V5, W5, X5, Y5, Z5, f197662a6, f197668b6, f197674c6, f197680d6, f197685e6, f197692f6, f197699g6, f197706h6, f197713i6, f197720j6, f197728k6, f197735l6, f197742m6, f197749n6, f197756o6, f197763p6, f197770q6, f197777r6, f197783s6, f197790t6, f197796u6, f197803v6, f197810w6, f197817x6, f197824y6, f197831z6, A6};
    }

    public static HashSet b(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(Arrays.asList(((b) it.next()).f197832a.split(",")));
        }
        return hashSet;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C6.clone();
    }

    private b(String str, int i14, String str2, String str3, l lVar, String str4, String str5) {
        super(str, i14);
        this.f197832a = str2;
        this.f197834c = str3;
        this.f197833b = lVar;
        this.f197836e = str4;
        this.f197835d = str5;
    }
}
