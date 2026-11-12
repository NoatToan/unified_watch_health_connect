package lu0;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import c22.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llu0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f114953a;

    static {
        new C2184a(null);
    }

    public a(Context context) {
        context.getClass();
        int i14 = gt2.c.f79010a;
        this.f114953a = gt2.b.f79005a.h("LiveEventSharingSMSHandler");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x018c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x018c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01a0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void a(String str, List list) {
        Integer numValueOf;
        Integer numValueOf2;
        Object obj;
        wx2.a aVar;
        SmsManager smsManagerForSubscriptionId;
        str.getClass();
        ArrayList<String> arrayList = new ArrayList();
        ?? r14 = 0;
        Logger logger = this.f114953a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<l20.c> list2 = ((gu0.a) it.next()).f79035d;
                if (list2 != null) {
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str2 = ((l20.c) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        String string = str2 != null ? w.i0(str2).toString() : null;
                        if (string == null || string.length() == 0 || arrayList.contains(string)) {
                            logger.debug("In sendMessage() phone number is not available or duplicated");
                        } else {
                            arrayList.add(string);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty() || str.length() == 0) {
            logger.error("In sendMessage() There are no phone numbers on this list or the text message is empty. Total Recipients: " + arrayList.size() + ", text message: " + str);
            return;
        }
        for (String str3 : arrayList) {
            logger.debug("In sendMessage() sending message to phone number: " + str3 + " with text message: " + str);
            Context contextC = ((o) KoinJavaComponent.get$default(o.class, r14, r14, 6, r14)).c();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 31) {
                SmsManager smsManager = (SmsManager) a7.b.getSystemService(contextC, SmsManager.class);
                numValueOf = smsManager != null ? Integer.valueOf(smsManager.getSubscriptionId()) : r14;
            } else {
                numValueOf = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
            }
            wx2.b bVar = new wx2.b(contextC);
            if (numValueOf == 0 || numValueOf.intValue() == -1) {
                numValueOf2 = numValueOf;
                a2 a2Var = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LiveEventSharingSMSHandler", "subscriptionId is null or INVALID_SUBSCRIPTION_ID");
                numValueOf2 = Integer.valueOf(SmsManager.getDefaultSmsSubscriptionId());
            }
            numValueOf2 = numValueOf;
            Object systemService = contextC.getSystemService("phone");
            systemService.getClass();
            int simState = ((TelephonyManager) systemService).getSimState();
            if (numValueOf2.intValue() == -1 || simState == 1) {
                obj = null;
                a2 a2Var2 = a2.LIVETRACK;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "LiveEventSharingSMSHandler", "subscriptionId is INVALID_SUBSCRIPTION_ID send SMS using system default sms app");
            } else {
                if (i14 >= 31) {
                    SmsManager smsManager2 = (SmsManager) a7.b.getSystemService(contextC, SmsManager.class);
                    smsManagerForSubscriptionId = smsManager2 != null ? smsManager2.createForSubscriptionId(numValueOf2.intValue()) : null;
                } else {
                    smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(numValueOf2.intValue());
                }
                if (smsManagerForSubscriptionId != null) {
                    int size = smsManagerForSubscriptionId.divideMessage(str).size();
                    a2 a2Var3 = a2.LIVETRACK;
                    String strE = sn.a.e(size, "[sendSMSUsingNativePermission] Sending SMS with message size ", " to ", str3);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "LiveEventSharingSMSHandler", strE);
                    if (size > 1) {
                        try {
                            aVar = bVar.b(str3, str, new ArrayList(size));
                            obj = null;
                        } catch (SecurityException e4) {
                            a2 a2Var4 = a2.LIVETRACK;
                            i2.f36769a.getClass();
                            i2.a.g(a2Var4, "LiveEventSharingSMSHandler", e4);
                            obj = null;
                            aVar = new wx2.a(false, 1, null, 4, null);
                        }
                    } else {
                        obj = null;
                        aVar = bVar.c(str3, str, null);
                    }
                    if (aVar.f188010a) {
                        logger.info("Successfully sent text message  to - " + str3);
                    } else {
                        logger.error("Error in sending text message due to - " + aVar.f188011b);
                    }
                    r14 = obj;
                } else {
                    obj = null;
                    a2 a2Var5 = a2.LIVETRACK;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var5, "LiveEventSharingSMSHandler", "[sendSMSUsingNativePermission] Sending text message failed because SmsManager was null!");
                }
            }
            aVar = new wx2.a(false, 1, null, 4, null);
            if (aVar.f188010a) {
                logger.info("Successfully sent text message  to - " + str3);
            } else {
                logger.error("Error in sending text message due to - " + aVar.f188011b);
            }
            r14 = obj;
        }
    }

    /* JADX INFO: renamed from: lu0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llu0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2184a {
        public /* synthetic */ C2184a(j jVar) {
            this();
        }

        private C2184a() {
        }
    }
}
