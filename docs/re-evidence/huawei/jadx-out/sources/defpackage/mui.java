package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.ScreenshotResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class mui {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, ScreenshotResponse.ScaleOffsetInfo> f42426b = new ConcurrentHashMap<>();

    public static Bitmap a(muh muhVar, Bitmap bitmap) {
        int i = a(muhVar)[0];
        int i2 = a(muhVar)[1];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setColor(Color.parseColor("#80868686"));
        c(canvas, paint, new a(i, i2, 1), muhVar);
        Bitmap bitmapC = c(bitmap, muhVar.j(), muhVar.e(), muhVar);
        paint.reset();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmapC, (i - muhVar.j()) / 2.0f, (i2 - muhVar.e()) / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    private static int[] a(muh muhVar) {
        return new int[]{muhVar.j() + 6, muhVar.e() + 6};
    }

    private static void c(Canvas canvas, Paint paint, a aVar, muh muhVar) {
        if (muhVar.f() == 1) {
            e(canvas, paint, aVar, muhVar);
        } else if (muhVar.f() == 2) {
            a(canvas, paint, aVar, muhVar);
        } else {
            LogUtil.e("CropImageUtil", "roundedCutType is not supported in drawRoundRec");
        }
    }

    private static void e(Canvas canvas, Paint paint, a aVar, muh muhVar) {
        muh.d dVarC = muhVar.c();
        if (dVarC == null) {
            LogUtil.e("CropImageUtil", "bezierCurvePoints is null");
            return;
        }
        float[][] fArrA = aVar.e == 2 ? dVarC.a() : dVarC.d();
        if (fArrA != null && fArrA.length >= 4) {
            float[] fArr = fArrA[0];
            if (fArr.length >= 2) {
                PointF pointF = new PointF(fArr[0], fArr[1]);
                float[] fArr2 = fArrA[3];
                PointF pointF2 = new PointF(fArr2[0], fArr2[1]);
                if (aVar.e == 1) {
                    pointF.x += 1.5f;
                    pointF2.y += 1.5f;
                }
                float[] fArr3 = fArrA[1];
                PointF pointF3 = new PointF(fArr3[0], fArr3[1]);
                float[] fArr4 = fArrA[2];
                PointF[] pointFArr = {pointF, pointF3, new PointF(fArr4[0], fArr4[1]), pointF2};
                PointF[][] pointFArr2 = (PointF[][]) Array.newInstance((Class<?>) PointF.class, 4, 4);
                pointFArr2[0] = pointFArr;
                pointFArr2[1] = d(1, aVar.f42431a, aVar.f42432c, pointFArr);
                pointFArr2[2] = d(2, aVar.f42431a, aVar.f42432c, pointFArr);
                pointFArr2[3] = d(3, aVar.f42431a, aVar.f42432c, pointFArr);
                Path path = new Path();
                path.moveTo(pointFArr2[0][0].x, pointFArr2[0][0].y);
                for (int i = 0; i < pointFArr2.length; i++) {
                    path.cubicTo(pointFArr2[i][1].x, pointFArr2[i][1].y, pointFArr2[i][2].x, pointFArr2[i][2].y, pointFArr2[i][3].x, pointFArr2[i][3].y);
                    if (i != pointFArr2.length - 1) {
                        int i2 = i + 1;
                        path.lineTo(pointFArr2[i2][0].x, pointFArr2[i2][0].y);
                    }
                }
                path.close();
                canvas.drawPath(path, paint);
                return;
            }
        }
        LogUtil.e("CropImageUtil", "bezierCurvePoint size is incorrect");
    }

    private static PointF[] d(int i, int i2, int i3, PointF[] pointFArr) {
        PointF[] pointFArr2 = new PointF[4];
        if (i == 1) {
            float f = i2;
            pointFArr2[0] = new PointF(f - pointFArr[3].x, pointFArr[3].y);
            pointFArr2[1] = new PointF(f - pointFArr[2].x, pointFArr[2].y);
            pointFArr2[2] = new PointF(f - pointFArr[1].x, pointFArr[1].y);
            pointFArr2[3] = new PointF(f - pointFArr[0].x, pointFArr[0].y);
        }
        if (i == 2) {
            float f2 = i2;
            float f3 = i3;
            pointFArr2[0] = new PointF(f2 - pointFArr[0].x, f3 - pointFArr[0].y);
            pointFArr2[1] = new PointF(f2 - pointFArr[1].x, f3 - pointFArr[1].y);
            pointFArr2[2] = new PointF(f2 - pointFArr[2].x, f3 - pointFArr[2].y);
            pointFArr2[3] = new PointF(f2 - pointFArr[3].x, f3 - pointFArr[3].y);
        }
        if (i == 3) {
            float f4 = i3;
            pointFArr2[0] = new PointF(pointFArr[3].x, f4 - pointFArr[3].y);
            pointFArr2[1] = new PointF(pointFArr[2].x, f4 - pointFArr[2].y);
            pointFArr2[2] = new PointF(pointFArr[1].x, f4 - pointFArr[1].y);
            pointFArr2[3] = new PointF(pointFArr[0].x, f4 - pointFArr[0].y);
        }
        return pointFArr2;
    }

    private static void a(Canvas canvas, Paint paint, a aVar, muh muhVar) {
        float[] fArrI = muhVar.i();
        if (fArrI == null || fArrI.length < 2) {
            LogUtil.e("CropImageUtil", "radians size is incorrect");
        } else {
            canvas.drawRoundRect(new RectF(1.5f, 1.5f, aVar.f42431a - 1.5f, aVar.f42432c - 1.5f), fArrI[0] + 3.0f, fArrI[1] + 3.0f, paint);
        }
    }

    private static Bitmap c(Bitmap bitmap, int i, int i2, muh muhVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        if (muhVar.f() == 1) {
            e(canvas, paint, new a(i, i2, 2), muhVar);
        } else if (muhVar.f() == 2) {
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, i, i2), muhVar.i()[0], muhVar.i()[1], paint);
        } else {
            LogUtil.e("CropImageUtil", "roundedCutType is not supported cropSquareImage");
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int iD = muhVar.d();
        canvas.drawBitmap(bitmap, muhVar.g() - iD, muhVar.g() - iD, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap e(muh muhVar, Bitmap bitmap) {
        int i = a(muhVar)[0];
        int i2 = a(muhVar)[1];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setColor(Color.parseColor("#80868686"));
        canvas.drawCircle(i / 2.0f, i2 / 2.0f, Math.min(i - 3, i2 - 3) / 2.0f, paint);
        Bitmap bitmapD = d(muhVar, bitmap);
        paint.reset();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmapD, (i - muhVar.j()) / 2.0f, (i2 - muhVar.e()) / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    private static Bitmap d(muh muhVar, Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        int iJ = muhVar.j();
        int iE = muhVar.e();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iJ, iE, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(iJ / 2.0f, iE / 2.0f, Math.min(iJ, iE) / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        int iD = muhVar.d();
        canvas.drawBitmap(bitmap, muhVar.g() - iD, muhVar.h() - iD, paint);
        return bitmapCreateBitmap;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42431a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f42432c;
        private int e;

        a(int i, int i2, int i3) {
            this.f42431a = i;
            this.f42432c = i2;
            this.e = i3;
        }
    }

    public static void c(final DeviceInfo deviceInfo, final muh muhVar, final Bitmap bitmap, final ResultCallback<Bitmap> resultCallback) throws Throwable {
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "createCompositePicture parameters:", muhVar);
        final Bitmap bitmapA = a(deviceInfo);
        Objects.isNull(bitmapA);
        if (bitmapA == null) {
            ReleaseLogUtil.e("DEVMGR_CropImageUtil", "createCompositePicture watchBodyBitmap is null");
            resultCallback.onSuccess(b(muhVar, bitmap));
            return;
        }
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel)) {
            ReleaseLogUtil.e("DEVMGR_CropImageUtil", "createCompositePicture deviceType is null");
            resultCallback.onSuccess(b(muhVar, bitmap));
            return;
        }
        ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo = f42426b.get(deviceModel);
        Objects.isNull(scaleOffsetInfo);
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "createCompositePicture deviceType: ", deviceModel, " ,map scaleOffsetInfo:", scaleOffsetInfo == null ? Constants.NULL : scaleOffsetInfo.toString());
        Objects.isNull(scaleOffsetInfo);
        if (scaleOffsetInfo != null) {
            a(scaleOffsetInfo, bitmapA, bitmap, muhVar, deviceInfo, resultCallback);
        } else {
            a(deviceModel, new ResultCallback<ScreenshotResponse.ScaleOffsetInfo>() { // from class: mui.1
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo2) throws Throwable {
                    mui.a(scaleOffsetInfo2, bitmapA, bitmap, muhVar, deviceInfo, resultCallback);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.e("DEVMGR_CropImageUtil", " fetchImageScaleOffset onFailure:", ExceptionUtils.c(th));
                    resultCallback.onSuccess(mui.b(muhVar, bitmap));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo, Bitmap bitmap, Bitmap bitmap2, muh muhVar, DeviceInfo deviceInfo, ResultCallback<Bitmap> resultCallback) throws Throwable {
        int i;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "compositePictureSuccess watchBodyWidth: ", Integer.valueOf(width), " watchBodyHeight: ", Integer.valueOf(height));
        double d = height;
        double d2 = width;
        if (c(d, d2) < 1.2d) {
            double dC = c(d, 1.2d);
            int iC = (int) c(d2 - dC, 2.0d);
            int i2 = (int) dC;
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iC, 0, i2, height);
            i = i2;
        } else {
            i = width;
            bitmapCreateBitmap = bitmap;
        }
        double dC2 = c(d, 9.0d);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, (int) (d + dC2), bitmap2.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paintD = d(canvas, muhVar, bitmap2, i, height);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paintD);
        b(bitmapCreateBitmap);
        int i3 = i;
        a(scaleOffsetInfo, muhVar, bitmap2, i3, height, canvas, paintD);
        c(deviceInfo, dC2, i3, height, canvas, paintD);
        resultCallback.onSuccess(bitmapCreateBitmap2);
    }

    private static Paint d(Canvas canvas, muh muhVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapC;
        if (muhVar.m() == 1) {
            bitmapC = d(muhVar, bitmap);
        } else {
            bitmapC = c(bitmap, muhVar.j(), muhVar.e(), muhVar);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, (int) (bitmapC.getWidth() * 3.0f), (int) (bitmapC.getHeight() * 3.0f), true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (bitmapCreateScaledBitmap.getWidth() - i) / 2, (bitmapCreateScaledBitmap.getHeight() - i2) / 2, i, i2);
        lsq lsqVarD = lsq.d(BaseApplication.b());
        Bitmap bitmapE = lsqVarD.e(bitmapCreateBitmap, 10, 10);
        lsqVarD.a();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapE, i, i2, true);
        canvas.drawBitmap(bitmapCreateScaledBitmap2, 0.0f, 0.0f, paint);
        b(bitmapCreateScaledBitmap);
        b(bitmapCreateBitmap);
        b(bitmapE);
        b(bitmapCreateScaledBitmap2);
        return paint;
    }

    private static void a(ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo, muh muhVar, Bitmap bitmap, int i, int i2, Canvas canvas, Paint paint) {
        double dC;
        Bitmap bitmapC;
        double dC2;
        if (muhVar.m() == 1) {
            double dC3 = c(b(i2, 144.0d), 280.0d);
            dC2 = c(dC3, scaleOffsetInfo.getScale());
            ReleaseLogUtil.d("DEVMGR_CropImageUtil", "compositePictureSuccess divideResult: ", Double.valueOf(dC3), " targetFaceHeight:", Double.valueOf(dC2));
            bitmapC = d(muhVar, bitmap);
            dC = dC2;
        } else {
            double dC4 = c(b(i2, 108.0d), 280.0d);
            double dC5 = c(muhVar.e(), c(muhVar.j(), dC4));
            double dC6 = c(dC4, scaleOffsetInfo.getScale());
            dC = c(dC5, scaleOffsetInfo.getScale());
            ReleaseLogUtil.d("DEVMGR_CropImageUtil", "compositePictureSuccess widthDivideResult: ", Double.valueOf(dC4), " heightDivideResult:", Double.valueOf(dC5), " targetFaceWidth:", Double.valueOf(dC6), " targetFaceHeight:", Double.valueOf(dC));
            bitmapC = c(bitmap, muhVar.j(), muhVar.e(), muhVar);
            dC2 = dC6;
        }
        double d = i2;
        double dC7 = c(d, 280.0d);
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "drawWatchFace defaultScale:", Double.valueOf(dC7));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapC, (int) dC2, (int) dC, true);
        double translateX = ((((double) i) / 2.0d) - (dC2 / 2.0d)) - (scaleOffsetInfo.getTranslateX() * dC7);
        double translateY = ((d / 2.0d) - (dC / 2.0d)) - (scaleOffsetInfo.getTranslateY() * dC7);
        float f = (float) translateX;
        float f2 = (float) translateY;
        canvas.drawBitmap(bitmapCreateScaledBitmap, f, f2, paint);
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "drawWatchFace watchFaceStartX:", Double.valueOf(translateX), " watchFaceStartY:", Double.valueOf(translateY), " startX: ", Float.valueOf(f), " startY:", Float.valueOf(f2));
        b(bitmapC);
        b(bitmapCreateScaledBitmap);
    }

    private static void c(DeviceInfo deviceInfo, double d, int i, int i2, Canvas canvas, Paint paint) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapDecodeResource;
        double dC = c(d, 48.0d);
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "drawButtom buttomScale: ", Double.valueOf(dC));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        float f = i;
        double d2 = i2;
        canvas.drawRect(0.0f, i2, f, (float) (d + d2), paint);
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(BaseApplication.b().getResources(), R.mipmap.ic_screenshot_app);
            int i3 = (int) (dC * 28.0d);
            try {
                try {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, i3, i3, true);
                    canvas.drawBitmap(bitmapCreateScaledBitmap, (float) (dC * 16.0d), (float) ((10.0d * dC) + d2), paint);
                } catch (IllegalStateException unused) {
                    ReleaseLogUtil.a("DEVMGR_CropImageUtil", "drawButtom IllegalStateException");
                }
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateScaledBitmap;
                bitmapCreateScaledBitmap = bitmapDecodeResource;
                b(bitmapCreateScaledBitmap);
                b(bitmap);
                throw th;
            }
        } catch (IllegalStateException unused2) {
            bitmapDecodeResource = null;
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
            b(bitmapCreateScaledBitmap);
            b(bitmap);
            throw th;
        }
        b(bitmapDecodeResource);
        b(bitmapCreateScaledBitmap);
        String strF = qre.f(R.string.IDS_app_name_health);
        String strD = d(deviceInfo.getDeviceName());
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setSubpixelText(true);
        paint2.setColor(-16777216);
        paint2.setTextSize((float) (12.0d * dC));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f2 = (float) ((d2 + ((dC * 48.0d) / 2.0d)) - ((double) ((fontMetrics.top + fontMetrics.bottom) / 2.0f)));
        canvas.drawText(strF, (float) (54.0d * dC), f2, paint2);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        canvas.drawText(strD, (float) (((double) (f - paint2.measureText(strD))) - (dC * 16.0d)), f2, paint2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(muh muhVar, Bitmap bitmap) {
        if (muhVar.m() == 1) {
            return e(muhVar, bitmap);
        }
        return a(muhVar, bitmap);
    }

    private static Bitmap a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_CropImageUtil", "obtainWatchCaseImg, deviceInfo is null");
            return null;
        }
        String strJ = mmx.j(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            strJ = mmx.a(deviceInfo.getProductType());
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        String strE = eep.e(pluginInfoByUuid, 2, deviceInfo);
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "HomeImgNew name:", strE);
        String str = pig.c().e(pluginInfoByUuid.c()) + File.separator + pluginInfoByUuid.c() + File.separator + "img" + File.separator + strE + ".png";
        if (!new File(str).exists()) {
            ReleaseLogUtil.a("DEVMGR_CropImageUtil", "obtainWatchCaseImg file not exists");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inInputShareable = true;
        options.inSampleSize = 1;
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, ResultCallback<ScreenshotResponse.ScaleOffsetInfo> resultCallback, String str2) {
        LogUtil.e("CropImageUtil", "scaleOffsetNetFailed msg:", str2);
        mgm.d().d(str, resultCallback);
    }

    private static double b(double d, double d2) {
        return BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(d2)).setScale(10, RoundingMode.HALF_UP).doubleValue();
    }

    private static double c(double d, double d2) {
        return BigDecimal.valueOf(d).divide(BigDecimal.valueOf(d2), 10, RoundingMode.HALF_UP).doubleValue();
    }

    private static String d(String str) {
        ReleaseLogUtil.d("DEVMGR_CropImageUtil", "getDeviceName is ", str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.contains(com.huawei.openalliance.ad.constant.Constants.LINK) ? str.substring(0, str.lastIndexOf(com.huawei.openalliance.ad.constant.Constants.LINK)) : str;
    }

    private static void b(Bitmap bitmap) {
        Objects.isNull(bitmap);
        if (bitmap == null) {
            ReleaseLogUtil.e("DEVMGR_CropImageUtil", "recycleBitmap bitmap is null");
        } else {
            if (bitmap.isRecycled()) {
                return;
            }
            bitmap.recycle();
        }
    }

    private static void a(final String str, final ResultCallback<ScreenshotResponse.ScaleOffsetInfo> resultCallback) {
        HashMap map = new HashMap();
        map.put("deviceType", str);
        map.put("lang", CommonUtil.u());
        map.put("countryCode", GRSManager.c(BaseApplication.b()).getCountryCode());
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        b(WatchFaceUtil.joinUrl(GRSManager.c(BaseApplication.b()).getUrl("healthOperationUrl"), WatchFaceConstant.DEVICE_TYPE_INFO_REQUEST_URL.replace("{deviceType}", str)), d(), map, ScreenshotResponse.class, new ResultCallback<ScreenshotResponse>() { // from class: mui.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ScreenshotResponse screenshotResponse) {
                ReleaseLogUtil.d("DEVMGR_CropImageUtil", "fetchImageScaleOffset resultCode: ", Integer.valueOf(screenshotResponse.getResultCode()));
                if (screenshotResponse.getResultCode() != 0) {
                    mui.c(str, resultCallback, "fetchImageScaleOffset resultCode is not success");
                    return;
                }
                ScreenshotResponse.TypeInfo deviceTypeInfo = screenshotResponse.getDeviceTypeInfo();
                Objects.isNull(deviceTypeInfo);
                if (deviceTypeInfo == null) {
                    mui.c(str, resultCallback, "fetchImageScaleOffset deviceTypeInfo is null");
                    return;
                }
                ScreenshotResponse.ScaleOffsetInfo watchcaseImgPosition = deviceTypeInfo.getWatchcaseImgPosition();
                Objects.isNull(watchcaseImgPosition);
                if (watchcaseImgPosition == null) {
                    mui.c(str, resultCallback, "fetchImageScaleOffset watchcaseImgPosition is null");
                    return;
                }
                ReleaseLogUtil.d("DEVMGR_CropImageUtil", "fetchImageScaleOffset watchcaseImgPosition:", watchcaseImgPosition);
                if (!mgm.d().d(watchcaseImgPosition)) {
                    mui.c(str, resultCallback, "fetchImageScaleOffset getScale() <= 0");
                } else {
                    mui.f42426b.putIfAbsent(str, watchcaseImgPosition);
                    resultCallback.onSuccess(watchcaseImgPosition);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                mui.c(str, resultCallback, ExceptionUtils.c(th));
            }
        });
    }

    private static <Rsp> void b(String str, Map<String, String> map, Map<String, String> map2, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("DEVMGR_CropImageUtil", "callHttpGet, invalid url");
            resultCallback.onFailure(new Throwable("callHttpGet, invalid url"));
        } else {
            oet.d().e(str, map, map2, cls, resultCallback);
        }
    }

    private static Map<String, String> d() {
        Map<String, String> headers = new chj().getHeaders();
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.b());
        String accountInfo = loginInit.getAccountInfo(1008);
        headers.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        headers.put(CloudParamKeys.X_TOKEN, accountInfo);
        headers.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        headers.put(CloudParamKeys.X_APP_ID, BaseApplication.d());
        headers.put(CloudParamKeys.X_SITE_ID, String.valueOf(loginInit.getAccountInfo(1009)));
        headers.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(BaseApplication.b()));
        return headers;
    }
}
