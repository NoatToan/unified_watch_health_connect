package defpackage;

import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ump {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Integer, Integer> f50369a = new HashMap(16);

    public static int d(int i, String str) {
        LogUtil.a("DataOriginIconUtils", "setDataIcon dataType:", Integer.valueOf(i));
        if (i != 32) {
            if (i != 39) {
                if (i != 41 && i != 46) {
                    if (i != 51) {
                        if (i != 88 && i != 395) {
                            if (i == 506) {
                                return R.mipmap.ic_data_origin_pillow;
                            }
                            if (i != 35 && i != 36) {
                                switch (i) {
                                    case 21:
                                    case 22:
                                    case 23:
                                        break;
                                    default:
                                        return b(i, str);
                                }
                            }
                        }
                    }
                }
                return R.mipmap.ic_data_origin_watch;
            }
            return R.mipmap.ic_data_origin_talkband;
        }
        return R.mipmap.ic_data_origin_phone;
    }

    private static int b(int i, String str) {
        String strD = d(i);
        if (c(strD, "001")) {
            return R.mipmap.ic_data_origin_manual;
        }
        if (c(strD, "095")) {
            return R.mipmap.ic_data_origin_rope_skipping;
        }
        int iC = c(i);
        if (str != null) {
            if (iC != R.mipmap.ic_data_origin_phone) {
                return iC;
            }
            if (c(strD, "06D")) {
                return R.mipmap.ic_data_origin_watch;
            }
            return R.mipmap.ic_data_origin_talkband;
        }
        return R.mipmap.ic_data_origin_unknow_device;
    }

    private static int c(int i) {
        int i2;
        if (f50369a.containsKey(Integer.valueOf(i))) {
            return f50369a.get(Integer.valueOf(i)).intValue();
        }
        edl pluginInfoByHiType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByHiType(i);
        int i3 = R.mipmap.ic_data_origin_phone;
        if (pluginInfoByHiType == null || pluginInfoByHiType.i() == null) {
            LogUtil.j("DataOriginIconUtils", "getDefaultTrack pluginInfo or pluginInfo.getWearDeviceInfo() is null");
            f50369a.put(Integer.valueOf(i), Integer.valueOf(i3));
            return i3;
        }
        if (pluginInfoByHiType.i().af() == 1) {
            i2 = R.mipmap.ic_data_origin_talkband;
        } else if (pluginInfoByHiType.i().af() == 2) {
            i2 = R.mipmap.ic_data_origin_watch;
        } else {
            i2 = R.mipmap.ic_data_origin_phone;
        }
        f50369a.put(Integer.valueOf(i), Integer.valueOf(i2));
        return i2;
    }

    private static boolean c(String str, String str2) {
        return str2.equals(str);
    }

    private static String d(int i) {
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(i));
        if (njy.b(listC)) {
            return listC.get(0).e();
        }
        return "";
    }
}
