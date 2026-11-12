package r02;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableState", f = "ZoomableState.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "onTransform-jyLRC_s$gcm_common_ui_vanillaRelease", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f148946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f148947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f148948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f148949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f148950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f148951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f148952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f148951f = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148950e = obj;
        this.f148952g |= Integer.MIN_VALUE;
        return this.f148951f.k(0L, 0L, 0.0f, this);
    }
}
