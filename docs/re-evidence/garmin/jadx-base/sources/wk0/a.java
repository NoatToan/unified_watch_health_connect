package wk0;

import com.garmin.android.apps.connectmobile.d1;
import com.garmin.android.gncs.IGNCSAppCallback;
import d53.w;
import f12.l;
import gt2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwk0/a;", "Lcom/garmin/android/gncs/IGNCSAppCallback;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements IGNCSAppCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f185803a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f185804b;

    static {
        int i14 = c.f79010a;
        f185804b = gt2.b.f79005a.h("GNCS#LibraryCallback");
    }

    private a() {
    }

    @Override // com.garmin.android.gncs.IGNCSAppCallback
    public final boolean allowLibraryAskForNotificationAccess() {
        String str = d1.f33127i;
        if (str == null) {
            str = "";
        }
        boolean z14 = false;
        boolean z15 = w.z(str, "DeviceSetupActivity", false);
        l.f68084a.getClass();
        boolean zD4 = l.a.a().d4();
        if (!z15 && !zD4) {
            z14 = true;
        }
        g.y("allowLibraryAskForNotificationAccess: returning ", z14, f185804b);
        return z14;
    }

    @Override // com.garmin.android.gncs.IGNCSAppCallback
    public final void userBlocksNotificationAccessRequests() {
        f185804b.debug("userBlocksNotificationAccessRequests: updating shared preferences");
        l.f68084a.getClass();
        l.a.a().Q4(true);
    }
}
