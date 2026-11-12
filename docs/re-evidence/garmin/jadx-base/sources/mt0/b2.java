package mt0;

import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivitiesListFragment;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.CompletedChallengesActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.NonCompletedChallengesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.IntensityMinutesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.devices.IntensityMinutesConfigActivity.a;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.feature.garminpay.ui.help.HelpActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.QueriedFeature;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.extension.compose.ornaments.scalebar.internal.ScaleBarComposePlugin;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ProxyInputStream;
import org.apache.commons.io.output.ProxyOutputStream;
import org.apache.commons.io.output.ProxyWriter;
import org.apache.commons.lang3.Functions;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b2 implements SwipeRefreshLayout.f, com.garmin.android.apps.connectmobile.q1.a, gu.e, r22.a2.d, TabLayoutMediator.TabConfigurationStrategy, androidx.core.view.z, OnSuccessListener, OnFailureListener, xg1.h, qh0.a.b, com.garmin.android.apps.connectmobile.settings.d.a, j42.b.InterfaceC1852b, xg1.j, u03.d, QueryRenderedFeaturesCallback, IOConsumer, Functions.FailableSupplier, CameraChangedCoalescedCallback, MediaCodecUtil.f, com.garmin.android.library.mapsdkadapter.i.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120543b;

    public /* synthetic */ b2(Object obj, int i14) {
        this.f120542a = i14;
        this.f120543b = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        int i14 = this.f120542a;
        Object obj = this.f120543b;
        switch (i14) {
            case 0:
                CompletedChallengesActivity.a aVar = CompletedChallengesActivity.f37243g;
                ((s51.a) ((CompletedChallengesActivity) obj).ca().f140797d.getValue()).f157373d.invoke();
                break;
            case 1:
                NonCompletedChallengesActivity.a aVar2 = NonCompletedChallengesActivity.f37266g;
                ((s51.a) ((NonCompletedChallengesActivity) obj).ca().f140752c.getValue()).f157373d.invoke();
                break;
            default:
                s51.a<gf0.a> aVar3 = ((EcgActivitiesListFragment) obj).u6().f137547e;
                if (aVar3 != null) {
                    aVar3.f157373d.invoke();
                }
                break;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.j
    public void X(com.garmin.android.library.mapsdkadapter.f fVar) {
        pl1.e eVar = (pl1.e) this.f120543b;
        pl1.e.a aVar = pl1.e.f138542h;
        pl1.e.b bVar = eVar.f138545g;
        if (bVar != null) {
            bVar.V();
        }
    }

    @Override // xg1.j
    public void a(nr0.a aVar) {
        IntensityMinutesConfigActivity intensityMinutesConfigActivity = (IntensityMinutesConfigActivity) this.f120543b;
        int i14 = IntensityMinutesConfigActivity.f42140k;
        IntensityMinutesConfigActivity.a aVar2 = intensityMinutesConfigActivity.new a();
        intensityMinutesConfigActivity.showProgressOverlay();
        fr0.a aVarM = fr0.a.M();
        aVarM.getClass();
        aVar.getClass();
        intensityMinutesConfigActivity.f42142b.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new gr0.a(aVar, 2, aVarM), aVar2)));
    }

    @Override // u03.d
    public void accept(Object obj) throws IOException {
        int i14 = this.f120542a;
        Object obj2 = this.f120543b;
        switch (i14) {
            case 15:
                nh2.d.Companion aVar = nh2.d.INSTANCE;
                ((nh2.d.b) obj2).invoke(obj);
                break;
            case 16:
                nh2.d.Companion aVar2 = nh2.d.INSTANCE;
                ((nh2.d.c) obj2).invoke(obj);
                break;
            case 17:
                nh2.d.Companion aVar3 = nh2.d.INSTANCE;
                ((nh2.e) obj2).invoke(obj);
                break;
            case 18:
                nh2.d.Companion aVar4 = nh2.d.INSTANCE;
                ((nh2.f) obj2).invoke(obj);
                break;
            case 19:
                Logger logger = HelpActivity.f52105j;
                ((HelpActivity.b) obj2).invoke(obj);
                break;
            case 20:
                Logger logger2 = HelpActivity.f52105j;
                ((ne2.t) obj2).invoke(obj);
                break;
            case 21:
            default:
                ((ProxyWriter) obj2).handleIOException((IOException) obj);
                break;
            case 22:
                ((ProxyInputStream) obj2).handleIOException((IOException) obj);
                break;
            case 23:
                ((ProxyOutputStream) obj2).handleIOException((IOException) obj);
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.d.a
    public void c(float f14) {
        DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
        deviceUserSettingsActivity.f42015c.S0(f14);
        deviceUserSettingsActivity.ha();
    }

    @Override // xg1.h
    public void d(int i14, boolean z14) {
        DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
        boolean z15 = deviceUserSettingsActivity.f42017e.getUserGoal().intValue() <= 0;
        int iIntValue = !z15 ? deviceUserSettingsActivity.f42017e.getUserGoal().intValue() : 0;
        if (z14 == z15 && (z15 || iIntValue == i14)) {
            return;
        }
        deviceUserSettingsActivity.showProgressOverlay();
        zk0.c cVar = z14 ? new zk0.c(0, 0, false, null, null) : new zk0.c(Integer.valueOf(i14), 0, false, "permanently", null);
        xk0.g gVar = deviceUserSettingsActivity.X;
        gVar.getClass();
        xy2.b.K(gVar, new xk0.e(gVar, cVar, null)).f(deviceUserSettingsActivity, new ng1.g0(deviceUserSettingsActivity, 2));
        deviceUserSettingsActivity.f42018f = true;
    }

    @Override // gu.e
    public void f(Serializable serializable) {
        com.garmin.android.apps.connectmobile.audioprompts.test.b bVar = (com.garmin.android.apps.connectmobile.audioprompts.test.b) this.f120543b;
        List<Locale> list = (List) serializable;
        int i14 = com.garmin.android.apps.connectmobile.audioprompts.test.b.f30232a;
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" ?><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><style type='text/css'>\n  body {font-family:arial;font-size:12px;font-weight:normal;font-style:normal;margin:10px;}\n</style>\n</head><body><table border='1' cellpadding='5' cellspacing='1'><tr><td align='center'><b>Language</b></td><td align='center'><b>Country</b></td></tr>");
        for (Locale locale : list) {
            sb3.append("<tr><td>");
            sb3.append(locale.getLanguage());
            sb3.append("</td><td>");
            sb3.append(locale.getCountry());
            sb3.append("</td></tr>");
        }
        sb3.append("</table></body></html>");
        try {
            String string = sb3.toString();
            Charset charsetForName = Charset.forName("UTF-8");
            charsetForName.getClass();
            byte[] bytes = string.getBytes(charsetForName);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            WebView webView = (WebView) bVar.getView();
            if (webView != null) {
                webView.loadData(strEncodeToString, "text/html; charset=utf-8", "base64");
                Unit unit = Unit.INSTANCE;
            }
        } catch (UnsupportedEncodingException e4) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.g(a2Var, "SupportedLangFragment", e4);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        String strR;
        int i14 = this.f120542a;
        Object obj = this.f120543b;
        switch (i14) {
            case 2:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p0 p0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.p0) obj;
                if (!z14) {
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p0.f37754d;
                    return;
                }
                h4 h4Var = p0Var.f37756a;
                if (h4Var == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.h0) h4Var.f120607g.d();
                if (h0Var == null || (strR = h0Var.getUuid()) == null) {
                    return;
                }
                ge1.b.T(androidx.lifecycle.v1.a(h4Var), null, null, new g4(h4Var, strR, null), 3);
                return;
            default:
                ActivityTrackingPulseOXSetting activityTrackingPulseOXSetting = (ActivityTrackingPulseOXSetting) obj;
                ActivityTrackingPulseOXSetting.a aVar2 = ActivityTrackingPulseOXSetting.f41786l;
                if (!z14) {
                    activityTrackingPulseOXSetting.onBackPressed();
                    return;
                } else {
                    activityTrackingPulseOXSetting.showProgressOverlay();
                    ((bd0.u) activityTrackingPulseOXSetting.f41796j.getValue()).a();
                    return;
                }
        }
    }

    @Override // org.apache.commons.lang3.Functions.FailableSupplier
    public Object get() {
        return ((Functions.FailableCallable) this.f120543b).call();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.f
    public int getScore(Object obj) {
        androidx.media3.common.q qVar = (androidx.media3.common.q) this.f120543b;
        androidx.media3.exoplayer.mediacodec.d dVar = (androidx.media3.exoplayer.mediacodec.d) obj;
        HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
        String str = dVar.f9271b;
        return ((str.equals(qVar.f8386n) || str.equals(MediaCodecUtil.b(qVar))) && dVar.c(qVar, false)) ? 1 : 0;
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d dVar = (com.garmin.android.apps.connectmobile.liveeventsharing.ui.d) this.f120543b;
        com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.d.f38580q;
        int iD = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
        if (iD <= 0) {
            String string = dVar.getString(R.string.les_invalid_time_dialog_desc);
            string.getClass();
            dVar.y6(R.string.les_invalid_time_dialog_title, string);
            return;
        }
        cu0.i iVarV6 = dVar.v6();
        iVarV6.getClass();
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.LIVE_EVENT_SHARING;
        String strH = am.j.h(iD, "setTimeDuration() timeDurationInSecs: ");
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LiveEventViewModel", strH);
        fw.m<ju0.q> mVarD = iVarV6.A4().d();
        ju0.q qVar = mVarD != null ? mVarD.f73770c : null;
        if (qVar != null) {
            qVar.s(iD);
        }
        iVarV6.A4().m(fw.m.a.g(fw.m.f73767e, qVar, 1));
    }

    @Override // j42.b.InterfaceC1852b
    public void j(double d14) {
        DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
        deviceUserSettingsActivity.f42015c.s1(d14 * 1000.0d);
        deviceUserSettingsActivity.la();
    }

    @Override // qh0.a.b
    public void l(int i14) {
        DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
        if (deviceUserSettingsActivity.f42019g.C() != i14) {
            deviceUserSettingsActivity.f42018f = true;
            zk0.h hVar = new zk0.h("FLOORS_CLIMBED", i14);
            xk0.g gVar = deviceUserSettingsActivity.X;
            gVar.getClass();
            xk0.g.x4(gVar, "floors-climbed", hVar).f(deviceUserSettingsActivity, new ng1.f0(deviceUserSettingsActivity, i14, 1));
        }
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        n7.f fVar = (n7.f) this.f120543b;
        ArrayList<n7.f.c> arrayList = fVar.f123985b;
        androidx.core.view.m1.r rVar = m1Var.f6508a;
        c7.e eVarB = c7.e.b(rVar.i(519), rVar.i(64));
        c7.e eVarB2 = c7.e.b(rVar.j(519), rVar.j(64));
        if (!eVarB.equals(fVar.f123986c) || !eVarB2.equals(fVar.f123987d)) {
            fVar.f123986c = eVarB;
            fVar.f123987d = eVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(eVarB, eVarB2);
            }
        }
        return m1Var;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i14) {
        i53.f fVar = (i53.f) this.f120543b;
        EditProfileImageActivity.a aVar = EditProfileImageActivity.f46576j;
        tab.getClass();
        tab.setText((CharSequence) fVar.get(i14));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        nc2.c cVar = (nc2.c) this.f120543b;
        exc.getClass();
        o53.s sVar = cVar.f125373b;
        if (sVar != null) {
            sVar.O(exc);
        } else {
            p005kotlin.jvm.internal.s.m("deferred");
            throw null;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((mh1.x) this.f120543b).invoke(obj);
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        QueriedRenderedFeature queriedRenderedFeature;
        QueriedFeature queriedFeature;
        Feature feature;
        QueriedRenderedFeature queriedRenderedFeature2;
        List<String> layers;
        oe2.k kVar = (oe2.k) this.f120543b;
        expected.getClass();
        List list = (List) expected.getValue();
        boolean z14 = false;
        if (list != null && (queriedRenderedFeature2 = (QueriedRenderedFeature) p13.h0.d0(list)) != null && (layers = queriedRenderedFeature2.getLayers()) != null && !layers.isEmpty()) {
            Iterator<T> it = layers.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g((String) it.next(), "unclustered-layer")) {
                    z14 = true;
                    break;
                }
            }
        }
        List list2 = (List) expected.getValue();
        if (list2 == null || (queriedRenderedFeature = (QueriedRenderedFeature) p13.h0.d0(list2)) == null || (queriedFeature = queriedRenderedFeature.getQueriedFeature()) == null || (feature = queriedFeature.getFeature()) == null) {
            return;
        }
        Geometry geometry = feature.geometry();
        Point point = geometry instanceof Point ? (Point) geometry : null;
        if (point != null) {
            kVar.invoke(point, Boolean.valueOf(z14));
        }
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        ScaleBarComposePlugin.cameraChangedCoalescedListener$lambda$0((ScaleBarComposePlugin) this.f120543b, cameraChangedCoalesced);
    }
}
