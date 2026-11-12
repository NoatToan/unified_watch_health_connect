package gx;

import f12.l;
import hd1.m;
import j70.j;
import java.util.List;
import n70.a0;
import n70.t1;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\u0018Bc\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lgx/c;", "Ln70/a0;", "Lr53/i;", "Lgx/b;", "Lj70/j;", "", "", "Lhd1/m;", "data", "Ln70/t1;", "bodyBatteryEpochChartDataUseCase", "stressEpochChartDataUseCase", "Lae0/b;", "userSummariesUseCase", "Lor1/c;", "timelineValuesUseCase", "Lbv/d;", "userPreferences", "Lae0/f;", "keyStatsTimelineDelegate", "Lf12/l;", "userSettings", "<init>", "(Lr53/i;Ln70/t1;Ln70/t1;Lae0/b;Lor1/c;Lbv/d;Lae0/f;Lf12/l;)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a0<i<? extends b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, m>> f80020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f80021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f80022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ae0.b f80023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bv.d f80024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ae0.f f80025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f80026g;

    static {
        new a(null);
    }

    public c(i<j<List<String>, m>> iVar, t1 t1Var, t1 t1Var2, ae0.b bVar, or1.c cVar, bv.d dVar, ae0.f fVar, l lVar) {
        iVar.getClass();
        t1Var.getClass();
        t1Var2.getClass();
        bVar.getClass();
        cVar.getClass();
        dVar.getClass();
        fVar.getClass();
        lVar.getClass();
        this.f80020a = iVar;
        this.f80021b = t1Var;
        this.f80022c = t1Var2;
        this.f80023d = bVar;
        this.f80024e = dVar;
        this.f80025f = fVar;
        this.f80026g = lVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetBodyBatteryDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends b> invoke() {
        return s.A(new d(this.f80020a, this), s0.f129406a);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgx/c$a;", "", "<init>", "()V", "", "MINUTES_BETWEEN_TIMESTAMPS", "I", "BUCKETS_SIZE", "TIMELINE_SIZE", "MIN_HOURS_FIRST_TIME_USAGE", "", "TAG", "Ljava/lang/String;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
