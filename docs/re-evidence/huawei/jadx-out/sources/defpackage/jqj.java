package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jqj {
    public static boolean c(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null || motionPathSimplify.requestExtendDataMap() == null) {
            return false;
        }
        return "2".equals(motionPathSimplify.requestExtendDataMap().get("routeType"));
    }

    public static void e(String str, final HotTrackDrawCustomTarget<Bitmap> hotTrackDrawCustomTarget) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_RouteDrawUtils", "hotPathId is empty");
        } else {
            gch.b().getHotPathDetail(str, new UiCallback<gdm>() { // from class: jqj.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Track_RouteDrawUtils", "can't get hotPathDetail & errorCode = ", Integer.valueOf(i), " & errorInfo is ", str2);
                    hotTrackDrawCustomTarget.onLoadFailed(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdm gdmVar) {
                    LogUtil.d("Track_RouteDrawUtils", "debug onSuccess");
                    if (gdmVar == null) {
                        LogUtil.j("Track_RouteDrawUtils", "hotPathDetail is null");
                        hotTrackDrawCustomTarget.onLoadFailed(null);
                        return;
                    }
                    hotTrackDrawCustomTarget.onGetHotTrackDetailInfo(gdmVar);
                    gdw gdwVarN = gdmVar.n();
                    if (gdwVarN == null) {
                        LogUtil.j("Track_RouteDrawUtils", "pathImageInfo is null");
                        hotTrackDrawCustomTarget.onLoadFailed(null);
                    } else {
                        qqf.a(gdwVarN.d(), hotTrackDrawCustomTarget);
                    }
                }
            });
        }
    }

    public static jpg b(jpg jpgVar) {
        if (jpgVar == null) {
            return null;
        }
        return npl.c(jpgVar.d, jpgVar.f38787a) == 1 ? izy.e(jpgVar) : jpgVar;
    }

    public static int e(MotionPathSimplify motionPathSimplify) {
        return c(motionPathSimplify) ? 1 : 0;
    }

    public static Bitmap d(int i, Bitmap bitmap) {
        if (bitmap == null || i == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint();
        paint.setColorFilter(porterDuffColorFilter);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
