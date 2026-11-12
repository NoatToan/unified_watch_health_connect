package ky0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f107572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesDetailActivity f107573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f107574e;

    public /* synthetic */ v(p3.p1 p1Var, lc.m0 m0Var, MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity, o13.l lVar, int i14) {
        this.f107570a = i14;
        this.f107571b = p1Var;
        this.f107572c = m0Var;
        this.f107573d = multiDayActivitiesDetailActivity;
        this.f107574e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f107570a;
        ?? r14 = this.f107574e;
        MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity = this.f107573d;
        lc.m0 m0Var = this.f107572c;
        p3.p1 p1Var = this.f107571b;
        switch (i14) {
            case 0:
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                sy0.f fVar = (sy0.f) p1Var.getF182175a();
                if (fVar != null) {
                    ge1.b.T(o53.f0.w(multiDayActivitiesDetailActivity), null, null, new MultiDayActivitiesDetailActivity.d(fVar, r14, null), 3);
                }
                m0Var.n();
                break;
            default:
                MultiDayActivitiesDetailActivity.a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                sy0.f fVar2 = (sy0.f) p1Var.getF182175a();
                if (fVar2 != null) {
                    ge1.b.T(o53.f0.w(multiDayActivitiesDetailActivity), null, null, new MultiDayActivitiesDetailActivity.e(fVar2, r14, null), 3);
                }
                m0Var.n();
                break;
        }
        return Unit.INSTANCE;
    }
}
