package com.huami.android.zxing;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import com.huami.android.zxing.camera.CameraManager;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
final class b extends Thread {
    public static final String g = "barcode_bitmap";
    public static final String h = "barcode_scaled_factor";
    private final Map<DecodeHintType, Object> a;
    private Handler b;
    private CaptureActivityHandler c;
    private final CountDownLatch d = new CountDownLatch(1);
    private CameraManager e;
    private int f;

    public b(CaptureActivityHandler captureActivityHandler, CameraManager cameraManager, int i, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, ResultPointCallback resultPointCallback) {
        this.c = captureActivityHandler;
        this.e = cameraManager;
        this.f = i;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.a = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            collection = EnumSet.noneOf(BarcodeFormat.class);
            collection.addAll(DecodeFormatManager.b);
            collection.addAll(DecodeFormatManager.c);
            collection.addAll(DecodeFormatManager.e);
            collection.addAll(DecodeFormatManager.f);
        }
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        enumMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultPointCallback);
        Log.i("DecodeThread", "Hints: " + enumMap);
    }

    public Handler a() {
        try {
            this.d.await();
        } catch (InterruptedException unused) {
        }
        return this.b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.b = new a(this.c, this.f, this.e, this.a);
        this.d.countDown();
        Looper.loop();
    }
}
