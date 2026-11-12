package xx2;

import android.app.Activity;
import android.content.Intent;
import android.webkit.CookieManager;
import com.garmin.android.lib.networking.exceptions.WebViewNotAvailableException;
import com.garmin.subscriptions.ui.InAppPurchaseActivity;
import com.garmin.subscriptions.ui.InAppPurchaseTwaActivity;
import cy2.f;
import cy2.g;
import cy2.i;
import cy2.j;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxx2/d;", "", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f192590a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f192591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f192592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f192593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f192594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f192595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f192596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f192597h;

    static {
        Logger logger = LoggerFactory.getLogger("SUB#PurchaseHelper");
        logger.getClass();
        f192591b = logger;
        f192592c = new AtomicBoolean(false);
        f192593d = new String[]{"purchaseReturn"};
        f192594e = new AtomicBoolean(false);
        f192595f = m.b(new xh0.d(4));
        f192596g = m.b(new xh0.d(5));
        f192597h = m.b(new xh0.d(6));
    }

    private d() {
    }

    public static final Intent a(Activity activity, i iVar, j jVar, g gVar, cy2.c cVar) throws WebViewNotAvailableException {
        activity.getClass();
        b.f192586a.getClass();
        by2.d dVar = b.f192587b;
        if (dVar == null) {
            h.z("SubscriptionManager is not initialized");
            return null;
        }
        yx2.a aVar = dVar.f22254a;
        if (aVar == null) {
            h.z("SubscriptionManager.singleUserCustomer is not initialized");
            return null;
        }
        ve2.e eVar = aVar.f200044b;
        if ((jVar instanceof j.h) || (jVar instanceof j.g) || (jVar instanceof j.C1217j) || (jVar instanceof j.i)) {
            h.s("The provided activationFlow is not valid for a new subscription purchase flow");
            return null;
        }
        try {
            CookieManager.getInstance();
            if (!f192592c.compareAndSet(false, true)) {
                f192591b.warn("A purchase is already in progress! Doing nothing.");
                h.z("A purchase is already in progress");
                return null;
            }
            by2.d dVar2 = b.f192587b;
            if (dVar2 != null) {
                dVar2.f22256c.debug(":: clearPurchasableSubscriptions ");
                yx2.a aVar2 = dVar2.f22254a;
                if (aVar2 != null) {
                    dy2.b bVarF = dVar2.f();
                    String str = aVar2.f200043a;
                    synchronized (bVarF) {
                        bVarF.c(bVarF.e(), str);
                    }
                }
            }
            if (s.g(gVar.f56837d, Boolean.FALSE) || r.d.a(activity, j0.f134944a) == null) {
                f192591b.debug("Custom Tabs is not available, launching purchase flow using WebView activity");
                InAppPurchaseActivity.f52722l.getClass();
                return InAppPurchaseActivity.a.a(activity, eVar, iVar, jVar, gVar, cVar);
            }
            f192591b.debug("Custom Tabs is available, launching purchase flow using Trusted Web Activity");
            InAppPurchaseTwaActivity.a aVar3 = InAppPurchaseTwaActivity.f52748r;
            Integer num = gVar.f56835b;
            cy2.e eVar2 = gVar.f56834a;
            f fVar = gVar.f56836c;
            cy2.b bVar = fVar != null ? fVar.f56833e : null;
            aVar3.getClass();
            return InAppPurchaseTwaActivity.a.a(activity, eVar, iVar, jVar, cVar, num, eVar2, bVar);
        } catch (Exception unused) {
            f192591b.warn("Android WebView is disabled, not installed or being updated");
            throw new WebViewNotAvailableException("Android WebView is disabled, not installed or being updated");
        }
    }
}
