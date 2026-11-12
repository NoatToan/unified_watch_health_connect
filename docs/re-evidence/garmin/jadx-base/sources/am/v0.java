package am;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo", f = "ActivityRepo.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "uploadImage", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(m mVar, t13.d<? super v0> dVar) {
        super(dVar);
        this.f4243b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4242a = obj;
        this.f4244c |= Integer.MIN_VALUE;
        m.a aVar = m.f4066e;
        return this.f4243b.g(0L, null, null, this);
    }
}
