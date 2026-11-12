package gx;

import hd1.m;
import j70.j;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B-\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgx/f;", "Ln70/a0;", "Lr53/i;", "Lgx/a;", "Lj70/j;", "", "Lhd1/m;", "data", "Lae0/b;", "userSummariesUseCase", "<init>", "(Lr53/i;Lae0/b;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements a0<i<? extends a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<String, m>> f80041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f80042b;

    public f(i<j<String, m>> iVar, ae0.b bVar) {
        iVar.getClass();
        bVar.getClass();
        this.f80041a = iVar;
        this.f80042b = bVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetBodyBatterySecondaryStatsDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends a> invoke() {
        return s.A(new e(this.f80041a, this), s0.f129406a);
    }
}
