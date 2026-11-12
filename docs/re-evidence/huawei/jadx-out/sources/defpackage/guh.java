package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.recognizekit.impl.RecognizeHelper;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class guh implements RecognizeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f36048a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecognizeHelper.RecognizeListener f36049c;

    public guh(RecognizeHelper.RecognizeListener recognizeListener) {
        this.f36049c = recognizeListener;
    }

    @Override // com.huawei.health.recognizekit.impl.RecognizeHelper
    public void recognize(final Bitmap bitmap) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gun
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a(bitmap);
            }
        });
    }

    /* synthetic */ void a(Bitmap bitmap) {
        String nutritionTableOcrResult = pfh.a().getNutritionTableOcrResult(BaseApplication.b(), d(bitmap));
        RecognizeHelper.RecognizeListener recognizeListener = this.f36049c;
        if (recognizeListener != null) {
            recognizeListener.onRecognized(nutritionTableOcrResult);
        }
        LogUtil.b("RecognizeNutritionHelper", "recognize result:", nutritionTableOcrResult);
    }

    @Override // com.huawei.health.recognizekit.impl.RecognizeHelper
    public void release() {
        this.f36049c = null;
    }

    private Bitmap d(Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        Context contextB = BaseApplication.b();
        if (this.f36048a == null) {
            LogUtil.d("RecognizeNutritionHelper", "onImageAvailable getCenterRect is null");
            this.f36048a = gup.d(contextB);
        }
        Bitmap bitmapB = gup.b(this.f36048a, gup.b(bitmap), contextB);
        LogUtil.b("RecognizeNutritionHelper", "onImageAvailable isSaved=", Boolean.valueOf(qqf.b(bitmapB, gup.f36056c)));
        return bitmapB;
    }

    public void a(RectF rectF) {
        this.f36048a = rectF;
    }
}
