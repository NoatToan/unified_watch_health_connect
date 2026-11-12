package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.videoedit.utils.ListUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, String> f41494a = new HashMap(16);

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWheelSizeInfo", "configData id is empty");
        } else {
            f41494a.put(str, str2);
            c(str);
        }
    }

    private static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwWheelSizeInfo", "fetchRimSizeCode id is empty");
            return;
        }
        String str2 = f41494a.get(str);
        LogUtil.a("HwWheelSizeInfo", "rimSizeCode: ", str2);
        if (str2 == null) {
            LogUtil.j("HwWheelSizeInfo", "rimSizeCode is null");
        } else {
            d(str, str2);
        }
    }

    private static void d(String str, String str2) {
        try {
            List<eew> listE = new eet().b(str2).e();
            if (ListUtil.isEmpty(listE)) {
                LogUtil.j("HwWheelSizeInfo", "parseConfigData tlvList is null or empty");
                return;
            }
            med.c().a().d(str);
            for (eew eewVar : listE) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 8:
                        med.c().a().a(CommonUtil.x(eewVar.b()));
                        break;
                    case 9:
                        med.c().a().e(CommonUtil.v(eewVar.b()));
                        break;
                    case 10:
                        med.c().a().c(CommonUtil.v(eewVar.b()));
                        break;
                    case 11:
                        med.c().a().b(CommonUtil.v(eewVar.b()));
                        break;
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "parseConfigData default branches.";
                        LogUtil.j("HwWheelSizeInfo", objArr);
                        break;
                }
            }
        } catch (eeu e) {
            LogUtil.e("HwWheelSizeInfo", "parseConfigData tlvException11: ", ExceptionUtils.c(e));
        } catch (NumberFormatException e2) {
            LogUtil.e("HwWheelSizeInfo", "parseConfigData numberFormatException: ", ExceptionUtils.c(e2));
        }
    }
}
