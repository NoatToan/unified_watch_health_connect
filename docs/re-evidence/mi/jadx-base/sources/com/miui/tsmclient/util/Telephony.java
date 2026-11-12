package com.miui.tsmclient.util;

import android.telephony.SmsMessage;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Telephony {
    public static String createSmsFromPdu(byte[] bArr) {
        return SmsMessage.createFromPdu(bArr).getMessageBody();
    }

    public static List<String> getSIMNumber() {
        LinkedList linkedList = new LinkedList();
        Class<?> classFromName = ReflectUtil.getClassFromName("miui.telephony.TelephonyManager");
        Method method = ReflectUtil.getMethod(classFromName, "getDefault", new Class[0]);
        Method method2 = ReflectUtil.getMethod(classFromName, "getPhoneCount", new Class[0]);
        Object objInvoke = ReflectUtil.invoke(method, null, new Object[0]);
        Object objInvoke2 = ReflectUtil.invoke(method2, objInvoke, new Object[0]);
        if (objInvoke2 != null) {
            int iIntValue = ((Integer) objInvoke2).intValue();
            for (int i = 0; i < iIntValue; i++) {
                try {
                    Class cls = Integer.TYPE;
                    Object objCallObjectMethod = ReflectUtil.callObjectMethod(objInvoke, "hasIccCard", new Class[]{cls}, Integer.valueOf(i));
                    if (objCallObjectMethod != null && ((Boolean) objCallObjectMethod).booleanValue()) {
                        try {
                            Object objCallObjectMethod2 = ReflectUtil.callObjectMethod(ReflectUtil.invoke(ReflectUtil.getMethod(ReflectUtil.getClassFromName("android.telephony.SubscriptionManager"), "getDefault", new Class[0]), null, new Object[0]), "getSubscriptionInfoForSlot", new Class[]{cls}, Integer.valueOf(i));
                            if (objCallObjectMethod2 != null) {
                                String str = (String) ReflectUtil.callObjectMethod(objCallObjectMethod2, "getDisplayNumber", null, new Object[0]);
                                if (TextUtils.isEmpty(str)) {
                                    linkedList.add("13100000000");
                                } else {
                                    linkedList.add("1310000" + tail(str, 4));
                                }
                            } else {
                                linkedList.add("13100000000");
                            }
                        } catch (Exception e) {
                            LogUtils.e("getSIMNumber", e);
                            linkedList.add("13100000000");
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return linkedList;
    }

    private static String tail(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(str.length() - i);
    }
}
