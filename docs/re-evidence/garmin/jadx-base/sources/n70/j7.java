package n70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.SetDashboardSectionVisibilityUseCaseImpl", f = "SetDashboardSectionVisibilityUseCaseImpl.kt", l = {39, 60}, m = "invoke", v = 2)
public final class j7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o70.f f124339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f124340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i7 f124342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f124343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(i7 i7Var, t13.d<? super j7> dVar) {
        super(dVar);
        this.f124342d = i7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124341c = obj;
        this.f124343e |= Integer.MIN_VALUE;
        return this.f124342d.a(null, false, this);
    }
}
