package c30;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ImportCourseUseCase", f = "ImportCourseUseCase.kt", l = {62, 74}, m = "buildRouteFromPoints", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f23928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f23932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23933h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f23932g = m0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23931f = obj;
        this.f23933h |= Integer.MIN_VALUE;
        int i14 = m0.f23953c;
        return this.f23932g.a(null, null, this);
    }
}
