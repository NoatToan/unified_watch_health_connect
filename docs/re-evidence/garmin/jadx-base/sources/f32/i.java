package f32;

import androidx.lifecycle.y0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.SummaryCoroutineScopeDataFetcher", f = "SummaryCoroutineScopeDataFetcher.kt", l = {71}, m = "fetchSummaryData", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f68679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DateTime f68680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f68681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f68682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j<Object> f68683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f68684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j<Object> jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f68683e = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68682d = obj;
        this.f68684f |= Integer.MIN_VALUE;
        return j.c(this.f68683e, null, null, null, this);
    }
}
