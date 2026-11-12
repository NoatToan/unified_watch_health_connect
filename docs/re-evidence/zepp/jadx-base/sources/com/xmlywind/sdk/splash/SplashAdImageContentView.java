package com.xmlywind.sdk.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huami.ad.Constants;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.views.GifImageView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SplashAdImageContentView extends e {
    public GifImageView b;

    public SplashAdImageContentView(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        GifImageView gifImageView = new GifImageView(context);
        this.b = gifImageView;
        gifImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        setBackgroundColor(-1);
        addView(this.b, layoutParams);
    }

    @Override // com.xmlywind.sdk.splash.e
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.xmlywind.sdk.splash.e
    public boolean a(BaseAdUnit baseAdUnit) {
        Bitmap bitmapDecodeFile;
        String splashFilePath = baseAdUnit.getSplashFilePath();
        List listAsList = Arrays.asList("git", "jpeg", "jpg", "png", "bmp", "webp", "tif");
        String strA = com.xmlywind.sdk.common.utils.h.a(splashFilePath);
        if (!TextUtils.isEmpty(strA)) {
            if (strA.equals(Constants.GIF_PATH)) {
                Movie movieDecodeByteArray = Movie.decodeByteArray(com.xmlywind.sdk.common.utils.d.e(splashFilePath), 0, com.xmlywind.sdk.common.utils.d.e(splashFilePath).length);
                if (movieDecodeByteArray != null) {
                    this.b.setMovie(movieDecodeByteArray);
                    BaseBroadcastReceiver.a(getContext(), baseAdUnit.getUuid(), IntentActions.ACTION_INTERSTITIAL_SHOW);
                    return true;
                }
            } else if (listAsList.contains(strA) && (bitmapDecodeFile = BitmapFactory.decodeFile(splashFilePath)) != null) {
                BaseBroadcastReceiver.a(getContext(), baseAdUnit.getUuid(), IntentActions.ACTION_INTERSTITIAL_SHOW);
                this.b.setImageBitmap(bitmapDecodeFile);
                return true;
            }
        }
        return false;
    }

    @Override // com.xmlywind.sdk.splash.e
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.xmlywind.sdk.splash.e
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.xmlywind.sdk.splash.e
    public /* bridge */ /* synthetic */ int getDuration() {
        return super.getDuration();
    }
}
