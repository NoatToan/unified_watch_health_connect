package nq1;

import hd1.q;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\u0015BS\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lnq1/i;", "Ln70/a0;", "Lr53/i;", "Lnq1/k;", "Lj70/j;", "", "", "Lhd1/q;", "data", "Lae0/b;", "userSummariesUseCase", "Lae0/d;", "personalRecordsUseCase", "Lor1/c;", "timelineValuesUseCase", "Lae0/f;", "keyStatsTimelineDelegate", "Lbv/d;", "userPreferences", "<init>", "(Lr53/i;Lae0/b;Lae0/d;Lor1/c;Lae0/f;Lbv/d;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements a0<r53.i<? extends k>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.j<List<String>, q>> f126938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f126939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae0.d f126940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ae0.f f126941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bv.d f126942e;

    static {
        new a(null);
    }

    public i(r53.i<j70.j<List<String>, q>> iVar, ae0.b bVar, ae0.d dVar, or1.c cVar, ae0.f fVar, bv.d dVar2) {
        iVar.getClass();
        bVar.getClass();
        dVar.getClass();
        cVar.getClass();
        fVar.getClass();
        dVar2.getClass();
        this.f126938a = iVar;
        this.f126939b = bVar;
        this.f126940c = dVar;
        this.f126941d = fVar;
        this.f126942e = dVar2;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetStepsKeyStatsDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends k> invoke() {
        return s.A(new j(this.f126938a, this), s0.f129406a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lnq1/i$a;", "", "<init>", "()V", "", "MINUTES_BETWEEN_TIMESTAMPS", "I", "BUCKETS_SIZE", "TIMELINE_SIZE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
