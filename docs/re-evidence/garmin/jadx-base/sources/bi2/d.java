package bi2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.R;
import r22.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f18121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18122c;

    public /* synthetic */ d(View.OnCreateContextMenuListener onCreateContextMenuListener, Object obj, int i14) {
        this.f18120a = i14;
        this.f18121b = onCreateContextMenuListener;
        this.f18122c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i14 = this.f18120a;
        Object obj = this.f18122c;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f18121b;
        switch (i14) {
            case 0:
                ((AlertDialog) onCreateContextMenuListener).getButton(-1).setOnClickListener(new a61.d0(14, (f) obj, dialogInterface));
                return;
            case 1:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o oVar = (com.garmin.android.apps.connectmobile.settings.devices.wifi.o) obj;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.o.a aVar = com.garmin.android.apps.connectmobile.settings.devices.wifi.o.f43387d;
                Button buttonE = ((androidx.appcompat.app.e) onCreateContextMenuListener).e(-1);
                if (buttonE != null) {
                    buttonE.setTextColor(a7.b.getColor(oVar.requireContext(), R.color.gcm_text_danger_action));
                    return;
                }
                return;
            case 2:
                ((AlertDialog) onCreateContextMenuListener).getButton(-1).setOnClickListener(new hx0.k(17, (iv2.g) obj, dialogInterface));
                return;
            case 3:
                s0 s0Var = (s0) onCreateContextMenuListener;
                Integer num = (Integer) obj;
                androidx.appcompat.app.e eVar = s0Var.f149859c;
                if (eVar == null) {
                    p005kotlin.jvm.internal.s.m("alertdialog");
                    throw null;
                }
                Button buttonE2 = eVar.e(-2);
                if (buttonE2 != null) {
                    buttonE2.setTextColor(a7.b.getColor(s0Var.requireContext(), num.intValue()));
                    return;
                }
                return;
            case 4:
                xh1.j jVar = (xh1.j) onCreateContextMenuListener;
                int i15 = xh1.j.f191067f;
                String string = jVar.getString(R.string.lbl_pace);
                string.getClass();
                String string2 = jVar.getString(R.string.lbl_time_unit_minutes);
                string2.getClass();
                String string3 = jVar.getString(R.string.common_n_meters_label, "100");
                string3.getClass();
                String string4 = jVar.getString(R.string.string_per_string_pattern, string2, string3);
                String strC = zl.a.c(string4, string, ". ", string4);
                String string5 = jVar.getString(R.string.chart_pace_title, jVar.getString(R.string.lbl_minute_100_meters));
                string5.getClass();
                oe2.f.g0((androidx.appcompat.app.e) obj, string5, strC);
                return;
            default:
                ((androidx.appcompat.app.e) onCreateContextMenuListener).e(-3).setOnClickListener(new xp0.d((yo0.c) obj, 15));
                return;
        }
    }
}
