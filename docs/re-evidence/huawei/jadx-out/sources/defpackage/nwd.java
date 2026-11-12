package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity;
import health.compact.a.HuaweiHealth;

/* JADX INFO: loaded from: classes12.dex */
public class nwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f43855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f43856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IndoorEquipDisplayActivity f43857c;
    private final IndoorEquipConnectedActivity d;
    private final IndoorEquipLandDisplayActivity e;
    private nxx f;

    public nwd(IndoorEquipConnectedActivity indoorEquipConnectedActivity, IndoorEquipDisplayActivity indoorEquipDisplayActivity, IndoorEquipLandDisplayActivity indoorEquipLandDisplayActivity) {
        this.d = indoorEquipConnectedActivity;
        this.f43857c = indoorEquipDisplayActivity;
        this.e = indoorEquipLandDisplayActivity;
    }

    public void c() {
        if (this.d != null) {
            Toast.makeText(HuaweiHealth.a(), this.f43856b.getString(R.string.ie_last_connection_continue), 0).show();
            String strM = nwa.n().m();
            if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING.equals(strM)) {
                this.f43855a.sendEmptyMessage(311);
                return;
            }
            if (AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(strM)) {
                this.f43855a.sendEmptyMessage(307);
                return;
            } else if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED.equals(strM)) {
                this.f43855a.sendEmptyMessage(302);
                return;
            } else {
                LogUtil.a("IDEQ_CommonMethodsForActivities", "private void disposeCaseOfShowTipsWhenStartHasConnectedAlready");
                return;
            }
        }
        if (this.e != null) {
            Toast.makeText(HuaweiHealth.a(), this.f43856b.getString(R.string.ie_last_connection_continue), 0).show();
        } else if (this.f43857c != null) {
            Toast.makeText(HuaweiHealth.a(), this.f43856b.getString(R.string.ie_last_connection_continue), 0).show();
        } else {
            LogUtil.e("IDEQ_CommonMethodsForActivities", "Activity is null!");
        }
    }

    public void d(String str) {
        nxx nxxVar = this.f;
        if (nxxVar != null) {
            nxxVar.a(str);
        }
    }

    public void e(Handler handler) {
        this.f43855a = handler;
    }

    public void e(nxx nxxVar) {
        this.f = nxxVar;
    }

    public void c(Context context) {
        this.f43856b = context;
    }
}
