package j4;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import q53.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 215}, m = "boundsUpdatesEventLoop$ui", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f96987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f96989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f96989c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96988b = obj;
        this.f96990d |= Integer.MIN_VALUE;
        return this.f96989c.a(this);
    }
}
