package l70;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.UserFocusRepositoryImpl", f = "UserFocusRepositoryImpl.kt", l = {27, 31}, m = "setUserFocus", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j70.y f110785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f110786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f110788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f110788d = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110787c = obj;
        this.f110789e |= Integer.MIN_VALUE;
        return this.f110788d.J0(null, this);
    }
}
