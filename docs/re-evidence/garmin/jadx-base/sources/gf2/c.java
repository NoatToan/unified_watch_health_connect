package gf2;

import com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0;
import n70.a0;
import o13.p;
import o4.v0;
import p005kotlin.Metadata;
import r53.i;
import r53.u1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B1\u0012 \u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgf2/c;", "Ln70/a0;", "Lr53/i;", "Lgf2/a;", "Lj70/d;", "Lo13/p;", "Lff2/a;", "Lo4/v0;", "data", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "<init>", "(Lr53/i;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;)V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a0<i<? extends a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j70.d<p<ff2.a, v0>>> f77087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f77088b;

    public c(i<j70.d<p<ff2.a, v0>>> iVar, s0 s0Var) {
        iVar.getClass();
        s0Var.getClass();
        this.f77087a = iVar;
        this.f77088b = s0Var;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetActiveCampaignDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends a> invoke() {
        return new u1(this.f77087a, this.f77088b.e(), new b(null));
    }
}
