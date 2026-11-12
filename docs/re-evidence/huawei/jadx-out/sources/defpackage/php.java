package defpackage;

import android.text.TextUtils;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginmessagecenter.R;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class php {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 9, list:
      (r0v0 int) from 0x0009: IF  (r0v0 int) != (1629 int)  -> B:4:0x000b A[HIDDEN]
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (1660 int)  -> B:6:0x000f A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (1753 int)  -> B:8:0x0013 A[HIDDEN]
      (r0v0 int) from 0x0015: IF  (r0v0 int) != (1784 int)  -> B:10:0x0017 A[HIDDEN]
      (r0v0 int) from 0x0019: IF  (r0v0 int) != (1815 int)  -> B:12:0x001b A[HIDDEN]
      (r0v0 int) from 0x001e: IF  (r0v0 int) != (48625 int)  -> B:14:0x0020 A[HIDDEN]
      (r0v0 int) from 0x0023: IF  (r0v0 int) != (48656 int)  -> B:16:0x0025 A[HIDDEN]
      (r0v0 int) from 0x0027: IF  (r0v0 int) != (1691 int)  -> B:18:0x0029 A[HIDDEN]
      (r0v0 int) from 0x002b: IF  (r0v0 int) != (1692 int)  -> B:20:0x002d A[HIDDEN]
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
    public static int e(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 1629) {
            if (iHashCode != 1660) {
                if (iHashCode != 1753) {
                    if (iHashCode != 1784) {
                        if (iHashCode != 1815) {
                            if (iHashCode != 48625) {
                                if (iHashCode != 48656) {
                                    if (iHashCode != 1691) {
                                        if (iHashCode != 1692) {
                                            switch (str) {
                                                case "14":
                                                    b2 = 0;
                                                    break;
                                                case "15":
                                                    b2 = 1;
                                                    break;
                                                case "16":
                                                    b2 = 2;
                                                    break;
                                                case "17":
                                                    b2 = 3;
                                                    break;
                                                case "18":
                                                    b2 = 4;
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                        } else if (str.equals("51")) {
                                            b2 = 8;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str.equals("50")) {
                                        b2 = 7;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str.equals(MessageConstant.CERTIFICATE)) {
                                    b2 = 13;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str.equals("100")) {
                                b2 = 12;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("90")) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("80")) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("70")) {
                    b2 = 9;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(HealthZonePushReceiver.FAMILY_CARE_NOTIFY)) {
                b2 = 6;
            } else {
                b2 = -1;
            }
        } else if (str.equals(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY)) {
            b2 = 5;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                return R.mipmap.ic_recommand_icon;
            case 1:
                return R.mipmap.ic_plan_icon;
            case 2:
                return R.mipmap.ic_data_icon;
            case 3:
                return R.mipmap.ic_kaka_icon;
            case 4:
                return R.mipmap.ic_medal_icon;
            case 5:
                return R.mipmap.ic_activity_icon;
            case 6:
                return R.mipmap.ic_competition_icon;
            case 7:
                return R.mipmap.ic_service_icon;
            case 8:
                return R.mipmap.ic_group_icon;
            case 9:
                return R.mipmap.ic_member_icon;
            case 10:
                return R.mipmap.ic_asset_icon;
            case 11:
                return R.mipmap.ic_benefit_icon;
            case 12:
                return R.mipmap.ic_active_target_icon;
            case 13:
                return R.mipmap.ic_certificate_icon;
            default:
                return R.mipmap.ic_others_icon;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 9, list:
      (r0v0 int) from 0x0009: IF  (r0v0 int) != (1629 int)  -> B:4:0x000b A[HIDDEN]
      (r0v0 int) from 0x000d: IF  (r0v0 int) != (1660 int)  -> B:6:0x000f A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (1753 int)  -> B:8:0x0013 A[HIDDEN]
      (r0v0 int) from 0x0015: IF  (r0v0 int) != (1784 int)  -> B:10:0x0017 A[HIDDEN]
      (r0v0 int) from 0x0019: IF  (r0v0 int) != (1815 int)  -> B:12:0x001b A[HIDDEN]
      (r0v0 int) from 0x001e: IF  (r0v0 int) != (48625 int)  -> B:14:0x0020 A[HIDDEN]
      (r0v0 int) from 0x0023: IF  (r0v0 int) != (48656 int)  -> B:16:0x0025 A[HIDDEN]
      (r0v0 int) from 0x0027: IF  (r0v0 int) != (1691 int)  -> B:18:0x0029 A[HIDDEN]
      (r0v0 int) from 0x002b: IF  (r0v0 int) != (1692 int)  -> B:20:0x002d A[HIDDEN]
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
    public static int c(String str) {
        byte b2;
        str.hashCode();
        if (iHashCode != 1629) {
            if (iHashCode != 1660) {
                if (iHashCode != 1753) {
                    if (iHashCode != 1784) {
                        if (iHashCode != 1815) {
                            if (iHashCode != 48625) {
                                if (iHashCode != 48656) {
                                    if (iHashCode != 1691) {
                                        if (iHashCode != 1692) {
                                            switch (str) {
                                                case "14":
                                                    b2 = 0;
                                                    break;
                                                case "15":
                                                    b2 = 1;
                                                    break;
                                                case "16":
                                                    b2 = 2;
                                                    break;
                                                case "17":
                                                    b2 = 3;
                                                    break;
                                                case "18":
                                                    b2 = 4;
                                                    break;
                                                case "19":
                                                    b2 = 5;
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                        } else if (str.equals("51")) {
                                            b2 = 9;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str.equals("50")) {
                                        b2 = 8;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (str.equals(MessageConstant.CERTIFICATE)) {
                                    b2 = 14;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str.equals("100")) {
                                b2 = 13;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("90")) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("80")) {
                        b2 = 11;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("70")) {
                    b2 = 10;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(HealthZonePushReceiver.FAMILY_CARE_NOTIFY)) {
                b2 = 7;
            } else {
                b2 = -1;
            }
        } else if (str.equals(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY)) {
            b2 = 6;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                return R.string.IDS_hw_messagecenter_recommendation;
            case 1:
                return R.string.IDS_hwh_fitness_plan;
            case 2:
                return R.string.IDS_hw_messagecenter_data;
            case 3:
                return R.string.IDS_hwh_me_achieve_kaka;
            case 4:
                return R.string.IDS_clear_medal_data_cache;
            case 5:
                return R.string.IDS_hw_messagecenter_other;
            case 6:
                return R.string.IDS_main_home_bottom_text_activity;
            case 7:
                return R.string.IDS_hw_messagecenter_competition;
            case 8:
                return R.string.IDS_hw_messagecenter_service;
            case 9:
                return R.string.IDS_hw_messagecenter_group;
            case 10:
                return R.string.IDS_member;
            case 11:
                return R.string.IDS_assets;
            case 12:
                return R.string.IDS_benefit_message;
            case 13:
                return R.string.IDS_message_active_target;
            case 14:
                return R.string.IDS_hw_certificates;
            default:
                return R.string.IDS_hw_messagecenter_other;
        }
    }

    public static int a(int i) {
        if (i == 3) {
            return R.string.IDS_hw_messagecenter_group_dissolved;
        }
        if (i == 9) {
            return R.string.IDS_hw_messagecenter_group_change;
        }
        switch (i) {
            case 19:
                return R.string.IDS_hw_messagecenter_group_invataion;
            case 20:
            case 21:
            case 22:
                return R.string.IDS_hw_messagecenter_group_application;
            default:
                return R.string.IDS_hw_messagecenter_group;
        }
    }

    public static String c(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (i < 0 || i2 < 0 || length <= i + i2) {
            return "***";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(i, length - i2, "***");
        return sb.toString();
    }

    public static List<MessageObject> d(List<MessageObject> list) {
        Collections.sort(list, new Comparator<MessageObject>() { // from class: php.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(MessageObject messageObject, MessageObject messageObject2) {
                return Long.compare(messageObject.getReceiveTime(), messageObject2.getReceiveTime());
            }
        });
        return list;
    }

    public static List<MessageObject> b(List<MessageObject> list) {
        Collections.sort(list, new Comparator<MessageObject>() { // from class: php.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(MessageObject messageObject, MessageObject messageObject2) {
                return Long.compare(messageObject2.getReceiveTime(), messageObject.getReceiveTime());
            }
        });
        return list;
    }
}
