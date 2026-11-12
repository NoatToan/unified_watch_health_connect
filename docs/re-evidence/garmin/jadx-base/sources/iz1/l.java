package iz1;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel", f = "TrainingPriorityViewModel.kt", l = {TsExtractor.TS_PACKET_SIZE, 191}, m = "quitActiveOrPausedTrainingPlan", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f95895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f95899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f95900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f95900f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95899e = obj;
        this.f95901g |= Integer.MIN_VALUE;
        return i.X4(this.f95900f, this);
    }
}
