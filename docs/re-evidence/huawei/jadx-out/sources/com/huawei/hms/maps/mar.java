package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes34.dex */
public class mar extends mab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f14209c;

    public mar(String str) {
        this.f14208b = str;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        Bitmap bitmapA = a(this.f14208b);
        this.f14209c = bitmapA;
        return bitmapA;
    }

    private Bitmap a(String str) {
        LogM.d("PathBitmapDescriptor", "getBitmapFromPath: ");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = 5;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            LogM.e("PathBitmapDescriptor", "generateBitmap OutOfMemoryError: ");
            return null;
        }
    }
}
