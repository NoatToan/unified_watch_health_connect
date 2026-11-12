package zb0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd0.a f203423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.model.l f203424c;

    public a0(Context context, bd0.a aVar, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        this.f203422a = context;
        this.f203423b = aVar;
        this.f203424c = lVar;
    }

    public final void a() {
        bd0.a aVar = this.f203423b;
        if (aVar != null) {
            hk0.p.c().e(aVar.f17520a);
        }
        Context context = this.f203422a;
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f203424c;
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setCancelable(false).setTitle(R.string.connect_iq_device_has_disconnected_title).setMessage(context.getString(R.string.msg_device_disconnected_try_reconnect, lVar != null ? lVar.getF143516f() : context.getString(R.string.incomplete_device_default_device_name))).setPositiveButton(R.string.lbl_reconnect_device_bond, new xg1.l(this, 20)).setNegativeButton(R.string.lbl_cancel, new xk1.v(24)).create();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.3f);
    }
}
