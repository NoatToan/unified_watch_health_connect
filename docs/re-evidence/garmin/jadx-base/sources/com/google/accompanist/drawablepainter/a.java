package com.google.accompanist.drawablepainter;

import androidx.lifecycle.y0;
import c22.m3;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.d;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.maps.android.compose.streetview.StreetViewKt;
import cp2.f;
import cp2.i;
import cq0.j;
import cq0.z;
import cw.k;
import f12.l;
import gt2.b;
import gt2.c;
import java.util.Map;
import ju0.e;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52837a;

    public /* synthetic */ a(int i14) {
        this.f52837a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Map map = null;
        Object[] objArr = 0;
        switch (this.f52837a) {
            case 0:
                return DrawablePainter2Kt.MAIN_HANDLER_delegate$lambda$0();
            case 1:
                return DrawablePainterKt.MAIN_HANDLER_delegate$lambda$0();
            case 2:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            case 3:
                return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
            case 4:
                return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
            case 5:
                return StreetViewKt.StreetView$lambda$1$lambda$0();
            case 6:
                FitPayAddressManagementFragment.b bVar = FitPayAddressManagementFragment.f51413t;
                int i14 = c.f79010a;
                return b.f79005a.h("PAY#NEW_FITPAY#FitPayAddressManagementFragment");
            case 7:
                f.a aVar = f.f54931p;
                int i15 = c.f79010a;
                return b.f79005a.h("PAY#ECOM#FitPayPaymentCardInfoFragment");
            case 8:
                i.a aVar2 = i.f54962j;
                int i16 = c.f79010a;
                return b.f79005a.h("PAY#ECOM#VerifyCardSecurityCodeFragment");
            case 9:
                return Unit.INSTANCE;
            case 10:
                int i17 = IncidentDetectedActivity.f36821g;
                return new z(new iq0.c((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)));
            case 11:
                int i18 = LiveEventService.f38482h;
                e.f100881g.getClass();
                return e.a.a();
            case 12:
                int i19 = cu0.i.f55582o;
                return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
            case 13:
                d.a aVar3 = d.f45412x;
                l.f68084a.getClass();
                l.a.a().p3(false);
                return Unit.INSTANCE;
            case 14:
                return cw.f.M();
            case 15:
                return k.M();
            case 16:
                return Unit.INSTANCE;
            case 17:
                cw1.d dVar = cw1.d.f56011a;
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return p0.n(Boolean.FALSE);
            case 20:
                return Unit.INSTANCE;
            case 21:
                cy1.c cVar = cy1.c.f56798a;
                return p0.n("");
            case 22:
                int i24 = cz1.a.Q0;
                return new y0();
            case 23:
                int i25 = cz1.a.Q0;
                return new y0();
            case 24:
                int i26 = cz1.a.Q0;
                return new y0();
            case 25:
                int i27 = cz1.a.Q0;
                return new y0();
            case 26:
                int i28 = cz1.a.Q0;
                return new y0();
            case 27:
                int i29 = cz1.a.Q0;
                return new y0();
            case 28:
                int i30 = cz1.a.Q0;
                return new y0();
            default:
                return new d4.d(map, 1, objArr == true ? 1 : 0);
        }
    }
}
