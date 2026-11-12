package l52;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "getMSNWorkoutExerciseAsync", v = 2)
public final class u0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(z zVar, t13.d<? super u0> dVar) {
        super(dVar);
        this.f110364b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110363a = obj;
        this.f110365c |= Integer.MIN_VALUE;
        return this.f110364b.a0(null, null, null, this);
    }
}
