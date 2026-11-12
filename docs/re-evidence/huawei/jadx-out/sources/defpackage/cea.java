package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.IllegalFormatConversionException;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class cea {
    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : BaseApplication.b().getResources().getStringArray(R.array.placeholder_type)) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
            return false;
        } catch (Resources.NotFoundException e) {
            LogUtil.e("HL_PlaceholderUtils", "checkPlaceholder exception is ", LogAnonymous.b(e));
            return false;
        }
    }

    private static String b(String str, String str2, String str3) {
        boolean z;
        String strA;
        Object objValueOf;
        String[] strArrSplit = str3.split("\\.");
        int length = strArrSplit.length;
        if (length < 2) {
            LogUtil.j("HL_PlaceholderUtils", "getPlaceholderForText length less than two");
            return "";
        }
        String str4 = strArrSplit[length - 1];
        if (TextUtils.isEmpty(str4)) {
            LogUtil.j("HL_PlaceholderUtils", "getPlaceholderForText name is empty");
            return "";
        }
        String str5 = strArrSplit[length - 2];
        if ("string".equals(str5)) {
            z = true;
        } else {
            if (!"plurals".equals(str5)) {
                LogUtil.j("HL_PlaceholderUtils", "getPlaceholderForText resource type not exist");
                return "";
            }
            z = false;
        }
        int iE = qre.e(str4, str5, z ? com.huawei.basichealthmodel.R.string.class : com.huawei.basichealthmodel.R.plurals.class);
        if (iE <= 0) {
            LogUtil.j("HL_PlaceholderUtils", "getPlaceholderForText id ", Integer.valueOf(iE));
            return "";
        }
        String strC = c(str, str2);
        if (TextUtils.isEmpty(strC)) {
            strA = strC;
            strA = a(str, str2);
        }
        try {
            strA = strC;
            boolean zEquals = "100".equals(str);
            int i = zEquals ? Integer.parseInt(str2) : 100;
            Resources resources = BaseApplication.b().getResources();
            Object objValueOf2 = strA;
            if (z) {
                if (zEquals) {
                    objValueOf2 = Integer.valueOf(i);
                }
                return resources.getString(iE, objValueOf2);
            }
            int iE2 = UnitUtil.e(i);
            if (zEquals) {
                objValueOf = strA;
                objValueOf = Integer.valueOf(i);
            }
            objValueOf = strA;
            return resources.getQuantityString(iE, iE2, objValueOf);
        } catch (Resources.NotFoundException | NumberFormatException | IllegalFormatConversionException e) {
            LogUtil.e("HL_PlaceholderUtils", "getPlaceholderForText exception is ", LogAnonymous.b(e));
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 int, still in use, count: 1, list:
      (r11v2 int) from 0x0018: SWITCH (r11v2 int)
     case 48625: goto B:16:0x0032
     case 48626: goto B:12:0x0027
     case 48627: goto B:8:0x001c
     default: goto B:30:0x005b A[RegionRef:SW:6]
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
    private static String c(String str, String str2) {
        byte b2;
        try {
            double d = Double.parseDouble(str2);
            str.hashCode();
            int i = 0;
            int i2 = 1;
            switch (str) {
                case "10":
                    b2 = 0;
                    break;
                case "11":
                    b2 = 1;
                    break;
                case "12":
                    b2 = 2;
                    break;
                default:
                    switch (str) {
                        case 48625:
                            if (!str.equals("100")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 48626:
                            if (!str.equals("101")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 48627:
                            if (!str.equals("102")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
            }
            if (b2 == 0) {
                i2 = 2;
            } else if (b2 == 1) {
                i = 1;
                i2 = 2;
            } else if (b2 == 2) {
                i = 2;
                i2 = 2;
            } else if (b2 != 3) {
                if (b2 == 4) {
                    i = 1;
                } else {
                    if (b2 != 5) {
                        LogUtil.j("HL_PlaceholderUtils", "getPlaceholderTextForNumberFormat default");
                        return "";
                    }
                    i = 2;
                }
            }
            return cbg.d(d, i2, i);
        } catch (NumberFormatException e) {
            LogUtil.e("HL_PlaceholderUtils", "getPlaceholderForNumberFormat exception is ", LogAnonymous.b(e));
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    private static String a(String str, String str2) {
        byte b2;
        String str3;
        str.hashCode();
        int i = 1;
        switch (str) {
            case "200":
                b2 = 0;
                break;
            case "201":
                b2 = 1;
                break;
            case "202":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            str3 = "yyyyMMdd HH:mm";
            i = 21;
        } else if (b2 == 1) {
            str3 = "yyyyMMdd";
            i = 20;
        } else if (b2 == 2) {
            str3 = "HH:mm";
        } else {
            LogUtil.j("HL_PlaceholderUtils", "getPlaceholderTextForTimeFormat default");
            return "";
        }
        try {
            return UnitUtil.a(new SimpleDateFormat(str3, Locale.ROOT).parse(str2), i);
        } catch (ParseException e) {
            LogUtil.e("HL_PlaceholderUtils", "getPlaceholderForTimeFormat exception is ", LogAnonymous.b(e));
            return "";
        }
    }

    public static String e(String str, String str2, String str3) {
        if (!b(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (!TextUtils.isEmpty(str3)) {
            String strB = b(str, str2, str3);
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        String strC = c(str, str2);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String strA = a(str, str2);
        return !TextUtils.isEmpty(strA) ? strA : "";
    }
}
