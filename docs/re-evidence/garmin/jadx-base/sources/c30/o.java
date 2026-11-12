package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddPointOfInterestToCourseRouteUseCase", f = "AddPointOfInterestToCourseRouteUseCase.kt", l = {60, 63, 90, 124}, m = "addPointOfInterestToCourseRoute", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f23969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f23970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f23971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23972j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f23971i = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23970h = obj;
        this.f23972j |= Integer.MIN_VALUE;
        return n.a(this.f23971i, null, null, null, null, this);
    }
}
