package of2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager", f = "LSVSessionManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "awaitSessionEvent", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f131818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f131820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0 c0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f131819b = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131818a = obj;
        this.f131820c |= Integer.MIN_VALUE;
        int i14 = c0.f131771p;
        return this.f131819b.e(null, null, this);
    }
}
