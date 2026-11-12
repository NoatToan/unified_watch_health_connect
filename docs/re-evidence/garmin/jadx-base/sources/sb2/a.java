package sb2;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.b0;
import ub2.g;
import ub2.g0;
import ub2.h0;
import ub2.l0;
import ub2.m0;
import ub2.y;
import ub2.z;
import vh.a0;
import vh.q;
import vh.s;
import vh.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsb2/a;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f158396a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f158397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<w> f158398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<w> f158399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<w> f158400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<w> f158401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<w> f158402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<w> f158403h;

    static {
        z.a aVar = z.f169917a;
        aVar.getClass();
        a0 a0Var = z.f169918b;
        List<w> listC = p13.w.c(new q.a("metrics", s.a(a0Var)).c());
        f158397b = listC;
        aVar.getClass();
        q qVarC = new q.a("factor", a0Var).c();
        ub2.a0.a aVar2 = ub2.a0.f169799a;
        aVar2.getClass();
        a0 a0Var2 = ub2.a0.f169800b;
        q qVarC2 = new q.a(TtmlNode.ATTR_ID, a0Var2).c();
        b0.a aVar3 = b0.f169805a;
        aVar3.getClass();
        a0 a0Var3 = b0.f169806b;
        List<w> listK = x.k(qVarC, qVarC2, new q.a(Action.KEY_ATTRIBUTE, a0Var3).c());
        f158398c = listK;
        aVar3.getClass();
        q qVarC3 = new q.a(Action.KEY_ATTRIBUTE, a0Var3).c();
        aVar2.getClass();
        q qVarC4 = new q.a("metricsIndex", a0Var2).c();
        m0.f169867a.getClass();
        q.a aVar4 = new q.a("unit", m0.f169868b);
        listK.getClass();
        aVar4.f178381f = listK;
        List<w> listK2 = x.k(qVarC3, qVarC4, aVar4.c());
        f158399d = listK2;
        ub2.c.f169809a.getClass();
        q.a aVar5 = new q.a("activityDetailMetrics", s.a(ub2.c.f169810b));
        aVar5.f178381f = listC;
        q qVarC5 = aVar5.c();
        h0.a aVar6 = h0.f169841a;
        aVar6.getClass();
        a0 a0Var4 = h0.f169842b;
        q qVarC6 = new q.a("activityId", a0Var4).c();
        aVar2.getClass();
        q qVarC7 = new q.a("measurementCount", a0Var2).c();
        aVar2.getClass();
        q qVarC8 = new q.a("metricsCount", a0Var2).c();
        l0.f169863a.getClass();
        q.a aVar7 = new q.a("metricDescriptors", s.a(l0.f169864b));
        listK2.getClass();
        aVar7.f178381f = listK2;
        q qVarC9 = aVar7.c();
        aVar2.getClass();
        List<w> listK3 = x.k(qVarC5, qVarC6, qVarC7, qVarC8, qVarC9, new q.a("totalMetricsCount", a0Var2).c());
        f158400e = listK3;
        aVar6.getClass();
        q qVarC10 = new q.a("typeId", a0Var4).c();
        aVar6.getClass();
        List<w> listK4 = x.k(qVarC10, new q.a("parentTypeId", a0Var4).c());
        f158401f = listK4;
        ub2.d.f169815a.getClass();
        q.a aVar8 = new q.a("activityDetails", ub2.d.f169816b);
        listK3.getClass();
        aVar8.f178381f = listK3;
        q qVarC11 = aVar8.c();
        aVar6.getClass();
        q qVarC12 = new q.a("activityId", a0Var4).c();
        aVar3.getClass();
        q qVarC13 = new q.a("activityName", a0Var3).c();
        g.f169833a.getClass();
        q.a aVar9 = new q.a("activityType", g.f169834b);
        listK4.getClass();
        aVar9.f178381f = listK4;
        q qVarC14 = aVar9.c();
        aVar6.getClass();
        q qVarC15 = new q.a("deviceId", a0Var4).c();
        aVar.getClass();
        q qVarC16 = new q.a("distance", a0Var).c();
        aVar.getClass();
        q qVarC17 = new q.a("duration", a0Var).c();
        aVar.getClass();
        q qVarC18 = new q.a("elevationGain", a0Var).c();
        aVar.getClass();
        q qVarC19 = new q.a("elevationLoss", a0Var).c();
        y.f169913a.getClass();
        q qVarC20 = new q.a("manualActivity", y.f169914b).c();
        aVar3.getClass();
        q qVarC21 = new q.a("manufacturer", a0Var3).c();
        aVar.getClass();
        q qVarC22 = new q.a("maxSpeed", a0Var).c();
        aVar.getClass();
        q qVarC23 = new q.a("averageSpeed", a0Var).c();
        aVar.getClass();
        q qVarC24 = new q.a("movingDuration", a0Var).c();
        aVar.getClass();
        q qVarC25 = new q.a("elapsedDuration", a0Var).c();
        aVar.getClass();
        q qVarC26 = new q.a("bmrCalories", a0Var).c();
        aVar.getClass();
        q qVarC27 = new q.a("calories", a0Var).c();
        aVar.getClass();
        q qVarC28 = new q.a("averageBikingCadenceInRevPerMinute", a0Var).c();
        aVar.getClass();
        q qVarC29 = new q.a("averageRunningCadenceInStepsPerMinute", a0Var).c();
        aVar.getClass();
        q qVarC30 = new q.a("avgStrokeDistance", a0Var).c();
        aVar.getClass();
        q qVarC31 = new q.a("avgStrokes", a0Var).c();
        aVar.getClass();
        q qVarC32 = new q.a("maxBikingCadenceInRevPerMinute", a0Var).c();
        aVar.getClass();
        q qVarC33 = new q.a("maxRunningCadenceInStepsPerMinute", a0Var).c();
        aVar.getClass();
        q qVarC34 = new q.a("strokes", a0Var).c();
        g0.a aVar10 = g0.f169835a;
        aVar10.getClass();
        a0 a0Var5 = g0.f169836b;
        q qVarC35 = new q.a("startTimeLocal", a0Var5).c();
        aVar10.getClass();
        List<w> listK5 = x.k(qVarC11, qVarC12, qVarC13, qVarC14, qVarC15, qVarC16, qVarC17, qVarC18, qVarC19, qVarC20, qVarC21, qVarC22, qVarC23, qVarC24, qVarC25, qVarC26, qVarC27, qVarC28, qVarC29, qVarC30, qVarC31, qVarC32, qVarC33, qVarC34, qVarC35, new q.a("startTimeGMT", a0Var5).c());
        f158402g = listK5;
        ub2.b.f169803a.getClass();
        q.a aVar11 = new q.a("activityList", s.a(ub2.b.f169804b));
        listK5.getClass();
        aVar11.f178381f = listK5;
        f158403h = p13.w.c(aVar11.c());
    }

    private a() {
    }
}
