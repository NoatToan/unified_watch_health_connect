package go2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.media.RingtoneManager;
import android.os.Handler;
import android.os.Looper;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.GarminPayInitializer;
import java.util.Map;
import kg.f;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sz0.e;
import to2.c;
import wr2.p;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgo2/b;", "", "Lto2/c;", "userEventsType", "", "", "data", "<init>", "(Lto2/c;Ljava/util/Map;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f78330c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78332b;

    /* JADX INFO: renamed from: go2.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1579b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78333a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.CREDITCARD_ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CREDITCARD_DEACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.CREDITCARD_REACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.TOKEN_DEACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.TOKEN_REACTIVATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.CREDITCARD_DELETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.CREDITCARD_PROVISION_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.CREDENTIAL_EXPIRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.CREDENTIAL_UPDATE_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.DEVICE_DELETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c.REFUND_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f78333a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f78330c = gt2.b.f79005a.h("PAY#NEW_FITPAY#NotificationMessageHandler");
    }

    public b(c cVar, Map<String, String> map) {
        String strD;
        String string;
        cVar.getClass();
        map.getClass();
        int[] iArr = C1579b.f78333a;
        switch (iArr[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                strD = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.feature_name_garminpay);
                break;
            case 10:
                strD = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.pn_garmin_pay_wallet_title);
                break;
            case 11:
                strD = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_unable_to_process_refund);
                break;
            default:
                p6.b.p(cVar, "Please check on UX document for title of ");
                throw null;
        }
        this.f78331a = strD;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        String str = map.get(to2.a.EnumC3119a.ISSUING_BANK.f165868a);
        String str2 = map.get(to2.a.EnumC3119a.CREDIT_CARD_NUMBER.f165868a);
        String str3 = map.get(to2.a.EnumC3119a.SHORT_DESCRIPTION.f165868a);
        int i14 = iArr[cVar.ordinal()];
        Logger logger = f78330c;
        String string2 = "";
        switch (i14) {
            case 1:
                p.f186870a.getClass();
                p.f("dynamic_feature_app", GarminPayInitializer.HAS_FITPAY_ACCOUNT, BooleanUtils.TRUE);
                string2 = contextC.getString(R.string.pn_garmin_pay_card_activated, str3, str2);
                break;
            case 2:
                string2 = contextC.getString(R.string.pn_garmin_pay_card_deactivated, str3, str2);
                break;
            case 3:
            case 5:
                string2 = contextC.getString(R.string.pn_garmin_pay_card_reactivated, str3, str2);
                break;
            case 4:
                string2 = contextC.getString(R.string.pn_garmin_pay_token_deactivated, str3, str2, str);
                break;
            case 6:
                string2 = contextC.getString(R.string.pn_garmin_pay_card_deleted_issuer, str3, str2, str);
                break;
            case 7:
                string2 = contextC.getString(R.string.pn_garmin_pay_card_provisioning_failed);
                break;
            case 8:
                String str4 = map.get(to2.a.EnumC3119a.DAYS_UNTIL_EXPIRATION.f165868a);
                string2 = contextC.getString(R.string.pn_garmin_pay_credential_expiring, str3, str2, str4 != null ? str4 : "");
                break;
            case 9:
                string2 = contextC.getString(R.string.pn_garmin_pay_credential_update_failed, str3, str2);
                break;
            case 10:
                String str5 = map.get(to2.a.EnumC3119a.GARMIN_DEVICE_NAME.f165868a);
                if (str5 == null || (string = contextC.getString(R.string.pn_garmin_pay_wallet_deleted, str5)) == null) {
                    logger.error("handlePushNotification: device name is missing, can not handle " + cVar);
                } else {
                    string2 = string;
                }
                break;
            case 11:
                uo2.a.f172125n.getClass();
                string2 = contextC.getString(R.string.wallet_message_unable_to_process_refund, uo2.a.C3210a.a(map).getProductName());
                break;
            default:
                logger.warn("buildNotificationMessage: not handling type " + cVar);
                break;
        }
        string2.getClass();
        this.f78332b = string2;
    }

    public final void a(e23.a<PendingIntent> aVar) {
        Object systemService = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        boolean zAreNotificationsEnabled = notificationManager.areNotificationsEnabled();
        String str = this.f78332b;
        if (!zAreNotificationsEnabled) {
            com.airbnb.lottie.animation.keyframe.a.z("displayWalletNotification: notifications not enabled, impossible to display msg:\n", str, "\n", f78330c);
            return;
        }
        sz0.f.a aVar2 = sz0.f.f161394a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        e eVar = e.f161375n;
        aVar2.getClass();
        sz0.f.a.c(contextC, eVar);
        PendingIntent pendingIntentInvoke = aVar.invoke();
        q qVar = new q(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(this.f78331a);
        o oVar = new o();
        oVar.f202664e = q.e(str);
        qVar.l(oVar);
        qVar.f202684f = q.e(str);
        qVar.f202686h = pendingIntentInvoke;
        qVar.i(16, true);
        qVar.B = "status";
        qVar.f202691m = 2;
        qVar.k(RingtoneManager.getDefaultUri(2));
        qVar.f202691m = 4;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        new Handler(Looper.getMainLooper()).post(new go2.a(notificationManager, notificationC, 0));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
