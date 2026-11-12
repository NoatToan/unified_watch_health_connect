package com.huawei.hms.health;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class aaca {
    private static int aab = -1;
    private static final aaba[] aaba;
    private static final List<Integer> aabb = Arrays.asList(0, 1, 2);

    /* JADX WARN: Code duplicated, block: B:55:0x0121 A[PHI: r5
      0x0121: PHI (r5v5 int) = (r5v4 int), (r5v7 int) binds: [B:51:0x011b, B:53:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0121, please report this as an issue */
    private static int aab(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2 = "";
        if (aab != -1) {
            StringBuilder sbAab = com.huawei.hms.health.aab.aab("get deviceType from cache: ");
            sbAab.append(aab);
            aabz.aabb("DeviceTypeTool", sbAab.toString());
        } else {
            if (context != null) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    aabz.aab("DeviceTypeTool", "packageManager is null.");
                    i = -1;
                } else {
                    FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
                    i = -1;
                    for (FeatureInfo featureInfo : systemAvailableFeatures) {
                        String str3 = featureInfo.name;
                        if (!TextUtils.isEmpty(str3) && str3.startsWith("com.huawei.software.features.")) {
                            String strSubstring = str3.substring(29);
                            for (aaba aabaVar : aaba) {
                                if (strSubstring.equals(aabaVar.aaba)) {
                                    i = aabaVar.aab;
                                    if (!aabaVar.aabb) {
                                        break;
                                    }
                                }
                            }
                            if (i != -1) {
                                StringBuilder sbAab2 = com.huawei.hms.health.aab.aab("Huawei Feature is found: ");
                                sbAab2.append(featureInfo.name);
                                aabz.aabb("DeviceTypeTool", sbAab2.toString());
                                break;
                            }
                        }
                    }
                    if (i == -1) {
                        i = -1;
                    } else if (i == 0) {
                    }
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        Object objInvoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, "ro.build.characteristics", "");
                        if (objInvoke instanceof String) {
                            Objects.toString(objInvoke);
                            str2 = (String) objInvoke;
                        }
                    } catch (Exception unused) {
                        aabz.aaba("DeviceTypeTool", "An exception occurred while reading SystemProperties: ro.build.characteristics");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        i2 = -1;
                    } else {
                        List listAsList = Arrays.asList(str2.split(",", 10));
                        Objects.toString(listAsList);
                        String str4 = null;
                        i2 = -1;
                        for (aaba aabaVar2 : aaba) {
                            if (listAsList.contains(aabaVar2.aabc)) {
                                i2 = aabaVar2.aab;
                                str4 = aabaVar2.aabc;
                                if (!aabaVar2.aabb) {
                                    break;
                                }
                            }
                        }
                        if (i2 != -1) {
                            aabz.aabb("DeviceTypeTool", "System property is found: " + str4);
                        }
                    }
                    if (i2 != -1) {
                        i = i2;
                        if (i2 == 0) {
                            i3 = -1;
                            for (FeatureInfo featureInfo2 : systemAvailableFeatures) {
                                str = featureInfo2.name;
                                if (TextUtils.isEmpty(str) && str.startsWith("android.hardware.type.")) {
                                    String strSubstring2 = str.substring(22);
                                    for (aaba aabaVar3 : aaba) {
                                        if (strSubstring2.equals(aabaVar3.aabd)) {
                                            i3 = aabaVar3.aab;
                                            break;
                                        }
                                    }
                                    if (i3 != -1) {
                                        StringBuilder sbAab3 = com.huawei.hms.health.aab.aab("Android Feature is found: ");
                                        sbAab3.append(featureInfo2.name);
                                        aabz.aabb("DeviceTypeTool", sbAab3.toString());
                                        break;
                                    }
                                }
                            }
                            if (i3 != -1) {
                                i = i3;
                            }
                        }
                    } else {
                        i3 = -1;
                        while (i4 < r0) {
                            str = featureInfo2.name;
                            if (TextUtils.isEmpty(str)) {
                            }
                        }
                        if (i3 != -1) {
                            i = i3;
                        }
                    }
                }
                if (i != -1) {
                    aab = i;
                }
                StringBuilder sbAab4 = com.huawei.hms.health.aab.aab("Final DeviceType: ");
                sbAab4.append(aab);
                aabz.aabb("DeviceTypeTool", sbAab4.toString());
                return i;
            }
            aabz.aab("DeviceTypeTool", "context is null.");
        }
        return aab;
    }

    static final class aaba {
        private int aab;
        private String aaba;
        private boolean aabb;
        private String aabc;
        private String aabd;

        /* synthetic */ aaba(int i, String str, boolean z, String str2, String str3, aab aabVar) {
            this.aab = i;
            this.aaba = str;
            this.aabb = z;
            this.aabc = str2;
            this.aabd = str3;
        }
    }

    public static int aabb(Context context) {
        return aab(context);
    }

    static boolean aaba(Context context) {
        int iAab = aab(context);
        return aabb.contains(Integer.valueOf(iAab)) || iAab == -1;
    }

    static {
        boolean z = false;
        String str = null;
        aab aabVar = null;
        boolean z2 = true;
        aab aabVar2 = null;
        aaba = new aaba[]{new aaba(0, "handset", false, "default", null, null), new aaba(1, "pad", z, "tablet", str, aabVar), new aaba(2, DeviceTypeConsts.WATCH, z2, DeviceTypeConsts.WATCH, DeviceTypeConsts.WATCH, aabVar2), new aaba(3, "kidwatch", z, "kidwatch", str, aabVar), new aaba(4, "tv", z2, "tv", "television", aabVar2), new aaba(5, "mobiletv", z, "mobiletv", str, aabVar), new aaba(6, "glass", false, null, null, aabVar2), new aaba(7, "earphone", z, null, str, aabVar), new aaba(8, "car", false, "car", "automotive", null)};
    }
}
