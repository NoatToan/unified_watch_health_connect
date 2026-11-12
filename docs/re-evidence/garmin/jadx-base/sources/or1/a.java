package or1;

import java.util.List;
import n70.a0;
import n70.t1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001:\u0001\u0010B;\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lor1/a;", "Ln70/a0;", "Lr53/i;", "Lor1/d;", "Lj70/d;", "", "", "data", "Lae0/b;", "userSummariesUseCase", "Ln70/t1;", "epochChartDataUseCase", "Lor1/c;", "timelineValuesUseCase", "<init>", "(Lr53/i;Lae0/b;Ln70/t1;Lor1/c;)V", "a", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements a0<i<? extends d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<List<String>>> f133403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f133404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f133405c;

    static {
        new C2534a(null);
    }

    public a(i<j70.d<List<String>>> iVar, ae0.b bVar, t1 t1Var, c cVar) {
        iVar.getClass();
        bVar.getClass();
        t1Var.getClass();
        cVar.getClass();
        this.f133403a = iVar;
        this.f133404b = bVar;
        this.f133405c = t1Var;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetStressDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends d> invoke() {
        return s.A(new b(this.f133403a, this), s0.f129406a);
    }

    /* JADX INFO: renamed from: or1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lor1/a$a;", "", "<init>", "()V", "", "MINUTES_BETWEEN_TIMESTAMPS", "I", "BUCKETS_SIZE", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2534a {
        public /* synthetic */ C2534a(j jVar) {
            this();
        }

        private C2534a() {
        }
    }
}
