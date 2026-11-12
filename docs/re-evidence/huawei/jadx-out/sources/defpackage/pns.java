package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.EditShareMultipleFragment;
import com.huawei.pluginsocialshare.view.ShareCustomFragment;
import com.huawei.ui.commonui.utils.HarmonyOsTypefaceSpan;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public class pns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45730a = lrp.g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static pms f45731c;

    public static boolean d(int i, List<jpg> list) {
        return (njy.e(list) || i == 262 || i == 266 || i == 222 || i == 198 || i == 199 || i == 200) ? false : true;
    }

    public static boolean k() {
        gxy gxyVarC = pjm.c();
        if (gxyVarC == null) {
            return false;
        }
        return !njy.e(gxyVarC.k() != null ? gxyVarC.k().b() : null);
    }

    public static void b(FragmentManager fragmentManager, final List<Fragment> list, int i, int i2, final int i3) {
        if (fragmentManager == null || njy.e(list)) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        for (int i4 = 0; i4 < list.size(); i4++) {
            Fragment fragment = list.get(i4);
            if (!fragment.isAdded()) {
                fragmentTransactionBeginTransaction.add(i, fragment);
            }
            if (i4 == i2) {
                fragmentTransactionBeginTransaction.show(fragment);
            } else {
                fragmentTransactionBeginTransaction.hide(fragment);
            }
        }
        if (i3 != i2) {
            fragmentTransactionBeginTransaction.runOnCommit(new Runnable() { // from class: pnu
                @Override // java.lang.Runnable
                public final void run() {
                    ((Fragment) list.get(i3)).onPause();
                }
            });
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static Typeface h() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/Harmony-Heavy.ttf");
    }

    public static Typeface i() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/DaysOne-Regular.ttf");
    }

    public static Typeface f() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/Harmony-SemiBold.ttf");
    }

    public static Typeface j() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/Harmony-bold.ttf");
    }

    public static Typeface g() {
        return Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "fonts/Anton-Regular.ttf");
    }

    public static void e(Bitmap bitmap) {
        String str = f45730a;
        File file = new File(str, "share_bg_images");
        if (!file.exists()) {
            LogUtil.a("Share_ShareMultipleUtil", "saveBitmap mkdirFile is =", Boolean.valueOf(file.mkdirs()));
        }
        qqf.b(bitmap, str + "share_bg_images/" + (System.currentTimeMillis() + ".jpg"));
    }

    public static String e(String str) {
        String str2 = f45730a;
        File file = new File(str2, "share_bg_videos");
        if (!file.exists()) {
            LogUtil.a("Share_ShareMultipleUtil", "getSaveVideoPath mkdirFile is =", Boolean.valueOf(file.mkdirs()));
        }
        if (str == null) {
            ReleaseLogUtil.d("Share_ShareMultipleUtil", "getSaveVideoFolder fileName is null");
            return null;
        }
        return str2 + "share_bg_videos/" + str;
    }

    public static ArrayList<String> d() {
        List<Long> listL = l();
        listL.sort(Comparator.reverseOrder());
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < listL.size(); i++) {
            String str = f45730a + "share_bg_images/" + listL.get(i).longValue() + ".jpg";
            if (i < 3) {
                arrayList.add(str);
            } else {
                pnq.c(str);
            }
        }
        return arrayList;
    }

    private static List<Long> l() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(f45730a, "share_bg_images").listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    arrayList.add(Long.valueOf(CommonUtil.i(b(file.getName()))));
                }
            }
        }
        return arrayList;
    }

    public static String b(String str) {
        int iLastIndexOf;
        return (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(46)) > 0) ? str.substring(0, iLastIndexOf) : str;
    }

    public static void c(boolean z) {
        SharedPreferenceManager.a("MODULE_SHARE_LAST_INFO", "FIRST_ENTRY_SHARE_KEY", z);
    }

    public static Boolean b() {
        return Boolean.valueOf(SharedPreferenceManager.b("MODULE_SHARE_LAST_INFO", "FIRST_ENTRY_SHARE_KEY", true));
    }

    public static void b(boolean z) {
        SharedPreferenceManager.a("MODULE_SHARE_LAST_BG_INFO", "FIRST_ENTRY_SHARE_BG_KEY", z);
    }

    public static Boolean a() {
        return Boolean.valueOf(SharedPreferenceManager.b("MODULE_SHARE_LAST_BG_INFO", "FIRST_ENTRY_SHARE_BG_KEY", true));
    }

    public static void a(String str, int i) {
        SharedPreferenceManager.d("MODULE_SHARE_LAST_INFO", str, i);
    }

    public static int d(String str) {
        return SharedPreferenceManager.c("MODULE_SHARE_LAST_INFO", str, -1);
    }

    public static int e() {
        return qrs.af(BaseApplication.getContext()) ? 8 : 4;
    }

    public static int b(Context context) {
        LogUtil.a("Share_ShareMultipleUtil", "getCurrentWindowHeight getCurrentWindowHeight =", Integer.valueOf(qrs.g(context)), " getScreenHeight=", Integer.valueOf(qrs.m()));
        if (qrs.af(BaseApplication.getContext())) {
            return qrs.g(context);
        }
        int iS = qrs.s(context);
        int iQ = qrs.ad(context) ? qrs.q(context) : 0;
        LogUtil.a("Share_ShareMultipleUtil", "getCurrentWindowHeight statusBar =", Integer.valueOf(iS), " navigationBarHeight=", Integer.valueOf(iQ));
        return (qrs.m() - iS) - iQ;
    }

    public static int d(Context context) {
        LogUtil.a("Share_ShareMultipleUtil", "getCurrentWindowHeight getCurrentWindowWidth =", Integer.valueOf(qrs.i(context)), " getScreenWidth=", Integer.valueOf(qrs.q()));
        if (qrs.af(BaseApplication.getContext())) {
            return qrs.i(context);
        }
        return qrs.q();
    }

    public static int d(Context context, int i) {
        return c(b(context, i));
    }

    public static int b(Context context, int i) {
        int i2 = R.color.share_text_white_color;
        pms pmsVarE = e(context, i);
        if (pmsVarE == null) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgAiColor info is null");
            return i2;
        }
        if (pmsVarE.e() != 0) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgAiColor quick return, id = ", Integer.valueOf(pmsVarE.e()));
            return pmsVarE.e();
        }
        Bitmap bitmapD = pmsVarE.d();
        int iB = qqf.b(bitmapD, new Rect(0, (bitmapD.getHeight() * 2) / 3, bitmapD.getWidth(), bitmapD.getHeight()));
        pms pmsVar = f45731c;
        if (pmsVar != null) {
            pmsVar.d(iB);
        }
        return iB;
    }

    public static int c(Context context, int i) {
        int iE = e(e(context, i));
        LogUtil.j("Share_ShareMultipleUtil", "getMaskAiColor color=", Integer.valueOf(iE));
        return iE;
    }

    private static pms e(Context context, int i) {
        Bitmap bitmapC;
        ShareDataInfo shareDataInfoC = pmn.c(i);
        if (shareDataInfoC == null) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgBitmap info is null");
            return null;
        }
        pms pmsVar = f45731c;
        if (pmsVar != null && pmsVar.a() == i && f45731c.c() == shareDataInfoC.getId() && f45731c.d() != null) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgBitmap quick return, id = ", Integer.valueOf(shareDataInfoC.getId()));
            return f45731c;
        }
        if (shareDataInfoC instanceof pmr) {
            bitmapC = qqf.e(((pmr) shareDataInfoC).b(), context);
        } else if (shareDataInfoC instanceof pmm) {
            bitmapC = ((pmm) shareDataInfoC).b();
        } else if (!(shareDataInfoC instanceof gye)) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgBitmap no branch.");
            bitmapC = null;
        } else {
            bitmapC = qqf.c(((gye) shareDataInfoC).h());
        }
        if (bitmapC == null) {
            LogUtil.j("Share_ShareMultipleUtil", "getBgBitmap bitmap is null");
            return null;
        }
        LogUtil.a("Share_ShareMultipleUtil", "getBgBitmap sportType:", Integer.valueOf(i));
        pms pmsVar2 = new pms(shareDataInfoC.getId(), bitmapC, i);
        f45731c = pmsVar2;
        return pmsVar2;
    }

    public static int c(int i) {
        if (e(i) == 1) {
            LogUtil.a("Share_ShareMultipleUtil", "getInvertColor LIGHT_COLOR textColor:", Integer.valueOf(i));
            return R.color.share_text_black_color;
        }
        LogUtil.a("Share_ShareMultipleUtil", "getInvertColor DEEP_COLOR textColor:", Integer.valueOf(i));
        return R.color.common_color_white;
    }

    public static int e(int i) {
        return ((int) (((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d))) >= 175 ? 1 : 0;
    }

    private static int e(pms pmsVar) {
        if (pmsVar == null) {
            LogUtil.j("Share_ShareMultipleUtil", "getAverageColorWithPixelsArray info is null.");
            return -1;
        }
        Bitmap bitmapD = pmsVar.d();
        if (pmsVar.b() != 0) {
            LogUtil.j("Share_ShareMultipleUtil", "getAverageColorWithPixelsArray quick return, id = ", Integer.valueOf(pmsVar.c()));
            return pmsVar.b();
        }
        if (bitmapD == null || bitmapD.isRecycled()) {
            LogUtil.j("Share_ShareMultipleUtil", "getAverageColorWithPixelsArray Bitmap is null or recycled");
            return -1;
        }
        int width = bitmapD.getWidth();
        int height = bitmapD.getHeight();
        int i = width * height;
        LogUtil.a("Share_ShareMultipleUtil", "getAverageColorWithPixelsArray pixelCount=", Integer.valueOf(i));
        try {
            int[] iArr = new int[i];
            bitmapD.getPixels(iArr, 0, width, 0, 0, width, height);
            int iRed = 0;
            int iGreen = 0;
            int iBlue = 0;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                iRed += Color.red(i3);
                iGreen += Color.green(i3);
                iBlue += Color.blue(i3);
            }
            int iRgb = Color.rgb(iRed / i, iGreen / i, iBlue / i);
            pms pmsVar2 = f45731c;
            if (pmsVar2 != null) {
                pmsVar2.b(iRgb);
            }
            return iRgb;
        } catch (OutOfMemoryError unused) {
            LogUtil.a("Share_ShareMultipleUtil", "getAverageColorWithPixelsArray OutOfMemoryError");
            return -1;
        }
    }

    public static CharSequence d(long j, int i, int i2, boolean z) {
        int[] iArrA = ezo.a(j);
        int i3 = iArrA[0];
        int i4 = iArrA[1];
        int i5 = iArrA[2];
        BaseApplication.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableStringE = e("\\d+.\\d+|\\d+", gzx.d(R.plurals.IDS_hour_single_unit, i4, UnitUtil.e(i4, 1, 0)), i, i2, z);
        if (i3 > 0) {
            spannableStringBuilder.append((CharSequence) e("\\d+.\\d+|\\d+", gzx.d(R.plurals.IDS_physiology_day, i3, UnitUtil.e(i3, 1, 0)), i, i2, z));
            spannableStringBuilder.append((CharSequence) spannableStringE);
        } else if (i4 > 0) {
            spannableStringBuilder.append((CharSequence) spannableStringE);
        }
        String strE = UnitUtil.e(i5, 1, 0);
        String strD = gzx.d(R.plurals.IDS_min_single_unit, i5, strE);
        if (i3 == 0 && i4 == 0) {
            strD = gzx.d(R.plurals.IDS_min_insert_unit, i5, strE);
        }
        spannableStringBuilder.append((CharSequence) e("\\d+.\\d+|\\d+", strD, i, i2, z));
        return spannableStringBuilder;
    }

    public static SpannableString e(String str, String str2, int i, int i2, boolean z) {
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, spannableString.toString().length(), 33);
        Matcher matcher = Pattern.compile(str, 2).matcher(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), iStart, iEnd, 33);
            e(spannableString, iStart, iEnd, z);
        }
        return spannableString;
    }

    public static void e(SpannableString spannableString, int i, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            qri.d(spannableString, i, i2, new HarmonyOsTypefaceSpan(z ? g() : h()));
        }
    }

    public static boolean o() {
        int i = BaseApplication.getContext().getResources().getConfiguration().orientation;
        HashMap<Integer, Integer> map = EditShareMultipleFragment.f22583c;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            LogUtil.a("Share_ShareMultipleUtil", "isExistContentHeight mOrientation=", Integer.valueOf(i), " map=", map.toString());
            Integer num = map.get(Integer.valueOf(i));
            if (num != null && num.intValue() != 0) {
                return true;
            }
        }
        return false;
    }

    public static int n() {
        int i = BaseApplication.getContext().getResources().getConfiguration().orientation;
        HashMap<Integer, Integer> map = EditShareMultipleFragment.f22583c;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return 0;
        }
        LogUtil.a("Share_ShareMultipleUtil", "isExistContentHeight mOrientation=", Integer.valueOf(i), " map=", map.toString());
        Integer num = map.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void c() {
        f45731c = null;
        pmn.a((String) null);
        ShareCustomFragment.e();
    }

    public static String d(gxy gxyVar) {
        String strJ = gxyVar.j();
        String strA = gxyVar.a();
        String strWebAppUriToNativePath = StorageUtil.webAppUriToNativePath(BaseApplication.getContext(), strA, strJ);
        LogUtil.a("Share_ShareMultipleUtil", "getGolfVideoFilePath uri=", strJ, ",packageName=", strA, ",golfVideoFilePath=", strWebAppUriToNativePath);
        return strWebAppUriToNativePath;
    }

    public static boolean b(gxy gxyVar) {
        return (HiCommonUtil.a(gxyVar.j()) || HiCommonUtil.a(gxyVar.a())) ? false : true;
    }

    public static void b(TextView textView, Typeface typeface) {
        if (LanguageUtil.ax(BaseApplication.getContext()) || LanguageUtil.m(BaseApplication.getContext()) || LanguageUtil.s(BaseApplication.getContext()) || LanguageUtil.am(BaseApplication.getContext())) {
            textView.setTypeface(typeface, 1);
            textView.setTypeface(typeface, 1);
        } else {
            textView.setTypeface(typeface);
            textView.setTypeface(typeface);
        }
    }

    public static Drawable b(ImageView imageView) {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            return packageManager.getApplicationInfo("com.xingin.xhs", 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("Share_ShareMultipleUtil", "getXhsIcon NameNotFoundException");
            return qre.c(R.mipmap.xhs);
        }
    }

    public static Drawable e(ImageView imageView) {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            return packageManager.getApplicationInfo("com.ss.android.ugc.aweme", 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("Share_ShareMultipleUtil", "getDouyinIcon NameNotFoundException");
            return qre.c(R.mipmap.douyin);
        }
    }
}
