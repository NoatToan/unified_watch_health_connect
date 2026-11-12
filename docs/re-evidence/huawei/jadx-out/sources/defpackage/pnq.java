package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.FileProvider;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.hwid.f$$ExternalSyntheticApiModelOutline0;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes15.dex */
public class pnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f45727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f45728b;
    private static int d;
    private static String e = b(Locale.getDefault());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f45729c = 1.0f;

    public static boolean c() {
        return true;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + System.currentTimeMillis() + "";
    }

    public static String a(Context context, Bitmap bitmap) {
        String str = "";
        if (context == null || bitmap == null) {
            LogUtil.a("Share_ShareUtil", "saveBmpToFile() error: context/screenCut is null");
            return "";
        }
        if (context.getExternalCacheDir() != null) {
            try {
                str = context.getExternalCacheDir().getCanonicalPath() + File.separator + System.currentTimeMillis() + f45728b + "_share_tmp.jpg";
                f45728b++;
            } catch (IOException unused) {
                LogUtil.a("Share_ShareUtil", "getCanonicalPath fail:IOException");
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(new File(str));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamOpenOutputStream);
                    fileOutputStreamOpenOutputStream.flush();
                    if (fileOutputStreamOpenOutputStream != null) {
                        fileOutputStreamOpenOutputStream.close();
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenOutputStream != null) {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                LogUtil.j("Share_ShareUtil", "saveBmpToFile:IOException exception: ", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                e = e3;
                LogUtil.j("Share_ShareUtil", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            } catch (IllegalStateException e4) {
                e = e4;
                LogUtil.j("Share_ShareUtil", "saveBmpToFile fail: IllegalArgumentException|IllegalStateException exception: ", e.getMessage());
            }
        }
        return str;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        LogUtil.a("Share_ShareUtil", "ensureMaxHeight start");
        if (bitmap == null || i <= 0) {
            LogUtil.e("Share_ShareUtil", "ensureMaxHeight fail:params error, ", bitmap, Integer.valueOf(i));
            return null;
        }
        int height = bitmap.getHeight();
        if (height <= i) {
            LogUtil.a("Share_ShareUtil", "ensureMaxHeight pass: height not exceed");
            return bitmap;
        }
        LogUtil.a("Share_ShareUtil", "ensureMaxHeight height exceeds, rescale it");
        Matrix matrix = new Matrix();
        float f = i / height;
        if (!c()) {
            matrix.postScale(1.0f, f);
        } else {
            matrix.setScale(f, f);
        }
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), height, matrix, true);
        } catch (IllegalArgumentException e2) {
            LogUtil.a("Share_ShareUtil", "ensureMaxHeight:IllegalArgumentException exception: ", e2.getMessage());
            return null;
        } catch (OutOfMemoryError unused) {
            LogUtil.a("Share_ShareUtil", "ensureMaxHeight:OutOfMemoryError");
            return null;
        }
    }

    private static String i() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US);
        Date date = new Date(System.currentTimeMillis());
        Locale locale = Locale.ENGLISH;
        int i = f45728b;
        f45728b = i + 1;
        return String.format(locale, "sporthealth-%d-%s.jpg", Integer.valueOf(i), simpleDateFormat.format(date));
    }

    public static String e(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US);
        Date date = new Date(System.currentTimeMillis());
        Locale locale = Locale.ENGLISH;
        int i = f45727a;
        f45727a = i + 1;
        return String.format(locale, str, Integer.valueOf(i), simpleDateFormat.format(date));
    }

    private static Uri e(Context context, Bitmap bitmap) {
        Uri uri = Uri.EMPTY;
        String strA = a(context, bitmap);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("Share_ShareUtil", "insertBitmapToGallery filePath is null");
            return uri;
        }
        try {
            String strInsertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), strA, i(), (String) null);
            if (!TextUtils.isEmpty(strInsertImage)) {
                return Uri.parse(strInsertImage);
            }
        } catch (FileNotFoundException | IllegalArgumentException e2) {
            LogUtil.e("Share_ShareUtil", "insertBitmapToGallery:exception", ExceptionUtils.c(e2));
        }
        return uri;
    }

    public static void d(Context context, Bitmap bitmap) {
        e(context, bitmap, (SaveBitampCallback) null);
    }

    public static void e(Context context, Bitmap bitmap, SaveBitampCallback saveBitampCallback) {
        if (context == null || bitmap == null) {
            LogUtil.a("Share_ShareUtil", "saveBmpToFile() error: context/screenCut is null");
            return;
        }
        Uri uriE = Uri.EMPTY;
        String string = context.getString(R.string.IDS_retack_save_recorder_tip);
        if (!PermissionUtil.a()) {
            String strD = d(context, bitmap, i());
            if (!TextUtils.isEmpty(strD)) {
                uriE = Uri.fromFile(new File(strD));
            }
        } else {
            uriE = e(context, bitmap);
        }
        if (uriE != Uri.EMPTY) {
            if (saveBitampCallback != null) {
                saveBitampCallback.onSuccess(uriE);
            }
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriE));
            qpx.e(context, string);
            return;
        }
        if (saveBitampCallback != null) {
            saveBitampCallback.onFail(1);
        }
        qpx.e(context, context.getString(R.string.IDS_hwh_show_save_failed));
    }

    private static Uri c(Context context, Bitmap bitmap) {
        Uri uri = Uri.EMPTY;
        if (!PermissionUtil.a()) {
            String strD = d(context, bitmap, i());
            return !TextUtils.isEmpty(strD) ? Uri.fromFile(new File(strD)) : uri;
        }
        return e(context, bitmap);
    }

    private static void b(Context context, Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
        try {
            Thread.sleep(10L);
        } catch (InterruptedException unused) {
            LogUtil.j("Share_ShareUtil", "refreshImageByUri delay: InterruptedException");
        }
    }

    private static String d(Context context, Bitmap bitmap, String str) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), e(context));
        String canonicalPath = "";
        if (!file.exists() && !file.mkdir()) {
            LogUtil.e("Share_ShareUtil", "saveToHealthGallery: make gallery dir fail");
            return "";
        }
        File file2 = new File(file, str);
        if (file2.isFile() && file2.exists() && !file2.delete()) {
            LogUtil.e("Share_ShareUtil", "delete file fail:", str);
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file2);
            try {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamOpenOutputStream);
                fileOutputStreamOpenOutputStream.flush();
                if (zCompress) {
                    canonicalPath = file2.getCanonicalPath();
                    LogUtil.a("Share_ShareUtil", "saveToLocalGallery success");
                } else {
                    LogUtil.e("Share_ShareUtil", "saveToLocalGallery fail");
                }
                if (fileOutputStreamOpenOutputStream != null) {
                    fileOutputStreamOpenOutputStream.close();
                }
                return canonicalPath;
            } catch (Throwable th) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("Share_ShareUtil", "saveToLocalGallery fail");
            return "";
        }
    }

    public static void c(Context context, Uri uri) {
        if (context != null) {
            LogUtil.a("Share_ShareUtil", "delete system gallery image count: ", Integer.valueOf(context.getContentResolver().delete(uri, null, null)));
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Share_ShareUtil", "delete file fail: path is empty");
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && !file.delete()) {
            LogUtil.e("Share_ShareUtil", "delete file fail");
        }
    }

    private static void a(Context context, Uri uri) {
        if (context == null || uri == null) {
            LogUtil.e("Share_ShareUtil", "deleteFileByFileUri fail: context/uri is null");
            return;
        }
        if (uri.toString().startsWith("content://")) {
            context.getContentResolver().delete(uri, null, null);
            return;
        }
        String strE = e(context, uri);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        File file = new File(strE);
        if (file.exists() && file.isFile() && !file.delete()) {
            LogUtil.e("Share_ShareUtil", "delete file fail");
        }
    }

    private static String e(Context context, Uri uri) {
        int columnIndex;
        String string = null;
        if (uri == null) {
            LogUtil.e("Share_ShareUtil", "getFilePathByUri: uri is null");
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || "file".equals(scheme)) {
            string = uri.getPath();
        } else if (!"content".equals(scheme)) {
            LogUtil.j("Share_ShareUtil", "getFilePathByUri fail: scheme unknown");
        } else {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_data")) > -1) {
                        string = cursorQuery.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return CommonUtil.c(string);
    }

    public static String e(Context context) {
        if (context == null) {
            LogUtil.e("Share_ShareUtil", "getAppName: context is null");
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            String str = packageManager.getApplicationLabel(applicationInfo) instanceof String ? (String) packageManager.getApplicationLabel(applicationInfo) : "";
            LogUtil.a("Share_ShareUtil", "getAppName() applicationName=", str);
            return str;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("Share_ShareUtil", e2.getMessage());
            return "";
        }
    }

    public static Bitmap a(gxt gxtVar) {
        LogUtil.a("Share_ShareUtil", "sharePicture()");
        if (gxtVar == null) {
            LogUtil.e("Share_ShareUtil", "ERROR shareContent in sharePicture()");
            return null;
        }
        int iU = gxtVar.u();
        if (iU == 1 || iU == 7 || iU == 10) {
            LogUtil.a("Share_ShareUtil", "SHARE_WAY_PIC");
            if (gxtVar.r() == null || gxtVar.r().isRecycled()) {
                LogUtil.e("Share_ShareUtil", "ERROR getSharePicContent in getShareContentBitmap()");
                return null;
            }
            return gxtVar.r();
        }
        if (iU == 4 || iU == 5) {
            LogUtil.a("Share_ShareUtil", "SHARE_WAY_IMG_PATH");
            String strG = gxtVar.g();
            if (TextUtils.isEmpty(strG)) {
                LogUtil.e("Share_ShareUtil", "ERROR getImagePath in getShareContentBitmap()");
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return qqf.c(strG, options);
        }
        LogUtil.e("Share_ShareUtil", "not a image share!");
        return null;
    }

    public static ArrayList<Uri> b(Context context, gxt gxtVar, int i) {
        if (context == null || gxtVar == null) {
            LogUtil.e("Share_ShareUtil", "getDividedImageUriList: context/shareContent is null");
            return null;
        }
        Iterator<Uri> it = gxtVar.j().iterator();
        while (it.hasNext()) {
            a(context, it.next());
        }
        ArrayList<Uri> arrayListB = b(context, gxtVar.g(), gxtVar.b(), i);
        gxtVar.d(arrayListB);
        return arrayListB;
    }

    private static ArrayList<Uri> b(Context context, String str, int i, int i2) {
        ArrayList<Uri> arrayList = new ArrayList<>(9);
        if (i <= 0) {
            LogUtil.e("Share_ShareUtil", "divideImageToPathList: imageNum <= 0");
            return arrayList;
        }
        Bitmap bitmapC = qqf.c(str);
        if (bitmapC == null) {
            LogUtil.e("Share_ShareUtil", "decodeFile from orgFilePath return null");
            return arrayList;
        }
        int height = bitmapC.getHeight() / i;
        int width = bitmapC.getWidth();
        while (true) {
            i--;
            if (i >= 0) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC, 0, height * i, width, height);
                    Uri uriB = b(context, bitmapCreateBitmap, i2, i);
                    arrayList.add(uriB);
                    bitmapCreateBitmap.recycle();
                    if (b(i2, i)) {
                        b(context, uriB);
                    }
                } catch (IllegalArgumentException | OutOfMemoryError e2) {
                    LogUtil.e("Share_ShareUtil", "cache image fail:", e2.getMessage());
                }
            } else {
                Collections.reverse(arrayList);
                return arrayList;
            }
        }
    }

    private static Uri b(Context context, Bitmap bitmap, int i, int i2) {
        if (i == 3) {
            String strC = CommonUtil.c(CommonUtil.f(context) + "/Huawei/Health/ShareTmp/multi_share_" + i2);
            if (TextUtils.isEmpty(strC)) {
                return Uri.EMPTY;
            }
            qqf.b(bitmap, strC);
            return a(context, new File(strC));
        }
        return c(context, bitmap);
    }

    public static Uri a(Context context, File file) {
        if (c()) {
            try {
                return FileProvider.getUriForFile(context, pld.e, file);
            } catch (IllegalArgumentException e2) {
                ReleaseLogUtil.a("Share_ShareUtil", "getFileUri IllegalArgumentException:", e2.getMessage());
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    private static boolean b(int i, int i2) {
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return i2 != 0;
        }
        if (i != 3) {
            LogUtil.e("Share_ShareUtil", "refresh type unknow");
        }
        return false;
    }

    public static void d(HealthTextView healthTextView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(charSequence);
        }
    }

    public static void c(HealthTextView healthTextView, CharSequence charSequence) {
        d(healthTextView, charSequence);
        if (i(charSequence.toString())) {
            return;
        }
        healthTextView.setTypeface(Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyRegular), 3));
    }

    public static boolean a(String str) {
        return BaseApplication.getContext().getString(R.string.IDS_motiontrack_show_invalid_data).equals(str);
    }

    public static void c(HealthTextView healthTextView, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Share_ShareUtil", "setFront value is null");
            return;
        }
        if (str.contains("(E)")) {
            if (Build.VERSION.SDK_INT >= 28) {
                healthTextView.setText(a(str, "(E)"));
                return;
            } else {
                healthTextView.setTypeface(Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyRegular), 3));
                healthTextView.setText(str);
                return;
            }
        }
        d(healthTextView, str);
    }

    public static SpannableStringBuilder a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(f$$ExternalSyntheticApiModelOutline0.m(Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyRegular), 3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableString a(String str, String str2, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(i), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        return spannableString;
    }

    public static void d(List<ShareDataInfo> list) {
        if (list != null) {
            Collections.sort(list, new Comparator() { // from class: pny
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return pnq.a((ShareDataInfo) obj, (ShareDataInfo) obj2);
                }
            });
        }
    }

    static /* synthetic */ int a(ShareDataInfo shareDataInfo, ShareDataInfo shareDataInfo2) {
        if (shareDataInfo2.getWeight() > shareDataInfo.getWeight()) {
            return 1;
        }
        if (shareDataInfo.getWeight() == shareDataInfo2.getWeight()) {
            return shareDataInfo2.getId() - shareDataInfo.getId();
        }
        return -1;
    }

    public static List<ShareDataInfo> c(List<ShareDataInfo> list) {
        ShareDataInfo next;
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<ShareDataInfo> it = list.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            long effectiveTime = next.getEffectiveTime();
            long deadTime = next.getDeadTime();
            if (next.getValidityType() == 0) {
                if (jCurrentTimeMillis >= effectiveTime && jCurrentTimeMillis <= deadTime) {
                    arrayList.add(next);
                }
            } else if (jCurrentTimeMillis >= effectiveTime) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1002);
        ReleaseLogUtil.d("Share_ShareUtil", "getUserInfo getUserName: ", accountInfo);
        return !TextUtils.isEmpty(accountInfo) ? accountInfo : BaseApplication.getContext().getString(R.string.IDS_share_nick_default_name);
    }

    public static Bitmap d(Context context) {
        if (context == null) {
            LogUtil.e("Share_ShareUtil", "getUserHeader context null.");
            return null;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        String picPath = userInfo != null ? userInfo.getPicPath() : null;
        if (TextUtils.isEmpty(picPath)) {
            return null;
        }
        return qqf.a(context, picPath);
    }

    public static boolean d() {
        UserMemberInfo userMemberInfoA = irz.a();
        return (userMemberInfoA == null || irz.d(userMemberInfoA) || userMemberInfoA.getMemberFlag() != 1) ? false : true;
    }

    public static void e(HealthTextView healthTextView) {
        int iD = qrs.d(BaseApplication.getContext(), 16.0f);
        Drawable drawable = BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_member_card_vip_logo);
        drawable.setBounds(0, 0, iD, iD);
        healthTextView.setCompoundDrawables(null, null, drawable, null);
    }

    public static String b(String str) {
        try {
            long j = Long.parseLong(str);
            StringBuilder sb = new StringBuilder();
            Formatter formatter = new Formatter(sb, Locale.getDefault());
            int i = (int) (j / 86400000);
            long j2 = j - ((long) (86400000 * i));
            int i2 = (int) (j2 / 3600000);
            int iCeil = (int) Math.ceil((j2 - ((long) (3600000 * i2))) / 60000.0d);
            sb.setLength(0);
            return formatter.format("%02d:%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iCeil)).toString();
        } catch (NumberFormatException unused) {
            LogUtil.j("Share_ShareUtil", "generateTime is illegal");
            return str;
        }
    }

    public static void e() {
        e = b(Locale.getDefault());
    }

    public static boolean g() {
        String strB = b(Locale.getDefault());
        LogUtil.a("Share_ShareUtil", "isLanguageChanged lastLocalStr = ", e, ", currentLocale = ", strB);
        if (strB.equals(e)) {
            return false;
        }
        e = strB;
        return true;
    }

    private static String b(Locale locale) {
        if (locale == null) {
            return "";
        }
        return locale.toString();
    }

    public static boolean h() {
        return LanguageUtil.l(BaseApplication.getContext()) && !Utils.o();
    }

    public static String e(Context context, String str, Bitmap bitmap) {
        LogUtil.a("Share_ShareUtil", "saveImage");
        File file = new File(context.getFilesDir() + File.separator + "photos" + File.separator + MessageConstant.GROUP_MEDAL_TYPE);
        String str2 = "";
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.e("Share_ShareUtil", "create file error");
            return "";
        }
        if (bitmap == null || bitmap.isRecycled()) {
            LogUtil.e("Share_ShareUtil", "bitmap isRecycled");
            return "";
        }
        try {
            str2 = file.getCanonicalPath() + File.separator + str;
        } catch (IOException unused) {
            LogUtil.e("Share_ShareUtil", "IOException");
        }
        File file2 = new File(str2);
        if (file2.exists() && !file2.delete()) {
            LogUtil.e("Share_ShareUtil", "delete old file error");
        }
        return c(bitmap, str2, file2);
    }

    private static String c(Bitmap bitmap, String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean zCompress;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file.createNewFile()) {
                    LogUtil.e("Share_ShareUtil", "saveImage createNewFile error");
                    a((FileOutputStream) null);
                    return "";
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    int iB = b(bitmap);
                    LogUtil.a("Share_ShareUtil", "bitmap size:" + iB);
                    if (iB > 1048576) {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
                    } else {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.WEBP, 50, fileOutputStream);
                    }
                    LogUtil.a("Share_ShareUtil", "writeFile successJpeg: ", Boolean.valueOf(zCompress));
                    a(fileOutputStream);
                    return str;
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("Share_ShareUtil", "saveImage FileNotFoundException");
                    a(fileOutputStream2);
                    return str;
                } catch (IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("Share_ShareUtil", "saveImage IOException");
                    a(fileOutputStream2);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        }
    }

    public static void d(gxt gxtVar) {
        if (gxtVar.r() != null || TextUtils.isEmpty(gxtVar.g())) {
            return;
        }
        gxtVar.d(BitmapFactory.decodeFile(gxtVar.g(), new BitmapFactory.Options()));
    }

    private static void a(FileOutputStream fileOutputStream) {
        try {
            if (fileOutputStream != null) {
                fileOutputStream.flush();
            }
        } catch (IOException unused) {
            LogUtil.e("Share_ShareUtil", "saveImage finally flush IOException");
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e("Share_ShareUtil", "saveImage finally close IOException");
                }
            }
        }
    }

    public static void a(View view, Context context, boolean z) {
        if (context == null || view == null) {
            return;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        RelativeLayout.LayoutParams layoutParams = view.getLayoutParams() instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) view.getLayoutParams() : null;
        if (layoutParams == null) {
            LogUtil.j("Share_ShareUtil", "shareView context or params is null");
            return;
        }
        boolean z2 = EnvironmentInfo.m() && qrs.ab(context);
        if (qrs.af(context) || z2) {
            int iD = qrs.d(context, 108.0f);
            if (qrs.ah(context) && !z2) {
                iD = qrs.d(context, 150.0f);
            }
            int i2 = (i - (iD * 3)) / 2;
            int i3 = i - (i2 * 2);
            layoutParams.width = i3;
            layoutParams.height = i3;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        if (!qrs.af(context) && z && !z2) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.setMargins(qrs.d(context, 32.0f), qrs.d(context, 16.0f), qrs.d(context, 32.0f), qrs.d(context, 132.0f));
        }
        if (z2 && (view instanceof HealthCardView)) {
            ((HealthCardView) view).setCardBackgroundColor(context.getColor(R.color.health_chart_extend_background_color));
        }
        view.setLayoutParams(layoutParams);
    }

    public static Resources e(Resources resources) {
        if (resources != null && resources.getConfiguration() != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration.fontScale != 1.0f) {
                f45729c = configuration.fontScale;
            }
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    public static void c(Resources resources) {
        if (resources == null || resources.getConfiguration() == null) {
            return;
        }
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = f45729c;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static int b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }

    public static Bitmap c(View view) {
        view.setVisibility(0);
        LogUtil.a("Share_ShareUtil", "getWatermarkBitmap mWaterMarkLayout");
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.draw(canvas);
            canvas.save();
            canvas.restore();
        } catch (IllegalArgumentException | IllegalStateException | OutOfMemoryError e2) {
            LogUtil.e("Share_ShareUtil", "createBitmap failed! exception: ", e2.getMessage());
        }
        view.setVisibility(4);
        return bitmapCreateBitmap;
    }

    public static int b() {
        return d;
    }

    public static void c(int i) {
        d = i;
    }

    public static void c(final boolean z) {
        LogUtil.a("Share_ShareUtil", "setIsShowUserInfo:", Boolean.valueOf(z));
        ThreadPoolManager.c().execute(new Runnable() { // from class: pnr
            @Override // java.lang.Runnable
            public final void run() {
                ioi.d().e(701, z, null, null);
            }
        });
    }

    public static boolean j() {
        String strC = ioi.d().c(701);
        LogUtil.a("Share_ShareUtil", "showStatus:", strC);
        return TextUtils.isEmpty(strC) || "true".equalsIgnoreCase(strC);
    }

    public static void b(Context context, int i, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(i).b(i2).e(R.string.IDS_settings_button_cancal, onClickListener2).a(R.string.IDS_settings_button_ok, onClickListener).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private static boolean i(String str) {
        return Pattern.compile("[一-龥|.*\\d.*]").matcher(str).find();
    }

    public static int b(int i) {
        if (i == 271) {
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        }
        if (i == 273) {
            return 111;
        }
        if (i == 274) {
            return 112;
        }
        if (i == 279) {
            return 117;
        }
        if (i == 280) {
            return AgrConstant.HEALTH_AGREEMENT_CODE;
        }
        switch (i) {
            case 257:
                return 5;
            case 258:
                return 4;
            case 259:
                return 3;
            case 260:
                return 2;
            case 261:
                return 1;
            case 262:
                return 102;
            default:
                switch (i) {
                    case 264:
                        return 101;
                    case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                        return 103;
                    case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                        return 104;
                    default:
                        return d(i);
                }
        }
    }

    private static int d(int i) {
        if (i == 133) {
            return 110;
        }
        if (i == 270) {
            return 108;
        }
        if (i == 275) {
            return CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON;
        }
        if (i == 283) {
            return 283;
        }
        switch (i) {
            case 128:
                return 105;
            case 129:
                return 106;
            case 130:
                return 107;
            default:
                switch (i) {
                    case 137:
                        return 114;
                    case 138:
                        return 115;
                    case 139:
                        return AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    default:
                        switch (i) {
                            case 217:
                                return 217;
                            case 218:
                                return 218;
                            case 219:
                                return 219;
                            case HeartRateThresholdConfig.HEART_RATE_LIMIT /* 220 */:
                                return HeartRateThresholdConfig.HEART_RATE_LIMIT;
                            default:
                                LogUtil.j("Share_ShareUtil", "getCloudSportType do not has this type yet , localType is ", Integer.valueOf(i));
                                return i;
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public static String a(Uri uri) throws Throwable {
        IllegalArgumentException e2;
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        ?? r10 = 0;
        string = null;
        String string = null;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, strArr, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("Share_ShareUtil", "getFilePathFromContentUri: cursor is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return null;
                        }
                        return null;
                    }
                    if (!cursorQuery.moveToFirst()) {
                        LogUtil.j("Share_ShareUtil", "getFilePathFromContentUri: cursor has no data");
                    } else {
                        int columnIndex = cursorQuery.getColumnIndex(strArr[0]);
                        if (columnIndex == -1) {
                            LogUtil.j("Share_ShareUtil", "getFilePathFromContentUri: Column not found");
                        } else {
                            string = cursorQuery.getString(columnIndex);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return string;
                } catch (IllegalArgumentException e3) {
                    e2 = e3;
                    LogUtil.j("Share_ShareUtil", "getFilePathFromContentUri: ", LogAnonymous.b(e2));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                r10 = uri;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e4) {
            e2 = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public static Uri c(Context context, Bitmap bitmap, String str) throws Throwable {
        Uri uriInsert;
        OutputStream outputStream = null;
        if (bitmap == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Pictures/ShareTemp");
            contentValues.put("is_pending", (Integer) 1);
        }
        try {
            try {
                uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert == null) {
                    a((OutputStream) null);
                    return uriInsert;
                }
                try {
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream == null) {
                        a(outputStreamOpenOutputStream);
                        return uriInsert;
                    }
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.flush();
                        if (Build.VERSION.SDK_INT >= 29) {
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            contentResolver.update(uriInsert, contentValues, null, null);
                        }
                        a(outputStreamOpenOutputStream);
                        return uriInsert;
                    } catch (Exception e2) {
                        e = e2;
                        outputStream = outputStreamOpenOutputStream;
                        LogUtil.j("Share_ShareUtil", "saveBitmapToMediaStore: ", LogAnonymous.b(e));
                        c(uriInsert);
                        a(outputStream);
                        return uriInsert;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = outputStreamOpenOutputStream;
                        a(outputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                uriInsert = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                LogUtil.e("Share_ShareUtil", "streamClose IOException.");
            }
        }
    }

    public static void a(final Uri uri, int i) {
        HandlerCenter.a().d(new Runnable() { // from class: pnv
            @Override // java.lang.Runnable
            public final void run() {
                pnq.c(uri);
            }
        }, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            BaseApplication.getContext().getContentResolver().delete(uri, null, null);
        } catch (Exception unused) {
            ReleaseLogUtil.e("Share_ShareUtil", "deleteImageUri is error.");
        }
    }

    public static Uri e(Context context, Uri uri, String str) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Uri uriInsert;
        OutputStream outputStream = null;
        Uri uri2 = null;
        outputStream = null;
        outputStream = null;
        outputStream = null;
        OutputStream outputStream2 = null;
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Movies/ShareTemp");
            contentValues.put("is_pending", (Integer) 1);
        }
        try {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                a((OutputStream) null);
                c(inputStreamOpenInputStream);
                return uri2;
            }
            try {
                try {
                    uriInsert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriInsert == null) {
                        a((OutputStream) null);
                    } else {
                        try {
                            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream != null) {
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int i = inputStreamOpenInputStream.read(bArr);
                                        if (i <= 0) {
                                            break;
                                        }
                                        outputStreamOpenOutputStream.write(bArr, 0, i);
                                    }
                                    outputStreamOpenOutputStream.flush();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        contentValues.clear();
                                        contentValues.put("is_pending", (Integer) 0);
                                        contentResolver.update(uriInsert, contentValues, null, null);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    outputStream2 = outputStreamOpenOutputStream;
                                    try {
                                        LogUtil.j("Share_ShareUtil", "saveVideoToMediaStore: ", LogAnonymous.b(e));
                                        c(uriInsert);
                                        a(outputStream2);
                                        uri2 = uriInsert;
                                        c(inputStreamOpenInputStream);
                                        return uri2;
                                    } catch (Throwable th) {
                                        th = th;
                                        outputStreamOpenOutputStream = outputStream2;
                                        inputStreamOpenInputStream = inputStreamOpenInputStream;
                                        outputStream = outputStreamOpenOutputStream;
                                        a(outputStream);
                                        c(inputStreamOpenInputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamOpenInputStream = inputStreamOpenInputStream;
                                    outputStream = outputStreamOpenOutputStream;
                                    a(outputStream);
                                    c(inputStreamOpenInputStream);
                                    throw th;
                                }
                            }
                            a(outputStreamOpenOutputStream);
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    c(inputStreamOpenInputStream);
                    return uriInsert;
                } catch (Exception e4) {
                    e = e4;
                    uriInsert = null;
                }
            } catch (Throwable th3) {
                th = th3;
                a(outputStream);
                c(inputStreamOpenInputStream);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpenInputStream = null;
            uriInsert = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = null;
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                LogUtil.j("Share_ShareUtil", "streamClose error: ", e2);
            }
        }
    }
}
