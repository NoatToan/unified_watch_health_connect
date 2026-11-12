package defpackage;

import android.content.Context;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;

/* JADX INFO: loaded from: classes8.dex */
public class lq0 extends gj1 {
    public lq0(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.gj1
    public Object d(Object[] objArr) {
        Object[] objArr2 = this.f19043a;
        Context context = (Context) objArr2[1];
        ScanDeviceActivity.INSTANCE.launch$device_manager_chinaProductRelease(context, null, true);
        return null;
    }
}
