package gc0;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class b extends androidx.appcompat.app.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1548b f76833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd2.f f76834b;

    public class a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f76835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sd2.f f76836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f76837c;

        public a(boolean z14, sd2.f fVar, boolean z15) {
            this.f76835a = z14;
            this.f76836b = fVar;
            this.f76837c = z15;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            dialogInterface.dismiss();
            b bVar = b.this;
            if (i14 == 0) {
                bVar.f76833a.n(c.CANCEL);
                return;
            }
            if (i14 == 1) {
                bVar.f76833a.n(c.REMOVE_DEVICE);
                return;
            }
            boolean z14 = this.f76837c;
            sd2.f fVar = this.f76836b;
            if (i14 != 2) {
                if (i14 == 3 && fVar.r4() && z14 && !fVar.isDualBluetoothConnection()) {
                    bVar.f76833a.n(c.UPDATE_CONNECTION);
                    return;
                }
                return;
            }
            if (this.f76835a && hk0.p.m(fVar)) {
                bVar.f76833a.n(c.SYNC);
            } else if (fVar.r4() && z14 && !fVar.isDualBluetoothConnection()) {
                bVar.f76833a.n(c.UPDATE_CONNECTION);
            }
        }
    }

    /* JADX INFO: renamed from: gc0.b$b, reason: collision with other inner class name */
    public interface InterfaceC1548b {
        void n(c cVar);
    }

    public enum c {
        CANCEL,
        REMOVE_DEVICE,
        SYNC,
        UPDATE_CONNECTION
    }

    public b(Context context, sd2.f fVar, InterfaceC1548b interfaceC1548b) {
        String string;
        super(context);
        this.f76833a = interfaceC1548b;
        this.f76834b = fVar;
        setCancelable(false);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm_device_action_custom_dialog_title, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.device_unit_id);
        if (fVar.S()) {
            textView.setVisibility(0);
            textView.setText(getContext().getResources().getString(R.string.lbl_value_device_unit_id, String.valueOf(fVar.getUnitID())));
        } else {
            textView.setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(R.id.device_product_name)).setText(getContext().getResources().getString(R.string.lbl_value_device_product_name, TextUtils.isEmpty(fVar.getProductDisplayName()) ? "" : fVar.getProductDisplayName()));
        if (fVar instanceof sd2.j) {
            string = ((sd2.j) fVar).J0;
        } else if (fVar instanceof sd2.a) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((sd2.a) fVar).f158634a.iterator();
            while (it.hasNext()) {
                arrayList.add(((sd2.j) it.next()).J0);
            }
            string = arrayList.toString();
        } else {
            string = "";
        }
        ((TextView) viewInflate.findViewById(R.id.device_mac_address)).setText(getContext().getResources().getString(R.string.lbl_value_device_hardware_address, string));
        long jK2 = fVar.K2();
        ((TextView) viewInflate.findViewById(R.id.device_last_connected)).setText(getContext().getResources().getString(R.string.lbl_value_device_last_connected, jK2 != -1 ? DateUtils.formatDateTime(getContext(), jK2, 524311) : ""));
        viewInflate.setOnLongClickListener(new gc0.a(this, 0));
        setCustomTitle(viewInflate);
        String[] stringArray = context.getResources().getStringArray(R.array.garmin_device_actions);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(stringArray[0]);
        arrayList2.add(stringArray[1]);
        boolean zM = hk0.p.m(fVar);
        boolean zJ = hk0.p.j(fVar.getUnitID());
        boolean zE = km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, fVar.getUnitID());
        if (fVar.S()) {
            if (zM && zE && !zJ) {
                arrayList2.add(stringArray[2]);
            }
            if (fVar.r4() && zM && !fVar.isDualBluetoothConnection()) {
                arrayList2.add(stringArray[3]);
            }
        }
        String[] strArr = new String[arrayList2.size()];
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            strArr[i14] = (String) arrayList2.get(i14);
        }
        setItems(strArr, new a(zE, fVar, zM));
        show();
    }
}
