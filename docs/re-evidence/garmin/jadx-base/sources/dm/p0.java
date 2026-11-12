package dm;

import p005kotlin.Metadata;
import ps.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldm/p0;", "Liu1/k;", "Lps/y0;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 implements iu1.k<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f60403a;

    public p0(n0 n0Var) {
        this.f60403a = n0Var;
    }

    @Override // iu1.k
    public final void onSuccess(y0 y0Var) {
        this.f60403a.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, y0Var);
    }
}
