package vu1;

import com.garmin.android.apps.connectmobile.v2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTBaseDashboardAndScheduleViewModel", f = "FBTBaseDashboardAndScheduleViewModel.kt", l = {448, 455, 456, 471}, m = "getTrainingEventsDuringPlan", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tw1.m f180326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f180327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f180328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f180329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f180330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f180331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fg0.k f180332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f180333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f180334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f180335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f180336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f180337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f180338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f180339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f180340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f180341p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f180340o = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180339n = obj;
        this.f180341p |= Integer.MIN_VALUE;
        return c.Z4(this.f180340o, null, this);
    }
}
