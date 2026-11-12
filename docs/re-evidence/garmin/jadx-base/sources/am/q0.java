package am;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo", f = "ActivityRepo.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR}, m = "processAndUploadImage", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f4164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(m mVar, t13.d<? super q0> dVar) {
        super(dVar);
        this.f4164c = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4163b = obj;
        this.f4165d |= Integer.MIN_VALUE;
        return m.a(this.f4164c, 0L, null, this);
    }
}
