package x11;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionResultsViewModel", f = "ImageRecognitionResultsViewModel.kt", l = {170}, m = "loadInitialData", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f188447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f188448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f188448b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188447a = obj;
        this.f188449c |= Integer.MIN_VALUE;
        return l.x4(this.f188448b, this);
    }
}
