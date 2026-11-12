package defpackage;

import android.content.Context;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubUserAuthMsg;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ecl {
    public static void b(Context context, int i, boolean z, boolean z2) {
        LogUtil.a("MultiUserAuthUtil", "dealReplyAuthResult, ", Integer.valueOf(i), " isAgree:", Boolean.valueOf(z2), r3.A, Boolean.valueOf(z));
        if (z) {
            if (z2) {
                qpx.e(context, R.string.IDS_device_wifi_my_qrcode_add_member_success_title);
                return;
            } else {
                qpx.e(context, R.string.IDS_hw_device_wifi_authorized_status_rejected);
                return;
            }
        }
        if (i == 112000010) {
            qpx.e(context, R.string.IDS_device_wifi_share_account_limit_content);
        } else {
            qpx.e(context, R.string.IDS_device_wifi_my_qrcode_add_member_failed_title);
        }
    }

    public static int a(List<WifiDeviceSubUserAuthMsg> list) {
        int i = 0;
        if (njy.e(list)) {
            return 0;
        }
        Iterator<WifiDeviceSubUserAuthMsg> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getStatus() == 1) {
                i++;
            }
        }
        return i;
    }
}
