package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class nst {
    public static boolean d(SmartMsgDbObject smartMsgDbObject) {
        return (smartMsgDbObject == null || smartMsgDbObject.getStatus() == 1) ? false : true;
    }

    public static boolean c(SmartMsgDbObject smartMsgDbObject) {
        return smartMsgDbObject != null && smartMsgDbObject.getExpireTime() > 0 && smartMsgDbObject.getExpireTime() < ltb.f();
    }

    public static boolean d(String str) {
        int i;
        int i2;
        if (str == null || str.length() < 8) {
            return false;
        }
        int iC = c();
        try {
            i = Integer.parseInt(str.substring(0, 4));
            try {
                i2 = Integer.parseInt(str.substring(4, 8));
            } catch (NumberFormatException e) {
                e = e;
                LogUtil.e("SMART_SmartDataInteractors", "judgeDisplayTime NumberFormatException ", e.getMessage());
                i2 = 0;
            }
        } catch (NumberFormatException e2) {
            e = e2;
            i = 0;
        }
        int length = str.length();
        if (length != 8) {
            if (length != 16) {
                return false;
            }
            try {
                int i3 = Integer.parseInt(str.substring(8, 12));
                int i4 = Integer.parseInt(str.substring(12, 16));
                if ((iC < i || iC > i2) && (iC < i3 || iC > i4)) {
                    return false;
                }
            } catch (NumberFormatException e3) {
                LogUtil.e("SMART_SmartDataInteractors", "judgeDisplayTime TWO_PERIODS_OF_TIME NumberFormatException", e3.getMessage());
                return false;
            }
        } else if (iC < i || iC > i2) {
            return false;
        }
        return true;
    }

    public static int c() {
        return qrs.a(new SimpleDateFormat("HHmm").format(new Date(System.currentTimeMillis())));
    }

    public static boolean a(SmartMsgDbObject smartMsgDbObject) {
        if (smartMsgDbObject == null) {
            return false;
        }
        return smartMsgDbObject.getMsgType() == 10000 || smartMsgDbObject.getMsgType() == 10002 || smartMsgDbObject.getMsgType() == 20006 || smartMsgDbObject.getMsgSrc() == 4;
    }

    public static boolean c(SmartMsgDbObject smartMsgDbObject, int i) {
        if (smartMsgDbObject != null && smartMsgDbObject.getStatus() == 1 && smartMsgDbObject.getShowCount() < i) {
            return smartMsgDbObject.getExpireTime() <= 0 || smartMsgDbObject.getExpireTime() >= ltb.f();
        }
        return false;
    }
}
