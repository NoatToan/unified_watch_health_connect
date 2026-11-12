package defpackage;

import com.miui.circulate.api.service.CirculateServiceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface lnb extends iyc {
    void onBluetoothBatteryChanged(CirculateServiceInfo circulateServiceInfo, List<Integer> list);

    void onBluetoothModeChanged(CirculateServiceInfo circulateServiceInfo, int i);

    void onBluetoothNameChanged(CirculateServiceInfo circulateServiceInfo, String str);

    void onBluetoothVolumeChanged(CirculateServiceInfo circulateServiceInfo, int i);
}
