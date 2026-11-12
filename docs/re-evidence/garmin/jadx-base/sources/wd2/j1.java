package wd2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackServiceController", f = "LivetrackServiceController.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "sendSettingsToDevice", v = 2)
public final class j1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f184513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g1 g1Var, t13.d<? super j1> dVar) {
        super(dVar);
        this.f184513b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184512a = obj;
        this.f184514c |= Integer.MIN_VALUE;
        return this.f184513b.e(0L, this);
    }
}
