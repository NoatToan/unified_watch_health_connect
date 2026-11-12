package com.xiaomi.hm.health.training.ui.fragment.train;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.baseutil.BlurBitmapUtil;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;

/* JADX INFO: loaded from: classes21.dex */
public class YogaLoadBitmap implements ILoadBlurBitmap {
    @Override // com.xiaomi.hm.health.training.ui.fragment.train.ILoadBlurBitmap
    public Bitmap load(TrainingPlayActivity trainingPlayActivity) {
        DisplayMetrics displayMetrics = trainingPlayActivity.getResources().getDisplayMetrics();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayMetrics.widthPixels, displayMetrics.heightPixels, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(ContextCompat.getColor(trainingPlayActivity, R.color.black40));
        return BlurBitmapUtil.blurBitmap(trainingPlayActivity, bitmapCreateBitmap);
    }
}
