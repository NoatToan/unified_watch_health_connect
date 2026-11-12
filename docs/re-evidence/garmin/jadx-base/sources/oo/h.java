package oo;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel", f = "ActivitiesEditViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "submitActivityLinkDTO", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f133092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f133093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f133093b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133092a = obj;
        this.f133094c |= Integer.MIN_VALUE;
        return b.y4(this.f133093b, 0L, null, this);
    }
}
