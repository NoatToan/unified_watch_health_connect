package x11;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionConfirmationViewModel", f = "ImageRecognitionConfirmationViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "getMealWindows", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f188425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f188425b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188424a = obj;
        this.f188426c |= Integer.MIN_VALUE;
        return g.x4(this.f188425b, this);
    }
}
