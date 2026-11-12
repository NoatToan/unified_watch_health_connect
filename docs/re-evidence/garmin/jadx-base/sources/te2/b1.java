package te2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials", f = "GetOAuth1GCCredentials.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 212}, m = "attemptWithThisAppIT2")
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f163975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(u0 u0Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f163975b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163974a = obj;
        this.f163976c |= Integer.MIN_VALUE;
        int i14 = u0.f164318q;
        return this.f163975b.f(this);
    }
}
