package lp2;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.z;
import androidx.core.widget.NestedScrollView;
import b.u;
import com.garmin.android.apps.connectmobile.group.details.GroupDetailFragment;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.library.mapsdkadapter.l;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment;
import com.garmin.feature.garminpay.providers.preload.ui.PreloadTransitManageCardActivity;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.util.Date;
import java.util.HashMap;
import l3.p1;
import lx0.k;
import m30.m;
import m30.o;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import q03.v;
import xz2.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements OnFailureListener, u03.d, u03.f, u03.g, p, z, u03.a, q1.a, com.garmin.android.library.mapsdkadapter.i.n, m7.c, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114244b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f114243a = i14;
        this.f114244b = obj;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.n
    public boolean T0(l lVar) {
        m mVar = (m) this.f114244b;
        int i14 = m.f116358h1;
        Object tag = lVar.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        o.c.a aVar = mVar.f116359a1;
        if (aVar == null) {
            return true;
        }
        aVar.f116382a.invoke(new n30.i.f(iIntValue, false));
        return true;
    }

    @Override // m7.c
    public boolean a(m7.d dVar, int i14, Bundle bundle) {
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f114244b;
        if ((i14 & 1) != 0) {
            try {
                ((m7.d.a) dVar.f117058a).f117059a.requestPermission();
                InputContentInfo inputContentInfo = ((m7.d.a) dVar.f117058a).f117059a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        m7.d.b bVar = dVar.f117058a;
        m7.d.b bVar2 = dVar.f117058a;
        androidx.core.view.e.a aVar = new androidx.core.view.e.a(new ClipData(((m7.d.a) bVar).f117059a.getDescription(), new ClipData.Item(((m7.d.a) bVar2).f117059a.getContentUri())), 2);
        Uri linkUri = ((m7.d.a) bVar2).f117059a.getLinkUri();
        androidx.core.view.e.c cVar = aVar.f6415a;
        cVar.a(linkUri);
        cVar.setExtras(bundle);
        return s0.m(appCompatEditText, cVar.build()) == null;
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f114243a;
        Object obj2 = this.f114244b;
        switch (i14) {
            case 1:
                PreloadTransitManageCardActivity.a aVar = PreloadTransitManageCardActivity.f51737l;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 2:
                PreloadTransitManageCardActivity.a aVar2 = PreloadTransitManageCardActivity.f51737l;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 3:
                PreloadTransitManageCardActivity.a aVar3 = PreloadTransitManageCardActivity.f51737l;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 4:
                PreloadTransitManageCardActivity.a aVar4 = PreloadTransitManageCardActivity.f51737l;
                ((lq2.a) obj2).invoke(obj);
                break;
            case 5:
                PreloadTransitManageCardActivity.a aVar5 = PreloadTransitManageCardActivity.f51737l;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 6:
                PreloadTransitManageCardActivity.a aVar6 = PreloadTransitManageCardActivity.f51737l;
                ((lq2.a) obj2).invoke(obj);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                LostWatchActivity.a aVar7 = LostWatchActivity.f52015j;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 13:
                DeviceSettingsActivity.a aVar8 = DeviceSettingsActivity.f51993w;
                ((DeviceSettingsActivity.d) obj2).invoke(obj);
                break;
            case 14:
                DeviceSettingsActivity.a aVar9 = DeviceSettingsActivity.f51993w;
                ((lq1.a) obj2).invoke(obj);
                break;
            case 15:
                LostWatchActivity.a aVar10 = LostWatchActivity.f52015j;
                ((LostWatchActivity.d) obj2).invoke(obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f114243a;
        Object obj2 = this.f114244b;
        switch (i14) {
            case 7:
                int i15 = lq2.e.f114359e;
                obj.getClass();
                return (jq2.c) ((kp2.a) obj2).invoke(obj);
            case 8:
                int i16 = lq2.e.f114359e;
                obj.getClass();
                return (b83.a) ((lq1.a) obj2).invoke(obj);
            case 10:
                int i17 = lq2.e.f114359e;
                obj.getClass();
                return (v) ((p1) obj2).invoke(obj);
            case 12:
                int i18 = lq2.e.f114359e;
                obj.getClass();
                return (jq2.c) ((lq1.a) obj2).invoke(obj);
            case 26:
                obj.getClass();
                return (v) ((mn2.d) obj2).invoke(obj);
            case 27:
                obj.getClass();
                return (v) ((mn2.d) obj2).invoke(obj);
            case 28:
                obj.getClass();
                return (v) ((mn2.d) obj2).invoke(obj);
            default:
                obj.getClass();
                return (v) ((mn2.d) obj2).invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o13.l] */
    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        int i14 = this.f114243a;
        Object obj = this.f114244b;
        switch (i14) {
            case 17:
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a aVar = (com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a) obj;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.C0664a c0664a = com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.a.f37094a;
                bVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putSerializable("RESULT_KEY_DATE", new LocalDate(bVar.f192861a, bVar.f192862b + 1, bVar.f192863c));
                aVar.getParentFragmentManager().m0(bundle, "REQUEST_KEY_DATE");
                materialCalendarView.f();
                aVar.dismiss();
                break;
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e.f39159b;
                bVar.getClass();
                k kVar = (k) ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e) obj).f39161a.getValue();
                Date dateG = bVar.g();
                dateG.getClass();
                kVar.getClass();
                kVar.f115191g = dateG;
                materialCalendarView.f();
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d dVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d) this.f114244b;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.f39132l;
        if (z14) {
            if (((Boolean) dVar.f39134b.getValue()).booleanValue()) {
                ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).o(dVar.getActivity());
                return;
            }
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.d.C0694d c0694d = dVar.f39143k;
            if (c0694d == null) {
                s.m("onBackPressedCallback");
                throw null;
            }
            c0694d.f(false);
            ((u) dVar.f39142j.getValue()).d();
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        TripFlightFragment tripFlightFragment = (TripFlightFragment) this.f114244b;
        int i14 = TripFlightFragment.f37039n;
        view2.getClass();
        m1.r rVar = m1Var.f6508a;
        c7.e eVarI = rVar.i(8);
        eVarI.getClass();
        c7.e eVarI2 = rVar.i(2);
        eVarI2.getClass();
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), Math.max(eVarI.f25193d, eVarI2.f25193d));
        if (rVar.u(8) && (view2 instanceof NestedScrollView)) {
            ms0.e eVar = tripFlightFragment.f37047h;
            if (eVar == null) {
                s.m("departureViewHolder");
                throw null;
            }
            if (eVar.f120466b.hasFocus()) {
                NestedScrollView nestedScrollView = (NestedScrollView) view2;
                View view3 = tripFlightFragment.f37046g;
                if (view3 == null) {
                    s.m("departureView");
                    throw null;
                }
                nestedScrollView.p(0 - nestedScrollView.getScrollX(), view3.getTop() - nestedScrollView.getScrollY(), 250, false);
            }
            ms0.e eVar2 = tripFlightFragment.f37049j;
            if (eVar2 == null) {
                s.m("arrivalViewHolder");
                throw null;
            }
            if (eVar2.f120466b.hasFocus()) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) view2;
                View view4 = tripFlightFragment.f37048i;
                if (view4 == null) {
                    s.m("arrivalView");
                    throw null;
                }
                nestedScrollView2.p(0 - nestedScrollView2.getScrollX(), view4.getTop() - nestedScrollView2.getScrollY(), 250, false);
                return m1Var;
            }
        }
        return m1Var;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i14) {
        GroupDetailFragment groupDetailFragment = (GroupDetailFragment) this.f114244b;
        tab.getClass();
        com.garmin.android.apps.connectmobile.group.details.b bVar = groupDetailFragment.f36158a;
        if (bVar == null) {
            s.m("adapter");
            throw null;
        }
        com.garmin.android.apps.connectmobile.group.details.b.a aVar = (com.garmin.android.apps.connectmobile.group.details.b.a) bVar.f36267k.get(i14);
        Context contextRequireContext = bVar.f36266j.requireContext();
        contextRequireContext.getClass();
        tab.setText(aVar.a(contextRequireContext));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        FitPayCardVerificationSubmitFragment fitPayCardVerificationSubmitFragment = (FitPayCardVerificationSubmitFragment) this.f114244b;
        int i14 = FitPayCardVerificationSubmitFragment.f51514k;
        exc.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("Unsuccessful: ", exc.getMessage(), fitPayCardVerificationSubmitFragment.w6());
    }

    @Override // u03.a
    public void run() {
        HashMap map = (HashMap) this.f114244b;
        ls2.b.f114790a.getClass();
        ls2.b.a(map);
    }

    @Override // u03.g
    public boolean test(Object obj) {
        int i14 = this.f114243a;
        lq1.a aVar = (lq1.a) this.f114244b;
        switch (i14) {
            case 9:
                int i15 = lq2.e.f114359e;
                obj.getClass();
                break;
            default:
                int i16 = lq2.e.f114359e;
                obj.getClass();
                break;
        }
        return ((Boolean) aVar.invoke(obj)).booleanValue();
    }
}
