package c30;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.UpdateCourseWaypointPositionUseCase", f = "UpdateCourseWaypointPositionUseCase.kt", l = {83, 111, TsExtractor.TS_STREAM_TYPE_DTS, 147}, m = "buildRouteFromWaypointPosition", v = 2)
public final class z0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f24062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.d f24063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f24064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f24065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f24066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f24067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f24070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f24071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24072k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, t13.d<? super z0> dVar) {
        super(dVar);
        this.f24071j = b1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24070i = obj;
        this.f24072k |= Integer.MIN_VALUE;
        int i14 = b1.f23804e;
        return this.f24071j.a(null, null, null, null, 0, false, this);
    }
}
