package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.health.weight.WeightApi;
import health.compact.a.Base64;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class gup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36056c = lrp.g + "NutritionTableCropImg.jpg";
    private static float d = 1.0f;

    public static Point e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        LogUtil.b("DisplayUtils", "getScreenMetrics Width = ", Integer.valueOf(i), " Height = ", Integer.valueOf(i2));
        if (i > i2) {
            i = i2;
            i2 = i;
        }
        return new Point(i, i2);
    }

    public static RectF d(Context context) {
        if (qrs.t() && qrs.af(context)) {
            LogUtil.b("DisplayUtils", "getDefaultCenterRect is Tahiti wideScreen model");
            return c(context);
        }
        Point pointE = e(context);
        float f = pointE.x;
        float f2 = 0.1f * f;
        float f3 = pointE.y / 2;
        float f4 = 0.4f * f;
        float f5 = f3 - f4;
        float f6 = f * 0.9f;
        float f7 = f3 + f4;
        LogUtil.b("DisplayUtils", "getDefaultCenterRect left:", Float.valueOf(f2), " top:", Float.valueOf(f5), " right:", Float.valueOf(f6), " bottom:", Float.valueOf(f7));
        return new RectF(f2, f5, f6, f7);
    }

    public static RectF c(Context context) {
        LogUtil.b("DisplayUtils", "getTahitiDefaultCenterRect");
        Point pointE = e(context);
        int i = pointE.x;
        int i2 = pointE.y;
        int i3 = i > i2 ? i2 / 2 : i / 2;
        float f = (pointE.x - i3) / 2;
        float f2 = (pointE.y - i3) / 2;
        float f3 = i3;
        float f4 = f + f3;
        float f5 = f3 + f2;
        LogUtil.b("DisplayUtils", "left:", Float.valueOf(f), " top:", Float.valueOf(f2), " right:", Float.valueOf(f4), " bottom:", Float.valueOf(f5));
        return new RectF(f, f2, f4, f5);
    }

    public static RectF d(float f, float f2, float f3) {
        float f4 = f / 2.0f;
        return new RectF(f2 - f4, f3 - f4, f2 + f4, f3 + f4);
    }

    public static RectF d(float f, float f2, int i, RectF rectF) {
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectF2 = new RectF();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    rectF2.set(rectF.left, rectF.top, f, f2);
                    f3 = f2 - rectF.top;
                    f6 = rectF.left;
                } else if (i == 3) {
                    rectF2.set(f, rectF.top, rectF.right, f2);
                    f3 = f2 - rectF.top;
                    f4 = rectF.right;
                }
            }
            rectF2.set(rectF.left, f2, f, rectF.bottom);
            f3 = rectF.bottom - f2;
            f6 = rectF.left;
            f5 = f - f6;
            return (f5 > 100.0f || f3 <= 100.0f) ? rectF : rectF2;
        }
        rectF2.set(f, f2, rectF.right, rectF.bottom);
        f3 = rectF.bottom - f2;
        f4 = rectF.right;
        f5 = f4 - f;
        if (f5 > 100.0f) {
        }
    }

    public static ArrayList<RectF> e(RectF rectF) {
        if (rectF == null) {
            LogUtil.e("DisplayUtils", "getValidMoveRectFs centerRectF is null");
            return null;
        }
        ArrayList<RectF> arrayList = new ArrayList<>(4);
        arrayList.add(d(100.0f, rectF.left, rectF.top));
        arrayList.add(d(100.0f, rectF.right, rectF.top));
        arrayList.add(d(100.0f, rectF.right, rectF.bottom));
        arrayList.add(d(100.0f, rectF.left, rectF.bottom));
        return arrayList;
    }

    public static Bitmap b(RectF rectF, Bitmap bitmap, Context context) {
        if (rectF == null || bitmap == null) {
            LogUtil.d("DisplayUtils", "getRectBitmap centerRect|bitmap is null");
            return bitmap;
        }
        Point pointE = e(context);
        int i = (int) (rectF.right - rectF.left);
        int i2 = (int) (rectF.bottom - rectF.top);
        int i3 = (int) rectF.left;
        int iAbs = (int) rectF.top;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i >= width && i2 >= height) {
            return bitmap;
        }
        LogUtil.b("DisplayUtils", "getRectCropBitmap before bitmapX0=", Integer.valueOf(i3), " bitmapY0=", Integer.valueOf(iAbs), " width0=", Integer.valueOf(i), " height0=", Integer.valueOf(i2), " bitmapWidth=", Integer.valueOf(width), " bitmapHeight=", Integer.valueOf(height));
        RectF rectFA = a(bitmap, pointE);
        if (width < pointE.x || rectFA.left > 0.0f) {
            i3 = (int) (rectF.left <= rectFA.left ? rectF.left : rectF.left - rectFA.left);
        }
        if (height < pointE.y || rectFA.top > 0.0f) {
            iAbs = (int) Math.abs(rectF.top - rectFA.top);
        }
        if (i + i3 > width) {
            i = width - i3;
        }
        if (i2 + iAbs > height) {
            i2 = height - iAbs;
        }
        LogUtil.b("DisplayUtils", "getRectCropBitmap after bitmapX=", Integer.valueOf(i3), " bitmapY=", Integer.valueOf(iAbs), " width=", Integer.valueOf(i), " height=", Integer.valueOf(i2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i3, iAbs, i, i2);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static RectF a(Bitmap bitmap, Point point) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = point.x;
        int i2 = point.y;
        if (height > i2) {
            height = i2;
        }
        int i3 = i2 / 2;
        float fAbs = Math.abs((i / 2) - (width / 2));
        int i4 = height / 2;
        float fAbs2 = Math.abs(i3 - i4);
        float f = width + fAbs;
        float f2 = i3 + i4;
        LogUtil.b("DisplayUtils", "getBitmapRect left=", Float.valueOf(fAbs), " top=", Float.valueOf(fAbs2), " right=", Float.valueOf(f), " bottom=", Float.valueOf(f2));
        return new RectF(fAbs, fAbs2, f, f2);
    }

    public static RectF e(int i, int i2, Context context) {
        Point pointE = e(context);
        int i3 = pointE.x;
        int i4 = pointE.y;
        if (i2 >= i4) {
            return d(context);
        }
        float f = i >= i3 ? i3 * 2 * 0.4f : i * 0.4f * 2.0f;
        float f2 = i2 >= i4 ? i4 * 2 * 0.4f : i2 * 0.4f * 2.0f;
        float f3 = (i3 - f) / 2.0f;
        float f4 = (i4 - f2) / 2.0f;
        return new RectF(f3, f4, f + f3, f2 + f4);
    }

    public static Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        LogUtil.b("DisplayUtils", "zoomBitmapMatchScreen bitmap ori width=", Integer.valueOf(width), " ori height=", Integer.valueOf(height));
        Point pointE = e(BaseApplication.b());
        int i = pointE.x;
        int i2 = pointE.y;
        if (width == i || height == i2) {
            return bitmap;
        }
        float f = i / width;
        float f2 = i2 / height;
        LogUtil.b("DisplayUtils", "zoomBitmapMatchScreen scaleX=", Float.valueOf(f), " scaleY=", Float.valueOf(f2));
        float fMin = Math.min(f, f2);
        LogUtil.b("DisplayUtils", "zoomBitmapMatchScreen scale=", Float.valueOf(fMin));
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("DisplayUtils", "showSnackControlPage context|ocrResult is null.");
            return;
        }
        SharedPreferenceManager.a("nutritionTableOcr", "isTrialUseFinish", true);
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addPath("#overview?scanResult=" + str).setImmerse().showStatusBar().enableOnResumeCallback().setNeedSoftInputAdapter().addCustomizeJsModule("ocrJsModule", guf.class).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("WeightManagement", ddv.b().getCommonJsModule("WeightManagement")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).build();
        H5ProServiceManager.getInstance().registerService(((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).getTodoJsClass());
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            LogUtil.e("DisplayUtils", "weightApi is null.");
        } else {
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
        }
        LogUtil.b("DisplayUtils", "start h5 SnackControlPage after recognize success");
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.snack-control", h5ProLaunchOptionBuild);
    }

    public static String c(Bitmap bitmap) {
        String strB = null;
        if (bitmap == null) {
            LogUtil.d("DisplayUtils", "bitmapToBase64Encode bitmap is null.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            strB = Base64.b(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            LogUtil.d("DisplayUtils", "bitmapToBase64Encode exception1: ", ExceptionUtils.c(e));
        } finally {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                LogUtil.d("DisplayUtils", "bitmapToBase64Encode exception2: ", ExceptionUtils.c(e2));
            }
        }
        return strB;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        if (asJsonObject.has("resultCode")) {
            String asString = asJsonObject.get("resultCode").getAsString();
            if ("200".equals(asString)) {
                return true;
            }
            LogUtil.e("DisplayUtils", "parserOcrResult resultCode=", asString);
        }
        return false;
    }

    public static void c(Resources resources) {
        if (resources == null || resources.getConfiguration() == null) {
            return;
        }
        Configuration configuration = resources.getConfiguration();
        configuration.fontScale = d;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static Resources e(Resources resources) {
        if (resources == null || resources.getConfiguration() == null) {
            LogUtil.e("DisplayUtils", "setLargeFontScaleMode resources or configuration is null");
            return resources;
        }
        Configuration configuration = resources.getConfiguration();
        float f = configuration.fontScale;
        d = f;
        float f2 = f - 1.3f;
        if (f2 <= 0.0f && !qnj.a(f2, 0.0f)) {
            return resources;
        }
        configuration.fontScale = 1.3f;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }
}
