package defpackage;

import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.android.telephony.SubscriptionManagerEx;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nfc {
    private static final Object e = new Object();
    private static final String[] d = {"android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f43053a = new HashMap(16);

    public static boolean i() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "DualSimCardUtils");
        if (deviceList.isEmpty()) {
            LogUtil.j("DualSimCardUtils", "isSupportSmsReject deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceList.get(0), 16);
        LogUtil.a("DualSimCardUtils", "Is device SupportSmsReject inComingCall? ", Boolean.valueOf(zD));
        return zD;
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DualSimCardUtils", "doPhoneRing saveCallingSimId incomingNumber is empty");
            return;
        }
        synchronized (e) {
            int iC = c();
            f43053a.put(str, Integer.valueOf(iC));
            LogUtil.a("DualSimCardUtils", "doPhoneRing saveCallingSimId into SUBSCRIPTION_ID_MAP success,subscriptionId: ", Integer.valueOf(iC));
        }
    }

    public static int e(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map<String, Integer> map = f43053a;
            if (map.containsKey(str)) {
                synchronized (e) {
                    Integer num = map.get(str);
                    if (num == null) {
                        LogUtil.j("DualSimCardUtils", "sendSms get subId is null");
                        xjt.am("sendSms get subId is null");
                        return -1;
                    }
                    return num.intValue();
                }
            }
        }
        LogUtil.j("DualSimCardUtils", "get incomingNumber is empty or map not containsKey");
        return -1;
    }

    public static void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map<String, Integer> map = f43053a;
            if (map.containsKey(str)) {
                synchronized (e) {
                    map.remove(str);
                }
                return;
            }
        }
        LogUtil.j("DualSimCardUtils", "remove incomingNumber is empty or map not containsKey");
    }

    public static void e() {
        synchronized (e) {
            f43053a.clear();
        }
    }

    public static boolean d() {
        return b() == 2;
    }

    public static boolean f() {
        return b() == 1;
    }

    public static int b() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = BaseApplication.getContext().getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                return ((TelephonyManager) systemService).getActiveModemCount();
            }
        }
        LogUtil.a("DualSimCardUtils", "getCurrentSimCount getActiveModemCount() failed,Build.VERSION_CODES: ", Integer.valueOf(Build.VERSION.SDK_INT));
        if (!lsg.d(BaseApplication.getContext(), d)) {
            LogUtil.j("DualSimCardUtils", "getCurrentSimCount have not READ_PHONE_STATE permission");
            return 0;
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(BaseApplication.getContext()).getActiveSubscriptionInfoList();
        if (coq.d(activeSubscriptionInfoList)) {
            LogUtil.e("DualSimCardUtils", "smsReply getCurrentSimCount no sim card");
            return 0;
        }
        int size = activeSubscriptionInfoList.size();
        LogUtil.a("DualSimCardUtils", "smsReply getCurrentSimCardCount is: ", Integer.valueOf(size));
        return size;
    }

    public static int c() {
        LogUtil.a("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId start!");
        List<Integer> listA = a();
        if (listA.isEmpty()) {
            return -1;
        }
        if (listA.size() == 1) {
            LogUtil.j("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId single sim:", listA.get(0));
            return listA.get(0).intValue();
        }
        Object systemService = BaseApplication.getContext().getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId object not instanceof TelephonyManager");
            return -1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        try {
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getCallState", Integer.TYPE);
            declaredMethod.setAccessible(true);
            for (Integer num : listA) {
                Object objInvoke = declaredMethod.invoke(telephonyManager, num);
                if (objInvoke instanceof Integer) {
                    Integer num2 = (Integer) objInvoke;
                    int iIntValue = num2.intValue();
                    LogUtil.a("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId callState:", num2, " multiSimSubId:", num);
                    if (iIntValue == 1) {
                        return num.intValue();
                    }
                }
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            LogUtil.e("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId exception", LogAnonymous.b(e2));
        }
        LogUtil.a("DualSimCardUtils", "doPhoneRing saveCallingSimId getCurrentSubscriptionId other");
        return -1;
    }

    public static List<Integer> a() {
        SystemInfo.d(new StringBuilder("getDualSimSubscriptionIds start: "));
        ArrayList arrayList = new ArrayList(2);
        if (!lsg.d(BaseApplication.getContext(), d)) {
            LogUtil.j("DualSimCardUtils", "getDualSimSubscriptionIds have not READ_PHONE_STATE permission");
            return arrayList;
        }
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(BaseApplication.getContext()).getActiveSubscriptionInfoList();
        if (coq.d(activeSubscriptionInfoList)) {
            LogUtil.j("DualSimCardUtils", "getDualSimSubscriptionIds no sim");
            return arrayList;
        }
        Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getSubscriptionId()));
        }
        return arrayList;
    }

    public static SmsManager a(int i) {
        LogUtil.a("DualSimCardUtils", "smsReply getSmsManager start!,input param: code= ", Integer.valueOf(i));
        SmsManager smsManager = SmsManager.getDefault();
        if (f()) {
            LogUtil.a("DualSimCardUtils", "smsReply getSmsManager current is single sim card");
            return smsManager;
        }
        int iD = d(i);
        ReleaseLogUtil.c("DualSimCardUtils", "smsReply getSmsManager subscriptionId: ", Integer.valueOf(iD), " code:", Integer.valueOf(i));
        return iD != -1 ? SmsManager.getSmsManagerForSubscriptionId(iD) : smsManager;
    }

    public static int c(int i) {
        if (!lsg.d(BaseApplication.getContext(), d)) {
            LogUtil.j("DualSimCardUtils", "smsReply getSmsManager have not READ_PHONE_STATE permission");
            return -1;
        }
        SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = SubscriptionManager.from(BaseApplication.getContext()).getActiveSubscriptionInfoForSimSlotIndex(i);
        LogUtil.a("DualSimCardUtils", "smsReply getSmsManager subInfo is ", Boolean.valueOf(activeSubscriptionInfoForSimSlotIndex != null));
        if (activeSubscriptionInfoForSimSlotIndex != null) {
            return activeSubscriptionInfoForSimSlotIndex.getSubscriptionId();
        }
        if (i > 1) {
            return i;
        }
        LogUtil.j("DualSimCardUtils", "smsReply getSmsManager subInfo is null and slotId less than 1");
        return -1;
    }

    private static int d(int i) {
        String strB = ndj.b("DualSimCardUtils");
        if (CommonUtil.bg()) {
            if (TextUtils.equals(strB, "com.google.android.apps.messaging")) {
                return i;
            }
            int[] subId = SubscriptionManagerEx.getSubId(i);
            if (subId != null && subId.length > 0) {
                return subId[0];
            }
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                return c(i);
            }
            if (i == 0) {
                int[] subscriptionIds = SubscriptionManager.from(BaseApplication.getContext()).getSubscriptionIds(i);
                if (subscriptionIds != null && subscriptionIds.length > 0) {
                    return subscriptionIds[0];
                }
            } else {
                if (i > 1) {
                    return i;
                }
                boolean zE = ndj.e("DualSimCardUtils");
                ReleaseLogUtil.c("DualSimCardUtils", "smsReply getSmsManager getSubscriptionId isSubIdHasZero: ", Boolean.valueOf(zE));
                if (!zE) {
                    return i;
                }
                int[] subscriptionIds2 = SubscriptionManager.from(BaseApplication.getContext()).getSubscriptionIds(i);
                if (subscriptionIds2 != null && subscriptionIds2.length > 0) {
                    return subscriptionIds2[0];
                }
            }
        }
        return -1;
    }
}
