package oe2;

import com.mapbox.geojson.Point;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f131520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f131521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f131522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f131523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f131524e;

    public /* synthetic */ k(boolean z14, o53.b0 b0Var, e eVar, double d14, p1 p1Var) {
        this.f131520a = z14;
        this.f131521b = b0Var;
        this.f131522c = eVar;
        this.f131523d = d14;
        this.f131524e = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Point point = (Point) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        point.getClass();
        if (!zBooleanValue || this.f131520a) {
            ge1.b.T(this.f131521b, null, null, new m(this.f131522c, point, this.f131523d, this.f131524e, null), 3);
        }
        return Unit.INSTANCE;
    }
}
