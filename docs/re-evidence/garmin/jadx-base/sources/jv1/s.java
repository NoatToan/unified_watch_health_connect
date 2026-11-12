package jv1;

import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u001a\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010O¨\u0006P"}, d2 = {"Ljv1/s;", "", "Lvt1/e;", "fbtPlanType", "Lvt1/m;", "fbtCategory", "Lfg0/k;", "selectedEvent", "Lvt1/o;", "selectedSportType", "Lvt1/d;", "selectedCyclingSportSubType", "Ljv1/h;", "selectedDurationType", "Lvt1/f;", "selectedGoalType", "Ljv1/m;", "selectedPlanGoal", "Lxw1/h;", "coachPlanDTO", "Ltw1/c;", "itpSubTypeDTO", "", "hasOnlyOneCoachPlan", "Ljv1/e0;", "userPreference", "", "", "selectedAvailableDays", "selectedLongRunOrRideDays", "selectedSwimDays", "Lhv1/i;", "selectedSwimAbility", "planName", "atpEventName", "Lorg/joda/time/LocalDate;", "planEndDate", "", "selectedWorkoutsPerWeek", "Lww1/v;", "selectedLocationAndTime", "Lhv1/j;", "prePlanWeeklyMileage", "prePlanTrainingPace", "Lfg0/p;", "eventSearchResultDTO", "createdEventDTO", "Lvt1/j;", "selectedItpPlanType", "Ltw1/d;", "selectedItpPlanLevel", "Ljv1/e;", "coachCautionUIModel", "Lhv1/f;", "selectedItpPastWeekHours", "Ljv1/y;", "recentStatsFromAPI", "Ljv1/x;", "endYourPlanSelection", "Lvt1/h;", "selectedStrengthWorkoutType", "Lww1/w;", "triathlonLegTargets", "Lfg0/j;", "triathlonGoals", "Ljv1/d0;", "triathlonTrainingHistory", "Ljv1/o;", "availableElevationProfiles", "selectedElevationProfile", "", "customElevationInMeters", "Lhv1/e;", "selectedHillType", "Lz20/e;", "selectedCourse", "Ltw1/k;", "trainingLevel", "<init>", "(Lvt1/e;Lvt1/m;Lfg0/k;Lvt1/o;Lvt1/d;Ljv1/h;Lvt1/f;Ljv1/m;Lxw1/h;Ltw1/c;ZLjv1/e0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lhv1/i;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Ljava/lang/Integer;Lww1/v;Lhv1/j;Ljava/lang/Integer;Lfg0/p;Lfg0/k;Lvt1/j;Ltw1/d;Ljv1/e;Lhv1/f;Ljv1/y;Ljv1/x;Lvt1/h;Lww1/w;Lfg0/j;Ljv1/d0;Ljava/util/List;Ljv1/o;Ljava/lang/Double;Lhv1/e;Lz20/e;Ltw1/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {
    public final tw1.d A;
    public final e B;
    public final hv1.f C;
    public final y D;
    public final x E;
    public final vt1.h F;
    public final ww1.w G;
    public final fg0.j H;
    public final d0 I;
    public final List<o> J;
    public final o K;
    public final Double L;
    public final hv1.e M;
    public final z20.e N;
    public final tw1.k O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt1.e f101122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt1.m f101123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg0.k f101124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt1.o f101125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt1.d f101126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f101127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt1.f f101128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f101129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xw1.h f101130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tw1.c f101131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f101132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e0 f101133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<String> f101134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<String> f101135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<String> f101136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hv1.i f101137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f101138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f101139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LocalDate f101140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f101141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ww1.v f101142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final hv1.j f101143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f101144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fg0.p f101145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fg0.k f101146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final vt1.j f101147z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s(vt1.e eVar, vt1.m mVar, fg0.k kVar, vt1.o oVar, vt1.d dVar, h hVar, vt1.f fVar, m mVar2, xw1.h hVar2, tw1.c cVar, boolean z14, e0 e0Var, List list, List list2, List list3, hv1.i iVar, String str, String str2, LocalDate localDate, Integer num, ww1.v vVar, hv1.j jVar, Integer num2, fg0.p pVar, fg0.k kVar2, vt1.j jVar2, tw1.d dVar2, e eVar2, hv1.f fVar2, y yVar, x xVar, vt1.h hVar3, ww1.w wVar, fg0.j jVar3, d0 d0Var, List list4, o oVar2, Double d14, hv1.e eVar3, z20.e eVar4, tw1.k kVar3, int i14, int i15, p005kotlin.jvm.internal.j jVar4) {
        vt1.e eVar5 = (i14 & 1) != 0 ? null : eVar;
        this(eVar5, (i14 & 2) != 0 ? vt1.m.FBT_ADAPTIVE : mVar, (i14 & 4) != 0 ? null : kVar, (i14 & 8) != 0 ? null : oVar, (i14 & 16) != 0 ? null : dVar, (i14 & 32) != 0 ? null : hVar, (i14 & 64) != 0 ? null : fVar, (i14 & 128) != 0 ? null : mVar2, (i14 & 256) != 0 ? null : hVar2, (i14 & 512) != 0 ? null : cVar, (i14 & 1024) != 0 ? false : z14, (i14 & 2048) != 0 ? null : e0Var, (i14 & 4096) != 0 ? null : list, (i14 & 8192) != 0 ? null : list2, (i14 & 16384) != 0 ? null : list3, (i14 & 32768) != 0 ? null : iVar, (i14 & 65536) != 0 ? null : str, (i14 & 131072) != 0 ? null : str2, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : localDate, (i14 & 524288) != 0 ? null : num, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : vVar, (i14 & 2097152) != 0 ? null : jVar, (i14 & 4194304) != 0 ? null : num2, (i14 & 8388608) != 0 ? null : pVar, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : kVar2, (i14 & 33554432) != 0 ? null : jVar2, (i14 & 67108864) != 0 ? null : dVar2, (i14 & 134217728) != 0 ? null : eVar2, (i14 & 268435456) != 0 ? null : fVar2, (i14 & 536870912) != 0 ? null : yVar, (i14 & 1073741824) != 0 ? null : xVar, (i14 & Integer.MIN_VALUE) != 0 ? null : hVar3, (i15 & 1) != 0 ? null : wVar, (i15 & 2) != 0 ? null : jVar3, (i15 & 4) != 0 ? null : d0Var, (i15 & 8) != 0 ? null : list4, (i15 & 16) != 0 ? null : oVar2, (i15 & 32) != 0 ? null : d14, (i15 & 64) != 0 ? null : eVar3, (i15 & 128) != 0 ? null : eVar4, (i15 & 256) != 0 ? null : kVar3);
    }

    public static s a(s sVar, vt1.e eVar, vt1.m mVar, fg0.k kVar, vt1.o oVar, vt1.d dVar, h hVar, vt1.f fVar, m mVar2, xw1.h hVar2, tw1.c cVar, boolean z14, e0 e0Var, List list, List list2, List list3, hv1.i iVar, String str, String str2, LocalDate localDate, Integer num, ww1.v vVar, hv1.j jVar, Integer num2, fg0.p pVar, fg0.k kVar2, vt1.j jVar2, tw1.d dVar2, e eVar2, hv1.f fVar2, y yVar, x xVar, vt1.h hVar3, ww1.w wVar, fg0.j jVar3, d0 d0Var, List list4, o oVar2, Double d14, hv1.e eVar3, z20.e eVar4, tw1.k kVar3, int i14, int i15) {
        vt1.e eVar5 = (i14 & 1) != 0 ? sVar.f101122a : eVar;
        vt1.m mVar3 = (i14 & 2) != 0 ? sVar.f101123b : mVar;
        fg0.k kVar4 = (i14 & 4) != 0 ? sVar.f101124c : kVar;
        vt1.o oVar3 = (i14 & 8) != 0 ? sVar.f101125d : oVar;
        vt1.d dVar3 = (i14 & 16) != 0 ? sVar.f101126e : dVar;
        h hVar4 = (i14 & 32) != 0 ? sVar.f101127f : hVar;
        vt1.f fVar3 = (i14 & 64) != 0 ? sVar.f101128g : fVar;
        m mVar4 = (i14 & 128) != 0 ? sVar.f101129h : mVar2;
        xw1.h hVar5 = (i14 & 256) != 0 ? sVar.f101130i : hVar2;
        tw1.c cVar2 = (i14 & 512) != 0 ? sVar.f101131j : cVar;
        boolean z15 = (i14 & 1024) != 0 ? sVar.f101132k : z14;
        e0 e0Var2 = (i14 & 2048) != 0 ? sVar.f101133l : e0Var;
        List list5 = (i14 & 4096) != 0 ? sVar.f101134m : list;
        vt1.e eVar6 = eVar5;
        List list6 = (i14 & 8192) != 0 ? sVar.f101135n : list2;
        List list7 = (i14 & 16384) != 0 ? sVar.f101136o : list3;
        hv1.i iVar2 = (i14 & 32768) != 0 ? sVar.f101137p : iVar;
        String str3 = (i14 & 65536) != 0 ? sVar.f101138q : str;
        String str4 = (i14 & 131072) != 0 ? sVar.f101139r : str2;
        LocalDate localDate2 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? sVar.f101140s : localDate;
        Integer num3 = (i14 & 524288) != 0 ? sVar.f101141t : num;
        ww1.v vVar2 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? sVar.f101142u : vVar;
        hv1.j jVar4 = (i14 & 2097152) != 0 ? sVar.f101143v : jVar;
        Integer num4 = (i14 & 4194304) != 0 ? sVar.f101144w : num2;
        fg0.p pVar2 = (i14 & 8388608) != 0 ? sVar.f101145x : pVar;
        fg0.k kVar5 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? sVar.f101146y : kVar2;
        vt1.j jVar5 = (i14 & 33554432) != 0 ? sVar.f101147z : jVar2;
        tw1.d dVar4 = (i14 & 67108864) != 0 ? sVar.A : dVar2;
        e eVar7 = (i14 & 134217728) != 0 ? sVar.B : eVar2;
        hv1.f fVar4 = (i14 & 268435456) != 0 ? sVar.C : fVar2;
        y yVar2 = (i14 & 536870912) != 0 ? sVar.D : yVar;
        x xVar2 = (i14 & 1073741824) != 0 ? sVar.E : xVar;
        vt1.h hVar6 = (i14 & Integer.MIN_VALUE) != 0 ? sVar.F : hVar3;
        ww1.w wVar2 = (i15 & 1) != 0 ? sVar.G : wVar;
        fg0.j jVar6 = (i15 & 2) != 0 ? sVar.H : jVar3;
        d0 d0Var2 = (i15 & 4) != 0 ? sVar.I : d0Var;
        List list8 = (i15 & 8) != 0 ? sVar.J : list4;
        o oVar4 = (i15 & 16) != 0 ? sVar.K : oVar2;
        Double d15 = (i15 & 32) != 0 ? sVar.L : d14;
        hv1.e eVar8 = (i15 & 64) != 0 ? sVar.M : eVar3;
        z20.e eVar9 = (i15 & 128) != 0 ? sVar.N : eVar4;
        tw1.k kVar6 = (i15 & 256) != 0 ? sVar.O : kVar3;
        mVar3.getClass();
        return new s(eVar6, mVar3, kVar4, oVar3, dVar3, hVar4, fVar3, mVar4, hVar5, cVar2, z15, e0Var2, list5, list6, list7, iVar2, str3, str4, localDate2, num3, vVar2, jVar4, num4, pVar2, kVar5, jVar5, dVar4, eVar7, fVar4, yVar2, xVar2, hVar6, wVar2, jVar6, d0Var2, list8, oVar4, d15, eVar8, eVar9, kVar6);
    }

    public final List<String> b(List<String> list) {
        ArrayList arrayList;
        list.getClass();
        e0 e0Var = this.f101133l;
        List<String> listH = e0Var != null ? e0Var.h() : null;
        if (listH != null) {
            arrayList = new ArrayList();
            for (Object obj : listH) {
                if (!list.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if ((arrayList != null ? arrayList.size() : 0) <= 1) {
            return arrayList;
        }
        if (e0Var != null) {
            return e0Var.h();
        }
        return null;
    }

    public final int c() {
        tw1.d dVar;
        if (g()) {
            xw1.h hVar = this.f101130i;
            if (hVar != null) {
                return hVar.getMinWorkoutsPerWeek();
            }
            return 0;
        }
        if (this.f101123b != vt1.m.ITP || (dVar = this.A) == null) {
            return 0;
        }
        return ((int) h0.P(new j23.l(dVar.getWorkoutsPerWeekMin(), dVar.getWorkoutsPerWeekMax()))) - 1;
    }

    public final LocalDate d() {
        LocalDate date;
        if (h() || this.f101122a == vt1.e.IMPROVE_FITNESS) {
            return this.f101140s;
        }
        fg0.k kVar = this.f101124c;
        if (kVar != null && (date = kVar.getDate()) != null) {
            return date;
        }
        fg0.k kVar2 = this.f101146y;
        LocalDate date2 = kVar2 != null ? kVar2.getDate() : null;
        if (date2 != null) {
            return date2;
        }
        fg0.p pVar = this.f101145x;
        if (pVar != null) {
            return pVar.j().getDate();
        }
        return null;
    }

    public final ArrayList e() {
        wt1.q.f187120f.getClass();
        List listG = wt1.q.a.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            String str = (String) obj;
            List<String> list = this.f101134m;
            if (list == null || !list.contains(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f101122a == sVar.f101122a && this.f101123b == sVar.f101123b && p005kotlin.jvm.internal.s.g(this.f101124c, sVar.f101124c) && this.f101125d == sVar.f101125d && this.f101126e == sVar.f101126e && p005kotlin.jvm.internal.s.g(this.f101127f, sVar.f101127f) && p005kotlin.jvm.internal.s.g(this.f101128g, sVar.f101128g) && p005kotlin.jvm.internal.s.g(this.f101129h, sVar.f101129h) && p005kotlin.jvm.internal.s.g(this.f101130i, sVar.f101130i) && p005kotlin.jvm.internal.s.g(this.f101131j, sVar.f101131j) && this.f101132k == sVar.f101132k && p005kotlin.jvm.internal.s.g(this.f101133l, sVar.f101133l) && p005kotlin.jvm.internal.s.g(this.f101134m, sVar.f101134m) && p005kotlin.jvm.internal.s.g(this.f101135n, sVar.f101135n) && p005kotlin.jvm.internal.s.g(this.f101136o, sVar.f101136o) && this.f101137p == sVar.f101137p && p005kotlin.jvm.internal.s.g(this.f101138q, sVar.f101138q) && p005kotlin.jvm.internal.s.g(this.f101139r, sVar.f101139r) && p005kotlin.jvm.internal.s.g(this.f101140s, sVar.f101140s) && p005kotlin.jvm.internal.s.g(this.f101141t, sVar.f101141t) && p005kotlin.jvm.internal.s.g(this.f101142u, sVar.f101142u) && this.f101143v == sVar.f101143v && p005kotlin.jvm.internal.s.g(this.f101144w, sVar.f101144w) && p005kotlin.jvm.internal.s.g(this.f101145x, sVar.f101145x) && p005kotlin.jvm.internal.s.g(this.f101146y, sVar.f101146y) && this.f101147z == sVar.f101147z && p005kotlin.jvm.internal.s.g(this.A, sVar.A) && p005kotlin.jvm.internal.s.g(this.B, sVar.B) && this.C == sVar.C && p005kotlin.jvm.internal.s.g(this.D, sVar.D) && this.E == sVar.E && this.F == sVar.F && p005kotlin.jvm.internal.s.g(this.G, sVar.G) && p005kotlin.jvm.internal.s.g(this.H, sVar.H) && p005kotlin.jvm.internal.s.g(this.I, sVar.I) && p005kotlin.jvm.internal.s.g(this.J, sVar.J) && p005kotlin.jvm.internal.s.g(this.K, sVar.K) && p005kotlin.jvm.internal.s.g(this.L, sVar.L) && this.M == sVar.M && p005kotlin.jvm.internal.s.g(this.N, sVar.N) && this.O == sVar.O;
    }

    public final fg0.k f() {
        fg0.k kVar = this.f101124c;
        if (kVar != null) {
            return kVar;
        }
        fg0.p pVar = this.f101145x;
        fg0.k kVarJ = pVar != null ? pVar.j() : null;
        return kVarJ == null ? this.f101146y : kVarJ;
    }

    public final boolean g() {
        return this.f101123b == vt1.m.STATIC;
    }

    public final boolean h() {
        return this.f101122a == vt1.e.ACHIEVE_A_MILESTONE;
    }

    public final int hashCode() {
        vt1.e eVar = this.f101122a;
        int iHashCode = (this.f101123b.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31)) * 31;
        fg0.k kVar = this.f101124c;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        vt1.o oVar = this.f101125d;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        vt1.d dVar = this.f101126e;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.f101127f;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        vt1.f fVar = this.f101128g;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        m mVar = this.f101129h;
        int iHashCode7 = (iHashCode6 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        xw1.h hVar2 = this.f101130i;
        int iHashCode8 = (iHashCode7 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        tw1.c cVar = this.f101131j;
        int iG = q6.f.g((iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f101132k);
        e0 e0Var = this.f101133l;
        int iHashCode9 = (iG + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        List<String> list = this.f101134m;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f101135n;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f101136o;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        hv1.i iVar = this.f101137p;
        int iHashCode13 = (iHashCode12 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.f101138q;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101139r;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f101140s;
        int iHashCode16 = (iHashCode15 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.f101141t;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        ww1.v vVar = this.f101142u;
        int iHashCode18 = (iHashCode17 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        hv1.j jVar = this.f101143v;
        int iHashCode19 = (iHashCode18 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num2 = this.f101144w;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        fg0.p pVar = this.f101145x;
        int iHashCode21 = (iHashCode20 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        fg0.k kVar2 = this.f101146y;
        int iHashCode22 = (iHashCode21 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        vt1.j jVar2 = this.f101147z;
        int iHashCode23 = (iHashCode22 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        tw1.d dVar2 = this.A;
        int iHashCode24 = (iHashCode23 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        e eVar2 = this.B;
        int iHashCode25 = (iHashCode24 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        hv1.f fVar2 = this.C;
        int iHashCode26 = (iHashCode25 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        y yVar = this.D;
        int iHashCode27 = (iHashCode26 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        x xVar = this.E;
        int iHashCode28 = (iHashCode27 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        vt1.h hVar3 = this.F;
        int iHashCode29 = (iHashCode28 + (hVar3 == null ? 0 : hVar3.hashCode())) * 31;
        ww1.w wVar = this.G;
        int iHashCode30 = (iHashCode29 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        fg0.j jVar3 = this.H;
        int iHashCode31 = (iHashCode30 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        d0 d0Var = this.I;
        int iHashCode32 = (iHashCode31 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        List<o> list4 = this.J;
        int iHashCode33 = (iHashCode32 + (list4 == null ? 0 : list4.hashCode())) * 31;
        o oVar2 = this.K;
        int iHashCode34 = (iHashCode33 + (oVar2 == null ? 0 : oVar2.hashCode())) * 31;
        Double d14 = this.L;
        int iHashCode35 = (iHashCode34 + (d14 == null ? 0 : d14.hashCode())) * 31;
        hv1.e eVar3 = this.M;
        int iHashCode36 = (iHashCode35 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        z20.e eVar4 = this.N;
        int iHashCode37 = (iHashCode36 + (eVar4 == null ? 0 : eVar4.hashCode())) * 31;
        tw1.k kVar3 = this.O;
        return iHashCode37 + (kVar3 != null ? kVar3.hashCode() : 0);
    }

    public final List<String> i(boolean z14) {
        ArrayList arrayList;
        List<String> list = this.f101135n;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!e().contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        ArrayList arrayListE = e();
        e0 e0Var = this.f101133l;
        List<String> listD = e0Var != null ? e0Var.d() : null;
        if (listD != null) {
            arrayList = new ArrayList();
            for (Object obj2 : listD) {
                if (!arrayListE.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if ((arrayList != null ? arrayList.size() : 0) <= 1) {
            return arrayList;
        }
        if (e0Var != null) {
            return e0Var.f(z14);
        }
        return null;
    }

    public final List<wt1.q> j() {
        List<String> list = this.f101135n;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
        }
        return h0.b1(arrayList);
    }

    public final boolean k() {
        int iF;
        if (g()) {
            xw1.h hVar = this.f101130i;
            if (hVar != null) {
                iF = hVar.getMaxWorkoutsPerWeek();
            } else {
                tw1.d dVar = this.A;
                iF = dVar != null ? dVar.getWorkoutsPerWeekMax() : 0;
            }
            if (iF - c() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    public final fg0.k l() {
        Double d14;
        fg0.d dVar;
        gg0.f fVarA;
        fg0.d dVarC;
        fg0.d dVar2;
        String startTimeHhMm;
        String timeZoneId;
        vt1.d dVar3;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB;
        Double dValueOf = Double.valueOf(0.0d);
        fg0.k kVar = new fg0.k(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        kVar.L0((g() && h()) ? this.f101139r : this.f101138q);
        kVar.C0(this.f101140s);
        z20.e eVar = this.N;
        if (eVar != null) {
            kVar.z0(d53.t.j(eVar.f201897a));
            kVar.A0(eVar.f201898b);
        }
        vt1.o oVar = vt1.o.f180178i;
        vt1.o oVar2 = this.f101125d;
        ww1.w wVar = this.G;
        if (oVar2 == oVar) {
            if (wVar == null || (listB = wVar.b()) == null) {
                listB = j0.f134944a;
            }
            og0.a.f131967a.getClass();
            com.garmin.android.apps.connectmobile.workouts.data.model.z zVarF = og0.a.f(listB);
            dVar = new fg0.d(zVarF.getValue(), zVarF.getUnit(), zVarF.getUnitType());
        } else {
            fg0.d dVar4 = new fg0.d(null, null, null, 7, null);
            h hVar = this.f101127f;
            if (hVar instanceof g) {
                dVar4.s(gg0.h.DISTANCE);
                g gVar = (g) hVar;
                Double d15 = gVar.f101057a;
                if (d15 != null) {
                    dValueOf = d15;
                }
                dVar4.t(dValueOf);
                dVar4.r(gVar.f101058b);
            } else {
                dVar4.s(gg0.h.TIME);
                if (hVar != null && (d14 = hVar.f101057a) != null) {
                    dValueOf = d14;
                }
                dVar4.t(dValueOf);
                dVar4.r(gg0.i.SECOND);
            }
            dVar = dVar4;
        }
        kVar.w0(dVar);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        kVar.x0(wVar != null ? wVar.b() : null);
        if (oVar2 != vt1.o.f180176g || (dVar3 = this.f101126e) == null) {
            gg0.f.a aVar = gg0.f.f77128d;
            String str = oVar2 != null ? oVar2.f180185b : null;
            aVar.getClass();
            fVarA = gg0.f.a.a(str);
        } else {
            gg0.f.a aVar2 = gg0.f.f77128d;
            String str2 = dVar3.f180097b;
            aVar2.getClass();
            fVarA = gg0.f.a.a(str2);
            if (!fVarA.e()) {
                fVarA = gg0.f.f77132h;
            }
        }
        kVar.R0(fVarA);
        ww1.v vVar = this.f101142u;
        if (vVar != null) {
            fg0.r rVar = vVar.f187878b;
            if (vVar.f187881e) {
                fg0.r rVar2 = new fg0.r(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                if (rVar == null || (startTimeHhMm = rVar.getStartTimeHhMm()) == null) {
                    startTimeHhMm = "08:00";
                }
                rVar2.i(startTimeHhMm);
                if (rVar == null || (timeZoneId = rVar.getTimeZoneId()) == null) {
                    timeZoneId = "";
                }
                rVar2.j(timeZoneId);
                kVar.Q0(rVar2);
                kVar.S0(vVar.f187879c);
                kVar.V0(vVar.f187880d);
            } else {
                kVar.V0(null);
            }
        } else {
            kVar.V0(null);
        }
        fg0.c cVar = new fg0.c(null, null, null, null, 15, null);
        cVar.g(gg0.a.PRIVATE);
        Boolean bool = Boolean.FALSE;
        cVar.h(bool);
        cVar.i(bool);
        cVar.f(bool);
        kVar.P0(cVar);
        fg0.c eventPrivacy = kVar.getEventPrivacy();
        if (eventPrivacy != null) {
            eventPrivacy.i(bool);
        }
        Boolean bool2 = Boolean.TRUE;
        kVar.M0();
        kVar.c1(bool);
        fg0.j jVar = this.H;
        if (oVar2 != oVar) {
            m mVar = this.f101129h;
            if (mVar != null) {
                dVarC = mVar.c();
                dVar2 = dVarC;
            } else {
                dVar2 = null;
            }
        } else if (jVar != null) {
            dVarC = jVar.getCustomGoal();
            dVar2 = dVarC;
        } else {
            dVar2 = null;
        }
        kVar.E0(new fg0.j(dVar2, jVar != null ? jVar.h() : null, bool2, null, null, bool2, null, null, null, null, null, null, null, 8152, null));
        return kVar;
    }

    public final List<wt1.q> m() {
        List<String> list = this.f101134m;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            wr.g.z(wt1.q.f187120f, (String) it.next(), arrayList);
        }
        return h0.b1(arrayList);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTPlanWizardModel(fbtPlanType=");
        sb3.append(this.f101122a);
        sb3.append(", fbtCategory=");
        sb3.append(this.f101123b);
        sb3.append(", selectedEvent=");
        sb3.append(this.f101124c);
        sb3.append(", selectedSportType=");
        sb3.append(this.f101125d);
        sb3.append(", selectedCyclingSportSubType=");
        sb3.append(this.f101126e);
        sb3.append(", selectedDurationType=");
        sb3.append(this.f101127f);
        sb3.append(", selectedGoalType=");
        sb3.append(this.f101128g);
        sb3.append(", selectedPlanGoal=");
        sb3.append(this.f101129h);
        sb3.append(", coachPlanDTO=");
        sb3.append(this.f101130i);
        sb3.append(", itpSubTypeDTO=");
        sb3.append(this.f101131j);
        sb3.append(", hasOnlyOneCoachPlan=");
        sb3.append(this.f101132k);
        sb3.append(", userPreference=");
        sb3.append(this.f101133l);
        sb3.append(", selectedAvailableDays=");
        n23.j.z(sb3, this.f101134m, ", selectedLongRunOrRideDays=", this.f101135n, ", selectedSwimDays=");
        sb3.append(this.f101136o);
        sb3.append(", selectedSwimAbility=");
        sb3.append(this.f101137p);
        sb3.append(", planName=");
        sn.a.t(sb3, this.f101138q, ", atpEventName=", this.f101139r, ", planEndDate=");
        sb3.append(this.f101140s);
        sb3.append(", selectedWorkoutsPerWeek=");
        sb3.append(this.f101141t);
        sb3.append(", selectedLocationAndTime=");
        sb3.append(this.f101142u);
        sb3.append(", prePlanWeeklyMileage=");
        sb3.append(this.f101143v);
        sb3.append(", prePlanTrainingPace=");
        sb3.append(this.f101144w);
        sb3.append(", eventSearchResultDTO=");
        sb3.append(this.f101145x);
        sb3.append(", createdEventDTO=");
        sb3.append(this.f101146y);
        sb3.append(", selectedItpPlanType=");
        sb3.append(this.f101147z);
        sb3.append(", selectedItpPlanLevel=");
        sb3.append(this.A);
        sb3.append(", coachCautionUIModel=");
        sb3.append(this.B);
        sb3.append(", selectedItpPastWeekHours=");
        sb3.append(this.C);
        sb3.append(", recentStatsFromAPI=");
        sb3.append(this.D);
        sb3.append(", endYourPlanSelection=");
        sb3.append(this.E);
        sb3.append(", selectedStrengthWorkoutType=");
        sb3.append(this.F);
        sb3.append(", triathlonLegTargets=");
        sb3.append(this.G);
        sb3.append(", triathlonGoals=");
        sb3.append(this.H);
        sb3.append(", triathlonTrainingHistory=");
        sb3.append(this.I);
        sb3.append(", availableElevationProfiles=");
        sb3.append(this.J);
        sb3.append(", selectedElevationProfile=");
        sb3.append(this.K);
        sb3.append(", customElevationInMeters=");
        sb3.append(this.L);
        sb3.append(", selectedHillType=");
        sb3.append(this.M);
        sb3.append(", selectedCourse=");
        sb3.append(this.N);
        sb3.append(", trainingLevel=");
        sb3.append(this.O);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(vt1.e eVar, vt1.m mVar, fg0.k kVar, vt1.o oVar, vt1.d dVar, h hVar, vt1.f fVar, m mVar2, xw1.h hVar2, tw1.c cVar, boolean z14, e0 e0Var, List<String> list, List<String> list2, List<String> list3, hv1.i iVar, String str, String str2, LocalDate localDate, Integer num, ww1.v vVar, hv1.j jVar, Integer num2, fg0.p pVar, fg0.k kVar2, vt1.j jVar2, tw1.d dVar2, e eVar2, hv1.f fVar2, y yVar, x xVar, vt1.h hVar3, ww1.w wVar, fg0.j jVar3, d0 d0Var, List<? extends o> list4, o oVar2, Double d14, hv1.e eVar3, z20.e eVar4, tw1.k kVar3) {
        mVar.getClass();
        this.f101122a = eVar;
        this.f101123b = mVar;
        this.f101124c = kVar;
        this.f101125d = oVar;
        this.f101126e = dVar;
        this.f101127f = hVar;
        this.f101128g = fVar;
        this.f101129h = mVar2;
        this.f101130i = hVar2;
        this.f101131j = cVar;
        this.f101132k = z14;
        this.f101133l = e0Var;
        this.f101134m = list;
        this.f101135n = list2;
        this.f101136o = list3;
        this.f101137p = iVar;
        this.f101138q = str;
        this.f101139r = str2;
        this.f101140s = localDate;
        this.f101141t = num;
        this.f101142u = vVar;
        this.f101143v = jVar;
        this.f101144w = num2;
        this.f101145x = pVar;
        this.f101146y = kVar2;
        this.f101147z = jVar2;
        this.A = dVar2;
        this.B = eVar2;
        this.C = fVar2;
        this.D = yVar;
        this.E = xVar;
        this.F = hVar3;
        this.G = wVar;
        this.H = jVar3;
        this.I = d0Var;
        this.J = list4;
        this.K = oVar2;
        this.L = d14;
        this.M = eVar3;
        this.N = eVar4;
        this.O = kVar3;
    }

    public s() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null);
    }
}
