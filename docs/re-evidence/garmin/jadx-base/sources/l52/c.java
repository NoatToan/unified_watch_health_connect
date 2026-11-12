package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.AudioDownloadRepository", f = "AudioDownloadRepository.kt", l = {21}, m = "downloadAudioFile", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f110226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f110226b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110225a = obj;
        this.f110227c |= Integer.MIN_VALUE;
        return this.f110226b.a(null, null, this);
    }
}
