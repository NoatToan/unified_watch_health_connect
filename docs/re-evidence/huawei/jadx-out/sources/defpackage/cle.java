package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.LogUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceCapability f1709a;

    private cle(DeviceCapability deviceCapability) {
        this.f1709a = deviceCapability;
    }

    private static boolean e(LinkedHashMap<String, Boolean> linkedHashMap, DeviceCapability deviceCapability) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            LogUtil.e("UpdateDeviceCapability", "receiveData is empty");
            return false;
        }
        if (deviceCapability != null) {
            return true;
        }
        LogUtil.e("UpdateDeviceCapability", "deviceCapability is null");
        return false;
    }

    public static void a(LinkedHashMap<String, Boolean> linkedHashMap, DeviceCapability deviceCapability) {
        if (e(linkedHashMap, deviceCapability)) {
            cle cleVar = new cle(deviceCapability);
            for (Map.Entry<String, Boolean> entry : linkedHashMap.entrySet()) {
                String key = entry.getKey();
                if (TextUtils.isEmpty(key) || !key.contains(".")) {
                    LogUtil.d("UpdateDeviceCapability", "key = ", key);
                    return;
                }
                Boolean value = entry.getValue();
                String strSubstring = key.substring(0, key.indexOf("."));
                try {
                    int i = Integer.parseInt(strSubstring);
                    if (i <= 13) {
                        cleVar.a(strSubstring, key, value);
                    } else if (i <= 25) {
                        cleVar.c(strSubstring, key, value);
                    } else if (i <= 35) {
                        cleVar.e(strSubstring, key, value);
                    } else {
                        cleVar.b(strSubstring, key, value);
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.d("UpdateDeviceCapability", "updateDeviceCapability NumberFormatException exception");
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 1, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case 49: goto B:54:0x00a2
     case 50: goto B:50:0x0097
     case 51: goto B:46:0x008c
     case 52: goto B:42:0x0081
     case 53: goto B:38:0x0076
     case 54: goto B:34:0x006b
     case 55: goto B:30:0x0060
     case 56: goto B:26:0x0055
     case 57: goto B:22:0x0047
     default: goto B:4:0x000a A[RegionRef:SW:3]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(String str, String str2, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 50:
                if (!str.equals("2")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 51:
                if (!str.equals("3")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 52:
                if (!str.equals("4")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 53:
                if (!str.equals("5")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 54:
                if (!str.equals("6")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 55:
                if (!str.equals("7")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 56:
                if (!str.equals("8")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 57:
                if (!str.equals("9")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            default:
                switch (str) {
                    case "10":
                        b2 = 9;
                        break;
                    case "11":
                        b2 = 10;
                        break;
                    case "12":
                        b2 = 11;
                        break;
                    case "13":
                        b2 = 12;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                break;
        }
        switch (b2) {
            case 0:
                j(str2, bool);
                break;
            case 1:
                ai(str2, bool);
                break;
            case 2:
                c(str2, bool);
                break;
            case 3:
                h(str2, bool);
                break;
            case 4:
                am(str2, bool);
                break;
            case 5:
                ab(str2, bool);
                break;
            case 6:
                l(str2, bool);
                break;
            case 7:
                b(str2, bool);
                break;
            case 8:
                ae(str2, bool);
                break;
            case 9:
                v(str2, bool);
                break;
            case 10:
                q(str2, bool);
                break;
            case 11:
                k(str2, bool);
                break;
            case 12:
                ak(str2, bool);
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "updateBaseCapability unknown serviceId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 1, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case 1571: goto B:50:0x0094
     case 1572: goto B:46:0x0089
     case 1573: goto B:42:0x007e
     case 1574: goto B:38:0x0073
     case 1575: goto B:34:0x0068
     case 1576: goto B:30:0x005d
     default: goto B:4:0x000a A[RegionRef:SW:3]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void c(String str, String str2, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 1571:
                if (!str.equals("14")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1572:
                if (!str.equals("15")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1573:
                if (!str.equals("16")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1574:
                if (!str.equals("17")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1575:
                if (!str.equals("18")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1576:
                if (!str.equals("19")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            default:
                switch (str) {
                    case "20":
                        b2 = 6;
                        break;
                    case "21":
                        b2 = 7;
                        break;
                    case "22":
                        b2 = 8;
                        break;
                    case "23":
                        b2 = 9;
                        break;
                    case "24":
                        b2 = 10;
                        break;
                    case "25":
                        b2 = 11;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                break;
        }
        switch (b2) {
            case 0:
                z(str2, bool);
                break;
            case 1:
                aw(str2, bool);
                break;
            case 2:
                a(str2, bool);
                break;
            case 3:
                ad(str2, bool);
                break;
            case 4:
                o(str2, bool);
                break;
            case 5:
                e(str2, bool);
                break;
            case 6:
                x(str2, bool);
                break;
            case 7:
                aj(str2, bool);
                break;
            case 8:
                g(str2, bool);
                break;
            case 9:
                at(str2, bool);
                break;
            case 10:
                p(str2, bool);
                break;
            case 11:
                s(str2, bool);
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "updateHealthCapability unknown serviceId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0009: IF  (r0v0 int) != (1604 int)  -> B:4:0x000b A[HIDDEN]
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (1605 int)  -> B:6:0x000f A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (1607 int)  -> B:8:0x0013 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private void e(String str, String str2, Boolean bool) {
        byte b2;
        str.hashCode();
        if (iHashCode != 1604) {
            if (iHashCode != 1605) {
                if (iHashCode != 1607) {
                    switch (str) {
                        case "32":
                            b2 = 3;
                            break;
                        case "33":
                            b2 = 4;
                            break;
                        case "34":
                            b2 = 5;
                            break;
                        case "35":
                            b2 = 6;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                } else if (str.equals(HealthZonePushReceiver.SLEEP_TIME_NOTIFY)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(HealthZonePushReceiver.BLOOD_SUGAR_DAWN_NOTIFY)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("26")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                d(str2, bool);
                break;
            case 1:
                ap(str2, bool);
                break;
            case 2:
                ac(str2, bool);
                break;
            case 3:
                ar(str2, bool);
                break;
            case 4:
                u(str2, bool);
                break;
            case 5:
                af(str2, bool);
                break;
            case 6:
                ah(str2, bool);
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "updateExpansionCapability unknown serviceId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 6, list:
      (r0v0 int) from 0x0009: IF  (r0v0 int) != (1662 int)  -> B:4:0x000b A[HIDDEN]
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (1663 int)  -> B:6:0x000f A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (1665 int)  -> B:8:0x0013 A[HIDDEN]
      (r0v0 int) from 0x0015: IF  (r0v0 int) != (1666 int)  -> B:10:0x0017 A[HIDDEN]
      (r0v0 int) from 0x0019: IF  (r0v0 int) != (1668 int)  -> B:12:0x001b A[HIDDEN]
      (r0v0 int) from 0x001e: SWITCH (r0v0 int)
     case 1691: goto B:27:0x004d
     case 1692: goto B:23:0x003f
     case 1693: goto B:19:0x0031
     case 1694: goto B:15:0x0023
     default: goto B:65:0x00be A[RegionRef:SW:13]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b(String str, String str2, Boolean bool) {
        byte b2;
        str.hashCode();
        if (iHashCode != 1662) {
            if (iHashCode != 1663) {
                if (iHashCode != 1665) {
                    if (iHashCode != 1666) {
                        if (iHashCode != 1668) {
                            switch (str) {
                                case "36":
                                    b2 = 0;
                                    break;
                                case "37":
                                    b2 = 1;
                                    break;
                                case "38":
                                    b2 = 2;
                                    break;
                                case "39":
                                    b2 = 3;
                                    break;
                                default:
                                    switch (str) {
                                        case 1691:
                                            if (!str.equals("50")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 9;
                                            }
                                            break;
                                        case 1692:
                                            if (!str.equals("51")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 10;
                                            }
                                            break;
                                        case 1693:
                                            if (!str.equals("52")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 11;
                                            }
                                            break;
                                        case 1694:
                                            if (!str.equals("53")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 12;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                            }
                        } else if (str.equals("48")) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("46")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("45")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL)) {
                b2 = 5;
            } else {
                b2 = -1;
            }
        } else if (str.equals("42")) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                al(str2, bool);
                break;
            case 1:
                aa(str2, bool);
                break;
            case 2:
                av(str2, bool);
                break;
            case 3:
                ao(str2, bool);
                break;
            case 4:
                y(str2, bool);
                break;
            case 5:
                as(str2, bool);
                break;
            case 6:
                an(str2, bool);
                break;
            case 7:
                r(str2, bool);
                break;
            case 8:
                ag(str2, bool);
                break;
            case 9:
                w(str2, bool);
                break;
            case 10:
                aq(str2, bool);
                break;
            case 11:
                t(str2, bool);
                break;
            case 12:
                ax(str2, bool);
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "updateIntelligentCapability unknown serviceId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    private void j(String str, Boolean bool) {
        str.hashCode();
        switch (str) {
            case "1.4":
                this.f1709a.configureSupportTimeSetting(bool.booleanValue());
                break;
            case "1.7":
                this.f1709a.configureSupportGetFirmwareVersion(bool.booleanValue());
                break;
            case "1.8":
                this.f1709a.configureSupportGetBattery(bool.booleanValue());
                break;
            case "1.9":
                this.f1709a.configureAutoLightScreen(bool.booleanValue());
                break;
            case "1.10":
                this.f1709a.configureAvoidDisturb(bool.booleanValue());
                break;
            case "1.26":
                this.f1709a.configureSupportLeftRightHandWearMode(bool.booleanValue());
                break;
            case "1.27":
                this.f1709a.configureRotateSwitchScreen(bool.booleanValue());
                break;
            case "1.29":
                this.f1709a.configureSupportQueryAllowDisturbContent(bool.booleanValue());
                break;
            case "1.43":
                this.f1709a.configureSupportAppId(bool.booleanValue());
                break;
            case "1.48":
                this.f1709a.configureSupportUserSetting(bool.booleanValue());
                break;
            default:
                i(str, bool);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case 1505535: goto B:43:0x007b
     case 1505536: goto B:39:0x0070
     default: goto B:4:0x000a A[RegionRef:SW:3]
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 1505597: goto B:19:0x0039
     case 1505598: goto B:15:0x002e
     case 1505599: goto B:11:0x0020
     case 1505600: goto B:7:0x0012
     default: goto B:45:0x0083 A[RegionRef:SW:5]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void i(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 1505535:
                if (!str.equals("1.13")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1505536:
                if (!str.equals("1.14")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            default:
                switch (str) {
                    case "1.16":
                        b2 = 2;
                        break;
                    case "1.17":
                        b2 = 3;
                        break;
                    case "1.18":
                        b2 = 4;
                        break;
                    case "1.19":
                        b2 = 5;
                        break;
                    default:
                        switch (str) {
                            case 1505597:
                                if (!str.equals("1.33")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 1505598:
                                if (!str.equals("1.34")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 1505599:
                                if (!str.equals("1.35")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            case 1505600:
                                if (!str.equals("1.36")) {
                                    b2 = -1;
                                } else {
                                    b2 = 9;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                }
                break;
        }
        switch (b2) {
            case 0:
                this.f1709a.configureFactoryReset(bool.booleanValue());
                break;
            case 1:
                this.f1709a.configureSupportPairDevice(bool.booleanValue());
                break;
            case 2:
                this.f1709a.configureSupportGetHandsetInfo(bool.booleanValue());
                break;
            case 3:
                this.f1709a.configureSupportNotificationIntervalInfo(bool.booleanValue());
                break;
            case 4:
                this.f1709a.configureSupportActivityType(bool.booleanValue());
                break;
            case 5:
                this.f1709a.configureSupportAuthenticDevice(bool.booleanValue());
                break;
            case 6:
                this.f1709a.setSupportDefaultSwitch(bool.booleanValue());
                break;
            case 7:
                this.f1709a.configureSupportIntelligentHomeLinkage(bool.booleanValue());
                break;
            case 8:
                this.f1709a.configureIsSupportNotifyDeviceBroadCast(bool.booleanValue());
                break;
            case 9:
                this.f1709a.configureIsSupportPhonesInfo(bool.booleanValue());
                break;
            default:
                f(str, bool);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    private void f(String str, Boolean bool) {
        str.hashCode();
        switch (str) {
            case "1.20":
                this.f1709a.configureGoldCard(bool.booleanValue());
                break;
            case "1.41":
                this.f1709a.configureSupportRemoteCamera(bool.booleanValue());
                break;
            case "1.46":
                this.f1709a.configureSupportHttps(bool.booleanValue());
                break;
            case "1.47":
                this.f1709a.configureSupportSyncWifi(bool.booleanValue());
                break;
            case "1.49":
                this.f1709a.configureSupportSettingRelated(bool.booleanValue());
                break;
            case "1.50":
                this.f1709a.configureSupportZoneId(bool.booleanValue());
                break;
            case "1.53":
                this.f1709a.configureSupportConnectStatus(bool.booleanValue());
                break;
            case "1.54":
                this.f1709a.configureSupportSyncTime(bool.booleanValue());
                break;
            case "1.55":
                this.f1709a.configureSupportExpandCapability(bool.booleanValue());
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "setDmsOthersCapability unknown commandId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    private void ai(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 49525:
                if (!str.equals("2.1")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 49526:
            case 49527:
            default:
                b2 = -1;
                break;
            case 49528:
                if (!str.equals("2.4")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 49529:
                if (!str.equals("2.5")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 49530:
                if (!str.equals("2.6")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 49531:
                if (!str.equals("2.7")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 49532:
                if (!str.equals("2.8")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureMessageAlert(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSupportMessageAlertInfo(bool.booleanValue());
            return;
        }
        if (b2 == 2) {
            this.f1709a.configureSupportMessageSupportInfo(bool.booleanValue());
            return;
        }
        if (b2 == 3) {
            this.f1709a.configureSupportDeleteMsg(bool.booleanValue());
            return;
        }
        if (b2 == 4) {
            this.f1709a.configureupportMessageCenterPushDevice(bool.booleanValue());
        } else if (b2 == 5) {
            this.f1709a.configureSupportWearMessagePush(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setNotificationCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    private void c(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 50486:
                if (!str.equals("3.1")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 50487:
            default:
                b2 = -1;
                break;
            case 50488:
                if (!str.equals("3.3")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 50489:
                if (!str.equals(Constants.INTER_VERSION)) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureContacts(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSyncHiCall(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureSyncContacts(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setAddressBookCapability unknown commandId.");
        }
    }

    private void h(String str, Boolean bool) {
        if ("4.1".equals(str)) {
            this.f1709a.configureSupportCallingOperationType(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setCallingCapability unknown commandId.");
        }
    }

    private void am(String str, Boolean bool) {
        if ("5.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setPingRingCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setPingRingCapability unknown commandId.");
        }
    }

    private void ab(String str, Boolean bool) {
        if ("6.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setMusicCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMusicCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    private void l(String str, Boolean bool) {
        str.hashCode();
        switch (str) {
            case "7.3":
                this.f1709a.configureSupportSportTotal(bool.booleanValue());
                break;
            case "7.14":
                this.f1709a.configureSupportThreshold(bool.booleanValue());
                break;
            case "7.16":
                this.f1709a.configureReserveSync(bool.booleanValue());
                break;
            case "7.19":
                this.f1709a.configureIsSupportHeartRateZone(bool.booleanValue());
                break;
            case "7.21":
                this.f1709a.configureSupportGetUserInfo(bool.booleanValue());
                break;
            case "7.22":
                this.f1709a.configureIsSupportCoreSleep(bool.booleanValue());
                break;
            case "7.23":
                this.f1709a.configureisSupportHeartRateEnable(bool.booleanValue());
                break;
            case "7.24":
                this.f1709a.configureIsSupportSendCoreSleepOutState(bool.booleanValue());
                break;
            case "7.27":
                this.f1709a.configureIsSupportQueryDeviceCoreSleepSwitch(bool.booleanValue());
                break;
            case "7.28":
                this.f1709a.configureSupportContinueHeartRate(bool.booleanValue());
                break;
            default:
                n(str, bool);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    private void n(String str, Boolean bool) {
        str.hashCode();
        switch (str) {
            case "7.29":
                this.f1709a.configureHeartRateRaiseAlarm(bool.booleanValue());
                break;
            case "7.30":
                this.f1709a.configureGetHeartRateRaiseAlarmNumber(bool.booleanValue());
                break;
            case "7.31":
                this.f1709a.configureGetHighAndMiddleSport(bool.booleanValue());
                break;
            case "7.33":
                this.f1709a.configureSetHrrHeartRateCapability(bool.booleanValue());
                break;
            case "7.34":
                this.f1709a.configureHeartRateDownAlarm(bool.booleanValue());
                break;
            case "7.35":
                this.f1709a.configureSupportRestHeartRateControls(bool.booleanValue());
                break;
            case "7.36":
                this.f1709a.configureCycleBloodOxygenSwitch(bool.booleanValue());
                break;
            case "7.37":
                this.f1709a.configureBloodOxygenDownRemind(bool.booleanValue());
                break;
            case "7.40":
                this.f1709a.configureRunPaceSetCapability(bool.booleanValue());
                break;
            case "7.41":
                this.f1709a.configureSupportMediumToHighStrengthPreValue(bool.booleanValue());
                break;
            default:
                m(str, bool);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 2, list:
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (54330 int)  -> B:4:0x000f A[HIDDEN]
      (r0v0 int) from 0x0012: IF  (r0v0 int) != (1684278 int)  -> B:6:0x0014 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private void m(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        if (iHashCode != 54330) {
            if (iHashCode != 1684278) {
                switch (str) {
                    case "7.5":
                        b2 = 1;
                        break;
                    case "7.6":
                        b2 = 2;
                        break;
                    case "7.7":
                        b2 = 3;
                        break;
                    case "7.8":
                        b2 = 4;
                        break;
                    case "7.9":
                        b2 = 5;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals("7.10")) {
                b2 = 6;
            } else {
                b2 = -1;
            }
        } else if (str.equals("7.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                if (bool != null && bool.booleanValue()) {
                    this.f1709a.configureMotionGoalCap(1);
                    break;
                }
                break;
            case 1:
                if (bool != null && bool.booleanValue()) {
                    LogUtil.b("UpdateDeviceCapability", "setFitnessSpecialCapability support TYPE_COMPRESSED");
                    this.f1709a.configureFitnessFrameType(0);
                    break;
                }
                break;
            case 2:
            case 3:
                this.f1709a.configureActivityReminder(bool.booleanValue());
                break;
            case 4:
                if (bool != null && bool.booleanValue()) {
                    LogUtil.b("UpdateDeviceCapability", "setFitnessSpecialCapability support TYPE_COMMON");
                    this.f1709a.configureFitnessFrameType(1);
                    break;
                }
                break;
            case 5:
                this.f1709a.configureSupportSetUserInfoEncrypt(bool.booleanValue());
                break;
            case 6:
                if (bool != null) {
                    if (bool.booleanValue()) {
                        LogUtil.b("UpdateDeviceCapability", "setFitnessSpecialCapability support TYPE_SEPARATED");
                        this.f1709a.configureFitnessFrameType(3);
                    }
                    this.f1709a.configureSupportSampleFrame(bool.booleanValue());
                }
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "setFitnessSpecialCapability unknown commandId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    private void b(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "8.1":
                b2 = 0;
                break;
            case "8.2":
                b2 = 1;
                break;
            case "8.3":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureEventAlarm(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSmartAlarm(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureChangeAlarm(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setAlarmCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 1, list:
      (r0v0 int) from 0x000f: IF  (r0v0 int) != (56252 int)  -> B:4:0x0011 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private void ae(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        if (str.hashCode() != 56252) {
            switch (str) {
                case "9.11":
                    b2 = 1;
                    break;
                case "9.12":
                    b2 = 2;
                    break;
                case "9.13":
                    b2 = 3;
                    break;
                case "9.14":
                    b2 = 4;
                    break;
                case "9.15":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
        } else if (str.equals("9.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureOtaUpdate(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSyncBeforeOta(bool.booleanValue());
            return;
        }
        if (b2 == 2) {
            this.f1709a.configureIsSupportAutoUpdate(bool.booleanValue());
            return;
        }
        if (b2 == 3) {
            this.f1709a.configureIsSupportUpdateChange(bool.booleanValue());
            return;
        }
        if (b2 == 4) {
            this.f1709a.configureIsSupportNotifyDeviceNewVersion(bool.booleanValue());
        } else if (b2 == 5) {
            this.f1709a.configureIsSupportDeviceRequestCheck(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setOtaCapability unknown commandId.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void v(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1507362) {
            if (iHashCode != 1507370) {
                if (iHashCode == 46728270 && str.equals("10.10")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("10.9")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("10.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureMaintenance(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureMaintenanceInTime(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureMaintenanceGetData(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMaintenanceCapability unknown commandId.");
        }
    }

    private void q(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("11.1")) {
            this.f1709a.configureSupportAntiLost(bool.booleanValue());
        } else if (str.equals("11.3")) {
            this.f1709a.configureBluetoothOffAlert(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setLinkLossCapability unknown commandId.");
        }
    }

    private void k(String str, Boolean bool) {
        if ("12.1".equals(str)) {
            this.f1709a.configureLanguage(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setFontCapability unknown commandId.");
        }
    }

    private void ak(String str, Boolean bool) {
        if ("13.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setPhoneBatteryCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setPhoneBatteryCapability unknown commandId.");
        }
    }

    private void z(String str, Boolean bool) {
        if ("14.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setMotionCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMotionCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x000a: IF  (r0v0 int) != (1512167 int)  -> B:4:0x000c A[HIDDEN]
      (r0v0 int) from 0x000f: IF  (r0v0 int) != (1512169 int)  -> B:6:0x0011 A[HIDDEN]
      (r0v0 int) from 0x0014: SWITCH (r0v0 int)
     case 46877225: goto B:17:0x0032
     case 46877226: goto B:13:0x0027
     case 46877227: goto B:9:0x0019
     default: goto B:43:0x007c A[RegionRef:SW:7]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void aw(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        if (iHashCode != 1512167) {
            if (iHashCode != 1512169) {
                switch (str) {
                    case "15.5":
                        b2 = 2;
                        break;
                    case "15.6":
                        b2 = 3;
                        break;
                    case "15.7":
                        b2 = 4;
                        break;
                    case "15.8":
                        b2 = 5;
                        break;
                    default:
                        switch (str) {
                            case 46877225:
                                if (!str.equals("15.10")) {
                                    b2 = -1;
                                } else {
                                    b2 = 6;
                                }
                                break;
                            case 46877226:
                                if (!str.equals("15.11")) {
                                    b2 = -1;
                                } else {
                                    b2 = 7;
                                }
                                break;
                            case 46877227:
                                if (!str.equals("15.12")) {
                                    b2 = -1;
                                } else {
                                    b2 = 8;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                }
            } else if (str.equals("15.3")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("15.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                this.f1709a.configureWeatherPush(bool.booleanValue());
                break;
            case 1:
                this.f1709a.configureSupportAtmosphere(bool.booleanValue());
                break;
            case 2:
                this.f1709a.configureSupportUnitWeather(bool.booleanValue());
                break;
            case 3:
                this.f1709a.configureAtmosphereSupportExpand(bool.booleanValue());
                break;
            case 4:
                this.f1709a.configureWeatherSupportErrorCode(bool.booleanValue());
                break;
            case 5:
                this.f1709a.configureWeatherSupportFutureInfo(bool.booleanValue());
                break;
            case 6:
                this.f1709a.setSupportDeviceFutureWeatherCapability(bool.booleanValue());
                break;
            case 7:
                this.f1709a.setSupportTide(bool.booleanValue());
                break;
            case 8:
                this.f1709a.setSupportWeatherErrorCode(bool.booleanValue());
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "setWeatherCapability unknown commandId.");
                break;
        }
    }

    private void a(String str, Boolean bool) {
        if ("16.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setCalendarCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setCalendarCapability unknown commandId.");
        }
    }

    private void ad(String str, Boolean bool) {
        if ("17.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setMusicManagementCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMusicManagementCapability unknown commandId.");
        }
    }

    private void o(String str, Boolean bool) {
        if ("18.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setFileTransferCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setFileTransferCapability unknown commandId.");
        }
    }

    private void e(String str, Boolean bool) {
        if ("19.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setBtFactoryTestCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setBtFactoryTestCapability unknown commandId.");
        }
    }

    private void x(String str, Boolean bool) {
        if ("20.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setMcuFactoryTestCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMcuFactoryTestCapability unknown commandId.");
        }
    }

    private void aj(String str, Boolean bool) {
        if ("21.1".equals(str)) {
            LogUtil.e("UpdateDeviceCapability", "setSensorCapability supportValue :", bool);
        } else {
            LogUtil.e("UpdateDeviceCapability", "setSensorCapability unknown commandId.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void g(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1539075) {
            if (iHashCode != 1539077) {
                if (iHashCode == 1539081 && str.equals("22.7")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("22.3")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("22.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportExerciseAdvice(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSupportExerciseAdviceTime(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureSupportExerciseAdviceMonitor(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setExerciseAdviceCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    private void at(String str, Boolean bool) {
        str.hashCode();
        switch (str) {
            case "23.1":
                this.f1709a.configureSupportWorkout(bool.booleanValue());
                break;
            case "23.4":
                this.f1709a.configureSupportWorkoutInfo(bool.booleanValue());
                break;
            case "23.6":
                this.f1709a.configureSupportWorkoutReminder(bool.booleanValue());
                break;
            case "23.7":
                this.f1709a.configureSupportWorkoutRecord(bool.booleanValue());
                break;
            case "23.11":
                this.f1709a.configureSupportWorkoutExerciseDisplayLink(bool.booleanValue());
                break;
            case "23.12":
                this.f1709a.configureSupportWorkoutRecordPaceMap(bool.booleanValue());
                break;
            case "23.16":
                this.f1709a.configureSupportRunPosture(bool.booleanValue());
                break;
            case "23.18":
                this.f1709a.configureSupportInformCloseOrOpen(bool.booleanValue());
                break;
            case "23.21":
                this.f1709a.configureSupportWorkoutCapabilicy(bool.booleanValue());
                break;
            case "23.23":
                this.f1709a.configureSupportWorkoutTrustHeartRate(bool.booleanValue());
                break;
            default:
                LogUtil.e("UpdateDeviceCapability", "setWorkoutCapability unknown commandId.");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    private void p(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 1540997:
                if (!str.equals("24.1")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1540998:
                if (!str.equals("24.2")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1540999:
            case 1541003:
            case 1541004:
            default:
                b2 = -1;
                break;
            case 1541000:
                if (!str.equals("24.4")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1541001:
                if (!str.equals("24.5")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1541002:
                if (!str.equals("24.6")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 1541005:
                if (!str.equals("24.9")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportGpsLocation(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSupportGpsData(bool.booleanValue());
            return;
        }
        if (b2 == 2) {
            this.f1709a.configureSupportGpsSetParameter(bool.booleanValue());
            return;
        }
        if (b2 == 3) {
            this.f1709a.configureSupportGpsPostProcessing(bool.booleanValue());
            return;
        }
        if (b2 == 4) {
            this.f1709a.configureSupportGpsSearchStarOptimization(bool.booleanValue());
        } else if (b2 == 5) {
            this.f1709a.setSupportActivityRecognitionStatus(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setGpsLocationCapability unknown commandId.");
        }
    }

    private void s(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("25.1")) {
            this.f1709a.configureSupportHeartRateInfo(bool.booleanValue());
        } else if (str.equals("25.4")) {
            this.f1709a.configureSupportStressInfo(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setHeartRateCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    private void d(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str.hashCode()) {
            case 1542919:
                if (!str.equals("26.1")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1542920:
            case 1542922:
            default:
                b2 = -1;
                break;
            case 1542921:
                if (!str.equals("26.3")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1542923:
                if (!str.equals("26.5")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1542924:
                if (!str.equals("26.6")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1542925:
                if (!str.equals("26.7")) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportAccount(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.setSupportElectronicCard(bool.booleanValue());
            return;
        }
        if (b2 == 2) {
            this.f1709a.configureSupportChangePhonePair(bool.booleanValue());
            return;
        }
        if (b2 == 3) {
            this.f1709a.configureSupportAccountSwitch(bool.booleanValue());
        } else if (b2 == 4) {
            this.f1709a.setSupportSyncAccount(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setAccountCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private void ap(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "27.1":
                b2 = 0;
                break;
            case "27.15":
                b2 = 1;
                break;
            case "27.25":
                b2 = 2;
                break;
            case "27.26":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportPay(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.setSupportOneTouch(bool.booleanValue());
            return;
        }
        if (b2 == 2) {
            this.f1709a.configureSupportWalletOpenCard(bool.booleanValue());
        } else if (b2 == 3) {
            this.f1709a.configureHideWalletEntrance(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setWalletCapability unknown commandId.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void ac(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1545802) {
            if (iHashCode != 1545807) {
                if (iHashCode == 47919910 && str.equals("29.10")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("29.6")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("29.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportEsim(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSupportMultiSim(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureSupportNewEsim(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMultipleSimCapability unknown commandId.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void ar(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1568866) {
            if (iHashCode != 1568874) {
                if (iHashCode == 48634894 && str.equals("32.10")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("32.9")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("32.1")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportStress(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configruePressAutoMonitor(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureIsSupportStressAppToDevice(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setStressCapability unknown commandId.");
        }
    }

    private void u(String str, Boolean bool) {
        if ("33.1".equals(str)) {
            this.f1709a.configureSupportMidware(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMidWareCapability unknown commandId.");
        }
    }

    private void af(String str, Boolean bool) {
        if ("34.1".equals(str)) {
            this.f1709a.configureSupportOneLevelMenu(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setOneLevelMenuCapability unknown commandId.");
        }
    }

    private void ah(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("35.2")) {
            this.f1709a.configureSupportAtrialOperator(bool.booleanValue());
        } else if (str.equals("35.11")) {
            this.f1709a.configureSupportEcgAuth(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setOneLevelRriCapability unknown commandId.");
        }
    }

    private void al(String str, Boolean bool) {
        if ("36.1".equals(str)) {
            this.f1709a.configureSupportPosture(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setPostureCapability unknown commandId.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void aa(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 1573672) {
            if (iHashCode != 1573674) {
                if (iHashCode == 48783853 && str.equals("37.14")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("37.4")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("37.2")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportMusicControl(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureIsSupportMusicInfoList(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.setSupportSendSwitchStatus(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMusicControlCapability unknown commandId.");
        }
    }

    private void av(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("38.2")) {
            this.f1709a.configureSupportAutoDetectMode(bool.booleanValue());
        } else if (str.equals("38.3")) {
            this.f1709a.configureSupportFootWear(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setWorkModeCapability unknown commandId.");
        }
    }

    private void ao(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("39.1")) {
            this.f1709a.setSupportWatchFace(bool.booleanValue());
        } else if (str.equals("39.14")) {
            this.f1709a.configureSupportWatchFaceAppId(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setWatchFaceCapability unknown commandId.");
        }
    }

    private void y(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("42.1")) {
            this.f1709a.setSupportMarketFace(bool.booleanValue());
        } else if (str.equals("42.6")) {
            this.f1709a.setSupportMarketParams(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMarketCapability unknown commandId.");
        }
    }

    private void as(String str, Boolean bool) {
        if ("43.18".equals(str)) {
            this.f1709a.setSupportTws(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setTwsCapability unknown commandId.");
        }
    }

    private void an(String str, Boolean bool) {
        if ("45.1".equals(str)) {
            this.f1709a.configureSupportSleepBreathe(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setSleepBreatheCapability unknown commandId.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    private void r(String str, Boolean bool) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "46.1":
                b2 = 0;
                break;
            case "46.2":
                b2 = 1;
                break;
            case "46.3":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.f1709a.configureSupportHiCarDriverRemind(bool.booleanValue());
            return;
        }
        if (b2 == 1) {
            this.f1709a.configureSupportMessageFeedback(bool.booleanValue());
        } else if (b2 == 2) {
            this.f1709a.configureSupportWearStatus(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setHiCarCapability unknown commandId.");
        }
    }

    private void ag(String str, Boolean bool) {
        if ("48.1".equals(str)) {
            this.f1709a.configureSupportPhd(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setPhdCapability unknown commandId.");
        }
    }

    private void w(String str, Boolean bool) {
        if ("50.1".equals(str)) {
            this.f1709a.configureSupportMenstrual(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setMenstrualCapability unknown commandId.");
        }
    }

    private void aq(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("51.1")) {
            this.f1709a.configureSupportSosTransmission(bool.booleanValue());
        } else if (str.equals("51.2")) {
            this.f1709a.configureSupportSendSosSms(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setSosCapability unknown commandId.");
        }
    }

    private void t(String str, Boolean bool) {
        if ("52.1".equals(str)) {
            this.f1709a.configureSupportHiWear(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setHiWearCapability unknown commandId.");
        }
    }

    private void ax(String str, Boolean bool) {
        str.hashCode();
        if (str.equals("53.3")) {
            LogUtil.b("UpdateDeviceCapability", "setWearEngineCapability KEY_WEAR_ENGINE_EVENT_NOTIFY : ", bool);
            this.f1709a.configureSupportWearEngine(bool.booleanValue());
        } else if (str.equals("53.4")) {
            LogUtil.b("UpdateDeviceCapability", "setWearEngineCapability KEY_WEAR_ENGINE_DEVICE_SPACE : ", bool);
            this.f1709a.configureSupportCheckDeviceSpace(bool.booleanValue());
        } else {
            LogUtil.e("UpdateDeviceCapability", "setWearEngineCapability unknown commandId.");
        }
    }
}
