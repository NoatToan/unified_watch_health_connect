package lp;

import am.x0;
import fw.m;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.domain.GetDailySummaryActivityReportsUseCase", f = "GetDailySummaryActivityReportsUseCase.kt", l = {39, 41, 51}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f114072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o82.g f114073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f114074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DateTime f114075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f114076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f114077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f114078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f114079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f114080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f114081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f114082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f114083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f114082k = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f114081j = obj;
        this.f114083l |= Integer.MIN_VALUE;
        return this.f114082k.a(null, null, null, this);
    }
}
