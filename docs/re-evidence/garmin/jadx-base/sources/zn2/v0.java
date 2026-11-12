package zn2;

import android.content.Context;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.gpay.challenge.ChallengeActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingDeque;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzn2/v0;", "Lls2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements ls2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f205887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f205888i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f205892d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f205889a = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingDeque f205890b = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f205891c = o53.c0.h(o53.c0.a(o53.s0.f129406a), ge1.b.h());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f205893e = z53.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final to2.c[] f205894f = {to2.c.REFUND_FAILED};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f205895g = p13.b1.c("pushnotification_nfc_payment_fitpay", "pushnotification_ciq_purchase_confirmation_challenge", "pushnotification_ciq_purchase_confirmed");

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f205887h = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayPushNotificationHandler");
        f205888i = "notification-type";
    }

    @Override // ls2.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o53.c0.c(this.f205891c, null);
    }

    @Override // ls2.a
    /* JADX INFO: renamed from: m4, reason: from getter */
    public final HashSet getF205895g() {
        return this.f205895g;
    }

    @Override // ls2.a
    public final void w0(HashMap map) {
        String str = (String) map.get("notification-key");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1024703010) {
                if (str.equals("pushnotification_nfc_payment_fitpay")) {
                    ge1.b.T(this.f205891c, null, null, new w0(map, this, null), 3);
                    return;
                }
                return;
            }
            if (iHashCode != 1539285519) {
                if (iHashCode != 1569326121 || !str.equals("pushnotification_ciq_purchase_confirmation_challenge")) {
                    return;
                }
            } else if (!str.equals("pushnotification_ciq_purchase_confirmed")) {
                return;
            }
            Logger logger = f205887h;
            try {
                String str2 = (String) map.get("notification-key");
                if (p005kotlin.jvm.internal.s.g(str2, "pushnotification_ciq_purchase_confirmation_challenge")) {
                    new xq2.a(map).a(new z10.d(14, this, map));
                    return;
                }
                if (p005kotlin.jvm.internal.s.g(str2, "pushnotification_ciq_purchase_confirmed")) {
                    if (((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).n()) {
                        eo2.d.f64794a.getClass();
                        if (eo2.d.f64796c.get().booleanValue()) {
                            Intent intentA = ChallengeActivity.a.a(ChallengeActivity.f51119n, this.f205889a, ChallengeActivity.a.EnumC1054a.CONFIRMED, null, null, (String) map.get("redirect-url"), 12);
                            intentA.setFlags(268435456);
                            this.f205889a.startActivity(intentA);
                            return;
                        }
                    }
                    logger.warn("handlePurchaseCiqPushNotification: pushNotification receive but app is not in the foreground. Do nothing.");
                }
            } catch (Exception e4) {
                logger.error("handlePurchaseCiqPushNotification: can not handle pushNotification", (Throwable) e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzn2/v0$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "NOTIFICATION_TYPE", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
