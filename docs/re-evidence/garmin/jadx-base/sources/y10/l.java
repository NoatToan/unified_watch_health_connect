package y10;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel", f = "ConnectIQDownloadViewModel.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 215}, m = "appIcons", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.d f193935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f193937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f193937c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f193936b = obj;
        this.f193938d |= Integer.MIN_VALUE;
        int i14 = k.f193901y;
        return this.f193937c.B4(null, null, this);
    }
}
