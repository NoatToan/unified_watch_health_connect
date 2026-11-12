package nc2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.appattestation.GoogleIntegrityTokenProvider", f = "GoogleIntegrityTokenProvider.kt", l = {98, 107, 167, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 216}, m = "requestToken")
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f125360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f125361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f125362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f125363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f125364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f125365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f125364e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f125363d = obj;
        this.f125365f |= Integer.MIN_VALUE;
        return this.f125364e.e(null, false, 0, this);
    }
}
