package ui1;

import com.garmin.proto.generated.GDILTEProto;
import java.util.Iterator;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 {
    public static final z0 a(x0 x0Var) {
        z0 next;
        x0Var.getClass();
        Iterator<z0> it = x0Var.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.d()) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public static final boolean b(x0 x0Var) {
        x0Var.getClass();
        if (x0Var.isEmpty()) {
            return false;
        }
        Iterator<z0> it = x0Var.iterator();
        while (it.hasNext()) {
            if (it.next().d()) {
                return true;
            }
        }
        return false;
    }

    public static final GDILTEProto.LTESubscriptionInfo c(z0 z0Var, long j8) {
        z0Var.getClass();
        GDILTEProto.LTESubscriptionInfo.Builder isSubscribed = GDILTEProto.LTESubscriptionInfo.newBuilder().setDeviceId((int) j8).setIsSubscribed(z0Var.d());
        DateTime dateTimeB = z0Var.b();
        if (dateTimeB != null) {
            isSubscribed.setAccountExpirationUnixTimestamp(dateTimeB.getMillis());
        }
        GDILTEProto.LTESubscriptionInfo lTESubscriptionInfoBuild = isSubscribed.build();
        lTESubscriptionInfoBuild.getClass();
        return lTESubscriptionInfoBuild;
    }
}
