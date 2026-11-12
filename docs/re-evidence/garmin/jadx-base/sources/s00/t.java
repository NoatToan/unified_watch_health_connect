package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/t;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends j {

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f155419a = w13.b.g(n00.c.values());
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155420a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.EXCLUSIVE_DISCOUNTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.EXCLUSIVE_OFFERS_FIRST_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155420a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        int i14 = c.f155420a[cVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            j.e(garminConnectMobileApp, sz0.e.M0, d(cVar), garminConnectMobileApp.getString(R.string.exclusive_offers), garminConnectMobileApp.getString(R.string.pn_new_exclusive_offers_format), j.c(garminConnectMobileApp, ((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).d(garminConnectMobileApp)));
            return;
        }
        String string = bundle.getString("promotion-id");
        String string2 = bundle.getString("offer");
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "ExclusiveOffersPushNotificationHandler", "Missing required data in exclusive offer notification");
        } else {
            ub1.g gVar = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null);
            sz0.e eVar = sz0.e.M0;
            int f134973e = (b.f155419a.getF134973e() - cVar.ordinal()) + d(cVar);
            int iAbs = Math.abs(string.hashCode());
            j.e(garminConnectMobileApp, eVar, iAbs < f134973e ? f134973e : iAbs, garminConnectMobileApp.getString(R.string.pn_exclusive_discounts_title), string2, j.c(garminConnectMobileApp, gVar.f(garminConnectMobileApp, string)));
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.EXCLUSIVE_DISCOUNTS, n00.c.EXCLUSIVE_OFFERS_FIRST_TIME};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ls00/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PROMOTION_ID", "OFFER", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
