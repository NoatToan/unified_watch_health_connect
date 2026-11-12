package cx2;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcx2/i;", "", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56681a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcx2/i$a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(Fragment fragment) {
            final com.garmin.realtimesettings.app.presentationlayer.a aVar;
            fragment.getClass();
            m activity = fragment.getActivity();
            try {
                if (!(activity instanceof com.garmin.realtimesettings.app.presentationlayer.a)) {
                    activity = null;
                }
                aVar = (com.garmin.realtimesettings.app.presentationlayer.a) activity;
            } catch (ClassCastException unused) {
                aVar = null;
            }
            if (aVar == null) {
                return false;
            }
            h hVar = aVar.f52607a;
            yw2.a aVar2 = aVar.f52610d;
            i.f56681a.getClass();
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(defaultAdapter != null ? defaultAdapter.isEnabled() : false)) {
                ew2.e.a aVar3 = ew2.e.f66901a;
                String string = aVar.getString(R.string.bluetooth_disabled);
                String string2 = aVar.getString(R.string.bluetooth_disabled_description);
                String string3 = aVar.getString(R.string.turn_on_bluetooth);
                string3.getClass();
                final int i14 = 1;
                p pVar = new p(string3, new e23.p() { // from class: yw2.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = i14;
                        com.garmin.realtimesettings.app.presentationlayer.a aVar4 = aVar;
                        DialogInterface dialogInterface = (DialogInterface) obj;
                        ((Integer) obj2).getClass();
                        int i16 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                        switch (i15) {
                            case 0:
                                dialogInterface.getClass();
                                if (aVar4.U9()) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=9BcXLSQ4A22gasLarkUvH6"));
                                    aVar4.startActivity(intent);
                                }
                                dialogInterface.cancel();
                                break;
                            default:
                                dialogInterface.getClass();
                                cx2.i.f56681a.getClass();
                                new cx2.a();
                                if (cx2.a.a(aVar4)) {
                                    aVar4.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                                }
                                dialogInterface.cancel();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                String string4 = aVar.getString(R.string.lbl_cancel);
                string4.getClass();
                aVar2.a(aVar, ew2.e.a.a(aVar3, aVar, string, string2, pVar, new p(string4, new yu1.a((byte) 0, 2)), 992));
                hVar.d(null, "Device disconnected.");
                return false;
            }
            com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
            if (g.d(aVar, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192450b)) {
                return true;
            }
            String string5 = aVar.getString(R.string.device_not_connected_description, com.garmin.realtimesettings.app.initialization.b.c().f192453a.f192451c);
            string5.getClass();
            ew2.e.a aVar4 = ew2.e.f66901a;
            String string6 = aVar.getString(R.string.device_not_connected);
            String string7 = aVar.getString(R.string.support_center);
            string7.getClass();
            final int i15 = 0;
            p pVar2 = new p(string7, new e23.p() { // from class: yw2.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    com.garmin.realtimesettings.app.presentationlayer.a aVar5 = aVar;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).getClass();
                    int i17 = com.garmin.realtimesettings.app.presentationlayer.a.f52606o;
                    switch (i16) {
                        case 0:
                            dialogInterface.getClass();
                            if (aVar5.U9()) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=9BcXLSQ4A22gasLarkUvH6"));
                                aVar5.startActivity(intent);
                            }
                            dialogInterface.cancel();
                            break;
                        default:
                            dialogInterface.getClass();
                            cx2.i.f56681a.getClass();
                            new cx2.a();
                            if (cx2.a.a(aVar5)) {
                                aVar5.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                            }
                            dialogInterface.cancel();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            String string8 = aVar.getString(R.string.lbl_cancel);
            string8.getClass();
            aVar2.a(aVar, ew2.e.a.a(aVar4, aVar, string6, string5, pVar2, new p(string8, new yu1.a((byte) 0, 3)), 992));
            hVar.d(null, "Device disconnected.");
            return false;
        }

        public static boolean b(Fragment fragment) {
            fragment.getClass();
            m activity = fragment.getActivity();
            com.garmin.realtimesettings.app.presentationlayer.a aVar = null;
            try {
                if (!(activity instanceof com.garmin.realtimesettings.app.presentationlayer.a)) {
                    activity = null;
                }
                aVar = (com.garmin.realtimesettings.app.presentationlayer.a) activity;
            } catch (ClassCastException unused) {
            }
            if (aVar == null || !aVar.U9()) {
                if (aVar == null) {
                    tw2.b.a aVar2 = tw2.b.f166803b;
                    Context contextRequireContext = fragment.requireContext();
                    contextRequireContext.getClass();
                    aVar2.getClass();
                    if (tw2.b.a.a(contextRequireContext)) {
                    }
                }
                return false;
            }
            return true;
        }

        private a() {
        }
    }
}
