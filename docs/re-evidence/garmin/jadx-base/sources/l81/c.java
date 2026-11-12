package l81;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.data.repository.HillScoreRepoImpl", f = "HillScoreRepoImpl.kt", l = {18}, m = "getLatestHillScore", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f111491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f111492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f111493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f111493c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f111492b = obj;
        this.f111494d |= Integer.MIN_VALUE;
        return this.f111493c.w(null, this);
    }
}
