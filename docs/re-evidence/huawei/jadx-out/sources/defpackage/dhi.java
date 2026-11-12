package defpackage;

import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.operationbundle.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dhi extends JumpDeviceStrategy {
    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean checkSupportCapability(DeviceInfo deviceInfo) {
        return false;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpDeviceStrategy
    public boolean onPretreatment() {
        return true;
    }

    @Override // com.huawei.health.browseraction.jumpstrategy.JumpStrategy
    public void jump() {
        if (this.mContext != null) {
            try {
                if ((this.mContext.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) this.mContext.getSystemService("bluetooth") : null) == null) {
                    LogUtil.j("JumpDeviceScanStrategy", "addDevice bluetoothManager is null");
                    d();
                    return;
                } else {
                    b(new DeviceInfo(), 3);
                    Intent intent = new Intent();
                    intent.setClassName(this.mContext, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
                    iov.d(this.mContext, intent);
                    return;
                }
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("JumpDeviceScanStrategy", "addDevice activity not found exception.");
                return;
            }
        }
        LogUtil.j("JumpDeviceScanStrategy", "mContext is null");
    }

    private void d() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).b(R.string.IDS_pad_cannot_be_added).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: dhi.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("JumpDeviceScanStrategy", "Bluetooth not supported");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void b(DeviceInfo deviceInfo, int i) {
        HashMap map = new HashMap();
        if (deviceInfo != null) {
            map.put("device_name_key", deviceInfo.getDeviceName());
            map.put("product_type", Integer.valueOf(deviceInfo.getProductType()));
        }
        map.put("operation_type", Integer.valueOf(i));
        String strValue = AnalyticsValue.DEVICE_MANAGER_DEEP_LINK_2060094.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                LogUtil.j("JumpDeviceScanStrategy", "the mapValue is null when mapKey is:", str);
            } else {
                linkedHashMap.put(str, value.toString());
            }
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(strValue, linkedHashMap);
    }
}
