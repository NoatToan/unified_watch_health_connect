package c30;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UpdateCourseWaypointsUseCase", f = "UpdateCourseWaypointsUseCase.kt", l = {117}, m = "buildSegments", v = 2)
public final class e1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.d f23848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f23850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k30.k f23851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f23854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f23860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c1 f23861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23862o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var, t13.d<? super e1> dVar) {
        super(dVar);
        this.f23861n = c1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23860m = obj;
        this.f23862o |= Integer.MIN_VALUE;
        int i14 = c1.f23820e;
        return this.f23861n.b(null, false, false, false, null, null, this);
    }
}
