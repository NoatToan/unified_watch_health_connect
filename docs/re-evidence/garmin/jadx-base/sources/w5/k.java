package w5;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "runCached", v = 1)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j.b f182133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f182134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f182135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f182136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f182135c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f182134b = obj;
        this.f182136d |= Integer.MIN_VALUE;
        return this.f182135c.b(null, null, null, this);
    }
}
