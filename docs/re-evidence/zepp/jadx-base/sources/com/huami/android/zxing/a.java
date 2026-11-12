package com.huami.android.zxing;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.huami.android.zxing.camera.CameraManager;
import com.huami.android.zxing.custom.CustomHybridBinarizer;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class a extends Handler {
    private static final String f = a.class.getSimpleName();
    private static final int g = 1920000;
    private static final int h = 4;
    private final MultiFormatReader a;
    private boolean b = true;
    private Handler c;
    private int d;
    private CameraManager e;

    public a(CaptureActivityHandler captureActivityHandler, int i, CameraManager cameraManager, Map<DecodeHintType, Object> map) {
        this.c = null;
        this.d = 1;
        this.e = null;
        this.c = captureActivityHandler;
        this.d = i;
        this.e = cameraManager;
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.a = multiFormatReader;
        multiFormatReader.setHints(map);
    }

    private void a(byte[] bArr, int i, int i2) {
        Result resultDecodeWithState;
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        PlanarYUVLuminanceSource planarYUVLuminanceSourceBuildLuminanceSource = this.e.buildLuminanceSource(bArr2, i2, i);
        if (planarYUVLuminanceSourceBuildLuminanceSource != null) {
            int i5 = this.d;
            if (i5 > 0) {
                CustomHybridBinarizer.setBlockSizePower(i5);
            } else {
                CustomHybridBinarizer.setBlockSizePowerDefault();
            }
            try {
                resultDecodeWithState = this.a.decodeWithState(new BinaryBitmap(new CustomHybridBinarizer(planarYUVLuminanceSourceBuildLuminanceSource)));
                this.a.reset();
            } catch (ReaderException unused) {
                this.a.reset();
                resultDecodeWithState = null;
            } catch (Throwable th) {
                this.a.reset();
                throw th;
            }
        } else {
            resultDecodeWithState = null;
        }
        if (resultDecodeWithState == null) {
            Handler handler = this.c;
            if (handler != null) {
                Message messageObtain = Message.obtain(handler, 65539);
                messageObtain.arg1 = 65542;
                messageObtain.sendToTarget();
                return;
            }
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Log.d(f, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
        Handler handler2 = this.c;
        if (handler2 != null) {
            Message messageObtain2 = Message.obtain(handler2, 65538, resultDecodeWithState);
            messageObtain2.arg1 = 65542;
            messageObtain2.sendToTarget();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    private void b(File file) throws NotFoundException {
        Result resultDecode;
        Handler handler;
        Handler handler2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth * options.outHeight >= g) {
                options.inSampleSize = 4;
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (bitmapDecodeFile == null) {
                Log.e(f, "uri is not a bitmap," + file.toString());
                Handler handler3 = this.c;
                if (handler3 != null) {
                    Message messageObtain = Message.obtain(handler3, 65539);
                    messageObtain.arg1 = 65544;
                    messageObtain.sendToTarget();
                    return;
                }
                return;
            }
            int width = bitmapDecodeFile.getWidth();
            int height = bitmapDecodeFile.getHeight();
            int[] iArr = new int[width * height];
            bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            bitmapDecodeFile.recycle();
            RGBLuminanceSource rGBLuminanceSource = new RGBLuminanceSource(width, height, iArr);
            int i = this.d;
            if (i > 0) {
                CustomHybridBinarizer.setBlockSizePower(i);
            } else {
                CustomHybridBinarizer.setBlockSizePowerDefault();
            }
            try {
                resultDecode = this.a.decode(new BinaryBitmap(new CustomHybridBinarizer(rGBLuminanceSource)));
            } catch (NotFoundException e) {
                Log.e(f, "decode exception", e);
                resultDecode = null;
            }
            if (resultDecode != null) {
                handler2 = this.c;
                if (handler2 != null) {
                    Message messageObtain2 = Message.obtain(handler2, 65538, resultDecode);
                    messageObtain2.arg1 = 65544;
                    messageObtain2.sendToTarget();
                }
            } else {
                handler = this.c;
                if (handler != null) {
                    Message messageObtain3 = Message.obtain(handler, 65539);
                    messageObtain3.arg1 = 65544;
                    messageObtain3.sendToTarget();
                }
            }
            this.a.reset();
        } catch (OutOfMemoryError e2) {
            Log.e(f, "decode exception", e2);
        }
        resultDecode = null;
        if (resultDecode != null) {
            handler2 = this.c;
            if (handler2 != null) {
                Message messageObtain4 = Message.obtain(handler2, 65538, resultDecode);
                messageObtain4.arg1 = 65544;
                messageObtain4.sendToTarget();
            }
        } else {
            handler = this.c;
            if (handler != null) {
                Message messageObtain5 = Message.obtain(handler, 65539);
                messageObtain5.arg1 = 65544;
                messageObtain5.sendToTarget();
            }
        }
        this.a.reset();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws NotFoundException {
        if (this.b) {
            switch (message.what) {
                case 65542:
                    a((byte[]) message.obj, message.arg1, message.arg2);
                    break;
                case 65543:
                    this.b = false;
                    Looper.myLooper().quit();
                    break;
                case 65544:
                    b((File) message.obj);
                    break;
            }
        }
    }
}
