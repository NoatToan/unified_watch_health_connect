package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.hms.maps.utils.LogM;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class mad extends mab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14191b;

    public mad(String str) {
        LogM.d("AssetBitmapDescriptor", "AssetBitmapDescriptor assetName: " + str);
        this.f14191b = str;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        String str;
        try {
            return BitmapFactory.decodeStream(context.getAssets().open(this.f14191b));
        } catch (IOException e) {
            str = "generateBitmap IOException: " + e.toString();
            LogM.e("AssetBitmapDescriptor", str);
            return null;
        } catch (OutOfMemoryError unused) {
            str = "generateBitmap OutOfMemoryError: ";
            LogM.e("AssetBitmapDescriptor", str);
            return null;
        }
    }
}
