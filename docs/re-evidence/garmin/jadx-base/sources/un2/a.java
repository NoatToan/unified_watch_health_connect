package un2;

import android.app.Activity;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lun2/a;", "", "Landroid/app/Activity;", "activity", "Lun2/c;", "googlePayConfig", "<init>", "(Landroid/app/Activity;Lun2/c;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f172058d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f172059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f172060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentsClient f172061c;

    static {
        new C3208a(null);
        int i14 = gt2.c.f79010a;
        f172058d = gt2.b.f79005a.h("PAY#FN#GooglePayDelegate");
    }

    public a(Activity activity, c cVar) {
        activity.getClass();
        cVar.getClass();
        this.f172059a = activity;
        b bVar = new b(cVar);
        this.f172060b = bVar;
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(activity, new Wallet.WalletOptions.Builder().setEnvironment(bVar.f172062a.c()).build());
        paymentsClient.getClass();
        this.f172061c = paymentsClient;
    }

    /* JADX INFO: renamed from: un2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lun2/a$a;", "", "<init>", "()V", "", "LOAD_PAYMENT_DATA_REQUEST_CODE", "I", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3208a {
        public /* synthetic */ C3208a(j jVar) {
            this();
        }

        private C3208a() {
        }
    }
}
