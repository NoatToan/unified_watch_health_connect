package my2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {201, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "getFitDeviceMessage")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f121576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f121577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f121578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f121579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f121579e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121578d = obj;
        this.f121580f |= Integer.MIN_VALUE;
        return this.f121579e.e(0L, null, null, null, this);
    }
}
