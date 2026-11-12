package kl0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsViewModel", f = "GolfCourseDetailsViewModel.kt", l = {131, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "getCurrentLocation", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f105251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f105252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f105253c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f105252b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f105251a = obj;
        this.f105253c |= Integer.MIN_VALUE;
        return d.x4(this.f105252b, this);
    }
}
