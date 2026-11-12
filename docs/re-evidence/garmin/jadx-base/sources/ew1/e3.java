package ew1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u0093\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00100\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0016\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u0016\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00100\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lew1/e3;", "", "Ljv1/f;", "coaches", "moreAtpCoaches", "", "supportsFBTRunning", "supportsFBTCycling", "supportsFBTTriathlon", "Lxw1/o;", "garminRunningCoachVideo", "garminCyclingCoachVideo", "garminTriathlonCoachVideo", "garminFitnessCoachVideo", "garminFROGCoachVideo", "Lkotlin/Function0;", "", "onGarminRunningCoachClick", "onGarminCyclingCoachClick", "onGarminTriathlonCoachClick", "onGarminFitnessCoachClick", "onGarminFROGCoachClick", "Lkotlin/Function1;", "onPlayVideoClick", "Lxw1/h;", "onATPCoachSelected", "Ltw1/c;", "onITPCoachSelected", "onViewMorePlansClick", "Lkotlin/Function2;", "Lvt1/f;", "onAdditionalCoachSelected", "Lvt1/o;", "selectedSport", "shouldShowProgressIndicator", "", "currentStep", "totalSteps", "supportRunningTrainingLevel", "supportCyclingTrainingLevel", "supportsFBTNoviceRunCoach", "supportsFBTFitnessCoach", "supportsFBTStrength", "supportsFBTFROGCoach", "isFitnessCoachRequiresGCPlus", "isFROGCoachRequiresGCPlus", "<init>", "(Ljv1/f;Ljv1/f;ZZZLxw1/o;Lxw1/o;Lxw1/o;Lxw1/o;Lxw1/o;Le23/a;Le23/a;Le23/a;Le23/a;Le23/a;Le23/l;Le23/l;Le23/l;Le23/a;Le23/p;Lvt1/o;ZIIZZZZZZZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e3 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv1.f f66420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jv1.f f66421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f66423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xw1.o f66425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xw1.o f66426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xw1.o f66427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xw1.o f66428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xw1.o f66429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e23.a<Unit> f66430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e23.a<Unit> f66431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e23.a<Unit> f66432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e23.a<Unit> f66433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e23.a<Unit> f66434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e23.l<xw1.o, Unit> f66435p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e23.l<xw1.h, Unit> f66436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e23.l<tw1.c, Unit> f66437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e23.a<Unit> f66438s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e23.p<xw1.h, vt1.f, Unit> f66439t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final vt1.o f66440u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f66441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f66442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f66443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f66444y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f66445z;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66446a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vt1.o.f180179j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vt1.o.f180180k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[vt1.o.f180181l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f66446a = iArr;
        }
    }

    public /* synthetic */ e3(jv1.f fVar, jv1.f fVar2, boolean z14, boolean z15, boolean z16, xw1.o oVar, xw1.o oVar2, xw1.o oVar3, xw1.o oVar4, xw1.o oVar5, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar6, e23.p pVar, vt1.o oVar6, boolean z17, int i14, int i15, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : fVar, (i16 & 2) != 0 ? null : fVar2, z14, z15, z16, (i16 & 32) != 0 ? null : oVar, (i16 & 64) != 0 ? null : oVar2, (i16 & 128) != 0 ? null : oVar3, (i16 & 256) != 0 ? null : oVar4, (i16 & 512) != 0 ? null : oVar5, aVar, aVar2, aVar3, aVar4, aVar5, lVar, lVar2, lVar3, aVar6, pVar, oVar6, z17, i14, i15, (16777216 & i16) != 0 ? false : z18, (33554432 & i16) != 0 ? false : z19, (67108864 & i16) != 0 ? false : z24, (134217728 & i16) != 0 ? false : z25, (268435456 & i16) != 0 ? false : z26, (536870912 & i16) != 0 ? false : z27, (1073741824 & i16) != 0 ? false : z28, (i16 & Integer.MIN_VALUE) != 0 ? false : z29);
    }

    public static e3 a(e3 e3Var, jv1.f fVar, jv1.f fVar2, int i14) {
        jv1.f fVar3 = (i14 & 1) != 0 ? e3Var.f66420a : fVar;
        jv1.f fVar4 = (i14 & 2) != 0 ? e3Var.f66421b : fVar2;
        boolean z14 = e3Var.f66422c;
        boolean z15 = e3Var.f66423d;
        boolean z16 = e3Var.f66424e;
        xw1.o oVar = e3Var.f66425f;
        xw1.o oVar2 = e3Var.f66426g;
        xw1.o oVar3 = e3Var.f66427h;
        xw1.o oVar4 = e3Var.f66428i;
        xw1.o oVar5 = e3Var.f66429j;
        e23.a<Unit> aVar = e3Var.f66430k;
        e23.a<Unit> aVar2 = e3Var.f66431l;
        e23.a<Unit> aVar3 = e3Var.f66432m;
        e23.a<Unit> aVar4 = e3Var.f66433n;
        e23.a<Unit> aVar5 = e3Var.f66434o;
        e23.l<xw1.o, Unit> lVar = e3Var.f66435p;
        e23.l<xw1.h, Unit> lVar2 = e3Var.f66436q;
        e23.l<tw1.c, Unit> lVar3 = e3Var.f66437r;
        e23.a<Unit> aVar6 = e3Var.f66438s;
        e23.p<xw1.h, vt1.f, Unit> pVar = e3Var.f66439t;
        vt1.o oVar6 = e3Var.f66440u;
        boolean z17 = e3Var.f66441v;
        int i15 = e3Var.f66442w;
        int i16 = e3Var.f66443x;
        boolean z18 = e3Var.f66444y;
        boolean z19 = e3Var.f66445z;
        boolean z24 = e3Var.A;
        boolean z25 = e3Var.B;
        boolean z26 = e3Var.C;
        boolean z27 = e3Var.D;
        boolean z28 = e3Var.E;
        boolean z29 = e3Var.F;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar6.getClass();
        pVar.getClass();
        return new e3(fVar3, fVar4, z14, z15, z16, oVar, oVar2, oVar3, oVar4, oVar5, aVar, aVar2, aVar3, aVar4, aVar5, lVar, lVar2, lVar3, aVar6, pVar, oVar6, z17, i15, i16, z18, z19, z24, z25, z26, z27, z28, z29);
    }

    public final boolean b(vt1.o oVar) {
        List<xw1.h> list;
        List<xw1.h> list2;
        List<tw1.c> list3;
        List<tw1.c> list4;
        int i14 = oVar == null ? -1 : a.f66446a[oVar.ordinal()];
        jv1.f fVar = this.f66420a;
        switch (i14) {
            case 1:
                int size = (fVar == null || (list2 = fVar.f101049c) == null) ? 0 : list2.size();
                boolean z14 = this.f66422c;
                if (size >= 2 || z14) {
                    if (((fVar == null || (list = fVar.f101049c) == null) ? 0 : list.size()) >= 1 || !z14) {
                        return false;
                    }
                }
                return true;
            case 2:
                int size2 = (fVar == null || (list4 = fVar.f101050d) == null) ? 0 : list4.size();
                boolean z15 = this.f66423d;
                if (size2 >= 2 || z15) {
                    if (((fVar == null || (list3 = fVar.f101050d) == null) ? 0 : list3.size()) >= 1 || !z15) {
                        return false;
                    }
                }
                return true;
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
                return (this.B ? 1 : 0) + (this.D ? 1 : 0) < 2;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return p005kotlin.jvm.internal.s.g(this.f66420a, e3Var.f66420a) && p005kotlin.jvm.internal.s.g(this.f66421b, e3Var.f66421b) && this.f66422c == e3Var.f66422c && this.f66423d == e3Var.f66423d && this.f66424e == e3Var.f66424e && p005kotlin.jvm.internal.s.g(this.f66425f, e3Var.f66425f) && p005kotlin.jvm.internal.s.g(this.f66426g, e3Var.f66426g) && p005kotlin.jvm.internal.s.g(this.f66427h, e3Var.f66427h) && p005kotlin.jvm.internal.s.g(this.f66428i, e3Var.f66428i) && p005kotlin.jvm.internal.s.g(this.f66429j, e3Var.f66429j) && p005kotlin.jvm.internal.s.g(this.f66430k, e3Var.f66430k) && p005kotlin.jvm.internal.s.g(this.f66431l, e3Var.f66431l) && p005kotlin.jvm.internal.s.g(this.f66432m, e3Var.f66432m) && p005kotlin.jvm.internal.s.g(this.f66433n, e3Var.f66433n) && p005kotlin.jvm.internal.s.g(this.f66434o, e3Var.f66434o) && p005kotlin.jvm.internal.s.g(this.f66435p, e3Var.f66435p) && p005kotlin.jvm.internal.s.g(this.f66436q, e3Var.f66436q) && p005kotlin.jvm.internal.s.g(this.f66437r, e3Var.f66437r) && p005kotlin.jvm.internal.s.g(this.f66438s, e3Var.f66438s) && p005kotlin.jvm.internal.s.g(this.f66439t, e3Var.f66439t) && this.f66440u == e3Var.f66440u && this.f66441v == e3Var.f66441v && this.f66442w == e3Var.f66442w && this.f66443x == e3Var.f66443x && this.f66444y == e3Var.f66444y && this.f66445z == e3Var.f66445z && this.A == e3Var.A && this.B == e3Var.B && this.C == e3Var.C && this.D == e3Var.D && this.E == e3Var.E && this.F == e3Var.F;
    }

    public final int hashCode() {
        jv1.f fVar = this.f66420a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        jv1.f fVar2 = this.f66421b;
        int iG = q6.f.g(q6.f.g(q6.f.g((iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31, 31, this.f66422c), 31, this.f66423d), 31, this.f66424e);
        xw1.o oVar = this.f66425f;
        int iHashCode2 = (iG + (oVar == null ? 0 : oVar.hashCode())) * 31;
        xw1.o oVar2 = this.f66426g;
        int iHashCode3 = (iHashCode2 + (oVar2 == null ? 0 : oVar2.hashCode())) * 31;
        xw1.o oVar3 = this.f66427h;
        int iHashCode4 = (iHashCode3 + (oVar3 == null ? 0 : oVar3.hashCode())) * 31;
        xw1.o oVar4 = this.f66428i;
        int iHashCode5 = (iHashCode4 + (oVar4 == null ? 0 : oVar4.hashCode())) * 31;
        xw1.o oVar5 = this.f66429j;
        int iHashCode6 = (this.f66439t.hashCode() + q6.f.f(q6.f.h(q6.f.h(q6.f.h(q6.f.f(q6.f.f(q6.f.f(q6.f.f(q6.f.f((iHashCode5 + (oVar5 == null ? 0 : oVar5.hashCode())) * 31, 31, this.f66430k), 31, this.f66431l), 31, this.f66432m), 31, this.f66433n), 31, this.f66434o), this.f66435p, 31), this.f66436q, 31), this.f66437r, 31), 31, this.f66438s)) * 31;
        vt1.o oVar6 = this.f66440u;
        return Boolean.hashCode(this.F) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(r1.q2.d(this.f66443x, r1.q2.d(this.f66442w, q6.f.g((iHashCode6 + (oVar6 != null ? oVar6.hashCode() : 0)) * 31, 31, this.f66441v), 31), 31), 31, this.f66444y), 31, this.f66445z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScreenData(coaches=");
        sb3.append(this.f66420a);
        sb3.append(", moreAtpCoaches=");
        sb3.append(this.f66421b);
        sb3.append(", supportsFBTRunning=");
        kg.f.q(", supportsFBTCycling=", ", supportsFBTTriathlon=", sb3, this.f66422c, this.f66423d);
        sb3.append(this.f66424e);
        sb3.append(", garminRunningCoachVideo=");
        sb3.append(this.f66425f);
        sb3.append(", garminCyclingCoachVideo=");
        sb3.append(this.f66426g);
        sb3.append(", garminTriathlonCoachVideo=");
        sb3.append(this.f66427h);
        sb3.append(", garminFitnessCoachVideo=");
        sb3.append(this.f66428i);
        sb3.append(", garminFROGCoachVideo=");
        sb3.append(this.f66429j);
        sb3.append(", onGarminRunningCoachClick=");
        sb3.append(this.f66430k);
        sb3.append(", onGarminCyclingCoachClick=");
        sb3.append(this.f66431l);
        sb3.append(", onGarminTriathlonCoachClick=");
        sb3.append(this.f66432m);
        sb3.append(", onGarminFitnessCoachClick=");
        sb3.append(this.f66433n);
        sb3.append(", onGarminFROGCoachClick=");
        sb3.append(this.f66434o);
        sb3.append(", onPlayVideoClick=");
        sb3.append(this.f66435p);
        sb3.append(", onATPCoachSelected=");
        sb3.append(this.f66436q);
        sb3.append(", onITPCoachSelected=");
        sb3.append(this.f66437r);
        sb3.append(", onViewMorePlansClick=");
        sb3.append(this.f66438s);
        sb3.append(", onAdditionalCoachSelected=");
        sb3.append(this.f66439t);
        sb3.append(", selectedSport=");
        sb3.append(this.f66440u);
        sb3.append(", shouldShowProgressIndicator=");
        sb3.append(this.f66441v);
        sb3.append(", currentStep=");
        ds.e0.m(this.f66442w, this.f66443x, ", totalSteps=", ", supportRunningTrainingLevel=", sb3);
        kg.f.q(", supportCyclingTrainingLevel=", ", supportsFBTNoviceRunCoach=", sb3, this.f66444y, this.f66445z);
        kg.f.q(", supportsFBTFitnessCoach=", ", supportsFBTStrength=", sb3, this.A, this.B);
        kg.f.q(", supportsFBTFROGCoach=", ", isFitnessCoachRequiresGCPlus=", sb3, this.C, this.D);
        return com.airbnb.lottie.animation.keyframe.a.f(", isFROGCoachRequiresGCPlus=", ")", sb3, this.E, this.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e3(jv1.f fVar, jv1.f fVar2, boolean z14, boolean z15, boolean z16, xw1.o oVar, xw1.o oVar2, xw1.o oVar3, xw1.o oVar4, xw1.o oVar5, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, e23.l<? super xw1.o, Unit> lVar, e23.l<? super xw1.h, Unit> lVar2, e23.l<? super tw1.c, Unit> lVar3, e23.a<Unit> aVar6, e23.p<? super xw1.h, ? super vt1.f, Unit> pVar, vt1.o oVar6, boolean z17, int i14, int i15, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar6.getClass();
        pVar.getClass();
        this.f66420a = fVar;
        this.f66421b = fVar2;
        this.f66422c = z14;
        this.f66423d = z15;
        this.f66424e = z16;
        this.f66425f = oVar;
        this.f66426g = oVar2;
        this.f66427h = oVar3;
        this.f66428i = oVar4;
        this.f66429j = oVar5;
        this.f66430k = aVar;
        this.f66431l = aVar2;
        this.f66432m = aVar3;
        this.f66433n = aVar4;
        this.f66434o = aVar5;
        this.f66435p = lVar;
        this.f66436q = lVar2;
        this.f66437r = lVar3;
        this.f66438s = aVar6;
        this.f66439t = pVar;
        this.f66440u = oVar6;
        this.f66441v = z17;
        this.f66442w = i14;
        this.f66443x = i15;
        this.f66444y = z18;
        this.f66445z = z19;
        this.A = z24;
        this.B = z25;
        this.C = z26;
        this.D = z27;
        this.E = z28;
        this.F = z29;
    }
}
