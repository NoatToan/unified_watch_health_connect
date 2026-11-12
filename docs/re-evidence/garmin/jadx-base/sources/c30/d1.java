package c30;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UpdateCourseWaypointsUseCase", f = "UpdateCourseWaypointsUseCase.kt", l = {61, 64, 73}, m = "buildRouteFromWaypoints", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f23837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f23841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f23842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23843i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c1 c1Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f23842h = c1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23841g = obj;
        this.f23843i |= Integer.MIN_VALUE;
        int i14 = c1.f23820e;
        return this.f23842h.a(null, null, null, null, false, this);
    }
}
