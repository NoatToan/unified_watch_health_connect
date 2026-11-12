package ml0;

import android.content.Intent;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import i3.fe;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesKt$SearchGolfCourses$3$1", f = "SearchGolfCourses.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PermissionState f119227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q<String, Boolean> f119228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<l> f119229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f119230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f119231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fe f119232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f119233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f119234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c.q<Intent, f.a> f119235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f119236j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PermissionState permissionState, c.q<String, Boolean> qVar, x3<l> x3Var, p pVar, b0 b0Var, fe feVar, String str, String str2, c.q<Intent, f.a> qVar2, p1<Boolean> p1Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f119227a = permissionState;
        this.f119228b = qVar;
        this.f119229c = x3Var;
        this.f119230d = pVar;
        this.f119231e = b0Var;
        this.f119232f = feVar;
        this.f119233g = str;
        this.f119234h = str2;
        this.f119235i = qVar2;
        this.f119236j = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f119227a, this.f119228b, this.f119229c, this.f119230d, this.f119231e, this.f119232f, this.f119233g, this.f119234h, this.f119235i, this.f119236j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        PermissionState permissionState = this.f119227a;
        if (PermissionsUtilKt.isGranted(permissionState.getStatus())) {
            if (this.f119229c.getF182175a().f119246c.isEmpty()) {
                h.g(this.f119230d, this.f119231e, this.f119232f, this.f119233g, this.f119234h, this.f119235i);
            }
        } else if (PermissionsUtilKt.getShouldShowRationale(permissionState.getStatus())) {
            this.f119236j.setValue(Boolean.TRUE);
        } else {
            this.f119228b.a("android.permission.ACCESS_FINE_LOCATION", null);
        }
        return Unit.INSTANCE;
    }
}
