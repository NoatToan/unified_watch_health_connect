package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.hms.maps.utils.LogM;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class maj extends mab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f14196c;

    public maj(String str) {
        this.f14195b = str;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        StringBuilder sb;
        FileInputStream fileInputStreamOpenFileInput = null;
        try {
            try {
                fileInputStreamOpenFileInput = context.openFileInput(this.f14195b);
                this.f14196c = BitmapFactory.decodeStream(fileInputStreamOpenFileInput);
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException e) {
                        e = e;
                        sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                        sb.append(e.toString());
                        LogM.d("FileBitmapDescriptor", sb.toString());
                    }
                }
            } catch (IOException e2) {
                LogM.e("FileBitmapDescriptor", "generateBitmap IOException : " + e2.toString());
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException e3) {
                        e = e3;
                        sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                        sb.append(e.toString());
                        LogM.d("FileBitmapDescriptor", sb.toString());
                    }
                }
            } catch (OutOfMemoryError unused) {
                LogM.e("FileBitmapDescriptor", "generateBitmap OutOfMemoryError: ");
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException e4) {
                        e = e4;
                        sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                        sb.append(e.toString());
                        LogM.d("FileBitmapDescriptor", sb.toString());
                    }
                }
            }
            return this.f14196c;
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException e5) {
                    LogM.d("FileBitmapDescriptor", "generateBitmap close fileInputStream IOException : " + e5.toString());
                }
            }
            throw th;
        }
    }
}
