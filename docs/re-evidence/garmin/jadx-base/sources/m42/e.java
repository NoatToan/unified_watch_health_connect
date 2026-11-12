package m42;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.repository.WeightsRepository", f = "WeightsRepository.kt", l = {59, 64}, m = "deleteSelectedWeightAsync", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f116616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f116617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f116618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f116619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f116620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f116620e = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116619d = obj;
        this.f116621f |= Integer.MIN_VALUE;
        return this.f116620e.b(null, 0L, 0L, this);
    }
}
