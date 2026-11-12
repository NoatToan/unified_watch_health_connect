package xh0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestListFragment;
import java.lang.annotation.Annotation;
import m63.f1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p008y1.m0;
import p008y1.y0;
import p3.p0;
import sz0.a0;
import tn.k;
import xz0.p;
import y22.w;
import y22.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190981a;

    @Override // e23.a
    public final Object invoke() {
        switch (this.f190981a) {
            case 0:
                return p0.n(Boolean.TRUE);
            case 1:
                Bundle bundleD = k.d("Screen", "STEPS_REPORTS", "Action", "STEPS_REPORTS_MONTHLY_LIST_ITEM_CLICKED");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                return Unit.INSTANCE;
            case 2:
                return p0.n(Boolean.FALSE);
            case 3:
                return p0.n(null);
            case 4:
                xx2.d dVar = xx2.d.f192590a;
                xx2.b.f192586a.getClass();
                by2.d dVar2 = xx2.b.f192587b;
                if (dVar2 == null) {
                    vb.h.z("SubscriptionManager is not initialized");
                    return null;
                }
                String str = dVar2.f22257d;
                str.getClass();
                return "mpf://" + str + "/return/success.html";
            case 5:
                xx2.d dVar3 = xx2.d.f192590a;
                xx2.b.f192586a.getClass();
                by2.d dVar4 = xx2.b.f192587b;
                if (dVar4 == null) {
                    vb.h.z("SubscriptionManager is not initialized");
                    return null;
                }
                String str2 = dVar4.f22257d;
                str2.getClass();
                return "mpf://" + str2 + "/return/failure.html";
            case 6:
                xx2.d dVar5 = xx2.d.f192590a;
                xx2.b.f192586a.getClass();
                by2.d dVar6 = xx2.b.f192587b;
                if (dVar6 == null) {
                    vb.h.z("SubscriptionManager is not initialized");
                    return null;
                }
                String str3 = dVar6.f22257d;
                str3.getClass();
                return "mpf://" + str3 + "/exit/flow.html";
            case 7:
                int i14 = InboxRequestListFragment.A;
                return (tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null);
            case 8:
                int i15 = p.f192812n;
                a0.f161325d.getClass();
                return a0.a.a();
            case 9:
                int i16 = p.f192812n;
                re0.h.a aVar = re0.h.f152133t0;
                hl.a.c cVar = hl.a.c.f84256b;
                aVar.getClass();
                return re0.h.a.a(cVar);
            case 10:
                y01.b bVar = y01.b.f192985a;
                return Unit.INSTANCE;
            case 11:
                y01.b bVar2 = y01.b.f192985a;
                return Unit.INSTANCE;
            case 12:
                y01.b bVar3 = y01.b.f192985a;
                return Unit.INSTANCE;
            case 13:
                y01.b bVar4 = y01.b.f192985a;
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                float f14 = m0.f193416a;
                return Boolean.TRUE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return p0.n(Boolean.FALSE);
            case 18:
                return p0.n(Boolean.FALSE);
            case 19:
                return new f1("com.garmin.android.apps.connectmobile.view.photos.ManagePhotosRoute.ManagePhotos", y22.k.INSTANCE, new Annotation[0]);
            case 20:
                return p0.n(null);
            case 21:
                return p0.n(Boolean.FALSE);
            case 22:
                return p0.n(Boolean.FALSE);
            case 23:
                w.Companion companion = w.INSTANCE;
                return new u02.a();
            case 24:
                x.Companion bVar5 = x.INSTANCE;
                return new u02.a();
            case 25:
                return p0.n(null);
            case 26:
                return Unit.INSTANCE;
            case 27:
                return p0.n(Boolean.FALSE);
            case 28:
                int i17 = y80.f.f195116c;
                return new dk2.g(new y0(19), new d(29));
            default:
                int i18 = y80.f.f195116c;
                gm2.b.f78015a.getClass();
                return gm2.b.a();
        }
    }

    public /* synthetic */ d(int i14) {
        this.f190981a = i14;
    }
}
