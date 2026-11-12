package f32;

import androidx.lifecycle.y0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.DetailsCoroutineScopeDataFetcher", f = "DetailsCoroutineScopeDataFetcher.kt", l = {67}, m = "fetchDetailsData", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f68659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0 f68660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f68661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a<Object> f68662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a<Object> aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f68662d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68661c = obj;
        this.f68663e |= Integer.MIN_VALUE;
        return a.c(this.f68662d, null, null, this);
    }
}
