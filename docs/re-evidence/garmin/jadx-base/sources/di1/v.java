package di1;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.wifi.n f59789b;

    public /* synthetic */ v(com.garmin.android.apps.connectmobile.settings.devices.wifi.n nVar, int i14) {
        this.f59788a = i14;
        this.f59789b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        int i14 = this.f59788a;
        com.garmin.android.apps.connectmobile.settings.devices.wifi.n nVar = this.f59789b;
        switch (i14) {
            case 0:
                hd0.h hVar = (hd0.h) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.n.a aVar = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.f43372h;
                int i15 = 0;
                if (hVar instanceof hd0.h.b) {
                    List<WifiSetup.ScannedAccessPoint> list = ((hd0.h.b) hVar).f83352a;
                    if (list != null) {
                        TextView textView = nVar.f43374c;
                        if (textView == null) {
                            p005kotlin.jvm.internal.s.m("networksHeaderView");
                            throw null;
                        }
                        textView.setVisibility(!list.isEmpty() ? 0 : 8);
                        TextView textView2 = nVar.f43375d;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("networksNoDataView");
                            throw null;
                        }
                        textView2.setVisibility(list.isEmpty() ? 0 : 8);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new com.garmin.android.apps.connectmobile.settings.devices.wifi.f.b((WifiSetup.ScannedAccessPoint) it.next()));
                        }
                        arrayList.addAll(arrayList2);
                        if (!arrayList.isEmpty()) {
                            arrayList.add(com.garmin.android.apps.connectmobile.settings.devices.wifi.f.a.f43298a);
                        }
                        nVar.f43378g.t(arrayList);
                    } else {
                        g22.e.c(nVar);
                    }
                } else {
                    int i16 = 2;
                    if (hVar instanceof hd0.h.d) {
                        hd0.h.d dVar = (hd0.h.d) hVar;
                        if (dVar.f83355b) {
                            WifiSetup.StoredAccessPoint storedAccessPoint = dVar.f83354a;
                            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(nVar.requireContext()).setTitle(nVar.getString(R.string.wifi_connection_verification_title, storedAccessPoint.getSsid())).setMessage(nVar.getString(R.string.wifi_connection_verification_message)).setPositiveButton(nVar.getString(R.string.lbl_connect), new ag0.d(17, nVar, storedAccessPoint)).setNegativeButton(nVar.getString(R.string.orphan_device_not_connected_alert_button_notnow), new w(nVar, i16)).setCancelable(false).create();
                            eVarCreate.getClass();
                            eVarCreate.show();
                            oe2.f.e(eVarCreate, 1.3f);
                        } else {
                            g22.e.c(nVar);
                        }
                    } else if (hVar instanceof hd0.h.e) {
                        hd0.h.e eVar = (hd0.h.e) hVar;
                        WifiSetup.StoredAccessPoint storedAccessPoint2 = eVar.f83356a;
                        int i17 = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.b.f43379a[eVar.f83357b.ordinal()];
                        if (i17 != 1) {
                            string = i17 != 2 ? nVar.getString(R.string.wifi_connection_verification_error, storedAccessPoint2.getSsid()) : nVar.getString(R.string.wifi_error_invalid_credentials);
                        } else {
                            string = nVar.getString(R.string.wifi_connection_verified_successfully, storedAccessPoint2.getSsid());
                        }
                        string.getClass();
                        new androidx.appcompat.app.e.a(nVar.requireContext()).setMessage(string).setPositiveButton(nVar.getString(R.string.lbl_ok), new w(nVar, i15)).setCancelable(false).show();
                    }
                }
                return Unit.INSTANCE;
            default:
                WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.n.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.wifi.n.f43372h;
                scannedAccessPoint.getClass();
                if (scannedAccessPoint.getSecurityType() == WifiSetup.SecurityType.OPEN) {
                    hd0.b bVarV6 = nVar.v6();
                    String ssid = scannedAccessPoint.getSsid();
                    ssid.getClass();
                    WifiSetup.SecurityType securityType = scannedAccessPoint.getSecurityType();
                    securityType.getClass();
                    int i18 = hd0.b.f83307f;
                    bVarV6.z4(ssid, securityType, null);
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a aVar3 = com.garmin.android.apps.connectmobile.settings.devices.wifi.l.f43349p;
                    String ssid2 = scannedAccessPoint.getSsid();
                    WifiSetup.SecurityType securityType2 = scannedAccessPoint.getSecurityType();
                    String str = nVar.f43373b;
                    List<? extends WifiSetup.SecurityType> list2 = nVar.v6().f83312e;
                    ag0.d dVar2 = new ag0.d(18, nVar, scannedAccessPoint);
                    aVar3.getClass();
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.l.a.a(ssid2, securityType2, null, str, false, list2, dVar2).show(nVar.getChildFragmentManager(), (String) null);
                }
                return Unit.INSTANCE;
        }
    }
}
