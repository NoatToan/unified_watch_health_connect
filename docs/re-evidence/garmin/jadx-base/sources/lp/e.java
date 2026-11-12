package lp;

import am.x0;
import fw.m;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.reports.domain.GetMonthlySummaryActivityReportsUseCase", f = "GetMonthlySummaryActivityReportsUseCase.kt", l = {32, 43}, m = "invoke", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f114087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateTime f114089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f114090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f114091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f114092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f114093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f114094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f114094h = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f114093g = obj;
        this.f114095i |= Integer.MIN_VALUE;
        return this.f114094h.a(null, null, this);
    }
}
