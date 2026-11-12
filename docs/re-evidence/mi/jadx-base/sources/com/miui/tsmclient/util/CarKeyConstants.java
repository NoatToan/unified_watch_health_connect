package com.miui.tsmclient.util;

import com.tsmclient.smartcard.Coder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CarKeyConstants {
    public static final String CCC_ACTION_VEHICLE_TRIGGERED_LOCK = "50";
    public static final String CCC_ACTION_VEHICLE_TRIGGERED_UNLOCK = "51";
    private static final int CCC_FUNCTION_ID_CENTRAL_LOCKING = 1;
    private static final int CCC_FUNCTION_ID_LOCK_SECURE = 2;
    private static final int ICCOA_FUNCTION_ID_LOOKING_FOR_CAR = 5;
    public static final int ICCOA_RKE_FUNCTION_ACTION_ID_CLOSE = 2;
    public static final int ICCOA_RKE_FUNCTION_ACTION_ID_OPEN = 1;
    public static final int PASSIVE_ENTRY_DISABLE = 2;
    public static final int PASSIVE_ENTRY_ENABLE = 1;
    public static final int RKE_FUNCTION_ACTION_ID_CLOSE = 0;
    public static final int RKE_FUNCTION_ACTION_ID_OPEN = 1;
    public static final int RKE_FUNCTION_STATUS_ID_CLOSE = 0;
    public static final int RKE_FUNCTION_STATUS_ID_OPEN = 1;
    public static Map<Integer, List<Integer>> sRKEStatusOfCCC = new HashMap();
    public static List<Integer> sRKEWithoutEntityOfICCOA = new ArrayList();
    private static final List<String> WHITE_LIST_RKE_AND_PWD = Arrays.asList("0002", "0004");

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(3);
        sRKEStatusOfCCC.put(2, arrayList);
        sRKEWithoutEntityOfICCOA.add(5);
    }

    public static boolean isActionVehicleTriggeredWithCCC(int i) {
        return Coder.hexStringToInt(CCC_ACTION_VEHICLE_TRIGGERED_LOCK) == i || Coder.hexStringToInt(CCC_ACTION_VEHICLE_TRIGGERED_UNLOCK) == i;
    }

    public static boolean isCheckDeviceSecure(String str) {
        return WHITE_LIST_RKE_AND_PWD.contains(str);
    }

    public static boolean isFunctionIdOfLockWithCCC(int i) {
        return 1 == i || 2 == i;
    }

    public static boolean isRKESupportedInInactiveStatus(String str) {
        return WHITE_LIST_RKE_AND_PWD.contains(str);
    }
}
