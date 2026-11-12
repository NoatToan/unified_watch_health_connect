package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.notification.NotificationDeviceLinkage;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ogd {
    public static Bundle d(Bundle bundle, List<NotificationDeviceLinkage> list) {
        if (bundle == null || CollectionUtils.a(list)) {
            ReleaseLogUtil.d("NotificationDeviceLinkageUtils", "getDeviceLinkage bundle ", bundle, " deviceLinkage ", list);
            return bundle;
        }
        ArrayList arrayList = new ArrayList();
        for (NotificationDeviceLinkage notificationDeviceLinkage : list) {
            if (notificationDeviceLinkage != null) {
                HashMap map = new HashMap();
                b(map, "ping_open_remote", notificationDeviceLinkage.getPingOpenRemote());
                b(map, "ping_open_type", notificationDeviceLinkage.getPingOpenType());
                d(map, "ping_package_name", notificationDeviceLinkage.getPingPackageName());
                d(map, "ping_class_name", notificationDeviceLinkage.getPingClassName());
                d(map, "ping_url", notificationDeviceLinkage.getPingUrl());
                d(map, "button_content", notificationDeviceLinkage.getButtonContent());
                if (map.size() != 0) {
                    arrayList.add(map);
                }
            }
        }
        if (CollectionUtils.a(arrayList)) {
            ReleaseLogUtil.d("NotificationDeviceLinkageUtils", "getDeviceLinkage list ", arrayList, " deviceLinkageList ", list);
            return bundle;
        }
        String strD = HiJsonUtil.d(arrayList);
        bundle.putString("ping_list", strD);
        LogUtil.b("NotificationDeviceLinkageUtils", "getDeviceLinkage json ", strD, " deviceLinkageList ", list);
        return bundle;
    }

    private static void b(Map<String, Object> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, Integer.valueOf(CommonUtils.j(str2)));
    }

    private static void d(Map<String, Object> map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
