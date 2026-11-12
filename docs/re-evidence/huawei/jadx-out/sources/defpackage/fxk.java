package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.view.ConfigConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.FragmentForViewPager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f34683a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f34684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f34685c;
    private static int d;

    private static List<SingleGridContent> c(int i, List<SingleGridContent> list) {
        return list;
    }

    private static int e(int i) {
        if (i < 5 || i > 8) {
            return i > 8 ? 8 : 4;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:43:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    public static List<SingleGridContent> c(int i, int i2, List<SingleGridContent> list) {
        if (njy.e(list)) {
            LogUtil.j("LayoutUtils", "getConfiguredDataIsShown list is empty.");
            return new ArrayList(10);
        }
        if (i != 24 && i != 53 && i != 59 && i != 76 && i != 92 && i != 94 && i != 96 && i != 107 && i != 9999 && i != 35 && i != 36 && i != 39) {
            if (i == 40) {
                return b(list, 5);
            }
            if (i != 79) {
                if (i != 80) {
                    switch (i) {
                        case 6:
                        case 7:
                            break;
                        case 8:
                            return d(list, 3);
                        case 9:
                            return b(list, 4);
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 19:
                                        case 20:
                                        case 22:
                                            break;
                                        case 21:
                                            break;
                                        default:
                                            switch (i) {
                                                case 47:
                                                    break;
                                                case 48:
                                                    return d(list, 3);
                                                case 49:
                                                    return b(list, 4);
                                                default:
                                                    switch (i) {
                                                        case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                                        case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                                                            break;
                                                        case 84:
                                                        case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                                                            break;
                                                        default:
                                                            return new ArrayList(10);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 15:
                                case 16:
                                case 17:
                                    return list;
                            }
                            break;
                    }
                }
                return c(i2, list);
            }
            if (i2 == 3) {
                return b(list, 6);
            }
        }
        return list;
    }

    private static List<SingleGridContent> d(List<SingleGridContent> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("LayoutUtils", "getConfiguredPageShowList() list is empty.");
            return arrayList;
        }
        if (list.size() >= i) {
            return list.subList(0, i);
        }
        LogUtil.j("LayoutUtils", "getConfiguredPageShowList() ");
        return arrayList;
    }

    private static List<SingleGridContent> b(List<SingleGridContent> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("LayoutUtils", "getHorizonThreeGirdShowList() list is empty.");
            return arrayList;
        }
        if (list.size() >= i) {
            return list.subList(0, i);
        }
        LogUtil.j("LayoutUtils", "getHorizonThreeGirdShowList() ");
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    public static int c(Context context, int i, int i2) {
        d = 0;
        f34685c = 0;
        f34684b = qrs.d(context, 8.0f);
        if (i != 19) {
            if (i == 20) {
                return context.getResources().getDimensionPixelSize(R.dimen.hw_health_size_250dp);
            }
            if (i == 24) {
                d = 1;
                f34685c = 2;
            } else {
                if (i == 35) {
                    return 0;
                }
                if (i == 53) {
                    d = 1;
                    f34685c = 2;
                } else if (i != 59) {
                    if (i == 82 || i == 9999) {
                        d = 1;
                        f34685c = 2;
                    } else if (i == 39 || i == 40) {
                        d = 2;
                        f34685c = 4;
                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
                    } else if (i == 48) {
                        d = 2;
                        f34685c = 3;
                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                    } else if (i != 49) {
                        switch (i) {
                            case 6:
                                d = 1;
                                f34685c = 2;
                                break;
                            case 7:
                                d = 2;
                                f34685c = Math.min(i2, 4);
                                f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                                break;
                            case 8:
                                d = 2;
                                f34685c = 3;
                                f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                                break;
                            case 9:
                                d = 2;
                                f34685c = 4;
                                f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                                break;
                            default:
                                switch (i) {
                                    case 15:
                                        d = 1;
                                        f34685c = 2;
                                        break;
                                    case 16:
                                    case 17:
                                        d = 2;
                                        f34685c = 4;
                                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                                        break;
                                    default:
                                        e(i, context, i2);
                                        break;
                                }
                                break;
                        }
                    } else {
                        d = 2;
                        f34685c = 4;
                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                    }
                }
            }
            return c(i, d, f34685c, f34684b, i2);
        }
        return context.getResources().getDimensionPixelSize(R.dimen.health_common_256dp);
    }

    private static void e(int i, Context context, int i2) {
        if (i == 10) {
            d = 5;
            f34685c = e(i2);
            f34684b = 0;
            return;
        }
        if (i != 36) {
            if (i != 47) {
                if (i != 92) {
                    if (i == 94) {
                        d = 2;
                        f34685c = 5;
                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                        return;
                    }
                    if (i == 96) {
                        d = 2;
                        f34685c = 4;
                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
                        return;
                    }
                    if (i != 116) {
                        if (i != 79) {
                            if (i != 80) {
                                switch (i) {
                                    case 21:
                                        d = 3;
                                        f34685c = 5;
                                        f34684b = context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_8dp);
                                        break;
                                    case 22:
                                        break;
                                    case 23:
                                        break;
                                    default:
                                        d = 1;
                                        f34685c = 1;
                                        break;
                                }
                                return;
                            }
                            d = 2;
                            f34685c = 5;
                            f34684b = context.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM);
                            return;
                        }
                    }
                    d = 4;
                    f34685c = 8;
                    f34684b = 0;
                    return;
                }
                d = 3;
                f34685c = 5;
                f34684b = context.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM);
                return;
            }
            d = 4;
            f34685c = 7;
            f34684b = e();
            return;
        }
        d = Math.min(i2, 5);
        f34685c = Math.min(i2, 8);
        f34684b = 0;
    }

    private static int c(int i, int i2, int i3, int i4, int i5) {
        Context context = BaseApplication.getContext();
        int iB = b();
        LogUtil.a("LayoutUtils", "totalWidth = ", Integer.valueOf(iB));
        if (i == 116) {
            iB -= (BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp) + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue()) + (BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp) + ((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
        }
        int iB2 = iB;
        boolean zAf = qrs.af(BaseApplication.getActivity());
        if (i2 >= 1 && i3 >= 1) {
            int iE = e(i, context, zAf, i5);
            if (i == 22) {
                return d(context, i, zAf, i5, iB2, i3, i2, i4);
            }
            if (i == 47) {
                return a(zAf, i5, iB2);
            }
            if (i == 115) {
                return (iB2 - ((i2 - 1) * i4)) / i2;
            }
            if (zAf) {
                iB2 = ((iB2 - ((i3 - 1) * qqp.b(context))) - iE) / i3;
            } else {
                iB2 = ((iB2 - ((i2 - 1) * i4)) - iE) / i2;
            }
            LogUtil.a("LayoutUtils", "contentType =", Integer.valueOf(i), "  itemWidth = ", Integer.valueOf(iB2));
        }
        return iB2;
    }

    public static int b() {
        return b(BaseApplication.getActivity());
    }

    private static int e(Context context, boolean z) {
        if (!(context instanceof Activity)) {
            LogUtil.j("LayoutUtils", "context is not activity");
            context = BaseApplication.getActivity();
        }
        if (context == null) {
            LogUtil.j("LayoutUtils", "getActivity = null");
            context = BaseApplication.getContext();
        }
        int i = qrs.i(context);
        int iG = qrs.g(context);
        boolean zAf = qrs.af(BaseApplication.getActivity());
        LogUtil.a("LayoutUtils", "windowWidth:", Integer.valueOf(i), " windowHeight:", Integer.valueOf(iG), " isWidescreen:", Boolean.valueOf(zAf));
        if (!zAf) {
            i = Math.min(i, iG);
        }
        if (!z) {
            return i;
        }
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        return (i - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
    }

    public static int b(Context context) {
        return (e(context, true) - qre.b(R.dimen.defaultPaddingStart)) - qre.b(R.dimen.defaultPaddingEnd);
    }

    public static int c() {
        return e((Context) BaseApplication.getActivity(), true);
    }

    public static int a(int i, boolean z, int i2) {
        if (i != 19 && i != 20 && i != 24 && i != 53 && i != 59 && i != 9999) {
            if (i != 39 && i != 40) {
                if (i == 48) {
                    return 1;
                }
                if (i != 49) {
                    if (i != 82 && i != 83) {
                        switch (i) {
                            case 6:
                                break;
                            case 7:
                                if (z) {
                                    return Math.min(i2, 4);
                                }
                                return 2;
                            case 8:
                                return z ? 3 : 1;
                            case 9:
                                break;
                            default:
                                switch (i) {
                                    case 15:
                                        break;
                                    case 16:
                                    case 17:
                                        break;
                                    default:
                                        return c(i, z, i2);
                                }
                                break;
                        }
                    }
                }
            }
            return z ? 4 : 2;
        }
        return z ? 2 : 1;
    }

    private static int c(int i, boolean z, int i2) {
        if (i == 10) {
            return z ? 8 : 5;
        }
        if (i != 47) {
            if (i != 92) {
                if (i != 116) {
                    if (i == 35) {
                        return z ? 5 : 3;
                    }
                    if (i == 36) {
                        return Math.min(i2, z ? 8 : 5);
                    }
                    if (i != 79 && i != 80 && i != 84 && i != 85) {
                        switch (i) {
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                            default:
                                return 1;
                        }
                    }
                }
                return z ? 8 : 4;
            }
            return z ? 5 : 3;
        }
        return z ? 7 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0070  */
    public static int a(int i, boolean z) {
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        if (i == 35) {
            if (!z) {
                return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
            }
        } else if (i == 36) {
            if (!z) {
                return 0;
            }
        } else if (i == 39 || i == 40) {
            if (!z) {
                return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
            }
        } else if (i != 53) {
            if (i != 59) {
                if (i != 92) {
                    if (i != 94) {
                        if (i != 96) {
                            if (i != 113) {
                                if (i != 116 && i != 9999) {
                                    if (i != 79 && i != 80) {
                                        switch (i) {
                                            case 6:
                                            case 8:
                                            case 10:
                                                break;
                                            case 7:
                                            case 9:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 15:
                                                        break;
                                                    case 16:
                                                    case 17:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 19:
                                                            case 20:
                                                                break;
                                                            case 21:
                                                                break;
                                                            case 22:
                                                                return 0;
                                                            case 23:
                                                            case 24:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 47:
                                                                        return 0;
                                                                    case 48:
                                                                        break;
                                                                    case 49:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                                                                            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                                                                                break;
                                                                            case 84:
                                                                            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                                                                                break;
                                                                            default:
                                                                                return 0;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                }
                                if (!z) {
                                    return 0;
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
                }
            }
            if (!z) {
                return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            }
        } else if (!z) {
            return 0;
        }
        return dimensionPixelSize;
    }

    public static int c(int i) {
        if (i != 35) {
            if (i != 36) {
                if (i != 39 && i != 40) {
                    if (i != 53 && i != 59) {
                        if (i != 92) {
                            if (i != 116 && i != 9999) {
                                if (i != 79 && i != 80) {
                                    switch (i) {
                                        case 6:
                                        case 7:
                                        case 9:
                                            break;
                                        case 8:
                                        case 10:
                                            break;
                                        default:
                                            switch (i) {
                                                default:
                                                    switch (i) {
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                        case 24:
                                                            break;
                                                        case 23:
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 47:
                                                                case 48:
                                                                    break;
                                                                case 49:
                                                                    break;
                                                                default:
                                                                    if (i != 82 && i != 83) {
                                                                        return 0;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                case 15:
                                                case 16:
                                                case 17:
                                                    return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
                                            }
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        }
        return 0;
    }

    public static int[] a(int i, int i2) {
        int[] iArr = new int[4];
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (i == 24) {
            iArr[0] = 0;
            iArr[2] = 0;
            iArr[1] = qrs.d(BaseApplication.getContext(), 4.0f);
            iArr[3] = qrs.d(BaseApplication.getContext(), 4.0f);
            return iArr;
        }
        if (i == 22) {
            iArr[1] = 0;
            iArr[3] = 0;
            if (a(i2)) {
                iArr[0] = 0;
                iArr[2] = 0;
                return iArr;
            }
            iArr[0] = ((Integer) safeRegionWidth.first).intValue();
            iArr[2] = ((Integer) safeRegionWidth.second).intValue();
            return iArr;
        }
        if (i == 47 || i2 == 4204 || i2 == 4041) {
            iArr[0] = 0;
            iArr[2] = 0;
            iArr[1] = 0;
            iArr[3] = 0;
            return iArr;
        }
        iArr[1] = 0;
        iArr[3] = 0;
        if (a(i2)) {
            iArr[0] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            iArr[2] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            return iArr;
        }
        iArr[0] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue();
        iArr[2] = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue();
        return iArr;
    }

    public static long d() {
        return System.currentTimeMillis();
    }

    public static boolean b(String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC.trim())) {
            LogUtil.j("LayoutUtils", "isNeedLogin linkValue is null");
            return false;
        }
        String strE = qqy.e(strC);
        if (strC.contains("localeUrl:moduleName=openService")) {
            return false;
        }
        String queryParameter = Uri.parse(qqy.g(strC)).getQueryParameter("h5pro");
        if (!TextUtils.equals(strE, "3") && !TextUtils.equals(strE, "2")) {
            if (!TextUtils.equals(strE, "1") && !TextUtils.isEmpty(strE) && !TextUtils.equals(strE, "0")) {
                return (TextUtils.equals(strE, "4") && (str.contains("huaweischeme://") || str.contains("huaweihealth://") || str.contains("heart_scheme://") || str.contains("vascular_scheme://"))) || str.contains("needLogin");
            }
            if (!"true".equals(queryParameter) && !a(str)) {
                return false;
            }
        }
        return true;
    }

    private static String c(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("LayoutUtils", "decodeUrl() UnsupportedEncodingException");
            return "";
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("LayoutUtils", "decodeUrl() IllegalArgumentException");
            return "";
        }
    }

    private static boolean a(String str) {
        if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("LayoutUtils", "isNotSupportBrowseUrl url is null!");
            return true;
        }
        if (str.contains(ConfigConstants.VMALL_URL) || str.contains("needLogin")) {
            return true;
        }
        Iterator it = new ArrayList(Arrays.asList(BaseApplication.getContext().getResources().getStringArray(R.array.need_login_url_list))).iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(int i) {
        return i == 4010 || i == 4033 || i == 4035 || i == 4011 || i == 4034 || i == 4028 || i == 4032 || i == 4009 || i == 8000 || i == 4029 || i == 4041 || i == 4046 || i == 4047 || i == 4048 || i == 4018 || i == 4017 || i == 4168 || i == 4204 || b(i);
    }

    public static boolean b(int i) {
        if (i != 4085 && i != 61001 && (i < 50000 || i > 52000)) {
            return false;
        }
        LogUtil.a("LayoutUtils", "isAllCourseRecommend() is true");
        return true;
    }

    public static void d(int i) {
        if (f34683a != i) {
            f34683a = i;
        }
    }

    public static int a(Context context, int i) {
        return e(context, !a(i));
    }

    private static int e() {
        return qrs.v() ? 8 : 0;
    }

    private static int e(int i, Context context, boolean z, int i2) {
        if (i == 21) {
            return context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_16dp);
        }
        if (i == 80 || i == 79 || i == 92) {
            return context.getResources().getDimensionPixelSize(R.dimen.emui_card_device_65dp);
        }
        if (i != 39 && i != 40) {
            return 0;
        }
        if ((!z || i2 <= 4) && (z || i2 <= 2)) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
    }

    private static int a(boolean z, int i, int i2) {
        float f;
        float f2;
        if (z) {
            if (i <= 7) {
                return i2 / i;
            }
            f = i2;
            f2 = 7.5f;
        } else if (i > 4) {
            if (qrs.v()) {
                f = i2;
                f2 = 2.5f;
            } else {
                f = i2;
                f2 = 4.5f;
            }
        } else {
            return i2 / i;
        }
        return (int) (f / f2);
    }

    private static int d(Context context, int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        int dimension;
        int dimension2;
        float fB;
        float f;
        int dimension3 = (int) context.getResources().getDimension(R.dimen.defaultPaddingEnd);
        if (i == 22) {
            dimension = (int) context.getResources().getDimension(R.dimen.defaultPaddingEnd);
            dimension2 = (int) context.getResources().getDimension(R.dimen.defaultPaddingStart);
        } else {
            dimension = 0;
            dimension2 = 0;
        }
        if (z) {
            if (i2 > 7) {
                fB = (i3 - (i4 * qqp.b(context))) + dimension2 + dimension3;
                f = 7.5f;
            } else {
                return (((i3 - ((i4 - 1) * qqp.b(context))) + dimension) + dimension2) / i4;
            }
        } else {
            if (i2 <= 4) {
                return (((i3 - ((i5 - 1) * i6)) + dimension) + dimension2) / i5;
            }
            fB = (i3 - (i5 * i6)) + dimension2 + dimension3;
            f = 4.5f;
        }
        return (int) (fB / f);
    }

    public static boolean b(View view) {
        int visibility = view.getVisibility();
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        return visibility == 0 && rect.left == 0 && rect.top >= 0 && rect.top <= view.getHeight() / 2 && view.getLocalVisibleRect(rect);
    }

    public static boolean e(View view, int i) {
        return i == 0 || view.getWindowVisibility() == 0;
    }

    public static boolean c(View view) {
        int visibility = view.getVisibility();
        Rect rect = new Rect();
        return visibility == 0 && view.getLocalVisibleRect(rect) && rect.right - rect.left >= view.getWidth() && rect.bottom - rect.top >= view.getHeight();
    }

    public static boolean a() {
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (!(activityJ instanceof BaseActivity) || !activityJ.getLocalClassName().contains("MainActivity")) {
            LogUtil.j("LayoutUtils", "topActivity is not MainActivity");
            return false;
        }
        for (Fragment fragment : new ArrayList(((BaseActivity) activityJ).getSupportFragmentManager().getFragments())) {
            if (fragment instanceof FragmentForViewPager) {
                String fragmentTag = ((FragmentForViewPager) fragment).getFragmentTag();
                if (!fragment.getUserVisibleHint() || TextUtils.isEmpty(fragmentTag) || !fragmentTag.contains("HomeFragment")) {
                    break;
                    break;
                    break;
                }
                LogUtil.d("LayoutUtils", "HomeFragment is visible");
                return true;
            }
        }
        LogUtil.d("LayoutUtils", "HomeFragment is not visible");
        return false;
    }
}
