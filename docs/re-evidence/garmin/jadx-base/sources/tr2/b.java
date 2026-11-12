package tr2;

import am.x0;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.widget.SearchView;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.o2;
import androidx.fragment.app.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.group.details.invite.GroupInviteActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityTrackingSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.a0;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.feature.garminpay.providers.felica.exception.GooglePayException;
import com.garmin.feature.garminpay.ui.userwallet.CardDetailsActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.UnaryOperator;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import r22.a2;
import r53.p2;
import tn2.n0;
import v.c1;
import v.l0;
import v.s2;
import v.y1;
import vg1.g0;
import vg1.k0;
import vg1.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements u03.d, SwipeRefreshLayout.f, com.garmin.android.library.mapsdkadapter.i.j, xz2.p, a2.d, MultiLineImeEditText.b, ImageAssetDelegate, q03.e, OnCompleteListener, y.b, l0.a, p.a, o1.a, v0.d.a, b0, EventListener.Factory, ga.g.b, xg1.h, qh0.a.b, com.garmin.android.apps.connectmobile.settings.d.a, j42.b.InterfaceC1852b, g0, e22.c, SearchView.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f166132b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f166131a = i14;
        this.f166132b = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        int i14 = this.f166131a;
        Object obj = this.f166132b;
        switch (i14) {
            case 1:
                CardDetailsActivity cardDetailsActivity = (CardDetailsActivity) obj;
                RecyclerView recyclerView = cardDetailsActivity.f52174m;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("recyclerView");
                    throw null;
                }
                if (recyclerView.getItemAnimator() == null) {
                    RecyclerView recyclerView2 = cardDetailsActivity.f52174m;
                    if (recyclerView2 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView2.setItemAnimator(new androidx.recyclerview.widget.i());
                }
                vr2.c cVar = cardDetailsActivity.f52170i;
                if (cVar != null) {
                    cVar.x4();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("cardDetailsViewModel");
                    throw null;
                }
            case 4:
                PaymentCardDetailsFragment paymentCardDetailsFragment = (PaymentCardDetailsFragment) obj;
                RecyclerView recyclerView3 = paymentCardDetailsFragment.f52200k;
                if (recyclerView3 == null) {
                    p005kotlin.jvm.internal.s.m("recyclerView");
                    throw null;
                }
                if (recyclerView3.getItemAnimator() == null) {
                    RecyclerView recyclerView4 = paymentCardDetailsFragment.f52200k;
                    if (recyclerView4 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView4.setItemAnimator(new androidx.recyclerview.widget.i());
                }
                paymentCardDetailsFragment.y6().z4();
                return;
            default:
                UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                vr2.e eVar = ((UserWalletActivity) obj).f52219g;
                if (eVar != null) {
                    eVar.d0();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.b) this.f166132b;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.b.f45836k;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.b.InterfaceC0884b interfaceC0884b = bVar.f45842j;
        if (interfaceC0884b != null) {
            interfaceC0884b.V();
        }
    }

    @Override // androidx.camera.core.impl.o1.a
    public void a(o1 o1Var) throws Exception {
        s2 s2Var = (s2) this.f166132b;
        s2Var.getClass();
        try {
            androidx.camera.core.e eVarB = o1Var.b();
            if (eVarB != null) {
                s2Var.f174071c.b(eVarB);
            }
        } catch (IllegalStateException e4) {
            e4.getMessage();
        }
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f166131a;
        Object obj2 = this.f166132b;
        switch (i14) {
            case 0:
                CardDetailsActivity.b bVar = CardDetailsActivity.f52166n;
                ((n0) obj2).invoke(obj);
                break;
            case 1:
            case 4:
            case 5:
            default:
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                ((n0) obj2).invoke(obj);
                break;
            case 2:
                Logger logger = PaymentCardDetailsFragment.f52189m;
                ((PaymentCardDetailsFragment.c) obj2).invoke(obj);
                break;
            case 3:
                Logger logger2 = PaymentCardDetailsFragment.f52189m;
                ((n0) obj2).invoke(obj);
                break;
            case 6:
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar2 = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                ((com.garmin.feature.garminpay.ui.userwallet.e.b) obj2).invoke(obj);
                break;
        }
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        y1 y1Var = (y1) this.f166132b;
        c1 c1Var = y1Var.f174122d;
        if (y1Var.f174127i == y1.b.SESSION_INITIALIZED) {
            List<DeferrableSurface> listB = y1Var.f174126h.b();
            ArrayList arrayList = new ArrayList();
            for (DeferrableSurface deferrableSurface : listB) {
                k7.h.b(deferrableSurface instanceof o2, "Surface must be SessionProcessorSurface");
                arrayList.add((o2) deferrableSurface);
            }
            y1Var.f174125g = new l0(c1Var, arrayList);
            y1Var.f174119a.i();
            y1Var.f174127i = y1.b.ON_CAPTURE_SESSION_STARTED;
            l2 l2Var = y1Var.f174124f;
            if (l2Var != null) {
                y1Var.f(l2Var);
            }
            if (y1Var.f174128j != null) {
                y1Var.b(y1Var.f174128j);
                y1Var.f174128j = null;
            }
        }
        return null;
    }

    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.j jVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.j) this.f166132b;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.j.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.j.f46094h;
        bVar.getClass();
        AddTIEventViewModel addTIEventViewModelA6 = jVar.A6();
        DateTime dateTime = new DateTime(bVar.f());
        String[] strArr = AddTIEventViewModel.V2;
        addTIEventViewModelA6.L6(dateTime);
        ((y0) addTIEventViewModelA6.K0.getValue()).m(dateTime.toLocalDate());
        AddTIEventViewModel addTIEventViewModelA7 = jVar.A6();
        ((y0) addTIEventViewModelA7.K0.getValue()).m(new DateTime(bVar.f()).toLocalDate());
        materialCalendarView.f();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
        deviceUserSettingActivityDefault.f42749c.S0(f14);
        deviceUserSettingActivityDefault.fa();
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f166132b, call);
    }

    @Override // xg1.h
    public void d(int i14, boolean z14) {
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
        boolean z15 = deviceActivityTrackingSettingActivityDefault.f42603y.getUserGoal().intValue() <= 0;
        int iIntValue = !z15 ? deviceActivityTrackingSettingActivityDefault.f42603y.getUserGoal().intValue() : 0;
        if (z14 == z15 && (z15 || iIntValue == i14)) {
            return;
        }
        deviceActivityTrackingSettingActivityDefault.showProgressOverlay();
        zk0.c cVar = z14 ? new zk0.c(0, 0, false, null, null) : new zk0.c(Integer.valueOf(i14), 0, false, "permanently", null);
        xk0.g gVar = deviceActivityTrackingSettingActivityDefault.I0;
        gVar.getClass();
        xy2.b.K(gVar, new xk0.e(gVar, cVar, null)).f(deviceActivityTrackingSettingActivityDefault, new vg1.j(deviceActivityTrackingSettingActivityDefault, 2));
        deviceActivityTrackingSettingActivityDefault.f42604z = true;
    }

    @Override // ga.g.b
    public void e(long j8, fa.r rVar) {
        bb.f.a(j8, rVar, ((vb.f) this.f166132b).K);
    }

    @Override // q03.e
    public void f(z03.c.a aVar) throws GooglePayException {
        JSONObject jSONObject;
        un2.a aVar2 = (un2.a) this.f166132b;
        Logger logger = un2.a.f172058d;
        un2.b bVar = aVar2.f172060b;
        bVar.getClass();
        try {
            jSONObject = new JSONObject(bVar.f172063b.toString());
            jSONObject.put("allowedPaymentMethods", new JSONArray().put(bVar.a()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            throw new GooglePayException("isReadyToPay: Json error");
        }
        IsReadyToPayRequest isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(jSONObject.toString());
        if (isReadyToPayRequestFromJson == null) {
            throw new GooglePayException("isReadyToPay: Request build failed");
        }
        aVar2.f172061c.isReadyToPay(isReadyToPayRequestFromJson).addOnCompleteListener(new b(aVar, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.ImageAssetDelegate
    public Bitmap fetchBitmap(LottieImageAsset lottieImageAsset) {
        return (Bitmap) ((i53.d) this.f166132b).get(lottieImageAsset != null ? lottieImageAsset.getFileName() : null);
    }

    @Override // androidx.fragment.app.b0
    public void g(Bundle bundle, String str) {
        v12.n nVar = (v12.n) this.f166132b;
        str.getClass();
        v12.j.f174746a.getClass();
        Object obj = bundle.get("userprofile.privacy.past.selected.option");
        ip.a aVar = obj instanceof ip.a ? (ip.a) obj : null;
        if (aVar != null) {
            v12.p pVarU6 = nVar.u6();
            final x0 x0Var = aVar.f94639a;
            final PrivacyType privacyType = aVar.f94640b;
            pVarU6.getClass();
            x0Var.getClass();
            p2 p2Var = pVarU6.f174791b;
            ArrayList arrayListD1 = h0.d1(((v12.p.a) p2Var.getValue()).f174794a);
            final m0 m0Var = new m0();
            m0Var.f105804a = ((v12.p.a) p2Var.getValue()).f174795b;
            arrayListD1.replaceAll(new UnaryOperator() { // from class: v12.o
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    ip.a aVar2 = (ip.a) obj2;
                    aVar2.getClass();
                    x0 x0Var2 = aVar2.f94639a;
                    x0 x0Var3 = x0Var;
                    if (x0Var2 != x0Var3) {
                        return aVar2;
                    }
                    m0Var.f105804a = true;
                    return new ip.a(x0Var3, privacyType);
                }
            });
            ge1.b.T(v1.a(pVarU6), null, null, new v12.t(pVarU6, arrayListD1, m0Var, null), 3);
        }
    }

    @Override // y.b
    public Object get() {
        return ((androidx.camera.camera2.internal.compat.h) this.f166132b).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        a0 a0Var = (a0) this.f166132b;
        a0.a aVar = a0.I1;
        a0Var.E6();
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        com.garmin.android.apps.connectmobile.traininginitiative.ui.y yVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.y) this.f166132b;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.y.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v;
        yVar.E6().D6(Integer.valueOf((i15 * 60) + (i14 * DateTimeConstants.SECONDS_PER_HOUR) + i16));
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
        deviceUserSettingActivityDefault.f42749c.s1(d14 * 1000.0d);
        deviceUserSettingActivityDefault.ia();
    }

    @Override // e22.c
    public void k(Object obj) {
        ea2.b bVar;
        k0 k0Var = (k0) this.f166132b;
        vg1.a0 a0Var = (vg1.a0) obj;
        if (a0Var instanceof s0) {
            s0 s0Var = (s0) a0Var;
            DeviceProfile deviceProfileB = ((l80.b) KoinJavaComponent.get(l80.b.class)).b(k0Var.f178120b);
            if (deviceProfileB != null) {
                String strValueOf = String.valueOf(deviceProfileB.getF92745i());
                uv.i<uv.h> iVar = s0Var.f178166k;
                iVar.getClass();
                if (strValueOf != null) {
                    iVar.f172902e = uv.j.a(strValueOf);
                }
            }
            uv.b bVar2 = s0Var.f178162g;
            if (bVar2 != null) {
                String str = uv.b.f172867f;
                Logger logger = bVar2.f172870c;
                uv.h.a aVar = bVar2.f172869b;
                y0 y0Var = bVar2.f172871d;
                if (y0Var.d() == 0) {
                    y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                    zb0.e eVar = (zb0.e) KoinJavaComponent.get$default(zb0.e.class, null, null, 6, null);
                    eVar.getClass();
                    String parent = new File(aVar.f172897c, "/downloads").getParent();
                    String strD = eVar.d(bVar2.f172868a);
                    if (strD != null) {
                        try {
                            eVar.n(strD, aVar.f172895a, parent, aVar.f172896b, bVar2.f172872e);
                        } catch (RemoteException e4) {
                            logger.error(str + " - RemoteException thrown while fetching device settings", (Throwable) e4);
                            fw.m.f73767e.getClass();
                            y0Var.m(fw.m.a.a(null, e4));
                        } catch (Exception e14) {
                            logger.error(str + " - Unexpected exception thrown while fetching device settings", (Throwable) e14);
                            fw.m.f73767e.getClass();
                            y0Var.m(fw.m.a.a(null, e14));
                        }
                    }
                }
            }
            uv.a aVar2 = s0Var.f178164i;
            if (aVar2 != null) {
                z9.a.a(aVar2.f172861a).b(aVar2.f172864d, aVar2.f172865e);
                y0 y0Var2 = aVar2.f172863c;
                y0Var2.getClass();
                y0Var2.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                String strD2 = ((zb0.e) KoinJavaComponent.get$default(zb0.e.class, null, null, 6, null)).d(aVar2.f172862b);
                if (strD2 != null && (bVar = (ea2.b) ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).getCapability(strD2, ea2.b.class)) != null) {
                    bVar.requestMessage(5023);
                }
            }
            uv.d dVar = s0Var.f178165j;
            if (dVar != null) {
                dVar.a(s0Var.f178167l);
            }
        }
    }

    @Override // qh0.a.b
    public void l(int i14) {
        DeviceActivityTrackingSettingActivityDefault deviceActivityTrackingSettingActivityDefault = DeviceActivityTrackingSettingActivityDefault.this;
        if (deviceActivityTrackingSettingActivityDefault.A.C() != i14) {
            deviceActivityTrackingSettingActivityDefault.f42604z = true;
            zk0.h hVar = new zk0.h("FLOORS_CLIMBED", i14);
            xk0.g gVar = deviceActivityTrackingSettingActivityDefault.I0;
            gVar.getClass();
            xk0.g.x4(gVar, "floors-climbed", hVar).f(deviceActivityTrackingSettingActivityDefault, new vg1.k(deviceActivityTrackingSettingActivityDefault, i14, 0));
        }
    }

    @Override // androidx.appcompat.widget.SearchView.l
    public void onClose() {
        ((GroupInviteActivity) this.f166132b).f36361c = null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        z03.c.a aVar = (z03.c.a) this.f166132b;
        Logger logger = un2.a.f172058d;
        task.getClass();
        if (task.isSuccessful() && p005kotlin.jvm.internal.s.g(task.getResult(), Boolean.TRUE)) {
            aVar.a();
        } else {
            un2.a.f172058d.trace("isReadyToPay failed:", (Throwable) task.getException());
            aVar.c(new GooglePayException("isReadyToPay: Google Pay is not ready"));
        }
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        v.a0.d dVar = (v.a0.d) this.f166132b;
        if (Boolean.TRUE.equals((Boolean) obj)) {
            long j8 = dVar.f173649g;
            ScheduledExecutorService scheduledExecutorService = dVar.f173645c;
            v.l lVar = dVar.f173646d;
            long j14 = j8 / 1000000;
            v.a0.f fVar = new v.a0.f(new u62.z(28));
            lVar.p(fVar);
            r0.h hVar = new r0.h(22, lVar, fVar);
            Executor executor = lVar.f173879c;
            androidx.concurrent.futures.b.d dVar2 = fVar.f173654b;
            dVar2.addListener(hVar, executor);
            l0.j.a aVar = l0.j.f107810a;
            return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar2, scheduledExecutorService, j14, 6));
        }
        l0.j.a aVar2 = l0.j.f107810a;
        return l0.m.c.f107817b;
    }
}
