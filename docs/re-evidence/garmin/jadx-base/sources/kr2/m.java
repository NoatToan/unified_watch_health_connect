package kr2;

import android.widget.Toast;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkr2/m;", "Lq03/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements q03.d {
    @Override // q03.d
    public final void a(s03.b bVar) {
        bVar.getClass();
    }

    @Override // q03.d
    public final void onComplete() {
        Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), "Test FitPay push notif complete.", 0).show();
    }

    @Override // q03.d
    public final void onError(Throwable th3) {
        th3.getClass();
        Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), th3.getMessage(), 0).show();
    }
}
