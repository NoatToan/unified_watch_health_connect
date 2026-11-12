package pz1;

import b63.o;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo", f = "TrainingReadinessRepo.kt", l = {47, 48}, m = "getOnceDayStatus", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f141940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f141941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f141942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f141943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f141943d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141942c = obj;
        this.f141944e |= Integer.MIN_VALUE;
        return this.f141943d.h(null, this);
    }
}
