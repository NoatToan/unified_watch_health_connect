package com.xiaomi.hm.health.training.ui.fragment.train;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.xiaomi.hm.health.baseutil.BlurBitmapUtil;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;

/* JADX INFO: loaded from: classes21.dex */
public class OtherLoadBitmap implements ILoadBlurBitmap {
    @Override // com.xiaomi.hm.health.training.ui.fragment.train.ILoadBlurBitmap
    public Bitmap load(TrainingPlayActivity trainingPlayActivity) {
        String str = trainingPlayActivity.guassBlurFilePath;
        Bitmap bitmap = BlurBitmapCache.getInstance().get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap bitmapBlurBitmap = BlurBitmapUtil.blurBitmap(trainingPlayActivity, BitmapFactory.decodeFile(str, options));
        BlurBitmapCache.getInstance().put(str, bitmapBlurBitmap);
        return bitmapBlurBitmap;
    }
}
