package ry0;

import p005kotlin.Metadata;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.list.MultiDayActivitiesListViewModel", f = "MultiDayActivitiesListViewModel.kt", l = {98, 101, 108}, m = "loadInitialSummaries", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f155150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f155151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f155153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f155154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f155155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f155154e = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155153d = obj;
        this.f155155f |= Integer.MIN_VALUE;
        return this.f155154e.x4(this);
    }
}
