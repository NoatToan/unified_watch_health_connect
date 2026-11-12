package ff0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgRepositoryImpl", f = "EcgRepositoryImpl.kt", l = {52, 56, 70, 80, 94}, m = "getActivitySummary", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f71095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f71096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f71097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f71098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f71098d = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71097c = obj;
        this.f71099e |= Integer.MIN_VALUE;
        return this.f71098d.b(null, this);
    }
}
