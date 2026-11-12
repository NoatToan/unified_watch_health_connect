package defpackage;

import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class owd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final owg f44906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final owg f44907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final owg f44908c;
    private static final owg d;
    private static final owg e;
    private static final owg f;
    private static final owg g;
    private static final owg h;
    private static final owg i;
    private static final owg j;
    private static final owg k;
    private static final owg l;
    private static final owg m;
    private static final owg n;
    private static final owg o;
    private static final owg q;
    private static final owg r;
    private static final Map<String, owg> s;
    private static final List<String> t;

    static {
        HashMap map = new HashMap();
        s = map;
        ArrayList arrayList = new ArrayList();
        t = arrayList;
        owg owgVar = new owg(EnumAnnualType.REPORT_INITAL.value(), Arrays.asList(owf.aj, owf.dt, owf.eg, owf.du, owf.dr, owf.aa, owf.g, owf.at, owf.bn));
        i = owgVar;
        owg owgVar2 = new owg(EnumAnnualType.REPORT_STEP.value(), Arrays.asList(owf.dv, owf.ec, owf.dh, owf.dg, owf.bv, owf.bt, owf.ad, owf.bz, owf.bx, owf.bo, owf.bs, owf.ee));
        k = owgVar2;
        owg owgVar3 = new owg(EnumAnnualType.REPORT_SLEEP.value(), Arrays.asList(owf.da, owf.cx, owf.cy, owf.cz, owf.cv, owf.dc, owf.cr, owf.df, owf.dd, owf.de, owf.cw, owf.cc));
        o = owgVar3;
        owg owgVar4 = new owg(EnumAnnualType.REPORT_RUN.value(), Arrays.asList(owf.dy, owf.cn, owf.ct, owf.cp, owf.cq, owf.cs, owf.ba, owf.ar, owf.ax, owf.bc, owf.bk, owf.bj, owf.cu, owf.cm, owf.cl, owf.co));
        m = owgVar4;
        owg owgVar5 = new owg(EnumAnnualType.REPORT_CYCLE.value(), Arrays.asList(owf.dq, owf.v, owf.ab, owf.w, owf.x, owf.br));
        d = owgVar5;
        owg owgVar6 = new owg(EnumAnnualType.REPORT_FITNESS.value(), Arrays.asList(owf.dx, owf.as, owf.ak, owf.aq, owf.bq, owf.af, owf.an, owf.ai, owf.dl, owf.dm, owf.bw, owf.bu, owf.dn, owf.dp, owf.dw, owf.ds, owf.am, owf.ag, owf.dk, owf.ao, owf.ce, owf.db, owf.aw, owf.au, owf.av));
        f = owgVar6;
        owg owgVar7 = new owg(EnumAnnualType.REPORT_REWARD.value(), Arrays.asList(owf.ca, owf.ap, owf.ck));
        n = owgVar7;
        owg owgVar8 = new owg(EnumAnnualType.REPORT_ACTIVITY.value(), Arrays.asList(owf.bd, owf.bh, owf.ae));
        f44906a = owgVar8;
        owg owgVar9 = new owg(EnumAnnualType.REPORT_SUMARY.value(), Arrays.asList(owf.dr, owf.dj, owf.du));
        q = owgVar9;
        owg owgVar10 = new owg(EnumAnnualType.REPORT_HEALTH.value(), Arrays.asList(owf.f44911c, owf.f44910b, owf.f44909a, owf.d, owf.i, owf.h, owf.f, owf.j, owf.e, owf.eb, owf.ea, owf.ed, owf.by, owf.cg, owf.z, owf.di, owf.cb, owf.u));
        j = owgVar10;
        owg owgVar11 = new owg(EnumAnnualType.REPORT_DIET.value(), Arrays.asList(owf.ac));
        f44908c = owgVar11;
        owg owgVar12 = new owg(EnumAnnualType.REPORT_MUSIC.value(), Arrays.asList(owf.ay, owf.r, owf.bb, owf.az, owf.ah, owf.dz));
        l = owgVar12;
        owg owgVar13 = new owg(EnumAnnualType.REPORT_VIP.value(), Arrays.asList(owf.al, owf.y));
        r = owgVar13;
        owg owgVar14 = new owg(EnumAnnualType.REPORT_LIVING.value(), Arrays.asList(owf.f8do, owf.bp, owf.cd, owf.bm, owf.s));
        g = owgVar14;
        owg owgVar15 = new owg(EnumAnnualType.REPORT_CLIMB_HILL.value(), Arrays.asList(owf.o, owf.k, owf.m, owf.l, owf.t, owf.q, owf.p, owf.n));
        f44907b = owgVar15;
        owg owgVar16 = new owg(EnumAnnualType.REPORT_BADMINTON.value(), Arrays.asList(owf.cf, owf.ch, owf.cj, owf.ci));
        e = owgVar16;
        owg owgVar17 = new owg(EnumAnnualType.REPORT_JUMP_ROPE.value(), Arrays.asList(owf.be, owf.bl, owf.bf, owf.bi, owf.bg));
        h = owgVar17;
        arrayList.add(EnumAnnualType.REPORT_INITAL.value());
        arrayList.add(EnumAnnualType.REPORT_STEP.value());
        arrayList.add(EnumAnnualType.REPORT_SLEEP.value());
        arrayList.add(EnumAnnualType.REPORT_RUN.value());
        arrayList.add(EnumAnnualType.REPORT_CYCLE.value());
        arrayList.add(EnumAnnualType.REPORT_FITNESS.value());
        arrayList.add(EnumAnnualType.REPORT_REWARD.value());
        arrayList.add(EnumAnnualType.REPORT_ACTIVITY.value());
        arrayList.add(EnumAnnualType.REPORT_SUMARY.value());
        arrayList.add(EnumAnnualType.REPORT_HEALTH.value());
        arrayList.add(EnumAnnualType.REPORT_DIET.value());
        arrayList.add(EnumAnnualType.REPORT_MUSIC.value());
        arrayList.add(EnumAnnualType.REPORT_VIP.value());
        arrayList.add(EnumAnnualType.REPORT_LIVING.value());
        arrayList.add(EnumAnnualType.REPORT_CLIMB_HILL.value());
        arrayList.add(EnumAnnualType.REPORT_BADMINTON.value());
        arrayList.add(EnumAnnualType.REPORT_JUMP_ROPE.value());
        map.put(EnumAnnualType.REPORT_INITAL.value(), owgVar);
        map.put(EnumAnnualType.REPORT_STEP.value(), owgVar2);
        map.put(EnumAnnualType.REPORT_SLEEP.value(), owgVar3);
        map.put(EnumAnnualType.REPORT_RUN.value(), owgVar4);
        map.put(EnumAnnualType.REPORT_CYCLE.value(), owgVar5);
        map.put(EnumAnnualType.REPORT_FITNESS.value(), owgVar6);
        map.put(EnumAnnualType.REPORT_REWARD.value(), owgVar7);
        map.put(EnumAnnualType.REPORT_ACTIVITY.value(), owgVar8);
        map.put(EnumAnnualType.REPORT_SUMARY.value(), owgVar9);
        map.put(EnumAnnualType.REPORT_HEALTH.value(), owgVar10);
        map.put(EnumAnnualType.REPORT_DIET.value(), owgVar11);
        map.put(EnumAnnualType.REPORT_MUSIC.value(), owgVar12);
        map.put(EnumAnnualType.REPORT_VIP.value(), owgVar13);
        map.put(EnumAnnualType.REPORT_LIVING.value(), owgVar14);
        map.put(EnumAnnualType.REPORT_CLIMB_HILL.value(), owgVar15);
        map.put(EnumAnnualType.REPORT_BADMINTON.value(), owgVar16);
        map.put(EnumAnnualType.REPORT_JUMP_ROPE.value(), owgVar17);
    }

    public static owg c(String str) {
        return s.get(str);
    }

    public static List<owf> d(String str) {
        owg owgVarC = c(str);
        if (owgVarC == null) {
            return new ArrayList();
        }
        return owgVarC.c();
    }

    public static List<String> b() {
        return Collections.unmodifiableList(t);
    }
}
