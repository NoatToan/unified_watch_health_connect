package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ouo {
    private ouo() {
    }

    public static Bitmap e(View view, View... viewArr) {
        synchronized (ouo.class) {
            if (view == null) {
                LogUtil.j("PLGACHIEVE_ScreenShotUtils", "screenshotMultiView: mainView is null");
                return null;
            }
            Bitmap bitmapA = a(view);
            if (bitmapA == null) {
                LogUtil.j("PLGACHIEVE_ScreenShotUtils", "screenshotMultiView: mainViewBitmap is null");
                return null;
            }
            if (viewArr != null && viewArr.length != 0) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                Canvas canvas = new Canvas(bitmapA);
                Bitmap bitmapCreateBitmap = null;
                for (int i = 0; i < viewArr.length; i++) {
                    View view2 = viewArr[i];
                    if (view2 == null) {
                        LogUtil.j("PLGACHIEVE_ScreenShotUtils", "screenshotMultiView: secondaryView is null -> " + i);
                    } else if (view2.getWidth() == 0 || view2.getHeight() == 0) {
                        LogUtil.j("PLGACHIEVE_ScreenShotUtils", "screenshotMultiView: width or height is 0 -> " + i);
                    } else {
                        try {
                            bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_4444);
                            view2.draw(new Canvas(bitmapCreateBitmap));
                        } catch (OutOfMemoryError e) {
                            if (bitmapCreateBitmap != null) {
                                bitmapCreateBitmap.recycle();
                                bitmapCreateBitmap = null;
                            }
                            LogUtil.e("PLGACHIEVE_ScreenShotUtils", "screenshotMultiView: error -> " + e.getMessage());
                        }
                        if (bitmapCreateBitmap != null) {
                            int[] iArr2 = new int[2];
                            view2.getLocationOnScreen(iArr2);
                            canvas.drawBitmap(bitmapCreateBitmap, iArr2[0] - iArr[0], iArr2[1] - iArr[1], (Paint) null);
                            bitmapCreateBitmap.recycle();
                            bitmapCreateBitmap = null;
                        }
                    }
                }
                return bitmapA;
            }
            return bitmapA;
        }
    }

    public static Bitmap e(HealthScrollView healthScrollView) {
        return b(healthScrollView);
    }

    public static Bitmap c(View view) {
        return a(view);
    }

    private static Bitmap c(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(bitmap.getWidth(), bitmap2.getWidth()), bitmap.getHeight() + bitmap2.getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, 0.0f, bitmap.getHeight(), (Paint) null);
        return bitmapCreateBitmap;
    }

    private static Bitmap b(HealthScrollView healthScrollView) {
        Bitmap bitmapCreateBitmap = null;
        if (healthScrollView == null || healthScrollView.getHeight() == 0) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "getBitmapByView scrollview is null or scrollView.height == 0");
            return null;
        }
        int height = 0;
        for (int i = 0; i < healthScrollView.getChildCount(); i++) {
            height += healthScrollView.getChildAt(i).getHeight();
        }
        if (healthScrollView.getWidth() > 0 && height > 0) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(healthScrollView.getWidth(), height, Bitmap.Config.RGB_565);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("PLGACHIEVE_ScreenShotUtils", "getBitmapByView scrollView OutOfMemoryError");
            }
            if (bitmapCreateBitmap == null) {
                return bitmapCreateBitmap;
            }
            healthScrollView.draw(new Canvas(bitmapCreateBitmap));
        }
        return bitmapCreateBitmap;
    }

    private static Bitmap a(View view) {
        Bitmap bitmapCreateBitmap = null;
        if (view == null) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "getBitmapByView view == null");
            return null;
        }
        if (view.getHeight() == 0) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "getBitmapByView view view.height == 0");
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("PLGACHIEVE_ScreenShotUtils", "getBitmapByView view OutOfMemoryError");
        }
        if (bitmapCreateBitmap == null) {
            return bitmapCreateBitmap;
        }
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static Bitmap e(View view, HealthScrollView healthScrollView, View view2) {
        try {
            Bitmap bitmapA = a(view);
            Bitmap bitmapB = b(healthScrollView);
            Bitmap bitmapA2 = a(view2);
            Bitmap bitmapC = (bitmapA == null || bitmapB == null) ? null : c(bitmapA, bitmapB);
            if (bitmapC != null && bitmapA2 != null) {
                return c(bitmapC, bitmapA2);
            }
        } catch (Exception e) {
            LogUtil.e("PLGACHIEVE_ScreenShotUtils", "shareMedalBitmap Exception:", ExceptionUtils.c(e));
        }
        return null;
    }

    public static Bitmap c(View view, HealthScrollView healthScrollView, View view2, int i) {
        Bitmap bitmapE = e(view, healthScrollView, view2);
        LogUtil.a("PLGACHIEVE_ScreenShotUtils", "shareAndSaveBitmap gainNum=", Integer.valueOf(i));
        if (i >= 100) {
            try {
                return a(bitmapE);
            } catch (Exception e) {
                LogUtil.e("PLGACHIEVE_ScreenShotUtils", "shareAndSaveBitmap Exception:", ExceptionUtils.c(e));
            }
        }
        return bitmapE;
    }

    private static Bitmap a(Bitmap bitmap) {
        b(BaseApplication.getContext(), bitmap, "all_medal_share_temp.jpg");
        try {
            Bitmap bitmapC = c(CommonUtil.f(BaseApplication.getContext()).getCanonicalPath() + "/Huawei/Health/all_medal_share_temp.jpg");
            if (bitmapC != null && bitmapC.getHeight() <= 20000) {
                LogUtil.a("PLGACHIEVE_ScreenShotUtils", "compressMedal compressBitmap != null,Height=", Integer.valueOf(bitmapC.getHeight()));
                return bitmapC;
            }
            Bitmap bitmapA = a(bitmap, bitmapC);
            return bitmapA != null ? bitmapA : bitmap;
        } catch (IOException unused) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "compressShareMedal IOException");
            return bitmap;
        }
    }

    public static String b(Context context, Bitmap bitmap, String str) {
        String str2 = "";
        if (bitmap != null) {
            if (!GeneralUtil.isSafePath(str)) {
                LogUtil.j("PLGACHIEVE_ScreenShotUtils", "saveScreenShotImage: untrusted -> " + str);
                return "";
            }
            if (Environment.getExternalStorageState().equals("mounted")) {
                try {
                    str2 = CommonUtil.f(context).getCanonicalPath() + "/Huawei/Health/";
                } catch (IOException unused) {
                    LogUtil.a("PLGACHIEVE_ScreenShotUtils", "getCanonicalPath IOException");
                }
                if (osz.b(str2)) {
                    str2 = str2 + str;
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(CommonUtil.c(str2));
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e) {
                        LogUtil.a("PLGACHIEVE_ScreenShotUtils", "saveScreenShotImage e1=", e.getMessage());
                    } catch (IOException e2) {
                        LogUtil.a("PLGACHIEVE_ScreenShotUtils", "saveScreenShotImage e2=", e2.getMessage());
                    }
                }
            }
        }
        return str2;
    }

    public static int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }

    private static Bitmap c(String str) {
        Bitmap bitmapDecodeFile = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inSampleSize = 2;
            options.inJustDecodeBounds = false;
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("PLGACHIEVE_ScreenShotUtils", "compressMedal loadImage:OutOfMemoryError");
            }
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "compressMedal showMedalBitmap is delete:", Boolean.valueOf(FileUtils.b(file)));
        }
        if (bitmapDecodeFile == null) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "compressMedal showMedalBitmap loadImage is null!");
        }
        return bitmapDecodeFile;
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        LogUtil.a("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight compressBitmap.Height=", Integer.valueOf(bitmap2 == null ? 0 : bitmap2.getHeight()));
        if (bitmap == null) {
            LogUtil.e("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight fail:params error");
            return null;
        }
        int height = bitmap.getHeight();
        if (height <= 20000) {
            LogUtil.a("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight pass: height not exceed");
            return bitmap;
        }
        LogUtil.a("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight height exceeds, rescale it");
        Matrix matrix = new Matrix();
        float f = 20000.0f / height;
        matrix.setScale(f, f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), height, matrix, true);
        } catch (Exception e) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight:exception: ", e.getMessage());
            return null;
        } catch (OutOfMemoryError unused) {
            LogUtil.j("PLGACHIEVE_ScreenShotUtils", "compressMedal ensureMaxHeight:OutOfMemoryError");
            return null;
        }
    }
}
