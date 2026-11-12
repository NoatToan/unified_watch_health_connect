package a61;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthStatsRepo", f = "StrengthStatsRepo.kt", l = {36}, m = "getDailyStats", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f1674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f1675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f1677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f1677d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f1676c = obj;
        this.f1678e |= Integer.MIN_VALUE;
        return this.f1677d.g(null, null, this);
    }
}
